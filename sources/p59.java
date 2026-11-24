// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p59 {
    public static final p59 a;
    public static final p59 b;
    public static final /* synthetic */ p59[] c;

    /* JADX INFO: Fake field, exist only in values array */
    p59 EF0;

    static {
        p59 p59Var = new p59("FULL_BACKGROUND", 0);
        p59 p59Var2 = new p59("SECTION_COLOR_BACKGROUND", 1);
        p59 p59Var3 = new p59("OPTIMIZED_BACKGROUND", 2);
        a = p59Var3;
        p59 p59Var4 = new p59("DRAW_VERTICES", 3);
        b = p59Var4;
        c = new p59[]{p59Var, p59Var2, p59Var3, p59Var4};
    }

    public static p59 valueOf(String str) {
        return (p59) Enum.valueOf(p59.class, str);
    }

    public static p59[] values() {
        return (p59[]) c.clone();
    }
}
