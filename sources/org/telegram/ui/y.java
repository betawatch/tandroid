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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0765 A[SYNTHETIC] */
    @Override // org.telegram.messenger.c20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Uri uri;
        Intent intent;
        int i7;
        int i10;
        BufferedReader bufferedReader;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i11 = 2;
        int i12 = 3;
        String str = null;
        boolean z9 = true;
        int i13 = 0;
        switch (this.a) {
            case 0:
                g4 g4Var = (g4) this.b;
                k3 k3Var = (k3) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && k3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    org.telegram.messenger.g0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i14 = 0;
                    for (int i15 = 0; i15 < uRLSpanArr.length; i15++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i14 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i14);
                    }
                    g4Var.h0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str2);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length <= 0 || length != 0 || i14 <= 0) && (uri == null || uri.getScheme() == null)) {
                        org.telegram.ui.web.j.b(activity, str2);
                        org.telegram.ui.web.u0 webView = k3Var.getWebView();
                        String str3 = org.telegram.ui.web.f1.a().b;
                        if (str3 != null) {
                            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str3);
                            m10.append(URLEncoder.encode(str2));
                            str = m10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str2 = vf.c.w(uri, "https", null, uri.getEncodedPath(), "/");
                        }
                        k3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                g4 g4Var2 = (g4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                org.telegram.messenger.qp.s1(g4Var2.X).p(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    org.telegram.messenger.qp.s1(g4Var2.X).p(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.I1 = new a0(g4Var2, 8);
                    break;
                } else {
                    g4Var2.a0();
                    break;
                }
            case 2:
                an anVar = (an) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (anVar.getParentActivity() != null) {
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
                        i7 = 2;
                    } else {
                        TLRPC.User f10 = anVar.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e10) {
                            e = e10;
                            i7 = i11;
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ms msVar = new ms();
                                msVar.a = split[i11];
                                String str7 = split[0];
                                msVar.c = str7;
                                i7 = i11;
                                try {
                                    msVar.d = split[1];
                                    List list = (List) hashMap.get(str7);
                                    if (list == null) {
                                        String str8 = split[0];
                                        list = new ArrayList();
                                        hashMap.put(str8, list);
                                    }
                                    list.add(msVar);
                                    i11 = i7;
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            } else {
                                i7 = i11;
                                bufferedReader.close();
                                String str9 = f10.phone;
                                i10 = 4;
                                while (true) {
                                    if (i10 >= 1) {
                                        List list2 = (List) hashMap.get(str9.substring(0, i10));
                                        if (list2 == null || list2.size() <= 0) {
                                            i10--;
                                        } else {
                                            String str10 = ((ms) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a8.p0.p("+", str10, str6);
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
                                    str6 = a8.p0.p("+", upperCase, str6);
                                }
                            }
                            e = e11;
                            org.telegram.messenger.a8.g(e, true);
                            String str92 = f10.phone;
                            i10 = 4;
                            while (true) {
                                if (i10 >= 1) {
                                }
                                i10--;
                            }
                            if (i13 == 0) {
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", Integer.valueOf(i7));
                    arrayList2.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList2);
                    anVar.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 3:
                an anVar2 = (an) this.b;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) this.c;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) this.d;
                Long l10 = (Long) obj;
                if (djVar != null) {
                    anVar2.getClass();
                    ArrayList arrayList3 = djVar.d;
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        if (!anVar2.getSendMessagesHelper().k0(l10.longValue(), (org.telegram.messenger.ij) arrayList3.get(i16), false)) {
                            z9 = false;
                        }
                    }
                    if (z9 && anVar2.f4 == 0) {
                        anVar2.oa(false);
                        break;
                    }
                } else if (anVar2.getSendMessagesHelper().k0(l10.longValue(), ijVar, false)) {
                    anVar2.Cd(false);
                    if (anVar2.f4 == 0) {
                        anVar2.oa(false);
                        break;
                    }
                }
                break;
            case 4:
                an.n1((an) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                lm lmVar = (lm) this.b;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) this.c;
                vl vlVar = (vl) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    vlVar.run();
                    break;
                } else {
                    an anVar3 = lmVar.a;
                    int D0 = ijVar2.D0();
                    TLRPC.MessageMedia o12 = org.telegram.messenger.ij.o1(ijVar2.k);
                    if (o12 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) o12).game_outcome;
                    }
                    org.telegram.messenger.voip.k kVar = new org.telegram.messenger.voip.k(17, lmVar, ijVar2);
                    int i17 = t31.V1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.qp.s1(anVar3.getCurrentAccount()).w8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(anVar3.getContext(), anVar3.getResourceProvider());
                        kbVar.a.setScaleX(1.25f);
                        kbVar.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            kbVar.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            kbVar.a.setImageResource(R.drawable.dice2);
                        } else if (D0 == 3) {
                            kbVar.a.setImageResource(R.drawable.dice3);
                        } else if (D0 == 4) {
                            kbVar.a.setImageResource(R.drawable.dice4);
                        } else if (D0 == 5) {
                            kbVar.a.setImageResource(R.drawable.dice5);
                        } else if (D0 == 6) {
                            kbVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            kbVar.a.setScaleX(0.8f);
                            kbVar.a.setScaleY(0.8f);
                            kbVar.a.setImageDrawable(org.telegram.messenger.i6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131745237, null));
                        spannableStringBuilder2.append((CharSequence) bi.dd.P0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.kc.b(org.telegram.messenger.hd.M0(2131745235, null), new by0(10, anVar3, kVar), anVar3.getResourceProvider(), null));
                        org.telegram.messenger.g0.E2(kbVar.b);
                        org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(anVar3.getContext());
                        kbVar.b = jcVar;
                        jcVar.setSingleLine();
                        kbVar.b.setTypeface(Typeface.SANS_SERIF);
                        kbVar.b.setTextSize(1, 15.0f);
                        kbVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        kbVar.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        kbVar.addView(kbVar.b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        kbVar.b.setText(bi.dd.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.r6.H(kbVar.b, org.telegram.ui.ActionBar.k6.uj, anVar3.getResourceProvider());
                        kbVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, anVar3.getResourceProvider()));
                        kbVar.b.setSingleLine(false);
                        kbVar.b.setMaxLines(2);
                        org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(anVar3.getContext(), anVar3.getResourceProvider(), true);
                        acVar.e(org.telegram.messenger.hd.M0(2131745236, null));
                        acVar.b = new p31(kVar, j3, i13);
                        kbVar.setButton(acVar);
                        org.telegram.ui.Components.hc.a0(anVar3).b(kbVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                lm lmVar2 = (lm) this.b;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                u1Var.c(200L);
                an anVar4 = lmVar2.a;
                boolean z10 = ((org.telegram.messenger.h0) anVar4.getMessagesController().x7.m.b).c && !TextUtils.isEmpty(anVar4.getMessagesController().u6);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(anVar4.getParentActivity());
                if (z10) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, anVar4.getParentActivity(), anVar4.getResourceProvider());
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    c2Var.e(org.telegram.messenger.hd.M0(2131748481, null), "", zArr[0], false, false);
                    c2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    frameLayout.addView(c2Var, c8.ha.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    c2Var.setOnClickListener(new j8(i12, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar4.getParentActivity(), anVar4.getResourceProvider());
                alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131748472, null);
                alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(objArr != false ? 2131748474 : 2131748475, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.G = 9;
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(objArr != false ? 2131748473 : 2131752589, null), null);
                if (objArr == false) {
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748480, null), new yl(lmVar2, q1Var, zArr, z10, contentsettings));
                }
                anVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                ww.i0((ww) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                ww wwVar = (ww) this.b;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) this.c;
                Long l11 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                u1Var2.r(150L);
                Boolean bool3 = wwVar.G.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    wwVar.getMessagesController().m(l11.longValue(), wwVar.getMessagesController().a2(Long.valueOf(wwVar.H)), 0, null, wwVar, false, runnable, new ve(i12, runnable), null);
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                vf.b bVar = (vf.b) this.c;
                int[] iArr = (int[]) this.d;
                Long l12 = (Long) obj;
                String str11 = LaunchActivity.B1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if ((l12 != null ? org.telegram.messenger.qp.s1(launchActivity.O).e2(l12.longValue()) : null) != null) {
                    new zh.h1(launchActivity, iArr[0], l12.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof an)) {
                        ((an) Q).Tb();
                        break;
                    }
                }
                break;
            case 10:
                p90 p90Var = (p90) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.kn0 kn0Var = (org.telegram.ui.Components.kn0) this.d;
                Long l13 = (Long) obj;
                TLRPC.User a22 = l13 == null ? null : org.telegram.messenger.qp.s1(p90Var.b).a2(l13);
                userArr[0] = a22;
                if (a22 == null) {
                    p90Var.c();
                    org.telegram.messenger.k5.p(null, 2131748133, p90.d(), null);
                    break;
                } else {
                    kn0Var.run();
                    break;
                }
            case 11:
                xw0 xw0Var = (xw0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = q11.k(tL_messages_stickerSet, num + "️⃣");
                    if (k10 == null) {
                        k10 = q11.k(tL_messages_stickerSet, num + "⃣");
                    }
                    if (k10 == null) {
                        String[] strArr = ax0.s;
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
                    zw0 zw0Var = new zw0(null);
                    xw0Var.e.add(zw0Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    zw0Var.g1 = new yw0(new Runnable[]{new qn0(29, xw0Var, zw0Var)});
                    zw0Var.q0(org.telegram.messenger.hc.b(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    zw0Var.P();
                    hashMap3.put(num2, zw0Var);
                }
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    Integer num3 = (Integer) arrayList4.get(i18);
                    num3.getClass();
                    xw0Var.d.add((zw0) hashMap3.get(num3));
                }
                xw0Var.g[0] = true;
                xw0Var.a();
                break;
            case 12:
                q11 q11Var = (q11) this.b;
                String str12 = (String) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i19 = q11Var.V;
                ArrayList s02 = org.telegram.messenger.ui.b0(i19).s0(5);
                HashSet hashSet2 = new HashSet();
                String O3 = org.telegram.messenger.g0.O3(str12);
                String concat = " ".concat(O3);
                if (s02 != null) {
                    for (int i20 = 0; i20 < s02.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String O32 = org.telegram.messenger.g0.O3(tL_messages_stickerSet2.set.title);
                            if (O32.startsWith(O3) || O32.contains(concat)) {
                                arrayList5.add(new n11(O32));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList6 = org.telegram.messenger.ui.b0(i19).s0[1];
                if (arrayList6 != null) {
                    while (i13 < arrayList6.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList6.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String O33 = org.telegram.messenger.g0.O3(stickerSetCovered.set.title);
                            if (O33.startsWith(O3) || O33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i19).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    arrayList = l02 != null ? l02.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList5.add(new n11(stickerSetCovered.set.title));
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
                q11 q11Var2 = (q11) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.i5.g(q11Var2.V).f(arrayList7);
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
