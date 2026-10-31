package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w2 extends FrameLayout {
    public final ag.d2 a;
    public final og.c b;
    public final TextView[] c;
    public fi0 d;
    public final y2 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public w2(Context context, y2 y2Var) {
        super(context);
        this.c = new TextView[2];
        this.e = y2Var;
        ag.d2 d2Var = new ag.d2(this, context, 11);
        this.a = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        addView(d2Var, w7.b6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        og.c cVar = new og.c(context, 5);
        this.b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(org.telegram.messenger.i0.o());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(org.telegram.messenger.i0.L(4.0f));
        cVar.setPivotX(0.0f);
        zs.i(cVar);
        addView(cVar, w7.b6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextSize(1, 12.0f);
            this.c[i10].setMaxLines(1);
            this.c[i10].setSingleLine(true);
            this.c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i10].setTextColor(-1);
            this.c[i10].setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(1.0f));
            addView(this.c[i10], w7.b6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f10;
        d5 d5Var;
        y2 y2Var = this.e;
        if ((y2Var == null || y2Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (y2Var == null || (d5Var = y2Var.b) == null || d5Var.I) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.i0.r) / 300.0f), 1.0f, 0.0f);
            }
            z11 = true;
            f10 = 1.0f;
        } else {
            this.h = 1.0f;
            f10 = d5Var.h;
            if (!this.n) {
                this.n = true;
            }
            z11 = false;
        }
        fi0 fi0Var = this.d;
        ag.d2 d2Var = this.a;
        if (fi0Var == null) {
            fi0 fi0Var2 = new fi0(d2Var);
            this.d = fi0Var2;
            fi0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = d2Var.getImageReceiver();
        float z12 = sc.e.z(1.0f, this.h, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(3.0f));
        this.d.f((int) (rectF.left - z12), (int) (rectF.top - z12), (int) (rectF.right + z12), (int) (rectF.bottom + z12));
        this.d.e(true, z11 ? 1.0f : Utilities.i(f10, 1.0f, 0.0f));
        if (this.r && z11 && this.d.f >= 0.9f) {
            this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.i0.r) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f7 != 1.0f) {
                Paint t10 = w5.t(imageReceiver, false);
                t10.setAlpha((int) (this.h * 255.0f));
                fi0 fi0Var3 = this.d;
                fi0Var3.t = t10;
                fi0Var3.a(canvas);
            }
            if (this.f == null) {
                Paint paint = new Paint(1);
                this.f = paint;
                paint.setColor(-1);
                this.f.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                this.f.setStyle(Paint.Style.STROKE);
                this.f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f.setAlpha((int) (255.0f * f7 * this.h));
            fi0 fi0Var4 = this.d;
            fi0Var4.t = this.f;
            fi0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        TextView[] textViewArr = this.c;
        if (!z10) {
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(1.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[1].setVisibility(8);
            textViewArr[1].setAlpha(0.0f);
            return;
        }
        textViewArr[1].setOnClickListener(null);
        textViewArr[1].setText(textViewArr[0].getText());
        textViewArr[1].setVisibility(0);
        textViewArr[1].setAlpha(1.0f);
        textViewArr[1].setTranslationY(0.0f);
        textViewArr[0].setText(charSequence);
        textViewArr[0].setVisibility(0);
        textViewArr[0].setAlpha(0.0f);
        textViewArr[0].setTranslationY(-org.telegram.messenger.i0.L(4.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 17));
        this.s.addListener(new sg.r(this, 7));
        this.s.setInterpolator(gr.h);
        this.s.setDuration(340L);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOnSubtitleClick(View.OnClickListener onClickListener) {
        TextView[] textViewArr = this.c;
        textViewArr[0].setOnClickListener(onClickListener);
        textViewArr[0].setClickable(onClickListener != null);
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.t6.h0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
