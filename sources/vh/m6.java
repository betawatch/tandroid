package vh;

import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.jx;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        q51 q51Var;
        switch (this.a) {
            case 0:
                ((n6) this.b).n.W.y1 = ((Integer) obj).intValue();
                break;
            case 1:
                ((o7) this.b).h((r20) obj);
                break;
            case 2:
                xh.o oVar = (xh.o) this.b;
                ArrayList arrayList = oVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                v51 v51Var = oVar.a;
                if (v51Var != null && (q51Var = v51Var.f3) != null) {
                    q51Var.O(true);
                    break;
                }
                break;
            case 3:
                yh.e eVar = (yh.e) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.n;
                boolean z10 = arrayList3 == null || arrayList3.isEmpty();
                eVar.n = arrayList2;
                v51 v51Var2 = eVar.f;
                if (v51Var2 != null) {
                    v51Var2.f3.O(z10);
                    break;
                }
                break;
            case 4:
                ((zf.m) this.b).M((TLRPC.User) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                an0 an0Var = (an0) ((zf.z) this.b);
                jx jxVar = an0Var.K0;
                if (user != null) {
                    zx zxVar = jxVar.L0;
                    if (zxVar != null) {
                        zxVar.W3();
                    }
                    wp.r1(jxVar.J0).u3(null, user, null, 0, null, false, false);
                    an0Var.Q(user.id, user);
                    break;
                }
                break;
        }
    }
}
