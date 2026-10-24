package ri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class j {
    public static final j a;
    public static final j b;
    public static final j c;
    public static final /* synthetic */ j[] d;

    static {
        j jVar = new j("REBUILT", 0);
        a = jVar;
        j jVar2 = new j("CANCELLED", 1);
        b = jVar2;
        j jVar3 = new j("ERROR", 2);
        c = jVar3;
        d = new j[]{jVar, jVar2, jVar3};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
