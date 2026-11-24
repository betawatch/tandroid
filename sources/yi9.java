// default package

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class yi9 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, TLObject.FLAG_14, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i, TL_iv.PageBlock pageBlock, boolean z) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i2 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i2 < size) {
                TL_iv.RichText richText2 = arrayList.get(i2);
                i2++;
                a(spannableStringBuilder, richText2, i, pageBlock, z);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j = j(textdiff.text);
            boolean j2 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j) {
                a(spannableStringBuilder, textdiff.old_text, i, pageBlock, z);
                if (spannableStringBuilder.length() > length) {
                    vib vibVar = new vib();
                    vibVar.a = TLObject.FLAG_13;
                    spannableStringBuilder.setSpan(new wib(vibVar, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i, pageBlock, z);
            if (!j2) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new ama(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    vib vibVar2 = new vib();
                    vibVar2.a = TLObject.FLAG_12;
                    spannableStringBuilder.setSpan(new wib(vibVar2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            gm gmVar = new gm(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            gmVar.cacheType = vl.f();
            spannableStringBuilder.setSpan(gmVar, length2, spannableStringBuilder.length(), 33);
            if (i != 0) {
                spannableStringBuilder.setSpan(p(i, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i, pageBlock, z);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i, pageBlock, z);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                vib vibVar3 = new vib();
                vibVar3.a |= 128;
                spannableStringBuilder.setSpan(new im4(charSequence2, vibVar3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a2 = ij6.a(textmath.source, bkb.w0(null, bkb.F6, false), gl.L(gba.S0 + 4));
            if (a2 != null) {
                spannableStringBuilder.setSpan(a2, length5, spannableStringBuilder.length(), 33);
            } else {
                int length6 = spannableStringBuilder.length();
                CharSequence charSequence3 = textmath.source;
                if (charSequence3 == null) {
                    charSequence3 = "";
                }
                spannableStringBuilder.replace(length5, length6, charSequence3);
            }
            if (spannableStringBuilder.length() <= length5 || i == 0) {
                return;
            }
            spannableStringBuilder.setSpan(p(i, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i, pageBlock, z);
            if (z && spannableStringBuilder.length() > length7 && mf9.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new mf9(textbutton), length7, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i2 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i2 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i2 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i2 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i2 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i2 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i2 = TLObject.FLAG_14;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i2 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i2 = 65536;
        }
        if (i2 != 0) {
            a(spannableStringBuilder, richText.text, i | i2, pageBlock, z);
        } else {
            b(spannableStringBuilder, l(richText), i, pageBlock);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i != 0) {
            spannableStringBuilder.setSpan(p(i, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void c(Spannable spannable, int i, int i2, int i3, TL_iv.PageBlock pageBlock) {
        if (i >= i2 || i3 == 0) {
            return;
        }
        spannable.setSpan(p(i3, pageBlock), i, i2, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(CharSequence charSequence) {
        int i;
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        gm[] gmVarArr = (gm[]) spanned.getSpans(0, charSequence.length(), gm.class);
        for (gm gmVar : gmVarArr) {
            arrayList.add(gmVar);
        }
        for (su3 su3Var : (su3[]) spanned.getSpans(0, charSequence.length(), su3.class)) {
            int spanStart = spanned.getSpanStart(su3Var);
            int spanEnd = spanned.getSpanEnd(su3Var);
            int length = gmVarArr.length;
            while (true) {
                if (i >= length) {
                    arrayList.add(su3Var);
                    break;
                }
                gm gmVar2 = gmVarArr[i];
                i = (spanned.getSpanStart(gmVar2) == spanStart && spanned.getSpanEnd(gmVar2) == spanEnd) ? 0 : i + 1;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        while (i2 < charSequence.length()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                if (spanned.getSpanStart(obj) > i2 || spanned.getSpanEnd(obj) <= i2) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int e(Spanned spanned, int i, int i2) {
        wib[] wibVarArr = (wib[]) spanned.getSpans(i, i2, wib.class);
        int i3 = 0;
        for (wib wibVar : wibVarArr) {
            int i4 = wibVar.b.a;
            if ((i4 & 512) != 0) {
                i4 |= 256;
            }
            i3 |= i4;
        }
        return i3 & 114975;
    }

    public static TL_iv.RichText f(CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        if (length == 0) {
            return new TL_iv.textEmpty();
        }
        if (!(charSequence instanceof Spanned)) {
            String charSequence2 = charSequence.toString();
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = charSequence2;
            return textplain;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        xi9 xi9Var = null;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i, length, CharacterStyle.class);
            xi9 xi9Var2 = new xi9();
            xi9Var2.a = e(spanned, i, nextSpanTransition);
            if (((f4c[]) spanned.getSpans(i, nextSpanTransition, f4c.class)).length > 0) {
                xi9Var2.a |= 4;
            }
            i4c[] i4cVarArr = (i4c[]) spanned.getSpans(i, nextSpanTransition, i4c.class);
            if (i4cVarArr.length > 0) {
                xi9Var2.c = i4cVarArr[0].getURL();
            }
            im4[] im4VarArr = (im4[]) spanned.getSpans(i, nextSpanTransition, im4.class);
            if (im4VarArr.length > 0) {
                xi9Var2.e = im4VarArr[0];
            }
            gm[] gmVarArr = (gm[]) spanned.getSpans(i, nextSpanTransition, gm.class);
            if (gmVarArr.length > 0) {
                xi9Var2.b = gmVarArr[0].getDocumentId();
            }
            ij6[] ij6VarArr = (ij6[]) spanned.getSpans(i, nextSpanTransition, ij6.class);
            if (ij6VarArr.length > 0) {
                xi9Var2.d = ij6VarArr[0].a;
            }
            mf9[] mf9VarArr = (mf9[]) spanned.getSpans(i, nextSpanTransition, mf9.class);
            if (mf9VarArr.length > 0) {
                xi9Var2.f = mf9VarArr[0];
            }
            if (xi9Var != null) {
                mf9 mf9Var = (mf9) xi9Var.f;
                mf9 mf9Var2 = (mf9) xi9Var2.f;
                if (mf9Var == null) {
                    if (mf9Var2 == null && xi9Var.b == 0 && xi9Var2.b == 0 && ((String) xi9Var.d) == null && ((String) xi9Var2.d) == null && xi9Var.a == xi9Var2.a) {
                        String str = (String) xi9Var.c;
                        String str2 = (String) xi9Var2.c;
                        if (str != null ? str.equals(str2) : str2 == null) {
                            if (((im4) xi9Var.e) == ((im4) xi9Var2.e)) {
                                i = nextSpanTransition;
                            }
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i2, i).toString(), xi9Var));
                    i2 = i;
                } else {
                    if (mf9Var == mf9Var2) {
                        i = nextSpanTransition;
                    }
                    arrayList.add(s(charSequence.subSequence(i2, i).toString(), xi9Var));
                    i2 = i;
                }
            }
            xi9Var = xi9Var2;
            i = nextSpanTransition;
        }
        String charSequence3 = charSequence.subSequence(i2, length).toString();
        if (xi9Var == null) {
            xi9Var = new xi9();
        }
        arrayList.add(s(charSequence3, xi9Var));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static boolean g(Editable editable, int i, int i2) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2 && ug8.A(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, im4.class);
                if (((im4[]) editable.getSpans(max, nextSpanTransition, im4.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i, int i2) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2 && ug8.A(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, i4c.class);
                if (((i4c[]) editable.getSpans(max, nextSpanTransition, i4c.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i, int i2, int i3, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, wib.class);
            if ((e(spanned, max, nextSpanTransition) & i3) == 0) {
                return false;
            }
            max = nextSpanTransition;
        }
        return true;
    }

    public static boolean j(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return true;
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null || str.isEmpty();
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            return false;
        }
        if (richText instanceof TL_iv.textMath) {
            String str2 = ((TL_iv.textMath) richText).source;
            return str2 == null || str2.isEmpty();
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return j(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return j(textdiff.text) && j(textdiff.old_text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            if (!j(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static i4c k(String str) {
        vib vibVar = new vib();
        vibVar.a = 1024;
        return new i4c(str, vibVar);
    }

    public static String l(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return "";
        }
        if (richText instanceof TL_iv.textPlain) {
            String str = ((TL_iv.textPlain) richText).text;
            return str == null ? "" : str;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            String str2 = ((TL_iv.textCustomEmoji) richText).alt;
            return str2 == null ? "" : str2;
        }
        if (richText instanceof TL_iv.textMath) {
            return " ";
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if (!(richText instanceof TL_iv.textDiff)) {
                return l(richText.text);
            }
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            return j(textdiff.text) ? l(textdiff.old_text) : l(textdiff.text);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            sb.append(l(richText2));
        }
        return sb.toString();
    }

    public static void m(Editable editable, int i, int i2) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2) {
            for (im4 im4Var : (im4[]) editable.getSpans(max, max2, im4.class)) {
                editable.removeSpan(im4Var);
            }
        }
    }

    public static void n(Editable editable, int i, int i2) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2) {
            for (i4c i4cVar : (i4c[]) editable.getSpans(max, max2, i4c.class)) {
                int spanStart = editable.getSpanStart(i4cVar);
                int spanEnd = editable.getSpanEnd(i4cVar);
                editable.removeSpan(i4cVar);
                if (spanStart < max) {
                    editable.setSpan(k(i4cVar.getURL()), spanStart, max, 33);
                }
                if (spanEnd > max2) {
                    editable.setSpan(k(i4cVar.getURL()), max2, spanEnd, 33);
                }
            }
        }
    }

    public static void o(Spannable spannable, int i, int i2, int i3, boolean z, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i, length));
        int max2 = Math.max(0, Math.min(i2, length));
        if (max < max2) {
            for (wib wibVar : (wib[]) spannable.getSpans(max, max2, wib.class)) {
                int spanStart = spannable.getSpanStart(wibVar);
                int spanEnd = spannable.getSpanEnd(wibVar);
                int i4 = wibVar.b.a;
                spannable.removeSpan(wibVar);
                c(spannable, spanStart, max, i4, pageBlock);
                c(spannable, max2, spanEnd, i4, pageBlock);
                c(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z ? i4 | i3 : i4 & (~i3), pageBlock);
            }
            if (z) {
                while (max < max2) {
                    int nextSpanTransition = spannable.nextSpanTransition(max, max2, wib.class);
                    if (e(spannable, max, nextSpanTransition) == 0) {
                        c(spannable, max, nextSpanTransition, i3, pageBlock);
                    }
                    max = nextSpanTransition;
                }
            }
        }
    }

    public static wib p(int i, TL_iv.PageBlock pageBlock) {
        vib vibVar = new vib();
        vibVar.a = i;
        vibVar.e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new wib(vibVar, 0);
    }

    public static int q(int i, int i2, CharSequence charSequence) {
        int i3 = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = a[i4];
            if (i(i, i2, i5, charSequence)) {
                i3 |= i5;
            }
        }
        return i3;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, xi9 xi9Var) {
        TL_iv.RichText richText;
        mf9 mf9Var = (mf9) xi9Var.f;
        if (mf9Var != null) {
            return mf9Var.a;
        }
        if (((String) xi9Var.d) != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = (String) xi9Var.d;
            return textmath;
        }
        long j = xi9Var.b;
        if (j != 0) {
            TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
            textcustomemoji.document_id = j;
            if (str == null) {
                str = "";
            }
            textcustomemoji.alt = str;
            richText = textcustomemoji;
        } else {
            TL_iv.textPlain textplain = new TL_iv.textPlain();
            textplain.text = str;
            richText = textplain;
        }
        int i = xi9Var.a;
        TL_iv.RichText richText2 = richText;
        if ((i & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i & TLObject.FLAG_14) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (((String) xi9Var.c) != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = (String) xi9Var.c;
            richText11 = texturl;
        }
        im4 im4Var = (im4) xi9Var.e;
        if (im4Var == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = im4Var.b;
        TL_iv.textDate textdate = new TL_iv.textDate();
        textdate.text = richText11;
        textdate.flags = tL_messageEntityFormattedDate.flags;
        textdate.relative = tL_messageEntityFormattedDate.relative;
        textdate.short_time = tL_messageEntityFormattedDate.short_time;
        textdate.long_time = tL_messageEntityFormattedDate.long_time;
        textdate.short_date = tL_messageEntityFormattedDate.short_date;
        textdate.long_date = tL_messageEntityFormattedDate.long_date;
        textdate.day_of_week = tL_messageEntityFormattedDate.day_of_week;
        textdate.date = tL_messageEntityFormattedDate.date;
        return textdate;
    }
}
