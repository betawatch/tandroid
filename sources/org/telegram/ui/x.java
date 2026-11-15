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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x070b A[SYNTHETIC] */
    @Override // org.telegram.messenger.z10
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
        boolean z10 = true;
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
                    g4Var.i0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str2);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length <= 0 || length != 0 || i14 <= 0) && (uri == null || uri.getScheme() == null)) {
                        org.telegram.ui.web.k.b(activity, str2);
                        org.telegram.ui.web.s0 webView = k3Var.getWebView();
                        String str3 = org.telegram.ui.web.d1.a().b;
                        if (str3 != null) {
                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(str3);
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
                org.telegram.messenger.np.s1(g4Var2.Y).p(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    org.telegram.messenger.np.s1(g4Var2.Y).p(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.J1 = new z(g4Var2, 8);
                    break;
                } else {
                    g4Var2.a0();
                    break;
                }
            case 2:
                an anVar = (an) this.b;
                org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) this.c;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) this.d;
                Long l10 = (Long) obj;
                if (bjVar != null) {
                    anVar.getClass();
                    ArrayList arrayList2 = bjVar.d;
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        if (!anVar.getSendMessagesHelper().k0(l10.longValue(), (org.telegram.messenger.gj) arrayList2.get(i16), false)) {
                            z10 = false;
                        }
                    }
                    if (z10 && anVar.g4 == 0) {
                        anVar.ra(false);
                        break;
                    }
                } else if (anVar.getSendMessagesHelper().k0(l10.longValue(), gjVar, false)) {
                    anVar.Gd(false);
                    if (anVar.g4 == 0) {
                        anVar.ra(false);
                        break;
                    }
                }
                break;
            case 3:
                an anVar2 = (an) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (anVar2.getParentActivity() != null) {
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
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (str6.startsWith("+")) {
                        i7 = 2;
                    } else {
                        TLRPC.User f10 = anVar2.getUserConfig().f();
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
                                ps psVar = new ps();
                                psVar.a = split[i11];
                                String str7 = split[0];
                                psVar.c = str7;
                                i7 = i11;
                                try {
                                    psVar.d = split[1];
                                    List list = (List) hashMap.get(str7);
                                    if (list == null) {
                                        String str8 = split[0];
                                        list = new ArrayList();
                                        hashMap.put(str8, list);
                                    }
                                    list.add(psVar);
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
                                            String str10 = ((ps) list2.get(0)).c;
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
                    arrayList3.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList3);
                    anVar2.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 4:
                an.q1((an) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                lm lmVar = (lm) this.b;
                org.telegram.messenger.gj gjVar2 = (org.telegram.messenger.gj) this.c;
                vl vlVar = (vl) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    vlVar.run();
                    break;
                } else {
                    an anVar3 = lmVar.a;
                    int D0 = gjVar2.D0();
                    TLRPC.MessageMedia n1 = org.telegram.messenger.gj.n1(gjVar2.k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    li.v vVar = new li.v(22, lmVar, gjVar2);
                    int i17 = r31.Z1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.np.s1(anVar3.getCurrentAccount()).x8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(anVar3.getContext(), anVar3.getResourceProvider());
                        fbVar.a.setScaleX(1.25f);
                        fbVar.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            fbVar.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            fbVar.a.setImageResource(R.drawable.dice2);
                        } else if (D0 == 3) {
                            fbVar.a.setImageResource(R.drawable.dice3);
                        } else if (D0 == 4) {
                            fbVar.a.setImageResource(R.drawable.dice4);
                        } else if (D0 == 5) {
                            fbVar.a.setImageResource(R.drawable.dice5);
                        } else if (D0 == 6) {
                            fbVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            fbVar.a.setScaleX(0.8f);
                            fbVar.a.setScaleY(0.8f);
                            fbVar.a.setImageDrawable(org.telegram.messenger.j6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131745236, null));
                        spannableStringBuilder2.append((CharSequence) di.mb.P0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.fc.b(org.telegram.messenger.hd.M0(2131745234, null), new fy0(7, anVar3, vVar), anVar3.getResourceProvider(), null));
                        org.telegram.messenger.g0.E2(fbVar.b);
                        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(anVar3.getContext());
                        fbVar.b = ecVar;
                        ecVar.setSingleLine();
                        fbVar.b.setTypeface(Typeface.SANS_SERIF);
                        fbVar.b.setTextSize(1, 15.0f);
                        fbVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        fbVar.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        fbVar.addView(fbVar.b, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        fbVar.b.setText(di.mb.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.q6.G(fbVar.b, org.telegram.ui.ActionBar.j6.xj, anVar3.getResourceProvider());
                        fbVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, anVar3.getResourceProvider()));
                        fbVar.b.setSingleLine(false);
                        fbVar.b.setMaxLines(2);
                        org.telegram.ui.Components.vb vbVar = new org.telegram.ui.Components.vb(anVar3.getContext(), anVar3.getResourceProvider(), true);
                        vbVar.e(org.telegram.messenger.hd.M0(2131745235, null));
                        vbVar.b = new n31(vVar, j3, i13);
                        fbVar.setButton(vbVar);
                        org.telegram.ui.Components.cc.a0(anVar3).b(fbVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                lm lmVar2 = (lm) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                t1Var.c(200L);
                an anVar4 = lmVar2.a;
                boolean z11 = ((org.telegram.messenger.h0) anVar4.getMessagesController().y7.m.b).c && !TextUtils.isEmpty(anVar4.getMessagesController().v6);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(anVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, anVar4.getParentActivity(), anVar4.getResourceProvider());
                    c2Var.setBackground(org.telegram.ui.ActionBar.j6.N0(false));
                    c2Var.e(org.telegram.messenger.hd.M0(2131748482, null), "", zArr[0], false, false);
                    c2Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    frameLayout.addView(c2Var, c8.ja.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    c2Var.setOnClickListener(new k8(i12, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, anVar4.getParentActivity(), anVar4.getResourceProvider());
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131748473, null);
                alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(objArr != false ? 2131748475 : 2131748476, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.H = 9;
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(objArr != false ? 2131748474 : 2131752589, null), null);
                if (objArr == false) {
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131748481, null), new yl(lmVar2, q1Var, zArr, z11, contentsettings));
                }
                anVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                yw.i0((yw) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                yw ywVar = (yw) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                Long l11 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                t1Var2.r(150L);
                Boolean bool3 = ywVar.H.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    ywVar.getMessagesController().m(l11.longValue(), ywVar.getMessagesController().a2(Long.valueOf(ywVar.I)), 0, null, ywVar, false, runnable, new te(i12, runnable), null);
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                vf.b bVar = (vf.b) this.c;
                int[] iArr = (int[]) this.d;
                Long l12 = (Long) obj;
                String str11 = LaunchActivity.C1;
                launchActivity.getClass();
                if (bVar != null) {
                    bVar.b();
                }
                if ((l12 != null ? org.telegram.messenger.np.s1(launchActivity.P).e2(l12.longValue()) : null) != null) {
                    new bi.s2(launchActivity, iArr[0], l12.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof an)) {
                        ((an) Q).Xb();
                        break;
                    }
                }
                break;
            case 10:
                q90 q90Var = (q90) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.ma0 ma0Var = (org.telegram.ui.Components.ma0) this.d;
                Long l13 = (Long) obj;
                TLRPC.User a22 = l13 == null ? null : org.telegram.messenger.np.s1(q90Var.b).a2(l13);
                userArr[0] = a22;
                if (a22 == null) {
                    q90Var.c();
                    org.telegram.messenger.k5.o(null, 2131748134, q90.d(), null);
                    break;
                } else {
                    ma0Var.run();
                    break;
                }
            case 11:
                ww0 ww0Var = (ww0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = n11.k(tL_messages_stickerSet, num + "️⃣");
                    if (k10 == null) {
                        k10 = n11.k(tL_messages_stickerSet, num + "⃣");
                    }
                    if (k10 == null) {
                        String[] strArr = zw0.s;
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
                    yw0 yw0Var = new yw0(null);
                    ww0Var.e.add(yw0Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    yw0Var.h1 = new xw0(new Runnable[]{new mp0(26, ww0Var, yw0Var)});
                    yw0Var.q0(org.telegram.messenger.gc.b(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    yw0Var.P();
                    hashMap3.put(num2, yw0Var);
                }
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    Integer num3 = (Integer) arrayList4.get(i18);
                    num3.getClass();
                    ww0Var.d.add((yw0) hashMap3.get(num3));
                }
                ww0Var.g[0] = true;
                ww0Var.a();
                break;
            case 12:
                n11 n11Var = (n11) this.b;
                String str12 = (String) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i19 = n11Var.W;
                ArrayList s02 = org.telegram.messenger.si.b0(i19).s0(5);
                HashSet hashSet2 = new HashSet();
                String N3 = org.telegram.messenger.g0.N3(str12);
                String concat = " ".concat(N3);
                if (s02 != null) {
                    for (int i20 = 0; i20 < s02.size(); i20++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i20);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String N32 = org.telegram.messenger.g0.N3(tL_messages_stickerSet2.set.title);
                            if (N32.startsWith(N3) || N32.contains(concat)) {
                                arrayList5.add(new k11(N32));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList6 = org.telegram.messenger.si.b0(i19).t0[1];
                if (arrayList6 != null) {
                    while (i13 < arrayList6.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList6.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String N33 = org.telegram.messenger.g0.N3(stickerSetCovered.set.title);
                            if (N33.startsWith(N3) || N33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i19).l0(org.telegram.messenger.si.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    arrayList = l02 != null ? l02.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList5.add(new k11(stickerSetCovered.set.title));
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
                n11 n11Var2 = (n11) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.g5.g(n11Var2.W).f(arrayList7);
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
