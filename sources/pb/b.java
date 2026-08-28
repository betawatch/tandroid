package pb;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 pb.b, still in use, count: 1, list:
  (r4v1 pb.b) from 0x0031: FILLED_NEW_ARRAY (r1v1 pb.b), (r0v0 pb.b), (r5v1 pb.b), (r4v1 pb.b) A[WRAPPED] (LINE:50) elemType: pb.b
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    b(1),
    c(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF4(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(2);

    public static final b[] d;
    public final int a;

    static {
        b bVar = b;
        b bVar2 = c;
        d = new b[]{bVar2, bVar, r5, r4};
    }

    public b(int i9) {
        this.a = i9;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
