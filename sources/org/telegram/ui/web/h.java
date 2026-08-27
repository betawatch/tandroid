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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new h());
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
    @Override // org.telegram.ui.Components.m41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z11;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        i iVar = (i) view;
        Object obj = n41Var.H;
        if (!(obj instanceof MessageObject)) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                CharSequence charSequence = n41Var.m;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = iVar.d;
                c6 c6Var = iVar.a;
                n9 n9Var = iVar.b;
                TextView textView = iVar.f;
                TextView textView2 = iVar.e;
                iVar.d();
                String str3 = a1Var.c;
                i2 i2Var = a1Var.d;
                if (i2Var != null && !TextUtils.isEmpty(i2Var.c)) {
                    textView2.setText(i2Var.c);
                } else {
                    if (i2Var == null || TextUtils.isEmpty(i2Var.d)) {
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
                                if (i2Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                dq dqVar = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int dp = AndroidUtilities.dp(28.0f);
                                int dp2 = AndroidUtilities.dp(28.0f);
                                dqVar.h = dp;
                                dqVar.n = dp2;
                                n9Var.setImageDrawable(dqVar);
                                iVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = we.e.v(parse, null, null, we.e.a(parse.getHost()), null);
                                String str6 = URLDecoder.decode(str5.replaceAll("\\+", "%2b"), "UTF-8");
                                textView.setText(str6);
                                if (!TextUtils.isEmpty(charSequence2)) {
                                }
                                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                                iVar.h.setText(LocaleController.getInstance().getFormatterDay().format(a1Var.b));
                                iVar.r.a(false, false);
                                FrameLayout.LayoutParams layoutParams3 = layoutParams;
                                layoutParams3.rightMargin = AndroidUtilities.dp(70.0f);
                                iVar.c.setLayoutParams(layoutParams3);
                                iVar.w = z10;
                                iVar.setWillNotDraw(!z10);
                                return;
                            }
                        } catch (Exception unused2) {
                            layoutParams = layoutParams2;
                        }
                        if (i2Var != null || (bitmap = i2Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            dq dqVar2 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int dp3 = AndroidUtilities.dp(28.0f);
                            int dp22 = AndroidUtilities.dp(28.0f);
                            dqVar2.h = dp3;
                            dqVar2.n = dp22;
                            n9Var.setImageDrawable(dqVar2);
                        } else {
                            n9Var.setImageBitmap(bitmap);
                        }
                        iVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = we.e.v(parse2, null, null, we.e.a(parse2.getHost()), null);
                        String str62 = URLDecoder.decode(str52.replaceAll("\\+", "%2b"), "UTF-8");
                        textView.setText(str62);
                        if (!TextUtils.isEmpty(charSequence2)) {
                            textView2.setText(AndroidUtilities.highlightText(textView2.getText(), charSequence2, c6Var));
                            textView.setText(AndroidUtilities.highlightText(textView.getText(), charSequence2, c6Var));
                        }
                        textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                        textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                        iVar.h.setText(LocaleController.getInstance().getFormatterDay().format(a1Var.b));
                        iVar.r.a(false, false);
                        FrameLayout.LayoutParams layoutParams32 = layoutParams;
                        layoutParams32.rightMargin = AndroidUtilities.dp(70.0f);
                        iVar.c.setLayoutParams(layoutParams32);
                        iVar.w = z10;
                        iVar.setWillNotDraw(!z10);
                        return;
                    }
                    textView2.setText(i2Var.d);
                }
                layoutParams = layoutParams2;
                if (i2Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                dq dqVar22 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int dp32 = AndroidUtilities.dp(28.0f);
                int dp222 = AndroidUtilities.dp(28.0f);
                dqVar22.h = dp32;
                dqVar22.n = dp222;
                n9Var.setImageDrawable(dqVar22);
                iVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = we.e.v(parse22, null, null, we.e.a(parse22.getHost()), null);
                String str622 = URLDecoder.decode(str522.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str622);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(Emoji.replaceEmoji(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false));
                textView.setText(Emoji.replaceEmoji(textView.getText(), textView.getPaint().getFontMetricsInt(), false));
                iVar.h.setText(LocaleController.getInstance().getFormatterDay().format(a1Var.b));
                iVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams322 = layoutParams;
                layoutParams322.rightMargin = AndroidUtilities.dp(70.0f);
                iVar.c.setLayoutParams(layoutParams322);
                iVar.w = z10;
                iVar.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        MessageObject messageObject = (MessageObject) obj;
        boolean z12 = n41Var.q;
        CharSequence charSequence4 = n41Var.m;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z13 = n41Var.e;
        FrameLayout.LayoutParams layoutParams4 = iVar.d;
        c6 c6Var2 = iVar.a;
        TextView textView3 = iVar.f;
        n9 n9Var2 = iVar.b;
        TextView textView4 = iVar.e;
        iVar.d();
        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
        String a2 = webPage != null ? webPage.url : l.a(messageObject);
        i2 a3 = j2.b().a(AndroidUtilities.getHostAuthority(a2, true));
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
                        n9Var2.b();
                        if (a3 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        dq dqVar3 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int dp4 = AndroidUtilities.dp(28.0f);
                        int dp5 = AndroidUtilities.dp(28.0f);
                        dqVar3.h = dp4;
                        dqVar3.n = dp5;
                        n9Var2.setImageDrawable(dqVar3);
                        iVar.h.setVisibility(8);
                        iVar.n.setVisibility(z12 ? 0 : 8);
                        String a10 = webPage != null ? webPage.url : l.a(messageObject);
                        Uri parse3 = Uri.parse(a10);
                        a10 = we.e.v(parse3, null, null, we.e.a(parse3.getHost()), null);
                        a10 = URLDecoder.decode(a10.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = m3.p(a10);
                        textView3.setText(str8);
                        if (!TextUtils.isEmpty(charSequence5)) {
                        }
                        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                        iVar.r.a(z11, false);
                        layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
                        iVar.c.setLayoutParams(layoutParams4);
                        iVar.w = z10;
                        iVar.setWillNotDraw(!z10);
                    }
                } catch (Exception unused4) {
                    z11 = z13;
                }
                n9Var2.b();
                if (a3 == null && (bitmap2 = a3.i) != null) {
                    n9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    dq dqVar32 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int dp42 = AndroidUtilities.dp(28.0f);
                    int dp52 = AndroidUtilities.dp(28.0f);
                    dqVar32.h = dp42;
                    dqVar32.n = dp52;
                    n9Var2.setImageDrawable(dqVar32);
                } else {
                    n9Var2.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), 0, messageObject);
                }
                iVar.h.setVisibility(8);
                iVar.n.setVisibility(z12 ? 0 : 8);
                String a102 = webPage != null ? webPage.url : l.a(messageObject);
                Uri parse32 = Uri.parse(a102);
                a102 = we.e.v(parse32, null, null, we.e.a(parse32.getHost()), null);
                a102 = URLDecoder.decode(a102.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = m3.p(a102);
                textView3.setText(str82);
                if (!TextUtils.isEmpty(charSequence5)) {
                    textView4.setText(AndroidUtilities.highlightText(textView4.getText(), charSequence5, c6Var2));
                    textView3.setText(AndroidUtilities.highlightText(textView3.getText(), charSequence5, c6Var2));
                }
                textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
                textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
                iVar.r.a(z11, false);
                layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
                iVar.c.setLayoutParams(layoutParams4);
                iVar.w = z10;
                iVar.setWillNotDraw(!z10);
            }
            textView4.setText(a3.d);
        }
        z11 = z13;
        n9Var2.b();
        if (a3 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        dq dqVar322 = new dq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int dp422 = AndroidUtilities.dp(28.0f);
        int dp522 = AndroidUtilities.dp(28.0f);
        dqVar322.h = dp422;
        dqVar322.n = dp522;
        n9Var2.setImageDrawable(dqVar322);
        iVar.h.setVisibility(8);
        iVar.n.setVisibility(z12 ? 0 : 8);
        String a1022 = webPage != null ? webPage.url : l.a(messageObject);
        Uri parse322 = Uri.parse(a1022);
        a1022 = we.e.v(parse322, null, null, we.e.a(parse322.getHost()), null);
        a1022 = URLDecoder.decode(a1022.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = m3.p(a1022);
        textView3.setText(str822);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(Emoji.replaceEmoji(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false));
        textView3.setText(Emoji.replaceEmoji(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false));
        iVar.r.a(z11, false);
        layoutParams4.rightMargin = AndroidUtilities.dp(52.0f);
        iVar.c.setLayoutParams(layoutParams4);
        iVar.w = z10;
        iVar.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean contentsEquals(n41 n41Var, n41 n41Var2) {
        return n41Var.H == n41Var2.H && TextUtils.equals(n41Var.m, n41Var2.m);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        return n41Var.H == n41Var2.H && TextUtils.isEmpty(n41Var.m) == TextUtils.isEmpty(n41Var2.m);
    }
}
