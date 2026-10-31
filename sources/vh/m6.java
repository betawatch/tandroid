package vh;

import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.ay;
import org.telegram.ui.kx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        p51 p51Var;
        switch (this.a) {
            case 0:
                ((n6) this.b).n.W.y1 = ((Integer) obj).intValue();
                break;
            case 1:
                ((o7) this.b).h((q20) obj);
                break;
            case 2:
                xh.o oVar = (xh.o) this.b;
                ArrayList arrayList = oVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                u51 u51Var = oVar.a;
                if (u51Var != null && (p51Var = u51Var.f3) != null) {
                    p51Var.O(true);
                    break;
                }
                break;
            case 3:
                yh.e eVar = (yh.e) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = eVar.n;
                boolean z10 = arrayList3 == null || arrayList3.isEmpty();
                eVar.n = arrayList2;
                u51 u51Var2 = eVar.f;
                if (u51Var2 != null) {
                    u51Var2.f3.O(z10);
                    break;
                }
                break;
            case 4:
                ((zf.m) this.b).M((TLRPC.User) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                zm0 zm0Var = (zm0) ((zf.z) this.b);
                kx kxVar = zm0Var.K0;
                if (user != null) {
                    ay ayVar = kxVar.L0;
                    if (ayVar != null) {
                        ayVar.V3();
                    }
                    vp.r1(kxVar.J0).u3(null, user, null, 0, null, false, false);
                    zm0Var.Q(user.id, user);
                    break;
                }
                break;
        }
    }
}
