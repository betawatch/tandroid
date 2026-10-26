package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ((m1) this.b).a();
                break;
            case 1:
                ((h4) this.b).f0(((Boolean) obj).booleanValue());
                break;
            case 2:
                f4 f4Var = (f4) this.b;
                ((Boolean) obj).getClass();
                y3 y3Var = f4Var.d;
                if (y3Var != null) {
                    y3Var.run();
                    break;
                }
                break;
            default:
                vg.j.j(((y4) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
