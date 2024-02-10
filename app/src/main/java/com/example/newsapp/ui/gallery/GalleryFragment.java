package com.example.newsapp.ui.gallery;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import com.example.newsapp.R;
import com.example.newsapp.Webviewcontroller;

public class GalleryFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) WebView webView=view.findViewById(R.id.ww1);
        webView.loadUrl("https://www.aljazeera.com/");
        webView.setWebViewClient(new Webviewcontroller());
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}