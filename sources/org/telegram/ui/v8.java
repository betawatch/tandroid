package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v8 implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.Components.r61) this.b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.a.drawChild(canvas, view, j3);
            default:
                return ((uf1) this.b).drawChild(canvas, view, j3);
        }
    }
}
