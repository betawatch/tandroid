package q5;

import android.util.Log;
import c2.v0;
import com.google.android.gms.common.api.Status;
import nh.g2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class p {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ p(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        m mVar = (m) qVar;
        switch (this.a) {
            case 0:
                Status i10 = mVar.i();
                int i11 = i10.a;
                c cVar = this.b;
                if (i11 != 0) {
                    s5.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + i10.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    v0 v0Var = cVar.i;
                    g2 g2Var = cVar.j;
                    v0Var.removeCallbacks(g2Var);
                    v0Var.postDelayed(g2Var, 500L);
                    break;
                }
                break;
            default:
                Status i12 = mVar.i();
                int i13 = i12.a;
                c cVar2 = this.b;
                if (i13 != 0) {
                    s5.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + i12.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    v0 v0Var2 = cVar2.i;
                    g2 g2Var2 = cVar2.j;
                    v0Var2.removeCallbacks(g2Var2);
                    v0Var2.postDelayed(g2Var2, 500L);
                    break;
                }
                break;
        }
    }
}
