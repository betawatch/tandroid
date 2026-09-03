package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x8 implements og.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // og.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.Components.h61) this.b).drawChild(canvas, view, j10);
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
