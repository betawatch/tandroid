package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public abstract class l0 {
    public static final int[] a = {t6.ra, t6.Sc, t6.be, t6.Uc, t6.Kd};
    public static final int[] b = {t6.ob, t6.Tc, t6.gc, t6.Vc, t6.Qb};
    public static final int[] c = {t6.rb, t6.sb, t6.tb};

    public static String a(p6 p6Var, boolean z10) {
        boolean a2 = p6Var != null ? p6Var.a() : t6.I.q();
        int[] iArr = z10 ? b : a;
        try {
            int w9 = t6.w(a2 ? -16777216 : -1, b(p6Var, z10));
            int w02 = t6.w0(iArr[1], p6Var);
            int w03 = t6.w0(iArr[2], p6Var);
            int w04 = t6.w0(iArr[3], p6Var);
            int w05 = t6.w0(iArr[4], p6Var);
            int w06 = t6.w0(t6.Ci, p6Var);
            int w07 = t6.w0(t6.Gi, p6Var);
            int w10 = t6.w(w9, t6.r1(0.1f, w05));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(w9, w9));
            jSONObject.put("text_color", c(w02, w9));
            jSONObject.put("hint_color", c(w03, w9));
            jSONObject.put("link_color", c(w04, w9));
            jSONObject.put("button_color", c(w06, w9));
            jSONObject.put("button_text_color", c(w07, w06));
            jSONObject.put("secondary_bg_color", c(w10, w9));
            jSONObject.put("accent_text_color", c(w05, w9));
            jSONObject.put("subtitle_text_color", c(w03, w9));
            jSONObject.put("destructive_text_color", c(t6.w0(t6.p7, p6Var), w9));
            jSONObject.put("section_bg_color", c(w9, w9));
            jSONObject.put("section_header_text_color", c(w05, w9));
            jSONObject.put("section_separator_color", c(t6.r1(0.12f, w02), w9));
            jSONObject.put("header_bg_color", c(w10, w9));
            jSONObject.put("bottom_bar_bg_color", c(w10, w9));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, w9));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("colorScheme", a2 ? "dark" : "light");
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e) {
            f8.g(e, true);
            return a1.g.r(new StringBuilder("{\"colorScheme\":\""), a2 ? "dark" : "light", "\"}");
        }
    }

    public static int b(p6 p6Var, boolean z10) {
        int w02 = t6.w0(z10 ? b[0] : a[0], p6Var);
        if (z10) {
            int[] iArr = c;
            int i10 = iArr[0];
            if ((p6Var != null ? p6Var.j(i10) : t6.im.get(i10)) != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i11 = 1;
                for (int i12 : iArr) {
                    int j10 = p6Var != null ? p6Var.j(i12) : t6.im.get(i12);
                    if (j10 != 0) {
                        int red2 = Color.red(j10) + red;
                        int green2 = Color.green(j10) + green;
                        i11++;
                        blue = Color.blue(j10) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(w02), red / i11, green / i11, blue / i11);
            }
        }
        return w02;
    }

    public static String c(int i10, int i11) {
        int w9 = t6.w(i11, i10);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w9)), Integer.valueOf(Color.green(w9)), Integer.valueOf(Color.blue(w9)));
    }

    public static String d(boolean z10) {
        return a1.g.r(new StringBuilder("{\"colorScheme\":\""), z10 ? "dark" : "light", "\"}");
    }

    public static int e(p6 p6Var, boolean z10) {
        int i10 = (p6Var == null ? !t6.I.q() : !p6Var.a()) ? 0 : 1;
        for (int i11 : z10 ? b : a) {
            i10 = (i10 * 31) + t6.w0(i11, p6Var);
        }
        if (z10) {
            for (int i12 : c) {
                i10 = (i10 * 31) + (p6Var != null ? p6Var.j(i12) : t6.im.get(i12));
            }
        }
        int w02 = (((t6.w0(t6.p7, p6Var) + ((t6.w0(t6.Gi, p6Var) + ((t6.w0(t6.Ci, p6Var) + (i10 * 31)) * 31)) * 31)) * 31) + tz.W0) * 31;
        TextPaint textPaint = t6.o2;
        return gl0.i0() + ((w02 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", tz.W0);
        TextPaint textPaint = t6.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(gl0.i0() / org.telegram.messenger.i0.p) + "px");
        return jSONObject;
    }
}
