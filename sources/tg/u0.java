package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.a5;
import org.telegram.messenger.cz;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u4;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u0 implements h6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ a5 f;

    public u0(a5 a5Var) {
        this.f = a5Var;
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
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, cz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean d() {
        return this.f.C0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final void e(float f10, float f11, int i7, int i10) {
        m6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final ColorFilter f() {
        return m6.v3;
    }

    @Override // org.telegram.ui.ActionBar.h6
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
                return m6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final Drawable getDrawable(String str) {
        a5 a5Var = this.f;
        u0 u0Var = a5Var.E0;
        if (str.equals("drawableMsgIn")) {
            if (a5Var.F0 == null) {
                a5Var.F0 = new u4(0, false, false, u0Var);
            }
            return a5Var.F0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (a5Var.G0 == null) {
                a5Var.G0 = new u4(0, false, true, u0Var);
            }
            return a5Var.G0;
        }
        if (str.equals("drawableMsgOut")) {
            if (a5Var.H0 == null) {
                a5Var.H0 = new u4(0, true, false, u0Var);
            }
            return a5Var.H0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (a5Var.I0 == null) {
                a5Var.I0 = new u4(0, true, true, u0Var);
            }
            return a5Var.I0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (a5Var.J0 == null) {
                a5Var.J0 = new u4(1, false, false, u0Var);
            }
            a5Var.J0.invalidateSelf();
            return a5Var.J0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (a5Var.K0 == null) {
                a5Var.K0 = new u4(1, false, true, u0Var);
            }
            return a5Var.K0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (a5Var.L0 == null) {
                a5Var.L0 = new u4(1, true, false, u0Var);
            }
            return a5Var.L0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return m6.R0(str);
        }
        if (a5Var.M0 == null) {
            a5Var.M0 = new u4(1, true, true, u0Var);
        }
        return a5Var.M0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final boolean h() {
        return cz.H0;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int i(int i7) {
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int k(int i7) {
        return this.f.D0.get(i7, m6.x0(null, i7, false));
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final int m(int i7) {
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.h6
    public final /* synthetic */ void l(int i7, int i10) {
    }
}
