// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u72 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c82 b;

    public /* synthetic */ u72(c82 c82Var, byte b) {
        this.a = b;
        this.b = c82Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c82 c82Var = this.b;
        switch (b) {
            case 0:
                c82Var.h.requestFocus();
                break;
            case 1:
                c82Var.h.setFocusableInTouchMode(true);
                break;
            case 2:
                c82Var.finishFragment();
                break;
            case 3:
                if (c82Var.Q && !c82Var.P) {
                    c82Var.P = true;
                    kk7.e().k(98, 512);
                    c82Var.c.setVisibility(0);
                    c82Var.c.setLayerType(2, null);
                    c82Var.i0(c82Var.R.e);
                    c82Var.R.a(true, true);
                    break;
                }
                break;
            case 4:
                d01.t(c82Var.getParentActivity(), "https://t.me/stickers");
                break;
            case 5:
                d01.t(c82Var.getParentActivity(), k96.M0(2131752397, null));
                break;
            default:
                c82Var.d0(false);
                break;
        }
    }
}
