package wg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.k71;
import tg.z1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class b extends View {
    public final n6 a;
    public float b;
    public ValueAnimator c;
    public int d;
    public final Paint e;

    public b(Context context) {
        super(context);
        this.b = 1.0f;
        n6 n6Var = new n6(false, false, true);
        this.a = n6Var;
        n6Var.n(0.3f, 250L, nr.h);
        n6Var.setCallback(this);
        n6Var.w(org.telegram.messenger.g0.L(11.5f));
        n6Var.x(org.telegram.messenger.g0.o());
        n6Var.u(-1);
        n6Var.t("", true, true);
        n6Var.b = 17;
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(-6915073);
        setVisibility(8);
    }

    public final void a(int i7, boolean z10) {
        if (!s.i()) {
            i7 = 0;
        }
        if (i7 > 0) {
            setVisibility(0);
        }
        n6 n6Var = this.a;
        if (z10) {
            n6Var.a();
        }
        if (z10 && i7 != this.d && i7 > 0) {
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.c = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.addUpdateListener(new z1(this, 6));
            this.c.addListener(new k71(this, 24));
            org.telegram.ui.Cells.c0.q(2.0f, this.c);
            this.c.setDuration(200L);
            this.c.start();
        }
        this.d = i7;
        int length = n6Var.i.length();
        n6Var.t("x" + i7, z10, true);
        int length2 = n6Var.i.length();
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
        n6 n6Var = this.a;
        rect.set(0, 0, L + ((int) n6Var.c()), org.telegram.messenger.g0.L(20.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(rect);
        if (this.b != 1.0f) {
            canvas.save();
            float f10 = this.b;
            canvas.scale(f10, f10, rect.centerX(), rect.centerY());
        }
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), this.e);
        rect.set(0, 0, (int) rectF.width(), org.telegram.messenger.g0.L(19.0f));
        n6Var.setBounds(rect);
        n6Var.draw(canvas);
        if (this.b != 1.0f) {
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (this.a.e() + org.telegram.messenger.g0.L(15.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(26.0f), TLObject.FLAG_30));
    }
}
