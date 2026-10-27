package y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
