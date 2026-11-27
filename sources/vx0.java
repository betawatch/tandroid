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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vx0 {
    public final Path A;
    public final xx0 a;
    public final View b;
    public int c;
    public int d;
    public final mm e;
    public final mm f;
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i;
    public final Paint j;
    public int k;
    public final hf0 l;
    public int m;
    public final int n;
    public boolean o;
    public final boolean p;
    public final float q;
    public final Bitmap r;
    public final Drawable s;
    public int t;
    public final pkb u;
    public pkb v;
    public float w;
    public final float[] x;
    public final Path y;
    public final Path z;

    public vx0(View view, xx0 xx0Var) {
        TextPaint textPaint;
        TL_iv.Page page;
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new Paint(3);
        hf0 f0 = aob.f0(822083583, 1, -1);
        this.l = f0;
        this.t = -1;
        this.x = new float[8];
        this.y = new Path();
        Path path = new Path();
        this.z = path;
        Path path2 = new Path();
        this.A = path2;
        this.b = view;
        this.a = xx0Var;
        f0.setCallback(view);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        k43 k43Var = k43.h;
        this.e = new mm(320L, view, k43Var);
        this.f = new mm(320L, view, k43Var);
        this.r = xx0Var.F;
        String b = xx0Var.b();
        textPaint = yx0.getTextPaint();
        this.u = new pkb(pv3.m(b, textPaint.getFontMetricsInt(), false, null, 0), 17.0f, hl.o());
        int i = xx0Var.q;
        this.n = i;
        this.p = hl.B(i) < 0.721f;
        o oVar = xx0Var.J;
        if (oVar != null) {
            ArrayList arrayList = oVar.e0;
            if (!arrayList.isEmpty()) {
                Object g = c00.g(1, arrayList);
                if ((g instanceof TLRPC.WebPage) && ((page = ((TLRPC.WebPage) g).cached_page) == null || page.local == null)) {
                    this.s = view.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                }
            }
        }
        this.q = xx0Var.I;
        path.rewind();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(hl.L(12.0f), hl.L(12.0f));
        path.moveTo(hl.L(12.0f), 0.0f);
        path.lineTo(0.0f, hl.L(12.0f));
        path2.rewind();
        path2.moveTo(0.0f, hl.L(6.33f) / 2.0f);
        path2.lineTo(hl.L(12.66f) / 2.0f, (-hl.L(6.33f)) / 2.0f);
        path2.lineTo(hl.L(12.66f), hl.L(6.33f) / 2.0f);
    }

    public final void a(Canvas canvas, RectF rectF, float f, float f2, float f3) {
        float f4;
        int f5 = vm2.f(this.w, this.m, this.n);
        Paint paint = this.g;
        paint.setColor(f5);
        float f6 = f2 * 255.0f;
        paint.setAlpha((int) f6);
        paint.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(1.0f), aob.p1(f2, TLObject.FLAG_28));
        float[] fArr = this.x;
        fArr[3] = f;
        fArr[2] = f;
        fArr[1] = f;
        int i = 0;
        fArr[0] = f;
        float R1 = hl.R1(f, 0.0f, this.w);
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
            int p1 = aob.p1(0.07f * f2 * this.w, hl.B(f5) > 0.721f ? -16777216 : -1);
            Paint paint2 = this.h;
            paint2.setColor(p1);
            float f8 = rectF.left;
            canvas.drawRect(f8, rectF.top, (rectF.width() * f7) + f8, rectF.bottom, paint2);
            canvas.restore();
        }
        float R12 = hl.R1(this.o ? 1.0f : 0.0f, this.p ? 1.0f : 0.0f, this.w);
        int f9 = vm2.f(R12, -16777216, -1);
        Paint paint3 = this.i;
        paint3.setColor(f9);
        paint3.setStrokeWidth(hl.L(2.0f));
        canvas.save();
        canvas.translate(rectF.left, rectF.centerY());
        int f10 = vm2.f(R12, 553648127, 553648127);
        int L = hl.L(25.0f) + (-hl.L(25.0f));
        int i2 = -hl.L(25.0f);
        int L2 = hl.L(25.0f) + hl.L(25.0f);
        int L3 = hl.L(25.0f);
        hf0 hf0Var = this.l;
        hf0Var.setBounds(L, i2, L2, L3);
        if (this.k != f10) {
            this.k = f10;
            aob.F1(hf0Var, f10, false);
        }
        hf0Var.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.left + hl.L(18.0f), rectF.centerY() - hl.L(6.0f));
        float f11 = f6 * f3;
        int i3 = (int) f11;
        paint3.setAlpha(i3);
        canvas.drawPath(this.z, paint3);
        canvas.restore();
        canvas.save();
        canvas.translate(rectF.right - hl.L(30.66f), rectF.centerY());
        paint3.setAlpha((int) ((1.0f - this.w) * f11));
        canvas.drawPath(this.A, paint3);
        canvas.restore();
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            int L4 = hl.L(24.0f);
            canvas.save();
            Rect rect = hl.Q;
            float f12 = L4;
            float f13 = f12 / 2.0f;
            rect.set((int) (rectF.left + hl.L(56.0f)), (int) (rectF.centerY() - f13), (int) (rectF.left + hl.L(56.0f) + f12), (int) (rectF.centerY() + f13));
            Paint paint4 = this.j;
            paint4.setAlpha(i3);
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint4);
            canvas.restore();
            i = hl.L(4.0f) + L4;
        } else {
            Drawable drawable = this.s;
            if (drawable != null) {
                float L5 = hl.L(24.0f);
                int intrinsicHeight = (int) ((L5 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth());
                Rect rect2 = hl.Q;
                float f14 = (L5 / 2.0f) * 0.7f;
                rect2.set((int) (rectF.left + hl.L(56.0f)), (int) (rectF.centerY() - f14), (int) ((intrinsicHeight * 0.7f) + rectF.left + hl.L(56.0f)), (int) (rectF.centerY() + f14));
                if (f9 != this.t) {
                    this.t = f9;
                    drawable.setColorFilter(new PorterDuffColorFilter(f9, PorterDuff.Mode.SRC_IN));
                }
                drawable.setAlpha(i3);
                drawable.setBounds(rect2);
                drawable.draw(canvas);
                i = intrinsicHeight - hl.L(2.0f);
            }
        }
        pkb pkbVar = this.v;
        if (pkbVar != null) {
            pkbVar.p = (int) ((rectF.width() - hl.L(100.0f)) - r3);
            f4 = 1.0f;
            pkbVar.c(rectF.left + hl.L(60.0f) + i, rectF.centerY(), qd4.z(1.0f, this.w, f2, f3), f9, canvas);
            f9 = f9;
        } else {
            f4 = 1.0f;
        }
        float width = rectF.width() - hl.L(100.0f);
        float f15 = i;
        pkb pkbVar2 = this.u;
        pkbVar2.p = (int) (width - f15);
        pkbVar2.c(rectF.left + hl.L(60.0f) + f15, rectF.centerY(), (this.v == null ? f4 : this.w) * f2 * f3, f9, canvas);
    }

    public final float b() {
        float c = c();
        return this.f.d(this.d >= 0) * (c < 0.0f ? c + 1.0f : (c < 0.0f || c >= 1.0f) ? (1.0f - Math.min(1.0f, c - 1.0f)) * 0.87f : hl.R1(1.0f, 0.87f, c));
    }

    public final float c() {
        if (this.d < 0) {
            return this.c;
        }
        return this.e.e(false, this.c);
    }
}
