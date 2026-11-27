// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class zr3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ as3 b;

    public /* synthetic */ zr3(as3 as3Var, byte b) {
        this.a = b;
        this.b = as3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        as3 as3Var = this.b;
        switch (b) {
            case 0:
                if (as3Var.L > 0) {
                    as3Var.dualToggleShape();
                    try {
                        as3Var.performHapticFeedback(0, 1);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                as3Var.focusToPoint((int) as3Var.J, (int) as3Var.K);
                break;
        }
    }
}
