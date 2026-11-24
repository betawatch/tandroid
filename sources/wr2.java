// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wr2 implements s6a {
    public final y79 a;
    public long b;

    public wr2(List list, List list2) {
        jo5 p = mo5.p();
        jte.f(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            p.c(new vr2((s6a) list.get(i), (List) list2.get(i)));
        }
        this.a = p.f();
        this.b = -9223372036854775807L;
    }

    @Override // s6a
    public final boolean f() {
        int i = 0;
        while (true) {
            y79 y79Var = this.a;
            if (i >= y79Var.d) {
                return false;
            }
            if (((vr2) y79Var.get(i)).a.f()) {
                return true;
            }
            i++;
        }
    }

    @Override // s6a
    public final long g() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            y79 y79Var = this.a;
            if (i >= y79Var.d) {
                break;
            }
            long g = ((vr2) y79Var.get(i)).a.g();
            if (g != Long.MIN_VALUE) {
                j = Math.min(j, g);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // s6a
    public final boolean r(sa6 sa6Var) {
        boolean z;
        boolean z2 = false;
        do {
            long g = g();
            if (g == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                y79 y79Var = this.a;
                if (i >= y79Var.d) {
                    break;
                }
                long g2 = ((vr2) y79Var.get(i)).a.g();
                boolean z3 = g2 != Long.MIN_VALUE && g2 <= sa6Var.a;
                if (g2 == g || z3) {
                    z |= ((vr2) y79Var.get(i)).a.r(sa6Var);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // s6a
    public final long s() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            y79 y79Var = this.a;
            if (i >= y79Var.d) {
                break;
            }
            vr2 vr2Var = (vr2) y79Var.get(i);
            long s = vr2Var.a.s();
            mo5 mo5Var = vr2Var.b;
            if ((mo5Var.contains(1) || mo5Var.contains(2) || mo5Var.contains(4)) && s != Long.MIN_VALUE) {
                j = Math.min(j, s);
            }
            if (s != Long.MIN_VALUE) {
                j2 = Math.min(j2, s);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != -9223372036854775807L ? j3 : j2;
    }

    @Override // s6a
    public final void t(long j) {
        int i = 0;
        while (true) {
            y79 y79Var = this.a;
            if (i >= y79Var.d) {
                return;
            }
            ((vr2) y79Var.get(i)).t(j);
            i++;
        }
    }
}
