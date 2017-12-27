package com.example.user.myapplication;

/*
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by user on 2017-12-26.
 */


/*
public class FirstTab extends Activity{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        String activityName = getClass().getSimpleName();

        TextView tv = new TextView(this);
        tv.setText(activityName + "화면");
        setContentView(tv);
    }
}

package com.example.kjh.viewpager_fragment;
*/
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.constraint.ConstraintLayout;
        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentActivity;
        import android.support.v4.content.ContextCompat;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.LinearLayout;
        import android.widget.ListView;
        import android.widget.RelativeLayout;
        import android.widget.TextView;

public class FirstTab extends Fragment {
        public FirstTab()
    {
        // required
    }

    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"} ;
    // ... 코드 계속

        private ConstraintLayout ll;
        private FragmentActivity fa;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            fa = super.getActivity();
            ll = (ConstraintLayout) inflater.inflate(R.layout.fragment, container, false);




            ListView listview ;
        ListViewAdapter adapter;

        // Adapter 생성
        adapter = new ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        View v = inflater.inflate(R.layout.fragment,container,false);
        listview =  v.findViewById(R.id.listview1);
        //listview = getView().findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        // 첫 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.ic_launcher_foreground),
                "허미나", "010-7673-5381") ;
        // 두 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.ic_launcher_foreground),
                "홍길동", "010-000-0000") ;
        // 세 번째 아이템 추가.
        adapter.addItem(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.ic_launcher_foreground),
                "가나다", "010-000-0000") ;

        return v;
    }

}
