package s5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import org.telegram.ui.Components.i50;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class q {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    public final void a(com.google.android.gms.common.api.q qVar) {
        n nVar = (n) qVar;
        switch (this.a) {
            case 0:
                Status i10 = nVar.i();
                int i11 = i10.a;
                c cVar = this.b;
                if (i11 != 0) {
                    u5.b bVar = cVar.a;
                    Log.w(bVar.a, bVar.d("Error fetching queue item ids, statusCode=" + i11 + ", statusMessage=" + i10.b, new Object[0]));
                }
                cVar.l = null;
                if (!cVar.h.isEmpty()) {
                    a7.e eVar = cVar.i;
                    i50 i50Var = cVar.j;
                    eVar.removeCallbacks(i50Var);
                    eVar.postDelayed(i50Var, 500L);
                    break;
                }
                break;
            default:
                Status i12 = nVar.i();
                int i13 = i12.a;
                c cVar2 = this.b;
                if (i13 != 0) {
                    u5.b bVar2 = cVar2.a;
                    Log.w(bVar2.a, bVar2.d("Error fetching queue items, statusCode=" + i13 + ", statusMessage=" + i12.b, new Object[0]));
                }
                cVar2.k = null;
                if (!cVar2.h.isEmpty()) {
                    a7.e eVar2 = cVar2.i;
                    i50 i50Var2 = cVar2.j;
                    eVar2.removeCallbacks(i50Var2);
                    eVar2.postDelayed(i50Var2, 500L);
                    break;
                }
                break;
        }
    }
}
