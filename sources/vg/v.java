package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qw0;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final qw0 a;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(i6.v0(i6.h5, d6Var));
        qw0 qw0Var = new qw0(context, d6Var);
        this.a = qw0Var;
        addView(qw0Var, z5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        setBackground(i6.V0(getContext(), R.drawable.greydivider_top, i6.b7));
    }

    public void setCallBack(pw0 pw0Var) {
        this.a.setCallback(pw0Var);
    }
}
