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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uj9 {
    public int A;
    public final int B;
    public int C;
    public ylb D;
    public rc2 E;
    public mc2 F;
    public u51 G;
    public Paint H;
    public uib I;
    public qa6 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public uj9 P;
    public View Q;
    public qna R;
    public int S;
    public int T;
    public ln U;
    public float V;
    public qi9 W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final k47 b;
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
    public oi7 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final p99 y;
    public final in3 z;

    public uj9(int i, int i2, ylb ylbVar) {
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
        this.y = new p99(null);
        this.z = new in3((byte) 7);
        this.K = new RectF();
        this.b = null;
        this.a = i;
        this.B = i2;
        this.D = ylbVar;
        this.M = gda.S0;
        this.N = gm.p;
        textPaint.setTextSize(gm.L(r6));
        textPaint2.setTextSize(gm.L(this.M));
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
            return endsWith ? str : td4.p(str, ".");
        }
        if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return hg9.k(new StringBuilder(), pageListOrderedItem.value, ".");
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
            arrayList.add((ni9) arrayList2.get(arrayList.size()));
        }
    }

    public static SpannableStringBuilder Z(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (rj9 rj9Var : (rj9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), rj9.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(rj9Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(rj9Var);
            if (spanEnd > spanStart) {
                int i = rj9Var.b;
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
                    wkb wkbVar = new wkb();
                    wkbVar.a = i2;
                    spannableStringBuilder.setSpan(new xkb(wkbVar, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void a(StringBuilder sb, CharSequence charSequence, int i, int i2, boolean z) {
        if (i2 > i) {
            SpannableStringBuilder Z = Z(charSequence.subSequence(i, i2));
            StringBuilder sb2 = new StringBuilder();
            jh9.g(sb2, Z);
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
            sb.append(((Boolean) td4.m(1, arrayList)).booleanValue() ? "</ol>" : "</ul>");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0530, code lost:
    
        if (r12[r5] > r12[r14]) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c47[] e(float[] fArr) {
        c47 c47Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int length = fArr.length;
        c47[] c47VarArr = new c47[length];
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
                c47 c47Var2 = new c47();
                c47VarArr[i7] = c47Var2;
                c47Var2.g = f4;
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
            int L = gm.L(120.0f);
            float L2 = gm.L(120.0f);
            Point point = gm.q;
            int min = (int) (L2 / (Math.min(point.x, point.y) / 1000.0f));
            int L3 = (int) (gm.L(40.0f) / (Math.min(point.x, point.y) / 1000.0f));
            float f6 = 814.0f;
            float L4 = gm.L(100.0f) / 814.0f;
            if (length == 1) {
                c47VarArr[0].a(Math.round(Math.min(1000.0f / r0.g, 407.0f)) / 814.0f, 0, 0, 0, 0, 1000, 15);
                return c47VarArr;
            }
            int i8 = 2;
            int i9 = 1;
            int i10 = 3;
            if (!z && (length == 2 || length == 3 || length == 4)) {
                if (length == 2) {
                    c47 c47Var3 = c47VarArr[0];
                    c47 c47Var4 = c47VarArr[1];
                    String sb2 = sb.toString();
                    if (sb2.equals("ww") && f5 > 1.7199017f) {
                        if (c47Var3.g - c47Var4.g < 0.2f) {
                            float round = Math.round(Math.min(1000.0f / r7, Math.min(1000.0f / r11, 407.0f))) / 814.0f;
                            c47Var3.a(round, 0, 0, 0, 0, 1000, 7);
                            c47Var4.a(round, 0, 0, 1, 1, 1000, 11);
                            return c47VarArr;
                        }
                    }
                    if (sb2.equals("ww") || sb2.equals("qq")) {
                        float round2 = Math.round(Math.min(500.0f / c47Var3.g, Math.min(500.0f / c47Var4.g, 814.0f))) / 814.0f;
                        c47Var3.a(round2, 0, 0, 0, 0, 500, 13);
                        c47Var4.a(round2, 1, 1, 0, 0, 500, 14);
                        return c47VarArr;
                    }
                    float f7 = c47Var3.g;
                    int max = (int) Math.max(400.0f, Math.round((1000.0f / f7) / ((1.0f / c47Var4.g) + (1.0f / f7))));
                    int i11 = 1000 - max;
                    if (i11 < min) {
                        max -= min - i11;
                    } else {
                        min = i11;
                    }
                    float min2 = Math.min(814.0f, Math.round(Math.min(min / c47Var3.g, max / c47Var4.g))) / 814.0f;
                    c47Var3.a(min2, 0, 0, 0, 0, min, 13);
                    c47Var4.a(min2, 1, 1, 0, 0, max, 14);
                    return c47VarArr;
                }
                if (length == 3) {
                    c47 c47Var5 = c47VarArr[0];
                    c47 c47Var6 = c47VarArr[1];
                    c47 c47Var7 = c47VarArr[2];
                    if (sb.charAt(0) != 'n') {
                        float round3 = Math.round(Math.min(1000.0f / c47Var5.g, 537.24005f)) / 814.0f;
                        c47Var5.a(round3, 0, 1, 0, 0, 1000, 7);
                        float min3 = Math.min(814.0f - round3, Math.round(Math.min(500.0f / c47Var6.g, 500.0f / c47Var7.g))) / 814.0f;
                        float f8 = min3 < L4 ? L4 : min3;
                        c47Var6.a(f8, 0, 0, 1, 1, 500, 9);
                        c47Var7.a(f8, 1, 1, 1, 1, 500, 10);
                        return c47VarArr;
                    }
                    float f9 = c47Var6.g;
                    float min4 = Math.min(407.0f, Math.round((f9 * 1000.0f) / (c47Var7.g + f9)));
                    int max2 = (int) Math.max(min, Math.min(500.0f, Math.round(Math.min(c47Var7.g * min4, c47Var6.g * r4))));
                    c47Var5.a(1.0f, 0, 0, 0, 1, Math.round(Math.min((c47Var5.g * 814.0f) + L3, 1000 - max2)), 13);
                    c47Var6.a((814.0f - min4) / 814.0f, 1, 1, 0, 0, max2, 6);
                    c47Var7.a(min4 / 814.0f, 1, 1, 1, 1, max2, 10);
                    return c47VarArr;
                }
                c47 c47Var8 = c47VarArr[0];
                c47 c47Var9 = c47VarArr[1];
                c47 c47Var10 = c47VarArr[2];
                c47 c47Var11 = c47VarArr[3];
                if (sb.charAt(0) != 'w') {
                    int max3 = Math.max(min, Math.round(814.0f / ((1.0f / c47Var11.g) + ((1.0f / c47Var10.g) + (1.0f / c47Var9.g)))));
                    float f10 = L;
                    float f11 = max3;
                    float min5 = Math.min(0.33f, Math.max(f10, f11 / c47Var9.g) / 814.0f);
                    float min6 = Math.min(0.33f, Math.max(f10, f11 / c47Var10.g) / 814.0f);
                    float f12 = (1.0f - min5) - min6;
                    c47Var8.a(min5 + min6 + f12, 0, 0, 0, 2, Math.round(Math.min((c47Var8.g * 814.0f) + L3, 1000 - max3)), 13);
                    c47Var9.a(min5, 1, 1, 0, 0, max3, 6);
                    c47Var10.a(min6, 1, 1, 1, 1, max3, 2);
                    c47Var11.a(f12, 1, 1, 2, 2, max3, 10);
                    return c47VarArr;
                }
                float round4 = Math.round(Math.min(1000.0f / c47Var8.g, 537.24005f)) / 814.0f;
                c47Var8.a(round4, 0, 2, 0, 0, 1000, 7);
                float round5 = Math.round(1000.0f / ((c47Var9.g + c47Var10.g) + c47Var11.g));
                float f13 = min;
                int max4 = (int) Math.max(f13, Math.min(400.0f, c47Var9.g * round5));
                int max5 = (int) Math.max(Math.max(f13, 330.0f), c47Var11.g * round5);
                int i12 = (1000 - max4) - max5;
                if (i12 < gm.L(58.0f)) {
                    int L5 = gm.L(58.0f) - i12;
                    i12 = gm.L(58.0f);
                    int i13 = L5 / 2;
                    max4 -= i13;
                    max5 -= L5 - i13;
                }
                int i14 = max4;
                float min7 = Math.min(814.0f - round4, round5) / 814.0f;
                float f14 = min7 < L4 ? L4 : min7;
                c47Var9.a(f14, 0, 0, 1, 1, i14, 9);
                c47Var10.a(f14, 1, 1, 1, 1, i12, 8);
                c47Var11.a(f14, 2, 2, 1, 1, max5, 10);
                return c47VarArr;
            }
            float[] fArr2 = new float[length];
            for (int i15 = 0; i15 < length; i15++) {
                float f15 = c47VarArr[i15].g;
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
                    c47VarArr[i40].a(0.4f, 0, 0, i41, i40, 1000, 3);
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
                    c47 c47Var12 = null;
                    int i45 = i42;
                    int i46 = i32;
                    int i47 = 1000;
                    while (i46 < i44) {
                        int i48 = (int) (fArr2[i45] * f21);
                        int i49 = i47 - i48;
                        c47 c47Var13 = c47VarArr[i45];
                        int i50 = i43 == 0 ? 4 : i32;
                        if (i43 == iArr2.length - 1) {
                            i50 |= 8;
                        }
                        if (i46 == 0) {
                            i50 |= 1;
                        }
                        if (i46 == i44 - 1) {
                            i50 |= 2;
                            c47Var = c47Var13;
                        } else {
                            c47Var = c47Var12;
                        }
                        c47Var13.a(Math.max(L4, f21 / f16), i46, i46, i43, i43, i48, i50);
                        i45++;
                        i46++;
                        i47 = i49;
                        c47Var12 = c47Var;
                    }
                    if (c47Var12 != null) {
                        c47Var12.e += i47;
                        c47Var12.i += i47;
                    }
                    i43++;
                    i42 = i45;
                }
            }
        }
        return c47VarArr;
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
            if (!zk9.j(textdiff.text)) {
                x(textdiff.text, sb);
                return;
            } else {
                if (zk9.j(textdiff.old_text)) {
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

    public static wkb y(int i) {
        wkb wkbVar = new wkb();
        wkbVar.a = i;
        return wkbVar;
    }

    public static boolean z(TLRPC.PeerColor peerColor) {
        return (peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0);
    }

    public final boolean A() {
        rc2 rc2Var = this.E;
        return rc2Var != null && rc2Var.gb > 0;
    }

    public final boolean B() {
        cn cnVar;
        if (E()) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i >= arrayList.size()) {
                    break;
                }
                qkb qkbVar = (qkb) arrayList.get(i);
                if ((qkbVar instanceof tj9) && (cnVar = ((tj9) qkbVar).F) != null && !cnVar.a.isEmpty()) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean C() {
        k47 k47Var = this.b;
        return (k47Var == null || !k47Var.P2() || k47Var.O3()) ? false : true;
    }

    public final boolean D() {
        k47 k47Var = this.b;
        return k47Var != null && k47Var.O3();
    }

    public final boolean E() {
        oi7 oi7Var = this.r;
        return oi7Var == null || !oi7Var.h;
    }

    public final boolean F() {
        rc2 rc2Var = this.E;
        return rc2Var != null && rc2Var.L2();
    }

    public final boolean G() {
        qkb[] K;
        qi9 qi9Var = this.W;
        if (qi9Var != null && (K = qi9Var.K()) != null) {
            for (qkb qkbVar : K) {
                if (qkbVar instanceof tj9) {
                    tj9 tj9Var = (tj9) qkbVar;
                    if (tj9Var.N != null || tj9Var.R != null) {
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

    public final void I(uj9 uj9Var) {
        boolean z;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.g;
        if (view != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                qi9 qi9Var = (qi9) arrayList.get(i);
                View view2 = qi9Var.W;
                if (view2 != null && view2 == view) {
                    qi9Var.U();
                    CheckBoxBase checkBoxBase = qi9Var.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    qi9Var.W = null;
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
        this.M = gda.S0;
        this.N = gm.p;
        this.w.setTextSize(gm.L(gda.S0));
        this.x.setTextSize(gm.L(gda.S0));
        this.d = false;
        this.c = null;
        k47 k47Var = this.b;
        if (k47Var == null || k47Var.k == null || k47Var.E0() == null) {
            return;
        }
        TL_iv.RichMessage E0 = k47Var.E0();
        this.c = E0;
        this.d = E0.part;
        this.P = uj9Var;
        int i2 = 0;
        while (i2 < this.c.blocks.size()) {
            TL_iv.PageBlock pageBlock = this.c.blocks.get(i2);
            uj9 uj9Var2 = this;
            qi9 j = uj9Var2.j(pageBlock, 0, new Rect(), 0, N(i2, this.c.blocks));
            if ((j instanceof kj9) && (((z = pageBlock instanceof TL_iv.pageBlockParagraph)) || o.H(pageBlock))) {
                kj9 kj9Var = (kj9) j;
                kj9Var.i0((i2 == 0 && z) ? 0 : kj9Var.a0, i2 == uj9Var2.c.blocks.size() - 1 ? 0 : kj9Var.b0);
            }
            i2++;
            this = uj9Var2;
        }
        uj9 uj9Var3 = this;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            qi9 qi9Var2 = (qi9) arrayList.get(i3);
            if ((qi9Var2 instanceof kj9) && qi9Var2.w > 0) {
                int i4 = i3 + 1;
                ((kj9) qi9Var2).i0(gm.L(i3 > 0 && ((qi9) arrayList.get(i3 + (-1))).w > 0 ? 3.0f : 6.0f), gm.L(i4 < arrayList.size() && ((qi9) arrayList.get(i4)).w > 0 ? 3.0f : 6.0f));
            }
            i3++;
        }
        uj9Var3.P = null;
        if (uj9Var3.r != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((qi9) arrayList.get(i5)).L = uj9Var3.r;
            }
            uj9Var3.r.k(uj9Var3.p());
        }
        if (view != null) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                ((qi9) arrayList.get(i6)).m(view);
            }
        }
        uj9Var3.P();
        uj9Var3.W();
    }

    public final boolean K(TL_iv.RichMessage richMessage, int i) {
        return (this.c == richMessage && this.M == gda.S0 && Math.abs(this.N - gm.p) <= 0.1f && i == this.B) ? false : true;
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
        if (X && (arrayList.get(0) instanceof al9)) {
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
                                u51 u51Var = this.G;
                                if (u51Var != null) {
                                    u51Var.c(true);
                                    return true;
                                }
                                return true;
                            }
                        } else if (this.L) {
                            if (actionMasked == 2) {
                                if (!rectF.contains(x, y)) {
                                    u51 u51Var2 = this.G;
                                    if (u51Var2 != null) {
                                        u51Var2.c(false);
                                    }
                                    this.L = false;
                                    return true;
                                }
                            } else if (actionMasked == 1 || actionMasked == 3) {
                                u51 u51Var3 = this.G;
                                if (u51Var3 != null) {
                                    u51Var3.c(false);
                                }
                                boolean z = actionMasked == 1 && rectF.contains(x, y);
                                this.L = false;
                                if (z && this.F != null && this.E != null) {
                                    View view = this.Q;
                                    if (view != null) {
                                        view.performHapticFeedback(3, 2);
                                    }
                                    this.F.A(this.E);
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
                            qi9 qi9Var = (qi9) arrayList.get(i2);
                            if (qi9Var.R()) {
                                int H = qi9Var.H();
                                float f2 = i3;
                                if (y2 < f2 || y2 >= i3 + H) {
                                    i3 += H;
                                } else {
                                    motionEvent.offsetLocation(0.0f, -i3);
                                    boolean e0 = qi9Var.e0(motionEvent);
                                    motionEvent.offsetLocation(0.0f, f2);
                                    if (e0) {
                                        this.W = qi9Var;
                                        this.X = i3;
                                        return true;
                                    }
                                }
                            }
                            i2++;
                        }
                    } else if (this.W != null) {
                        motionEvent.offsetLocation(0.0f, -this.X);
                        boolean e02 = this.W.e0(motionEvent);
                        motionEvent.offsetLocation(0.0f, this.X);
                        if (actionMasked != 1 && actionMasked != 3) {
                            return e02;
                        }
                        this.W = null;
                        return e02;
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
                ni9 ni9Var = (ni9) obj;
                if (i >= ni9Var.a && i <= ni9Var.b) {
                    arrayList.add(ni9Var);
                }
            }
            Collections.sort(arrayList, new qx7((byte) 13));
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
            this.C = Math.max(this.C, ((qi9) arrayList.get(i)).J());
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            qi9 qi9Var = (qi9) arrayList.get(i2);
            if (qi9Var instanceof jj9) {
                jj9 jj9Var = (jj9) qi9Var;
                int i3 = this.C;
                int i4 = jj9Var.f0;
                int i5 = jj9Var.e0;
                Rect rect = jj9Var.b;
                int max = Math.max(i4, Math.min(i5, Math.max(0, (i3 - rect.left) - rect.right)));
                jj9Var.g0 = max;
                ehb ehbVar = jj9Var.Y;
                ehbVar.setRenderWidth(max);
                jj9Var.h0 = ehbVar.getRenderHeight();
            }
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            qi9 qi9Var2 = (qi9) arrayList.get(i7);
            boolean R = qi9Var2.R();
            qi9Var2.N = i6;
            qi9Var2.O = 0;
            qi9Var2.R = R;
            Rect rect2 = qi9Var2.b;
            qi9Var2.Y(rect2.left, rect2.top + i6, i7);
            if (R) {
                qkb[] K = qi9Var2.K();
                if (K != null) {
                    for (qkb qkbVar : K) {
                        if (qkbVar != null && qkbVar.a() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb.length()));
                            arrayList4.add(Integer.valueOf(i7));
                            arrayList2.add(qkbVar);
                            CharSequence text = qkbVar.a().getText();
                            if (text != null) {
                                sb.append(text);
                            }
                        }
                    }
                }
                int H = qi9Var2.H();
                qi9Var2.O = H;
                i6 += H;
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
            qi9 qi9Var = (qi9) arrayList.get(i3);
            if (qi9Var instanceof wi9) {
                wi9 wi9Var = (wi9) qi9Var;
                tj9 tj9Var = wi9Var.Y;
                tj9Var.c = (gm.L(53.0f) + (wi9Var.T - wi9Var.a.S)) - tj9Var.f;
            }
            i3++;
        }
    }

    public final void S(rc2 rc2Var, mc2 mc2Var) {
        this.E = rc2Var;
        this.F = mc2Var;
    }

    public final void T(CharacterStyle characterStyle, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (!(characterStyle instanceof rj9)) {
            spannableStringBuilder.setSpan(characterStyle, i, i2, 33);
            return;
        }
        int i3 = ((rj9) characterStyle).b;
        rj9[] rj9VarArr = (rj9[]) spannableStringBuilder.getSpans(i, i2, rj9.class);
        if (rj9VarArr == null || rj9VarArr.length <= 0) {
            U(spannableStringBuilder, i, i2, i3);
            return;
        }
        Arrays.sort(rj9VarArr, Comparator$-CC.comparingInt(new xm1(spannableStringBuilder, (byte) 2)));
        for (int i4 = 0; i4 < rj9VarArr.length; i4++) {
            int spanStart = spannableStringBuilder.getSpanStart(rj9VarArr[i4]);
            int spanEnd = spannableStringBuilder.getSpanEnd(rj9VarArr[i4]);
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
            spannableStringBuilder.setSpan(new rj9(this, i3, ((URLSpan[]) spannableStringBuilder.getSpans(i, nextSpanTransition, URLSpan.class)).length > 0), i, nextSpanTransition, 33);
            i = nextSpanTransition;
        }
    }

    public final void V(oi7 oi7Var) {
        this.r = oi7Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return;
            }
            ((qi9) arrayList.get(i)).L = oi7Var;
            arrayList.get(i);
            ((qi9) arrayList.get(i)).getClass();
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
            ((qi9) arrayList.get(i)).c0();
            i++;
        }
    }

    public final boolean X() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return false;
        }
        qi9 qi9Var = (qi9) arrayList.get(0);
        return (qi9Var instanceof dj9) || (qi9Var instanceof pj9) || (qi9Var instanceof vi9) || (qi9Var instanceof hj9) || (qi9Var instanceof al9);
    }

    public final void a0(int i) {
        tj9 tj9Var;
        View view;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 >= arrayList.size()) {
                return;
            }
            qkb qkbVar = (qkb) arrayList.get(i2);
            if ((qkbVar instanceof tj9) && (view = (tj9Var = (tj9) qkbVar).T) != null) {
                gn.release(view, tj9Var.F);
                tj9Var.F = null;
                tj9Var.F = gn.update(i, tj9Var.T, tj9Var.a.v && !tj9Var.w, (cn) null, tj9Var.b);
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
            ((qi9) arrayList.get(i)).m(view);
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
        k47 k47Var = this.b;
        if (k47Var == null || k47Var.O3() || k47Var.O5()) {
            return;
        }
        boolean z = true;
        if (k47Var.e1 < 0 && k47Var.g1 == null && (!k47Var.q4() || (peerColor = k47Var.Z0) == null || peerColor.color == -1)) {
            TLRPC.Message message = k47Var.k;
            int i = this.a;
            if (message != null && (messageFwdHeader = message.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                long n = pg3.n(peer);
                z = n >= 0 ? false : false;
            } else if (pg3.B(k47.B0(message)) || k47Var.p3()) {
                if (user != null) {
                }
            } else {
                if (k47Var.n3() && chat != null) {
                    if (chat.signature_profiles) {
                        long Z0 = k47Var.Z0();
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
        ylb ylbVar = this.D;
        this.y.p(cmb.v0(cmb.Ei, this.D), ylbVar != null ? ylbVar.a() : cmb.I.o());
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 != view || view2 == null) {
            return;
        }
        qna qnaVar = this.R;
        if (qnaVar != null) {
            qnaVar.b(view);
            this.R = null;
        }
        this.Q = null;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                break;
            }
            qi9 qi9Var = (qi9) arrayList.get(i);
            View view3 = qi9Var.W;
            if (view3 != null && view3 == view) {
                qi9Var.U();
                CheckBoxBase checkBoxBase = qi9Var.r;
                if (checkBoxBase != null) {
                    checkBoxBase.l = false;
                }
                qi9Var.W = null;
            }
            i++;
        }
        if (view == this.E) {
            this.E = null;
            this.F = null;
        }
    }

    public final void g(Canvas canvas, int i, int i2, yc2 yc2Var) {
        float f;
        float f2;
        uj9 uj9Var;
        yc2 yc2Var2;
        mc2 mc2Var;
        R(i, i2);
        this.w.linkColor = cmb.v0(D() ? cmb.Xc : cmb.Wc, this.D);
        boolean z = this.d;
        int min = Math.min(this.A, gm.L(900.0f));
        if (z) {
            canvas.saveLayerAlpha(-i, 0.0f, this.C + i2, min, nm7.d4, 31);
        }
        rc2 rc2Var = this.E;
        boolean z2 = rc2Var != null && rc2Var.Ec > 0;
        if (z2) {
            float f3 = rc2Var.Cc - rc2Var.u0;
            f2 = rc2Var.Ec + f3;
            f = f3;
            yc2Var2 = yc2Var;
            uj9Var = this;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            uj9Var = this;
            yc2Var2 = yc2Var;
        }
        uj9Var.h(canvas, yc2Var2, z2, f, f2);
        if (z) {
            RectF rectF = gm.P;
            rectF.set(-i, min - gm.L(32.0f), this.C + i2, min);
            this.z.r(canvas, rectF, 3, 1.0f);
            canvas.restore();
            int v0 = cmb.v0(D() ? cmb.Nb : cmb.Ad, this.D);
            if (this.I == null) {
                this.I = new uib(jb6.M0(2131745073, null), 16.0f, gm.o());
            }
            u51 u51Var = this.G;
            if (u51Var == null) {
                this.G = new u51(this.Q, 1.5f, 2.0f);
            } else {
                View view = u51Var.a;
                View view2 = this.Q;
                if (view != view2) {
                    u51Var.a = view2;
                }
            }
            Paint paint = this.H;
            if (paint == null) {
                paint = new Paint(1);
                this.H = paint;
            }
            paint.setColor(cmb.p1(0.1f, v0));
            float L = gm.L(42.0f);
            float f4 = this.I.c;
            float L2 = ((this.C + this.S) + this.T) - gm.L(24.0f);
            int i3 = this.C;
            float f5 = (((i3 + r13) + this.T) / 2.0f) - this.S;
            float L3 = gm.L(4.0f) + min;
            float f6 = L2 / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f5 - f6, L3, f5 + f6, L + L3);
            rc2 rc2Var2 = this.E;
            boolean z3 = (rc2Var2 == null || (mc2Var = this.F) == null || !mc2Var.n1(rc2Var2, 7)) ? false : true;
            qa6 qa6Var = this.J;
            if (qa6Var != null && !z3 && !qa6Var.c() && !this.J.d()) {
                this.J.a();
            }
            qa6 qa6Var2 = this.J;
            if (qa6Var2 == null) {
                if (z3) {
                    qa6 qa6Var3 = new qa6();
                    this.J = qa6Var3;
                    qa6Var3.x.setStrokeWidth(gm.L(1.25f));
                    this.J.D = true;
                }
            } else if (z3 && (qa6Var2.c() || this.J.d())) {
                qa6 qa6Var4 = this.J;
                qa6Var4.b = -1L;
                qa6Var4.c = -1L;
            }
            qa6 qa6Var5 = this.J;
            if (qa6Var5 != null) {
                qa6Var5.g(cmb.p1(0.1f, v0), cmb.p1(0.3f, v0), cmb.p1(0.3f, v0), cmb.p1(1.2f, v0));
            }
            float a = this.G.a(0.075f);
            boolean z4 = a != 1.0f;
            if (z4) {
                canvas.save();
                canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, gm.L(8.0f), gm.L(8.0f), this.H);
            qa6 qa6Var6 = this.J;
            if (qa6Var6 != null && !qa6Var6.c()) {
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

    public final void h(Canvas canvas, yc2 yc2Var, boolean z, float f, float f2) {
        View view;
        float f3;
        float f4;
        Canvas canvas2;
        wi9 wi9Var;
        float f5;
        int i;
        float f6;
        int H;
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
                ni9 ni9Var = (ni9) arrayList.get(i4);
                int r = r(ni9Var.a, yc2Var);
                int i6 = ni9Var.b;
                ArrayList arrayList2 = this.g;
                float f10 = 4.0f;
                if (i6 < 0 || i6 >= arrayList2.size() || yc2Var == null || !(this.s || this.u)) {
                    int i7 = i3;
                    int i8 = i7;
                    while (true) {
                        if (i7 >= arrayList2.size()) {
                            i2 = this.A;
                            break;
                        }
                        qi9 qi9Var = (qi9) arrayList2.get(i7);
                        boolean R = qi9Var.R();
                        Rect rect = qi9Var.b;
                        if (R) {
                            float f11 = f10;
                            int H2 = ((yc2Var == null || !(this.s || this.u)) ? qi9Var.H() : gm.U1(Math.max(f8, Math.min(1.0f, yc2Var.L1)), qi9Var.Q, qi9Var.O)) + i8;
                            if (i7 != i6 || rect.bottom <= gm.L(f11)) {
                                f7 = f11;
                            } else {
                                f7 = f11;
                                H2 = hg9.f(f7, rect.bottom, H2);
                            }
                            i8 = H2;
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
                    float max = Math.max(f8, Math.min(1.0f, yc2Var.L1));
                    qi9 qi9Var2 = (qi9) arrayList2.get(i6);
                    int c = b10.c(4.0f, qi9Var2.b.bottom, i3);
                    float f12 = (qi9Var2.P + qi9Var2.Q) - (qi9Var2.S ? c : i3);
                    float f13 = qi9Var2.N + qi9Var2.O;
                    if (!qi9Var2.R) {
                        c = i3;
                    }
                    i2 = Math.round(gm.R1(f12, f13 - c, max));
                }
                int i9 = ni9Var.b;
                ArrayList arrayList3 = this.g;
                float f14 = 1.0f;
                for (int i10 = ni9Var.a; i10 < Math.min(i9 + 1, arrayList3.size()); i10++) {
                    qi9 qi9Var3 = (qi9) arrayList3.get(i10);
                    if (qi9Var3.R()) {
                        f14 *= qi9Var3.y();
                    }
                }
                int L = gm.L(3.0f) * ni9Var.d;
                int i11 = ni9Var.e + L;
                int i12 = L + ni9Var.f;
                if (i2 - r > i11 + i12) {
                    r += i11;
                    i2 -= i12;
                }
                RectF rectF = gm.P;
                rectF.set(ni9Var.c, r, this.C - gm.L(ni9Var.d * 12), i2);
                canvas3.save();
                canvas3.scale(f14, f14, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(gda.U0 / 3.0f);
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
            qi9 qi9Var4 = (qi9) this.g.get(i13);
            if ((qi9Var4 instanceof fj9) && (qi9Var4.R || qi9Var4.S)) {
                fj9 fj9Var = (fj9) qi9Var4;
                int r2 = fj9Var.X.r();
                tj9 tj9Var = fj9Var.Y;
                int max2 = Math.max(r2, tj9Var != null ? tj9Var.r() : 0);
                if (max2 > 0) {
                    boolean z2 = yc2Var != null && (this.s || this.u);
                    float max3 = z2 ? Math.max(0.0f, Math.min(f9, yc2Var.L1)) : f9;
                    float R1 = z2 ? gm.R1(fj9Var.S ? f9 : 0.0f, fj9Var.R ? f9 : 0.0f, max3) : fj9Var.R ? f9 : 0.0f;
                    if (R1 > 0.0f) {
                        float f15 = ((this.C + this.T) - this.S) / 2.0f;
                        float f16 = max2 / 2.0f;
                        float L2 = (f15 - f16) - gm.L(30.0f);
                        float L3 = f15 + f16 + gm.L(30.0f);
                        if (z2) {
                            f6 = gm.R1(fj9Var.P, fj9Var.N, max3);
                            H = gm.U1(max3, fj9Var.Q, fj9Var.O);
                        } else {
                            f6 = fj9Var.N;
                            H = fj9Var.H();
                        }
                        float L4 = gm.L(8.0f) + f6;
                        float L5 = (f6 + H) - gm.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = gm.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(gda.U0 / 2.0f);
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
                            this.i.setBounds(gm.L(8.0f) + i14, gm.L(7.0f) + i15, hg9.v(8.0f, i14, intrinsicWidth), hg9.v(7.0f, i15, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i16 = (int) L3;
                            int i17 = (int) L5;
                            this.i.setBounds(kt6.y(8.0f, i16, intrinsicWidth), kt6.y(7.0f, i17, intrinsicHeight), i16 - gm.L(8.0f), i17 - gm.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            this.i.setAlpha(nm7.d4);
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
        k47 k47Var = this.b;
        boolean z3 = this.O || (k47Var != null && oc7.r1(this.a).i4.z(k47Var));
        if (z3 || this.U != null) {
            ln lnVar = this.U;
            if (lnVar == null) {
                ln lnVar2 = new ln(0L, 350L, d53.h);
                this.U = lnVar2;
                lnVar = lnVar2;
            }
            float e = lnVar.e(false, z3 ? 1.0f : 0.0f);
            this.V = e;
            if (e > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        } else {
            this.V = 0.0f;
        }
        if (yc2Var == null || !(this.s || this.u)) {
            f3 = 1.0f;
            f4 = 1.0f;
        } else {
            f3 = 1.0f;
            f4 = Math.max(0.0f, Math.min(1.0f, yc2Var.L1));
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
                qi9 qi9Var5 = (qi9) arrayList4.get(i18);
                if (qi9Var5 instanceof wi9) {
                    wi9 wi9Var2 = (wi9) qi9Var5;
                    wi9Var2.e0 = gm.R1(wi9Var2.P, wi9Var2.N, f4) + wi9Var2.H();
                    int i19 = i18 + 1;
                    while (true) {
                        if (i19 >= arrayList4.size()) {
                            f5 = Float.MAX_VALUE;
                            break;
                        }
                        qi9 qi9Var6 = (qi9) arrayList4.get(i19);
                        do {
                            qi9Var6 = qi9Var6.M;
                            if (qi9Var6 == null) {
                                f5 = gm.R1(((qi9) arrayList4.get(i19)).P, ((qi9) arrayList4.get(i19)).N, f4);
                                break;
                            }
                        } while (qi9Var6 != wi9Var2);
                        i19++;
                    }
                    wi9Var2.f0 = f5;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i20 = 0; i20 < arrayList5.size(); i20++) {
            qi9 qi9Var7 = (qi9) arrayList5.get(i20);
            if (qi9Var7 instanceof lj9) {
                lj9 lj9Var = (lj9) qi9Var7;
                lj9Var.j0 = gm.R1(lj9Var.i0 ? 1.0f : 0.0f, lj9Var.h0 ? 1.0f : 0.0f, f4);
                lj9Var.k0 = gm.U1(f4, lj9Var.Q, lj9Var.O);
            }
        }
        int i21 = 0;
        while (i21 < this.g.size()) {
            qi9 qi9Var8 = (qi9) this.g.get(i21);
            if (qi9Var8.R || qi9Var8.S) {
                float R12 = gm.R1(qi9Var8.P, qi9Var8.N, f4);
                boolean z7 = qi9Var8 instanceof xi9;
                float R13 = z7 ? 1.0f : gm.R1(qi9Var8.S ? 1.0f : 0.0f, qi9Var8.R ? 1.0f : 0.0f, f4);
                if (R13 > 0.0f) {
                    int H3 = qi9Var8.H();
                    if (!z5 || (H3 + R12 > f && R12 < f2)) {
                        canvas3.save();
                        if (z6 && (wi9Var = qi9Var8.M) != null && !z7) {
                            float f17 = -3.4028235E38f;
                            float f18 = Float.MAX_VALUE;
                            for (wi9Var = qi9Var8.M; wi9Var != null; wi9Var = wi9Var.M) {
                                f17 = Math.max(f17, wi9Var.e0);
                                f18 = Math.min(f18, wi9Var.f0);
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
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, H3, (int) (R13 * 255.0f), 31);
                            qi9Var8.s(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            qi9Var8.s(canvas2);
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
            qi9 qi9Var = (qi9) arrayList.get(i);
            if (qi9Var.R) {
                canvas.save();
                canvas.translate(0.0f, qi9Var.N);
                qi9Var.r(canvas, colorFilter);
                canvas.restore();
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [kj9, lj9] */
    public final qi9 j(TL_iv.PageBlock pageBlock, int i, Rect rect, int i2, boolean z) {
        int i3;
        TLRPC.Document s;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        gj9 gj9Var;
        int i4;
        int i5;
        int i6;
        uj9 uj9Var;
        qi9 qi9Var;
        uj9 uj9Var2 = this;
        int i7 = i2;
        int i8 = rect.left + rect.right;
        int i9 = uj9Var2.B;
        if (i8 >= i9) {
            return null;
        }
        boolean z2 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i10 = 0;
        ArrayList arrayList = uj9Var2.g;
        if (z2) {
            nj9 nj9Var = new nj9(uj9Var2, new Rect(), i9, uj9Var2.l(pageBlock.text, 0));
            arrayList.add(nj9Var);
            return nj9Var;
        }
        if (o.H(pageBlock) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockParagraph)) {
            boolean H = o.H(pageBlock);
            kj9 kj9Var = new kj9(uj9Var2, rect, i9, uj9Var2.l(pageBlock.text, Q(i7, q(pageBlock))));
            if (H) {
                kj9Var.i0(gm.L(10.0f), gm.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                kj9Var.i0(z ? 0 : gm.L(6.0f), gm.L(6.0f));
            }
            kj9Var.G = pageBlock instanceof TL_iv.pageBlockHeading1 ? 2131753995 : pageBlock instanceof TL_iv.pageBlockHeading2 ? 2131753994 : pageBlock instanceof TL_iv.pageBlockHeading3 ? 2131753993 : pageBlock instanceof TL_iv.pageBlockHeading4 ? 2131753992 : pageBlock instanceof TL_iv.pageBlockHeading5 ? 2131753991 : pageBlock instanceof TL_iv.pageBlockHeading6 ? 2131753990 : pageBlock instanceof TL_iv.pageBlockFooter ? 2131753997 : 0;
            arrayList.add(kj9Var);
            return kj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
            uj9 uj9Var3 = uj9Var2.P;
            if (uj9Var3 != null) {
                ArrayList arrayList2 = uj9Var3.g;
                int size = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        qi9Var = null;
                        break;
                    }
                    Object obj = arrayList2.get(i11);
                    i11++;
                    qi9 qi9Var2 = (qi9) obj;
                    if (ej9.class.isInstance(qi9Var2) && (qi9Var2 instanceof ej9)) {
                        String str = ((ej9) qi9Var2).o0;
                        String w = w(pageBlock.text);
                        if ((str == null || str.length() > w.length() || w.length() <= 0) ? false : w.startsWith(str)) {
                            qi9Var = (qi9) ej9.class.cast(qi9Var2);
                            break;
                        }
                    }
                }
            } else {
                qi9Var = null;
            }
            ej9 ej9Var = new ej9(uj9Var2, rect, uj9Var2.B, pageblockpreformatted, (ej9) qi9Var);
            ej9Var.G = 2131754020;
            arrayList.add(ej9Var);
            return ej9Var;
        }
        boolean z3 = pageBlock instanceof TL_iv.pageBlockList;
        TextPaint textPaint = uj9Var2.x;
        if (z3) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            int i12 = i + 1;
            textPaint.setTextSize(gm.L(gda.S0));
            int L = gm.L(16.0f);
            for (int i13 = 0; i13 < pageblocklist.items.size(); i13++) {
                L = Math.max(L, pageblocklist.items.get(i13).checkbox ? gm.L(26.0f) : gm.L(16.0f));
            }
            Rect rect2 = new Rect(rect);
            if (uj9Var2.H()) {
                rect2.right += L;
            } else {
                rect2.left += L;
            }
            int i14 = 0;
            while (i14 < pageblocklist.items.size()) {
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i14);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    kj9 kj9Var2 = new kj9(uj9Var2, new Rect(rect2), i9, uj9Var2.l(tL_pageListItemText.text, i7));
                    kj9Var2.n = L;
                    if (tL_pageListItemText.checkbox) {
                        kj9Var2.a0(tL_pageListItemText, tL_pageListItemText.checked);
                    } else {
                        kj9Var2.b0("•◦▪".charAt(i % 3) + "");
                    }
                    boolean z4 = tL_pageListItemText.checkbox;
                    boolean z5 = tL_pageListItemText.checked;
                    kj9Var2.w = i12;
                    kj9Var2.x = false;
                    kj9Var2.y = z4;
                    kj9Var2.E = z5;
                    arrayList.add(kj9Var2);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                        int size2 = arrayList.size();
                        int i15 = 0;
                        boolean z6 = false;
                        while (i15 < tL_pageListItemBlocks.blocks.size()) {
                            int i16 = i15;
                            qi9 j = j(tL_pageListItemBlocks.blocks.get(i15), i12, new Rect(rect2), i7, N(i15, tL_pageListItemBlocks.blocks));
                            int i17 = i12;
                            if (j != null && !z6) {
                                j.n = L;
                                if (tL_pageListItemBlocks.checkbox) {
                                    j.a0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                } else {
                                    j.b0("•◦▪".charAt(i % 3) + "");
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
                            uj9Var2 = this;
                        }
                        i6 = i12;
                        uj9Var = uj9Var2;
                        int size3 = arrayList.size();
                        for (int i18 = size2; i18 < size3; i18++) {
                            qi9 qi9Var3 = (qi9) arrayList.get(i18);
                            if (qi9Var3.w == 0) {
                                qi9Var3.w = i6;
                                qi9Var3.x = false;
                            }
                        }
                        i14++;
                        uj9Var2 = uj9Var;
                        i12 = i6;
                    }
                }
                i6 = i12;
                uj9Var = uj9Var2;
                i14++;
                uj9Var2 = uj9Var;
                i12 = i6;
            }
            return null;
        }
        uj9 uj9Var4 = uj9Var2;
        boolean z9 = true;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            int i19 = i + 1;
            textPaint.setTextSize(gm.L(gda.S0));
            new TextPaint(textPaint).setTypeface(gm.o());
            int L2 = gm.L(16.0f);
            for (int i20 = 0; i20 < pageblockorderedlist.items.size(); i20++) {
                L2 = Math.max(L2, gm.L(8.0f) + ((int) Math.ceil(r1.measureText(M(pageblockorderedlist, r12, i20)))) + (pageblockorderedlist.items.get(i20).checkbox ? gm.L(26.0f) : 0));
            }
            Rect rect3 = new Rect(rect);
            if (uj9Var4.H()) {
                rect3.right += L2;
            } else {
                rect3.left += L2;
            }
            int i21 = 0;
            while (i21 < pageblockorderedlist.items.size()) {
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i21);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    kj9 kj9Var3 = new kj9(uj9Var4, new Rect(rect3), i9, uj9Var4.l(tL_pageListOrderedItemText.text, i7));
                    kj9Var3.n = L2;
                    kj9Var3.b0(M(pageblockorderedlist, tL_pageListOrderedItemText, i21));
                    if (tL_pageListOrderedItemText.checkbox) {
                        kj9Var3.a0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                    }
                    boolean z10 = tL_pageListOrderedItemText.checkbox;
                    boolean z11 = tL_pageListOrderedItemText.checked;
                    kj9Var3.w = i19;
                    kj9Var3.x = z9;
                    kj9Var3.y = z10;
                    kj9Var3.E = z11;
                    arrayList.add(kj9Var3);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                        int i22 = i10;
                        int i23 = i22;
                        while (i22 < tL_pageListOrderedItemBlocks.blocks.size()) {
                            uj9 uj9Var5 = uj9Var4;
                            int i24 = i19;
                            int i25 = i22;
                            qi9 j2 = uj9Var5.j(tL_pageListOrderedItemBlocks.blocks.get(i22), i24, new Rect(rect3), i7, N(i22, tL_pageListOrderedItemBlocks.blocks));
                            uj9Var4 = uj9Var5;
                            i19 = i24;
                            int i26 = i7;
                            if (j2 != null && i23 == 0) {
                                j2.n = L2;
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j2.a0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                }
                                j2.b0(M(pageblockorderedlist, tL_pageListOrderedItemBlocks, i21));
                                if (tL_pageListOrderedItemBlocks.checkbox) {
                                    j2.a0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
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
                            qi9 qi9Var4 = (qi9) arrayList.get(size5);
                            if (qi9Var4.w == 0) {
                                qi9Var4.w = i19;
                                qi9Var4.x = true;
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
        ArrayList arrayList3 = uj9Var4.h;
        if (z14) {
            int i28 = rect.left;
            int size6 = arrayList.size();
            TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
            SpannableStringBuilder l = uj9Var4.l(pageBlock.text, Q(i27, q(pageBlock)));
            TL_iv.RichText richText = pageblockblockquote2.caption;
            SpannableStringBuilder l2 = (richText == null || TextUtils.isEmpty(w(richText))) ? null : uj9Var4.l(pageblockblockquote2.caption, Q(i27, 11));
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
                ?? lj9Var = new lj9(uj9Var4, new Rect(gm.L(12.0f) + rect.left, gm.L(4.0f) + rect.top, gm.L(20.0f) + rect.right, gm.L(4.0f) + rect.bottom), uj9Var4.B, pageblockblockquote2, spannableStringBuilder);
                pageblockblockquote = pageblockblockquote2;
                lj9Var.c0 = i29;
                lj9Var.i0(gm.L(8.0f), gm.L(8.0f));
                gj9Var = lj9Var;
            } else {
                pageblockblockquote = pageblockblockquote2;
                gj9Var = new gj9(uj9Var4, new Rect(gm.L(12.0f) + rect.left, gm.L(12.0f) + rect.top, gm.L(12.0f) + rect.right, gm.L(14.0f) + rect.bottom), uj9Var4.B, l, l2, Layout.Alignment.ALIGN_NORMAL);
            }
            gj9Var.G = 2131753961;
            arrayList.add(gj9Var);
            arrayList3.add(new ni9(size6, arrayList.size() - 1, i28, i, gm.L(8.0f), pageblockblockquote.collapsed ? gm.L(8.0f) : 0));
            return gj9Var;
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
                j(pageblockblockquoteblocks.blocks.get(i32), i33, new Rect(gm.L(12.0f) + rect.left, rect.top + (i32 == 0 ? gm.L(4.0f) : 0), gm.L(12.0f) + rect.right, rect.bottom + ((!(i32 == pageblockblockquoteblocks.blocks.size() + (-1)) || z15) ? 0 : gm.L(4.0f))), Q(i27, 9), N(i32, pageblockblockquoteblocks.blocks));
                i32++;
                i27 = i27;
                pageblockblockquoteblocks = pageblockblockquoteblocks;
                i31 = i33;
            }
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks2 = pageblockblockquoteblocks;
            int i34 = i27;
            if (arrayList.size() > size7) {
                ((qi9) arrayList.get(size7)).F = 2131753961;
            }
            if (z15) {
                kj9 kj9Var4 = new kj9(this, new Rect(gm.L(12.0f) + rect.left, rect.top, gm.L(12.0f) + rect.right, gm.L(6.0f) + rect.bottom), i9, new SpannableStringBuilder(l(pageblockblockquoteblocks2.caption, Q(i34, 11))));
                kj9Var4.c0 = 0;
                kj9Var4.i0(gm.L(2.0f), 0);
                arrayList.add(kj9Var4);
            }
            arrayList3.add(new ni9(size7, arrayList.size() - 1, i30, i, 0, 0));
            return null;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            SpannableStringBuilder l3 = l(pageBlock.text, Q(i27, q(pageBlock)));
            TL_iv.RichText richText3 = pageblockpullquote.caption;
            fj9 fj9Var = new fj9(this, new Rect(gm.L(30.0f) + rect.left, gm.L(16.0f) + rect.top, gm.L(30.0f) + rect.right, gm.L(16.0f) + rect.bottom), this.B, l3, (richText3 == null || TextUtils.isEmpty(w(richText3))) ? null : l(pageblockpullquote.caption, Q(i27, 11)), Layout.Alignment.ALIGN_CENTER);
            fj9Var.G = 2131753962;
            arrayList.add(fj9Var);
            return fj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            si9 si9Var = new si9(this, rect, i9, (TL_iv.pageBlockButtonRow) pageBlock);
            si9Var.G = 2131754871;
            arrayList.add(si9Var);
            return si9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            try {
                jj9 jj9Var = new jj9(this, rect, i9, (TL_iv.pageBlockTable) pageBlock);
                jj9Var.G = 2131754854;
                arrayList.add(jj9Var);
                return jj9Var;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            bj9 bj9Var = new bj9(this, rect, i9, (TL_iv.pageBlockMath) pageBlock);
            arrayList.add(bj9Var);
            return bj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            yi9 yi9Var = new yi9(this, rect, i9);
            arrayList.add(yi9Var);
            return yi9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
            dj9 dj9Var = new dj9(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
            arrayList.add(dj9Var);
            k(pageblockphoto.caption, rect, i27);
            return dj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            pj9 pj9Var = new pj9(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
            arrayList.add(pj9Var);
            k(pageblockvideo.caption, rect, i27);
            return pj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
            vi9 vi9Var = new vi9(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
            arrayList.add(vi9Var);
            k(pageblockcollage.caption, rect, i27);
            return vi9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
            hj9 hj9Var = new hj9(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
            arrayList.add(hj9Var);
            k(pageblockslideshow.caption, rect, i27);
            return hj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
            aj9 aj9Var = new aj9(this, rect, i9, pageblockmap);
            arrayList.add(aj9Var);
            k(pageblockmap.caption, rect, i27);
            return aj9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            HashMap hashMap = this.m;
            if (((k47) hashMap.get(pageblockaudio)) == null && (s = s(pageblockaudio.audio_id)) != null) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                int i35 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                pageblockaudio.mid = i35;
                tL_message.id = i35;
                k47 k47Var = this.b;
                tL_message.realId = k47Var.L1();
                tL_message.dialog_id = k47.B0(k47Var.k);
                TLRPC.Peer peer = k47Var.k.peer_id;
                tL_message.peer_id = peer;
                int i36 = this.a;
                if (peer == null) {
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.peer_id = tL_peerUser;
                    tL_peerUser.user_id = z8c.h(i36).e();
                }
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser2;
                tL_peerUser2.user_id = z8c.h(i36).e();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = s;
                tL_message.flags |= 768;
                k47 k47Var2 = new k47(i36, tL_message, false, true);
                this.l.add(k47Var2);
                hashMap.put(pageblockaudio, k47Var2);
            }
            pi9 pi9Var = new pi9(this, rect, i9, pageblockaudio);
            arrayList.add(pi9Var);
            k(pageblockaudio.caption, rect, i27);
            return pi9Var;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
            zi9 zi9Var = new zi9(this, rect, i9, pageblockdocument);
            arrayList.add(zi9Var);
            k(pageblockdocument.caption, rect, i27);
            return zi9Var;
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
            AtomicInteger atomicInteger = al9.t0;
            if (pageblockembed.html != null && wxc.m(pageblockembed.url)) {
                if (wxc.m(pageblockembed.url)) {
                    String str3 = pageblockembed.url;
                    int i0 = i9 + (al9.i0() << 1);
                    txc txcVar = wxc.m(str3) ? (txc) wxc.a.get(str3) : null;
                    if (txcVar != null && (i3 = txcVar.e) != 0) {
                        i0 = Math.min(i0, gm.L(Math.max(nm7.d3, i3)));
                    }
                    i9 = i0 - (al9.i0() << 1);
                }
                al9 al9Var = new al9(this, rect, i9, pageblockembed, arrayList.isEmpty());
                arrayList.add(al9Var);
                k(pageblockembed.caption, rect, i27);
                return al9Var;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            int L3 = iqd.a(i27, 9) ? gm.L(6.0f) : i > 0 ? gm.L(4.0f) : 0;
            oj9 oj9Var = new oj9(this, new Rect((rect.left + L3) - gm.L(7.0f), Math.max(gm.L(14.0f), rect.top), (rect.right + L3) - gm.L(7.0f), Math.max(gm.L(14.0f), rect.bottom)), this.B, arrayList.size(), i);
            this.e.add(oj9Var);
            if (i == 0) {
                this.f.add(oj9Var);
            }
            arrayList.add(oj9Var);
            return oj9Var;
        }
        if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
            boolean z16 = e21.a;
            return null;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
        wi9 wi9Var = new wi9(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i27 & (-17)));
        arrayList.add(wi9Var);
        for (int i37 = 0; i37 < pageblockdetails.blocks.size(); i37++) {
            j(pageblockdetails.blocks.get(i37), i + 1, rect, i27, N(i37, pageblockdetails.blocks));
        }
        arrayList.add(new xi9(this, new Rect(rect.left, 0, rect.right, 0), i9));
        for (int size8 = arrayList.size(); size8 < arrayList.size(); size8++) {
            qi9 qi9Var5 = (qi9) arrayList.get(size8);
            if (qi9Var5.M == null) {
                qi9Var5.M = wi9Var;
            }
        }
        return wi9Var;
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
                this.g.add(new ui9(this, rect, this.B, z2 ? l(pageCaption.text, Q) : null, z ? l(pageCaption.credit, Q) : null));
            }
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i, new rj9(this, i, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new oi9(richText, i), 0, spannableStringBuilder.length(), 33);
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
                    boolean j = zk9.j(textdiff.text);
                    boolean j2 = zk9.j(textdiff.old_text);
                    if (!j) {
                        TL_iv.RichText richText2 = textdiff.text;
                        if (j2) {
                            n(richText2, spannableStringBuilder, i, new xkb(y(TLObject.FLAG_12), 0));
                        } else {
                            n(richText2, spannableStringBuilder, i, new boa());
                        }
                    } else if (!j2) {
                        n(textdiff.old_text, spannableStringBuilder, i, new xkb(y(TLObject.FLAG_13), 0));
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i2 = i | 16;
                    n(richText.text, spannableStringBuilder, i2, new rj9(this, i2, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i3 = i | 32;
                    n(richText.text, spannableStringBuilder, i3, new rj9(this, i3, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i4 = i | 64;
                    n(richText.text, spannableStringBuilder, i4, new rj9(this, i4, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i5 = i | 128;
                    n(richText.text, spannableStringBuilder, i5, new rj9(this, i5, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i6 = i | 256;
                    n(richText.text, spannableStringBuilder, i6, new rj9(this, i6, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i, new i6c(((TL_iv.textUrl) richText).url, y(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    n(richText.text, spannableStringBuilder, i, new i6c("mailto:" + ((TL_iv.textEmail) richText).email, y(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                        m(richText.texts.get(i7), spannableStringBuilder, i);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i8 = i | 2048;
                    n(richText.text, spannableStringBuilder, i8, new rj9(this, i8, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i9 = i | TLObject.FLAG_12;
                    n(richText.text, spannableStringBuilder, i9, new rj9(this, i9, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i10 = i | TLObject.FLAG_13;
                    n(richText.text, spannableStringBuilder, i10, new rj9(this, i10, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String h = r58.h(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        h = b10.h("+", h);
                    }
                    n(richText.text, spannableStringBuilder, i, new i6c(b10.h("tel:", h), y(1024)));
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
                    n(richText3, spannableStringBuilder, i, new i37((byte) 3));
                } else if (richText instanceof TL_iv.textMath) {
                    TL_iv.textMath textmath = (TL_iv.textMath) richText;
                    if (textmath.bitmap == null && !textmath.tried) {
                        textmath.tried = true;
                        lz5 a = lz5.a(textmath.source, gm.L(this.M + 4), true);
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
                        spannableStringBuilder.setSpan(new sjb(null, textmath.bitmap, textmath.w, textmath.h, cmb.v0(cmb.F6, this.D), textmath.depth), length2, length3, 33);
                        String str3 = textmath.source;
                        if (str3 != null && !str3.isEmpty()) {
                            spannableStringBuilder.setSpan(new lkb(textmath.source), length2, length3, 33);
                        }
                    }
                } else if (richText instanceof TL_iv.textCustomEmoji) {
                    TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                    CharSequence charSequence = TextUtils.isEmpty(textcustomemoji.alt) ? "😀" : textcustomemoji.alt;
                    int length4 = spannableStringBuilder.length();
                    spannableStringBuilder.append(charSequence);
                    int length5 = spannableStringBuilder.length();
                    boolean a2 = iqd.a(i, 13);
                    int i11 = i & 15;
                    if (i11 < 1 || i11 > 6) {
                        size = new gn(textcustomemoji.document_id, a2 ? 1.0f : 1.2f, (Paint.FontMetricsInt) null).setSize(gm.L(this.M + 4 + (a2 ? -2 : 4)));
                    } else {
                        TextPaint textPaint = new TextPaint(this.w);
                        new rj9(this, i, true).a(textPaint);
                        size = new gn(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                    }
                    spannableStringBuilder.setSpan(size, length4, length5, 33);
                } else if (richText instanceof TL_iv.textSpoiler) {
                    n(richText.text, spannableStringBuilder, i, new xkb(y(256), 0));
                } else if (richText instanceof TL_iv.textMention) {
                    TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                    wkb wkbVar = new wkb();
                    wkbVar.d = tL_messageEntityMention;
                    n(richText.text, spannableStringBuilder, i, new g6c(w(richText), wkbVar));
                } else if (richText instanceof TL_iv.textHashtag) {
                    TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                    wkb wkbVar2 = new wkb();
                    wkbVar2.d = tL_messageEntityHashtag;
                    n(richText.text, spannableStringBuilder, i, new g6c(w(richText), wkbVar2));
                } else if (richText instanceof TL_iv.textBotCommand) {
                    n(richText.text, spannableStringBuilder, i, new d6c(w(richText), D() ? 1 : 0, null));
                } else if (richText instanceof TL_iv.textCashtag) {
                    TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                    wkb wkbVar3 = new wkb();
                    wkbVar3.d = tL_messageEntityCashtag;
                    n(richText.text, spannableStringBuilder, i, new g6c(w(richText), wkbVar3));
                } else if (richText instanceof TL_iv.textAutoUrl) {
                    n(richText.text, spannableStringBuilder, i, new i6c(w(richText), y(1024)));
                } else if (richText instanceof TL_iv.textAutoEmail) {
                    n(richText.text, spannableStringBuilder, i, new i6c("mailto:".concat(w(richText)), y(1024)));
                } else if (richText instanceof TL_iv.textAutoPhone) {
                    String w = w(richText);
                    String h2 = r58.h(w, false);
                    if (w.startsWith("+")) {
                        h2 = b10.h("+", h2);
                    }
                    n(richText.text, spannableStringBuilder, i, new i6c(b10.h("tel:", h2), y(1024)));
                } else if (richText instanceof TL_iv.textTonAddress) {
                    n(richText.text, spannableStringBuilder, i, new g6c("tonaddress:".concat(w(richText)), (wkb) null));
                } else if (richText instanceof TL_iv.textBankCard) {
                    n(richText.text, spannableStringBuilder, i, new g6c("card:".concat(w(richText)), (wkb) null));
                } else if (richText instanceof TL_iv.textMentionName) {
                    n(richText.text, spannableStringBuilder, i, new j6c(String.valueOf(((TL_iv.textMentionName) richText).user_id), D() ? 1 : 0, null));
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
                    rj9 rj9Var = new rj9(this, i12, false);
                    jo4 jo4Var = new jo4(w(richText), null, tL_messageEntityFormattedDate);
                    int length6 = spannableStringBuilder.length();
                    m(richText4, spannableStringBuilder, i12);
                    if (spannableStringBuilder.length() > length6) {
                        T(rj9Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                        T(jo4Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                    }
                } else if (richText instanceof TL_iv.textButton) {
                    int length7 = spannableStringBuilder.length();
                    spannableStringBuilder.append("*");
                    ti9 ti9Var = new ti9(this, this.B, (TL_iv.textButton) richText, null);
                    ti9Var.d = 1.2f;
                    spannableStringBuilder.setSpan(ti9Var, length7, spannableStringBuilder.length(), 33);
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
            ((qi9) arrayList.get(i)).o(arrayList2);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((mi7) arrayList2.get(i2)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i, yc2 yc2Var) {
        ArrayList arrayList = this.g;
        if (i >= 0 && i < arrayList.size() && yc2Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, yc2Var.L1));
            qi9 qi9Var = (qi9) arrayList.get(i);
            return Math.round(gm.R1(qi9Var.P, qi9Var.N, max));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            qi9 qi9Var2 = (qi9) arrayList.get(i3);
            boolean R = qi9Var2.R();
            if (i3 == i) {
                return i2;
            }
            if (R) {
                i2 = ((yc2Var == null || !(this.s || this.u)) ? qi9Var2.H() : gm.U1(Math.max(0.0f, Math.min(1.0f, yc2Var.L1)), qi9Var2.Q, qi9Var2.O)) + i2;
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
        if (!this.d || this.A <= gm.L(900.0f)) {
            return this.A + (this.d ? gm.L(50.0f) : 0);
        }
        return gm.L(950.0f);
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
        qi9 qi9Var;
        int i4;
        String str;
        uj9 uj9Var = this;
        ArrayList arrayList = uj9Var.n;
        if (arrayList.isEmpty() || (max = Math.max(i, i2)) <= (min = Math.min(i, i2))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        int i6 = -1;
        while (i5 < arrayList.size()) {
            Layout a = ((qkb) arrayList.get(i5)).a();
            if (a != null && a.getText() != null) {
                CharSequence text = a.getText();
                ArrayList arrayList4 = uj9Var.o;
                int intValue = i5 < arrayList4.size() ? ((Integer) arrayList4.get(i5)).intValue() : 0;
                int length = text.length() + intValue;
                int max2 = Math.max(min, intValue);
                int min2 = Math.min(max, length);
                if (min2 > max2) {
                    ArrayList arrayList5 = uj9Var.p;
                    int intValue2 = i5 < arrayList5.size() ? ((Integer) arrayList5.get(i5)).intValue() : -1;
                    if (intValue2 >= 0) {
                        ArrayList arrayList6 = uj9Var.g;
                        if (intValue2 < arrayList6.size()) {
                            qi9Var = (qi9) arrayList6.get(intValue2);
                            String str2 = "";
                            if (qi9Var instanceof jj9) {
                                ArrayList O = uj9Var.O(intValue2);
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
                                    int i10 = !(qi9Var instanceof kj9) ? ((kj9) qi9Var).c0 : -1;
                                    boolean z = !(qi9Var instanceof mj9) && ((mj9) qi9Var).Y == arrayList.get(i5);
                                    i4 = qi9Var == null ? qi9Var.w : 0;
                                    if (i4 > 0 || i10 >= 0) {
                                        d(sb, arrayList3);
                                        if (!(qi9Var instanceof ej9)) {
                                            SpannableStringBuilder Z = Z(text.subSequence(i8, i9));
                                            String str3 = ((ej9) qi9Var).q0;
                                            StringBuilder sb2 = new StringBuilder();
                                            jh9.g(sb2, Z);
                                            String sb3 = sb2.toString();
                                            if (!sb3.isEmpty()) {
                                                StringBuilder sb4 = new StringBuilder();
                                                if (TextUtils.isEmpty(str3)) {
                                                    sb4.append("<pre>");
                                                } else {
                                                    sb4.append("<pre language=\"");
                                                    sb4.append(jh9.s(str3));
                                                    sb4.append("\">");
                                                }
                                                str2 = b10.j(sb4, sb3, "</pre>");
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
                                        boolean z2 = qi9Var.x;
                                        while (true) {
                                            str = "</ul>";
                                            if (arrayList3.size() <= i4) {
                                                break;
                                            }
                                            if (((Boolean) td4.m(1, arrayList3)).booleanValue()) {
                                                str = "</ol>";
                                            }
                                            sb.append(str);
                                        }
                                        while (arrayList3.size() < i4) {
                                            sb.append(z2 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z2));
                                        }
                                        if (!arrayList3.isEmpty() && ((Boolean) b10.f(1, arrayList3)).booleanValue() != z2) {
                                            sb.append(((Boolean) td4.m(1, arrayList3)).booleanValue() ? "</ol>" : "</ul>");
                                            sb.append(z2 ? "<ol>" : "<ul>");
                                            arrayList3.add(Boolean.valueOf(z2));
                                        }
                                        sb.append("<li");
                                        if (qi9Var.y) {
                                            sb.append(" data-checkbox=\"1\"");
                                            if (qi9Var.E) {
                                                sb.append(" data-checked=\"1\"");
                                            }
                                        }
                                        sb.append('>');
                                        SpannableStringBuilder Z2 = Z(text.subSequence(i8, i9));
                                        StringBuilder sb5 = new StringBuilder();
                                        jh9.g(sb5, Z2);
                                        sb.append(sb5.toString());
                                        sb.append("</li>");
                                    }
                                }
                                d(sb, arrayList3);
                                Y(sb, arrayList2, O);
                                int i82 = max2 - intValue;
                                int i92 = min2 - intValue;
                                if (!(qi9Var instanceof kj9)) {
                                }
                                if (qi9Var instanceof mj9) {
                                }
                                if (qi9Var == null) {
                                }
                                if (i4 > 0) {
                                }
                                d(sb, arrayList3);
                                if (!(qi9Var instanceof ej9)) {
                                }
                            } else if (intValue2 != i6) {
                                d(sb, arrayList3);
                                Y(sb, arrayList2, uj9Var.O(intValue2));
                                TL_iv.pageBlockTable pageblocktable = ((jj9) qi9Var).X;
                                if (pageblocktable != null) {
                                    StringBuilder sb6 = new StringBuilder();
                                    jh9.H(sb6, pageblocktable);
                                    str2 = sb6.toString();
                                }
                                sb.append(str2);
                                i3 = min;
                                i6 = intValue2;
                            }
                            i5++;
                            uj9Var = this;
                            min = i3;
                        }
                    }
                    qi9Var = null;
                    String str22 = "";
                    if (qi9Var instanceof jj9) {
                    }
                    i5++;
                    uj9Var = this;
                    min = i3;
                }
            }
            i3 = min;
            i5++;
            uj9Var = this;
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

    public uj9(k47 k47Var, int i, uj9 uj9Var) {
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
        this.y = new p99(null);
        this.z = new in3((byte) 7);
        this.K = new RectF();
        this.b = k47Var;
        this.B = i;
        this.a = k47Var.K1;
        I(uj9Var);
    }
}
