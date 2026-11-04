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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.i6;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class h extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new h());
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
    @Override // org.telegram.ui.Components.q31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z11;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        i iVar = (i) view;
        Object obj = r31Var.H;
        if (!(obj instanceof zi)) {
            if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                CharSequence charSequence = r31Var.m;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = iVar.d;
                e6 e6Var = iVar.a;
                k9 k9Var = iVar.b;
                TextView textView = iVar.f;
                TextView textView2 = iVar.e;
                iVar.updateColors();
                String str3 = x0Var.c;
                y1 y1Var = x0Var.d;
                if (y1Var != null && !TextUtils.isEmpty(y1Var.c)) {
                    textView2.setText(y1Var.c);
                } else {
                    if (y1Var == null || TextUtils.isEmpty(y1Var.d)) {
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
                                if (y1Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                xp xpVar = new xp(k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, iVar.s)), new g(iVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int L = org.telegram.messenger.g0.L(28.0f);
                                int L2 = org.telegram.messenger.g0.L(28.0f);
                                xpVar.h = L;
                                xpVar.n = L2;
                                k9Var.setImageDrawable(xpVar);
                                iVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = sf.c.w(parse, null, null, sf.c.a(parse.getHost()), null);
                                String str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                textView.setText(str6);
                                if (!TextUtils.isEmpty(charSequence2)) {
                                }
                                textView2.setText(i6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                                textView.setText(i6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                                iVar.h.setText(bd.E0().p0().format(x0Var.b));
                                iVar.r.a(false, false);
                                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                                layoutParams3.rightMargin = org.telegram.messenger.g0.L(70.0f);
                                iVar.c.setLayoutParams(layoutParams3);
                                iVar.x = z10;
                                iVar.setWillNotDraw(!z10);
                                return;
                            }
                        } catch (Exception unused2) {
                            layoutParams = layoutParams2;
                        }
                        if (y1Var != null || (bitmap = y1Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            xp xpVar2 = new xp(k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, iVar.s)), new g(iVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int L3 = org.telegram.messenger.g0.L(28.0f);
                            int L22 = org.telegram.messenger.g0.L(28.0f);
                            xpVar2.h = L3;
                            xpVar2.n = L22;
                            k9Var.setImageDrawable(xpVar2);
                        } else {
                            k9Var.setImageBitmap(bitmap);
                        }
                        iVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = sf.c.w(parse2, null, null, sf.c.a(parse2.getHost()), null);
                        String str62 = URLDecoder.decode(str52.replaceAll("\\+", "%2b"), "UTF-8");
                        textView.setText(str62);
                        if (!TextUtils.isEmpty(charSequence2)) {
                            textView2.setText(org.telegram.messenger.g0.w1(textView2.getText(), charSequence2, e6Var));
                            textView.setText(org.telegram.messenger.g0.w1(textView.getText(), charSequence2, e6Var));
                        }
                        textView2.setText(i6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        textView.setText(i6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                        iVar.h.setText(bd.E0().p0().format(x0Var.b));
                        iVar.r.a(false, false);
                        FrameLayout.LayoutParams layoutParams32 = layoutParams;
                        layoutParams32.rightMargin = org.telegram.messenger.g0.L(70.0f);
                        iVar.c.setLayoutParams(layoutParams32);
                        iVar.x = z10;
                        iVar.setWillNotDraw(!z10);
                        return;
                    }
                    textView2.setText(y1Var.d);
                }
                layoutParams = layoutParams2;
                if (y1Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                xp xpVar22 = new xp(k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, iVar.s)), new g(iVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int L32 = org.telegram.messenger.g0.L(28.0f);
                int L222 = org.telegram.messenger.g0.L(28.0f);
                xpVar22.h = L32;
                xpVar22.n = L222;
                k9Var.setImageDrawable(xpVar22);
                iVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = sf.c.w(parse22, null, null, sf.c.a(parse22.getHost()), null);
                String str622 = URLDecoder.decode(str522.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str622);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(i6.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView.setText(i6.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                iVar.h.setText(bd.E0().p0().format(x0Var.b));
                iVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams322 = layoutParams;
                layoutParams322.rightMargin = org.telegram.messenger.g0.L(70.0f);
                iVar.c.setLayoutParams(layoutParams322);
                iVar.x = z10;
                iVar.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        zi ziVar = (zi) obj;
        boolean z12 = r31Var.q;
        CharSequence charSequence4 = r31Var.m;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z13 = r31Var.e;
        FrameLayout.LayoutParams layoutParams4 = iVar.d;
        e6 e6Var2 = iVar.a;
        TextView textView3 = iVar.f;
        k9 k9Var2 = iVar.b;
        TextView textView4 = iVar.e;
        iVar.updateColors();
        TLRPC.WebPage webPage = zi.n1(ziVar) != null ? zi.n1(ziVar).webpage : null;
        String a10 = webPage != null ? webPage.url : l.a(ziVar);
        y1 a11 = z1.b().a(org.telegram.messenger.g0.K0(a10, true));
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
                        k9Var2.b();
                        if (a11 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        xp xpVar3 = new xp(k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, iVar.s)), new g(iVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int L4 = org.telegram.messenger.g0.L(28.0f);
                        int L5 = org.telegram.messenger.g0.L(28.0f);
                        xpVar3.h = L4;
                        xpVar3.n = L5;
                        k9Var2.setImageDrawable(xpVar3);
                        iVar.h.setVisibility(8);
                        iVar.n.setVisibility(z12 ? 0 : 8);
                        String a12 = webPage != null ? webPage.url : l.a(ziVar);
                        Uri parse3 = Uri.parse(a12);
                        a12 = sf.c.w(parse3, null, null, sf.c.a(parse3.getHost()), null);
                        a12 = URLDecoder.decode(a12.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = b3.p(a12);
                        textView3.setText(str8);
                        if (!TextUtils.isEmpty(charSequence5)) {
                        }
                        textView4.setText(i6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
                        textView3.setText(i6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
                        iVar.r.a(z11, false);
                        layoutParams4.rightMargin = org.telegram.messenger.g0.L(52.0f);
                        iVar.c.setLayoutParams(layoutParams4);
                        iVar.x = z10;
                        iVar.setWillNotDraw(!z10);
                    }
                } catch (Exception unused4) {
                    z11 = z13;
                }
                k9Var2.b();
                if (a11 == null && (bitmap2 = a11.i) != null) {
                    k9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    xp xpVar32 = new xp(k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, iVar.s)), new g(iVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int L42 = org.telegram.messenger.g0.L(28.0f);
                    int L52 = org.telegram.messenger.g0.L(28.0f);
                    xpVar32.h = L42;
                    xpVar32.n = L52;
                    k9Var2.setImageDrawable(xpVar32);
                } else {
                    k9Var2.l(ac.i(w7.w(photo.sizes, org.telegram.messenger.g0.L(32.0f), true, null, true), webPage.photo), org.telegram.messenger.g0.L(32.0f) + "_" + org.telegram.messenger.g0.L(32.0f), ac.i(w7.w(webPage.photo.sizes, org.telegram.messenger.g0.L(32.0f), true, null, false), webPage.photo), org.telegram.messenger.g0.L(32.0f) + "_" + org.telegram.messenger.g0.L(32.0f), 0, ziVar);
                }
                iVar.h.setVisibility(8);
                iVar.n.setVisibility(z12 ? 0 : 8);
                String a122 = webPage != null ? webPage.url : l.a(ziVar);
                Uri parse32 = Uri.parse(a122);
                a122 = sf.c.w(parse32, null, null, sf.c.a(parse32.getHost()), null);
                a122 = URLDecoder.decode(a122.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = b3.p(a122);
                textView3.setText(str82);
                if (!TextUtils.isEmpty(charSequence5)) {
                    textView4.setText(org.telegram.messenger.g0.w1(textView4.getText(), charSequence5, e6Var2));
                    textView3.setText(org.telegram.messenger.g0.w1(textView3.getText(), charSequence5, e6Var2));
                }
                textView4.setText(i6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
                textView3.setText(i6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
                iVar.r.a(z11, false);
                layoutParams4.rightMargin = org.telegram.messenger.g0.L(52.0f);
                iVar.c.setLayoutParams(layoutParams4);
                iVar.x = z10;
                iVar.setWillNotDraw(!z10);
            }
            textView4.setText(a11.d);
        }
        z11 = z13;
        k9Var2.b();
        if (a11 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        xp xpVar322 = new xp(k6.d0(org.telegram.messenger.g0.L(6.0f), k6.r1(0.1f, iVar.s)), new g(iVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int L422 = org.telegram.messenger.g0.L(28.0f);
        int L522 = org.telegram.messenger.g0.L(28.0f);
        xpVar322.h = L422;
        xpVar322.n = L522;
        k9Var2.setImageDrawable(xpVar322);
        iVar.h.setVisibility(8);
        iVar.n.setVisibility(z12 ? 0 : 8);
        String a1222 = webPage != null ? webPage.url : l.a(ziVar);
        Uri parse322 = Uri.parse(a1222);
        a1222 = sf.c.w(parse322, null, null, sf.c.a(parse322.getHost()), null);
        a1222 = URLDecoder.decode(a1222.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = b3.p(a1222);
        textView3.setText(str822);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(i6.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
        textView3.setText(i6.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
        iVar.r.a(z11, false);
        layoutParams4.rightMargin = org.telegram.messenger.g0.L(52.0f);
        iVar.c.setLayoutParams(layoutParams4);
        iVar.x = z10;
        iVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        return r31Var.H == r31Var2.H && TextUtils.equals(r31Var.m, r31Var2.m);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new i(context, e6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        return r31Var.H == r31Var2.H && TextUtils.isEmpty(r31Var.m) == TextUtils.isEmpty(r31Var2.m);
    }
}
