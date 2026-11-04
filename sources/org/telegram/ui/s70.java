package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s70(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                String str = LaunchActivity.E1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m10 = k2.p1.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.q;
                k2.p1.q(point.y, m10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.r2.a) {
                        k2.p1.q(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            default:
                l71 l71Var = (l71) obj;
                l71Var.R = SystemClock.elapsedRealtime() + 1500;
                l71Var.m0.invalidate();
                break;
        }
    }
}
