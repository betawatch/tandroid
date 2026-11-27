// default package

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 r44, still in use, count: 1, list:
  (r4v1 r44) from 0x0033: FILLED_NEW_ARRAY (r1v1 r44), (r0v0 r44), (r5v1 r44), (r4v1 r44) A[WRAPPED] (LINE:52) elemType: r44
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
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class r44 {
    b(1),
    c(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    d(2);

    public static final r44[] e;
    public final byte a;

    static {
        r44 r44Var = b;
        r44 r44Var2 = c;
        r44 r44Var3 = d;
        e = new r44[]{r44Var2, r44Var, r44Var3, r4};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r44(int i) {
        this.a = i;
    }

    public static r44 valueOf(String str) {
        return (r44) Enum.valueOf(r44.class, str);
    }

    public static r44[] values() {
        return (r44[]) f.clone();
    }
}
