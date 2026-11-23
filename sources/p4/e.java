package p4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ v c;

    public /* synthetic */ e(e0 e0Var, v vVar, int i7) {
        this.a = i7;
        this.b = e0Var;
        this.c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                if (!e0Var.j()) {
                    if (e0Var.x) {
                        v vVar = this.c;
                        if (!e0.k(vVar)) {
                            if (e0Var.i(vVar)) {
                                e0Var.x = false;
                            }
                        }
                    }
                    e0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.q1(this.c, TLObject.FLAG_31, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                break;
            case 2:
                this.b.g.q1(this.c, TLObject.FLAG_31, 9, e1.s1(new r0(6)));
                break;
            case 3:
                this.b.g.q1(this.c, TLObject.FLAG_31, 7, e1.s1(new r0(2)));
                break;
            case 4:
                this.b.g.q1(this.c, TLObject.FLAG_31, 12, e1.s1(new r0(5)));
                break;
            case 5:
                this.b.g.q1(this.c, TLObject.FLAG_31, 11, e1.s1(new r0(1)));
                break;
            case 6:
                this.b.g.q1(this.c, TLObject.FLAG_31, 3, e1.s1(new r0(12)));
                break;
            case 7:
                this.b.g.q1(this.c, TLObject.FLAG_31, 1, e1.s1(new org.telegram.utils.twidget.f(27)));
                break;
            case 8:
                this.b.g.o1(this.c, TLObject.FLAG_31);
                break;
            default:
                this.b.g.o1(this.c, TLObject.FLAG_31);
                break;
        }
    }
}
