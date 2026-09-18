package yh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.b;
                a0Var.getClass();
                a0Var.U(zf.a.i(0L, i10 == 0 ? zf.b.a : zf.b.b), true, false, true);
                a0Var.d0.setText("");
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                e0Var.getClass();
                e0Var.q(zf.a.i(0L, i10 == 0 ? zf.b.a : zf.b.b), true, false, true);
                e0Var.h.setText("");
                break;
            default:
                f3 f3Var = (f3) this.b;
                f3Var.getClass();
                f3Var.q = i10 == 0 ? zf.b.a : zf.b.b;
                f3Var.a(true);
                break;
        }
    }
}
