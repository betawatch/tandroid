package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pw0;
import w7.z5;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final pw0 a;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.h5, d6Var));
        pw0 pw0Var = new pw0(context, d6Var);
        this.a = pw0Var;
        addView(pw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(i6.V0(getContext(), R.drawable.greydivider_top, i6.b7));
    }

    public void setCallBack(ow0 ow0Var) {
        this.a.setCallback(ow0Var);
    }
}
