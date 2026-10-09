package pg;

import android.graphics.Typeface;
import ci.u5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import qg.o2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b, a2 {
    public final /* synthetic */ int a;

    public /* synthetic */ e0(int i10) {
        this.a = i10;
    }

    @Override // pg.i0
    public Typeface a() {
        switch (this.a) {
            case 0:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 1:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // q9.e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        switch (this.a) {
            case 17:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = o2.r0;
    }

    @Override // q9.d
    public Object y0(u5 u5Var) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 6:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(u5Var);
                return lambda$getComponents$0;
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.a;
                return r9.j.a;
        }
    }

    public /* synthetic */ e0(r.a aVar, int i10, w.b bVar) {
        this.a = 8;
    }

    @Override // pa.a
    public void g(pa.b bVar) {
    }
}
