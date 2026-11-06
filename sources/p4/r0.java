package p4;

import c8.s9;
import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements a1, h2.j, z0, q2.l, androidx.car.app.utils.b, g9.k {
    public final /* synthetic */ int a;

    @Override // p4.z0
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.a) {
            case 2:
                g1Var.x0(list);
                break;
            default:
                g1Var.x0(list);
                break;
        }
    }

    @Override // h2.j
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.a) {
            case 1:
                g1Var.L();
                break;
            case 2:
            case 3:
            case 4:
            case 8:
            default:
                g1Var.v();
                break;
            case 5:
                g1Var.stop();
                break;
            case 6:
                g1Var.c0();
                break;
            case 7:
                g1Var.G();
                break;
            case 9:
                g1Var.a();
                break;
        }
    }

    @Override // g9.k, l5.e
    public Object apply(Object obj) {
        r2.q qVar = (r2.q) obj;
        qVar.l();
        return h9.i0.q(h9.o.y(qVar.Y.b, new v0.j(24)));
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // p4.a1
    public Object i(d0 d0Var, v vVar, int i7) {
        switch (this.a) {
            case 0:
                pb.b bVar = d0Var.e;
                d0Var.s(vVar);
                bVar.getClass();
                return s9.b(new m1(-6));
            case 4:
                d0Var.getClass();
                throw new ClassCastException();
            case 8:
                d0Var.getClass();
                throw new ClassCastException();
            case 10:
                d0Var.getClass();
                throw new ClassCastException();
            case 12:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                pb.b bVar2 = d0Var.e;
                d0Var.s(vVar);
                bVar2.getClass();
                return s9.b(new m1(-6));
        }
    }

    public /* synthetic */ r0(r.a aVar, int i7, w.b bVar) {
        this.a = 17;
    }

    @Override // q2.l
    public void release() {
    }
}
