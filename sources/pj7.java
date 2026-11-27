// default package

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pj7 extends e23 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj7(e23 e23Var) {
        super((byte) 0);
        e23Var.getClass();
        ((LinkedHashMap) this.a).putAll((LinkedHashMap) e23Var.a);
    }

    @Override // e23
    public final Object b(d23 d23Var) {
        return ((LinkedHashMap) this.a).get(d23Var);
    }

    public pj7() {
        this(c23.b);
    }
}
