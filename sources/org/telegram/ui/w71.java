package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import qg.q0;
import sg.b0;
import sg.i;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class w71 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bi.u6 u6Var;
        pg.k2 j3;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 3;
        int i11 = 5;
        xh.o0 o0Var = null;
        int i12 = 2;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                z71 z71Var = (z71) this.b;
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.c;
                if (z71Var.Z.g() != 0) {
                    scVar.run(new ArrayList(z71Var.a0.values()));
                    z71Var.dismiss();
                    break;
                }
                break;
            case 1:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i14 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 183 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i14;
                sessionsActivity.v = i14;
                v81 v81Var = sessionsActivity.a;
                if (v81Var != null) {
                    v81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new bi.g1(4));
                break;
            case 2:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(xh.z7.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 3:
                ka1 ka1Var = (ka1) this.b;
                cb1 cb1Var = (cb1) this.c;
                fb1 fb1Var = ka1Var.d0;
                fb1Var.getOrCreateStoryViewer().C(fb1Var.getParentActivity(), cb1Var.b(), fb1Var.z0, zh.s5.a(fb1Var.S));
                break;
            case 4:
                oa1 oa1Var = (oa1) this.b;
                jg.f fVar = (jg.f) this.c;
                int i15 = oa1Var.c;
                pa1 pa1Var = oa1Var.d;
                org.telegram.ui.Components.z00 z00Var = oa1Var.a;
                if (z00Var.c) {
                    ArrayList arrayList = pa1Var.n;
                    hg.g gVar = pa1Var.c;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i13 = 1;
                        } else if (i16 == i15 || !((oa1) arrayList.get(i16)).a.c || !((oa1) arrayList.get(i16)).a.b) {
                            i16++;
                        }
                    }
                    pa1Var.f();
                    if (i13 != 0) {
                        AndroidUtilities.shakeView(z00Var);
                        break;
                    } else {
                        z00Var.setChecked(!z00Var.b);
                        fVar.n = z00Var.b;
                        pa1Var.b.z();
                        if (pa1Var.r.c > 0 && i15 < gVar.d.size()) {
                            ((jg.f) gVar.d.get(i15)).n = z00Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 5:
                nb1 nb1Var = (nb1) this.b;
                wy wyVar = (wy) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wyVar.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new fz0(i11, nb1Var, wyVar));
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                wyVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 6:
                fe1 fe1Var = (fe1) this.b;
                Context context = (Context) this.c;
                if (fe1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(fe1Var.getParentActivity(), null);
                    c3Var.a();
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.a2.q(textView2, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                    linearLayout.addView(textView2, w7.a6.t(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new ai.h(2));
                    c3Var.b(linearLayout);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i13 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i13);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i13++;
                    }
                    hc1 hc1Var = new hc1(context, fe1Var, arrayList2, new ArrayList(), c3Var);
                    linearLayout.addView(hc1Var, w7.a6.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    hc1Var.w1(fe1Var.fragmentView.getMeasuredWidth());
                    fe1Var.showDialog(c3Var.a);
                    break;
                }
                break;
            case 7:
                zi1 zi1Var = (zi1) this.b;
                Context context2 = (Context) this.c;
                sg.p1 p1Var = zi1Var.M;
                if (p1Var != null) {
                    p1Var.dismiss();
                    zi1Var.M = null;
                }
                sg.p1 p1Var2 = new sg.p1(context2, zi1Var.a, null, 4, new org.telegram.ui.Components.bq0());
                TLRPC.User user = zi1Var.c;
                long j10 = user != null ? user.id : 0L;
                TLRPC.User user2 = zi1Var.d;
                long[] jArr = {j10, user2 != null ? user2.id : 0L};
                for (int i17 = 0; i17 < 2; i17++) {
                    p1Var2.C0.add(Long.valueOf(jArr[i17]));
                }
                p1Var2.h0(false, true);
                p1Var2.D0 = new gh.b(i12);
                zi1Var.M = p1Var2;
                p1Var2.show();
                break;
            case 8:
                bi.d dVar = (bi.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.N && (u6Var = pj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] i18 = u6Var.i();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str = (String) u6Var.c;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        b8.e eVar = new b8.e(t0Var, str, "/tg-wear-auth/answer", i18);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new a7(u6Var, dVar, iArr, 24)).addOnFailureListener(new oj1(dVar, 0));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                break;
            case 9:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                y yVar = (y) this.c;
                lVar.b = true;
                yVar.run();
                lVar.w.Y2.N(true);
                break;
            case 10:
                pg.n2 n2Var = (pg.n2) this.b;
                bi.we weVar = (bi.we) this.c;
                pg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j3 = n2Var.j(n2Var.n0, n2Var.o0)) != null) {
                    weVar.run(j3);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.zn.d0((eo) this.c, 41026, new org.telegram.ui.web.y1((ph.c) this.b, i10), null);
                break;
            case 12:
                qg.k0.V((qg.k0) this.b, (Context) this.c);
                break;
            case 13:
                sg.u0 u0Var = (sg.u0) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = u0Var.X;
                if (!arrayList3.isEmpty()) {
                    sg.d0 d0Var = u0Var.a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i13 < size3) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        sg.s.a(chat.id, arrayList4, new gg.u1(u0Var, chat, arrayList4, hashSet, 14), new org.telegram.ui.web.y1(u0Var, 7));
                        break;
                    }
                }
                break;
            case 14:
                sg.p1 p1Var3 = (sg.p1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = p1Var3.h0;
                int size4 = arrayList5.size();
                while (i13 < size4) {
                    Object obj2 = arrayList5.get(i13);
                    i13++;
                    Long l4 = (Long) obj2;
                    l4.getClass();
                    hashSet2.remove(l4);
                    p1Var3.n0.remove(l4);
                }
                p1Var3.W();
                p1Var3.Z.b(true, hashSet2, new sg.d1(p1Var3, i11), null);
                p1Var3.i0(true, true);
                p1Var3.X();
                break;
            case 15:
                sg.p1.S((sg.p1) this.b, (TLRPC.User) this.c, view);
                break;
            case 16:
                final tg.e eVar2 = (tg.e) this.b;
                final ug.a aVar = (ug.a) this.c;
                if (!eVar2.d) {
                    ((sg.b0) eVar2).r.dismiss();
                    break;
                } else if (!aVar.a.N) {
                    final int i19 = 1;
                    aVar.b(true);
                    String str2 = eVar2.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: tg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i13) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new q0(b0Var, 14), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    i.c((TLRPC.TL_error) obj3, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: tg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj3) {
                            switch (i19) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new q0(b0Var, 14), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    i.c((TLRPC.TL_error) obj3, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str2;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new sg.o(callback2, callback, i13), 2);
                    break;
                }
                break;
            case 17:
                ug.g gVar2 = (ug.g) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ug.f fVar2 = gVar2.s;
                if (fVar2 != null) {
                    sg.a0 a0Var = ((sg.u) fVar2).a;
                    a0Var.c0.remove(chat2);
                    a0Var.a0(true, true);
                    break;
                }
                break;
            case 18:
                ((org.telegram.ui.web.y1) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 19:
                ((org.telegram.ui.web.y1) this.b).run((TLRPC.Chat) this.c);
                break;
            case 20:
                wh.c.P((wh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 21:
                wh.h4 h4Var = (wh.h4) this.b;
                xh.n7 n7Var = (xh.n7) this.c;
                h4Var.getClass();
                if (n7Var.f > 0) {
                    h4Var.presentFragment(new xh.z7());
                    break;
                }
                break;
            case 22:
                wh.g4.P((wh.g4) this.b, (wh.f4) this.c);
                break;
            case 23:
                wh.l4 l4Var = (wh.l4) this.b;
                di.v4 v4Var = (di.v4) this.c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = l4Var.Y.l;
                        int size5 = arrayList7.size();
                        int i20 = 0;
                        while (true) {
                            if (i20 < size5) {
                                Object obj3 = arrayList7.get(i20);
                                i20++;
                                savedStarGift = (TL_stars.SavedStarGift) obj3;
                                int i21 = savedStarGift.msg_id;
                                if ((i21 == 0 || i21 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList6.add(savedStarGift);
                        }
                    }
                    v4Var.run(arrayList6);
                    l4Var.dismiss();
                    break;
                }
                break;
            case 24:
                wh.i4 i4Var = (wh.i4) this.b;
                org.telegram.messenger.sk skVar = (org.telegram.messenger.sk) this.c;
                xh.n5 n5Var = i4Var.c.Y;
                n5Var.e = !n5Var.e;
                skVar.run();
                n5Var.i(true);
                break;
            case 25:
                xh.h.X((xh.h) this.b, (Context) this.c, view);
                break;
            case 26:
                xh.a0 a0Var2 = (xh.a0) this.b;
                Context context3 = (Context) this.c;
                String[] strArr = new String[6];
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    int[] iArr2 = xh.a0.w0;
                    if (i22 >= 6) {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(a0Var2, 17);
                        Pattern pattern = org.telegram.ui.Components.d5.a;
                        gg.o2 b10 = gg.o2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
                            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                            org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context3, (org.telegram.ui.ActionBar.f6) null, false);
                            h3Var.fixNavigationBar();
                            h3Var.applyBottomPadding = false;
                            LinearLayout linearLayout2 = new LinearLayout(context3);
                            linearLayout2.setOrientation(0);
                            linearLayout2.setWeightSum(1.0f);
                            org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context3, null);
                            dd0Var.setAllItemsCount(6);
                            dd0Var.setItemCount(Math.min(6, 8));
                            dd0Var.setTextColor(w02);
                            dd0Var.setGravity(17);
                            dd0Var.setMinValue(0);
                            dd0Var.setMaxValue(5);
                            dd0Var.setValue(i23);
                            linearLayout2.addView(dd0Var, w7.a6.l(1.0f, 0, 432));
                            dd0Var.setFormatter(new org.telegram.ui.Components.t(strArr, 7));
                            org.telegram.ui.Components.v4 v4Var2 = new org.telegram.ui.Components.v4(context3, dd0Var);
                            v4Var2.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context3);
                            TextView textView3 = new TextView(context3);
                            textView3.setText(string);
                            textView3.setTextColor(w02);
                            textView3.setTextSize(1, 20.0f);
                            textView3.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView3, w7.a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView3.setOnTouchListener(new ai.h(10));
                            v4Var2.addView(frameLayout, w7.a6.t(-1, -2, 51, 22, 0, 0, 4));
                            v4Var2.addView(linearLayout2, w7.a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            bi.d dVar2 = new bi.d(context3, null, true);
                            dVar2.g(LocaleController.getString(R.string.Select), false, true);
                            dVar2.setOnClickListener(new org.telegram.ui.Components.l2(r0, 1));
                            v4Var2.addView(dVar2, w7.a6.t(-1, 48, 0, 16, 12, 16, 12));
                            h3Var.customView = v4Var2;
                            h3Var.show();
                            h3Var.setOnDismissListener(new di.h0(7, y1Var, dd0Var));
                            h3Var.setBackgroundColor(w03);
                            h3Var.fixNavigationBar(w03);
                            org.telegram.ui.ActionBar.h3[] h3VarArr = {h3Var};
                            break;
                        }
                    } else {
                        strArr[i22] = LocaleController.formatPluralString("GiftOfferHours", iArr2[i22] / 3600, new Object[0]);
                        if (iArr2[i22] == a0Var2.n0) {
                            i23 = i22;
                        }
                        i22++;
                    }
                }
                break;
            case 27:
                xh.i0 i0Var = (xh.i0) this.b;
                nj0 nj0Var = (nj0) this.c;
                bi.d dVar3 = i0Var.f;
                if (dVar3.W && !dVar3.N) {
                    AndroidUtilities.hideKeyboard(i0Var.c);
                    dVar3.setLoading(true);
                    nj0Var.run(i0Var.E);
                    break;
                }
                break;
            case 28:
                xh.s0 s0Var = (xh.s0) this.b;
                ArrayList<TL_stars.StarGiftAttribute> arrayList8 = (ArrayList) this.c;
                xh.m0 m0Var = s0Var.o0;
                int i24 = s0Var.C0;
                if (i24 == 2) {
                    m0Var.setPreviewingAttributes(arrayList8);
                    s0Var.S(1);
                    break;
                } else if (i24 == 1) {
                    xh.o0 o0Var2 = new xh.o0(m0Var.getUpgradeBackdropAttribute(), m0Var.getUpgradePatternAttribute(), m0Var.getUpgradeImageViewAttribute());
                    s0Var.v0 = o0Var2;
                    m0Var.setPreviewAttributes(o0Var2);
                    s0Var.S(2);
                    break;
                }
                break;
            default:
                xh.n0 n0Var = (xh.n0) this.b;
                xh.o0 o0Var3 = (xh.o0) this.c;
                xh.s0 s0Var2 = n0Var.N;
                int i25 = s0Var2.C0;
                xh.m0 m0Var2 = s0Var2.o0;
                if (i25 == 1) {
                    s0Var2.v0 = new xh.o0(m0Var2.getUpgradeBackdropAttribute(), m0Var2.getUpgradePatternAttribute(), m0Var2.getUpgradeImageViewAttribute());
                    s0Var2.S(2);
                }
                int i26 = s0Var2.j0.r;
                xh.o0 o0Var4 = s0Var2.v0;
                if (o0Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = o0Var4.a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = o0Var4.c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = o0Var4.b;
                    if (i26 == 1) {
                        o0Var = new xh.o0(o0Var3.a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i26 == 2) {
                        o0Var = new xh.o0(stargiftattributebackdrop, o0Var3.b, stargiftattributemodel);
                    } else if (i26 == 0) {
                        o0Var = new xh.o0(stargiftattributebackdrop, stargiftattributepattern, o0Var3.c);
                    }
                }
                s0Var2.v0 = o0Var;
                m0Var2.setPreviewAttributes(o0Var);
                s0Var2.U();
                break;
        }
    }
}
