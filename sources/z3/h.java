package z3;

import b2.r;
import b2.r0;
import b2.s;
import c3.h0;
import c3.p;
import c3.q;
import c3.y;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import v7.x7;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class h implements c3.o {
    public final m a;
    public final s b;
    public final ArrayList c;
    public h0 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = d0.b;
    public final v d = new v();

    public h(m mVar, s sVar) {
        s sVar2;
        this.a = mVar;
        if (sVar != null) {
            r a2 = sVar.a();
            a2.q = r0.n("application/x-media3-cues");
            a2.j = sVar.r;
            a2.O = mVar.U();
            sVar2 = new s(a2);
        } else {
            sVar2 = null;
        }
        this.b = sVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = d0.c;
        this.j = -9223372036854775807L;
    }

    public final void a(g gVar) {
        e2.d.h(this.f);
        byte[] bArr = gVar.b;
        int length = bArr.length;
        v vVar = this.d;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
        this.f.d(length, vVar);
        this.f.c(gVar.a, 1, length, 0, null);
    }

    @Override // c3.o
    public final boolean b(p pVar) {
        return true;
    }

    @Override // c3.o
    public final void g(q qVar) {
        e2.d.g(this.h == 0);
        h0 R1 = qVar.R1(0, 3);
        this.f = R1;
        s sVar = this.b;
        if (sVar != null) {
            R1.b(sVar);
            qVar.Z0();
            qVar.P1(new y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override // c3.o
    public final void h(long j3, long j10) {
        int i10 = this.h;
        e2.d.g((i10 == 0 || i10 == 5) ? false : true);
        this.j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // c3.o
    public final List i() {
        g0 g0Var = i0.b;
        return a1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        r2 = new z3.l(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0090, code lost:
    
        r20.a.e0(r20.e, 0, r20.g, r2, new ah.m(r20, 10));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.i[r2] = ((z3.g) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.e = e2.d0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008d, code lost:
    
        r2 = z3.l.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw b2.s0.a(r0, "SubtitleParser failed.");
     */
    @Override // c3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(p pVar, c3.s sVar) {
        int i10;
        int i11 = this.h;
        e2.d.g((i11 == 0 || i11 == 5) ? false : true);
        if (this.h == 1) {
            int b10 = pVar.getLength() != -1 ? x7.b(pVar.getLength()) : 1024;
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
            if (pVar.skip(pVar.getLength() != -1 ? x7.b(pVar.getLength()) : 1024) == -1) {
                long j3 = this.j;
                for (int e7 = j3 == -9223372036854775807L ? 0 : d0.e(this.i, j3, true); e7 < arrayList.size(); e7++) {
                    a((g) arrayList.get(e7));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i10;
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
    public final c3.o c() {
        return this;
    }
}
