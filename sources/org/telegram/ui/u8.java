package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u8 implements ig.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u8(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // ig.j
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((org.telegram.ui.Components.i51) this.b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                if (view == profileActivity.K) {
                    return true;
                }
                return profileActivity.a.drawChild(canvas, view, j10);
            default:
                return ((ue1) this.b).drawChild(canvas, view, j10);
        }
    }
}
