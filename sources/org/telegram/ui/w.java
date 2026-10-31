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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0765 A[SYNTHETIC] */
    @Override // org.telegram.messenger.q20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        Uri uri;
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
                h4 h4Var = (h4) this.b;
                l3 l3Var = (l3) this.c;
                Activity activity = (Activity) this.d;
                String str2 = (String) obj;
                if (!TextUtils.isEmpty(str2) && l3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2.trim());
                    org.telegram.messenger.i0.c(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i15 = 0;
                    for (int i16 = 0; i16 < uRLSpanArr.length; i16++) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i16]), length);
                        i15 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i16]), i15);
                    }
                    h4Var.h0.k(false);
                    Pattern pattern = Utilities.a;
                    try {
                        uri = Uri.parse(str2);
                    } catch (Exception unused) {
                        uri = null;
                    }
                    if ((uRLSpanArr.length <= 0 || length != 0 || i15 <= 0) && (uri == null || uri.getScheme() == null)) {
                        org.telegram.ui.web.j.b(activity, str2);
                        org.telegram.ui.web.v0 webView = l3Var.getWebView();
                        String str3 = org.telegram.ui.web.g1.a().b;
                        if (str3 != null) {
                            StringBuilder t10 = a1.g.t(str3);
                            t10.append(URLEncoder.encode(str2));
                            str = t10.toString();
                        }
                        webView.loadUrl(str);
                        break;
                    } else {
                        if (uri != null && uri.getScheme() == null && uri.getHost() == null && uri.getPath() != null) {
                            str2 = gf.f.u(uri, "https", null, uri.getPath(), "/");
                        }
                        l3Var.getWebView().loadUrl(str2);
                        break;
                    }
                }
                break;
            case 1:
                h4 h4Var2 = (h4) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.d;
                Boolean bool = (Boolean) obj;
                org.telegram.messenger.vp.r1(h4Var2.X).p(str4, true);
                if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, str4)) {
                    org.telegram.messenger.vp.r1(h4Var2.X).p(str5, true);
                }
                if (bool.booleanValue()) {
                    LaunchActivity.K1 = new y(h4Var2, 8);
                    break;
                } else {
                    h4Var2.a0();
                    break;
                }
            case 2:
                un unVar = (un) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                String str6 = (String) this.d;
                Boolean bool2 = (Boolean) obj;
                if (unVar.getParentActivity() != null) {
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
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
                    if (str6.startsWith("+")) {
                        i10 = 2;
                    } else {
                        TLRPC.User f7 = unVar.getUserConfig().f();
                        HashMap hashMap = new HashMap();
                        try {
                            bufferedReader = new BufferedReader(new InputStreamReader(org.telegram.messenger.w0.b.getResources().getAssets().open("countries.txt")));
                        } catch (Exception e) {
                            e = e;
                            i10 = i12;
                        }
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine != null) {
                                String[] split = readLine.split(";");
                                nt ntVar = new nt();
                                ntVar.a = split[i12];
                                String str7 = split[0];
                                ntVar.c = str7;
                                i10 = i12;
                                try {
                                    ntVar.d = split[1];
                                    List list = (List) hashMap.get(str7);
                                    if (list == null) {
                                        String str8 = split[0];
                                        list = new ArrayList();
                                        hashMap.put(str8, list);
                                    }
                                    list.add(ntVar);
                                    i12 = i10;
                                } catch (Exception e7) {
                                    e = e7;
                                }
                            } else {
                                i10 = i12;
                                bufferedReader.close();
                                String str9 = f7.phone;
                                i11 = 4;
                                while (true) {
                                    if (i11 >= 1) {
                                        List list2 = (List) hashMap.get(str9.substring(0, i11));
                                        if (list2 == null || list2.size() <= 0) {
                                            i11--;
                                        } else {
                                            String str10 = ((nt) list2.get(0)).c;
                                            if (str10.endsWith("0") && str6.startsWith("0")) {
                                                str6 = str6.substring(1);
                                            }
                                            str6 = a1.g.n("+", str10, str6);
                                            i14 = 1;
                                        }
                                    }
                                }
                                if (i14 == 0) {
                                    Context context = org.telegram.messenger.w0.b;
                                    String upperCase = context != null ? ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US) : Locale.getDefault().getCountry();
                                    if (upperCase.endsWith("0") && str6.startsWith("0")) {
                                        str6 = str6.substring(1);
                                    }
                                    str6 = a1.g.n("+", upperCase, str6);
                                }
                            }
                            e = e7;
                            org.telegram.messenger.f8.g(e, true);
                            String str92 = f7.phone;
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
                    unVar.getParentActivity().startActivity(intent);
                    break;
                }
                break;
            case 3:
                un unVar2 = (un) this.b;
                org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.c;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
                Long l4 = (Long) obj;
                if (ejVar != null) {
                    unVar2.getClass();
                    ArrayList arrayList3 = ejVar.d;
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        if (!unVar2.getSendMessagesHelper().k0(l4.longValue(), (org.telegram.messenger.jj) arrayList3.get(i17), false)) {
                            z10 = false;
                        }
                    }
                    if (z10 && unVar2.f4 == 0) {
                        unVar2.ea(false);
                        break;
                    }
                } else if (unVar2.getSendMessagesHelper().k0(l4.longValue(), jjVar, false)) {
                    unVar2.sd(false);
                    if (unVar2.f4 == 0) {
                        unVar2.ea(false);
                        break;
                    }
                }
                break;
            case 4:
                un.A1((un) this.b, (TLRPC.User) this.c, (TLRPC.TL_attachMenuBot) this.d);
                break;
            case 5:
                fn fnVar = (fn) this.b;
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.c;
                qm qmVar = (qm) this.d;
                if (!((Boolean) obj).booleanValue()) {
                    qmVar.run();
                    break;
                } else {
                    un unVar3 = fnVar.a;
                    int D0 = jjVar2.D0();
                    TLRPC.MessageMedia o12 = org.telegram.messenger.jj.o1(jjVar2.k);
                    if (o12 instanceof TLRPC.TL_messageMediaDice) {
                        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) o12).game_outcome;
                    }
                    ag.e0 e0Var = new ag.e0(24, fnVar, jjVar2);
                    int i18 = m51.V1;
                    TLRPC.EmojiGameInfo emojiGameInfo = org.telegram.messenger.vp.r1(unVar3.getCurrentAccount()).x8;
                    if (emojiGameInfo instanceof TLRPC.TL_emojiGameDiceInfo) {
                        long j10 = ((TLRPC.TL_emojiGameDiceInfo) emojiGameInfo).prev_stake;
                        org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(unVar3.getContext(), unVar3.getResourceProvider());
                        ebVar.a.setScaleX(1.25f);
                        ebVar.a.setScaleY(1.25f);
                        if (D0 == 1) {
                            ebVar.a.setImageResource(R.drawable.dice1);
                        } else if (D0 == 2) {
                            ebVar.a.setImageResource(R.drawable.dice2);
                        } else if (D0 == 3) {
                            ebVar.a.setImageResource(R.drawable.dice3);
                        } else if (D0 == 4) {
                            ebVar.a.setImageResource(R.drawable.dice4);
                        } else if (D0 == 5) {
                            ebVar.a.setImageResource(R.drawable.dice5);
                        } else if (D0 == 6) {
                            ebVar.a.setImageResource(R.drawable.dice6);
                        } else {
                            ebVar.a.setScaleX(0.8f);
                            ebVar.a.setScaleY(0.8f);
                            ebVar.a.setImageDrawable(org.telegram.messenger.k6.f("🎲"));
                        }
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131745254, null));
                        spannableStringBuilder2.append((CharSequence) rh.h8.O0(j10));
                        spannableStringBuilder2.append((CharSequence) "  ").append((CharSequence) org.telegram.ui.Components.fc.b(org.telegram.messenger.cd.L0(2131745252, null), new t11(unVar3, e0Var), unVar3.getResourceProvider(), null));
                        org.telegram.messenger.i0.E2(ebVar.b);
                        org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(unVar3.getContext());
                        ebVar.b = ecVar;
                        ecVar.setSingleLine();
                        ebVar.b.setTypeface(Typeface.SANS_SERIF);
                        ebVar.b.setTextSize(1, 15.0f);
                        ebVar.b.setEllipsize(TextUtils.TruncateAt.END);
                        ebVar.b.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                        ebVar.addView(ebVar.b, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
                        ebVar.b.setText(rh.h8.R0(spannableStringBuilder2, 0.9f, 0.0f, 1.0f));
                        org.telegram.ui.ActionBar.a7.H(ebVar.b, org.telegram.ui.ActionBar.t6.uj, unVar3.getResourceProvider());
                        ebVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, unVar3.getResourceProvider()));
                        ebVar.b.setSingleLine(false);
                        ebVar.b.setMaxLines(2);
                        org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(unVar3.getContext(), unVar3.getResourceProvider(), true);
                        ubVar.e(org.telegram.messenger.cd.L0(2131745253, null));
                        ubVar.b = new bi.e(e0Var, j10, 19);
                        ebVar.setButton(ubVar);
                        org.telegram.ui.Components.cc.a0(unVar3).b(ebVar, 2750).j();
                        break;
                    }
                }
                break;
            case 6:
                fn fnVar2 = (fn) this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                x1Var.c(200L);
                un unVar4 = fnVar2.a;
                boolean z11 = ((org.telegram.messenger.j0) unVar4.getMessagesController().y7.m.b).c && !TextUtils.isEmpty(unVar4.getMessagesController().v6);
                Object[] objArr = (contentsettings == null || !contentsettings.sensitive_can_change) && z11;
                boolean[] zArr = new boolean[1];
                FrameLayout frameLayout = new FrameLayout(unVar4.getParentActivity());
                if (z11) {
                    zArr[0] = true;
                } else if (contentsettings != null && contentsettings.sensitive_can_change) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, unVar4.getParentActivity(), unVar4.getResourceProvider());
                    c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                    c2Var.e(org.telegram.messenger.cd.L0(2131748497, null), "", zArr[0], false, false);
                    c2Var.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(16.0f), 0);
                    frameLayout.addView(c2Var, w7.b6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                    c2Var.setOnClickListener(new j8(3, zArr));
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar4.getParentActivity(), unVar4.getResourceProvider());
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131748488, null);
                alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(objArr != false ? 2131748490 : 2131748491, null);
                alertDialog$Builder.o(frameLayout);
                alertDialog$Builder.a.G = 9;
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(objArr != false ? 2131748489 : 2131752589, null), null);
                if (objArr == false) {
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131748496, null), new tm(fnVar2, q1Var, zArr, z11, contentsettings));
                }
                unVar4.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                ay.h0((ay) this.b, (TLRPC.TL_attachMenuBot) this.c, (LaunchActivity) this.d);
                break;
            case 8:
                ay ayVar = (ay) this.b;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.c;
                Long l10 = (Long) this.d;
                Runnable runnable = (Runnable) obj;
                x1Var2.r(150L);
                Boolean bool3 = ayVar.G.bot_participant;
                if (bool3 == null || !bool3.booleanValue()) {
                    runnable.run();
                    break;
                } else {
                    ayVar.getMessagesController().m(l10.longValue(), ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H)), 0, null, ayVar, false, runnable, new jf(i13, runnable), null);
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                gf.e eVar = (gf.e) this.c;
                int[] iArr = (int[]) this.d;
                Long l11 = (Long) obj;
                Pattern pattern2 = LaunchActivity.D1;
                launchActivity.getClass();
                if (eVar != null) {
                    eVar.b();
                }
                if ((l11 != null ? org.telegram.messenger.vp.r1(launchActivity.O).d2(l11.longValue()) : null) != null) {
                    new ph.l1(launchActivity, iArr[0], l11.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null && (Q instanceof un)) {
                        ((un) Q).Jb();
                        break;
                    }
                }
                break;
            case 10:
                ua0 ua0Var = (ua0) this.b;
                TLRPC.User[] userArr = (TLRPC.User[]) this.c;
                w50 w50Var = (w50) this.d;
                Long l12 = (Long) obj;
                TLRPC.User Z1 = l12 == null ? null : org.telegram.messenger.vp.r1(ua0Var.b).Z1(l12);
                userArr[0] = Z1;
                if (Z1 == null) {
                    ua0Var.c();
                    org.telegram.messenger.m5.o(null, 2131748150, ua0.d(), null);
                    break;
                } else {
                    w50Var.run();
                    break;
                }
            case 11:
                ly0 ly0Var = (ly0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                HashMap hashMap2 = new HashMap();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    TLRPC.Document k10 = i31.k(tL_messages_stickerSet, num + "️⃣");
                    if (k10 == null) {
                        k10 = i31.k(tL_messages_stickerSet, num + "⃣");
                    }
                    if (k10 == null) {
                        String[] strArr = oy0.s;
                        org.telegram.messenger.f8.d("couldn't find " + num + "️⃣ emoji in FestiveFontEmoji");
                        break;
                    } else {
                        hashMap2.put(num, k10);
                    }
                }
                HashMap hashMap3 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    Integer num2 = (Integer) entry.getKey();
                    num2.getClass();
                    ny0 ny0Var = new ny0(null);
                    ly0Var.e.add(ny0Var);
                    TLRPC.Document document = (TLRPC.Document) entry.getValue();
                    ny0Var.g1 = new my0(new Runnable[]{new et0(22, ly0Var, ny0Var)});
                    ny0Var.q0(org.telegram.messenger.ic.b(document), "80_80", null, null, tL_messages_stickerSet, 0);
                    ny0Var.P();
                    hashMap3.put(num2, ny0Var);
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    Integer num3 = (Integer) arrayList4.get(i19);
                    num3.getClass();
                    ly0Var.d.add((ny0) hashMap3.get(num3));
                }
                ly0Var.g[0] = true;
                ly0Var.a();
                break;
            case 12:
                i31 i31Var = (i31) this.b;
                String str11 = (String) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                Runnable runnable2 = (Runnable) obj;
                int i20 = i31Var.V;
                ArrayList s02 = org.telegram.messenger.ui.b0(i20).s0(5);
                HashSet hashSet2 = new HashSet();
                String N3 = org.telegram.messenger.i0.N3(str11);
                String concat = " ".concat(N3);
                if (s02 != null) {
                    for (int i21 = 0; i21 < s02.size(); i21++) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) s02.get(i21);
                        if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && tL_messages_stickerSet2.documents != null && !hashSet2.contains(Long.valueOf(stickerSet2.id))) {
                            String N32 = org.telegram.messenger.i0.N3(tL_messages_stickerSet2.set.title);
                            if (N32.startsWith(N3) || N32.contains(concat)) {
                                arrayList5.add(new f31(N32));
                                arrayList5.addAll(tL_messages_stickerSet2.documents);
                                hashSet2.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                            }
                        }
                    }
                }
                ArrayList arrayList6 = org.telegram.messenger.ui.b0(i20).s0[1];
                if (arrayList6 != null) {
                    while (i14 < arrayList6.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList6.get(i14);
                        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet2.contains(Long.valueOf(stickerSet.id))) {
                            String N33 = org.telegram.messenger.i0.N3(stickerSetCovered.set.title);
                            if (N33.startsWith(N3) || N33.contains(concat)) {
                                if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i20).l0(org.telegram.messenger.ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                                    arrayList = l02 != null ? l02.documents : null;
                                } else {
                                    arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                                }
                                if (arrayList != null && arrayList.size() != 0) {
                                    arrayList5.add(new f31(stickerSetCovered.set.title));
                                    arrayList5.addAll(arrayList);
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
                i31 i31Var2 = (i31) this.b;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
                Runnable runnable3 = (Runnable) this.d;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.Components.f5.g(i31Var2.V).f(arrayList7);
                int size = arrayList7.size();
                while (i14 < size) {
                    Object obj2 = arrayList7.get(i14);
                    i14++;
                    linkedHashSet.add(Long.valueOf(((TLRPC.Document) obj2).id));
                }
                runnable3.run();
                break;
        }
    }
}
