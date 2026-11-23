package p4;

import a8.ma;
import android.util.SparseBooleanArray;
import h9.s1;
import java.util.HashSet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class t {
    public static final k1 e;
    public static final e2.y0 f;
    public final k1 a;
    public final e2.y0 b;
    public final h9.i0 c;
    public final h9.i0 d;

    static {
        HashSet hashSet = new HashSet();
        s1 s1Var = j1.d;
        for (int i7 = 0; i7 < s1Var.d; i7++) {
            hashSet.add(new j1(((Integer) s1Var.get(i7)).intValue()));
        }
        e = new k1(hashSet);
        HashSet hashSet2 = new HashSet();
        s1 s1Var2 = j1.e;
        for (int i10 = 0; i10 < s1Var2.d; i10++) {
            hashSet2.add(new j1(((Integer) s1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < s1Var.d; i11++) {
            hashSet2.add(new j1(((Integer) s1Var.get(i11)).intValue()));
        }
        new k1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : e2.x0.b) {
            ma.p(!false);
            sparseBooleanArray.append(i12, true);
        }
        ma.p(!false);
        f = new e2.y0(new e2.s(sparseBooleanArray));
    }

    public t(k1 k1Var, e2.y0 y0Var, h9.i0 i0Var, h9.i0 i0Var2) {
        this.a = k1Var;
        this.b = y0Var;
        this.c = i0Var;
        this.d = i0Var2;
    }
}
