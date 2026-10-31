package org.telegram.utils.twidget;

import android.os.Trace;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
