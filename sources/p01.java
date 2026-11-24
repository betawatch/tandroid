// default package

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class p01 implements akc {
    public Object a = s01.p;
    public na1 b;
    public final /* synthetic */ q01 c;

    public p01(q01 q01Var) {
        this.c = q01Var;
    }

    @Override // akc
    public final void a(nv9 nv9Var, int i) {
        na1 na1Var = this.b;
        if (na1Var != null) {
            na1Var.a(nv9Var, i);
        }
    }

    public final Object b(jk4 jk4Var) {
        hj1 hj1Var;
        hj1 hj1Var2;
        Object obj = this.a;
        boolean z = true;
        if (obj == s01.p || obj == s01.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q01.f;
            q01 q01Var = this.c;
            hj1 hj1Var3 = (hj1) atomicReferenceFieldUpdater.get(q01Var);
            while (true) {
                if (q01Var.s()) {
                    this.a = s01.l;
                    Throwable k = q01Var.k();
                    if (k != null) {
                        int i = oma.a;
                        throw k;
                    }
                    z = false;
                } else {
                    long andIncrement = q01.c.getAndIncrement(q01Var);
                    long j = s01.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (hj1Var3.d != j2) {
                        hj1 h = q01Var.h(j2, hj1Var3);
                        if (h != null) {
                            hj1Var = h;
                        } else {
                            continue;
                        }
                    } else {
                        hj1Var = hj1Var3;
                    }
                    Object C = q01Var.C(hj1Var, i2, andIncrement, null);
                    lo5 lo5Var = s01.m;
                    if (C == lo5Var) {
                        sc8.j("unreachable");
                        return null;
                    }
                    lo5 lo5Var2 = s01.o;
                    if (C == lo5Var2) {
                        if (andIncrement < q01Var.o()) {
                            hj1Var.b();
                        }
                        hj1Var3 = hj1Var;
                    } else {
                        if (C == s01.n) {
                            na1 a = iqd.a(dle.a(jk4Var));
                            try {
                                this.b = a;
                                Object C2 = q01Var.C(hj1Var, i2, andIncrement, this);
                                if (C2 == lo5Var) {
                                    a(hj1Var, i2);
                                } else {
                                    if (C2 == lo5Var2) {
                                        if (andIncrement < q01Var.o()) {
                                            hj1Var.b();
                                        }
                                        hj1 hj1Var4 = (hj1) q01.f.get(q01Var);
                                        while (true) {
                                            if (q01Var.s()) {
                                                na1 na1Var = this.b;
                                                na1Var.getClass();
                                                this.b = null;
                                                this.a = s01.l;
                                                Throwable k2 = q01Var.k();
                                                if (k2 == null) {
                                                    na1Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    na1Var.resumeWith(new sa9(k2));
                                                }
                                            } else {
                                                long andIncrement2 = q01.c.getAndIncrement(q01Var);
                                                long j3 = s01.b;
                                                long j4 = andIncrement2 / j3;
                                                int i3 = (int) (andIncrement2 % j3);
                                                if (hj1Var4.d != j4) {
                                                    hj1 h2 = q01Var.h(j4, hj1Var4);
                                                    if (h2 != null) {
                                                        hj1Var2 = h2;
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    hj1Var2 = hj1Var4;
                                                }
                                                C2 = q01Var.C(hj1Var2, i3, andIncrement2, this);
                                                hj1 hj1Var5 = hj1Var2;
                                                if (C2 == s01.m) {
                                                    a(hj1Var5, i3);
                                                    break;
                                                }
                                                if (C2 == s01.o) {
                                                    if (andIncrement2 < q01Var.o()) {
                                                        hj1Var5.b();
                                                    }
                                                    hj1Var4 = hj1Var5;
                                                } else {
                                                    if (C2 == s01.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    hj1Var5.b();
                                                }
                                            }
                                        }
                                    } else {
                                        hj1Var.b();
                                    }
                                    this.a = C2;
                                    this.b = null;
                                    a.A(Boolean.TRUE, null);
                                }
                                return a.q();
                            } catch (Throwable th) {
                                a.z();
                                throw th;
                            }
                        }
                        hj1Var.b();
                        this.a = C;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
