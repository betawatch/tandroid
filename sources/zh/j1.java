package zh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import bi.td;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class j1 extends cr {
    public r11 c;
    public r11 d;
    public final h6 e;
    public final Path f;
    public final Path h;
    public final Paint n;
    public final Paint r;
    public final float s;
    public td v;
    public boolean w;
    public int x;

    public j1(View view) {
        super(view);
        this.e = new h6(new ti.g(this, 21), 320L, ds.h, 0);
        Path path = new Path();
        this.f = path;
        this.h = new Path();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.x = -1;
        this.s = 1.0f;
        d(path, 1.0f, false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ((Paint) this.b).setColor(-698031);
        ((Paint) this.b).setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint2.setColor(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void d(Path path, float f7, final boolean z10) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: zh.i1
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Float f10 = (Float) obj;
                return Float.valueOf(z10 ? 48.0f - f10.floatValue() : f10.floatValue());
            }
        };
        path.rewind();
        float f10 = f7 * 24.5f;
        path.moveTo(z8.a.a((Float) callbackReturn.run(Float.valueOf(46.83f)), f7), AndroidUtilities.dp(f10));
        path.lineTo(z8.a.a((Float) callbackReturn.run(Float.valueOf(23.5f)), f7), AndroidUtilities.dp(1.17f * f7));
        path.cubicTo(z8.a.a((Float) callbackReturn.run(Float.valueOf(22.75f)), f7), AndroidUtilities.dp(0.42f * f7), z8.a.a((Float) callbackReturn.run(Float.valueOf(21.73f)), f7), 0.0f, z8.a.a((Float) callbackReturn.run(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(z8.a.a((Float) callbackReturn.run(Float.valueOf(19.62f)), f7), 0.0f, z8.a.a((Float) callbackReturn.run(Float.valueOf(2.73f)), f7), AndroidUtilities.dp(f11), z8.a.a((Float) callbackReturn.run(Float.valueOf(1.55f)), f7), AndroidUtilities.dp(f11));
        path.cubicTo(z8.a.a((Float) callbackReturn.run(Float.valueOf(0.36f)), f7), AndroidUtilities.dp(f11), z8.a.a((Float) callbackReturn.run(Float.valueOf(-0.23f)), f7), AndroidUtilities.dp(1.4885f * f7), z8.a.a((Float) callbackReturn.run(Float.valueOf(0.6f)), f7), AndroidUtilities.dp(2.32f * f7));
        path.lineTo(z8.a.a((Float) callbackReturn.run(Float.valueOf(45.72f)), f7), AndroidUtilities.dp(47.44f * f7));
        float a2 = z8.a.a((Float) callbackReturn.run(Float.valueOf(46.56f)), f7);
        float dp = AndroidUtilities.dp(48.28f * f7);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(a2, dp, z8.a.a((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(47.68f * f7), z8.a.a((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(46.5f * f7));
        path.cubicTo(z8.a.a((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(45.31f * f7), z8.a.a((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(28.38f * f7), z8.a.a((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(27.32f * f7));
        path.cubicTo(z8.a.a((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(26.26f * f7), z8.a.a((Float) callbackReturn.run(Float.valueOf(47.5f)), f7), AndroidUtilities.dp(25.24f * f7), z8.a.a((Float) callbackReturn.run(Float.valueOf(46.82f)), f7), AndroidUtilities.dp(f10));
        path.close();
    }

    public final void c(Canvas canvas, r11 r11Var, float f7) {
        canvas.save();
        canvas.translate(f7, f7);
        float width = (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.w ? -7.0f : 6.0f);
        float height = (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.w ? 5.0f : 6.0f);
        canvas.rotate(this.w ? -45.0f : 45.0f, width, height);
        float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / r11Var.c);
        canvas.scale(min, min, width, height);
        r11Var.c(width - (r11Var.l() / 2.0f), height + AndroidUtilities.dp(1.0f), 1.0f, this.x, canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.r;
        int alpha = paint.getAlpha();
        Path path = this.f;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, (Paint) this.b);
        td tdVar = this.v;
        float f7 = this.s;
        if (tdVar != null) {
            float f10 = f7 * 48.0f;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), null);
            this.v.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.v.d();
            this.v.a(canvas2, -1);
            Path path2 = this.h;
            path2.set(path);
            path2.toggleInverseFillType();
            canvas2.drawPath(path2, this.n);
            canvas2.restore();
            invalidateSelf();
        } else {
            canvas2 = canvas;
        }
        if (this.c != null) {
            h6 h6Var = this.e;
            float d = h6Var.d(1.0f, false);
            if (!h6Var.i) {
                this.d = null;
            }
            canvas2.save();
            if (this.d == null || !h6Var.i) {
                c(canvas2, this.c, 0.0f);
            } else {
                canvas2.clipPath(path);
                float dp = AndroidUtilities.dp(f7 * 64.0f);
                c(canvas2, this.d, dp * d);
                c(canvas2, this.c, (1.0f - d) * (-dp));
            }
            canvas2.restore();
        }
        canvas2.restore();
    }

    public final void e(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        Paint paint = (Paint) this.b;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z12 = this.w ? !z10 : z10;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{y6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), y6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z12 ? 1.0f : 0.0f, z12 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    public final void f(int i10, CharSequence charSequence, boolean z10) {
        this.d = null;
        this.e.d(1.0f, true);
        this.c = new r11(charSequence, i10, z10 ? AndroidUtilities.bold() : null);
        invalidateSelf();
    }

    public final void g(int i10, String str) {
        r11 r11Var = this.c;
        if (r11Var == null) {
            f(i10, str, true);
        } else {
            if (TextUtils.equals(r11Var.k(), str)) {
                return;
            }
            this.d = this.c;
            this.c = new r11(str, i10, AndroidUtilities.bold());
            this.e.d(0.0f, true);
            invalidateSelf();
        }
    }
}
