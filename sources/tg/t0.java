package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import fi.e5;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t4;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class t0 implements f6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ e5 f;

    public t0(e5 e5Var) {
        this.f = e5Var;
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
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, iz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return this.f.B0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void b(float f10, float f11, int i7, int i10) {
        k6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter c() {
        return k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
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

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean e() {
        return iz.H0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int f(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        e5 e5Var = this.f;
        t0 t0Var = e5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (e5Var.E0 == null) {
                e5Var.E0 = new t4(0, false, false, t0Var);
            }
            return e5Var.E0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (e5Var.F0 == null) {
                e5Var.F0 = new t4(0, false, true, t0Var);
            }
            return e5Var.F0;
        }
        if (str.equals("drawableMsgOut")) {
            if (e5Var.G0 == null) {
                e5Var.G0 = new t4(0, true, false, t0Var);
            }
            return e5Var.G0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (e5Var.H0 == null) {
                e5Var.H0 = new t4(0, true, true, t0Var);
            }
            return e5Var.H0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (e5Var.I0 == null) {
                e5Var.I0 = new t4(1, false, false, t0Var);
            }
            e5Var.I0.invalidateSelf();
            return e5Var.I0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (e5Var.J0 == null) {
                e5Var.J0 = new t4(1, false, true, t0Var);
            }
            return e5Var.J0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (e5Var.K0 == null) {
                e5Var.K0 = new t4(1, true, false, t0Var);
            }
            return e5Var.K0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return k6.R0(str);
        }
        if (e5Var.L0 == null) {
            e5Var.L0 = new t4(1, true, true, t0Var);
        }
        return e5Var.L0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h(int i7) {
        return this.f.C0.get(i7, k6.x0(null, i7, false));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int j(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final /* synthetic */ void i(int i7, int i10) {
    }
}
