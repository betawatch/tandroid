// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zf7 extends vg0 implements Handler.Callback {
    public final z3f K;
    public final n64 L;
    public final Handler M;
    public final wf7 N;
    public yye O;
    public boolean P;
    public boolean Q;
    public long R;
    public uf7 S;
    public long T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf7(n64 n64Var, Looper looper) {
        super(5);
        Handler handler;
        z3f z3fVar = z3f.d;
        this.L = n64Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = gcc.a;
            handler = new Handler(looper, this);
        }
        this.M = handler;
        this.K = z3fVar;
        this.N = new wf7();
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
        r2 = gcc.a;
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
    
        r11.S = new uf7(L(r15.e), (sf7[]) r2.toArray(new sf7[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r2 != (-5)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r15 = (ko4) r1.c;
        r15.getClass();
        r11.R = r15.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        if (r7 >= (r2 - 1000000)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        if (r2 == (-3)) goto L20;
     */
    @Override // vg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.P && this.S == null) {
                wf7 wf7Var = this.N;
                wf7Var.clear();
                ym4 ym4Var = this.c;
                ym4Var.t();
                int A = A(ym4Var, wf7Var, 5);
                if (A != -3 || wf7Var.isEndOfStream()) {
                    if (A == -4) {
                        if (!wf7Var.isEndOfStream()) {
                        }
                        long j3 = this.I;
                        long j4 = j - this.w;
                        if (j3 != -9223372036854775807L) {
                        }
                    }
                }
            }
            uf7 uf7Var = this.S;
            if (uf7Var == null || uf7Var.b > L(j)) {
                z = false;
            } else {
                uf7 uf7Var2 = this.S;
                Handler handler = this.M;
                if (handler != null) {
                    handler.obtainMessage(1, uf7Var2).sendToTarget();
                } else {
                    M(uf7Var2);
                }
                this.S = null;
                z = true;
            }
            if (this.P && this.S == null) {
                this.Q = true;
            }
        }
    }

    @Override // vg0
    public final int G(ko4 ko4Var) {
        if (this.K.o(ko4Var)) {
            return qu6.a(ko4Var.X == 0 ? 4 : 2, 0, 0, 0);
        }
        return qu6.a(0, 0, 0, 0);
    }

    public final void K(uf7 uf7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            sf7[] sf7VarArr = uf7Var.a;
            if (i >= sf7VarArr.length) {
                return;
            }
            ko4 a = sf7VarArr[i].a();
            if (a != null) {
                z3f z3fVar = this.K;
                if (z3fVar.o(a)) {
                    yye k = z3fVar.k(a);
                    byte[] c = sf7VarArr[i].c();
                    c.getClass();
                    wf7 wf7Var = this.N;
                    wf7Var.clear();
                    wf7Var.c(c.length);
                    ByteBuffer byteBuffer = wf7Var.c;
                    String str = gcc.a;
                    byteBuffer.put(c);
                    wf7Var.d();
                    uf7 a2 = k.a(wf7Var);
                    if (a2 != null) {
                        K(a2, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(sf7VarArr[i]);
            i++;
        }
    }

    public final long L(long j) {
        yve.p(j != -9223372036854775807L);
        yve.p(this.T != -9223372036854775807L);
        return j - this.T;
    }

    public final void M(uf7 uf7Var) {
        n64 n64Var = this.L;
        s64 s64Var = n64Var.a;
        nt6 nt6Var = s64Var.o0;
        e86 e86Var = s64Var.m;
        lt6 a = nt6Var.a();
        int i = 0;
        while (true) {
            sf7[] sf7VarArr = uf7Var.a;
            if (i >= sf7VarArr.length) {
                break;
            }
            sf7VarArr[i].b(a);
            i++;
        }
        s64Var.o0 = new nt6(a);
        nt6 S0 = s64Var.S0();
        if (!S0.equals(s64Var.Q)) {
            s64Var.Q = S0;
            e86Var.c(14, new lu3(n64Var, (byte) 11));
        }
        e86Var.c(28, new lu3(uf7Var, (byte) 12));
        e86Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((uf7) message.obj);
            return true;
        }
        grb.g();
        return false;
    }

    @Override // vg0
    public final String l() {
        return "MetadataRenderer";
    }

    @Override // vg0
    public final boolean n() {
        return this.Q;
    }

    @Override // vg0
    public final boolean o() {
        return true;
    }

    @Override // vg0
    public final void q() {
        this.S = null;
        this.O = null;
        this.T = -9223372036854775807L;
    }

    @Override // vg0
    public final void s(long j, boolean z, boolean z2) {
        this.S = null;
        this.P = false;
        this.Q = false;
    }

    @Override // vg0
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        this.O = this.K.k(ko4VarArr[0]);
        uf7 uf7Var = this.S;
        if (uf7Var != null) {
            long j3 = uf7Var.b;
            long j4 = (this.T + j3) - j2;
            if (j3 != j4) {
                uf7Var = new uf7(j4, uf7Var.a);
            }
            this.S = uf7Var;
        }
        this.T = j2;
    }
}
