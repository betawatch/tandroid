package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.b5;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.v4;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t0 implements i6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ b5 f;

    public t0(b5 b5Var) {
        this.f = b5Var;
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.b = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.c = textPaint3;
        new Paint(3);
        this.d = new Paint(3);
        Paint paint = new Paint(3);
        this.e = paint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, bz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean d() {
        return this.f.C0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void e(float f10, float f11, int i7, int i10) {
        n6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter f() {
        return n6.v3;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint g(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.b;
            case "paintChatBotButton":
                return this.c;
            case "paintChatActionBackgroundDarken":
                return this.e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.a;
            default:
                return n6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        b5 b5Var = this.f;
        t0 t0Var = b5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (b5Var.F0 == null) {
                b5Var.F0 = new v4(0, false, false, t0Var);
            }
            return b5Var.F0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (b5Var.G0 == null) {
                b5Var.G0 = new v4(0, false, true, t0Var);
            }
            return b5Var.G0;
        }
        if (str.equals("drawableMsgOut")) {
            if (b5Var.H0 == null) {
                b5Var.H0 = new v4(0, true, false, t0Var);
            }
            return b5Var.H0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (b5Var.I0 == null) {
                b5Var.I0 = new v4(0, true, true, t0Var);
            }
            return b5Var.I0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (b5Var.J0 == null) {
                b5Var.J0 = new v4(1, false, false, t0Var);
            }
            b5Var.J0.invalidateSelf();
            return b5Var.J0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (b5Var.K0 == null) {
                b5Var.K0 = new v4(1, false, true, t0Var);
            }
            return b5Var.K0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (b5Var.L0 == null) {
                b5Var.L0 = new v4(1, true, false, t0Var);
            }
            return b5Var.L0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return n6.R0(str);
        }
        if (b5Var.M0 == null) {
            b5Var.M0 = new v4(1, true, true, t0Var);
        }
        return b5Var.M0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean h() {
        return bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        return this.f.D0.get(i7, n6.x0(null, i7, false));
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int m(int i7) {
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void l(int i7, int i10) {
    }
}
