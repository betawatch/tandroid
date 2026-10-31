package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rv0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i10;
        bh.d dVar;
        boolean z10;
        TL_stars.SavedStarGift savedStarGift;
        int i11 = this.a;
        l2.f fVar = null;
        r15 = null;
        rh.o0 o0Var = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                long j10 = profileActivity.d1;
                long j11 = profileActivity.D1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.F2;
                iq iqVar = new iq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                iqVar.X0 = new iw0(profileActivity, chat, iqVar);
                profileActivity.presentFragment(iqVar);
                break;
            case 1:
                jz0 jz0Var = (jz0) obj2;
                Context context = (Context) obj;
                StringBuilder sb2 = new StringBuilder();
                String obj3 = jz0Var.a[0].getText().toString();
                String obj4 = jz0Var.a[3].getText().toString();
                String obj5 = jz0Var.a[2].getText().toString();
                String obj6 = jz0Var.a[1].getText().toString();
                String obj7 = jz0Var.a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj3)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj6)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj6, "UTF-8"));
                    }
                    if (jz0Var.w == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj7, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj5)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj4)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder t10 = a1.g.t(str);
                        t10.append(sb2.toString());
                        org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0(context, org.telegram.messenger.cd.L0(2131745466, null), t10.toString(), org.telegram.messenger.cd.L0(2131746519, null), true);
                        nh0Var.n1.setImageBitmap(org.telegram.messenger.d00.e(org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.L(60.0f), org.telegram.messenger.i0.y2(null, R.raw.qr_dog)));
                        jz0Var.showDialog(nh0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                y11 y11Var = (y11) obj2;
                Context context2 = (Context) obj;
                if (y11Var.x == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ep0 ep0Var = new ep0(12, y11Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.s4.a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
                        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
                        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
                        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
                        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
                        org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
                        int x05 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
                        int x06 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
                        l2.f fVar2 = new l2.f(context2, (org.telegram.ui.ActionBar.p6) null);
                        ((org.telegram.ui.ActionBar.z2) fVar2.b).v0 = false;
                        org.telegram.ui.Components.ac0 ac0Var = new org.telegram.ui.Components.ac0(context2, null);
                        ac0Var.setTextColor(x02);
                        ac0Var.setTextOffset(org.telegram.messenger.i0.L(10.0f));
                        ac0Var.setItemCount(5);
                        org.telegram.ui.Components.z3 z3Var = new org.telegram.ui.Components.z3(context2, null);
                        z3Var.setItemCount(5);
                        z3Var.setTextColor(x02);
                        z3Var.setTextOffset(-org.telegram.messenger.i0.L(10.0f));
                        org.telegram.ui.Components.a4 a4Var = new org.telegram.ui.Components.a4(context2, null);
                        a4Var.setItemCount(5);
                        a4Var.setTextColor(x02);
                        a4Var.setTextOffset(-org.telegram.messenger.i0.L(34.0f));
                        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context2, ac0Var, z3Var, a4Var, 4);
                        n3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        n3Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(org.telegram.messenger.cd.L0(2131745543, null));
                        textView.setTextColor(x02);
                        sc.e.t(textView, 1, 20.0f);
                        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        n3Var.addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ag.j3 j3Var = new ag.j3(context2, 14);
                        linearLayout.addView(ac0Var, w7.b6.l(0.5f, 0, org.telegram.messenger.zs.t4));
                        ac0Var.setMinValue(0);
                        ac0Var.setMaxValue(365);
                        ac0Var.setWrapSelectorWheel(false);
                        ac0Var.setFormatter(new org.telegram.ui.Cells.m5(22));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(ac0Var, z3Var, a4Var, 11);
                        ac0Var.setOnValueChangedListener(aVar);
                        z3Var.setMinValue(0);
                        z3Var.setMaxValue(23);
                        linearLayout.addView(z3Var, w7.b6.l(0.2f, 0, org.telegram.messenger.zs.t4));
                        z3Var.setFormatter(new org.telegram.ui.Cells.m5(24));
                        z3Var.setOnValueChangedListener(aVar);
                        a4Var.setMinValue(0);
                        a4Var.setMaxValue(59);
                        a4Var.setValue(0);
                        a4Var.setFormatter(new org.telegram.ui.Cells.m5(25));
                        linearLayout.addView(a4Var, w7.b6.l(0.3f, 0, org.telegram.messenger.zs.t4));
                        a4Var.setOnValueChangedListener(aVar);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            i10 = x06;
                        } else {
                            long j12 = currentTimeMillis * 1000;
                            i10 = x06;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                a4Var.setValue(calendar.get(12));
                                z3Var.setValue(calendar.get(11));
                                ac0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.s4.g(null, null, 0L, 0L, 0, ac0Var, z3Var, a4Var);
                        j3Var.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
                        j3Var.setGravity(17);
                        j3Var.setTextColor(x04);
                        j3Var.setTextSize(1, 14.0f);
                        j3Var.setTypeface(org.telegram.messenger.i0.o());
                        int L = org.telegram.messenger.i0.L(8.0f);
                        j3Var.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x05, i10, i10));
                        j3Var.setText(org.telegram.messenger.cd.L0(2131745545, null));
                        n3Var.addView(j3Var, w7.b6.t(-1, 48, 83, 16, 15, 16, 16));
                        j3Var.setOnClickListener(new mg.f(ac0Var, (org.telegram.ui.Components.ac0) z3Var, (org.telegram.ui.Components.ac0) a4Var, calendar, (Object) ep0Var, fVar2, 1));
                        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar2.b;
                        z2Var.N = n3Var;
                        z2Var.show();
                        z2Var.v0(x03);
                        z2Var.P(x03);
                        fVar = fVar2;
                    }
                    mg.g gVar = new mg.g(9, y11Var, zArr);
                    org.telegram.ui.ActionBar.z2 z2Var2 = (org.telegram.ui.ActionBar.z2) fVar.b;
                    z2Var2.H0 = gVar;
                    z2Var2.show();
                    y11Var.x = z2Var2;
                    y11Var.c(false);
                    break;
                }
                break;
            case 3:
                t31 t31Var = (t31) obj2;
                org.telegram.ui.Components.zb zbVar = (org.telegram.ui.Components.zb) obj;
                if (t31Var.R1.g() != 0) {
                    zbVar.a(new ArrayList(t31Var.S1.values()));
                    t31Var.dismiss();
                    break;
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) obj2;
                ((AlertDialog$Builder) obj).a.N0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i12 = 7;
                } else if (num.intValue() == 1) {
                    i12 = 90;
                } else if (num.intValue() == 2) {
                    i12 = org.telegram.messenger.zs.N2;
                } else if (num.intValue() == 3) {
                    i12 = 365;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i12;
                sessionsActivity.s = i12;
                p41 p41Var = sessionsActivity.a;
                if (p41Var != null) {
                    p41Var.f();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ag.c3(4));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                editTextBoldCursor.setText(rh.h8.O0(((Long) obj).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                u61 u61Var = ((z51) obj2).d0;
                u61Var.getOrCreateStoryViewer().Q(u61Var.getParentActivity(), ((r61) obj).b(), u61Var.C0, th.n5.a(u61Var.S));
                break;
            case 7:
                d61 d61Var = (d61) obj2;
                dg.g gVar2 = (dg.g) obj;
                int i13 = d61Var.c;
                e61 e61Var = d61Var.d;
                org.telegram.ui.Components.yz yzVar = d61Var.a;
                if (yzVar.c) {
                    ArrayList arrayList = e61Var.n;
                    bg.i iVar = e61Var.c;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            i12 = 1;
                        } else if (i14 == i13 || !((d61) arrayList.get(i14)).a.c || !((d61) arrayList.get(i14)).a.b) {
                            i14++;
                        }
                    }
                    e61Var.f();
                    if (i12 != 0) {
                        org.telegram.messenger.i0.E3(yzVar);
                        break;
                    } else {
                        yzVar.setChecked(!yzVar.b);
                        gVar2.n = yzVar.b;
                        e61Var.b.z();
                        if (e61Var.r.c > 0 && i13 < iVar.d.size()) {
                            ((dg.g) iVar.d.get(i13)).n = yzVar.b;
                            iVar.z();
                            break;
                        }
                    }
                }
                break;
            case 8:
                p91 p91Var = (p91) obj2;
                Context context3 = (Context) obj;
                if (p91Var.getParentActivity() != null) {
                    l2.f fVar3 = new l2.f(p91Var.getParentActivity(), (org.telegram.ui.ActionBar.p6) null);
                    ((org.telegram.ui.ActionBar.z2) fVar3.b).v0 = false;
                    LinearLayout f7 = org.telegram.messenger.m5.f(context3, 1);
                    TextView textView2 = new TextView(context3);
                    textView2.setText(org.telegram.messenger.cd.L0(2131752112, null));
                    org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.j5, null, 1, 20.0f);
                    f7.addView(textView2, w7.b6.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                    ((org.telegram.ui.ActionBar.z2) fVar3.b).N = f7;
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.t6.F.size();
                    while (i12 < size2) {
                        org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) org.telegram.ui.ActionBar.t6.F.get(i12);
                        TLRPC.TL_theme tL_theme = s6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(s6Var);
                        }
                        i12++;
                    }
                    v71 v71Var = new v71(context3, p91Var, arrayList2, new ArrayList(), fVar3);
                    f7.addView(v71Var, w7.b6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, org.telegram.messenger.zs.e2));
                    v71Var.A1(p91Var.fragmentView.getMeasuredWidth());
                    p91Var.showDialog((org.telegram.ui.ActionBar.z2) fVar3.b);
                    break;
                }
                break;
            case 9:
                be1 be1Var = (be1) obj2;
                Context context4 = (Context) obj;
                mg.i2 i2Var = be1Var.M;
                if (i2Var != null) {
                    i2Var.dismiss();
                    be1Var.M = null;
                }
                mg.i2 i2Var2 = new mg.i2(context4, be1Var.a, null, 4, new org.telegram.ui.Components.ro0());
                TLRPC.User user = be1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = be1Var.d;
                long j14 = user2 != null ? user2.id : 0L;
                long[] jArr = {j13, j14};
                int i15 = 0;
                for (int i16 = 2; i15 < i16; i16 = 2) {
                    i2Var2.u2.add(Long.valueOf(jArr[i15]));
                    i15++;
                }
                i2Var2.o1(false, true);
                i2Var2.v2 = new org.telegram.messenger.z1(4);
                be1Var.M = i2Var2;
                i2Var2.show();
                break;
            case 10:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                if (!((org.telegram.ui.Wallet.a2) obj2).m) {
                    y2Var.dismiss();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Wallet.z2 z2Var3 = (org.telegram.ui.Wallet.z2) obj;
                if (!((vh.d) obj2).Q) {
                    z2Var3.dismiss();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Wallet.p3 p3Var = (org.telegram.ui.Wallet.p3) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (p3Var.e && !p3Var.R) {
                    org.telegram.ui.Wallet.b6.I0(k2Var.getCurrentAccount(), p3Var.getContext(), k2Var.getResourceProvider());
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Wallet.x4 x4Var = (org.telegram.ui.Wallet.x4) obj2;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    x4Var.dismiss();
                    org.telegram.ui.Wallet.ba baVar = new org.telegram.ui.Wallet.ba();
                    baVar.m0(nftitem);
                    T.presentFragment(baVar);
                    break;
                }
                break;
            case 14:
                ((Runnable) obj2).run();
                ((org.telegram.ui.Wallet.z2[]) obj)[0].dismiss();
                break;
            case 15:
                org.telegram.ui.Wallet.b6.k0((org.telegram.ui.Wallet.b6) obj2, (Context) obj, view);
                break;
            case 16:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) obj2;
                TextView textView3 = (TextView) obj;
                c2Var.c(!c2Var.b(), true);
                textView3.setVisibility(c2Var.b() ? 0 : 8);
                break;
            case 17:
                vh.d dVar2 = (vh.d) obj2;
                int[] iArr = (int[]) obj;
                if (!dVar2.Q && (dVar = se1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = dVar.l();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) dVar.c;
                        com.google.android.gms.common.api.internal.u0 u0Var = v0Var.h;
                        b8.e eVar = new b8.e(u0Var, str2, "/tg-wear-auth/answer", l4);
                        u0Var.b.d(0, eVar);
                        n6.l.m(eVar, y8.h0.a).addOnSuccessListener(new a7(dVar, dVar2, iArr, 24)).addOnFailureListener(new qe1(dVar2, 0));
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        dVar2.setLoading(false);
                        return;
                    }
                }
                break;
            case 18:
                org.telegram.ui.web.j jVar = (org.telegram.ui.web.j) obj2;
                jVar.b = true;
                ((v) obj).run();
                jVar.x.f3.O(true);
                break;
            case 19:
                ph.c cVar = (ph.c) obj2;
                cVar.getClass();
                long o10 = org.telegram.messenger.o5.o(((TL_stars.TL_StarGiftAuctionAcquiredGift) obj).peer);
                cVar.dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null && !org.telegram.messenger.h20.A(o10)) {
                    Bundle bundle = new Bundle();
                    if (o10 > 0) {
                        bundle.putLong("user_id", o10);
                        if (o10 == org.telegram.messenger.d20.i(cVar.a).e()) {
                            z10 = true;
                            bundle.putBoolean("my_profile", true);
                        } else {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                        bundle.putLong("chat_id", -o10);
                    }
                    bundle.putBoolean("open_gifts", z10);
                    T2.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 20:
                ph.r3 r3Var = (ph.r3) obj2;
                r3Var.getClass();
                if (((rh.w7) obj).f > 0) {
                    r3Var.presentFragment(new rh.h8());
                    break;
                }
                break;
            case 21:
                ph.q3 q3Var = (ph.q3) obj2;
                ph.p3 p3Var2 = (ph.p3) obj;
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(q3Var.c, q3Var.I0, q3Var.S1);
                F.c(R.drawable.menu_sort_value, org.telegram.messenger.cd.L0(2131746156, null), new ph.k3(p3Var2, 3), false);
                F.c(R.drawable.menu_sort_date, org.telegram.messenger.cd.L0(2131746160, null), new ph.k3(p3Var2, 4), false);
                F.c(R.drawable.menu_sort_number, org.telegram.messenger.cd.L0(2131746158, null), new ph.k3(p3Var2, 5), false);
                F.t = false;
                F.Y = true;
                F.a0(0.0f, org.telegram.messenger.i0.L(-8.0f));
                F.Z();
                break;
            case 22:
                ph.t3 t3Var = (ph.t3) obj2;
                jg.o2 o2Var = (jg.o2) obj;
                HashSet hashSet = t3Var.R1;
                if (!hashSet.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList4 = t3Var.Q1.l;
                        int size3 = arrayList4.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 < size3) {
                                Object obj8 = arrayList4.get(i17);
                                i17++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i18 = savedStarGift.msg_id;
                                if ((i18 == 0 || i18 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList3.add(savedStarGift);
                        }
                    }
                    o2Var.a(arrayList3);
                    t3Var.dismiss();
                    break;
                }
                break;
            case 23:
                rh.v5 v5Var = ((ph.s3) obj2).c.Q1;
                v5Var.e = !v5Var.e;
                ((org.telegram.ui.Components.hq0) obj).run();
                v5Var.j(true);
                break;
            case 24:
                rh.i.b0((rh.i) obj2, (Context) obj, view);
                break;
            case 25:
                rh.b0 b0Var = (rh.b0) obj2;
                Context context5 = (Context) obj;
                String[] strArr = new String[6];
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    int[] iArr2 = rh.b0.p2;
                    if (i19 >= 6) {
                        String L0 = org.telegram.messenger.cd.L0(2131749739, null);
                        ph.h1 h1Var = new ph.h1(b0Var, r11);
                        Pattern pattern2 = org.telegram.ui.Components.s4.a;
                        ag.n3 b10 = ag.n3.b(org.telegram.messenger.d20.s0);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x07 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.j5, false);
                            int x08 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.xj, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Bj, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false);
                            org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ei, false);
                            org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context5, null, false);
                            k10.v0 = false;
                            LinearLayout linearLayout2 = new LinearLayout(context5);
                            linearLayout2.setOrientation(0);
                            linearLayout2.setWeightSum(1.0f);
                            org.telegram.ui.Components.ac0 ac0Var2 = new org.telegram.ui.Components.ac0(context5, null);
                            ac0Var2.setAllItemsCount(6);
                            ac0Var2.setItemCount(Math.min(6, 8));
                            ac0Var2.setTextColor(x07);
                            ac0Var2.setGravity(17);
                            ac0Var2.setMinValue(0);
                            ac0Var2.setMaxValue(5);
                            ac0Var2.setValue(i20);
                            linearLayout2.addView(ac0Var2, w7.b6.l(1.0f, 0, 432));
                            ac0Var2.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            org.telegram.ui.Components.c4 c4Var = new org.telegram.ui.Components.c4(context5, ac0Var2, 2);
                            c4Var.setOrientation(1);
                            FrameLayout frameLayout2 = new FrameLayout(context5);
                            TextView textView4 = new TextView(context5);
                            textView4.setText(L0);
                            textView4.setTextColor(x07);
                            textView4.setTextSize(1, 20.0f);
                            textView4.setTypeface(org.telegram.messenger.i0.o());
                            frameLayout2.addView(textView4, w7.b6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView4.setOnTouchListener(new org.telegram.ui.ActionBar.n2(9));
                            c4Var.addView(frameLayout2, w7.b6.t(-1, -2, 51, 22, 0, 0, 4));
                            c4Var.addView(linearLayout2, w7.b6.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            vh.d dVar3 = new vh.d(context5, null, true);
                            dVar3.i(org.telegram.messenger.cd.L0(2131745689, null), false, true);
                            dVar3.setOnClickListener(new org.telegram.ui.Components.j2(r4, 1));
                            c4Var.addView(dVar3, w7.b6.t(-1, 48, 0, 16, 12, 16, 12));
                            k10.N = c4Var;
                            k10.show();
                            k10.setOnDismissListener(new mg.g(5, h1Var, ac0Var2));
                            k10.v0(x08);
                            k10.P(x08);
                            org.telegram.ui.ActionBar.z2[] z2VarArr = {k10};
                            break;
                        }
                    } else {
                        strArr[i19] = org.telegram.messenger.cd.G(iArr2[i19] / 3600, "GiftOfferHours", new Object[0]);
                        if (iArr2[i19] == b0Var.g2) {
                            i20 = i19;
                        }
                        i19++;
                    }
                }
                break;
            case 26:
                rh.i0 i0Var = (rh.i0) obj2;
                rh.e3 e3Var = (rh.e3) obj;
                vh.d dVar4 = i0Var.m1;
                if (dVar4.c0 && !dVar4.Q) {
                    org.telegram.messenger.i0.v1(i0Var.j1);
                    dVar4.setLoading(true);
                    e3Var.a(i0Var.v1);
                    break;
                }
                break;
            case 27:
                rh.t0 t0Var = (rh.t0) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList5 = (ArrayList) obj;
                rh.m0 m0Var = t0Var.g2;
                int i21 = t0Var.r2;
                if (i21 == 2) {
                    m0Var.setPreviewingAttributes(arrayList5);
                    t0Var.g1(1);
                    break;
                } else if (i21 == 1) {
                    rh.o0 o0Var2 = new rh.o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                    t0Var.l2 = o0Var2;
                    m0Var.setPreviewAttributes(o0Var2);
                    t0Var.g1(2);
                    break;
                }
                break;
            case 28:
                rh.o0 o0Var3 = (rh.o0) obj;
                rh.t0 t0Var2 = ((rh.n0) obj2).P;
                int i22 = t0Var2.r2;
                rh.m0 m0Var2 = t0Var2.g2;
                if (i22 == 1) {
                    t0Var2.l2 = new rh.o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    t0Var2.g1(2);
                }
                int i23 = t0Var2.b2.s;
                rh.o0 o0Var4 = t0Var2.l2;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.b;
                    if (i23 == 1) {
                        o0Var = new rh.o0(o0Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i23 == 2) {
                        o0Var = new rh.o0(stargiftattributebackdrop, o0Var3.b, stargiftattributemodel);
                    } else if (i23 == 0) {
                        o0Var = new rh.o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.c);
                    }
                }
                t0Var2.l2 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                t0Var2.i1();
                break;
            default:
                rh.e4 e4Var = (rh.e4) obj2;
                boolean z11 = !e4Var.p3;
                e4Var.p3 = z11;
                ((org.telegram.ui.Cells.c2) obj).c(z11, true);
                break;
        }
    }
}
