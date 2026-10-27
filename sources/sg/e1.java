package sg;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import fi.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e1 implements u6 {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ q5 f;

    public e1(q5 q5Var) {
        this.f = q5Var;
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

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        return this.f.B0;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        y6.q(f7, f10, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        return y6.v3;
    }

    @Override // org.telegram.ui.ActionBar.u6
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
                return y6.U0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        return this.f.C0.get(i10, y6.x0(null, i10, false));
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Drawable getDrawable(String str) {
        q5 q5Var = this.f;
        e1 e1Var = q5Var.D0;
        if (str.equals("drawableMsgIn")) {
            if (q5Var.E0 == null) {
                q5Var.E0 = new l5(0, false, false, e1Var);
            }
            return q5Var.E0;
        }
        if (str.equals("drawableMsgInSelected")) {
            if (q5Var.F0 == null) {
                q5Var.F0 = new l5(0, false, true, e1Var);
            }
            return q5Var.F0;
        }
        if (str.equals("drawableMsgOut")) {
            if (q5Var.G0 == null) {
                q5Var.G0 = new l5(0, true, false, e1Var);
            }
            return q5Var.G0;
        }
        if (str.equals("drawableMsgOutSelected")) {
            if (q5Var.H0 == null) {
                q5Var.H0 = new l5(0, true, true, e1Var);
            }
            return q5Var.H0;
        }
        if (str.equals("drawableMsgInMedia")) {
            if (q5Var.I0 == null) {
                q5Var.I0 = new l5(1, false, false, e1Var);
            }
            q5Var.I0.invalidateSelf();
            return q5Var.I0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            if (q5Var.J0 == null) {
                q5Var.J0 = new l5(1, false, true, e1Var);
            }
            return q5Var.J0;
        }
        if (str.equals("drawableMsgOutMedia")) {
            if (q5Var.K0 == null) {
                q5Var.K0 = new l5(1, true, false, e1Var);
            }
            return q5Var.K0;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return y6.Q0(str);
        }
        if (q5Var.L0 == null) {
            q5Var.L0 = new l5(1, true, true, e1Var);
        }
        return q5Var.L0;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final /* synthetic */ void h(int i10, int i11) {
    }
}
