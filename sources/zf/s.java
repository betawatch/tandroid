package zf;

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
import java.util.ArrayList;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.u5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s extends View {
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
    public boolean v;
    public final Paint w;
    public final Paint x;
    public final /* synthetic */ LimitPreviewView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.y = limitPreviewView;
        this.a = new Path();
        this.b = new CornerPathEffect(AndroidUtilities.dp(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.w = paint;
        Paint paint2 = new Paint();
        this.x = paint2;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public static void a(s sVar) {
        ArrayList arrayList = sVar.h;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (((r) arrayList.get(i9)).f != null) {
                return;
            }
        }
        arrayList.clear();
        sVar.r = false;
        sVar.invalidate();
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        float measuredWidth = getMeasuredWidth() * this.s;
        float clamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float clamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
        float clamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(this.s >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
        float clamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.a;
        path.rewind();
        float f10 = measuredHeight;
        float f11 = f10 - (f10 / 2.0f);
        path.moveTo(clamp3, f11 - AndroidUtilities.dp(2.0f));
        path.lineTo(clamp3, f10);
        path.lineTo(clamp4, f10);
        path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
        if (this.s < 0.7f) {
            path.lineTo(clamp, f10);
        }
        path.lineTo(clamp2, f10);
        path.lineTo(clamp2, f11 - AndroidUtilities.dp(2.0f));
        path.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        LimitPreviewView limitPreviewView = this.y;
        Paint paint = limitPreviewView.G;
        if (limitPreviewView.F) {
            measuredHeight = getMeasuredHeight();
            a1 d = a1.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
            float f10 = measuredHeight / 2.0f;
            a1 d9 = a1.d();
            if (d9.c == null) {
                d9.c = new Paint(1);
            }
            d9.c.setColor(f6.w0(null, f6.Oh, false));
            canvas.drawRoundRect(rectF, f10, f10, d9.c);
        } else {
            if (this.v) {
                this.v = false;
                b();
            }
            a1 d10 = a1.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d10.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f11 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f11);
            float f12 = f11 / 2.0f;
            boolean z10 = limitPreviewView.N;
            TextPaint textPaint = this.c;
            canvas.drawRoundRect(rectF2, f12, f12, z10 ? paint : limitPreviewView.a0 != null ? textPaint : a1.d().e());
            Paint e10 = a1.d().e();
            CornerPathEffect cornerPathEffect = this.b;
            e10.setPathEffect(cornerPathEffect);
            if (limitPreviewView.a0 != null) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.N) {
                paint = limitPreviewView.a0 != null ? textPaint : a1.d().e();
            }
            canvas.drawPath(this.a, paint);
            a1.d().e().setPathEffect(null);
            if (limitPreviewView.a0 != null) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.W) {
                invalidate();
            }
        }
        int i9 = measuredHeight;
        if (limitPreviewView.a0 != null) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.w, 31);
        }
        float measuredWidth3 = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i9 - this.d.getHeight()) / 2.0f;
        if (this.r) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
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
                r rVar = (r) arrayList.get(i10);
                canvas.save();
                boolean z11 = rVar.a;
                ArrayList arrayList2 = rVar.b;
                if (z11) {
                    canvas.translate(rVar.e + measuredWidth3, ((i9 * rVar.c) + height) - ((1 - arrayList2.size()) * i9));
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        canvas.translate(0.0f, -i9);
                        ((StaticLayout) arrayList2.get(i11)).draw(canvas);
                    }
                } else if (rVar.d) {
                    canvas.translate(rVar.e + measuredWidth3, (height - ((i9 * 10) * rVar.c)) + ((10 - arrayList2.size()) * i9));
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        canvas.translate(0.0f, i9);
                        ((StaticLayout) arrayList2.get(i12)).draw(canvas);
                    }
                } else {
                    canvas.translate(rVar.e + measuredWidth3, (((i9 * 10) * rVar.c) + height) - ((10 - arrayList2.size()) * i9));
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        canvas.translate(0.0f, -i9);
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
        if (limitPreviewView.a0 != null) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x, 31);
            canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((u5) ((org.telegram.ui.b1) limitPreviewView.a0).b).s0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        SpannableStringBuilder spannableStringBuilder = this.f;
        TextPaint textPaint = this.c;
        this.e = x3.g(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        for (int i11 = 0; i11 < this.d.getLineCount(); i11++) {
            this.e = Math.max(this.e, this.d.getLineWidth(i11));
        }
        setMeasuredDimension((int) (this.e + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
        b();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        if (f10 != getTranslationX()) {
            super.setTranslationX(f10);
            invalidate();
        }
    }
}
