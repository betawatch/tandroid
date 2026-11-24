// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sja {
    public static final sja a;
    public static final sja b;
    public static final /* synthetic */ sja[] c;

    static {
        sja sjaVar = new sja("ICON", 0);
        a = sjaVar;
        sja sjaVar2 = new sja("TEXT", 1);
        b = sjaVar2;
        c = new sja[]{sjaVar, sjaVar2};
    }

    public static sja valueOf(String str) {
        return (sja) Enum.valueOf(sja.class, str);
    }

    public static sja[] values() {
        return (sja[]) c.clone();
    }
}
