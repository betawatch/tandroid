// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sf7 extends uh0 implements Handler.Callback {
    public final k1f K;
    public final c74 L;
    public final Handler M;
    public final pf7 N;
    public iwe O;
    public boolean P;
    public boolean Q;
    public long R;
    public nf7 S;
    public long T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf7(c74 c74Var, Looper looper) {
        super(5);
        Handler handler;
        k1f k1fVar = k1f.d;
        this.L = c74Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = hac.a;
            handler = new Handler(looper, this);
        }
        this.M = handler;
        this.K = k1fVar;
        this.N = new pf7();
        this.T = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r12 < (r15.e - 1000000)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        r2 = A(r1, r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r2 != (-4)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r15.isEndOfStream() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r11.P = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r15.e < r11.x) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r15.r = r11.R;
        r15.d();
        r1 = r11.O;
        r2 = hac.a;
        r1 = r1.a(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r1 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        r2 = new java.util.ArrayList(r1.a.length);
        K(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (r2.isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        r11.S = new nf7(L(r15.e), (lf7[]) r2.toArray(new lf7[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r2 != (-5)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r15 = (go4) r1.c;
        r15.getClass();
        r11.R = r15.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        if (r7 >= (r2 - 1000000)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        if (r2 == (-3)) goto L20;
     */
    @Override // uh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.P && this.S == null) {
                pf7 pf7Var = this.N;
                pf7Var.clear();
                mj4 mj4Var = this.c;
                mj4Var.i();
                int A = A(mj4Var, pf7Var, 5);
                if (A != -3 || pf7Var.isEndOfStream()) {
                    if (A == -4) {
                        if (!pf7Var.isEndOfStream()) {
                        }
                        long j3 = this.I;
                        long j4 = j - this.w;
                        if (j3 != -9223372036854775807L) {
                        }
                    }
                }
            }
            nf7 nf7Var = this.S;
            if (nf7Var == null || nf7Var.b > L(j)) {
                z = false;
            } else {
                nf7 nf7Var2 = this.S;
                Handler handler = this.M;
                if (handler != null) {
                    handler.obtainMessage(1, nf7Var2).sendToTarget();
                } else {
                    M(nf7Var2);
                }
                this.S = null;
                z = true;
            }
            if (this.P && this.S == null) {
                this.Q = true;
            }
        }
    }

    @Override // uh0
    public final int G(go4 go4Var) {
        if (this.K.n(go4Var)) {
            return kt6.a(go4Var.X == 0 ? 4 : 2, 0, 0, 0);
        }
        return kt6.a(0, 0, 0, 0);
    }

    public final void K(nf7 nf7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            lf7[] lf7VarArr = nf7Var.a;
            if (i >= lf7VarArr.length) {
                return;
            }
            go4 a = lf7VarArr[i].a();
            if (a != null) {
                k1f k1fVar = this.K;
                if (k1fVar.n(a)) {
                    iwe l = k1fVar.l(a);
                    byte[] c = lf7VarArr[i].c();
                    c.getClass();
                    pf7 pf7Var = this.N;
                    pf7Var.clear();
                    pf7Var.c(c.length);
                    ByteBuffer byteBuffer = pf7Var.c;
                    String str = hac.a;
                    byteBuffer.put(c);
                    pf7Var.d();
                    nf7 a2 = l.a(pf7Var);
                    if (a2 != null) {
                        K(a2, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(lf7VarArr[i]);
            i++;
        }
    }

    public final long L(long j) {
        jte.p(j != -9223372036854775807L);
        jte.p(this.T != -9223372036854775807L);
        return j - this.T;
    }

    public final void M(nf7 nf7Var) {
        c74 c74Var = this.L;
        h74 h74Var = c74Var.a;
        jt6 jt6Var = h74Var.o0;
        a86 a86Var = h74Var.m;
        ht6 a = jt6Var.a();
        int i = 0;
        while (true) {
            lf7[] lf7VarArr = nf7Var.a;
            if (i >= lf7VarArr.length) {
                break;
            }
            lf7VarArr[i].b(a);
            i++;
        }
        h74Var.o0 = new jt6(a);
        jt6 S0 = h74Var.S0();
        if (!S0.equals(h74Var.Q)) {
            h74Var.Q = S0;
            a86Var.c(14, new yu3(c74Var, (byte) 12));
        }
        a86Var.c(28, new yu3(nf7Var, (byte) 13));
        a86Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((nf7) message.obj);
            return true;
        }
        rjb.h();
        return false;
    }

    @Override // uh0
    public final String l() {
        return "MetadataRenderer";
    }

    @Override // uh0
    public final boolean n() {
        return this.Q;
    }

    @Override // uh0
    public final boolean o() {
        return true;
    }

    @Override // uh0
    public final void q() {
        this.S = null;
        this.O = null;
        this.T = -9223372036854775807L;
    }

    @Override // uh0
    public final void s(long j, boolean z, boolean z2) {
        this.S = null;
        this.P = false;
        this.Q = false;
    }

    @Override // uh0
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        this.O = this.K.l(go4VarArr[0]);
        nf7 nf7Var = this.S;
        if (nf7Var != null) {
            long j3 = nf7Var.b;
            long j4 = (this.T + j3) - j2;
            if (j3 != j4) {
                nf7Var = new nf7(j4, nf7Var.a);
            }
            this.S = nf7Var;
        }
        this.T = j2;
    }
}
