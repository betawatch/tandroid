package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.net.URLDecoder;
import java.text.BreakIterator;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class f extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new f());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:89|(1:91)(1:147)|92|(1:(15:137|138|139|140|141|(5:125|(1:127)(1:132)|128|(1:130)|131)(1:101)|102|103|104|105|106|107|(1:109)|110|111)(1:136))(1:96)|97|(1:99)|125|(0)(0)|128|(0)|131|102|103|104|105|106|107|(0)|110|111) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:3|(1:5)(1:86)|6|7|(1:9)(1:85)|10|(1:12)(1:84)|13|14|(1:(1:(1:(19:74|75|76|77|78|20|(1:(5:54|(1:56)(1:61)|57|(1:59)|60)(1:53))(1:24)|25|(1:27)(1:49)|28|(1:30)(1:48)|31|32|33|34|35|(1:37)|38|39)(1:73))(1:69))(1:65))(1:18)|19|20|(1:22)|(1:51)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0360, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0367, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0350, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0352, code lost:
    
        org.telegram.messenger.f8.g(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0355, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0363, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0364, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e6, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d5, code lost:
    
        org.telegram.messenger.f8.g(r0, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02da  */
    @Override // org.telegram.ui.Components.z41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z11;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        g gVar = (g) view;
        Object obj = a51Var.H;
        if (!(obj instanceof jj)) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                CharSequence charSequence = a51Var.m;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = gVar.d;
                p6 p6Var = gVar.a;
                g9 g9Var = gVar.b;
                TextView textView = gVar.f;
                TextView textView2 = gVar.e;
                gVar.updateColors();
                String str3 = a1Var.c;
                c2 c2Var = a1Var.d;
                if (c2Var != null && !TextUtils.isEmpty(c2Var.c)) {
                    textView2.setText(c2Var.c);
                } else {
                    if (c2Var == null || TextUtils.isEmpty(c2Var.d)) {
                        try {
                            String str4 = Uri.parse(str3).getHost().split("\\.")[r10.length - 2];
                            StringBuilder sb2 = new StringBuilder();
                            layoutParams = layoutParams2;
                            try {
                                sb2.append(str4.substring(0, 1).toUpperCase());
                                sb2.append(str4.substring(1));
                                textView2.setText(sb2.toString());
                            } catch (Exception unused) {
                                textView2.setText("");
                                if (c2Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                eq eqVar = new eq(t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, gVar.s)), new e(gVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int L = org.telegram.messenger.i0.L(28.0f);
                                int L2 = org.telegram.messenger.i0.L(28.0f);
                                eqVar.h = L;
                                eqVar.n = L2;
                                g9Var.setImageDrawable(eqVar);
                                gVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
                                String str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                textView.setText(str6);
                                if (!TextUtils.isEmpty(charSequence2)) {
                                }
                                textView2.setText(k6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                textView.setText(k6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                                gVar.h.setText(cd.D0().o0().format(a1Var.b));
                                gVar.r.a(false, false);
                                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                                layoutParams3.rightMargin = org.telegram.messenger.i0.L(70.0f);
                                gVar.c.setLayoutParams(layoutParams3);
                                gVar.x = z10;
                                gVar.setWillNotDraw(!z10);
                                return;
                            }
                        } catch (Exception unused2) {
                            layoutParams = layoutParams2;
                        }
                        if (c2Var != null || (bitmap = c2Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            eq eqVar2 = new eq(t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, gVar.s)), new e(gVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int L3 = org.telegram.messenger.i0.L(28.0f);
                            int L22 = org.telegram.messenger.i0.L(28.0f);
                            eqVar2.h = L3;
                            eqVar2.n = L22;
                            g9Var.setImageDrawable(eqVar2);
                        } else {
                            g9Var.setImageBitmap(bitmap);
                        }
                        gVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = gf.f.u(parse2, null, null, gf.f.a(parse2.getHost()), null);
                        String str62 = URLDecoder.decode(str52.replaceAll("\\+", "%2b"), "UTF-8");
                        textView.setText(str62);
                        if (!TextUtils.isEmpty(charSequence2)) {
                            textView2.setText(org.telegram.messenger.i0.w1(textView2.getText(), charSequence2, p6Var));
                            textView.setText(org.telegram.messenger.i0.w1(textView.getText(), charSequence2, p6Var));
                        }
                        textView2.setText(k6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        textView.setText(k6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                        gVar.h.setText(cd.D0().o0().format(a1Var.b));
                        gVar.r.a(false, false);
                        FrameLayout.LayoutParams layoutParams32 = layoutParams;
                        layoutParams32.rightMargin = org.telegram.messenger.i0.L(70.0f);
                        gVar.c.setLayoutParams(layoutParams32);
                        gVar.x = z10;
                        gVar.setWillNotDraw(!z10);
                        return;
                    }
                    textView2.setText(c2Var.d);
                }
                layoutParams = layoutParams2;
                if (c2Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                eq eqVar22 = new eq(t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, gVar.s)), new e(gVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int L32 = org.telegram.messenger.i0.L(28.0f);
                int L222 = org.telegram.messenger.i0.L(28.0f);
                eqVar22.h = L32;
                eqVar22.n = L222;
                g9Var.setImageDrawable(eqVar22);
                gVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = gf.f.u(parse22, null, null, gf.f.a(parse22.getHost()), null);
                String str622 = URLDecoder.decode(str522.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str622);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(k6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView.setText(k6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                gVar.h.setText(cd.D0().o0().format(a1Var.b));
                gVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams322 = layoutParams;
                layoutParams322.rightMargin = org.telegram.messenger.i0.L(70.0f);
                gVar.c.setLayoutParams(layoutParams322);
                gVar.x = z10;
                gVar.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        jj jjVar = (jj) obj;
        boolean z12 = a51Var.q;
        CharSequence charSequence4 = a51Var.m;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z13 = a51Var.e;
        FrameLayout.LayoutParams layoutParams4 = gVar.d;
        p6 p6Var2 = gVar.a;
        TextView textView3 = gVar.f;
        g9 g9Var2 = gVar.b;
        TextView textView4 = gVar.e;
        gVar.updateColors();
        TLRPC.WebPage webPage = jj.n1(jjVar) != null ? jj.n1(jjVar).webpage : null;
        String a2 = webPage != null ? webPage.url : j.a(jjVar);
        c2 a10 = d2.b().a(org.telegram.messenger.i0.K0(a2, true));
        if (webPage != null && (str2 = webPage.title) != null) {
            textView4.setText(str2);
        } else if (webPage != null && (str = webPage.site_name) != null) {
            textView4.setText(str);
        } else if (a10 != null && !TextUtils.isEmpty(a10.c)) {
            textView4.setText(a10.c);
        } else {
            if (a10 == null || TextUtils.isEmpty(a10.d)) {
                try {
                    String str7 = Uri.parse(a2).getHost().split("\\.")[r3.length - 2];
                    StringBuilder sb3 = new StringBuilder();
                    z11 = z13;
                    try {
                        sb3.append(str7.substring(0, 1).toUpperCase());
                        sb3.append(str7.substring(1));
                        textView4.setText(sb3.toString());
                    } catch (Exception unused3) {
                        textView4.setText("");
                        g9Var2.b();
                        if (a10 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        eq eqVar3 = new eq(t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, gVar.s)), new e(gVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int L4 = org.telegram.messenger.i0.L(28.0f);
                        int L5 = org.telegram.messenger.i0.L(28.0f);
                        eqVar3.h = L4;
                        eqVar3.n = L5;
                        g9Var2.setImageDrawable(eqVar3);
                        gVar.h.setVisibility(8);
                        gVar.n.setVisibility(z12 ? 0 : 8);
                        String a11 = webPage != null ? webPage.url : j.a(jjVar);
                        Uri parse3 = Uri.parse(a11);
                        a11 = gf.f.u(parse3, null, null, gf.f.a(parse3.getHost()), null);
                        a11 = URLDecoder.decode(a11.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = i3.p(a11);
                        textView3.setText(str8);
                        if (!TextUtils.isEmpty(charSequence5)) {
                        }
                        textView4.setText(k6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
                        textView3.setText(k6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        gVar.r.a(z11, false);
                        layoutParams4.rightMargin = org.telegram.messenger.i0.L(52.0f);
                        gVar.c.setLayoutParams(layoutParams4);
                        gVar.x = z10;
                        gVar.setWillNotDraw(!z10);
                    }
                } catch (Exception unused4) {
                    z11 = z13;
                }
                g9Var2.b();
                if (a10 == null && (bitmap2 = a10.i) != null) {
                    g9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    eq eqVar32 = new eq(t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, gVar.s)), new e(gVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int L42 = org.telegram.messenger.i0.L(28.0f);
                    int L52 = org.telegram.messenger.i0.L(28.0f);
                    eqVar32.h = L42;
                    eqVar32.n = L52;
                    g9Var2.setImageDrawable(eqVar32);
                } else {
                    g9Var2.l(ic.i(b8.w(photo.sizes, org.telegram.messenger.i0.L(32.0f), true, null, true), webPage.photo), org.telegram.messenger.i0.L(32.0f) + "_" + org.telegram.messenger.i0.L(32.0f), ic.i(b8.w(webPage.photo.sizes, org.telegram.messenger.i0.L(32.0f), true, null, false), webPage.photo), org.telegram.messenger.i0.L(32.0f) + "_" + org.telegram.messenger.i0.L(32.0f), 0, jjVar);
                }
                gVar.h.setVisibility(8);
                gVar.n.setVisibility(z12 ? 0 : 8);
                String a112 = webPage != null ? webPage.url : j.a(jjVar);
                Uri parse32 = Uri.parse(a112);
                a112 = gf.f.u(parse32, null, null, gf.f.a(parse32.getHost()), null);
                a112 = URLDecoder.decode(a112.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = i3.p(a112);
                textView3.setText(str82);
                if (!TextUtils.isEmpty(charSequence5)) {
                    textView4.setText(org.telegram.messenger.i0.w1(textView4.getText(), charSequence5, p6Var2));
                    textView3.setText(org.telegram.messenger.i0.w1(textView3.getText(), charSequence5, p6Var2));
                }
                textView4.setText(k6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
                textView3.setText(k6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
                gVar.r.a(z11, false);
                layoutParams4.rightMargin = org.telegram.messenger.i0.L(52.0f);
                gVar.c.setLayoutParams(layoutParams4);
                gVar.x = z10;
                gVar.setWillNotDraw(!z10);
            }
            textView4.setText(a10.d);
        }
        z11 = z13;
        g9Var2.b();
        if (a10 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        eq eqVar322 = new eq(t6.d0(org.telegram.messenger.i0.L(6.0f), t6.r1(0.1f, gVar.s)), new e(gVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int L422 = org.telegram.messenger.i0.L(28.0f);
        int L522 = org.telegram.messenger.i0.L(28.0f);
        eqVar322.h = L422;
        eqVar322.n = L522;
        g9Var2.setImageDrawable(eqVar322);
        gVar.h.setVisibility(8);
        gVar.n.setVisibility(z12 ? 0 : 8);
        String a1122 = webPage != null ? webPage.url : j.a(jjVar);
        Uri parse322 = Uri.parse(a1122);
        a1122 = gf.f.u(parse322, null, null, gf.f.a(parse322.getHost()), null);
        a1122 = URLDecoder.decode(a1122.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = i3.p(a1122);
        textView3.setText(str822);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(k6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
        textView3.setText(k6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
        gVar.r.a(z11, false);
        layoutParams4.rightMargin = org.telegram.messenger.i0.L(52.0f);
        gVar.c.setLayoutParams(layoutParams4);
        gVar.x = z10;
        gVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean c(a51 a51Var, a51 a51Var2) {
        return a51Var.H == a51Var2.H && TextUtils.equals(a51Var.m, a51Var2.m);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new g(context, p6Var);
    }

    @Override // org.telegram.ui.Components.z41
    public final boolean e(a51 a51Var, a51 a51Var2) {
        return a51Var.H == a51Var2.H && TextUtils.isEmpty(a51Var.m) == TextUtils.isEmpty(a51Var2.m);
    }
}
