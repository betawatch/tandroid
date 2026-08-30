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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new g());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:89|(1:91)(1:146)|92|(1:(15:136|137|138|139|140|(5:124|(1:126)(1:131)|127|(1:129)|130)(1:101)|102|103|104|105|106|107|(1:109)|110|111)(1:135))(1:96)|97|(1:99)|124|(0)(0)|127|(0)|130|102|103|104|105|106|107|(0)|110|111) */
    /* JADX WARN: Can't wrap try/catch for region: R(31:3|(1:5)(1:86)|6|7|(1:9)(1:85)|10|(1:12)(1:84)|13|14|(1:(1:(1:(19:74|75|76|77|78|20|(1:(5:54|(1:56)(1:61)|57|(1:59)|60)(1:53))(1:24)|25|(1:27)(1:49)|28|(1:30)(1:48)|31|32|33|34|35|(1:37)|38|39)(1:73))(1:69))(1:65))(1:18)|19|20|(1:22)|(1:51)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0363, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x034e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0350, code lost:
    
        org.telegram.messenger.FileLog.e((java.lang.Throwable) r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0353, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0360, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0361, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e6, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d5, code lost:
    
        org.telegram.messenger.FileLog.e((java.lang.Throwable) r0, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d8  */
    @Override // org.telegram.ui.Components.h51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z10;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        h hVar = (h) view;
        Object obj = i51Var.H;
        if (!(obj instanceof MessageObject)) {
            if (obj instanceof b1) {
                b1 b1Var = (b1) obj;
                CharSequence charSequence = i51Var.m;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = hVar.d;
                f6 f6Var = hVar.a;
                p9 p9Var = hVar.b;
                TextView textView = hVar.f;
                TextView textView2 = hVar.e;
                hVar.e();
                String str3 = b1Var.c;
                k2 k2Var = b1Var.d;
                if (k2Var != null && !TextUtils.isEmpty(k2Var.c)) {
                    textView2.setText(k2Var.c);
                } else {
                    if (k2Var == null || TextUtils.isEmpty(k2Var.d)) {
                        try {
                            String str4 = Uri.parse(str3).getHost().split("\\.")[r10.length - 2];
                            StringBuilder sb = new StringBuilder();
                            layoutParams = layoutParams2;
                            try {
                                sb.append(str4.substring(0, 1).toUpperCase());
                                sb.append(str4.substring(1));
                                textView2.setText(sb.toString());
                            } catch (Exception unused) {
                                textView2.setText("");
                                if (k2Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                nq nqVar = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, hVar.s)), new f(hVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int dp = AndroidUtilities.dp(28.0f);
                                int dp2 = AndroidUtilities.dp(28.0f);
                                nqVar.h = dp;
                                nqVar.n = dp2;
                                p9Var.setImageDrawable(nqVar);
                                hVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                                String str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                textView.setText(str6);
                                if (!TextUtils.isEmpty(charSequence2)) {
                                }
                                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                                hVar.h.setText(LocaleController.getInstance().getFormatterDay().format(b1Var.b));
                                hVar.r.a(false, false);
                                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                                layoutParams3.rightMargin = AndroidUtilities.dp(70.0f);
                                hVar.c.setLayoutParams(layoutParams3);
                                hVar.w = z4;
                                hVar.setWillNotDraw(!z4);
                                return;
                            }
                        } catch (Exception unused2) {
                            layoutParams = layoutParams2;
                        }
                        if (k2Var != null || (bitmap = k2Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            nq nqVar2 = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, hVar.s)), new f(hVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int dp3 = AndroidUtilities.dp(28.0f);
                            int dp22 = AndroidUtilities.dp(28.0f);
                            nqVar2.h = dp3;
                            nqVar2.n = dp22;
                            p9Var.setImageDrawable(nqVar2);
                        } else {
                            p9Var.setImageBitmap(bitmap);
                        }
                        hVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = af.g.v(parse2, null, null, af.g.a(parse2.getHost()), null);
                        String str62 = URLDecoder.decode(str52.replaceAll("\\+", "%2b"), "UTF-8");
                        textView.setText(str62);
                        if (!TextUtils.isEmpty(charSequence2)) {
                            textView2.setText(AndroidUtilities.highlightText(textView2.getText(), charSequence2, f6Var));
                            textView.setText(AndroidUtilities.highlightText(textView.getText(), charSequence2, f6Var));
                        }
                        textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                        textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                        hVar.h.setText(LocaleController.getInstance().getFormatterDay().format(b1Var.b));
                        hVar.r.a(false, false);
                        FrameLayout.LayoutParams layoutParams32 = layoutParams;
                        layoutParams32.rightMargin = AndroidUtilities.dp(70.0f);
                        hVar.c.setLayoutParams(layoutParams32);
                        hVar.w = z4;
                        hVar.setWillNotDraw(!z4);
                        return;
                    }
                    textView2.setText(k2Var.d);
                }
                layoutParams = layoutParams2;
                if (k2Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                nq nqVar22 = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, hVar.s)), new f(hVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int dp32 = AndroidUtilities.dp(28.0f);
                int dp222 = AndroidUtilities.dp(28.0f);
                nqVar22.h = dp32;
                nqVar22.n = dp222;
                p9Var.setImageDrawable(nqVar22);
                hVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = af.g.v(parse22, null, null, af.g.a(parse22.getHost()), null);
                String str622 = URLDecoder.decode(str522.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str622);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                hVar.h.setText(LocaleController.getInstance().getFormatterDay().format(b1Var.b));
                hVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams322 = layoutParams;
                layoutParams322.rightMargin = AndroidUtilities.dp(70.0f);
                hVar.c.setLayoutParams(layoutParams322);
                hVar.w = z4;
                hVar.setWillNotDraw(!z4);
                return;
            }
            return;
        }
        MessageObject messageObject = (MessageObject) obj;
        boolean z11 = i51Var.q;
        CharSequence charSequence4 = i51Var.m;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z12 = i51Var.e;
        FrameLayout.LayoutParams layoutParams4 = hVar.d;
        f6 f6Var2 = hVar.a;
        TextView textView3 = hVar.f;
        p9 p9Var2 = hVar.b;
        TextView textView4 = hVar.e;
        hVar.e();
        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
        String a2 = webPage != null ? webPage.url : k.a(messageObject);
        k2 a10 = l2.b().a(AndroidUtilities.getHostAuthority(a2, true));
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
                    StringBuilder sb2 = new StringBuilder();
                    z10 = z12;
                    try {
                        sb2.append(str7.substring(0, 1).toUpperCase());
                        sb2.append(str7.substring(1));
                        textView4.setText(sb2.toString());
                    } catch (Exception unused3) {
                        textView4.setText("");
                        p9Var2.b();
                        if (a10 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        nq nqVar3 = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, hVar.s)), new f(hVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int dp4 = AndroidUtilities.dp(28.0f);
                        int dp5 = AndroidUtilities.dp(28.0f);
                        nqVar3.h = dp4;
                        nqVar3.n = dp5;
                        p9Var2.setImageDrawable(nqVar3);
                        hVar.h.setVisibility(8);
                        hVar.n.setVisibility(z11 ? 0 : 8);
                        String a11 = webPage != null ? webPage.url : k.a(messageObject);
                        Uri parse3 = Uri.parse(a11);
                        a11 = af.g.v(parse3, null, null, af.g.a(parse3.getHost()), null);
                        a11 = URLDecoder.decode(a11.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = n3.p(a11);
                        textView3.setText(str8);
                        if (!TextUtils.isEmpty(charSequence5)) {
                        }
                        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                        hVar.r.a(z10, false);
                        layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
                        hVar.c.setLayoutParams(layoutParams4);
                        hVar.w = z4;
                        hVar.setWillNotDraw(!z4);
                    }
                } catch (Exception unused4) {
                    z10 = z12;
                }
                p9Var2.b();
                if (a10 == null && (bitmap2 = a10.i) != null) {
                    p9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    nq nqVar32 = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, hVar.s)), new f(hVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int dp42 = AndroidUtilities.dp(28.0f);
                    int dp52 = AndroidUtilities.dp(28.0f);
                    nqVar32.h = dp42;
                    nqVar32.n = dp52;
                    p9Var2.setImageDrawable(nqVar32);
                } else {
                    p9Var2.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), 0, messageObject);
                }
                hVar.h.setVisibility(8);
                hVar.n.setVisibility(z11 ? 0 : 8);
                String a112 = webPage != null ? webPage.url : k.a(messageObject);
                Uri parse32 = Uri.parse(a112);
                a112 = af.g.v(parse32, null, null, af.g.a(parse32.getHost()), null);
                a112 = URLDecoder.decode(a112.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = n3.p(a112);
                textView3.setText(str82);
                if (!TextUtils.isEmpty(charSequence5)) {
                    textView4.setText(AndroidUtilities.highlightText(textView4.getText(), charSequence5, f6Var2));
                    textView3.setText(AndroidUtilities.highlightText(textView3.getText(), charSequence5, f6Var2));
                }
                textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                hVar.r.a(z10, false);
                layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
                hVar.c.setLayoutParams(layoutParams4);
                hVar.w = z4;
                hVar.setWillNotDraw(!z4);
            }
            textView4.setText(a10.d);
        }
        z10 = z12;
        p9Var2.b();
        if (a10 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        nq nqVar322 = new nq(j6.b0(AndroidUtilities.dp(6.0f), j6.l1(0.1f, hVar.s)), new f(hVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int dp422 = AndroidUtilities.dp(28.0f);
        int dp522 = AndroidUtilities.dp(28.0f);
        nqVar322.h = dp422;
        nqVar322.n = dp522;
        p9Var2.setImageDrawable(nqVar322);
        hVar.h.setVisibility(8);
        hVar.n.setVisibility(z11 ? 0 : 8);
        String a1122 = webPage != null ? webPage.url : k.a(messageObject);
        Uri parse322 = Uri.parse(a1122);
        a1122 = af.g.v(parse322, null, null, af.g.a(parse322.getHost()), null);
        a1122 = URLDecoder.decode(a1122.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = n3.p(a1122);
        textView3.setText(str822);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
        hVar.r.a(z10, false);
        layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
        hVar.c.setLayoutParams(layoutParams4);
        hVar.w = z4;
        hVar.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.H == i51Var2.H && TextUtils.equals(i51Var.m, i51Var2.m);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new h(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.H == i51Var2.H && TextUtils.isEmpty(i51Var.m) == TextUtils.isEmpty(i51Var2.m);
    }
}
