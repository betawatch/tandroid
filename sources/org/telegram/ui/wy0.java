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
import sg.p0;
import ug.c0;
import ug.j;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        org.telegram.ui.Components.vc0 vc0Var;
        cf.c cVar;
        rg.l2 j3;
        TL_stars.SavedStarGift savedStarGift;
        int i10 = 10;
        int i11 = 13;
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
                qq qqVar = new qq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                qqVar.X0 = new oz0(profileActivity, chat, qqVar);
                profileActivity.presentFragment(qqVar);
                break;
            case 1:
                q21 q21Var = (q21) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = q21Var.a[0].getText().toString();
                String obj2 = q21Var.a[3].getText().toString();
                String obj3 = q21Var.a[2].getText().toString();
                String obj4 = q21Var.a[1].getText().toString();
                String obj5 = q21Var.a[4].getText().toString();
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
                    if (q21Var.v == 2) {
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
                        org.telegram.ui.Components.ji0 ji0Var = new org.telegram.ui.Components.ji0(context, LocaleController.getString(R.string.ShareQrCode), u10.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        ji0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        q21Var.showDialog(ji0Var);
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
                    qv0 qv0Var = new qv0(8, y51Var, zArr);
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
                        org.telegram.ui.Components.vc0 vc0Var2 = new org.telegram.ui.Components.vc0(context2, null);
                        vc0Var2.setTextColor(w02);
                        vc0Var2.setTextOffset(AndroidUtilities.dp(10.0f));
                        vc0Var2.setItemCount(5);
                        org.telegram.ui.Components.g4 g4Var = new org.telegram.ui.Components.g4(context2, null);
                        g4Var.setItemCount(5);
                        g4Var.setTextColor(w02);
                        g4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.h4 h4Var = new org.telegram.ui.Components.h4(context2, null);
                        h4Var.setItemCount(5);
                        h4Var.setTextColor(w02);
                        h4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.w3 w3Var = new org.telegram.ui.Components.w3(context2, vc0Var2, g4Var, h4Var, 3);
                        w3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        w3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(w02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                        textView.setOnTouchListener(new ci.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        w3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        bi.c4 c4Var = new bi.c4(context2, 17);
                        linearLayout.addView(vc0Var2, w7.x5.l(0.5f, 0, 270));
                        vc0Var2.setMinValue(0);
                        vc0Var2.setMaxValue(365);
                        vc0Var2.setWrapSelectorWheel(false);
                        vc0Var2.setFormatter(new org.telegram.ui.Components.f(6));
                        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(vc0Var2, g4Var, h4Var, 17);
                        vc0Var2.setOnValueChangedListener(aVar);
                        g4Var.setMinValue(0);
                        g4Var.setMaxValue(23);
                        linearLayout.addView(g4Var, w7.x5.l(0.2f, 0, 270));
                        g4Var.setFormatter(new org.telegram.ui.Components.f(7));
                        g4Var.setOnValueChangedListener(aVar);
                        h4Var.setMinValue(0);
                        h4Var.setMaxValue(59);
                        h4Var.setValue(0);
                        h4Var.setFormatter(new org.telegram.ui.Components.f(8));
                        linearLayout.addView(h4Var, w7.x5.l(0.3f, 0, 270));
                        h4Var.setOnValueChangedListener(aVar);
                        if (currentTimeMillis <= 0 || currentTimeMillis == 2147483646) {
                            vc0Var = vc0Var2;
                        } else {
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
                                vc0Var = vc0Var2;
                                vc0Var.setValue(timeInMillis);
                            } else {
                                vc0Var = vc0Var2;
                            }
                        }
                        org.telegram.ui.Components.vc0 vc0Var3 = vc0Var;
                        org.telegram.ui.Components.e5.g(null, null, 0L, 0L, 0, vc0Var3, g4Var, h4Var);
                        c4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        c4Var.setGravity(17);
                        c4Var.setTextColor(w04);
                        c4Var.setTextSize(1, 14.0f);
                        c4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        c4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, w05, w06, w06));
                        c4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        w3Var.addView(c4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        c4Var.setOnClickListener(new org.telegram.ui.Components.n0(vc0Var3, g4Var, h4Var, calendar, qv0Var, a3Var2, 1));
                        a3Var2.b(w3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(w03);
                        f3Var.fixNavigationBar(w03);
                        a3Var = a3Var2;
                    }
                    a3Var.a.setOnHideListener(new fi.e0(y51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    y51Var.w = f3Var2;
                    y51Var.c(false);
                    break;
                }
                break;
            case 3:
                w71 w71Var = (w71) this.b;
                org.telegram.ui.Components.tc tcVar = (org.telegram.ui.Components.tc) this.c;
                if (w71Var.Z.g() != 0) {
                    tcVar.run(new ArrayList(w71Var.a0.values()));
                    w71Var.dismiss();
                    break;
                }
                break;
            case 4:
                SessionsActivity sessionsActivity = (SessionsActivity) this.b;
                ((AlertDialog$Builder) this.c).a.L0.run();
                Integer num = (Integer) view.getTag();
                if (num.intValue() == 0) {
                    i17 = 7;
                } else if (num.intValue() == 1) {
                    i17 = 90;
                } else if (num.intValue() == 2) {
                    i17 = 183;
                } else if (num.intValue() == 3) {
                    i17 = 365;
                }
                TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
                setauthorizationttl.authorization_ttl_days = i17;
                sessionsActivity.v = i17;
                t81 t81Var = sessionsActivity.a;
                if (t81Var != null) {
                    t81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new bi.c7(8));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(zh.v7.M0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                ga1 ga1Var = (ga1) this.b;
                ya1 ya1Var = (ya1) this.c;
                bb1 bb1Var = ga1Var.d0;
                bb1Var.getOrCreateStoryViewer().C(bb1Var.getParentActivity(), ya1Var.b(), bb1Var.z0, bi.d9.a(bb1Var.S));
                break;
            case 7:
                ka1 ka1Var = (ka1) this.b;
                lg.f fVar = (lg.f) this.c;
                int i19 = ka1Var.c;
                la1 la1Var = ka1Var.d;
                org.telegram.ui.Components.s00 s00Var = ka1Var.a;
                if (s00Var.c) {
                    ArrayList arrayList = la1Var.n;
                    jg.g gVar = la1Var.c;
                    int size = arrayList.size();
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i17 = 1;
                        } else if (i20 == i19 || !((ka1) arrayList.get(i20)).a.c || !((ka1) arrayList.get(i20)).a.b) {
                            i20++;
                        }
                    }
                    la1Var.f();
                    if (i17 != 0) {
                        AndroidUtilities.shakeView(s00Var);
                        break;
                    } else {
                        s00Var.setChecked(!s00Var.b);
                        fVar.n = s00Var.b;
                        la1Var.b.z();
                        if (la1Var.r.c > 0 && i19 < gVar.d.size()) {
                            ((lg.f) gVar.d.get(i19)).n = s00Var.b;
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
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new qv0(i10, jb1Var, uyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                uyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                    break;
                }
                break;
            case 9:
                be1 be1Var = (be1) this.b;
                Context context3 = (Context) this.c;
                if (be1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(be1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.w1.q(textView3, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false), 1, 20.0f);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new ci.d(2));
                    a3Var3.b(linearLayout2);
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
                    dc1 dc1Var = new dc1(context3, be1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(dc1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    dc1Var.w1(be1Var.fragmentView.getMeasuredWidth());
                    be1Var.showDialog(a3Var3.a);
                    break;
                }
                break;
            case 10:
                ui1 ui1Var = (ui1) this.b;
                Context context4 = (Context) this.c;
                ug.n1 n1Var = ui1Var.M;
                if (n1Var != null) {
                    n1Var.dismiss();
                    ui1Var.M = null;
                }
                ug.n1 n1Var2 = new ug.n1(context4, ui1Var.a, null, 4, new bi.s0());
                TLRPC.User user = ui1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = ui1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i21 = 0; i21 < 2; i21++) {
                    n1Var2.C0.add(Long.valueOf(jArr[i21]));
                }
                n1Var2.h0(false, true);
                n1Var2.D0 = new ih.b(i16);
                ui1Var.M = n1Var2;
                n1Var2.show();
                break;
            case 11:
                di.d dVar = (di.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar.N && (cVar = lj1.d) != null) {
                    dVar.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j14 = cVar.j();
                        com.google.android.gms.internal.clearcut.u0 u0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) cVar.d;
                        com.google.android.gms.common.api.internal.t0 t0Var = u0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", j14);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new b7(cVar, dVar, iArr, 24)).addOnFailureListener(new kj1(dVar, 0));
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar.setLoading(false);
                        return;
                    }
                }
                break;
            case 12:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) this.b;
                x xVar = (x) this.c;
                lVar.b = true;
                xVar.run();
                lVar.w.Y2.N(true);
                break;
            case 13:
                qg.x xVar2 = (qg.x) this.b;
                Context context5 = (Context) this.c;
                if (!xVar2.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar2.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar2.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    qg.n nVar = new qg.n(xVar2, context5, createBitmap);
                    xVar2.n.f().addView(nVar, w7.x5.c(-1.0f, -1));
                    qg.u uVar = xVar2.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new di.e5(uVar, i12));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.pr.f);
                    duration.addUpdateListener(new ki.a(nVar, i11));
                    duration.start();
                    xVar2.n.a();
                    xVar2.dismiss();
                    break;
                }
                break;
            case 14:
                rg.o2 o2Var = (rg.o2) this.b;
                di.hd hdVar = (di.hd) this.c;
                rg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j3 = o2Var.j(o2Var.n0, o2Var.o0)) != null) {
                    hdVar.run(j3);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.tn.d0((co) this.c, 41026, new org.telegram.ui.web.b1((rh.c) this.b, i14), null);
                break;
            case 16:
                sg.k0.V((sg.k0) this.b, (Context) this.c);
                break;
            case 17:
                ug.t0 t0Var2 = (ug.t0) this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                ArrayList arrayList3 = t0Var2.X;
                if (!arrayList3.isEmpty()) {
                    ug.e0 e0Var = t0Var2.a0;
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
                        ug.t.a(chat2.id, arrayList4, new bi.r3(t0Var2, chat2, arrayList4, hashSet, 16), new org.telegram.ui.web.b1(t0Var2, i15));
                        break;
                    }
                }
                break;
            case 18:
                ug.n1 n1Var3 = (ug.n1) this.b;
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
                n1Var3.Z.b(true, hashSet2, new ug.b1(n1Var3, i13), null);
                n1Var3.i0(true, true);
                n1Var3.X();
                break;
            case 19:
                ug.n1.S((ug.n1) this.b, (TLRPC.User) this.c, view);
                break;
            case 20:
                final vg.e eVar2 = (vg.e) this.b;
                final wg.a aVar2 = (wg.a) this.c;
                if (!eVar2.d) {
                    ((ug.c0) eVar2).r.dismiss();
                    break;
                } else if (!aVar2.a.N) {
                    aVar2.b(true);
                    String str3 = eVar2.h;
                    Utilities.Callback callback = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i17) {
                                case 0:
                                    aVar2.b(false);
                                    c0 c0Var = (c0) eVar2;
                                    AndroidUtilities.runOnUIThread(new p0(c0Var, 10), 200L);
                                    c0Var.r.dismiss();
                                    break;
                                default:
                                    aVar2.b(false);
                                    e eVar3 = eVar2;
                                    j.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() { // from class: vg.d
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj8) {
                            switch (i18) {
                                case 0:
                                    aVar2.b(false);
                                    c0 c0Var = (c0) eVar2;
                                    AndroidUtilities.runOnUIThread(new p0(c0Var, 10), 200L);
                                    c0Var.r.dismiss();
                                    break;
                                default:
                                    aVar2.b(false);
                                    e eVar3 = eVar2;
                                    j.c((TLRPC.TL_error) obj8, eVar3.n, eVar3.c, new c(eVar3, 1));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ug.p(callback2, callback, i17), 2);
                    break;
                }
                break;
            case 21:
                wg.g gVar2 = (wg.g) this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                wg.f fVar2 = gVar2.s;
                if (fVar2 != null) {
                    ug.b0 b0Var = ((ug.v) fVar2).a;
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
                yh.c.P((yh.c) this.b, (TL_stars.TL_StarGiftAuctionAcquiredGift) this.c);
                break;
            case 25:
                yh.g4 g4Var2 = (yh.g4) this.b;
                zh.j7 j7Var = (zh.j7) this.c;
                g4Var2.getClass();
                if (j7Var.f > 0) {
                    g4Var2.presentFragment(new zh.v7());
                    break;
                }
                break;
            case 26:
                yh.f4.P((yh.f4) this.b, (yh.e4) this.c);
                break;
            case 27:
                yh.k4 k4Var = (yh.k4) this.b;
                fi.s4 s4Var = (fi.s4) this.c;
                HashSet hashSet3 = k4Var.Z;
                if (!hashSet3.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it = hashSet3.iterator();
                    while (it.hasNext()) {
                        long longValue = ((Long) it.next()).longValue();
                        ArrayList arrayList7 = k4Var.Y.l;
                        int size5 = arrayList7.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 < size5) {
                                Object obj8 = arrayList7.get(i22);
                                i22++;
                                savedStarGift = (TL_stars.SavedStarGift) obj8;
                                int i23 = savedStarGift.msg_id;
                                if ((i23 == 0 || i23 != longValue) && savedStarGift.saved_id != longValue) {
                                }
                            } else {
                                savedStarGift = null;
                            }
                        }
                        if (savedStarGift != null) {
                            arrayList6.add(savedStarGift);
                        }
                    }
                    s4Var.run(arrayList6);
                    k4Var.dismiss();
                    break;
                }
                break;
            case 28:
                yh.h4 h4Var2 = (yh.h4) this.b;
                org.telegram.messenger.jk jkVar = (org.telegram.messenger.jk) this.c;
                zh.j5 j5Var = h4Var2.c.Y;
                j5Var.e = !j5Var.e;
                jkVar.run();
                j5Var.i(true);
                break;
            default:
                zh.g.X((zh.g) this.b, (Context) this.c, view);
                break;
        }
    }
}
