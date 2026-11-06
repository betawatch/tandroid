package p4;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                this.b.g.Q0(this.c, TLObject.FLAG_31, 1, c1.S0(new org.telegram.utils.twidget.a(20)));
                break;
            case 2:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 9, c1.S0(new org.telegram.utils.twidget.a(29)));
                break;
            case 3:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 7, c1.S0(new org.telegram.utils.twidget.a(25)));
                break;
            case 4:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 12, c1.S0(new org.telegram.utils.twidget.a(28)));
                break;
            case 5:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 11, c1.S0(new org.telegram.utils.twidget.a(24)));
                break;
            case 6:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 3, c1.S0(new r0(5)));
                break;
            case 7:
                this.b.g.Q0(this.c, TLObject.FLAG_31, 1, c1.S0(new org.telegram.utils.twidget.a(20)));
                break;
            case 8:
                this.b.g.O0(this.c, TLObject.FLAG_31);
                break;
            default:
                this.b.g.O0(this.c, TLObject.FLAG_31);
                break;
        }
    }
}
