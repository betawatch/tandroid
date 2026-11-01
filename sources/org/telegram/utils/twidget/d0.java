package org.telegram.utils.twidget;

import android.os.Trace;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ long a;

    @Override // java.lang.Runnable
    public final void run() {
        long j10 = this.a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j10);
        } finally {
            Trace.endSection();
        }
    }
}
