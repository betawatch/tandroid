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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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

    /* JADX WARN: Removed duplicated region for block: B:262:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0745 A[SYNTHETIC] */
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
        boolean z10 = true;
        int i14 = 0;
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.b;
                o3 o3Var = (o3) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && o3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i15 = 0;
                    for (int i16 = 0; i16 < uRLSpanArr.length; i16++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i16]), length);
                        i15 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i16]), i15);
                    }
                    k4Var.h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i15 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str2);
                        org.telegram.ui.web.z0 webView = o3Var.getWebView();
                        String str3 = org.telegram.ui.web.o1.a().b;
                        if (str3 != null) {
                            StringBuilder u10 = a1.g.u(str3);
                            u10.append(URLEncoder.encode(str2));
                            str = u10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = pf.d.u(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        o3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                k4 k4Var2 = (k4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                MessagesController.getInstance(k4Var2.X).addWebBrowserException(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    MessagesController.getInstance(k4Var2.X).addWebBrowserException(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.I1 = new b0(k4Var2, 8);
                    break;
                } else {
                    k4Var2.c0();
                    break;
                }
            case 2:
                fo foVar = (fo) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (foVar.getParentActivity() != null) {
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
                        TLRPC.User currentUser = foVar.getUserConfig().getCurrentUser();
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
                                au auVar = new au();
                                auVar.a = split[i12];
                                String str7 = split[0];
                                auVar.c = str7;
                                i10 = i12;
                                try {
                                    auVar.d = split[1];
                                    List list = (List) hashMap.get(str7);
                                    if (list == null) {
                                        String str8 = split[0];
                                        list = new ArrayList();
                                        hashMap.put(str8, list);
                                    }
                                    list.add(auVar);
                                    i12 = i10;
                                } catch (Exception e7) {
                                    e = e7;
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
                                            String str10 = ((au) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a1.g.p("+", str10, str6);
                                            i14 = 1;
                                        }
                                    }
                                }
                                if (i14 == 0) {
                                    Context context = ApplicationLoader.applicationContext;
                                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                                    if (upperCase.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a1.g.p("+", upperCase, str6);
                                }
                            }
                            e = e7;
                            FileLog.e(e);
                            String str92 = currentUser.phone;
                            i11 = 4;
                            while (true) {
                                if (i11 >= 1) {
                                }
                                i11--;
                            }
                            if (i14 == 0) {
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", Integer.valueOf(i10));
                    arrayList2.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList2);
                    foVar.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 3:
                fo foVar2 = (fo) this.b;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    foVar2.getClass();
                    for (int i17 = 0; i17 < groupedMessages.messages.size(); i17++) {
                        if (!foVar2.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i17), false, l4.longValue())) {
                            z10 = false;
                        }
                    }
                    if (z10 && foVar2.R3 == 0) {
                        foVar2.T9(false);
                        break;
                    }
                } else if (foVar2.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    foVar2.ad(false);
                    if (foVar2.R3 == 0) {
                        foVar2.T9(false);
                        break;
                    }
                }
                break;
            case 4:
                fo.s1((fo) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                qn qnVar = (qn) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                cn cnVar = (cn) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    cnVar.run();
                    break;
                } else {
                    fo foVar3 = qnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    uc ucVar = new uc(10, qnVar, messageObject2);
                    int i18 = z91.d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(foVar3.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(foVar3.getContext(), foVar3.getResourceProvider());
                        acVar.a.setScaleX(1.25f);
                        acVar.a.setScaleY(1.25f);
                        if (diceValue == 1) {
                            acVar.a.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            acVar.a.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            acVar.a.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            acVar.a.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            acVar.a.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            acVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            acVar.a.setScaleX(0.8f);
                            acVar.a.setScaleY(0.8f);
                            acVar.a.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) zh.p7.N0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.cd.b(LocaleController.getString(R.string.StakeDiceToastChange), new i11(17, foVar3, ucVar), foVar3.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(acVar.b);
                        org.telegram.ui.Components.bd bdVar = new org.telegram.ui.Components.bd(foVar3.getContext());
                        acVar.b = bdVar;
                        bdVar.setSingleLine();
                        acVar.b.setTypeface(Typeface.SANS_SERIF);
                        acVar.b.setTextSize(1, 15.0f);
                        acVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        acVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        acVar.addView(acVar.b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        acVar.b.setText(zh.p7.Q0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        acVar.b.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Gi, foVar3.getResourceProvider()));
                        acVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Hi, foVar3.getResourceProvider()));
                        acVar.b.setSingleLine(false);
                        acVar.b.setMaxLines(2);
                        org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(foVar3.getContext(), foVar3.getResourceProvider(), true);
                        qcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        qcVar.a = new bi.g(ucVar, j10, 29);
                        acVar.setButton(qcVar);
                        org.telegram.ui.Components.zc.a0(foVar3).b(acVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                qn qnVar2 = (qn) this.b;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                a2Var.c(200L);
                fo foVar4 = qnVar2.a;
                boolean z11 = foVar4.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(foVar4.getMessagesController().verifyAgeBotUsername);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(foVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(foVar4.getParentActivity(), 1, foVar4.getResourceProvider());
                    a2Var2.setBackground(org.telegram.ui.ActionBar.g6.L0(false));
                    a2Var2.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    a2Var2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(a2Var2, w7.z5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                    a2Var2.setOnClickListener(new p8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(foVar4.getParentActivity(), 0, foVar4.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                alertDialog$Builder.a.T = LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.a.G = 9;
                alertDialog$Builder.h(LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.pk(qnVar2, u1Var, zArr, z11, contentsettings));
                }
                foVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                yy yyVar = (yy) this.b;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.c;
                Long l10 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                a2Var3.q(150L);
                Boolean bool3 = yyVar.G.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    yyVar.getMessagesController().addUserToChat(l10.longValue(), yyVar.getMessagesController().getUser(Long.valueOf(yyVar.H)), 0, null, yyVar, false, runnable, new tf(i13, runnable));
                    break;
                }
            case 8:
                yy.b0((yy) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                pf.c cVar = (pf.c) this.c;
                int[] iArr = (int[]) this.d;
                Long l11 = (Long) obj;
                Pattern pattern = LaunchActivity.B1;
                if (cVar != null) {
                    launchActivity.getClass();
                    cVar.b();
                }
                if (MessagesController.getInstance(launchActivity.O).getUserOrChat(l11.longValue()) != null) {
                    new yh.p1(launchActivity, iArr[0], l11.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                    if (R != null && (R instanceof fo)) {
                        ((fo) R).ub();
                        break;
                    }
                }
                break;
            case 10:
                ic0 ic0Var = (ic0) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.ey0 ey0Var = (org.telegram.ui.Components.ey0) this.d;
                Long l12 = (Long) obj;
                TLRPC.User user2 = l12 == null ? null : MessagesController.getInstance(ic0Var.b).getUser(l12);
                userArr[0] = user2;
                if (user2 == null) {
                    ic0Var.c();
                    org.telegram.messenger.sk.q(R.string.NoUsernameFound, ic0.d(), null);
                    break;
                } else {
                    ey0Var.run();
                    break;
                }
            case 11:
                t11 t11Var = (t11) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = r71.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = r71.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = w11.s;
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
                    v11 v11Var = new v11();
                    t11Var.e.add(v11Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    v11Var.setDelegate(new u11(new Runnable[]{new i11(i13, t11Var, v11Var)}));
                    v11Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    v11Var.onAttachedToWindow();
                    hashMap3.put(num2, v11Var);
                }
                for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                    Integer num3 = (Integer) arrayList3.get(i19);
                    num3.getClass();
                    t11Var.d.add((v11) hashMap3.get(num3));
                }
                t11Var.g[0] = true;
                t11Var.a();
                break;
            case 12:
                r71 r71Var = (r71) this.b;
                String str11 = (String) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i20 = r71Var.V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i20).getStickerSets(5);
                HashSet hashSet2 = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe(str11);
                String h = t8.b.h(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i21 = 0; i21 < stickerSets.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(h)) {
                                arrayList4.add(new o71(translitSafe2));
                                arrayList4.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i20).getFeaturedEmojiSets();
                if (featuredEmojiSets != null) {
                    while (i14 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i14);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title);
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(h)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i20).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList4.add(new o71(stickerSetCovered.set.title));
                                    arrayList4.addAll(arrayList);
                                    hashSet2.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i14++;
                    }
                }
                runnable2.run();
                break;
            default:
                r71 r71Var2 = (r71) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.s5.h(r71Var2.V).f(arrayList5);
                int size = arrayList5.size();
                while (i14 < size) {
                    Object obj2 = arrayList5.get(i14);
                    i14++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj2).id));
                }
                runnable3.run();
                break;
        }
    }
}
