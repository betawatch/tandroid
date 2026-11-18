package p4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
