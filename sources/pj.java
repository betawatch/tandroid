// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pj {
    public static final pj a;
    public static final pj b;
    public static final /* synthetic */ pj[] c;

    static {
        pj pjVar = new pj("STARS", 0);
        a = pjVar;
        pj pjVar2 = new pj("TON", 1);
        b = pjVar2;
        c = new pj[]{pjVar, pjVar2};
    }

    public static pj valueOf(String str) {
        return (pj) Enum.valueOf(pj.class, str);
    }

    public static pj[] values() {
        return (pj[]) c.clone();
    }
}
