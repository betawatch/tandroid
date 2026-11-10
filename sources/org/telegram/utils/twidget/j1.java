package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public abstract class j1 {
    public static final int[] a = {m6.ra, m6.Sc, m6.be, m6.Uc, m6.Kd};
    public static final int[] b = {m6.ob, m6.Tc, m6.gc, m6.Vc, m6.Qb};
    public static final int[] c = {m6.rb, m6.sb, m6.tb};

    public static String a(h6 h6Var, boolean z9) {
        boolean a10 = h6Var != null ? h6Var.a() : m6.I.q();
        int[] iArr = z9 ? b : a;
        try {
            int w10 = m6.w(a10 ? -16777216 : -1, b(h6Var, z9));
            int w02 = m6.w0(iArr[1], h6Var);
            int w03 = m6.w0(iArr[2], h6Var);
            int w04 = m6.w0(iArr[3], h6Var);
            int w05 = m6.w0(iArr[4], h6Var);
            int w06 = m6.w0(m6.Ci, h6Var);
            int w07 = m6.w0(m6.Gi, h6Var);
            int w11 = m6.w(w10, m6.r1(0.1f, w05));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", c(w10, w10));
            jSONObject.put("text_color", c(w02, w10));
            jSONObject.put("hint_color", c(w03, w10));
            jSONObject.put("link_color", c(w04, w10));
            jSONObject.put("button_color", c(w06, w10));
            jSONObject.put("button_text_color", c(w07, w06));
            jSONObject.put("secondary_bg_color", c(w11, w10));
            jSONObject.put("accent_text_color", c(w05, w10));
            jSONObject.put("subtitle_text_color", c(w03, w10));
            jSONObject.put("destructive_text_color", c(m6.w0(m6.p7, h6Var), w10));
            jSONObject.put("section_bg_color", c(w10, w10));
            jSONObject.put("section_header_text_color", c(w05, w10));
            jSONObject.put("section_separator_color", c(m6.r1(0.12f, w02), w10));
            jSONObject.put("header_bg_color", c(w11, w10));
            jSONObject.put("bottom_bar_bg_color", c(w11, w10));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, w10));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("colorScheme", a10 ? "dark" : "light");
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", e());
            return jSONObject3.toString();
        } catch (Exception e10) {
            a8.g(e10, true);
            return a8.p0.s(new StringBuilder("{\"colorScheme\":\""), a10 ? "dark" : "light", "\"}");
        }
    }

    public static int b(h6 h6Var, boolean z9) {
        int w02 = m6.w0(z9 ? b[0] : a[0], h6Var);
        if (z9) {
            int[] iArr = c;
            int i7 = iArr[0];
            if ((h6Var != null ? h6Var.j(i7) : m6.im.get(i7)) != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i10 = 1;
                for (int i11 : iArr) {
                    int j3 = h6Var != null ? h6Var.j(i11) : m6.im.get(i11);
                    if (j3 != 0) {
                        int red2 = Color.red(j3) + red;
                        int green2 = Color.green(j3) + green;
                        i10++;
                        blue = Color.blue(j3) + blue;
                        green = green2;
                        red = red2;
                    }
                }
                return Color.argb(Color.alpha(w02), red / i10, green / i10, blue / i10);
            }
        }
        return w02;
    }

    public static String c(int i7, int i10) {
        int w10 = m6.w(i10, i7);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
    }

    public static int d(h6 h6Var, boolean z9) {
        int i7 = (h6Var == null ? !m6.I.q() : !h6Var.a()) ? 0 : 1;
        for (int i10 : z9 ? b : a) {
            i7 = (i7 * 31) + m6.w0(i10, h6Var);
        }
        if (z9) {
            for (int i11 : c) {
                i7 = (i7 * 31) + (h6Var != null ? h6Var.j(i11) : m6.im.get(i11));
            }
        }
        int w02 = (((m6.w0(m6.p7, h6Var) + ((m6.w0(m6.Gi, h6Var) + ((m6.w0(m6.Ci, h6Var) + (i7 * 31)) * 31)) * 31)) * 31) + iz.W0) * 31;
        TextPaint textPaint = m6.o2;
        return ck0.j0() + ((w02 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", iz.W0);
        TextPaint textPaint = m6.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(ck0.j0() / org.telegram.messenger.g0.p) + "px");
        return jSONObject;
    }
}
