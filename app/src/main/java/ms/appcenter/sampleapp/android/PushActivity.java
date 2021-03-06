package ms.appcenter.sampleapp.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PushActivity extends Fragment {
    private static final String pageName = "Push";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.push_root, container, false);
        return rootView;
    }

    public static PushActivity newInstance() {
        Bundle args = new Bundle();
        PushActivity fragment = new PushActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public static CharSequence getPageName() {
        return pageName;
    }
}
