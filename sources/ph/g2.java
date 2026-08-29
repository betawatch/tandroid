package ph;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g2 extends m3 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, Context context, int i10) {
        super(context);
        this.V = i10;
        this.W = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f9;
        int size;
        switch (this.V) {
            case 0:
                p2 p2Var = (p2) this.W;
                l2 l2Var = p2Var.h0;
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i12 = (int) (size2 / 3.5f);
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        f9 = i12;
                        if (getOffsetY() != f9 && !p2Var.Y && p2Var.M0) {
                            p2Var.B = true;
                            setOffsetY(f9);
                            p2Var.B = false;
                            p2Var.M0 = false;
                        }
                        if (!p2Var.Z && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                            Point point2 = AndroidUtilities.displaySize;
                            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i11);
                        if (!p2Var.Z) {
                            size = (size - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                        }
                        if (l2Var != null && l2Var.getTotalHeight() > 0) {
                            size -= l2Var.getTotalHeight();
                        }
                        super.onMeasure(i10, org.telegram.ui.b.B(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i12 = (size2 / 5) * 2;
                if (i12 < 0) {
                }
                f9 = i12;
                if (getOffsetY() != f9) {
                    p2Var.B = true;
                    setOffsetY(f9);
                    p2Var.B = false;
                    p2Var.M0 = false;
                }
                if (!p2Var.Z) {
                    Point point22 = AndroidUtilities.displaySize;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i11);
                if (!p2Var.Z) {
                }
                if (l2Var != null) {
                    size -= l2Var.getTotalHeight();
                }
                super.onMeasure(i10, org.telegram.ui.b.B(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i11) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(84.0f)) + ((n3) this.W).J, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.V) {
            case 0:
                if (!((p2) this.W).B) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // ph.m3, android.view.View
    public void setTranslationY(float f9) {
        switch (this.V) {
            case 0:
                super.setTranslationY(f9);
                p2 p2Var = (p2) this.W;
                BotFullscreenButtons botFullscreenButtons = p2Var.i0;
                if (botFullscreenButtons != null) {
                    botFullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f9);
                }
                FrameLayout frameLayout = p2Var.l0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(p2Var.v.getTranslationY() + AndroidUtilities.lerp(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(70.0f) + p2Var.h.top, p2Var.b0));
                    break;
                }
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }
}
