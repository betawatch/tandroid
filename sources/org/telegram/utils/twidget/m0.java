package org.telegram.utils.twidget;

import android.graphics.Paint;
import android.text.TextPaint;
import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class m0 {
    public static final TextPaint b = new TextPaint();
    public final ArrayList a;

    public m0(ArrayList arrayList) {
        this.a = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m0 a(String str, r rVar, float f10) {
        k0 k0Var;
        ArrayList arrayList;
        int i7;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Paint paint;
        int i10;
        float f18;
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i12 < jSONArray.length()) {
            int optInt = jSONArray.getJSONArray(i12).optInt(i11);
            int i13 = i12;
            while (i13 < jSONArray.length() && jSONArray.getJSONArray(i13).optInt(i11) == optInt) {
                i13++;
            }
            ArrayList arrayList3 = new ArrayList();
            float[] fArr = new float[64];
            float f19 = Float.MAX_VALUE;
            float f20 = -3.4028235E38f;
            float f21 = -3.4028235E38f;
            j0 j0Var = null;
            float f22 = Float.MAX_VALUE;
            while (i12 < i13) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i12);
                float optDouble = ((float) jSONArray2.optDouble(1)) * f10;
                JSONArray jSONArray3 = jSONArray;
                ArrayList arrayList4 = arrayList2;
                float optDouble2 = ((float) jSONArray2.optDouble(2)) * f10;
                int i14 = i12;
                float optDouble3 = ((float) jSONArray2.optDouble(3)) * f10;
                float optDouble4 = ((float) jSONArray2.optDouble(4)) * f10;
                ArrayList arrayList5 = arrayList3;
                float optDouble5 = ((float) jSONArray2.optDouble(7)) * f10;
                float optDouble6 = ((float) jSONArray2.optDouble(8)) * f10;
                String optString = jSONArray2.optString(9);
                if (!optString.isEmpty()) {
                    JSONArray optJSONArray = jSONArray2.optJSONArray(10);
                    if (optJSONArray == null || optJSONArray.length() != 6 || Math.abs(optJSONArray.optDouble(1)) >= 1.0E-4d || Math.abs(optJSONArray.optDouble(2)) >= 1.0E-4d || optJSONArray.optDouble(0) <= 0.0d || optJSONArray.optDouble(3) <= 0.0d) {
                        f11 = optDouble;
                        f12 = optDouble4;
                        f13 = optDouble3;
                        f14 = optDouble5;
                        f15 = 1.0f;
                        f16 = optDouble2;
                    } else {
                        f15 = (float) optJSONArray.optDouble(0);
                        float optDouble7 = (float) optJSONArray.optDouble(3);
                        f11 = (((float) optJSONArray.optDouble(4)) * f10) + (f15 * optDouble);
                        f16 = (((float) optJSONArray.optDouble(5)) * f10) + (optDouble7 * optDouble2);
                        f13 = optDouble3 * f15;
                        f12 = optDouble4 * optDouble7;
                        f14 = optDouble5 * f15;
                        optDouble6 *= f15;
                    }
                    if (f13 > 0.0f || f12 > 0.0f) {
                        float f23 = (f12 / 2.0f) + f16;
                        if (j0Var != null) {
                            StringBuilder sb2 = j0Var.d;
                            f17 = f12;
                            if (f23 >= j0Var.a && f23 <= j0Var.b) {
                                if (f11 - j0Var.c > 1.0f && ((sb2.length() <= 0 || !Character.isWhitespace(sb2.charAt(sb2.length() - 1))) && !Character.isWhitespace(optString.charAt(0)))) {
                                    sb2.append(' ');
                                    j0Var.e.add(Float.valueOf(j0Var.c));
                                }
                                arrayList = arrayList5;
                                j0Var.a = Math.min(j0Var.a, f16);
                                float f24 = f13;
                                float f25 = f16 + f17;
                                j0Var.b = Math.max(j0Var.b, f25);
                                float f26 = optDouble6;
                                paint = (Paint) rVar.a.get(Integer.valueOf(jSONArray2.optInt(6)));
                                i7 = i13;
                                if (fArr.length < optString.length()) {
                                    fArr = new float[optString.length()];
                                }
                                if (paint != null) {
                                    paint.getTextWidths(optString, fArr);
                                }
                                float f27 = f11;
                                i10 = 0;
                                while (i10 < optString.length()) {
                                    float[] fArr2 = fArr;
                                    j0Var.d.append(optString.charAt(i10));
                                    j0Var.e.add(Float.valueOf(f27));
                                    if (paint == null) {
                                        f18 = (((i10 + 1) * f24) / optString.length()) + f11;
                                    } else {
                                        f18 = (fArr2[i10] * f15) + (Character.isLowSurrogate(optString.charAt(i10)) ? 0.0f : f14) + f27;
                                        if (optString.charAt(i10) == ' ' || optString.charAt(i10) == 160) {
                                            f18 += f26;
                                        }
                                    }
                                    f27 = f18;
                                    i10++;
                                    fArr = fArr2;
                                }
                                j0Var.c = Math.max(f27, f11 + f24);
                                float min = Math.min(f19, f11);
                                float min2 = Math.min(f22, f16);
                                float max = Math.max(f20, j0Var.c);
                                f22 = min2;
                                f19 = min;
                                f21 = Math.max(f21, f25);
                                f20 = max;
                                i12 = i14 + 1;
                                arrayList3 = arrayList;
                                jSONArray = jSONArray3;
                                arrayList2 = arrayList4;
                                i13 = i7;
                            }
                        } else {
                            f17 = f12;
                        }
                        if (j0Var != null) {
                            StringBuilder sb3 = j0Var.d;
                            if (sb3.length() > 0 && (sb3.length() <= 0 || !Character.isWhitespace(sb3.charAt(sb3.length() - 1)))) {
                                sb3.append(' ');
                                j0Var.e.add(Float.valueOf(j0Var.c));
                            }
                        }
                        j0Var = new j0();
                        arrayList = arrayList5;
                        arrayList.add(j0Var);
                        j0Var.a = Math.min(j0Var.a, f16);
                        float f242 = f13;
                        float f252 = f16 + f17;
                        j0Var.b = Math.max(j0Var.b, f252);
                        float f262 = optDouble6;
                        paint = (Paint) rVar.a.get(Integer.valueOf(jSONArray2.optInt(6)));
                        i7 = i13;
                        if (fArr.length < optString.length()) {
                        }
                        if (paint != null) {
                        }
                        float f272 = f11;
                        i10 = 0;
                        while (i10 < optString.length()) {
                        }
                        j0Var.c = Math.max(f272, f11 + f242);
                        float min3 = Math.min(f19, f11);
                        float min22 = Math.min(f22, f16);
                        float max2 = Math.max(f20, j0Var.c);
                        f22 = min22;
                        f19 = min3;
                        f21 = Math.max(f21, f252);
                        f20 = max2;
                        i12 = i14 + 1;
                        arrayList3 = arrayList;
                        jSONArray = jSONArray3;
                        arrayList2 = arrayList4;
                        i13 = i7;
                    } else if (j0Var != null) {
                        j0Var.d.append('\n');
                        j0Var.e.add(Float.valueOf(j0Var.c));
                        j0Var = null;
                    }
                }
                arrayList = arrayList5;
                i7 = i13;
                i12 = i14 + 1;
                arrayList3 = arrayList;
                jSONArray = jSONArray3;
                arrayList2 = arrayList4;
                i13 = i7;
            }
            JSONArray jSONArray4 = jSONArray;
            ArrayList arrayList6 = arrayList2;
            ArrayList arrayList7 = arrayList3;
            int i15 = i13;
            if (arrayList7.isEmpty()) {
                k0Var = null;
            } else {
                StringBuilder sb4 = new StringBuilder();
                int[] iArr = new int[arrayList7.size() + 1];
                int[] iArr2 = new int[arrayList7.size() + 1];
                float[][] fArr3 = new float[arrayList7.size()][];
                int floor = (int) Math.floor(f19);
                int floor2 = (int) Math.floor(f22);
                int i16 = 0;
                while (i16 < arrayList7.size()) {
                    j0 j0Var2 = (j0) arrayList7.get(i16);
                    iArr[i16] = sb4.length();
                    StringBuilder sb5 = j0Var2.d;
                    ArrayList arrayList8 = j0Var2.e;
                    sb4.append((CharSequence) sb5);
                    iArr2[i16] = Math.round(j0Var2.a) - floor2;
                    float[] fArr4 = new float[arrayList8.size() + 1];
                    int i17 = 0;
                    while (i17 < arrayList8.size()) {
                        fArr4[i17] = ((Float) arrayList8.get(i17)).floatValue() - floor;
                        i17++;
                        sb4 = sb4;
                    }
                    fArr4[arrayList8.size()] = j0Var2.c - floor;
                    fArr3[i16] = fArr4;
                    i16++;
                    sb4 = sb4;
                }
                StringBuilder sb6 = sb4;
                iArr[arrayList7.size()] = sb6.length();
                iArr2[arrayList7.size()] = Math.round(f21) - floor2;
                for (int i18 = 1; i18 < arrayList7.size(); i18++) {
                    iArr2[i18] = Math.max(iArr2[i18 - 1], iArr2[i18]);
                }
                String sb7 = sb6.toString();
                int ceil = ((int) Math.ceil(f20)) - floor;
                int i19 = iArr2[arrayList7.size()];
                k0Var = new k0(sb7, floor, floor2, ceil, iArr, iArr2, fArr3);
            }
            arrayList2 = arrayList6;
            if (k0Var != null) {
                arrayList2.add(k0Var);
            }
            jSONArray = jSONArray4;
            i12 = i15;
            i11 = 0;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new m0(arrayList2);
    }
}
