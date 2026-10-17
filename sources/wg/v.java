package wg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.nw0;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final nw0 a;
    public final View b;

    public v(Context context, d6 d6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, z5.n(-1, -1));
        view.setBackgroundColor(h6.w0(h6.h5, d6Var));
        nw0 nw0Var = new nw0(context, d6Var);
        this.a = nw0Var;
        addView(nw0Var, z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
        setBackground(h6.W0(getContext(), R.drawable.greydivider_top, h6.b7));
    }

    public void setCallBack(mw0 mw0Var) {
        this.a.setCallback(mw0Var);
    }
}
