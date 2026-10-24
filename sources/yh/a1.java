package yh;

import ai.l7;
import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class a1 extends l7 {
    public final /* synthetic */ o1 B1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(o1 o1Var, Context context, int i10, long j10, g6 g6Var) {
        super(context, i10, j10, g6Var, null);
        this.B1 = o1Var;
    }

    @Override // ai.l7, org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.k2
    public final xc getBulletinFactory() {
        g6 g6Var;
        o1 o1Var = this.B1;
        org.telegram.ui.ActionBar.e3 e3Var = o1Var.container;
        g6Var = o1Var.resourcesProvider;
        return new xc(e3Var, g6Var);
    }
}
