package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.wt0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final wt0 a;
    public final View b;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, ja.o(-1, -1));
        q6.h(j6.h5, view, e6Var);
        wt0 wt0Var = new wt0(context, e6Var);
        this.a = wt0Var;
        addView(wt0Var, ja.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        q6.Z(this, getContext(), R.drawable.greydivider_top, j6.b7);
    }

    public void setCallBack(vt0 vt0Var) {
        this.a.setCallback(vt0Var);
    }
}
