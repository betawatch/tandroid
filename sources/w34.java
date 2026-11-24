// default package

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 w34, still in use, count: 1, list:
  (r4v1 w34) from 0x0033: FILLED_NEW_ARRAY (r1v1 w34), (r0v0 w34), (r5v1 w34), (r4v1 w34) A[WRAPPED] (LINE:52) elemType: w34
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class w34 {
    b(1),
    c(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    d(2);

    public static final w34[] e;
    public final byte a;

    static {
        w34 w34Var = b;
        w34 w34Var2 = c;
        w34 w34Var3 = d;
        e = new w34[]{w34Var2, w34Var, w34Var3, r4};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w34(int i) {
        this.a = i;
    }

    public static w34 valueOf(String str) {
        return (w34) Enum.valueOf(w34.class, str);
    }

    public static w34[] values() {
        return (w34[]) f.clone();
    }
}
