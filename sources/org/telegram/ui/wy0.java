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
import tg.c0;
import tg.k;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wy0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        w51 w51Var;
        cf.c cVar;
        qg.m2 j3;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 8;
        int i11 = 9;
        int i12 = 4;
        int i13 = 5;
        int i14 = 7;
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
                pq pqVar = new pq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                pqVar.X0 = new oz0(profileActivity, chat, pqVar);
                profileActivity.presentFragment(pqVar);
                break;
            case 1:
                p21 p21Var = (p21) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = p21Var.a[0].getText().toString();
                String obj2 = p21Var.a[3].getText().toString();
                String obj3 = p21Var.a[2].getText().toString();
                String obj4 = p21Var.a[1].getText().toString();
                String obj5 = p21Var.a[4].getText().toString();
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
                    if (p21Var.v == 2) {
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
                        StringBuilder v = a4.a.v(str);
                        v.append(sb2.toString());
                        org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ji0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        p21Var.showDialog(ji0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                w51 w51Var2 = (w51) this.b;
                Context context2 = (Context) this.c;
                if (w51Var2.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    rv0 rv0Var = new rv0(i14, w51Var2, zArr);
                    Pattern pattern = org.telegram.ui.Components.c5.a;
                    if (context2 == null) {
                        w51Var = w51Var2;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false);
                        int w03 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.h5, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ji, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ni, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G8, false);
                        org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i6, false);
                        int w04 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false);
                        int w05 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                        int w06 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(context2, null);
                        uc0Var.setTextColor(w02);
                        uc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        uc0Var.setItemCount(5);
                        org.telegram.ui.Components.e4 e4Var = new org.telegram.ui.Components.e4(context2, null);
                        e4Var.setItemCount(5);
                        e4Var.setTextColor(w02);
                        e4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context2, null);
                        f4Var.setItemCount(5);
                        f4Var.setTextColor(w02);
                        f4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.u3 u3Var = new org.telegram.ui.Components.u3(context2, uc0Var, e4Var, f4Var, 3);
                        u3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        u3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        u3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(uc0Var, w7.x5.l(0.5f, 0, 270));
                        uc0Var.setMinValue(0);
                        uc0Var.setMaxValue(365);
                        uc0Var.setWrapSelectorWheel(false);
                        uc0Var.setFormatter(new es(8));
                        ai.r5 r5Var = new ai.r5(uc0Var, e4Var, f4Var, 17);
                        uc0Var.setOnValueChangedListener(r5Var);
                        e4Var.setMinValue(0);
                        e4Var.setMaxValue(23);
                        linearLayout.addView(e4Var, w7.x5.l(0.2f, 0, 270));
                        e4Var.setFormatter(new es(9));
                        e4Var.setOnValueChangedListener(r5Var);
                        f4Var.setMinValue(0);
                        f4Var.setMaxValue(59);
                        f4Var.setValue(0);
                        f4Var.setFormatter(new es(10));
                        linearLayout.addView(f4Var, w7.x5.l(0.3f, 0, 270));
                        f4Var.setOnValueChangedListener(r5Var);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            w51Var = w51Var2;
                        } else {
                            long j12 = currentTimeMillis * 1000;
                            w51Var = w51Var2;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                f4Var.setValue(calendar.get(12));
                                e4Var.setValue(calendar.get(11));
                                uc0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.c5.g(null, null, 0L, 0L, 0, uc0Var, e4Var, f4Var);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(w04);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        u3Var.addView(p4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.a3 a3Var3 = a3Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(uc0Var, e4Var, f4Var, calendar, rv0Var, a3Var2, 1));
                        a3Var3.b(u3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var3.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var3;
                    }
                    a3Var.a.setOnHideListener(new ei.e0(w51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    w51Var.w = f3Var2;
                    w51Var.c(false);
                    break;
                }
                break;
            case 3:
                u71 u71Var = (u71) this.b;
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.c;
                if (u71Var.Z.g() != 0) {
                    rcVar.run(new ArrayList(u71Var.a0.values()));
                    u71Var.dismiss();
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
                q81 q81Var = sessionsActivity.a;
                if (q81Var != null) {
                    q81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.t7(i10));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(yh.x7.M0(((Long) this.c).longValue()));
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
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    break;
                }
                break;
            case 9:
                be1 be1Var = (be1) this.b;
                Context context3 = (Context) this.c;
                if (be1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var4 = new org.telegram.ui.ActionBar.a3(be1Var.getParentActivity(), null);
                    a3Var4.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.y0.q(textView3, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var4.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.i6.F.size();
                    while (i17 < size2) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) org.telegram.ui.ActionBar.i6.F.get(i17);
                        TLRPC.TL_theme tL_theme = h6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(h6Var);
                        }
                        i17++;
                    }
                    dc1 dc1Var = new dc1(context3, be1Var, arrayList2, new ArrayList(), a3Var4);
                    linearLayout2.addView(dc1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    dc1Var.x1(be1Var.fragmentView.getMeasuredWidth());
                    be1Var.showDialog(a3Var4.a);
                    break;
                }
                break;
            case 10:
                ui1 ui1Var = (ui1) this.b;
                Context context4 = (Context) this.c;
                tg.n1 n1Var = ui1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    ui1Var.M = null;
                }
                tg.n1 n1Var2 = new tg.n1(context4, ui1Var.a, null, 4, new ai.a1());
                TLRPC.User user = ui1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = ui1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i22 = 0; i22 < 2; i22++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i22]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new hh.b(i16);
                ui1Var.M = n1Var2;
                n1Var2.show();
                break;
            case 11:
                ci.d dVar = (ci.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.N && (cVar = lj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] m10 = cVar.m();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) cVar.d;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", m10);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new kj1(dVar, 0));
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
                    xVar2.n.f().addView(nVar, w7.x5.c(-1.0f, -1));
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
                qg.p2 p2Var = (qg.p2) this.b;
                ci.hd hdVar = (ci.hd) this.c;
                qg.m2[] m2VarArr = p2Var.H;
                if (m2VarArr != null && m2VarArr.length != 0 && p2Var.I != null && (j3 = p2Var.j(p2Var.n0, p2Var.o0)) != null) {
                    hdVar.run(j3);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.un.d0((bo) this.c, 41026, new org.telegram.ui.web.b1((qh.c) this.b, i14), null);
                break;
            case 16:
                rg.j0.V((rg.j0) this.b, (Context) this.c);
                break;
            case 17:
                tg.t0 t0Var2 = (tg.t0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = t0Var2.X;
                if (!arrayList3.isEmpty()) {
                    tg.e0 e0Var = t0Var2.a0;
                    if (!e0Var.N) {
                        e0Var.setLoading(true);
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
                        tg.t.a(chat2.id, arrayList4, new ai.e4(t0Var2, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(t0Var2, i15));
                        break;
                    }
                }
                break;
            case 18:
                tg.n1 n1Var3 = (tg.n1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = n1Var3.h0;
                int size4 = arrayList5.size();
                while (i17 < size4) {
                    Object obj7 = arrayList5.get(i17);
                    i17++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    n1Var3.n0.remove(l4);
                }
                n1Var3.W();
                n1Var3.Z.b(true, hashSet2, new tg.b1(n1Var3, i13), null);
                n1Var3.i0(true, true);
                n1Var3.X();
                break;
            case 19:
                tg.n1.S((tg.n1) this.b, (TLRPC.User) this.c, view);
                break;
            case 20:
                final ug.e eVar2 = (ug.e) this.b;
                final vg.a aVar = (vg.a) this.c;
                if (!eVar2.d) {
                    ((tg.c0) eVar2).r.dismiss();
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
                                    c0 c0Var = (c0) eVar2;
                                    AndroidUtilities.runOnUIThread(new w1(c0Var, 7), 200L);
                                    c0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    k.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
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
                                    c0 c0Var = (c0) eVar2;
                                    AndroidUtilities.runOnUIThread(new w1(c0Var, 7), 200L);
                                    c0Var.r.dismiss();
                                    break;
                                default:
                                    aVar.b(false);
                                    e eVar3 = eVar2;
                                    k.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.q(callback2, callback, i17), 2);
                    break;
                }
                break;
            case 21:
                vg.g gVar2 = (vg.g) this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                vg.f fVar2 = gVar2.s;
                if (fVar2 != null) {
                    tg.b0 b0Var = ((tg.v) fVar2).a;
                    b0Var.c0.remove(chat3);
                    b0Var.a0(true, true);
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
                xh.h4 h4Var = (xh.h4) this.b;
                yh.l7 l7Var = (yh.l7) this.c;
                h4Var.getClass();
                if (l7Var.f > 0) {
                    h4Var.presentFragment(new yh.x7());
                    break;
                }
                break;
            case 26:
                xh.g4.P((xh.g4) this.b, (xh.f4) this.c);
                break;
            case 27:
                xh.l4 l4Var = (xh.l4) this.b;
                ei.r4 r4Var = (ei.r4) this.c;
                HashSet hashSet3 = l4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = l4Var.Y.l;
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
                    l4Var.dismiss();
                    break;
                }
                break;
            case 28:
                xh.i4 i4Var = (xh.i4) this.b;
                org.telegram.messenger.kk kkVar = (org.telegram.messenger.kk) this.c;
                yh.m5 m5Var = i4Var.c.Y;
                m5Var.e = !m5Var.e;
                kkVar.run();
                m5Var.i(true);
                break;
            default:
                yh.g.X((yh.g) this.b, (Context) this.c, view);
                break;
        }
    }
}
