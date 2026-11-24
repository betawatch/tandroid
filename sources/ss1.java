// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
        int i = mu1.nd;
        return mu1Var.g7();
    }
}
