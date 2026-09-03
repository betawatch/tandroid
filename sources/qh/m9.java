package qh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class m9 extends FrameLayout {
    public final Rect a;
    public final Rect b;
    public RenderNode c;
    public final /* synthetic */ ba d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(ba baVar, Activity activity) {
        super(activity);
        this.d = baVar;
        this.a = new Rect();
        this.b = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 || !canvas.isHardwareAccelerated() || AndroidUtilities.makingGlobalBlurBitmap) {
            canvas2 = canvas;
            z4 = false;
        } else {
            if (this.c == null) {
                this.c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.c.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = this.c.beginRecording();
            z4 = true;
        }
        super.dispatchDraw(canvas2);
        if (!z4 || i10 < 31) {
            return;
        }
        this.c.endRecording();
        org.telegram.ui.Components.ba baVar = this.d.o0;
        if (baVar != null) {
            baVar.g(this, this.c);
        }
        canvas.drawRenderNode(this.c);
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.B;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int dp = i15 - AndroidUtilities.dp(120.0f);
            int dp2 = AndroidUtilities.dp(40.0f);
            Rect rect = this.a;
            rect.set(0, dp, dp2, i15);
            int dp3 = i14 - AndroidUtilities.dp(40.0f);
            int dp4 = i15 - AndroidUtilities.dp(120.0f);
            Rect rect2 = this.b;
            rect2.set(dp3, dp4, i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ba baVar = this.d;
        gf0 gf0Var = baVar.C1;
        if (gf0Var != null) {
            float measuredWidth = gf0Var.getMeasuredWidth();
            float measuredHeight = baVar.C1.getMeasuredHeight();
            sk0 sk0Var = gf0Var.e;
            sk0Var.a = 0.0f;
            sk0Var.b = 0.0f;
            sk0Var.c = measuredWidth;
            sk0Var.d = measuredHeight;
        }
        ef0 ef0Var = baVar.B1;
        if (ef0Var != null) {
            float measuredWidth2 = ef0Var.getMeasuredWidth();
            float measuredHeight2 = baVar.B1.getMeasuredHeight();
            jv0 jv0Var = ef0Var.d;
            jv0Var.a = measuredWidth2;
            jv0Var.b = measuredHeight2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.FrameLayout, qh.x9] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.s2;
        if (r02 == 0) {
            return super.onTouchEvent(motionEvent);
        }
        r02.m(motionEvent);
        return true;
    }
}
