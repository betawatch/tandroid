package qh;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import j$.util.function.Consumer$-CC;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Consumer {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ m b;

    public /* synthetic */ b0(i0 i0Var, m mVar) {
        this.a = i0Var;
        this.b = mVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        c cVar;
        float f7;
        float f10;
        float[] fArr;
        b0 b0Var = this;
        Canvas canvas = (Canvas) obj;
        i0 i0Var = b0Var.a;
        c cVar2 = i0Var.y;
        RectF rectF = cVar2.M;
        WeakHashMap weakHashMap = cVar2.N;
        Paint paint = cVar2.c;
        long b10 = c.b();
        int i10 = 0;
        while (true) {
            m mVar = b0Var.b;
            if (i10 >= mVar.getChildCount()) {
                break;
            }
            View childAt = mVar.getChildAt(i10);
            if ((childAt instanceof l) && childAt.getVisibility() == 0) {
                if (weakHashMap.containsKey(childAt)) {
                    f7 = 10.0f;
                    f10 = 2.5f;
                } else {
                    weakHashMap.put(childAt, Boolean.TRUE);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(10.0f));
                    f10 = 2.5f;
                    f7 = 10.0f;
                    childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) org.telegram.messenger.i0.N(2.5f))));
                }
                String key = ((l) childAt).getKey();
                if (key != null && (fArr = (float[]) cVar2.n.get(key)) != null) {
                    float c10 = c.c(fArr, b10);
                    if (c10 > 0.004f) {
                        float translationX = childAt.getTranslationX() + childAt.getLeft();
                        float translationY = childAt.getTranslationY() + childAt.getTop();
                        float width = childAt.getWidth();
                        float height = childAt.getHeight();
                        float N = (int) org.telegram.messenger.i0.N(f10);
                        cVar = cVar2;
                        rectF.set(translationX + N, translationY + N, (translationX + width) - N, (translationY + height) - N);
                        if (!childAt.isPressed()) {
                            paint.setColor(788529151);
                            paint.setAlpha((int) (Color.alpha(788529151) * c10));
                            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), paint);
                        }
                        i10++;
                        b0Var = this;
                        cVar2 = cVar;
                    }
                }
            }
            cVar = cVar2;
            i10++;
            b0Var = this;
            cVar2 = cVar;
        }
        if (i0Var.d.I.isEmpty()) {
            return;
        }
        i0Var.y.invalidate();
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
