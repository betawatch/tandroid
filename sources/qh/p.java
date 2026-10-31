package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p extends View {
    public final f5 a;
    public final Drawable b;
    public float c;
    public boolean d;

    public p(g0 g0Var, Context context, int i10, TLRPC.Document document) {
        super(context);
        if (document != null) {
            this.a = f5.l(g0Var.a, 5, document);
            this.b = null;
        } else {
            this.a = null;
            Drawable mutate = context.getDrawable(i10 == 0 ? R.drawable.emoji_tabs_faves : R.drawable.msg_emoji_recent).mutate();
            this.b = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f5 f5Var = this.a;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5 f5Var = this.a;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = this.d ? 1.0f : 0.0f;
        float f10 = this.c;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.c;
                f7 = c3.i0.z(f7, f11, 0.35f, f11);
            }
            this.c = f7;
            invalidate();
        }
        float interpolation = (1.0f - (gr.g.getInterpolation(this.c) * 0.15f)) * org.telegram.messenger.i0.L(26.0f);
        float f12 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f12);
        int height = (int) ((getHeight() / 2.0f) - f12);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = this.b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            r.b(canvas, drawable);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = true;
            invalidate();
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d = false;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
