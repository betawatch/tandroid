package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class a1 extends View {
    public final c1 a;
    public CharSequence b;

    public a1(Context context) {
        super(context);
        c1 c1Var = new c1(this);
        this.a = c1Var;
        c1Var.setCallback(this);
    }

    public final void a(int i7, int i10) {
        ((Paint) this.a.b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z9) {
        this.b = str;
        this.a.f(z9 ? 10 : 11, str, z9);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        c1 c1Var = this.a;
        c1Var.setBounds(0, 0, width, height);
        c1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i7) {
        Paint paint = (Paint) this.a.b;
        paint.setShader(null);
        paint.setColor(i7);
    }

    public void setStrokeColor(int i7) {
        this.a.r.setColor(i7);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
