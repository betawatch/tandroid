// default package

import android.graphics.Paint;
import android.text.TextPaint;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class syc {
    public static final TextPaint b = new TextPaint();
    public final ArrayList a;

    public syc(ArrayList arrayList) {
        this.a = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static syc a(String str, lcc lccVar, float f) {
        qyc qycVar;
        pyc pycVar;
        int i;
        ArrayList arrayList;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        Paint paint;
        int i2;
        float f9;
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < jSONArray.length()) {
            int optInt = jSONArray.getJSONArray(i4).optInt(i3);
            int i5 = i4;
            while (i5 < jSONArray.length() && jSONArray.getJSONArray(i5).optInt(i3) == optInt) {
                i5++;
            }
            ArrayList arrayList3 = new ArrayList();
            float[] fArr = new float[64];
            float f10 = Float.MAX_VALUE;
            float f11 = -3.4028235E38f;
            float f12 = -3.4028235E38f;
            pyc pycVar2 = null;
            float f13 = Float.MAX_VALUE;
            while (i4 < i5) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i4);
                float optDouble = ((float) jSONArray2.optDouble(1)) * f;
                JSONArray jSONArray3 = jSONArray;
                ArrayList arrayList4 = arrayList2;
                float optDouble2 = ((float) jSONArray2.optDouble(2)) * f;
                int i6 = i4;
                float optDouble3 = ((float) jSONArray2.optDouble(3)) * f;
                float optDouble4 = ((float) jSONArray2.optDouble(4)) * f;
                ArrayList arrayList5 = arrayList3;
                float optDouble5 = ((float) jSONArray2.optDouble(7)) * f;
                float optDouble6 = ((float) jSONArray2.optDouble(8)) * f;
                String optString = jSONArray2.optString(9);
                if (!optString.isEmpty()) {
                    JSONArray optJSONArray = jSONArray2.optJSONArray(10);
                    if (optJSONArray == null || optJSONArray.length() != 6 || Math.abs(optJSONArray.optDouble(1)) >= 1.0E-4d || Math.abs(optJSONArray.optDouble(2)) >= 1.0E-4d || optJSONArray.optDouble(0) <= 0.0d || optJSONArray.optDouble(3) <= 0.0d) {
                        f2 = optDouble;
                        f3 = optDouble4;
                        f4 = optDouble3;
                        f5 = optDouble5;
                        f6 = 1.0f;
                        f7 = optDouble2;
                    } else {
                        f6 = (float) optJSONArray.optDouble(0);
                        float optDouble7 = (float) optJSONArray.optDouble(3);
                        f2 = (((float) optJSONArray.optDouble(4)) * f) + (f6 * optDouble);
                        f7 = (((float) optJSONArray.optDouble(5)) * f) + (optDouble7 * optDouble2);
                        f4 = optDouble3 * f6;
                        f3 = optDouble4 * optDouble7;
                        f5 = optDouble5 * f6;
                        optDouble6 *= f6;
                    }
                    if (f4 > 0.0f || f3 > 0.0f) {
                        float f14 = (f3 / 2.0f) + f7;
                        if (pycVar2 != null) {
                            StringBuilder sb = pycVar2.d;
                            f8 = f3;
                            if (f14 >= pycVar2.a && f14 <= pycVar2.b) {
                                if (f2 - pycVar2.c > 1.0f && ((sb.length() <= 0 || !Character.isWhitespace(sb.charAt(sb.length() - 1))) && !Character.isWhitespace(optString.charAt(0)))) {
                                    sb.append(' ');
                                    pycVar2.e.add(Float.valueOf(pycVar2.c));
                                }
                                pycVar = pycVar2;
                                arrayList = arrayList5;
                                pycVar.a = Math.min(pycVar.a, f7);
                                float f15 = f4;
                                float f16 = f7 + f8;
                                pycVar.b = Math.max(pycVar.b, f16);
                                float f17 = optDouble6;
                                paint = (Paint) ((ConcurrentHashMap) lccVar.b).get(Integer.valueOf(jSONArray2.optInt(6)));
                                i = i5;
                                if (fArr.length < optString.length()) {
                                    fArr = new float[optString.length()];
                                }
                                if (paint != null) {
                                    paint.getTextWidths(optString, fArr);
                                }
                                float f18 = f2;
                                i2 = 0;
                                while (i2 < optString.length()) {
                                    float[] fArr2 = fArr;
                                    pycVar.d.append(optString.charAt(i2));
                                    pycVar.e.add(Float.valueOf(f18));
                                    if (paint == null) {
                                        f9 = (((i2 + 1) * f15) / optString.length()) + f2;
                                    } else {
                                        f9 = (fArr2[i2] * f6) + (Character.isLowSurrogate(optString.charAt(i2)) ? 0.0f : f5) + f18;
                                        if (optString.charAt(i2) == ' ' || optString.charAt(i2) == 160) {
                                            f9 += f17;
                                        }
                                    }
                                    f18 = f9;
                                    i2++;
                                    fArr = fArr2;
                                }
                                pycVar.c = Math.max(f18, f2 + f15);
                                float min = Math.min(f10, f2);
                                float min2 = Math.min(f13, f7);
                                float max = Math.max(f11, pycVar.c);
                                f13 = min2;
                                f10 = min;
                                f12 = Math.max(f12, f16);
                                f11 = max;
                                i4 = i6 + 1;
                                arrayList3 = arrayList;
                                jSONArray = jSONArray3;
                                i5 = i;
                                pycVar2 = pycVar;
                                arrayList2 = arrayList4;
                            }
                        } else {
                            f8 = f3;
                        }
                        if (pycVar2 != null) {
                            StringBuilder sb2 = pycVar2.d;
                            if (sb2.length() > 0 && (sb2.length() <= 0 || !Character.isWhitespace(sb2.charAt(sb2.length() - 1)))) {
                                sb2.append(' ');
                                pycVar2.e.add(Float.valueOf(pycVar2.c));
                            }
                        }
                        pycVar = new pyc();
                        arrayList = arrayList5;
                        arrayList.add(pycVar);
                        pycVar.a = Math.min(pycVar.a, f7);
                        float f152 = f4;
                        float f162 = f7 + f8;
                        pycVar.b = Math.max(pycVar.b, f162);
                        float f172 = optDouble6;
                        paint = (Paint) ((ConcurrentHashMap) lccVar.b).get(Integer.valueOf(jSONArray2.optInt(6)));
                        i = i5;
                        if (fArr.length < optString.length()) {
                        }
                        if (paint != null) {
                        }
                        float f182 = f2;
                        i2 = 0;
                        while (i2 < optString.length()) {
                        }
                        pycVar.c = Math.max(f182, f2 + f152);
                        float min3 = Math.min(f10, f2);
                        float min22 = Math.min(f13, f7);
                        float max2 = Math.max(f11, pycVar.c);
                        f13 = min22;
                        f10 = min3;
                        f12 = Math.max(f12, f162);
                        f11 = max2;
                        i4 = i6 + 1;
                        arrayList3 = arrayList;
                        jSONArray = jSONArray3;
                        i5 = i;
                        pycVar2 = pycVar;
                        arrayList2 = arrayList4;
                    } else if (pycVar2 != null) {
                        pycVar2.d.append('\n');
                        pycVar2.e.add(Float.valueOf(pycVar2.c));
                        pycVar = null;
                        arrayList = arrayList5;
                        i = i5;
                        i4 = i6 + 1;
                        arrayList3 = arrayList;
                        jSONArray = jSONArray3;
                        i5 = i;
                        pycVar2 = pycVar;
                        arrayList2 = arrayList4;
                    }
                }
                pycVar = pycVar2;
                arrayList = arrayList5;
                i = i5;
                i4 = i6 + 1;
                arrayList3 = arrayList;
                jSONArray = jSONArray3;
                i5 = i;
                pycVar2 = pycVar;
                arrayList2 = arrayList4;
            }
            JSONArray jSONArray4 = jSONArray;
            ArrayList arrayList6 = arrayList2;
            ArrayList arrayList7 = arrayList3;
            int i7 = i5;
            if (arrayList7.isEmpty()) {
                qycVar = null;
            } else {
                StringBuilder sb3 = new StringBuilder();
                int[] iArr = new int[arrayList7.size() + 1];
                int[] iArr2 = new int[arrayList7.size() + 1];
                float[][] fArr3 = new float[arrayList7.size()][];
                int floor = (int) Math.floor(f10);
                int floor2 = (int) Math.floor(f13);
                int i8 = 0;
                while (i8 < arrayList7.size()) {
                    pyc pycVar3 = (pyc) arrayList7.get(i8);
                    iArr[i8] = sb3.length();
                    StringBuilder sb4 = pycVar3.d;
                    ArrayList arrayList8 = pycVar3.e;
                    sb3.append((CharSequence) sb4);
                    iArr2[i8] = Math.round(pycVar3.a) - floor2;
                    float[] fArr4 = new float[arrayList8.size() + 1];
                    int i9 = 0;
                    while (i9 < arrayList8.size()) {
                        fArr4[i9] = ((Float) arrayList8.get(i9)).floatValue() - floor;
                        i9++;
                        sb3 = sb3;
                    }
                    fArr4[arrayList8.size()] = pycVar3.c - floor;
                    fArr3[i8] = fArr4;
                    i8++;
                    sb3 = sb3;
                }
                StringBuilder sb5 = sb3;
                iArr[arrayList7.size()] = sb5.length();
                iArr2[arrayList7.size()] = Math.round(f12) - floor2;
                for (int i10 = 1; i10 < arrayList7.size(); i10++) {
                    iArr2[i10] = Math.max(iArr2[i10 - 1], iArr2[i10]);
                }
                String sb6 = sb5.toString();
                int ceil = ((int) Math.ceil(f11)) - floor;
                int i11 = iArr2[arrayList7.size()];
                qycVar = new qyc(sb6, floor, floor2, ceil, iArr, iArr2, fArr3);
            }
            arrayList2 = arrayList6;
            if (qycVar != null) {
                arrayList2.add(qycVar);
            }
            jSONArray = jSONArray4;
            i4 = i7;
            i3 = 0;
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new syc(arrayList2);
    }
}
