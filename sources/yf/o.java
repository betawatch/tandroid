package yf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.o01;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(o01 o01Var, StringBuilder sb2) {
        if (o01Var == null) {
            return;
        }
        if ((o01Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((o01Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((o01Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((o01Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((o01Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((o01Var.a & 128) <= 0 || o01Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(o01Var.d.url);
        sb2.append("\">");
    }

    public static void b(o01 o01Var, StringBuilder sb2) {
        if (o01Var == null) {
            return;
        }
        if ((o01Var.a & 128) > 0 && o01Var.d != null) {
            sb2.append("</a>");
        }
        if ((o01Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((o01Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((o01Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((o01Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((o01Var.a & 768) > 0) {
            sb2.append("</spoiler>");
        }
    }

    public static String c(Spanned spanned) {
        int i10;
        int i11;
        String str;
        int i12;
        int i13;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i14 = 0;
        while (i14 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, si0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            si0[] si0VarArr = (si0[]) spanned.getSpans(i14, nextSpanTransition, si0.class);
            if (si0VarArr != null) {
                for (si0 si0Var : si0VarArr) {
                    sb2.append(si0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, p01.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                p01[] p01VarArr = (p01[]) spanned.getSpans(i14, nextSpanTransition2, p01.class);
                String str3 = "<pre>";
                if (p01VarArr != null) {
                    for (p01 p01Var : p01VarArr) {
                        if (p01Var != null) {
                            a(p01Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, o51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    o51[] o51VarArr = (o51[]) spanned.getSpans(i14, nextSpanTransition3, o51.class);
                    String str4 = "\">";
                    if (o51VarArr != null) {
                        for (o51 o51Var : o51VarArr) {
                            a(o51Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(o51Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, l51.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        l51[] l51VarArr = (l51[]) spanned.getSpans(i14, nextSpanTransition4, l51.class);
                        if (l51VarArr != null) {
                            for (l51 l51Var : l51VarArr) {
                                if (l51Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i14 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i14, nextSpanTransition4, CodeHighlighting.Span.class);
                            int i15 = length;
                            int i16 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            CodeHighlighting.Span[] spanArr = (CodeHighlighting.Span[]) spanned.getSpans(i14, i16, CodeHighlighting.Span.class);
                            int i17 = i14;
                            int i18 = nextSpanTransition;
                            if (spanArr != null) {
                                int i19 = 0;
                                while (i19 < spanArr.length) {
                                    CodeHighlighting.Span span = spanArr[i19];
                                    int i20 = i19;
                                    if (span != null) {
                                        if (TextUtils.isEmpty(span.lng)) {
                                            sb2.append(str3);
                                        } else {
                                            sb2.append("<pre lang=\"");
                                            sb2.append(span.lng);
                                            sb2.append(str4);
                                        }
                                    }
                                    i19 = i20 + 1;
                                }
                            }
                            int i21 = i17;
                            while (i21 < i16) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i16, x5.class);
                                int i22 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                x5[] x5VarArr = (x5[]) spanned.getSpans(i21, i16, x5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (x5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < x5VarArr.length) {
                                        x5 x5Var = x5VarArr[i25];
                                        int i26 = i25;
                                        if (x5Var == null || x5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + x5Var.documentId + str4);
                                        }
                                        i25 = i26 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str5 = str3;
                                int i27 = i23;
                                while (i27 < i16) {
                                    char charAt = spanned.charAt(i27);
                                    if (charAt == '\n') {
                                        sb2.append("<br>");
                                    } else if (charAt == '<') {
                                        sb2.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb2.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb2.append("&amp;");
                                    } else {
                                        i10 = i27;
                                        i11 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb2.append("&#");
                                                sb2.append((int) charAt);
                                                sb2.append(";");
                                            } else if (charAt == ' ') {
                                                i12 = i10;
                                                while (true) {
                                                    int i28 = i12 + 1;
                                                    if (i28 >= i16 || spanned.charAt(i28) != ' ') {
                                                        break;
                                                    }
                                                    sb2.append("&nbsp;");
                                                    i12 = i28;
                                                }
                                                sb2.append(' ');
                                                i27 = i12 + 1;
                                                nextSpanTransition3 = i11;
                                                str4 = str;
                                            } else {
                                                sb2.append(charAt);
                                            }
                                            i12 = i10;
                                            i27 = i12 + 1;
                                            nextSpanTransition3 = i11;
                                            str4 = str;
                                        } else {
                                            if (charAt < 56320 && (i13 = i10 + 1) < i16) {
                                                str = str4;
                                                char charAt2 = spanned.charAt(i13);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    int i29 = ((charAt - CharacterCompat.MIN_HIGH_SURROGATE) << 10) | 65536 | (charAt2 - CharacterCompat.MIN_LOW_SURROGATE);
                                                    sb2.append("&#");
                                                    sb2.append(i29);
                                                    sb2.append(";");
                                                    i12 = i13;
                                                    i27 = i12 + 1;
                                                    nextSpanTransition3 = i11;
                                                    str4 = str;
                                                }
                                                i12 = i10;
                                                i27 = i12 + 1;
                                                nextSpanTransition3 = i11;
                                                str4 = str;
                                            }
                                            str = str4;
                                            i12 = i10;
                                            i27 = i12 + 1;
                                            nextSpanTransition3 = i11;
                                            str4 = str;
                                        }
                                    }
                                    i10 = i27;
                                    i11 = nextSpanTransition3;
                                    str = str4;
                                    i12 = i10;
                                    i27 = i12 + 1;
                                    nextSpanTransition3 = i11;
                                    str4 = str;
                                }
                                int i30 = nextSpanTransition3;
                                String str6 = str4;
                                if (x5VarArr != null) {
                                    for (x5 x5Var2 : x5VarArr) {
                                        if (x5Var2 != null && !x5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i16;
                                i16 = i22;
                                nextSpanTransition2 = i24;
                                str3 = str5;
                                nextSpanTransition3 = i30;
                                str4 = str6;
                            }
                            int i31 = i16;
                            int i32 = nextSpanTransition2;
                            String str7 = str3;
                            int i33 = nextSpanTransition3;
                            String str8 = str4;
                            if (spanArr != null) {
                                for (CodeHighlighting.Span span2 : spanArr) {
                                    if (span2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i15;
                            nextSpanTransition = i18;
                            i14 = i31;
                            nextSpanTransition2 = i32;
                            str3 = str7;
                            nextSpanTransition3 = i33;
                            str4 = str8;
                        }
                        int i34 = length;
                        int i35 = nextSpanTransition;
                        int i36 = nextSpanTransition2;
                        String str9 = str3;
                        int i37 = nextSpanTransition3;
                        String str10 = str4;
                        if (l51VarArr != null) {
                            for (l51 l51Var2 : l51VarArr) {
                                if (l51Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i14 = nextSpanTransition4;
                        length = i34;
                        nextSpanTransition = i35;
                        nextSpanTransition2 = i36;
                        str3 = str9;
                        nextSpanTransition3 = i37;
                        str4 = str10;
                    }
                    int i38 = length;
                    int i39 = nextSpanTransition;
                    int i40 = nextSpanTransition2;
                    String str11 = str3;
                    int i41 = nextSpanTransition3;
                    if (o51VarArr != null) {
                        for (o51 o51Var2 : o51VarArr) {
                            sb2.append("</a>");
                            b(o51Var2.a, sb2);
                        }
                    }
                    length = i38;
                    nextSpanTransition = i39;
                    nextSpanTransition2 = i40;
                    str3 = str11;
                    i14 = i41;
                }
                int i42 = length;
                int i43 = nextSpanTransition;
                int i44 = nextSpanTransition2;
                if (p01VarArr != null) {
                    for (p01 p01Var2 : p01VarArr) {
                        if (p01Var2 != null) {
                            b(p01Var2.b, sb2);
                        }
                    }
                }
                length = i42;
                nextSpanTransition = i43;
                i14 = i44;
            }
            int i45 = length;
            int i46 = nextSpanTransition;
            if (si0VarArr != null) {
                for (int length2 = si0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i45;
            i14 = i46;
        }
        return sb2.toString();
    }
}
