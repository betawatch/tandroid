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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ti6 extends ild {
    public final ArrayList a;
    public TL_iv.RichText b;
    public final ArrayList c = new ArrayList();
    public final StringBuilder d = new StringBuilder();
    public final aj6 e = new aj6(new o5f((byte) 20), new vi2((byte) 28));
    public final ArrayDeque f;

    public ti6(ArrayList arrayList, ArrayDeque arrayDeque) {
        this.a = arrayList;
        this.f = arrayDeque;
    }

    public static void A(ArrayList arrayList, List list, int i) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (obj instanceof ri6) {
                list.add(((ri6) obj).a);
            } else if (obj instanceof si6) {
                C((si6) obj, list, i);
            }
        }
    }

    public static int B(tg6 tg6Var) {
        ugb ugbVar;
        String str;
        tg6 tg6Var2 = (tg6) tg6Var.c;
        if (!(tg6Var2 instanceof tu7)) {
            return -1;
        }
        tg6 tg6Var3 = (tg6) tg6Var2.c;
        if (!(tg6Var3 instanceof ugb) || (str = (ugbVar = (ugb) tg6Var3).g) == null) {
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
        ugbVar.g = str.substring(i);
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void C(si6 si6Var, List list, int i) {
        String str;
        fg5 fg5Var = si6Var.a;
        ArrayList arrayList = si6Var.c;
        String str2 = fg5Var.a;
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
            case kk7.w1 /* 112 */:
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
                    Map map = fg5Var.c;
                    int i2 = 0;
                    pageblockdetails.open = map != null && map.containsKey("open");
                    pageblockdetails.title = new TL_iv.textEmpty();
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        boolean z = obj instanceof si6;
                        if (z) {
                            si6 si6Var2 = (si6) obj;
                            if ("summary".equalsIgnoreCase(si6Var2.a.a)) {
                                StringBuilder sb = new StringBuilder();
                                w(sb, si6Var2.c);
                                String trim = sb.toString().trim();
                                pageblockdetails.title = trim.isEmpty() ? new TL_iv.textEmpty() : xi6.l(trim);
                            }
                        }
                        if (obj instanceof ri6) {
                            arrayList2.add(((ri6) obj).a);
                        } else if (z) {
                            C((si6) obj, arrayList2, i + 1);
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
            if (obj instanceof ri6) {
                TL_iv.PageBlock pageBlock = ((ri6) obj).a;
                if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(xi6.o(((TL_iv.pageBlockParagraph) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockHeader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(xi6.o(((TL_iv.pageBlockHeader) pageBlock).text));
                } else if (pageBlock instanceof TL_iv.pageBlockSubheader) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(xi6.o(((TL_iv.pageBlockSubheader) pageBlock).text));
                }
            } else if (obj instanceof si6) {
                w(sb, ((si6) obj).c);
            }
        }
    }

    public static void z(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fg5 fg5Var = (fg5) it.next();
            arrayList.add(fg5Var);
            ArrayList arrayList2 = fg5Var.f;
            z(arrayList, arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2));
        }
    }

    @Override // ild
    public final void a(ik0 ik0Var) {
        for (TL_iv.RichText richText : xi6.p(xi6.n(ik0Var, null))) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.text = richText;
            pageblockblockquote.caption = new TL_iv.textEmpty();
            x(pageblockblockquote);
        }
    }

    @Override // ild
    public final void b(x01 x01Var) {
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        for (tg6 tg6Var = (tg6) x01Var.c; tg6Var != null; tg6Var = (tg6) tg6Var.f) {
            if (tg6Var instanceof f56) {
                int B = B(tg6Var);
                TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                if (B >= 0) {
                    tL_pageListItemText.checkbox = true;
                    tL_pageListItemText.checked = B == 1;
                }
                tL_pageListItemText.text = xi6.b(xi6.n(tg6Var, pageblocklist));
                pageblocklist.items.add(tL_pageListItemText);
            }
        }
        x(pageblocklist);
    }

    @Override // ild
    public final void f(s84 s84Var) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = xi6.b(xi6.l(s84Var.k));
        String str = s84Var.j;
        if (str == null) {
            str = "";
        }
        pageblockpreformatted.language = str;
        x(pageblockpreformatted);
    }

    @Override // ild
    public final void g(nd5 nd5Var) {
        TL_iv.RichText b = xi6.b(xi6.n(nd5Var, null));
        if (this.c.isEmpty()) {
            this.b = b;
        }
        switch (nd5Var.g) {
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

    @Override // ild
    public final void h(cg5 cg5Var) {
        StringBuilder sb = this.d;
        String str = cg5Var.g;
        if (str == null) {
            return;
        }
        try {
            this.e.b(sb, str);
        } catch (Throwable th) {
            fa4.g(th, true);
            sb.append(str);
        }
    }

    @Override // ild
    public final void j(hn5 hn5Var) {
        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
        pageblockpreformatted.text = xi6.b(xi6.l(hn5Var.g));
        pageblockpreformatted.language = "";
        x(pageblockpreformatted);
    }

    @Override // ild
    public final void k(y46 y46Var) {
        if (!(y46Var instanceof feb)) {
            if (!(y46Var instanceof qs5)) {
                v(y46Var);
                return;
            }
            TL_iv.PageBlock pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = xi6.h(((qs5) y46Var).g);
            x(pageblockparagraph);
            return;
        }
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.title = new TL_iv.textEmpty();
        for (tg6 tg6Var = (tg6) ((feb) y46Var).c; tg6Var != null; tg6Var = (tg6) tg6Var.f) {
            boolean z = tg6Var instanceof peb;
            if (z || (tg6Var instanceof heb)) {
                for (tg6 tg6Var2 = (tg6) tg6Var.c; tg6Var2 != null; tg6Var2 = (tg6) tg6Var2.f) {
                    if (tg6Var2 instanceof gfb) {
                        ArrayList<TL_iv.pageTableRow> arrayList = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        for (tg6 tg6Var3 = (tg6) ((gfb) tg6Var2).c; tg6Var3 != null; tg6Var3 = (tg6) tg6Var3.f) {
                            if (tg6Var3 instanceof neb) {
                                ArrayList<TL_iv.pageTableCell> arrayList2 = pagetablerow.cells;
                                neb nebVar = (neb) tg6Var3;
                                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                pagetablecell.header = z || nebVar.g;
                                leb lebVar = nebVar.h;
                                if (lebVar == leb.b) {
                                    pagetablecell.align_center = true;
                                } else if (lebVar == leb.c) {
                                    pagetablecell.align_right = true;
                                }
                                pagetablecell.text = xi6.b(xi6.n(nebVar, null));
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
    @Override // ild
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(xq7 xq7Var) {
        String valueOf;
        int B;
        TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
        boolean z = ((gk0) ((tg6) xq7Var.b)) instanceof ro3;
        int i = xq7Var.g;
        for (tg6 tg6Var = (tg6) xq7Var.c; tg6Var != null; tg6Var = (tg6) tg6Var.f) {
            if (tg6Var instanceof f56) {
                if (z) {
                    ArrayDeque arrayDeque = this.f;
                    if (!arrayDeque.isEmpty()) {
                        valueOf = (String) arrayDeque.poll();
                        B = B(tg6Var);
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                        if (B >= 0) {
                            tL_pageListOrderedItemText.checkbox = true;
                            tL_pageListOrderedItemText.checked = B == 1;
                        }
                        tL_pageListOrderedItemText.num = valueOf;
                        tL_pageListOrderedItemText.text = xi6.b(xi6.n(tg6Var, pageblockorderedlist));
                        pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                    }
                }
                valueOf = String.valueOf(i);
                i++;
                B = B(tg6Var);
                TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText2 = new TL_iv.TL_pageListOrderedItemText();
                if (B >= 0) {
                }
                tL_pageListOrderedItemText2.num = valueOf;
                tL_pageListOrderedItemText2.text = xi6.b(xi6.n(tg6Var, pageblockorderedlist));
                pageblockorderedlist.items.add(tL_pageListOrderedItemText2);
            }
        }
        x(pageblockorderedlist);
    }

    @Override // ild
    public final void n(tu7 tu7Var) {
        for (TL_iv.RichText richText : xi6.p(xi6.n(tu7Var, null))) {
            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
            pageblockparagraph.text = richText;
            x(pageblockparagraph);
        }
    }

    @Override // ild
    public final void p(jjb jjbVar) {
        x(new TL_iv.pageBlockDivider());
    }

    public final void x(TL_iv.PageBlock pageBlock) {
        StringBuilder sb = this.d;
        int length = sb.length();
        sb.append((char) 1);
        sb.length();
        this.c.add(new ri6(length, pageBlock));
    }

    public final void y() {
        StringBuilder sb = this.d;
        ArrayList arrayList = new ArrayList();
        try {
            aj6 aj6Var = this.e;
            int length = sb.length();
            fg5 fg5Var = aj6Var.b;
            while (true) {
                fg5 fg5Var2 = fg5Var.e;
                if (fg5Var2 == null) {
                    break;
                } else {
                    fg5Var = fg5Var2;
                }
            }
            if (length > -1) {
                fg5Var.b(length);
            }
            ArrayList arrayList2 = fg5Var.f;
            List unmodifiableList = arrayList2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(arrayList2);
            if (unmodifiableList.size() > 0) {
                arrayList.addAll(unmodifiableList);
            } else {
                arrayList.addAll(Collections.EMPTY_LIST);
            }
            aj6Var.b = new fg5("", 0, Collections.EMPTY_MAP, null);
        } catch (Throwable th) {
            fa4.g(th, true);
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
            ri6 ri6Var = (ri6) obj;
            hashMap.put(Integer.valueOf(ri6Var.b), ri6Var);
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
            fg5 fg5Var3 = (fg5) obj2;
            treeSet.add(Integer.valueOf(fg5Var3.b));
            treeSet.add(Integer.valueOf(fg5Var3.d));
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
                    arrayList5.add((ri6) hashMap.get(num2));
                } else {
                    String trim = sb.substring(intValue, intValue2).trim();
                    if (!trim.isEmpty()) {
                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                        pageblockparagraph.text = xi6.b(xi6.l(trim));
                        arrayList5.add(new ri6(intValue, pageblockparagraph));
                    }
                }
            }
            num2 = num3;
        }
        Collections.sort(arrayList3, new mz2((byte) 29));
        si6 si6Var = new si6(null, ConnectionsManager.DEFAULT_DATACENTER_ID);
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(si6Var);
        int size3 = arrayList5.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList5.get(i4);
            i4++;
            ri6 ri6Var2 = (ri6) obj3;
            while (i3 < arrayList3.size() && ((fg5) arrayList3.get(i3)).b <= ri6Var2.b) {
                int i5 = i3 + 1;
                fg5 fg5Var4 = (fg5) arrayList3.get(i3);
                int i6 = fg5Var4.d;
                int i7 = fg5Var4.b;
                if (i6 >= ri6Var2.b) {
                    while (arrayDeque.peek() != si6Var && ((si6) arrayDeque.peek()).b <= i7) {
                        arrayDeque.pop();
                    }
                    si6 si6Var2 = new si6(fg5Var4, fg5Var4.d);
                    ((si6) arrayDeque.peek()).c.add(si6Var2);
                    arrayDeque.push(si6Var2);
                }
                i3 = i5;
            }
            while (arrayDeque.peek() != si6Var && ((si6) arrayDeque.peek()).b <= ri6Var2.b) {
                arrayDeque.pop();
            }
            TL_iv.PageBlock pageBlock = ri6Var2.a;
            ((si6) arrayDeque.peek()).c.add(ri6Var2);
        }
        A(si6Var.c, this.a, 0);
    }
}
