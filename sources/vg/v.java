package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tv0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final tv0 a;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(h6.v0(h6.h5, d6Var));
        tv0 tv0Var = new tv0(context, d6Var);
        this.a = tv0Var;
        addView(tv0Var, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(h6.V0(getContext(), R.drawable.greydivider_top, h6.b7));
    }

    public void setCallBack(sv0 sv0Var) {
        this.a.setCallback(sv0Var);
    }
}
