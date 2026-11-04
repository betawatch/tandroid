package xg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
import ug.f2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends View {
    public final g6 a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.b = 1.0f;
        g6 g6Var = new g6(false, false, true);
        this.a = g6Var;
        g6Var.n(0.3f, 250L, xq.h);
        g6Var.setCallback(this);
        g6Var.w(org.telegram.messenger.g0.L(11.5f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.u(-1);
        g6Var.t("", true, true);
        g6Var.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i3, boolean z10) {
        if (!s.i()) {
            i3 = 0;
        }
        if (i3 > 0) {
            setVisibility(0);
        }
        g6 g6Var = this.a;
        if (z10) {
            g6Var.a();
        }
        if (z10 && i3 != this.d && i3 > 0) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new f2(this, 5));
            this.c.addListener(new i81(this, 23));
            org.telegram.messenger.camera.q.i(2.0f, this.c);
            this.c.setDuration(200L);
            this.c.start();
        }
        this.d = i3;
        int length = g6Var.i.length();
        g6Var.t("x" + i3, z10, true);
        int length2 = g6Var.i.length();
        invalidate();
        if (length != length2) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        int L = org.telegram.messenger.g0.L(8.0f);
        g6 g6Var = this.a;
        rect.set(0, 0, L + ((int) g6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f10 = this.b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        g6Var.setBounds(rect);
        g6Var.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + org.telegram.messenger.g0.L(15.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), TLObject.FLAG_30));
    }
}
