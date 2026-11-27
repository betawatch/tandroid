// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
