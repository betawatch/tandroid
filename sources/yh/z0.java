package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class z0 extends x4 {
    public final /* synthetic */ o1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(o1 o1Var, Context context, int i10, sg.k kVar, long j10, l0 l0Var) {
        super(context, i10, null, kVar, j10, l0Var, false, false);
        this.z0 = o1Var;
    }

    @Override // yh.x4
    public final xc X() {
        g6 g6Var;
        o1 o1Var = this.z0;
        org.telegram.ui.ActionBar.e3 e3Var = o1Var.container;
        g6Var = o1Var.resourcesProvider;
        return new xc(e3Var, g6Var);
    }
}
