package th;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class v5 {
    public static final int[] a = {1, 2, 16, 8, 4, 256, 16384, 32768, 65536};

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText, int i10, TL_iv.PageBlock pageBlock, boolean z10) {
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
                a(spannableStringBuilder, richText2, i10, pageBlock, z10);
            }
            return;
        }
        if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            boolean j10 = j(textdiff.text);
            boolean j11 = j(textdiff.old_text);
            int length = spannableStringBuilder.length();
            if (j10) {
                a(spannableStringBuilder, textdiff.old_text, i10, pageBlock, z10);
                if (spannableStringBuilder.length() > length) {
                    h01 h01Var = new h01();
                    h01Var.a = 8192;
                    spannableStringBuilder.setSpan(new i01(h01Var, 0), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            }
            a(spannableStringBuilder, textdiff.text, i10, pageBlock, z10);
            if (!j11) {
                if (spannableStringBuilder.length() > length) {
                    spannableStringBuilder.setSpan(new tv0(), length, spannableStringBuilder.length(), 33);
                    return;
                }
                return;
            } else {
                if (spannableStringBuilder.length() > length) {
                    h01 h01Var2 = new h01();
                    h01Var2.a = 4096;
                    spannableStringBuilder.setSpan(new i01(h01Var2, 0), length, spannableStringBuilder.length(), 33);
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
            y5 y5Var = new y5(textcustomemoji.document_id, (Paint.FontMetricsInt) null);
            y5Var.cacheType = org.telegram.ui.Components.p5.g();
            spannableStringBuilder.setSpan(y5Var, length2, spannableStringBuilder.length(), 33);
            if (i10 != 0) {
                spannableStringBuilder.setSpan(p(i10, pageBlock), length2, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textUrl) {
            TL_iv.textUrl texturl = (TL_iv.textUrl) richText;
            int length3 = spannableStringBuilder.length();
            a(spannableStringBuilder, texturl.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() <= length3 || (str = texturl.url) == null) {
                return;
            }
            spannableStringBuilder.setSpan(k(str), length3, spannableStringBuilder.length(), 33);
            return;
        }
        if (richText instanceof TL_iv.textDate) {
            TL_iv.textDate textdate = (TL_iv.textDate) richText;
            int length4 = spannableStringBuilder.length();
            a(spannableStringBuilder, textdate.text, i10, pageBlock, z10);
            if (spannableStringBuilder.length() > length4) {
                String charSequence2 = spannableStringBuilder.subSequence(length4, spannableStringBuilder.length()).toString();
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                tL_messageEntityFormattedDate.flags = textdate.flags;
                tL_messageEntityFormattedDate.date = textdate.date;
                tL_messageEntityFormattedDate.applyFlags();
                h01 h01Var3 = new h01();
                h01Var3.a |= 128;
                spannableStringBuilder.setSpan(new d10(charSequence2, h01Var3, tL_messageEntityFormattedDate), length4, spannableStringBuilder.length(), 33);
                return;
            }
            return;
        }
        if (richText instanceof TL_iv.textMath) {
            TL_iv.textMath textmath = (TL_iv.textMath) richText;
            int length5 = spannableStringBuilder.length();
            spannableStringBuilder.append(" ");
            Object a2 = r.a(textmath.source, g6.w0(null, g6.G6, false), AndroidUtilities.dp(SharedConfig.fontSize + 4));
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
            a(spannableStringBuilder, textbutton.text, i10, pageBlock, z10);
            if (z10 && spannableStringBuilder.length() > length7 && c4.c(textbutton.type)) {
                spannableStringBuilder.setSpan(new c4(textbutton), length7, spannableStringBuilder.length(), 33);
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
            a(spannableStringBuilder, richText.text, i10 | i11, pageBlock, z10);
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
        y5[] y5VarArr = (y5[]) spanned.getSpans(0, charSequence.length(), y5.class);
        for (y5 y5Var : y5VarArr) {
            arrayList.add(y5Var);
        }
        for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spanned.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)) {
            int spanStart = spanned.getSpanStart(emojiSpan);
            int spanEnd = spanned.getSpanEnd(emojiSpan);
            int length = y5VarArr.length;
            while (true) {
                if (i10 >= length) {
                    arrayList.add(emojiSpan);
                    break;
                }
                y5 y5Var2 = y5VarArr[i10];
                i10 = (spanned.getSpanStart(y5Var2) == spanStart && spanned.getSpanEnd(y5Var2) == spanEnd) ? 0 : i10 + 1;
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
        i01[] i01VarArr = (i01[]) spanned.getSpans(i10, i11, i01.class);
        int i12 = 0;
        for (i01 i01Var : i01VarArr) {
            int i13 = i01Var.b.a;
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
        u5 u5Var = null;
        int i11 = 0;
        while (i10 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i10, length, CharacterStyle.class);
            u5 u5Var2 = new u5();
            u5Var2.a = e(spanned, i10, nextSpanTransition);
            if (((z41[]) spanned.getSpans(i10, nextSpanTransition, z41.class)).length > 0) {
                u5Var2.a |= 4;
            }
            c51[] c51VarArr = (c51[]) spanned.getSpans(i10, nextSpanTransition, c51.class);
            if (c51VarArr.length > 0) {
                u5Var2.b = c51VarArr[0].getURL();
            }
            d10[] d10VarArr = (d10[]) spanned.getSpans(i10, nextSpanTransition, d10.class);
            if (d10VarArr.length > 0) {
                u5Var2.c = d10VarArr[0];
            }
            y5[] y5VarArr = (y5[]) spanned.getSpans(i10, nextSpanTransition, y5.class);
            if (y5VarArr.length > 0) {
                u5Var2.d = y5VarArr[0].getDocumentId();
            }
            r[] rVarArr = (r[]) spanned.getSpans(i10, nextSpanTransition, r.class);
            if (rVarArr.length > 0) {
                u5Var2.e = rVarArr[0].a;
            }
            c4[] c4VarArr = (c4[]) spanned.getSpans(i10, nextSpanTransition, c4.class);
            if (c4VarArr.length > 0) {
                u5Var2.f = c4VarArr[0];
            }
            if (u5Var != null) {
                c4 c4Var = u5Var.f;
                if (c4Var == null && u5Var2.f == null) {
                    if (u5Var.d == 0 && u5Var2.d == 0 && u5Var.e == null && u5Var2.e == null && u5Var.a == u5Var2.a) {
                        if ((r9 = u5Var.b) == null) {
                        }
                    }
                    arrayList.add(s(charSequence.subSequence(i11, i10).toString(), u5Var));
                    i11 = i10;
                } else {
                    i10 = (c4Var != null && c4Var == u5Var2.f) ? nextSpanTransition : 0;
                    arrayList.add(s(charSequence.subSequence(i11, i10).toString(), u5Var));
                    i11 = i10;
                }
            }
            u5Var = u5Var2;
        }
        String charSequence3 = charSequence.subSequence(i11, length).toString();
        if (u5Var == null) {
            u5Var = new u5();
        }
        arrayList.add(s(charSequence3, u5Var));
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
        if (max < max2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, d10.class);
                if (((d10[]) editable.getSpans(max, nextSpanTransition, d10.class)).length != 0) {
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
        if (max < max2 && com.google.android.recaptcha.internal.a.u(editable)) {
            while (max < max2) {
                int nextSpanTransition = editable.nextSpanTransition(max, max2, c51.class);
                if (((c51[]) editable.getSpans(max, nextSpanTransition, c51.class)).length != 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(max, max2, i01.class);
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

    public static c51 k(String str) {
        h01 h01Var = new h01();
        h01Var.a = 1024;
        return new c51(str, h01Var);
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
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            sb2.append(l(richText2));
        }
        return sb2.toString();
    }

    public static void m(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (d10 d10Var : (d10[]) editable.getSpans(max, max2, d10.class)) {
            editable.removeSpan(d10Var);
        }
    }

    public static void n(Editable editable, int i10, int i11) {
        int length = editable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (c51 c51Var : (c51[]) editable.getSpans(max, max2, c51.class)) {
            int spanStart = editable.getSpanStart(c51Var);
            int spanEnd = editable.getSpanEnd(c51Var);
            editable.removeSpan(c51Var);
            if (spanStart < max) {
                editable.setSpan(k(c51Var.getURL()), spanStart, max, 33);
            }
            if (spanEnd > max2) {
                editable.setSpan(k(c51Var.getURL()), max2, spanEnd, 33);
            }
        }
    }

    public static void o(Spannable spannable, int i10, int i11, int i12, boolean z10, TL_iv.PageBlock pageBlock) {
        int length = spannable.length();
        int max = Math.max(0, Math.min(i10, length));
        int max2 = Math.max(0, Math.min(i11, length));
        if (max >= max2) {
            return;
        }
        for (i01 i01Var : (i01[]) spannable.getSpans(max, max2, i01.class)) {
            int spanStart = spannable.getSpanStart(i01Var);
            int spanEnd = spannable.getSpanEnd(i01Var);
            int i13 = i01Var.b.a;
            spannable.removeSpan(i01Var);
            c(spannable, spanStart, max, i13, pageBlock);
            c(spannable, max2, spanEnd, i13, pageBlock);
            c(spannable, Math.max(spanStart, max), Math.min(spanEnd, max2), z10 ? i13 | i12 : (~i12) & i13, pageBlock);
        }
        if (z10) {
            while (max < max2) {
                int nextSpanTransition = spannable.nextSpanTransition(max, max2, i01.class);
                if (e(spannable, max, nextSpanTransition) == 0) {
                    c(spannable, max, nextSpanTransition, i12, pageBlock);
                }
                max = nextSpanTransition;
            }
        }
    }

    public static i01 p(int i10, TL_iv.PageBlock pageBlock) {
        h01 h01Var = new h01();
        h01Var.a = i10;
        h01Var.e = (pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        return new i01(h01Var, 0);
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

    public static SpannableStringBuilder r(TL_iv.RichText richText, TL_iv.PageBlock pageBlock, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        a(spannableStringBuilder, richText, 0, pageBlock, z10);
        return spannableStringBuilder;
    }

    public static TL_iv.RichText s(String str, u5 u5Var) {
        TL_iv.RichText richText;
        c4 c4Var = u5Var.f;
        if (c4Var != null) {
            return c4Var.a;
        }
        if (u5Var.e != null) {
            TL_iv.textMath textmath = new TL_iv.textMath();
            textmath.source = u5Var.e;
            return textmath;
        }
        long j10 = u5Var.d;
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
        int i10 = u5Var.a;
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
        if (u5Var.b != null) {
            TL_iv.RichText texturl = new TL_iv.textUrl();
            texturl.text = richText10;
            texturl.url = u5Var.b;
            richText11 = texturl;
        }
        d10 d10Var = u5Var.c;
        if (d10Var == null) {
            return richText11;
        }
        TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = d10Var.b;
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
