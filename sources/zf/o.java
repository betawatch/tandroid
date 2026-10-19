package zf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.messenger.CharacterCompat;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.n11;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public abstract class o {
    public static void a(m11 m11Var, StringBuilder sb2) {
        if (m11Var == null) {
            return;
        }
        if ((m11Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((m11Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((m11Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((m11Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((m11Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((m11Var.a & 4) > 0) {
            sb2.append("<code>");
        }
        if ((m11Var.a & 128) <= 0 || m11Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(m11Var.d.url);
        sb2.append("\">");
    }

    public static void b(m11 m11Var, StringBuilder sb2) {
        if (m11Var == null) {
            return;
        }
        if ((m11Var.a & 128) > 0 && m11Var.d != null) {
            sb2.append("</a>");
        }
        if ((m11Var.a & 4) > 0) {
            sb2.append("</code>");
        }
        if ((m11Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((m11Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((m11Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((m11Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((m11Var.a & 768) > 0) {
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
        int i14;
        StringBuilder sb2 = new StringBuilder();
        int length = spanned.length();
        int i15 = 0;
        while (i15 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, pj0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            pj0[] pj0VarArr = (pj0[]) spanned.getSpans(i15, nextSpanTransition, pj0.class);
            if (pj0VarArr != null) {
                for (pj0 pj0Var : pj0VarArr) {
                    sb2.append(pj0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, n11.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                n11[] n11VarArr = (n11[]) spanned.getSpans(i15, nextSpanTransition2, n11.class);
                String str3 = "<pre>";
                if (n11VarArr != null) {
                    for (n11 n11Var : n11VarArr) {
                        if (n11Var != null) {
                            a(n11Var.b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, m61.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    m61[] m61VarArr = (m61[]) spanned.getSpans(i15, nextSpanTransition3, m61.class);
                    String str4 = "\">";
                    if (m61VarArr != null) {
                        for (m61 m61Var : m61VarArr) {
                            a(m61Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(m61Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, j61.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        j61[] j61VarArr = (j61[]) spanned.getSpans(i15, nextSpanTransition4, j61.class);
                        if (j61VarArr != null) {
                            for (j61 j61Var : j61VarArr) {
                                if (j61Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, mi.h.class);
                            int i16 = length;
                            int i17 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            mi.h[] hVarArr = (mi.h[]) spanned.getSpans(i15, i17, mi.h.class);
                            int i18 = i15;
                            int i19 = nextSpanTransition;
                            if (hVarArr != null) {
                                int i20 = 0;
                                while (i20 < hVarArr.length) {
                                    mi.h hVar = hVarArr[i20];
                                    if (hVar != null) {
                                        String str5 = hVar.a;
                                        if (TextUtils.isEmpty(str5)) {
                                            sb2.append(str3);
                                        } else {
                                            i14 = i20;
                                            sb2.append("<pre lang=\"");
                                            sb2.append(str5);
                                            sb2.append(str4);
                                            i20 = i14 + 1;
                                        }
                                    }
                                    i14 = i20;
                                    i20 = i14 + 1;
                                }
                            }
                            int i21 = i18;
                            while (i21 < i17) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i17, a6.class);
                                int i22 = i17;
                                if (nextSpanTransition6 >= 0) {
                                    i17 = nextSpanTransition6;
                                }
                                a6[] a6VarArr = (a6[]) spanned.getSpans(i21, i17, a6.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (a6VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < a6VarArr.length) {
                                        a6 a6Var = a6VarArr[i25];
                                        int i26 = i25;
                                        if (a6Var == null || a6Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + a6Var.documentId + str4);
                                        }
                                        i25 = i26 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str6 = str3;
                                int i27 = i23;
                                while (i27 < i17) {
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
                                                    if (i28 >= i17 || spanned.charAt(i28) != ' ') {
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
                                            if (charAt < 56320 && (i13 = i10 + 1) < i17) {
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
                                String str7 = str4;
                                if (a6VarArr != null) {
                                    for (a6 a6Var2 : a6VarArr) {
                                        if (a6Var2 != null && !a6Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i17;
                                i17 = i22;
                                nextSpanTransition2 = i24;
                                str3 = str6;
                                nextSpanTransition3 = i30;
                                str4 = str7;
                            }
                            int i31 = i17;
                            int i32 = nextSpanTransition2;
                            String str8 = str3;
                            int i33 = nextSpanTransition3;
                            String str9 = str4;
                            if (hVarArr != null) {
                                for (mi.h hVar2 : hVarArr) {
                                    if (hVar2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i16;
                            nextSpanTransition = i19;
                            i15 = i31;
                            nextSpanTransition2 = i32;
                            str3 = str8;
                            nextSpanTransition3 = i33;
                            str4 = str9;
                        }
                        int i34 = length;
                        int i35 = nextSpanTransition;
                        int i36 = nextSpanTransition2;
                        String str10 = str3;
                        int i37 = nextSpanTransition3;
                        String str11 = str4;
                        if (j61VarArr != null) {
                            for (j61 j61Var2 : j61VarArr) {
                                if (j61Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i15 = nextSpanTransition4;
                        length = i34;
                        nextSpanTransition = i35;
                        nextSpanTransition2 = i36;
                        str3 = str10;
                        nextSpanTransition3 = i37;
                        str4 = str11;
                    }
                    int i38 = length;
                    int i39 = nextSpanTransition;
                    int i40 = nextSpanTransition2;
                    String str12 = str3;
                    int i41 = nextSpanTransition3;
                    if (m61VarArr != null) {
                        for (m61 m61Var2 : m61VarArr) {
                            sb2.append("</a>");
                            b(m61Var2.a, sb2);
                        }
                    }
                    length = i38;
                    nextSpanTransition = i39;
                    nextSpanTransition2 = i40;
                    str3 = str12;
                    i15 = i41;
                }
                int i42 = length;
                int i43 = nextSpanTransition;
                int i44 = nextSpanTransition2;
                if (n11VarArr != null) {
                    for (n11 n11Var2 : n11VarArr) {
                        if (n11Var2 != null) {
                            b(n11Var2.b, sb2);
                        }
                    }
                }
                length = i42;
                nextSpanTransition = i43;
                i15 = i44;
            }
            int i45 = length;
            int i46 = nextSpanTransition;
            if (pj0VarArr != null) {
                for (int length2 = pj0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i45;
            i15 = i46;
        }
        return sb2.toString();
    }
}
