// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rs1 extends eq0 {
    public final /* synthetic */ vs1 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(vs1 vs1Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.M = vs1Var;
    }

    @Override // eq0
    public final int getSideMenuWidth() {
        mu1 mu1Var = this.M.R;
        int i = mu1.md;
        return mu1Var.e7();
    }
}
