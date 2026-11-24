// default package

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class q21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038a A[ADDED_TO_REGION, LOOP:6: B:171:0x038a->B:172:0x038c, LOOP_START, PHI: r11
      0x038a: PHI (r11v3 int) = (r11v9 int), (r11v4 int) binds: [B:168:0x0384, B:172:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l5c l5cVar;
        byte b = this.a;
        byte b2 = 3;
        int i = -1;
        byte b3 = 0;
        byte b4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                de2 de2Var = (de2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    de2Var.run();
                    break;
                }
                break;
            case 1:
                p31 p31Var = (p31) obj2;
                TLObject tLObject = (TLObject) obj;
                p31Var.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                p31Var.c = connectedbots;
                if (connectedbots != null) {
                    na7.q1(p31Var.a).b4(p31Var.c.users, false);
                }
                p31Var.b = System.currentTimeMillis();
                p31Var.f = true;
                p31Var.d();
                break;
            case 2:
                u41 u41Var = (u41) obj2;
                rw0 rw0Var = (rw0) obj;
                int i2 = u41Var.J - 1;
                u41Var.J = i2;
                u41Var.c(i2, true);
                if (u41Var.J > 0) {
                    gl.d3(u41Var.K, 1000L);
                    break;
                } else {
                    u41Var.setClickable(true);
                    rw0Var.run();
                    break;
                }
            case 3:
                v51 v51Var = (v51) obj2;
                m51 m51Var = (m51) obj;
                ArrayList arrayList = v51Var.c;
                byte b5 = 0;
                while (true) {
                    if (b5 < arrayList.size()) {
                        if (((u51) arrayList.get(b5)).c == null || ((u51) arrayList.get(b5)).c.a != m51Var.a) {
                            b5++;
                        } else {
                            b3 = b5;
                        }
                    }
                }
                s49 K = v51Var.b.K(b3);
                if (K != null) {
                    View view = K.a;
                    jv5 jv5Var = new jv5(v51Var, v51Var.getParentActivity());
                    jv5Var.h(true);
                    jv5Var.setParentWindow(ij.N(v51Var, jv5Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    jv5Var.setCallback(new s51(v51Var, m51Var, b4));
                    break;
                }
                break;
            case 4:
                ((r61) obj2).o0((hd) obj);
                break;
            case 5:
                zu8 zu8Var = new zu8((Context) obj2, k96.M0(2131748978, null), ((String[]) obj)[0], k96.M0(2131746316, null), false);
                zu8Var.D0();
                zu8Var.show();
                break;
            case 6:
                ((o81) obj2).b.c0(((TLRPC.Message) b00.f(1, ((w81) obj).c)).id, 100);
                break;
            case 7:
                ((CameraController) obj2).lambda$initCamera$2((Runnable) obj);
                break;
            case 8:
                CameraController.lambda$stopVideoRecording$16((Camera) obj2, (CameraSession) obj);
                break;
            case 9:
                da1 da1Var = (da1) obj2;
                mv6 mv6Var = (mv6) obj;
                RectF rectF = (RectF) mv6Var.c;
                PointF[] pointFArr = (PointF[]) mv6Var.d;
                RectF rectF2 = da1Var.K;
                PointF[] pointFArr2 = da1Var.G;
                RectF rectF3 = da1Var.L;
                PointF[] pointFArr3 = da1Var.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = da1Var.M;
                if (j == 0) {
                    da1Var.M = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        da1.h0(rectF, pointFArr2);
                        da1.h0(rectF, pointFArr3);
                    } else {
                        for (int i3 = 0; i3 < 4; i3++) {
                            PointF pointF = pointFArr2[i3];
                            PointF pointF2 = pointFArr[i3];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i3];
                            PointF pointF4 = pointFArr[i3];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j2 = elapsedRealtime - j;
                        if (j2 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j2 / 75.0f));
                            gl.X1(rectF2, rectF3, min, rectF2);
                            for (int i4 = 0; i4 < 4; i4++) {
                                PointF pointF5 = pointFArr2[i4];
                                pointF5.set(gl.R1(pointF5.x, pointFArr3[i4].x, min), gl.R1(pointFArr2[i4].y, pointFArr3[i4].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                da1.h0(rectF3, pointFArr3);
                            } else {
                                for (int i5 = 0; i5 < 4; i5++) {
                                    PointF pointF6 = pointFArr3[i5];
                                    PointF pointF7 = pointFArr[i5];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            da1Var.M = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i6 = 0; i6 < 4; i6++) {
                        PointF pointF8 = pointFArr2[i6];
                        PointF pointF9 = pointFArr3[i6];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    da1Var.M = elapsedRealtime;
                }
                da1Var.fragmentView.invalidate();
                break;
            case 10:
                da1 da1Var2 = (da1) obj2;
                String str = (String) obj;
                ca1 ca1Var = da1Var2.N;
                if (ca1Var != null) {
                    ca1Var.H(str);
                }
                if (da1Var2.X != 3) {
                    da1Var2.finishFragment();
                    break;
                }
                break;
            case 11:
                da1 da1Var3 = (da1) obj2;
                vf7 vf7Var = (vf7) obj;
                da1Var3.h.setText(vf7Var.p);
                da1Var3.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(s33.f).start();
                ca1 ca1Var2 = da1Var3.N;
                if (ca1Var2 != null) {
                    ca1Var2.Q1(vf7Var);
                }
                gl.d3(new u91(da1Var3, (byte) 2), 1200L);
                break;
            case 12:
                ((CameraView) obj2).lambda$createCamera$8((CameraView.CameraGLThread) obj);
                break;
            case 13:
                ((CameraView) obj2).lambda$enableDualInternal$1((Handler) obj);
                break;
            case 14:
                ((mb1) obj2).removeView((je5) obj);
                break;
            case 15:
                yb1 yb1Var = (yb1) obj2;
                cc1 cc1Var = (cc1) obj;
                yb1Var.b.i();
                if (cc1Var.getParent() != null) {
                    yb1Var.a.R(cc1Var);
                    break;
                }
                break;
            case 16:
                CarResultStub.lambda$notifyResults$1((Map.Entry) obj2, obj);
                break;
            case 17:
                ((me1) obj2).f0((String) obj);
                break;
            case 18:
                nf1 nf1Var = (nf1) obj2;
                nf1Var.getClass();
                u21.b0(nf1Var).Q(R.raw.ic_ban, 36, gl.S2(k96.a0(null, null, 2131745864, l7c.k((TLRPC.User) obj, true)))).k(false);
                nf1Var.Y0();
                break;
            case 19:
                nf1 nf1Var2 = (nf1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                nf1Var2.getClass();
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    ir2.v(null, 2131752454, u21.b0(nf1Var2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    ir2.v(null, 2131743640, tLObject2 instanceof TLRPC.TL_boolFalse ? u21.b0(nf1Var2) : u21.b0(nf1Var2), R.raw.error, 36);
                    break;
                }
            case 20:
                eg1 eg1Var = (eg1) obj2;
                eg1Var.getMessagesController().z3(null, (TLRPC.User) obj, null, eg1Var.getClassGuid(), null, false, false);
                break;
            case 21:
                ((eg1) obj2).presentFragment(mu1.W9(((TL_payments.connectedBotStarRef) obj).bot_id));
                break;
            case 22:
                kg1 kg1Var = (kg1) obj2;
                kg1Var.d = (TL_stories.TL_premium_boostsStatus) obj;
                kg1Var.I.animate().cancel();
                kg1Var.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new bb1(kg1Var, b2));
                kg1Var.d(true);
                kg1Var.c(null);
                break;
            case 23:
                nh1 nh1Var = (nh1) obj2;
                nh1Var.getClass();
                nh1Var.presentFragment(uxa.d0((TLRPC.Chat) obj, true));
                break;
            case 24:
                List list = (List) obj;
                lh1 lh1Var = ((kh1) obj2).b;
                int i7 = lh1Var.a;
                rkb rkbVar = lh1Var.d;
                ArrayList arrayList2 = lh1Var.c;
                if (list != null && !list.isEmpty()) {
                    lh1Var.n = true;
                    arrayList2.clear();
                    arrayList2.add(0, new wd2((jy3) list.get(0)));
                    if (lh1Var.w != null && lh1Var.f) {
                        arrayList2.add(0, new wd2(jy3.a(i7)));
                    }
                    wjb wjbVar = lh1Var.b;
                    int a = wjbVar != null ? wjbVar.a() : bkb.I.o();
                    for (int i8 = 1; i8 < list.size(); i8++) {
                        jy3 jy3Var = (jy3) list.get(i8);
                        wd2 wd2Var = new wd2(jy3Var);
                        jy3Var.m(i7);
                        wd2Var.c = a;
                        arrayList2.add(wd2Var);
                    }
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        wd2 wd2Var2 = (wd2) arrayList2.get(i9);
                        boolean z = TextUtils.equals(lh1Var.s, wd2Var2.a()) || (TextUtils.isEmpty(lh1Var.s) && wd2Var2.a.a);
                        wd2Var2.d = z;
                        if (z) {
                            i = i9;
                        }
                    }
                    jh1 jh1Var = lh1Var.h;
                    if (jh1Var != null) {
                        jh1Var.f();
                    }
                    rkbVar.animate().alpha(1.0f).setDuration(150L).start();
                    boolean z2 = lh1Var.n;
                    pi4 pi4Var = lh1Var.e;
                    if (z2) {
                        gl.T3(pi4Var, false, 1.0f, true, true);
                    } else {
                        gl.T3(pi4Var, true, 1.0f, true, true);
                    }
                    if (i >= 0 && (rkbVar.getLayoutManager() instanceof t26)) {
                        ((t26) rkbVar.getLayoutManager()).g1(i, (gl.q.x - gl.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 25:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((yh1) obj2).l0 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                break;
            case 26:
                ((yh1) obj2).e0((String) obj);
                break;
            case 27:
                yh1 yh1Var = (yh1) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = yh1Var.h0;
                yh1Var.f0 = false;
                if (tLObject3 != null && yh1Var.getParentActivity() != null) {
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        yh1Var.M.removeView((View) arrayList3.get(i10));
                    }
                    arrayList3.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                    int i11 = 0;
                    while (i11 < tL_messages_chats.chats.size()) {
                        jb jbVar = new jb(yh1Var.getParentActivity(), new sh1(yh1Var, b3), false, 0);
                        jbVar.a(tL_messages_chats.chats.get(i11), i11 == tL_messages_chats.chats.size() - 1);
                        arrayList3.add(jbVar);
                        yh1Var.N.addView(jbVar, nme.o(-1, 72));
                        i11++;
                    }
                    yh1Var.m0();
                    break;
                }
                break;
            case 28:
                zi1 zi1Var = (zi1) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                zi1Var.q0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    zi1Var.r0 = tL_premium_boostsStatus.level;
                }
                q5c q5cVar = zi1Var.X0;
                if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                    l5cVar.O(true);
                    break;
                }
                break;
            default:
                ((zi1) obj2).E((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
        }
    }
}
