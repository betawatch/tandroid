package wh;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.i10;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u01;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public abstract class x5 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i10, TL_iv.PageBlock pageBlock, boolean z4) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i11 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i11 < size) {
                TL_iv.RichText richText2 = arrayList.get(i11);
                i11++;
                a(spannableStringBuilder, richText2, i10, pageBlock, z4);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j10 = j(textdiff.text);
            boolean j11 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j10) {
                a(spannableStringBuilder, textdiff.old_text, i10, pageBlock, z4);
                if (spannableStringBuilder.length() > length) {
                    t01 t01Var = new t01();
                    t01Var.a = 8192;
                    spannableStringBuilder.setSpan(new u01(t01Var, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i10, pageBlock, z4);
            if (!j11) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new dw0(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    t01 t01Var2 = new t01();
                    t01Var2.a = 4096;
                    spannableStringBuilder.setSpan(new u01(t01Var2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i10, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            u5Var.cacheType = org.telegram.ui.Components.l5.g();
            spannableStringBuilder.setSpan(u5Var, length2, spannableStringBuilder.length(), 33);
            if (i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i10, pageBlock, z4);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i10, pageBlock, z4);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                t01 t01Var3 = new t01();
                t01Var3.a |= 128;
                spannableStringBuilder.setSpan(new i10(charSequence2, t01Var3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a2 = s.a(textmath.source, k6.w0(null, k6.G6, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
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
            if (spannableStringBuilder.length() <= length5 || i10 == 0) {
                return;
            }
            spannableStringBuilder.setSpan(p(i10, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i10, pageBlock, z4);
            if (z4 && spannableStringBuilder.length() > length7 && e4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new e4(textbutton), length7, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i11 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i11 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i11 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i11 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i11 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i11 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i11 = 16384;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i11 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i11 = 65536;
        }
        if (i11 != 0) {
            a(spannableStringBuilder, richText.text, i10 | i11, pageBlock, z4);
        } else {
            b(spannableStringBuilder, l(richText), i10, pageBlock);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i10, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i10 != 0) {
            spannableStringBuilder.setSpan(p(i10, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void c(Spannable spannable, int i10, int i11, int i12, TL_iv.PageBlock pageBlock) {
        if (i10 >= i11 || i12 == 0) {
            return;
        }
        spannable.setSpan(p(i12, pageBlock), i10, i11, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(CharSequence charSequence) {
        int i10;
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(0, charSequence.length(), org.telegram.ui.Components.u5.class);
        for (org.telegram.ui.Components.u5 u5Var : u5VarArr) {
            arrayList.add(u5Var);
        }
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
            int spanStart = spanned.getSpanStart(emojiSpan);
            int spanEnd = spanned.getSpanEnd(emojiSpan);
            int length = u5VarArr.length;
            while (true) {
                if (i10 >= length) {
                    arrayList.add(emojiSpan);
                    break;
                }
                org.telegram.ui.Components.u5 u5Var2 = u5VarArr[i10];
                i10 = (spanned.getSpanStart(u5Var2) == spanStart && spanned.getSpanEnd(u5Var2) == spanEnd) ? 0 : i10 + 1;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                if (spanned.getSpanStart(obj) > i11 || spanned.getSpanEnd(obj) <= i11) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int e(Spanned spanned, int i10, int i11) {
        u01[] u01VarArr = (u01[]) spanned.getSpans(i10, i11, u01.class);
        int i12 = 0;
        for (u01 u01Var : u01VarArr) {
            int i13 = u01Var.b.a;
            if ((i13 & 512) != 0) {
                i13 |= 256;
            }
            i12 |= i13;
        }
        return 114975 & i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r4.c != r8.c) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText f(CharSequence charSequence) {
        int i10;
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
        w5 w5Var = null;
        int i11 = 0;
        while (i10 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i10, length, CharacterStyle.class);
            w5 w5Var2 = new w5();
            w5Var2.a = e(spanned, i10, nextSpanTransition);
            if (((m51[]) spanned.getSpans(i10, nextSpanTransition, m51.class)).length > 0) {
                w5Var2.a |= 4;
            }
            p51[] p51VarArr = (p51[]) spanned.getSpans(i10, nextSpanTransition, p51.class);
            if (p51VarArr.length > 0) {
                w5Var2.b = p51VarArr[0].getURL();
            }
            i10[] i10VarArr = (i10[]) spanned.getSpans(i10, nextSpanTransition, i10.class);
            if (i10VarArr.length > 0) {
                w5Var2.c = i10VarArr[0];
            }
            org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spanned.getSpans(i10, nextSpanTransition, org.telegram.ui.Components.u5.class);
            if (u5VarArr.length > 0) {
                w5Var2.d = u5VarArr[0].getDocumentId();
            }
            s[] sVarArr = (s[]) spanned.getSpans(i10, nextSpanTransition, s.class);
            if (sVarArr.length > 0) {
                w5Var2.e = sVarArr[0].a;
            }
            e4[] e4VarArr = (e4[]) spanned.getSpans(i10, nextSpanTransition, e4.class);
            if (e4VarArr.length > 0) {
                w5Var2.f = e4VarArr[0];
            }
            if (w5Var != null) {
                e4 e4Var = w5Var.f;
                if (e4Var == null && w5Var2.f == null) {
                    if (w5Var.d == 0 && w5Var2.d == 0 && w5Var.e == null && w5Var2.e == null && w5Var.a == w5Var2.a) {
                        if ((r9 = w5Var.b) == null) {
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i11, i10).toString(), w5Var));
                    i11 = i10;
                } else {
                    i10 = (e4Var != null && e4Var == w5Var2.f) ? nextSpanTransition : 0;
                    arrayList.add(s(charSequence.subSequence(i11, i10).toString(), w5Var));
                    i11 = i10;
                }
            }
            w5Var = w5Var2;
        }
        String charSequence3 = charSequence.subSequence(i11, length).toString();
        if (w5Var == null) {
            w5Var = new w5();
        }
        arrayList.add(s(charSequence3, w5Var));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static boolean g(Editable editable, int i10, int i11) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2 && e2.c.s(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, i10.class);
                if (((i10[]) editable.getSpans(max, nextSpanTransition, i10.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i10, int i11) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max < max2 && e2.c.s(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, p51.class);
                if (((p51[]) editable.getSpans(max, nextSpanTransition, p51.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i10, int i11, int i12, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, u01.class);
            if ((e(spanned, max, nextSpanTransition) & i12) == 0) {
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
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            if (!j(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static p51 k(String str) {
        t01 t01Var = new t01();
        t01Var.a = 1024;
        return new p51(str, t01Var);
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
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            sb.append(l(richText2));
        }
        return sb.toString();
    }

    public static void m(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (i10 i10Var : (i10[]) editable.getSpans(max, max2, i10.class)) {
            editable.removeSpan(i10Var);
        }
    }

    public static void n(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (p51 p51Var : (p51[]) editable.getSpans(max, max2, p51.class)) {
            int spanStart = editable.getSpanStart(p51Var);
            int spanEnd = editable.getSpanEnd(p51Var);
            editable.removeSpan(p51Var);
            if (spanStart < max) {
                editable.setSpan(k(p51Var.getURL()), spanStart, max, 33);
            }
            if (spanEnd > max2) {
                editable.setSpan(k(p51Var.getURL()), max2, spanEnd, 33);
            }
        }
    }

    public static void o(Spannable spannable, int i10, int i11, int i12, boolean z4, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (u01 u01Var : (u01[]) spannable.getSpans(max, max2, u01.class)) {
            int spanStart = spannable.getSpanStart(u01Var);
            int spanEnd = spannable.getSpanEnd(u01Var);
            int i13 = u01Var.b.a;
            spannable.removeSpan(u01Var);
            c(spannable, spanStart, max, i13, pageBlock);
            c(spannable, max2, spanEnd, i13, pageBlock);
            c(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z4 ? i13 | i12 : (~i12) & i13, pageBlock);
        }
        if (z4) {
            while (max < max2) {
                int nextSpanTransition = spannable.nextSpanTransition(max, max2, u01.class);
                if (e(spannable, max, nextSpanTransition) == 0) {
                    c(spannable, max, nextSpanTransition, i12, pageBlock);
                }
                max = nextSpanTransition;
            }
        }
    }

    public static u01 p(int i10, TL_iv.PageBlock pageBlock) {
        t01 t01Var = new t01();
        t01Var.a = i10;
        t01Var.e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new u01(t01Var, 0);
    }

    public static int q(int i10, int i11, CharSequence charSequence) {
        int i12 = 0;
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = a[i13];
            if (i(i10, i11, i14, charSequence)) {
                i12 |= i14;
            }
        }
        return i12;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z4) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z4);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, w5 w5Var) {
        TL_iv.RichText richText;
        e4 e4Var = w5Var.f;
        if (e4Var != null) {
            return e4Var.a;
        }
        if (w5Var.e != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = w5Var.e;
            return textmath;
        }
        long j10 = w5Var.d;
        if (j10 != 0) {
            TL_iv.textCustomEmoji textcustomemoji = new TL_iv.textCustomEmoji();
            textcustomemoji.document_id = j10;
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
        int i10 = w5Var.a;
        TL_iv.RichText richText2 = richText;
        if ((i10 & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i10 & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i10 & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i10 & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i10 & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i10 & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i10 & 16384) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i10) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i10 & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (w5Var.b != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = w5Var.b;
            richText11 = texturl;
        }
        i10 i10Var = w5Var.c;
        if (i10Var == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = i10Var.b;
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
