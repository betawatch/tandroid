package org.telegram.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06e8 A[SYNTHETIC] */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        Intent intent;
        int i10;
        int i11;
        BufferedReader bufferedReader;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i12 = 2;
        int i13 = 3;
        String str = null;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                m3 m3Var = (m3) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && m3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i16 = 0;
                    for (int i17 = 0; i17 < uRLSpanArr.length; i17++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i17]), length);
                        i16 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i17]), i16);
                    }
                    j4Var.h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i16 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.l.b(activity, str2);
                        org.telegram.ui.web.x0 webView = m3Var.getWebView();
                        String str3 = org.telegram.ui.web.n1.a().b;
                        if (str3 != null) {
                            StringBuilder u10 = a1.g.u(str3);
                            u10.append(URLEncoder.encode(str2));
                            str = u10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = qf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        m3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                j4 j4Var2 = (j4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(j4Var2.X).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(j4Var2.X).addWebBrowserException(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.K1 = new a0(j4Var2, 8);
                    break;
                } else {
                    j4Var2.c0();
                    break;
                }
            case 2:
                wn wnVar = (wn) this.b;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    wnVar.getClass();
                    for (int i18 = 0; i18 < groupedMessages.messages.size(); i18++) {
                        if (!wnVar.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i18), false, l4.longValue())) {
                            i14 = 0;
                        }
                    }
                    if (i14 != 0 && wnVar.d4 == 0) {
                        wnVar.ba(false);
                        break;
                    }
                } else if (wnVar.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    wnVar.nd(false);
                    if (wnVar.d4 == 0) {
                        wnVar.ba(false);
                        break;
                    }
                }
                break;
            case 3:
                wn wnVar2 = (wn) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (wnVar2.getParentActivity() != null) {
                    if (bool2.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    if (user != null) {
                        intent.putExtra("name", ContactsController.formatName(user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (str6.startsWith("+")) {
                        i10 = 2;
                    } else {
                        TLRPC.User currentUser = wnVar2.getUserConfig().getCurrentUser();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e) {
                            e = e;
                            i10 = i12;
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                lt ltVar = new lt();
                                ltVar.a = split[i12];
                                String str7 = split[0];
                                ltVar.c = str7;
                                i10 = i12;
                                try {
                                    ltVar.d = split[1];
                                    List list = (List) hashMap.get(str7);
                                    if (list == null) {
                                        String str8 = split[0];
                                        list = new ArrayList();
                                        hashMap.put(str8, list);
                                    }
                                    list.add(ltVar);
                                    i12 = i10;
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            } else {
                                i10 = i12;
                                bufferedReader.close();
                                String str9 = currentUser.phone;
                                i11 = 4;
                                while (true) {
                                    if (i11 >= 1) {
                                        List list2 = (List) hashMap.get(str9.substring(0, i11));
                                        if (list2 == null || list2.size() <= 0) {
                                            i11--;
                                        } else {
                                            String str10 = ((lt) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a1.g.p("+", str10, str6);
                                            i15 = 1;
                                        }
                                    }
                                }
                                if (i15 == 0) {
                                    Context context = ApplicationLoader.applicationContext;
                                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                                    if (upperCase.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a1.g.p("+", upperCase, str6);
                                }
                            }
                            e = e10;
                            FileLog.e(e);
                            String str92 = currentUser.phone;
                            i11 = 4;
                            while (true) {
                                if (i11 >= 1) {
                                }
                                i11--;
                            }
                            if (i15 == 0) {
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", Integer.valueOf(i10));
                    arrayList2.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList2);
                    wnVar2.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 4:
                wn.V0((wn) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                hn hnVar = (hn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                tm tmVar = (tm) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    tmVar.run();
                    break;
                } else {
                    wn wnVar3 = hnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    li.s2 s2Var = new li.s2(18, hnVar, messageObject2);
                    int i19 = p81.d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(wnVar3.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wnVar3.getContext(), wnVar3.getResourceProvider());
                        ybVar.a.setScaleX(1.25f);
                        ybVar.a.setScaleY(1.25f);
                        if (diceValue == 1) {
                            ybVar.a.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            ybVar.a.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            ybVar.a.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            ybVar.a.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            ybVar.a.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            ybVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            ybVar.a.setScaleX(0.8f);
                            ybVar.a.setScaleY(0.8f);
                            ybVar.a.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) bi.dd.L0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.zc.b(LocaleController.getString(R.string.StakeDiceToastChange), new by0(24, wnVar3, s2Var), wnVar3.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(ybVar.b);
                        org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(wnVar3.getContext());
                        ybVar.b = ycVar;
                        ycVar.setSingleLine();
                        ybVar.b.setTypeface(Typeface.SANS_SERIF);
                        ybVar.b.setTextSize(1, 15.0f);
                        ybVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        ybVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        ybVar.addView(ybVar.b, org.telegram.ui.Components.kb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ybVar.b.setText(bi.dd.O0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.f7.H(ybVar.b, org.telegram.ui.ActionBar.y6.Gi, wnVar3.getResourceProvider());
                        ybVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hi, wnVar3.getResourceProvider()));
                        ybVar.b.setSingleLine(false);
                        ybVar.b.setMaxLines(2);
                        org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(wnVar3.getContext(), wnVar3.getResourceProvider(), true);
                        ocVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        ocVar.b = new nh0(s2Var, j10, i14);
                        ybVar.setButton(ocVar);
                        org.telegram.ui.Components.wc.b0(wnVar3).b(ybVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                hn hnVar2 = (hn) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                e2Var.c(200L);
                wn wnVar4 = hnVar2.a;
                boolean z10 = wnVar4.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(wnVar4.getMessagesController().verifyAgeBotUsername);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(wnVar4.getParentActivity());
                if (z10) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(wnVar4.getParentActivity(), 1, wnVar4.getResourceProvider());
                    y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                    y1Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    y1Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(y1Var, org.telegram.ui.Components.kb1.h(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    y1Var.setOnClickListener(new p8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar4.getParentActivity(), 0, wnVar4.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                alertDialog$Builder.a.T = LocaleController.getString(objArr != false ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.G = 9;
                alertDialog$Builder.h(LocaleController.getString(objArr != false ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (objArr == false) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.ok(hnVar2, s1Var, zArr, z10, contentsettings));
                }
                wnVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                ey eyVar = (ey) this.b;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.c;
                Long l10 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                e2Var2.r(150L);
                Boolean bool3 = eyVar.G.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    eyVar.getMessagesController().addUserToChat(l10.longValue(), eyVar.getMessagesController().getUser(Long.valueOf(eyVar.H)), 0, null, eyVar, false, runnable, new ef(i13, runnable));
                    break;
                }
            case 8:
                ey.c0((ey) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                qf.c cVar = (qf.c) this.c;
                int[] iArr = (int[]) this.d;
                Long l11 = (Long) obj;
                Pattern pattern = LaunchActivity.D1;
                launchActivity.getClass();
                if (cVar != null) {
                    cVar.b();
                }
                if ((l11 != null ? MessagesController.getInstance(launchActivity.O).getUserOrChat(l11.longValue()) : null) != null) {
                    new zh.p1(launchActivity, iArr[0], l11.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                    if (R != null && (R instanceof wn)) {
                        ((wn) R).Fb();
                        break;
                    }
                }
                break;
            case 10:
                ob0 ob0Var = (ob0) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.e10 e10Var = (org.telegram.ui.Components.e10) this.d;
                Long l12 = (Long) obj;
                TLRPC.User user2 = l12 == null ? null : MessagesController.getInstance(ob0Var.b).getUser(l12);
                userArr[0] = user2;
                if (user2 == null) {
                    ob0Var.c();
                    org.telegram.messenger.wh.n(R.string.NoUsernameFound, ob0.d(), null);
                    break;
                } else {
                    e10Var.run();
                    break;
                }
            case 11:
                a11 a11Var = (a11) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = f61.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = f61.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = d11.s;
                        FileLog.e("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        break;
                    } else {
                        hashMap2.put(num, k10);
                    }
                }
                HashMap hashMap3 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    c11 c11Var = new c11();
                    a11Var.e.add(c11Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    c11Var.setDelegate(new b11(new Runnable[]{new by0(12, a11Var, c11Var)}));
                    c11Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    c11Var.onAttachedToWindow();
                    hashMap3.put(num2, c11Var);
                }
                for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                    Integer num3 = (Integer) arrayList3.get(i20);
                    num3.getClass();
                    a11Var.d.add((c11) hashMap3.get(num3));
                }
                a11Var.g[0] = true;
                a11Var.a();
                break;
            case 12:
                f61 f61Var = (f61) this.b;
                String str11 = (String) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i21 = f61Var.V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i21).getStickerSets(5);
                HashSet hashSet2 = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe(str11);
                String j11 = org.telegram.ui.Components.b10.j(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i22 = 0; i22 < stickerSets.size(); i22++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i22);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(j11)) {
                                arrayList4.add(new c61(translitSafe2));
                                arrayList4.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i21).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i15 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i15);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(j11)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i21).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList4.add(new c61(stickerSetCovered.set.title));
                                    arrayList4.addAll(arrayList);
                                    hashSet2.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i15++;
                    }
                }
                runnable2.run();
                break;
            default:
                f61 f61Var2 = (f61) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.t5.h(f61Var2.V).f(arrayList5);
                int size = arrayList5.size();
                while (i15 < size) {
                    Object obj2 = arrayList5.get(i15);
                    i15++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj2).id));
                }
                runnable3.run();
                break;
        }
    }
}
