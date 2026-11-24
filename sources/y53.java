// default package

import android.text.Spanned;
import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class y53 {
    public static void a(wkb wkbVar, StringBuilder sb) {
        if (wkbVar != null) {
            if ((wkbVar.a & 768) > 0) {
                sb.append("<spoiler>");
            }
            if ((wkbVar.a & 1) > 0) {
                sb.append("<b>");
            }
            if ((wkbVar.a & 2) > 0) {
                sb.append("<i>");
            }
            if ((wkbVar.a & 16) > 0) {
                sb.append("<u>");
            }
            if ((wkbVar.a & 8) > 0) {
                sb.append("<s>");
            }
            if ((wkbVar.a & 4) > 0) {
                sb.append("<code>");
            }
            if ((wkbVar.a & 128) <= 0 || wkbVar.d == null) {
                return;
            }
            sb.append("<a href=\"");
            sb.append(wkbVar.d.url);
            sb.append("\">");
        }
    }

    public static void b(wkb wkbVar, StringBuilder sb) {
        if (wkbVar != null) {
            if ((wkbVar.a & 128) > 0 && wkbVar.d != null) {
                sb.append("</a>");
            }
            if ((wkbVar.a & 4) > 0) {
                sb.append("</code>");
            }
            if ((wkbVar.a & 8) > 0) {
                sb.append("</s>");
            }
            if ((wkbVar.a & 16) > 0) {
                sb.append("</u>");
            }
            if ((wkbVar.a & 2) > 0) {
                sb.append("</i>");
            }
            if ((wkbVar.a & 1) > 0) {
                sb.append("</b>");
            }
            if ((wkbVar.a & 768) > 0) {
                sb.append("</spoiler>");
            }
        }
    }

    public static String c(Spanned spanned) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        int i5;
        StringBuilder sb = new StringBuilder();
        int length = spanned.length();
        int i6 = 0;
        while (i6 < length) {
            int nextSpanTransition = spanned.nextSpanTransition(i6, length, f09.class);
            if (nextSpanTransition < 0) {
                nextSpanTransition = length;
            }
            f09[] f09VarArr = (f09[]) spanned.getSpans(i6, nextSpanTransition, f09.class);
            if (f09VarArr != null) {
                for (f09 f09Var : f09VarArr) {
                    sb.append(f09Var.e ? "<blockquote collapsed>" : "<blockquote>");
                }
            }
            while (i6 < nextSpanTransition) {
                int nextSpanTransition2 = spanned.nextSpanTransition(i6, nextSpanTransition, xkb.class);
                if (nextSpanTransition2 < 0) {
                    nextSpanTransition2 = nextSpanTransition;
                }
                xkb[] xkbVarArr = (xkb[]) spanned.getSpans(i6, nextSpanTransition2, xkb.class);
                String str3 = "<pre>";
                if (xkbVarArr != null) {
                    for (xkb xkbVar : xkbVarArr) {
                        if (xkbVar != null) {
                            a(xkbVar.b, sb);
                        }
                    }
                }
                while (i6 < nextSpanTransition2) {
                    int nextSpanTransition3 = spanned.nextSpanTransition(i6, nextSpanTransition2, i6c.class);
                    if (nextSpanTransition3 < 0) {
                        nextSpanTransition3 = nextSpanTransition2;
                    }
                    i6c[] i6cVarArr = (i6c[]) spanned.getSpans(i6, nextSpanTransition3, i6c.class);
                    String str4 = "\">";
                    if (i6cVarArr != null) {
                        for (i6c i6cVar : i6cVarArr) {
                            a(i6cVar.a, sb);
                            sb.append("<a href=\"");
                            sb.append(i6cVar.getURL());
                            sb.append("\">");
                        }
                    }
                    while (i6 < nextSpanTransition3) {
                        int nextSpanTransition4 = spanned.nextSpanTransition(i6, nextSpanTransition3, f6c.class);
                        if (nextSpanTransition4 < 0) {
                            nextSpanTransition4 = nextSpanTransition3;
                        }
                        f6c[] f6cVarArr = (f6c[]) spanned.getSpans(i6, nextSpanTransition4, f6c.class);
                        if (f6cVarArr != null) {
                            for (f6c f6cVar : f6cVarArr) {
                                if (f6cVar != null) {
                                    sb.append(str3);
                                }
                            }
                        }
                        while (i6 < nextSpanTransition4) {
                            int nextSpanTransition5 = spanned.nextSpanTransition(i6, nextSpanTransition4, bl2.class);
                            int i7 = length;
                            int i8 = nextSpanTransition5 < 0 ? nextSpanTransition4 : nextSpanTransition5;
                            bl2[] bl2VarArr = (bl2[]) spanned.getSpans(i6, i8, bl2.class);
                            int i9 = i6;
                            int i10 = nextSpanTransition;
                            if (bl2VarArr != null) {
                                int i11 = 0;
                                while (i11 < bl2VarArr.length) {
                                    bl2 bl2Var = bl2VarArr[i11];
                                    if (bl2Var != null) {
                                        String str5 = bl2Var.a;
                                        if (TextUtils.isEmpty(str5)) {
                                            sb.append(str3);
                                        } else {
                                            i5 = i11;
                                            wi8.z("<pre lang=\"", str5, str4, sb);
                                            i11 = i5 + 1;
                                        }
                                    }
                                    i5 = i11;
                                    i11 = i5 + 1;
                                }
                            }
                            int i12 = i9;
                            while (i12 < i8) {
                                int nextSpanTransition6 = spanned.nextSpanTransition(i12, i8, gn.class);
                                int i13 = i8;
                                if (nextSpanTransition6 >= 0) {
                                    i8 = nextSpanTransition6;
                                }
                                gn[] gnVarArr = (gn[]) spanned.getSpans(i12, i8, gn.class);
                                int i14 = i12;
                                int i15 = nextSpanTransition2;
                                if (gnVarArr != null) {
                                    int i16 = 0;
                                    while (i16 < gnVarArr.length) {
                                        gn gnVar = gnVarArr[i16];
                                        int i17 = i16;
                                        if (gnVar == null || gnVar.standard) {
                                            str2 = str3;
                                        } else {
                                            str2 = str3;
                                            sb.append("<animated-emoji data-document-id=\"" + gnVar.documentId + str4);
                                        }
                                        i16 = i17 + 1;
                                        str3 = str2;
                                    }
                                }
                                String str6 = str3;
                                int i18 = i14;
                                while (i18 < i8) {
                                    char charAt = spanned.charAt(i18);
                                    if (charAt == '\n') {
                                        sb.append("<br>");
                                    } else if (charAt == '<') {
                                        sb.append("&lt;");
                                    } else if (charAt == '>') {
                                        sb.append("&gt;");
                                    } else if (charAt == '&') {
                                        sb.append("&amp;");
                                    } else {
                                        i = i18;
                                        i2 = nextSpanTransition3;
                                        if (charAt < 55296 || charAt > 57343) {
                                            str = str4;
                                            if (charAt > '~' || charAt < ' ') {
                                                sb.append("&#");
                                                sb.append((int) charAt);
                                                sb.append(";");
                                            } else if (charAt == ' ') {
                                                i3 = i;
                                                while (true) {
                                                    int i19 = i3 + 1;
                                                    if (i19 >= i8 || spanned.charAt(i19) != ' ') {
                                                        break;
                                                    }
                                                    sb.append("&nbsp;");
                                                    i3 = i19;
                                                }
                                                sb.append(' ');
                                                i18 = i3 + 1;
                                                nextSpanTransition3 = i2;
                                                str4 = str;
                                            } else {
                                                sb.append(charAt);
                                            }
                                            i3 = i;
                                            i18 = i3 + 1;
                                            nextSpanTransition3 = i2;
                                            str4 = str;
                                        } else {
                                            if (charAt < 56320 && (i4 = i + 1) < i8) {
                                                str = str4;
                                                char charAt2 = spanned.charAt(i4);
                                                if (charAt2 >= 56320 && charAt2 <= 57343) {
                                                    sb.append("&#");
                                                    sb.append(((charAt - 55296) << 10) | 65536 | (charAt2 - 56320));
                                                    sb.append(";");
                                                    i3 = i4;
                                                    i18 = i3 + 1;
                                                    nextSpanTransition3 = i2;
                                                    str4 = str;
                                                }
                                                i3 = i;
                                                i18 = i3 + 1;
                                                nextSpanTransition3 = i2;
                                                str4 = str;
                                            }
                                            str = str4;
                                            i3 = i;
                                            i18 = i3 + 1;
                                            nextSpanTransition3 = i2;
                                            str4 = str;
                                        }
                                    }
                                    i = i18;
                                    i2 = nextSpanTransition3;
                                    str = str4;
                                    i3 = i;
                                    i18 = i3 + 1;
                                    nextSpanTransition3 = i2;
                                    str4 = str;
                                }
                                int i20 = nextSpanTransition3;
                                String str7 = str4;
                                if (gnVarArr != null) {
                                    for (gn gnVar2 : gnVarArr) {
                                        if (gnVar2 != null && !gnVar2.standard) {
                                            sb.append("</animated-emoji>");
                                        }
                                    }
                                }
                                i12 = i8;
                                i8 = i13;
                                nextSpanTransition2 = i15;
                                str3 = str6;
                                nextSpanTransition3 = i20;
                                str4 = str7;
                            }
                            int i21 = i8;
                            int i22 = nextSpanTransition2;
                            String str8 = str3;
                            int i23 = nextSpanTransition3;
                            String str9 = str4;
                            if (bl2VarArr != null) {
                                for (bl2 bl2Var2 : bl2VarArr) {
                                    if (bl2Var2 != null) {
                                        sb.append("</pre>");
                                    }
                                }
                            }
                            length = i7;
                            nextSpanTransition = i10;
                            i6 = i21;
                            nextSpanTransition2 = i22;
                            str3 = str8;
                            nextSpanTransition3 = i23;
                            str4 = str9;
                        }
                        int i24 = length;
                        int i25 = nextSpanTransition;
                        int i26 = nextSpanTransition2;
                        String str10 = str3;
                        int i27 = nextSpanTransition3;
                        String str11 = str4;
                        if (f6cVarArr != null) {
                            for (f6c f6cVar2 : f6cVarArr) {
                                if (f6cVar2 != null) {
                                    sb.append("</pre>");
                                }
                            }
                        }
                        i6 = nextSpanTransition4;
                        length = i24;
                        nextSpanTransition = i25;
                        nextSpanTransition2 = i26;
                        str3 = str10;
                        nextSpanTransition3 = i27;
                        str4 = str11;
                    }
                    int i28 = length;
                    int i29 = nextSpanTransition;
                    int i30 = nextSpanTransition2;
                    String str12 = str3;
                    int i31 = nextSpanTransition3;
                    if (i6cVarArr != null) {
                        for (i6c i6cVar2 : i6cVarArr) {
                            sb.append("</a>");
                            b(i6cVar2.a, sb);
                        }
                    }
                    length = i28;
                    nextSpanTransition = i29;
                    nextSpanTransition2 = i30;
                    str3 = str12;
                    i6 = i31;
                }
                int i32 = length;
                int i33 = nextSpanTransition;
                int i34 = nextSpanTransition2;
                if (xkbVarArr != null) {
                    for (xkb xkbVar2 : xkbVarArr) {
                        if (xkbVar2 != null) {
                            b(xkbVar2.b, sb);
                        }
                    }
                }
                length = i32;
                nextSpanTransition = i33;
                i6 = i34;
            }
            int i35 = length;
            int i36 = nextSpanTransition;
            if (f09VarArr != null) {
                for (int length2 = f09VarArr.length - 1; length2 >= 0; length2--) {
                    sb.append("</blockquote>");
                }
            }
            length = i35;
            i6 = i36;
        }
        return sb.toString();
    }
}
