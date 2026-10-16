package qi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class j {
    public static final j a;
    public static final j b;
    public static final /* synthetic */ j[] c;

    static {
        j jVar = new j("DISABLED", 0);
        a = jVar;
        j jVar2 = new j("RNNOISE", 1);
        b = jVar2;
        c = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) c.clone();
    }
}
