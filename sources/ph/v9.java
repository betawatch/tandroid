package ph;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.of0;
import org.telegram.ui.Components.zh;
import org.telegram.ui.nw0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v9 extends FrameLayout {
    public float a;
    public float b;
    public final Paint c;
    public LinearGradient d;
    public final /* synthetic */ da e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(da daVar, Activity activity) {
        super(activity);
        this.e = daVar;
        this.c = new Paint(1);
    }

    public static void a(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_30));
    }

    public final void b(float f10) {
        float f11 = this.a;
        this.b = f10;
        super.setTranslationY(f11 + f10);
    }

    public final void c() {
        if (this.e.G == 0) {
            setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(12.0f), -16777216));
        } else {
            setBackground(null);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean drawChild = super.drawChild(canvas, view, j10);
        da daVar = this.e;
        if (view == daVar.e0) {
            float f10 = daVar.S ? AndroidUtilities.statusBarHeight : 0.0f;
            LinearGradient linearGradient = this.d;
            Paint paint = this.c;
            if (linearGradient == null) {
                LinearGradient linearGradient2 = new LinearGradient(0.0f, f10, 0.0f, f10 + AndroidUtilities.dp(72.0f), new int[]{TLObject.FLAG_30, 0}, new float[]{f10 / (AndroidUtilities.dp(72.0f) + f10), 1.0f}, Shader.TileMode.CLAMP);
                this.d = linearGradient2;
                paint.setShader(linearGradient2);
            }
            paint.setAlpha(255);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(84.0f) + f10);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
        return drawChild;
    }

    @Override // android.view.View
    public final void invalidate() {
        ValueAnimator valueAnimator = this.e.B;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        da daVar = this.e;
        int i14 = daVar.S ? daVar.W : 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        daVar.e0.layout(0, 0, daVar.P, daVar.Q);
        daVar.e0.setPivotX(daVar.P * 0.5f);
        FrameLayout frameLayout = daVar.f0;
        frameLayout.layout(0, i14, daVar.P, frameLayout.getMeasuredHeight() + i14);
        FrameLayout frameLayout2 = daVar.h0;
        frameLayout2.layout(0, daVar.Q - frameLayout2.getMeasuredHeight(), daVar.P, daVar.Q);
        FrameLayout frameLayout3 = daVar.j0;
        int i15 = daVar.Q;
        frameLayout3.layout(0, i15, daVar.P, frameLayout3.getMeasuredHeight() + i15);
        daVar.i0.layout(0, 0, daVar.P, daVar.Q);
        nw0 nw0Var = daVar.q0;
        if (nw0Var != null) {
            nw0Var.layout(0, 0, measuredWidth, measuredHeight);
        }
        daVar.s.c.layout(0, 0, measuredWidth, measuredHeight);
        zh zhVar = daVar.Z0.J;
        if (zhVar != null) {
            zhVar.layout(0, 0, daVar.P, daVar.Q);
            daVar.Z0.y();
        }
        of0 of0Var = daVar.y1;
        if (of0Var != null) {
            of0Var.layout(0, 0, of0Var.getMeasuredWidth(), daVar.y1.getMeasuredHeight());
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            h9Var.layout(0, 0, h9Var.getMeasuredWidth(), daVar.s1.getMeasuredHeight());
        }
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt instanceof n70) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            }
        }
        setPivotX(measuredWidth / 2.0f);
        setPivotY((-measuredHeight) * 0.2f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        da daVar = this.e;
        a(daVar.e0, daVar.P, daVar.Q);
        daVar.j();
        a(daVar.f0, daVar.P, AndroidUtilities.dp(150.0f));
        a(daVar.h0, daVar.P, AndroidUtilities.dp(220.0f));
        a(daVar.j0, daVar.P, daVar.R);
        a(daVar.i0, daVar.P, daVar.Q);
        a(daVar.s.c, size, size2);
        nw0 nw0Var = daVar.q0;
        if (nw0Var != null) {
            a(nw0Var, size, size2);
        }
        zh zhVar = daVar.Z0.J;
        if (zhVar != null) {
            a(zhVar, daVar.P, daVar.Q);
        }
        of0 of0Var = daVar.y1;
        if (of0Var != null) {
            a(of0Var, size, size2);
        }
        h9 h9Var = daVar.s1;
        if (h9Var != null) {
            a(h9Var, size, size2);
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof n70) {
                a(childAt, size, size2);
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        this.a = f10;
        super.setTranslationY(this.b + f10);
        float clamp = Utilities.clamp((f10 / getMeasuredHeight()) * 4.0f, 1.0f, 0.0f);
        da daVar = this.e;
        daVar.H = clamp;
        daVar.o();
        daVar.n.invalidate();
        float clamp2 = 1.0f - (Utilities.clamp(getTranslationY() / AndroidUtilities.dp(320.0f), 1.0f, 0.0f) * 0.1f);
        setScaleX(clamp2);
        setScaleY(clamp2);
    }
}
