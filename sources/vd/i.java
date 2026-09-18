package vd;

import w7.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class i {
    public static final /* synthetic */ i[] a;

    static {
        i[] iVarArr = {new i("PUBLIC", 0), new i("PROTECTED", 1), new i("INTERNAL", 2), new i("PRIVATE", 3)};
        a = iVarArr;
        n.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) a.clone();
    }
}
