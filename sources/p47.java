// default package

import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class p47 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final float d;
    public final ArrayList e = new ArrayList();
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: Can't wrap try/catch for region: R(15:203|(3:204|205|206)|207|(1:209)(12:240|(1:242)|211|212|213|(1:215)(1:237)|216|217|(2:219|(3:221|(5:224|225|(1:230)|227|228)|229))(1:236)|235|(1:234)(5:224|225|(0)|227|228)|229)|210|211|212|213|(0)(0)|216|217|(0)(0)|235|(0)(0)|229) */
    /* JADX WARN: Can't wrap try/catch for region: R(45:110|(1:112)|113|(1:115)(1:359)|116|(1:118)(1:358)|119|(1:121)|122|(1:357)(2:125|(34:127|128|(3:130|(1:(1:133))(1:330)|329)(2:331|(1:(5:334|(1:336)(1:342)|337|(1:339)(1:341)|340)(7:343|(1:345)(1:355)|346|(1:348)(1:354)|349|(1:351)(1:353)|352)))|134|(3:136|(1:138)(2:324|(1:326)(1:327))|139)(1:328)|140|(1:142)(1:(1:322)(27:323|144|(3:146|(1:299)(3:152|(1:154)(1:298)|155)|156)(3:(1:301)(7:302|303|304|(3:309|310|(3:312|307|308))|306|307|308)|269|270)|157|(1:163)|164|165|166|(1:170)|171|172|173|174|175|(1:177)|178|(1:180)|181|(3:183|(7:185|186|187|188|189|191|192)|198)|199|(6:201|(17:203|204|205|206|207|(1:209)(12:240|(1:242)|211|212|213|(1:215)(1:237)|216|217|(2:219|(3:221|(5:224|225|(1:230)|227|228)|229))(1:236)|235|(1:234)(5:224|225|(0)|227|228)|229)|210|211|212|213|(0)(0)|216|217|(0)(0)|235|(0)(0)|229)|245|246|(1:(1:249))(2:(1:279)|280)|250)(3:281|(3:283|(1:285)(1:288)|286)(1:289)|287)|251|(1:253)(2:271|(3:273|(1:275)(1:277)|276))|(5:259|(1:261)(4:265|(1:267)|263|264)|262|263|264)|268|269|270))|143|144|(0)(0)|157|(3:159|161|163)|164|165|166|(2:168|170)|171|172|173|174|175|(0)|178|(0)|181|(0)|199|(0)(0)|251|(0)(0)|(7:255|257|259|(0)(0)|262|263|264)|268|269|270))|356|128|(0)(0)|134|(0)(0)|140|(0)(0)|143|144|(0)(0)|157|(0)|164|165|166|(0)|171|172|173|174|175|(0)|178|(0)|181|(0)|199|(0)(0)|251|(0)(0)|(0)|268|269|270|108) */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0563, code lost:
    
        r11 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04d4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x04d5, code lost:
    
        cc4.g(r0, true);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04bc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04bd, code lost:
    
        if (r6 == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04bf, code lost:
    
        r36.d = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x04c3, code lost:
    
        cc4.g(r0, true);
        r14 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05b5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p47(r47 r47Var, CharSequence charSequence, TextPaint textPaint, int i) {
        boolean z;
        boolean z2;
        int i2;
        int L;
        StaticLayout f5;
        float f;
        float f2;
        float f3;
        CharSequence charSequence2;
        int i3;
        int L2;
        boolean z3;
        ArrayList arrayList;
        float f4;
        boolean z4;
        int i4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        TextPaint textPaint2;
        int i5;
        int c;
        int i6;
        CharSequence charSequence3;
        ArrayList arrayList2;
        boolean z9;
        boolean z10;
        float f6;
        boolean z11;
        SpannableString b;
        StaticLayout staticLayout;
        int lineCount;
        int i7;
        int ceil;
        int i8;
        int max;
        int c2;
        float f7;
        float f8;
        boolean z12;
        float f9;
        int i9;
        int i10;
        int c3;
        int i11;
        float lineLeft;
        int i12;
        TLRPC.Message message;
        CharSequence charSequence4 = charSequence;
        this.a = charSequence4;
        this.c = 0;
        boolean z13 = (r47Var == null || (message = r47Var.k) == null || !message.noforwards) ? false : true;
        if (r47Var != null && !z13) {
            z13 = uc7.s1(r47Var.K1).E2(r47.B0(r47Var.k));
        }
        boolean z14 = z13;
        boolean z15 = r47Var != null && r47Var.P2() && !r47Var.O3() && textPaint == aob.o2;
        boolean z16 = charSequence4 instanceof Spanned;
        this.f = z16 && ((jk2[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), jk2.class)).length > 0;
        this.i = z16 && ((q19[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), q19.class)).length > 0;
        this.k = false;
        this.h = false;
        if (z16) {
            Spanned spanned = (Spanned) charSequence4;
            r19[] r19VarArr = (r19[]) spanned.getSpans(0, spanned.length(), r19.class);
            for (r19 r19Var : r19VarArr) {
                r19Var.b = false;
            }
            z2 = r19VarArr.length == 1 && spanned.getSpanStart(r19VarArr[0]) == 0 && spanned.getSpanEnd(r19VarArr[0]) == spanned.length();
            this.k = z2;
            jk2[] jk2VarArr = (jk2[]) spanned.getSpans(0, spanned.length(), jk2.class);
            z = jk2VarArr.length == 1 && spanned.getSpanStart(jk2VarArr[0]) == 0 && spanned.getSpanEnd(jk2VarArr[0]) == spanned.length();
            this.h = z;
        } else {
            z = false;
            z2 = false;
        }
        try {
            if (z2) {
                L = hl.L(32.0f);
            } else {
                if (!z) {
                    i2 = i;
                    f5 = r47.f5(1.0f, 0.0f, i2, Layout.Alignment.ALIGN_NORMAL, textPaint, charSequence4, false);
                    if (r47Var != null && r47Var.j2) {
                        i12 = r47Var.D == 0 ? r47Var.z2() ? 7 : 12 : 22;
                        i12 = r47Var.Y4() ? i12 - 8 : i12;
                        if (f5.getLineCount() > i12) {
                            String M0 = ob6.M0(2131746098, null);
                            f = 15.0f;
                            f2 = 32.0f;
                            int ceil2 = (int) Math.ceil(textPaint.measureText("… ".concat(M0)) + hl.L(1.0f));
                            float f10 = 0.0f;
                            for (int i13 = 0; i13 < i12; i13++) {
                                f10 = Math.max(f10, f5.getLineRight(i13));
                            }
                            int i14 = i12 - 1;
                            int lineStart = f5.getLineStart(i14);
                            int lineEnd = f5.getLineEnd(i14) - 1;
                            while (lineEnd >= lineStart && f5.getPrimaryHorizontal(lineEnd) >= f10 - ceil2) {
                                lineEnd--;
                            }
                            while (lineEnd >= lineStart && !Character.isWhitespace(charSequence4.charAt(lineEnd))) {
                                lineEnd--;
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(charSequence4.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) M0);
                            append.setSpan(new p37((byte) 2), append.length() - M0.length(), append.length(), 33);
                            try {
                                f3 = 0.0f;
                                f5 = r47.f5(1.0f, 0.0f, i2, Layout.Alignment.ALIGN_NORMAL, textPaint, append, false);
                                charSequence2 = append;
                                if (this.k) {
                                    L2 = hl.L(f2);
                                } else {
                                    if (!this.h) {
                                        i3 = i2;
                                        int lineCount2 = f5.getLineCount();
                                        z3 = Build.VERSION.SDK_INT < 24;
                                        int ceil3 = !z3 ? 1 : (int) Math.ceil(lineCount2 / 10.0f);
                                        arrayList = new ArrayList();
                                        if (!(charSequence2 instanceof Spanned) && (this.i || this.f)) {
                                            r47.R((Spanned) charSequence2, arrayList);
                                        } else {
                                            if (!z3 || ceil3 == 1) {
                                                f4 = f3;
                                                z4 = false;
                                                arrayList.add(new q47(0, f5.getText().length()));
                                                int size = arrayList.size();
                                                this.g = z4;
                                                this.j = z4;
                                                this.k = z4;
                                                int i15 = i2;
                                                i4 = 0;
                                                StaticLayout staticLayout2 = f5;
                                                CharSequence charSequence5 = charSequence2;
                                                while (i4 < arrayList.size()) {
                                                    o47 o47Var = new o47();
                                                    q47 q47Var = (q47) arrayList.get(i4);
                                                    boolean z17 = q47Var.d;
                                                    String str = q47Var.f;
                                                    int i16 = q47Var.a;
                                                    StaticLayout staticLayout3 = staticLayout2;
                                                    int i17 = q47Var.b;
                                                    o47Var.I = z17;
                                                    o47Var.J = q47Var.c;
                                                    boolean z18 = q47Var.e;
                                                    o47Var.K = z18;
                                                    if (z18) {
                                                        o47Var.F = r47Var;
                                                    }
                                                    o47Var.c = i4;
                                                    o47Var.a = i4 == 0;
                                                    boolean z19 = i4 == arrayList.size() + (-1);
                                                    o47Var.b = z19;
                                                    if (z19) {
                                                        this.j = o47Var.J;
                                                        this.g = o47Var.I;
                                                    }
                                                    boolean z20 = o47Var.a;
                                                    if (z20 && z19) {
                                                        z5 = z19;
                                                        if (o47Var.J) {
                                                            z6 = true;
                                                            this.k = z6;
                                                            float f11 = 8.0f;
                                                            if (!o47Var.J) {
                                                                if (!z20) {
                                                                    f11 = 6.0f;
                                                                } else if (z5) {
                                                                    int L3 = hl.L(6.0f);
                                                                    o47Var.h = L3;
                                                                    o47Var.f = L3;
                                                                }
                                                                o47Var.f = hl.L(f11);
                                                                o47Var.h = hl.L(7.0f);
                                                            } else if (o47Var.I) {
                                                                if (z15) {
                                                                    o47Var.n(str, z14);
                                                                    o47Var.f = o47Var.g() + (o47Var.a ? 0 : hl.L(8.0f));
                                                                    o47Var.h = hl.L(12.0f) + (o47Var.b ? 0 : hl.L(8.0f));
                                                                } else {
                                                                    o47Var.m(i17 - i16, str, z14);
                                                                    o47Var.f = hl.L(4.0f) + o47Var.N + (o47Var.a ? 0 : hl.L(5.0f));
                                                                    o47Var.h = hl.L(4.0f) + (o47Var.b ? 0 : hl.L(7.0f)) + (o47Var.O ? hl.L(38.0f) : 0);
                                                                }
                                                            }
                                                            z7 = o47Var.I;
                                                            if (z7) {
                                                                z8 = z7;
                                                                textPaint2 = textPaint;
                                                            } else {
                                                                int i18 = i17 - i16;
                                                                z8 = z7;
                                                                textPaint2 = i18 > 220 ? aob.r2 : i18 > 80 ? aob.q2 : aob.p2;
                                                            }
                                                            if (!o47Var.J) {
                                                                c = hl.L(f2);
                                                            } else if (z8) {
                                                                c = o47Var.c();
                                                            } else {
                                                                i5 = i3;
                                                                if (size == 1) {
                                                                    if (o47Var.I && !o47Var.J && (staticLayout3.getText() instanceof Spannable)) {
                                                                        SpannableString b2 = !TextUtils.isEmpty(str) ? mk2.b(charSequence5.subSequence(i16, i17).toString(), str) : new SpannableString(charSequence5.subSequence(i16, i17));
                                                                        o47Var.s = i5;
                                                                        staticLayout = r47.f5(1.0f, 0.0f, i5, Layout.Alignment.ALIGN_NORMAL, textPaint2, b2, false);
                                                                        i15 = i5;
                                                                    } else {
                                                                        o47Var.s = i15;
                                                                        staticLayout = staticLayout3;
                                                                    }
                                                                    o47Var.e = staticLayout;
                                                                    o47Var.n = 0;
                                                                    o47Var.r = staticLayout.getText().length();
                                                                    o47Var.w = staticLayout.getHeight();
                                                                    o47Var.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, o47Var.w);
                                                                } else {
                                                                    if (i17 < i16) {
                                                                        i6 = size;
                                                                        charSequence3 = charSequence5;
                                                                        arrayList2 = arrayList;
                                                                        z9 = z14;
                                                                        z10 = z15;
                                                                        f6 = f4;
                                                                    } else {
                                                                        o47Var.n = i16;
                                                                        o47Var.r = i17;
                                                                        try {
                                                                            if (o47Var.I) {
                                                                                try {
                                                                                    if (!o47Var.J) {
                                                                                        b = mk2.b(charSequence5.subSequence(i16, i17).toString(), str);
                                                                                        o47Var.s = i5;
                                                                                        StaticLayout f52 = r47.f5(1.0f, 0.0f, i5, Layout.Alignment.ALIGN_NORMAL, textPaint2, b, false);
                                                                                        o47Var.e = f52;
                                                                                        o47Var.w = f52.getHeight();
                                                                                        o47Var.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, o47Var.w);
                                                                                        staticLayout = staticLayout3;
                                                                                    }
                                                                                } catch (Exception e) {
                                                                                    e = e;
                                                                                    i6 = size;
                                                                                    charSequence3 = charSequence5;
                                                                                    arrayList2 = arrayList;
                                                                                    z9 = z14;
                                                                                    z10 = z15;
                                                                                    z11 = true;
                                                                                    f6 = f4;
                                                                                    cc4.g(e, z11);
                                                                                    staticLayout2 = staticLayout3;
                                                                                    i4++;
                                                                                    f4 = f6;
                                                                                    charSequence5 = charSequence3;
                                                                                    arrayList = arrayList2;
                                                                                    z14 = z9;
                                                                                    z15 = z10;
                                                                                    size = i6;
                                                                                }
                                                                            }
                                                                            b = SpannableString.valueOf(charSequence5.subSequence(i16, i17));
                                                                            o47Var.s = i5;
                                                                            StaticLayout f522 = r47.f5(1.0f, 0.0f, i5, Layout.Alignment.ALIGN_NORMAL, textPaint2, b, false);
                                                                            o47Var.e = f522;
                                                                            o47Var.w = f522.getHeight();
                                                                            o47Var.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, o47Var.w);
                                                                            staticLayout = staticLayout3;
                                                                        } catch (Exception e2) {
                                                                            e = e2;
                                                                            i6 = size;
                                                                            charSequence3 = charSequence5;
                                                                            arrayList2 = arrayList;
                                                                            z9 = z14;
                                                                            z10 = z15;
                                                                            f6 = f4;
                                                                            z11 = true;
                                                                        }
                                                                    }
                                                                    staticLayout2 = staticLayout3;
                                                                    i4++;
                                                                    f4 = f6;
                                                                    charSequence5 = charSequence3;
                                                                    arrayList = arrayList2;
                                                                    z14 = z9;
                                                                    z15 = z10;
                                                                    size = i6;
                                                                }
                                                                if (o47Var.I && (o47Var.e.getText() instanceof Spannable) && TextUtils.isEmpty(str)) {
                                                                    mk2.c((Spannable) o47Var.e.getText(), o47Var.e.getText().length(), str);
                                                                }
                                                                this.e.add(o47Var);
                                                                lineCount = o47Var.e.getLineCount();
                                                                lineLeft = o47Var.e.getLineLeft(lineCount - 1);
                                                                if (i4 == 0 && lineLeft >= f4) {
                                                                    this.d = lineLeft;
                                                                }
                                                                float f12 = lineLeft;
                                                                float f13 = o47Var.e.getLineWidth(lineCount - 1);
                                                                int i19 = size;
                                                                staticLayout3 = staticLayout;
                                                                int ceil4 = (int) Math.ceil(f13);
                                                                ceil4 = ceil4 > i3 + 80 ? i3 : ceil4;
                                                                i7 = i19 - 1;
                                                                if (i4 == i7) {
                                                                    this.b = ceil4;
                                                                }
                                                                float f14 = ceil4;
                                                                int i20 = i15;
                                                                charSequence3 = charSequence5;
                                                                ceil = (int) Math.ceil(Math.max(0.0f, f12) + f14);
                                                                if (o47Var.J) {
                                                                    o47Var.E = 0.0f;
                                                                    int i21 = 0;
                                                                    while (i21 < lineCount) {
                                                                        try {
                                                                            i11 = ceil4;
                                                                            try {
                                                                                o47Var.E = Math.max(o47Var.E, o47Var.e.getLineRight(i21));
                                                                            } catch (Exception unused) {
                                                                                o47Var.E = this.c;
                                                                                i21++;
                                                                                ceil4 = i11;
                                                                            }
                                                                        } catch (Exception unused2) {
                                                                            i11 = ceil4;
                                                                        }
                                                                        i21++;
                                                                        ceil4 = i11;
                                                                    }
                                                                }
                                                                int i22 = ceil4;
                                                                arrayList2 = arrayList;
                                                                if (lineCount > 1) {
                                                                    int i23 = i22;
                                                                    int i24 = 0;
                                                                    float f15 = 0.0f;
                                                                    float f16 = 0.0f;
                                                                    boolean z21 = false;
                                                                    int i25 = ceil;
                                                                    while (i24 < lineCount) {
                                                                        int i26 = lineCount;
                                                                        try {
                                                                            f7 = o47Var.e.getLineWidth(i24);
                                                                        } catch (Exception unused3) {
                                                                            f7 = 0.0f;
                                                                        }
                                                                        if (o47Var.J) {
                                                                            c3 = hl.L(f2);
                                                                        } else {
                                                                            c3 = o47Var.I ? o47Var.c() : c3;
                                                                            float f17 = o47Var.e.getLineLeft(i24);
                                                                            float f18 = f17;
                                                                            if (f7 <= i3 + 20) {
                                                                                z12 = z14;
                                                                                f9 = i3;
                                                                                f8 = 0.0f;
                                                                            } else {
                                                                                f8 = f18;
                                                                                z12 = z14;
                                                                                f9 = f7;
                                                                            }
                                                                            boolean z22 = z15;
                                                                            if (f8 > 0.0f) {
                                                                                i9 = i19;
                                                                                if (o47Var.e.getParagraphDirection(i24) != -1) {
                                                                                    o47Var.x = (byte) (o47Var.x | 2);
                                                                                    i10 = 1;
                                                                                    if (z21 && f8 == 0.0f) {
                                                                                        try {
                                                                                            if (o47Var.e.getParagraphDirection(i24) != i10) {
                                                                                            }
                                                                                        } catch (Exception unused4) {
                                                                                        }
                                                                                        z21 = true;
                                                                                    }
                                                                                    f16 = Math.max(f16, f9);
                                                                                    float f19 = f8 + f9;
                                                                                    f15 = Math.max(f15, f19);
                                                                                    i23 = Math.max(i23, (int) Math.ceil(f9));
                                                                                    i25 = Math.max(i25, (int) Math.ceil(f19));
                                                                                    i24++;
                                                                                    lineCount = i26;
                                                                                    z14 = z12;
                                                                                    z15 = z22;
                                                                                    i19 = i9;
                                                                                }
                                                                            } else {
                                                                                i9 = i19;
                                                                            }
                                                                            this.d = Math.min(this.d, f8);
                                                                            i10 = 1;
                                                                            o47Var.x = (byte) (o47Var.x | 1);
                                                                            if (z21) {
                                                                                if (o47Var.e.getParagraphDirection(i24) != i10) {
                                                                                }
                                                                                z21 = true;
                                                                            }
                                                                            f16 = Math.max(f16, f9);
                                                                            float f192 = f8 + f9;
                                                                            f15 = Math.max(f15, f192);
                                                                            i23 = Math.max(i23, (int) Math.ceil(f9));
                                                                            i25 = Math.max(i25, (int) Math.ceil(f192));
                                                                            i24++;
                                                                            lineCount = i26;
                                                                            z14 = z12;
                                                                            z15 = z22;
                                                                            i19 = i9;
                                                                        }
                                                                        f7 += c3;
                                                                        float f172 = o47Var.e.getLineLeft(i24);
                                                                        float f182 = f172;
                                                                        if (f7 <= i3 + 20) {
                                                                        }
                                                                        boolean z222 = z15;
                                                                        if (f8 > 0.0f) {
                                                                        }
                                                                        this.d = Math.min(this.d, f8);
                                                                        i10 = 1;
                                                                        o47Var.x = (byte) (o47Var.x | 1);
                                                                        if (z21) {
                                                                        }
                                                                        f16 = Math.max(f16, f9);
                                                                        float f1922 = f8 + f9;
                                                                        f15 = Math.max(f15, f1922);
                                                                        i23 = Math.max(i23, (int) Math.ceil(f9));
                                                                        i25 = Math.max(i25, (int) Math.ceil(f1922));
                                                                        i24++;
                                                                        lineCount = i26;
                                                                        z14 = z12;
                                                                        z15 = z222;
                                                                        i19 = i9;
                                                                    }
                                                                    z9 = z14;
                                                                    z10 = z15;
                                                                    i6 = i19;
                                                                    if (!z21) {
                                                                        if (i4 == i7) {
                                                                            this.b = i23;
                                                                        }
                                                                        f15 = f16;
                                                                    } else if (i4 == i7) {
                                                                        this.b = ceil;
                                                                    }
                                                                    max = Math.max(this.c, (int) Math.ceil(f15));
                                                                    this.c = max;
                                                                    ceil = i25;
                                                                    f6 = 0.0f;
                                                                } else {
                                                                    z9 = z14;
                                                                    z10 = z15;
                                                                    i6 = i19;
                                                                    f6 = 0.0f;
                                                                    if (f12 > 0.0f) {
                                                                        float min = Math.min(this.d, f12);
                                                                        this.d = min;
                                                                        i8 = min == 0.0f ? (int) (f14 + f12) : i22;
                                                                        o47Var.x = (byte) (o47Var.x | 1);
                                                                    } else {
                                                                        o47Var.x = (byte) (o47Var.x | 2);
                                                                        i8 = i22;
                                                                    }
                                                                    max = Math.max(this.c, Math.min(i3, i8));
                                                                    this.c = max;
                                                                }
                                                                if (o47Var.V) {
                                                                    this.c = Math.max(max, i3);
                                                                } else {
                                                                    pkb pkbVar = o47Var.M;
                                                                    if (pkbVar != null) {
                                                                        this.c = (int) Math.max(max, Math.min(pkbVar.c + hl.L(f), o47Var.e == null ? f6 : r8.getWidth()));
                                                                    }
                                                                }
                                                                if (r47Var != null && !r47Var.N0 && !r47Var.K2) {
                                                                    if (o47Var.J) {
                                                                        c2 = o47Var.I ? o47Var.c() : c2;
                                                                        npa.b(null, o47Var.e, -1, ceil, null, o47Var.y);
                                                                    } else {
                                                                        c2 = hl.L(f2);
                                                                    }
                                                                    ceil -= c2;
                                                                    npa.b(null, o47Var.e, -1, ceil, null, o47Var.y);
                                                                }
                                                                i15 = i20;
                                                                staticLayout2 = staticLayout3;
                                                                i4++;
                                                                f4 = f6;
                                                                charSequence5 = charSequence3;
                                                                arrayList = arrayList2;
                                                                z14 = z9;
                                                                z15 = z10;
                                                                size = i6;
                                                            }
                                                            i5 = i3 - c;
                                                            if (size == 1) {
                                                            }
                                                            if (o47Var.I) {
                                                                mk2.c((Spannable) o47Var.e.getText(), o47Var.e.getText().length(), str);
                                                            }
                                                            this.e.add(o47Var);
                                                            lineCount = o47Var.e.getLineCount();
                                                            lineLeft = o47Var.e.getLineLeft(lineCount - 1);
                                                            if (i4 == 0) {
                                                                this.d = lineLeft;
                                                            }
                                                            float f122 = lineLeft;
                                                            float f132 = o47Var.e.getLineWidth(lineCount - 1);
                                                            int i192 = size;
                                                            staticLayout3 = staticLayout;
                                                            int ceil42 = (int) Math.ceil(f132);
                                                            if (ceil42 > i3 + 80) {
                                                            }
                                                            i7 = i192 - 1;
                                                            if (i4 == i7) {
                                                            }
                                                            float f142 = ceil42;
                                                            int i202 = i15;
                                                            charSequence3 = charSequence5;
                                                            ceil = (int) Math.ceil(Math.max(0.0f, f122) + f142);
                                                            if (o47Var.J) {
                                                            }
                                                            int i222 = ceil42;
                                                            arrayList2 = arrayList;
                                                            if (lineCount > 1) {
                                                            }
                                                            if (o47Var.V) {
                                                            }
                                                            if (r47Var != null) {
                                                                if (o47Var.J) {
                                                                }
                                                                ceil -= c2;
                                                                npa.b(null, o47Var.e, -1, ceil, null, o47Var.y);
                                                            }
                                                            i15 = i202;
                                                            staticLayout2 = staticLayout3;
                                                            i4++;
                                                            f4 = f6;
                                                            charSequence5 = charSequence3;
                                                            arrayList = arrayList2;
                                                            z14 = z9;
                                                            z15 = z10;
                                                            size = i6;
                                                        }
                                                    } else {
                                                        z5 = z19;
                                                    }
                                                    z6 = false;
                                                    this.k = z6;
                                                    float f112 = 8.0f;
                                                    if (!o47Var.J) {
                                                    }
                                                    z7 = o47Var.I;
                                                    if (z7) {
                                                    }
                                                    if (!o47Var.J) {
                                                    }
                                                    i5 = i3 - c;
                                                    if (size == 1) {
                                                    }
                                                    if (o47Var.I) {
                                                    }
                                                    this.e.add(o47Var);
                                                    lineCount = o47Var.e.getLineCount();
                                                    lineLeft = o47Var.e.getLineLeft(lineCount - 1);
                                                    if (i4 == 0) {
                                                    }
                                                    float f1222 = lineLeft;
                                                    float f1322 = o47Var.e.getLineWidth(lineCount - 1);
                                                    int i1922 = size;
                                                    staticLayout3 = staticLayout;
                                                    int ceil422 = (int) Math.ceil(f1322);
                                                    if (ceil422 > i3 + 80) {
                                                    }
                                                    i7 = i1922 - 1;
                                                    if (i4 == i7) {
                                                    }
                                                    float f1422 = ceil422;
                                                    int i2022 = i15;
                                                    charSequence3 = charSequence5;
                                                    ceil = (int) Math.ceil(Math.max(0.0f, f1222) + f1422);
                                                    if (o47Var.J) {
                                                    }
                                                    int i2222 = ceil422;
                                                    arrayList2 = arrayList;
                                                    if (lineCount > 1) {
                                                    }
                                                    if (o47Var.V) {
                                                    }
                                                    if (r47Var != null) {
                                                    }
                                                    i15 = i2022;
                                                    staticLayout2 = staticLayout3;
                                                    i4++;
                                                    f4 = f6;
                                                    charSequence5 = charSequence3;
                                                    arrayList = arrayList2;
                                                    z14 = z9;
                                                    z15 = z10;
                                                    size = i6;
                                                }
                                                return;
                                            }
                                            int i27 = 0;
                                            int i28 = 0;
                                            while (i27 < ceil3) {
                                                int min2 = Math.min(10, lineCount2 - i28);
                                                int lineStart2 = f5.getLineStart(i28);
                                                int i29 = min2 + i28;
                                                float f20 = f3;
                                                int lineEnd2 = f5.getLineEnd(i29 - 1);
                                                if (lineEnd2 >= lineStart2) {
                                                    arrayList.add(new q47(lineStart2, lineEnd2));
                                                    i28 = i29;
                                                }
                                                i27++;
                                                f3 = f20;
                                            }
                                        }
                                        f4 = f3;
                                        z4 = false;
                                        int size2 = arrayList.size();
                                        this.g = z4;
                                        this.j = z4;
                                        this.k = z4;
                                        int i152 = i2;
                                        i4 = 0;
                                        StaticLayout staticLayout22 = f5;
                                        CharSequence charSequence52 = charSequence2;
                                        while (i4 < arrayList.size()) {
                                        }
                                        return;
                                    }
                                    L2 = hl.L(f);
                                }
                                i3 = L2 + i2;
                                int lineCount22 = f5.getLineCount();
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                if (!z3) {
                                }
                                arrayList = new ArrayList();
                                if (!(charSequence2 instanceof Spanned)) {
                                }
                                if (z3) {
                                }
                                f4 = f3;
                                z4 = false;
                                arrayList.add(new q47(0, f5.getText().length()));
                                int size22 = arrayList.size();
                                this.g = z4;
                                this.j = z4;
                                this.k = z4;
                                int i1522 = i2;
                                i4 = 0;
                                StaticLayout staticLayout222 = f5;
                                CharSequence charSequence522 = charSequence2;
                                while (i4 < arrayList.size()) {
                                }
                                return;
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                                return;
                            }
                        }
                    }
                    f = 15.0f;
                    f2 = 32.0f;
                    f3 = 0.0f;
                    charSequence2 = charSequence4;
                    if (this.k) {
                    }
                    i3 = L2 + i2;
                    int lineCount222 = f5.getLineCount();
                    if (Build.VERSION.SDK_INT < 24) {
                    }
                    if (!z3) {
                    }
                    arrayList = new ArrayList();
                    if (!(charSequence2 instanceof Spanned)) {
                    }
                    if (z3) {
                    }
                    f4 = f3;
                    z4 = false;
                    arrayList.add(new q47(0, f5.getText().length()));
                    int size222 = arrayList.size();
                    this.g = z4;
                    this.j = z4;
                    this.k = z4;
                    int i15222 = i2;
                    i4 = 0;
                    StaticLayout staticLayout2222 = f5;
                    CharSequence charSequence5222 = charSequence2;
                    while (i4 < arrayList.size()) {
                    }
                    return;
                }
                L = hl.L(15.0f);
            }
            f5 = r47.f5(1.0f, 0.0f, i2, Layout.Alignment.ALIGN_NORMAL, textPaint, charSequence4, false);
            if (r47Var != null) {
                if (r47Var.D == 0) {
                }
                if (r47Var.Y4()) {
                }
                if (f5.getLineCount() > i12) {
                }
            }
            f = 15.0f;
            f2 = 32.0f;
            f3 = 0.0f;
            charSequence2 = charSequence4;
            if (this.k) {
            }
            i3 = L2 + i2;
            int lineCount2222 = f5.getLineCount();
            if (Build.VERSION.SDK_INT < 24) {
            }
            if (!z3) {
            }
            arrayList = new ArrayList();
            if (!(charSequence2 instanceof Spanned)) {
            }
            if (z3) {
            }
            f4 = f3;
            z4 = false;
            arrayList.add(new q47(0, f5.getText().length()));
            int size2222 = arrayList.size();
            this.g = z4;
            this.j = z4;
            this.k = z4;
            int i152222 = i2;
            i4 = 0;
            StaticLayout staticLayout22222 = f5;
            CharSequence charSequence52222 = charSequence2;
            while (i4 < arrayList.size()) {
            }
            return;
        } catch (Exception e4) {
            cc4.g(e4, true);
            return;
        }
        i2 = i - L;
    }

    public final void a(p47 p47Var) {
        if (p47Var == null) {
            return;
        }
        ArrayList arrayList = p47Var.e;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= Math.min(arrayList2.size(), arrayList.size())) {
                return;
            }
            ((o47) arrayList2.get(i)).H = ((o47) arrayList.get(i)).H;
            i++;
        }
    }

    public final int b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return i2;
            }
            int i3 = ((o47) arrayList.get(i)).f;
            o47 o47Var = (o47) arrayList.get(i);
            i2 += ((o47Var.K && o47Var.f()) ? o47Var.G : o47Var.w) + i3 + ((o47) arrayList.get(i)).h;
            i++;
        }
    }

    public final int c(dc2 dc2Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return i2;
            }
            i2 += ((o47) arrayList.get(i)).j(dc2Var) + ((o47) arrayList.get(i)).f + ((o47) arrayList.get(i)).h;
            i++;
        }
    }
}
