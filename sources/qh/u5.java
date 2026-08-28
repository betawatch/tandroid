package qh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.Components.wz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class u5 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i9, TL_iv.PageBlock pageBlock, boolean z10) {
        String str;
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return;
        }
        int i10 = 0;
        if (richText instanceof TL_iv.textConcat) {
            ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
            int size = arrayList.size();
            while (i10 < size) {
                TL_iv.RichText richText2 = arrayList.get(i10);
                i10++;
                a(spannableStringBuilder, richText2, i9, pageBlock, z10);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j10 = j(textdiff.text);
            boolean j11 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j10) {
                a(spannableStringBuilder, textdiff.old_text, i9, pageBlock, z10);
                if (spannableStringBuilder.length() > length) {
                    vz0 vz0Var = new vz0();
                    vz0Var.a = 8192;
                    spannableStringBuilder.setSpan(new wz0(vz0Var, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i9, pageBlock, z10);
            if (!j11) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new jv0(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    vz0 vz0Var2 = new vz0();
                    vz0Var2.a = 4096;
                    spannableStringBuilder.setSpan(new wz0(vz0Var2, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
        }
        if (richText instanceof TL_iv.textPlain) {
            b(spannableStringBuilder, ((TL_iv.textPlain) richText).text, i9, pageBlock);
            return;
        }
        if (richText instanceof TL_iv.textCustomEmoji) {
            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
            String str2 = textcustomemoji.alt;
            CharSequence charSequence = (str2 == null || str2.isEmpty()) ? "😀" : textcustomemoji.alt;
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence);
            org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            t5Var.cacheType = org.telegram.ui.Components.k5.g();
            spannableStringBuilder.setSpan(t5Var, length2, spannableStringBuilder.length(), 33);
            if (i9 != 0) {
                spannableStringBuilder.setSpan(p(i9, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i9, pageBlock, z10);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i9, pageBlock, z10);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                vz0 vz0Var3 = new vz0();
                vz0Var3.a |= 128;
                spannableStringBuilder.setSpan(new s00(charSequence2, vz0Var3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a2 = r.a(textmath.source, f6.w0(null, f6.G6, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
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
            if (spannableStringBuilder.length() <= length5 || i9 == 0) {
                return;
            }
            spannableStringBuilder.setSpan(p(i9, pageBlock), length5, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textButton) {
            TL_iv.textButton textbutton = (TL_iv.textButton) richText;
            int length7 = spannableStringBuilder.length();
            a(spannableStringBuilder, textbutton.text, i9, pageBlock, z10);
            if (z10 && spannableStringBuilder.length() > length7 && b4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new b4(textbutton), length7, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textBold) {
            i10 = 1;
        } else if (richText instanceof TL_iv.textItalic) {
            i10 = 2;
        } else if (richText instanceof TL_iv.textUnderline) {
            i10 = 16;
        } else if (richText instanceof TL_iv.textStrike) {
            i10 = 8;
        } else if (richText instanceof TL_iv.textFixed) {
            i10 = 4;
        } else if (richText instanceof TL_iv.textSpoiler) {
            i10 = 256;
        } else if (richText instanceof TL_iv.textSubscript) {
            i10 = 16384;
        } else if (richText instanceof TL_iv.textSuperscript) {
            i10 = 32768;
        } else if (richText instanceof TL_iv.textMarked) {
            i10 = 65536;
        }
        if (i10 != 0) {
            a(spannableStringBuilder, richText.text, i9 | i10, pageBlock, z10);
        } else {
            b(spannableStringBuilder, l(richText), i9, pageBlock);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, String str, int i9, TL_iv.PageBlock pageBlock) {
        if (str == null || str.isEmpty()) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        if (i9 != 0) {
            spannableStringBuilder.setSpan(p(i9, pageBlock), length, spannableStringBuilder.length(), 33);
        }
    }

    public static void c(Spannable spannable, int i9, int i10, int i11, TL_iv.PageBlock pageBlock) {
        if (i9 >= i10 || i11 == 0) {
            return;
        }
        spannable.setSpan(p(i11, pageBlock), i9, i10, 33);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(CharSequence charSequence) {
        int i9;
        if (!(charSequence instanceof Spanned) || charSequence.length() == 0) {
            return 0;
        }
        Spanned spanned = (Spanned) charSequence;
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(0, charSequence.length(), org.telegram.ui.Components.t5.class);
        for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
            arrayList.add(t5Var);
        }
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
            int spanStart = spanned.getSpanStart(emojiSpan);
            int spanEnd = spanned.getSpanEnd(emojiSpan);
            int length = t5VarArr.length;
            while (true) {
                if (i9 >= length) {
                    arrayList.add(emojiSpan);
                    break;
                }
                org.telegram.ui.Components.t5 t5Var2 = t5VarArr[i9];
                i9 = (spanned.getSpanStart(t5Var2) == spanStart && spanned.getSpanEnd(t5Var2) == spanEnd) ? 0 : i9 + 1;
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        int i10 = 0;
        while (i10 < charSequence.length()) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (spanned.getSpanStart(obj) > i10 || spanned.getSpanEnd(obj) <= i10) {
                }
            }
            return 0;
        }
        return arrayList.size();
    }

    public static int e(Spanned spanned, int i9, int i10) {
        wz0[] wz0VarArr = (wz0[]) spanned.getSpans(i9, i10, wz0.class);
        int i11 = 0;
        for (wz0 wz0Var : wz0VarArr) {
            int i12 = wz0Var.b.a;
            if ((i12 & 512) != 0) {
                i12 |= 256;
            }
            i11 |= i12;
        }
        return 114975 & i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r4.c != r8.c) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TL_iv.RichText f(CharSequence charSequence) {
        int i9;
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
        t5 t5Var = null;
        int i10 = 0;
        while (i9 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i9, length, CharacterStyle.class);
            t5 t5Var2 = new t5();
            t5Var2.a = e(spanned, i9, nextSpanTransition);
            if (((o41[]) spanned.getSpans(i9, nextSpanTransition, o41.class)).length > 0) {
                t5Var2.a |= 4;
            }
            r41[] r41VarArr = (r41[]) spanned.getSpans(i9, nextSpanTransition, r41.class);
            if (r41VarArr.length > 0) {
                t5Var2.b = r41VarArr[0].getURL();
            }
            s00[] s00VarArr = (s00[]) spanned.getSpans(i9, nextSpanTransition, s00.class);
            if (s00VarArr.length > 0) {
                t5Var2.c = s00VarArr[0];
            }
            org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i9, nextSpanTransition, org.telegram.ui.Components.t5.class);
            if (t5VarArr.length > 0) {
                t5Var2.d = t5VarArr[0].getDocumentId();
            }
            r[] rVarArr = (r[]) spanned.getSpans(i9, nextSpanTransition, r.class);
            if (rVarArr.length > 0) {
                t5Var2.e = rVarArr[0].a;
            }
            b4[] b4VarArr = (b4[]) spanned.getSpans(i9, nextSpanTransition, b4.class);
            if (b4VarArr.length > 0) {
                t5Var2.f = b4VarArr[0];
            }
            if (t5Var != null) {
                b4 b4Var = t5Var.f;
                if (b4Var == null && t5Var2.f == null) {
                    if (t5Var.d == 0 && t5Var2.d == 0 && t5Var.e == null && t5Var2.e == null && t5Var.a == t5Var2.a) {
                        if ((r9 = t5Var.b) == null) {
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i10, i9).toString(), t5Var));
                    i10 = i9;
                } else {
                    i9 = (b4Var != null && b4Var == t5Var2.f) ? nextSpanTransition : 0;
                    arrayList.add(s(charSequence.subSequence(i10, i9).toString(), t5Var));
                    i10 = i9;
                }
            }
            t5Var = t5Var2;
        }
        String charSequence3 = charSequence.subSequence(i10, length).toString();
        if (t5Var == null) {
            t5Var = new t5();
        }
        arrayList.add(s(charSequence3, t5Var));
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static boolean g(Editable editable, int i9, int i10) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i9, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2 && e2.c.v(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, s00.class);
                if (((s00[]) editable.getSpans(max, nextSpanTransition, s00.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean h(Editable editable, int i9, int i10) {
        int length = editable == null ? 0 : editable.length();
        int max = Math.max(0, Math.min(i9, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max < max2 && e2.c.v(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, r41.class);
                if (((r41[]) editable.getSpans(max, nextSpanTransition, r41.class)).length != 0) {
                    max = nextSpanTransition;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean i(int i9, int i10, int i11, CharSequence charSequence) {
        int length = charSequence == null ? 0 : charSequence.length();
        int max = Math.max(0, Math.min(i9, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2 || !(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        while (max < max2) {
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, wz0.class);
            if ((e(spanned, max, nextSpanTransition) & i11) == 0) {
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
        int i9 = 0;
        while (i9 < size) {
            TL_iv.RichText richText2 = arrayList.get(i9);
            i9++;
            if (!j(richText2)) {
                return false;
            }
        }
        return true;
    }

    public static r41 k(String str) {
        vz0 vz0Var = new vz0();
        vz0Var.a = 1024;
        return new r41(str, vz0Var);
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
        StringBuilder sb2 = new StringBuilder();
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_iv.RichText richText2 = arrayList.get(i9);
            i9++;
            sb2.append(l(richText2));
        }
        return sb2.toString();
    }

    public static void m(Editable editable, int i9, int i10) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i9, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2) {
            return;
        }
        for (s00 s00Var : (s00[]) editable.getSpans(max, max2, s00.class)) {
            editable.removeSpan(s00Var);
        }
    }

    public static void n(Editable editable, int i9, int i10) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i9, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2) {
            return;
        }
        for (r41 r41Var : (r41[]) editable.getSpans(max, max2, r41.class)) {
            int spanStart = editable.getSpanStart(r41Var);
            int spanEnd = editable.getSpanEnd(r41Var);
            editable.removeSpan(r41Var);
            if (spanStart < max) {
                editable.setSpan(k(r41Var.getURL()), spanStart, max, 33);
            }
            if (spanEnd > max2) {
                editable.setSpan(k(r41Var.getURL()), max2, spanEnd, 33);
            }
        }
    }

    public static void o(Spannable spannable, int i9, int i10, int i11, boolean z10, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i9, length));
        int max2 = Math.max(0, Math.min(i10, length));
        if (max >= max2) {
            return;
        }
        for (wz0 wz0Var : (wz0[]) spannable.getSpans(max, max2, wz0.class)) {
            int spanStart = spannable.getSpanStart(wz0Var);
            int spanEnd = spannable.getSpanEnd(wz0Var);
            int i12 = wz0Var.b.a;
            spannable.removeSpan(wz0Var);
            c(spannable, spanStart, max, i12, pageBlock);
            c(spannable, max2, spanEnd, i12, pageBlock);
            c(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z10 ? i12 | i11 : (~i11) & i12, pageBlock);
        }
        if (z10) {
            while (max < max2) {
                int nextSpanTransition = spannable.nextSpanTransition(max, max2, wz0.class);
                if (e(spannable, max, nextSpanTransition) == 0) {
                    c(spannable, max, nextSpanTransition, i11, pageBlock);
                }
                max = nextSpanTransition;
            }
        }
    }

    public static wz0 p(int i9, TL_iv.PageBlock pageBlock) {
        vz0 vz0Var = new vz0();
        vz0Var.a = i9;
        vz0Var.e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new wz0(vz0Var, 0);
    }

    public static int q(int i9, int i10, CharSequence charSequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = a[i12];
            if (i(i9, i10, i13, charSequence)) {
                i11 |= i13;
            }
        }
        return i11;
    }

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z10);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, t5 t5Var) {
        TL_iv.RichText richText;
        b4 b4Var = t5Var.f;
        if (b4Var != null) {
            return b4Var.a;
        }
        if (t5Var.e != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = t5Var.e;
            return textmath;
        }
        long j10 = t5Var.d;
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
        int i9 = t5Var.a;
        TL_iv.RichText richText2 = richText;
        if ((i9 & 1) != 0) {
            TL_iv.RichText textbold = new TL_iv.textBold();
            textbold.text = richText;
            richText2 = textbold;
        }
        TL_iv.RichText richText3 = richText2;
        if ((i9 & 2) != 0) {
            TL_iv.RichText textitalic = new TL_iv.textItalic();
            textitalic.text = richText2;
            richText3 = textitalic;
        }
        TL_iv.RichText richText4 = richText3;
        if ((i9 & 16) != 0) {
            TL_iv.RichText textunderline = new TL_iv.textUnderline();
            textunderline.text = richText3;
            richText4 = textunderline;
        }
        TL_iv.RichText richText5 = richText4;
        if ((i9 & 8) != 0) {
            TL_iv.RichText textstrike = new TL_iv.textStrike();
            textstrike.text = richText4;
            richText5 = textstrike;
        }
        TL_iv.RichText richText6 = richText5;
        if ((i9 & 4) != 0) {
            TL_iv.RichText textfixed = new TL_iv.textFixed();
            textfixed.text = richText5;
            richText6 = textfixed;
        }
        TL_iv.RichText richText7 = richText6;
        if ((i9 & 256) != 0) {
            TL_iv.RichText textspoiler = new TL_iv.textSpoiler();
            textspoiler.text = richText6;
            richText7 = textspoiler;
        }
        TL_iv.RichText richText8 = richText7;
        if ((i9 & 16384) != 0) {
            TL_iv.RichText textsubscript = new TL_iv.textSubscript();
            textsubscript.text = richText7;
            richText8 = textsubscript;
        }
        TL_iv.RichText richText9 = richText8;
        if ((32768 & i9) != 0) {
            TL_iv.RichText textsuperscript = new TL_iv.textSuperscript();
            textsuperscript.text = richText8;
            richText9 = textsuperscript;
        }
        TL_iv.RichText richText10 = richText9;
        if ((i9 & 65536) != 0) {
            TL_iv.RichText textmarked = new TL_iv.textMarked();
            textmarked.text = richText9;
            richText10 = textmarked;
        }
        TL_iv.RichText richText11 = richText10;
        if (t5Var.b != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = t5Var.b;
            richText11 = texturl;
        }
        s00 s00Var = t5Var.c;
        if (s00Var == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = s00Var.b;
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
