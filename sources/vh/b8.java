package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b8 extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ o8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(o8 o8Var, Activity activity) {
        super(activity);
        this.d = o8Var;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !canvas.isHardwareAccelerated() || org.telegram.messenger.i0.m0) {
            z10 = false;
            canvas2 = canvas;
        } else {
            if (this.c == null) {
                this.c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.c.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = this.c.beginRecording();
            z10 = true;
        }
        super.dispatchDraw(canvas2);
        if (!z10 || i10 < 31) {
            return;
        }
        this.c.endRecording();
        s9 s9Var = this.d.r0;
        if (s9Var != null) {
            s9Var.g(this, this.c);
        }
        canvas.drawRenderNode(this.c);
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.E;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int L = i15 - org.telegram.messenger.i0.L(120.0f);
            int L2 = org.telegram.messenger.i0.L(40.0f);
            Rect rect = this.a;
            rect.set(0, L, L2, i15);
            int L3 = i14 - org.telegram.messenger.i0.L(40.0f);
            int L4 = i15 - org.telegram.messenger.i0.L(120.0f);
            Rect rect2 = this.b;
            rect2.set(L3, L4, i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o8 o8Var = this.d;
        he0 he0Var = o8Var.F1;
        if (he0Var != null) {
            float measuredWidth = he0Var.getMeasuredWidth();
            float measuredHeight = o8Var.F1.getMeasuredHeight();
            oj0 oj0Var = he0Var.e;
            oj0Var.a = 0.0f;
            oj0Var.b = 0.0f;
            oj0Var.c = measuredWidth;
            oj0Var.d = measuredHeight;
        }
        fe0 fe0Var = o8Var.E1;
        if (fe0Var != null) {
            float measuredWidth2 = fe0Var.getMeasuredWidth();
            float measuredHeight2 = o8Var.E1.getMeasuredHeight();
            pu0 pu0Var = fe0Var.d;
            pu0Var.a = measuredWidth2;
            pu0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, vh.k8] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.v2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.i(motionEvent);
        return true;
    }
}
