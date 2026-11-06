package vi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class f {
    public static final f a;
    public static final f b;
    public static final /* synthetic */ f[] c;

    static {
        f fVar = new f("DISABLED", 0);
        a = fVar;
        f fVar2 = new f("RNNOISE", 1);
        b = fVar2;
        c = new f[]{fVar, fVar2};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) c.clone();
    }
}
