// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ze1 extends m8 {
    public final /* synthetic */ nf1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze1(nf1 nf1Var, ye1 ye1Var) {
        super(ye1Var, -2, -2);
        this.o = nf1Var;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        nf1 nf1Var = this.o;
        if (nf1Var.G0 != this) {
            return;
        }
        m21.e();
        nf1Var.G0 = null;
    }
}
