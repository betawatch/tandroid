// default package

import android.util.Pair;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xf5 implements e84 {
    public final /* synthetic */ byte a;
    public final lma b;
    public g84 c;
    public e84 d;
    public Pair e;
    public final e84 f;

    public xf5(int i, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new lma(65496, 2, "image/jpeg");
                this.f = (i & 1) == 0 ? new pw5() : null;
                break;
            default:
                this.b = new lma(-1, -1, "image/heif");
                this.f = (i & 1) != 0 ? null : new wf5();
                break;
        }
    }

    @Override // e84
    public final e84 a() {
        byte b = this.a;
        return this;
    }

    @Override // e84
    public final int b(f84 f84Var, v11 v11Var) {
        byte b = this.a;
        e84 e84Var = this.b;
        e84 e84Var2 = this.f;
        switch (b) {
            case 0:
                e84 e84Var3 = this.d;
                if (e84Var3 == null) {
                    e84 e84Var4 = (wf5) e84Var2;
                    yve.p(e84Var3 == null);
                    e84Var4.getClass();
                    if (e84Var4.c(f84Var)) {
                        e84Var = e84Var4;
                    }
                    this.d = e84Var;
                    ((cb3) f84Var).f = 0;
                    Pair pair = this.e;
                    if (pair != null) {
                        e84Var.d(((Long) pair.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    e84 e84Var5 = this.d;
                    g84 g84Var = this.c;
                    g84Var.getClass();
                    e84Var5.f(g84Var);
                }
                break;
            default:
                e84 e84Var6 = this.d;
                if (e84Var6 == null) {
                    e84 e84Var7 = (pw5) e84Var2;
                    yve.p(e84Var6 == null);
                    e84Var7.getClass();
                    if (e84Var7.c(f84Var)) {
                        e84Var = e84Var7;
                    }
                    this.d = e84Var;
                    ((cb3) f84Var).f = 0;
                    Pair pair2 = this.e;
                    if (pair2 != null) {
                        e84Var.d(((Long) pair2.first).longValue(), ((Long) this.e.second).longValue());
                        this.e = null;
                    }
                    e84 e84Var8 = this.d;
                    g84 g84Var2 = this.c;
                    g84Var2.getClass();
                    e84Var8.f(g84Var2);
                }
                break;
        }
        return this.d.b(f84Var, v11Var);
    }

    @Override // e84
    public final boolean c(f84 f84Var) {
        byte b = this.a;
        e84 e84Var = this.f;
        switch (b) {
            case 0:
                if (((wf5) e84Var) != null && boe.a((cb3) f84Var, true)) {
                    return true;
                }
                cb3 cb3Var = (cb3) f84Var;
                cb3Var.f = 0;
                return boe.a(cb3Var, false);
            default:
                pw5 pw5Var = (pw5) e84Var;
                if (pw5Var != null && pw5Var.c(f84Var)) {
                    return true;
                }
                ((cb3) f84Var).f = 0;
                return this.b.c(f84Var);
        }
    }

    @Override // e84
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                e84 e84Var = this.d;
                if (e84Var == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    break;
                } else {
                    e84Var.d(j, j2);
                    break;
                }
            default:
                e84 e84Var2 = this.d;
                if (e84Var2 == null) {
                    this.e = Pair.create(Long.valueOf(j), Long.valueOf(j2));
                    break;
                } else {
                    e84Var2.d(j, j2);
                    break;
                }
        }
    }

    @Override // e84
    public final List e() {
        byte b = this.a;
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override // e84
    public final void f(g84 g84Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        e84 e84Var = this.f;
        switch (b) {
            case 0:
                this.c = g84Var;
                if (((wf5) e84Var) == null) {
                    this.d = lmaVar;
                    lmaVar.f(g84Var);
                    break;
                }
                break;
            default:
                this.c = g84Var;
                if (((pw5) e84Var) == null) {
                    this.d = lmaVar;
                    lmaVar.f(g84Var);
                    break;
                }
                break;
        }
    }

    @Override // e84
    public final void release() {
        byte b = this.a;
        e84 e84Var = this.f;
        switch (b) {
            case 0:
                wf5 wf5Var = (wf5) e84Var;
                if (wf5Var != null) {
                    wf5Var.release();
                    break;
                }
                break;
            default:
                pw5 pw5Var = (pw5) e84Var;
                if (pw5Var != null) {
                    pw5Var.release();
                    break;
                }
                break;
        }
    }
}
