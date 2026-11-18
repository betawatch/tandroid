package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z70 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z70(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m10 = i5.c.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.g0.q;
                i5.c.t(point.y, m10);
                int i10 = (measuredHeight - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.m;
                if (i10 > org.telegram.messenger.g0.L(100.0f) && i10 < point.y && org.telegram.messenger.g0.L(100.0f) + i10 > point.y) {
                    point.y = i10;
                    if (org.telegram.messenger.s2.a) {
                        i5.c.t(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            default:
                x71 x71Var = (x71) obj;
                x71Var.R = SystemClock.elapsedRealtime() + 1500;
                x71Var.m0.invalidate();
                break;
        }
    }
}
