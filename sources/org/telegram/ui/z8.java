package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z8 implements ng.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ng.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.Components.g61) this.b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (view == profileActivity.L) {
                    return true;
                }
                return profileActivity.a.drawChild(canvas, view, j10);
            default:
                return ((qf1) this.b).drawChild(canvas, view, j10);
        }
    }
}
