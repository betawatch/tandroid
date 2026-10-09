package yh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                yVar.getClass();
                yVar.V(zf.a.i(0L, i10 == 0 ? zf.b.a : zf.b.b), true, false, true);
                yVar.d0.setText("");
                break;
            case 1:
                c0 c0Var = (c0) this.b;
                c0Var.getClass();
                c0Var.s(zf.a.i(0L, i10 == 0 ? zf.b.a : zf.b.b), true, false, true);
                c0Var.h.setText("");
                break;
            default:
                y2 y2Var = (y2) this.b;
                y2Var.getClass();
                y2Var.q = i10 == 0 ? zf.b.a : zf.b.b;
                y2Var.a(true);
                break;
        }
    }
}
