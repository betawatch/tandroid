// default package

import java.util.ListIterator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pr7 extends az5 implements sr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ vr7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr7(vr7 vr7Var, byte b) {
        super(0);
        this.b = b;
        this.c = vr7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // sr4
    public final Object invoke() {
        cq4 cq4Var;
        byte b = this.b;
        g9c g9cVar = g9c.a;
        vr7 vr7Var = this.c;
        switch (b) {
            case 0:
                vr7Var.a();
                break;
            case 1:
                cq4 cq4Var2 = vr7Var.c;
                if (cq4Var2 == null) {
                    ls lsVar = vr7Var.b;
                    ListIterator listIterator = lsVar.listIterator(lsVar.c);
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            cq4Var = listIterator.previous();
                            if (((cq4) cq4Var).a) {
                            }
                        } else {
                            cq4Var = 0;
                        }
                    }
                    cq4Var2 = cq4Var;
                }
                vr7Var.c = null;
                if (cq4Var2 != null) {
                    cq4Var2.a();
                    break;
                }
                break;
            default:
                vr7Var.a();
                break;
        }
        return g9cVar;
    }
}
