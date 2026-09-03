package org.telegram.ui;

import android.graphics.Point;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class rc1 extends k7.z5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ rc1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // k7.z5
    public void a() {
        switch (this.a) {
            case 1:
                ((ii1) this.b).v.invalidate();
                break;
        }
    }

    @Override // k7.z5
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                Point point = AndroidUtilities.displaySize;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((jd1) this.b).u0.invalidate();
                    break;
                }
                break;
        }
    }
}
