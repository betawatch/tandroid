package x2;

import android.media.Spatializer;
import e9.y0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class j implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ p a;

    public j(p pVar) {
        this.a = pVar;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.a;
        y0 y0Var = p.l;
        pVar.f();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        p pVar = this.a;
        y0 y0Var = p.l;
        pVar.f();
    }
}
