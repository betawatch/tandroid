package org.telegram.utils.twidget;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gz;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hk0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public abstract class m1 {
    public static final int[] a = {j6.ra, j6.Vc, j6.ee, j6.Xc, j6.Nd};
    public static final int[] b = {j6.rb, j6.Wc, j6.jc, j6.Yc, j6.Tb};
    public static final int[] c = {j6.ub, j6.vb, j6.wb};

    public static String a(e6 e6Var, boolean z10) {
        boolean a10 = e6Var != null ? e6Var.a() : j6.I.q();
        int[] iArr = z10 ? b : a;
        try {
            int w10 = j6.w(a10 ? -16777216 : -1, b(e6Var, z10));
            int w02 = j6.w0(iArr[1], e6Var);
            int w03 = j6.w0(iArr[2], e6Var);
            int w04 = j6.w0(iArr[3], e6Var);
            int w05 = j6.w0(iArr[4], e6Var);
            int w06 = j6.w0(j6.Fi, e6Var);
            int w07 = j6.w0(j6.Ji, e6Var);
            int w11 = j6.w(w10, j6.r1(0.1f, w05));
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
            jSONObject.put("destructive_text_color", c(j6.w0(j6.p7, e6Var), w10));
            jSONObject.put("section_bg_color", c(w10, w10));
            jSONObject.put("section_header_text_color", c(w05, w10));
            jSONObject.put("section_separator_color", c(j6.r1(0.12f, w02), w10));
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

    public static int b(e6 e6Var, boolean z10) {
        int w02 = j6.w0(z10 ? b[0] : a[0], e6Var);
        if (z10) {
            int[] iArr = c;
            int i7 = iArr[0];
            if ((e6Var != null ? e6Var.j(i7) : j6.lm.get(i7)) != 0) {
                int red = Color.red(w02);
                int green = Color.green(w02);
                int blue = Color.blue(w02);
                int i10 = 1;
                for (int i11 : iArr) {
                    int j3 = e6Var != null ? e6Var.j(i11) : j6.lm.get(i11);
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
        int w10 = j6.w(i10, i7);
        return String.format(Locale.US, "#%02x%02x%02x", Integer.valueOf(Color.red(w10)), Integer.valueOf(Color.green(w10)), Integer.valueOf(Color.blue(w10)));
    }

    public static int d(e6 e6Var, boolean z10) {
        int i7 = (e6Var == null ? !j6.I.q() : !e6Var.a()) ? 0 : 1;
        for (int i10 : z10 ? b : a) {
            i7 = (i7 * 31) + j6.w0(i10, e6Var);
        }
        if (z10) {
            for (int i11 : c) {
                i7 = (i7 * 31) + (e6Var != null ? e6Var.j(i11) : j6.lm.get(i11));
            }
        }
        int w02 = (((j6.w0(j6.p7, e6Var) + ((j6.w0(j6.Ji, e6Var) + ((j6.w0(j6.Fi, e6Var) + (i7 * 31)) * 31)) * 31)) * 31) + gz.W0) * 31;
        TextPaint textPaint = j6.o2;
        return hk0.j0() + ((w02 + (textPaint != null ? Float.floatToIntBits(textPaint.getTextSize()) : 0)) * 31);
    }

    public static JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fontSize", gz.W0);
        TextPaint textPaint = j6.o2;
        if (textPaint != null && textPaint.getTextSize() > 0.0f) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            jSONObject.put("lineHeight", Math.round(Math.max(1.0f, Math.min(3.0f, ((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading) / textPaint.getTextSize())) * 100.0f) / 100.0d);
        }
        jSONObject.put("padding", "8px " + Math.round(hk0.j0() / org.telegram.messenger.g0.p) + "px");
        return jSONObject;
    }
}
