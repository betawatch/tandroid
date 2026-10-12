package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final sw0 a;
    public final View b;

    public v(Context context, c6 c6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, a6.n(-1, -1));
        view.setBackgroundColor(g6.w0(g6.h5, c6Var));
        sw0 sw0Var = new sw0(context, c6Var);
        this.a = sw0Var;
        addView(sw0Var, a6.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(g6.W0(getContext(), R.drawable.greydivider_top, g6.b7));
    }

    public void setCallBack(rw0 rw0Var) {
        this.a.setCallback(rw0Var);
    }
}
