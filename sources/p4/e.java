package p4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
                this.b.g.q1(this.c, TLObject.FLAG_31, 1, c1.s1(new org.telegram.utils.twidget.e(21)));
                break;
            case 2:
                this.b.g.q1(this.c, TLObject.FLAG_31, 9, c1.s1(new r0(0)));
                break;
            case 3:
                this.b.g.q1(this.c, TLObject.FLAG_31, 7, c1.s1(new org.telegram.utils.twidget.e(26)));
                break;
            case 4:
                this.b.g.q1(this.c, TLObject.FLAG_31, 12, c1.s1(new org.telegram.utils.twidget.e(29)));
                break;
            case 5:
                this.b.g.q1(this.c, TLObject.FLAG_31, 11, c1.s1(new org.telegram.utils.twidget.e(25)));
                break;
            case 6:
                this.b.g.q1(this.c, TLObject.FLAG_31, 3, c1.s1(new r0(6)));
                break;
            case 7:
                this.b.g.q1(this.c, TLObject.FLAG_31, 1, c1.s1(new org.telegram.utils.twidget.e(21)));
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
