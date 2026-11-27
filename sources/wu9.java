// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wu9 {
    public static final wu9 a;
    public static final wu9 b;
    public static final /* synthetic */ wu9[] c;

    static {
        wu9 wu9Var = new wu9("LINE", 0);
        a = wu9Var;
        wu9 wu9Var2 = new wu9("TAB", 1);
        b = wu9Var2;
        c = new wu9[]{wu9Var, wu9Var2};
    }

    public static wu9 valueOf(String str) {
        return (wu9) Enum.valueOf(wu9.class, str);
    }

    public static wu9[] values() {
        return (wu9[]) c.clone();
    }
}
