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
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class g extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new g());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:89|(1:91)(1:147)|92|(1:(15:137|138|139|140|141|(5:125|(1:127)(1:132)|128|(1:130)|131)(1:101)|102|103|104|105|106|107|(1:109)|110|111)(1:136))(1:96)|97|(1:99)|125|(0)(0)|128|(0)|131|102|103|104|105|106|107|(0)|110|111) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:3|(1:5)(1:86)|6|7|(1:9)(1:85)|10|(1:12)(1:84)|13|14|(1:(1:(1:(19:74|75|76|77|78|20|(1:(5:54|(1:56)(1:61)|57|(1:59)|60)(1:53))(1:24)|25|(1:27)(1:49)|28|(1:30)(1:48)|31|32|33|34|35|(1:37)|38|39)(1:73))(1:69))(1:65))(1:18)|19|20|(1:22)|(1:51)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0360, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0367, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0350, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0352, code lost:
    
        org.telegram.messenger.a8.g(r0, false);
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
    
        org.telegram.messenger.a8.g(r0, true);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d5, code lost:
    
        org.telegram.messenger.a8.g(r0, false);
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
    @Override // org.telegram.ui.Components.m41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z11;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        h hVar = (h) view;
        Object obj = n41Var.I;
        if (!(obj instanceof fj)) {
            if (obj instanceof w0) {
                w0 w0Var = (w0) obj;
                CharSequence charSequence = n41Var.n;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = hVar.d;
                i6 i6Var = hVar.a;
                p9 p9Var = hVar.b;
                TextView textView = hVar.f;
                TextView textView2 = hVar.e;
                hVar.updateColors();
                String str3 = w0Var.c;
                a2 a2Var = w0Var.d;
                if (a2Var != null && !TextUtils.isEmpty(a2Var.c)) {
                    textView2.setText(a2Var.c);
                } else {
                    if (a2Var == null || TextUtils.isEmpty(a2Var.d)) {
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
                                if (a2Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                lq lqVar = new lq(n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, hVar.s)), new f(hVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int L = org.telegram.messenger.g0.L(28.0f);
                                int L2 = org.telegram.messenger.g0.L(28.0f);
                                lqVar.h = L;
                                lqVar.n = L2;
                                p9Var.setImageDrawable(lqVar);
                                hVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = vf.c.w(parse, null, null, vf.c.a(parse.getHost()), null);
                                String str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                textView.setText(str6);
                                if (!TextUtils.isEmpty(charSequence2)) {
                                }
                                textView2.setText(j6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                textView.setText(j6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                                hVar.h.setText(gd.E0().p0().format(w0Var.b));
                                hVar.r.a(false, false);
                                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                                layoutParams3.rightMargin = org.telegram.messenger.g0.L(70.0f);
                                hVar.c.setLayoutParams(layoutParams3);
                                hVar.x = z10;
                                hVar.setWillNotDraw(!z10);
                                return;
                            }
                        } catch (Exception unused2) {
                            layoutParams = layoutParams2;
                        }
                        if (a2Var != null || (bitmap = a2Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            lq lqVar2 = new lq(n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, hVar.s)), new f(hVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int L3 = org.telegram.messenger.g0.L(28.0f);
                            int L22 = org.telegram.messenger.g0.L(28.0f);
                            lqVar2.h = L3;
                            lqVar2.n = L22;
                            p9Var.setImageDrawable(lqVar2);
                        } else {
                            p9Var.setImageBitmap(bitmap);
                        }
                        hVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = vf.c.w(parse2, null, null, vf.c.a(parse2.getHost()), null);
                        String str62 = URLDecoder.decode(str52.replaceAll("\\+", "%2b"), "UTF-8");
                        textView.setText(str62);
                        if (!TextUtils.isEmpty(charSequence2)) {
                            textView2.setText(org.telegram.messenger.g0.w1(textView2.getText(), charSequence2, i6Var));
                            textView.setText(org.telegram.messenger.g0.w1(textView.getText(), charSequence2, i6Var));
                        }
                        textView2.setText(j6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        textView.setText(j6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                        hVar.h.setText(gd.E0().p0().format(w0Var.b));
                        hVar.r.a(false, false);
                        FrameLayout.LayoutParams layoutParams32 = layoutParams;
                        layoutParams32.rightMargin = org.telegram.messenger.g0.L(70.0f);
                        hVar.c.setLayoutParams(layoutParams32);
                        hVar.x = z10;
                        hVar.setWillNotDraw(!z10);
                        return;
                    }
                    textView2.setText(a2Var.d);
                }
                layoutParams = layoutParams2;
                if (a2Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                lq lqVar22 = new lq(n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, hVar.s)), new f(hVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int L32 = org.telegram.messenger.g0.L(28.0f);
                int L222 = org.telegram.messenger.g0.L(28.0f);
                lqVar22.h = L32;
                lqVar22.n = L222;
                p9Var.setImageDrawable(lqVar22);
                hVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = vf.c.w(parse22, null, null, vf.c.a(parse22.getHost()), null);
                String str622 = URLDecoder.decode(str522.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str622);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(j6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView.setText(j6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                hVar.h.setText(gd.E0().p0().format(w0Var.b));
                hVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams322 = layoutParams;
                layoutParams322.rightMargin = org.telegram.messenger.g0.L(70.0f);
                hVar.c.setLayoutParams(layoutParams322);
                hVar.x = z10;
                hVar.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        fj fjVar = (fj) obj;
        boolean z12 = n41Var.r;
        CharSequence charSequence4 = n41Var.n;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z13 = n41Var.e;
        FrameLayout.LayoutParams layoutParams4 = hVar.d;
        i6 i6Var2 = hVar.a;
        TextView textView3 = hVar.f;
        p9 p9Var2 = hVar.b;
        TextView textView4 = hVar.e;
        hVar.updateColors();
        TLRPC.WebPage webPage = fj.m1(fjVar) != null ? fj.m1(fjVar).webpage : null;
        String a10 = webPage != null ? webPage.url : k.a(fjVar);
        a2 a11 = b2.b().a(org.telegram.messenger.g0.K0(a10, true));
        if (webPage != null && (str2 = webPage.title) != null) {
            textView4.setText(str2);
        } else if (webPage != null && (str = webPage.site_name) != null) {
            textView4.setText(str);
        } else if (a11 != null && !TextUtils.isEmpty(a11.c)) {
            textView4.setText(a11.c);
        } else {
            if (a11 == null || TextUtils.isEmpty(a11.d)) {
                try {
                    String str7 = Uri.parse(a10).getHost().split("\\.")[r3.length - 2];
                    StringBuilder sb3 = new StringBuilder();
                    z11 = z13;
                    try {
                        sb3.append(str7.substring(0, 1).toUpperCase());
                        sb3.append(str7.substring(1));
                        textView4.setText(sb3.toString());
                    } catch (Exception unused3) {
                        textView4.setText("");
                        p9Var2.b();
                        if (a11 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        lq lqVar3 = new lq(n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, hVar.s)), new f(hVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int L4 = org.telegram.messenger.g0.L(28.0f);
                        int L5 = org.telegram.messenger.g0.L(28.0f);
                        lqVar3.h = L4;
                        lqVar3.n = L5;
                        p9Var2.setImageDrawable(lqVar3);
                        hVar.h.setVisibility(8);
                        hVar.n.setVisibility(z12 ? 0 : 8);
                        String a12 = webPage != null ? webPage.url : k.a(fjVar);
                        Uri parse3 = Uri.parse(a12);
                        a12 = vf.c.w(parse3, null, null, vf.c.a(parse3.getHost()), null);
                        a12 = URLDecoder.decode(a12.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = f3.p(a12);
                        textView3.setText(str8);
                        if (!TextUtils.isEmpty(charSequence5)) {
                        }
                        textView4.setText(j6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
                        textView3.setText(j6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        hVar.r.a(z11, false);
                        layoutParams4.rightMargin = org.telegram.messenger.g0.L(52.0f);
                        hVar.c.setLayoutParams(layoutParams4);
                        hVar.x = z10;
                        hVar.setWillNotDraw(!z10);
                    }
                } catch (Exception unused4) {
                    z11 = z13;
                }
                p9Var2.b();
                if (a11 == null && (bitmap2 = a11.i) != null) {
                    p9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    lq lqVar32 = new lq(n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, hVar.s)), new f(hVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int L42 = org.telegram.messenger.g0.L(28.0f);
                    int L52 = org.telegram.messenger.g0.L(28.0f);
                    lqVar32.h = L42;
                    lqVar32.n = L52;
                    p9Var2.setImageDrawable(lqVar32);
                } else {
                    p9Var2.l(fc.i(w7.w(photo.sizes, org.telegram.messenger.g0.L(32.0f), true, null, true), webPage.photo), org.telegram.messenger.g0.L(32.0f) + "_" + org.telegram.messenger.g0.L(32.0f), fc.i(w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(32.0f), true, null, false), webPage.photo), org.telegram.messenger.g0.L(32.0f) + "_" + org.telegram.messenger.g0.L(32.0f), 0, fjVar);
                }
                hVar.h.setVisibility(8);
                hVar.n.setVisibility(z12 ? 0 : 8);
                String a122 = webPage != null ? webPage.url : k.a(fjVar);
                Uri parse32 = Uri.parse(a122);
                a122 = vf.c.w(parse32, null, null, vf.c.a(parse32.getHost()), null);
                a122 = URLDecoder.decode(a122.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = f3.p(a122);
                textView3.setText(str82);
                if (!TextUtils.isEmpty(charSequence5)) {
                    textView4.setText(org.telegram.messenger.g0.w1(textView4.getText(), charSequence5, i6Var2));
                    textView3.setText(org.telegram.messenger.g0.w1(textView3.getText(), charSequence5, i6Var2));
                }
                textView4.setText(j6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
                textView3.setText(j6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
                hVar.r.a(z11, false);
                layoutParams4.rightMargin = org.telegram.messenger.g0.L(52.0f);
                hVar.c.setLayoutParams(layoutParams4);
                hVar.x = z10;
                hVar.setWillNotDraw(!z10);
            }
            textView4.setText(a11.d);
        }
        z11 = z13;
        p9Var2.b();
        if (a11 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        lq lqVar322 = new lq(n6.d0(org.telegram.messenger.g0.L(6.0f), n6.r1(0.1f, hVar.s)), new f(hVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int L422 = org.telegram.messenger.g0.L(28.0f);
        int L522 = org.telegram.messenger.g0.L(28.0f);
        lqVar322.h = L422;
        lqVar322.n = L522;
        p9Var2.setImageDrawable(lqVar322);
        hVar.h.setVisibility(8);
        hVar.n.setVisibility(z12 ? 0 : 8);
        String a1222 = webPage != null ? webPage.url : k.a(fjVar);
        Uri parse322 = Uri.parse(a1222);
        a1222 = vf.c.w(parse322, null, null, vf.c.a(parse322.getHost()), null);
        a1222 = URLDecoder.decode(a1222.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = f3.p(a1222);
        textView3.setText(str822);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(j6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
        textView3.setText(j6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
        hVar.r.a(z11, false);
        layoutParams4.rightMargin = org.telegram.messenger.g0.L(52.0f);
        hVar.c.setLayoutParams(layoutParams4);
        hVar.x = z10;
        hVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        return n41Var.I == n41Var2.I && TextUtils.equals(n41Var.n, n41Var2.n);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new h(context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        return n41Var.I == n41Var2.I && TextUtils.isEmpty(n41Var.n) == TextUtils.isEmpty(n41Var2.n);
    }
}
