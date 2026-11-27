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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class z21 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z21(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038b A[ADDED_TO_REGION, LOOP:6: B:171:0x038b->B:172:0x038d, LOOP_START, PHI: r11
      0x038b: PHI (r11v1 byte) = (r11v0 byte), (r11v9 byte) binds: [B:168:0x0385, B:172:0x038d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l9c l9cVar;
        byte b = this.a;
        byte b2 = 3;
        int i = -1;
        byte b3 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                ue2 ue2Var = (ue2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ue2Var.run();
                    break;
                }
                break;
            case 1:
                y31 y31Var = (y31) obj2;
                TLObject tLObject = (TLObject) obj;
                y31Var.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                y31Var.c = connectedbots;
                if (connectedbots != null) {
                    uc7.s1(y31Var.a).j4(y31Var.c.users, false);
                }
                y31Var.b = System.currentTimeMillis();
                y31Var.f = true;
                y31Var.d();
                break;
            case 2:
                c51 c51Var = (c51) obj2;
                ax0 ax0Var = (ax0) obj;
                int i2 = c51Var.J - 1;
                c51Var.J = i2;
                c51Var.c(i2, true);
                if (c51Var.J > 0) {
                    hl.d3(c51Var.K, 1000L);
                    break;
                } else {
                    c51Var.setClickable(true);
                    ax0Var.run();
                    break;
                }
            case 3:
                d61 d61Var = (d61) obj2;
                u51 u51Var = (u51) obj;
                ArrayList arrayList = d61Var.c;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = 0;
                    } else if (((c61) arrayList.get(i3)).c == null || ((c61) arrayList.get(i3)).c.a != u51Var.a) {
                        i3++;
                    }
                }
                f89 L = d61Var.b.L(i3);
                if (L != null) {
                    View view = L.a;
                    ox5 ox5Var = new ox5(d61Var, d61Var.getParentActivity());
                    ox5Var.h(true);
                    ox5Var.setParentWindow(jj.N(d61Var, ox5Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    ox5Var.setCallback(new a61(d61Var, u51Var, b3));
                    break;
                }
                break;
            case 4:
                ((z61) obj2).o0((id) obj);
                break;
            case 5:
                ky8 ky8Var = new ky8((Context) obj2, ob6.M0(2131748924, null), ((String[]) obj)[0], ob6.M0(2131746236, null), false);
                ky8Var.E0();
                ky8Var.show();
                break;
            case 6:
                ((x81) obj2).b.c0(((TLRPC.Message) c00.g(1, ((f91) obj).c)).id, 100);
                break;
            case 7:
                ((CameraController) obj2).lambda$initCamera$2((Runnable) obj);
                break;
            case 8:
                CameraController.lambda$stopVideoRecording$16((Camera) obj2, (CameraSession) obj);
                break;
            case 9:
                la1 la1Var = (la1) obj2;
                rx6 rx6Var = (rx6) obj;
                RectF rectF = (RectF) rx6Var.c;
                PointF[] pointFArr = (PointF[]) rx6Var.d;
                RectF rectF2 = la1Var.K;
                PointF[] pointFArr2 = la1Var.G;
                RectF rectF3 = la1Var.L;
                PointF[] pointFArr3 = la1Var.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = la1Var.M;
                if (j == 0) {
                    la1Var.M = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        la1.h0(rectF, pointFArr2);
                        la1.h0(rectF, pointFArr3);
                    } else {
                        for (int i4 = 0; i4 < 4; i4++) {
                            PointF pointF = pointFArr2[i4];
                            PointF pointF2 = pointFArr[i4];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i4];
                            PointF pointF4 = pointFArr[i4];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j2 = elapsedRealtime - j;
                        if (j2 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j2 / 75.0f));
                            hl.X1(rectF2, rectF3, min, rectF2);
                            for (int i5 = 0; i5 < 4; i5++) {
                                PointF pointF5 = pointFArr2[i5];
                                pointF5.set(hl.R1(pointF5.x, pointFArr3[i5].x, min), hl.R1(pointFArr2[i5].y, pointFArr3[i5].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                la1.h0(rectF3, pointFArr3);
                            } else {
                                while (b3 < 4) {
                                    PointF pointF6 = pointFArr3[b3];
                                    PointF pointF7 = pointFArr[b3];
                                    pointF6.set(pointF7.x, pointF7.y);
                                    b3++;
                                }
                            }
                            la1Var.M = elapsedRealtime;
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
                    la1Var.M = elapsedRealtime;
                }
                la1Var.fragmentView.invalidate();
                break;
            case 10:
                la1 la1Var2 = (la1) obj2;
                String str = (String) obj;
                ka1 ka1Var = la1Var2.N;
                if (ka1Var != null) {
                    ka1Var.q(str);
                }
                if (la1Var2.X != 3) {
                    la1Var2.finishFragment();
                    break;
                }
                break;
            case 11:
                la1 la1Var3 = (la1) obj2;
                ei7 ei7Var = (ei7) obj;
                la1Var3.h.setText(ei7Var.p);
                la1Var3.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(k43.f).start();
                ka1 ka1Var2 = la1Var3.N;
                if (ka1Var2 != null) {
                    ka1Var2.p0(ei7Var);
                }
                hl.d3(new da1(la1Var3, (byte) 4), 1200L);
                break;
            case 12:
                ((CameraView) obj2).lambda$createCamera$8((CameraView.CameraGLThread) obj);
                break;
            case 13:
                ((CameraView) obj2).lambda$enableDualInternal$1((Handler) obj);
                break;
            case 14:
                ((ub1) obj2).removeView((kg5) obj);
                break;
            case 15:
                gc1 gc1Var = (gc1) obj2;
                kc1 kc1Var = (kc1) obj;
                gc1Var.b.i();
                if (kc1Var.getParent() != null) {
                    gc1Var.a.P(kc1Var);
                    break;
                }
                break;
            case 16:
                CarResultStub.lambda$notifyResults$1((Map.Entry) obj2, obj);
                break;
            case 17:
                ((ve1) obj2).f0((String) obj);
                break;
            case 18:
                wf1 wf1Var = (wf1) obj2;
                wf1Var.getClass();
                d31.b0(wf1Var).Q(R.raw.ic_ban, 36, hl.S2(ob6.a0(null, null, 2131745784, lbc.k((TLRPC.User) obj, true)))).k(false);
                wf1Var.Z0();
                break;
            case 19:
                wf1 wf1Var2 = (wf1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                wf1Var2.getClass();
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    bs2.v(null, 2131752441, d31.b0(wf1Var2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    bs2.v(null, 2131743534, tLObject2 instanceof TLRPC.TL_boolFalse ? d31.b0(wf1Var2) : d31.b0(wf1Var2), R.raw.error, 36);
                    break;
                }
            case 20:
                ng1 ng1Var = (ng1) obj2;
                ng1Var.getMessagesController().G3(null, (TLRPC.User) obj, null, ng1Var.getClassGuid(), null, false, false);
                break;
            case 21:
                ((ng1) obj2).presentFragment(zu1.ha(((TL_payments.connectedBotStarRef) obj).bot_id));
                break;
            case 22:
                tg1 tg1Var = (tg1) obj2;
                tg1Var.d = (TL_stories.TL_premium_boostsStatus) obj;
                tg1Var.I.animate().cancel();
                tg1Var.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new jb1(tg1Var, b2));
                tg1Var.d(true);
                tg1Var.c(null);
                break;
            case 23:
                wh1 wh1Var = (wh1) obj2;
                wh1Var.getClass();
                wh1Var.presentFragment(w1b.d0((TLRPC.Chat) obj, true));
                break;
            case 24:
                List list = (List) obj;
                uh1 uh1Var = ((th1) obj2).b;
                int i7 = uh1Var.a;
                qob qobVar = uh1Var.d;
                ArrayList arrayList2 = uh1Var.c;
                if (list != null && !list.isEmpty()) {
                    uh1Var.n = true;
                    arrayList2.clear();
                    arrayList2.add(0, new ne2((ez3) list.get(0)));
                    if (uh1Var.w != null && uh1Var.f) {
                        arrayList2.add(0, new ne2(ez3.a(i7)));
                    }
                    vnb vnbVar = uh1Var.b;
                    int a = vnbVar != null ? vnbVar.a() : aob.I.o();
                    for (int i8 = 1; i8 < list.size(); i8++) {
                        ez3 ez3Var = (ez3) list.get(i8);
                        ne2 ne2Var = new ne2(ez3Var);
                        ez3Var.m(i7);
                        ne2Var.c = a;
                        arrayList2.add(ne2Var);
                    }
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        ne2 ne2Var2 = (ne2) arrayList2.get(i9);
                        boolean z = TextUtils.equals(uh1Var.s, ne2Var2.a()) || (TextUtils.isEmpty(uh1Var.s) && ne2Var2.a.a);
                        ne2Var2.d = z;
                        if (z) {
                            i = i9;
                        }
                    }
                    sh1 sh1Var = uh1Var.h;
                    if (sh1Var != null) {
                        sh1Var.f();
                    }
                    qobVar.animate().alpha(1.0f).setDuration(150L).start();
                    boolean z2 = uh1Var.n;
                    tk4 tk4Var = uh1Var.e;
                    if (z2) {
                        hl.T3(tk4Var, false, 1.0f, true, true);
                    } else {
                        hl.T3(tk4Var, true, 1.0f, true, true);
                    }
                    if (i >= 0 && (qobVar.getLayoutManager() instanceof x46)) {
                        ((x46) qobVar.getLayoutManager()).g1(i, (hl.q.x - hl.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 25:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((gi1) obj2).l0 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                break;
            case 26:
                gi1 gi1Var = (gi1) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = gi1Var.h0;
                gi1Var.f0 = false;
                if (tLObject3 != null && gi1Var.getParentActivity() != null) {
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        gi1Var.M.removeView((View) arrayList3.get(i10));
                    }
                    arrayList3.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                    int i11 = 0;
                    while (i11 < tL_messages_chats.chats.size()) {
                        kb kbVar = new kb(gi1Var.getParentActivity(), new ai1(gi1Var, b3), false, 0);
                        kbVar.a(tL_messages_chats.chats.get(i11), i11 == tL_messages_chats.chats.size() - 1);
                        arrayList3.add(kbVar);
                        gi1Var.N.addView(kbVar, tre.o(-1, 72));
                        i11++;
                    }
                    gi1Var.m0();
                    break;
                }
                break;
            case 27:
                ((gi1) obj2).e0((String) obj);
                break;
            case 28:
                ij1 ij1Var = (ij1) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ij1Var.q0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    ij1Var.r0 = tL_premium_boostsStatus.level;
                }
                q9c q9cVar = ij1Var.X0;
                if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                    l9cVar.O(true);
                    break;
                }
                break;
            default:
                ((ij1) obj2).E((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
        }
    }
}
