package org.telegram.utils.twidget;

import android.os.Trace;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
