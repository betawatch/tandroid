package zh;

import android.content.Context;
import bi.h7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a1 extends h7 {
    public final /* synthetic */ p1 B1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p1 p1Var, Context context, int i10, long j10, u6 u6Var) {
        super(context, i10, j10, u6Var, null);
        this.B1 = p1Var;
    }

    @Override // bi.h7, org.telegram.ui.ActionBar.k3, org.telegram.ui.ActionBar.n2
    public final wc getBulletinFactory() {
        u6 u6Var;
        p1 p1Var = this.B1;
        org.telegram.ui.ActionBar.h3 h3Var = p1Var.container;
        u6Var = p1Var.resourcesProvider;
        return new wc(h3Var, u6Var);
    }
}
