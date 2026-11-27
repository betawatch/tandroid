// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pm8 {
    public static final pm8 a;
    public static final pm8 b;
    public static final pm8 c;
    public static final /* synthetic */ pm8[] d;

    static {
        pm8 pm8Var = new pm8("DEFAULT", 0);
        a = pm8Var;
        pm8 pm8Var2 = new pm8("VERY_LOW", 1);
        b = pm8Var2;
        pm8 pm8Var3 = new pm8("HIGHEST", 2);
        c = pm8Var3;
        d = new pm8[]{pm8Var, pm8Var2, pm8Var3};
    }

    public static pm8 valueOf(String str) {
        return (pm8) Enum.valueOf(pm8.class, str);
    }

    public static pm8[] values() {
        return (pm8[]) d.clone();
    }
}
