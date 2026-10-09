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
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import rg.x1;
import tg.b0;
import tg.i;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        ci.u5 u5Var;
        qg.l2 j3;
        int i10 = 4;
        int i11 = 10;
        int i12 = 14;
        int i13 = 5;
        int i14 = 11;
        org.telegram.ui.ActionBar.a3 a3Var = null;
        int i15 = 2;
        final int i16 = 1;
        final int i17 = 0;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                long j10 = profileActivity.e1;
                long j11 = profileActivity.E1;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                TLRPC.ChannelParticipant channelParticipant = profileActivity.G2;
                nq nqVar = new nq(j10, j11, null, tL_chatBannedRights, channelParticipant != null ? channelParticipant.banned_rights : null, "", 1, true, false, null);
                nqVar.X0 = new mz0(profileActivity, chat, nqVar);
                profileActivity.presentFragment(nqVar);
                break;
            case 1:
                n21 n21Var = (n21) this.b;
                Context context = (Context) this.c;
                StringBuilder sb2 = new StringBuilder();
                String obj = n21Var.a[0].getText().toString();
                String obj2 = n21Var.a[3].getText().toString();
                String obj3 = n21Var.a[2].getText().toString();
                String obj4 = n21Var.a[1].getText().toString();
                String obj5 = n21Var.a[4].getText().toString();
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
                    if (n21Var.v == 2) {
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
                        StringBuilder v = a1.g.v(str);
                        v.append(sb2.toString());
                        org.telegram.ui.Components.oj0 oj0Var = new org.telegram.ui.Components.oj0(context, LocaleController.getString(R.string.ShareQrCode), v.toString(), LocaleController.getString(R.string.QRCodeLinkHelpProxy), true);
                        oj0Var.h.setImageBitmap(SvgHelper.getBitmap(AndroidUtilities.readRes(R.raw.qr_dog), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f), false));
                        n21Var.showDialog(oj0Var);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 2:
                z51 z51Var = (z51) this.b;
                Context context2 = (Context) this.c;
                if (z51Var.w == null) {
                    boolean[] zArr = new boolean[1];
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    ls0 ls0Var = new ls0(9, z51Var, zArr);
                    Pattern pattern = org.telegram.ui.Components.g5.a;
                    if (context2 != null) {
                        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false);
                        int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.h5, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ji, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ni, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.E8, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G8, false);
                        org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false);
                        int x04 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false);
                        int x05 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
                        int x06 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Qh, false);
                        org.telegram.ui.ActionBar.a3 a3Var2 = new org.telegram.ui.ActionBar.a3(context2, null);
                        a3Var2.a();
                        org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(context2, null);
                        ud0Var.setTextColor(x02);
                        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
                        ud0Var.setItemCount(5);
                        org.telegram.ui.Components.i4 i4Var = new org.telegram.ui.Components.i4(context2, null);
                        i4Var.setItemCount(5);
                        i4Var.setTextColor(x02);
                        i4Var.setTextOffset(-AndroidUtilities.dp(10.0f));
                        org.telegram.ui.Components.j4 j4Var = new org.telegram.ui.Components.j4(context2, null);
                        j4Var.setItemCount(5);
                        j4Var.setTextColor(x02);
                        j4Var.setTextOffset(-AndroidUtilities.dp(34.0f));
                        org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, ud0Var, i4Var, j4Var, 3);
                        y3Var.setOrientation(1);
                        FrameLayout frameLayout = new FrameLayout(context2);
                        y3Var.addView(frameLayout, w7.x5.t(-1, -2, 51, 22, 0, 0, 4));
                        TextView textView = new TextView(context2);
                        textView.setText(LocaleController.getString(R.string.SetEmojiStatusUntilTitle));
                        textView.setTextColor(x02);
                        textView.setTextSize(1, 20.0f);
                        textView.setTypeface(AndroidUtilities.bold());
                        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
                        textView.setOnTouchListener(new bi.d(10));
                        LinearLayout linearLayout = new LinearLayout(context2);
                        linearLayout.setOrientation(0);
                        linearLayout.setWeightSum(1.0f);
                        y3Var.addView(linearLayout, w7.x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                        Calendar calendar = Calendar.getInstance();
                        ai.q4 q4Var = new ai.q4(context2, 17);
                        linearLayout.addView(ud0Var, w7.x5.l(0.5f, 0, 270));
                        ud0Var.setMinValue(0);
                        ud0Var.setMaxValue(365);
                        ud0Var.setWrapSelectorWheel(false);
                        ud0Var.setFormatter(new nr(16));
                        ai.r5 r5Var = new ai.r5(ud0Var, i4Var, j4Var, 17);
                        ud0Var.setOnValueChangedListener(r5Var);
                        i4Var.setMinValue(0);
                        i4Var.setMaxValue(23);
                        linearLayout.addView(i4Var, w7.x5.l(0.2f, 0, 270));
                        i4Var.setFormatter(new nr(17));
                        i4Var.setOnValueChangedListener(r5Var);
                        j4Var.setMinValue(0);
                        j4Var.setMaxValue(59);
                        j4Var.setValue(0);
                        j4Var.setFormatter(new nr(18));
                        linearLayout.addView(j4Var, w7.x5.l(0.3f, 0, 270));
                        j4Var.setOnValueChangedListener(r5Var);
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
                                j4Var.setValue(calendar.get(12));
                                i4Var.setValue(calendar.get(11));
                                ud0Var.setValue(timeInMillis);
                            }
                        }
                        org.telegram.ui.Components.g5.f(null, null, 0L, 0L, 0, ud0Var, i4Var, j4Var);
                        q4Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                        q4Var.setGravity(17);
                        q4Var.setTextColor(x04);
                        q4Var.setTextSize(1, 14.0f);
                        q4Var.setTypeface(AndroidUtilities.bold());
                        int dp = AndroidUtilities.dp(8.0f);
                        q4Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, x05, x06, x06));
                        q4Var.setText(LocaleController.getString(R.string.SetEmojiStatusUntilButton));
                        y3Var.addView(q4Var, w7.x5.t(-1, 48, 83, 16, 15, 16, 16));
                        q4Var.setOnClickListener(new org.telegram.ui.Components.m0(ud0Var, i4Var, j4Var, calendar, ls0Var, a3Var2, 1));
                        a3Var2.b(y3Var);
                        org.telegram.ui.ActionBar.f3 f3Var = a3Var2.a;
                        f3Var.show();
                        f3Var.setBackgroundColor(x03);
                        f3Var.fixNavigationBar(x03);
                        a3Var = a3Var2;
                    }
                    a3Var.a.setOnHideListener(new ei.e0(z51Var, zArr, 11));
                    org.telegram.ui.ActionBar.f3 f3Var2 = a3Var.a;
                    f3Var2.show();
                    z51Var.w = f3Var2;
                    z51Var.c(false);
                    break;
                }
                break;
            case 3:
                x71 x71Var = (x71) this.b;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.c;
                if (x71Var.Z.g() != 0) {
                    wcVar.run(new ArrayList(x71Var.a0.values()));
                    x71Var.dismiss();
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
                u81 u81Var = sessionsActivity.a;
                if (u81Var != null) {
                    u81Var.l();
                }
                sessionsActivity.getConnectionsManager().sendRequest(setauthorizationttl, new ai.v7(r6));
                break;
            case 5:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.b;
                editTextBoldCursor.setText(yh.p7.N0(((Long) this.c).longValue()));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                break;
            case 6:
                ga1 ga1Var = (ga1) this.b;
                ya1 ya1Var = (ya1) this.c;
                bb1 bb1Var = ga1Var.d0;
                bb1Var.getOrCreateStoryViewer().C(bb1Var.getParentActivity(), ya1Var.b(), bb1Var.z0, ai.v9.a(bb1Var.S));
                break;
            case 7:
                ka1 ka1Var = (ka1) this.b;
                kg.f fVar = (kg.f) this.c;
                int i18 = ka1Var.c;
                la1 la1Var = ka1Var.d;
                org.telegram.ui.Components.i10 i10Var = ka1Var.a;
                if (i10Var.c) {
                    ArrayList arrayList = la1Var.n;
                    ig.g gVar = la1Var.c;
                    int size = arrayList.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 >= size) {
                            i17 = 1;
                        } else if (i19 == i18 || !((ka1) arrayList.get(i19)).a.c || !((ka1) arrayList.get(i19)).a.b) {
                            i19++;
                        }
                    }
                    la1Var.f();
                    if (i17 != 0) {
                        AndroidUtilities.shakeView(i10Var);
                        break;
                    } else {
                        i10Var.setChecked(!i10Var.b);
                        fVar.n = i10Var.b;
                        la1Var.b.z();
                        if (la1Var.r.c > 0 && i18 < gVar.d.size()) {
                            ((kg.f) gVar.d.get(i18)).n = i10Var.b;
                            gVar.z();
                            break;
                        }
                    }
                }
                break;
            case 8:
                jb1 jb1Var = (jb1) this.b;
                ty tyVar = (ty) this.c;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tyVar.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.LocalDatabaseClearText);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.CacheClear), new ls0(i14, jb1Var, tyVar));
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                tyVar.showDialog(b2Var);
                TextView textView2 = (TextView) b2Var.d(-1);
                if (textView2 != null) {
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q7, false));
                    break;
                }
                break;
            case 9:
                ce1 ce1Var = (ce1) this.b;
                Context context3 = (Context) this.c;
                if (ce1Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a3 a3Var3 = new org.telegram.ui.ActionBar.a3(ce1Var.getParentActivity(), null);
                    a3Var3.a();
                    LinearLayout linearLayout2 = new LinearLayout(context3);
                    linearLayout2.setOrientation(1);
                    TextView textView3 = new TextView(context3);
                    textView3.setText(LocaleController.getString(R.string.ChooseTheme));
                    org.telegram.messenger.q.m(20.0f, org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false), 1, textView3);
                    linearLayout2.addView(textView3, w7.x5.t(-1, -2, 51, 22, 12, 22, 4));
                    textView3.setOnTouchListener(new bi.d(2));
                    a3Var3.b(linearLayout2);
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
                    ec1 ec1Var = new ec1(context3, ce1Var, arrayList2, new ArrayList(), a3Var3);
                    linearLayout2.addView(ec1Var, w7.x5.k(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    ec1Var.y1(ce1Var.fragmentView.getMeasuredWidth());
                    ce1Var.showDialog(a3Var3.a);
                    break;
                }
                break;
            case 10:
                wi1 wi1Var = (wi1) this.b;
                Context context4 = (Context) this.c;
                tg.m1 m1Var = wi1Var.M;
                if (m1Var != null) {
                    m1Var.dismiss();
                    wi1Var.M = null;
                }
                tg.m1 m1Var2 = new tg.m1(context4, wi1Var.a, null, 4, new ai.a1());
                TLRPC.User user = wi1Var.c;
                long j13 = user != null ? user.id : 0L;
                TLRPC.User user2 = wi1Var.d;
                long[] jArr = {j13, user2 != null ? user2.id : 0L};
                for (int i20 = 0; i20 < 2; i20++) {
                    m1Var2.C0.add(Long.valueOf(jArr[i20]));
                }
                m1Var2.i0(false, true);
                m1Var2.D0 = new hh.b(i15);
                wi1Var.M = m1Var2;
                m1Var2.show();
                break;
            case 11:
                ci.d dVar = (ci.d) this.b;
                org.telegram.ui.Wallet.i2 i2Var = (org.telegram.ui.Wallet.i2) this.c;
                if (!dVar.N) {
                    i2Var.dismiss();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) this.b;
                org.telegram.ui.Wallet.h2 h2Var = (org.telegram.ui.Wallet.h2) this.c;
                if (!z1Var.m) {
                    h2Var.dismiss();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Wallet.y3 y3Var2 = (org.telegram.ui.Wallet.y3) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    y3Var2.dismiss();
                    org.telegram.ui.Wallet.s8 s8Var = new org.telegram.ui.Wallet.s8();
                    s8Var.g0(nftitem);
                    U.presentFragment(s8Var);
                    break;
                }
                break;
            case 14:
                Runnable runnable = (Runnable) this.b;
                org.telegram.ui.Wallet.i2[] i2VarArr = (org.telegram.ui.Wallet.i2[]) this.c;
                runnable.run();
                i2VarArr[0].dismiss();
                break;
            case 15:
                org.telegram.ui.Wallet.a5.Y((org.telegram.ui.Wallet.a5) this.b, (Context) this.c, view);
                break;
            case 16:
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) this.b;
                TextView textView4 = (TextView) this.c;
                a2Var.c(!a2Var.b(), true);
                textView4.setVisibility(a2Var.b() ? 0 : 8);
                break;
            case 17:
                ci.d dVar2 = (ci.d) this.b;
                int[] iArr = (int[]) this.c;
                if (!dVar2.N && (u5Var = nj1.d) != null) {
                    dVar2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] h = u5Var.h();
                        com.google.android.gms.internal.clearcut.u0 u0Var = new com.google.android.gms.internal.clearcut.u0(applicationContext, com.google.android.gms.common.api.i.c);
                        String str2 = (String) u5Var.c;
                        com.google.android.gms.common.api.internal.t0 t0Var = u0Var.h;
                        b8.e eVar = new b8.e(t0Var, str2, "/tg-wear-auth/answer", h);
                        t0Var.b.d(0, eVar);
                        n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new a7(u5Var, dVar2, iArr, 24)).addOnFailureListener(new mj1(dVar2, 0));
                        break;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        dVar2.setLoading(false);
                        return;
                    }
                }
                break;
            case 18:
                org.telegram.ui.web.k kVar = (org.telegram.ui.web.k) this.b;
                y yVar = (y) this.c;
                kVar.b = true;
                yVar.run();
                kVar.w.W2.N(true);
                break;
            case 19:
                pg.x xVar = (pg.x) this.b;
                Context context5 = (Context) this.c;
                if (!xVar.n.c()) {
                    Bitmap snapshotView = AndroidUtilities.snapshotView(xVar.n.e());
                    Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(-16777216);
                    xVar.n.b(canvas);
                    canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
                    snapshotView.recycle();
                    pg.n nVar = new pg.n(xVar, context5, createBitmap);
                    xVar.n.f().addView(nVar, w7.x5.d(-1.0f, -1));
                    pg.u uVar = xVar.n;
                    Objects.requireNonNull(uVar);
                    nVar.setColorListener(new ci.c5(uVar, i10));
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.hs.f);
                    duration.addUpdateListener(new org.telegram.ui.Components.voip.r0(nVar, i14));
                    duration.start();
                    xVar.n.a();
                    xVar.dismiss();
                    break;
                }
                break;
            case 20:
                qg.o2 o2Var = (qg.o2) this.b;
                ci.ed edVar = (ci.ed) this.c;
                qg.l2[] l2VarArr = o2Var.H;
                if (l2VarArr != null && l2VarArr.length != 0 && o2Var.I != null && (j3 = o2Var.j(o2Var.n0, o2Var.o0)) != null) {
                    edVar.run(j3);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.lo.g0((zn) this.c, 41026, new ii.q1((qh.c) this.b, i11), null);
                break;
            case 22:
                rg.j0.W((rg.j0) this.b, (Context) this.c);
                break;
            case 23:
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
                        tg.s.a(chat2.id, arrayList4, new ai.f4(s0Var, chat2, arrayList4, hashSet, 17), new ii.q1(s0Var, i12));
                        break;
                    }
                }
                break;
            case 24:
                tg.m1 m1Var3 = (tg.m1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                HashSet hashSet2 = m1Var3.h0;
                int size4 = arrayList5.size();
                while (i17 < size4) {
                    Object obj7 = arrayList5.get(i17);
                    i17++;
                    Long l4 = (Long) obj7;
                    l4.getClass();
                    hashSet2.remove(l4);
                    m1Var3.n0.remove(l4);
                }
                m1Var3.X();
                m1Var3.Z.b(true, hashSet2, new tg.a1(m1Var3, i13), null);
                m1Var3.j0(true, true);
                m1Var3.Y();
                break;
            case 25:
                tg.m1.T((tg.m1) this.b, (TLRPC.User) this.c, view);
                break;
            case 26:
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
                                    AndroidUtilities.runOnUIThread(new x1(b0Var, 11), 200L);
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
                            switch (i16) {
                                case 0:
                                    aVar.b(false);
                                    b0 b0Var = (b0) eVar2;
                                    AndroidUtilities.runOnUIThread(new x1(b0Var, 11), 200L);
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
            case 27:
                vg.g gVar2 = (vg.g) this.b;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                vg.f fVar2 = gVar2.v;
                if (fVar2 != null) {
                    tg.a0 a0Var = ((tg.u) fVar2).a;
                    a0Var.c0.remove(chat3);
                    a0Var.b0(true, true);
                    break;
                }
                break;
            case 28:
                ((ii.q1) this.b).run((TLRPC.TL_payments_checkedGiftCode) this.c);
                break;
            default:
                ((ii.q1) this.b).run((TLRPC.Chat) this.c);
                break;
        }
    }
}
