package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wb1 extends g7.b6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ wb1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // g7.b6
    public void a() {
        switch (this.a) {
            case 1:
                ((mh1) this.b).v.invalidate();
                break;
        }
    }

    @Override // g7.b6
    public void b(int i9, int i10) {
        switch (this.a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i9 <= i10)) {
                    ((oc1) this.b).t0.invalidate();
                    break;
                }
                break;
        }
    }
}
