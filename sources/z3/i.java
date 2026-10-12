package z3;

import b2.w;
import b2.w0;
import b2.x;
import c3.i0;
import c3.p;
import c3.q;
import c3.s;
import c3.y;
import e2.m0;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.b8;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class i implements c3.o {
    public final n a;
    public final x b;
    public final ArrayList c;
    public i0 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = m0.b;
    public final e2.x d = new e2.x();

    public i(n nVar, x xVar) {
        x xVar2;
        this.a = nVar;
        if (xVar != null) {
            w a2 = xVar.a();
            a2.r = w0.n("application/x-media3-cues");
            a2.j = xVar.s;
            a2.P = nVar.h0();
            xVar2 = new x(a2);
        } else {
            xVar2 = null;
        }
        this.b = xVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = m0.c;
        this.j = -9223372036854775807L;
    }

    @Override // c3.o
    public final boolean a(p pVar) {
        return true;
    }

    @Override // c3.o
    public final void c(q qVar) {
        u6.p(this.h == 0);
        i0 a02 = qVar.a0(0, 3);
        this.f = a02;
        x xVar = this.b;
        if (xVar != null) {
            a02.b(xVar);
            qVar.D();
            qVar.K(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override // c3.o
    public final void d(long j10, long j11) {
        int i10 = this.h;
        u6.p((i10 == 0 || i10 == 5) ? false : true);
        this.j = j11;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // c3.o
    public final List e() {
        l0 l0Var = n0.b;
        return x1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new z3.m(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.a.u0(r20.e, 0, r20.g, r2, new rg.b0(r20, 22));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.i[r2] = ((z3.h) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.e = e2.m0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = z3.m.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw b2.x0.a(r0, "SubtitleParser failed.");
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        int i10;
        int i11 = this.h;
        u6.p((i11 == 0 || i11 == 5) ? false : true);
        if (this.h == 1) {
            int b10 = pVar.getLength() != -1 ? b8.b(pVar.getLength()) : 1024;
            if (b10 > this.e.length) {
                this.e = new byte[b10];
            }
            this.g = 0;
            this.h = 2;
        }
        int i12 = this.h;
        ArrayList arrayList = this.c;
        if (i12 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i13 = this.g;
            int read = pVar.read(bArr2, i13, bArr2.length - i13);
            if (read != -1) {
                this.g += read;
            }
            long length = pVar.getLength();
            if (length != -1) {
                i10 = 0;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        if (this.h == 3) {
            if (pVar.skip(pVar.getLength() != -1 ? b8.b(pVar.getLength()) : 1024) == -1) {
                long j10 = this.j;
                for (int f7 = j10 == -9223372036854775807L ? i10 : m0.f(this.i, j10, true); f7 < arrayList.size(); f7++) {
                    g((h) arrayList.get(f7));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i10;
    }

    public final void g(h hVar) {
        this.f.getClass();
        byte[] bArr = hVar.b;
        int length = bArr.length;
        e2.x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f.d(length, xVar);
        this.f.c(hVar.a, 1, length, 0, null);
    }

    @Override // c3.o
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // c3.o
    public final c3.o b() {
        return this;
    }
}
