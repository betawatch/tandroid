// default package

import android.util.Pair;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uf5 implements s84 {
    public final /* synthetic */ byte a;
    public final ska b;
    public u84 c;
    public s84 d;
    public Pair e;
    public final s84 f;

    public uf5(int i, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ska(65496, 2, "image/jpeg");
                this.f = (i & 1) == 0 ? new kw5() : null;
                break;
            default:
                this.b = new ska(-1, -1, "image/heif");
                this.f = (i & 1) != 0 ? null : new tf5();
                break;
        }
    }

    @Override // s84
    public final s84 a() {
        byte b = this.a;
        return this;
    }

    @Override // s84
    public final int b(t84 t84Var, u21 u21Var) {
        byte b = this.a;
        s84 s84Var = this.b;
        s84 s84Var2 = this.f;
        switch (b) {
            case 0:
                s84 s84Var3 = this.d;
                if (s84Var3 == null) {
                    s84 s84Var4 = (tf5) s84Var2;
                    jte.p(s84Var3 == null);
                    s84Var4.getClass();
                    if (s84Var4.c(t84Var)) {
                        s84Var = s84Var4;
                    }
                    this.d = s84Var;
                    ((vb3) t84Var).f = 0;
                    Pair pair = this.e;
                    if (pair != null) {
                        s84Var.d(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    s84 s84Var5 = this.d;
                    u84 u84Var = this.c;
                    u84Var.getClass();
                    s84Var5.f(u84Var);
                }
                break;
            default:
                s84 s84Var6 = this.d;
                if (s84Var6 == null) {
                    s84 s84Var7 = (kw5) s84Var2;
                    jte.p(s84Var6 == null);
                    s84Var7.getClass();
                    if (s84Var7.c(t84Var)) {
                        s84Var = s84Var7;
                    }
                    this.d = s84Var;
                    ((vb3) t84Var).f = 0;
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        s84Var.d(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    s84 s84Var8 = this.d;
                    u84 u84Var2 = this.c;
                    u84Var2.getClass();
                    s84Var8.f(u84Var2);
                }
                break;
        }
        return this.d.b(t84Var, u21Var);
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        byte b = this.a;
        s84 s84Var = this.f;
        switch (b) {
            case 0:
                if (((tf5) s84Var) != null && ile.a((vb3) t84Var, true)) {
                    return true;
                }
                vb3 vb3Var = (vb3) t84Var;
                vb3Var.f = 0;
                return ile.a(vb3Var, false);
            default:
                kw5 kw5Var = (kw5) s84Var;
                if (kw5Var != null && kw5Var.c(t84Var)) {
                    return true;
                }
                ((vb3) t84Var).f = 0;
                return this.b.c(t84Var);
        }
    }

    @Override // s84
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                s84 s84Var = this.d;
                if (s84Var == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    break;
                } else {
                    s84Var.d(j, j2);
                    break;
                }
            default:
                s84 s84Var2 = this.d;
                if (s84Var2 == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    break;
                } else {
                    s84Var2.d(j, j2);
                    break;
                }
        }
    }

    @Override // s84
    public final List e() {
        byte b = this.a;
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        byte b = this.a;
        ska skaVar = this.b;
        s84 s84Var = this.f;
        switch (b) {
            case 0:
                this.c = u84Var;
                if (((tf5) s84Var) == null) {
                    this.d = skaVar;
                    skaVar.f(u84Var);
                    break;
                }
                break;
            default:
                this.c = u84Var;
                if (((kw5) s84Var) == null) {
                    this.d = skaVar;
                    skaVar.f(u84Var);
                    break;
                }
                break;
        }
    }

    @Override // s84
    public final void release() {
        byte b = this.a;
        s84 s84Var = this.f;
        switch (b) {
            case 0:
                tf5 tf5Var = (tf5) s84Var;
                if (tf5Var != null) {
                    tf5Var.release();
                    break;
                }
                break;
            default:
                kw5 kw5Var = (kw5) s84Var;
                if (kw5Var != null) {
                    kw5Var.release();
                    break;
                }
                break;
        }
    }
}
