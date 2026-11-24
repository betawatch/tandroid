// default package

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class qd7 extends ug0 implements Handler.Callback {
    public final ize K;
    public final t54 L;
    public final Handler M;
    public final nd7 N;
    public fue O;
    public boolean P;
    public boolean Q;
    public long R;
    public ld7 S;
    public long T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd7(t54 t54Var, Looper looper) {
        super(5);
        Handler handler;
        ize izeVar = ize.d;
        this.L = t54Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = g8c.a;
            handler = new Handler(looper, this);
        }
        this.M = handler;
        this.K = izeVar;
        this.N = new nd7();
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
        r2 = g8c.a;
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
    
        r11.S = new ld7(L(r15.e), (jd7[]) r2.toArray(new jd7[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (r2 != (-5)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r15 = (fm4) r1.c;
        r15.getClass();
        r11.R = r15.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
    
        if (r7 >= (r2 - 1000000)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        if (r2 == (-3)) goto L20;
     */
    @Override // ug0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.P && this.S == null) {
                nd7 nd7Var = this.N;
                nd7Var.clear();
                sk4 sk4Var = this.c;
                sk4Var.m();
                int A = A(sk4Var, nd7Var, 5);
                if (A != -3 || nd7Var.isEndOfStream()) {
                    if (A == -4) {
                        if (!nd7Var.isEndOfStream()) {
                        }
                        long j3 = this.I;
                        long j4 = j - this.w;
                        if (j3 != -9223372036854775807L) {
                        }
                    }
                }
            }
            ld7 ld7Var = this.S;
            if (ld7Var == null || ld7Var.b > L(j)) {
                z = false;
            } else {
                ld7 ld7Var2 = this.S;
                Handler handler = this.M;
                if (handler != null) {
                    handler.obtainMessage(1, ld7Var2).sendToTarget();
                } else {
                    M(ld7Var2);
                }
                this.S = null;
                z = true;
            }
            if (this.P && this.S == null) {
                this.Q = true;
            }
        }
    }

    @Override // ug0
    public final int G(fm4 fm4Var) {
        if (this.K.j(fm4Var)) {
            return ls6.a(fm4Var.X == 0 ? 4 : 2, 0, 0, 0);
        }
        return ls6.a(0, 0, 0, 0);
    }

    public final void K(ld7 ld7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            jd7[] jd7VarArr = ld7Var.a;
            if (i >= jd7VarArr.length) {
                return;
            }
            fm4 a = jd7VarArr[i].a();
            if (a != null) {
                ize izeVar = this.K;
                if (izeVar.j(a)) {
                    fue g = izeVar.g(a);
                    byte[] c = jd7VarArr[i].c();
                    c.getClass();
                    nd7 nd7Var = this.N;
                    nd7Var.clear();
                    nd7Var.c(c.length);
                    ByteBuffer byteBuffer = nd7Var.c;
                    String str = g8c.a;
                    byteBuffer.put(c);
                    nd7Var.d();
                    ld7 a2 = g.a(nd7Var);
                    if (a2 != null) {
                        K(a2, arrayList);
                    }
                    i++;
                }
            }
            arrayList.add(jd7VarArr[i]);
            i++;
        }
    }

    public final long L(long j) {
        gre.p(j != -9223372036854775807L);
        gre.p(this.T != -9223372036854775807L);
        return j - this.T;
    }

    public final void M(ld7 ld7Var) {
        t54 t54Var = this.L;
        y54 y54Var = t54Var.a;
        jr6 jr6Var = y54Var.o0;
        a66 a66Var = y54Var.m;
        hr6 a = jr6Var.a();
        int i = 0;
        while (true) {
            jd7[] jd7VarArr = ld7Var.a;
            if (i >= jd7VarArr.length) {
                break;
            }
            jd7VarArr[i].b(a);
            i++;
        }
        y54Var.o0 = new jr6(a);
        jr6 S0 = y54Var.S0();
        if (!S0.equals(y54Var.Q)) {
            y54Var.Q = S0;
            a66Var.c(14, new kx3(t54Var, (byte) 9));
        }
        a66Var.c(28, new kx3(ld7Var, (byte) 10));
        a66Var.b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((ld7) message.obj);
            return true;
        }
        sdb.a();
        return false;
    }

    @Override // ug0
    public final String l() {
        return "MetadataRenderer";
    }

    @Override // ug0
    public final boolean n() {
        return this.Q;
    }

    @Override // ug0
    public final boolean o() {
        return true;
    }

    @Override // ug0
    public final void q() {
        this.S = null;
        this.O = null;
        this.T = -9223372036854775807L;
    }

    @Override // ug0
    public final void s(long j, boolean z, boolean z2) {
        this.S = null;
        this.P = false;
        this.Q = false;
    }

    @Override // ug0
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        this.O = this.K.g(fm4VarArr[0]);
        ld7 ld7Var = this.S;
        if (ld7Var != null) {
            long j3 = ld7Var.b;
            long j4 = (this.T + j3) - j2;
            if (j3 != j4) {
                ld7Var = new ld7(j4, ld7Var.a);
            }
            this.S = ld7Var;
        }
        this.T = j2;
    }
}
