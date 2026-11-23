package tg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import hi.l5;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u4;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class y0 implements i6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ l5 f;

    public y0(l5 l5Var) {
        this.f = l5Var;
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
    public final boolean b() {
        return this.f.D0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void c(float f10, float f11, int i7, int i10) {
        n6.r(f10, f11, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter d() {
        return n6.v3;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint e(String str) {
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
    public final boolean f() {
        return bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int g(int i7) {
        return i(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        l5 l5Var = this.f;
        y0 y0Var = l5Var.F0;
        if (str.equals("drawableMsgIn")) {
            if (l5Var.G0 == null) {
                l5Var.G0 = new u4(0, false, false, y0Var);
            }
            return l5Var.G0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (l5Var.H0 == null) {
                l5Var.H0 = new u4(0, false, true, y0Var);
            }
            return l5Var.H0;
        }
        if (str.equals("drawableMsgOut")) {
            if (l5Var.I0 == null) {
                l5Var.I0 = new u4(0, true, false, y0Var);
            }
            return l5Var.I0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (l5Var.J0 == null) {
                l5Var.J0 = new u4(0, true, true, y0Var);
            }
            return l5Var.J0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (l5Var.K0 == null) {
                l5Var.K0 = new u4(1, false, false, y0Var);
            }
            l5Var.K0.invalidateSelf();
            return l5Var.K0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (l5Var.L0 == null) {
                l5Var.L0 = new u4(1, false, true, y0Var);
            }
            return l5Var.L0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (l5Var.M0 == null) {
                l5Var.M0 = new u4(1, true, false, y0Var);
            }
            return l5Var.M0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return n6.R0(str);
        }
        if (l5Var.N0 == null) {
            l5Var.N0 = new u4(1, true, true, y0Var);
        }
        return l5Var.N0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        return this.f.E0.get(i7, n6.x0(null, i7, false));
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        return i(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void j(int i7, int i10) {
    }
}
