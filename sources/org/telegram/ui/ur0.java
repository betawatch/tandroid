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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ur0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0243, code lost:
    
        if (r6.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r8.T).linkPrefix) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x049e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        cv0 cv0Var;
        int i10;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11 = this.a;
        int i12 = 3;
        final PhotoViewer photoViewer = this.b;
        final int i13 = 0;
        int i14 = 1;
        switch (i11) {
            case 0:
                if (!photoViewer.e2 && !photoViewer.H1()) {
                    photoViewer.M2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.T8;
                if (!photoViewer.H1() && (cv0Var = photoViewer.d) != null && cv0Var.c() != null && !photoViewer.d.c().isEmpty()) {
                    photoViewer.p3(!photoViewer.K, true);
                    break;
                }
                break;
            case 2:
                Drawable[] drawableArr2 = PhotoViewer.T8;
                photoViewer.T1(true);
                photoViewer.B0(0, true);
                break;
            case 3:
                MessageObject messageObject2 = photoViewer.T4;
                if (messageObject2 == null || !messageObject2.isSponsored()) {
                    if (photoViewer.F.u0.a()) {
                        photoViewer.o0.M(null, null);
                        break;
                    }
                } else {
                    MessageObject messageObject3 = photoViewer.T4;
                    if (messageObject3 != null && messageObject3.isSponsored() && photoViewer.o0.getAlpha() > 0.5f) {
                        final int i15 = photoViewer.T4.currentAccount;
                        final zh.b bVar = new zh.b();
                        org.telegram.ui.Components.w70 G = org.telegram.ui.Components.w70.G(photoViewer.e0, bVar, photoViewer.o0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject4 = photoViewer.T4;
                        if (messageObject4.sponsoredInfo == null && messageObject4.sponsoredAdditionalInfo == null) {
                            String str = messageObject4.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i15).isPremium() && !MessagesController.getInstance(photoViewer.T).premiumFeaturesBlocked() && !photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.mr0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i16 = i13;
                                        zh.b bVar2 = bVar;
                                        int i17 = i15;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i16) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.T8;
                                                if (!UserConfig.getInstance(i17).isPremium()) {
                                                    new qg.a1(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i17).disableAds(true);
                                                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer2.m4;
                                                    if (p2Var instanceof eo) {
                                                        eo eoVar = (eo) p2Var;
                                                        eoVar.Fa(photoViewer2.T4);
                                                        eoVar.Ha(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.T8;
                                                if (!UserConfig.getInstance(i17).isPremium()) {
                                                    new qg.a1(photoViewer2.m4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i17).disableAds(true);
                                                    org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer2.m4;
                                                    if (p2Var2 instanceof eo) {
                                                        eo eoVar2 = (eo) p2Var2;
                                                        eoVar2.Fa(photoViewer2.T4);
                                                        eoVar2.Ha(photoViewer2.T4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.T4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new ak0(13, photoViewer, bVar), false);
                                if ((photoViewer.m4 instanceof eo) && !MessagesController.getInstance(i15).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i16 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.mr0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i162 = i16;
                                            zh.b bVar2 = bVar;
                                            int i17 = i15;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i162) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.T8;
                                                    if (!UserConfig.getInstance(i17).isPremium()) {
                                                        new qg.a1(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i17).disableAds(true);
                                                        org.telegram.ui.ActionBar.p2 p2Var = photoViewer2.m4;
                                                        if (p2Var instanceof eo) {
                                                            eo eoVar = (eo) p2Var;
                                                            eoVar.Fa(photoViewer2.T4);
                                                            eoVar.Ha(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.T8;
                                                    if (!UserConfig.getInstance(i17).isPremium()) {
                                                        new qg.a1(photoViewer2.m4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i17).disableAds(true);
                                                        org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer2.m4;
                                                        if (p2Var2 instanceof eo) {
                                                            eo eoVar2 = (eo) p2Var2;
                                                            eoVar2.Fa(photoViewer2.T4);
                                                            eoVar2.Ha(photoViewer2.T4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            if (G.x() <= 0) {
                                G.Z();
                                break;
                            }
                        }
                        org.telegram.ui.Components.w70 J = G.J();
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, photoViewer.E, bVar, true, false);
                        g1Var.setItemHeight(44);
                        g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        g1Var.setOnClickListener(new mh(G, i14));
                        J.r(g1Var, w7.a6.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.m1(photoViewer.E, bVar), w7.a6.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.T4.sponsoredUrl;
                        if (str2 != null && !TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.T).linkPrefix)) {
                            TextView textView = new TextView(photoViewer.E);
                            textView.setTextColor(bVar.F0(org.telegram.ui.ActionBar.j6.gc));
                            textView.setTextSize(1, 14.0f);
                            textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                            Uri parse = Uri.parse(photoViewer.T4.sponsoredUrl);
                            textView.setText(nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null));
                            textView.setBackground(org.telegram.ui.ActionBar.j6.Y(photoViewer.z1(org.telegram.ui.ActionBar.j6.I5), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0));
                            textView.setOnClickListener(new ow(22, photoViewer, G));
                            textView.setOnLongClickListener(new org.telegram.ui.Components.b0(i12, photoViewer, bVar));
                            arrayList.add(textView);
                        }
                        if (photoViewer.T4.sponsoredInfo != null) {
                            TextView textView2 = new TextView(photoViewer.E);
                            textView2.setTextColor(bVar.F0(org.telegram.ui.ActionBar.j6.E8));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView2.setMaxWidth(AndroidUtilities.dp(300.0f));
                            textView2.setText(photoViewer.T4.sponsoredInfo);
                            textView2.setBackground(org.telegram.ui.ActionBar.j6.Y(photoViewer.z1(org.telegram.ui.ActionBar.j6.I5), 0, photoViewer.T4.sponsoredAdditionalInfo == null ? 6 : 0));
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lr0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i13) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(photoViewer3.E), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView2);
                        }
                        if (photoViewer.T4.sponsoredAdditionalInfo != null) {
                            TextView textView3 = new TextView(photoViewer.E);
                            textView3.setTextColor(bVar.F0(org.telegram.ui.ActionBar.j6.E8));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView3.setMaxWidth(AndroidUtilities.dp(300.0f));
                            textView3.setText(photoViewer.T4.sponsoredAdditionalInfo);
                            textView3.setBackground(org.telegram.ui.ActionBar.j6.Y(photoViewer.z1(org.telegram.ui.ActionBar.j6.I5), 0, 6));
                            final int i17 = 1;
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.lr0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i17) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.T4.sponsoredInfo)) {
                                                org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(photoViewer2.E), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.T4.sponsoredAdditionalInfo)) {
                                                org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(photoViewer3.E), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView3);
                        }
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            View view2 = (View) arrayList.get(i18);
                            if (i18 > 0) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.E);
                                frameLayout.setBackgroundColor(bVar.F0(org.telegram.ui.ActionBar.j6.d7));
                                i10 = -1;
                                LinearLayout.LayoutParams n10 = w7.a6.n(-1, 1);
                                n10.height = 1;
                                J.r(frameLayout, n10);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, w7.a6.n(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new di.p2(G, J, 10), false);
                        if (!UserConfig.getInstance(i15).isPremium()) {
                            G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.mr0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i162 = i13;
                                    zh.b bVar2 = bVar;
                                    int i172 = i15;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i162) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.T8;
                                            if (!UserConfig.getInstance(i172).isPremium()) {
                                                new qg.a1(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i172).disableAds(true);
                                                org.telegram.ui.ActionBar.p2 p2Var = photoViewer2.m4;
                                                if (p2Var instanceof eo) {
                                                    eo eoVar = (eo) p2Var;
                                                    eoVar.Fa(photoViewer2.T4);
                                                    eoVar.Ha(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.T8;
                                            if (!UserConfig.getInstance(i172).isPremium()) {
                                                new qg.a1(photoViewer2.m4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.wc(photoViewer2.e0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i172).disableAds(true);
                                                org.telegram.ui.ActionBar.p2 p2Var2 = photoViewer2.m4;
                                                if (p2Var2 instanceof eo) {
                                                    eo eoVar2 = (eo) p2Var2;
                                                    eoVar2.Fa(photoViewer2.T4);
                                                    eoVar2.Ha(photoViewer2.T4);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            }, false);
                        }
                        if (photoViewer.T4.sponsoredCanReport) {
                        }
                        if (G.x() <= 0) {
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject5 = photoViewer.T4;
                if (messageObject5 != null && messageObject5.hasVideoQualities()) {
                    yr yrVar = photoViewer.J0;
                    MessageObject messageObject6 = photoViewer.T4;
                    LinearLayout linearLayout = yrVar.b;
                    if (messageObject6 != null && (message = messageObject6.messageOwner) != null && message.media != null && messageObject6.hasVideoQualities()) {
                        int i19 = messageObject6.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
                        ArrayList s10 = org.telegram.ui.Components.t71.s(i19, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i20 = 0;
                        while (i20 < s10.size()) {
                            org.telegram.ui.Components.p71 p71Var = (org.telegram.ui.Components.p71) s10.get(i20);
                            org.telegram.ui.Components.r71 a2 = p71Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(LocaleController.formatString(R.string.QualitySaveIn, Integer.valueOf(p71Var.b())));
                            sb2.append(p71Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                messageObject = messageObject6;
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                messageObject = messageObject6;
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.msg_mini_arrow_mediabold, 0);
                                uqVar.rotate(90.0f);
                                uqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                                uqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(uqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, linearLayout, 0, sb3, false, null);
                            c10.setSubtext(spannableStringBuilder);
                            c10.c(-328966, -328966);
                            c10.b.setPadding(0, 0, 0, 0);
                            MessageObject messageObject7 = messageObject;
                            c10.setOnClickListener(new a0(yrVar, messageObject7, p71Var, 9));
                            c10.setSelectorColor(268435455);
                            i20++;
                            messageObject6 = messageObject7;
                        }
                        photoViewer.t0.b();
                        break;
                    }
                }
                org.telegram.ui.Components.y7 y7Var = photoViewer.F;
                if (y7Var != null && y7Var.getActionBarMenuOnItemClick() != null) {
                    photoViewer.F.getActionBarMenuOnItemClick().b(2);
                    photoViewer.o0.M(null, null);
                    break;
                }
                break;
            case 5:
                Activity activity = photoViewer.y;
                if (activity != null) {
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 1;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity.getRequestedOrientation();
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
                    photoViewer.Z3 = false;
                    photoViewer.Y3 = 2;
                    if (photoViewer.X3 == -10) {
                        photoViewer.X3 = activity2.getRequestedOrientation();
                    }
                    photoViewer.y.setRequestedOrientation(1);
                    break;
                }
                break;
            default:
                MessageObject messageObject8 = photoViewer.T4;
                if (messageObject8 != null && messageObject8.isSponsored()) {
                    org.telegram.ui.ActionBar.p2 p2Var = photoViewer.m4;
                    if (p2Var instanceof eo) {
                        ((eo) p2Var).J9(photoViewer.T4, false, true);
                    }
                    photoViewer.G0(true, false);
                    String str3 = photoViewer.T4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.G1;
                        if (context == null) {
                            context = photoViewer.E;
                        }
                        nf.f.r(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.T).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
