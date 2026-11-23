package vd;

import c8.n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class i {
    public static final /* synthetic */ i[] a;

    static {
        i[] iVarArr = {new i("PUBLIC", 0), new i("PROTECTED", 1), new i("INTERNAL", 2), new i("PRIVATE", 3)};
        a = iVarArr;
        n1.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) a.clone();
    }
}
