// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class z26 {
    public static final z26 a;
    public static final z26 b;
    public static final z26 c;
    public static final z26 d;
    public static final z26 e;
    public static final /* synthetic */ z26[] f;

    static {
        z26 z26Var = new z26("DESTROYED", 0);
        a = z26Var;
        z26 z26Var2 = new z26("INITIALIZED", 1);
        b = z26Var2;
        z26 z26Var3 = new z26("CREATED", 2);
        c = z26Var3;
        z26 z26Var4 = new z26("STARTED", 3);
        d = z26Var4;
        z26 z26Var5 = new z26("RESUMED", 4);
        e = z26Var5;
        f = new z26[]{z26Var, z26Var2, z26Var3, z26Var4, z26Var5};
    }

    public static z26 valueOf(String str) {
        return (z26) Enum.valueOf(z26.class, str);
    }

    public static z26[] values() {
        return (z26[]) f.clone();
    }
}
