// default package

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ub3 {
    public static final k40 h = new k40((byte) 2);
    public static final Random i = new Random();
    public qr6 d;
    public String f;
    public final znb a = new znb();
    public final xnb b = new xnb();
    public final HashMap c = new HashMap();
    public aob e = aob.a;
    public long g = -1;

    public final void a(tb3 tb3Var) {
        long j = tb3Var.c;
        if (j != -1 && tb3Var.e) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(tj tjVar) {
        qr6 qr6Var;
        String str = this.f;
        if (str != null) {
            tb3 tb3Var = (tb3) this.c.get(str);
            tb3Var.getClass();
            a(tb3Var);
        }
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            tb3 tb3Var2 = (tb3) it.next();
            it.remove();
            if (tb3Var2.e && (qr6Var = this.d) != null) {
                qr6Var.p(tjVar, tb3Var2.a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r12 == (-1)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tb3 c(int i2, rx6 rx6Var) {
        long j;
        long j2;
        long j3;
        HashMap hashMap = this.c;
        tb3 tb3Var = null;
        long j4 = Long.MAX_VALUE;
        for (tb3 tb3Var2 : hashMap.values()) {
            long j5 = tb3Var2.c;
            rx6 rx6Var2 = tb3Var2.d;
            if (j5 == -1 && i2 == tb3Var2.b && rx6Var != null) {
                long j6 = rx6Var.d;
                ub3 ub3Var = tb3Var2.g;
                j = -1;
                tb3 tb3Var3 = (tb3) ub3Var.c.get(ub3Var.f);
                if (tb3Var3 != null) {
                    j3 = tb3Var3.c;
                }
                j3 = ub3Var.g + 1;
                if (j6 >= j3) {
                    tb3Var2.c = j6;
                }
            } else {
                j = -1;
            }
            if (rx6Var != null) {
                long j7 = rx6Var.d;
                if (j7 != j) {
                    if (rx6Var2 == null) {
                        if (!rx6Var.c() && j7 == tb3Var2.c) {
                            j2 = tb3Var2.c;
                            if (j2 == j || j2 < j4) {
                                tb3Var = tb3Var2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = g8c.a;
                                if (tb3Var.d != null && rx6Var2 != null) {
                                    tb3Var = tb3Var2;
                                }
                            }
                        }
                    } else if (j7 == rx6Var2.d && rx6Var.b == rx6Var2.b && rx6Var.c == rx6Var2.c) {
                        j2 = tb3Var2.c;
                        if (j2 == j) {
                        }
                        tb3Var = tb3Var2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == tb3Var2.b) {
                j2 = tb3Var2.c;
                if (j2 == j) {
                }
                tb3Var = tb3Var2;
                j4 = j2;
            }
        }
        if (tb3Var != null) {
            return tb3Var;
        }
        String str2 = (String) h.get();
        tb3 tb3Var4 = new tb3(this, str2, i2, rx6Var);
        hashMap.put(str2, tb3Var4);
        return tb3Var4;
    }

    public final synchronized String d(aob aobVar, rx6 rx6Var) {
        return c(aobVar.g(rx6Var.a, this.b).c, rx6Var).a;
    }

    public final void e(tj tjVar) {
        rx6 rx6Var;
        aob aobVar = tjVar.b;
        int i2 = tjVar.c;
        rx6 rx6Var2 = tjVar.d;
        boolean p = aobVar.p();
        String str = this.f;
        HashMap hashMap = this.c;
        if (p) {
            if (str != null) {
                tb3 tb3Var = (tb3) hashMap.get(str);
                tb3Var.getClass();
                a(tb3Var);
                return;
            }
            return;
        }
        tb3 tb3Var2 = (tb3) hashMap.get(str);
        this.f = c(i2, rx6Var2).a;
        f(tjVar);
        if (rx6Var2 != null) {
            long j = rx6Var2.d;
            if (rx6Var2.c()) {
                if (tb3Var2 != null && tb3Var2.c == j && (rx6Var = tb3Var2.d) != null && rx6Var.b == rx6Var2.b && rx6Var.c == rx6Var2.c) {
                    return;
                }
                c(i2, new rx6(rx6Var2.a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void f(tj tjVar) {
        long j;
        this.d.getClass();
        if (tjVar.b.p()) {
            return;
        }
        rx6 rx6Var = tjVar.d;
        if (rx6Var != null) {
            long j2 = rx6Var.d;
            if (j2 != -1) {
                tb3 tb3Var = (tb3) this.c.get(this.f);
                if (tb3Var != null) {
                    j = tb3Var.c;
                }
                j = this.g + 1;
                if (j2 < j) {
                    return;
                }
            }
            tb3 tb3Var2 = (tb3) this.c.get(this.f);
            if (tb3Var2 != null && tb3Var2.c == -1 && tb3Var2.b != tjVar.c) {
                return;
            }
        }
        tb3 c = c(tjVar.c, tjVar.d);
        if (this.f == null) {
            this.f = c.a;
        }
        rx6 rx6Var2 = tjVar.d;
        if (rx6Var2 != null && rx6Var2.c()) {
            rx6 rx6Var3 = tjVar.d;
            tb3 c2 = c(tjVar.c, new rx6(rx6Var3.a, rx6Var3.d, rx6Var3.b));
            if (!c2.e) {
                c2.e = true;
                tjVar.b.g(tjVar.d.a, this.b);
                this.b.d(tjVar.d.b);
                String str = g8c.a;
                this.d.getClass();
            }
        }
        if (!c.e) {
            c.e = true;
            this.d.getClass();
        }
        if (c.a.equals(this.f) && !c.f) {
            c.f = true;
            this.d.o(tjVar, c.a);
        }
    }

    public final synchronized void g(tj tjVar, int i2) {
        this.d.getClass();
        boolean z = i2 == 0;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            tb3 tb3Var = (tb3) it.next();
            if (tb3Var.a(tjVar)) {
                it.remove();
                boolean equals = tb3Var.a.equals(this.f);
                if (equals) {
                    a(tb3Var);
                }
                if (tb3Var.e) {
                    if (z && equals) {
                        boolean z2 = tb3Var.f;
                    }
                    this.d.p(tjVar, tb3Var.a);
                }
            }
        }
        e(tjVar);
    }
}
