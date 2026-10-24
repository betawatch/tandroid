package org.telegram.ui.web;

import android.graphics.Typeface;
import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import rg.o2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements org.telegram.ui.ActionBar.z1, q3.g, g2.g, qg.j0, androidx.car.app.utils.b, r9.e, qa.a, r9.d, OnFailureListener {
    public final /* synthetic */ int a;

    public /* synthetic */ d0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info d(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // qg.j0
    public Typeface a() {
        switch (this.a) {
            case 7:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 8:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 9:
                return Typeface.create("serif", 1);
            case 10:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 11:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // q3.g
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        c2Var.dismiss();
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        ra.d lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i10 = o2.r0;
    }

    @Override // r9.e
    public List v(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    public /* synthetic */ d0(r.a aVar, int i10, w.b bVar) {
        this.a = 13;
    }

    @Override // qa.a
    public void h(qa.b bVar) {
    }
}
