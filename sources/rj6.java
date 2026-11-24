// default package

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class rj6 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ty0 c;
    public long d;

    public final void a(ArrayList arrayList, boolean z) {
        TextView textView = this.b;
        ty0 ty0Var = this.c;
        super.setEnabled(z);
        TextView textView2 = this.a;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", z ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(ty0Var, "alpha", z ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z ? 1.0f : 0.5f));
        } else {
            textView2.setAlpha(z ? 1.0f : 0.5f);
            ty0Var.setAlpha(z ? 1.0f : 0.5f);
            textView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public long getSize() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(80.0f), TLObject.FLAG_30));
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(80.0f));
        int measuredWidth = getMeasuredWidth() - gl.L(42.0f);
        TextView textView = this.b;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec(b00.c(8.0f, measuredWidth - textView.getMeasuredWidth(), gl.L(10.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), TLObject.FLAG_30));
        this.c.measure(ug8.f(20.0f, getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setSize(long j) {
        float max;
        float f;
        float f2;
        this.d = j;
        this.b.setText(k96.a0("AutodownloadSizeLimitUpTo", null, 2131753769, gl.i0(j, false, false)));
        long j2 = j - 512000;
        if (j2 < 536576) {
            f2 = Math.max(0.0f, j2 / 536576.0f) * 0.25f;
        } else {
            long j3 = j - 1048576;
            if (j3 < 9437184) {
                f2 = (Math.max(0.0f, j3 / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j4 = j - 10485760;
                if (j4 < 94371840) {
                    max = Math.max(0.0f, j4 / 9.437184E7f) * 0.25f;
                    f = 0.5f;
                } else {
                    max = Math.max(0.0f, (j - 104857600) / 1.9922944E9f) * 0.25f;
                    f = 0.75f;
                }
                f2 = max + f;
            }
        }
        this.c.setProgress(Math.min(1.0f, f2));
    }

    public void setText(String str) {
        this.a.setText(str);
    }
}
