package q4;

import h5.d0;
import h5.w;
import j3.n0;
import org.telegram.ui.yh;
import r3.u;
import r3.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c implements v {
    public final int a;
    public final n0 b;
    public final r3.j c = new r3.j();
    public n0 d;
    public v e;
    public long f;

    public c(int i10, int i11, n0 n0Var) {
        this.a = i11;
        this.b = n0Var;
    }

    @Override // r3.v
    public final void a(int i10, w wVar) {
        v vVar = this.e;
        int i11 = d0.a;
        vVar.d(i10, wVar);
    }

    @Override // r3.v
    public final void b(n0 n0Var) {
        n0 n0Var2 = this.b;
        if (n0Var2 != null) {
            n0Var = n0Var.c(n0Var2);
        }
        this.d = n0Var;
        v vVar = this.e;
        int i10 = d0.a;
        vVar.b(n0Var);
    }

    @Override // r3.v
    public final void c(long j10, int i10, int i11, int i12, u uVar) {
        long j11 = this.f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.e = this.c;
        }
        v vVar = this.e;
        int i13 = d0.a;
        vVar.c(j10, i10, i11, i12, uVar);
    }

    @Override // r3.v
    public final /* synthetic */ void d(int i10, w wVar) {
        yh.a(this, wVar, i10);
    }

    @Override // r3.v
    public final int e(g5.j jVar, int i10, boolean z4) {
        v vVar = this.e;
        int i11 = d0.a;
        return vVar.e(jVar, i10, z4);
    }
}
