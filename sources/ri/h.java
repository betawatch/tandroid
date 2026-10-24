package ri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class h {
    public static final h a;
    public static final h b;
    public static final /* synthetic */ h[] c;

    static {
        h hVar = new h("DISABLED", 0);
        a = hVar;
        h hVar2 = new h("RNNOISE", 1);
        b = hVar2;
        c = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) c.clone();
    }
}
