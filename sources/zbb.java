// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class zbb extends si5 {
    public final /* synthetic */ lcb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbb(lcb lcbVar, Context context) {
        super(context);
        this.d = lcbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lcb lcbVar = this.d;
        o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
        g4a g4aVar = lcbVar.x;
        if (g4aVar != null && currentPeerView != null) {
            t58 t58Var = currentPeerView.M0;
            g4aVar.setOffset(lcbVar.f0);
            float f = lcbVar.x.f;
            acb acbVar = lcbVar.o0;
            if (f == 1.0f) {
                acbVar.setVisibility(4);
            } else {
                acbVar.setVisibility(0);
            }
            lcbVar.o0.B();
            float top = t58Var.getTop() + currentPeerView.getTop();
            float f2 = lcbVar.x.f;
            getMeasuredHeight();
            getMeasuredHeight();
            if (t58Var.getMeasuredHeight() > 0) {
                lcbVar.q1 = t58Var.getMeasuredHeight();
            }
            float R1 = hl.R1(1.0f, lcbVar.x.n / lcbVar.q1, f2);
            lcbVar.o0.setPivotY(top);
            lcbVar.o0.setPivotX(getMeasuredWidth() / 2.0f);
            lcbVar.o0.setScaleX(R1);
            lcbVar.o0.setScaleY(R1);
            currentPeerView.F2 = true;
            if (lcbVar.f0 == 0.0f) {
                currentPeerView.S0(0.0f, 0.0f, null);
            } else {
                currentPeerView.S0(f2, R1, lcbVar.x.getCrossfadeToImage());
            }
            currentPeerView.invalidate();
            currentPeerView.i1.b = (int) hl.R1(10.0f, 6.0f / r6, lcbVar.x.f);
            t58Var.invalidateOutline();
            lcbVar.o0.setTranslationY((lcbVar.x.b - top) * f2);
        }
        if (currentPeerView != null) {
            lcbVar.d1.setTranslationY(((currentPeerView.M0.getY() + currentPeerView.getY()) - lcbVar.d1.getTop()) - hl.L(4.0f));
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        lcb lcbVar = this.d;
        if (!lcbVar.b || lcbVar.c) {
            View rootView = getRootView();
            Rect rect = hl.Q;
            getWindowVisibleDisplayFrame(rect);
            int i3 = 0;
            if (rect.bottom != 0 || rect.top != 0) {
                i3 = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? hl.m : 0)) - hl.o1(rootView)) - (rect.bottom - rect.top));
            }
            lcbVar.g(i3);
            size += lcbVar.q0;
        }
        int size2 = View.MeasureSpec.getSize(i);
        int i4 = (int) ((size2 * 16.0f) / 9.0f);
        acb acbVar = lcbVar.o0;
        if (size > i4) {
            acbVar.getLayoutParams().width = -1;
            size = i4;
        } else {
            int i5 = (int) ((size / 16.0f) * 9.0f);
            acbVar.getLayoutParams().width = i5;
            size2 = i5;
        }
        lcbVar.z0.getLayoutParams().height = size + 1;
        lcbVar.z0.getLayoutParams().width = size2;
        ((FrameLayout.LayoutParams) lcbVar.z0.getLayoutParams()).topMargin = hl.m;
        super.onMeasure(i, i2);
    }
}
