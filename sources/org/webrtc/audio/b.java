package org.webrtc.audio;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import cf.c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import pg.i0;
import q3.g;
import q9.d;
import q9.e;
import q9.n;
import qg.n2;
import r9.j;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements i0, g, e, pa.a, d, OnFailureListener, androidx.car.app.utils.b, z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // q9.d
    public Object G(c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 12:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 19:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 20:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                n nVar = ExecutorsRegistrar.a;
                return j.a;
        }
    }

    @Override // pg.i0
    public Typeface a() {
        switch (this.a) {
            case 3:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 4:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 5:
                return Typeface.create("serif", 1);
            case 6:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 7:
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

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        switch (this.a) {
            case 23:
                a2Var.dismiss();
                break;
            default:
                a2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = n2.r0;
    }

    public /* synthetic */ b(r.a aVar, int i10, w.b bVar) {
        this.a = 14;
    }

    @Override // pa.a
    public void g(pa.b bVar) {
    }
}
