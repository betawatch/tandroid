// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q6a {
    public static final q6a a;
    public static final q6a b;
    public static final /* synthetic */ q6a[] c;

    static {
        q6a q6aVar = new q6a("CRASHLYTICS", 0);
        a = q6aVar;
        q6a q6aVar2 = new q6a("PERFORMANCE", 1);
        b = q6aVar2;
        c = new q6a[]{q6aVar, q6aVar2, new q6a("MATT_SAYS_HI", 2)};
    }

    public static q6a valueOf(String str) {
        return (q6a) Enum.valueOf(q6a.class, str);
    }

    public static q6a[] values() {
        return (q6a[]) c.clone();
    }
}
