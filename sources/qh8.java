// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qh8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xh8 b;

    public /* synthetic */ qh8(xh8 xh8Var, byte b) {
        this.a = b;
        this.b = xh8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xh8 xh8Var = this.b;
        switch (b) {
            case 0:
                d01.t(xh8Var.getContext(), "https://" + na7.q1(xh8Var.T1).N2 + "/nft/" + xh8Var.y2.slug);
                break;
            case 1:
                try {
                    xh8Var.c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                xh8Var.j2.c(xh8Var.F2);
                break;
            default:
                xh8Var.J2[0].setVisibility(8);
                break;
        }
    }
}
