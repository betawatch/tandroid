package pd;

import v7.g7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i {
    public static final /* synthetic */ i[] a;

    static {
        i[] iVarArr = {new i("PUBLIC", 0), new i("PROTECTED", 1), new i("INTERNAL", 2), new i("PRIVATE", 3)};
        a = iVarArr;
        g7.a(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) a.clone();
    }
}
