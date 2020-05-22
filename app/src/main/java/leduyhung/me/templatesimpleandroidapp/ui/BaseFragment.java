package leduyhung.me.templatesimpleandroidapp.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenManager;
import leduyhung.me.templatesimpleandroidapp.manager.screen.ScreenObserver;

public abstract class BaseFragment extends Fragment {

    public Context mContext;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.mContext = context;
    }

    @Override
    public void onResume() {
        super.onResume();
        ScreenManager.getInstance().register(this.getClass(), (this instanceof ScreenObserver) ? (ScreenObserver) this : null);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(onCreateLayout(), container, false);
    }

    @Override
    public void onStop() {
        super.onStop();
        ScreenManager.getInstance().unRegister(this.getClass());
    }

    protected abstract int onCreateLayout();
}
