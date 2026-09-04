package yf;

import android.view.FrameMetrics;
import android.view.Window;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Window.OnFrameMetricsAvailableListener {
    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        y.a(frameMetrics);
    }
}
