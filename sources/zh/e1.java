package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e1 extends View {
    public final int a;
    public final RectF b;
    public final org.telegram.ui.Components.n6 c;
    public final c1 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public e1(Context context, int i10) {
        super(context);
        this.b = new RectF();
        wr wrVar = wr.f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.c = n6Var;
        this.e = new ArrayList();
        this.f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.s = true;
        this.a = i10;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.b = 17;
        this.d = new c1(this, 0);
    }

    public final void a(float f7, c1 c1Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f7);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new qg.o(this, 21));
        this.r.addListener(new bi.j3(this, f7, c1Var, 4));
        this.r.setInterpolator(wr.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.c.q("", true, true);
        invalidate();
        a(0.0f, new c1(this, 1));
    }

    public final void c(f1 f1Var) {
        this.b.set(f1Var.getX() - getX(), f1Var.getY() - getY(), (f1Var.getX() - getX()) + f1Var.getWidth(), (f1Var.getY() - getY()) + f1Var.getHeight());
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        e1 e1Var = this;
        Canvas canvas2 = canvas;
        float f7 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, e1Var.n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = e1Var.e;
            int size = arrayList.size();
            rectF = e1Var.b;
            if (i11 >= size) {
                break;
            }
            hj0 hj0Var = (hj0) arrayList.get(i11);
            if (hj0Var.b0 >= hj0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                hj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) org.telegram.ui.Cells.r6.a(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                hj0Var.setAlpha((int) (e1Var.n * 255.0f));
                hj0Var.draw(canvas2);
            }
            i11++;
        }
        float centerX = rectF.centerX();
        float dp2 = rectF.top - AndroidUtilities.dp(1.0f);
        canvas2.save();
        canvas2.translate(centerX, dp2);
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = e1Var.h;
            if (i12 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            d1 d1Var = (d1) arrayList2.get(i12);
            float f11 = d1Var.c;
            float f12 = d1Var.b;
            ImageReceiver imageReceiver = d1Var.f;
            float d = d1Var.i.d(f7, z10);
            float e = d1Var.j.e(d1Var.h);
            float dp3 = AndroidUtilities.dp(23.0f) + d1Var.g.c;
            float dp4 = AndroidUtilities.dp(18.0f);
            float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f7, 0.0f, e), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f7, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
            Paint paint = d1Var.e;
            int i13 = (int) (lerp2 * 255.0f);
            paint.setAlpha(i13);
            hj0 hj0Var2 = d1Var.d;
            if (hj0Var2 != null) {
                hj0Var2.setAlpha(i13);
            }
            imageReceiver.setAlpha(lerp2);
            canvas2.save();
            double d10 = d;
            float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f13 = (f12 * 2.0f) - 1.0f;
            canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
            float f14 = 1.5f * ((f11 * 2.0f) - 1.0f);
            canvas2.rotate(f14);
            int i14 = i12;
            canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
            canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
            float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
            canvas2.scale(lerp3, lerp3);
            canvas2.translate((-dp3) / 2.0f, (-dp4) / 2.0f);
            float f15 = dp4 / 2.0f;
            canvas2.drawRoundRect(0.0f, 0.0f, dp3, dp4, f15, f15, paint);
            imageReceiver.draw(canvas2);
            Canvas canvas3 = canvas2;
            d1Var.g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (hj0Var2 != null) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                canvas2.rotate(f14);
                canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                int dp5 = AndroidUtilities.dp(90.0f);
                int i15 = (-dp5) / 2;
                int i16 = dp5 / 2;
                hj0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                hj0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (d >= 1.0f || e >= 1.0f) {
                ((d1) arrayList2.get(i14)).f.onDetachedFromWindow();
                arrayList2.remove(i14);
                i10 = i14 - 1;
            } else {
                i10 = i14;
            }
            i12 = i10 + 1;
            e1Var = this;
            f7 = 1.0f;
            z10 = false;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.c || super.verifyDrawable(drawable);
    }
}
