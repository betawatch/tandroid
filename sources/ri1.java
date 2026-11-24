// default package

import android.app.Activity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ri1 extends s39 {
    public final /* synthetic */ vi1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri1(vi1 vi1Var, Activity activity, wjb wjbVar, zi1 zi1Var) {
        super(activity, wjbVar, zi1Var);
        this.d0 = vi1Var;
    }

    @Override // wec, android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.d0.x.Q0 && super.canScrollHorizontally(i);
    }
}
