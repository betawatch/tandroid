// default package

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t17 implements wjb {
    public final TextPaint a;
    public final TextPaint b;
    public final TextPaint c;
    public final Paint d;
    public final Paint e;
    public final /* synthetic */ ot7 f;

    public t17(ot7 ot7Var) {
        this.f = ot7Var;
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
        textPaint.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        textPaint2.setTextSize(gl.L(Math.max(16, gba.S0) - 2));
        textPaint3.setTextSize(gl.L(15.0f));
        textPaint3.setTypeface(gl.o());
        paint.setColor(352321536);
    }

    @Override // wjb
    public final boolean a() {
        return this.f.D0;
    }

    @Override // wjb
    public final void b(float f, float f2, int i, int i2) {
        bkb.q(f, f2, i, i2);
    }

    @Override // wjb
    public final ColorFilter c() {
        return bkb.u3;
    }

    @Override // wjb
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
                return bkb.T0(str);
        }
    }

    @Override // wjb
    public final boolean e() {
        return gba.D0;
    }

    @Override // wjb
    public final int f(int i) {
        return h(i);
    }

    @Override // wjb
    public final boolean g() {
        return false;
    }

    @Override // wjb
    public final Drawable getDrawable(String str) {
        ot7 ot7Var = this.f;
        t17 t17Var = ot7Var.F0;
        if (str.equals("drawableMsgIn")) {
            m17 m17Var = ot7Var.G0;
            if (m17Var != null) {
                return m17Var;
            }
            m17 m17Var2 = new m17(0, false, false, t17Var);
            ot7Var.G0 = m17Var2;
            return m17Var2;
        }
        if (str.equals("drawableMsgInSelected")) {
            m17 m17Var3 = ot7Var.H0;
            if (m17Var3 != null) {
                return m17Var3;
            }
            m17 m17Var4 = new m17(0, false, true, t17Var);
            ot7Var.H0 = m17Var4;
            return m17Var4;
        }
        if (str.equals("drawableMsgOut")) {
            m17 m17Var5 = ot7Var.I0;
            if (m17Var5 != null) {
                return m17Var5;
            }
            m17 m17Var6 = new m17(0, true, false, t17Var);
            ot7Var.I0 = m17Var6;
            return m17Var6;
        }
        if (str.equals("drawableMsgOutSelected")) {
            m17 m17Var7 = ot7Var.J0;
            if (m17Var7 != null) {
                return m17Var7;
            }
            m17 m17Var8 = new m17(0, true, true, t17Var);
            ot7Var.J0 = m17Var8;
            return m17Var8;
        }
        if (str.equals("drawableMsgInMedia")) {
            m17 m17Var9 = ot7Var.K0;
            if (m17Var9 == null) {
                m17Var9 = new m17(1, false, false, t17Var);
                ot7Var.K0 = m17Var9;
            }
            m17Var9.invalidateSelf();
            return ot7Var.K0;
        }
        if (str.equals("drawableMsgInMediaSelected")) {
            m17 m17Var10 = ot7Var.L0;
            if (m17Var10 != null) {
                return m17Var10;
            }
            m17 m17Var11 = new m17(1, false, true, t17Var);
            ot7Var.L0 = m17Var11;
            return m17Var11;
        }
        if (str.equals("drawableMsgOutMedia")) {
            m17 m17Var12 = ot7Var.M0;
            if (m17Var12 != null) {
                return m17Var12;
            }
            m17 m17Var13 = new m17(1, true, false, t17Var);
            ot7Var.M0 = m17Var13;
            return m17Var13;
        }
        if (!str.equals("drawableMsgOutMediaSelected")) {
            return bkb.P0(str);
        }
        m17 m17Var14 = ot7Var.N0;
        if (m17Var14 != null) {
            return m17Var14;
        }
        m17 m17Var15 = new m17(1, true, true, t17Var);
        ot7Var.N0 = m17Var15;
        return m17Var15;
    }

    @Override // wjb
    public final int h(int i) {
        return this.f.E0.get(i, bkb.w0(null, i, false));
    }

    @Override // wjb
    public final int j(int i) {
        return h(i);
    }

    @Override // wjb
    public final void i(int i, int i2) {
    }
}
