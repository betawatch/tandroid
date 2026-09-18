package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rg.w1;
import tg.b0;
import tg.i;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vy0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        cf.c cVar;
        qg.j2 j3;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 8;
        int i11 = 10;
        int i12 = 4;
        int i13 = 7;
        int i14 = 5;
        int i15 = 11;
        int i16 = 2;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        final int i17 = 0;
        final int i18 = 1;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity.e1;
                long j11 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                nq nqVar = new nq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                nqVar.X0 = new nz0(profileActivity, chat, nqVar);
                profileActivity.presentFragment(nqVar);
                break;
            case 1:
                o21 o21Var = (o21) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = o21Var.a[0].getText().toString();
                String obj2 = o21Var.a[3].getText().toString();
                String obj3 = o21Var.a[2].getText().toString();
                String obj4 = o21Var.a[1].getText().toString();
                String obj5 = o21Var.a[4].getText().toString();
                try {
                    if (!TextUtils.isEmpty(obj)) {
                        sb2.append("server=");
                        sb2.append(URLEncoder.encode(obj, "UTF-8"));
                    }
                    if (!TextUtils.isEmpty(obj4)) {
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("port=");
                        sb2.append(URLEncoder.encode(obj4, "UTF-8"));
                    }
                    if (o21Var.v == 2) {
                        str = "https://t.me/proxy?";
                        if (sb2.length() != 0) {
                            sb2.append("&");
                        }
                        sb2.append("secret=");
                        sb2.append(URLEncoder.encode(obj5, "UTF-8"));
                    } else {
                        str = "https://t.me/socks?";
                        if (!TextUtils.isEmpty(obj3)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("user=");
                            sb2.append(URLEncoder.encode(obj3, "UTF-8"));
                        }
                        if (!TextUtils.isEmpty(obj2)) {
                            if (sb2.length() != 0) {
                                sb2.append("&");
                            }
                            sb2.append("pass=");
                            sb2.append(URLEncoder.encode(obj2, "UTF-8"));
                        }
                    }
                    if (sb2.length() != 0) {
                        StringBuilder u10 = a4.a.u(str);
                        u10.append(sb2.toString());
                        org.telegram.ui.Components.ui0 ui0Var = new org.telegram.ui.Components.ui0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ui0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        o21Var.showDialog(ui0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                v51 v51Var = (v51) this.b;
                Context context2 = (Context) this.c;
                if (v51Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    rv0 rv0Var = new rv0(i10, v51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.e5.a;
                    if (context2 != null) {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.h5, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ji, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ni, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(context2, null);
                        dd0Var.setTextColor(w02);
                        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        dd0Var.setItemCount(5);
                        org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context2, null);
                        g4Var.setItemCount(5);
                        g4Var.setTextColor(w02);
                        g4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.h4 h4Var = new org.telegram.ui.Components.h4(context2, null);
                        h4Var.setItemCount(5);
                        h4Var.setTextColor(w02);
                        h4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, dd0Var, g4Var, h4Var, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(dd0Var, w7.y5.l(0.5f, 0, 270));
                        dd0Var.setMinValue(0);
                        dd0Var.setMaxValue(365);
                        dd0Var.setWrapSelectorWheel(false);
                        dd0Var.setFormatter(new es(11));
                        ai.r5 r5Var = new ai.r5(dd0Var, g4Var, h4Var, 17);
                        dd0Var.setOnValueChangedListener(r5Var);
                        g4Var.setMinValue(0);
                        g4Var.setMaxValue(23);
                        linearLayout.addView(g4Var, w7.y5.l(0.2f, 0, 270));
                        g4Var.setFormatter(new es(12));
                        g4Var.setOnValueChangedListener(r5Var);
                        h4Var.setMinValue(0);
                        h4Var.setMaxValue(59);
                        h4Var.setValue(0);
                        h4Var.setFormatter(new es(13));
                        linearLayout.addView(h4Var, w7.y5.l(0.3f, 0, 270));
                        h4Var.setOnValueChangedListener(r5Var);
                        if (currentTimeMillis > 0 && currentTimeMillis != 2147483646) {
                            long j12 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                h4Var.setValue(calendar.get(12));
                                g4Var.setValue(calendar.get(11));
                                dd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, dd0Var, g4Var, h4Var);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.a3 a3Var3 = a3Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(dd0Var, g4Var, h4Var, calendar, rv0Var, a3Var2, 1));
                        a3Var3.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var3.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var3;
                    }
                    a3Var.a.setOnHideListener(new ei.e0(v51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    v51Var.w = f3Var2;
                    v51Var.c(false);
                    break;
                }
                break;
            case 3:
                t71 t71Var = (t71) this.b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.c;
                if (t71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(t71Var.a0.values()));
                    t71Var.dismiss();
                    break;
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i19 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 183 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i19;
                sessionsActivity.v = i19;
                p81 p81Var = sessionsActivity.a;
                if (p81Var != null) {
                    p81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.t7(i10));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(yh.v7.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                ea1 ea1Var = (ea1) this.b;
                wa1 wa1Var = (wa1) this.c;
                za1 za1Var = ea1Var.d0;
                za1Var.getOrCreateStoryViewer().C(za1Var.getParentActivity(), wa1Var.b(), za1Var.z0, ai.u9.a(za1Var.S));
                break;
            case 7:
                ia1 ia1Var = (ia1) this.b;
                kg.f fVar = (kg.f) this.c;
                int i20 = ia1Var.c;
                ja1 ja1Var = ia1Var.d;
                org.telegram.ui.Components.s00 s00Var = ia1Var.a;
                if (s00Var.c) {
                    ArrayList arrayList = ja1Var.n;
                    ig.g gVar = ja1Var.c;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (true) {
                        if (i21 >= size) {
                            i17 = 1;
                        } else if (i21 == i20 || !((ia1) arrayList.get(i21)).a.c || !((ia1) arrayList.get(i21)).a.b) {
                            i21++;
                        }
                    }
                    ja1Var.f();
                    if (i17 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        break;
                    } else {
                        s00Var.setChecked(true ^ s00Var.b);
                        fVar.n = s00Var.b;
                        ja1Var.b.z();
                        if (ja1Var.r.c > 0 && i20 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i20)).n = s00Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 8:
                hb1 hb1Var = (hb1) this.b;
                uy uyVar = (uy) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new rv0(i11, hb1Var, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 9:
                ae1 ae1Var = (ae1) this.b;
                Context context3 = (Context) this.c;
                if (ae1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var4 = new org.telegram.ui.ActionBar.a3(ae1Var.getParentActivity(), null);
                    a3Var4.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.r(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.y5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var4.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i17 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i17);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i17++;
                    }
                    cc1 cc1Var = new cc1(context3, ae1Var, arrayList2, new ArrayList(), a3Var4);
                    linearLayout2.addView(cc1Var, w7.y5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    cc1Var.y1(ae1Var.fragmentView.getMeasuredWidth());
                    ae1Var.showDialog(a3Var4.a);
                    break;
                }
                break;
            case 10:
                si1 si1Var = (si1) this.b;
                Context context4 = (Context) this.c;
                tg.m1 m1Var = si1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    si1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, si1Var.a, null, 4, new ai.a1());
                TLRPC.User user = si1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = si1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i22 = 0; i22 < 2; i22++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i22]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(i16);
                si1Var.M = m1Var2;
                m1Var2.show();
                break;
            case 11:
                ci.d dVar = (ci.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.N && (cVar = jj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = cVar.l();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) cVar.d;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", l4);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new ij1(dVar, 0));
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        dVar.setLoading(false);
                        return;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                x xVar = (x) this.c;
                kVar.b = true;
                xVar.run();
                kVar.w.Y2.N(true);
                break;
            case 13:
                pg.x xVar2 = (pg.x) this.b;
                Context context5 = (Context) this.c;
                if (!xVar2.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar2.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar2.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar2, context5, createBitmap);
                    xVar2.n.f().addView(nVar, w7.y5.c(-1.0f, -1));
                    pg.u uVar = xVar2.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.e5(uVar, i12));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.qr.f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, i15));
                    duration.start();
                    xVar2.n.a();
                    xVar2.dismiss();
                    break;
                }
                break;
            case 14:
                qg.m2 m2Var = (qg.m2) this.b;
                ci.hd hdVar = (ci.hd) this.c;
                qg.j2[] j2VarArr = m2Var.H;
                if (j2VarArr != null && j2VarArr.length != 0 && m2Var.I != null && (j3 = m2Var.j(m2Var.n0, m2Var.o0)) != null) {
                    hdVar.run(j3);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.un.d0((zn) this.c, 41026, new org.telegram.ui.web.b1((qh.c) this.b, i13), null);
                break;
            case 16:
                rg.j0.V((rg.j0) this.b, (Context) this.c);
                break;
            case 17:
                tg.s0 s0Var = (tg.s0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = s0Var.X;
                if (!arrayList3.isEmpty()) {
                    tg.d0 d0Var = s0Var.a0;
                    if (!d0Var.N) {
                        d0Var.setLoading(true);
                        ArrayList arrayList4 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        int size3 = arrayList3.size();
                        while (i17 < size3) {
                            Object obj6 = arrayList3.get(i17);
                            i17++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.s.a(chat2.id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(s0Var, i15));
                        break;
                    }
                }
                break;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = m1Var3.h0;
                int size4 = arrayList5.size();
                while (i17 < size4) {
                    Object obj7 = arrayList5.get(i17);
                    i17++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.n0.remove(l10);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, i14), null);
                m1Var3.i0(true, true);
                m1Var3.X();
                break;
            case 19:
                tg.m1.S((tg.m1) this.b, (TLRPC.User) this.c, view);
                break;
            case 20:
                final ug.e eVar2 = (ug.e) this.b;
                final vg.a aVar = (vg.a) this.c;
                if (!eVar2.d) {
                    ((tg.b0) eVar2).r.dismiss();
                    break;
                } else if (!aVar.a.N) {
                    aVar.b(true);
                    String str3 = eVar2.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: ug.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i17) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new w1(b0Var, 7), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    i.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: ug.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i18) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new w1(b0Var, 7), 200L);
                                    b0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    i.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, i17), 2);
                    break;
                }
                break;
            case 21:
                vg.g gVar2 = (vg.g) this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                vg.f fVar2 = gVar2.s;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).a;
                    a0Var.c0.remove(chat3);
                    a0Var.a0(true, true);
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.web.b1) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            case 23:
                ((org.telegram.ui.web.b1) this.b).run((TLRPC.Chat) this.c);
                break;
            case 24:
                xh.c.P((xh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 25:
                xh.i4 i4Var = (xh.i4) this.b;
                yh.j7 j7Var = (yh.j7) this.c;
                i4Var.getClass();
                if (j7Var.f > 0) {
                    i4Var.presentFragment(new yh.v7());
                    break;
                }
                break;
            case 26:
                xh.h4.P((xh.h4) this.b, (xh.g4) this.c);
                break;
            case 27:
                xh.m4 m4Var = (xh.m4) this.b;
                ei.r4 r4Var = (ei.r4) this.c;
                HashSet hashSet3 = m4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = m4Var.Y.l;
                        int size5 = arrayList7.size();
                        int i23 = 0;
                        while (true) {
                            if (i23 < size5) {
                                Object obj8 = arrayList7.get(i23);
                                i23++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i24 = savedStarGift.msg_id;
                                if ((i24 == 0 || i24 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList6.add(savedStarGift);
                        }
                    }
                    r4Var.run(arrayList6);
                    m4Var.dismiss();
                    break;
                }
                break;
            case 28:
                xh.j4 j4Var = (xh.j4) this.b;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.c;
                yh.l5 l5Var = j4Var.c.Y;
                l5Var.e = !l5Var.e;
                kkVar.run();
                l5Var.i(true);
                break;
            default:
                yh.g.X((yh.g) this.b, (Context) this.c, view);
                break;
        }
    }
}
