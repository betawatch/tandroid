package yh;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ n1(z3 z3Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = tL_error;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getBulletinFactory().d0(this.c, false);
                Runnable runnable = this.d;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b.getBulletinFactory().d0(this.c, false);
                Runnable runnable2 = this.d;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
