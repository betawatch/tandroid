package zh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j0 extends Drawable {
    public NinePatchDrawable a;
    public NinePatchDrawable b;
    public final TextPaint c;
    public final ImageReceiver d;
    public final w8 e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public boolean l;
    public CharSequence m;
    public StaticLayout n;
    public float o;
    public float p;
    public n5 q;
    public View r;
    public int s;
    public int t;
    public int u;

    public j0() {
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        this.e = new w8((f6) null);
        int L = org.telegram.messenger.g0.L(10.66f);
        this.f = L * 2;
        this.g = org.telegram.messenger.g0.L(4.0f);
        this.h = org.telegram.messenger.g0.N(15.33f);
        this.i = org.telegram.messenger.g0.N(7.33f);
        this.j = org.telegram.messenger.g0.L(8.0f);
        this.k = (int) org.telegram.messenger.g0.N(22.66f);
        xq xqVar = xq.f;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        imageReceiver.J0(L);
    }

    public final void a() {
        if (this.a == null) {
            Drawable drawable = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.gift_message_bubble_24);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            int i7 = (intrinsicWidth * 27) / qs.y2;
            int i10 = (intrinsicHeight * 4) / qs.a2;
            this.a = c8.n0.a(createBitmap, new Rect(i7, i10, (intrinsicWidth * 5) / qs.y2, i10), (intrinsicWidth * 94) / qs.y2, (intrinsicHeight * 71) / qs.a2);
        }
        if (this.b == null) {
            Drawable drawable2 = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.gift_message_bubble_border_24);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth();
            int intrinsicHeight2 = drawable2.getIntrinsicHeight();
            Bitmap createBitmap2 = Bitmap.createBitmap(intrinsicWidth2, intrinsicHeight2, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            drawable2.setBounds(0, 0, intrinsicWidth2, intrinsicHeight2);
            drawable2.draw(canvas2);
            Paint paint = new Paint(1);
            float f10 = intrinsicWidth2;
            float f11 = intrinsicHeight2;
            paint.setShader(new LinearGradient(f10, 0.0f, 0.0f, f11, new int[]{1090519039, -805306369, 1090519039}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
            canvas2.drawRect(0.0f, 0.0f, f10, f11, paint);
            int i11 = (intrinsicWidth2 * 27) / qs.y2;
            int i12 = (intrinsicHeight2 * 4) / qs.a2;
            this.b = c8.n0.a(createBitmap2, new Rect(i11, i12, (intrinsicWidth2 * 5) / qs.y2, i12), (intrinsicWidth2 * 94) / qs.y2, (intrinsicHeight2 * 71) / qs.a2);
        }
    }

    public final void b(int i7) {
        int ceil;
        a();
        if (i7 != this.s || this.n == null) {
            this.s = i7;
            int i10 = !this.l ? 0 : this.g + this.f;
            int i11 = this.j;
            int i12 = i10 + i11;
            int i13 = (i7 - i12) - i11;
            int i14 = this.k;
            if (i13 <= 0 || TextUtils.isEmpty(this.m)) {
                this.n = null;
                this.t = i14;
                this.u = i14;
                return;
            }
            CharSequence charSequence = this.m;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            TextPaint textPaint = this.c;
            StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i13, alignment, 1.0f, 0.0f, false);
            int lineCount = staticLayout.getLineCount();
            float f10 = 0.0f;
            float f11 = 0.0f;
            for (int i15 = 0; i15 < lineCount; i15++) {
                f11 = Math.max(f11, staticLayout.getLineWidth(i15));
            }
            if (lineCount > 1 && (ceil = (int) Math.ceil(f11)) < i13) {
                StaticLayout staticLayout2 = new StaticLayout(this.m, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                if (staticLayout2.getLineCount() == lineCount) {
                    for (int i16 = 0; i16 < staticLayout2.getLineCount(); i16++) {
                        f10 = Math.max(f10, staticLayout2.getLineWidth(i16));
                    }
                    f11 = f10;
                    staticLayout = staticLayout2;
                }
            }
            this.n = staticLayout;
            this.o = i12;
            this.t = ((int) Math.ceil(f11)) + i12 + i11;
            int lineCount2 = this.n.getLineCount() - 1;
            float lineBaseline = this.n.getLineBaseline(0);
            float lineBaseline2 = this.n.getLineBaseline(lineCount2) - lineBaseline;
            float f12 = this.h;
            this.u = Math.max(i14, (int) Math.ceil(lineBaseline2 + f12 + this.i));
            this.p = f12 - lineBaseline;
        }
    }

    public final void c(TLObject tLObject) {
        boolean z9 = tLObject != null;
        this.l = z9;
        if (z9) {
            w8 w8Var = this.e;
            w8Var.l(tLObject);
            boolean z10 = tLObject instanceof TLRPC.User;
            ImageReceiver imageReceiver = this.d;
            if (z10) {
                imageReceiver.q0(hc.l(p10.s0, 1, (TLRPC.User) tLObject), "48_48", w8Var, null, null, 0);
            } else if (tLObject instanceof TLRPC.Chat) {
                imageReceiver.q0(hc.a(1, (TLRPC.Chat) tLObject), "48_48", w8Var, null, null, 0);
            } else {
                imageReceiver.w0(w8Var);
            }
        }
        this.s = -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a();
        Rect bounds = getBounds();
        canvas.save();
        boolean z9 = this.l;
        float f10 = z9 ? 1.0f : 0.0f;
        NinePatchDrawable ninePatchDrawable = this.a;
        int i7 = bounds.left;
        int i10 = this.g;
        int i11 = this.f;
        bg.s.g(ninePatchDrawable, i7 + (z9 ? i10 + i11 : 0), bounds.top, bounds.right, bounds.bottom);
        this.a.draw(canvas);
        bg.s.g(this.b, bounds.left + (this.l ? i10 + i11 : 0), bounds.top, bounds.right, bounds.bottom);
        this.b.draw(canvas);
        if (this.n != null) {
            canvas.save();
            canvas.translate(bounds.left + this.o, bounds.top + this.p);
            this.n.draw(canvas);
            View view = this.r;
            if (view != null && (this.m instanceof Spanned)) {
                n5 update = r5.update(0, view, false, this.q, this.n);
                this.q = update;
                r5.drawAnimatedEmojis(canvas, this.n, update, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, null);
            }
            canvas.restore();
        }
        if (f10 > 0.0f) {
            int i12 = bounds.left;
            ImageReceiver imageReceiver = this.d;
            imageReceiver.y0(i12, bounds.bottom - i11, i11, i11);
            canvas.save();
            canvas.scale(f10, f10, imageReceiver.r(), imageReceiver.s());
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
