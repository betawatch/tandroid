package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tv0;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final tv0 a;

    public v(Context context, e6 e6Var) {
        super(context);
        View view = new View(context);
        addView(view, x5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.h5, e6Var));
        tv0 tv0Var = new tv0(context, e6Var);
        this.a = tv0Var;
        addView(tv0Var, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(i6.V0(getContext(), R.drawable.greydivider_top, i6.b7));
    }

    public void setCallBack(sv0 sv0Var) {
        this.a.setCallback(sv0Var);
    }
}
