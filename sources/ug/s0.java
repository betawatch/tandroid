package ug;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import gi.c5;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s0 implements e6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ c5 f;

    public s0(c5 c5Var) {
        this.f = c5Var;
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
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, az.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        return this.f.C0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i3, int i10) {
        k6.r(f10, f11, i3, i10);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        return k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
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
                return k6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        return az.H0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i3) {
        return h(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        c5 c5Var = this.f;
        s0 s0Var = c5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (c5Var.F0 == null) {
                c5Var.F0 = new t4(0, false, false, s0Var);
            }
            return c5Var.F0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (c5Var.G0 == null) {
                c5Var.G0 = new t4(0, false, true, s0Var);
            }
            return c5Var.G0;
        }
        if (str.equals("drawableMsgOut")) {
            if (c5Var.H0 == null) {
                c5Var.H0 = new t4(0, true, false, s0Var);
            }
            return c5Var.H0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (c5Var.I0 == null) {
                c5Var.I0 = new t4(0, true, true, s0Var);
            }
            return c5Var.I0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (c5Var.J0 == null) {
                c5Var.J0 = new t4(1, false, false, s0Var);
            }
            c5Var.J0.invalidateSelf();
            return c5Var.J0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (c5Var.K0 == null) {
                c5Var.K0 = new t4(1, false, true, s0Var);
            }
            return c5Var.K0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (c5Var.L0 == null) {
                c5Var.L0 = new t4(1, true, false, s0Var);
            }
            return c5Var.L0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return k6.R0(str);
        }
        if (c5Var.M0 == null) {
            c5Var.M0 = new t4(1, true, true, s0Var);
        }
        return c5Var.M0;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i3) {
        return this.f.D0.get(i3, k6.x0(null, i3, false));
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i3) {
        return h(i3);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final /* synthetic */ void i(int i3, int i10) {
    }
}
