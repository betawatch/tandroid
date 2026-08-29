package y4;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import f2.r1;
import f5.d0;
import f5.w;
import i7.n6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import t4.e;
import t4.f;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends e {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean b;
    public final r1 c;
    public LinkedHashMap d;
    public float e;
    public float f;

    public a(List list) {
        super("SsaDecoder");
        this.e = -3.4028235E38f;
        this.f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        String l10 = d0.l((byte[]) list.get(0));
        f5.a.f(l10.startsWith("Format:"));
        r1 b10 = r1.b(l10);
        b10.getClass();
        this.c = b10;
        e(new w((byte[]) list.get(1)));
    }

    public static int d(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    public static long f(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = d0.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // t4.e
    public final f c(int i10, boolean z10, byte[] bArr) {
        w wVar;
        r1 r1Var;
        float f9;
        int i11;
        int i12;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        boolean z11;
        int i16;
        int i17;
        float f14;
        int i18;
        float f15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w(bArr, i10);
        boolean z12 = aVar.b;
        if (!z12) {
            aVar.e(wVar2);
        }
        r1 r1Var2 = z12 ? aVar.c : null;
        while (true) {
            String f16 = wVar2.f(p8.d.c);
            if (f16 == null) {
                return new n(7, arrayList, arrayList2);
            }
            if (f16.startsWith("Format:")) {
                r1Var2 = r1.b(f16);
            } else {
                if (f16.startsWith("Dialogue:")) {
                    if (r1Var2 == null) {
                        f5.a.K("SsaDecoder", "Skipping dialogue line before complete format: ".concat(f16));
                    } else {
                        int i24 = r1Var2.e;
                        f5.a.f(f16.startsWith("Dialogue:"));
                        String[] split = f16.substring(9).split(",", i24);
                        if (split.length != i24) {
                            f5.a.K("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(f16));
                        } else {
                            long f17 = f(split[r1Var2.a]);
                            if (f17 == -9223372036854775807L) {
                                f5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(f16));
                            } else {
                                long f18 = f(split[r1Var2.b]);
                                if (f18 == -9223372036854775807L) {
                                    f5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(f16));
                                } else {
                                    LinkedHashMap linkedHashMap = aVar.d;
                                    d dVar = (linkedHashMap == null || (i23 = r1Var2.c) == -1) ? null : (d) linkedHashMap.get(split[i23].trim());
                                    String str = split[r1Var2.d];
                                    Matcher matcher = c.a.matcher(str);
                                    PointF pointF = null;
                                    int i25 = -1;
                                    while (matcher.find()) {
                                        w wVar3 = wVar2;
                                        String group = matcher.group(1);
                                        group.getClass();
                                        try {
                                            PointF a2 = c.a(group);
                                            if (a2 != null) {
                                                pointF = a2;
                                            }
                                        } catch (RuntimeException unused) {
                                        }
                                        try {
                                            Matcher matcher2 = c.d.matcher(group);
                                            if (matcher2.find()) {
                                                String group2 = matcher2.group(1);
                                                group2.getClass();
                                                i22 = d.a(group2);
                                            } else {
                                                i22 = -1;
                                            }
                                            if (i22 != -1) {
                                                i25 = i22;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        wVar2 = wVar3;
                                    }
                                    wVar = wVar2;
                                    String replace = c.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f19 = aVar.e;
                                    float f20 = aVar.f;
                                    SpannableString spannableString = new SpannableString(replace);
                                    if (dVar != null) {
                                        boolean z13 = dVar.g;
                                        Integer num = dVar.d;
                                        Integer num2 = dVar.c;
                                        if (num2 != null) {
                                            z11 = z13;
                                            r1Var = r1Var2;
                                            f9 = f19;
                                            i16 = 33;
                                            i17 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            z11 = z13;
                                            r1Var = r1Var2;
                                            f9 = f19;
                                            i16 = 33;
                                            i17 = 0;
                                        }
                                        if (dVar.j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                        }
                                        float f21 = dVar.e;
                                        if (f21 == -3.4028235E38f || f20 == -3.4028235E38f) {
                                            f14 = -3.4028235E38f;
                                            i18 = TLObject.FLAG_31;
                                        } else {
                                            f14 = f21 / f20;
                                            i18 = 1;
                                        }
                                        boolean z14 = dVar.f;
                                        if (z14 && z11) {
                                            f15 = f14;
                                            i19 = i18;
                                            i20 = 33;
                                            i21 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            f15 = f14;
                                            i19 = i18;
                                            i20 = 33;
                                            i21 = 0;
                                            if (z14) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z11) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (dVar.h) {
                                            spannableString.setSpan(new UnderlineSpan(), i21, spannableString.length(), i20);
                                        }
                                        if (dVar.i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i21, spannableString.length(), i20);
                                        }
                                        f10 = f15;
                                        i12 = i19;
                                        i11 = -1;
                                    } else {
                                        r1Var = r1Var2;
                                        f9 = f19;
                                        i11 = -1;
                                        i12 = TLObject.FLAG_31;
                                        f10 = -3.4028235E38f;
                                    }
                                    if (i25 != i11) {
                                        i11 = i25;
                                    } else if (dVar != null) {
                                        i11 = dVar.b;
                                    }
                                    switch (i11) {
                                        case 0:
                                        default:
                                            com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            alignment2 = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            alignment2 = alignment;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            alignment2 = alignment;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            alignment2 = alignment;
                                            break;
                                    }
                                    int i26 = TLObject.FLAG_31;
                                    switch (i11) {
                                        case 0:
                                        default:
                                            com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                        case -1:
                                            i13 = TLObject.FLAG_31;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i13 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i13 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i13 = 2;
                                            break;
                                    }
                                    switch (i11) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            com.google.android.recaptcha.internal.a.s(i11, "Unknown alignment: ", "SsaDecoder");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i26 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i26 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i26 = 0;
                                            break;
                                    }
                                    if (pointF == null || f20 == -3.4028235E38f || f9 == -3.4028235E38f) {
                                        if (i13 != 0) {
                                            i15 = 1;
                                            if (i13 != 1) {
                                                i14 = 2;
                                                f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i14 = 2;
                                                f11 = 0.5f;
                                            }
                                        } else {
                                            i14 = 2;
                                            i15 = 1;
                                            f11 = 0.05f;
                                        }
                                        f12 = i26 != 0 ? i26 != i15 ? i26 != i14 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                        f13 = f11;
                                    } else {
                                        f13 = pointF.x / f9;
                                        f12 = pointF.y / f20;
                                    }
                                    t4.b bVar = new t4.b(spannableString, alignment2, null, null, f12, 0, i26, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
                                    int d = d(f18, arrayList2, arrayList);
                                    for (int d10 = d(f17, arrayList2, arrayList); d10 < d; d10++) {
                                        ((List) arrayList.get(d10)).add(bVar);
                                    }
                                    aVar = this;
                                    wVar2 = wVar;
                                    r1Var2 = r1Var;
                                }
                            }
                        }
                    }
                }
                wVar = wVar2;
                r1Var = r1Var2;
                aVar = this;
                wVar2 = wVar;
                r1Var2 = r1Var;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(w wVar) {
        char c3;
        float f9;
        int i10;
        d dVar;
        int parseInt;
        float f10;
        while (true) {
            String f11 = wVar.f(p8.d.c);
            if (f11 == null) {
                return;
            }
            char c6 = '[';
            if ("[Script Info]".equalsIgnoreCase(f11)) {
                while (true) {
                    String f12 = wVar.f(p8.d.c);
                    if (f12 != null && (wVar.a() == 0 || (wVar.a[wVar.b] & 255) != 91)) {
                        String[] split = f12.split(":");
                        if (split.length == 2) {
                            String b10 = n6.b(split[0].trim());
                            b10.getClass();
                            if (b10.equals("playresx")) {
                                this.e = Float.parseFloat(split[1].trim());
                            } else if (b10.equals("playresy")) {
                                try {
                                    this.f = Float.parseFloat(split[1].trim());
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(f11)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                b bVar = null;
                while (true) {
                    String f13 = wVar.f(p8.d.c);
                    if (f13 != null && (wVar.a() == 0 || (wVar.a[wVar.b] & 255) != c6)) {
                        int i11 = -1;
                        if (f13.startsWith("Format:")) {
                            String[] split2 = TextUtils.split(f13.substring(7), ",");
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            int i15 = -1;
                            int i16 = -1;
                            int i17 = -1;
                            int i18 = -1;
                            int i19 = -1;
                            int i20 = -1;
                            int i21 = -1;
                            for (int i22 = 0; i22 < split2.length; i22++) {
                                String b11 = n6.b(split2[i22].trim());
                                b11.getClass();
                                switch (b11.hashCode()) {
                                    case -1178781136:
                                        if (b11.equals("italic")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1026963764:
                                        if (b11.equals("underline")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -192095652:
                                        if (b11.equals("strikeout")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -70925746:
                                        if (b11.equals("primarycolour")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3029637:
                                        if (b11.equals("bold")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3373707:
                                        if (b11.equals("name")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 366554320:
                                        if (b11.equals("fontsize")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 767321349:
                                        if (b11.equals("borderstyle")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1767875043:
                                        if (b11.equals("alignment")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1988365454:
                                        if (b11.equals("outlinecolour")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                        i18 = i22;
                                        break;
                                    case 1:
                                        i19 = i22;
                                        break;
                                    case 2:
                                        i20 = i22;
                                        break;
                                    case 3:
                                        i14 = i22;
                                        break;
                                    case 4:
                                        i17 = i22;
                                        break;
                                    case 5:
                                        i12 = i22;
                                        break;
                                    case 6:
                                        i16 = i22;
                                        break;
                                    case 7:
                                        i21 = i22;
                                        break;
                                    case '\b':
                                        i13 = i22;
                                        break;
                                    case '\t':
                                        i15 = i22;
                                        break;
                                }
                            }
                            bVar = i12 != -1 ? new b(i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, split2.length) : null;
                        } else {
                            if (f13.startsWith("Style:")) {
                                if (bVar == null) {
                                    f5.a.K("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(f13));
                                } else {
                                    f5.a.f(f13.startsWith("Style:"));
                                    String[] split3 = TextUtils.split(f13.substring(6), ",");
                                    int length = split3.length;
                                    int i23 = bVar.k;
                                    if (length != i23) {
                                        int length2 = split3.length;
                                        int i24 = d0.a;
                                        Locale locale = Locale.US;
                                        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("Skipping malformed 'Style:' line (expected ", i23, " values, found ", length2, "): '");
                                        o10.append(f13);
                                        o10.append("'");
                                        f5.a.K("SsaStyle", o10.toString());
                                    } else {
                                        try {
                                            String trim = split3[bVar.a].trim();
                                            int i25 = bVar.b;
                                            int a2 = i25 != -1 ? d.a(split3[i25].trim()) : -1;
                                            int i26 = bVar.c;
                                            Integer c10 = i26 != -1 ? d.c(split3[i26].trim()) : null;
                                            int i27 = bVar.d;
                                            Integer c11 = i27 != -1 ? d.c(split3[i27].trim()) : null;
                                            int i28 = bVar.e;
                                            if (i28 != -1) {
                                                String trim2 = split3[i28].trim();
                                                try {
                                                    f10 = Float.parseFloat(trim2);
                                                } catch (NumberFormatException e10) {
                                                    f5.a.L("SsaStyle", "Failed to parse font size: '" + trim2 + "'", e10);
                                                    f10 = -3.4028235E38f;
                                                }
                                                f9 = f10;
                                            } else {
                                                f9 = -3.4028235E38f;
                                            }
                                            int i29 = bVar.f;
                                            boolean z10 = i29 != -1 && d.b(split3[i29].trim());
                                            int i30 = bVar.g;
                                            boolean z11 = i30 != -1 && d.b(split3[i30].trim());
                                            int i31 = bVar.h;
                                            boolean z12 = i31 != -1 && d.b(split3[i31].trim());
                                            int i32 = bVar.i;
                                            boolean z13 = i32 != -1 && d.b(split3[i32].trim());
                                            int i33 = bVar.j;
                                            if (i33 != -1) {
                                                String trim3 = split3[i33].trim();
                                                try {
                                                    parseInt = Integer.parseInt(trim3.trim());
                                                } catch (NumberFormatException unused2) {
                                                }
                                                if (parseInt == 1 || parseInt == 3) {
                                                    i11 = parseInt;
                                                    i10 = i11;
                                                }
                                                f5.a.K("SsaStyle", "Ignoring unknown BorderStyle: " + trim3);
                                                i10 = i11;
                                            } else {
                                                i10 = -1;
                                            }
                                            dVar = new d(trim, a2, c10, c11, f9, z10, z11, z12, z13, i10);
                                        } catch (RuntimeException e11) {
                                            f5.a.L("SsaStyle", "Skipping malformed 'Style:' line: '" + f13 + "'", e11);
                                        }
                                        if (dVar != null) {
                                            linkedHashMap.put(dVar.a, dVar);
                                        }
                                    }
                                    dVar = null;
                                    if (dVar != null) {
                                    }
                                }
                            }
                            c6 = '[';
                        }
                    }
                }
                this.d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(f11)) {
                f5.a.v("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(f11)) {
                return;
            }
        }
    }
}
