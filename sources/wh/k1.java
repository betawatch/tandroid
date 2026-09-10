package wh;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.xq;
import xh.l8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class k1 extends xq {
    public t01 b;
    public final Path c;
    public final Paint d;
    public final float e;
    public l8 f;
    public boolean g;
    public int h;

    public k1(View view) {
        super(view);
        Path path = new Path();
        this.c = path;
        Paint paint = new Paint(1);
        this.d = paint;
        this.h = -1;
        this.e = 1.0f;
        c(path, 1.0f, false);
        this.a.setColor(-698031);
        this.a.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.33f)));
        paint.setColor(0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public static void c(Path path, float f7, final boolean z10) {
        Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() { // from class: wh.j1
            @Override // org.telegram.messenger.Utilities.CallbackReturn
            public final Object run(Object obj) {
                Float f10 = (Float) obj;
                return Float.valueOf(z10 ? 48.0f - f10.floatValue() : f10.floatValue());
            }
        };
        path.rewind();
        float f10 = f7 * 24.5f;
        path.moveTo(w.f.d((Float) callbackReturn.run(Float.valueOf(46.83f)), f7), AndroidUtilities.dp(f10));
        path.lineTo(w.f.d((Float) callbackReturn.run(Float.valueOf(23.5f)), f7), AndroidUtilities.dp(1.17f * f7));
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(22.75f)), f7), AndroidUtilities.dp(0.42f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(21.73f)), f7), 0.0f, w.f.d((Float) callbackReturn.run(Float.valueOf(20.68f)), f7), 0.0f);
        float f11 = f7 * 0.05f;
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(19.62f)), f7), 0.0f, w.f.d((Float) callbackReturn.run(Float.valueOf(2.73f)), f7), AndroidUtilities.dp(f11), w.f.d((Float) callbackReturn.run(Float.valueOf(1.55f)), f7), AndroidUtilities.dp(f11));
        path.cubicTo(w.f.d((Float) callbackReturn.run(Float.valueOf(0.36f)), f7), AndroidUtilities.dp(f11), w.f.d((Float) callbackReturn.run(Float.valueOf(-0.23f)), f7), AndroidUtilities.dp(1.4885f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(0.6f)), f7), AndroidUtilities.dp(2.32f * f7));
        path.lineTo(w.f.d((Float) callbackReturn.run(Float.valueOf(45.72f)), f7), AndroidUtilities.dp(47.44f * f7));
        float d = w.f.d((Float) callbackReturn.run(Float.valueOf(46.56f)), f7);
        float dp = AndroidUtilities.dp(48.28f * f7);
        Float valueOf = Float.valueOf(48.0f);
        path.cubicTo(d, dp, w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(47.68f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(46.5f * f7));
        path.cubicTo(w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(45.31f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(28.38f * f7), w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(27.32f * f7));
        path.cubicTo(w.f.d((Float) callbackReturn.run(valueOf), f7), AndroidUtilities.dp(26.26f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(47.5f)), f7), AndroidUtilities.dp(25.24f * f7), w.f.d((Float) callbackReturn.run(Float.valueOf(46.82f)), f7), AndroidUtilities.dp(f10));
        path.close();
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, boolean z10, boolean z11) {
        Paint paint = this.a;
        if (stargiftattributebackdrop == null) {
            paint.setShader(null);
        } else {
            boolean z12 = this.g ? !z10 : z10;
            paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{j6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.center_color | (-16777216)), j6.b(z12 ? 0.07f : 0.05f, (z12 ? -0.15f : -0.1f) - (z11 ? 0.125f : 0.0f), stargiftattributebackdrop.edge_color | (-16777216))}, new float[]{z12 ? 1.0f : 0.0f, z12 ? 0.0f : 1.0f}, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        canvas.translate(getBounds().right - AndroidUtilities.dp(48.0f), getBounds().top);
        Paint paint = this.d;
        int alpha = paint.getAlpha();
        Path path = this.c;
        if (alpha > 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.33f) * 2);
            canvas.drawPath(path, paint);
        }
        canvas.drawPath(path, this.a);
        if (this.f != null) {
            canvas.clipPath(path);
            this.f.f(0, 0, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f));
            this.f.d();
            this.f.a(canvas, -1);
            invalidateSelf();
        }
        if (this.b != null) {
            canvas.save();
            canvas.rotate(this.g ? -45.0f : 45.0f, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.g ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.g ? 5.0f : 6.0f));
            float min = Math.min(1.0f, AndroidUtilities.dp(40.0f) / this.b.c);
            canvas.scale(min, min, (getBounds().width() / 2.0f) + AndroidUtilities.dp(this.g ? -7.0f : 6.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.g ? 5.0f : 6.0f));
            canvas2 = canvas;
            this.b.c(((getBounds().width() / 2.0f) + AndroidUtilities.dp(this.g ? -7.0f : 6.0f)) - (this.b.l() / 2.0f), (getBounds().height() / 2.0f) - AndroidUtilities.dp(this.g ? 4.0f : 5.0f), 1.0f, this.h, canvas2);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public final void e(int i10, CharSequence charSequence, boolean z10) {
        this.b = new t01(charSequence, i10, z10 ? AndroidUtilities.bold() : null);
    }
}
