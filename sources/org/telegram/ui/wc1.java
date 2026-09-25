package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class wc1 extends w7.j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ wc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // w7.j0
    public void a() {
        switch (this.a) {
            case 1:
                ((mi1) this.b).v.invalidate();
                break;
        }
    }

    @Override // w7.j0
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((od1) this.b).x0.invalidate();
                    break;
                }
                break;
        }
    }
}
