package zh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                c3 c3Var = (c3) this.b;
                c3Var.getClass();
                c3Var.q = i10 == 0 ? zf.b.a : zf.b.b;
                c3Var.a(true);
                break;
        }
    }
}
