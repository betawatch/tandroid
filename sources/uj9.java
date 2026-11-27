// default package

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class uj9 {
    public static Object a(Spanned spanned, int i, int i2, Class cls) {
        for (Object obj : spanned.getSpans(i, Math.max(i, i2), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i && spanEnd >= i2) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(CharSequence charSequence) {
        jk2 jk2Var;
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (charSequence == null) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph);
            return arrayList;
        }
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0);
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (charSequence.charAt(i2) == '\n') {
                arrayList2.add(Integer.valueOf(i2 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
        }
        int length = charSequence.length();
        int i4 = 0;
        while (i4 < size) {
            int i5 = iArr[i4];
            i4++;
            boolean z2 = true;
            int i6 = i4 < size ? iArr[i4] - 1 : length;
            jk2 jk2Var2 = spanned == null ? null : (jk2) a(spanned, i5, i6, jk2.class);
            r19 r19Var = (spanned == null || jk2Var2 != null) ? 0 : (r19) a(spanned, i5, i6, r19.class);
            if (jk2Var2 != null) {
                jk2Var = jk2Var2;
            } else if (r19Var == 0) {
                CharSequence subSequence = charSequence.subSequence(i5, i6);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = mm9.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                jk2Var = r19Var;
            }
            while (true) {
                if (i4 >= size) {
                    i = length;
                    z = z2;
                    break;
                }
                int i7 = iArr[i4];
                z = z2;
                int i8 = i4 + 1;
                if (i8 < size) {
                    i = length;
                    length = iArr[i8] - 1;
                } else {
                    i = length;
                }
                if ((jk2Var2 != null ? a(spanned, i7, length, jk2.class) : a(spanned, i7, length, r19.class)) != jk2Var) {
                    break;
                }
                i6 = length;
                i4 = i8;
                z2 = z;
                length = i;
            }
            CharSequence subSequence2 = charSequence.subSequence(i5, i6);
            if (jk2Var2 != null) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                pageblockpreformatted.text = mm9.f(subSequence2);
                String str = jk2Var2.a;
                if (str == null) {
                    str = "";
                }
                pageblockpreformatted.language = str;
                arrayList.add(pageblockpreformatted);
            } else {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.text = mm9.f(subSequence2);
                pageblockblockquote.caption = new TL_iv.textEmpty();
                pageblockblockquote.collapsed = (r19Var == 0 || !r19Var.e) ? false : z;
                arrayList.add(pageblockblockquote);
            }
            length = i;
        }
        if (arrayList.isEmpty()) {
            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
            pageblockparagraph3.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph3);
        }
        return arrayList;
    }

    public static boolean c(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
                return true;
            }
            return c(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_iv.RichText richText2 = arrayList.get(i);
            i++;
            if (c(richText2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(ArrayList arrayList, HashMap hashMap) {
        boolean z;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                mk0 mk0Var = (mk0) obj;
                if (mk0Var == null) {
                    z = false;
                } else {
                    ArrayList arrayList2 = mk0Var.k;
                    if (!mk0Var.i && mk0Var.c <= 0) {
                        TL_iv.PageBlock pageBlock = mk0Var.b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z2 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z2 ? 1 : 0) <= 1 && (!z2 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || mm9.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        Object obj2 = arrayList2.get(i2);
                                        i2++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !mm9.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z2) {
                                    z = c(pageBlock.text);
                                }
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder e(mk0 mk0Var, boolean z) {
        SpannableStringBuilder r;
        if (z) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            r = mm9.r(pageBlock != null ? pageBlock.text : null, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = mk0Var.b;
            r = mm9.r(pageBlock2 != null ? pageBlock2.text : null, pageBlock2, true);
        }
        if (!(mk0Var.b instanceof TL_iv.pageBlockPreformatted)) {
            return r;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r);
        spannableStringBuilder.setSpan(new jk2(((TL_iv.pageBlockPreformatted) mk0Var.b).language, spannableStringBuilder.toString(), true), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (arrayList != null && i < arrayList.size()) {
            mk0 mk0Var = (mk0) arrayList.get(i);
            if (mk0Var.k.isEmpty()) {
                TL_iv.PageBlock pageBlock = mk0Var.b;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z ? mm9.r(pageBlock.text, pageBlock, false) : mm9.r(pageBlock.text, pageBlock, true));
                    TL_iv.PageBlock pageBlock2 = mk0Var.b;
                    boolean z2 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        r19.b(spannableStringBuilder, 0, spannableStringBuilder.length(), z2);
                    }
                    arrayList2.add(spannableStringBuilder);
                } else {
                    arrayList2.add(e(mk0Var, z));
                }
                i++;
            } else {
                long longValue = ((Long) mk0Var.k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i2 = i;
                while (i2 < arrayList.size() && !((mk0) arrayList.get(i2)).k.isEmpty() && ((Long) ((mk0) arrayList.get(i2)).k.get(0)).longValue() == longValue) {
                    if (i2 > i) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) e((mk0) arrayList.get(i2), z));
                    i2++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    r19.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList2.add(spannableStringBuilder2);
                i = i2;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            if (i3 > 0) {
                spannableStringBuilder3.append('\n');
            }
            spannableStringBuilder3.append((CharSequence) arrayList2.get(i3));
        }
        return spannableStringBuilder3;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(f(arrayList, true));
        int length = spannableStringBuilder.length();
        mm9.o(spannableStringBuilder, 0, length, 65536, false, null);
        mm9.o(spannableStringBuilder, 0, length, TLObject.FLAG_14, false, null);
        mm9.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (nl6 nl6Var : (nl6[]) spannableStringBuilder.getSpans(0, length, nl6.class)) {
            spannableStringBuilder.removeSpan(nl6Var);
        }
        return spannableStringBuilder;
    }
}
