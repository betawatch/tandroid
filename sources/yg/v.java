package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.hu0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final hu0 a;
    public final View b;

    public v(Context context, h6 h6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, ma.o(-1, -1));
        t6.h(m6.h5, view, h6Var);
        hu0 hu0Var = new hu0(context, h6Var);
        this.a = hu0Var;
        addView(hu0Var, ma.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        t6.Z(this, getContext(), R.drawable.greydivider_top, m6.b7);
    }

    public void setCallBack(gu0 gu0Var) {
        this.a.setCallback(gu0Var);
    }
}
