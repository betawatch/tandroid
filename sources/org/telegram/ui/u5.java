package org.telegram.ui;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c5, code lost:
    
        if (r14.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        org.telegram.ui.Components.p41 p41Var;
        org.telegram.ui.Components.fz0 fz0Var;
        int i10 = this.a;
        int i11 = -1;
        int i12 = 3;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                y5 y5Var = (y5) obj2;
                org.telegram.messenger.s2 s2Var = (org.telegram.messenger.s2) obj;
                ArrayList arrayList = y5Var.c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i7 = 0;
                    } else if (((x5) arrayList.get(i13)).c == null || ((x5) arrayList.get(i13)).c.a != s2Var.a) {
                        i13++;
                    } else {
                        i7 = i13;
                    }
                }
                v4.e1 K = y5Var.b.K(i7);
                if (K != null) {
                    View view = K.a;
                    d60 d60Var = new d60(y5Var.getParentActivity(), y5Var);
                    d60Var.h(true);
                    d60Var.setParentWindow(org.telegram.ui.Components.t4.N(y5Var, d60Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    d60Var.setCallback(new v5(y5Var, s2Var, z12 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                y6.c0((y6) obj2, (org.telegram.ui.ActionBar.t1) obj);
                break;
            case 2:
                org.telegram.ui.Components.og0 og0Var = new org.telegram.ui.Components.og0((Context) obj2, org.telegram.messenger.hd.M0(2131749170, null), ((String[]) obj)[0], org.telegram.messenger.hd.M0(2131746509, null), false);
                og0Var.I0();
                og0Var.show();
                break;
            case 3:
                ((w8) obj2).b.i0(((TLRPC.Message) i5.c.h(1, ((f9) obj).c)).id, 100);
                break;
            case 4:
                t9 t9Var = (t9) obj2;
                String str = (String) obj;
                s9 s9Var = t9Var.N;
                if (s9Var != null) {
                    s9Var.M(str);
                }
                if (t9Var.X != 3) {
                    t9Var.finishFragment();
                    break;
                }
                break;
            case 5:
                t9 t9Var2 = (t9) obj2;
                org.telegram.messenger.wr wrVar = (org.telegram.messenger.wr) obj;
                t9Var2.h.setText(wrVar.p);
                t9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(org.telegram.ui.Components.er.f).start();
                s9 s9Var2 = t9Var2.N;
                if (s9Var2 != null) {
                    s9Var2.S0(wrVar);
                }
                org.telegram.messenger.g0.i3(new j9(t9Var2, 3), 1200L);
                break;
            case 6:
                t9 t9Var3 = (t9) obj2;
                h6.m mVar = (h6.m) obj;
                RectF rectF = (RectF) mVar.c;
                PointF[] pointFArr = (PointF[]) mVar.d;
                RectF rectF2 = t9Var3.K;
                PointF[] pointFArr2 = t9Var3.G;
                RectF rectF3 = t9Var3.L;
                PointF[] pointFArr3 = t9Var3.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = t9Var3.M;
                if (j3 == 0) {
                    t9Var3.M = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        t9.i0(rectF, pointFArr2);
                        t9.i0(rectF, pointFArr3);
                    } else {
                        for (int i14 = 0; i14 < 4; i14++) {
                            PointF pointF = pointFArr2[i14];
                            PointF pointF2 = pointFArr[i14];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i14];
                            PointF pointF4 = pointFArr[i14];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            org.telegram.messenger.g0.Z1(rectF2, rectF3, min, rectF2);
                            for (int i15 = 0; i15 < 4; i15++) {
                                PointF pointF5 = pointFArr2[i15];
                                pointF5.set(org.telegram.messenger.g0.T1(pointF5.x, pointFArr3[i15].x, min), org.telegram.messenger.g0.T1(pointFArr2[i15].y, pointFArr3[i15].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                t9.i0(rectF3, pointFArr3);
                            } else {
                                for (int i16 = 0; i16 < 4; i16++) {
                                    PointF pointF6 = pointFArr3[i16];
                                    PointF pointF7 = pointFArr[i16];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            t9Var3.M = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i17 = 0; i17 < 4; i17++) {
                        PointF pointF8 = pointFArr2[i17];
                        PointF pointF9 = pointFArr3[i17];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    t9Var3.M = elapsedRealtime;
                }
                t9Var3.fragmentView.invalidate();
                break;
            case 7:
                la.b0((la) obj2, (String) obj);
                break;
            case 8:
                lb lbVar = (lb) obj2;
                org.telegram.ui.Components.cc.a0(lbVar).Q(R.raw.ic_ban, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131746057, org.telegram.messenger.q10.j((TLRPC.User) obj, true)))).k(false);
                lbVar.a1();
                break;
            case 9:
                lb lbVar2 = (lb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.k5.n(null, 2131752466, org.telegram.ui.Components.cc.a0(lbVar2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    org.telegram.messenger.k5.n(null, 2131743879, tLObject instanceof TLRPC.TL_boolFalse ? org.telegram.ui.Components.cc.a0(lbVar2) : org.telegram.ui.Components.cc.a0(lbVar2), R.raw.error, 36);
                    break;
                }
            case 10:
                sb sbVar = (sb) obj2;
                sbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                sbVar.I.animate().cancel();
                sbVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.Cells.w9(sbVar, i12));
                sbVar.d(true);
                sbVar.c(null);
                break;
            case 11:
                qc qcVar = (qc) obj2;
                qcVar.getClass();
                qcVar.presentFragment(z41.g0((TLRPC.Chat) obj, true));
                break;
            case 12:
                List list = (List) obj;
                oc ocVar = ((nc) obj2).b;
                int i18 = ocVar.a;
                b61 b61Var = ocVar.d;
                ArrayList arrayList2 = ocVar.c;
                if (list != null && !list.isEmpty()) {
                    ocVar.n = true;
                    arrayList2.clear();
                    arrayList2.add(0, new org.telegram.ui.Components.dp((org.telegram.ui.ActionBar.p3) list.get(0)));
                    if (ocVar.w != null && ocVar.f) {
                        arrayList2.add(0, new org.telegram.ui.Components.dp(org.telegram.ui.ActionBar.p3.a(i18)));
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = ocVar.b;
                    int a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
                    for (int i19 = 1; i19 < list.size(); i19++) {
                        org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) list.get(i19);
                        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(p3Var);
                        p3Var.m(i18);
                        dpVar.c = a10;
                        arrayList2.add(dpVar);
                    }
                    for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                        org.telegram.ui.Components.dp dpVar2 = (org.telegram.ui.Components.dp) arrayList2.get(i20);
                        boolean z13 = TextUtils.equals(ocVar.s, dpVar2.a()) || (TextUtils.isEmpty(ocVar.s) && dpVar2.a.a);
                        dpVar2.d = z13;
                        if (z13) {
                            i11 = i20;
                        }
                    }
                    mc mcVar = ocVar.h;
                    if (mcVar != null) {
                        mcVar.f();
                    }
                    b61Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.pz pzVar = ocVar.e;
                    if (ocVar.n) {
                        org.telegram.messenger.g0.Y3(pzVar, false, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.Y3(pzVar, true, 1.0f, true, true);
                    }
                    if (i11 >= 0 && (b61Var.getLayoutManager() instanceof v4.b0)) {
                        ((v4.b0) b61Var.getLayoutManager()).h1(i11, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 13:
                ad adVar = (ad) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    adVar.getClass();
                    break;
                }
                z10 = true;
                adVar.l0 = z10;
                break;
            case 14:
                ad.b0((ad) obj2, (String) obj);
                break;
            case 15:
                ad adVar2 = (ad) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList3 = adVar2.h0;
                adVar2.f0 = false;
                if (tLObject2 != null && adVar2.getParentActivity() != null) {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        adVar2.M.removeView((View) arrayList3.get(i21));
                    }
                    arrayList3.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i22 = 0;
                    while (i22 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(adVar2.getParentActivity(), new tc(adVar2, z11 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i22), i22 == tL_messages_chats.chats.size() - 1);
                        arrayList3.add(nVar);
                        adVar2.N.addView(nVar, c8.ja.o(-1, 72));
                        i22++;
                    }
                    adVar2.n0();
                    break;
                }
                break;
            case 16:
                xd xdVar = (xd) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                xdVar.r0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    xdVar.s0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.u41 u41Var = xdVar.Y0;
                if (u41Var != null && (p41Var = u41Var.g3) != null) {
                    p41Var.O(true);
                    break;
                }
                break;
            case 17:
                ((xd) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 18:
                an anVar = (an) obj2;
                org.telegram.ui.Components.fz0[] fz0VarArr = (org.telegram.ui.Components.fz0[]) obj;
                if (!anVar.Nb && (fz0Var = fz0VarArr[0]) != null) {
                    fz0VarArr[0] = null;
                    if (anVar.y0 == fz0Var) {
                        anVar.y0 = null;
                    }
                    org.telegram.messenger.g0.E2(fz0Var);
                    break;
                }
                break;
            case 19:
                an.b0((an) obj2, (org.telegram.ui.Components.m60) obj);
                break;
            case 20:
                an anVar2 = (an) obj2;
                anVar2.getClass();
                anVar2.presentFragment(ProfileActivity.C4(((TLRPC.User[]) obj)[0].id));
                break;
            case 21:
                ((di.i2) obj2).a((TLRPC.User) obj);
                break;
            case 22:
                an anVar3 = (an) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                anVar3.O1.setTranslationY(q1Var.getTimeY() + ((r1[1] - r2.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                anVar3.O1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + r1[0]) + q1Var.C9) + q1Var.A9) - (q1Var.D9 / 2.0f));
                anVar3.O1.w();
                break;
            case 23:
                an.v1((an) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 24:
                an anVar4 = (an) obj2;
                int[] iArr = (int[]) obj;
                anVar4.getClass();
                if (iArr[0] != 0) {
                    anVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 25:
                ((an) obj2).y8((gg) obj);
                break;
            case 26:
                an anVar5 = (an) obj2;
                vf.c.q(anVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), anVar5.w8 == 0, false);
                break;
            case 27:
                ((an) obj2).Na((TLRPC.Chat) obj);
                break;
            case 28:
                an.W0((an) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            default:
                an anVar6 = (an) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131745302, null), anVar6);
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.t4.t0(org.telegram.messenger.hd.M0(2131753955, null), anVar6);
                    break;
                } else {
                    org.telegram.ui.Components.t4.t0(tL_error2.text, anVar6);
                    break;
                }
        }
    }
}
