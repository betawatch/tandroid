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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ sq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x023d, code lost:
    
        if (r4.startsWith("https://" + org.telegram.messenger.MessagesController.getInstance(r7.P).linkPrefix) == false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        xt0 xt0Var;
        float f9;
        int i10;
        TLRPC.Message message;
        int i11 = this.a;
        float f10 = 0.0f;
        final PhotoViewer photoViewer = this.b;
        final int i12 = 0;
        int i13 = 1;
        switch (i11) {
            case 0:
                if (!photoViewer.a2 && !photoViewer.H1()) {
                    photoViewer.M2();
                    break;
                }
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.P8;
                if (!photoViewer.H1() && (xt0Var = photoViewer.d) != null && xt0Var.c() != null && !photoViewer.d.c().isEmpty()) {
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
                        final int i14 = photoViewer.P4.currentAccount;
                        final lh.b bVar = new lh.b();
                        org.telegram.ui.Components.j70 G = org.telegram.ui.Components.j70.G(photoViewer.a0, bVar, photoViewer.k0, true);
                        G.a0(0.0f, -AndroidUtilities.dp(46.0f));
                        G.V(5);
                        MessageObject messageObject3 = photoViewer.P4;
                        if (messageObject3.sponsoredInfo == null && messageObject3.sponsoredAdditionalInfo == null) {
                            String str = messageObject3.sponsoredUrl;
                            if (str != null) {
                                break;
                            }
                            if (!UserConfig.getInstance(i14).isPremium() && !MessagesController.getInstance(photoViewer.P).premiumFeaturesBlocked() && !photoViewer.P4.sponsoredCanReport) {
                                G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.kq0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i15 = i12;
                                        lh.b bVar2 = bVar;
                                        int i16 = i14;
                                        PhotoViewer photoViewer2 = photoViewer;
                                        switch (i15) {
                                            case 0:
                                                Drawable[] drawableArr3 = PhotoViewer.P8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new cg.p1(photoViewer2.i4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.tc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer2.i4;
                                                    if (o2Var instanceof tn) {
                                                        tn tnVar = (tn) o2Var;
                                                        tnVar.Fa(photoViewer2.P4);
                                                        tnVar.Ha(photoViewer2.P4);
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                Drawable[] drawableArr4 = PhotoViewer.P8;
                                                if (!UserConfig.getInstance(i16).isPremium()) {
                                                    new cg.p1(photoViewer2.i4, 3, true).show();
                                                    break;
                                                } else {
                                                    new org.telegram.ui.Components.tc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                    MessagesController.getInstance(i16).disableAds(true);
                                                    org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer2.i4;
                                                    if (o2Var2 instanceof tn) {
                                                        tn tnVar2 = (tn) o2Var2;
                                                        tnVar2.Fa(photoViewer2.P4);
                                                        tnVar2.Ha(photoViewer2.P4);
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                    }
                                }, false);
                            }
                            if (photoViewer.P4.sponsoredCanReport) {
                                G.c(R.drawable.msg_info, LocaleController.getString(R.string.AboutRevenueSharingAds), new lf0(19, photoViewer, bVar), false);
                                if ((photoViewer.i4 instanceof tn) && !MessagesController.getInstance(i14).premiumFeaturesBlocked()) {
                                    G.k();
                                    final int i15 = 1;
                                    G.c(R.drawable.msg_cancel, LocaleController.getString(R.string.RemoveAds), new Runnable() { // from class: org.telegram.ui.kq0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            int i152 = i15;
                                            lh.b bVar2 = bVar;
                                            int i16 = i14;
                                            PhotoViewer photoViewer2 = photoViewer;
                                            switch (i152) {
                                                case 0:
                                                    Drawable[] drawableArr3 = PhotoViewer.P8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new cg.p1(photoViewer2.i4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.tc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.o2 o2Var = photoViewer2.i4;
                                                        if (o2Var instanceof tn) {
                                                            tn tnVar = (tn) o2Var;
                                                            tnVar.Fa(photoViewer2.P4);
                                                            tnVar.Ha(photoViewer2.P4);
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                default:
                                                    Drawable[] drawableArr4 = PhotoViewer.P8;
                                                    if (!UserConfig.getInstance(i16).isPremium()) {
                                                        new cg.p1(photoViewer2.i4, 3, true).show();
                                                        break;
                                                    } else {
                                                        new org.telegram.ui.Components.tc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                        MessagesController.getInstance(i16).disableAds(true);
                                                        org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer2.i4;
                                                        if (o2Var2 instanceof tn) {
                                                            tn tnVar2 = (tn) o2Var2;
                                                            tnVar2.Fa(photoViewer2.P4);
                                                            tnVar2.Ha(photoViewer2.P4);
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
                        org.telegram.ui.Components.j70 J = G.J();
                        org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(0, photoViewer.A, bVar, true, false);
                        g1Var.setItemHeight(44);
                        g1Var.g(LocaleController.getString(R.string.Back), R.drawable.msg_arrow_back, null);
                        g1Var.getTextView().setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(40.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(40.0f) : 0, 0);
                        g1Var.setOnClickListener(new ah(G, 1));
                        J.r(g1Var, i7.f6.n(-1, -2));
                        J.r(new org.telegram.ui.ActionBar.l1(photoViewer.A, bVar), i7.f6.n(-1, 8));
                        ArrayList arrayList = new ArrayList();
                        String str2 = photoViewer.P4.sponsoredUrl;
                        if (str2 != null) {
                            f9 = 300.0f;
                            if (!TextUtils.equals(AndroidUtilities.getHostAuthority(str2), MessagesController.getInstance(photoViewer.P).linkPrefix)) {
                                TextView textView = new TextView(photoViewer.A);
                                textView.setTextColor(bVar.C0(org.telegram.ui.ActionBar.g6.gc));
                                textView.setTextSize(1, 14.0f);
                                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                                textView.setMaxWidth(AndroidUtilities.dp(300.0f));
                                Uri parse = Uri.parse(photoViewer.P4.sponsoredUrl);
                                textView.setText(ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null));
                                textView.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, photoViewer.P4.sponsoredAdditionalInfo == null ? 6 : 0));
                                textView.setOnClickListener(new t70(13, photoViewer, G));
                                textView.setOnLongClickListener(new lh.e2(4, photoViewer, bVar));
                                arrayList.add(textView);
                            }
                        } else {
                            f9 = 300.0f;
                        }
                        if (photoViewer.P4.sponsoredInfo != null) {
                            TextView textView2 = new TextView(photoViewer.A);
                            textView2.setTextColor(bVar.C0(org.telegram.ui.ActionBar.g6.E8));
                            textView2.setTextSize(1, 14.0f);
                            textView2.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView2.setMaxWidth(AndroidUtilities.dp(f9));
                            textView2.setText(photoViewer.P4.sponsoredInfo);
                            textView2.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, photoViewer.P4.sponsoredAdditionalInfo == null ? 6 : 0));
                            textView2.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i12) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(photoViewer2.A), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(photoViewer3.A), bVar));
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
                            textView3.setTextColor(bVar.C0(org.telegram.ui.ActionBar.g6.E8));
                            textView3.setTextSize(1, 14.0f);
                            textView3.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f));
                            textView3.setMaxWidth(AndroidUtilities.dp(f9));
                            textView3.setText(photoViewer.P4.sponsoredAdditionalInfo);
                            textView3.setBackground(org.telegram.ui.ActionBar.g6.Y(photoViewer.z1(org.telegram.ui.ActionBar.g6.I5), 0, 6));
                            final int i16 = 1;
                            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.jq0
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i16) {
                                        case 0:
                                            PhotoViewer photoViewer2 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer2.P4.sponsoredInfo)) {
                                                b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(photoViewer2.A), bVar));
                                                break;
                                            }
                                            break;
                                        default:
                                            PhotoViewer photoViewer3 = photoViewer;
                                            if (AndroidUtilities.addToClipboard(photoViewer3.P4.sponsoredAdditionalInfo)) {
                                                b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(photoViewer3.A), bVar));
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            arrayList.add(textView3);
                        }
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            View view2 = (View) arrayList.get(i17);
                            if (i17 > 0) {
                                FrameLayout frameLayout = new FrameLayout(photoViewer.A);
                                frameLayout.setBackgroundColor(bVar.C0(org.telegram.ui.ActionBar.g6.d7));
                                i10 = -1;
                                LinearLayout.LayoutParams n10 = i7.f6.n(-1, 1);
                                n10.height = 1;
                                J.r(frameLayout, n10);
                            } else {
                                i10 = -1;
                            }
                            J.r(view2, i7.f6.n(i10, -2));
                        }
                        G.c(R.drawable.msg_channel, LocaleController.getString(R.string.SponsoredMessageSponsorReportable), new ih.z2(G, J, 8), false);
                        if (!UserConfig.getInstance(i14).isPremium()) {
                            G.c(R.drawable.msg_block2, LocaleController.getString(R.string.HideAd), new Runnable() { // from class: org.telegram.ui.kq0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i152 = i12;
                                    lh.b bVar2 = bVar;
                                    int i162 = i14;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    switch (i152) {
                                        case 0:
                                            Drawable[] drawableArr3 = PhotoViewer.P8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new cg.p1(photoViewer2.i4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.tc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.o2 o2Var = photoViewer2.i4;
                                                if (o2Var instanceof tn) {
                                                    tn tnVar = (tn) o2Var;
                                                    tnVar.Fa(photoViewer2.P4);
                                                    tnVar.Ha(photoViewer2.P4);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            Drawable[] drawableArr4 = PhotoViewer.P8;
                                            if (!UserConfig.getInstance(i162).isPremium()) {
                                                new cg.p1(photoViewer2.i4, 3, true).show();
                                                break;
                                            } else {
                                                new org.telegram.ui.Components.tc(photoViewer2.a0, bVar2).c(LocaleController.getString(R.string.AdHidden)).j();
                                                MessagesController.getInstance(i162).disableAds(true);
                                                org.telegram.ui.ActionBar.o2 o2Var2 = photoViewer2.i4;
                                                if (o2Var2 instanceof tn) {
                                                    tn tnVar2 = (tn) o2Var2;
                                                    tnVar2.Fa(photoViewer2.P4);
                                                    tnVar2.Ha(photoViewer2.P4);
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
                        if (G.x() <= 0) {
                        }
                    }
                }
                break;
            case 4:
                MessageObject messageObject4 = photoViewer.P4;
                if (messageObject4 != null && messageObject4.hasVideoQualities()) {
                    lr lrVar = photoViewer.F0;
                    MessageObject messageObject5 = photoViewer.P4;
                    LinearLayout linearLayout = lrVar.b;
                    if (messageObject5 != null && (message = messageObject5.messageOwner) != null && message.media != null && messageObject5.hasVideoQualities()) {
                        int i18 = messageObject5.currentAccount;
                        TLRPC.MessageMedia messageMedia = messageObject5.messageOwner.media;
                        ArrayList t10 = org.telegram.ui.Components.x61.t(i18, messageMedia.document, messageMedia.alt_documents, 0, true);
                        linearLayout.removeAllViews();
                        int i19 = 0;
                        while (i19 < t10.size()) {
                            org.telegram.ui.Components.t61 t61Var = (org.telegram.ui.Components.t61) t10.get(i19);
                            org.telegram.ui.Components.v61 a2 = t61Var.a();
                            StringBuilder sb2 = new StringBuilder();
                            int i20 = R.string.QualitySaveIn;
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(t61Var.b());
                            sb2.append(LocaleController.formatString(i20, objArr));
                            sb2.append(t61Var.a ? " (" + LocaleController.getString(R.string.QualitySource) + ")" : "");
                            String sb3 = sb2.toString();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (a2.b()) {
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                                spannableStringBuilder.append(LocaleController.getString(R.string.QualityCached));
                            } else {
                                SpannableString spannableString = new SpannableString("s ");
                                org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.msg_mini_arrow_mediabold, 0);
                                iqVar.rotate(90.0f);
                                iqVar.translate(f10, AndroidUtilities.dp(1.0f));
                                iqVar.spaceScaleX = 0.85f;
                                spannableString.setSpan(iqVar, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) spannableString);
                                spannableStringBuilder.append(AndroidUtilities.formatFileSize(a2.g.size));
                            }
                            org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, linearLayout, 0, sb3, false, null);
                            c3.setSubtext(spannableStringBuilder);
                            c3.c(-328966, -328966);
                            c3.b.setPadding(0, 0, 0, 0);
                            c3.setOnClickListener(new c0(lrVar, messageObject5, t61Var, 9));
                            c3.setSelectorColor(268435455);
                            i19++;
                            f10 = 0.0f;
                            i13 = 1;
                        }
                        photoViewer.p0.b();
                        break;
                    }
                }
                cg.m1 m1Var = photoViewer.B;
                if (m1Var != null && m1Var.getActionBarMenuOnItemClick() != null) {
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
                    org.telegram.ui.ActionBar.o2 o2Var = photoViewer.i4;
                    if (o2Var instanceof tn) {
                        ((tn) o2Var).J9(photoViewer.P4, false, true);
                    }
                    photoViewer.G0(true, false);
                    String str3 = photoViewer.P4.sponsoredUrl;
                    if (str3 != null) {
                        Context context = LaunchActivity.C1;
                        if (context == null) {
                            context = photoViewer.A;
                        }
                        ye.d.r(context, Uri.parse(str3), true, false, false, null, null, false, MessagesController.getInstance(photoViewer.P).sponsoredLinksInappAllow, false);
                        break;
                    }
                }
                break;
        }
    }
}
