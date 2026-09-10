package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x2 extends FrameLayout {
    public final gg.i1 a;
    public final org.telegram.ui.Cells.f4 b;
    public final TextView[] c;
    public lj0 d;
    public final z2 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public x2(Context context, z2 z2Var) {
        super(context);
        this.c = new TextView[2];
        this.e = z2Var;
        gg.i1 i1Var = new gg.i1(this, context, 11);
        this.a = i1Var;
        i1Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(i1Var, w7.a6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        org.telegram.ui.Cells.f4 f4Var = new org.telegram.ui.Cells.f4(context, 5);
        this.b = f4Var;
        f4Var.setTextSize(14);
        f4Var.setTypeface(AndroidUtilities.bold());
        f4Var.setMaxLines(1);
        f4Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        f4Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(f4Var);
        addView(f4Var, w7.a6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextSize(1, 12.0f);
            this.c[i10].setMaxLines(1);
            this.c[i10].setSingleLine(true);
            this.c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i10].setTextColor(-1);
            this.c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.c[i10], w7.a6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        h5 h5Var;
        z2 z2Var = this.e;
        if ((z2Var == null || z2Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (z2Var == null || (h5Var = z2Var.b) == null || h5Var.I) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            f10 = 1.0f;
            z11 = true;
        } else {
            this.h = 1.0f;
            f10 = h5Var.h;
            if (!this.n) {
                this.n = true;
            }
            z11 = false;
        }
        lj0 lj0Var = this.d;
        gg.i1 i1Var = this.a;
        if (lj0Var == null) {
            lj0 lj0Var2 = new lj0(i1Var);
            this.d = lj0Var2;
            lj0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = i1Var.getImageReceiver();
        float a2 = com.google.android.gms.internal.vision.e2.a(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        this.d.f((int) (rectF.left - a2), (int) (rectF.top - a2), (int) (rectF.right + a2), (int) (rectF.bottom + a2));
        this.d.e(z11 ? 1.0f : Utilities.clamp(f10, 1.0f, 0.0f), true);
        if (this.r && z11 && this.d.f >= 0.9f) {
            this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f7 != 1.0f) {
                Paint t10 = a6.t(imageReceiver, false);
                t10.setAlpha((int) (this.h * 255.0f));
                lj0 lj0Var3 = this.d;
                lj0Var3.t = t10;
                lj0Var3.a(canvas);
            }
            if (this.f == null) {
                Paint paint = new Paint(1);
                this.f = paint;
                paint.setColor(-1);
                this.f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.f.setStyle(Paint.Style.STROKE);
                this.f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f.setAlpha((int) (255.0f * f7 * this.h));
            lj0 lj0Var4 = this.d;
            lj0Var4.t = this.f;
            lj0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        int i10 = 8;
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
        textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new qg.o(this, 22));
        this.s.addListener(new yg.b(this, i10));
        this.s.setInterpolator(wr.h);
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
