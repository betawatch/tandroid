package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zw0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v extends FrameLayout {
    public final ax0 a;
    public final View b;

    public v(Context context, u6 u6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, kb1.r(-1, -1));
        f7.i(y6.h5, view, u6Var);
        ax0 ax0Var = new ax0(context, u6Var);
        this.a = ax0Var;
        addView(ax0Var, kb1.h(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        f7.a0(R.drawable.greydivider_top, y6.b7, getContext(), this, null);
    }

    public void setCallBack(zw0 zw0Var) {
        this.a.setCallback(zw0Var);
    }
}
