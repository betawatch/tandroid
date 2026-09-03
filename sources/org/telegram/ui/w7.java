package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((j8) this.c).I.l();
                    break;
                }
                break;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    ((kq) this.c).b.x0(r3.S - 1);
                }
                this.b = i14;
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.c30 c30Var = (org.telegram.ui.Components.c30) this.c;
                    c30Var.w = false;
                    c30Var.a();
                }
                this.b = i16;
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.b = -1;
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(j8 j8Var, Context context) {
        super(context);
        this.a = 0;
        this.c = j8Var;
    }
}
