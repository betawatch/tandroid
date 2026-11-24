// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yj2 {
    public static final yj2 a;
    public static final /* synthetic */ yj2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yj2 EF0;

    static {
        yj2 yj2Var = new yj2("UNKNOWN", 0);
        yj2 yj2Var2 = new yj2("ANDROID_FIREBASE", 1);
        a = yj2Var2;
        b = new yj2[]{yj2Var, yj2Var2};
    }

    public static yj2 valueOf(String str) {
        return (yj2) Enum.valueOf(yj2.class, str);
    }

    public static yj2[] values() {
        return (yj2[]) b.clone();
    }
}
