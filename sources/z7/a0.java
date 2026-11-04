package z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 {
    public static final a0 a;
    public static final /* synthetic */ a0[] b;

    static {
        a0 a0Var = new a0("DEFAULT", 0);
        a = a0Var;
        b = new a0[]{a0Var, new a0("SIGNED", 1), new a0("FIXED", 2)};
    }

    public static a0[] values() {
        return (a0[]) b.clone();
    }
}
