// default package

import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pb3 implements j74 {
    public final /* synthetic */ byte a;
    public final Object b;

    public pb3() {
        this.a = (byte) 1;
        this.b = new pf7(sab.B, 16);
    }

    @Override // j74
    public final j74 a() {
        switch (this.a) {
            case 0:
                return this;
            default:
                return (pf7) this.b;
        }
    }

    @Override // j74
    public final int b(k74 k74Var, m11 m11Var) {
        switch (this.a) {
            case 0:
                return ((ja3) k74Var).k(ConnectionsManager.DEFAULT_DATACENTER_ID) != -1 ? 0 : -1;
            default:
                return ((pf7) this.b).b(k74Var, m11Var);
        }
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((pf7) this.b).c(k74Var);
        }
    }

    @Override // j74
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((pf7) this.b).d(j, j2);
                break;
        }
    }

    @Override // j74
    public final List e() {
        switch (this.a) {
            case 0:
                km5 km5Var = mm5.b;
                return w59.e;
            default:
                return ((pf7) this.b).m;
        }
    }

    @Override // j74
    public final void f(l74 l74Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wxb S = l74Var.S(0, 3);
                l74Var.g0(new oc0(-9223372036854775807L));
                l74Var.z();
                fm4 fm4Var = (fm4) obj;
                em4 a = fm4Var.a();
                a.s = ud7.n("text/x-unknown");
                a.k = fm4Var.t;
                yjb.v(a, S);
                break;
            default:
                ((pf7) obj).f(new ln8((Object) l74Var, (byte) 10));
                break;
        }
    }

    @Override // j74
    public final void release() {
        byte b = this.a;
    }

    public pb3(fm4 fm4Var) {
        this.a = (byte) 0;
        this.b = fm4Var;
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i(long j, long j2) {
    }
}
