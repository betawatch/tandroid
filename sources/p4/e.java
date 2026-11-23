package p4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d0 b;
    public final /* synthetic */ v c;

    public /* synthetic */ e(d0 d0Var, v vVar, int i7) {
        this.a = i7;
        this.b = d0Var;
        this.c = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d0 d0Var = this.b;
                if (!d0Var.j()) {
                    if (d0Var.x) {
                        v vVar = this.c;
                        if (!d0.k(vVar)) {
                            if (d0Var.i(vVar)) {
                                d0Var.x = false;
                            }
                        }
                    }
                    d0Var.e.getClass();
                    break;
                }
                break;
            case 1:
                this.b.g.q1(this.c, TLObject.FLAG_31, 1, d1.s1(new org.telegram.utils.twidget.f(27)));
                break;
            case 2:
                this.b.g.q1(this.c, TLObject.FLAG_31, 9, d1.s1(new r0(6)));
                break;
            case 3:
                this.b.g.q1(this.c, TLObject.FLAG_31, 7, d1.s1(new r0(2)));
                break;
            case 4:
                this.b.g.q1(this.c, TLObject.FLAG_31, 12, d1.s1(new r0(5)));
                break;
            case 5:
                this.b.g.q1(this.c, TLObject.FLAG_31, 11, d1.s1(new r0(1)));
                break;
            case 6:
                this.b.g.q1(this.c, TLObject.FLAG_31, 3, d1.s1(new r0(12)));
                break;
            case 7:
                this.b.g.q1(this.c, TLObject.FLAG_31, 1, d1.s1(new org.telegram.utils.twidget.f(27)));
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
