package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Components.wk0 {
    public final /* synthetic */ int T2;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w50(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, b6Var);
        this.T2 = i9;
        this.U2 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.Components.wk0
    public boolean E0(float f10) {
        switch (this.T2) {
            case 2:
                org.telegram.ui.Components.ki kiVar = ((pf.e0) this.U2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + kiVar.X1[0]) + (!kiVar.c0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public Integer W0(int i9) {
        int i10;
        switch (this.T2) {
            case 1:
                i10 = ((SessionsActivity) this.U2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.b6 b6Var = this.l2;
                return i9 == i10 ? Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.p7, b6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.i6, b6Var));
            default:
                return super.W0(i9);
        }
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.T2) {
            case 0:
                super.dispatchDraw(canvas);
                y50 y50Var = (y50) this.U2;
                if (y50Var.v0 != null && y50Var.w0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = y50Var.v0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.o2) y50Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    y50Var.v0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i9, int i10) {
        int i11 = this.T2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.T2 = 1;
        this.U2 = sessionsActivity;
    }

    private final void w1(int i9, int i10) {
    }
}
