package yf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(e11 e11Var, StringBuilder sb2) {
        if (e11Var == null) {
            return;
        }
        if ((e11Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((e11Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((e11Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((e11Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((e11Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((e11Var.a & 128) <= 0 || e11Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(e11Var.d.url);
        sb2.append("\">");
    }

    public static void b(e11 e11Var, StringBuilder sb2) {
        if (e11Var == null) {
            return;
        }
        if ((e11Var.a & 128) > 0 && e11Var.d != null) {
            sb2.append("</a>");
        }
        if ((e11Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((e11Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((e11Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((e11Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((e11Var.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i14, length, fj0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            fj0[] fj0VarArr = (fj0[]) spanned.getSpans(i14, nextSpanTransition, fj0.class);
            if (fj0VarArr != null) {
                for (fj0 fj0Var : fj0VarArr) {
                    sb2.append(fj0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i14 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i14, nextSpanTransition, f11.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                f11[] f11VarArr = (f11[]) spanned.getSpans(i14, nextSpanTransition2, f11.class);
                String str3 = "<pre>";
                if (f11VarArr != null) {
                    for (f11 f11Var : f11VarArr) {
                        if (f11Var != null) {
                            a(f11Var.b, sb2);
                        }
                    }
                }
                while (i14 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i14, nextSpanTransition2, e61.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    e61[] e61VarArr = (e61[]) spanned.getSpans(i14, nextSpanTransition3, e61.class);
                    String str4 = "\">";
                    if (e61VarArr != null) {
                        for (e61 e61Var : e61VarArr) {
                            a(e61Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(e61Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i14 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i14, nextSpanTransition3, b61.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        b61[] b61VarArr = (b61[]) spanned.getSpans(i14, nextSpanTransition4, b61.class);
                        if (b61VarArr != null) {
                            for (b61 b61Var : b61VarArr) {
                                if (b61Var != null) {
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i16, y5.class);
                                int i22 = i16;
                                if (nextSpanTransition6 >= 0) {
                                    i16 = nextSpanTransition6;
                                }
                                y5[] y5VarArr = (y5[]) spanned.getSpans(i21, i16, y5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (y5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < y5VarArr.length) {
                                        y5 y5Var = y5VarArr[i25];
                                        int i26 = i25;
                                        if (y5Var == null || y5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + y5Var.documentId + str4);
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
                                if (y5VarArr != null) {
                                    for (y5 y5Var2 : y5VarArr) {
                                        if (y5Var2 != null && !y5Var2.standard) {
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
                        if (b61VarArr != null) {
                            for (b61 b61Var2 : b61VarArr) {
                                if (b61Var2 != null) {
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
                    if (e61VarArr != null) {
                        for (e61 e61Var2 : e61VarArr) {
                            sb2.append("</a>");
                            b(e61Var2.a, sb2);
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
                if (f11VarArr != null) {
                    for (f11 f11Var2 : f11VarArr) {
                        if (f11Var2 != null) {
                            b(f11Var2.b, sb2);
                        }
                    }
                }
                length = i42;
                nextSpanTransition = i43;
                i14 = i44;
            }
            int i45 = length;
            int i46 = nextSpanTransition;
            if (fj0VarArr != null) {
                for (int length2 = fj0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i45;
            i14 = i46;
        }
        return sb2.toString();
    }
}
