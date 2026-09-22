package q9;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import qg.n2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements pa.a, d, OnFailureListener, androidx.car.app.utils.b, a2 {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 1:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 8:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 9:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                n nVar = ExecutorsRegistrar.a;
                return r9.j.a;
        }
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(b2 b2Var, int i10) {
        switch (this.a) {
            case 12:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = n2.r0;
    }

    public /* synthetic */ p(r.a aVar, int i10, w.b bVar) {
        this.a = 3;
    }

    @Override // pa.a
    public void h(pa.b bVar) {
    }
}
