package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ut0;
import org.telegram.ui.Components.vt0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public final vt0 a;
    public final View b;

    public v(Context context, f6 f6Var) {
        super(context);
        View view = new View(context);
        this.b = view;
        addView(view, ha.o(-1, -1));
        r6.i(k6.h5, view, f6Var);
        vt0 vt0Var = new vt0(context, f6Var);
        this.a = vt0Var;
        addView(vt0Var, ha.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
        r6.a0(this, getContext(), R.drawable.greydivider_top, k6.b7);
    }

    public void setCallBack(ut0 ut0Var) {
        this.a.setCallback(ut0Var);
    }
}
