package zh;

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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements Consumer {
    public final /* synthetic */ m0 a;
    public final /* synthetic */ s b;

    public /* synthetic */ g0(m0 m0Var, s sVar) {
        this.a = m0Var;
        this.b = sVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        c cVar;
        float f7;
        float f10;
        float[] fArr;
        g0 g0Var = this;
        Canvas canvas = (Canvas) obj;
        m0 m0Var = g0Var.a;
        c cVar2 = m0Var.x;
        RectF rectF = cVar2.M;
        WeakHashMap weakHashMap = cVar2.N;
        Paint paint = cVar2.c;
        long b10 = c.b();
        int i10 = 0;
        while (true) {
            s sVar = g0Var.b;
            if (i10 >= sVar.getChildCount()) {
                break;
            }
            View childAt = sVar.getChildAt(i10);
            if ((childAt instanceof r) && childAt.getVisibility() == 0) {
                if (weakHashMap.containsKey(childAt)) {
                    f7 = 10.0f;
                    f10 = 2.5f;
                } else {
                    weakHashMap.put(childAt, Boolean.TRUE);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setCornerRadius(AndroidUtilities.dp(10.0f));
                    f10 = 2.5f;
                    f7 = 10.0f;
                    childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) AndroidUtilities.dpf2(2.5f))));
                }
                String key = ((r) childAt).getKey();
                if (key != null && (fArr = (float[]) cVar2.n.get(key)) != null) {
                    float c10 = c.c(fArr, b10);
                    if (c10 > 0.004f) {
                        float translationX = childAt.getTranslationX() + childAt.getLeft();
                        float translationY = childAt.getTranslationY() + childAt.getTop();
                        float width = childAt.getWidth();
                        float height = childAt.getHeight();
                        float dpf2 = (int) AndroidUtilities.dpf2(f10);
                        cVar = cVar2;
                        rectF.set(translationX + dpf2, translationY + dpf2, (translationX + width) - dpf2, (translationY + height) - dpf2);
                        if (!childAt.isPressed()) {
                            paint.setColor(788529151);
                            paint.setAlpha((int) (Color.alpha(788529151) * c10));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
                        }
                        i10++;
                        g0Var = this;
                        cVar2 = cVar;
                    }
                }
            }
            cVar = cVar2;
            i10++;
            g0Var = this;
            cVar2 = cVar;
        }
        if (m0Var.d.I.isEmpty()) {
            return;
        }
        m0Var.x.invalidate();
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
