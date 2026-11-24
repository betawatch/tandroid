// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ze0 {
    public static final ze0 a;
    public static final ze0 b;
    public static final ze0 c;
    public static final ze0 d;
    public static final /* synthetic */ ze0[] e;

    static {
        ze0 ze0Var = new ze0("AZTEC", 0);
        a = ze0Var;
        ze0 ze0Var2 = new ze0("CODABAR", 1);
        ze0 ze0Var3 = new ze0("CODE_39", 2);
        ze0 ze0Var4 = new ze0("CODE_93", 3);
        ze0 ze0Var5 = new ze0("CODE_128", 4);
        b = ze0Var5;
        ze0 ze0Var6 = new ze0("DATA_MATRIX", 5);
        ze0 ze0Var7 = new ze0("EAN_8", 6);
        ze0 ze0Var8 = new ze0("EAN_13", 7);
        ze0 ze0Var9 = new ze0("ITF", 8);
        ze0 ze0Var10 = new ze0("MAXICODE", 9);
        ze0 ze0Var11 = new ze0("PDF_417", 10);
        c = ze0Var11;
        ze0 ze0Var12 = new ze0("QR_CODE", 11);
        d = ze0Var12;
        e = new ze0[]{ze0Var, ze0Var2, ze0Var3, ze0Var4, ze0Var5, ze0Var6, ze0Var7, ze0Var8, ze0Var9, ze0Var10, ze0Var11, ze0Var12, new ze0("RSS_14", 12), new ze0("RSS_EXPANDED", 13), new ze0("UPC_A", 14), new ze0("UPC_E", 15), new ze0("UPC_EAN_EXTENSION", 16)};
    }

    public static ze0 valueOf(String str) {
        return (ze0) Enum.valueOf(ze0.class, str);
    }

    public static ze0[] values() {
        return (ze0[]) e.clone();
    }
}
