package yh;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements MessagesStorage.IntCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                b0Var.getClass();
                b0Var.S(zf.a.i(0L, i10 == 0 ? zf.b.a : zf.b.b), true, false, true);
                b0Var.d0.setText("");
                break;
            case 1:
                f0 f0Var = (f0) this.b;
                f0Var.getClass();
                f0Var.q(zf.a.i(0L, i10 == 0 ? zf.b.a : zf.b.b), true, false, true);
                f0Var.h.setText("");
                break;
            default:
                d3 d3Var = (d3) this.b;
                d3Var.getClass();
                d3Var.q = i10 == 0 ? zf.b.a : zf.b.b;
                d3Var.a(true);
                break;
        }
    }
}
