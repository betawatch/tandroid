package vg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import gi.l3;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.xq;
import org.telegram.ui.v5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r extends View {
    public final /* synthetic */ LimitPreviewView E;
    public final Path a;
    public final CornerPathEffect b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public SpannableStringBuilder f;
    public final ArrayList h;
    public StaticLayout n;
    public boolean r;
    public float s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.E = limitPreviewView;
        this.a = new Path();
        this.b = new CornerPathEffect(org.telegram.messenger.g0.L(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.x = paint;
        Paint paint2 = new Paint();
        this.y = paint2;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(r rVar) {
        ArrayList arrayList = rVar.h;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((q) arrayList.get(i3)).f != null) {
                return;
            }
        }
        arrayList.clear();
        rVar.r = false;
        rVar.invalidate();
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, boolean z10) {
        TextPaint textPaint;
        if (!z10) {
            this.f = spannableStringBuilder;
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = this.f;
        this.f = spannableStringBuilder;
        if (this.d == null) {
            return;
        }
        ArrayList arrayList = this.h;
        arrayList.clear();
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(this.f);
        int length = this.f.length() - 1;
        int i3 = 0;
        while (true) {
            textPaint = this.c;
            if (length < 0) {
                break;
            }
            char charAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
            if (charAt != this.f.charAt(length) && Character.isDigit(this.f.charAt(length))) {
                q qVar = new q();
                arrayList.add(qVar);
                qVar.e = this.d.getSecondaryHorizontal(length);
                qVar.a = true;
                if (i3 >= 1) {
                    i3 = 0;
                }
                i3++;
                String str = "" + charAt;
                int i10 = (int) this.e;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout = new StaticLayout(str, textPaint, i10, alignment, 1.0f, 0.0f, false);
                ArrayList arrayList2 = qVar.b;
                arrayList2.add(staticLayout);
                arrayList2.add(new StaticLayout("" + this.f.charAt(length), textPaint, (int) this.e, alignment, 1.0f, 0.0f, false));
                spannableStringBuilder3.setSpan(new fy(false), length, length + 1, 0);
            }
            length--;
        }
        this.n = new StaticLayout(spannableStringBuilder3, textPaint, org.telegram.messenger.g0.L(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            this.r = true;
            q qVar2 = (q) arrayList.get(i11);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            qVar2.f = ofFloat;
            ofFloat.addUpdateListener(new o(this, qVar2, 0));
            qVar2.f.addListener(new p(this, qVar2, 1));
            qVar2.f.setInterpolator(xq.g);
            qVar2.f.setDuration(250L);
            qVar2.f.setStartDelay(((arrayList.size() - 1) - i11) * 60);
            qVar2.f.start();
        }
    }

    public final void c() {
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        float measuredWidth = getMeasuredWidth() * this.s;
        float i3 = Utilities.i(org.telegram.messenger.g0.L(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float i10 = Utilities.i(org.telegram.messenger.g0.L(10.0f) + measuredWidth, getMeasuredWidth(), org.telegram.messenger.g0.L(24.0f));
        float i11 = Utilities.i(measuredWidth - org.telegram.messenger.g0.L(this.s >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
        float i12 = Utilities.i(measuredWidth - org.telegram.messenger.g0.L(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.a;
        path.rewind();
        float f10 = measuredHeight;
        float f11 = f10 - (f10 / 2.0f);
        path.moveTo(i11, f11 - org.telegram.messenger.g0.L(2.0f));
        path.lineTo(i11, f10);
        path.lineTo(i12, f10);
        path.lineTo(measuredWidth, org.telegram.messenger.g0.L(8.0f) + measuredHeight);
        if (this.s < 0.7f) {
            path.lineTo(i3, f10);
        }
        path.lineTo(i10, f10);
        path.lineTo(i10, f11 - org.telegram.messenger.g0.L(2.0f));
        path.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f);
        LimitPreviewView limitPreviewView = this.E;
        Paint paint = limitPreviewView.L;
        if (limitPreviewView.K) {
            measuredHeight = getMeasuredHeight();
            ha.e d = ha.e.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, org.telegram.messenger.g0.L(3.0f), getMeasuredWidth(), measuredHeight - org.telegram.messenger.g0.L(3.0f));
            float f10 = measuredHeight / 2.0f;
            ha.e d10 = ha.e.d();
            if (((Paint) d10.d) == null) {
                d10.d = new Paint(1);
            }
            ((Paint) d10.d).setColor(k6.x0(null, k6.Ci, false));
            canvas.drawRoundRect(rectF, f10, f10, (Paint) d10.d);
        } else {
            if (this.w) {
                this.w = false;
                c();
            }
            ha.e d11 = ha.e.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d11.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z10 = limitPreviewView.S;
            TextPaint textPaint = this.c;
            canvas.drawRoundRect(rectF2, f12, f12, z10 ? paint : limitPreviewView.f0 != null ? textPaint : ha.e.d().e());
            Paint e10 = ha.e.d().e();
            CornerPathEffect cornerPathEffect = this.b;
            e10.setPathEffect(cornerPathEffect);
            if (limitPreviewView.f0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.S) {
                paint = limitPreviewView.f0 != null ? textPaint : ha.e.d().e();
            }
            canvas.drawPath(this.a, paint);
            ha.e.d().e().setPathEffect(null);
            if (limitPreviewView.f0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.e0) {
                invalidate();
            }
        }
        int i3 = measuredHeight;
        if (limitPreviewView.f0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x, 31);
        }
        float measuredWidth3 = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i3 - this.d.getHeight()) / 2.0f;
        if (this.r) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f));
            if (this.n != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.n.draw(canvas);
                canvas.restore();
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 >= arrayList.size()) {
                    break;
                }
                q qVar = (q) arrayList.get(i10);
                canvas.save();
                boolean z11 = qVar.a;
                ArrayList arrayList2 = qVar.b;
                if (z11) {
                    canvas.translate(qVar.e + measuredWidth3, ((i3 * qVar.c) + height) - ((1 - arrayList2.size()) * i3));
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        canvas.translate(0.0f, -i3);
                        ((StaticLayout) arrayList2.get(i11)).draw(canvas);
                    }
                } else if (qVar.d) {
                    canvas.translate(qVar.e + measuredWidth3, (height - ((i3 * 10) * qVar.c)) + ((10 - arrayList2.size()) * i3));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, i3);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else {
                    canvas.translate(qVar.e + measuredWidth3, (((i3 * 10) * qVar.c) + height) - ((10 - arrayList2.size()) * i3));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, -i3);
                        ((StaticLayout) arrayList2.get(i13)).draw(canvas);
                    }
                }
                canvas.restore();
                i10++;
            }
            canvas.restore();
        } else if (this.d != null) {
            canvas.save();
            canvas.translate(measuredWidth3, height);
            this.d.draw(canvas);
            canvas.restore();
        }
        if (limitPreviewView.f0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.y, 31);
            canvas.drawRect(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(10.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(10.0f), ((v5) ((org.telegram.ui.x0) limitPreviewView.f0).b).v0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        SpannableStringBuilder spannableStringBuilder = this.f;
        TextPaint textPaint = this.c;
        this.e = l3.h(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f, textPaint, org.telegram.messenger.g0.L(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.e = Math.max(this.e, this.d.getLineWidth(i11));
        }
        setMeasuredDimension((int) (this.e + getPaddingRight() + getPaddingLeft()), org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.L(44.0f));
        c();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
            invalidate();
        }
    }
}
