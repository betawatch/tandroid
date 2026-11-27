// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
