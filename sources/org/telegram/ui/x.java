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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements org.telegram.messenger.x10 {
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
    /* JADX WARN: Removed duplicated region for block: B:238:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0706 A[SYNTHETIC] */
    @Override // org.telegram.messenger.x10
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
        int i11 = 3;
        int i12 = 4;
        int i13 = 5;
        String str = null;
        int i14 = 1;
        int i15 = 0;
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
                    int i16 = 0;
                    for (int i17 = 0; i17 < uRLSpanArr.length; i17++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i17]), length);
                        i16 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i17]), i16);
                    }
                    g4Var.i0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str2);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length <= 0 || length != 0 || i16 <= 0) && (uri == null || uri.getScheme() == null)) {
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
                    LaunchActivity.J1 = new z(g4Var2, 8);
                    break;
                } else {
                    g4Var2.a0();
                    break;
                }
                break;
            case 2:
                bn bnVar = (bn) this.b;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) this.c;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) this.d;
                Long l10 = (Long) obj;
                if (ajVar != null) {
                    bnVar.getClass();
                    ArrayList arrayList2 = ajVar.d;
                    for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                        if (!bnVar.getSendMessagesHelper().k0(l10.longValue(), (org.telegram.messenger.fj) arrayList2.get(i18), false)) {
                            i14 = 0;
                        }
                    }
                    if (i14 != 0 && bnVar.g4 == 0) {
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
                    if (str6.startsWith("+")) {
                        i7 = 2;
                    } else {
                        TLRPC.User f10 = bnVar2.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            i7 = 2;
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
                                if (i15 == 0) {
                                }
                                contentValues.put("data1", str6);
                                contentValues.put("data2", Integer.valueOf(i7));
                                arrayList3.add(contentValues);
                                intent.putExtra("finishActivityOnSaveCompleted", true);
                                intent.putParcelableArrayListExtra("data", arrayList3);
                                bnVar2.getParentActivity().startActivity(intent);
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i7 = 2;
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                ps psVar = new ps();
                                psVar.a = split[2];
                                String str8 = split[0];
                                psVar.c = str8;
                                psVar.d = split[1];
                                List list = (List) hashMap.get(str8);
                                if (list == null) {
                                    String str9 = split[0];
                                    list = new ArrayList();
                                    hashMap.put(str9, list);
                                }
                                list.add(psVar);
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
                                            String str10 = ((ps) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a8.p0.p("+", str10, str6);
                                            i15 = 1;
                                        }
                                    }
                                }
                                if (i15 == 0) {
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
                    contentValues.put("data2", Integer.valueOf(i7));
                    arrayList3.add(contentValues);
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    intent.putParcelableArrayListExtra("data", arrayList3);
                    bnVar2.getParentActivity().startActivity(intent);
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
                    li.d dVar = new li.d(21, mmVar, fjVar2);
                    int i19 = u31.Z1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.mp.u1(bnVar3.getCurrentAccount()).C8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j3 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(bnVar3.getContext(), bnVar3.getResourceProvider());
                        obVar.a.setScaleX(1.25f);
                        obVar.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            obVar.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            obVar.a.setImageResource(R.drawable.dice2);
                        } else if (D0 == 3) {
                            obVar.a.setImageResource(R.drawable.dice3);
                        } else if (D0 == 4) {
                            obVar.a.setImageResource(R.drawable.dice4);
                        } else if (D0 == 5) {
                            obVar.a.setImageResource(R.drawable.dice5);
                        } else if (D0 == 6) {
                            obVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            obVar.a.setScaleX(0.8f);
                            obVar.a.setScaleY(0.8f);
                            obVar.a.setImageDrawable(org.telegram.messenger.j6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131744995, null));
                        spannableStringBuilder2.append((CharSequence) di.pb.P0(j3));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.oc.b(org.telegram.messenger.gd.N0(2131744993, null), new mz0(i12, bnVar3, dVar), bnVar3.getResourceProvider(), null));
                        org.telegram.messenger.g0.E2(obVar.b);
                        org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(bnVar3.getContext());
                        obVar.b = ncVar;
                        ncVar.setSingleLine();
                        obVar.b.setTypeface(Typeface.SANS_SERIF);
                        obVar.b.setTextSize(1, 15.0f);
                        obVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        obVar.b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                        obVar.addView(obVar.b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        obVar.b.setText(di.pb.S0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.t6.G(obVar.b, org.telegram.ui.ActionBar.m6.xj, bnVar3.getResourceProvider());
                        obVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, bnVar3.getResourceProvider()));
                        obVar.b.setSingleLine(false);
                        obVar.b.setMaxLines(2);
                        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(bnVar3.getContext(), bnVar3.getResourceProvider(), true);
                        ecVar.e(org.telegram.messenger.gd.N0(2131744994, null));
                        ecVar.b = new qx0(dVar, j3, i14);
                        obVar.setButton(ecVar);
                        org.telegram.ui.Components.lc.b0(bnVar3).b(obVar, 2750).j();
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
                boolean z10 = ((org.telegram.messenger.h0) bnVar4.getMessagesController().A7.m.b).c && !TextUtils.isEmpty(bnVar4.getMessagesController().x6);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z10;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(bnVar4.getParentActivity());
                if (z10) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, bnVar4.getParentActivity(), bnVar4.getResourceProvider());
                    d2Var.setBackground(org.telegram.ui.ActionBar.m6.N0(false));
                    d2Var.e(org.telegram.messenger.gd.N0(2131748289, null), "", zArr[0], false, false);
                    d2Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(8.0f) : org.telegram.messenger.g0.L(16.0f), 0);
                    frameLayout.addView(d2Var, c8.ma.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    d2Var.setOnClickListener(new k8(i11, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, bnVar4.getParentActivity(), bnVar4.getResourceProvider());
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131748280, null);
                alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(objArr != false ? 2131748282 : 2131748283, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.H = 9;
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(objArr != false ? 2131748281 : 2131752577, null), null);
                if (objArr == false) {
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131748288, null), new zl(mmVar2, r1Var, zArr, z10, contentsettings));
                }
                bnVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                cx.J0((cx) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                cx cxVar = (cx) this.b;
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) this.c;
                Long l11 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                t1Var2.r(150L);
                Boolean bool3 = cxVar.H.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    cxVar.getMessagesController().m(l11.longValue(), cxVar.getMessagesController().c2(Long.valueOf(cxVar.I)), 0, null, cxVar, false, runnable, new ve(i13, runnable), null);
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
                    new bi.n3(launchActivity, iArr[0], l12.longValue(), null, null).show();
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
                s90 s90Var = (s90) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                org.telegram.ui.Components.q20 q20Var = (org.telegram.ui.Components.q20) this.d;
                Long l13 = (Long) obj;
                TLRPC.User c22 = l13 == null ? null : org.telegram.messenger.mp.u1(s90Var.b).c2(l13);
                userArr[0] = c22;
                if (c22 == null) {
                    s90Var.c();
                    org.telegram.messenger.f3.o(null, 2131747941, s90.d(), null);
                    break;
                } else {
                    q20Var.run();
                    break;
                }
            case 11:
                ax0 ax0Var = (ax0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = s11.k(tL_messages_stickerSet, num + "️⃣");
                    if (k10 == null) {
                        k10 = s11.k(tL_messages_stickerSet, num + "⃣");
                    }
                    if (k10 == null) {
                        String[] strArr = dx0.s;
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
                    cx0 cx0Var = new cx0(null);
                    ax0Var.e.add(cx0Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    cx0Var.h1 = new bx0(new Runnable[]{new tr0(23, ax0Var, cx0Var)});
                    cx0Var.q0(org.telegram.messenger.fc.b(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    cx0Var.P();
                    hashMap3.put(num2, cx0Var);
                }
                for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                    Integer num3 = (Integer) arrayList4.get(i20);
                    num3.getClass();
                    ax0Var.d.add((cx0) hashMap3.get(num3));
                }
                ax0Var.g[0] = true;
                ax0Var.a();
                break;
            case 12:
                s11 s11Var = (s11) this.b;
                String str12 = (String) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i21 = s11Var.W;
                ArrayList u02 = org.telegram.messenger.ri.d0(i21).u0(5);
                HashSet hashSet2 = new HashSet();
                String M3 = org.telegram.messenger.g0.M3(str12);
                String concat = " ".concat(M3);
                if (u02 != null) {
                    for (int i22 = 0; i22 < u02.size(); i22++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) u02.get(i22);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String M32 = org.telegram.messenger.g0.M3(tL_messages_stickerSet2.set.title);
                            if (M32.startsWith(M3) || M32.contains(concat)) {
                                arrayList5.add(new p11(M32));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList6 = org.telegram.messenger.ri.d0(i21).t0[1];
                if (arrayList6 != null) {
                    while (i15 < arrayList6.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList6.get(i15);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String M33 = org.telegram.messenger.g0.M3(stickerSetCovered.set.title);
                            if (M33.startsWith(M3) || M33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i21).n0(org.telegram.messenger.ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    arrayList = n02 != null ? n02.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList5.add(new p11(stickerSetCovered.set.title));
                                    arrayList5.addAll(arrayList);
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
                s11 s11Var2 = (s11) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.p5.g(s11Var2.W).f(arrayList7);
                int size = arrayList7.size();
                while (i15 < size) {
                    Object obj2 = arrayList7.get(i15);
                    i15++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj2).id));
                }
                runnable3.run();
                break;
        }
    }
}
