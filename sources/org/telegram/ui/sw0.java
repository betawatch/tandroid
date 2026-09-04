package org.telegram.ui;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw0 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.rv0, g2.g, q3.g, q9.e, pa.a, q9.d, qg.h0, androidx.car.app.utils.d {
    public final /* synthetic */ int a;

    public /* synthetic */ sw0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // q9.d
    public Object D(cf.c cVar) {
        qa.d lambda$getComponents$0;
        switch (this.a) {
            case 16:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
        }
    }

    @Override // qg.h0
    public Typeface a() {
        switch (this.a) {
            case 17:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 18:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 19:
                return Typeface.create("serif", 1);
            case 20:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 21:
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

    @Override // androidx.car.app.utils.d
    public void call() {
        throw null;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 1:
                b2Var.dismiss();
                break;
            case 2:
                b2Var.dismiss();
                break;
            case 3:
            default:
                b2Var.dismiss();
                break;
            case 4:
                b2Var.dismiss();
                break;
            case 5:
                b2Var.dismiss();
                break;
            case 6:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public void i(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? zh.v7.X0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    public /* synthetic */ sw0(r.a aVar, int i10, w.b bVar) {
        this.a = 23;
    }

    @Override // pa.a
    public void h(pa.b bVar) {
    }

    @Override // org.telegram.ui.Components.rv0
    public /* synthetic */ void l() {
    }
}
