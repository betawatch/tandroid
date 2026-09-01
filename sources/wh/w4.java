package wh;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.u01;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public abstract class w4 {
    public static Object a(Spanned spanned, int i10, int i11, Class cls) {
        for (Object obj : spanned.getSpans(i10, Math.max(i10, i11), cls)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart <= i10 && spanEnd >= i11) {
                return obj;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(CharSequence charSequence) {
        int i10;
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
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == '\n') {
                arrayList2.add(Integer.valueOf(i11 + 1));
            }
        }
        int size = arrayList2.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < size; i12++) {
            iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
        }
        int length = charSequence.length();
        int i13 = 0;
        while (i13 < size) {
            int i14 = iArr[i13];
            i13++;
            int i15 = i13 < size ? iArr[i13] - 1 : length;
            CodeHighlighting.Span span = spanned == null ? null : (CodeHighlighting.Span) a(spanned, i14, i15, CodeHighlighting.Span.class);
            bj0 bj0Var = (spanned == null || span != null) ? 0 : (bj0) a(spanned, i14, i15, bj0.class);
            if (span == null && bj0Var == 0) {
                CharSequence subSequence = charSequence.subSequence(i14, i15);
                TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                pageblockparagraph2.text = x5.f(subSequence);
                arrayList.add(pageblockparagraph2);
            } else {
                CodeHighlighting.Span span2 = span != null ? span : bj0Var;
                while (true) {
                    if (i13 >= size) {
                        i10 = length;
                        break;
                    }
                    int i16 = iArr[i13];
                    int i17 = i13 + 1;
                    if (i17 < size) {
                        i10 = length;
                        length = iArr[i17] - 1;
                    } else {
                        i10 = length;
                    }
                    if ((span != null ? a(spanned, i16, length, CodeHighlighting.Span.class) : a(spanned, i16, length, bj0.class)) != span2) {
                        break;
                    }
                    i15 = length;
                    i13 = i17;
                    length = i10;
                }
                CharSequence subSequence2 = charSequence.subSequence(i14, i15);
                if (span != null) {
                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                    pageblockpreformatted.text = x5.f(subSequence2);
                    String str = span.lng;
                    if (str == null) {
                        str = "";
                    }
                    pageblockpreformatted.language = str;
                    arrayList.add(pageblockpreformatted);
                } else {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    pageblockblockquote.text = x5.f(subSequence2);
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    pageblockblockquote.collapsed = bj0Var != 0 && bj0Var.e;
                    arrayList.add(pageblockblockquote);
                }
                length = i10;
            }
        }
        if (arrayList.isEmpty()) {
            TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
            pageblockparagraph3.text = new TL_iv.textEmpty();
            arrayList.add(pageblockparagraph3);
        }
        return arrayList;
    }

    public static SpannableStringBuilder c(List list) {
        ArrayList arrayList = new ArrayList();
        d(arrayList, list);
        return g(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.CharSequence] */
    public static void d(ArrayList arrayList, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) it.next();
            SpannableStringBuilder spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            spannableStringBuilder = null;
            if (pageBlock != null) {
                int i10 = 0;
                if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(x5.r(pageBlock.text, pageBlock, true));
                    spannableStringBuilder2.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) pageBlock).language, spannableStringBuilder2.toString()), 0, spannableStringBuilder2.length(), 33);
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    boolean z4 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                    if (z4 || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                        spannableStringBuilder = h(x5.r(pageBlock.text, pageBlock, true), z4 ? ((TL_iv.pageBlockBlockquote) pageBlock).caption : ((TL_iv.pageBlockPullquote) pageBlock).caption);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        ArrayList arrayList2 = new ArrayList();
                        d(arrayList2, pageblockblockquoteblocks.blocks);
                        spannableStringBuilder = h(g(arrayList2), pageblockblockquoteblocks.caption);
                    } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        ArrayList arrayList3 = new ArrayList();
                        SpannableStringBuilder r10 = x5.r(pageblockdetails.title, null, true);
                        if (!TextUtils.isEmpty(r10)) {
                            arrayList3.add(r10);
                        }
                        d(arrayList3, pageblockdetails.blocks);
                        if (!arrayList3.isEmpty()) {
                            spannableStringBuilder = g(arrayList3);
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockList) {
                        ArrayList<TL_iv.PageListItem> arrayList4 = ((TL_iv.pageBlockList) pageBlock).items;
                        if (arrayList4 != null && !arrayList4.isEmpty()) {
                            ArrayList arrayList5 = new ArrayList();
                            int size = arrayList4.size();
                            while (i10 < size) {
                                TL_iv.PageListItem pageListItem = arrayList4.get(i10);
                                i10++;
                                TL_iv.PageListItem pageListItem2 = pageListItem;
                                SpannableStringBuilder r11 = pageListItem2 instanceof TL_iv.TL_pageListItemText ? x5.r(((TL_iv.TL_pageListItemText) pageListItem2).text, null, true) : pageListItem2 instanceof TL_iv.TL_pageListItemBlocks ? c(((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks) : null;
                                if (r11 != null) {
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(pageListItem2.checkbox ? pageListItem2.checked ? "☑  " : "☐  " : "•  ");
                                    spannableStringBuilder3.append((CharSequence) r11);
                                    arrayList5.add(spannableStringBuilder3);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                spannableStringBuilder = g(arrayList5);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                        ArrayList<TL_iv.PageListOrderedItem> arrayList6 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            ArrayList arrayList7 = new ArrayList();
                            int size2 = arrayList6.size();
                            int i11 = 1;
                            while (i10 < size2) {
                                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList6.get(i10);
                                i10++;
                                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                                SpannableStringBuilder r12 = pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText ? x5.r(((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, null, true) : pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks ? c(((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks) : null;
                                if (r12 != null) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(w.c.e(!TextUtils.isEmpty(pageListOrderedItem2.num) ? pageListOrderedItem2.num : String.valueOf(i11), ".  "));
                                    spannableStringBuilder4.append((CharSequence) r12);
                                    arrayList7.add(spannableStringBuilder4);
                                }
                                i11++;
                            }
                            if (!arrayList7.isEmpty()) {
                                spannableStringBuilder = g(arrayList7);
                            }
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                        TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock;
                        ArrayList arrayList8 = new ArrayList();
                        SpannableStringBuilder r13 = x5.r(pageblocktable.title, null, true);
                        if (!TextUtils.isEmpty(r13)) {
                            arrayList8.add(r13);
                        }
                        ArrayList<TL_iv.pageTableRow> arrayList9 = pageblocktable.rows;
                        if (arrayList9 != null) {
                            int size3 = arrayList9.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                TL_iv.pageTableRow pagetablerow = arrayList9.get(i12);
                                i12++;
                                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                                ArrayList<TL_iv.pageTableCell> arrayList10 = pagetablerow2.cells;
                                if (arrayList10 != null && !arrayList10.isEmpty()) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    for (int i13 = 0; i13 < pagetablerow2.cells.size(); i13++) {
                                        if (i13 > 0) {
                                            spannableStringBuilder5.append((CharSequence) "  |  ");
                                        }
                                        spannableStringBuilder5.append((CharSequence) x5.r(pagetablerow2.cells.get(i13).text, null, true));
                                    }
                                    arrayList8.add(spannableStringBuilder5);
                                }
                            }
                        }
                        if (!arrayList8.isEmpty()) {
                            spannableStringBuilder = g(arrayList8);
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                        String str = ((TL_iv.pageBlockMath) pageBlock).source;
                        if (!TextUtils.isEmpty(str)) {
                            spannableStringBuilder = l(4, new SpannableStringBuilder(str));
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                        spannableStringBuilder = "——————————";
                    } else if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockSubtitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6)) {
                        ?? l10 = l(1, x5.r(pageBlock.text, pageBlock, true));
                        if (!TextUtils.isEmpty(l10)) {
                            spannableStringBuilder = l10;
                        }
                    } else if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
                        spannableStringBuilder = x5.r(((TL_iv.pageBlockAuthorDate) pageBlock).author, null, true);
                    } else if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker) || (pageBlock instanceof TL_iv.pageBlockThinking)) {
                        spannableStringBuilder = x5.r(pageBlock.text, pageBlock, true);
                    } else if (pageBlock.caption != null) {
                        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                        SpannableStringBuilder r14 = x5.r(pageBlock.caption.text, null, true);
                        if (!TextUtils.isEmpty(r14)) {
                            spannableStringBuilder6.append((CharSequence) r14);
                        }
                        SpannableStringBuilder r15 = x5.r(pageBlock.caption.credit, null, true);
                        if (!TextUtils.isEmpty(r15)) {
                            if (spannableStringBuilder6.length() > 0) {
                                spannableStringBuilder6.append('\n');
                            }
                            spannableStringBuilder6.append((CharSequence) r15);
                        }
                        if (spannableStringBuilder6.length() > 0) {
                            spannableStringBuilder = spannableStringBuilder6;
                        }
                    }
                }
            }
            if (spannableStringBuilder != null) {
                arrayList.add(spannableStringBuilder);
            }
        }
    }

    public static boolean e(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty) || (richText instanceof TL_iv.textPlain) || (richText instanceof TL_iv.textCustomEmoji)) {
            return false;
        }
        if (!(richText instanceof TL_iv.textConcat)) {
            if ((richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMath) || (richText instanceof TL_iv.textButton)) {
                return true;
            }
            return e(richText.text);
        }
        ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_iv.RichText richText2 = arrayList.get(i10);
            i10++;
            if (e(richText2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(ArrayList arrayList, HashMap hashMap) {
        boolean e6;
        TL_iv.RichText richText;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                a aVar = (a) obj;
                if (aVar == null) {
                    e6 = false;
                } else {
                    ArrayList arrayList2 = aVar.k;
                    if (!aVar.i && aVar.c <= 0) {
                        TL_iv.PageBlock pageBlock = aVar.b;
                        if (!(pageBlock instanceof TL_iv.pageBlockPullquote)) {
                            boolean z4 = pageBlock instanceof TL_iv.pageBlockBlockquote;
                            if (arrayList2.size() + (z4 ? 1 : 0) <= 1 && (!z4 || (richText = ((TL_iv.pageBlockBlockquote) pageBlock).caption) == null || (richText instanceof TL_iv.textEmpty) || x5.l(richText).isEmpty())) {
                                if (hashMap != null && !arrayList2.isEmpty()) {
                                    int size2 = arrayList2.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        Object obj2 = arrayList2.get(i11);
                                        i11++;
                                        TL_iv.RichText richText2 = (TL_iv.RichText) hashMap.get((Long) obj2);
                                        if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty) && !x5.l(richText2).isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || z4) {
                                    e6 = e(pageBlock.text);
                                }
                            }
                        }
                    }
                    e6 = true;
                }
                if (e6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static SpannableStringBuilder g(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (i10 > 0) {
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i10));
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder h(SpannableStringBuilder spannableStringBuilder, TL_iv.RichText richText) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        SpannableStringBuilder r10 = x5.r(richText, null, true);
        if (!TextUtils.isEmpty(r10)) {
            if (spannableStringBuilder2.length() > 0) {
                spannableStringBuilder2.append('\n');
            }
            spannableStringBuilder2.append((CharSequence) "— ").append((CharSequence) r10);
        }
        if (spannableStringBuilder2.length() == 0) {
            return null;
        }
        bj0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
        return spannableStringBuilder2;
    }

    public static SpannableStringBuilder i(a aVar, boolean z4) {
        SpannableStringBuilder r10;
        if (z4) {
            TL_iv.PageBlock pageBlock = aVar.b;
            r10 = x5.r(pageBlock != null ? pageBlock.text : null, pageBlock, false);
        } else {
            TL_iv.PageBlock pageBlock2 = aVar.b;
            r10 = x5.r(pageBlock2 != null ? pageBlock2.text : null, pageBlock2, true);
        }
        if (!(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            return r10;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
        spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, ((TL_iv.pageBlockPreformatted) aVar.b).language, spannableStringBuilder.toString()), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder j(List list, boolean z4) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (list != null && i10 < list.size()) {
            a aVar = (a) list.get(i10);
            if (aVar.k.isEmpty()) {
                TL_iv.PageBlock pageBlock = aVar.b;
                if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z4 ? x5.r(pageBlock.text, pageBlock, false) : x5.r(pageBlock.text, pageBlock, true));
                    TL_iv.PageBlock pageBlock2 = aVar.b;
                    boolean z10 = (pageBlock2 instanceof TL_iv.pageBlockBlockquote) && ((TL_iv.pageBlockBlockquote) pageBlock2).collapsed;
                    if (spannableStringBuilder.length() > 0) {
                        bj0.b(spannableStringBuilder, 0, spannableStringBuilder.length(), z10);
                    }
                    arrayList.add(spannableStringBuilder);
                } else {
                    arrayList.add(i(aVar, z4));
                }
                i10++;
            } else {
                long longValue = ((Long) aVar.k.get(0)).longValue();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                int i11 = i10;
                while (i11 < list.size() && !((a) list.get(i11)).k.isEmpty() && ((Long) ((a) list.get(i11)).k.get(0)).longValue() == longValue) {
                    if (i11 > i10) {
                        spannableStringBuilder2.append('\n');
                    }
                    spannableStringBuilder2.append((CharSequence) i((a) list.get(i11), z4));
                    i11++;
                }
                if (spannableStringBuilder2.length() > 0) {
                    bj0.b(spannableStringBuilder2, 0, spannableStringBuilder2.length(), false);
                }
                arrayList.add(spannableStringBuilder2);
                i10 = i11;
            }
        }
        return g(arrayList);
    }

    public static SpannableStringBuilder k(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j(arrayList, true));
        int length = spannableStringBuilder.length();
        x5.o(spannableStringBuilder, 0, length, 65536, false, null);
        x5.o(spannableStringBuilder, 0, length, 16384, false, null);
        x5.o(spannableStringBuilder, 0, length, 32768, false, null);
        for (s sVar : (s[]) spannableStringBuilder.getSpans(0, length, s.class)) {
            spannableStringBuilder.removeSpan(sVar);
        }
        return spannableStringBuilder;
    }

    public static CharSequence l(int i10, SpannableStringBuilder spannableStringBuilder) {
        if (TextUtils.isEmpty(spannableStringBuilder)) {
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        t01 t01Var = new t01();
        t01Var.a = i10;
        spannableStringBuilder2.setSpan(new u01(t01Var, 0), 0, spannableStringBuilder2.length(), 33);
        return spannableStringBuilder2;
    }
}
