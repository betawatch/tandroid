package y2;

import a8.xa;
import x2.c1;
import x2.d1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g implements d1 {
    public final i a;
    public final c1 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ i e;

    public g(i iVar, i iVar2, c1 c1Var, int i7) {
        this.e = iVar;
        this.a = iVar2;
        this.b = c1Var;
        this.c = i7;
    }

    public final void b() {
        if (this.d) {
            return;
        }
        i iVar = this.e;
        xa xaVar = iVar.h;
        int[] iArr = iVar.b;
        int i7 = this.c;
        xaVar.j(iArr[i7], iVar.c[i7], 0, null, iVar.K);
        this.d = true;
    }

    @Override // x2.d1
    public final boolean h() {
        i iVar = this.e;
        return !iVar.y() && this.b.A(iVar.Q);
    }

    @Override // x2.d1
    public final int j(long j3) {
        i iVar = this.e;
        if (iVar.y()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        c1 c1Var = this.b;
        int x10 = c1Var.x(j3, z10);
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

    @Override // x2.d1
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        i iVar = this.e;
        if (iVar.y()) {
            return -3;
        }
        a aVar2 = iVar.M;
        c1 c1Var = this.b;
        if (aVar2 != null && aVar2.d(this.c + 1) <= c1Var.v()) {
            return -3;
        }
        b();
        return c1Var.F(aVar, hVar, i7, iVar.Q);
    }

    @Override // x2.d1
    public final void a() {
    }
}
