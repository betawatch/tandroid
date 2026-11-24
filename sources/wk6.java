// default package

import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wk6 extends knd {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final dl6 e = new dl6(new q7f((byte) 20), new jk2((byte) 28));
    public final ArrayDeque f;

    public wk6(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(ArrayList arrayList, List list, int i) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (obj instanceof uk6) {
                list.add(((uk6) obj).a);
            } else if (obj instanceof vk6) {
                C((vk6) obj, list, i);
            }
        }
    }

    public static int B(ui6 ui6Var) {
        vib vibVar;
        String str;
        ui6 ui6Var2 = (ui6) ui6Var.c;
        if (!(ui6Var2 instanceof uw7)) {
            return -1;
        }
        ui6 ui6Var3 = (ui6) ui6Var2.c;
        if (!(ui6Var3 instanceof vib) || (str = (vibVar = (vib) ui6Var3).g) == null) {
            return -1;
        }
        int i = 3;
        if (str.length() < 3) {
            return -1;
        }
        int i2 = 0;
        if (str.charAt(0) != '[' || str.charAt(2) != ']') {
            return -1;
        }
        char charAt = str.charAt(1);
        if (charAt != ' ') {
            if (charAt != 'x' && charAt != 'X') {
                return -1;
            }
            i2 = 1;
        }
        if (str.length() > 3 && str.charAt(3) == ' ') {
            i = 4;
        }
        vibVar.g = str.substring(i);
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(vk6 vk6Var, List list, int i) {
        String str;
        ei5 ei5Var = vk6Var.a;
        ArrayList arrayList = vk6Var.c;
        String str2 = ei5Var.a;
        String lowerCase = str2 == null ? "" : str2.toLowerCase();
        if (i >= 64) {
            A(arrayList, list, i + 1);
        }
        switch (lowerCase.hashCode()) {
            case -1857640538:
                if (lowerCase.equals("summary")) {
                }
                A(arrayList, list, i + 1);
                break;
            case -1268861541:
                str = "footer";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case -1221270899:
                str = "header";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case -732377866:
                str = "article";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case nm7.w1 /* 112 */:
                str = "p";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case 99473:
                str = "div";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case 108835:
                str = "nav";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case 3343801:
                str = "main";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case 93111608:
                str = "aside";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            case 1557721666:
                if (lowerCase.equals("details")) {
                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                    Map map = ei5Var.c;
                    int i2 = 0;
                    pageblockdetails.open = map != null && map.containsKey("open");
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        boolean z = obj instanceof vk6;
                        if (z) {
                            vk6 vk6Var2 = (vk6) obj;
                            if ("summary".equalsIgnoreCase(vk6Var2.a.a)) {
                                StringBuilder sb = new StringBuilder();
                                w(sb, vk6Var2.c);
                                String trim = sb.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : al6.l(trim);
                            }
                        }
                        if (obj instanceof uk6) {
                            arrayList2.add(((uk6) obj).a);
                        } else if (z) {
                            C((vk6) obj, arrayList2, i + 1);
                        }
                    }
                    pageblockdetails.blocks.addAll(arrayList2);
                    list.add(pageblockdetails);
                    break;
                }
                A(arrayList, list, i + 1);
                break;
            case 1970241253:
                str = "section";
                lowerCase.equals(str);
                A(arrayList, list, i + 1);
                break;
            default:
                A(arrayList, list, i + 1);
                break;
        }
    }

    public static void w(StringBuilder sb, ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj instanceof uk6) {
                TL_iv.PageBlock pageBlock = ((uk6) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(al6.o(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(al6.o(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(al6.o(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof vk6) {
                w(sb, ((vk6) obj).c);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ei5 ei5Var = (ei5) it.next();
            arrayList.add(ei5Var);
            ArrayList arrayList2 = ei5Var.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // knd
    public final void a(il0 il0Var) {
        for (TL_iv.RichText richText : al6.p(al6.n(il0Var, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // knd
    public final void b(f21 f21Var) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (ui6 ui6Var = (ui6) f21Var.c; ui6Var != null; ui6Var = (ui6) ui6Var.f) {
            if (ui6Var instanceof f76) {
                int B = B(ui6Var);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = al6.b(al6.n(ui6Var, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // knd
    public final void f(sa4 sa4Var) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = al6.b(al6.l(sa4Var.k));
        String str = sa4Var.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // knd
    public final void g(lf5 lf5Var) {
        TL_iv.RichText b = al6.b(al6.n(lf5Var, null));
        if (this.c.isEmpty()) {
            this.b = b;
        }
        switch (lf5Var.g) {
            case 1:
                TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                pageblockheading1.text = b;
                x(pageblockheading1);
                break;
            case 2:
                TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                pageblockheading2.text = b;
                x(pageblockheading2);
                break;
            case 3:
                TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                pageblockheading3.text = b;
                x(pageblockheading3);
                break;
            case 4:
                TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                pageblockheading4.text = b;
                x(pageblockheading4);
                break;
            case 5:
                TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                pageblockheading5.text = b;
                x(pageblockheading5);
                break;
            case 6:
                TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                pageblockheading6.text = b;
                x(pageblockheading6);
                break;
            default:
                TL_iv.pageBlockHeader pageblockheader = new TL_iv.pageBlockHeader();
                pageblockheader.text = b;
                x(pageblockheader);
                break;
        }
    }

    @Override // knd
    public final void h(bi5 bi5Var) {
        StringBuilder sb = this.d;
        String str = bi5Var.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb, str);
        } catch (Throwable th) {
            fc4.g(th, true);
            sb.append(str);
        }
    }

    @Override // knd
    public final void j(hp5 hp5Var) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = al6.b(al6.l(hp5Var.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // knd
    public final void k(y66 y66Var) {
        if (!(y66Var instanceof fgb)) {
            if (!(y66Var instanceof pu5)) {
                v(y66Var);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = al6.h(((pu5) y66Var).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (ui6 ui6Var = (ui6) ((fgb) y66Var).c; ui6Var != null; ui6Var = (ui6) ui6Var.f) {
            boolean z = ui6Var instanceof pgb;
            if (z || (ui6Var instanceof hgb)) {
                for (ui6 ui6Var2 = (ui6) ui6Var.c; ui6Var2 != null; ui6Var2 = (ui6) ui6Var2.f) {
                    if (ui6Var2 instanceof ghb) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (ui6 ui6Var3 = (ui6) ((ghb) ui6Var2).c; ui6Var3 != null; ui6Var3 = (ui6) ui6Var3.f) {
                            if (ui6Var3 instanceof ngb) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                ngb ngbVar = (ngb) ui6Var3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z || ngbVar.g;
                                lgb lgbVar = ngbVar.h;
                                if (lgbVar == lgb.b) {
                                    pagetablecell.align_center = true;
                                } else if (lgbVar == lgb.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = al6.b(al6.n(ngbVar, null));
                                pagetablecell.flags |= 128;
                                arrayList2.add(pagetablecell);
                            }
                        }
                        arrayList.add(pagetablerow);
                    }
                }
            }
        }
        x(pageblocktable);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    @Override // knd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(zs7 zs7Var) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z = ((gl0) ((ui6) zs7Var.b)) instanceof bq3;
        int i = zs7Var.g;
        for (ui6 ui6Var = (ui6) zs7Var.c; ui6Var != null; ui6Var = (ui6) ui6Var.f) {
            if (ui6Var instanceof f76) {
                if (z) {
                    ArrayDeque arrayDeque = this.f;
                    if (!arrayDeque.isEmpty()) {
                        valueOf = (String) arrayDeque.poll();
                        B = B(ui6Var);
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                        if (B >= 0) {
                            tL_pageListOrderedItemText.checkbox = true;
                            tL_pageListOrderedItemText.checked = B == 1;
                        }
                        tL_pageListOrderedItemText.num = valueOf;
                        tL_pageListOrderedItemText.text = al6.b(al6.n(ui6Var, pageblockorderedlist));
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    }
                }
                valueOf = String.valueOf(i);
                i++;
                B = B(ui6Var);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                if (B >= 0) {
                }
                tL_pageListOrderedItemText2.num = valueOf;
                tL_pageListOrderedItemText2.text = al6.b(al6.n(ui6Var, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // knd
    public final void n(uw7 uw7Var) {
        for (TL_iv.RichText richText : al6.p(al6.n(uw7Var, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // knd
    public final void p(klb klbVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append((char) 1);
        sb.length();
        this.c.add(new uk6(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb = this.d;
        ArrayList arrayList = new ArrayList();
        byte b = 0;
        try {
            dl6 dl6Var = this.e;
            int length = sb.length();
            ei5 ei5Var = dl6Var.b;
            while (true) {
                ei5 ei5Var2 = ei5Var.e;
                if (ei5Var2 == null) {
                    break;
                } else {
                    ei5Var = ei5Var2;
                }
            }
            if (length > -1) {
                ei5Var.b(length);
            }
            ArrayList arrayList2 = ei5Var.f;
            List unmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
            if (unmodifiableList.size() > 0) {
                arrayList.addAll(unmodifiableList);
            } else {
                arrayList.addAll(Collections.EMPTY_LIST);
            }
            dl6Var.b = new ei5("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        ArrayList arrayList3 = new ArrayList();
        z(arrayList3, arrayList);
        HashMap hashMap = new HashMap();
        ArrayList arrayList4 = this.c;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList4.get(i);
            i++;
            uk6 uk6Var = (uk6) obj;
            hashMap.put(Integer.valueOf(uk6Var.b), uk6Var);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(0);
        treeSet.add(Integer.valueOf(sb.length()));
        for (Integer num : hashMap.keySet()) {
            treeSet.add(num);
            treeSet.add(Integer.valueOf(num.intValue() + 1));
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            ei5 ei5Var3 = (ei5) obj2;
            treeSet.add(Integer.valueOf(ei5Var3.b));
            treeSet.add(Integer.valueOf(ei5Var3.d));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it = treeSet.iterator();
        Integer num2 = null;
        while (it.hasNext()) {
            Integer num3 = (Integer) it.next();
            if (num2 != null && num3.intValue() > num2.intValue()) {
                int intValue = num2.intValue();
                int intValue2 = num3.intValue();
                if (intValue2 - intValue == 1 && hashMap.containsKey(num2)) {
                    arrayList5.add((uk6) hashMap.get(num2));
                } else {
                    String trim = sb.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = al6.b(al6.l(trim));
                        arrayList5.add(new uk6(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new tk6(b));
        vk6 vk6Var = new vk6(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(vk6Var);
        int size3 = arrayList5.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList5.get(i4);
            i4++;
            uk6 uk6Var2 = (uk6) obj3;
            while (i3 < arrayList3.size() && ((ei5) arrayList3.get(i3)).b <= uk6Var2.b) {
                int i5 = i3 + 1;
                ei5 ei5Var4 = (ei5) arrayList3.get(i3);
                int i6 = ei5Var4.d;
                int i7 = ei5Var4.b;
                if (i6 >= uk6Var2.b) {
                    while (arrayDeque.peek() != vk6Var && ((vk6) arrayDeque.peek()).b <= i7) {
                        arrayDeque.pop();
                    }
                    vk6 vk6Var2 = new vk6(ei5Var4, ei5Var4.d);
                    ((vk6) arrayDeque.peek()).c.add(vk6Var2);
                    arrayDeque.push(vk6Var2);
                }
                i3 = i5;
            }
            while (arrayDeque.peek() != vk6Var && ((vk6) arrayDeque.peek()).b <= uk6Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = uk6Var2.a;
            ((vk6) arrayDeque.peek()).c.add(uk6Var2);
        }
        A(vk6Var.c, this.a, 0);
    }
}
