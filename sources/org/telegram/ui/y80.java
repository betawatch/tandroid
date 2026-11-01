package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y80 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder l4 = i0.a.l(measuredHeight, "height = ", " displayHeight = ");
                Point point = org.telegram.messenger.i0.q;
                i0.a.p(point.y, l4);
                int i11 = (measuredHeight - org.telegram.messenger.i0.n) - org.telegram.messenger.i0.m;
                if (i11 > org.telegram.messenger.i0.L(100.0f) && i11 < point.y && org.telegram.messenger.i0.L(100.0f) + i11 > point.y) {
                    point.y = i11;
                    if (org.telegram.messenger.v2.a) {
                        i0.a.p(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            default:
                k91 k91Var = (k91) obj;
                k91Var.Q = SystemClock.elapsedRealtime() + 1500;
                k91Var.l0.invalidate();
                break;
        }
    }
}
