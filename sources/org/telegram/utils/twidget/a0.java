package org.telegram.utils.twidget;

import android.os.Trace;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ long a;

    @Override // java.lang.Runnable
    public final void run() {
        long j3 = this.a;
        Trace.beginSection("WidgetSandbox:Destroy");
        try {
            WidgetSandboxNative.destroy(j3);
        } finally {
            Trace.endSection();
        }
    }
}
