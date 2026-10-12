package zh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                z zVar = (z) this.b;
                zVar.getClass();
                zVar.V(ag.a.i(0L, i10 == 0 ? ag.b.a : ag.b.b), true, false, true);
                zVar.d0.setText("");
                break;
            case 1:
                d0 d0Var = (d0) this.b;
                d0Var.getClass();
                d0Var.s(ag.a.i(0L, i10 == 0 ? ag.b.a : ag.b.b), true, false, true);
                d0Var.h.setText("");
                break;
            default:
                x2 x2Var = (x2) this.b;
                x2Var.getClass();
                x2Var.q = i10 == 0 ? ag.b.a : ag.b.b;
                x2Var.a(true);
                break;
        }
    }
}
