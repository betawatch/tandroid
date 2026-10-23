package rg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import ei.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class e1 implements g6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ r5 f;

    public e1(r5 r5Var) {
        this.f = r5Var;
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
        textPaint.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint2.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
        textPaint3.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint3.setTypeface(AndroidUtilities.bold());
        paint.setColor(352321536);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final boolean a() {
        return this.f.B0;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final void b(float f7, float f10, int i10, int i11) {
        k6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final ColorFilter c() {
        return k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.g6
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
                return k6.U0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int g(int i10) {
        return this.f.C0.get(i10, k6.x0(null, i10, false));
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final Drawable getDrawable(String str) {
        r5 r5Var = this.f;
        e1 e1Var = r5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (r5Var.E0 == null) {
                r5Var.E0 = new j5(0, false, false, e1Var);
            }
            return r5Var.E0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (r5Var.F0 == null) {
                r5Var.F0 = new j5(0, false, true, e1Var);
            }
            return r5Var.F0;
        }
        if (str.equals("drawableMsgOut")) {
            if (r5Var.G0 == null) {
                r5Var.G0 = new j5(0, true, false, e1Var);
            }
            return r5Var.G0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (r5Var.H0 == null) {
                r5Var.H0 = new j5(0, true, true, e1Var);
            }
            return r5Var.H0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (r5Var.I0 == null) {
                r5Var.I0 = new j5(1, false, false, e1Var);
            }
            r5Var.I0.invalidateSelf();
            return r5Var.I0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (r5Var.J0 == null) {
                r5Var.J0 = new j5(1, false, true, e1Var);
            }
            return r5Var.J0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (r5Var.K0 == null) {
                r5Var.K0 = new j5(1, true, false, e1Var);
            }
            return r5Var.K0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return k6.Q0(str);
        }
        if (r5Var.L0 == null) {
            r5Var.L0 = new j5(1, true, true, e1Var);
        }
        return r5Var.L0;
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final int i(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.g6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
