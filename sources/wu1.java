// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wu1 implements we7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wu1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // we7
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj;
                yv1 yv1Var = ((iv1) obj2).a;
                if (i > 0 && yv1Var.getParentActivity() != null && yv1Var.fragmentView != null) {
                    c41.b0(yv1Var).m(k47.J3(document) ? b41.H : b41.J, i, 0, 0, yv1Var.Ba).j();
                    break;
                }
                break;
            default:
                ((int[]) obj2)[0] = i;
                ((dd2) obj).run();
                break;
        }
    }
}
