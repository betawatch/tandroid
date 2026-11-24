// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
