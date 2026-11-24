// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class tka extends ph0 {
    public final int F;
    public final go4 G;
    public long H;
    public boolean I;

    public tka(a83 a83Var, g83 g83Var, go4 go4Var, int i, Object obj, long j, long j2, long j3, int i2, go4 go4Var2) {
        super(a83Var, g83Var, go4Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.F = i2;
        this.G = go4Var2;
    }

    @Override // ja6
    public final void a() {
        c0b c0bVar = this.r;
        lx6 lx6Var = this.y;
        lx6Var.getClass();
        int i = 0;
        for (hr9 hr9Var : (hr9[]) lx6Var.c) {
            if (hr9Var.I != 0) {
                hr9Var.I = 0L;
                hr9Var.C = true;
            }
        }
        yzb R = lx6Var.R(this.F);
        R.g(this.G);
        try {
            long open = c0bVar.open(this.b.b(this.H));
            if (open != -1) {
                open += this.H;
            }
            vb3 vb3Var = new vb3(c0bVar, this.H, open);
            while (true) {
                long j = this.H;
                if (i == -1) {
                    R.a(this.h, 1, (int) j, 0, null);
                    wde.a(c0bVar);
                    this.I = true;
                    return;
                }
                this.H = j + i;
                i = R.f(vb3Var, ConnectionsManager.DEFAULT_DATACENTER_ID, true);
            }
        } catch (Throwable th) {
            wde.a(c0bVar);
            throw th;
        }
    }

    @Override // dm6
    public final boolean c() {
        return this.I;
    }

    @Override // ja6
    public final void e() {
    }
}
