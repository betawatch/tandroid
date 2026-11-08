package zd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a0 {
    public static final a0 a;
    public static final a0 b;
    public static final /* synthetic */ a0[] c;

    static {
        a0 a0Var = new a0("DEFAULT", 0);
        a = a0Var;
        a0 a0Var2 = new a0("LAZY", 1);
        a0 a0Var3 = new a0("ATOMIC", 2);
        b = a0Var3;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, new a0("UNDISPATCHED", 3)};
        c = a0VarArr;
        c8.j1.a(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) c.clone();
    }
}
