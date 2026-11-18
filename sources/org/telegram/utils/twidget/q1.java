package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public abstract class q1 {
    public static final int[] a = {n6.ra, n6.Vc, n6.ee, n6.Xc, n6.Nd};
    public static final int[] b = {n6.rb, n6.Wc, n6.jc, n6.Yc, n6.Tb};
    public static final int[] c = {n6.ub, n6.vb, n6.wb};

    public static String a(i6 i6Var, boolean z10) {
        boolean d = i6Var != null ? i6Var.d() : n6.I.q();
        int[] iArr = z10 ? b : a;
        try {
            int w10 = n6.w(d ? -16777216 : -1, b(i6Var, z10));
            int w02 = n6.w0(iArr[1], i6Var);
            int w03 = n6.w0(iArr[2], i6Var);
            int w04 = n6.w0(iArr[3], i6Var);
            int w05 = n6.w0(iArr[4], i6Var);
            int w06 = n6.w0(n6.Fi, i6Var);
            int w07 = n6.w0(n6.Ji, i6Var);
            int w11 = n6.w(w10, n6.r1(0.1f, w05));
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
            jSONObject.put("destructive_text_color", c(n6.w0(n6.p7, i6Var), w10));
            jSONObject.put("section_bg_color", c(w10, w10));
            jSONObject.put("section_header_text_color", c(w05, w10));
            jSONObject.put("section_separator_color", c(n6.r1(0.12f, w02), w10));
            jSONObject.put("header_bg_color", c(w11, w10));
            jSONObject.put("bottom_bar_bg_color", c(w11, w10));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", c(w05, w10));
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("colorScheme", d ? "dark" : "light");
            jSONObject3.put("params", jSONObject);
            jSONObject3.put("button", jSONObject2);
            jSONObject3.put("text", f());
            return jSONObject3.toString();
        } catch (Exception e10) {
            a8.g(e10, true);
            return a8.p0.s(new StringBuilder("{\"colorScheme\":\""), d ? "dark" : "light", "\"}");
        }
    }

    public static int b(i6 i6Var, boolean z10) {
        int w02 = n6.w0(z10 ? b[0] : a[0], i6Var);
        if (z10) {
            int[] iArr = c;
            int i7 = iArr[0];
            if ((i6Var != null ? i6Var.m(i7) : n6.lm.get(i7)) != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i10 = 1;
                for (int i11 : iArr) {
                    int m10 = i6Var != null ? i6Var.m(i11) : n6.lm.get(i11);
                    if (m10 != 0) {
                        int red2 = Color.red(m10) + red;
                        int green2 = Color.green(m10) + green;
                        i10++;
                        blue = Color.blue(m10) + blue;
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
        int w10 = n6.w(i10, i7);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
    }

    public static String d(boolean z10) {
        return a8.p0.s(new StringBuilder("{\"colorScheme\":\""), z10 ? "dark" : "light", "\"}");
    }

    public static int e(i6 i6Var, boolean z10) {
        int i7 = (i6Var == null ? !n6.I.q() : !i6Var.d()) ? 0 : 1;
        for (int i10 : z10 ? b : a) {
            i7 = (i7 * 31) + n6.w0(i10, i6Var);
        }
        if (z10) {
            for (int i11 : c) {
                i7 = (i7 * 31) + (i6Var != null ? i6Var.m(i11) : n6.lm.get(i11));
            }
        }
        int w02 = (((n6.w0(n6.p7, i6Var) + ((n6.w0(n6.Ji, i6Var) + ((n6.w0(n6.Fi, i6Var) + (i7 * 31)) * 31)) * 31)) * 31) + bz.W0) * 31;
        TextPaint textPaint = n6.o2;
        return pk0.j0() + ((w02 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", bz.W0);
        TextPaint textPaint = n6.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(pk0.j0() / org.telegram.messenger.g0.p) + "px");
        return jSONObject;
    }
}
