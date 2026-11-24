// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class v28 extends FrameLayout {
    public final kb0 a;
    public final df0 b;
    public final TextView[] c;
    public ty8 d;
    public final x28 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public v28(Context context, x28 x28Var) {
        super(context);
        this.c = new TextView[2];
        this.e = x28Var;
        kb0 kb0Var = new kb0((byte) 8, context, this);
        this.a = kb0Var;
        kb0Var.setRoundRadius(gl.L(16.0f));
        addView(kb0Var, nme.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        df0 df0Var = new df0(context, (byte) 3);
        this.b = df0Var;
        df0Var.setTextSize(14);
        df0Var.setTypeface(gl.o());
        df0Var.setMaxLines(1);
        df0Var.setEllipsizeByGradient(gl.L(4.0f));
        df0Var.setPivotX(0.0f);
        kk7.i(df0Var);
        addView(df0Var, nme.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i = 0; i < 2; i++) {
            this.c[i] = new TextView(context);
            this.c[i].setTextSize(1, 12.0f);
            this.c[i].setMaxLines(1);
            this.c[i].setSingleLine(true);
            this.c[i].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i].setTextColor(-1);
            this.c[i].setPadding(gl.L(3.0f), 0, gl.L(3.0f), gl.L(1.0f));
            addView(this.c[i], nme.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void a(float f, Canvas canvas, RectF rectF, boolean z) {
        boolean z2;
        float f2;
        f2b f2bVar;
        x28 x28Var = this.e;
        if ((x28Var == null || x28Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (x28Var == null || (f2bVar = x28Var.b) == null || f2bVar.J) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.i(this.h - ((1000.0f / gl.r) / 300.0f), 1.0f, 0.0f);
            }
            z2 = true;
            f2 = 1.0f;
        } else {
            this.h = 1.0f;
            f2 = f2bVar.h;
            if (!this.n) {
                this.n = true;
            }
            z2 = false;
        }
        ty8 ty8Var = this.d;
        kb0 kb0Var = this.a;
        if (ty8Var == null) {
            ty8 ty8Var2 = new ty8(kb0Var);
            this.d = ty8Var2;
            ty8Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = kb0Var.getImageReceiver();
        float B = ls6.B(1.0f, this.h, gl.L(6.0f), gl.L(3.0f));
        this.d.f((int) (rectF.left - B), (int) (rectF.top - B), (int) (rectF.right + B), (int) (rectF.bottom + B));
        this.d.e(true, z2 ? 1.0f : Utilities.i(f2, 1.0f, 0.0f));
        if (this.r && z2 && this.d.f >= 0.9f) {
            this.h = Utilities.i(this.h - ((1000.0f / gl.r) / 300.0f), 1.0f, 0.0f);
        }
        if (z) {
            if (f != 1.0f) {
                Paint t = x2b.t(imageReceiver, false);
                t.setAlpha((int) (this.h * 255.0f));
                ty8 ty8Var3 = this.d;
                ty8Var3.r = t;
                ty8Var3.a(canvas);
            }
            if (this.f == null) {
                Paint paint = new Paint(1);
                this.f = paint;
                paint.setColor(-1);
                this.f.setStrokeWidth(gl.L(2.0f));
                this.f.setStyle(Paint.Style.STROKE);
                this.f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f.setAlpha((int) (255.0f * f * this.h));
            ty8 ty8Var4 = this.d;
            ty8Var4.r = this.f;
            ty8Var4.a(canvas);
        }
    }

    public final void b(CharSequence charSequence, boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        TextView[] textViewArr = this.c;
        if (!z) {
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
        textViewArr[0].setTranslationY(-gl.L(4.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new u28(this, (byte) 0));
        this.s.addListener(new v85(this, (byte) 29));
        this.s.setInterpolator(s33.h);
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
        textViewArr[0].setBackground(onClickListener == null ? null : bkb.f0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        b(charSequence, false);
    }
}
