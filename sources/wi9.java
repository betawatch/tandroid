// default package

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class wi9 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x052c, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        int i;
        int i2;
        int i3;
        int i4;
        TL_keyboard.InlineButtonType v;
        String str;
        int i5;
        CharSequence w;
        String str2;
        int i6;
        vi9 vi9Var;
        CharSequence w2;
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            SpannableStringBuilder spannableStringBuilder = null;
            while (i8 < size) {
                Object obj = arrayList.get(i8);
                i8++;
                vi9 vi9Var2 = (vi9) obj;
                boolean z = vi9Var2.b;
                ArrayList arrayList3 = vi9Var2.e;
                if (!z) {
                    String str3 = vi9Var2.a;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -1999048254:
                            if (str3.equals("spoiler")) {
                                i = i7;
                                break;
                            }
                            i = -1;
                            break;
                        case -1377687758:
                            if (str3.equals("button")) {
                                i = 1;
                                break;
                            }
                            i = -1;
                            break;
                        case -891985998:
                            if (str3.equals("strike")) {
                                i = 2;
                                break;
                            }
                            i = -1;
                            break;
                        case -891980137:
                            if (str3.equals("strong")) {
                                i = 3;
                                break;
                            }
                            i = -1;
                            break;
                        case jn7.h1 /* 97 */:
                            if (str3.equals("a")) {
                                i = 4;
                                break;
                            }
                            i = -1;
                            break;
                        case jn7.i1 /* 98 */:
                            if (str3.equals("b")) {
                                i = 5;
                                break;
                            }
                            i = -1;
                            break;
                        case jn7.p1 /* 105 */:
                            if (str3.equals("i")) {
                                i = 6;
                                break;
                            }
                            i = -1;
                            break;
                        case jn7.z1 /* 115 */:
                            if (str3.equals("s")) {
                                i = 7;
                                break;
                            }
                            i = -1;
                            break;
                        case jn7.B1 /* 117 */:
                            if (str3.equals("u")) {
                                i = 8;
                                break;
                            }
                            i = -1;
                            break;
                        case 3152:
                            if (str3.equals("br")) {
                                i = 9;
                                break;
                            }
                            i = -1;
                            break;
                        case 3240:
                            if (str3.equals("em")) {
                                i = 10;
                                break;
                            }
                            i = -1;
                            break;
                        case 3712:
                            if (str3.equals("tt")) {
                                i = 11;
                                break;
                            }
                            i = -1;
                            break;
                        case 99339:
                            if (str3.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                i = 12;
                                break;
                            }
                            i = -1;
                            break;
                        case 114240:
                            if (str3.equals("sub")) {
                                i = 13;
                                break;
                            }
                            i = -1;
                            break;
                        case 114254:
                            if (str3.equals("sup")) {
                                i = 14;
                                break;
                            }
                            i = -1;
                            break;
                        case 3059181:
                            if (str3.equals("code")) {
                                i = 15;
                                break;
                            }
                            i = -1;
                            break;
                        case 3148879:
                            if (str3.equals("font")) {
                                i = 16;
                                break;
                            }
                            i = -1;
                            break;
                        case 3536714:
                            if (str3.equals("span")) {
                                i = 17;
                                break;
                            }
                            i = -1;
                            break;
                        case 1438365596:
                            if (str3.equals("animated-emoji")) {
                                i = 18;
                                break;
                            }
                            i = -1;
                            break;
                        default:
                            i = -1;
                            break;
                    }
                    switch (i) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            int i9 = i7;
                            if (spannableStringBuilder == null) {
                                spannableStringBuilder = new SpannableStringBuilder();
                            }
                            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                            h(spannableStringBuilder2, vi9Var2, 0, null, 0L);
                            i7 = i9;
                            spannableStringBuilder = spannableStringBuilder2;
                            break;
                        default:
                            t(arrayList2, spannableStringBuilder);
                            switch (str3.hashCode()) {
                                case -1857640538:
                                    if (str3.equals("summary")) {
                                        i2 = i7;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case -1274639644:
                                    if (str3.equals("figure")) {
                                        i2 = 1;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case -1268861541:
                                    if (str3.equals("footer")) {
                                        i2 = 2;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case jn7.w1 /* 112 */:
                                    if (str3.equals("p")) {
                                        i2 = 3;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3273:
                                    if (str3.equals("h1")) {
                                        i2 = 4;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3274:
                                    if (str3.equals("h2")) {
                                        i2 = 5;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3275:
                                    if (str3.equals("h3")) {
                                        i2 = 6;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3276:
                                    if (str3.equals("h4")) {
                                        i2 = 7;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3277:
                                    if (str3.equals("h5")) {
                                        i2 = 8;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3278:
                                    if (str3.equals("h6")) {
                                        i2 = 9;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3338:
                                    if (str3.equals("hr")) {
                                        i2 = 10;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3549:
                                    if (str3.equals("ol")) {
                                        i2 = 11;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3696:
                                    if (str3.equals("td")) {
                                        i2 = 12;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3700:
                                    if (str3.equals("th")) {
                                        i2 = 13;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3710:
                                    if (str3.equals("tr")) {
                                        i2 = 14;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 3735:
                                    if (str3.equals("ul")) {
                                        i2 = 15;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 99473:
                                    if (str3.equals("div")) {
                                        i2 = 16;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 104387:
                                    if (str3.equals("img")) {
                                        i2 = 17;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 111267:
                                    if (str3.equals("pre")) {
                                        i2 = 18;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 93166550:
                                    if (str3.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                        i2 = 19;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 110115790:
                                    if (str3.equals("table")) {
                                        i2 = 20;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 110157846:
                                    if (str3.equals("tbody")) {
                                        i2 = 21;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 110326868:
                                    if (str3.equals("thead")) {
                                        i2 = 22;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 112202875:
                                    if (str3.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                        i2 = 23;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 1303202319:
                                    if (str3.equals("blockquote")) {
                                        i2 = 24;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 1557721666:
                                    if (str3.equals("details")) {
                                        i2 = 25;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                case 1901043637:
                                    if (str3.equals("location")) {
                                        i2 = 26;
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                default:
                                    i2 = -1;
                                    break;
                            }
                            switch (i2) {
                                case 0:
                                    i3 = i7;
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), vi9Var2);
                                    break;
                                case 1:
                                    int size2 = arrayList3.size();
                                    int i10 = 0;
                                    mk0 mk0Var = null;
                                    CharSequence charSequence = null;
                                    while (i10 < size2) {
                                        Object obj2 = arrayList3.get(i10);
                                        i10++;
                                        vi9 vi9Var3 = (vi9) obj2;
                                        if (!vi9Var3.b) {
                                            if ("figcaption".equals(vi9Var3.a)) {
                                                charSequence = w(vi9Var3);
                                            } else if (mk0Var == null) {
                                                mk0Var = m(vi9Var3);
                                            }
                                        }
                                    }
                                    if (mk0Var == null) {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                            pageblockparagraph.text = mm9.f(charSequence);
                                            i3 = 0;
                                            arrayList2.add(new mk0(pageblockparagraph, 0, 0));
                                            break;
                                        }
                                    } else {
                                        if (charSequence != null && charSequence.length() > 0) {
                                            I(mk0Var.b, charSequence);
                                        }
                                        arrayList2.add(mk0Var);
                                    }
                                    i3 = 0;
                                    break;
                                case 2:
                                    b(arrayList2, new TL_iv.pageBlockFooter(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 3:
                                    b(arrayList2, new TL_iv.pageBlockParagraph(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 4:
                                    b(arrayList2, new TL_iv.pageBlockHeading1(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 5:
                                    b(arrayList2, new TL_iv.pageBlockHeading2(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 6:
                                    b(arrayList2, new TL_iv.pageBlockHeading3(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 7:
                                    b(arrayList2, new TL_iv.pageBlockHeading4(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 8:
                                    b(arrayList2, new TL_iv.pageBlockHeading5(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 9:
                                    b(arrayList2, new TL_iv.pageBlockHeading6(), vi9Var2);
                                    i3 = 0;
                                    break;
                                case 10:
                                    int i11 = i7;
                                    arrayList2.add(new mk0(new TL_iv.pageBlockDivider(), i11, i11));
                                    i3 = 0;
                                    break;
                                case 11:
                                case 15:
                                    i4 = 0;
                                    D(vi9Var2, arrayList2, 0, "ol".equals(str3));
                                    i3 = i4;
                                    break;
                                case 12:
                                case 13:
                                case 14:
                                case 21:
                                case 22:
                                    A(arrayList3, arrayList2, hashMap);
                                    i3 = 0;
                                    break;
                                case 16:
                                    String a = vi9Var2.a("class");
                                    String lowerCase = a == null ? "" : a.toLowerCase();
                                    if (!lowerCase.contains("button-row")) {
                                        if (lowerCase.contains("collage")) {
                                            a(B(vi9Var2, false), arrayList2);
                                        } else if (lowerCase.contains("slideshow")) {
                                            a(B(vi9Var2, true), arrayList2);
                                        } else {
                                            b(arrayList2, new TL_iv.pageBlockParagraph(), vi9Var2);
                                        }
                                        i3 = 0;
                                        break;
                                    } else {
                                        TL_iv.pageBlockButtonRow pageblockbuttonrow = new TL_iv.pageBlockButtonRow();
                                        String a2 = vi9Var2.a("data-align");
                                        pageblockbuttonrow.align_left = "left".equalsIgnoreCase(a2);
                                        pageblockbuttonrow.align_center = "center".equalsIgnoreCase(a2);
                                        pageblockbuttonrow.align_right = "right".equalsIgnoreCase(a2);
                                        int size3 = arrayList3.size();
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            Object obj3 = arrayList3.get(i12);
                                            i12++;
                                            vi9 vi9Var4 = (vi9) obj3;
                                            if (pageblockbuttonrow.buttons.size() >= 8) {
                                                i4 = 0;
                                                arrayList2.add(new mk0(pageblockbuttonrow, 0, 0));
                                                i3 = i4;
                                                break;
                                            } else if (!vi9Var4.b && "button".equals(vi9Var4.a) && (v = v(vi9Var4)) != null) {
                                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                                e(spannableStringBuilder3, vi9Var4, 0, null, 0L);
                                                CharSequence L = L(spannableStringBuilder3);
                                                if (L.length() != 0) {
                                                    TL_keyboard.PageButton pageButton = new TL_keyboard.PageButton();
                                                    pageButton.text = mm9.f(L);
                                                    pageButton.type = v;
                                                    pageButton.style = u(vi9Var4);
                                                    pageblockbuttonrow.buttons.add(pageButton);
                                                }
                                            }
                                        }
                                        i4 = 0;
                                        arrayList2.add(new mk0(pageblockbuttonrow, 0, 0));
                                        i3 = i4;
                                    }
                                    break;
                                case 17:
                                    a(m(vi9Var2), arrayList2);
                                    i3 = 0;
                                    break;
                                case 18:
                                    TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                                    String[] strArr = {"language", "lang", "lng"};
                                    int i13 = 0;
                                    while (true) {
                                        if (i13 >= 3) {
                                            str = null;
                                        } else {
                                            str = vi9Var2.a(strArr[i13]);
                                            if (str == null) {
                                                i13++;
                                            }
                                        }
                                    }
                                    pageblockpreformatted.language = str;
                                    b(arrayList2, pageblockpreformatted, vi9Var2);
                                    i3 = 0;
                                    break;
                                case 19:
                                    a(m(vi9Var2), arrayList2);
                                    i3 = 0;
                                    break;
                                case 20:
                                    TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
                                    pageblocktable.title = new TL_iv.textEmpty();
                                    pageblocktable.rows = new ArrayList<>();
                                    pageblocktable.bordered = vi9Var2.b("border");
                                    String a3 = vi9Var2.a("class");
                                    pageblocktable.striped = a3 != null && a3.toLowerCase().contains("striped");
                                    pageblocktable.compact = a3 != null && a3.toLowerCase().contains("compact");
                                    p(vi9Var2, pageblocktable);
                                    if (pageblocktable.rows.isEmpty()) {
                                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                                        ArrayList<TL_iv.pageTableCell> arrayList4 = new ArrayList<>();
                                        pagetablerow.cells = arrayList4;
                                        arrayList4.add(ajb.f());
                                        pageblocktable.rows.add(pagetablerow);
                                    }
                                    arrayList2.add(new mk0(pageblocktable, 0, 0));
                                    i3 = 0;
                                    break;
                                case 23:
                                    a(m(vi9Var2), arrayList2);
                                    i3 = 0;
                                    break;
                                case 24:
                                    String a4 = vi9Var2.a("class");
                                    if (a4 != null && a4.toLowerCase().contains("pull")) {
                                        int size4 = arrayList3.size();
                                        int i14 = i7;
                                        while (true) {
                                            if (i14 < size4) {
                                                Object obj4 = arrayList3.get(i14);
                                                i14++;
                                                vi9Var = (vi9) obj4;
                                                if (vi9Var.b || !"cite".equals(vi9Var.a)) {
                                                }
                                            } else {
                                                vi9Var = null;
                                            }
                                        }
                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                        f(spannableStringBuilder4, vi9Var2);
                                        TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
                                        km9.b(pageblockpullquote, L(spannableStringBuilder4));
                                        TL_iv.RichText f = (vi9Var == null || (w2 = w(vi9Var)) == null || w2.length() == 0) ? null : mm9.f(w2);
                                        if (f != null) {
                                            pageblockpullquote.caption = f;
                                        }
                                        arrayList2.add(new mk0(pageblockpullquote, i7, i7));
                                        i3 = i7;
                                        break;
                                    } else {
                                        int size5 = arrayList3.size();
                                        int i15 = i7;
                                        int i16 = i15;
                                        vi9 vi9Var5 = null;
                                        while (i15 < size5) {
                                            Object obj5 = arrayList3.get(i15);
                                            i15++;
                                            vi9 vi9Var6 = (vi9) obj5;
                                            if (!vi9Var6.b && (str2 = vi9Var6.a) != null) {
                                                if (!"cite".equals(str2)) {
                                                    String str4 = vi9Var6.a;
                                                    str4.getClass();
                                                    switch (str4.hashCode()) {
                                                        case -1999048254:
                                                            if (str4.equals("spoiler")) {
                                                                i6 = i7;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case -1377687758:
                                                            if (str4.equals("button")) {
                                                                i6 = 1;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case -891985998:
                                                            if (str4.equals("strike")) {
                                                                i6 = 2;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case -891980137:
                                                            if (str4.equals("strong")) {
                                                                i6 = 3;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case jn7.h1 /* 97 */:
                                                            if (str4.equals("a")) {
                                                                i6 = 4;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case jn7.i1 /* 98 */:
                                                            if (str4.equals("b")) {
                                                                i6 = 5;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case jn7.p1 /* 105 */:
                                                            if (str4.equals("i")) {
                                                                i6 = 6;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case jn7.z1 /* 115 */:
                                                            if (str4.equals("s")) {
                                                                i6 = 7;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case jn7.B1 /* 117 */:
                                                            if (str4.equals("u")) {
                                                                i6 = 8;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3152:
                                                            if (str4.equals("br")) {
                                                                i6 = 9;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3240:
                                                            if (str4.equals("em")) {
                                                                i6 = 10;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3712:
                                                            if (str4.equals("tt")) {
                                                                i6 = 11;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 99339:
                                                            if (str4.equals(TeXSymbolParser.DELIMITER_ATTR)) {
                                                                i6 = 12;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 114240:
                                                            if (str4.equals("sub")) {
                                                                i6 = 13;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 114254:
                                                            if (str4.equals("sup")) {
                                                                i6 = 14;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3059181:
                                                            if (str4.equals("code")) {
                                                                i6 = 15;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3148879:
                                                            if (str4.equals("font")) {
                                                                i6 = 16;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 3536714:
                                                            if (str4.equals("span")) {
                                                                i6 = 17;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        case 1438365596:
                                                            if (str4.equals("animated-emoji")) {
                                                                i6 = 18;
                                                                break;
                                                            }
                                                            i6 = -1;
                                                            break;
                                                        default:
                                                            i6 = -1;
                                                            break;
                                                    }
                                                    switch (i6) {
                                                        case 0:
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 12:
                                                        case 13:
                                                        case 14:
                                                        case 15:
                                                        case 16:
                                                        case 17:
                                                        case 18:
                                                            break;
                                                        default:
                                                            i16 = 1;
                                                            break;
                                                    }
                                                } else if (vi9Var5 == null) {
                                                    vi9Var5 = vi9Var6;
                                                }
                                            }
                                        }
                                        TL_iv.RichText f2 = (vi9Var5 == null || (w = w(vi9Var5)) == null || w.length() == 0) ? null : mm9.f(w);
                                        if (i16 == 0) {
                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                            f(spannableStringBuilder5, vi9Var2);
                                            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                                            pageblockblockquote.collapsed = (vi9Var2.b("data-collapsed") || vi9Var2.b("collapsed")) ? 1 : i7;
                                            km9.b(pageblockblockquote, L(spannableStringBuilder5));
                                            if (f2 != null) {
                                                pageblockblockquote.caption = f2;
                                            }
                                            arrayList2.add(new mk0(pageblockblockquote, i7, i7));
                                        } else {
                                            long a5 = mf9.a();
                                            int size6 = arrayList2.size();
                                            ArrayList arrayList5 = new ArrayList();
                                            int size7 = arrayList3.size();
                                            int i17 = i7;
                                            while (i17 < size7) {
                                                Object obj6 = arrayList3.get(i17);
                                                i17++;
                                                vi9 vi9Var7 = (vi9) obj6;
                                                if (vi9Var7.b || !"cite".equals(vi9Var7.a)) {
                                                    arrayList5.add(vi9Var7);
                                                }
                                            }
                                            A(arrayList5, arrayList2, hashMap);
                                            if (arrayList2.size() == size6) {
                                                i5 = 0;
                                                arrayList2.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
                                                while (size6 < arrayList2.size()) {
                                                    ((mk0) arrayList2.get(size6)).k.add(i5, Long.valueOf(a5));
                                                    size6++;
                                                }
                                                if (f2 != null && hashMap != null) {
                                                    hashMap.put(Long.valueOf(a5), f2);
                                                }
                                            }
                                            i5 = 0;
                                        }
                                        i3 = 0;
                                        break;
                                    }
                                    break;
                                case 25:
                                    TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
                                    pageblockdetails.open = vi9Var2.b("open");
                                    pageblockdetails.blocks = new ArrayList<>();
                                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                    ArrayList arrayList6 = new ArrayList();
                                    int size8 = arrayList3.size();
                                    int i18 = i7;
                                    while (i18 < size8) {
                                        Object obj7 = arrayList3.get(i18);
                                        i18++;
                                        vi9 vi9Var8 = (vi9) obj7;
                                        if (vi9Var8.b || !"summary".equals(vi9Var8.a)) {
                                            arrayList6.add(vi9Var8);
                                        } else {
                                            e(spannableStringBuilder6, vi9Var8, 0, null, 0L);
                                        }
                                    }
                                    pageblockdetails.title = mm9.f(L(spannableStringBuilder6));
                                    arrayList2.add(new mk0(pageblockdetails, i7, i7));
                                    int size9 = arrayList2.size();
                                    A(arrayList6, arrayList2, hashMap);
                                    if (arrayList2.size() == size9) {
                                        arrayList2.add(new mk0(new TL_iv.pageBlockParagraph(), i7, i7));
                                    }
                                    mk0 mk0Var2 = new mk0(new TL_iv.pageBlockParagraph(), i7, i7);
                                    mk0Var2.i = true;
                                    arrayList2.add(mk0Var2);
                                    i3 = i7;
                                    break;
                                case 26:
                                    a(m(vi9Var2), arrayList2);
                                    i3 = i7;
                                    break;
                                default:
                                    if (!arrayList3.isEmpty()) {
                                        A(arrayList3, arrayList2, hashMap);
                                    }
                                    i3 = i7;
                                    break;
                            }
                            i7 = i3;
                            break;
                    }
                } else if (!x(vi9Var2.c)) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    spannableStringBuilder.append((CharSequence) q(vi9Var2.c));
                }
            }
            t(arrayList2, spannableStringBuilder);
            return;
        }
    }

    public static mk0 B(vi9 vi9Var, boolean z) {
        TL_iv.PageBlock pageblockslideshow = z ? new TL_iv.pageBlockSlideshow() : new TL_iv.pageBlockCollage();
        ArrayList d3 = pi9.d3(pageblockslideshow);
        ArrayList arrayList = vi9Var.e;
        int size = arrayList.size();
        CharSequence charSequence = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vi9 vi9Var2 = (vi9) obj;
            if (!vi9Var2.b) {
                if ("figcaption".equals(vi9Var2.a)) {
                    charSequence = w(vi9Var2);
                } else {
                    boolean equals = MediaStreamTrack.VIDEO_TRACK_KIND.equals(vi9Var2.a);
                    if (equals || "img".equals(vi9Var2.a)) {
                        long E = E(vi9Var2.a("src"));
                        if (E > 0) {
                            TL_iv.PageBlock y = y(E, equals, vi9Var2.b("data-spoiler"));
                            J(y);
                            d3.add(y);
                        }
                    }
                }
            }
        }
        if (d3.isEmpty()) {
            return null;
        }
        if (d3.size() == 1) {
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) d3.get(0);
            if (charSequence != null && charSequence.length() > 0) {
                I(pageBlock, charSequence);
            }
            return new mk0(pageBlock, 0, 0);
        }
        J(pageblockslideshow);
        if (charSequence != null && charSequence.length() > 0) {
            I(pageblockslideshow, charSequence);
        }
        return new mk0(pageblockslideshow, 0, 0);
    }

    public static int C(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str.trim());
        } catch (Exception unused) {
            return i;
        }
    }

    public static void D(vi9 vi9Var, ArrayList arrayList, int i, boolean z) {
        String a;
        ArrayList arrayList2;
        int i2;
        int i3 = i + 1;
        ArrayList arrayList3 = vi9Var.e;
        int size = arrayList3.size();
        int i4 = 1;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList3.get(i5);
            i5++;
            vi9 vi9Var2 = (vi9) obj;
            if (!vi9Var2.b && "li".equals(vi9Var2.a)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = vi9Var2.e;
                int size2 = arrayList5.size();
                int i6 = 0;
                while (i6 < size2) {
                    int i7 = i6 + 1;
                    vi9 vi9Var3 = (vi9) arrayList5.get(i6);
                    if (!vi9Var3.b && ("ul".equals(vi9Var3.a) || "ol".equals(vi9Var3.a))) {
                        arrayList4.add(vi9Var3);
                    } else if (vi9Var3.b) {
                        spannableStringBuilder.append((CharSequence) q(vi9Var3.c));
                    } else {
                        arrayList2 = arrayList5;
                        i2 = size2;
                        h(spannableStringBuilder, vi9Var3, 0, null, 0L);
                        arrayList5 = arrayList2;
                        i6 = i7;
                        size2 = i2;
                    }
                    arrayList2 = arrayList5;
                    i2 = size2;
                    arrayList5 = arrayList2;
                    i6 = i7;
                    size2 = i2;
                }
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = mm9.f(L(spannableStringBuilder));
                mk0 mk0Var = new mk0(pageblockparagraph, i3, z ? i4 : 0);
                mk0Var.e = vi9Var2.b("data-checkbox") || ((a = vi9Var2.a("class")) != null && a.toLowerCase().contains("checkbox"));
                mk0Var.f = vi9Var2.b("data-checked");
                arrayList.add(mk0Var);
                int size3 = arrayList4.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj2 = arrayList4.get(i8);
                    i8++;
                    vi9 vi9Var4 = (vi9) obj2;
                    D(vi9Var4, arrayList, i3, "ol".equals(vi9Var4.a));
                }
                i4++;
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

    public static void F(StringBuilder sb, ArrayList arrayList, int[] iArr, int i, int i2, int i3, int i4, int i5, pq8 pq8Var, boolean z, int i6, HashMap hashMap) {
        int i7;
        ArrayList arrayList2;
        boolean z2;
        String str;
        String str2;
        StringBuilder sb2 = sb;
        ArrayList arrayList3 = arrayList;
        int i8 = i;
        pq8 pq8Var2 = pq8Var;
        int i9 = i6;
        ArrayList arrayList4 = (ArrayList) pq8Var2.b;
        while (true) {
            int i10 = iArr[0];
            if (i10 > i8) {
                return;
            }
            mk0 mk0Var = (mk0) arrayList3.get(i10);
            if (!mk0Var.i) {
                if (mk0Var.k.size() > i9) {
                    pq8Var2.l(sb2);
                    Long l = (Long) ((mk0) arrayList3.get(iArr[0])).k.get(i9);
                    long longValue = l.longValue();
                    int i11 = iArr[0];
                    while (true) {
                        int i12 = i11 + 1;
                        if (i12 > i8) {
                            break;
                        }
                        mk0 mk0Var2 = (mk0) arrayList3.get(i12);
                        if (mk0Var2.k.size() <= i9 || ((Long) mk0Var2.k.get(i9)).longValue() != longValue) {
                            break;
                        } else {
                            i11 = i12;
                        }
                    }
                    sb2.append("<blockquote>");
                    int i13 = i11;
                    pq8 pq8Var3 = new pq8((byte) 8);
                    F(sb2, arrayList3, iArr, i13, i2, i3, i4, i5, pq8Var3, z, i9 + 1, hashMap);
                    pq8Var3.l(sb2);
                    c(sb2, hashMap != null ? k((TL_iv.RichText) hashMap.get(l)) : null);
                    sb2.append("</blockquote>");
                    i8 = i;
                    i9 = i6;
                } else {
                    if (pi9.u3(mk0Var)) {
                        pq8Var2.l(sb2);
                        mk0 mk0Var3 = (mk0) arrayList3.get(iArr[0]);
                        sb2.append(((TL_iv.pageBlockDetails) mk0Var3.b).open ? "<details open>" : "<details>");
                        sb2.append("<summary>");
                        g(sb2, K(mk0Var3, iArr[0], i2, i3, i4, i5));
                        sb2.append("</summary>");
                        iArr[0] = iArr[0] + 1;
                        pq8 pq8Var4 = new pq8((byte) 8);
                        F(sb2, arrayList3, iArr, i, i2, i3, i4, i5, pq8Var4, true, i6, hashMap);
                        arrayList2 = arrayList3;
                        i7 = i;
                        pq8Var4.l(sb2);
                        int i14 = iArr[0];
                        if (i14 <= i7 && i14 < arrayList2.size() && ((mk0) arrayList2.get(iArr[0])).i) {
                            iArr[0] = iArr[0] + 1;
                        }
                        sb2.append("</details>");
                    } else {
                        i7 = i;
                        arrayList2 = arrayList3;
                        boolean z3 = true;
                        if (mk0Var.c <= 0 || l(mk0Var.b) == null) {
                            pq8Var2.l(sb2);
                            int i15 = iArr[0];
                            TL_iv.PageBlock pageBlock = mk0Var.b;
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                sb2.append("<hr>");
                            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                                sb2.append("<div class=\"button-row\"");
                                if (pageblockbuttonrow.align_left) {
                                    sb2.append(" data-align=\"left\"");
                                } else if (pageblockbuttonrow.align_center) {
                                    sb2.append(" data-align=\"center\"");
                                } else if (pageblockbuttonrow.align_right) {
                                    sb2.append(" data-align=\"right\"");
                                } else {
                                    sb2.append(" data-align=\"fill\"");
                                }
                                sb2.append(">");
                                ArrayList<TL_keyboard.PageButton> arrayList5 = pageblockbuttonrow.buttons;
                                if (arrayList5 != null) {
                                    int size = arrayList5.size();
                                    int i16 = 0;
                                    while (i16 < size) {
                                        TL_keyboard.PageButton pageButton = arrayList5.get(i16);
                                        i16++;
                                        TL_keyboard.PageButton pageButton2 = pageButton;
                                        if (pageButton2 != null) {
                                            d(sb2, pageButton2.text, pageButton2.type, pageButton2.style);
                                        }
                                    }
                                }
                                sb2.append("</div>");
                            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                                H(sb2, (TL_iv.pageBlockTable) pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                                G(sb2, "img", ((TL_iv.pageBlockPhoto) pageBlock).photo_id, mk0Var.g, pageBlock);
                                sb2 = sb;
                            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                                sb2 = sb;
                                G(sb2, MediaStreamTrack.VIDEO_TRACK_KIND, ((TL_iv.pageBlockVideo) pageBlock).video_id, mk0Var.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                                sb2 = sb;
                                G(sb2, MediaStreamTrack.AUDIO_TRACK_KIND, ((TL_iv.pageBlockAudio) pageBlock).audio_id, mk0Var.g, pageBlock);
                            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                                sb2 = sb;
                                G(sb2, "document", ((TL_iv.pageBlockDocument) pageBlock).document_id, mk0Var.g, pageBlock);
                            } else {
                                sb2 = sb;
                                String str3 = "<figcaption>";
                                if (pi9.y3(pageBlock)) {
                                    String str4 = pageBlock instanceof TL_iv.pageBlockSlideshow ? "slideshow" : "collage";
                                    sb2.append("<div class=\"");
                                    sb2.append(str4);
                                    sb2.append("\">");
                                    ArrayList d3 = pi9.d3(pageBlock);
                                    if (d3 != null) {
                                        int i17 = 0;
                                        while (i17 < d3.size()) {
                                            TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) d3.get(i17);
                                            ArrayList arrayList6 = mk0Var.h;
                                            p07 p07Var = (arrayList6 == null || i17 >= arrayList6.size()) ? null : (p07) mk0Var.h.get(i17);
                                            if (pageBlock2 instanceof TL_iv.pageBlockVideo) {
                                                z2 = z3;
                                                long j = ((TL_iv.pageBlockVideo) pageBlock2).video_id;
                                                if (j != 0) {
                                                    str = str3;
                                                    i(sb2, MediaStreamTrack.VIDEO_TRACK_KIND, j, p07Var, pageBlock2);
                                                } else {
                                                    str = str3;
                                                }
                                            } else {
                                                z2 = z3;
                                                str = str3;
                                                if (pageBlock2 instanceof TL_iv.pageBlockPhoto) {
                                                    long j2 = ((TL_iv.pageBlockPhoto) pageBlock2).photo_id;
                                                    if (j2 != 0) {
                                                        sb2 = sb;
                                                        i(sb2, "img", j2, p07Var, pageBlock2);
                                                        i17++;
                                                        str3 = str;
                                                        z3 = z2;
                                                    }
                                                }
                                            }
                                            sb2 = sb;
                                            i17++;
                                            str3 = str;
                                            z3 = z2;
                                        }
                                    }
                                    String str5 = str3;
                                    SpannableStringBuilder o = o(pageBlock);
                                    if (o != null && o.length() > 0) {
                                        sb2.append(str5);
                                        g(sb2, o);
                                        sb2.append("</figcaption>");
                                    }
                                    sb2.append("</div>");
                                } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                                    SpannableStringBuilder o2 = o(pageblockmap);
                                    boolean z4 = o2 != null && o2.length() > 0;
                                    if (z4) {
                                        sb2.append("<figure>");
                                    }
                                    sb2.append("<location");
                                    if (pageblockmap.geo != null) {
                                        sb2.append(" lat=\"");
                                        sb2.append(pageblockmap.geo.lat);
                                        sb2.append('\"');
                                        sb2.append(" long=\"");
                                        sb2.append(pageblockmap.geo._long);
                                        sb2.append('\"');
                                        if (pageblockmap.geo.access_hash != 0) {
                                            sb2.append(" access=\"");
                                            sb2.append(pageblockmap.geo.access_hash);
                                            sb2.append('\"');
                                        }
                                    }
                                    if (pageblockmap.zoom != 0) {
                                        sb2.append(" zoom=\"");
                                        sb2.append(pageblockmap.zoom);
                                        sb2.append('\"');
                                    }
                                    if (pageblockmap.w != 0) {
                                        sb2.append(" w=\"");
                                        sb2.append(pageblockmap.w);
                                        sb2.append('\"');
                                    }
                                    if (pageblockmap.h != 0) {
                                        sb2.append(" h=\"");
                                        sb2.append(pageblockmap.h);
                                        sb2.append('\"');
                                    }
                                    sb2.append(" />");
                                    if (z4) {
                                        sb2.append("<figcaption>");
                                        g(sb2, o2);
                                        sb2.append("</figcaption></figure>");
                                    }
                                } else {
                                    String l2 = l(pageBlock);
                                    if (l2 == null) {
                                        SpannableStringBuilder o3 = o(pageBlock);
                                        if (o3 != null && o3.length() > 0) {
                                            sb2.append("<p>");
                                            g(sb2, o3);
                                            sb2.append("</p>");
                                        }
                                    } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                        String str6 = ((TL_iv.pageBlockPreformatted) pageBlock).language;
                                        if (TextUtils.isEmpty(str6)) {
                                            sb2.append("<pre>");
                                        } else {
                                            sb2.append("<pre language=\"");
                                            sb2.append(s(str6));
                                            sb2.append("\">");
                                        }
                                        g(sb2, K(mk0Var, i15, i2, i3, i4, i5));
                                        sb2.append("</pre>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                                        sb2.append("<blockquote class=\"pull\">");
                                        g(sb2, K(mk0Var, i15, i2, i3, i4, i5));
                                        c(sb2, k(((TL_iv.pageBlockPullquote) pageBlock).caption));
                                        sb2.append("</blockquote>");
                                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                                        TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                                        if (pageblockblockquote.collapsed) {
                                            sb2.append("<blockquote collapsed>");
                                        } else {
                                            sb2.append("<blockquote>");
                                        }
                                        g(sb2, K(mk0Var, i15, i2, i3, i4, i5));
                                        c(sb2, k(pageblockblockquote.caption));
                                        sb2.append("</blockquote>");
                                    } else {
                                        sb2.append('<');
                                        sb2.append(l2);
                                        sb2.append('>');
                                        g(sb2, K(mk0Var, i15, i2, i3, i4, i5));
                                        sb2.append("</");
                                        sb2.append(l2);
                                        sb2.append('>');
                                    }
                                }
                                iArr[0] = iArr[0] + 1;
                                pq8Var2 = pq8Var;
                            }
                            iArr[0] = iArr[0] + 1;
                            pq8Var2 = pq8Var;
                        } else {
                            int i18 = mk0Var.c;
                            boolean z5 = mk0Var.d > 0;
                            while (arrayList4.size() > i18) {
                                pq8Var2.j(sb2);
                            }
                            while (true) {
                                str2 = "<ul>";
                                if (arrayList4.size() >= i18) {
                                    break;
                                }
                                if (z5) {
                                    str2 = "<ol>";
                                }
                                sb2.append(str2);
                                arrayList4.add(Boolean.valueOf(z5));
                            }
                            if (!arrayList4.isEmpty() && ((Boolean) c00.g(1, arrayList4)).booleanValue() != z5) {
                                pq8Var2.j(sb2);
                                sb2.append(z5 ? "<ol>" : "<ul>");
                                arrayList4.add(Boolean.valueOf(z5));
                            }
                            sb2.append("<li>");
                            g(sb2, K(mk0Var, iArr[0], i2, i3, i4, i5));
                            sb2.append("</li>");
                            iArr[0] = iArr[0] + 1;
                        }
                    }
                    i9 = i6;
                    arrayList3 = arrayList2;
                    i8 = i7;
                }
            } else if (z) {
                return;
            } else {
                iArr[0] = iArr[0] + 1;
            }
        }
    }

    public static void G(StringBuilder sb, String str, long j, p07 p07Var, TL_iv.PageBlock pageBlock) {
        if (j != 0) {
            SpannableStringBuilder o = o(pageBlock);
            boolean z = o != null && o.length() > 0;
            if (z) {
                sb.append("<figure>");
            }
            i(sb, str, j, p07Var, pageBlock);
            if (z) {
                sb.append("<figcaption>");
                g(sb, o);
                sb.append("</figcaption></figure>");
            }
        }
    }

    public static void H(StringBuilder sb, TL_iv.pageBlockTable pageblocktable) {
        ArrayList<TL_iv.pageTableCell> arrayList;
        sb.append("<table");
        if (pageblocktable.bordered) {
            sb.append(" border=\"1\"");
        }
        if (pageblocktable.striped || pageblocktable.compact) {
            sb.append(" class=\"");
            if (pageblocktable.striped) {
                sb.append("striped");
            }
            if (pageblocktable.striped && pageblocktable.compact) {
                sb.append(' ');
            }
            if (pageblocktable.compact) {
                sb.append("compact");
            }
            sb.append('\"');
        }
        sb.append('>');
        TL_iv.RichText richText = pageblocktable.title;
        SpannableStringBuilder r = richText != null ? mm9.r(richText, null, true) : null;
        if (r != null && r.length() > 0) {
            sb.append("<caption>");
            g(sb, r);
            sb.append("</caption>");
        }
        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                TL_iv.pageTableRow pagetablerow = arrayList2.get(i);
                i++;
                TL_iv.pageTableRow pagetablerow2 = pagetablerow;
                sb.append("<tr>");
                if (pagetablerow2 != null && (arrayList = pagetablerow2.cells) != null) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        TL_iv.pageTableCell pagetablecell = arrayList.get(i2);
                        i2++;
                        TL_iv.pageTableCell pagetablecell2 = pagetablecell;
                        if (pagetablecell2 != null) {
                            String str = pagetablecell2.header ? "th" : "td";
                            sb.append('<');
                            sb.append(str);
                            int i3 = pagetablecell2.colspan;
                            if (i3 <= 1) {
                                i3 = 0;
                            }
                            if (i3 > 0) {
                                sb.append(" colspan=\"");
                                sb.append(i3);
                                sb.append('\"');
                            }
                            int i4 = pagetablecell2.rowspan;
                            if (i4 <= 1) {
                                i4 = 0;
                            }
                            if (i4 > 0) {
                                sb.append(" rowspan=\"");
                                sb.append(i4);
                                sb.append('\"');
                            }
                            String str2 = pagetablecell2.align_right ? "right" : pagetablecell2.align_center ? "center" : null;
                            if (str2 != null) {
                                sb.append(" align=\"");
                                sb.append(str2);
                                sb.append('\"');
                            }
                            String str3 = pagetablecell2.valign_bottom ? "bottom" : pagetablecell2.valign_middle ? "middle" : null;
                            if (str3 != null) {
                                sb.append(" valign=\"");
                                sb.append(str3);
                                sb.append('\"');
                            }
                            sb.append('>');
                            g(sb, ajb.h(pagetablecell2));
                            sb.append("</");
                            sb.append(str);
                            sb.append('>');
                        }
                    }
                }
                sb.append("</tr>");
            }
        }
        sb.append("</table>");
    }

    public static void I(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = mm9.f(charSequence);
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static void J(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageCaption.text = new TL_iv.textEmpty();
        pageCaption.credit = new TL_iv.textEmpty();
        pageBlock.caption = pageCaption;
    }

    public static CharSequence K(mk0 mk0Var, int i, int i2, int i3, int i4, int i5) {
        boolean u3 = pi9.u3(mk0Var);
        TL_iv.PageBlock pageBlock = mk0Var.b;
        CharSequence r = u3 ? mm9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : km9.z(pageBlock);
        if (r == null) {
            r = "";
        }
        int length = r.length();
        int max = i == i2 ? Math.max(0, Math.min(i4, length)) : 0;
        int max2 = i == i3 ? Math.max(0, Math.min(i5, length)) : length;
        if (max > max2) {
            int i6 = max;
            max = max2;
            max2 = i6;
        }
        return (max == 0 && max2 == length) ? r : r.subSequence(max, max2);
    }

    public static CharSequence L(SpannableStringBuilder spannableStringBuilder) {
        char charAt;
        int length = spannableStringBuilder.length();
        int i = 0;
        while (i < length && ((charAt = spannableStringBuilder.charAt(i)) == ' ' || charAt == '\n' || charAt == '\t' || charAt == '\r')) {
            i++;
        }
        while (length > i) {
            char charAt2 = spannableStringBuilder.charAt(length - 1);
            if (charAt2 != ' ' && charAt2 != '\n' && charAt2 != '\t' && charAt2 != '\r') {
                break;
            }
            length--;
        }
        return (i == 0 && length == spannableStringBuilder.length()) ? spannableStringBuilder : spannableStringBuilder.subSequence(i, length);
    }

    public static void a(mk0 mk0Var, ArrayList arrayList) {
        if (mk0Var != null) {
            arrayList.add(mk0Var);
        }
    }

    public static void b(ArrayList arrayList, TL_iv.PageBlock pageBlock, vi9 vi9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, vi9Var, 0, null, 0L);
        km9.b(pageBlock, L(spannableStringBuilder));
        arrayList.add(new mk0(pageBlock, 0, 0));
    }

    public static void c(StringBuilder sb, SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            return;
        }
        sb.append("<cite>");
        g(sb, spannableStringBuilder);
        sb.append("</cite>");
    }

    public static void d(StringBuilder sb, TL_iv.RichText richText, TL_keyboard.InlineButtonType inlineButtonType, TL_keyboard.RichButtonStyle richButtonStyle) {
        if (dj9.c(inlineButtonType)) {
            sb.append("<button");
            if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUrl) {
                sb.append(" data-type=\"url\" data-url=\"");
                sb.append(s(((TL_keyboard.TL_inlineButtonTypeUrl) inlineButtonType).url));
                sb.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeCopy) {
                sb.append(" data-type=\"copy\" data-copy-text=\"");
                sb.append(s(((TL_keyboard.TL_inlineButtonTypeCopy) inlineButtonType).copy_text));
                sb.append("\"");
            } else if (inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeUserProfile) {
                sb.append(" data-type=\"user-profile\" data-user-id=\"");
                sb.append(((TL_keyboard.TL_inlineButtonTypeUserProfile) inlineButtonType).user_id);
                sb.append("\"");
            }
            if (richButtonStyle != null) {
                ik8.z(" data-style=\"", richButtonStyle.bg_primary ? "primary" : richButtonStyle.bg_danger ? "danger" : richButtonStyle.bg_success ? "success" : "default", "\"", sb);
            }
            sb.append(">");
            g(sb, mm9.r(richText, null, true));
            sb.append("</button>");
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, vi9 vi9Var, int i, String str, long j) {
        SpannableStringBuilder spannableStringBuilder2;
        int i2;
        String str2;
        long j2;
        ArrayList arrayList = vi9Var.e;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            vi9 vi9Var2 = (vi9) obj;
            if (vi9Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                j(spannableStringBuilder2, q(vi9Var2.c), i2, str2, j2);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                i2 = i;
                str2 = str;
                j2 = j;
                h(spannableStringBuilder2, vi9Var2, i2, str2, j2);
            }
            spannableStringBuilder = spannableStringBuilder2;
            i = i2;
            str = str2;
            j = j2;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, vi9 vi9Var) {
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList = vi9Var.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vi9 vi9Var2 = (vi9) obj;
            if (vi9Var2.b) {
                spannableStringBuilder2 = spannableStringBuilder;
                j(spannableStringBuilder2, q(vi9Var2.c), 0, null, 0L);
            } else {
                spannableStringBuilder2 = spannableStringBuilder;
                if (!"cite".equals(vi9Var2.a)) {
                    h(spannableStringBuilder2, vi9Var2, 0, null, 0L);
                }
            }
            spannableStringBuilder = spannableStringBuilder2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(StringBuilder sb, CharSequence charSequence) {
        int i;
        dj9 dj9Var;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        int i11 = 0;
        if (!(charSequence instanceof Spanned)) {
            r(sb, charSequence, 0, charSequence.length());
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < length) {
            dj9[] dj9VarArr = (dj9[]) spanned.getSpans(i12, Math.min(length, i12 + 1), dj9.class);
            int length2 = dj9VarArr.length;
            int i13 = i11;
            while (true) {
                if (i13 >= length2) {
                    i = -1;
                    dj9Var = null;
                    break;
                }
                dj9Var = dj9VarArr[i13];
                int spanStart = spanned.getSpanStart(dj9Var);
                i = spanned.getSpanEnd(dj9Var);
                if (spanStart <= i12 && i > i12) {
                    break;
                } else {
                    i13++;
                }
            }
            if (dj9Var != null) {
                TL_iv.textButton textbutton = dj9Var.a;
                if (textbutton != null && dj9.c(textbutton.type)) {
                    d(sb, textbutton.text, textbutton.type, textbutton.style);
                }
                i12 = Math.min(length, i);
            } else {
                int nextSpanTransition = spanned.nextSpanTransition(i12, length, CharacterStyle.class);
                smb[] smbVarArr = (smb[]) spanned.getSpans(i12, nextSpanTransition, smb.class);
                int length3 = smbVarArr.length;
                int i14 = i11;
                int i15 = i14;
                while (i14 < length3) {
                    rmb rmbVar = smbVarArr[i14].b;
                    if (rmbVar != null) {
                        i15 |= rmbVar.a;
                    }
                    i14++;
                }
                h8c[] h8cVarArr = (h8c[]) spanned.getSpans(i12, nextSpanTransition, h8c.class);
                String url = h8cVarArr.length > 0 ? h8cVarArr[i11].getURL() : null;
                hm[] hmVarArr = (hm[]) spanned.getSpans(i12, nextSpanTransition, hm.class);
                if (hmVarArr.length > 0) {
                    hm hmVar = hmVarArr[i11];
                    if (!hmVar.standard) {
                        j = hmVar.getDocumentId();
                        i2 = i15 & 256;
                        if (i2 != 0) {
                            sb.append("<spoiler>");
                        }
                        i3 = i15 & 1;
                        if (i3 != 0) {
                            sb.append("<b>");
                        }
                        i4 = i15 & 2;
                        if (i4 != 0) {
                            sb.append("<i>");
                        }
                        i5 = i15 & 16;
                        if (i5 != 0) {
                            sb.append("<u>");
                        }
                        i6 = i15 & 8;
                        if (i6 != 0) {
                            sb.append("<s>");
                        }
                        i7 = i15 & 4;
                        Spanned spanned2 = spanned;
                        if (i7 != 0) {
                            sb.append("<code>");
                        }
                        i8 = i15 & TLObject.FLAG_14;
                        if (i8 != 0) {
                            sb.append("<sub>");
                        }
                        i9 = 32768 & i15;
                        if (i9 != 0) {
                            sb.append("<sup>");
                        }
                        i10 = i15 & 65536;
                        if (i10 != 0) {
                            sb.append("<mark>");
                        }
                        if (url != null) {
                            sb.append("<a href=\"");
                            sb.append(s(url));
                            sb.append("\">");
                        }
                        if (j != 0) {
                            sb.append("<animated-emoji data-document-id=\"");
                            sb.append(j);
                            sb.append("\">");
                        }
                        r(sb, charSequence, i12, nextSpanTransition);
                        if (j != 0) {
                            sb.append("</animated-emoji>");
                        }
                        if (url != null) {
                            sb.append("</a>");
                        }
                        if (i10 != 0) {
                            sb.append("</mark>");
                        }
                        if (i9 != 0) {
                            sb.append("</sup>");
                        }
                        if (i8 != 0) {
                            sb.append("</sub>");
                        }
                        if (i7 != 0) {
                            sb.append("</code>");
                        }
                        if (i6 != 0) {
                            sb.append("</s>");
                        }
                        if (i5 != 0) {
                            sb.append("</u>");
                        }
                        if (i4 != 0) {
                            sb.append("</i>");
                        }
                        if (i3 != 0) {
                            sb.append("</b>");
                        }
                        if (i2 != 0) {
                            sb.append("</spoiler>");
                        }
                        i12 = nextSpanTransition;
                        spanned = spanned2;
                        i11 = 0;
                    }
                }
                j = 0;
                i2 = i15 & 256;
                if (i2 != 0) {
                }
                i3 = i15 & 1;
                if (i3 != 0) {
                }
                i4 = i15 & 2;
                if (i4 != 0) {
                }
                i5 = i15 & 16;
                if (i5 != 0) {
                }
                i6 = i15 & 8;
                if (i6 != 0) {
                }
                i7 = i15 & 4;
                Spanned spanned22 = spanned;
                if (i7 != 0) {
                }
                i8 = i15 & TLObject.FLAG_14;
                if (i8 != 0) {
                }
                i9 = 32768 & i15;
                if (i9 != 0) {
                }
                i10 = i15 & 65536;
                if (i10 != 0) {
                }
                if (url != null) {
                }
                if (j != 0) {
                }
                r(sb, charSequence, i12, nextSpanTransition);
                if (j != 0) {
                }
                if (url != null) {
                }
                if (i10 != 0) {
                }
                if (i9 != 0) {
                }
                if (i8 != 0) {
                }
                if (i7 != 0) {
                }
                if (i6 != 0) {
                }
                if (i5 != 0) {
                }
                if (i4 != 0) {
                }
                if (i3 != 0) {
                }
                if (i2 != 0) {
                }
                i12 = nextSpanTransition;
                spanned = spanned22;
                i11 = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(SpannableStringBuilder spannableStringBuilder, vi9 vi9Var, int i, String str, long j) {
        int i2;
        String str2;
        int i3;
        long j2;
        TL_keyboard.InlineButtonType v;
        if ("button".equals(vi9Var.a) && (v = v(vi9Var)) != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            e(spannableStringBuilder2, vi9Var, i, str, j);
            if (spannableStringBuilder2.length() > 0) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                TL_iv.textButton textbutton = new TL_iv.textButton();
                textbutton.text = mm9.f(spannableStringBuilder2);
                textbutton.type = v;
                textbutton.style = u(vi9Var);
                spannableStringBuilder.setSpan(new dj9(textbutton), length, spannableStringBuilder.length(), 33);
            }
            return;
        }
        String str3 = vi9Var.a;
        str3.getClass();
        switch (str3) {
            case "spoiler":
                i2 = i | 256;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty() || vi9Var.b) {
                    e(spannableStringBuilder, vi9Var, i2, str2, j2);
                    break;
                }
                break;
            case "strike":
            case "s":
            case "del":
                i2 = i | 8;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                    break;
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "strong":
            case "b":
                i2 = i | 1;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "a":
                String a = vi9Var.a("href");
                if (a != null) {
                    str2 = a;
                    i2 = i;
                    j2 = j;
                    if (vi9Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, vi9Var, i2, str2, j2);
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "i":
            case "em":
                i2 = i | 2;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "u":
                i2 = i | 16;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "br":
                j(spannableStringBuilder, "\n", i, str, j);
                break;
            case "tt":
            case "code":
                i2 = i | 4;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "sub":
                i2 = i | TLObject.FLAG_14;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "sup":
                i3 = 32768;
                i2 = i3 | i;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "mark":
                i3 = 65536;
                i2 = i3 | i;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            case "animated-emoji":
                String a2 = vi9Var.a("data-document-id");
                if (a2 != null) {
                    try {
                        j2 = Long.parseLong(a2.trim());
                        i2 = i;
                        str2 = str;
                    } catch (Exception unused) {
                    }
                    if (vi9Var.e.isEmpty()) {
                    }
                    e(spannableStringBuilder, vi9Var, i2, str2, j2);
                    break;
                }
                i2 = i;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
            default:
                i2 = i;
                str2 = str;
                j2 = j;
                if (vi9Var.e.isEmpty()) {
                }
                e(spannableStringBuilder, vi9Var, i2, str2, j2);
                break;
        }
    }

    public static void i(StringBuilder sb, String str, long j, p07 p07Var, TL_iv.PageBlock pageBlock) {
        sb.append('<');
        sb.append(str);
        sb.append(" src=\"");
        sb.append(j);
        sb.append('\"');
        if (p07Var != null) {
            if (p07Var.j > 0) {
                sb.append(" width=\"");
                sb.append(p07Var.j);
                sb.append('\"');
            }
            if (p07Var.k > 0) {
                sb.append(" height=\"");
                sb.append(p07Var.k);
                sb.append('\"');
            }
        }
        if ((pageBlock instanceof TL_iv.pageBlockPhoto) && ((TL_iv.pageBlockPhoto) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        if ((pageBlock instanceof TL_iv.pageBlockVideo) && ((TL_iv.pageBlockVideo) pageBlock).spoiler) {
            sb.append(" data-spoiler=\"1\"");
        }
        sb.append(" />");
    }

    public static void j(SpannableStringBuilder spannableStringBuilder, String str, int i, String str2, long j) {
        if (str.length() != 0) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            int length2 = spannableStringBuilder.length();
            if (j != 0) {
                spannableStringBuilder.setSpan(new hm(j, (Paint.FontMetricsInt) null), length, length2, 33);
            }
            if (i != 0) {
                rmb rmbVar = new rmb();
                rmbVar.a = i & 114975;
                spannableStringBuilder.setSpan(new smb(rmbVar, hl.L(xea.S0)), length, length2, 33);
            }
            if (str2 != null) {
                spannableStringBuilder.setSpan(mm9.k(str2), length, length2, 33);
            }
        }
    }

    public static SpannableStringBuilder k(TL_iv.RichText richText) {
        if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
            SpannableStringBuilder r = mm9.r(richText, null, true);
            if (r.length() > 0) {
                return r;
            }
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

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mk0 m(vi9 vi9Var) {
        double parseDouble;
        String a;
        String str = vi9Var.a;
        str.getClass();
        switch (str) {
            case "div":
                String a2 = vi9Var.a("class");
                String lowerCase = a2 == null ? "" : a2.toLowerCase();
                if (lowerCase.contains("slideshow")) {
                    return B(vi9Var, true);
                }
                if (lowerCase.contains("collage")) {
                    return B(vi9Var, false);
                }
                return null;
            case "img":
                return n(vi9Var, false);
            case "audio":
                long E = E(vi9Var.a("src"));
                if (E <= 0) {
                    return null;
                }
                TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
                pageblockaudio.audio_id = E;
                J(pageblockaudio);
                return new mk0(pageblockaudio, 0, 0);
            case "video":
                return n(vi9Var, true);
            case "document":
                long E2 = E(vi9Var.a("src"));
                if (E2 <= 0) {
                    return null;
                }
                TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
                pageblockdocument.document_id = E2;
                J(pageblockdocument);
                return new mk0(pageblockdocument, 0, 0);
            case "location":
                TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                String a3 = vi9Var.a("lat");
                double d = 0.0d;
                if (a3 != null) {
                    try {
                        parseDouble = Double.parseDouble(a3.trim());
                    } catch (Exception unused) {
                    }
                    tL_geoPoint.lat = parseDouble;
                    a = vi9Var.a("long");
                    if (a != null) {
                        try {
                            d = Double.parseDouble(a.trim());
                        } catch (Exception unused2) {
                        }
                    }
                    tL_geoPoint._long = d;
                    tL_geoPoint.access_hash = E(vi9Var.a("access"));
                    pageblockmap.geo = tL_geoPoint;
                    pageblockmap.zoom = C(15, vi9Var.a("zoom"));
                    pageblockmap.w = C(600, vi9Var.a("w"));
                    pageblockmap.h = C(400, vi9Var.a("h"));
                    J(pageblockmap);
                    return new mk0(pageblockmap, 0, 0);
                }
                parseDouble = 0.0d;
                tL_geoPoint.lat = parseDouble;
                a = vi9Var.a("long");
                if (a != null) {
                }
                tL_geoPoint._long = d;
                tL_geoPoint.access_hash = E(vi9Var.a("access"));
                pageblockmap.geo = tL_geoPoint;
                pageblockmap.zoom = C(15, vi9Var.a("zoom"));
                pageblockmap.w = C(600, vi9Var.a("w"));
                pageblockmap.h = C(400, vi9Var.a("h"));
                J(pageblockmap);
                return new mk0(pageblockmap, 0, 0);
            default:
                return null;
        }
    }

    public static mk0 n(vi9 vi9Var, boolean z) {
        long E = E(vi9Var.a("src"));
        if (E <= 0) {
            return null;
        }
        TL_iv.PageBlock y = y(E, z, vi9Var.b("data-spoiler"));
        J(y);
        return new mk0(y, 0, 0);
    }

    public static SpannableStringBuilder o(TL_iv.PageBlock pageBlock) {
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        if (pageBlock != null && (pageCaption = pageBlock.caption) != null && (richText = pageCaption.text) != null) {
            SpannableStringBuilder r = mm9.r(richText, null, true);
            if (r.length() > 0) {
                return r;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void p(vi9 vi9Var, TL_iv.pageBlockTable pageblocktable) {
        String lowerCase;
        int indexOf;
        ArrayList arrayList = vi9Var.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            vi9 vi9Var2 = (vi9) obj;
            if (!vi9Var2.b) {
                String str = vi9Var2.a;
                str.getClass();
                int i3 = -1;
                switch (str.hashCode()) {
                    case 3710:
                        if (str.equals("tr")) {
                            i3 = i;
                            break;
                        }
                        break;
                    case 110157846:
                        if (str.equals("tbody")) {
                            i3 = 1;
                            break;
                        }
                        break;
                    case 110277346:
                        if (str.equals("tfoot")) {
                            i3 = 2;
                            break;
                        }
                        break;
                    case 110326868:
                        if (str.equals("thead")) {
                            i3 = 3;
                            break;
                        }
                        break;
                    case 552573414:
                        if (str.equals("caption")) {
                            i3 = 4;
                            break;
                        }
                        break;
                }
                switch (i3) {
                    case 0:
                        ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                        pagetablerow.cells = new ArrayList<>();
                        ArrayList arrayList3 = vi9Var2.e;
                        int size2 = arrayList3.size();
                        int i4 = i;
                        while (i4 < size2) {
                            Object obj2 = arrayList3.get(i4);
                            i4++;
                            vi9 vi9Var3 = (vi9) obj2;
                            if (!vi9Var3.b) {
                                if ("td".equals(vi9Var3.a) || "th".equals(vi9Var3.a)) {
                                    TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                                    pagetablecell.colspan = C(i, vi9Var3.a("colspan"));
                                    pagetablecell.rowspan = C(i, vi9Var3.a("rowspan"));
                                    ajb.d(pagetablecell, w(vi9Var3));
                                    ajb.l(pagetablecell, ("th".equals(vi9Var3.a) || vi9Var3.b("header")) ? 1 : i);
                                    String a = vi9Var3.a("align");
                                    if (a == null) {
                                        String a2 = vi9Var3.a("style");
                                        if (a2 != null && (indexOf = (lowerCase = a2.toLowerCase()).indexOf("text-align")) >= 0) {
                                            if (lowerCase.indexOf("center", indexOf) >= 0) {
                                                a = "center";
                                            } else if (lowerCase.indexOf("right", indexOf) >= 0) {
                                                a = "right";
                                            }
                                        }
                                        a = null;
                                    }
                                    if ("center".equalsIgnoreCase(a)) {
                                        ajb.k(pagetablecell, 1);
                                    } else if ("right".equalsIgnoreCase(a)) {
                                        ajb.k(pagetablecell, 2);
                                    }
                                    String a3 = vi9Var3.a("valign");
                                    if ("middle".equalsIgnoreCase(a3)) {
                                        ajb.m(pagetablecell, 1);
                                    } else if ("bottom".equalsIgnoreCase(a3)) {
                                        ajb.m(pagetablecell, 2);
                                    }
                                    pagetablerow.cells.add(pagetablecell);
                                }
                            }
                            i = 0;
                        }
                        if (pagetablerow.cells.isEmpty()) {
                            pagetablerow.cells.add(ajb.f());
                        }
                        arrayList2.add(pagetablerow);
                        break;
                    case 1:
                    case 2:
                    case 3:
                        p(vi9Var2, pageblocktable);
                        break;
                    case 4:
                        pageblocktable.title = mm9.f(w(vi9Var2));
                        break;
                }
                i = 0;
            }
        }
    }

    public static String q(String str) {
        String substring;
        String str2;
        if (str == null) {
            return "";
        }
        if (str.indexOf(38) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != '&') {
                sb.append(charAt);
            } else {
                int i2 = i + 1;
                int indexOf = str.indexOf(59, i2);
                if (indexOf < 0 || indexOf - i > 12) {
                    sb.append(charAt);
                } else {
                    substring = str.substring(i2, indexOf);
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
                                    str2 = new String(Character.toChars((substring.charAt(1) == 'x' || substring.charAt(1) == 'X') ? Integer.parseInt(substring.substring(2), 16) : Integer.parseInt(substring.substring(1))));
                                    break;
                                } catch (Exception unused) {
                                    break;
                                }
                            }
                            break;
                    }
                    if (str2 != null) {
                        sb.append(str2);
                        i = indexOf;
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    public static void r(StringBuilder sb, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\n') {
                sb.append("<br>");
            } else if (charAt == '<') {
                sb.append("&lt;");
            } else if (charAt == '>') {
                sb.append("&gt;");
            } else if (charAt == '&') {
                sb.append("&amp;");
            } else {
                sb.append(charAt);
            }
            i++;
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
        pageblockparagraph.text = mm9.f(L(spannableStringBuilder));
        arrayList.add(new mk0(pageblockparagraph, 0, 0));
    }

    public static TL_keyboard.RichButtonStyle u(vi9 vi9Var) {
        TL_keyboard.RichButtonStyle richButtonStyle = new TL_keyboard.RichButtonStyle();
        String a = vi9Var.a("data-style");
        richButtonStyle.bg_primary = "primary".equals(a);
        richButtonStyle.bg_danger = "danger".equals(a);
        richButtonStyle.bg_success = "success".equals(a);
        return richButtonStyle;
    }

    public static TL_keyboard.InlineButtonType v(vi9 vi9Var) {
        String a = vi9Var.a("data-type");
        if ("url".equals(a)) {
            String a2 = vi9Var.a("data-url");
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
            tL_inlineButtonTypeUrl.url = a2;
            return tL_inlineButtonTypeUrl;
        }
        if ("copy".equals(a)) {
            String a3 = vi9Var.a("data-copy-text");
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
            tL_inlineButtonTypeCopy.copy_text = a3;
            return tL_inlineButtonTypeCopy;
        }
        if (!"user-profile".equals(a)) {
            return null;
        }
        long E = E(vi9Var.a("data-user-id"));
        if (E <= 0) {
            return null;
        }
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = E;
        return tL_inlineButtonTypeUserProfile;
    }

    public static CharSequence w(vi9 vi9Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        e(spannableStringBuilder, vi9Var, 0, null, 0L);
        return L(spannableStringBuilder);
    }

    public static boolean x(String str) {
        if (str == null) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\t' && charAt != '\r' && charAt != 160) {
                return false;
            }
        }
        return true;
    }

    public static TL_iv.PageBlock y(long j, boolean z, boolean z2) {
        if (z) {
            TL_iv.pageBlockVideo pageblockvideo = new TL_iv.pageBlockVideo();
            if (j <= 0) {
                j = 0;
            }
            pageblockvideo.video_id = j;
            pageblockvideo.spoiler = z2;
            return pageblockvideo;
        }
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        if (j <= 0) {
            j = 0;
        }
        pageblockphoto.photo_id = j;
        pageblockphoto.spoiler = z2;
        return pageblockphoto;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x029d, code lost:
    
        if (r5.equals("hr") == false) goto L170;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList z(String str, HashMap hashMap) {
        int indexOf;
        char c;
        int i;
        String str2;
        int i2;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            while (true) {
                if (i3 < str.length()) {
                    char c2 = 1;
                    if (str.charAt(i3) != '<') {
                        indexOf = str.indexOf(60, i3);
                        if (indexOf < 0) {
                            indexOf = str.length();
                        }
                        String substring = str.substring(i3, indexOf);
                        if (!substring.isEmpty()) {
                            vi9 vi9Var = new vi9();
                            vi9Var.b = true;
                            vi9Var.c = substring;
                            if (arrayList3.isEmpty()) {
                                arrayList2.add(vi9Var);
                            } else {
                                ((vi9) c00.g(1, arrayList3)).e.add(vi9Var);
                            }
                        }
                    } else if (str.startsWith("<!--", i3)) {
                        int indexOf2 = str.indexOf("-->", i3 + 4);
                        i3 = indexOf2 < 0 ? str.length() : indexOf2 + 3;
                    } else if (i3 + 1 < str.length() && str.charAt(i3 + 1) == '!') {
                        int indexOf3 = str.indexOf(62, i3);
                        i3 = indexOf3 < 0 ? str.length() : indexOf3 + 1;
                    } else if (i3 + 1 >= str.length() || str.charAt(i3 + 1) != '/') {
                        int i4 = i3 + 1;
                        boolean z = false;
                        char c3 = 0;
                        while (true) {
                            c = '\'';
                            if (i4 < str.length()) {
                                char charAt = str.charAt(i4);
                                if (z) {
                                    if (charAt == c3) {
                                        z = false;
                                    }
                                } else if (charAt == '\"' || charAt == '\'') {
                                    z = true;
                                    c3 = charAt;
                                } else if (charAt == '>') {
                                }
                                i4++;
                            } else {
                                i4 = -1;
                            }
                        }
                        if (i4 >= 0) {
                            String substring2 = str.substring(i3 + 1, i4);
                            indexOf = i4 + 1;
                            boolean endsWith = substring2.endsWith("/");
                            if (endsWith) {
                                substring2 = bs2.n(1, 0, substring2);
                            }
                            String trim = substring2.trim();
                            vi9 vi9Var2 = null;
                            if (!trim.isEmpty()) {
                                int i5 = 0;
                                while (i5 < trim.length() && !txe.a(trim.charAt(i5))) {
                                    i5++;
                                }
                                String lowerCase = trim.substring(0, i5).toLowerCase();
                                if (!lowerCase.isEmpty()) {
                                    vi9Var2 = new vi9();
                                    vi9Var2.a = lowerCase;
                                    while (i5 < trim.length()) {
                                        while (i5 < trim.length() && txe.a(trim.charAt(i5))) {
                                            i5++;
                                        }
                                        if (i5 < trim.length()) {
                                            int i6 = i5;
                                            while (i6 < trim.length() && trim.charAt(i6) != '=' && !txe.a(trim.charAt(i6))) {
                                                i6++;
                                            }
                                            String lowerCase2 = trim.substring(i5, i6).toLowerCase();
                                            while (i6 < trim.length() && txe.a(trim.charAt(i6))) {
                                                i6++;
                                            }
                                            if (i6 >= trim.length() || trim.charAt(i6) != '=') {
                                                i = i6;
                                                str2 = "";
                                            } else {
                                                do {
                                                    i6++;
                                                    if (i6 < trim.length()) {
                                                    }
                                                    if (i6 < trim.length() || !(trim.charAt(i6) == '\"' || trim.charAt(i6) == c)) {
                                                        i2 = i6;
                                                        while (i2 < trim.length() && !txe.a(trim.charAt(i2))) {
                                                            i2++;
                                                        }
                                                        str2 = trim.substring(i6, i2);
                                                        i = i2;
                                                    } else {
                                                        char charAt2 = trim.charAt(i6);
                                                        int i7 = i6 + 1;
                                                        i = i7;
                                                        while (i < trim.length() && trim.charAt(i) != charAt2) {
                                                            i++;
                                                        }
                                                        str2 = trim.substring(i7, Math.min(i, trim.length()));
                                                        if (i < trim.length()) {
                                                            i++;
                                                        }
                                                    }
                                                } while (txe.a(trim.charAt(i6)));
                                                if (i6 < trim.length()) {
                                                }
                                                i2 = i6;
                                                while (i2 < trim.length()) {
                                                    i2++;
                                                }
                                                str2 = trim.substring(i6, i2);
                                                i = i2;
                                            }
                                            if (!lowerCase2.isEmpty()) {
                                                HashMap hashMap2 = vi9Var2.d;
                                                if (hashMap2 == null) {
                                                    hashMap2 = new HashMap();
                                                    vi9Var2.d = hashMap2;
                                                }
                                                hashMap2.put(lowerCase2, q(str2));
                                            }
                                            i5 = i;
                                            c = '\'';
                                        }
                                    }
                                }
                            }
                            if (vi9Var2 != null) {
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(vi9Var2);
                                } else {
                                    ((vi9) c00.g(1, arrayList3)).e.add(vi9Var2);
                                }
                                if (!endsWith) {
                                    String str3 = vi9Var2.a;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case 3152:
                                            if (str3.equals("br")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3338:
                                            break;
                                        case 104387:
                                            if (str3.equals("img")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 117511:
                                            if (str3.equals("wbr")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3321850:
                                            if (str3.equals("link")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 3347973:
                                            if (str3.equals("meta")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 100358090:
                                            if (str3.equals("input")) {
                                                c2 = 6;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    switch (c2) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            break;
                                        default:
                                            arrayList3.add(vi9Var2);
                                            break;
                                    }
                                }
                            }
                        } else {
                            String substring3 = str.substring(i3);
                            if (!substring3.isEmpty()) {
                                vi9 vi9Var3 = new vi9();
                                vi9Var3.b = true;
                                vi9Var3.c = substring3;
                                if (arrayList3.isEmpty()) {
                                    arrayList2.add(vi9Var3);
                                } else {
                                    ((vi9) c00.g(1, arrayList3)).e.add(vi9Var3);
                                }
                            }
                        }
                    } else {
                        int indexOf4 = str.indexOf(62, i3);
                        String lowerCase3 = str.substring(i3 + 2, indexOf4 < 0 ? str.length() : indexOf4).trim().toLowerCase();
                        indexOf = indexOf4 < 0 ? str.length() : indexOf4 + 1;
                        int size = arrayList3.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                if (((vi9) arrayList3.get(size)).a.equals(lowerCase3)) {
                                    while (arrayList3.size() > size) {
                                        qd4.v(1, arrayList3);
                                    }
                                } else {
                                    size--;
                                }
                            }
                        }
                    }
                    i3 = indexOf;
                }
            }
            A(arrayList2, arrayList, hashMap);
            if (arrayList.isEmpty()) {
                arrayList.add(new mk0(new TL_iv.pageBlockParagraph(), 0, 0));
            }
        }
        return arrayList;
    }
}
