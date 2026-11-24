// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qcb implements s84 {
    public final vcb a;
    public final go4 b;
    public final ArrayList c;
    public yzb f;
    public u84 g;
    public ip5 h;
    public int i;
    public byte j;
    public long[] k;
    public long l;
    public byte[] e = hac.b;
    public final yw7 d = new yw7();

    public qcb(vcb vcbVar, go4 go4Var) {
        go4 go4Var2;
        this.a = vcbVar;
        if (go4Var != null) {
            fo4 a = go4Var.a();
            a.s = wf7.n("application/x-media3-cues");
            a.k = go4Var.t;
            a.T = vcbVar.r();
            go4Var2 = new go4(a);
        } else {
            go4Var2 = null;
        }
        this.b = go4Var2;
        this.c = new ArrayList();
        this.j = (byte) 0;
        this.k = hac.c;
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r19.i != r13) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r1 == (-1)) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        r3 = r19.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r3 == (-9223372036854775807L)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        r1 = new ucb(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        r17 = r1;
        r1 = new java.util.concurrent.atomic.AtomicLong(-9223372036854775807L);
        r19.a.p(r19.e, 0, r19.i, r17, new xr8(r19, r1, (byte) 23));
        java.util.Collections.sort(r8);
        r19.k = new long[r8.size()];
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
    
        if (r3 >= r8.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        r19.k[r3] = ((pcb) r8.get(r3)).a;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        if (r1.get() == (-9223372036854775807L)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        r3 = r19.f;
        r3.getClass();
        r3.d(r1.get());
        r3 = r19.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e1, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e3, code lost:
    
        r3.c = r1.get();
        r1 = r19.g;
        r1.getClass();
        r1.f0(r19.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f3, code lost:
    
        r19.e = hac.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        r19.j = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
    
        r1 = ucb.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        throw bx7.a("SubtitleParser failed.", r0);
     */
    @Override // s84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(t84 t84Var, u21 u21Var) {
        int i;
        byte b = this.j;
        jte.p((b == 0 || b == 5) ? false : true);
        byte b2 = this.j;
        if (b2 == 1) {
            int b3 = ((vb3) t84Var).c != -1 ? ine.b(((vb3) t84Var).c) : 1024;
            if (b3 > this.e.length) {
                this.e = new byte[b3];
            }
            this.i = 0;
            this.j = (byte) 2;
            b2 = 2;
        }
        ArrayList arrayList = this.c;
        if (b2 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.i) {
                bArr = Arrays.copyOf(bArr, bArr.length + 1024);
                this.e = bArr;
            }
            int i2 = this.i;
            vb3 vb3Var = (vb3) t84Var;
            int read = vb3Var.read(bArr, i2, bArr.length - i2);
            if (read != -1) {
                this.i += read;
            }
            long j = vb3Var.c;
            if (j != -1) {
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (this.j == 3) {
            if (((vb3) t84Var).l(((vb3) t84Var).c != -1 ? ine.b(((vb3) t84Var).c) : 1024) == -1) {
                long j2 = this.l;
                for (int f = j2 == -9223372036854775807L ? i : hac.f(this.k, j2, true); f < arrayList.size(); f++) {
                    g((pcb) arrayList.get(f));
                }
                this.j = (byte) 4;
            }
        }
        if (this.j == 4) {
            return -1;
        }
        return i;
    }

    @Override // s84
    public final boolean c(t84 t84Var) {
        return true;
    }

    @Override // s84
    public final void d(long j, long j2) {
        byte b = this.j;
        byte b2 = 1;
        jte.p((b == 0 || b == 5) ? false : true);
        this.l = j2;
        byte b3 = this.j;
        if (b3 == 2) {
            this.j = (byte) 1;
        } else {
            b2 = b3;
        }
        if (b2 == 4) {
            this.j = (byte) 3;
        }
    }

    @Override // s84
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override // s84
    public final void f(u84 u84Var) {
        jte.p(this.j == 0);
        this.g = u84Var;
        yzb c0 = u84Var.c0(0, 3);
        this.f = c0;
        go4 go4Var = this.b;
        if (go4Var != null) {
            c0.g(go4Var);
            u84Var.B();
            ip5 ip5Var = new ip5(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = ip5Var;
            u84Var.f0(ip5Var);
        }
        this.j = (byte) 1;
    }

    public final void g(pcb pcbVar) {
        this.f.getClass();
        byte[] bArr = pcbVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        yw7 yw7Var = this.d;
        yw7Var.L(length2, bArr);
        this.f.e(length, yw7Var);
        this.f.a(pcbVar.a, 1, length, 0, null);
    }

    @Override // s84
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.a.reset();
        this.j = (byte) 5;
    }

    @Override // s84
    public final s84 a() {
        return this;
    }
}
