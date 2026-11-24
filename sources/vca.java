// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vca extends Drawable {
    public final Paint a;
    public final p09 b;
    public final Drawable c;
    public final ylb d;
    public int e;
    public int f;
    public int g;

    public vca(Context context, View view, boolean z, int i, ylb ylbVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.g = nm7.d4;
        this.d = ylbVar;
        this.e = cmb.v0(cmb.Xk, ylbVar);
        this.f = cmb.v0(cmb.Yk, ylbVar);
        paint.setShader(new LinearGradient(0.0f, 0.0f, gm.L(56.0f), gm.L(56.0f), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z) {
            this.b = null;
            Drawable d = b10.d(context, i);
            this.c = d;
            d.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        p09 p09Var = new p09(R.raw.story_repost, gm.L(42.0f), gm.L(42.0f), true, null);
        this.b = p09Var;
        p09Var.M(view);
        gm.d3(new xl1(p09Var, (byte) 8), 450L);
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        ylb ylbVar = this.d;
        try {
            int v0 = cmb.v0(cmb.Xk, ylbVar);
            int v02 = cmb.v0(cmb.Yk, ylbVar);
            if (v0 != this.e || v02 != this.f) {
                this.e = v0;
                this.f = v02;
                paint.setShader(new LinearGradient(0.0f, 0.0f, gm.L(56.0f), gm.L(56.0f), new int[]{v0, v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        paint.setAlpha(this.g);
        float min = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.b;
        int L = gm.L(drawable != null ? 20.0f : 15.0f);
        Rect rect = gm.Q;
        rect.set(getBounds().centerX() - L, getBounds().centerY() - L, getBounds().centerX() + L, getBounds().centerY() + L);
        if (drawable == null) {
            drawable = this.c;
        }
        if (drawable != null) {
            drawable.setBounds(rect);
            drawable.setAlpha(this.g);
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gm.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gm.L(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.g = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
