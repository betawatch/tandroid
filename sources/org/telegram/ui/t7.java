package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t7 extends FrameLayout {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9) {
        super(context);
        this.a = i9;
        this.c = notificationCenterDelegate;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((g8) this.c).H.l();
                    break;
                }
                break;
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.b;
                if (i14 != -1 && Math.abs(i14 - i13) > AndroidUtilities.dp(20.0f)) {
                    ((bq) this.c).b.x0(r3.R - 1);
                }
                this.b = i13;
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                Point point = AndroidUtilities.displaySize;
                int i15 = point.x + point.y;
                int i16 = this.b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.j20 j20Var = (org.telegram.ui.Components.j20) this.c;
                    j20Var.w = false;
                    j20Var.a();
                }
                this.b = i15;
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        switch (this.a) {
            case 2:
                super.setVisibility(i9);
                if (i9 == 8) {
                    this.b = -1;
                    break;
                }
                break;
            default:
                super.setVisibility(i9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(g8 g8Var, Context context) {
        super(context);
        this.a = 0;
        this.c = g8Var;
    }
}
