package rh;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import h7.b7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class v3 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0585, code lost:
    
        r9 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(ArrayList arrayList, ArrayList arrayList2, Map map) {
        String str;
        char c10;
        TL_keyboard.InlineButtonType v;
        String str2;
        CharSequence w10;
        int i10;
        String str3;
        char c11;
        u3 u3Var;
        CharSequence w11;
        int size = arrayList.size();
        int i11 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            u3 u3Var2 = (u3) obj;
            boolean z10 = u3Var2.b;
            ArrayList arrayList3 = u3Var2.e;
            if (!z10) {
                str = u3Var2.a;
                str.getClass();
                switch (str) {
                    case "spoiler":
                    case "button":
                    case "strike":
                    case "strong":
                    case "a":
                    case "b":
                    case "i":
                    case "s":
                    case "u":
                    case "br":
                    case "em":
                    case "tt":
                    case "del":
                    case "sub":
                    case "sup":
                    case "code":
                    case "font":
                    case "span":
                    case "animated-emoji":
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                        h(spannableStringBuilder2, u3Var2, 0, null, 0L);
                        spannableStringBuilder = spannableStringBuilder2;
                        i11 = 0;
                        break;
                    default:
                        t(arrayList2, spannableStringBuilder);
                        switch (str.hashCode()) {
                            case -1857640538:
                                if (str.equals("summary")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1274639644:
                                if (str.equals("figure")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case -1268861541:
                                if (str.equals("footer")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 112:
                                if (str.equals("p")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3273:
                                if (str.equals("h1")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3274:
                                if (str.equals("h2")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3275:
                                if (str.equals("h3")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3276:
                                if (str.equals("h4")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3277:
                                if (str.equals("h5")) {
                                    c10 = '\b';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3278:
                                if (str.equals("h6")) {
                                    c10 = '\t';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3338:
                                if (str.equals("hr")) {
                                    c10 = '\n';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3549:
                                if (str.equals("ol")) {
                                    c10 = 11;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3696:
                                if (str.equals("td")) {
                                    c10 = '\f';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3700:
                                if (str.equals("th")) {
                                    c10 = '\r';
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3710:
                                if (str.equals("tr")) {
                                    c10 = 14;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3735:
                                if (str.equals("ul")) {
                                    c10 = 15;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 99473:
                                if (str.equals("div")) {
                                    c10 = 16;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 104387:
                                if (str.equals("img")) {
                                    c10 = 17;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 111267:
                                if (str.equals("pre")) {
                                    c10 = 18;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 93166550:
                                if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                    c10 = 19;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 110115790:
                                if (str.equals("table")) {
                                    c10 = 20;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 110157846:
                                if (str.equals("tbody")) {
                                    c10 = 21;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 110326868:
                                if (str.equals("thead")) {
                                    c10 = 22;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 112202875:
                                if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                    c10 = 23;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1303202319:
                                if (str.equals("blockquote")) {
                                    c10 = 24;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1557721666:
                                if (str.equals("details")) {
                                    c10 = 25;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 1901043637:
                                if (str.equals("location")) {
                                    c10 = 26;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                                b(arrayList2, new TL_iv.pageBlockParagraph(), u3Var2);
                                break;
                            case 1:
                                int size2 = arrayList3.size();
                                int i13 = 0;
                                a aVar = null;
                                CharSequence charSequence = null;
                                while (i13 < size2) {
                                    Object obj2 = arrayList3.get(i13);
                                    i13++;
                                    u3 u3Var3 = (u3) obj2;
                                    if (!u3Var3.b) {
                                        if ("figcaption".equals(u3Var3.a)) {
                                            charSequence = w(u3Var3);
                                        } else if (aVar == null) {
                                            aVar = m(u3Var3);
                                        }
                                    }
                                }
                                if (aVar == null) {
                                    if (charSequence != null && charSequence.length() > 0) {
                                        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                        pageblockparagraph.text = v5.f(charSequence);
                                        arrayList2.add(new a(pageblockparagraph, 0, 0));
                                        break;
                                    }
                                } else {
                                    if (charSequence != null && charSequence.length() > 0) {
                                        I(aVar.b, charSequence);
                                    }
                                    arrayList2.add(aVar);
                                }
                                break;
                            case 2:
                                b(arrayList2, new TL_iv.pageBlockFooter(), u3Var2);
                                break;
                            case 3:
                                b(arrayList2, new TL_iv.pageBlockParagraph(), u3Var2);
                                break;
                            case 4:
                                b(arrayList2, new TL_iv.pageBlockHeading1(), u3Var2);
                                break;
                            case 5:
                                b(arrayList2, new TL_iv.pageBlockHeading2(), u3Var2);
                                break;
                            case 6:
                                b(arrayList2, new TL_iv.pageBlockHeading3(), u3Var2);
                                break;
                            case 7:
                                b(arrayList2, new TL_iv.pageBlockHeading4(), u3Var2);
                                break;
                            case '\b':
                                b(arrayList2, new TL_iv.pageBlockHeading5(), u3Var2);
                                break;
                            case '\t':
                                b(arrayList2, new TL_iv.pageBlockHeading6(), u3Var2);
                                break;
                            case '\n':
                                arrayList2.add(new a(new TL_iv.pageBlockDivider(), 0, 0));
                                break;
                            case 11:
                            case 15:
                                D(u3Var2, arrayList2, 0, "ol".equals(str));
                                break;
                            case '\f':
                            case '\r':
                            case 14:
                            case 21:
                            case 22:
                                A(arrayList3, arrayList2, map);
                                break;
                            case 16:
                                String a2 = u3Var2.a("class");
                                String lowerCase = a2 == null ? "" : a2.toLowerCase();
                                if (lowerCase.contains("button-row")) {
                                    TL_iv.pageBlockButtonRow pageblockbuttonrow = new TL_iv.pageBlockButtonRow();
                                    String a3 = u3Var2.a("data-align");
                                    pageblockbuttonrow.align_left = "left".equalsIgnoreCase(a3);
                                    pageblockbuttonrow.align_center = "center".equalsIgnoreCase(a3);
                                    pageblockbuttonrow.align_right = "right".equalsIgnoreCase(a3);
                                    int size3 = arrayList3.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        Object obj3 = arrayList3.get(i14);
                                        i14++;
                                        u3 u3Var4 = (u3) obj3;
                                        if (pageblockbuttonrow.buttons.size() >= 8) {
                                            arrayList2.add(new a(pageblockbuttonrow, 0, 0));
                                        } else if (!u3Var4.b && "button".equals(u3Var4.a) && (v = v(u3Var4)) != null) {
                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                            e(spannableStringBuilder3, u3Var4, 0, null, 0L);
                                            CharSequence L = L(spannableStringBuilder3);
                                            if (L.length() != 0) {
                                                TL_keyboard.PageButton pageButton = new TL_keyboard.PageButton();
                                                pageButton.text = v5.f(L);
                                                pageButton.type = v;
                                                pageButton.style = u(u3Var4);
                                                pageblockbuttonrow.buttons.add(pageButton);
                                            }
                                        }
                                    }
                                    arrayList2.add(new a(pageblockbuttonrow, 0, 0));
                                } else if (lowerCase.contains("collage")) {
                                    a(arrayList2, B(u3Var2, false));
                                } else if (lowerCase.contains("slideshow")) {
                                    a(arrayList2, B(u3Var2, true));
                                } else {
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), u3Var2);
                                }
                                break;
                            case 17:
                                a(arrayList2, m(u3Var2));
                                break;
                            case 18:
                                TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                                String[] strArr = {"language", "lang", "lng"};
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 3) {
                                        str2 = null;
                                    } else {
                                        str2 = u3Var2.a(strArr[i15]);
                                        if (str2 == null) {
                                            i15++;
                                        }
                                    }
                                }
                                pageblockpreformatted.language = str2;
                                b(arrayList2, pageblockpreformatted, u3Var2);
                                break;
                            case 19:
                                a(arrayList2, m(u3Var2));
                                break;
                            case 20:
                                TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                                pageblocktable.title = new TL_iv.textEmpty();
                                pageblocktable.rows = new ArrayList<>();
                                pageblocktable.bordered = u3Var2.b("border");
                                String a10 = u3Var2.a("class");
                                pageblocktable.striped = a10 != null && a10.toLowerCase().contains("striped");
                                pageblocktable.compact = a10 != null && a10.toLowerCase().contains("compact");
                                p(u3Var2, pageblocktable);
                                if (pageblocktable.rows.isEmpty()) {
                                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                                    ArrayList<TL_iv.pageTableCell> arrayList4 = new ArrayList<>();
                                    pagetablerow.cells = arrayList4;
                                    arrayList4.add(x5.f());
                                    pageblocktable.rows.add(pagetablerow);
                                }
                                arrayList2.add(new a(pageblocktable, 0, 0));
                                break;
                            case 23:
                                a(arrayList2, m(u3Var2));
                                break;
                            case 24:
                                String a11 = u3Var2.a("class");
                                if (a11 == null || !a11.toLowerCase().contains("pull")) {
                                    int size4 = arrayList3.size();
                                    u3 u3Var5 = null;
                                    int i16 = 0;
                                    boolean z11 = false;
                                    while (i16 < size4) {
                                        Object obj4 = arrayList3.get(i16);
                                        i16++;
                                        u3 u3Var6 = (u3) obj4;
                                        if (!u3Var6.b && (str3 = u3Var6.a) != null) {
                                            if (!"cite".equals(str3)) {
                                                String str4 = u3Var6.a;
                                                str4.getClass();
                                                switch (str4.hashCode()) {
                                                    case -1999048254:
                                                        if (str4.equals("spoiler")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case -1377687758:
                                                        if (str4.equals("button")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case -891985998:
                                                        if (str4.equals("strike")) {
                                                            c11 = 2;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case -891980137:
                                                        if (str4.equals("strong")) {
                                                            c11 = 3;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 97:
                                                        if (str4.equals("a")) {
                                                            c11 = 4;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 98:
                                                        if (str4.equals("b")) {
                                                            c11 = 5;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 105:
                                                        if (str4.equals("i")) {
                                                            c11 = 6;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 115:
                                                        if (str4.equals("s")) {
                                                            c11 = 7;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 117:
                                                        if (str4.equals("u")) {
                                                            c11 = '\b';
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3152:
                                                        if (str4.equals("br")) {
                                                            c11 = '\t';
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3240:
                                                        if (str4.equals("em")) {
                                                            c11 = '\n';
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3712:
                                                        if (str4.equals("tt")) {
                                                            c11 = 11;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 99339:
                                                        if (str4.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                                            c11 = '\f';
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 114240:
                                                        if (str4.equals("sub")) {
                                                            c11 = '\r';
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 114254:
                                                        if (str4.equals("sup")) {
                                                            c11 = 14;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3059181:
                                                        if (str4.equals("code")) {
                                                            c11 = 15;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3148879:
                                                        if (str4.equals("font")) {
                                                            c11 = 16;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 3536714:
                                                        if (str4.equals("span")) {
                                                            c11 = 17;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 1438365596:
                                                        if (str4.equals("animated-emoji")) {
                                                            c11 = 18;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    default:
                                                        c11 = 65535;
                                                        break;
                                                }
                                                switch (c11) {
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case '\b':
                                                    case '\t':
                                                    case '\n':
                                                    case 11:
                                                    case '\f':
                                                    case '\r':
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                        break;
                                                    default:
                                                        z11 = true;
                                                        break;
                                                }
                                            } else if (u3Var5 == null) {
                                                u3Var5 = u3Var6;
                                            }
                                        }
                                    }
                                    TL_iv.RichText f10 = (u3Var5 == null || (w10 = w(u3Var5)) == null || w10.length() == 0) ? null : v5.f(w10);
                                    if (z11) {
                                        long a12 = m0.a();
                                        int size5 = arrayList2.size();
                                        ArrayList arrayList5 = new ArrayList();
                                        int size6 = arrayList3.size();
                                        int i17 = 0;
                                        while (i17 < size6) {
                                            Object obj5 = arrayList3.get(i17);
                                            i17++;
                                            u3 u3Var7 = (u3) obj5;
                                            if (u3Var7.b || !"cite".equals(u3Var7.a)) {
                                                arrayList5.add(u3Var7);
                                            }
                                        }
                                        A(arrayList5, arrayList2, map);
                                        if (arrayList2.size() == size5) {
                                            i10 = 0;
                                            arrayList2.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                                            while (size5 < arrayList2.size()) {
                                                ((a) arrayList2.get(size5)).k.add(i10, Long.valueOf(a12));
                                                size5++;
                                            }
                                            if (f10 != null && map != null) {
                                                map.put(Long.valueOf(a12), f10);
                                            }
                                        }
                                        i10 = 0;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                        f(spannableStringBuilder4, u3Var2);
                                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                        pageblockblockquote.collapsed = u3Var2.b("data-collapsed") || u3Var2.b("collapsed");
                                        t5.e(pageblockblockquote, L(spannableStringBuilder4));
                                        if (f10 != null) {
                                            pageblockblockquote.caption = f10;
                                        }
                                        arrayList2.add(new a(pageblockblockquote, i11, i11));
                                    }
                                } else {
                                    int size7 = arrayList3.size();
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 < size7) {
                                            Object obj6 = arrayList3.get(i18);
                                            i18++;
                                            u3Var = (u3) obj6;
                                            if (u3Var.b || !"cite".equals(u3Var.a)) {
                                            }
                                        } else {
                                            u3Var = null;
                                        }
                                    }
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                    f(spannableStringBuilder5, u3Var2);
                                    TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                                    t5.e(pageblockpullquote, L(spannableStringBuilder5));
                                    TL_iv.RichText f11 = (u3Var == null || (w11 = w(u3Var)) == null || w11.length() == 0) ? null : v5.f(w11);
                                    if (f11 != null) {
                                        pageblockpullquote.caption = f11;
                                    }
                                    arrayList2.add(new a(pageblockpullquote, i11, i11));
                                }
                                break;
                            case 25:
                                TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                                pageblockdetails.open = u3Var2.b("open");
                                pageblockdetails.blocks = new ArrayList<>();
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                ArrayList arrayList6 = new ArrayList();
                                int size8 = arrayList3.size();
                                int i19 = 0;
                                while (i19 < size8) {
                                    Object obj7 = arrayList3.get(i19);
                                    i19++;
                                    u3 u3Var8 = (u3) obj7;
                                    if (u3Var8.b || !"summary".equals(u3Var8.a)) {
                                        arrayList6.add(u3Var8);
                                    } else {
                                        e(spannableStringBuilder6, u3Var8, 0, null, 0L);
                                    }
                                }
                                pageblockdetails.title = v5.f(L(spannableStringBuilder6));
                                arrayList2.add(new a(pageblockdetails, i11, i11));
                                int size9 = arrayList2.size();
                                A(arrayList6, arrayList2, map);
                                if (arrayList2.size() == size9) {
                                    arrayList2.add(new a(new TL_iv.pageBlockParagraph(), i11, i11));
                                }
                                a aVar2 = new a(new TL_iv.pageBlockParagraph(), i11, i11);
                                aVar2.i = true;
                                arrayList2.add(aVar2);
                                break;
                            case 26:
                                a(arrayList2, m(u3Var2));
                                break;
                            default:
                                if (!arrayList3.isEmpty()) {
                                    A(arrayList3, arrayList2, map);
                                }
                                break;
                        }
                        i11 = 0;
                        spannableStringBuilder = null;
                        break;
                }
            } else if (!x(u3Var2.c)) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                }
                spannableStringBuilder.append((CharSequence) q(u3Var2.c));
            }
        }
        t(arrayList2, spannableStringBuilder);
    }

    public static a B(u3 u3Var, boolean z10) {
        TL_iv.PageBlock pageblockslideshow = z10 ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList g32 = p3.g3(pageblockslideshow);
        ArrayList arrayList = u3Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u3 u3Var2 = (u3) obj;
            if (!u3Var2.b) {
                if ("figcaption".equals(u3Var2.a)) {
                    charSequence = w(u3Var2);
                } else {
                    boolean equals = MediaStreamTrack.VIDEO_TRACK_KIND.equals(u3Var2.a);
                    if (equals || "img".equals(u3Var2.a)) {
                        long E = E(u3Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y10 = y(E, equals, u3Var2.b("data-spoiler"));
                            J(y10);
                            g32.add(y10);
                        }
                    }
                }
            }
        }
        if (g32.isEmpty()) {
            return null;
        }
        if (g32.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) g32.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new a(pageBlock, 0, 0);
        }
        J(pageblockslideshow);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockslideshow, charSequence);
        }
        return new a(pageblockslideshow, 0, 0);
    }

    public static int C(int i10, String str) {
        if (str == null) {
            return i10;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static void D(u3 u3Var, ArrayList arrayList, int i10, boolean z10) {
        String a2;
        ArrayList arrayList2;
        int i11;
        int i12 = i10 + 1;
        ArrayList arrayList3 = u3Var.e;
        int size = arrayList3.size();
        int i13 = 1;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList3.get(i14);
            i14++;
            u3 u3Var2 = (u3) obj;
            if (!u3Var2.b && "li".equals(u3Var2.a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = u3Var2.e;
                int size2 = arrayList5.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    u3 u3Var3 = (u3) arrayList5.get(i15);
                    if (!u3Var3.b && ("ul".equals(u3Var3.a) || "ol".equals(u3Var3.a))) {
                        arrayList4.add(u3Var3);
                    } else if (u3Var3.b) {
                        spannableStringBuilder.append((CharSequence) q(u3Var3.c));
                    } else {
                        arrayList2 = arrayList5;
                        i11 = size2;
                        h(spannableStringBuilder, u3Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i15 = i16;
                        size2 = i11;
                    }
                    arrayList2 = arrayList5;
                    i11 = size2;
                    arrayList5 = arrayList2;
                    i15 = i16;
                    size2 = i11;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = v5.f(L(spannableStringBuilder));
                a aVar = new a(pageblockparagraph, i12, z10 ? i13 : 0);
                aVar.e = u3Var2.b("data-checkbox") || ((a2 = u3Var2.a("class")) != null && a2.toLowerCase().contains("checkbox"));
                aVar.f = u3Var2.b("data-checked");
                arrayList.add(aVar);
                int size3 = arrayList4.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj2 = arrayList4.get(i17);
                    i17++;
                    u3 u3Var4 = (u3) obj2;
                    D(u3Var4, arrayList, i12, "ol".equals(u3Var4.a));
                }
                i13++;
            }
        }
    }

    public static long E(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str.trim());
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void F(StringBuilder sb2, List list, int[] iArr, int i10, int i11, int i12, int i13, int i14, o6.c cVar, boolean z10, int i15, Map map) {
        int i16;
        List list2;
        String str;
        String str2;
        StringBuilder sb3 = sb2;
        List list3 = list;
        int i17 = i10;
        o6.c cVar2 = cVar;
        int i18 = i15;
        ArrayList arrayList = cVar2.a;
        while (true) {
            int i19 = iArr[0];
            if (i19 > i17) {
                return;
            }
            a aVar = (a) list3.get(i19);
            if (!aVar.i) {
                if (aVar.k.size() > i18) {
                    cVar2.b(sb3);
                    Long l10 = (Long) ((a) list3.get(iArr[0])).k.get(i18);
                    long longValue = l10.longValue();
                    int i20 = iArr[0];
                    while (true) {
                        int i21 = i20 + 1;
                        if (i21 > i17) {
                            break;
                        }
                        a aVar2 = (a) list3.get(i21);
                        if (aVar2.k.size() <= i18 || ((Long) aVar2.k.get(i18)).longValue() != longValue) {
                            break;
                        } else {
                            i20 = i21;
                        }
                    }
                    sb3.append("<blockquote>");
                    o6.c cVar3 = new o6.c(1);
                    F(sb3, list3, iArr, i20, i11, i12, i13, i14, cVar3, z10, i18 + 1, map);
                    cVar3.b(sb3);
                    c(sb3, map != null ? k((TL_iv.RichText) map.get(l10)) : null);
                    sb3.append("</blockquote>");
                    i17 = i10;
                    i18 = i15;
                } else {
                    if (p3.x3(aVar)) {
                        cVar2.b(sb3);
                        a aVar3 = (a) list3.get(iArr[0]);
                        sb3.append(((TL_iv.pageBlockDetails) aVar3.b).open ? "<details open>" : "<details>");
                        sb3.append("<summary>");
                        g(sb3, K(aVar3, iArr[0], i11, i12, i13, i14));
                        sb3.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        o6.c cVar4 = new o6.c(1);
                        F(sb3, list3, iArr, i10, i11, i12, i13, i14, cVar4, true, i15, map);
                        list2 = list3;
                        i16 = i10;
                        cVar4.b(sb3);
                        int i22 = iArr[0];
                        if (i22 <= i16 && i22 < list2.size() && ((a) list2.get(iArr[0])).i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb3.append("</details>");
                    } else {
                        i16 = i10;
                        list2 = list3;
                        if (aVar.c <= 0 || l(aVar.b) == null) {
                            cVar2.b(sb3);
                            int i23 = iArr[0];
                            TL_iv.PageBlock pageBlock = aVar.b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb3.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb3.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb3.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb3.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb3.append(" data-align=\"right\"");
                                } else {
                                    sb3.append(" data-align=\"fill\"");
                                }
                                sb3.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList2 = pageblockbuttonrow.buttons;
                                if (arrayList2 != null) {
                                    int size = arrayList2.size();
                                    int i24 = 0;
                                    while (i24 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList2.get(i24);
                                        i24++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb3, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb3.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb3, (TL_iv.pageBlockTable) pageBlock);
                            } else {
                                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                    G(sb3, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, aVar.g, pageBlock);
                                    sb3 = sb2;
                                } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                    sb3 = sb2;
                                    G(sb3, MediaStreamTrack.VIDEO_TRACK_KIND, ((TL_iv.pageBlockVideo) pageBlock).video_id, aVar.g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                    sb3 = sb2;
                                    G(sb3, MediaStreamTrack.AUDIO_TRACK_KIND, ((TL_iv.pageBlockAudio) pageBlock).audio_id, aVar.g, pageBlock);
                                } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                    sb3 = sb2;
                                    G(sb3, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, aVar.g, pageBlock);
                                } else {
                                    sb3 = sb2;
                                    String str3 = "<figcaption>";
                                    if (p3.B3(pageBlock)) {
                                        String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                        sb3.append("<div class=\"");
                                        sb3.append(str4);
                                        sb3.append("\">");
                                        ArrayList g32 = p3.g3(pageBlock);
                                        if (g32 != null) {
                                            int i25 = 0;
                                            while (i25 < g32.size()) {
                                                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) g32.get(i25);
                                                ArrayList arrayList3 = aVar.h;
                                                s sVar = (arrayList3 == null || i25 >= arrayList3.size()) ? null : (s) aVar.h.get(i25);
                                                if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                    long j10 = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                    if (j10 != 0) {
                                                        str = str3;
                                                        i(sb3, MediaStreamTrack.VIDEO_TRACK_KIND, j10, sVar, pageBlock2);
                                                    } else {
                                                        str = str3;
                                                    }
                                                } else {
                                                    str = str3;
                                                    if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                        long j11 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                        if (j11 != 0) {
                                                            sb3 = sb2;
                                                            i(sb3, "img", j11, sVar, pageBlock2);
                                                            i25++;
                                                            str3 = str;
                                                        }
                                                    }
                                                }
                                                sb3 = sb2;
                                                i25++;
                                                str3 = str;
                                            }
                                        }
                                        String str5 = str3;
                                        SpannableStringBuilder o10 = o(pageBlock);
                                        if (o10 != null && o10.length() > 0) {
                                            sb3.append(str5);
                                            g(sb3, o10);
                                            sb3.append("</figcaption>");
                                        }
                                        sb3.append("</div>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                        TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                        SpannableStringBuilder o11 = o(pageblockmap);
                                        boolean z11 = o11 != null && o11.length() > 0;
                                        if (z11) {
                                            sb3.append("<figure>");
                                        }
                                        sb3.append("<location");
                                        if (pageblockmap.geo != null) {
                                            sb3.append(" lat=\"");
                                            sb3.append(pageblockmap.geo.lat);
                                            sb3.append('\"');
                                            sb3.append(" long=\"");
                                            sb3.append(pageblockmap.geo._long);
                                            sb3.append('\"');
                                            if (pageblockmap.geo.access_hash != 0) {
                                                sb3.append(" access=\"");
                                                sb3.append(pageblockmap.geo.access_hash);
                                                sb3.append('\"');
                                            }
                                        }
                                        if (pageblockmap.zoom != 0) {
                                            sb3.append(" zoom=\"");
                                            sb3.append(pageblockmap.zoom);
                                            sb3.append('\"');
                                        }
                                        if (pageblockmap.w != 0) {
                                            sb3.append(" w=\"");
                                            sb3.append(pageblockmap.w);
                                            sb3.append('\"');
                                        }
                                        if (pageblockmap.h != 0) {
                                            sb3.append(" h=\"");
                                            sb3.append(pageblockmap.h);
                                            sb3.append('\"');
                                        }
                                        sb3.append(" />");
                                        if (z11) {
                                            sb3.append("<figcaption>");
                                            g(sb3, o11);
                                            sb3.append("</figcaption></figure>");
                                        }
                                    } else {
                                        String l11 = l(pageBlock);
                                        if (l11 == null) {
                                            SpannableStringBuilder o12 = o(pageBlock);
                                            if (o12 != null && o12.length() > 0) {
                                                sb3.append("<p>");
                                                g(sb3, o12);
                                                sb3.append("</p>");
                                            }
                                        } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                            String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                            if (TextUtils.isEmpty(str6)) {
                                                sb3.append("<pre>");
                                            } else {
                                                sb3.append("<pre language=\"");
                                                sb3.append(s(str6));
                                                sb3.append("\">");
                                            }
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            sb3.append("</pre>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                            sb3.append("<blockquote class=\"pull\">");
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            c(sb3, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                            sb3.append("</blockquote>");
                                        } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                            if (pageblockblockquote.collapsed) {
                                                sb3.append("<blockquote collapsed>");
                                            } else {
                                                sb3.append("<blockquote>");
                                            }
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            c(sb3, k(pageblockblockquote.caption));
                                            sb3.append("</blockquote>");
                                        } else {
                                            sb3.append('<');
                                            sb3.append(l11);
                                            sb3.append('>');
                                            g(sb3, K(aVar, i23, i11, i12, i13, i14));
                                            sb3.append("</");
                                            sb3.append(l11);
                                            sb3.append('>');
                                        }
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                cVar2 = cVar;
                            }
                            iArr[0] = iArr[0] + 1;
                            cVar2 = cVar;
                        } else {
                            int i26 = aVar.c;
                            boolean z12 = aVar.d > 0;
                            while (arrayList.size() > i26) {
                                cVar2.a(sb3);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList.size() >= i26) {
                                    break;
                                }
                                if (z12) {
                                    str2 = "<ol>";
                                }
                                sb3.append(str2);
                                arrayList.add(Boolean.valueOf(z12));
                            }
                            if (!arrayList.isEmpty() && ((Boolean) i0.a.i(1, arrayList)).booleanValue() != z12) {
                                cVar2.a(sb3);
                                sb3.append(z12 ? "<ol>" : "<ul>");
                                arrayList.add(Boolean.valueOf(z12));
                            }
                            sb3.append("<li>");
                            g(sb3, K(aVar, iArr[0], i11, i12, i13, i14));
                            sb3.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i18 = i15;
                    list3 = list2;
                    i17 = i16;
                }
            } else if (z10) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        if (j10 == 0) {
            return;
        }
        SpannableStringBuilder o10 = o(pageBlock);
        boolean z10 = o10 != null && o10.length() > 0;
        if (z10) {
            sb2.append("<figure>");
        }
        i(sb2, str, j10, sVar, pageBlock);
        if (z10) {
            sb2.append("<figcaption>");
            g(sb2, o10);
            sb2.append("</figcaption></figure>");
        }
    }

    public static void H(StringBuilder sb2, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        sb2.append("<table");
        if (pageblocktable.bordered) {
            sb2.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb2.append(" class=\"");
            if (pageblocktable.striped) {
                sb2.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb2.append(' ');
            }
            if (pageblocktable.compact) {
                sb2.append("compact");
            }
            sb2.append('\"');
        }
        sb2.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        SpannableStringBuilder r10 = richText != null ? v5.r(richText, null, true) : null;
        if (r10 != null && r10.length() > 0) {
            sb2.append("<caption>");
            g(sb2, r10);
            sb2.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i10);
                i10++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb2.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i11);
                        i11++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str = pagetablecell2.header ? "th" : "td";
                            sb2.append('<');
                            sb2.append(str);
                            int i12 = pagetablecell2.colspan;
                            if (i12 <= 1) {
                                i12 = 0;
                            }
                            if (i12 > 0) {
                                sb2.append(" colspan=\"");
                                sb2.append(i12);
                                sb2.append('\"');
                            }
                            int i13 = pagetablecell2.rowspan;
                            if (i13 <= 1) {
                                i13 = 0;
                            }
                            if (i13 > 0) {
                                sb2.append(" rowspan=\"");
                                sb2.append(i13);
                                sb2.append('\"');
                            }
                            String str2 = pagetablecell2.align_right ? "right" : pagetablecell2.align_center ? "center" : null;
                            if (str2 != null) {
                                sb2.append(" align=\"");
                                sb2.append(str2);
                                sb2.append('\"');
                            }
                            String str3 = pagetablecell2.valign_bottom ? "bottom" : pagetablecell2.valign_middle ? "middle" : null;
                            if (str3 != null) {
                                sb2.append(" valign=\"");
                                sb2.append(str3);
                                sb2.append('\"');
                            }
                            sb2.append('>');
                            g(sb2, x5.h(pagetablecell2));
                            sb2.append("</");
                            sb2.append(str);
                            sb2.append('>');
                        }
                    }
                }
                sb2.append("</tr>");
            }
        }
        sb2.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = v5.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(a aVar, int i10, int i11, int i12, int i13, int i14) {
        CharSequence r10 = p3.x3(aVar) ? v5.r(((TL_iv.pageBlockDetails) aVar.b).title, null, true) : t5.A(aVar.b);
        if (r10 == null) {
            r10 = "";
        }
        int length = r10.length();
        int max = i10 == i11 ? Math.max(0, Math.min(i13, length)) : 0;
        int max2 = i10 == i12 ? Math.max(0, Math.min(i14, length)) : length;
        if (max > max2) {
            int i15 = max;
            max = max2;
            max2 = i15;
        }
        return (max == 0 && max2 == length) ? r10 : r10.subSequence(max, max2);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i10 = 0;
        while (i10 < length && ((charAt = spannableStringBuilder.charAt(i10)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i10++;
        }
        while (length > i10) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i10 == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i10, length);
    }

    public static void a(ArrayList arrayList, a aVar) {
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, u3 u3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, u3Var, 0, null, 0L);
        t5.e(pageBlock, L(spannableStringBuilder));
        arrayList.add(new a(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb2, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            return;
        }
        sb2.append("<cite>");
        g(sb2, spannableStringBuilder);
        sb2.append("</cite>");
    }

    public static void d(StringBuilder sb2, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        if (c4.c(inlineButtonType)) {
            sb2.append("<button");
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                sb2.append(" data-type=\"url\" data-url=\"");
                sb2.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
                sb2.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                sb2.append(" data-type=\"copy\" data-copy-text=\"");
                sb2.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
                sb2.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                sb2.append(" data-type=\"user-profile\" data-user-id=\"");
                sb2.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
                sb2.append("\"");
            }
            if (richButtonStyle != null) {
                String str = richButtonStyle.bg_primary ? "primary" : richButtonStyle.bg_danger ? "danger" : richButtonStyle.bg_success ? "success" : "default";
                sb2.append(" data-style=\"");
                sb2.append(str);
                sb2.append("\"");
            }
            sb2.append(">");
            g(sb2, v5.r(richText, null, true));
            sb2.append("</button>");
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, u3 u3Var, int i10, String str, long j10) {
        SpannableStringBuilder spannableStringBuilder2;
        int i11;
        String str2;
        long j11;
        ArrayList arrayList = u3Var.e;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            u3 u3Var2 = (u3) obj;
            if (u3Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j11 = j10;
                j(spannableStringBuilder2, q(u3Var2.c), i11, str2, j11);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i11 = i10;
                str2 = str;
                j11 = j10;
                h(spannableStringBuilder2, u3Var2, i11, str2, j11);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i10 = i11;
            str = str2;
            j10 = j11;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, u3 u3Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = u3Var.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u3 u3Var2 = (u3) obj;
            if (u3Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(u3Var2.c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(u3Var2.a)) {
                    h(spannableStringBuilder2, u3Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(StringBuilder sb2, CharSequence charSequence) {
        int i10;
        c4 c4Var;
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        char c10 = 0;
        if (!(charSequence instanceof Spanned)) {
            r(sb2, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int i22 = 0;
        while (i22 < length) {
            c4[] c4VarArr = (c4[]) spanned.getSpans(i22, Math.min(length, i22 + 1), c4.class);
            int length2 = c4VarArr.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length2) {
                    i10 = -1;
                    c4Var = null;
                    break;
                }
                c4Var = c4VarArr[i23];
                int spanStart = spanned.getSpanStart(c4Var);
                i10 = spanned.getSpanEnd(c4Var);
                if (spanStart <= i22 && i10 > i22) {
                    break;
                } else {
                    i23++;
                }
            }
            if (c4Var != null) {
                TL_iv.textButton textbutton = c4Var.a;
                if (textbutton != null && c4.c(textbutton.type)) {
                    d(sb2, textbutton.text, textbutton.type, textbutton.style);
                }
                i22 = Math.min(length, i10);
            } else {
                int nextSpanTransition = spanned.nextSpanTransition(i22, length, CharacterStyle.class);
                int i24 = 0;
                for (yz0 yz0Var : (yz0[]) spanned.getSpans(i22, nextSpanTransition, yz0.class)) {
                    xz0 xz0Var = yz0Var.b;
                    if (xz0Var != null) {
                        i24 |= xz0Var.a;
                    }
                }
                t41[] t41VarArr = (t41[]) spanned.getSpans(i22, nextSpanTransition, t41.class);
                String url = t41VarArr.length > 0 ? t41VarArr[c10].getURL() : null;
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spanned.getSpans(i22, nextSpanTransition, org.telegram.ui.Components.t5.class);
                if (t5VarArr.length > 0) {
                    org.telegram.ui.Components.t5 t5Var = t5VarArr[c10];
                    if (!t5Var.standard) {
                        j10 = t5Var.getDocumentId();
                        i11 = i24 & 256;
                        if (i11 != 0) {
                            sb2.append("<spoiler>");
                        }
                        i12 = i24 & 1;
                        if (i12 != 0) {
                            sb2.append("<b>");
                        }
                        i13 = i24 & 2;
                        if (i13 != 0) {
                            sb2.append("<i>");
                        }
                        i14 = i24 & 16;
                        if (i14 != 0) {
                            sb2.append("<u>");
                        }
                        i15 = i24 & 8;
                        if (i15 != 0) {
                            sb2.append("<s>");
                        }
                        i16 = i24 & 4;
                        Spanned spanned2 = spanned;
                        if (i16 != 0) {
                            sb2.append("<code>");
                        }
                        i17 = i24 & 16384;
                        if (i17 != 0) {
                            sb2.append("<sub>");
                        }
                        i18 = 32768 & i24;
                        if (i18 != 0) {
                            sb2.append("<sup>");
                        }
                        i19 = 65536 & i24;
                        if (i19 != 0) {
                            sb2.append("<mark>");
                        }
                        if (url != null) {
                            sb2.append("<a href=\"");
                            sb2.append(s(url));
                            sb2.append("\">");
                        }
                        i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i20 == 0) {
                            i21 = i20;
                            sb2.append("<animated-emoji data-document-id=\"");
                            sb2.append(j10);
                            sb2.append("\">");
                        } else {
                            i21 = i20;
                        }
                        r(sb2, charSequence, i22, nextSpanTransition);
                        if (i21 != 0) {
                            sb2.append("</animated-emoji>");
                        }
                        if (url != null) {
                            sb2.append("</a>");
                        }
                        if (i19 != 0) {
                            sb2.append("</mark>");
                        }
                        if (i18 != 0) {
                            sb2.append("</sup>");
                        }
                        if (i17 != 0) {
                            sb2.append("</sub>");
                        }
                        if (i16 != 0) {
                            sb2.append("</code>");
                        }
                        if (i15 != 0) {
                            sb2.append("</s>");
                        }
                        if (i14 != 0) {
                            sb2.append("</u>");
                        }
                        if (i13 != 0) {
                            sb2.append("</i>");
                        }
                        if (i12 != 0) {
                            sb2.append("</b>");
                        }
                        if (i11 != 0) {
                            sb2.append("</spoiler>");
                        }
                        i22 = nextSpanTransition;
                        spanned = spanned2;
                        c10 = 0;
                    }
                }
                j10 = 0;
                i11 = i24 & 256;
                if (i11 != 0) {
                }
                i12 = i24 & 1;
                if (i12 != 0) {
                }
                i13 = i24 & 2;
                if (i13 != 0) {
                }
                i14 = i24 & 16;
                if (i14 != 0) {
                }
                i15 = i24 & 8;
                if (i15 != 0) {
                }
                i16 = i24 & 4;
                Spanned spanned22 = spanned;
                if (i16 != 0) {
                }
                i17 = i24 & 16384;
                if (i17 != 0) {
                }
                i18 = 32768 & i24;
                if (i18 != 0) {
                }
                i19 = 65536 & i24;
                if (i19 != 0) {
                }
                if (url != null) {
                }
                i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i20 == 0) {
                }
                r(sb2, charSequence, i22, nextSpanTransition);
                if (i21 != 0) {
                }
                if (url != null) {
                }
                if (i19 != 0) {
                }
                if (i18 != 0) {
                }
                if (i17 != 0) {
                }
                if (i16 != 0) {
                }
                if (i15 != 0) {
                }
                if (i14 != 0) {
                }
                if (i13 != 0) {
                }
                if (i12 != 0) {
                }
                if (i11 != 0) {
                }
                i22 = nextSpanTransition;
                spanned = spanned22;
                c10 = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(SpannableStringBuilder spannableStringBuilder, u3 u3Var, int i10, String str, long j10) {
        int i11;
        String str2;
        int i12;
        long j11;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(u3Var.a) && (v = v(u3Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, u3Var, i10, str, j10);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = v5.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(u3Var);
                spannableStringBuilder.setSpan(new c4(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = u3Var.a;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i11 = i10 | 256;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty() || u3Var.b) {
                    e(spannableStringBuilder, u3Var, i11, str2, j11);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i11 = i10 | 8;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "strong":
            case "b":
                i11 = i10 | 1;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "a":
                String a2 = u3Var.a("href");
                if (a2 != null) {
                    str2 = a2;
                    i11 = i10;
                    j11 = j10;
                    if (u3Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, u3Var, i11, str2, j11);
                    break;
                }
                i11 = i10;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "i":
            case "em":
                i11 = i10 | 2;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "u":
                i11 = i10 | 16;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "br":
                j(spannableStringBuilder, "\n", i10, str, j10);
                break;
            case "tt":
            case "code":
                i11 = i10 | 4;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "sub":
                i11 = i10 | 16384;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "sup":
                i12 = 32768;
                i11 = i12 | i10;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "mark":
                i12 = 65536;
                i11 = i12 | i10;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            case "animated-emoji":
                String a3 = u3Var.a("data-document-id");
                if (a3 != null) {
                    try {
                        j11 = Long.parseLong(a3.trim());
                        i11 = i10;
                        str2 = str;
                    } catch (Exception unused) {
                    }
                    if (u3Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, u3Var, i11, str2, j11);
                    break;
                }
                i11 = i10;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
            default:
                i11 = i10;
                str2 = str;
                j11 = j10;
                if (u3Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, u3Var, i11, str2, j11);
                break;
        }
    }

    public static void i(StringBuilder sb2, String str, long j10, s sVar, TL_iv.PageBlock pageBlock) {
        sb2.append('<');
        sb2.append(str);
        sb2.append(" src=\"");
        sb2.append(j10);
        sb2.append('\"');
        if (sVar != null) {
            if (sVar.j > 0) {
                sb2.append(" width=\"");
                sb2.append(sVar.j);
                sb2.append('\"');
            }
            if (sVar.k > 0) {
                sb2.append(" height=\"");
                sb2.append(sVar.k);
                sb2.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb2.append(" data-spoiler=\"1\"");
        }
        sb2.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i10, String str2, long j10) {
        if (str == null || str.length() == 0) {
            return;
        }
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        if (j10 != 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(j10, (Paint.FontMetricsInt) null), length, length2, 33);
        }
        if (i10 != 0) {
            xz0 xz0Var = new xz0();
            xz0Var.a = i10 & 114975;
            spannableStringBuilder.setSpan(new yz0(xz0Var, AndroidUtilities.dp(SharedConfig.fontSize)), length, length2, 33);
        }
        if (str2 != null) {
            spannableStringBuilder.setSpan(v5.k(str2), length, length2, 33);
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText == null || (richText instanceof TL_iv.textEmpty)) {
            return null;
        }
        SpannableStringBuilder r10 = v5.r(richText, null, true);
        if (r10.length() > 0) {
            return r10;
        }
        return null;
    }

    public static String l(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return "h1";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return "h2";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return "h3";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return "h4";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return "h5";
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return "h6";
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return "blockquote";
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return "pre";
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return "footer";
        }
        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
            return "p";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a m(u3 u3Var) {
        double parseDouble;
        String a2;
        String str = u3Var.a;
        str.getClass();
        switch (str) {
            case "div":
                String a3 = u3Var.a("class");
                String lowerCase = a3 == null ? "" : a3.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return B(u3Var, true);
                }
                if (lowerCase.contains("collage")) {
                    return B(u3Var, false);
                }
                return null;
            case "img":
                return n(u3Var, false);
            case "audio":
                long E = E(u3Var.a("src"));
                if (E <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = E;
                J(pageblockaudio);
                return new a(pageblockaudio, 0, 0);
            case "video":
                return n(u3Var, true);
            case "document":
                long E2 = E(u3Var.a("src"));
                if (E2 <= 0) {
                    return null;
                }
                TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
                pageblockdocument.document_id = E2;
                J(pageblockdocument);
                return new a(pageblockdocument, 0, 0);
            case "location":
                TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                String a10 = u3Var.a("lat");
                double d = 0.0d;
                if (a10 != null) {
                    try {
                        parseDouble = Double.parseDouble(a10.trim());
                    } catch (Exception unused) {
                    }
                    tL_geoPoint.lat = parseDouble;
                    a2 = u3Var.a("long");
                    if (a2 != null) {
                        try {
                            d = Double.parseDouble(a2.trim());
                        } catch (Exception unused2) {
                        }
                    }
                    tL_geoPoint._long = d;
                    tL_geoPoint.access_hash = E(u3Var.a("access"));
                    pageblockmap.geo = tL_geoPoint;
                    pageblockmap.zoom = C(15, u3Var.a("zoom"));
                    pageblockmap.w = C(600, u3Var.a("w"));
                    pageblockmap.h = C(400, u3Var.a("h"));
                    J(pageblockmap);
                    return new a(pageblockmap, 0, 0);
                }
                parseDouble = 0.0d;
                tL_geoPoint.lat = parseDouble;
                a2 = u3Var.a("long");
                if (a2 != null) {
                }
                tL_geoPoint._long = d;
                tL_geoPoint.access_hash = E(u3Var.a("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = C(15, u3Var.a("zoom"));
                pageblockmap.w = C(600, u3Var.a("w"));
                pageblockmap.h = C(400, u3Var.a("h"));
                J(pageblockmap);
                return new a(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static a n(u3 u3Var, boolean z10) {
        long E = E(u3Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y10 = y(E, z10, u3Var.b("data-spoiler"));
        J(y10);
        return new a(y10, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r10 = v5.r(richText, null, true);
            if (r10.length() > 0) {
                return r10;
            }
        }
        return null;
    }

    public static void p(u3 u3Var, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int indexOf;
        ArrayList arrayList = u3Var.e;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u3 u3Var2 = (u3) obj;
            if (!u3Var2.b) {
                String str = u3Var2.a;
                str.getClass();
                switch (str) {
                    case "tr":
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = u3Var2.e;
                        int size2 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList3.get(i12);
                            i12++;
                            u3 u3Var3 = (u3) obj2;
                            if (!u3Var3.b) {
                                if ("td".equals(u3Var3.a) || "th".equals(u3Var3.a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i10, u3Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i10, u3Var3.a("rowspan"));
                                    x5.d(pagetablecell, w(u3Var3));
                                    x5.l(pagetablecell, "th".equals(u3Var3.a) || u3Var3.b("header"));
                                    String a2 = u3Var3.a("align");
                                    if (a2 == null) {
                                        String a3 = u3Var3.a("style");
                                        if (a3 != null && (indexOf = (lowerCase = a3.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a2 = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a2 = "right";
                                            }
                                        }
                                        a2 = null;
                                    }
                                    if ("center".equalsIgnoreCase(a2)) {
                                        x5.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a2)) {
                                        x5.k(pagetablecell, 2);
                                    }
                                    String a10 = u3Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a10)) {
                                        x5.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a10)) {
                                        x5.m(pagetablecell, 2);
                                        pagetablerow.cells.add(pagetablecell);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i10 = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(x5.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case "tbody":
                    case "tfoot":
                    case "thead":
                        p(u3Var2, pageblocktable);
                        break;
                    case "caption":
                        pageblocktable.title = v5.f(w(u3Var2));
                        break;
                }
                i10 = 0;
            }
        }
    }

    public static String q(String str) {
        String substring;
        String str2;
        int parseInt;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        int i10 = 0;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt != '&') {
                sb2.append(charAt);
            } else {
                int i11 = i10 + 1;
                int indexOf = str.indexOf(59, i11);
                if (indexOf < 0 || indexOf - i10 > 12) {
                    sb2.append(charAt);
                } else {
                    substring = str.substring(i11, indexOf);
                    substring.getClass();
                    switch (substring) {
                        case "gt":
                            str2 = ">";
                            break;
                        case "lt":
                            str2 = "<";
                            break;
                        case "amp":
                            str2 = "&";
                            break;
                        case "apos":
                            str2 = "'";
                            break;
                        case "nbsp":
                            str2 = " ";
                            break;
                        case "quot":
                            str2 = "\"";
                            break;
                        default:
                            str2 = null;
                            if (substring.length() > 1 && substring.charAt(0) == '#') {
                                try {
                                    if (substring.charAt(1) != 'x' && substring.charAt(1) != 'X') {
                                        parseInt = Integer.parseInt(substring.substring(1));
                                        str2 = new String(Character.toChars(parseInt));
                                        break;
                                    }
                                    parseInt = Integer.parseInt(substring.substring(2), 16);
                                    str2 = new String(Character.toChars(parseInt));
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb2.append(str2);
                        i10 = indexOf;
                    } else {
                        sb2.append(charAt);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public static void r(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
        while (i10 < i11) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n') {
                sb2.append("<br>");
            } else if (charAt == '<') {
                sb2.append("&lt;");
            } else if (charAt == '>') {
                sb2.append("&gt;");
            } else if (charAt == '&') {
                sb2.append("&amp;");
            } else {
                sb2.append(charAt);
            }
            i10++;
        }
    }

    public static String s(String str) {
        return str == null ? "" : str.replace("&", "&amp;").replace("\"", "&quot;").replace("<", "&lt;").replace(">", "&gt;");
    }

    public static void t(ArrayList arrayList, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || x(spannableStringBuilder.toString())) {
            return;
        }
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        pageblockparagraph.text = v5.f(L(spannableStringBuilder));
        arrayList.add(new a(pageblockparagraph, 0, 0));
    }

    public static TL_keyboard.RichButtonStyle u(u3 u3Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a2 = u3Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a2);
        richButtonStyle.bg_danger = "danger".equals(a2);
        richButtonStyle.bg_success = "success".equals(a2);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(u3 u3Var) {
        String a2 = u3Var.a("data-type");
        if ("url".equals(a2)) {
            String a3 = u3Var.a("data-url");
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = a3;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(a2)) {
            String a10 = u3Var.a("data-copy-text");
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = a10;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(a2)) {
            return null;
        }
        long E = E(u3Var.a("data-user-id"));
        if (E <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = E;
        return tL_inlineButtonTypeUserProfile;
    }

    public static CharSequence w(u3 u3Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, u3Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j10, boolean z10, boolean z11) {
        if (z10) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j10 <= 0) {
                j10 = 0;
            }
            pageblockvideo.video_id = j10;
            pageblockvideo.spoiler = z11;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j10 <= 0) {
            j10 = 0;
        }
        pageblockphoto.photo_id = j10;
        pageblockphoto.spoiler = z11;
        return pageblockphoto;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02b4, code lost:
    
        if (r5.equals("hr") == false) goto L157;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList z(String str, HashMap hashMap) {
        int indexOf;
        char c10;
        int i10;
        String str2;
        int i11;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (true) {
                if (i12 < str.length()) {
                    char c11 = 1;
                    if (str.charAt(i12) != '<') {
                        indexOf = str.indexOf(60, i12);
                        if (indexOf < 0) {
                            indexOf = str.length();
                        }
                        String substring = str.substring(i12, indexOf);
                        if (!substring.isEmpty()) {
                            u3 u3Var = new u3();
                            u3Var.b = true;
                            u3Var.c = substring;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(u3Var);
                            } else {
                                ((u3) i0.a.i(1, arrayList3)).e.add(u3Var);
                            }
                        }
                    } else if (str.startsWith("<!--", i12)) {
                        int indexOf2 = str.indexOf("-->", i12 + 4);
                        i12 = indexOf2 < 0 ? str.length() : indexOf2 + 3;
                    } else if (i12 + 1 < str.length() && str.charAt(i12 + 1) == '!') {
                        int indexOf3 = str.indexOf(62, i12);
                        i12 = indexOf3 < 0 ? str.length() : indexOf3 + 1;
                    } else if (i12 + 1 >= str.length() || str.charAt(i12 + 1) != '/') {
                        int i13 = i12 + 1;
                        boolean z10 = false;
                        char c12 = 0;
                        while (true) {
                            c10 = '\'';
                            if (i13 < str.length()) {
                                char charAt = str.charAt(i13);
                                if (z10) {
                                    if (charAt == c12) {
                                        z10 = false;
                                    }
                                } else if (charAt == '\"' || charAt == '\'') {
                                    c12 = charAt;
                                    z10 = true;
                                } else if (charAt == '>') {
                                }
                                i13++;
                            } else {
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            String substring2 = str.substring(i12 + 1, i13);
                            indexOf = i13 + 1;
                            boolean endsWith = substring2.endsWith("/");
                            if (endsWith) {
                                substring2 = com.google.android.recaptcha.internal.a.n(substring2, 1, 0);
                            }
                            String trim = substring2.trim();
                            u3 u3Var2 = null;
                            if (!trim.isEmpty()) {
                                int i14 = 0;
                                while (i14 < trim.length() && !b7.a(trim.charAt(i14))) {
                                    i14++;
                                }
                                String lowerCase = trim.substring(0, i14).toLowerCase();
                                if (!lowerCase.isEmpty()) {
                                    u3Var2 = new u3();
                                    u3Var2.a = lowerCase;
                                    while (i14 < trim.length()) {
                                        while (i14 < trim.length() && b7.a(trim.charAt(i14))) {
                                            i14++;
                                        }
                                        if (i14 < trim.length()) {
                                            int i15 = i14;
                                            while (i15 < trim.length() && trim.charAt(i15) != '=' && !b7.a(trim.charAt(i15))) {
                                                i15++;
                                            }
                                            String lowerCase2 = trim.substring(i14, i15).toLowerCase();
                                            while (i15 < trim.length() && b7.a(trim.charAt(i15))) {
                                                i15++;
                                            }
                                            if (i15 >= trim.length() || trim.charAt(i15) != '=') {
                                                i10 = i15;
                                                str2 = "";
                                            } else {
                                                do {
                                                    i15++;
                                                    if (i15 < trim.length()) {
                                                    }
                                                    if (i15 < trim.length() || !(trim.charAt(i15) == '\"' || trim.charAt(i15) == c10)) {
                                                        i11 = i15;
                                                        while (i11 < trim.length() && !b7.a(trim.charAt(i11))) {
                                                            i11++;
                                                        }
                                                        str2 = trim.substring(i15, i11);
                                                        i10 = i11;
                                                    } else {
                                                        char charAt2 = trim.charAt(i15);
                                                        int i16 = i15 + 1;
                                                        i10 = i16;
                                                        while (i10 < trim.length() && trim.charAt(i10) != charAt2) {
                                                            i10++;
                                                        }
                                                        str2 = trim.substring(i16, Math.min(i10, trim.length()));
                                                        if (i10 < trim.length()) {
                                                            i10++;
                                                        }
                                                    }
                                                } while (b7.a(trim.charAt(i15)));
                                                if (i15 < trim.length()) {
                                                }
                                                i11 = i15;
                                                while (i11 < trim.length()) {
                                                    i11++;
                                                }
                                                str2 = trim.substring(i15, i11);
                                                i10 = i11;
                                            }
                                            if (!lowerCase2.isEmpty()) {
                                                if (u3Var2.d == null) {
                                                    u3Var2.d = new HashMap();
                                                }
                                                u3Var2.d.put(lowerCase2, q(str2));
                                            }
                                            i14 = i10;
                                            c10 = '\'';
                                        }
                                    }
                                }
                            }
                            if (u3Var2 != null) {
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(u3Var2);
                                } else {
                                    ((u3) i0.a.i(1, arrayList3)).e.add(u3Var2);
                                }
                                if (!endsWith) {
                                    String str3 = u3Var2.a;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case 3152:
                                            if (str3.equals("br")) {
                                                c11 = 0;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3338:
                                            break;
                                        case 104387:
                                            if (str3.equals("img")) {
                                                c11 = 2;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 117511:
                                            if (str3.equals("wbr")) {
                                                c11 = 3;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3321850:
                                            if (str3.equals("link")) {
                                                c11 = 4;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 3347973:
                                            if (str3.equals("meta")) {
                                                c11 = 5;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        case 100358090:
                                            if (str3.equals("input")) {
                                                c11 = 6;
                                                break;
                                            }
                                            c11 = 65535;
                                            break;
                                        default:
                                            c11 = 65535;
                                            break;
                                    }
                                    switch (c11) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            break;
                                        default:
                                            arrayList3.add(u3Var2);
                                            break;
                                    }
                                }
                            }
                        } else {
                            String substring3 = str.substring(i12);
                            if (!substring3.isEmpty()) {
                                u3 u3Var3 = new u3();
                                u3Var3.b = true;
                                u3Var3.c = substring3;
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(u3Var3);
                                } else {
                                    ((u3) i0.a.i(1, arrayList3)).e.add(u3Var3);
                                }
                            }
                        }
                    } else {
                        int indexOf4 = str.indexOf(62, i12);
                        String lowerCase3 = str.substring(i12 + 2, indexOf4 < 0 ? str.length() : indexOf4).trim().toLowerCase();
                        indexOf = indexOf4 < 0 ? str.length() : indexOf4 + 1;
                        int size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (((u3) arrayList3.get(size)).a.equals(lowerCase3)) {
                                    while (arrayList3.size() > size) {
                                        a9.p.s(1, arrayList3);
                                    }
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                    i12 = indexOf;
                }
            }
            A(arrayList2, arrayList, hashMap);
            if (arrayList.isEmpty()) {
                arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        }
        return arrayList;
    }
}
