// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ywc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xt b;

    public /* synthetic */ ywc(xt xtVar, byte b) {
        this.a = b;
        this.b = xtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        xt xtVar = this.b;
        switch (b) {
            case 0:
                boolean z = xtVar.a0;
                xs0 xs0Var = xtVar.c0;
                if (!z) {
                    xs0Var.clearFocus();
                    hl.t1(xs0Var);
                    break;
                } else {
                    xs0Var.requestFocus();
                    hl.E3(xs0Var);
                    break;
                }
            default:
                xtVar.B0 = true;
                if (xtVar.getParent() != null) {
                    xtVar.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    xtVar.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
