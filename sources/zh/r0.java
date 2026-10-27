package zh;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class r0 extends y4 {
    public final /* synthetic */ p1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p1 p1Var, Context context, int i10, TL_stars.StarGift starGift, long j10, l0 l0Var, boolean z10, boolean z11) {
        super(context, i10, starGift, null, j10, l0Var, z10, z11);
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
