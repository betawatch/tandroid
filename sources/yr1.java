// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yr1 extends FrameLayout {
    public float a;
    public float b;
    public final /* synthetic */ mu1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr1(mu1 mu1Var, Activity activity) {
        super(activity);
        this.c = mu1Var;
        setOnLongClickListener(new zs(this, (byte) 2));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        mu1 mu1Var = this.c;
        if (view == mu1Var.O2) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), gl.L(48.0f));
        }
        jia[] jiaVarArr = mu1Var.S2;
        if (view != jiaVarArr[0] && view != jiaVarArr[1]) {
            boolean drawChild = super.drawChild(canvas, view, j);
            if (view == mu1Var.O2) {
                canvas.restore();
            }
            return drawChild;
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth() - gl.L(38.0f), getMeasuredHeight());
        boolean drawChild2 = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mu1 mu1Var = this.c;
        if (!mu1Var.P2) {
            return;
        }
        int i3 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = mu1Var.W2;
            if (i3 >= animatorSetArr.length) {
                mu1Var.P2 = false;
                return;
            }
            AnimatorSet animatorSet = animatorSetArr[i3];
            if (animatorSet != null) {
                animatorSet.start();
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a = motionEvent.getY();
        int action = motionEvent.getAction();
        mu1 mu1Var = this.c;
        if (action == 1) {
            mu1Var.finishPreviewFragment();
        } else if (motionEvent.getAction() == 2) {
            float f = this.b - this.a;
            mu1Var.movePreviewFragment(f);
            if (f < 0.0f) {
                this.b = this.a;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
