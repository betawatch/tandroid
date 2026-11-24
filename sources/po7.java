// default package

import java.util.ListIterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class po7 extends vw5 implements op4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ vo7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po7(vo7 vo7Var, byte b) {
        super(0);
        this.b = b;
        this.c = vo7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // op4
    public final Object invoke() {
        yn4 yn4Var;
        byte b = this.b;
        g5c g5cVar = g5c.a;
        vo7 vo7Var = this.c;
        switch (b) {
            case 0:
                vo7Var.a();
                break;
            case 1:
                yn4 yn4Var2 = vo7Var.c;
                if (yn4Var2 == null) {
                    ks ksVar = vo7Var.b;
                    ListIterator listIterator = ksVar.listIterator(ksVar.c);
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            yn4Var = listIterator.previous();
                            if (((yn4) yn4Var).a) {
                            }
                        } else {
                            yn4Var = 0;
                        }
                    }
                    yn4Var2 = yn4Var;
                }
                vo7Var.c = null;
                if (yn4Var2 != null) {
                    yn4Var2.a();
                    break;
                }
                break;
            default:
                vo7Var.a();
                break;
        }
        return g5cVar;
    }
}
