package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.media.MediaRoute2Info;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p2.l, f9.k, androidx.car.app.utils.b {
    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info b(Object obj) {
        return (MediaRoute2Info) obj;
    }

    @Override // f9.k
    public Object apply(Object obj) {
        q2.q qVar = (q2.q) obj;
        qVar.m();
        return g9.i0.q(g9.o.y(qVar.Z.b, new u9.j(15)));
    }

    @Override // androidx.car.app.utils.b
    public void call() {
        throw null;
    }

    @Override // p2.l
    public void release() {
    }
}
