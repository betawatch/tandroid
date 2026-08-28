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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class g extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new g());
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
    @Override // org.telegram.ui.Components.k41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z11;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        h hVar = (h) view;
        Object obj = l41Var.H;
        if (!(obj instanceof MessageObject)) {
            if (obj instanceof z0) {
                z0 z0Var = (z0) obj;
                CharSequence charSequence = l41Var.m;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = hVar.d;
                b6 b6Var = hVar.a;
                o9 o9Var = hVar.b;
                TextView textView = hVar.f;
                TextView textView2 = hVar.e;
                hVar.d();
                String str3 = z0Var.c;
                h2 h2Var = z0Var.d;
                if (h2Var != null && !TextUtils.isEmpty(h2Var.c)) {
                    textView2.setText(h2Var.c);
                } else {
                    if (h2Var == null || TextUtils.isEmpty(h2Var.d)) {
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
                                if (h2Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                fq fqVar = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, hVar.s)), new f(hVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int dp = AndroidUtilities.dp(28.0f);
                                int dp2 = AndroidUtilities.dp(28.0f);
                                fqVar.h = dp;
                                fqVar.n = dp2;
                                o9Var.setImageDrawable(fqVar);
                                hVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
                                String str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                textView.setText(str6);
                                if (!TextUtils.isEmpty(charSequence2)) {
                                }
                                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                                hVar.h.setText(LocaleController.getInstance().getFormatterDay().format(z0Var.b));
                                hVar.r.a(false, false);
                                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                                layoutParams3.rightMargin = AndroidUtilities.dp(70.0f);
                                hVar.c.setLayoutParams(layoutParams3);
                                hVar.w = z10;
                                hVar.setWillNotDraw(!z10);
                                return;
                            }
                        } catch (Exception unused2) {
                            layoutParams = layoutParams2;
                        }
                        if (h2Var != null || (bitmap = h2Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            fq fqVar2 = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, hVar.s)), new f(hVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int dp3 = AndroidUtilities.dp(28.0f);
                            int dp22 = AndroidUtilities.dp(28.0f);
                            fqVar2.h = dp3;
                            fqVar2.n = dp22;
                            o9Var.setImageDrawable(fqVar2);
                        } else {
                            o9Var.setImageBitmap(bitmap);
                        }
                        hVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = ve.e.v(parse2, null, null, ve.e.a(parse2.getHost()), null);
                        String str62 = URLDecoder.decode(str52.replaceAll("\\+", "%2b"), "UTF-8");
                        textView.setText(str62);
                        if (!TextUtils.isEmpty(charSequence2)) {
                            textView2.setText(AndroidUtilities.highlightText(textView2.getText(), charSequence2, b6Var));
                            textView.setText(AndroidUtilities.highlightText(textView.getText(), charSequence2, b6Var));
                        }
                        textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                        textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                        hVar.h.setText(LocaleController.getInstance().getFormatterDay().format(z0Var.b));
                        hVar.r.a(false, false);
                        FrameLayout.LayoutParams layoutParams32 = layoutParams;
                        layoutParams32.rightMargin = AndroidUtilities.dp(70.0f);
                        hVar.c.setLayoutParams(layoutParams32);
                        hVar.w = z10;
                        hVar.setWillNotDraw(!z10);
                        return;
                    }
                    textView2.setText(h2Var.d);
                }
                layoutParams = layoutParams2;
                if (h2Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                fq fqVar22 = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, hVar.s)), new f(hVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int dp32 = AndroidUtilities.dp(28.0f);
                int dp222 = AndroidUtilities.dp(28.0f);
                fqVar22.h = dp32;
                fqVar22.n = dp222;
                o9Var.setImageDrawable(fqVar22);
                hVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = ve.e.v(parse22, null, null, ve.e.a(parse22.getHost()), null);
                String str622 = URLDecoder.decode(str522.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str622);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                hVar.h.setText(LocaleController.getInstance().getFormatterDay().format(z0Var.b));
                hVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams322 = layoutParams;
                layoutParams322.rightMargin = AndroidUtilities.dp(70.0f);
                hVar.c.setLayoutParams(layoutParams322);
                hVar.w = z10;
                hVar.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        MessageObject messageObject = (MessageObject) obj;
        boolean z12 = l41Var.q;
        CharSequence charSequence4 = l41Var.m;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z13 = l41Var.e;
        FrameLayout.LayoutParams layoutParams4 = hVar.d;
        b6 b6Var2 = hVar.a;
        TextView textView3 = hVar.f;
        o9 o9Var2 = hVar.b;
        TextView textView4 = hVar.e;
        hVar.d();
        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
        String a2 = webPage != null ? webPage.url : k.a(messageObject);
        h2 a3 = i2.b().a(AndroidUtilities.getHostAuthority(a2, true));
        if (webPage != null && (str2 = webPage.title) != null) {
            textView4.setText(str2);
        } else if (webPage != null && (str = webPage.site_name) != null) {
            textView4.setText(str);
        } else if (a3 != null && !TextUtils.isEmpty(a3.c)) {
            textView4.setText(a3.c);
        } else {
            if (a3 == null || TextUtils.isEmpty(a3.d)) {
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
                        o9Var2.b();
                        if (a3 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        fq fqVar3 = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, hVar.s)), new f(hVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int dp4 = AndroidUtilities.dp(28.0f);
                        int dp5 = AndroidUtilities.dp(28.0f);
                        fqVar3.h = dp4;
                        fqVar3.n = dp5;
                        o9Var2.setImageDrawable(fqVar3);
                        hVar.h.setVisibility(8);
                        hVar.n.setVisibility(z12 ? 0 : 8);
                        String a10 = webPage != null ? webPage.url : k.a(messageObject);
                        Uri parse3 = Uri.parse(a10);
                        a10 = ve.e.v(parse3, null, null, ve.e.a(parse3.getHost()), null);
                        a10 = URLDecoder.decode(a10.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = m3.p(a10);
                        textView3.setText(str8);
                        if (!TextUtils.isEmpty(charSequence5)) {
                        }
                        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                        hVar.r.a(z11, false);
                        layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
                        hVar.c.setLayoutParams(layoutParams4);
                        hVar.w = z10;
                        hVar.setWillNotDraw(!z10);
                    }
                } catch (Exception unused4) {
                    z11 = z13;
                }
                o9Var2.b();
                if (a3 == null && (bitmap2 = a3.i) != null) {
                    o9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    fq fqVar32 = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, hVar.s)), new f(hVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int dp42 = AndroidUtilities.dp(28.0f);
                    int dp52 = AndroidUtilities.dp(28.0f);
                    fqVar32.h = dp42;
                    fqVar32.n = dp52;
                    o9Var2.setImageDrawable(fqVar32);
                } else {
                    o9Var2.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), 0, messageObject);
                }
                hVar.h.setVisibility(8);
                hVar.n.setVisibility(z12 ? 0 : 8);
                String a102 = webPage != null ? webPage.url : k.a(messageObject);
                Uri parse32 = Uri.parse(a102);
                a102 = ve.e.v(parse32, null, null, ve.e.a(parse32.getHost()), null);
                a102 = URLDecoder.decode(a102.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = m3.p(a102);
                textView3.setText(str82);
                if (!TextUtils.isEmpty(charSequence5)) {
                    textView4.setText(AndroidUtilities.highlightText(textView4.getText(), charSequence5, b6Var2));
                    textView3.setText(AndroidUtilities.highlightText(textView3.getText(), charSequence5, b6Var2));
                }
                textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                hVar.r.a(z11, false);
                layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
                hVar.c.setLayoutParams(layoutParams4);
                hVar.w = z10;
                hVar.setWillNotDraw(!z10);
            }
            textView4.setText(a3.d);
        }
        z11 = z13;
        o9Var2.b();
        if (a3 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        fq fqVar322 = new fq(f6.b0(AndroidUtilities.dp(6.0f), f6.l1(0.1f, hVar.s)), new f(hVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int dp422 = AndroidUtilities.dp(28.0f);
        int dp522 = AndroidUtilities.dp(28.0f);
        fqVar322.h = dp422;
        fqVar322.n = dp522;
        o9Var2.setImageDrawable(fqVar322);
        hVar.h.setVisibility(8);
        hVar.n.setVisibility(z12 ? 0 : 8);
        String a1022 = webPage != null ? webPage.url : k.a(messageObject);
        Uri parse322 = Uri.parse(a1022);
        a1022 = ve.e.v(parse322, null, null, ve.e.a(parse322.getHost()), null);
        a1022 = URLDecoder.decode(a1022.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = m3.p(a1022);
        textView3.setText(str822);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
        hVar.r.a(z11, false);
        layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
        hVar.c.setLayoutParams(layoutParams4);
        hVar.w = z10;
        hVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.H == l41Var2.H && TextUtils.equals(l41Var.m, l41Var2.m);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new h(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.H == l41Var2.H && TextUtils.isEmpty(l41Var.m) == TextUtils.isEmpty(l41Var2.m);
    }
}
