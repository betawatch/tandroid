package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ uq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023e, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r8.P).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x043d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        au0 au0Var;
        float f10;
        float f11;
        int i10;
        int i11;
        TLRPC.Message message;
        int i12 = this.a;
        float f12 = 0.0f;
        final PhotoViewer photoViewer = this.b;
        final int i13 = 0;
        int i14 = 1;
        switch (i12) {
            case 0:
                if (!photoViewer.a2 && !photoViewer.H1()) {
                    photoViewer.M2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer.H1() && (au0Var = photoViewer.d) != null && au0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.p3(!photoViewer.G, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.P8;
                photoViewer.T1(true);
                photoViewer.B0(0, true);
                break;
            case 3:
                MessageObject messageObject = photoViewer.P4;
                if (messageObject == null || !messageObject.isSponsored()) {
                    if (photoViewer.B.q0.a()) {
                        photoViewer.k0.M(null, null);
                        break;
                    }
                } else {
                    MessageObject messageObject2 = photoViewer.P4;
                    if (messageObject2 != null && messageObject2.isSponsored() && photoViewer.k0.getAlpha() > 0.5f) {
                        final int i15 = photoViewer.P4.currentAccount;
                        final jh.b bVar = new jh.b();
                        org.telegram.ui.Components.b70 G = org.telegram.ui.Components.b70.G(photoViewer.a0, bVar, photoViewer.k0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.P4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i15).isPremium() && !MessagesController.getInstance(photoViewer.P).premiumFeaturesBlocked() && !photoViewer.P4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.lq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i13;
                                        jh.b bVar2 = bVar;
                                        int i17 = i15;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i16) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.P8;
                                                if (!UserConfig.getInstance(i17).isPremium()) {
                                                    new ag.g2(photoViewer2.i4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.mc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i17).disableAds(true);
                                                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.i4;
                                                    if (n2Var instanceof rn) {
                                                        rn rnVar = (rn) n2Var;
                                                        rnVar.Fa(photoViewer2.P4);
                                                        rnVar.Ha(photoViewer2.P4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.P8;
                                                if (!UserConfig.getInstance(i17).isPremium()) {
                                                    new ag.g2(photoViewer2.i4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.mc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i17).disableAds(true);
                                                    org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.i4;
                                                    if (n2Var2 instanceof rn) {
                                                        rn rnVar2 = (rn) n2Var2;
                                                        rnVar2.Fa(photoViewer2.P4);
                                                        rnVar2.Ha(photoViewer2.P4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.P4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ff0(22, photoViewer, bVar), false);
                                if ((photoViewer.i4 instanceof rn) && !MessagesController.getInstance(i15).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i16 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.lq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i16;
                                            jh.b bVar2 = bVar;
                                            int i17 = i15;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i162) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.P8;
                                                    if (!UserConfig.getInstance(i17).isPremium()) {
                                                        new ag.g2(photoViewer2.i4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.mc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i17).disableAds(true);
                                                        org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.i4;
                                                        if (n2Var instanceof rn) {
                                                            rn rnVar = (rn) n2Var;
                                                            rnVar.Fa(photoViewer2.P4);
                                                            rnVar.Ha(photoViewer2.P4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.P8;
                                                    if (!UserConfig.getInstance(i17).isPremium()) {
                                                        new ag.g2(photoViewer2.i4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.mc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i17).disableAds(true);
                                                        org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.i4;
                                                        if (n2Var2 instanceof rn) {
                                                            rn rnVar2 = (rn) n2Var2;
                                                            rnVar2.Fa(photoViewer2.P4);
                                                            rnVar2.Ha(photoViewer2.P4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() > 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.b70 J = G.J();
                        org.telegram.ui.ActionBar.f1 f1Var = new org.telegram.ui.ActionBar.f1(0, photoViewer.A, bVar, true, false);
                        f1Var.setItemHeight(44);
                        f1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        f1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        f1Var.setOnClickListener(new ch(G, 1));
                        J.r(f1Var, h7.z5.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.k1(photoViewer.A, bVar), h7.z5.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.P4.sponsoredUrl;
                        if (str2 != null) {
                            f10 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.P).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.A);
                                textView.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.gc));
                                textView.setTextSize(1, 14.0f);
                                f11 = 10.0f;
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.P4.sponsoredUrl);
                                textView.setText(we.e.v(parse, null, null, we.e.a(parse.getHost()), null));
                                textView.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, photoViewer.P4.sponsoredAdditionalInfo == null ? 6 : 0));
                                textView.setOnClickListener(new u70(13, photoViewer, G));
                                textView.setOnLongClickListener(new jh.f2(4, photoViewer, bVar));
                                arrayList.add(textView);
                                if (photoViewer.P4.sponsoredInfo != null) {
                                    TextView textView2 = new TextView(photoViewer.A);
                                    textView2.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                    textView2.setTextSize(1, 14.0f);
                                    textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                    textView2.setMaxWidth(AndroidUtilities.dp(f10));
                                    textView2.setText(photoViewer.P4.sponsoredInfo);
                                    textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, photoViewer.P4.sponsoredAdditionalInfo == null ? 6 : 0));
                                    textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.kq0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (i13) {
                                                case 0:
                                                    PhotoViewer photoViewer2 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    PhotoViewer photoViewer3 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView2);
                                }
                                if (photoViewer.P4.sponsoredAdditionalInfo != null) {
                                    TextView textView3 = new TextView(photoViewer.A);
                                    textView3.setTextColor(bVar.N0(org.telegram.ui.ActionBar.g6.E8));
                                    textView3.setTextSize(1, 14.0f);
                                    textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11));
                                    textView3.setMaxWidth(AndroidUtilities.dp(f10));
                                    textView3.setText(photoViewer.P4.sponsoredAdditionalInfo);
                                    textView3.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                                    final int i17 = 1;
                                    textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.kq0
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (i17) {
                                                case 0:
                                                    PhotoViewer photoViewer2 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer2.A), bVar));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    PhotoViewer photoViewer3 = photoViewer;
                                                    if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                        org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(photoViewer3.A), bVar));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    arrayList.add(textView3);
                                }
                                for (i10 = 0; i10 < arrayList.size(); i10++) {
                                    View view2 = (View) arrayList.get(i10);
                                    if (i10 > 0) {
                                        FrameLayout frameLayout = new FrameLayout(photoViewer.A);
                                        frameLayout.setBackgroundColor(bVar.N0(org.telegram.ui.ActionBar.g6.d7));
                                        i11 = -1;
                                        LinearLayout.LayoutParams n10 = h7.z5.n(-1, 1);
                                        n10.height = 1;
                                        J.r(frameLayout, n10);
                                    } else {
                                        i11 = -1;
                                    }
                                    J.r(view2, h7.z5.n(i11, -2));
                                }
                                G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(G, J, 9), false);
                                if (!UserConfig.getInstance(i15).isPremium()) {
                                    G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.lq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i13;
                                            jh.b bVar2 = bVar;
                                            int i172 = i15;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i162) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.P8;
                                                    if (!UserConfig.getInstance(i172).isPremium()) {
                                                        new ag.g2(photoViewer2.i4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.mc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i172).disableAds(true);
                                                        org.telegram.ui.ActionBar.n2 n2Var = photoViewer2.i4;
                                                        if (n2Var instanceof rn) {
                                                            rn rnVar = (rn) n2Var;
                                                            rnVar.Fa(photoViewer2.P4);
                                                            rnVar.Ha(photoViewer2.P4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.P8;
                                                    if (!UserConfig.getInstance(i172).isPremium()) {
                                                        new ag.g2(photoViewer2.i4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.mc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i172).disableAds(true);
                                                        org.telegram.ui.ActionBar.n2 n2Var2 = photoViewer2.i4;
                                                        if (n2Var2 instanceof rn) {
                                                            rn rnVar2 = (rn) n2Var2;
                                                            rnVar2.Fa(photoViewer2.P4);
                                                            rnVar2.Ha(photoViewer2.P4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                                if (photoViewer.P4.sponsoredCanReport) {
                                }
                                if (G.x() > 0) {
                                }
                            }
                        } else {
                            f10 = 300.0f;
                        }
                        f11 = 10.0f;
                        if (photoViewer.P4.sponsoredInfo != null) {
                        }
                        if (photoViewer.P4.sponsoredAdditionalInfo != null) {
                        }
                        while (i10 < arrayList.size()) {
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new gh.f3(G, J, 9), false);
                        if (!UserConfig.getInstance(i15).isPremium()) {
                        }
                        if (photoViewer.P4.sponsoredCanReport) {
                        }
                        if (G.x() > 0) {
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject4 = photoViewer.P4;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    nr nrVar = photoViewer.F0;
                    MessageObject messageObject5 = photoViewer.P4;
                    LinearLayout linearLayout = nrVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i18 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList t10 = org.telegram.ui.Components.m61.t(i18, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i19 = 0;
                        while (i19 < t10.size()) {
                            org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) t10.get(i19);
                            org.telegram.ui.Components.k61 a2 = i61Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i20 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i14];
                            objArr[0] = Integer.valueOf(i61Var.b());
                            sb2.append(LocaleController.formatString(i20, objArr));
                            sb2.append(i61Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_arrow_mediabold, 0);
                                cqVar.rotate(90.0f);
                                cqVar.translate(f12, AndroidUtilities.dp(1.0f));
                                cqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(cqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.c(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            c10.setOnClickListener(new c0(nrVar, messageObject5, i61Var, 9));
                            c10.setSelectorColor(268435455);
                            i19++;
                            f12 = 0.0f;
                            i14 = 1;
                        }
                        photoViewer.p0.b();
                        break;
                    }
                }
                ag.d2 d2Var = photoViewer.B;
                if (d2Var != null && d2Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.B.getActionBarMenuOnItemClick().b(2);
                    photoViewer.k0.M(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.y;
                if (activity != null) {
                    photoViewer.V3 = false;
                    photoViewer.U3 = 1;
                    if (photoViewer.T3 == -10) {
                        photoViewer.T3 = activity.getRequestedOrientation();
                    }
                    if (((WindowManager) photoViewer.y.getSystemService("window")).getDefaultDisplay().getRotation() == 3) {
                        photoViewer.y.setRequestedOrientation(8);
                    } else {
                        photoViewer.y.setRequestedOrientation(0);
                    }
                    photoViewer.j3(false, false);
                    break;
                }
                break;
            case 6:
                Activity activity2 = photoViewer.y;
                if (activity2 != null) {
                    photoViewer.V3 = false;
                    photoViewer.U3 = 2;
                    if (photoViewer.T3 == -10) {
                        photoViewer.T3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.y.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                MessageObject messageObject6 = photoViewer.P4;
                if (messageObject6 != null && messageObject6.isSponsored()) {
                    org.telegram.ui.ActionBar.n2 n2Var = photoViewer.i4;
                    if (n2Var instanceof rn) {
                        ((rn) n2Var).J9(photoViewer.P4, false, true);
                    }
                    photoViewer.G0(true, false);
                    String str3 = photoViewer.P4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.C1;
                        if (context == null) {
                            context = photoViewer.A;
                        }
                        we.e.r(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
