// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zf0 {
    public static final zf0 a;
    public static final zf0 b;
    public static final zf0 c;
    public static final zf0 d;
    public static final /* synthetic */ zf0[] e;

    static {
        zf0 zf0Var = new zf0("AZTEC", 0);
        a = zf0Var;
        zf0 zf0Var2 = new zf0("CODABAR", 1);
        zf0 zf0Var3 = new zf0("CODE_39", 2);
        zf0 zf0Var4 = new zf0("CODE_93", 3);
        zf0 zf0Var5 = new zf0("CODE_128", 4);
        b = zf0Var5;
        zf0 zf0Var6 = new zf0("DATA_MATRIX", 5);
        zf0 zf0Var7 = new zf0("EAN_8", 6);
        zf0 zf0Var8 = new zf0("EAN_13", 7);
        zf0 zf0Var9 = new zf0("ITF", 8);
        zf0 zf0Var10 = new zf0("MAXICODE", 9);
        zf0 zf0Var11 = new zf0("PDF_417", 10);
        c = zf0Var11;
        zf0 zf0Var12 = new zf0("QR_CODE", 11);
        d = zf0Var12;
        e = new zf0[]{zf0Var, zf0Var2, zf0Var3, zf0Var4, zf0Var5, zf0Var6, zf0Var7, zf0Var8, zf0Var9, zf0Var10, zf0Var11, zf0Var12, new zf0("RSS_14", 12), new zf0("RSS_EXPANDED", 13), new zf0("UPC_A", 14), new zf0("UPC_E", 15), new zf0("UPC_EAN_EXTENSION", 16)};
    }

    public static zf0 valueOf(String str) {
        return (zf0) Enum.valueOf(zf0.class, str);
    }

    public static zf0[] values() {
        return (zf0[]) e.clone();
    }
}
