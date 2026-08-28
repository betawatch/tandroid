package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yk extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ qn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(qn qnVar, Activity activity) {
        super(activity);
        this.c = qnVar;
        setOnLongClickListener(new u(this, 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        qn qnVar = this.c;
        if (view == qnVar.v2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), AndroidUtilities.dp(48.0f));
        }
        org.telegram.ui.ActionBar.h5[] h5VarArr = qnVar.z2;
        if (view != h5VarArr[0] && view != h5VarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j10);
            if (view == qnVar.v2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - AndroidUtilities.dp(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        qn qnVar = this.c;
        if (!qnVar.w2) {
            return;
        }
        int i11 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = qnVar.D2;
            if (i11 >= animatorSetArr.length) {
                qnVar.w2 = false;
                return;
            }
            AnimatorSet animatorSet = animatorSetArr[i11];
            if (animatorSet != null) {
                animatorSet.start();
            }
            i11++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getY();
        int action = motionEvent.getAction();
        qn qnVar = this.c;
        if (action == 1) {
            qnVar.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f10 = this.b - this.a;
            qnVar.movePreviewFragment(f10);
            if (f10 < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
