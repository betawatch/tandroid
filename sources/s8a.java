// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s8a {
    public static final s8a a;
    public static final s8a b;
    public static final /* synthetic */ s8a[] c;

    static {
        s8a s8aVar = new s8a("CRASHLYTICS", 0);
        a = s8aVar;
        s8a s8aVar2 = new s8a("PERFORMANCE", 1);
        b = s8aVar2;
        c = new s8a[]{s8aVar, s8aVar2, new s8a("MATT_SAYS_HI", 2)};
    }

    public static s8a valueOf(String str) {
        return (s8a) Enum.valueOf(s8a.class, str);
    }

    public static s8a[] values() {
        return (s8a[]) c.clone();
    }
}
