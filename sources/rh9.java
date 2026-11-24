// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rh9 {
    public int A;
    public final int B;
    public int C;
    public wjb D;
    public gb2 E;
    public bb2 F;
    public n41 G;
    public Paint H;
    public tgb I;
    public r86 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public rh9 P;
    public View Q;
    public pla R;
    public int S;
    public int T;
    public lm U;
    public float V;
    public mg9 W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final k27 b;
    public TL_iv.RichMessage c;
    public boolean d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public Drawable i;
    public final HashMap j;
    public final HashMap k;
    public final ArrayList l;
    public final HashMap m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public CharSequence q;
    public lg7 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final n79 y;
    public final xl3 z;

    public rh9(int i, int i2, wjb wjbVar) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = "";
        this.t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.x = textPaint2;
        this.y = new n79(null);
        this.z = new xl3((byte) 7);
        this.K = new RectF();
        this.b = null;
        this.a = i;
        this.B = i2;
        this.D = wjbVar;
        this.M = gba.T0;
        this.N = gl.p;
        textPaint.setTextSize(gl.L(r6));
        textPaint2.setTextSize(gl.L(this.M));
    }

    public static float J(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return 1000.0f / Math.max(1.0E-4f, f);
    }

    public static String M(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            boolean endsWith = pageListOrderedItem.num.endsWith(".");
            String str = pageListOrderedItem.num;
            return endsWith ? str : tb4.o(str, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return de9.l(new StringBuilder(), pageListOrderedItem.value, ".");
        }
        if (!TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            return (i + 1) + ".";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = pageblockorderedlist.start;
        if (pageblockorderedlist.reversed) {
            i = -i;
        }
        sb.append(i2 + i);
        sb.append(".");
        return sb.toString();
    }

    public static boolean N(int i, List list) {
        return i > 0 && (list.get(i - 1) instanceof TL_iv.pageBlockParagraph);
    }

    public static int Q(int i, int i2) {
        return i2 == 0 ? i : (i & (-16)) | i2;
    }

    public static void Y(StringBuilder sb, ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        while (i < arrayList.size() && i < arrayList2.size() && arrayList.get(i) == arrayList2.get(i)) {
            i++;
        }
        while (arrayList.size() > i) {
            sb.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb.append("<blockquote>");
            arrayList.add((jg9) arrayList2.get(arrayList.size()));
        }
    }

    public static SpannableStringBuilder Z(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (oh9 oh9Var : (oh9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oh9.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(oh9Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(oh9Var);
            if (spanEnd > spanStart) {
                int i = oh9Var.b;
                int i2 = (i & 16) != 0 ? 1 : 0;
                if ((i & 32) != 0) {
                    i2 |= 2;
                }
                if ((i & 64) != 0) {
                    i2 |= 16;
                }
                if ((i & 128) != 0) {
                    i2 |= 8;
                }
                if ((i & 256) != 0) {
                    i2 |= 4;
                }
                if ((i & 2048) != 0) {
                    i2 |= TLObject.FLAG_14;
                }
                if ((i & TLObject.FLAG_12) != 0) {
                    i2 |= 32768;
                }
                if ((i & TLObject.FLAG_13) != 0) {
                    i2 |= 65536;
                }
                if (i2 != 0) {
                    vib vibVar = new vib();
                    vibVar.a = i2;
                    spannableStringBuilder.setSpan(new wib(vibVar, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void a(StringBuilder sb, CharSequence charSequence, int i, int i2, boolean z) {
        if (i2 > i) {
            SpannableStringBuilder Z = Z(charSequence.subSequence(i, i2));
            StringBuilder sb2 = new StringBuilder();
            ff9.g(sb2, Z);
            String sb3 = sb2.toString();
            if (sb3.isEmpty()) {
                return;
            }
            sb.append(z ? "<cite>" : "<p>");
            sb.append(sb3);
            sb.append(z ? "</cite>" : "</p>");
        }
    }

    public static void d(StringBuilder sb, ArrayList arrayList) {
        while (!arrayList.isEmpty()) {
            sb.append(((Boolean) tb4.l(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0530, code lost:
    
        if (r12[r5] > r12[r14]) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c27[] e(float[] fArr) {
        c27 c27Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int length = fArr.length;
        c27[] c27VarArr = new c27[length];
        if (length != 0) {
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            float f2 = 0.0f;
            int i7 = 0;
            boolean z = false;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                float f3 = fArr[i7];
                float f4 = f3 > 0.0f ? f3 : 1.0f;
                c27 c27Var2 = new c27();
                c27VarArr[i7] = c27Var2;
                c27Var2.g = f4;
                if (f4 > 1.2f) {
                    sb.append("w");
                } else if (f4 < 0.8f) {
                    sb.append("n");
                } else {
                    sb.append("q");
                }
                f2 += f4;
                if (f4 > 2.0f) {
                    z = true;
                }
                i7++;
            }
            float f5 = f2 / length;
            int L = gl.L(120.0f);
            float L2 = gl.L(120.0f);
            Point point = gl.q;
            int min = (int) (L2 / (Math.min(point.x, point.y) / 1000.0f));
            int L3 = (int) (gl.L(40.0f) / (Math.min(point.x, point.y) / 1000.0f));
            float f6 = 814.0f;
            float L4 = gl.L(100.0f) / 814.0f;
            if (length == 1) {
                c27VarArr[0].a(Math.round(Math.min(1000.0f / r0.g, 407.0f)) / 814.0f, 0, 0, 0, 0, 1000, 15);
                return c27VarArr;
            }
            int i8 = 2;
            int i9 = 1;
            int i10 = 3;
            if (!z && (length == 2 || length == 3 || length == 4)) {
                if (length == 2) {
                    c27 c27Var3 = c27VarArr[0];
                    c27 c27Var4 = c27VarArr[1];
                    String sb2 = sb.toString();
                    if (sb2.equals("ww") && f5 > 1.7199017f) {
                        if (c27Var3.g - c27Var4.g < 0.2f) {
                            float round = Math.round(Math.min(1000.0f / r7, Math.min(1000.0f / r11, 407.0f))) / 814.0f;
                            c27Var3.a(round, 0, 0, 0, 0, 1000, 7);
                            c27Var4.a(round, 0, 0, 1, 1, 1000, 11);
                            return c27VarArr;
                        }
                    }
                    if (sb2.equals("ww") || sb2.equals("qq")) {
                        float round2 = Math.round(Math.min(500.0f / c27Var3.g, Math.min(500.0f / c27Var4.g, 814.0f))) / 814.0f;
                        c27Var3.a(round2, 0, 0, 0, 0, 500, 13);
                        c27Var4.a(round2, 1, 1, 0, 0, 500, 14);
                        return c27VarArr;
                    }
                    float f7 = c27Var3.g;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f7) / ((1.0f / c27Var4.g) + (1.0f / f7))));
                    int i11 = 1000 - max;
                    if (i11 < min) {
                        max -= min - i11;
                    } else {
                        min = i11;
                    }
                    float min2 = Math.min(814.0f, Math.round(Math.min(min / c27Var3.g, max / c27Var4.g))) / 814.0f;
                    c27Var3.a(min2, 0, 0, 0, 0, min, 13);
                    c27Var4.a(min2, 1, 1, 0, 0, max, 14);
                    return c27VarArr;
                }
                if (length == 3) {
                    c27 c27Var5 = c27VarArr[0];
                    c27 c27Var6 = c27VarArr[1];
                    c27 c27Var7 = c27VarArr[2];
                    if (sb.charAt(0) != 'n') {
                        float round3 = Math.round(Math.min(1000.0f / c27Var5.g, 537.24005f)) / 814.0f;
                        c27Var5.a(round3, 0, 1, 0, 0, 1000, 7);
                        float min3 = Math.min(814.0f - round3, Math.round(Math.min(500.0f / c27Var6.g, 500.0f / c27Var7.g))) / 814.0f;
                        float f8 = min3 < L4 ? L4 : min3;
                        c27Var6.a(f8, 0, 0, 1, 1, 500, 9);
                        c27Var7.a(f8, 1, 1, 1, 1, 500, 10);
                        return c27VarArr;
                    }
                    float f9 = c27Var6.g;
                    float min4 = Math.min(407.0f, Math.round((f9 * 1000.0f) / (c27Var7.g + f9)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(c27Var7.g * min4, c27Var6.g * r4))));
                    c27Var5.a(1.0f, 0, 0, 0, 1, Math.round(Math.min((c27Var5.g * 814.0f) + L3, 1000 - max2)), 13);
                    c27Var6.a((814.0f - min4) / 814.0f, 1, 1, 0, 0, max2, 6);
                    c27Var7.a(min4 / 814.0f, 1, 1, 1, 1, max2, 10);
                    return c27VarArr;
                }
                c27 c27Var8 = c27VarArr[0];
                c27 c27Var9 = c27VarArr[1];
                c27 c27Var10 = c27VarArr[2];
                c27 c27Var11 = c27VarArr[3];
                if (sb.charAt(0) != 'w') {
                    int max3 = Math.max(min, Math.round(814.0f / ((1.0f / c27Var11.g) + ((1.0f / c27Var10.g) + (1.0f / c27Var9.g)))));
                    float f10 = L;
                    float f11 = max3;
                    float min5 = Math.min(0.33f, Math.max(f10, f11 / c27Var9.g) / 814.0f);
                    float min6 = Math.min(0.33f, Math.max(f10, f11 / c27Var10.g) / 814.0f);
                    float f12 = (1.0f - min5) - min6;
                    c27Var8.a(min5 + min6 + f12, 0, 0, 0, 2, Math.round(Math.min((c27Var8.g * 814.0f) + L3, 1000 - max3)), 13);
                    c27Var9.a(min5, 1, 1, 0, 0, max3, 6);
                    c27Var10.a(min6, 1, 1, 1, 1, max3, 2);
                    c27Var11.a(f12, 1, 1, 2, 2, max3, 10);
                    return c27VarArr;
                }
                float round4 = Math.round(Math.min(1000.0f / c27Var8.g, 537.24005f)) / 814.0f;
                c27Var8.a(round4, 0, 2, 0, 0, 1000, 7);
                float round5 = Math.round(1000.0f / ((c27Var9.g + c27Var10.g) + c27Var11.g));
                float f13 = min;
                int max4 = (int) Math.max(f13, Math.min(400.0f, c27Var9.g * round5));
                int max5 = (int) Math.max(Math.max(f13, 330.0f), c27Var11.g * round5);
                int i12 = (1000 - max4) - max5;
                if (i12 < gl.L(58.0f)) {
                    int L5 = gl.L(58.0f) - i12;
                    i12 = gl.L(58.0f);
                    int i13 = L5 / 2;
                    max4 -= i13;
                    max5 -= L5 - i13;
                }
                int i14 = max4;
                float min7 = Math.min(814.0f - round4, round5) / 814.0f;
                float f14 = min7 < L4 ? L4 : min7;
                c27Var9.a(f14, 0, 0, 1, 1, i14, 9);
                c27Var10.a(f14, 1, 1, 1, 1, i12, 8);
                c27Var11.a(f14, 2, 2, 1, 1, max5, 10);
                return c27VarArr;
            }
            float[] fArr2 = new float[length];
            for (int i15 = 0; i15 < length; i15++) {
                float f15 = c27VarArr[i15].g;
                if (f5 > 1.1f) {
                    fArr2[i15] = Math.max(1.0f, f15);
                } else {
                    fArr2[i15] = Math.min(1.0f, f15);
                }
                fArr2[i15] = Math.max(0.66667f, Math.min(1.7f, fArr2[i15]));
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i16 = 1;
            while (i16 < length) {
                int i17 = length - i16;
                if (i16 > 3 || i17 > 3) {
                    f = f6;
                } else {
                    arrayList.add(new int[]{i16, i17});
                    f = f6;
                    arrayList2.add(new float[]{J(0, i16, fArr2), J(i16, length, fArr2)});
                }
                i16++;
                f6 = f;
            }
            float f16 = f6;
            for (int i18 = 1; i18 < length - 1; i18++) {
                int i19 = 1;
                while (true) {
                    int i20 = length - i18;
                    if (i19 < i20) {
                        int i21 = i20 - i19;
                        if (i18 <= 3) {
                            if (i19 <= (f5 < 0.85f ? 4 : 3) && i21 <= 3) {
                                arrayList.add(new int[]{i18, i19, i21});
                                float J = J(0, i18, fArr2);
                                int i22 = i18 + i19;
                                float J2 = J(i18, i22, fArr2);
                                float J3 = J(i22, length, fArr2);
                                i5 = i8;
                                float[] fArr3 = new float[3];
                                fArr3[0] = J;
                                fArr3[1] = J2;
                                fArr3[i5] = J3;
                                arrayList2.add(fArr3);
                                i19++;
                                i8 = i5;
                            }
                        }
                        i5 = i8;
                        i19++;
                        i8 = i5;
                    }
                }
            }
            int i23 = i8;
            for (int i24 = 1; i24 < length - 2; i24++) {
                int i25 = 1;
                while (true) {
                    int i26 = length - i24;
                    if (i25 < i26) {
                        int i27 = 1;
                        while (true) {
                            int i28 = i26 - i25;
                            if (i27 < i28) {
                                int i29 = i28 - i27;
                                if (i24 > i10 || i25 > i10 || i27 > i10 || i29 > i10) {
                                    i3 = i6;
                                    i4 = i10;
                                } else {
                                    arrayList.add(new int[]{i24, i25, i27, i29});
                                    float J4 = J(i6, i24, fArr2);
                                    int i30 = i24 + i25;
                                    float J5 = J(i24, i30, fArr2);
                                    i3 = i6;
                                    int i31 = i30 + i27;
                                    float J6 = J(i30, i31, fArr2);
                                    float J7 = J(i31, length, fArr2);
                                    i4 = i10;
                                    float[] fArr4 = new float[4];
                                    fArr4[i3] = J4;
                                    fArr4[1] = J5;
                                    fArr4[i23] = J6;
                                    fArr4[i4] = J7;
                                    arrayList2.add(fArr4);
                                }
                                i27++;
                                i6 = i3;
                                i10 = i4;
                            }
                        }
                        i25++;
                    }
                }
            }
            int i32 = i6;
            int i33 = i10;
            int i34 = i32;
            int i35 = -1;
            float f17 = 0.0f;
            while (i34 < arrayList.size()) {
                float[] fArr5 = (float[]) arrayList2.get(i34);
                int[] iArr = (int[]) arrayList.get(i34);
                int length2 = fArr5.length;
                float f18 = Float.MAX_VALUE;
                float f19 = 0.0f;
                for (int i36 = i32; i36 < length2; i36++) {
                    float f20 = fArr5[i36];
                    f19 += f20;
                    if (f20 < f18) {
                        f18 = f20;
                    }
                }
                float abs = Math.abs(f19 - 1333.3334f);
                int i37 = i9;
                if (iArr.length > i37) {
                    int i38 = iArr[i32];
                    int i39 = iArr[i37];
                    if (i38 <= i39) {
                        i = i23;
                        if (iArr.length <= i || i39 <= iArr[i]) {
                            i2 = i33;
                            if (iArr.length > i2) {
                            }
                        }
                    } else {
                        i = i23;
                    }
                    i2 = i33;
                    abs *= 1.2f;
                } else {
                    i = i23;
                    i2 = i33;
                }
                if (f18 < min) {
                    abs *= 1.5f;
                }
                if (i35 == -1 || abs < f17) {
                    i35 = i34;
                    f17 = abs;
                }
                i34++;
                i23 = i;
                i33 = i2;
                i9 = 1;
            }
            if (i35 == -1) {
                int i40 = i32;
                while (i40 < length) {
                    int i41 = i40;
                    c27VarArr[i40].a(0.4f, 0, 0, i41, i40, 1000, 3);
                    i40 = i41 + 1;
                }
            } else {
                int[] iArr2 = (int[]) arrayList.get(i35);
                float[] fArr6 = (float[]) arrayList2.get(i35);
                int i42 = i32;
                int i43 = i42;
                while (i43 < iArr2.length) {
                    int i44 = iArr2[i43];
                    float f21 = fArr6[i43];
                    c27 c27Var12 = null;
                    int i45 = i42;
                    int i46 = i32;
                    int i47 = 1000;
                    while (i46 < i44) {
                        int i48 = (int) (fArr2[i45] * f21);
                        int i49 = i47 - i48;
                        c27 c27Var13 = c27VarArr[i45];
                        int i50 = i43 == 0 ? 4 : i32;
                        if (i43 == iArr2.length - 1) {
                            i50 |= 8;
                        }
                        if (i46 == 0) {
                            i50 |= 1;
                        }
                        if (i46 == i44 - 1) {
                            i50 |= 2;
                            c27Var = c27Var13;
                        } else {
                            c27Var = c27Var12;
                        }
                        c27Var13.a(Math.max(L4, f21 / f16), i46, i46, i43, i43, i48, i50);
                        i45++;
                        i46++;
                        i47 = i49;
                        c27Var12 = c27Var;
                    }
                    if (c27Var12 != null) {
                        c27Var12.e += i47;
                        c27Var12.i += i47;
                    }
                    i43++;
                    i42 = i45;
                }
            }
        }
        return c27VarArr;
    }

    public static int q(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return 6;
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks)) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 12;
        }
        return pageBlock instanceof TL_iv.pageBlockFooter ? 7 : 0;
    }

    public static String w(TL_iv.RichText richText) {
        StringBuilder sb = new StringBuilder();
        x(richText, sb);
        return sb.toString();
    }

    public static void x(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!yi9.j(textdiff.text)) {
                x(textdiff.text, sb);
                return;
            } else {
                if (yi9.j(textdiff.old_text)) {
                    return;
                }
                x(textdiff.old_text, sb);
                return;
            }
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                x(richText.texts.get(i), sb);
            }
            return;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            x(richText2, sb);
        }
    }

    public static vib y(int i) {
        vib vibVar = new vib();
        vibVar.a = i;
        return vibVar;
    }

    public static boolean z(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
    }

    public final boolean A() {
        gb2 gb2Var = this.E;
        return gb2Var != null && gb2Var.gb > 0;
    }

    public final boolean B() {
        cm cmVar;
        if (E()) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i >= arrayList.size()) {
                    break;
                }
                pib pibVar = (pib) arrayList.get(i);
                if ((pibVar instanceof qh9) && (cmVar = ((qh9) pibVar).F) != null && !cmVar.a.isEmpty()) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean C() {
        k27 k27Var = this.b;
        return (k27Var == null || !k27Var.P2() || k27Var.O3()) ? false : true;
    }

    public final boolean D() {
        k27 k27Var = this.b;
        return k27Var != null && k27Var.O3();
    }

    public final boolean E() {
        lg7 lg7Var = this.r;
        return lg7Var == null || !lg7Var.h;
    }

    public final boolean F() {
        gb2 gb2Var = this.E;
        return gb2Var != null && gb2Var.L2();
    }

    public final boolean G() {
        pib[] L;
        mg9 mg9Var = this.W;
        if (mg9Var != null && (L = mg9Var.L()) != null) {
            for (pib pibVar : L) {
                if (pibVar instanceof qh9) {
                    qh9 qh9Var = (qh9) pibVar;
                    if (qh9Var.N != null || qh9Var.R != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean H() {
        TL_iv.RichMessage richMessage = this.c;
        return richMessage != null && richMessage.rtl;
    }

    public final void I(rh9 rh9Var) {
        boolean z;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.g;
        if (view != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                mg9 mg9Var = (mg9) arrayList.get(i);
                View view2 = mg9Var.W;
                if (view2 != null && view2 == view) {
                    mg9Var.V();
                    CheckBoxBase checkBoxBase = mg9Var.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    mg9Var.W = null;
                }
            }
        }
        this.e.clear();
        this.f.clear();
        arrayList.clear();
        this.h.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        this.q = "";
        this.M = gba.T0;
        this.N = gl.p;
        this.w.setTextSize(gl.L(gba.T0));
        this.x.setTextSize(gl.L(gba.T0));
        this.d = false;
        this.c = null;
        k27 k27Var = this.b;
        if (k27Var == null || k27Var.k == null || k27Var.E0() == null) {
            return;
        }
        TL_iv.RichMessage E0 = k27Var.E0();
        this.c = E0;
        this.d = E0.part;
        this.P = rh9Var;
        int i2 = 0;
        while (i2 < this.c.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.c.blocks.get(i2);
            rh9 rh9Var2 = this;
            mg9 j = rh9Var2.j(pageBlock, 0, new Rect(), 0, N(i2, this.c.blocks));
            if ((j instanceof hh9) && (((z = pageBlock instanceof TL_iv.pageBlockParagraph)) || o.H(pageBlock))) {
                hh9 hh9Var = (hh9) j;
                hh9Var.j0((i2 == 0 && z) ? 0 : hh9Var.a0, i2 == rh9Var2.c.blocks.size() - 1 ? 0 : hh9Var.b0);
            }
            i2++;
            this = rh9Var2;
        }
        rh9 rh9Var3 = this;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            mg9 mg9Var2 = (mg9) arrayList.get(i3);
            if ((mg9Var2 instanceof hh9) && mg9Var2.w > 0) {
                int i4 = i3 + 1;
                ((hh9) mg9Var2).j0(gl.L(i3 > 0 && ((mg9) arrayList.get(i3 + (-1))).w > 0 ? 3.0f : 6.0f), gl.L(i4 < arrayList.size() && ((mg9) arrayList.get(i4)).w > 0 ? 3.0f : 6.0f));
            }
            i3++;
        }
        rh9Var3.P = null;
        if (rh9Var3.r != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((mg9) arrayList.get(i5)).L = rh9Var3.r;
            }
            rh9Var3.r.k(rh9Var3.p());
        }
        if (view != null) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ((mg9) arrayList.get(i6)).n(view);
            }
        }
        rh9Var3.P();
        rh9Var3.W();
    }

    public final boolean K(TL_iv.RichMessage richMessage, int i) {
        return (this.c == richMessage && this.M == gba.T0 && Math.abs(this.N - gl.p) <= 0.1f && i == this.B) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(MotionEvent motionEvent) {
        int i;
        float f;
        int actionMasked = motionEvent.getActionMasked();
        boolean X = X();
        ArrayList arrayList = this.g;
        if (X && (arrayList.get(0) instanceof zi9)) {
            i = -this.S;
        } else {
            if (C()) {
                f = 0.0f;
                if (actionMasked == 0 || (motionEvent.getX() >= f && motionEvent.getX() <= this.C + this.T)) {
                    if (this.d) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        RectF rectF = this.K;
                        if (actionMasked == 0) {
                            if (rectF.contains(x, y)) {
                                this.L = true;
                                n41 n41Var = this.G;
                                if (n41Var != null) {
                                    n41Var.c(true);
                                    return true;
                                }
                                return true;
                            }
                        } else if (this.L) {
                            if (actionMasked == 2) {
                                if (!rectF.contains(x, y)) {
                                    n41 n41Var2 = this.G;
                                    if (n41Var2 != null) {
                                        n41Var2.c(false);
                                    }
                                    this.L = false;
                                    return true;
                                }
                            } else if (actionMasked == 1 || actionMasked == 3) {
                                n41 n41Var3 = this.G;
                                if (n41Var3 != null) {
                                    n41Var3.c(false);
                                }
                                boolean z = actionMasked == 1 && rectF.contains(x, y);
                                this.L = false;
                                if (z && this.F != null && this.E != null) {
                                    View view = this.Q;
                                    if (view != null) {
                                        view.performHapticFeedback(3, 2);
                                    }
                                    this.F.E(this.E);
                                }
                            }
                            return true;
                        }
                    }
                    if (actionMasked != 0) {
                        this.W = null;
                        float y2 = motionEvent.getY();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            }
                            mg9 mg9Var = (mg9) arrayList.get(i2);
                            if (mg9Var.S()) {
                                int I = mg9Var.I();
                                float f2 = i3;
                                if (y2 < f2 || y2 >= i3 + I) {
                                    i3 += I;
                                } else {
                                    motionEvent.offsetLocation(0.0f, -i3);
                                    boolean f0 = mg9Var.f0(motionEvent);
                                    motionEvent.offsetLocation(0.0f, f2);
                                    if (f0) {
                                        this.W = mg9Var;
                                        this.X = i3;
                                        return true;
                                    }
                                }
                            }
                            i2++;
                        }
                    } else if (this.W != null) {
                        motionEvent.offsetLocation(0.0f, -this.X);
                        boolean f02 = this.W.f0(motionEvent);
                        motionEvent.offsetLocation(0.0f, this.X);
                        if (actionMasked != 1 && actionMasked != 3) {
                            return f02;
                        }
                        this.W = null;
                        return f02;
                    }
                }
                return false;
            }
            i = this.S;
        }
        f = i;
        if (actionMasked == 0) {
        }
        if (this.d) {
        }
        if (actionMasked != 0) {
        }
        return false;
    }

    public final ArrayList O(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                jg9 jg9Var = (jg9) obj;
                if (i >= jg9Var.a && i <= jg9Var.b) {
                    arrayList.add(jg9Var);
                }
            }
            Collections.sort(arrayList, new fx7((byte) 12));
        }
        return arrayList;
    }

    public final void P() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.n;
        arrayList2.clear();
        ArrayList arrayList3 = this.o;
        arrayList3.clear();
        ArrayList arrayList4 = this.p;
        arrayList4.clear();
        int i = 0;
        while (true) {
            arrayList = this.g;
            if (i >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((mg9) arrayList.get(i)).K());
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mg9 mg9Var = (mg9) arrayList.get(i2);
            if (mg9Var instanceof gh9) {
                gh9 gh9Var = (gh9) mg9Var;
                int i3 = this.C;
                int i4 = gh9Var.f0;
                int i5 = gh9Var.e0;
                Rect rect = gh9Var.b;
                int max = Math.max(i4, Math.min(i5, Math.max(0, (i3 - rect.left) - rect.right)));
                gh9Var.g0 = max;
                efb efbVar = gh9Var.Y;
                efbVar.setRenderWidth(max);
                gh9Var.h0 = efbVar.getRenderHeight();
            }
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            mg9 mg9Var2 = (mg9) arrayList.get(i7);
            boolean S = mg9Var2.S();
            mg9Var2.N = i6;
            mg9Var2.O = 0;
            mg9Var2.R = S;
            Rect rect2 = mg9Var2.b;
            mg9Var2.Z(rect2.left, rect2.top + i6, i7);
            if (S) {
                pib[] L = mg9Var2.L();
                if (L != null) {
                    for (pib pibVar : L) {
                        if (pibVar != null && pibVar.a() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb.length()));
                            arrayList4.add(Integer.valueOf(i7));
                            arrayList2.add(pibVar);
                            CharSequence text = pibVar.a().getText();
                            if (text != null) {
                                sb.append(text);
                            }
                        }
                    }
                }
                int I = mg9Var2.I();
                mg9Var2.O = I;
                i6 += I;
            }
        }
        this.A = i6;
        this.q = sb;
    }

    public final void R(int i, int i2) {
        if (this.S == i && this.T == i2) {
            return;
        }
        this.S = i;
        this.T = i2;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i3 >= arrayList.size()) {
                return;
            }
            mg9 mg9Var = (mg9) arrayList.get(i3);
            if (mg9Var instanceof tg9) {
                tg9 tg9Var = (tg9) mg9Var;
                qh9 qh9Var = tg9Var.Y;
                qh9Var.c = (gl.L(53.0f) + (tg9Var.T - tg9Var.a.S)) - qh9Var.f;
            }
            i3++;
        }
    }

    public final void S(gb2 gb2Var, bb2 bb2Var) {
        this.E = gb2Var;
        this.F = bb2Var;
    }

    public final void T(CharacterStyle characterStyle, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (!(characterStyle instanceof oh9)) {
            spannableStringBuilder.setSpan(characterStyle, i, i2, 33);
            return;
        }
        int i3 = ((oh9) characterStyle).b;
        oh9[] oh9VarArr = (oh9[]) spannableStringBuilder.getSpans(i, i2, oh9.class);
        if (oh9VarArr == null || oh9VarArr.length <= 0) {
            U(spannableStringBuilder, i, i2, i3);
            return;
        }
        Arrays.sort(oh9VarArr, Comparator$-CC.comparingInt(new nl1(spannableStringBuilder, (byte) 2)));
        for (int i4 = 0; i4 < oh9VarArr.length; i4++) {
            int spanStart = spannableStringBuilder.getSpanStart(oh9VarArr[i4]);
            int spanEnd = spannableStringBuilder.getSpanEnd(oh9VarArr[i4]);
            if (spanStart > i) {
                U(spannableStringBuilder, i, spanStart, i3);
            }
            i = Math.max(i, spanEnd);
        }
        if (i < i2) {
            U(spannableStringBuilder, i, i2, i3);
        }
    }

    public final void U(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        while (i < i2) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i, i2, URLSpan.class);
            spannableStringBuilder.setSpan(new oh9(this, i3, ((URLSpan[]) spannableStringBuilder.getSpans(i, nextSpanTransition, URLSpan.class)).length > 0), i, nextSpanTransition, 33);
            i = nextSpanTransition;
        }
    }

    public final void V(lg7 lg7Var) {
        this.r = lg7Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            ((mg9) arrayList.get(i)).L = lg7Var;
            arrayList.get(i);
            ((mg9) arrayList.get(i)).getClass();
            i++;
        }
    }

    public final void W() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            ((mg9) arrayList.get(i)).d0();
            i++;
        }
    }

    public final boolean X() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return false;
        }
        mg9 mg9Var = (mg9) arrayList.get(0);
        return (mg9Var instanceof ah9) || (mg9Var instanceof mh9) || (mg9Var instanceof sg9) || (mg9Var instanceof eh9) || (mg9Var instanceof zi9);
    }

    public final void a0(int i) {
        qh9 qh9Var;
        View view;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                return;
            }
            pib pibVar = (pib) arrayList.get(i2);
            if ((pibVar instanceof qh9) && (view = (qh9Var = (qh9) pibVar).T) != null) {
                gm.release(view, qh9Var.F);
                qh9Var.F = null;
                qh9Var.F = gm.update(i, qh9Var.T, qh9Var.a.v && !qh9Var.w, (cm) null, qh9Var.b);
            }
            i2++;
        }
    }

    public final void b(View view) {
        View view2 = this.Q;
        if (view == view2) {
            return;
        }
        if (view2 != null) {
            f(view2);
        }
        this.Q = view;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            ((mg9) arrayList.get(i)).n(view);
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        if (z(r11.color) != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.Chat chat, TLRPC.User user) {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.PeerColor peerColor;
        this.y.a(this.b, user, chat, this.D, 1);
        k27 k27Var = this.b;
        if (k27Var == null || k27Var.O3() || k27Var.O5()) {
            return;
        }
        boolean z = true;
        if (k27Var.e1 < 0 && k27Var.g1 == null && (!k27Var.q4() || (peerColor = k27Var.Z0) == null || peerColor.color == -1)) {
            TLRPC.Message message = k27Var.k;
            int i = this.a;
            if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                long n = cf3.n(peer);
                z = n >= 0 ? false : false;
            } else if (cf3.B(k27.B0(message)) || k27Var.p3()) {
                if (user != null) {
                }
            } else {
                if (k27Var.n3() && chat != null) {
                    if (chat.signature_profiles) {
                        long Z0 = k27Var.Z0();
                        if (Z0 < 0) {
                        }
                    } else {
                        z = z(chat.color);
                    }
                }
            }
        }
        if (z) {
            return;
        }
        wjb wjbVar = this.D;
        this.y.p(bkb.v0(bkb.Ei, this.D), wjbVar != null ? wjbVar.a() : bkb.I.o());
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 != view || view2 == null) {
            return;
        }
        pla plaVar = this.R;
        if (plaVar != null) {
            plaVar.b(view);
            this.R = null;
        }
        this.Q = null;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                break;
            }
            mg9 mg9Var = (mg9) arrayList.get(i);
            View view3 = mg9Var.W;
            if (view3 != null && view3 == view) {
                mg9Var.V();
                CheckBoxBase checkBoxBase = mg9Var.r;
                if (checkBoxBase != null) {
                    checkBoxBase.l = false;
                }
                mg9Var.W = null;
            }
            i++;
        }
        if (view == this.E) {
            this.E = null;
            this.F = null;
        }
    }

    public final void g(Canvas canvas, int i, int i2, nb2 nb2Var) {
        float f;
        float f2;
        rh9 rh9Var;
        nb2 nb2Var2;
        bb2 bb2Var;
        R(i, i2);
        this.w.linkColor = bkb.v0(D() ? bkb.Xc : bkb.Wc, this.D);
        boolean z = this.d;
        int min = Math.min(this.A, gl.L(900.0f));
        if (z) {
            canvas.saveLayerAlpha(-i, 0.0f, this.C + i2, min, kk7.d4, 31);
        }
        gb2 gb2Var = this.E;
        boolean z2 = gb2Var != null && gb2Var.Ec > 0;
        if (z2) {
            float f3 = gb2Var.Cc - gb2Var.u0;
            f2 = gb2Var.Ec + f3;
            f = f3;
            nb2Var2 = nb2Var;
            rh9Var = this;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            rh9Var = this;
            nb2Var2 = nb2Var;
        }
        rh9Var.h(canvas, nb2Var2, z2, f, f2);
        if (z) {
            RectF rectF = gl.P;
            rectF.set(-i, min - gl.L(32.0f), this.C + i2, min);
            this.z.s(canvas, rectF, 3, 1.0f);
            canvas.restore();
            int v0 = bkb.v0(D() ? bkb.Nb : bkb.Ad, this.D);
            if (this.I == null) {
                this.I = new tgb(k96.M0(2131745147, null), 16.0f, gl.o());
            }
            n41 n41Var = this.G;
            if (n41Var == null) {
                this.G = new n41(this.Q, 1.5f, 2.0f);
            } else {
                View view = n41Var.a;
                View view2 = this.Q;
                if (view != view2) {
                    n41Var.a = view2;
                }
            }
            Paint paint = this.H;
            if (paint == null) {
                paint = new Paint(1);
                this.H = paint;
            }
            paint.setColor(bkb.p1(0.1f, v0));
            float L = gl.L(42.0f);
            float f4 = this.I.c;
            float L2 = ((this.C + this.S) + this.T) - gl.L(24.0f);
            int i3 = this.C;
            float f5 = (((i3 + r13) + this.T) / 2.0f) - this.S;
            float L3 = gl.L(4.0f) + min;
            float f6 = L2 / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f5 - f6, L3, f5 + f6, L + L3);
            gb2 gb2Var2 = this.E;
            boolean z3 = (gb2Var2 == null || (bb2Var = this.F) == null || !bb2Var.A1(gb2Var2, 7)) ? false : true;
            r86 r86Var = this.J;
            if (r86Var != null && !z3 && !r86Var.c() && !this.J.d()) {
                this.J.a();
            }
            r86 r86Var2 = this.J;
            if (r86Var2 == null) {
                if (z3) {
                    r86 r86Var3 = new r86();
                    this.J = r86Var3;
                    r86Var3.x.setStrokeWidth(gl.L(1.25f));
                    this.J.D = true;
                }
            } else if (z3 && (r86Var2.c() || this.J.d())) {
                r86 r86Var4 = this.J;
                r86Var4.b = -1L;
                r86Var4.c = -1L;
            }
            r86 r86Var5 = this.J;
            if (r86Var5 != null) {
                r86Var5.g(bkb.p1(0.1f, v0), bkb.p1(0.3f, v0), bkb.p1(0.3f, v0), bkb.p1(1.2f, v0));
            }
            float a = this.G.a(0.075f);
            boolean z4 = a != 1.0f;
            if (z4) {
                canvas.save();
                canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, gl.L(8.0f), gl.L(8.0f), this.H);
            r86 r86Var6 = this.J;
            if (r86Var6 != null && !r86Var6.c()) {
                this.J.e(rectF2);
                this.J.j(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f4 / 2.0f), rectF2.centerY(), 1.0f, v0, canvas);
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, nb2 nb2Var, boolean z, float f, float f2) {
        View view;
        float f3;
        float f4;
        Canvas canvas2;
        tg9 tg9Var;
        float f5;
        int i;
        float f6;
        int I;
        int i2;
        float f7;
        Canvas canvas3 = canvas;
        float f8 = 0.0f;
        float f9 = 1.0f;
        int i3 = 0;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                jg9 jg9Var = (jg9) arrayList.get(i4);
                int r = r(jg9Var.a, nb2Var);
                int i6 = jg9Var.b;
                ArrayList arrayList2 = this.g;
                float f10 = 4.0f;
                if (i6 < 0 || i6 >= arrayList2.size() || nb2Var == null || !(this.s || this.u)) {
                    int i7 = i3;
                    int i8 = i7;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            i2 = this.A;
                            break;
                        }
                        mg9 mg9Var = (mg9) arrayList2.get(i7);
                        boolean S = mg9Var.S();
                        Rect rect = mg9Var.b;
                        if (S) {
                            float f11 = f10;
                            int I2 = ((nb2Var == null || !(this.s || this.u)) ? mg9Var.I() : gl.U1(Math.max(f8, Math.min(1.0f, nb2Var.L1)), mg9Var.Q, mg9Var.O)) + i8;
                            if (i7 != i6 || rect.bottom <= gl.L(f11)) {
                                f7 = f11;
                            } else {
                                f7 = f11;
                                I2 = de9.f(f7, rect.bottom, I2);
                            }
                            i8 = I2;
                        } else {
                            f7 = f10;
                        }
                        if (i7 == i6) {
                            i2 = i8;
                            break;
                        } else {
                            i7++;
                            f10 = f7;
                            f8 = 0.0f;
                        }
                    }
                } else {
                    float max = Math.max(f8, Math.min(1.0f, nb2Var.L1));
                    mg9 mg9Var2 = (mg9) arrayList2.get(i6);
                    int c = b00.c(4.0f, mg9Var2.b.bottom, i3);
                    float f12 = (mg9Var2.P + mg9Var2.Q) - (mg9Var2.S ? c : i3);
                    float f13 = mg9Var2.N + mg9Var2.O;
                    if (!mg9Var2.R) {
                        c = i3;
                    }
                    i2 = Math.round(gl.R1(f12, f13 - c, max));
                }
                int i9 = jg9Var.b;
                ArrayList arrayList3 = this.g;
                float f14 = 1.0f;
                for (int i10 = jg9Var.a; i10 < Math.min(i9 + 1, arrayList3.size()); i10++) {
                    mg9 mg9Var3 = (mg9) arrayList3.get(i10);
                    if (mg9Var3.S()) {
                        f14 *= mg9Var3.z();
                    }
                }
                int L = gl.L(3.0f) * jg9Var.d;
                int i11 = jg9Var.e + L;
                int i12 = L + jg9Var.f;
                if (i2 - r > i11 + i12) {
                    r += i11;
                    i2 -= i12;
                }
                RectF rectF = gl.P;
                rectF.set(jg9Var.c, r, this.C - gl.L(jg9Var.d * 12), i2);
                canvas3.save();
                canvas3.scale(f14, f14, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(gba.V0 / 3.0f);
                this.y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i4 = i5;
                f8 = 0.0f;
                i3 = 0;
            }
        }
        int i13 = 0;
        while (i13 < this.g.size()) {
            mg9 mg9Var4 = (mg9) this.g.get(i13);
            if ((mg9Var4 instanceof ch9) && (mg9Var4.R || mg9Var4.S)) {
                ch9 ch9Var = (ch9) mg9Var4;
                int r2 = ch9Var.X.r();
                qh9 qh9Var = ch9Var.Y;
                int max2 = Math.max(r2, qh9Var != null ? qh9Var.r() : 0);
                if (max2 > 0) {
                    boolean z2 = nb2Var != null && (this.s || this.u);
                    float max3 = z2 ? Math.max(0.0f, Math.min(f9, nb2Var.L1)) : f9;
                    float R1 = z2 ? gl.R1(ch9Var.S ? f9 : 0.0f, ch9Var.R ? f9 : 0.0f, max3) : ch9Var.R ? f9 : 0.0f;
                    if (R1 > 0.0f) {
                        float f15 = ((this.C + this.T) - this.S) / 2.0f;
                        float f16 = max2 / 2.0f;
                        float L2 = (f15 - f16) - gl.L(30.0f);
                        float L3 = f15 + f16 + gl.L(30.0f);
                        if (z2) {
                            f6 = gl.R1(ch9Var.P, ch9Var.N, max3);
                            I = gl.U1(max3, ch9Var.Q, ch9Var.O);
                        } else {
                            f6 = ch9Var.N;
                            I = ch9Var.I();
                        }
                        float L4 = gl.L(8.0f) + f6;
                        float L5 = (f6 + I) - gl.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = gl.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(gba.V0 / 2.0f);
                            this.y.d(canvas3, rectF2, floor2, floor2, floor2, R1, false, false);
                            Drawable drawable = this.i;
                            if (drawable == null) {
                                drawable = a.b.getDrawable(R.drawable.mini_quote).mutate();
                                this.i = drawable;
                            }
                            drawable.setColorFilter(this.y.h(), PorterDuff.Mode.SRC_IN);
                            this.i.setAlpha((int) (R1 * 255.0f));
                            int intrinsicWidth = this.i.getIntrinsicWidth();
                            int intrinsicHeight = this.i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i14 = (int) L2;
                            int i15 = (int) L4;
                            i = i13;
                            this.i.setBounds(gl.L(8.0f) + i14, gl.L(7.0f) + i15, de9.w(8.0f, i14, intrinsicWidth), de9.w(7.0f, i15, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i16 = (int) L3;
                            int i17 = (int) L5;
                            this.i.setBounds(ls6.x(8.0f, i16, intrinsicWidth), ls6.x(7.0f, i17, intrinsicHeight), i16 - gl.L(8.0f), i17 - gl.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            this.i.setAlpha(kk7.d4);
                            i13 = i + 1;
                            f9 = 1.0f;
                        }
                    }
                }
            }
            i = i13;
            i13 = i + 1;
            f9 = 1.0f;
        }
        k27 k27Var = this.b;
        boolean z3 = this.O || (k27Var != null && na7.q1(this.a).i4.z(k27Var));
        if (z3 || this.U != null) {
            lm lmVar = this.U;
            if (lmVar == null) {
                lm lmVar2 = new lm(0L, 350L, s33.h);
                this.U = lmVar2;
                lmVar = lmVar2;
            }
            float e = lmVar.e(false, z3 ? 1.0f : 0.0f);
            this.V = e;
            if (e > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        } else {
            this.V = 0.0f;
        }
        if (nb2Var == null || !(this.s || this.u)) {
            f3 = 1.0f;
            f4 = 1.0f;
        } else {
            f3 = 1.0f;
            f4 = Math.max(0.0f, Math.min(1.0f, nb2Var.L1));
        }
        this.t = f4;
        if (f4 >= f3) {
            this.s = false;
            this.u = false;
        }
        boolean z4 = this.s;
        boolean z5 = (z4 || this.u) ? false : z;
        boolean z6 = z4 && f4 < 1.0f;
        if (z6) {
            ArrayList arrayList4 = this.g;
            for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                mg9 mg9Var5 = (mg9) arrayList4.get(i18);
                if (mg9Var5 instanceof tg9) {
                    tg9 tg9Var2 = (tg9) mg9Var5;
                    tg9Var2.e0 = gl.R1(tg9Var2.P, tg9Var2.N, f4) + tg9Var2.I();
                    int i19 = i18 + 1;
                    while (true) {
                        if (i19 >= arrayList4.size()) {
                            f5 = Float.MAX_VALUE;
                            break;
                        }
                        mg9 mg9Var6 = (mg9) arrayList4.get(i19);
                        do {
                            mg9Var6 = mg9Var6.M;
                            if (mg9Var6 == null) {
                                f5 = gl.R1(((mg9) arrayList4.get(i19)).P, ((mg9) arrayList4.get(i19)).N, f4);
                                break;
                            }
                        } while (mg9Var6 != tg9Var2);
                        i19++;
                    }
                    tg9Var2.f0 = f5;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
            mg9 mg9Var7 = (mg9) arrayList5.get(i20);
            if (mg9Var7 instanceof ih9) {
                ih9 ih9Var = (ih9) mg9Var7;
                ih9Var.j0 = gl.R1(ih9Var.i0 ? 1.0f : 0.0f, ih9Var.h0 ? 1.0f : 0.0f, f4);
                ih9Var.k0 = gl.U1(f4, ih9Var.Q, ih9Var.O);
            }
        }
        int i21 = 0;
        while (i21 < this.g.size()) {
            mg9 mg9Var8 = (mg9) this.g.get(i21);
            if (mg9Var8.R || mg9Var8.S) {
                float R12 = gl.R1(mg9Var8.P, mg9Var8.N, f4);
                boolean z7 = mg9Var8 instanceof ug9;
                float R13 = z7 ? 1.0f : gl.R1(mg9Var8.S ? 1.0f : 0.0f, mg9Var8.R ? 1.0f : 0.0f, f4);
                if (R13 > 0.0f) {
                    int I3 = mg9Var8.I();
                    if (!z5 || (I3 + R12 > f && R12 < f2)) {
                        canvas3.save();
                        if (z6 && (tg9Var = mg9Var8.M) != null && !z7) {
                            float f17 = -3.4028235E38f;
                            float f18 = Float.MAX_VALUE;
                            for (tg9Var = mg9Var8.M; tg9Var != null; tg9Var = tg9Var.M) {
                                f17 = Math.max(f17, tg9Var.e0);
                                f18 = Math.min(f18, tg9Var.f0);
                            }
                            if (f18 <= f17) {
                                canvas3.restore();
                            } else {
                                canvas3.clipRect(-this.S, f17, this.C + this.T, f18);
                            }
                        }
                        canvas3.translate(0.0f, R12);
                        if (R13 < 1.0f) {
                            canvas2 = canvas3;
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, I3, (int) (R13 * 255.0f), 31);
                            mg9Var8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            mg9Var8.t(canvas2);
                        }
                        canvas2.restore();
                        i21++;
                        canvas3 = canvas2;
                    }
                }
            }
            canvas2 = canvas3;
            i21++;
            canvas3 = canvas2;
        }
        if (f4 >= f3) {
            W();
        }
    }

    public final void i(Canvas canvas, ColorFilter colorFilter) {
        if (!E()) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            mg9 mg9Var = (mg9) arrayList.get(i);
            if (mg9Var.R) {
                canvas.save();
                canvas.translate(0.0f, mg9Var.N);
                mg9Var.s(canvas, colorFilter);
                canvas.restore();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [hh9, ih9] */
    public final mg9 j(TL_iv.PageBlock pageBlock, int i, Rect rect, int i2, boolean z) {
        int i3;
        TLRPC.Document s;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        dh9 dh9Var;
        int i4;
        int i5;
        int i6;
        rh9 rh9Var;
        mg9 mg9Var;
        rh9 rh9Var2 = this;
        int i7 = i2;
        int i8 = rect.left + rect.right;
        int i9 = rh9Var2.B;
        if (i8 >= i9) {
            return null;
        }
        boolean z2 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i10 = 0;
        ArrayList arrayList = rh9Var2.g;
        if (z2) {
            kh9 kh9Var = new kh9(rh9Var2, new Rect(), i9, rh9Var2.l(pageBlock.text, 0));
            arrayList.add(kh9Var);
            return kh9Var;
        }
        if (o.H(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean H = o.H(pageBlock);
            hh9 hh9Var = new hh9(rh9Var2, rect, i9, rh9Var2.l(pageBlock.text, Q(i7, q(pageBlock))));
            if (H) {
                hh9Var.j0(gl.L(10.0f), gl.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                hh9Var.j0(z ? 0 : gl.L(6.0f), gl.L(6.0f));
            }
            hh9Var.G = pageBlock instanceof TL_iv.pageBlockHeading1 ? 2131754027 : pageBlock instanceof TL_iv.pageBlockHeading2 ? 2131754026 : pageBlock instanceof TL_iv.pageBlockHeading3 ? 2131754025 : pageBlock instanceof TL_iv.pageBlockHeading4 ? 2131754024 : pageBlock instanceof TL_iv.pageBlockHeading5 ? 2131754023 : pageBlock instanceof TL_iv.pageBlockHeading6 ? 2131754022 : pageBlock instanceof TL_iv.pageBlockFooter ? 2131754029 : 0;
            arrayList.add(hh9Var);
            return hh9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            rh9 rh9Var3 = rh9Var2.P;
            if (rh9Var3 != null) {
                ArrayList arrayList2 = rh9Var3.g;
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        mg9Var = null;
                        break;
                    }
                    Object obj = arrayList2.get(i11);
                    i11++;
                    mg9 mg9Var2 = (mg9) obj;
                    if (bh9.class.isInstance(mg9Var2) && (mg9Var2 instanceof bh9)) {
                        String str = ((bh9) mg9Var2).o0;
                        String w = w(pageBlock.text);
                        if ((str == null || str.length() > w.length() || w.length() <= 0) ? false : w.startsWith(str)) {
                            mg9Var = (mg9) bh9.class.cast(mg9Var2);
                            break;
                        }
                    }
                }
            } else {
                mg9Var = null;
            }
            bh9 bh9Var = new bh9(rh9Var2, rect, rh9Var2.B, pageblockpreformatted, (bh9) mg9Var);
            bh9Var.G = 2131754052;
            arrayList.add(bh9Var);
            return bh9Var;
        }
        boolean z3 = pageBlock instanceof TL_iv.pageBlockList;
        TextPaint textPaint = rh9Var2.x;
        if (z3) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i12 = i + 1;
            textPaint.setTextSize(gl.L(gba.T0));
            int L = gl.L(16.0f);
            for (int i13 = 0; i13 < pageblocklist.items.size(); i13++) {
                L = Math.max(L, pageblocklist.items.get(i13).checkbox ? gl.L(26.0f) : gl.L(16.0f));
            }
            Rect rect2 = new Rect(rect);
            if (rh9Var2.H()) {
                rect2.right += L;
            } else {
                rect2.left += L;
            }
            int i14 = 0;
            while (i14 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i14);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    hh9 hh9Var2 = new hh9(rh9Var2, new Rect(rect2), i9, rh9Var2.l(tL_pageListItemText.text, i7));
                    hh9Var2.n = L;
                    if (tL_pageListItemText.checkbox) {
                        hh9Var2.b0(tL_pageListItemText, tL_pageListItemText.checked);
                    } else {
                        hh9Var2.c0("•◦▪".charAt(i % 3) + "");
                    }
                    boolean z4 = tL_pageListItemText.checkbox;
                    boolean z5 = tL_pageListItemText.checked;
                    hh9Var2.w = i12;
                    hh9Var2.x = false;
                    hh9Var2.y = z4;
                    hh9Var2.E = z5;
                    arrayList.add(hh9Var2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                        int size2 = arrayList.size();
                        int i15 = 0;
                        boolean z6 = false;
                        while (i15 < tL_pageListItemBlocks.blocks.size()) {
                            int i16 = i15;
                            mg9 j = j(tL_pageListItemBlocks.blocks.get(i15), i12, new Rect(rect2), i7, N(i15, tL_pageListItemBlocks.blocks));
                            int i17 = i12;
                            if (j != null && !z6) {
                                j.n = L;
                                if (tL_pageListItemBlocks.checkbox) {
                                    j.b0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                } else {
                                    j.c0("•◦▪".charAt(i % 3) + "");
                                }
                                boolean z7 = tL_pageListItemBlocks.checkbox;
                                boolean z8 = tL_pageListItemBlocks.checked;
                                j.w = i17;
                                j.x = false;
                                j.y = z7;
                                j.E = z8;
                                z6 = true;
                            }
                            i12 = i17;
                            i15 = i16 + 1;
                            rh9Var2 = this;
                        }
                        i6 = i12;
                        rh9Var = rh9Var2;
                        int size3 = arrayList.size();
                        for (int i18 = size2; i18 < size3; i18++) {
                            mg9 mg9Var3 = (mg9) arrayList.get(i18);
                            if (mg9Var3.w == 0) {
                                mg9Var3.w = i6;
                                mg9Var3.x = false;
                            }
                        }
                        i14++;
                        rh9Var2 = rh9Var;
                        i12 = i6;
                    }
                }
                i6 = i12;
                rh9Var = rh9Var2;
                i14++;
                rh9Var2 = rh9Var;
                i12 = i6;
            }
            return null;
        }
        rh9 rh9Var4 = rh9Var2;
        boolean z9 = true;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i19 = i + 1;
            textPaint.setTextSize(gl.L(gba.T0));
            new TextPaint(textPaint).setTypeface(gl.o());
            int L2 = gl.L(16.0f);
            for (int i20 = 0; i20 < pageblockorderedlist.items.size(); i20++) {
                L2 = Math.max(L2, gl.L(8.0f) + ((int) Math.ceil(r1.measureText(M(pageblockorderedlist, r12, i20)))) + (pageblockorderedlist.items.get(i20).checkbox ? gl.L(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (rh9Var4.H()) {
                rect3.right += L2;
            } else {
                rect3.left += L2;
            }
            int i21 = 0;
            while (i21 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i21);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    hh9 hh9Var3 = new hh9(rh9Var4, new Rect(rect3), i9, rh9Var4.l(tL_pageListOrderedItemText.text, i7));
                    hh9Var3.n = L2;
                    hh9Var3.c0(M(pageblockorderedlist, tL_pageListOrderedItemText, i21));
                    if (tL_pageListOrderedItemText.checkbox) {
                        hh9Var3.b0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                    }
                    boolean z10 = tL_pageListOrderedItemText.checkbox;
                    boolean z11 = tL_pageListOrderedItemText.checked;
                    hh9Var3.w = i19;
                    hh9Var3.x = z9;
                    hh9Var3.y = z10;
                    hh9Var3.E = z11;
                    arrayList.add(hh9Var3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int i22 = i10;
                        int i23 = i22;
                        while (i22 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            rh9 rh9Var5 = rh9Var4;
                            int i24 = i19;
                            int i25 = i22;
                            mg9 j2 = rh9Var5.j(tL_pageListOrderedItemBlocks.blocks.get(i22), i24, new Rect(rect3), i7, N(i22, tL_pageListOrderedItemBlocks.blocks));
                            rh9Var4 = rh9Var5;
                            i19 = i24;
                            int i26 = i7;
                            if (j2 != null && i23 == 0) {
                                j2.n = L2;
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j2.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                j2.c0(M(pageblockorderedlist, tL_pageListOrderedItemBlocks, i21));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j2.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                boolean z12 = tL_pageListOrderedItemBlocks.checkbox;
                                boolean z13 = tL_pageListOrderedItemBlocks.checked;
                                j2.w = i19;
                                j2.x = true;
                                j2.y = z12;
                                j2.E = z13;
                                i23 = 1;
                            }
                            i22 = i25 + 1;
                            i7 = i26;
                        }
                        i5 = i7;
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            mg9 mg9Var4 = (mg9) arrayList.get(size5);
                            if (mg9Var4.w == 0) {
                                mg9Var4.w = i19;
                                mg9Var4.x = true;
                            }
                        }
                        i21++;
                        i7 = i5;
                        z9 = true;
                        i10 = 0;
                    }
                }
                i5 = i7;
                i21++;
                i7 = i5;
                z9 = true;
                i10 = 0;
            }
            return null;
        }
        int i27 = i7;
        boolean z14 = pageBlock instanceof TL_iv.pageBlockBlockquote;
        ArrayList arrayList3 = rh9Var4.h;
        if (z14) {
            int i28 = rect.left;
            int size6 = arrayList.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            SpannableStringBuilder l = rh9Var4.l(pageBlock.text, Q(i27, q(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            SpannableStringBuilder l2 = (richText == null || TextUtils.isEmpty(w(richText))) ? null : rh9Var4.l(pageblockblockquote2.caption, Q(i27, 11));
            if (pageblockblockquote2.collapsed) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(l);
                if (l2 != null) {
                    spannableStringBuilder.append('\n');
                    i4 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) l2);
                } else {
                    i4 = -1;
                }
                int i29 = i4;
                ?? ih9Var = new ih9(rh9Var4, new Rect(gl.L(12.0f) + rect.left, gl.L(4.0f) + rect.top, gl.L(20.0f) + rect.right, gl.L(4.0f) + rect.bottom), rh9Var4.B, pageblockblockquote2, spannableStringBuilder);
                pageblockblockquote = pageblockblockquote2;
                ih9Var.c0 = i29;
                ih9Var.j0(gl.L(8.0f), gl.L(8.0f));
                dh9Var = ih9Var;
            } else {
                pageblockblockquote = pageblockblockquote2;
                dh9Var = new dh9(rh9Var4, new Rect(gl.L(12.0f) + rect.left, gl.L(12.0f) + rect.top, gl.L(12.0f) + rect.right, gl.L(14.0f) + rect.bottom), rh9Var4.B, l, l2, Layout.Alignment.ALIGN_NORMAL);
            }
            dh9Var.G = 2131753993;
            arrayList.add(dh9Var);
            arrayList3.add(new jg9(size6, arrayList.size() - 1, i28, i, gl.L(8.0f), pageblockblockquote.collapsed ? gl.L(8.0f) : 0));
            return dh9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            int i30 = rect.left;
            int i31 = i + 1;
            int size7 = arrayList.size();
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
            boolean z15 = (richText2 == null || TextUtils.isEmpty(w(richText2))) ? false : true;
            int i32 = 0;
            while (i32 < pageblockblockquoteblocks.blocks.size()) {
                int i33 = i31;
                j(pageblockblockquoteblocks.blocks.get(i32), i33, new Rect(gl.L(12.0f) + rect.left, rect.top + (i32 == 0 ? gl.L(4.0f) : 0), gl.L(12.0f) + rect.right, rect.bottom + ((!(i32 == pageblockblockquoteblocks.blocks.size() + (-1)) || z15) ? 0 : gl.L(4.0f))), Q(i27, 9), N(i32, pageblockblockquoteblocks.blocks));
                i32++;
                i27 = i27;
                pageblockblockquoteblocks = pageblockblockquoteblocks;
                i31 = i33;
            }
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks2 = pageblockblockquoteblocks;
            int i34 = i27;
            if (arrayList.size() > size7) {
                ((mg9) arrayList.get(size7)).F = 2131753993;
            }
            if (z15) {
                hh9 hh9Var4 = new hh9(this, new Rect(gl.L(12.0f) + rect.left, rect.top, gl.L(12.0f) + rect.right, gl.L(6.0f) + rect.bottom), i9, new SpannableStringBuilder(l(pageblockblockquoteblocks2.caption, Q(i34, 11))));
                hh9Var4.c0 = 0;
                hh9Var4.j0(gl.L(2.0f), 0);
                arrayList.add(hh9Var4);
            }
            arrayList3.add(new jg9(size7, arrayList.size() - 1, i30, i, 0, 0));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            SpannableStringBuilder l3 = l(pageBlock.text, Q(i27, q(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            ch9 ch9Var = new ch9(this, new Rect(gl.L(30.0f) + rect.left, gl.L(16.0f) + rect.top, gl.L(30.0f) + rect.right, gl.L(16.0f) + rect.bottom), this.B, l3, (richText3 == null || TextUtils.isEmpty(w(richText3))) ? null : l(pageblockpullquote.caption, Q(i27, 11)), Layout.Alignment.ALIGN_CENTER);
            ch9Var.G = 2131753994;
            arrayList.add(ch9Var);
            return ch9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            pg9 pg9Var = new pg9(this, rect, i9, (TL_iv.pageBlockButtonRow) pageBlock);
            pg9Var.G = 2131754871;
            arrayList.add(pg9Var);
            return pg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            try {
                gh9 gh9Var = new gh9(this, rect, i9, (TL_iv.pageBlockTable) pageBlock);
                gh9Var.G = 2131754854;
                arrayList.add(gh9Var);
                return gh9Var;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            yg9 yg9Var = new yg9(this, rect, i9, (TL_iv.pageBlockMath) pageBlock);
            arrayList.add(yg9Var);
            return yg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            vg9 vg9Var = new vg9(this, rect, i9);
            arrayList.add(vg9Var);
            return vg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            ah9 ah9Var = new ah9(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
            arrayList.add(ah9Var);
            k(pageblockphoto.caption, rect, i27);
            return ah9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            mh9 mh9Var = new mh9(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
            arrayList.add(mh9Var);
            k(pageblockvideo.caption, rect, i27);
            return mh9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            sg9 sg9Var = new sg9(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
            arrayList.add(sg9Var);
            k(pageblockcollage.caption, rect, i27);
            return sg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            eh9 eh9Var = new eh9(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
            arrayList.add(eh9Var);
            k(pageblockslideshow.caption, rect, i27);
            return eh9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            xg9 xg9Var = new xg9(this, rect, i9, pageblockmap);
            arrayList.add(xg9Var);
            k(pageblockmap.caption, rect, i27);
            return xg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            HashMap hashMap = this.m;
            if (((k27) hashMap.get(pageblockaudio)) == null && (s = s(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i35 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i35;
                tL_message.id = i35;
                k27 k27Var = this.b;
                tL_message.realId = k27Var.L1();
                tL_message.dialog_id = k27.B0(k27Var.k);
                TLRPC.Peer peer = k27Var.k.peer_id;
                tL_message.peer_id = peer;
                int i36 = this.a;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = y6c.h(i36).e();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = y6c.h(i36).e();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = s;
                tL_message.flags |= 768;
                k27 k27Var2 = new k27(i36, tL_message, false, true);
                this.l.add(k27Var2);
                hashMap.put(pageblockaudio, k27Var2);
            }
            lg9 lg9Var = new lg9(this, rect, i9, pageblockaudio);
            arrayList.add(lg9Var);
            k(pageblockaudio.caption, rect, i27);
            return lg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            wg9 wg9Var = new wg9(this, rect, i9, pageblockdocument);
            arrayList.add(wg9Var);
            k(pageblockdocument.caption, rect, i27);
            return wg9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            return j(((TL_iv.pageBlockCover) pageBlock).cover, i, rect, i27, false);
        }
        if (pageBlock instanceof TL_iv.pageBlockAnchor) {
            String str2 = ((TL_iv.pageBlockAnchor) pageBlock).name;
            if (str2 == null) {
                return null;
            }
            this.j.put(str2.toLowerCase(), Integer.valueOf(arrayList.size()));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockEmbed) {
            TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
            AtomicInteger atomicInteger = zi9.t0;
            if (pageblockembed.html != null && vvc.m(pageblockembed.url)) {
                if (vvc.m(pageblockembed.url)) {
                    String str3 = pageblockembed.url;
                    int j0 = i9 + (zi9.j0() << 1);
                    svc svcVar = vvc.m(str3) ? (svc) vvc.a.get(str3) : null;
                    if (svcVar != null && (i3 = svcVar.e) != 0) {
                        j0 = Math.min(j0, gl.L(Math.max(kk7.d3, i3)));
                    }
                    i9 = j0 - (zi9.j0() << 1);
                }
                zi9 zi9Var = new zi9(this, rect, i9, pageblockembed, arrayList.isEmpty());
                arrayList.add(zi9Var);
                k(pageblockembed.caption, rect, i27);
                return zi9Var;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int L3 = fod.a(i27, 9) ? gl.L(6.0f) : i > 0 ? gl.L(4.0f) : 0;
            lh9 lh9Var = new lh9(this, new Rect((rect.left + L3) - gl.L(7.0f), Math.max(gl.L(14.0f), rect.top), (rect.right + L3) - gl.L(7.0f), Math.max(gl.L(14.0f), rect.bottom)), this.B, arrayList.size(), i);
            this.e.add(lh9Var);
            if (i == 0) {
                this.f.add(lh9Var);
            }
            arrayList.add(lh9Var);
            return lh9Var;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            boolean z16 = w01.a;
            return null;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        tg9 tg9Var = new tg9(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i27 & (-17)));
        arrayList.add(tg9Var);
        for (int i37 = 0; i37 < pageblockdetails.blocks.size(); i37++) {
            j(pageblockdetails.blocks.get(i37), i + 1, rect, i27, N(i37, pageblockdetails.blocks));
        }
        arrayList.add(new ug9(this, new Rect(rect.left, 0, rect.right, 0), i9));
        for (int size8 = arrayList.size(); size8 < arrayList.size(); size8++) {
            mg9 mg9Var5 = (mg9) arrayList.get(size8);
            if (mg9Var5.M == null) {
                mg9Var5.M = tg9Var;
            }
        }
        return tg9Var;
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i) {
        if (pageCaption != null) {
            TL_iv.RichText richText = pageCaption.text;
            boolean z = false;
            boolean z2 = (richText == null || (richText instanceof TL_iv.textEmpty)) ? false : true;
            TL_iv.RichText richText2 = pageCaption.credit;
            if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
                z = true;
            }
            if (z2 || z) {
                int Q = Q(i, 10);
                this.g.add(new rg9(this, rect, this.B, z2 ? l(pageCaption.text, Q) : null, z ? l(pageCaption.credit, Q) : null));
            }
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i, new oh9(this, i, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new kg9(richText, i), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i) {
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j = yi9.j(textdiff.text);
                    boolean j2 = yi9.j(textdiff.old_text);
                    if (!j) {
                        TL_iv.RichText richText2 = textdiff.text;
                        if (j2) {
                            n(richText2, spannableStringBuilder, i, new wib(y(TLObject.FLAG_12), 0));
                        } else {
                            n(richText2, spannableStringBuilder, i, new ama());
                        }
                    } else if (!j2) {
                        n(textdiff.old_text, spannableStringBuilder, i, new wib(y(TLObject.FLAG_13), 0));
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i2 = i | 16;
                    n(richText.text, spannableStringBuilder, i2, new oh9(this, i2, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i3 = i | 32;
                    n(richText.text, spannableStringBuilder, i3, new oh9(this, i3, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i4 = i | 64;
                    n(richText.text, spannableStringBuilder, i4, new oh9(this, i4, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i5 = i | 128;
                    n(richText.text, spannableStringBuilder, i5, new oh9(this, i5, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i6 = i | 256;
                    n(richText.text, spannableStringBuilder, i6, new oh9(this, i6, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i, new i4c(((TL_iv.textUrl) richText).url, y(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    n(richText.text, spannableStringBuilder, i, new i4c("mailto:" + ((TL_iv.textEmail) richText).email, y(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                        m(richText.texts.get(i7), spannableStringBuilder, i);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i8 = i | 2048;
                    n(richText.text, spannableStringBuilder, i8, new oh9(this, i8, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i9 = i | TLObject.FLAG_12;
                    n(richText.text, spannableStringBuilder, i9, new oh9(this, i9, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i10 = i | TLObject.FLAG_13;
                    n(richText.text, spannableStringBuilder, i10, new oh9(this, i10, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String h = p38.h(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        h = b00.h("+", h);
                    }
                    n(richText.text, spannableStringBuilder, i, new i4c(b00.h("tel:", h), y(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (textanchor.text instanceof TL_iv.textEmpty) {
                            HashMap hashMap = this.j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.g.size()));
                            }
                        } else {
                            this.k.put(lowerCase, textanchor);
                        }
                    }
                    TL_iv.RichText richText3 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText3, spannableStringBuilder, i, new i17((byte) 3));
                } else if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        lx5 a = lx5.a(textmath.source, gl.L(this.M + 4), true);
                        if (a != null) {
                            textmath.w = a.b;
                            textmath.h = a.c;
                            textmath.depth = a.d;
                            textmath.bitmap = a.a;
                        }
                    }
                    if (textmath.bitmap != null) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append(" ");
                        int length3 = spannableStringBuilder.length();
                        spannableStringBuilder.setSpan(new qhb(null, textmath.bitmap, textmath.w, textmath.h, bkb.v0(bkb.F6, this.D), textmath.depth), length2, length3, 33);
                        String str3 = textmath.source;
                        if (str3 != null && !str3.isEmpty()) {
                            spannableStringBuilder.setSpan(new kib(textmath.source), length2, length3, 33);
                        }
                    }
                } else if (richText instanceof TL_iv.textCustomEmoji) {
                    TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                    CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append(charSequence);
                    int length5 = spannableStringBuilder.length();
                    boolean a2 = fod.a(i, 13);
                    int i11 = i & 15;
                    if (i11 < 1 || i11 > 6) {
                        size = new gm(textcustomemoji.document_id, a2 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(gl.L(this.M + 4 + (a2 ? -2 : 4)));
                    } else {
                        TextPaint textPaint = new TextPaint(this.w);
                        new oh9(this, i, true).a(textPaint);
                        size = new gm(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                    }
                    spannableStringBuilder.setSpan(size, length4, length5, 33);
                } else if (richText instanceof TL_iv.textSpoiler) {
                    n(richText.text, spannableStringBuilder, i, new wib(y(256), 0));
                } else if (richText instanceof TL_iv.textMention) {
                    TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                    vib vibVar = new vib();
                    vibVar.d = tL_messageEntityMention;
                    n(richText.text, spannableStringBuilder, i, new g4c(w(richText), vibVar));
                } else if (richText instanceof TL_iv.textHashtag) {
                    TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                    vib vibVar2 = new vib();
                    vibVar2.d = tL_messageEntityHashtag;
                    n(richText.text, spannableStringBuilder, i, new g4c(w(richText), vibVar2));
                } else if (richText instanceof TL_iv.textBotCommand) {
                    n(richText.text, spannableStringBuilder, i, new d4c(w(richText), D() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textCashtag) {
                    TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                    vib vibVar3 = new vib();
                    vibVar3.d = tL_messageEntityCashtag;
                    n(richText.text, spannableStringBuilder, i, new g4c(w(richText), vibVar3));
                } else if (richText instanceof TL_iv.textAutoUrl) {
                    n(richText.text, spannableStringBuilder, i, new i4c(w(richText), y(1024)));
                } else if (richText instanceof TL_iv.textAutoEmail) {
                    n(richText.text, spannableStringBuilder, i, new i4c("mailto:".concat(w(richText)), y(1024)));
                } else if (richText instanceof TL_iv.textAutoPhone) {
                    String w = w(richText);
                    String h2 = p38.h(w, false);
                    if (w.startsWith("+")) {
                        h2 = b00.h("+", h2);
                    }
                    n(richText.text, spannableStringBuilder, i, new i4c(b00.h("tel:", h2), y(1024)));
                } else if (richText instanceof TL_iv.textTonAddress) {
                    n(richText.text, spannableStringBuilder, i, new g4c("tonaddress:".concat(w(richText)), (vib) null));
                } else if (richText instanceof TL_iv.textBankCard) {
                    n(richText.text, spannableStringBuilder, i, new g4c("card:".concat(w(richText)), (vib) null));
                } else if (richText instanceof TL_iv.textMentionName) {
                    n(richText.text, spannableStringBuilder, i, new j4c(String.valueOf(((TL_iv.textMentionName) richText).user_id), D() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textDate) {
                    TL_iv.textDate textdate = (TL_iv.textDate) richText;
                    TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                    tL_messageEntityFormattedDate.relative = textdate.relative;
                    tL_messageEntityFormattedDate.short_time = textdate.short_time;
                    tL_messageEntityFormattedDate.long_time = textdate.long_time;
                    tL_messageEntityFormattedDate.short_date = textdate.short_date;
                    tL_messageEntityFormattedDate.long_date = textdate.long_date;
                    tL_messageEntityFormattedDate.day_of_week = textdate.day_of_week;
                    tL_messageEntityFormattedDate.date = textdate.date;
                    int i12 = i | 512;
                    TL_iv.RichText richText4 = richText.text;
                    oh9 oh9Var = new oh9(this, i12, false);
                    im4 im4Var = new im4(w(richText), null, tL_messageEntityFormattedDate);
                    int length6 = spannableStringBuilder.length();
                    m(richText4, spannableStringBuilder, i12);
                    if (spannableStringBuilder.length() > length6) {
                        T(oh9Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                        T(im4Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                    }
                } else if (richText instanceof TL_iv.textButton) {
                    int length7 = spannableStringBuilder.length();
                    spannableStringBuilder.append("*");
                    qg9 qg9Var = new qg9(this, this.B, (TL_iv.textButton) richText, null);
                    qg9Var.d = 1.2f;
                    spannableStringBuilder.setSpan(qg9Var, length7, spannableStringBuilder.length(), 33);
                }
            }
        }
        IdentityHashMap identityHashMap = this.Y;
        if (identityHashMap == null || richText == null) {
            return;
        }
        identityHashMap.put(richText, new int[]{length, spannableStringBuilder.length()});
    }

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i);
        if (spannableStringBuilder.length() > length) {
            T(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            ((mg9) arrayList.get(i)).p(arrayList2);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((jg7) arrayList2.get(i2)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i, nb2 nb2Var) {
        ArrayList arrayList = this.g;
        if (i >= 0 && i < arrayList.size() && nb2Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, nb2Var.L1));
            mg9 mg9Var = (mg9) arrayList.get(i);
            return Math.round(gl.R1(mg9Var.P, mg9Var.N, max));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mg9 mg9Var2 = (mg9) arrayList.get(i3);
            boolean S = mg9Var2.S();
            if (i3 == i) {
                return i2;
            }
            if (S) {
                i2 = ((nb2Var == null || !(this.s || this.u)) ? mg9Var2.I() : gl.U1(Math.max(0.0f, Math.min(1.0f, nb2Var.L1)), mg9Var2.Q, mg9Var2.O)) + i2;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Document document = arrayList.get(i);
            i++;
            TLRPC.Document document2 = document;
            if (document2.id == j) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        if (!this.d || this.A <= gl.L(900.0f)) {
            return this.A + (this.d ? gl.L(50.0f) : 0);
        }
        return gl.L(950.0f);
    }

    public final TLRPC.Photo u(long j) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Photo photo = arrayList.get(i);
            i++;
            TLRPC.Photo photo2 = photo;
            if (photo2.id == j) {
                return photo2;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String v(int i, int i2) {
        int min;
        int max;
        int i3;
        mg9 mg9Var;
        int i4;
        String str;
        rh9 rh9Var = this;
        ArrayList arrayList = rh9Var.n;
        if (arrayList.isEmpty() || (max = Math.max(i, i2)) <= (min = Math.min(i, i2))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        int i6 = -1;
        while (i5 < arrayList.size()) {
            Layout a = ((pib) arrayList.get(i5)).a();
            if (a != null && a.getText() != null) {
                CharSequence text = a.getText();
                ArrayList arrayList4 = rh9Var.o;
                int intValue = i5 < arrayList4.size() ? ((Integer) arrayList4.get(i5)).intValue() : 0;
                int length = text.length() + intValue;
                int max2 = Math.max(min, intValue);
                int min2 = Math.min(max, length);
                if (min2 > max2) {
                    ArrayList arrayList5 = rh9Var.p;
                    int intValue2 = i5 < arrayList5.size() ? ((Integer) arrayList5.get(i5)).intValue() : -1;
                    if (intValue2 >= 0) {
                        ArrayList arrayList6 = rh9Var.g;
                        if (intValue2 < arrayList6.size()) {
                            mg9Var = (mg9) arrayList6.get(intValue2);
                            String str2 = "";
                            if (mg9Var instanceof gh9) {
                                ArrayList O = rh9Var.O(intValue2);
                                if (arrayList2.size() != O.size()) {
                                    i3 = min;
                                } else {
                                    int i7 = 0;
                                    while (i7 < arrayList2.size()) {
                                        i3 = min;
                                        if (arrayList2.get(i7) == O.get(i7)) {
                                            i7++;
                                            min = i3;
                                        }
                                    }
                                    i3 = min;
                                    int i8 = max2 - intValue;
                                    int i9 = min2 - intValue;
                                    int i10 = !(mg9Var instanceof hh9) ? ((hh9) mg9Var).c0 : -1;
                                    boolean z = !(mg9Var instanceof jh9) && ((jh9) mg9Var).Y == arrayList.get(i5);
                                    i4 = mg9Var == null ? mg9Var.w : 0;
                                    if (i4 > 0 || i10 >= 0) {
                                        d(sb, arrayList3);
                                        if (!(mg9Var instanceof bh9)) {
                                            SpannableStringBuilder Z = Z(text.subSequence(i8, i9));
                                            String str3 = ((bh9) mg9Var).q0;
                                            StringBuilder sb2 = new StringBuilder();
                                            ff9.g(sb2, Z);
                                            String sb3 = sb2.toString();
                                            if (!sb3.isEmpty()) {
                                                StringBuilder sb4 = new StringBuilder();
                                                if (TextUtils.isEmpty(str3)) {
                                                    sb4.append("<pre>");
                                                } else {
                                                    sb4.append("<pre language=\"");
                                                    sb4.append(ff9.s(str3));
                                                    sb4.append("\">");
                                                }
                                                str2 = b00.j(sb4, sb3, "</pre>");
                                            }
                                            sb.append(str2);
                                        } else if (z) {
                                            a(sb, text, i8, i9, true);
                                        } else if (i10 < 0) {
                                            a(sb, text, i8, i9, false);
                                        } else {
                                            a(sb, text, i8, Math.min(i9, i10 > 0 ? i10 - 1 : 0), false);
                                            a(sb, text, Math.max(i8, i10), i9, true);
                                        }
                                    } else {
                                        boolean z2 = mg9Var.x;
                                        while (true) {
                                            str = "</ul>";
                                            if (arrayList3.size() <= i4) {
                                                break;
                                            }
                                            if (((Boolean) tb4.l(1, arrayList3)).booleanValue()) {
                                                str = "</ol>";
                                            }
                                            sb.append(str);
                                        }
                                        while (arrayList3.size() < i4) {
                                            sb.append(z2 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z2));
                                        }
                                        if (!arrayList3.isEmpty() && ((Boolean) b00.f(1, arrayList3)).booleanValue() != z2) {
                                            sb.append(((Boolean) tb4.l(1, arrayList3)).booleanValue() ? "</ol>" : "</ul>");
                                            sb.append(z2 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z2));
                                        }
                                        sb.append("<li");
                                        if (mg9Var.y) {
                                            sb.append(" data-checkbox=\"1\"");
                                            if (mg9Var.E) {
                                                sb.append(" data-checked=\"1\"");
                                            }
                                        }
                                        sb.append('>');
                                        SpannableStringBuilder Z2 = Z(text.subSequence(i8, i9));
                                        StringBuilder sb5 = new StringBuilder();
                                        ff9.g(sb5, Z2);
                                        sb.append(sb5.toString());
                                        sb.append("</li>");
                                    }
                                }
                                d(sb, arrayList3);
                                Y(sb, arrayList2, O);
                                int i82 = max2 - intValue;
                                int i92 = min2 - intValue;
                                if (!(mg9Var instanceof hh9)) {
                                }
                                if (mg9Var instanceof jh9) {
                                }
                                if (mg9Var == null) {
                                }
                                if (i4 > 0) {
                                }
                                d(sb, arrayList3);
                                if (!(mg9Var instanceof bh9)) {
                                }
                            } else if (intValue2 != i6) {
                                d(sb, arrayList3);
                                Y(sb, arrayList2, rh9Var.O(intValue2));
                                TL_iv.pageBlockTable pageblocktable = ((gh9) mg9Var).X;
                                if (pageblocktable != null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    ff9.H(sb6, pageblocktable);
                                    str2 = sb6.toString();
                                }
                                sb.append(str2);
                                i3 = min;
                                i6 = intValue2;
                            }
                            i5++;
                            rh9Var = this;
                            min = i3;
                        }
                    }
                    mg9Var = null;
                    String str22 = "";
                    if (mg9Var instanceof gh9) {
                    }
                    i5++;
                    rh9Var = this;
                    min = i3;
                }
            }
            i3 = min;
            i5++;
            rh9Var = this;
            min = i3;
        }
        d(sb, arrayList3);
        while (!arrayList2.isEmpty()) {
            sb.append("</blockquote>");
            arrayList2.remove(arrayList2.size() - 1);
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public rh9(k27 k27Var, int i, rh9 rh9Var) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = "";
        this.t = 1.0f;
        this.w = new TextPaint(1);
        this.x = new TextPaint(1);
        this.y = new n79(null);
        this.z = new xl3((byte) 7);
        this.K = new RectF();
        this.b = k27Var;
        this.B = i;
        this.a = k27Var.K1;
        I(rh9Var);
    }
}
