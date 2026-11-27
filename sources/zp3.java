// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zp3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fq3 b;

    public /* synthetic */ zp3(fq3 fq3Var, byte b) {
        this.a = b;
        this.b = fq3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        fq3 fq3Var = this.b;
        switch (b) {
            case 0:
                fq3Var.b();
                break;
            case 1:
                fq3Var.e = false;
                cq3 cq3Var = fq3Var.s;
                if (cq3Var != null) {
                    cq3Var.a(true);
                    fq3Var.s = null;
                }
                eq3 eq3Var = fq3Var.n;
                if (eq3Var != null) {
                    eq3Var.a();
                }
                fq3Var.c = false;
                fq3Var.d();
                break;
            default:
                if (fq3Var.c && fq3Var.r != null) {
                    fq3Var.n.b(R.raw.error, 3500, ob6.N0("VideoConvertFail"));
                    fq3Var.c = false;
                    fq3Var.d();
                    break;
                }
                break;
        }
    }
}
