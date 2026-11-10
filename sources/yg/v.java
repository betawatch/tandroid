package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wt0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final wt0 a;
    public final View b;

    public v(Context context, h6 h6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, ha.o(-1, -1));
        t6.h(m6.h5, view, h6Var);
        wt0 wt0Var = new wt0(context, h6Var);
        this.a = wt0Var;
        addView(wt0Var, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        t6.Z(this, getContext(), R.drawable.greydivider_top, m6.b7);
    }

    public void setCallBack(vt0 vt0Var) {
        this.a.setCallback(vt0Var);
    }
}
