// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yr8 extends View {
    public static final /* synthetic */ int r = 0;
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final vu7 f;
    public boolean h;
    public final /* synthetic */ ProfileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        vu7 adapter = profileActivity.o0.getAdapter();
        this.f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(hl.N(15.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(k43.j);
        ofFloat.addUpdateListener(new pv7(this, (byte) 19));
        ofFloat.addListener(new gf4((byte) 25, this, profileActivity.n1));
        profileActivity.o0.b(new fi2(this, (byte) 1));
        adapter.a.registerObserver(new u43(this, (byte) 2));
    }

    public final void a(boolean z) {
        a aVar;
        int i;
        a aVar2;
        ProfileActivity profileActivity = this.n;
        if (z) {
            xr8 xr8Var = profileActivity.N;
            xr8Var.K = xr8Var.M;
            xr8Var.L = xr8Var.N;
            xr8Var.O = 0.0f;
            xr8Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - hl.L(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (hl.N(16.0f) + measureText);
        aVar = ((e) profileActivity).actionBar;
        if (aVar != null) {
            aVar2 = ((e) profileActivity).actionBar;
            if (aVar2.getOccupyStatusBar()) {
                i = hl.m;
                float L = hl.L(15.0f) + i;
                rectF.top = L;
                rectF.bottom = L + hl.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i = 0;
        float L2 = hl.L(15.0f) + i;
        rectF.top = L2;
        rectF.bottom = L2 + hl.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f) {
        ProfileActivity profileActivity = this.n;
        boolean z = profileActivity.q2 && profileActivity.o0.getRealCount() > 20;
        if (z != this.h) {
            this.h = z;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float S1 = hl.S1(animatedFraction, fArr);
            if (f <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z) {
                valueAnimator.setDuration((long) (((1.0f - S1) * 250.0f) / f));
            } else {
                valueAnimator.setDuration((long) ((250.0f * S1) / f));
            }
            fArr[0] = S1;
            fArr[1] = z ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        jq8 jq8Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.T0 == null || (jq8Var = profileActivity.o0) == null || !profileActivity.q2) {
            return;
        }
        int realPosition = jq8Var.getRealPosition();
        sla slaVar = profileActivity.T0;
        if (realPosition == 0) {
            slaVar.u(33);
            profileActivity.T0.S(36);
        } else {
            slaVar.S(33);
            profileActivity.T0.u(36);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float N = hl.N(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f.d(this.n.o0.getCurrentItem())).toString(), rectF.centerX(), hl.N(18.5f) + rectF.top, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        a(false);
    }
}
