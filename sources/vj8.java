// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class vj8 implements pj8 {
    public static final rj8 a;
    public static final /* synthetic */ vj8[] b;

    static {
        rj8 rj8Var = new rj8();
        a = rj8Var;
        b = new vj8[]{rj8Var, new vj8() { // from class: sj8
            @Override // pj8
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new vj8() { // from class: tj8
            @Override // pj8
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new vj8() { // from class: uj8
            @Override // pj8
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static vj8 valueOf(String str) {
        return (vj8) Enum.valueOf(vj8.class, str);
    }

    public static vj8[] values() {
        return (vj8[]) b.clone();
    }
}
