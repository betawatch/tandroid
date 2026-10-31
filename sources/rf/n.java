package rf;

import android.text.Spanned;
import android.text.TextUtils;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class n {
    public static void a(yz0 yz0Var, StringBuilder sb2) {
        if (yz0Var == null) {
            return;
        }
        if ((yz0Var.a & 768) > 0) {
            sb2.append("<spoiler>");
        }
        if ((yz0Var.a & 1) > 0) {
            sb2.append("<b>");
        }
        if ((yz0Var.a & 2) > 0) {
            sb2.append("<i>");
        }
        if ((yz0Var.a & 16) > 0) {
            sb2.append("<u>");
        }
        if ((yz0Var.a & 8) > 0) {
            sb2.append("<s>");
        }
        if ((yz0Var.a & 4) > 0) {
            sb2.append("<code>");
        }
        if ((yz0Var.a & 128) <= 0 || yz0Var.d == null) {
            return;
        }
        sb2.append("<a href=\"");
        sb2.append(yz0Var.d.url);
        sb2.append("\">");
    }

    public static void b(yz0 yz0Var, StringBuilder sb2) {
        if (yz0Var == null) {
            return;
        }
        if ((yz0Var.a & 128) > 0 && yz0Var.d != null) {
            sb2.append("</a>");
        }
        if ((yz0Var.a & 4) > 0) {
            sb2.append("</code>");
        }
        if ((yz0Var.a & 8) > 0) {
            sb2.append("</s>");
        }
        if ((yz0Var.a & 16) > 0) {
            sb2.append("</u>");
        }
        if ((yz0Var.a & 2) > 0) {
            sb2.append("</i>");
        }
        if ((yz0Var.a & 1) > 0) {
            sb2.append("</b>");
        }
        if ((yz0Var.a & 768) > 0) {
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
            int nextSpanTransition = spanned.nextSpanTransition(i15, length, wh0.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            wh0[] wh0VarArr = (wh0[]) spanned.getSpans(i15, nextSpanTransition, wh0.class);
            if (wh0VarArr != null) {
                for (wh0 wh0Var : wh0VarArr) {
                    sb2.append(wh0Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i15 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i15, nextSpanTransition, zz0.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                zz0[] zz0VarArr = (zz0[]) spanned.getSpans(i15, nextSpanTransition2, zz0.class);
                String str3 = "<pre>";
                if (zz0VarArr != null) {
                    for (zz0 zz0Var : zz0VarArr) {
                        if (zz0Var != null) {
                            a(zz0Var.b, sb2);
                        }
                    }
                }
                while (i15 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i15, nextSpanTransition2, g51.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    g51[] g51VarArr = (g51[]) spanned.getSpans(i15, nextSpanTransition3, g51.class);
                    String str4 = "\">";
                    if (g51VarArr != null) {
                        for (g51 g51Var : g51VarArr) {
                            a(g51Var.a, sb2);
                            sb2.append("<a href=\"");
                            sb2.append(g51Var.getURL());
                            sb2.append("\">");
                        }
                    }
                    while (i15 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i15, nextSpanTransition3, d51.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        d51[] d51VarArr = (d51[]) spanned.getSpans(i15, nextSpanTransition4, d51.class);
                        if (d51VarArr != null) {
                            for (d51 d51Var : d51VarArr) {
                                if (d51Var != null) {
                                    sb2.append(str3);
                                }
                            }
                        }
                        while (i15 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i15, nextSpanTransition4, di.i.class);
                            int i16 = length;
                            int i17 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            di.i[] iVarArr = (di.i[]) spanned.getSpans(i15, i17, di.i.class);
                            int i18 = i15;
                            int i19 = nextSpanTransition;
                            if (iVarArr != null) {
                                int i20 = 0;
                                while (i20 < iVarArr.length) {
                                    di.i iVar = iVarArr[i20];
                                    if (iVar != null) {
                                        String str5 = iVar.a;
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
                                int nextSpanTransition6 = spanned.nextSpanTransition(i21, i17, o5.class);
                                int i22 = i17;
                                if (nextSpanTransition6 >= 0) {
                                    i17 = nextSpanTransition6;
                                }
                                o5[] o5VarArr = (o5[]) spanned.getSpans(i21, i17, o5.class);
                                int i23 = i21;
                                int i24 = nextSpanTransition2;
                                if (o5VarArr != null) {
                                    int i25 = 0;
                                    while (i25 < o5VarArr.length) {
                                        o5 o5Var = o5VarArr[i25];
                                        int i26 = i25;
                                        if (o5Var == null || o5Var.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb2.append("<animated-emoji data-document-id=\"" + o5Var.documentId + str4);
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
                                                    sb2.append("&#");
                                                    sb2.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
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
                                int i29 = nextSpanTransition3;
                                String str7 = str4;
                                if (o5VarArr != null) {
                                    for (o5 o5Var2 : o5VarArr) {
                                        if (o5Var2 != null && !o5Var2.standard) {
                                            sb2.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i21 = i17;
                                i17 = i22;
                                nextSpanTransition2 = i24;
                                str3 = str6;
                                nextSpanTransition3 = i29;
                                str4 = str7;
                            }
                            int i30 = i17;
                            int i31 = nextSpanTransition2;
                            String str8 = str3;
                            int i32 = nextSpanTransition3;
                            String str9 = str4;
                            if (iVarArr != null) {
                                for (di.i iVar2 : iVarArr) {
                                    if (iVar2 != null) {
                                        sb2.append("</pre>");
                                    }
                                }
                            }
                            length = i16;
                            nextSpanTransition = i19;
                            i15 = i30;
                            nextSpanTransition2 = i31;
                            str3 = str8;
                            nextSpanTransition3 = i32;
                            str4 = str9;
                        }
                        int i33 = length;
                        int i34 = nextSpanTransition;
                        int i35 = nextSpanTransition2;
                        String str10 = str3;
                        int i36 = nextSpanTransition3;
                        String str11 = str4;
                        if (d51VarArr != null) {
                            for (d51 d51Var2 : d51VarArr) {
                                if (d51Var2 != null) {
                                    sb2.append("</pre>");
                                }
                            }
                        }
                        i15 = nextSpanTransition4;
                        length = i33;
                        nextSpanTransition = i34;
                        nextSpanTransition2 = i35;
                        str3 = str10;
                        nextSpanTransition3 = i36;
                        str4 = str11;
                    }
                    int i37 = length;
                    int i38 = nextSpanTransition;
                    int i39 = nextSpanTransition2;
                    String str12 = str3;
                    int i40 = nextSpanTransition3;
                    if (g51VarArr != null) {
                        for (g51 g51Var2 : g51VarArr) {
                            sb2.append("</a>");
                            b(g51Var2.a, sb2);
                        }
                    }
                    length = i37;
                    nextSpanTransition = i38;
                    nextSpanTransition2 = i39;
                    str3 = str12;
                    i15 = i40;
                }
                int i41 = length;
                int i42 = nextSpanTransition;
                int i43 = nextSpanTransition2;
                if (zz0VarArr != null) {
                    for (zz0 zz0Var2 : zz0VarArr) {
                        if (zz0Var2 != null) {
                            b(zz0Var2.b, sb2);
                        }
                    }
                }
                length = i41;
                nextSpanTransition = i42;
                i15 = i43;
            }
            int i44 = length;
            int i45 = nextSpanTransition;
            if (wh0VarArr != null) {
                for (int length2 = wh0VarArr.length - 1; length2 >= 0; length2--) {
                    sb2.append("</blockquote>");
                }
            }
            length = i44;
            i15 = i45;
        }
        return sb2.toString();
    }
}
