package org.telegram.ui;

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y90(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.y1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                l.d.t(AndroidUtilities.displaySize.y, l.d.m(measuredHeight, "height = ", " displayHeight = "));
                int i11 = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
                if (i11 > AndroidUtilities.dp(100.0f) && i11 < AndroidUtilities.displaySize.y) {
                    int dp = AndroidUtilities.dp(100.0f) + i11;
                    Point point = AndroidUtilities.displaySize;
                    if (dp > point.y) {
                        point.y = i11;
                        if (BuildVars.LOGS_ENABLED) {
                            l.d.t(AndroidUtilities.displaySize.y, new StringBuilder("fix display size y to "));
                            break;
                        }
                    }
                }
                break;
            default:
                jd1 jd1Var = (jd1) obj;
                jd1Var.M = SystemClock.elapsedRealtime() + 1500;
                jd1Var.h0.invalidate();
                break;
        }
    }
}
