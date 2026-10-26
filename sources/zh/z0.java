package zh;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class z0 extends y4 {
    public final /* synthetic */ p1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(p1 p1Var, Context context, int i10, tg.k kVar, long j10, l0 l0Var) {
        super(context, i10, null, kVar, j10, l0Var, false, false);
        this.z0 = p1Var;
    }

    @Override // zh.y4
    public final wc X() {
        u6 u6Var;
        p1 p1Var = this.z0;
        org.telegram.ui.ActionBar.h3 h3Var = p1Var.container;
        u6Var = p1Var.resourcesProvider;
        return new wc(h3Var, u6Var);
    }
}
