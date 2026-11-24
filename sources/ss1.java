// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ss1 extends oo0 {
    public final /* synthetic */ vs1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss1(vs1 vs1Var, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context);
        this.f = vs1Var;
    }

    @Override // oo0
    public final int getSideMenuWidth() {
        mu1 mu1Var = this.f.R;
        int i = mu1.md;
        return mu1Var.e7();
    }
}
