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

        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;

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
        com.example.user.myapplication.ListViewAdapter adapter;

        // Adapter 생성
        adapter = new com.example.user.myapplication.ListViewAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        View v = inflater.inflate(R.layout.fragment,container,false);
        listview =  v.findViewById(R.id.listview1);
        //listview = getView().findViewById(R.id.listview1);
        listview.setAdapter(adapter);

        StringBuffer sb = new StringBuffer();
        String str = "[{'name':'도레미','number':010-1234-5678'},"+"{'name':'가나다','number':'010-4321-9876'},"+ "{'name':'도레미','number':010-1234-5678'},"+"{'name':'가나다','number':'010-4321-9876'},"+ "{'name':'도레미','number':010-1234-5678'},"+"{'name':'가나다','number':'010-4321-9876'},"+ "{'name':'도레미','number':010-1234-5678'},"+"{'name':'가나다','number':'010-4321-9876'}]";

        try {
            JSONArray jarray = new JSONArray(str);   // JSONArray 생성
            for(int i=0; i < jarray.length(); i++){
                JSONObject jObject = jarray.getJSONObject(i);  // JSONObject 추출
                String number = jObject.getString("number");
                String name = jObject.getString("name");
                adapter.addItem(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.ic_launcher_foreground),
                        name, number) ;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }



        return v;
    }

}

