// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt1 implements ef7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wt1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // ef7
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) obj;
                zu1 zu1Var = ((ju1) obj2).a;
                if (i > 0 && zu1Var.getParentActivity() != null && zu1Var.fragmentView != null) {
                    d31.b0(zu1Var).m(r47.J3(document) ? c31.H : c31.J, i, 0, 0, zu1Var.Ba).j();
                    break;
                }
                break;
            default:
                ((int[]) obj2)[0] = i;
                ((ic2) obj).run();
                break;
        }
    }
}
