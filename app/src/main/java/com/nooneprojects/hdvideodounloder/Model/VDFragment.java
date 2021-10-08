package com.nooneprojects.hdvideodounloder.Model;

import androidx.fragment.app.Fragment;

import com.nooneprojects.hdvideodounloder.MainActivity;
import com.nooneprojects.hdvideodounloder.VDApp;


public class VDFragment extends Fragment {

    public MainActivity getVDActivity() {
        return (MainActivity) getActivity();
    }

    public VDApp getVDApp() {
        return (VDApp) getActivity().getApplication();
    }
}
