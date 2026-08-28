package w3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import g7.a8;
import h3.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 implements m3.k {
    public final int a;
    public final List b;
    public final d5.y c;
    public final SparseIntArray d;
    public final o0.h e;
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
    public e0 p;
    public int q;
    public int r;

    public b0(int i9, d5.e0 e0Var, o0.h hVar) {
        this.e = hVar;
        this.a = i9;
        if (i9 == 1 || i9 == 2) {
            this.b = Collections.singletonList(e0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(e0Var);
        }
        this.c = new d5.y(new byte[9400], 0);
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
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.put(sparseArray2.keyAt(i10), (e0) sparseArray2.valueAt(i10));
        }
        sparseArray.put(0, new z(new e3(this)));
        this.p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // m3.k
    public final int b(m3.l lVar, m3.n nVar) {
        m3.l lVar2;
        int i9;
        ?? r32;
        int i10;
        long j10;
        boolean z10;
        int i11;
        long j11 = ((m3.h) lVar).c;
        boolean z11 = this.m;
        int i12 = this.a;
        if (z11) {
            long j12 = -9223372036854775807L;
            v vVar = this.i;
            if (j11 != -1 && i12 != 2 && !vVar.d) {
                int i13 = this.r;
                d5.e0 e0Var = vVar.b;
                d5.y yVar = vVar.c;
                if (i13 <= 0) {
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
                    yVar.z(min);
                    hVar.f = 0;
                    hVar.g(yVar.a, 0, min, false);
                    int i14 = yVar.b;
                    int i15 = yVar.c;
                    int i16 = i15 - 188;
                    while (true) {
                        if (i16 < i14) {
                            break;
                        }
                        byte[] bArr = yVar.a;
                        int i17 = -4;
                        int i18 = 0;
                        while (true) {
                            if (i17 > 4) {
                                break;
                            }
                            int i19 = (i17 * 188) + i16;
                            if (i19 < i14 || i19 >= i15 || bArr[i19] != 71) {
                                i18 = 0;
                            } else {
                                i18++;
                                if (i18 == 5) {
                                    long a2 = a8.a(yVar, i16, i13);
                                    if (a2 != -9223372036854775807L) {
                                        j12 = a2;
                                        break;
                                    }
                                }
                            }
                            i17++;
                        }
                        i16--;
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
                    long b10 = e0Var.b(vVar.h) - e0Var.b(j15);
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
                yVar.z(min2);
                hVar2.f = 0;
                hVar2.g(yVar.a, 0, min2, false);
                int i20 = yVar.b;
                int i21 = yVar.c;
                while (true) {
                    if (i20 >= i21) {
                        break;
                    }
                    if (yVar.a[i20] == 71) {
                        long a3 = a8.a(yVar, i20, i13);
                        if (a3 != -9223372036854775807L) {
                            j12 = a3;
                            break;
                        }
                    }
                    i20++;
                }
                vVar.g = j12;
                vVar.e = true;
                return 0;
            }
            if (this.n) {
                i9 = i12;
                j10 = 0;
                z10 = false;
                i11 = 1;
            } else {
                this.n = true;
                long j17 = vVar.i;
                if (j17 != -9223372036854775807L) {
                    d5.e0 e0Var2 = vVar.b;
                    i9 = i12;
                    j10 = 0;
                    z10 = false;
                    i11 = 1;
                    p3.a aVar = new p3.a(new wa.a(14), new a6.a(this.r, e0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.j = aVar;
                    this.k.y(aVar.a);
                } else {
                    i9 = i12;
                    j10 = 0;
                    z10 = false;
                    i11 = 1;
                    this.k.y(new m3.o(j17));
                }
            }
            if (this.o) {
                this.o = z10;
                g(j10, j10);
                if (((m3.h) lVar).d != j10) {
                    nVar.a = j10;
                    return i11;
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
            i9 = i12;
            r32 = 0;
        }
        d5.y yVar2 = this.c;
        byte[] bArr2 = yVar2.a;
        if (9400 - yVar2.b < 188) {
            int a10 = yVar2.a();
            if (a10 > 0) {
                System.arraycopy(bArr2, yVar2.b, bArr2, r32, a10);
            }
            yVar2.A(a10, bArr2);
        }
        while (yVar2.a() < 188) {
            int i22 = yVar2.c;
            int read = ((m3.h) lVar2).read(bArr2, i22, 9400 - i22);
            if (read == -1) {
                return -1;
            }
            yVar2.B(i22 + read);
        }
        int i23 = yVar2.b;
        int i24 = yVar2.c;
        byte[] bArr3 = yVar2.a;
        int i25 = i23;
        while (i25 < i24 && bArr3[i25] != 71) {
            i25++;
        }
        yVar2.C(i25);
        int i26 = i25 + 188;
        if (i26 > i24) {
            int i27 = (i25 - i23) + this.q;
            this.q = i27;
            i10 = i9;
            if (i10 == 2 && i27 > 376) {
                throw t1.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i10 = i9;
            this.q = r32;
        }
        int i28 = yVar2.c;
        if (i26 > i28) {
            return r32;
        }
        int e10 = yVar2.e();
        if ((8388608 & e10) != 0) {
            yVar2.C(i26);
            return r32;
        }
        int i29 = (4194304 & e10) != 0 ? 1 : 0;
        int i30 = (2096896 & e10) >> 8;
        boolean z12 = (e10 & 32) != 0;
        e0 e0Var3 = (e10 & 16) != 0 ? (e0) this.f.get(i30) : null;
        if (e0Var3 == null) {
            yVar2.C(i26);
            return r32;
        }
        if (i10 != 2) {
            int i31 = e10 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i32 = sparseIntArray.get(i30, i31 - 1);
            sparseIntArray.put(i30, i31);
            if (i32 == i31) {
                yVar2.C(i26);
                return r32;
            }
            if (i31 != ((i32 + 1) & 15)) {
                e0Var3.h();
            }
        }
        if (z12) {
            int r10 = yVar2.r();
            i29 |= (yVar2.r() & 64) != 0 ? 2 : 0;
            yVar2.D(r10 - 1);
        }
        boolean z13 = this.m;
        if (i10 == 2 || z13 || !this.h.get(i30, r32)) {
            yVar2.B(i26);
            e0Var3.a(i29, yVar2);
            yVar2.B(i28);
        }
        if (i10 != 2 && !z13 && this.m && j11 != -1) {
            this.o = true;
        }
        yVar2.C(i26);
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
        int i9 = 0;
        while (i9 < 188) {
            for (int i10 = 0; i10 < 5; i10++) {
                if (bArr[(i10 * 188) + i9] != 71) {
                    break;
                }
            }
            hVar.u(i9);
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
        for (int i9 = 0; i9 < size; i9++) {
            d5.e0 e0Var = (d5.e0) list.get(i9);
            boolean z10 = e0Var.d() == -9223372036854775807L;
            if (!z10) {
                long c10 = e0Var.c();
                z10 = (c10 == -9223372036854775807L || c10 == 0 || c10 == j11) ? false : true;
            }
            if (z10) {
                e0Var.e(j11);
            }
        }
        if (j11 != 0 && (aVar = this.j) != null) {
            aVar.d(j11);
        }
        this.c.z(0);
        this.d.clear();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i10 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((e0) sparseArray.valueAt(i10)).h();
                i10++;
            }
        }
    }

    @Override // m3.k
    public final void release() {
    }
}
