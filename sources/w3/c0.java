package w3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import h3.t1;
import h7.z7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c0 implements m3.k {
    public final int a;
    public final List b;
    public final d5.z c;
    public final SparseIntArray d;
    public final o0.i e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final v i;
    public p3.a j;
    public m3.m k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public f0 p;
    public int q;
    public int r;

    public c0(int i10, d5.f0 f0Var, o0.i iVar) {
        this.e = iVar;
        this.a = i10;
        if (i10 == 1 || i10 == 2) {
            this.b = Collections.singletonList(f0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(f0Var);
        }
        this.c = new d5.z(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new v(1);
        this.k = m3.m.t;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (f0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new z(new b0(this)));
        this.p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        m3.l lVar2;
        int i10;
        ?? r32;
        int i11;
        long j10;
        boolean z10;
        int i12;
        long j11 = ((m3.h) lVar).c;
        boolean z11 = this.m;
        int i13 = this.a;
        if (z11) {
            long j12 = -9223372036854775807L;
            v vVar = this.i;
            if (j11 != -1 && i13 != 2 && !vVar.d) {
                int i14 = this.r;
                d5.f0 f0Var = vVar.b;
                d5.z zVar = vVar.c;
                if (i14 <= 0) {
                    vVar.a(lVar);
                    return 0;
                }
                if (!vVar.f) {
                    m3.h hVar = (m3.h) lVar;
                    long j13 = hVar.c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (hVar.d != j14) {
                        nVar.a = j14;
                        return 1;
                    }
                    zVar.z(min);
                    hVar.f = 0;
                    hVar.g(zVar.a, 0, min, false);
                    int i15 = zVar.b;
                    int i16 = zVar.c;
                    int i17 = i16 - 188;
                    while (true) {
                        if (i17 < i15) {
                            break;
                        }
                        byte[] bArr = zVar.a;
                        int i18 = -4;
                        int i19 = 0;
                        while (true) {
                            if (i18 > 4) {
                                break;
                            }
                            int i20 = (i18 * 188) + i17;
                            if (i20 < i15 || i20 >= i16 || bArr[i20] != 71) {
                                i19 = 0;
                            } else {
                                i19++;
                                if (i19 == 5) {
                                    long a2 = z7.a(zVar, i17, i14);
                                    if (a2 != -9223372036854775807L) {
                                        j12 = a2;
                                        break;
                                    }
                                }
                            }
                            i18++;
                        }
                        i17--;
                    }
                    vVar.h = j12;
                    vVar.f = true;
                    return 0;
                }
                if (vVar.h == -9223372036854775807L) {
                    vVar.a(lVar);
                    return 0;
                }
                if (vVar.e) {
                    long j15 = vVar.g;
                    if (j15 == -9223372036854775807L) {
                        vVar.a(lVar);
                        return 0;
                    }
                    long b10 = f0Var.b(vVar.h) - f0Var.b(j15);
                    vVar.i = b10;
                    if (b10 < 0) {
                        d5.a.K("TsDurationReader", "Invalid duration: " + vVar.i + ". Using TIME_UNSET instead.");
                        vVar.i = -9223372036854775807L;
                    }
                    vVar.a(lVar);
                    return 0;
                }
                m3.h hVar2 = (m3.h) lVar;
                int min2 = (int) Math.min(112800, hVar2.c);
                long j16 = 0;
                if (hVar2.d != j16) {
                    nVar.a = j16;
                    return 1;
                }
                zVar.z(min2);
                hVar2.f = 0;
                hVar2.g(zVar.a, 0, min2, false);
                int i21 = zVar.b;
                int i22 = zVar.c;
                while (true) {
                    if (i21 >= i22) {
                        break;
                    }
                    if (zVar.a[i21] == 71) {
                        long a3 = z7.a(zVar, i21, i14);
                        if (a3 != -9223372036854775807L) {
                            j12 = a3;
                            break;
                        }
                    }
                    i21++;
                }
                vVar.g = j12;
                vVar.e = true;
                return 0;
            }
            if (this.n) {
                i10 = i13;
                j10 = 0;
                z10 = false;
                i12 = 1;
            } else {
                this.n = true;
                long j17 = vVar.i;
                if (j17 != -9223372036854775807L) {
                    d5.f0 f0Var2 = vVar.b;
                    i10 = i13;
                    j10 = 0;
                    z10 = false;
                    i12 = 1;
                    p3.a aVar = new p3.a(new e7.v(14), new b6.a(this.r, f0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.j = aVar;
                    this.k.n(aVar.a);
                } else {
                    i10 = i13;
                    j10 = 0;
                    z10 = false;
                    i12 = 1;
                    this.k.n(new m3.o(j17));
                }
            }
            if (this.o) {
                this.o = z10;
                g(j10, j10);
                if (((m3.h) lVar).d != j10) {
                    nVar.a = j10;
                    return i12;
                }
            }
            p3.a aVar2 = this.j;
            if (aVar2 != null && aVar2.c != null) {
                return aVar2.b(lVar, nVar);
            }
            lVar2 = lVar;
            r32 = z10;
        } else {
            lVar2 = lVar;
            i10 = i13;
            r32 = 0;
        }
        d5.z zVar2 = this.c;
        byte[] bArr2 = zVar2.a;
        if (9400 - zVar2.b < 188) {
            int a10 = zVar2.a();
            if (a10 > 0) {
                System.arraycopy(bArr2, zVar2.b, bArr2, r32, a10);
            }
            zVar2.A(a10, bArr2);
        }
        while (zVar2.a() < 188) {
            int i23 = zVar2.c;
            int read = ((m3.h) lVar2).read(bArr2, i23, 9400 - i23);
            if (read == -1) {
                return -1;
            }
            zVar2.B(i23 + read);
        }
        int i24 = zVar2.b;
        int i25 = zVar2.c;
        byte[] bArr3 = zVar2.a;
        int i26 = i24;
        while (i26 < i25 && bArr3[i26] != 71) {
            i26++;
        }
        zVar2.C(i26);
        int i27 = i26 + 188;
        if (i27 > i25) {
            int i28 = (i26 - i24) + this.q;
            this.q = i28;
            i11 = i10;
            if (i11 == 2 && i28 > 376) {
                throw t1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            this.q = r32;
        }
        int i29 = zVar2.c;
        if (i27 > i29) {
            return r32;
        }
        int e9 = zVar2.e();
        if ((8388608 & e9) != 0) {
            zVar2.C(i27);
            return r32;
        }
        int i30 = (4194304 & e9) != 0 ? 1 : 0;
        int i31 = (2096896 & e9) >> 8;
        boolean z12 = (e9 & 32) != 0;
        f0 f0Var3 = (e9 & 16) != 0 ? (f0) this.f.get(i31) : null;
        if (f0Var3 == null) {
            zVar2.C(i27);
            return r32;
        }
        if (i11 != 2) {
            int i32 = e9 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i33 = sparseIntArray.get(i31, i32 - 1);
            sparseIntArray.put(i31, i32);
            if (i33 == i32) {
                zVar2.C(i27);
                return r32;
            }
            if (i32 != ((i33 + 1) & 15)) {
                f0Var3.c();
            }
        }
        if (z12) {
            int r10 = zVar2.r();
            i30 |= (zVar2.r() & 64) != 0 ? 2 : 0;
            zVar2.D(r10 - 1);
        }
        boolean z13 = this.m;
        if (i11 == 2 || z13 || !this.h.get(i31, r32)) {
            zVar2.B(i27);
            f0Var3.b(i30, zVar2);
            zVar2.B(i29);
        }
        if (i11 != 2 && !z13 && this.m && j11 != -1) {
            this.o = true;
        }
        zVar2.C(i27);
        return r32;
    }

    @Override // m3.k
    public final void c(m3.m mVar) {
        this.k = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // m3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(m3.l lVar) {
        byte[] bArr = this.c.a;
        m3.h hVar = (m3.h) lVar;
        hVar.g(bArr, 0, 940, false);
        int i10 = 0;
        while (i10 < 188) {
            for (int i11 = 0; i11 < 5; i11++) {
                if (bArr[(i11 * 188) + i10] != 71) {
                    break;
                }
            }
            hVar.t(i10);
            return true;
        }
        return false;
    }

    @Override // m3.k
    public final void g(long j10, long j11) {
        p3.a aVar;
        d5.a.i(this.a != 2);
        List list = this.b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d5.f0 f0Var = (d5.f0) list.get(i10);
            boolean z10 = f0Var.d() == -9223372036854775807L;
            if (!z10) {
                long c10 = f0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                f0Var.e(j11);
            }
        }
        if (j11 != 0 && (aVar = this.j) != null) {
            aVar.d(j11);
        }
        this.c.z(0);
        this.d.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i11 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((f0) sparseArray.valueAt(i11)).c();
                i11++;
            }
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
