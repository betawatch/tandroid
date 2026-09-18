package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.Components.f61) this.b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.a.drawChild(canvas, view, j3);
            default:
                return ((dg1) this.b).drawChild(canvas, view, j3);
        }
    }
}
