// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yg8 extends View {
    public final Drawable a;
    public final fm0 b;
    public final byte c;
    public zg8 d;

    /* JADX WARN: Multi-variable type inference failed */
    public yg8(Context context, int i) {
        super(context);
        this.b = new fm0(380L, this, k43.h);
        this.c = i;
        Drawable e = c00.e(context, R.drawable.outline_poll_attach_24);
        this.a = e;
        yob.x(this, e, aob.o7, null, PorterDuff.Mode.SRC_IN);
    }

    public final void a(zg8 zg8Var, boolean z) {
        zg8 zg8Var2;
        zg8 zg8Var3;
        this.b.a(zg8Var != null, z);
        if (isAttachedToWindow() && (zg8Var3 = this.d) != null) {
            zg8Var3.b();
        }
        this.d = zg8Var;
        if (!isAttachedToWindow() || (zg8Var2 = this.d) == null) {
            return;
        }
        zg8Var2.a(this);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zg8 zg8Var = this.d;
        if (zg8Var != null) {
            zg8Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zg8 zg8Var = this.d;
        if (zg8Var != null) {
            zg8Var.b();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.b.e;
        if (f < 1.0f) {
            canvas.save();
            float f2 = 1.0f - f;
            canvas.scale(f2, f2, width, height);
            this.a.draw(canvas);
            canvas.restore();
        }
        if (f > 0.0f) {
            float f3 = this.c;
            int L = hl.L(f3);
            int width2 = (getWidth() - L) / 2;
            int height2 = (getHeight() - L) / 2;
            canvas.save();
            canvas.translate(width2, height2);
            canvas.scale(f, f, hl.L(f3) / 2.0f, hl.L(f3) / 2.0f);
            zg8 zg8Var = this.d;
            if (zg8Var != null) {
                zg8Var.c(canvas, hl.L(f3), hl.L(f3));
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int L = hl.L(24.0f);
        int i5 = (i - L) / 2;
        int i6 = (i2 - L) / 2;
        this.a.setBounds(i5, i6, i5 + L, L + i6);
    }
}
