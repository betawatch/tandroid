package x2;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b2.p1;
import b2.q1;
import e2.d0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.MediaDataController;
import u2.o1;
import v7.x7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends q1 {
    public static final String A0;
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final i x0 = new i(new h());
    public static final String y0;
    public static final String z0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final SparseArray v0;
    public final SparseBooleanArray w0;

    static {
        String str = d0.a;
        y0 = Integer.toString(MediaDataController.MAX_STYLE_RUNS_COUNT, 36);
        z0 = Integer.toString(1001, 36);
        A0 = Integer.toString(1002, 36);
        B0 = Integer.toString(1003, 36);
        C0 = Integer.toString(1004, 36);
        D0 = Integer.toString(1005, 36);
        E0 = Integer.toString(1006, 36);
        F0 = Integer.toString(1007, 36);
        G0 = Integer.toString(1008, 36);
        H0 = Integer.toString(1009, 36);
        I0 = Integer.toString(1010, 36);
        J0 = Integer.toString(1011, 36);
        K0 = Integer.toString(1012, 36);
        L0 = Integer.toString(1013, 36);
        M0 = Integer.toString(1014, 36);
        N0 = Integer.toString(1015, 36);
        O0 = Integer.toString(1016, 36);
        P0 = Integer.toString(1017, 36);
        Q0 = Integer.toString(1018, 36);
    }

    public i(h hVar) {
        super(hVar);
        this.o0 = hVar.F;
        this.p0 = hVar.G;
        this.q0 = hVar.H;
        this.r0 = hVar.I;
        this.s0 = hVar.J;
        this.t0 = hVar.K;
        this.u0 = hVar.L;
        this.v0 = hVar.M;
        this.w0 = hVar.N;
    }

    @Override // b2.q1
    public final p1 a() {
        return new h(this);
    }

    @Override // b2.q1
    public final Bundle c() {
        Bundle c10 = super.c();
        c10.putBoolean(y0, this.o0);
        c10.putBoolean(z0, false);
        c10.putBoolean(A0, this.p0);
        c10.putBoolean(M0, false);
        c10.putBoolean(B0, this.q0);
        c10.putBoolean(C0, false);
        c10.putBoolean(D0, false);
        c10.putBoolean(E0, false);
        c10.putBoolean(N0, false);
        c10.putBoolean(Q0, this.r0);
        c10.putBoolean(O0, this.s0);
        c10.putBoolean(F0, this.t0);
        c10.putBoolean(G0, false);
        c10.putBoolean(H0, this.u0);
        c10.putBoolean(P0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray2 = this.v0;
            if (i10 >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.w0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                    iArr[i11] = sparseBooleanArray.keyAt(i11);
                }
                c10.putIntArray(L0, iArr);
                return c10;
            }
            int keyAt = sparseArray2.keyAt(i10);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i10)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((o1) entry.getKey());
                arrayList.add(Integer.valueOf(keyAt));
            }
            c10.putIntArray(I0, x7.f(arrayList));
            c10.putParcelableArrayList(J0, e2.d.p(arrayList2, new t0.a(21)));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                a4.a.y(sparseArray.valueAt(0));
                throw null;
            }
            c10.putSparseParcelableArray(K0, sparseArray3);
            i10++;
        }
    }

    @Override // b2.q1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (super.equals(iVar) && this.o0 == iVar.o0 && this.p0 == iVar.p0 && this.q0 == iVar.q0 && this.r0 == iVar.r0 && this.s0 == iVar.s0 && this.t0 == iVar.t0 && this.u0 == iVar.u0) {
                SparseBooleanArray sparseBooleanArray = iVar.w0;
                SparseBooleanArray sparseBooleanArray2 = this.w0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = iVar.v0;
                            SparseArray sparseArray2 = this.v0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i11 = 0; i11 < size2; i11++) {
                                    int indexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i11);
                                        Map map2 = (Map) sparseArray.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                o1 o1Var = (o1) entry.getKey();
                                                if (map2.containsKey(o1Var) && Objects.equals(entry.getValue(), map2.get(o1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i10)) < 0) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // b2.q1
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.o0 ? 1 : 0)) * 961) + (this.p0 ? 1 : 0)) * 961) + (this.q0 ? 1 : 0)) * 28629151) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 961) + (this.u0 ? 1 : 0)) * 31;
    }
}
