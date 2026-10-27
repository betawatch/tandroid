package zh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
