// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sz3 extends mu1 {
    @Override // mu1, org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        ar1 ar1Var;
        super.onTransitionAnimationEnd(z, z2);
        if (!z || (ar1Var = this.a0) == null) {
            return;
        }
        ar1Var.V1();
        this.a0.postDelayed(new li3(this, (byte) 25), 100L);
    }
}
