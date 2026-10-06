package org.telegram.ui.web;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements org.telegram.ui.ActionBar.a2, pg.i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // q9.d
    public Object E(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 14:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 21:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 22:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            default:
                q9.n nVar = ExecutorsRegistrar.a;
                return r9.j.a;
        }
    }

    @Override // pg.i0
    public Typeface a() {
        switch (this.a) {
            case 5:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 6:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 7:
                return Typeface.create("serif", 1);
            case 8:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 9:
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
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                b2Var.dismiss();
                break;
            case 1:
                b2Var.dismiss();
                break;
            case 25:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = qg.n2.r0;
    }

    public /* synthetic */ w(r.a aVar, int i10, w.b bVar) {
        this.a = 16;
    }

    @Override // pa.a
    public void f(pa.b bVar) {
    }
}
