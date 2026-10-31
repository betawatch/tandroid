package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d1 extends View {
    public final f1 a;
    public CharSequence b;

    public d1(Context context) {
        super(context);
        f1 f1Var = new f1(this);
        this.a = f1Var;
        f1Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        ((Paint) this.a.b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        this.b = str;
        this.a.f(z10 ? 10 : 11, str, z10);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        f1 f1Var = this.a;
        f1Var.setBounds(0, 0, width, height);
        f1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = (Paint) this.a.b;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.a.r.setColor(i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
