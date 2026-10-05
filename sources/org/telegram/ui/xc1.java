package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class xc1 extends w7.w5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ xc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // w7.w5
    public void a() {
        switch (this.a) {
            case 1:
                ((ki1) this.b).v.invalidate();
                break;
        }
    }

    @Override // w7.w5
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((pd1) this.b).x0.invalidate();
                    break;
                }
                break;
        }
    }
}
