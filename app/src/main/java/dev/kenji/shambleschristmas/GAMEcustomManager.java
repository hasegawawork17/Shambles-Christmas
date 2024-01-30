package dev.kenji.shambleschristmas;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

public class GAMEcustomManager extends LinearLayoutManager {

    private boolean isScrollEnabled = true;

    public GAMEcustomManager(Context context) {
        super(context);
    }

    public void setScrollEnabled(boolean flag) {
        isScrollEnabled = flag;
    }

    @Override
    public boolean canScrollVertically() {
        return isScrollEnabled && super.canScrollVertically();
    }
}
