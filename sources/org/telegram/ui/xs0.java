package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xs0 extends kt0 {
    public final /* synthetic */ int l0;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, nt0 nt0Var, FrameLayout frameLayout, int i10) {
        super(context, nt0Var, frameLayout);
        this.l0 = i10;
        this.m0 = notificationCenterDelegate;
    }

    @Override // org.telegram.ui.kt0
    public boolean C() {
        switch (this.l0) {
            case 0:
                return !((PhotoViewer) this.m0).s;
            default:
                return super.C();
        }
    }

    @Override // org.telegram.ui.kt0
    public void D() {
        switch (this.l0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.m0;
                if (secretMediaViewer.F && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.n1, 3000L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.kt0
    public void F() {
        switch (this.l0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.m0).n1);
                break;
        }
    }

    @Override // org.telegram.ui.kt0
    public void G() {
        switch (this.l0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.m0;
                if (secretMediaViewer.G0 == null) {
                    secretMediaViewer.k(((float) getScrollY()) < ((float) getMeasuredHeight()) / 3.0f && secretMediaViewer.g0, true);
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.l0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.m0;
                vt0[] vt0VarArr = photoViewer.S0;
                ImageView[] imageViewArr = photoViewer.u3;
                if (photoViewer.F) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.M1.getTranslationY();
                    boolean z10 = scrollY == 0 && translationY == 0.0f;
                    boolean z11 = scrollY == 0 && translationY == 0.0f;
                    if (!z10) {
                        int b10 = vt0VarArr[0].b() + vt0VarArr[0].j;
                        int top = (((photoViewer.V1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))) - AndroidUtilities.dp(12.0f);
                        boolean z12 = top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY());
                        z10 = top > b10;
                        z11 = z12;
                    }
                    if (photoViewer.v3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new e50(this, 12)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    vt0VarArr[0].e(2, z10 ? 1.0f : 0.0f, true);
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }
}
