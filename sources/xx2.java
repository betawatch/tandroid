// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xx2 {
    public static final xx2 a;
    public static final xx2 b;
    public static final /* synthetic */ xx2[] c;

    static {
        xx2 xx2Var = new xx2("DEFAULT", 0);
        a = xx2Var;
        xx2 xx2Var2 = new xx2("LAZY", 1);
        xx2 xx2Var3 = new xx2("ATOMIC", 2);
        b = xx2Var3;
        c = new xx2[]{xx2Var, xx2Var2, xx2Var3, new xx2("UNDISPATCHED", 3)};
    }

    public static xx2 valueOf(String str) {
        return (xx2) Enum.valueOf(xx2.class, str);
    }

    public static xx2[] values() {
        return (xx2[]) c.clone();
    }
}
