package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y70(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder n10 = jg.g.n(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.q;
                jg.g.s(point.y, n10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.r2.a) {
                        jg.g.s(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            default:
                v71 v71Var = (v71) obj;
                v71Var.Q = SystemClock.elapsedRealtime() + 1500;
                v71Var.l0.invalidate();
                break;
        }
    }
}
