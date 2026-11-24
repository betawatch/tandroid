// default package

import java.util.ListIterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sq7 extends vy5 implements pr4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ yq7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq7(yq7 yq7Var, byte b) {
        super(0);
        this.b = b;
        this.c = yq7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    @Override // pr4
    public final Object invoke() {
        zp4 zp4Var;
        byte b = this.b;
        g7c g7cVar = g7c.a;
        yq7 yq7Var = this.c;
        switch (b) {
            case 0:
                yq7Var.a();
                break;
            case 1:
                zp4 zp4Var2 = yq7Var.c;
                if (zp4Var2 == null) {
                    lt ltVar = yq7Var.b;
                    ListIterator listIterator = ltVar.listIterator(ltVar.c);
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            zp4Var = listIterator.previous();
                            if (((zp4) zp4Var).a) {
                            }
                        } else {
                            zp4Var = 0;
                        }
                    }
                    zp4Var2 = zp4Var;
                }
                yq7Var.c = null;
                if (zp4Var2 != null) {
                    zp4Var2.a();
                    break;
                }
                break;
            default:
                yq7Var.a();
                break;
        }
        return g7cVar;
    }
}
