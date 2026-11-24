// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sq2 {
    public static final sq2 a;
    public static final /* synthetic */ sq2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    sq2 EF0;

    static {
        sq2 sq2Var = new sq2("NOT_SET", 0);
        sq2 sq2Var2 = new sq2("EVENT_OVERRIDE", 1);
        a = sq2Var2;
        b = new sq2[]{sq2Var, sq2Var2};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, sq2Var);
        sparseArray.put(5, sq2Var2);
    }

    public static sq2 valueOf(String str) {
        return (sq2) Enum.valueOf(sq2.class, str);
    }

    public static sq2[] values() {
        return (sq2[]) b.clone();
    }
}
