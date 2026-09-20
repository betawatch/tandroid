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
import rg.q1;
import tg.b0;
import tg.i;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        int i10;
        cf.c cVar;
        qg.k2 j3;
        TL_stars.SavedStarGift savedStarGift;
        int i11 = 8;
        int i12 = 10;
        int i13 = 4;
        int i14 = 7;
        int i15 = 5;
        int i16 = 11;
        int i17 = 2;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        final int i18 = 0;
        final int i19 = 1;
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
                        org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ti0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        o21Var.showDialog(ti0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                y51 y51Var = (y51) this.b;
                Context context2 = (Context) this.c;
                if (y51Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    rv0 rv0Var = new rv0(i11, y51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.d5.a;
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
                        org.telegram.ui.Components.cd0 cd0Var = new org.telegram.ui.Components.cd0(context2, null);
                        cd0Var.setTextColor(w02);
                        cd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        cd0Var.setItemCount(5);
                        org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context2, null);
                        f4Var.setItemCount(5);
                        f4Var.setTextColor(w02);
                        f4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context2, null);
                        g4Var.setItemCount(5);
                        g4Var.setTextColor(w02);
                        g4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.v3 v3Var = new org.telegram.ui.Components.v3(context2, cd0Var, f4Var, g4Var, 3);
                        v3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        v3Var.addView(frameLayout, w7.y5.t(-1, -2, 51, 22, 0, 0, 4));
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
                        v3Var.addView(linearLayout, w7.y5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.p4 p4Var = new ai.p4(context2, 17);
                        linearLayout.addView(cd0Var, w7.y5.l(0.5f, 0, 270));
                        cd0Var.setMinValue(0);
                        cd0Var.setMaxValue(365);
                        cd0Var.setWrapSelectorWheel(false);
                        cd0Var.setFormatter(new es(13));
                        ai.r5 r5Var = new ai.r5(cd0Var, f4Var, g4Var, 17);
                        cd0Var.setOnValueChangedListener(r5Var);
                        f4Var.setMinValue(0);
                        f4Var.setMaxValue(23);
                        linearLayout.addView(f4Var, w7.y5.l(0.2f, 0, 270));
                        f4Var.setFormatter(new es(14));
                        f4Var.setOnValueChangedListener(r5Var);
                        g4Var.setMinValue(0);
                        g4Var.setMaxValue(59);
                        g4Var.setValue(0);
                        g4Var.setFormatter(new es(15));
                        linearLayout.addView(g4Var, w7.y5.l(0.3f, 0, 270));
                        g4Var.setOnValueChangedListener(r5Var);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            i10 = w04;
                        } else {
                            long j12 = currentTimeMillis * 1000;
                            calendar.setTimeInMillis(System.currentTimeMillis());
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            calendar.set(11, 0);
                            i10 = w04;
                            int timeInMillis = (int) ((j12 - calendar.getTimeInMillis()) / 86400000);
                            calendar.setTimeInMillis(j12);
                            if (timeInMillis >= 0) {
                                g4Var.setValue(calendar.get(12));
                                f4Var.setValue(calendar.get(11));
                                cd0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.d5.g(null, null, 0L, 0L, 0, cd0Var, f4Var, g4Var);
                        p4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        p4Var.setGravity(17);
                        p4Var.setTextColor(i10);
                        p4Var.setTextSize(1, 14.0f);
                        p4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        p4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        p4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        v3Var.addView(p4Var, w7.y5.t(-1, 48, 83, 16, 15, 16, 16));
                        org.telegram.ui.ActionBar.a3 a3Var3 = a3Var2;
                        p4Var.setOnClickListener(new org.telegram.ui.Components.m0(cd0Var, f4Var, g4Var, calendar, rv0Var, a3Var2, 1));
                        a3Var3.b(v3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var3.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var3;
                    }
                    a3Var.a.setOnHideListener(new ei.e0(y51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    y51Var.w = f3Var2;
                    y51Var.c(false);
                    break;
                }
                break;
            case 3:
                w71 w71Var = (w71) this.b;
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.c;
                if (w71Var.Z.g() != 0) {
                    scVar.run(new ArrayList(w71Var.a0.values()));
                    w71Var.dismiss();
                    break;
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                int i20 = num.intValue() == 0 ? 7 : num.intValue() == 1 ? 90 : num.intValue() == 2 ? 183 : num.intValue() == 3 ? 365 : 0;
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i20;
                sessionsActivity.v = i20;
                t81 t81Var = sessionsActivity.a;
                if (t81Var != null) {
                    t81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.t7(i11));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(yh.w7.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                ga1 ga1Var = (ga1) this.b;
                ya1 ya1Var = (ya1) this.c;
                bb1 bb1Var = ga1Var.d0;
                bb1Var.getOrCreateStoryViewer().C(bb1Var.getParentActivity(), ya1Var.b(), bb1Var.z0, ai.u9.a(bb1Var.S));
                break;
            case 7:
                ka1 ka1Var = (ka1) this.b;
                kg.f fVar = (kg.f) this.c;
                int i21 = ka1Var.c;
                la1 la1Var = ka1Var.d;
                org.telegram.ui.Components.s00 s00Var = ka1Var.a;
                if (s00Var.c) {
                    ArrayList arrayList = la1Var.n;
                    ig.g gVar = la1Var.c;
                    int size = arrayList.size();
                    int i22 = 0;
                    while (true) {
                        if (i22 >= size) {
                            i18 = 1;
                        } else if (i22 == i21 || !((ka1) arrayList.get(i22)).a.c || !((ka1) arrayList.get(i22)).a.b) {
                            i22++;
                        }
                    }
                    la1Var.f();
                    if (i18 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        break;
                    } else {
                        s00Var.setChecked(true ^ s00Var.b);
                        fVar.n = s00Var.b;
                        la1Var.b.z();
                        if (la1Var.r.c > 0 && i21 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i21)).n = s00Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 8:
                jb1 jb1Var = (jb1) this.b;
                uy uyVar = (uy) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uyVar.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new rv0(i12, jb1Var, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 9:
                ce1 ce1Var = (ce1) this.b;
                Context context3 = (Context) this.c;
                if (ce1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var4 = new org.telegram.ui.ActionBar.a3(ce1Var.getParentActivity(), null);
                    a3Var4.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.l0.p(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.y5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var4.b(linearLayout2);
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = org.telegram.ui.ActionBar.j6.F.size();
                    while (i18 < size2) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) org.telegram.ui.ActionBar.j6.F.get(i18);
                        TLRPC.TL_theme tL_theme = i6Var.F;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList2.add(i6Var);
                        }
                        i18++;
                    }
                    ec1 ec1Var = new ec1(context3, ce1Var, arrayList2, new ArrayList(), a3Var4);
                    linearLayout2.addView(ec1Var, w7.y5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ec1Var.y1(ce1Var.fragmentView.getMeasuredWidth());
                    ce1Var.showDialog(a3Var4.a);
                    break;
                }
                break;
            case 10:
                ti1 ti1Var = (ti1) this.b;
                Context context4 = (Context) this.c;
                tg.m1 m1Var = ti1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    ti1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, ti1Var.a, null, 4, new ai.a1());
                TLRPC.User user = ti1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = ti1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i23 = 0; i23 < 2; i23++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i23]));
                }
                m1Var2.h0(false, true);
                m1Var2.D0 = new hh.b(i17);
                ti1Var.M = m1Var2;
                m1Var2.show();
                break;
            case 11:
                ci.d dVar = (ci.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.N && (cVar = kj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] l4 = cVar.l();
                        com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) cVar.d;
                        com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", l4);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new jj1(dVar, 0));
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
                    nVar.setColorListener(new ci.e5(uVar, i13));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.qr.f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, i16));
                    duration.start();
                    xVar2.n.a();
                    xVar2.dismiss();
                    break;
                }
                break;
            case 14:
                qg.n2 n2Var = (qg.n2) this.b;
                ci.hd hdVar = (ci.hd) this.c;
                qg.k2[] k2VarArr = n2Var.H;
                if (k2VarArr != null && k2VarArr.length != 0 && n2Var.I != null && (j3 = n2Var.j(n2Var.n0, n2Var.o0)) != null) {
                    hdVar.run(j3);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.un.d0((zn) this.c, 41026, new org.telegram.ui.web.b1((qh.c) this.b, i14), null);
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
                        while (i18 < size3) {
                            Object obj6 = arrayList3.get(i18);
                            i18++;
                            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) obj6;
                            arrayList4.add(Integer.valueOf(tL_myBoost.slot));
                            hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(tL_myBoost.peer)));
                        }
                        tg.s.a(chat2.id, arrayList4, new ai.e4(s0Var, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(s0Var, i16));
                        break;
                    }
                }
                break;
            case 18:
                tg.m1 m1Var3 = (tg.m1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = m1Var3.h0;
                int size4 = arrayList5.size();
                while (i18 < size4) {
                    Object obj7 = arrayList5.get(i18);
                    i18++;
                    Long l10 = (Long) obj7;
                    l10.getClass();
                    hashSet2.remove(l10);
                    m1Var3.n0.remove(l10);
                }
                m1Var3.W();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, i15), null);
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
                            switch (i18) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
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
                            switch (i19) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new q1(b0Var, 8), 200L);
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
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new tg.o(callback2, callback, i18), 2);
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
                yh.k7 k7Var = (yh.k7) this.c;
                i4Var.getClass();
                if (k7Var.f > 0) {
                    i4Var.presentFragment(new yh.w7());
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
                        int i24 = 0;
                        while (true) {
                            if (i24 < size5) {
                                Object obj8 = arrayList7.get(i24);
                                i24++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i25 = savedStarGift.msg_id;
                                if ((i25 == 0 || i25 != longValue) && savedStarGift.saved_id != longValue) {
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
                org.telegram.messenger.jk jkVar = (org.telegram.messenger.jk) this.c;
                yh.l5 l5Var = j4Var.c.Y;
                l5Var.e = !l5Var.e;
                jkVar.run();
                l5Var.i(true);
                break;
            default:
                yh.g.X((yh.g) this.b, (Context) this.c, view);
                break;
        }
    }
}
