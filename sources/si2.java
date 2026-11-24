// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class si2 extends syc {
    public final ArrayList l;
    public final znb m;
    public final rq6 n;
    public qi2 o;
    public ri2 p;
    public long q;
    public long r;

    public si2(qx qxVar) {
        super((qg0) qxVar.c);
        this.n = new rq6((qq6) qxVar.d);
        this.l = new ArrayList();
        this.m = new znb();
    }

    @Override // syc
    public final void A(aob aobVar) {
        if (this.p != null) {
            return;
        }
        C(aobVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056 A[LOOP:1: B:33:0x0054->B:34:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(aob aobVar) {
        long j;
        long j2;
        long j3;
        int size;
        int i;
        znb znbVar = this.m;
        aobVar.n(0, znbVar);
        long j4 = znbVar.o;
        ArrayList arrayList = this.l;
        boolean isEmpty = arrayList.isEmpty();
        rq6 rq6Var = this.n;
        long j5 = Long.MIN_VALUE;
        if (isEmpty || this.o == null || rq6Var.e) {
            j = rq6Var.b;
            long j6 = rq6Var.d;
            if (rq6Var.f) {
                long j7 = znbVar.k;
                j += j7;
                if (j6 != Long.MIN_VALUE) {
                    j3 = j7 + j6;
                    j2 = Long.MIN_VALUE;
                    this.q = j4 + j;
                    this.r = j6 != j2 ? j2 : j4 + j3;
                    size = arrayList.size();
                    for (i = 0; i < size; i++) {
                        pi2 pi2Var = (pi2) arrayList.get(i);
                        long j8 = this.q;
                        long j9 = this.r;
                        pi2Var.n = j8;
                        pi2Var.r = j9;
                    }
                    j5 = j3;
                }
            }
            j2 = Long.MIN_VALUE;
            j3 = j6;
            this.q = j4 + j;
            this.r = j6 != j2 ? j2 : j4 + j3;
            size = arrayList.size();
            while (i < size) {
            }
            j5 = j3;
        } else {
            j = this.q - j4;
            long j10 = this.r;
            if (j10 != Long.MIN_VALUE) {
                j5 = j10 - j4;
            }
        }
        try {
            qi2 qi2Var = new qi2(aobVar, j, j5, rq6Var.h);
            this.o = qi2Var;
            n(qi2Var);
        } catch (ri2 e) {
            this.p = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((pi2) arrayList.get(i2)).s = this.p;
            }
        }
    }

    @Override // syc, qg0
    public final boolean a(br6 br6Var) {
        qg0 qg0Var = this.k;
        return qg0Var.a(br6Var) && qg0Var.i().e.equals(br6Var.e);
    }

    @Override // qg0
    public final sr6 c(rx6 rx6Var, mv6 mv6Var, long j) {
        pi2 pi2Var = new pi2(this.k.c(rx6Var, mv6Var, j), !this.n.g, this.q, this.r, 0);
        this.l.add(pi2Var);
        return pi2Var;
    }

    @Override // jq2, qg0
    public final void k() {
        ri2 ri2Var = this.p;
        if (ri2Var != null) {
            throw ri2Var;
        }
        super.k();
    }

    @Override // qg0
    public final void o(sr6 sr6Var) {
        ArrayList arrayList = this.l;
        gre.p(arrayList.remove(sr6Var));
        this.k.o(((pi2) sr6Var).a);
        if (!arrayList.isEmpty() || this.n.e) {
            return;
        }
        qi2 qi2Var = this.o;
        qi2Var.getClass();
        C(qi2Var.e);
    }

    @Override // jq2, qg0
    public final void q() {
        super.q();
        this.p = null;
        this.o = null;
    }
}
