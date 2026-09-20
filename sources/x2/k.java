package x2;

import android.media.Spatializer;
import e9.y0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class k implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ q a;

    public k(q qVar) {
        this.a = qVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.a;
        y0 y0Var = q.l;
        qVar.f();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        q qVar = this.a;
        y0 y0Var = q.l;
        qVar.f();
    }
}
