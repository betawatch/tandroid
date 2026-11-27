// default package

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.telegram.messenger.beta.R;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class um2 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                return b(resources, xmlResourceParser, asAttributeSet, theme);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012a  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f;
        int attributeCount;
        int i;
        char c;
        int[] iArr;
        int i2;
        int a2;
        float f2;
        int i3;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = t19.a;
                ?? obtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i4, i4);
                int resourceId = obtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, z);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i4, -65281);
                        }
                        f = !obtainAttributes.hasValue(z) ? obtainAttributes.getFloat(z, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        char c2 = z;
                        float f3 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet2.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        i = i4;
                        int i7 = i;
                        while (i < attributeCount) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i8 = i7 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i7] = attributeNameResource;
                                i7 = i8;
                            }
                            i++;
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i7);
                        float f4 = 0.0f;
                        float f5 = 100.0f;
                        c = (f3 >= 0.0f || f3 > 100.0f) ? (char) 0 : c2;
                        if (f == 1.0f || c != 0) {
                            int b = ete.b((int) ((Color.alpha(color) * f) + 0.5f), 0, jn7.d4);
                            if (c == 0) {
                                x91 a3 = x91.a(color);
                                float f6 = a3.a;
                                float f7 = a3.b;
                                gjc gjcVar = gjc.k;
                                if (f7 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                    a2 = iz2.a(f3);
                                } else {
                                    float min = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
                                    float f8 = f7;
                                    char c3 = c2;
                                    x91 x91Var = null;
                                    while (true) {
                                        if (Math.abs(f4 - f7) >= 0.4f) {
                                            float f9 = 1000.0f;
                                            iArr = trimStateSet;
                                            float f10 = f5;
                                            float f11 = 0.0f;
                                            float f12 = 1000.0f;
                                            x91 x91Var2 = null;
                                            while (true) {
                                                if (Math.abs(f11 - f10) <= 0.01f) {
                                                    i2 = depth2;
                                                    break;
                                                }
                                                float z2 = bp1.z(f10, f11, 2.0f, f11);
                                                float f13 = f10;
                                                int c4 = x91.b(z2, f8, min).c(gjc.k);
                                                float b2 = iz2.b(Color.red(c4));
                                                float b3 = iz2.b(Color.green(c4));
                                                float b4 = iz2.b(Color.blue(c4));
                                                float[] fArr = iz2.d[c2];
                                                float f14 = (b3 * fArr[c2]) + (b2 * fArr[0]);
                                                float f15 = fArr[2];
                                                i2 = depth2;
                                                float z3 = c00.z(b4, f15, f14, 100.0f);
                                                float cbrt = z3 <= 0.008856452f ? z3 * 903.2963f : (((float) Math.cbrt(z3)) * 116.0f) - 16.0f;
                                                float abs = Math.abs(f3 - cbrt);
                                                if (abs < 0.2f) {
                                                    x91 a4 = x91.a(c4);
                                                    f2 = cbrt;
                                                    x91 b5 = x91.b(a4.c, a4.b, min);
                                                    float f16 = a4.d - b5.d;
                                                    float f17 = a4.e - b5.e;
                                                    float f18 = a4.f - b5.f;
                                                    float pow = (float) (Math.pow(Math.sqrt((f18 * f18) + (f17 * f17) + (f16 * f16)), 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f12 = pow;
                                                        f9 = abs;
                                                        x91Var2 = a4;
                                                    }
                                                } else {
                                                    f2 = cbrt;
                                                }
                                                if (f9 == 0.0f && f12 == 0.0f) {
                                                    break;
                                                }
                                                if (f2 < f3) {
                                                    f10 = f13;
                                                    f11 = z2;
                                                } else {
                                                    f10 = z2;
                                                }
                                                depth2 = i2;
                                            }
                                            x91 x91Var3 = x91Var2;
                                            if (c3 == 0) {
                                                if (x91Var3 == null) {
                                                    f7 = f8;
                                                } else {
                                                    x91Var = x91Var3;
                                                    f4 = f8;
                                                }
                                                f8 = bp1.z(f7, f4, 2.0f, f4);
                                                trimStateSet = iArr;
                                                depth2 = i2;
                                                f5 = 100.0f;
                                            } else {
                                                if (x91Var3 != null) {
                                                    a2 = x91Var3.c(gjcVar);
                                                    break;
                                                }
                                                f8 = bp1.z(f7, f4, 2.0f, f4);
                                                trimStateSet = iArr;
                                                depth2 = i2;
                                                f5 = 100.0f;
                                                c3 = 0;
                                            }
                                        } else {
                                            iArr = trimStateSet;
                                            i2 = depth2;
                                            a2 = x91Var == null ? iz2.a(f3) : x91Var.c(gjcVar);
                                        }
                                    }
                                }
                                color = a2;
                            } else {
                                iArr = trimStateSet;
                                i2 = depth2;
                            }
                            color = (color & 16777215) | (b << 24);
                        } else {
                            iArr = trimStateSet;
                            i2 = depth2;
                        }
                        i3 = i5 + 1;
                        if (i3 > iArr3.length) {
                            int[] iArr6 = new int[i5 <= 4 ? 8 : i5 << 1];
                            System.arraycopy(iArr3, 0, iArr6, 0, i5);
                            iArr3 = iArr6;
                        }
                        iArr3[i5] = color;
                        if (i3 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i5 > 4 ? i5 << 1 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i5);
                            iArr2 = r1;
                        }
                        iArr2[i5] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i5 = i3;
                        z = c2;
                        depth2 = i2;
                        i4 = 0;
                        r0 = resources;
                    }
                }
                color = obtainAttributes.getColor(i4, -65281);
                if (!obtainAttributes.hasValue(z)) {
                }
                char c22 = z;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet2.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                i = i4;
                int i72 = i;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i72);
                float f42 = 0.0f;
                float f52 = 100.0f;
                if (f3 >= 0.0f) {
                }
                if (f == 1.0f) {
                }
                int b6 = ete.b((int) ((Color.alpha(color) * f) + 0.5f), 0, jn7.d4);
                if (c == 0) {
                }
                color = (color & 16777215) | (b6 << 24);
                i3 = i5 + 1;
                if (i3 > iArr3.length) {
                }
                iArr3[i5] = color;
                if (i3 > iArr2.length) {
                }
                iArr2[i5] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i5 = i3;
                z = c22;
                depth2 = i2;
                i4 = 0;
                r0 = resources;
            } else {
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z = z;
                depth2 = depth2;
                i4 = 0;
            }
        }
        int[] iArr7 = new int[i5];
        int[][] iArr8 = new int[i5][];
        System.arraycopy(iArr3, 0, iArr7, 0, i5);
        System.arraycopy(iArr2, 0, iArr8, 0, i5);
        return new ColorStateList(iArr8, iArr7);
    }
}
