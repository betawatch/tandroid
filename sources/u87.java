// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class u87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ u87(uc7 uc7Var, TLRPC.TL_error tL_error, long j, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tL_error;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.TL_error tL_error = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.D(j, tL_error.text);
                jn7.f(uc7Var.currentAccount).k(jn7.H5, Long.valueOf(j));
                break;
            default:
                uc7Var.D(j, tL_error.text);
                uc7Var.l1.remove(Long.valueOf(j));
                break;
        }
    }
}
