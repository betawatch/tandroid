package x2;

import android.media.Spatializer;
import e9.y0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
