// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qs0 extends View {
    public final im0 a;
    public final TextPaint b;
    public final TextPaint c;
    public final RectF d;
    public final RectF e;
    public StaticLayout f;
    public StaticLayout h;
    public float n;
    public float r;
    public float s;
    public final /* synthetic */ rs0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs0(rs0 rs0Var, Context context, eh0 eh0Var) {
        super(context);
        this.w = rs0Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        this.d = new RectF();
        this.e = new RectF();
        this.s = 1.0f;
        im0 c = eh0Var.c.c(this, null, false);
        this.a = c;
        c.r(gm.L(23.0f));
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(16.0f));
        textPaint2.setTextSize(gm.L(13.0f));
        setOnClickListener(new j1(this, (byte) 22));
    }

    public static void a(Canvas canvas, View view, RectF rectF, float f, float f2, float f3) {
        if (view == null || rectF.isEmpty() || f2 <= 0.0f) {
            return;
        }
        canvas.saveLayerAlpha((rectF.left + f) - rectF.width(), (rectF.top + 0.0f) - rectF.height(), rectF.width() + rectF.right + f, rectF.height() + rectF.bottom + 0.0f, (int) (f2 * 255.0f));
        canvas.translate(rectF.left + f, rectF.top + 0.0f);
        canvas.scale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
        view.draw(canvas);
        canvas.restore();
    }

    public final void b() {
        rja rjaVar;
        rja rjaVar2;
        rja rjaVar3;
        rs0 rs0Var = this.w;
        rjaVar = ((d) rs0Var).simpleActionBar;
        View backButton = rjaVar.getBackButton();
        if (backButton == null || this.f == null) {
            return;
        }
        rjaVar2 = ((d) rs0Var).simpleActionBar;
        if (rjaVar2.getHeight() != 0) {
            rjaVar3 = ((d) rs0Var).simpleActionBar;
            float height = (backButton.getHeight() / 2.0f) + backButton.getY() + rjaVar3.getTop();
            float height2 = backButton.getHeight();
            float max = (Math.max(this.n, this.r) + gm.L(36.0f)) / 2.0f;
            float f = height2 / 2.0f;
            this.d.set((getWidth() / 2.0f) - max, height - f, (getWidth() / 2.0f) + max, height + f);
            invalidate();
        }
    }

    public final void c() {
        String r;
        String p;
        rs0 rs0Var = this.w;
        TLRPC.User W1 = rs0Var.getMessagesController().W1(Long.valueOf(rs0Var.a));
        int themedColor = rs0Var.getThemedColor(cmb.F6);
        TextPaint textPaint = this.b;
        textPaint.setColor(themedColor);
        int themedColor2 = rs0Var.getThemedColor(cmb.x6);
        TextPaint textPaint2 = this.c;
        textPaint2.setColor(themedColor2);
        if (W1 == null) {
            r = "";
            p = null;
        } else {
            r = m9c.r(W1);
            p = m9c.p(W1);
        }
        String M0 = TextUtils.isEmpty(p) ? jb6.M0(2131753121, null) : b10.h("@", p);
        float c = b10.c(156.0f, getWidth(), gm.L(40.0f));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(r, textPaint, c, truncateAt);
        CharSequence ellipsize2 = TextUtils.ellipsize(M0, textPaint2, c, truncateAt);
        this.n = textPaint.measureText(ellipsize, 0, ellipsize.length());
        this.r = textPaint2.measureText(ellipsize2, 0, ellipsize2.length());
        int ceil = ((int) Math.ceil(this.n)) + 1;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f = new StaticLayout(ellipsize, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(ellipsize2, textPaint2, ((int) Math.ceil(this.r)) + 1, alignment, 1.0f, 0.0f, false);
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        TextPaint textPaint;
        float f4;
        RectF rectF;
        float f5;
        float f6;
        float f7;
        Canvas canvas2 = canvas;
        if (this.f != null) {
            RectF rectF2 = this.d;
            if (rectF2.isEmpty()) {
                return;
            }
            rs0 rs0Var = this.w;
            eq eqVar = rs0Var.s;
            RectF rectF3 = this.e;
            if (eqVar == null) {
                rectF3.set(rectF2);
                f = 1.0f;
                f2 = 1.0f;
            } else {
                if (!rs0Var.w) {
                    return;
                }
                float f8 = rs0Var.x;
                float interpolation = d53.g.getInterpolation(Math.min(1.0f, 1.15f * f8));
                RectF rectF4 = (RectF) eqVar.a;
                rectF3.set(gm.R1(rectF4.left, rectF2.left, interpolation), gm.R1(rectF4.top, rectF2.top, interpolation), gm.R1(rectF4.right, rectF2.right, interpolation), gm.R1(rectF4.bottom, rectF2.bottom, interpolation));
                f = f8;
                f2 = interpolation;
            }
            int L = gm.L(6.0f);
            float height = rectF3.height() / 2.0f;
            im0 im0Var = this.a;
            im0Var.r(height);
            im0Var.setBounds(((int) rectF3.left) - L, ((int) rectF3.top) - L, ((int) rectF3.right) + L, ((int) rectF3.bottom) + L);
            im0Var.draw(canvas2);
            float centerY = rectF3.centerY() - ((this.h.getHeight() + this.f.getHeight()) / 2.0f);
            float centerX = rectF3.centerX() - (this.n / 2.0f);
            float centerX2 = rectF3.centerX() - (this.r / 2.0f);
            canvas2.save();
            canvas2.clipRect(rectF3);
            TextPaint textPaint2 = this.c;
            TextPaint textPaint3 = this.b;
            if (eqVar != null) {
                RectF rectF5 = (RectF) eqVar.c;
                float min = 1.0f - Math.min(1.0f, 1.6f * f);
                float f9 = rectF3.left - ((RectF) eqVar.a).left;
                if (min > 0.0f) {
                    f3 = 2.0f;
                    textPaint = textPaint3;
                    rectF = rectF5;
                    f4 = 0.0f;
                    a(canvas, ((pr1) eqVar.f).e, (RectF) eqVar.b, f9, min, gm.R1(1.0f, 0.6f, 1.0f - min));
                    a(canvas, ((pr1) eqVar.f).getSubtitleTextView(), (RectF) eqVar.d, f9, min, 1.0f);
                } else {
                    textPaint = textPaint3;
                    f4 = 0.0f;
                    f3 = 2.0f;
                    rectF = rectF5;
                }
                lka titleTextView = ((pr1) eqVar.f).getTitleTextView();
                float textSize = titleTextView.getTextPaint().getTextSize();
                float textSize2 = textSize > f4 ? textPaint.getTextSize() / textSize : 1.0f;
                float textWidth = (titleTextView.getTextWidth() / f3) + rectF.left + titleTextView.getPaddingLeft();
                float centerY2 = rectF.centerY();
                float height2 = (this.f.getHeight() / f3) + centerY;
                float R1 = gm.R1(textWidth, rectF3.centerX(), f2);
                float R12 = gm.R1(centerY2, height2, f2);
                float f10 = 1.0f;
                float min2 = Math.min(1.0f, 2.4f * f);
                if (min2 < 1.0f) {
                    f6 = R12;
                    f7 = f;
                    f5 = textSize2;
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) ((1.0f - min2) * 255.0f));
                    float R13 = gm.R1(1.0f, f5, f2);
                    canvas2.translate(R1, f6);
                    canvas2.scale(R13, R13);
                    canvas2.translate(-((titleTextView.getTextWidth() / f3) + titleTextView.getPaddingLeft()), (-rectF.height()) / f3);
                    titleTextView.draw(canvas2);
                    canvas2.restore();
                    f10 = 1.0f;
                } else {
                    f5 = textSize2;
                    f6 = R12;
                    f7 = f;
                    canvas2 = canvas;
                }
                this.s = gm.R1(f10 / f5, f10, f2);
                centerX = R1 - (this.n / f3);
                centerY = f6 - (this.f.getHeight() / f3);
                textPaint.setAlpha((int) (min2 * 255.0f));
                textPaint2.setAlpha((int) (Math.max(0.0f, (f7 - 0.25f) / 0.75f) * 255.0f));
            } else {
                f3 = 2.0f;
                textPaint3.setAlpha(nm7.d4);
                textPaint2.setAlpha(nm7.d4);
            }
            canvas2.save();
            canvas2.translate(centerX, centerY);
            float f11 = this.s;
            canvas2.scale(f11, f11, this.n / f3, this.f.getHeight() / f3);
            this.f.draw(canvas2);
            canvas2.restore();
            this.s = 1.0f;
            canvas2.save();
            canvas2.translate(centerX2, centerY + this.f.getHeight());
            this.h.draw(canvas2);
            canvas2.restore();
            canvas2.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            c();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e.contains(motionEvent.getX(), motionEvent.getY()) || motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
