package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class w1 extends View {
    public final RectF B;
    public float C;
    public w0 D;
    public int E;
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
    public float v;
    public final RectF w;
    public final RectF x;
    public final RectF y;

    public w1(Context context) {
        super(context);
        this.a = new TextPaint(1);
        this.b = new Paint(1);
        this.w = new RectF();
        this.x = new RectF();
        this.y = new RectF();
        this.B = new RectF();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawColor(-14737633);
        Paint paint = this.b;
        paint.setColor(-13224394);
        float f10 = this.C;
        int i10 = (int) f10;
        RectF rectF = this.y;
        RectF rectF2 = this.x;
        RectF rectF3 = this.w;
        RectF rectF4 = i10 <= 0 ? rectF3 : i10 == 1 ? rectF2 : rectF;
        int ceil = (int) Math.ceil(f10);
        RectF rectF5 = ceil <= 0 ? rectF3 : ceil == 1 ? rectF2 : rectF;
        float f11 = this.C;
        RectF rectF6 = this.B;
        AndroidUtilities.lerp(rectF4, rectF5, f11 - ((int) f11), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.c;
        TextPaint textPaint = this.a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.e, e2.c.x(rectF3.height(), this.c.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((rectF2.left + AndroidUtilities.dp(12.0f)) - this.n, e2.c.x(rectF2.height(), this.f.getHeight(), 2.0f, rectF2.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f.draw(canvas);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate((rectF.left + AndroidUtilities.dp(12.0f)) - this.v, e2.c.x(rectF.height(), this.r.getHeight(), 2.0f, rectF.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.C - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.E || this.c == null) {
            float dp = AndroidUtilities.dp(14.0f);
            TextPaint textPaint = this.a;
            textPaint.setTextSize(dp);
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() >= 1 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() >= 1 ? this.c.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f = staticLayout2;
            this.h = staticLayout2.getLineCount() >= 1 ? this.f.getLineWidth(0) : 0.0f;
            this.n = this.f.getLineCount() >= 1 ? this.f.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            this.s = staticLayout3.getLineCount() >= 1 ? this.r.getLineWidth(0) : 0.0f;
            this.v = this.r.getLineCount() >= 1 ? this.r.getLineLeft(0) : 0.0f;
            float dp2 = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp3 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.w.set(measuredWidth2, dp2, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp3);
            float dp4 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.x.set(dp4, dp2, this.h + dp4 + AndroidUtilities.dp(24.0f), dp3);
            float dp5 = this.h + AndroidUtilities.dp(36.0f) + dp4;
            this.y.set(dp5, dp2, this.s + dp5 + AndroidUtilities.dp(24.0f), dp3);
            AndroidUtilities.dp(36.0f);
        }
        this.E = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 1 || this.D == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.w.contains(motionEvent.getX(), motionEvent.getY())) {
                this.D.run(0);
                return true;
            }
            if (this.x.contains(motionEvent.getX(), motionEvent.getY())) {
                this.D.run(1);
                return true;
            }
            if (this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                this.D.run(2);
            }
        }
        return true;
    }
}
