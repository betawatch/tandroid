// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class y67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ long d;

    public /* synthetic */ y67(na7 na7Var, TLRPC.TL_error tL_error, long j, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = tL_error;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TLRPC.TL_error tL_error = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.B(j, tL_error.text);
                kk7.f(na7Var.currentAccount).k(kk7.G5, Long.valueOf(j));
                break;
            default:
                na7Var.B(j, tL_error.text);
                na7Var.l1.remove(Long.valueOf(j));
                break;
        }
    }
}
