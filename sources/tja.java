// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tja {
    public static final tja a;
    public static final tja b;
    public static final /* synthetic */ tja[] c;

    static {
        tja tjaVar = new tja("GLASS", 0);
        a = tjaVar;
        tja tjaVar2 = new tja("ACCENT", 1);
        b = tjaVar2;
        c = new tja[]{tjaVar, tjaVar2};
    }

    public static tja valueOf(String str) {
        return (tja) Enum.valueOf(tja.class, str);
    }

    public static tja[] values() {
        return (tja[]) c.clone();
    }
}
