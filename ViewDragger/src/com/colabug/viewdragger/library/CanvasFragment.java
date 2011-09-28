package com.colabug.viewdragger.library;

import android.app.Fragment;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * User: Corey Leigh Latislaw
 * Date: 9/23/11
 * Purpose:
 */
public class CanvasFragment extends Fragment
{
    private FrameLayout layout;

    @Override
    public View onCreateView( LayoutInflater inflater,
                              ViewGroup container,
                              Bundle savedInstanceState )
    {
        super.onCreateView( inflater,
                            container,
                            savedInstanceState );
        // Inflate layout
        layout = (FrameLayout) inflater.inflate( R.layout.canvas, null );

        return layout;
    }

    public void addAnIcon()
    {
        com.colabug.viewdragger.library.DraggableView draggableView = new DraggableView( getActivity() );
        draggableView.setImage( BitmapFactory.decodeResource( getResources(),
                                                              R.drawable.icon ) );
        layout.addView( draggableView );
    }

    public void clearScreen()
    {
        layout.removeAllViews();
    }
}
