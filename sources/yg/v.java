package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.xt0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final xt0 a;
    public final View b;

    public v(Context context, g6 g6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, ha.o(-1, -1));
        s6.h(l6.h5, view, g6Var);
        xt0 xt0Var = new xt0(context, g6Var);
        this.a = xt0Var;
        addView(xt0Var, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        s6.Z(this, getContext(), R.drawable.greydivider_top, l6.b7);
    }

    public void setCallBack(wt0 wt0Var) {
        this.a.setCallback(wt0Var);
    }
}
