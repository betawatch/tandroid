package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class j3 extends t61 {
    static {
        t61.setup(new j3());
    }

    public static u61 a(String str) {
        u61 K = u61.K(j3.class);
        K.l = str;
        return K;
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((k3) view).set(u61Var.l);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new k3(context, u6Var);
    }
}
