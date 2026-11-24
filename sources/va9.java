// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class va9 {
    public static final va9 a;
    public static final va9 b;
    public static final va9 c;
    public static final va9 d;
    public static final va9 e;
    public static final va9 f;
    public static final /* synthetic */ va9[] h;

    /* JADX INFO: Fake field, exist only in values array */
    va9 EF0;

    static {
        va9 va9Var = new va9("OTHER", 0);
        va9 va9Var2 = new va9("ORIENTATION", 1);
        va9 va9Var3 = new va9("BYTE_SEGMENTS", 2);
        a = va9Var3;
        va9 va9Var4 = new va9("ERROR_CORRECTION_LEVEL", 3);
        b = va9Var4;
        va9 va9Var5 = new va9("ERRORS_CORRECTED", 4);
        c = va9Var5;
        va9 va9Var6 = new va9("ERASURES_CORRECTED", 5);
        va9 va9Var7 = new va9("ISSUE_NUMBER", 6);
        va9 va9Var8 = new va9("SUGGESTED_PRICE", 7);
        va9 va9Var9 = new va9("POSSIBLE_COUNTRY", 8);
        va9 va9Var10 = new va9("UPC_EAN_EXTENSION", 9);
        va9 va9Var11 = new va9("PDF417_EXTRA_METADATA", 10);
        va9 va9Var12 = new va9("STRUCTURED_APPEND_SEQUENCE", 11);
        d = va9Var12;
        va9 va9Var13 = new va9("STRUCTURED_APPEND_PARITY", 12);
        e = va9Var13;
        va9 va9Var14 = new va9("SYMBOLOGY_IDENTIFIER", 13);
        f = va9Var14;
        h = new va9[]{va9Var, va9Var2, va9Var3, va9Var4, va9Var5, va9Var6, va9Var7, va9Var8, va9Var9, va9Var10, va9Var11, va9Var12, va9Var13, va9Var14};
    }

    public static va9 valueOf(String str) {
        return (va9) Enum.valueOf(va9.class, str);
    }

    public static va9[] values() {
        return (va9[]) h.clone();
    }
}
