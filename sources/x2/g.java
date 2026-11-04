package x2;

import b8.kg;
import w2.c1;
import w2.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g implements d1 {
    public final i a;
    public final c1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, c1 c1Var, int i3) {
        this.e = iVar;
        this.a = iVar2;
        this.b = c1Var;
        this.c = i3;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        i iVar = this.e;
        kg kgVar = iVar.h;
        int[] iArr = iVar.b;
        int i3 = this.c;
        kgVar.k(iArr[i3], iVar.c[i3], 0, null, iVar.K);
        this.d = true;
    }

    @Override // w2.d1
    public final boolean f() {
        i iVar = this.e;
        return !iVar.x() && this.b.A(iVar.Q);
    }

    @Override // w2.d1
    public final int m(long j10) {
        i iVar = this.e;
        if (iVar.x()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        c1 c1Var = this.b;
        int x10 = c1Var.x(j10, z10);
        a aVar = iVar.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.c + 1) - c1Var.v());
        }
        c1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override // w2.d1
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        i iVar = this.e;
        if (iVar.x()) {
            return -3;
        }
        a aVar = iVar.M;
        c1 c1Var = this.b;
        if (aVar != null && aVar.d(this.c + 1) <= c1Var.v()) {
            return -3;
        }
        b();
        return c1Var.F(bVar, hVar, i3, iVar.Q);
    }

    @Override // w2.d1
    public final void a() {
    }
}
