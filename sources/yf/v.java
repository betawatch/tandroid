package yf;

import android.view.FrameMetrics;
import android.view.Window;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Window.OnFrameMetricsAvailableListener {
    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        x.a(frameMetrics);
    }
}
