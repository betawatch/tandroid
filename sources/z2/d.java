package z2;

import android.content.Context;
import h7.u;
import o4.n0;
import s5.m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d implements a3.b, n0 {
    public final Object a;

    public /* synthetic */ d(Object obj) {
        this.a = obj;
    }

    @Override // o4.n0
    public boolean b() {
        for (n0 n0Var : (n0[]) this.a) {
            if (n0Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // o4.n0
    public long e() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.a) {
            long e6 = n0Var.e();
            if (e6 != Long.MIN_VALUE) {
                j10 = Math.min(j10, e6);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // rc.a
    public Object get() {
        return new m((Context) ((a3.c) this.a).a, new z9.d(7), new u(7), 13);
    }

    @Override // o4.n0
    public boolean m(long j10) {
        boolean z4;
        boolean z10 = false;
        do {
            long e6 = e();
            if (e6 == Long.MIN_VALUE) {
                return z10;
            }
            z4 = false;
            for (n0 n0Var : (n0[]) this.a) {
                long e10 = n0Var.e();
                boolean z11 = e10 != Long.MIN_VALUE && e10 <= j10;
                if (e10 == e6 || z11) {
                    z4 |= n0Var.m(j10);
                }
            }
            z10 |= z4;
        } while (z4);
        return z10;
    }

    @Override // o4.n0
    public long r() {
        long j10 = Long.MAX_VALUE;
        for (n0 n0Var : (n0[]) this.a) {
            long r10 = n0Var.r();
            if (r10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, r10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // o4.n0
    public void t(long j10) {
        for (n0 n0Var : (n0[]) this.a) {
            n0Var.t(j10);
        }
    }
}
