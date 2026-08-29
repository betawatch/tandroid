package y3;

import ag.j2;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import i7.s8;
import j3.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b0 implements o3.k {
    public final int a;
    public final List b;
    public final f5.w c;
    public final SparseIntArray d;
    public final o0.i e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final v i;
    public r3.a j;
    public o3.m k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public e0 p;
    public int q;
    public int r;

    public b0(int i10, f5.c0 c0Var, o0.i iVar) {
        this.e = iVar;
        this.a = i10;
        if (i10 == 1 || i10 == 2) {
            this.b = Collections.singletonList(c0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(c0Var);
        }
        this.c = new f5.w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new v(1);
        this.k = o3.m.u;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            sparseArray.put(sparseArray2.keyAt(i11), (e0) sparseArray2.valueAt(i11));
        }
        sparseArray.put(0, new z(new v5.n(this)));
        this.p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    @Override // o3.k
    public final int d(o3.l lVar, o3.n nVar) {
        o3.l lVar2;
        int i10;
        ?? r32;
        int i11;
        long j10;
        boolean z10;
        int i12;
        long j11 = ((o3.h) lVar).c;
        boolean z11 = this.m;
        int i13 = this.a;
        if (z11) {
            long j12 = -9223372036854775807L;
            v vVar = this.i;
            if (j11 != -1 && i13 != 2 && !vVar.d) {
                int i14 = this.r;
                f5.c0 c0Var = vVar.b;
                f5.w wVar = vVar.c;
                if (i14 <= 0) {
                    vVar.a(lVar);
                    return 0;
                }
                if (!vVar.f) {
                    o3.h hVar = (o3.h) lVar;
                    long j13 = hVar.c;
                    int min = (int) Math.min(112800, j13);
                    long j14 = j13 - min;
                    if (hVar.d != j14) {
                        nVar.a = j14;
                        return 1;
                    }
                    wVar.z(min);
                    hVar.f = 0;
                    hVar.f(wVar.a, 0, min, false);
                    int i15 = wVar.b;
                    int i16 = wVar.c;
                    int i17 = i16 - 188;
                    while (true) {
                        if (i17 < i15) {
                            break;
                        }
                        byte[] bArr = wVar.a;
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
                                    long a2 = s8.a(wVar, i17, i14);
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
                    long b10 = c0Var.b(vVar.h) - c0Var.b(j15);
                    vVar.i = b10;
                    if (b10 < 0) {
                        f5.a.K("TsDurationReader", "Invalid duration: " + vVar.i + ". Using TIME_UNSET instead.");
                        vVar.i = -9223372036854775807L;
                    }
                    vVar.a(lVar);
                    return 0;
                }
                o3.h hVar2 = (o3.h) lVar;
                int min2 = (int) Math.min(112800, hVar2.c);
                long j16 = 0;
                if (hVar2.d != j16) {
                    nVar.a = j16;
                    return 1;
                }
                wVar.z(min2);
                hVar2.f = 0;
                hVar2.f(wVar.a, 0, min2, false);
                int i21 = wVar.b;
                int i22 = wVar.c;
                while (true) {
                    if (i21 >= i22) {
                        break;
                    }
                    if (wVar.a[i21] == 71) {
                        long a10 = s8.a(wVar, i21, i14);
                        if (a10 != -9223372036854775807L) {
                            j12 = a10;
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
                    f5.c0 c0Var2 = vVar.b;
                    i10 = i13;
                    j10 = 0;
                    z10 = false;
                    i12 = 1;
                    r3.a aVar = new r3.a(new x9.d(15), new j2(this.r, c0Var2), j17, j17 + 1, 0L, j11, 188L, 940);
                    this.j = aVar;
                    this.k.D1(aVar.a);
                } else {
                    i10 = i13;
                    j10 = 0;
                    z10 = false;
                    i12 = 1;
                    this.k.D1(new o3.o(j17));
                }
            }
            if (this.o) {
                this.o = z10;
                f(j10, j10);
                if (((o3.h) lVar).d != j10) {
                    nVar.a = j10;
                    return i12;
                }
            }
            r3.a aVar2 = this.j;
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
        f5.w wVar2 = this.c;
        byte[] bArr2 = wVar2.a;
        if (9400 - wVar2.b < 188) {
            int a11 = wVar2.a();
            if (a11 > 0) {
                System.arraycopy(bArr2, wVar2.b, bArr2, r32, a11);
            }
            wVar2.A(a11, bArr2);
        }
        while (wVar2.a() < 188) {
            int i23 = wVar2.c;
            int read = ((o3.h) lVar2).read(bArr2, i23, 9400 - i23);
            if (read == -1) {
                return -1;
            }
            wVar2.B(i23 + read);
        }
        int i24 = wVar2.b;
        int i25 = wVar2.c;
        byte[] bArr3 = wVar2.a;
        int i26 = i24;
        while (i26 < i25 && bArr3[i26] != 71) {
            i26++;
        }
        wVar2.C(i26);
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
        int i29 = wVar2.c;
        if (i27 > i29) {
            return r32;
        }
        int e10 = wVar2.e();
        if ((8388608 & e10) != 0) {
            wVar2.C(i27);
            return r32;
        }
        int i30 = (4194304 & e10) != 0 ? 1 : 0;
        int i31 = (2096896 & e10) >> 8;
        boolean z12 = (e10 & 32) != 0;
        e0 e0Var = (e10 & 16) != 0 ? (e0) this.f.get(i31) : null;
        if (e0Var == null) {
            wVar2.C(i27);
            return r32;
        }
        if (i11 != 2) {
            int i32 = e10 & 15;
            SparseIntArray sparseIntArray = this.d;
            int i33 = sparseIntArray.get(i31, i32 - 1);
            sparseIntArray.put(i31, i32);
            if (i33 == i32) {
                wVar2.C(i27);
                return r32;
            }
            if (i32 != ((i33 + 1) & 15)) {
                e0Var.a();
            }
        }
        if (z12) {
            int r6 = wVar2.r();
            i30 |= (wVar2.r() & 64) != 0 ? 2 : 0;
            wVar2.D(r6 - 1);
        }
        boolean z13 = this.m;
        if (i11 == 2 || z13 || !this.h.get(i31, r32)) {
            wVar2.B(i27);
            e0Var.c(i30, wVar2);
            wVar2.B(i29);
        }
        if (i11 != 2 && !z13 && this.m && j11 != -1) {
            this.o = true;
        }
        wVar2.C(i27);
        return r32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // o3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(o3.l lVar) {
        byte[] bArr = this.c.a;
        o3.h hVar = (o3.h) lVar;
        hVar.f(bArr, 0, 940, false);
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

    @Override // o3.k
    public final void f(long j10, long j11) {
        r3.a aVar;
        f5.a.i(this.a != 2);
        List list = this.b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f5.c0 c0Var = (f5.c0) list.get(i10);
            boolean z10 = c0Var.d() == -9223372036854775807L;
            if (!z10) {
                long c3 = c0Var.c();
                z10 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j11) ? false : true;
            }
            if (z10) {
                c0Var.e(j11);
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
                ((e0) sparseArray.valueAt(i11)).a();
                i11++;
            }
        }
    }

    @Override // o3.k
    public final void i(o3.m mVar) {
        this.k = mVar;
    }

    @Override // o3.k
    public final void release() {
    }
}
