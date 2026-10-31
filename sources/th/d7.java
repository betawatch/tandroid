package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d7 extends p {
    public final /* synthetic */ o7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(Context context, o7 o7Var) {
        super(context);
        this.d = o7Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o7 o7Var = this.d;
        z2 currentPeerView = o7Var.n0.getCurrentPeerView();
        f4 f4Var = o7Var.x;
        if (f4Var != null && currentPeerView != null) {
            g2 g2Var = currentPeerView.L0;
            f4Var.setOffset(o7Var.e0);
            if (o7Var.x.f == 1.0f) {
                o7Var.n0.setVisibility(4);
            } else {
                o7Var.n0.setVisibility(0);
            }
            o7Var.n0.B();
            float top = g2Var.getTop() + currentPeerView.getTop();
            float f7 = o7Var.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (g2Var.getMeasuredHeight() > 0) {
                o7Var.q1 = g2Var.getMeasuredHeight();
            }
            float T1 = org.telegram.messenger.i0.T1(1.0f, o7Var.x.n / o7Var.q1, f7);
            o7Var.n0.setPivotY(top);
            o7Var.n0.setPivotX(getMeasuredWidth() / 2.0f);
            o7Var.n0.setScaleX(T1);
            o7Var.n0.setScaleY(T1);
            currentPeerView.E2 = true;
            if (o7Var.e0 == 0.0f) {
                currentPeerView.V0(0.0f, 0.0f, null);
            } else {
                currentPeerView.V0(f7, T1, o7Var.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.h1.b = (int) org.telegram.messenger.i0.T1(10.0f, 6.0f / r6, o7Var.x.f);
            g2Var.invalidateOutline();
            o7Var.n0.setTranslationY((o7Var.x.b - top) * f7);
        }
        if (currentPeerView != null) {
            o7Var.d1.setTranslationY(((currentPeerView.L0.getY() + currentPeerView.getY()) - o7Var.d1.getTop()) - org.telegram.messenger.i0.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        o7 o7Var = this.d;
        if (!o7Var.b || o7Var.c) {
            View rootView = getRootView();
            Rect rect = org.telegram.messenger.i0.Q;
            getWindowVisibleDisplayFrame(rect);
            int i12 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i12 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top));
            }
            o7Var.h(i12);
            size += o7Var.p0;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        int i13 = (int) ((size2 * 16.0f) / 9.0f);
        if (size > i13) {
            o7Var.n0.getLayoutParams().width = -1;
            size = i13;
        } else {
            int i14 = (int) ((size / 16.0f) * 9.0f);
            o7Var.n0.getLayoutParams().width = i14;
            size2 = i14;
        }
        o7Var.y0.getLayoutParams().height = size + 1;
        o7Var.y0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) o7Var.y0.getLayoutParams()).topMargin = org.telegram.messenger.i0.m;
        super.onMeasure(i10, i11);
    }
}
