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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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

    /* JADX WARN: Removed duplicated region for block: B:262:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0747 A[SYNTHETIC] */
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
                i4 i4Var = (i4) this.b;
                m3 m3Var = (m3) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && m3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i15 = 0;
                    for (int i16 = 0; i16 < uRLSpanArr.length; i16++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i16]), length);
                        i15 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i16]), i15);
                    }
                    i4Var.h0.k(false);
                    Uri uriParseSafe = Utilities.uriParseSafe(str2);
                    if ((uRLSpanArr.length <= 0 || length != 0 || i15 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str2);
                        org.telegram.ui.web.y0 webView = m3Var.getWebView();
                        String str3 = org.telegram.ui.web.n1.a().b;
                        if (str3 != null) {
                            StringBuilder v = a1.g.v(str3);
                            v.append(URLEncoder.encode(str2));
                            str = v.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                            str2 = of.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                        }
                        m3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                i4 i4Var2 = (i4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
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
            case 2:
                zn znVar = (zn) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (znVar.getParentActivity() != null) {
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
                        TLRPC.User currentUser = znVar.getUserConfig().getCurrentUser();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e7) {
                            e = e7;
                            i10 = i12;
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ut utVar = new ut();
                                utVar.a = split[i12];
                                String str7 = split[0];
                                utVar.c = str7;
                                i10 = i12;
                                try {
                                    utVar.d = split[1];
                                    List list = (List) hashMap.get(str7);
                                    if (list == null) {
                                        String str8 = split[0];
                                        list = new ArrayList();
                                        hashMap.put(str8, list);
                                    }
                                    list.add(utVar);
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
                                            String str10 = ((ut) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a1.g.q("+", str10, str6);
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
                                    str6 = a1.g.q("+", upperCase, str6);
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
                            if (i14 == 0) {
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", Integer.valueOf(i10));
                    arrayList2.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList2);
                    znVar.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 3:
                zn znVar2 = (zn) this.b;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                Long l4 = (Long) obj;
                if (groupedMessages != null) {
                    znVar2.getClass();
                    for (int i17 = 0; i17 < groupedMessages.messages.size(); i17++) {
                        if (!znVar2.getSendMessagesHelper().retrySendMessage(groupedMessages.messages.get(i17), false, l4.longValue())) {
                            z10 = false;
                        }
                    }
                    if (z10 && znVar2.R3 == 0) {
                        znVar2.T9(false);
                        break;
                    }
                } else if (znVar2.getSendMessagesHelper().retrySendMessage(messageObject, false, l4.longValue())) {
                    znVar2.ad(false);
                    if (znVar2.R3 == 0) {
                        znVar2.T9(false);
                        break;
                    }
                }
                break;
            case 4:
                zn.s1((zn) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                ln lnVar = (ln) this.b;
                MessageObject messageObject2 = (MessageObject) this.c;
                xm xmVar = (xm) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    xmVar.run();
                    break;
                } else {
                    zn znVar3 = lnVar.a;
                    int diceValue = messageObject2.getDiceValue();
                    messageObject2.getStakedDiceAmount();
                    pc pcVar = new pc(10, lnVar, messageObject2);
                    int i18 = t91.d0;
                    TLRPC.EmojiGameInfo emojiGameInfo = MessagesController.getInstance(znVar3.getCurrentAccount()).stakeDiceInfo;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(znVar3.getContext(), znVar3.getResourceProvider());
                        bcVar.a.setScaleX(1.25f);
                        bcVar.a.setScaleY(1.25f);
                        if (diceValue == 1) {
                            bcVar.a.setImageResource(R.drawable.dice1);
                        } else if (diceValue == 2) {
                            bcVar.a.setImageResource(R.drawable.dice2);
                        } else if (diceValue == 3) {
                            bcVar.a.setImageResource(R.drawable.dice3);
                        } else if (diceValue == 4) {
                            bcVar.a.setImageResource(R.drawable.dice4);
                        } else if (diceValue == 5) {
                            bcVar.a.setImageResource(R.drawable.dice5);
                        } else if (diceValue == 6) {
                            bcVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            bcVar.a.setScaleX(0.8f);
                            bcVar.a.setScaleY(0.8f);
                            bcVar.a.setImageDrawable(Emoji.getEmojiBigDrawable("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.StakeDiceToast));
                        spannableStringBuilder2.append((CharSequence) yh.p7.N0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.dd.b(LocaleController.getString(R.string.StakeDiceToastChange), new n31(11, znVar3, pcVar), znVar3.getResourceProvider(), null));
                        AndroidUtilities.removeFromParent(bcVar.b);
                        org.telegram.ui.Components.cd cdVar = new org.telegram.ui.Components.cd(znVar3.getContext());
                        bcVar.b = cdVar;
                        cdVar.setSingleLine();
                        bcVar.b.setTypeface(Typeface.SANS_SERIF);
                        bcVar.b.setTextSize(1, 15.0f);
                        bcVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        bcVar.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                        bcVar.addView(bcVar.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        bcVar.b.setText(yh.p7.Q0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        bcVar.b.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Gi, znVar3.getResourceProvider()));
                        bcVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hi, znVar3.getResourceProvider()));
                        bcVar.b.setSingleLine(false);
                        bcVar.b.setMaxLines(2);
                        org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(znVar3.getContext(), znVar3.getResourceProvider(), true);
                        rcVar.e(LocaleController.getString(R.string.StakeDiceToastButton));
                        rcVar.a = new ai.j(pcVar, j3, 29);
                        bcVar.setButton(rcVar);
                        org.telegram.ui.Components.ad.a0(znVar3).b(bcVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                ln lnVar2 = (ln) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                b2Var.c(200L);
                zn znVar4 = lnVar2.a;
                boolean z11 = znVar4.getMessagesController().config.needAgeVideoVerification.get() && !TextUtils.isEmpty(znVar4.getMessagesController().verifyAgeBotUsername);
                boolean z12 = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(znVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(znVar4.getParentActivity(), 1, znVar4.getResourceProvider());
                    a2Var.setBackground(org.telegram.ui.ActionBar.i6.L0(false));
                    a2Var.e(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
                    a2Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    frameLayout.addView(a2Var, w7.x5.a(48.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
                    a2Var.setOnClickListener(new l8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar4.getParentActivity(), 0, znVar4.getResourceProvider());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle);
                alertDialog$Builder.a.T = LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText);
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.a.G = 9;
                alertDialog$Builder.h(LocaleController.getString(z12 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
                if (!z12) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new org.telegram.messenger.mk(lnVar2, u1Var, zArr, z11, contentsettings));
                }
                znVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                ty.e0((ty) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                ty tyVar = (ty) this.b;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.c;
                Long l10 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                b2Var2.q(150L);
                Boolean bool3 = tyVar.G.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    tyVar.getMessagesController().addUserToChat(l10.longValue(), tyVar.getMessagesController().getUser(Long.valueOf(tyVar.H)), 0, null, tyVar, false, runnable, new of(i13, runnable));
                    break;
                }
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                of.e eVar = (of.e) this.c;
                int[] iArr = (int[]) this.d;
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
                    if (R != null && (R instanceof zn)) {
                        ((zn) R).ub();
                        break;
                    }
                }
                break;
            case 10:
                ec0 ec0Var = (ec0) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.oo0 oo0Var = (org.telegram.ui.Components.oo0) this.d;
                Long l12 = (Long) obj;
                TLRPC.User user2 = l12 == null ? null : MessagesController.getInstance(ec0Var.b).getUser(l12);
                userArr[0] = user2;
                if (user2 == null) {
                    ec0Var.c();
                    org.telegram.messenger.bi.q(R.string.NoUsernameFound, ec0.d(), null);
                    break;
                } else {
                    oo0Var.run();
                    break;
                }
            case 11:
                m11 m11Var = (m11) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = k71.k(num + "️⃣", tL_messages_stickerSet);
                    if (k10 == null) {
                        k10 = k71.k(num + "⃣", tL_messages_stickerSet);
                    }
                    if (k10 == null) {
                        String[] strArr = p11.s;
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
                    o11 o11Var = new o11();
                    m11Var.e.add(o11Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    o11Var.setDelegate(new n11(new Runnable[]{new rt0(27, m11Var, o11Var)}));
                    o11Var.setImage(ImageLocation.getForDocument(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    o11Var.onAttachedToWindow();
                    hashMap3.put(num2, o11Var);
                }
                for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                    Integer num3 = (Integer) arrayList3.get(i19);
                    num3.getClass();
                    m11Var.d.add((o11) hashMap3.get(num3));
                }
                m11Var.g[0] = true;
                m11Var.a();
                break;
            case 12:
                k71 k71Var = (k71) this.b;
                String str11 = (String) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i20 = k71Var.V;
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i20).getStickerSets(5);
                HashSet hashSet2 = new HashSet();
                String translitSafe = AndroidUtilities.translitSafe(str11);
                String i21 = sc.v.i(" ", translitSafe);
                if (stickerSets != null) {
                    for (int i22 = 0; i22 < stickerSets.size(); i22++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i22);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title);
                            if (translitSafe2.startsWith(translitSafe) || translitSafe2.contains(i21)) {
                                arrayList4.add(new h71(translitSafe2));
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
                            if (translitSafe3.startsWith(translitSafe) || translitSafe3.contains(i21)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i20).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                    arrayList = stickerSet3 != null ? stickerSet3.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList4.add(new h71(stickerSetCovered.set.title));
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
                k71 k71Var2 = (k71) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.Components.s5.h(k71Var2.V).f(arrayList5);
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
