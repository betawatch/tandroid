// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tx4 extends View {
    public final vx4 a;
    public String b;

    public tx4(Context context) {
        super(context);
        vx4 vx4Var = new vx4(this, 1.0f);
        this.a = vx4Var;
        vx4Var.setCallback(this);
    }

    public final void a(int i, int i2) {
        ((Paint) this.a.b).setShader(new LinearGradient(0.0f, 0.0f, hl.L(48.0f), hl.L(48.0f), new int[]{i, i2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z) {
        this.b = str;
        this.a.g(z ? 10 : 11, str, z);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        vx4 vx4Var = this.a;
        vx4Var.setBounds(0, 0, width, height);
        vx4Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(50.0f), hl.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i) {
        this.a.f(i);
    }

    public void setStrokeColor(int i) {
        this.a.r.setColor(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }
}
