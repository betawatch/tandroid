package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ci.f3;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l extends View {
    public final int a;
    public r5 b;
    public final Paint c;
    public long d;
    public TLRPC.Document e;
    public String f;
    public float h;
    public float n;
    public float r;

    public l(Context context, int i10) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.n = 1.0f;
        this.r = 1.0f;
        this.a = i10;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r5 r5Var = this.b;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5 r5Var = this.b;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f3 f3Var;
        float f7 = isPressed() ? 1.0f : 0.0f;
        float f10 = this.h;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.h;
                f7 = k3.y(f7, f11, 0.35f, f11);
            }
            this.h = f7;
            invalidate();
        }
        float f12 = (1.0f - (this.h * 0.2f)) * this.n * this.r;
        if (f12 <= 0.01f) {
            return;
        }
        float width = getWidth() * 0.78f * f12;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        r5 r5Var = this.b;
        if (r5Var == null || (f3Var = r5Var.k) == null || !f3Var.hasBitmapImage()) {
            canvas.drawCircle(width2, height, 0.42f * width, this.c);
        }
        r5 r5Var2 = this.b;
        if (r5Var2 != null) {
            float f13 = width / 2.0f;
            r5Var2.setBounds((int) (width2 - f13), (int) (height - f13), (int) (width2 + f13), (int) (height + f13));
            r.b(canvas, this.b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.id;
        if (j10 == 0) {
            if (this.b != null && isAttachedToWindow()) {
                this.b.o(this);
            }
            this.b = null;
            this.d = 0L;
            this.e = document;
            this.f = null;
            invalidate();
            return;
        }
        if (j10 != this.d || this.b == null) {
            if (this.b != null && isAttachedToWindow()) {
                this.b.o(this);
            }
            this.d = document.id;
            this.e = document;
            this.f = "c:" + document.id;
            this.b = r5.m(this.a, 2, document);
            if (isAttachedToWindow()) {
                this.b.a(this);
            }
            setContentDescription(document.id + "");
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (z10 != isPressed()) {
            super.setPressed(z10);
            invalidate();
        }
    }
}
