package org.telegram.ui;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk0 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.zc0, Utilities.Callback2Return, org.telegram.ui.Components.ew0, pg.i0, q3.g, q9.e, pa.a, q9.d, OnFailureListener, androidx.car.app.utils.b {
    public final /* synthetic */ int a;

    public /* synthetic */ wk0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration d(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info e(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        qa.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override // pg.i0
    public Typeface a() {
        switch (this.a) {
            case 16:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 17:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 18:
                return Typeface.create("serif", 1);
            case 19:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 20:
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
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                b2Var.dismiss();
                break;
            case 1:
            case 5:
            case 8:
            default:
                b2Var.dismiss();
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 3:
                b2Var.dismiss();
                break;
            case 4:
                b2Var.dismiss();
                break;
            case 6:
                b2Var.dismiss();
                break;
            case 7:
                b2Var.dismiss();
                break;
            case 9:
                b2Var.dismiss();
                break;
            case 10:
                b2Var.dismiss();
                break;
            case 11:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ew0
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.ui.Components.zc0
    public String j(int i10) {
        return i10 == 0 ? LocaleController.getString(R.string.AutoLockDisabled) : i10 == 1 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 1, new Object[0])) : i10 == 2 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", 5, new Object[0])) : i10 == 3 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 1, new Object[0])) : i10 == 4 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", 5, new Object[0])) : "";
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = qg.m2.r0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? yh.v7.X0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    public /* synthetic */ wk0(r.a aVar, int i10, w.b bVar) {
        this.a = 27;
    }

    @Override // pa.a
    public void g(pa.b bVar) {
    }

    @Override // org.telegram.ui.Components.ew0
    public /* synthetic */ void n() {
    }
}
