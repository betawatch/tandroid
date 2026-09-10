package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j7 extends p {
    public final /* synthetic */ u7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(Context context, u7 u7Var) {
        super(context);
        this.d = u7Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        u7 u7Var = this.d;
        a3 currentPeerView = u7Var.n0.getCurrentPeerView();
        g4 g4Var = u7Var.w;
        if (g4Var != null && currentPeerView != null) {
            h2 h2Var = currentPeerView.c1;
            g4Var.setOffset(u7Var.e0);
            if (u7Var.w.f == 1.0f) {
                u7Var.n0.setVisibility(4);
            } else {
                u7Var.n0.setVisibility(0);
            }
            u7Var.n0.B();
            float top = h2Var.getTop() + currentPeerView.getTop();
            float f7 = u7Var.w.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (h2Var.getMeasuredHeight() > 0) {
                u7Var.q1 = h2Var.getMeasuredHeight();
            }
            float lerp = AndroidUtilities.lerp(1.0f, u7Var.w.n / u7Var.q1, f7);
            u7Var.n0.setPivotY(top);
            u7Var.n0.setPivotX(getMeasuredWidth() / 2.0f);
            u7Var.n0.setScaleX(lerp);
            u7Var.n0.setScaleY(lerp);
            currentPeerView.V2 = true;
            if (u7Var.e0 == 0.0f) {
                currentPeerView.X0(0.0f, 0.0f, null);
            } else {
                currentPeerView.X0(f7, lerp, u7Var.w.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.y1.b = (int) AndroidUtilities.lerp(10.0f, 6.0f / r6, u7Var.w.f);
            h2Var.invalidateOutline();
            u7Var.n0.setTranslationY((u7Var.w.b - top) * f7);
        }
        if (currentPeerView != null) {
            u7Var.d1.setTranslationY(((currentPeerView.c1.getY() + currentPeerView.getY()) - u7Var.d1.getTop()) - AndroidUtilities.dp(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        u7 u7Var = this.d;
        if (!u7Var.b || u7Var.c) {
            View rootView = getRootView();
            Rect rect = AndroidUtilities.rectTmp2;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top));
            }
            u7Var.setKeyboardHeightFromParent(i12);
            size += u7Var.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            u7Var.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            u7Var.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        u7Var.y0.getLayoutParams().height = size + 1;
        u7Var.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) u7Var.y0.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        super.onMeasure(i10, i11);
    }
}
