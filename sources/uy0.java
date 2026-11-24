// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uy0 {
    public final Path A;
    public final wy0 a;
    public final View b;
    public int c;
    public int d;
    public final ln e;
    public final ln f;
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i;
    public final Paint j;
    public int k;
    public final fg0 l;
    public int m;
    public final int n;
    public boolean o;
    public final boolean p;
    public final float q;
    public final Bitmap r;
    public final Drawable s;
    public int t;
    public final uib u;
    public uib v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public uy0(View view, wy0 wy0Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        fg0 f0 = cmb.f0(822083583, 1, -1);
        this.l = f0;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = wy0Var;
        f0.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        d53 d53Var = d53.h;
        this.e = new ln(320L, view, d53Var);
        this.f = new ln(320L, view, d53Var);
        this.r = wy0Var.F;
        String b = wy0Var.b();
        textPaint = xy0.getTextPaint();
        this.u = new uib(gw3.m(b, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, gm.o());
        int i = wy0Var.q;
        this.n = i;
        this.p = gm.B(i) < 0.721f;
        o oVar = wy0Var.J;
        if (oVar != null) {
            ArrayList arrayList = oVar.e0;
            if (!arrayList.isEmpty()) {
                Object f = b10.f(1, arrayList);
                if ((f instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) f).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.q = wy0Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(gm.L(12.0f), gm.L(12.0f));
        path.moveTo(gm.L(12.0f), 0.0f);
        path.lineTo(0.0f, gm.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, gm.L(6.33f) / 2.0f);
        path2.lineTo(gm.L(12.66f) / 2.0f, (-gm.L(6.33f)) / 2.0f);
        path2.lineTo(gm.L(12.66f), gm.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        float f4;
        int f5 = on2.f(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(f5);
        float f6 = f2 * 255.0f;
        paint.setAlpha((int) f6);
        paint.setShadowLayer(gm.L(2.33f), 0.0f, gm.L(1.0f), cmb.p1(f2, TLObject.FLAG_28));
        float[] fArr = this.x;
        fArr[3] = f;
        fArr[2] = f;
        fArr[1] = f;
        int i = 0;
        fArr[0] = f;
        float R1 = gm.R1(f, 0.0f, this.w);
        fArr[7] = R1;
        fArr[6] = R1;
        fArr[5] = R1;
        fArr[4] = R1;
        Path path = this.y;
        path.rewind();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        float f7 = this.q;
        if (f7 > 0.0f && this.w > 0.0f && f2 > 0.0f) {
            canvas.save();
            canvas.clipPath(path);
            int p1 = cmb.p1(0.07f * f2 * this.w, gm.B(f5) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.h;
            paint2.setColor(p1);
            float f8 = rectF.left;
            canvas.drawRect(f8, rectF.top, (rectF.width() * f7) + f8, rectF.bottom, paint2);
            canvas.restore();
        }
        float R12 = gm.R1(this.o ? 1.0f : 0.0f, this.p ? 1.0f : 0.0f, this.w);
        int f9 = on2.f(R12, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(f9);
        paint3.setStrokeWidth(gm.L(2.0f));
        canvas.save();
        canvas.translate(rectF.left, rectF.centerY());
        int f10 = on2.f(R12, 553648127, 553648127);
        int L = gm.L(25.0f) + (-gm.L(25.0f));
        int i2 = -gm.L(25.0f);
        int L2 = gm.L(25.0f) + gm.L(25.0f);
        int L3 = gm.L(25.0f);
        fg0 fg0Var = this.l;
        fg0Var.setBounds(L, i2, L2, L3);
        if (this.k != f10) {
            this.k = f10;
            cmb.F1(fg0Var, f10, false);
        }
        fg0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.left + gm.L(18.0f), rectF.centerY() - gm.L(6.0f));
        float f11 = f6 * f3;
        int i3 = (int) f11;
        paint3.setAlpha(i3);
        canvas.drawPath(this.z, paint3);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.right - gm.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f11));
        canvas.drawPath(this.A, paint3);
        canvas.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int L4 = gm.L(24.0f);
            canvas.save();
            Rect rect = gm.Q;
            float f12 = L4;
            float f13 = f12 / 2.0f;
            rect.set((int) (rectF.left + gm.L(56.0f)), (int) (rectF.centerY() - f13), (int) (rectF.left + gm.L(56.0f) + f12), (int) (rectF.centerY() + f13));
            Paint paint4 = this.j;
            paint4.setAlpha(i3);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas.restore();
            i = gm.L(4.0f) + L4;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float L5 = gm.L(24.0f);
                int intrinsicHeight = (int) ((L5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = gm.Q;
                float f14 = (L5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + gm.L(56.0f)), (int) (rectF.centerY() - f14), (int) ((intrinsicHeight * 0.7f) + rectF.left + gm.L(56.0f)), (int) (rectF.centerY() + f14));
                if (f9 != this.t) {
                    this.t = f9;
                    drawable.setColorFilter(new PorterDuffColorFilter(f9, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i3);
                drawable.setBounds(rect2);
                drawable.draw(canvas);
                i = intrinsicHeight - gm.L(2.0f);
            }
        }
        uib uibVar = this.v;
        if (uibVar != null) {
            uibVar.p = (int) ((rectF.width() - gm.L(100.0f)) - r3);
            f4 = 1.0f;
            uibVar.c(rectF.left + gm.L(60.0f) + i, rectF.centerY(), td4.z(1.0f, this.w, f2, f3), f9, canvas);
            f9 = f9;
        } else {
            f4 = 1.0f;
        }
        float width = rectF.width() - gm.L(100.0f);
        float f15 = i;
        uib uibVar2 = this.u;
        uibVar2.p = (int) (width - f15);
        uibVar2.c(rectF.left + gm.L(60.0f) + f15, rectF.centerY(), (this.v == null ? f4 : this.w) * f2 * f3, f9, canvas);
    }

    public final float b() {
        float c = c();
        return this.f.d(this.d >= 0) * (c < 0.0f ? c + 1.0f : (c < 0.0f || c >= 1.0f) ? (1.0f - Math.min(1.0f, c - 1.0f)) * 0.87f : gm.R1(1.0f, 0.87f, c));
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.e(false, this.c);
    }
}
