package p4;

import a8.ja;
import android.util.SparseBooleanArray;
import h9.s1;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t {
    public static final j1 e;
    public static final e2.y0 f;
    public final j1 a;
    public final e2.y0 b;
    public final h9.i0 c;
    public final h9.i0 d;

    static {
        HashSet hashSet = new HashSet();
        s1 s1Var = i1.d;
        for (int i7 = 0; i7 < s1Var.d; i7++) {
            hashSet.add(new i1(((Integer) s1Var.get(i7)).intValue()));
        }
        e = new j1(hashSet);
        HashSet hashSet2 = new HashSet();
        s1 s1Var2 = i1.e;
        for (int i10 = 0; i10 < s1Var2.d; i10++) {
            hashSet2.add(new i1(((Integer) s1Var2.get(i10)).intValue()));
        }
        for (int i11 = 0; i11 < s1Var.d; i11++) {
            hashSet2.add(new i1(((Integer) s1Var.get(i11)).intValue()));
        }
        new j1(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i12 : e2.x0.b) {
            ja.p(!false);
            sparseBooleanArray.append(i12, true);
        }
        ja.p(!false);
        f = new e2.y0(new e2.s(sparseBooleanArray));
    }

    public t(j1 j1Var, e2.y0 y0Var, h9.i0 i0Var, h9.i0 i0Var2) {
        this.a = j1Var;
        this.b = y0Var;
        this.c = i0Var;
        this.d = i0Var2;
    }
}
