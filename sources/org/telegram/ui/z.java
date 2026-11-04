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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0763 A[SYNTHETIC] */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Uri uri;
        Intent intent;
        int i3;
        int i10;
        BufferedReader bufferedReader;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i11 = 3;
        int i12 = 4;
        String str = null;
        boolean z10 = true;
        int i13 = 0;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                l3 l3Var = (l3) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && l3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    i4Var.i0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str2);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length <= 0 || length != 0 || i14 <= 0) && (uri == null || uri.getScheme() == null)) {
                        org.telegram.ui.web.l.b(activity, str2);
                        org.telegram.ui.web.t0 webView = l3Var.getWebView();
                        String str3 = org.telegram.ui.web.d1.a().b;
                        if (str3 != null) {
                            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str3);
                            l10.append(URLEncoder.encode(str2));
                            str = l10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str2 = sf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        l3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                i4 i4Var2 = (i4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                org.telegram.messenger.hp.s1(i4Var2.Y).p(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    org.telegram.messenger.hp.s1(i4Var2.Y).p(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.M1 = new b0(i4Var2, 8);
                    break;
                } else {
                    i4Var2.a0();
                    break;
                }
            case 2:
                wm wmVar = (wm) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (wmVar.getParentActivity() != null) {
                    if (bool2.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    if (user != null) {
                        intent.putExtra("name", org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (str6.startsWith("+")) {
                        i3 = 2;
                    } else {
                        TLRPC.User f10 = wmVar.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            i3 = 2;
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
                            } catch (Exception e10) {
                                e = e10;
                                org.telegram.messenger.a8.g(e, true);
                                String str7 = f10.phone;
                                i10 = 4;
                                while (true) {
                                    if (i10 >= 1) {
                                    }
                                    i10--;
                                }
                                if (i13 == 0) {
                                }
                                contentValues.put("data1", str6);
                                contentValues.put("data2", Integer.valueOf(i3));
                                arrayList2.add(contentValues);
                                intent.putExtra("finishActivityOnSaveCompleted", true);
                                intent.putParcelableArrayListExtra("data", arrayList2);
                                wmVar.getParentActivity().startActivity(intent);
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i3 = 2;
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ks ksVar = new ks();
                                ksVar.a = split[2];
                                String str8 = split[0];
                                ksVar.c = str8;
                                ksVar.d = split[1];
                                List list = (List) hashMap.get(str8);
                                if (list == null) {
                                    String str9 = split[0];
                                    list = new ArrayList();
                                    hashMap.put(str9, list);
                                }
                                list.add(ksVar);
                            } else {
                                bufferedReader.close();
                                String str72 = f10.phone;
                                i10 = 4;
                                while (true) {
                                    if (i10 >= 1) {
                                        List list2 = (List) hashMap.get(str72.substring(0, i10));
                                        if (list2 == null || list2.size() <= 0) {
                                            i10--;
                                        } else {
                                            String str10 = ((ks) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a1.g.q("+", str10, str6);
                                            i13 = 1;
                                        }
                                    }
                                }
                                if (i13 == 0) {
                                    Context context = org.telegram.messenger.t0.b;
                                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                                    if (upperCase.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a1.g.q("+", upperCase, str6);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", Integer.valueOf(i3));
                    arrayList2.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList2);
                    wmVar.getParentActivity().startActivity(intent);
                }
                break;
            case 3:
                wm wmVar2 = (wm) this.b;
                org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) this.c;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.d;
                Long l11 = (Long) obj;
                if (uiVar != null) {
                    wmVar2.getClass();
                    ArrayList arrayList3 = uiVar.d;
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (!wmVar2.getSendMessagesHelper().k0(l11.longValue(), (org.telegram.messenger.zi) arrayList3.get(i16), false)) {
                            z10 = false;
                        }
                    }
                    if (z10 && wmVar2.g4 == 0) {
                        wmVar2.oa(false);
                        break;
                    }
                } else if (wmVar2.getSendMessagesHelper().k0(l11.longValue(), ziVar, false)) {
                    wmVar2.Cd(false);
                    if (wmVar2.g4 == 0) {
                        wmVar2.oa(false);
                        break;
                    }
                }
                break;
            case 4:
                wm.n1((wm) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                hm hmVar = (hm) this.b;
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) this.c;
                rl rlVar = (rl) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    rlVar.run();
                    break;
                } else {
                    wm wmVar3 = hmVar.a;
                    int D0 = ziVar2.D0();
                    TLRPC.MessageMedia o12 = org.telegram.messenger.zi.o1(ziVar2.k);
                    if (o12 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) o12).game_outcome;
                    }
                    mi.f fVar = new mi.f(21, hmVar, ziVar2);
                    int i17 = j31.W1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.hp.s1(wmVar3.getCurrentAccount()).w8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(wmVar3.getContext(), wmVar3.getResourceProvider());
                        ibVar.a.setScaleX(1.25f);
                        ibVar.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            ibVar.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            ibVar.a.setImageResource(R.drawable.dice2);
                        } else if (D0 == 3) {
                            ibVar.a.setImageResource(R.drawable.dice3);
                        } else if (D0 == 4) {
                            ibVar.a.setImageResource(R.drawable.dice4);
                        } else if (D0 == 5) {
                            ibVar.a.setImageResource(R.drawable.dice5);
                        } else if (D0 == 6) {
                            ibVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            ibVar.a.setScaleX(0.8f);
                            ibVar.a.setScaleY(0.8f);
                            ibVar.a.setImageDrawable(org.telegram.messenger.i6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131745246, null));
                        spannableStringBuilder2.append((CharSequence) ci.wb.P0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.ic.b(org.telegram.messenger.bd.M0(2131745244, null), new qv0(15, wmVar3, fVar), wmVar3.getResourceProvider(), null));
                        org.telegram.messenger.g0.E2(ibVar.b);
                        org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(wmVar3.getContext());
                        ibVar.b = hcVar;
                        hcVar.setSingleLine();
                        ibVar.b.setTypeface(Typeface.SANS_SERIF);
                        ibVar.b.setTextSize(1, 15.0f);
                        ibVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        ibVar.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        ibVar.addView(ibVar.b, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ibVar.b.setText(ci.wb.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.r6.H(ibVar.b, org.telegram.ui.ActionBar.k6.uj, wmVar3.getResourceProvider());
                        ibVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, wmVar3.getResourceProvider()));
                        ibVar.b.setSingleLine(false);
                        ibVar.b.setMaxLines(2);
                        org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(wmVar3.getContext(), wmVar3.getResourceProvider(), true);
                        ybVar.e(org.telegram.messenger.bd.M0(2131745245, null));
                        ybVar.b = new f31(fVar, j10, 0);
                        ibVar.setButton(ybVar);
                        org.telegram.ui.Components.fc.a0(wmVar3).b(ibVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                hm hmVar2 = (hm) this.b;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                s1Var.c(200L);
                wm wmVar4 = hmVar2.a;
                boolean z11 = ((org.telegram.messenger.h0) wmVar4.getMessagesController().x7.m.b).c && !TextUtils.isEmpty(wmVar4.getMessagesController().u6);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(wmVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, wmVar4.getParentActivity(), wmVar4.getResourceProvider());
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    c2Var.e(org.telegram.messenger.bd.M0(2131748490, null), "", zArr[0], false, false);
                    c2Var.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    frameLayout.addView(c2Var, b8.mf.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    c2Var.setOnClickListener(new k8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar4.getParentActivity(), wmVar4.getResourceProvider());
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131748481, null);
                alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(objArr != false ? 2131748483 : 2131748484, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.H = 9;
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(objArr != false ? 2131748482 : 2131752589, null), null);
                if (objArr == false) {
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131748489, null), new ul(hmVar2, q1Var, zArr, z11, contentsettings));
                }
                wmVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                uw.i0((uw) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                uw uwVar = (uw) this.b;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) this.c;
                Long l12 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                s1Var2.r(150L);
                Boolean bool3 = uwVar.H.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    uwVar.getMessagesController().m(l12.longValue(), uwVar.getMessagesController().a2(Long.valueOf(uwVar.I)), 0, null, uwVar, false, runnable, new se(i11, runnable), null);
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                sf.b bVar = (sf.b) this.c;
                int[] iArr = (int[]) this.d;
                Long l13 = (Long) obj;
                String str11 = LaunchActivity.E1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if ((l13 != null ? org.telegram.messenger.hp.s1(launchActivity.P).e2(l13.longValue()) : null) != null) {
                    new ai.b3(launchActivity, iArr[0], l13.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof wm)) {
                        ((wm) Q).Tb();
                        break;
                    }
                }
                break;
            case 10:
                m90 m90Var = (m90) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.v60 v60Var = (org.telegram.ui.Components.v60) this.d;
                Long l14 = (Long) obj;
                TLRPC.User a22 = l14 == null ? null : org.telegram.messenger.hp.s1(m90Var.b).a2(l14);
                userArr[0] = a22;
                if (a22 == null) {
                    m90Var.c();
                    org.telegram.messenger.k5.p(null, 2131748142, m90.d(), null);
                    break;
                } else {
                    v60Var.run();
                    break;
                }
            case 11:
                pw0 pw0Var = (pw0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = g11.k(tL_messages_stickerSet, num + "️⃣");
                    if (k10 == null) {
                        k10 = g11.k(tL_messages_stickerSet, num + "⃣");
                    }
                    if (k10 == null) {
                        String[] strArr = sw0.s;
                        org.telegram.messenger.a8.d("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        break;
                    } else {
                        hashMap2.put(num, k10);
                    }
                }
                HashMap hashMap3 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    rw0 rw0Var = new rw0(null);
                    pw0Var.e.add(rw0Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    rw0Var.h1 = new qw0(new Runnable[]{new qv0(i12, pw0Var, rw0Var)});
                    rw0Var.q0(org.telegram.messenger.ac.b(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    rw0Var.P();
                    hashMap3.put(num2, rw0Var);
                }
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    Integer num3 = (Integer) arrayList4.get(i18);
                    num3.getClass();
                    pw0Var.d.add((rw0) hashMap3.get(num3));
                }
                pw0Var.g[0] = true;
                pw0Var.a();
                break;
            case 12:
                g11 g11Var = (g11) this.b;
                String str12 = (String) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i19 = g11Var.W;
                ArrayList s02 = org.telegram.messenger.li.b0(i19).s0(5);
                HashSet hashSet2 = new HashSet();
                String O3 = org.telegram.messenger.g0.O3(str12);
                String concat = " ".concat(O3);
                if (s02 != null) {
                    for (int i20 = 0; i20 < s02.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet2.set.title);
                            if (O32.startsWith(O3) || O32.contains(concat)) {
                                arrayList5.add(new d11(O32));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList6 = org.telegram.messenger.li.b0(i19).t0[1];
                if (arrayList6 != null) {
                    while (i13 < arrayList6.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList6.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title);
                            if (O33.startsWith(O3) || O33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i19).l0(org.telegram.messenger.li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    arrayList = l02 != null ? l02.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList5.add(new d11(stickerSetCovered.set.title));
                                    arrayList5.addAll(arrayList);
                                    hashSet2.add(Long.valueOf(stickerSetCovered.set.id));
                                }
                            }
                        }
                        i13++;
                    }
                }
                runnable2.run();
                break;
            default:
                g11 g11Var2 = (g11) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.g5.g(g11Var2.W).f(arrayList7);
                int size = arrayList7.size();
                while (i13 < size) {
                    Object obj2 = arrayList7.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj2).id));
                }
                runnable3.run();
                break;
        }
    }
}
