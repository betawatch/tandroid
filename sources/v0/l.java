package v0;

import android.graphics.Typeface;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import xf.g0;
import yf.m2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements t2.g, com.google.android.exoplayer2.upstream.l, g0, y8.e, x9.a, y8.d, OnFailureListener, b2 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i9) {
        this.a = i9;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        y9.d lambda$getComponents$0;
        switch (this.a) {
            case 12:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(bVar);
                return lambda$getComponents$0;
            case 13:
            default:
                y8.n nVar = ExecutorsRegistrar.a;
                return z8.j.a;
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
        }
    }

    @Override // xf.g0
    public Typeface a() {
        switch (this.a) {
            case 4:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 5:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 6:
                return Typeface.create("serif", 1);
            case 7:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 8:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // y8.e
    public List b(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // com.google.android.exoplayer2.upstream.l
    public com.google.android.exoplayer2.upstream.m createDataSource() {
        return new com.google.android.exoplayer2.upstream.c(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 18:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i9 = m2.n0;
    }

    @Override // t2.g
    public void c(Exception exc) {
    }

    @Override // x9.a
    public void e(x9.b bVar) {
    }
}
