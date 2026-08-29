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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new h());
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
    @Override // org.telegram.ui.Components.v41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z11;
        String str;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        String str2;
        i iVar = (i) view;
        Object obj = w41Var.H;
        if (!(obj instanceof MessageObject)) {
            if (obj instanceof a1) {
                a1 a1Var = (a1) obj;
                CharSequence charSequence = w41Var.m;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = iVar.d;
                c6 c6Var = iVar.a;
                t9 t9Var = iVar.b;
                TextView textView = iVar.f;
                TextView textView2 = iVar.e;
                iVar.e();
                String str3 = a1Var.c;
                j2 j2Var = a1Var.d;
                if (j2Var != null && !TextUtils.isEmpty(j2Var.c)) {
                    textView2.setText(j2Var.c);
                } else {
                    if (j2Var == null || TextUtils.isEmpty(j2Var.d)) {
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
                                if (j2Var != null) {
                                }
                                if (textView2.getText() == null) {
                                }
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(r1);
                                jq jqVar = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, r1.isEmpty() ? "" : r1.substring(characterInstance.first(), characterInstance.next()), 1));
                                int dp = AndroidUtilities.dp(28.0f);
                                int dp2 = AndroidUtilities.dp(28.0f);
                                jqVar.h = dp;
                                jqVar.n = dp2;
                                t9Var.setImageDrawable(jqVar);
                                iVar.n.setVisibility(8);
                                Uri parse = Uri.parse(str3);
                                String str5 = ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null);
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
                        if (j2Var != null || (bitmap = j2Var.i) == null) {
                            String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                            BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                            characterInstance2.setText(charSequence3);
                            jq jqVar2 = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), 1));
                            int dp3 = AndroidUtilities.dp(28.0f);
                            int dp22 = AndroidUtilities.dp(28.0f);
                            jqVar2.h = dp3;
                            jqVar2.n = dp22;
                            t9Var.setImageDrawable(jqVar2);
                        } else {
                            t9Var.setImageBitmap(bitmap);
                        }
                        iVar.n.setVisibility(8);
                        Uri parse2 = Uri.parse(str3);
                        String str52 = ye.d.v(parse2, null, null, ye.d.a(parse2.getHost()), null);
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
                    textView2.setText(j2Var.d);
                }
                layoutParams = layoutParams2;
                if (j2Var != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance22 = BreakIterator.getCharacterInstance();
                characterInstance22.setText(charSequence3);
                jq jqVar22 = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance22.first(), characterInstance22.next()), 1));
                int dp32 = AndroidUtilities.dp(28.0f);
                int dp222 = AndroidUtilities.dp(28.0f);
                jqVar22.h = dp32;
                jqVar22.n = dp222;
                t9Var.setImageDrawable(jqVar22);
                iVar.n.setVisibility(8);
                Uri parse22 = Uri.parse(str3);
                String str522 = ye.d.v(parse22, null, null, ye.d.a(parse22.getHost()), null);
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
        boolean z12 = w41Var.q;
        CharSequence charSequence4 = w41Var.m;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z13 = w41Var.e;
        FrameLayout.LayoutParams layoutParams4 = iVar.d;
        c6 c6Var2 = iVar.a;
        TextView textView3 = iVar.f;
        t9 t9Var2 = iVar.b;
        TextView textView4 = iVar.e;
        iVar.e();
        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject) != null ? MessageObject.getMedia(messageObject).webpage : null;
        String a2 = webPage != null ? webPage.url : l.a(messageObject);
        j2 a10 = k2.b().a(AndroidUtilities.getHostAuthority(a2, true));
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
                        t9Var2.b();
                        if (a10 == null) {
                        }
                        if (webPage != null) {
                        }
                        if (textView4.getText() == null) {
                        }
                        BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                        characterInstance3.setText(r1);
                        jq jqVar3 = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, r1.isEmpty() ? "" : r1.substring(characterInstance3.first(), characterInstance3.next()), 0));
                        int dp4 = AndroidUtilities.dp(28.0f);
                        int dp5 = AndroidUtilities.dp(28.0f);
                        jqVar3.h = dp4;
                        jqVar3.n = dp5;
                        t9Var2.setImageDrawable(jqVar3);
                        iVar.h.setVisibility(8);
                        iVar.n.setVisibility(z12 ? 0 : 8);
                        String a11 = webPage != null ? webPage.url : l.a(messageObject);
                        Uri parse3 = Uri.parse(a11);
                        a11 = ye.d.v(parse3, null, null, ye.d.a(parse3.getHost()), null);
                        a11 = URLDecoder.decode(a11.replaceAll("\\+", "%2b"), "UTF-8");
                        String str8 = m3.p(a11);
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
                t9Var2.b();
                if (a10 == null && (bitmap2 = a10.i) != null) {
                    t9Var2.setImageBitmap(bitmap2);
                } else if (webPage != null || (photo = webPage.photo) == null) {
                    String charSequence6 = textView4.getText() == null ? "" : textView4.getText().toString();
                    BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
                    characterInstance32.setText(charSequence6);
                    jq jqVar32 = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), 0));
                    int dp42 = AndroidUtilities.dp(28.0f);
                    int dp52 = AndroidUtilities.dp(28.0f);
                    jqVar32.h = dp42;
                    jqVar32.n = dp52;
                    t9Var2.setImageDrawable(jqVar32);
                } else {
                    t9Var2.j(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(32.0f), true, null, true), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(32.0f), true, null, false), webPage.photo), AndroidUtilities.dp(32.0f) + "_" + AndroidUtilities.dp(32.0f), 0, messageObject);
                }
                iVar.h.setVisibility(8);
                iVar.n.setVisibility(z12 ? 0 : 8);
                String a112 = webPage != null ? webPage.url : l.a(messageObject);
                Uri parse32 = Uri.parse(a112);
                a112 = ye.d.v(parse32, null, null, ye.d.a(parse32.getHost()), null);
                a112 = URLDecoder.decode(a112.replaceAll("\\+", "%2b"), "UTF-8");
                String str82 = m3.p(a112);
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
            textView4.setText(a10.d);
        }
        z11 = z13;
        t9Var2.b();
        if (a10 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() == null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        jq jqVar322 = new jq(g6.b0(AndroidUtilities.dp(6.0f), g6.l1(0.1f, iVar.s)), new g(iVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), 0));
        int dp422 = AndroidUtilities.dp(28.0f);
        int dp522 = AndroidUtilities.dp(28.0f);
        jqVar322.h = dp422;
        jqVar322.n = dp522;
        t9Var2.setImageDrawable(jqVar322);
        iVar.h.setVisibility(8);
        iVar.n.setVisibility(z12 ? 0 : 8);
        String a1122 = webPage != null ? webPage.url : l.a(messageObject);
        Uri parse322 = Uri.parse(a1122);
        a1122 = ye.d.v(parse322, null, null, ye.d.a(parse322.getHost()), null);
        a1122 = URLDecoder.decode(a1122.replaceAll("\\+", "%2b"), "UTF-8");
        String str822 = m3.p(a1122);
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

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.H == w41Var2.H && TextUtils.equals(w41Var.m, w41Var2.m);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new i(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.H == w41Var2.H && TextUtils.isEmpty(w41Var.m) == TextUtils.isEmpty(w41Var2.m);
    }
}
