package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i10 = this.a;
        int i11 = 3;
        String str = null;
        boolean z10 = true;
        int i12 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                i4 i4Var = (i4) obj4;
                m3 m3Var = (m3) obj3;
                Activity activity = (Activity) obj2;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && m3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i13 = 0;
                    for (int i14 = 0; i14 < uRLSpanArr.length; i14++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i14]), length);
                        i13 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i14]), i13);
                    }
                    i4Var.h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i13 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str2);
                        org.telegram.ui.web.y0 webView = m3Var.getWebView();
                        String str3 = org.telegram.ui.web.n1.a().b;
                        if (str3 != null) {
                            StringBuilder v = a4.a.v(str3);
                            v.append(URLEncoder.encode(str2));
                            str = v.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = nf.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        m3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                i4 i4Var2 = (i4) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(i4Var2.X).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(i4Var2.X).addWebBrowserException(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.I1 = new b0(i4Var2, 8);
                    break;
                } else {
                    i4Var2.c0();
                    break;
                }
                break;
            case 2:
                xn.d1((xn) obj4, (TLRPC.User) obj3, (String) obj2, (Boolean) obj);
                break;
            case 3:
                xn xnVar = (xn) obj4;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    xnVar.getClass();
                    for (int i15 = 0; i15 < groupedMessages.messages.size(); i15++) {
                        if (!xnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i15), false, l4.longValue())) {
                            z10 = false;
                        }
                    }
                    if (z10 && xnVar.R3 == 0) {
                        xnVar.O9(false);
                        break;
                    }
                } else if (xnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    xnVar.Wc(false);
                    if (xnVar.R3 == 0) {
                        xnVar.O9(false);
                        break;
                    }
                }
                break;
            case 4:
                xn.c0((xn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 5:
                jn jnVar = (jn) obj4;
                MessageObject messageObject2 = (MessageObject) obj3;
                vm vmVar = (vm) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    vmVar.run();
                    break;
                } else {
                    xn xnVar2 = jnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    oc ocVar = new oc(10, jnVar, messageObject2);
                    int i16 = j91.d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(xnVar2.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(xnVar2.getContext(), xnVar2.getResourceProvider());
                        org.telegram.ui.Components.bj0 bj0Var = ybVar.a;
                        bj0Var.setScaleX(1.25f);
                        bj0Var.setScaleY(1.25f);
                        if (diceValue == 1) {
                            bj0Var.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            bj0Var.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            bj0Var.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            bj0Var.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            bj0Var.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            bj0Var.setImageResource(R.drawable.dice6);
                        } else {
                            bj0Var.setScaleX(0.8f);
                            bj0Var.setScaleY(0.8f);
                            bj0Var.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) yh.w7.M0(j3));
                        int i17 = 27;
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.ad.b(LocaleController.getString(R.string.StakeDiceToastChange), new by0(i17, xnVar2, ocVar), xnVar2.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(ybVar.b);
                        org.telegram.ui.Components.zc zcVar = new org.telegram.ui.Components.zc(xnVar2.getContext(), null);
                        ybVar.b = zcVar;
                        zcVar.setSingleLine();
                        ybVar.b.setTypeface(Typeface.SANS_SERIF);
                        ybVar.b.setTextSize(1, 15.0f);
                        ybVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        ybVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        ybVar.addView(ybVar.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ybVar.b.setText(yh.w7.P0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        ybVar.b.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Gi, xnVar2.getResourceProvider()));
                        ybVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Hi, xnVar2.getResourceProvider()));
                        ybVar.b.setSingleLine(false);
                        ybVar.b.setMaxLines(2);
                        org.telegram.ui.Components.oc ocVar2 = new org.telegram.ui.Components.oc(xnVar2.getContext(), xnVar2.getResourceProvider(), true);
                        ocVar2.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        ocVar2.a = new ai.j(ocVar, j3, i17);
                        ybVar.setButton(ocVar2);
                        org.telegram.ui.Components.xc.a0(xnVar2).b(ybVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                jn jnVar2 = (jn) obj4;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                ((org.telegram.ui.ActionBar.b2) obj3).c(200L);
                xn xnVar3 = jnVar2.a;
                boolean z11 = xnVar3.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(xnVar3.getMessagesController().verifyAgeBotUsername);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(xnVar3.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(xnVar3.getParentActivity(), 1, xnVar3.getResourceProvider());
                    z1Var.setBackground(org.telegram.ui.ActionBar.h6.K0(false));
                    z1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    z1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(z1Var, w7.x5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    z1Var.setOnClickListener(new m8(i11, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar3.getParentActivity(), 0, xnVar3.getResourceProvider());
                String string = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                b2Var.G = 9;
                alertDialog$Builder.h(LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.ak(jnVar2, t1Var, zArr, z11, contentsettings));
                }
                xnVar3.showDialog(b2Var);
                break;
            case 7:
                ry ryVar = (ry) obj4;
                Long l10 = (Long) obj2;
                Runnable runnable = (Runnable) obj;
                ((org.telegram.ui.ActionBar.b2) obj3).q(150L);
                Boolean bool2 = ryVar.G.bot_participant;
                if (bool2 == null || !bool2.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    ryVar.getMessagesController().addUserToChat(l10.longValue(), ryVar.getMessagesController().getUser(Long.valueOf(ryVar.H)), 0, null, ryVar, false, runnable, new lf(i11, runnable));
                    break;
                }
                break;
            case 8:
                ry.k0((ry) obj4, (TLRPC.TL_attachMenuBot) obj3, (LaunchActivity) obj2);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                nf.e eVar = (nf.e) obj3;
                int[] iArr = (int[]) obj2;
                Long l11 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (eVar != null) {
                    launchActivity.getClass();
                    eVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l11.longValue()) != null) {
                    new xh.r1(launchActivity, iArr[0], l11.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null && (R instanceof xn)) {
                        ((xn) R).qb();
                        break;
                    }
                }
                break;
            case 10:
                ac0 ac0Var = (ac0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.jn0 jn0Var = (org.telegram.ui.Components.jn0) obj2;
                Long l12 = (Long) obj;
                TLRPC.User user = l12 == null ? null : MessagesController.getInstance(ac0Var.b).getUser(l12);
                userArr[0] = user;
                if (user == null) {
                    ac0Var.a();
                    org.telegram.messenger.z0.p(R.string.NoUsernameFound, ac0.b(), null);
                    break;
                } else {
                    jn0Var.run();
                    break;
                }
            case 11:
                g11 g11Var = (g11) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap = new HashMap();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = z61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = z61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = j11.s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        break;
                    } else {
                        hashMap.put(num, k10);
                    }
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    i11 i11Var = new i11();
                    g11Var.e.add(i11Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    i11Var.setDelegate(new h11(new Runnable[]{new by0(13, g11Var, i11Var)}));
                    i11Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    i11Var.onAttachedToWindow();
                    hashMap2.put(num2, i11Var);
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    Integer num3 = (Integer) arrayList2.get(i18);
                    num3.getClass();
                    g11Var.d.add((i11) hashMap2.get(num3));
                }
                g11Var.g[0] = true;
                g11Var.a();
                break;
            case 12:
                ArrayList arrayList3 = (ArrayList) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i19 = ((z61) obj4).V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                HashSet hashSet = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe((String) obj3);
                String i20 = org.telegram.ui.Cells.q3.i(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i21 = 0; i21 < stickerSets.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(i20)) {
                                arrayList3.add(new w61(translitSafe2));
                                arrayList3.addAll(tL_messages_stickerSet2.documents);
                                hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i12 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i12);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(i20)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList3.add(new w61(stickerSetCovered.set.title));
                                    arrayList3.addAll(arrayList);
                                    hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i12++;
                    }
                }
                runnable2.run();
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                Runnable runnable3 = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Components.q5.h(((z61) obj4).V).f(arrayList4);
                int size = arrayList4.size();
                while (i12 < size) {
                    Object obj5 = arrayList4.get(i12);
                    i12++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj5).id));
                }
                runnable3.run();
                break;
        }
    }
}
