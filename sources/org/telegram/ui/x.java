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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.messenger.w10 {
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
    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        Uri uri;
        Intent intent;
        boolean z10;
        BufferedReader bufferedReader;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.StickerSet stickerSet2;
        int i7 = 8;
        int i10 = 3;
        int i11 = 5;
        String str = null;
        int i12 = 1;
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
                        String str3 = org.telegram.ui.web.e1.a().b;
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
                org.telegram.messenger.mp.u1(g4Var2.Y).p(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    org.telegram.messenger.mp.u1(g4Var2.Y).p(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.J1 = new z(g4Var2, i7);
                    break;
                } else {
                    g4Var2.a0();
                    break;
                }
            case 2:
                bn bnVar = (bn) this.b;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                Long l10 = (Long) obj;
                if (ajVar != null) {
                    bnVar.getClass();
                    ArrayList arrayList2 = ajVar.d;
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        if (!bnVar.getSendMessagesHelper().k0(l10.longValue(), (org.telegram.messenger.fj) arrayList2.get(i16), false)) {
                            i12 = 0;
                        }
                    }
                    if (i12 != 0 && bnVar.g4 == 0) {
                        bnVar.ra(false);
                        break;
                    }
                } else if (bnVar.getSendMessagesHelper().k0(l10.longValue(), fjVar, false)) {
                    bnVar.Gd(false);
                    if (bnVar.g4 == 0) {
                        bnVar.ra(false);
                        break;
                    }
                }
                break;
            case 3:
                bn bnVar2 = (bn) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (bnVar2.getParentActivity() != null) {
                    if (bool2.booleanValue()) {
                        intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                    } else {
                        intent = new Intent("android.intent.action.INSERT_OR_EDIT");
                        intent.setType("vnd.android.cursor.item/contact");
                    }
                    if (user != null) {
                        intent.putExtra("name", org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (!str6.startsWith("+")) {
                        TLRPC.User f10 = bnVar2.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.t0.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ps psVar = new ps();
                                psVar.a = split[2];
                                String str7 = split[0];
                                psVar.c = str7;
                                psVar.d = split[1];
                                List list = (List) hashMap.get(str7);
                                if (list == null) {
                                    String str8 = split[0];
                                    ArrayList arrayList4 = new ArrayList();
                                    hashMap.put(str8, arrayList4);
                                    list = arrayList4;
                                }
                                list.add(psVar);
                            } else {
                                bufferedReader.close();
                                String str9 = f10.phone;
                                int i17 = 4;
                                while (true) {
                                    if (i17 >= 1) {
                                        List list2 = (List) hashMap.get(str9.substring(0, i17));
                                        if (list2 == null || list2.size() <= 0) {
                                            i17--;
                                        } else {
                                            String str10 = ((ps) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a8.p0.p("+", str10, str6);
                                            z10 = true;
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                }
                                if (!z10) {
                                    Context context = org.telegram.messenger.t0.b;
                                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                                    if (upperCase.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a8.p0.p("+", upperCase, str6);
                                }
                            }
                        }
                    }
                    contentValues.put("data1", str6);
                    contentValues.put("data2", (Integer) 2);
                    arrayList3.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList3);
                    bnVar2.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 4:
                bn.q1((bn) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                mm mmVar = (mm) this.b;
                org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) this.c;
                wl wlVar = (wl) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    wlVar.run();
                    break;
                } else {
                    bn bnVar3 = mmVar.a;
                    int D0 = fjVar2.D0();
                    TLRPC.MessageMedia n1 = org.telegram.messenger.fj.n1(fjVar2.k);
                    if (n1 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome;
                    }
                    ki.n2 n2Var = new ki.n2(22, mmVar, fjVar2);
                    int i18 = t31.Z1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.mp.u1(bnVar3.getCurrentAccount()).C8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(bnVar3.getContext(), bnVar3.getResourceProvider());
                        nbVar.a.setScaleX(1.25f);
                        nbVar.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            nbVar.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            nbVar.a.setImageResource(R.drawable.dice2);
                        } else if (D0 == 3) {
                            nbVar.a.setImageResource(R.drawable.dice3);
                        } else if (D0 == 4) {
                            nbVar.a.setImageResource(R.drawable.dice4);
                        } else if (D0 == 5) {
                            nbVar.a.setImageResource(R.drawable.dice5);
                        } else if (D0 == 6) {
                            nbVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            nbVar.a.setScaleX(0.8f);
                            nbVar.a.setScaleY(0.8f);
                            nbVar.a.setImageDrawable(org.telegram.messenger.j6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131744995, null));
                        spannableStringBuilder2.append((CharSequence) di.pb.P0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.nc.b(org.telegram.messenger.gd.N0(2131744993, null), new iy0(i7, bnVar3, n2Var), bnVar3.getResourceProvider(), null));
                        org.telegram.messenger.g0.E2(nbVar.b);
                        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(bnVar3.getContext());
                        nbVar.b = mcVar;
                        mcVar.setSingleLine();
                        nbVar.b.setTypeface(Typeface.SANS_SERIF);
                        nbVar.b.setTextSize(1, 15.0f);
                        nbVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        nbVar.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        nbVar.addView(nbVar.b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        nbVar.b.setText(di.pb.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.u6.G(nbVar.b, org.telegram.ui.ActionBar.n6.xj, bnVar3.getResourceProvider());
                        nbVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, bnVar3.getResourceProvider()));
                        nbVar.b.setSingleLine(false);
                        nbVar.b.setMaxLines(2);
                        org.telegram.ui.Components.dc dcVar = new org.telegram.ui.Components.dc(bnVar3.getContext(), bnVar3.getResourceProvider(), true);
                        dcVar.e(org.telegram.messenger.gd.N0(2131744994, null));
                        dcVar.b = new ox0(n2Var, j3, i12);
                        nbVar.setButton(dcVar);
                        org.telegram.ui.Components.kc.b0(bnVar3).b(nbVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                mm mmVar2 = (mm) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                t1Var.c(200L);
                bn bnVar4 = mmVar2.a;
                boolean z11 = ((org.telegram.messenger.h0) bnVar4.getMessagesController().A7.m.b).c && !TextUtils.isEmpty(bnVar4.getMessagesController().x6);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(bnVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, bnVar4.getParentActivity(), bnVar4.getResourceProvider());
                    d2Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
                    d2Var.e(org.telegram.messenger.gd.N0(2131748289, null), "", zArr[0], false, false);
                    d2Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    frameLayout.addView(d2Var, c8.na.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    d2Var.setOnClickListener(new l8(i10, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar4.getParentActivity(), bnVar4.getResourceProvider());
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131748280, null);
                alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(objArr != false ? 2131748282 : 2131748283, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.H = 9;
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(objArr != false ? 2131748281 : 2131752577, null), null);
                if (objArr == false) {
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748288, null), new zl(mmVar2, r1Var, zArr, z11, contentsettings));
                }
                bnVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                bx.J0((bx) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                bx bxVar = (bx) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                Long l11 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                t1Var2.r(150L);
                Boolean bool3 = bxVar.H.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    bxVar.getMessagesController().m(l11.longValue(), bxVar.getMessagesController().c2(Long.valueOf(bxVar.I)), 0, null, bxVar, false, runnable, new ve(i11, runnable), null);
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
                if ((l12 != null ? org.telegram.messenger.mp.u1(launchActivity.P).g2(l12.longValue()) : null) != null) {
                    new bi.p3(launchActivity, iArr[0], l12.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof bn)) {
                        ((bn) Q).Xb();
                        break;
                    }
                }
                break;
            case 10:
                r90 r90Var = (r90) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.xz xzVar = (org.telegram.ui.Components.xz) this.d;
                Long l13 = (Long) obj;
                TLRPC.User c22 = l13 == null ? null : org.telegram.messenger.mp.u1(r90Var.b).c2(l13);
                userArr[0] = c22;
                if (c22 == null) {
                    r90Var.c();
                    org.telegram.messenger.f3.o(null, 2131747941, r90.d(), null);
                    break;
                } else {
                    xzVar.run();
                    break;
                }
            case 11:
                yw0 yw0Var = (yw0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
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
                        String[] strArr = bx0.s;
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
                    ax0 ax0Var = new ax0(null);
                    yw0Var.e.add(ax0Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    ax0Var.h1 = new zw0(new Runnable[]{new mp0(27, yw0Var, ax0Var)});
                    ax0Var.r0(org.telegram.messenger.fc.b(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    ax0Var.Q();
                    hashMap3.put(num2, ax0Var);
                }
                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                    Integer num3 = (Integer) arrayList5.get(i19);
                    num3.getClass();
                    yw0Var.d.add((ax0) hashMap3.get(num3));
                }
                yw0Var.g[0] = true;
                yw0Var.a();
                break;
            case 12:
                q11 q11Var = (q11) this.b;
                String str12 = (String) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i20 = q11Var.W;
                ArrayList u02 = org.telegram.messenger.ri.d0(i20).u0(5);
                HashSet hashSet2 = new HashSet();
                String M3 = org.telegram.messenger.g0.M3(str12);
                String concat = " ".concat(M3);
                if (u02 != null) {
                    for (int i21 = 0; i21 < u02.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) u02.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet2.set.title);
                            if (M32.startsWith(M3) || M32.contains(concat)) {
                                arrayList6.add(new n11(M32));
                                arrayList6.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList7 = org.telegram.messenger.ri.d0(i20).t0[1];
                if (arrayList7 != null) {
                    while (i13 < arrayList7.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList7.get(i13);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title);
                            if (M33.startsWith(M3) || M33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i20).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    arrayList = n02 != null ? n02.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList6.add(new n11(stickerSetCovered.set.title));
                                    arrayList6.addAll(arrayList);
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
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.Components.o5.g(q11Var2.W).f(arrayList8);
                int size = arrayList8.size();
                while (i13 < size) {
                    Object obj2 = arrayList8.get(i13);
                    i13++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj2).id));
                }
                runnable3.run();
                break;
        }
    }
}
