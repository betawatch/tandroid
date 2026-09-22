package yh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                e3 e3Var = (e3) this.b;
                e3Var.getClass();
                e3Var.q = i10 == 0 ? zf.b.a : zf.b.b;
                e3Var.a(true);
                break;
        }
    }
}
