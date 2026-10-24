package qh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final /* synthetic */ b[] e;

    static {
        b bVar = new b("STATE_FULLY_HIDDEN", 0);
        a = bVar;
        b bVar2 = new b("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = bVar2;
        b bVar3 = new b("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = bVar3;
        b bVar4 = new b("STATE_FULLY_VISIBLE", 3);
        d = bVar4;
        e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
