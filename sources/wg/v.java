package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sv0;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final sv0 a;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(j6.v0(j6.h5, f6Var));
        sv0 sv0Var = new sv0(context, f6Var);
        this.a = sv0Var;
        addView(sv0Var, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(j6.V0(getContext(), R.drawable.greydivider_top, j6.b7));
    }

    public void setCallBack(rv0 rv0Var) {
        this.a.setCallback(rv0Var);
    }
}
