package vh;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d9 extends View {
    public final Paint a;
    public final org.telegram.ui.Components.e6 b;
    public boolean c;

    public d9(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = true;
        paint.setColor(TLObject.FLAG_31);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.b = e6Var;
        e6Var.n(0.2f, 200L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(13.0f));
        e6Var.u(-1);
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.setCallback(this);
        e6Var.b = 1;
        StringBuilder sb2 = new StringBuilder(8);
        sb2.append("00:00:00");
        if (TextUtils.equals(sb2, e6Var.i)) {
            return;
        }
        e6Var.a();
        e6Var.t(sb2, false, true);
    }

    public final void a(boolean z10) {
        if (this.c || !z10) {
            this.c = false;
            animate().cancel();
            if (z10) {
                z20.m(animate().translationY(org.telegram.messenger.i0.L(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), gr.h, 220L);
                return;
            }
            setTranslationY(org.telegram.messenger.i0.L(6.0f));
            setScaleX(0.8f);
            setScaleY(0.8f);
            setAlpha(0.0f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.e6 e6Var = this.b;
        float c10 = e6Var.c();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(((getWidth() - c10) / 2.0f) - org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f), ((getWidth() + c10) / 2.0f) + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(23.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(5.0f), this.a);
        e6Var.setBounds((int) rectF.left, ((int) rectF.top) - org.telegram.messenger.i0.L(1.0f), (int) rectF.right, (int) rectF.bottom);
        e6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(25.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.b == drawable || super.verifyDrawable(drawable);
    }
}
