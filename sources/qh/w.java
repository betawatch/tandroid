package qh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new w());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        ((x) view).i((a) l41Var.G, (i3) l41Var.H);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        x xVar = new x(context, i9, b6Var);
        xVar.setBackground(new u1(f6.v0(f6.d6, b6Var)));
        return xVar;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
