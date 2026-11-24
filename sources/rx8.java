// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rx8 extends View {
    public final vm a;
    public final Drawable b;
    public float c;
    public boolean d;

    public rx8(gy8 gy8Var, Context context, int i, TLRPC.Document document) {
        super(context);
        if (document != null) {
            this.a = vm.l(gy8Var.a, 5, document);
            this.b = null;
        } else {
            this.a = null;
            Drawable mutate = context.getDrawable(i == 0 ? R.drawable.emoji_tabs_faves : R.drawable.msg_emoji_recent).mutate();
            this.b = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vm vmVar = this.a;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vm vmVar = this.a;
        if (vmVar != null) {
            vmVar.o(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.d ? 1.0f : 0.0f;
        float f2 = this.c;
        if (f2 != f) {
            if (Math.abs(f2 - f) >= 0.02f) {
                float f3 = this.c;
                f = td4.A(f, f3, 0.35f, f3);
            }
            this.c = f;
            invalidate();
        }
        float interpolation = (1.0f - (d53.g.getInterpolation(this.c) * 0.15f)) * gm.L(26.0f);
        float f4 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f4);
        int height = (int) ((getHeight() / 2.0f) - f4);
        Drawable drawable = this.a;
        if (drawable == null) {
            drawable = this.b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            tx8.b(canvas, drawable);
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
