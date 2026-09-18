package yh;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ n1(a4 a4Var, TLRPC.TL_error tL_error, Runnable runnable, int i10) {
        this.a = i10;
        this.b = a4Var;
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
