// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pab implements j74 {
    public final uab a;
    public final fm4 b;
    public final ArrayList c;
    public wxb f;
    public l74 g;
    public in5 h;
    public int i;
    public byte j;
    public long[] k;
    public long l;
    public byte[] e = g8c.b;
    public final xu7 d = new xu7();

    public pab(uab uabVar, fm4 fm4Var) {
        fm4 fm4Var2;
        this.a = uabVar;
        if (fm4Var != null) {
            em4 a = fm4Var.a();
            a.s = ud7.n("application/x-media3-cues");
            a.k = fm4Var.t;
            a.T = uabVar.o();
            fm4Var2 = new fm4(a);
        } else {
            fm4Var2 = null;
        }
        this.b = fm4Var2;
        this.c = new ArrayList();
        this.j = (byte) 0;
        this.k = g8c.c;
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
    
        r1 = new tab(r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008d, code lost:
    
        r17 = r1;
        r1 = new java.util.concurrent.atomic.AtomicLong(-9223372036854775807L);
        r19.a.l(r19.e, 0, r19.i, r17, new kq8(r19, r1, (byte) 22));
        java.util.Collections.sort(r8);
        r19.k = new long[r8.size()];
        r3 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ba, code lost:
    
        if (r3 >= r8.size()) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        r19.k[r3] = ((oab) r8.get(r3)).a;
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
    
        r19.e = g8c.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f7, code lost:
    
        r19.j = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
    
        r1 = tab.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0101, code lost:
    
        throw av7.a("SubtitleParser failed.", r0);
     */
    @Override // j74
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(k74 k74Var, m11 m11Var) {
        int i;
        byte b = this.j;
        gre.p((b == 0 || b == 5) ? false : true);
        byte b2 = this.j;
        if (b2 == 1) {
            int b3 = ((ja3) k74Var).c != -1 ? gle.b(((ja3) k74Var).c) : 1024;
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
            ja3 ja3Var = (ja3) k74Var;
            int read = ja3Var.read(bArr, i2, bArr.length - i2);
            if (read != -1) {
                this.i += read;
            }
            long j = ja3Var.c;
            if (j != -1) {
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        if (this.j == 3) {
            if (((ja3) k74Var).k(((ja3) k74Var).c != -1 ? gle.b(((ja3) k74Var).c) : 1024) == -1) {
                long j2 = this.l;
                for (int f = j2 == -9223372036854775807L ? i : g8c.f(this.k, j2, true); f < arrayList.size(); f++) {
                    g((oab) arrayList.get(f));
                }
                this.j = (byte) 4;
            }
        }
        if (this.j == 4) {
            return -1;
        }
        return i;
    }

    @Override // j74
    public final boolean c(k74 k74Var) {
        return true;
    }

    @Override // j74
    public final void d(long j, long j2) {
        byte b = this.j;
        byte b2 = 1;
        gre.p((b == 0 || b == 5) ? false : true);
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

    @Override // j74
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override // j74
    public final void f(l74 l74Var) {
        gre.p(this.j == 0);
        this.g = l74Var;
        wxb T = l74Var.T(0, 3);
        this.f = T;
        fm4 fm4Var = this.b;
        if (fm4Var != null) {
            T.g(fm4Var);
            l74Var.B();
            in5 in5Var = new in5(-9223372036854775807L, new long[]{0}, new long[]{0});
            this.h = in5Var;
            l74Var.f0(in5Var);
        }
        this.j = (byte) 1;
    }

    public final void g(oab oabVar) {
        this.f.getClass();
        byte[] bArr = oabVar.b;
        int length = bArr.length;
        int length2 = bArr.length;
        xu7 xu7Var = this.d;
        xu7Var.L(length2, bArr);
        this.f.e(length, xu7Var);
        this.f.a(oabVar.a, 1, length, 0, null);
    }

    @Override // j74
    public final void release() {
        if (this.j == 5) {
            return;
        }
        this.a.reset();
        this.j = (byte) 5;
    }

    @Override // j74
    public final j74 a() {
        return this;
    }
}
