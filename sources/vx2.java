// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vx2 {
    public static final vx2 a;
    public static final /* synthetic */ vx2[] b;

    static {
        vx2 vx2Var = new vx2("COROUTINE_SUSPENDED", 0);
        a = vx2Var;
        b = new vx2[]{vx2Var, new vx2("UNDECIDED", 1), new vx2("RESUMED", 2)};
    }

    public static vx2 valueOf(String str) {
        return (vx2) Enum.valueOf(vx2.class, str);
    }

    public static vx2[] values() {
        return (vx2[]) b.clone();
    }
}
