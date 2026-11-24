// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vc9 {
    public static final vc9 a;
    public static final vc9 b;
    public static final vc9 c;
    public static final vc9 d;
    public static final vc9 e;
    public static final vc9 f;
    public static final /* synthetic */ vc9[] h;

    /* JADX INFO: Fake field, exist only in values array */
    vc9 EF0;

    static {
        vc9 vc9Var = new vc9("OTHER", 0);
        vc9 vc9Var2 = new vc9("ORIENTATION", 1);
        vc9 vc9Var3 = new vc9("BYTE_SEGMENTS", 2);
        a = vc9Var3;
        vc9 vc9Var4 = new vc9("ERROR_CORRECTION_LEVEL", 3);
        b = vc9Var4;
        vc9 vc9Var5 = new vc9("ERRORS_CORRECTED", 4);
        c = vc9Var5;
        vc9 vc9Var6 = new vc9("ERASURES_CORRECTED", 5);
        vc9 vc9Var7 = new vc9("ISSUE_NUMBER", 6);
        vc9 vc9Var8 = new vc9("SUGGESTED_PRICE", 7);
        vc9 vc9Var9 = new vc9("POSSIBLE_COUNTRY", 8);
        vc9 vc9Var10 = new vc9("UPC_EAN_EXTENSION", 9);
        vc9 vc9Var11 = new vc9("PDF417_EXTRA_METADATA", 10);
        vc9 vc9Var12 = new vc9("STRUCTURED_APPEND_SEQUENCE", 11);
        d = vc9Var12;
        vc9 vc9Var13 = new vc9("STRUCTURED_APPEND_PARITY", 12);
        e = vc9Var13;
        vc9 vc9Var14 = new vc9("SYMBOLOGY_IDENTIFIER", 13);
        f = vc9Var14;
        h = new vc9[]{vc9Var, vc9Var2, vc9Var3, vc9Var4, vc9Var5, vc9Var6, vc9Var7, vc9Var8, vc9Var9, vc9Var10, vc9Var11, vc9Var12, vc9Var13, vc9Var14};
    }

    public static vc9 valueOf(String str) {
        return (vc9) Enum.valueOf(vc9.class, str);
    }

    public static vc9[] values() {
        return (vc9[]) h.clone();
    }
}
