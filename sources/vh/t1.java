package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t1 extends View {
    public final RectF D;
    public final RectF E;
    public float F;
    public v0 G;
    public int H;
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public StaticLayout r;
    public float s;
    public float w;
    public final RectF x;
    public final RectF y;

    public t1(Context context) {
        super(context);
        this.a = new TextPaint(1);
        this.b = new Paint(1);
        this.x = new RectF();
        this.y = new RectF();
        this.D = new RectF();
        this.E = new RectF();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawColor(-14737633);
        Paint paint = this.b;
        paint.setColor(-13224394);
        float f7 = this.F;
        int i10 = (int) f7;
        RectF rectF = this.D;
        RectF rectF2 = this.y;
        RectF rectF3 = this.x;
        RectF rectF4 = i10 <= 0 ? rectF3 : i10 == 1 ? rectF2 : rectF;
        int ceil = (int) Math.ceil(f7);
        RectF rectF5 = ceil <= 0 ? rectF3 : ceil == 1 ? rectF2 : rectF;
        float f10 = this.F;
        RectF rectF6 = this.E;
        org.telegram.messenger.i0.Z1(rectF4, rectF5, f10 - ((int) f10), rectF6);
        canvas.drawRoundRect(rectF6, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), paint);
        StaticLayout staticLayout = this.c;
        TextPaint textPaint = this.a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF3.left + org.telegram.messenger.i0.L(12.0f)) - this.e, c3.i0.B(rectF3.height(), this.c.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.b.f(Utilities.i(1.0f - Math.abs(this.F - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((rectF2.left + org.telegram.messenger.i0.L(12.0f)) - this.n, c3.i0.B(rectF2.height(), this.f.getHeight(), 2.0f, rectF2.top));
            textPaint.setColor(i0.b.f(Utilities.i(1.0f - Math.abs(this.F - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f.draw(canvas);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate((rectF.left + org.telegram.messenger.i0.L(12.0f)) - this.w, c3.i0.B(rectF.height(), this.r.getHeight(), 2.0f, rectF.top));
            textPaint.setColor(i0.b.f(Utilities.i(1.0f - Math.abs(this.F - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(40.0f) + org.telegram.messenger.i0.n);
        if (getMeasuredWidth() != this.H || this.c == null) {
            float L = org.telegram.messenger.i0.L(14.0f);
            TextPaint textPaint = this.a;
            textPaint.setTextSize(L);
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            String M0 = cd.M0("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(M0, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() >= 1 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() >= 1 ? this.c.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(cd.M0("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f = staticLayout2;
            this.h = staticLayout2.getLineCount() >= 1 ? this.f.getLineWidth(0) : 0.0f;
            this.n = this.f.getLineCount() >= 1 ? this.f.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout3 = new StaticLayout(cd.L0(2131754879, null), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            this.s = staticLayout3.getLineCount() >= 1 ? this.r.getLineWidth(0) : 0.0f;
            this.w = this.r.getLineCount() >= 1 ? this.r.getLineLeft(0) : 0.0f;
            float L2 = org.telegram.messenger.i0.L(14.0f) / 2.0f;
            float L3 = org.telegram.messenger.i0.L(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((org.telegram.messenger.i0.L(12.0f) + this.d) + org.telegram.messenger.i0.L(36.0f)) + this.h) + org.telegram.messenger.i0.L(36.0f)) + this.s) + org.telegram.messenger.i0.L(12.0f))) / 2.0f;
            this.x.set(measuredWidth2, L2, this.d + measuredWidth2 + org.telegram.messenger.i0.L(24.0f), L3);
            float L4 = this.d + org.telegram.messenger.i0.L(36.0f) + measuredWidth2;
            this.y.set(L4, L2, this.h + L4 + org.telegram.messenger.i0.L(24.0f), L3);
            float L5 = this.h + org.telegram.messenger.i0.L(36.0f) + L4;
            this.D.set(L5, L2, this.s + L5 + org.telegram.messenger.i0.L(24.0f), L3);
            org.telegram.messenger.i0.L(36.0f);
        }
        this.H = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 1 || this.G == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.x.contains(motionEvent.getX(), motionEvent.getY())) {
                this.G.a(0);
                return true;
            }
            if (this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                this.G.a(1);
                return true;
            }
            if (this.D.contains(motionEvent.getX(), motionEvent.getY())) {
                this.G.a(2);
            }
        }
        return true;
    }
}
