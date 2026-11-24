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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class y31 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y31(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0383 A[ADDED_TO_REGION, LOOP:6: B:169:0x0383->B:170:0x0385, LOOP_START, PHI: r10
      0x0383: PHI (r10v3 int) = (r10v9 int), (r10v4 int) binds: [B:166:0x037d, B:170:0x0385] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        l7c l7cVar;
        byte b = this.a;
        int i = -1;
        byte b2 = 0;
        byte b3 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                u31 u31Var = (u31) obj2;
                CharSequence charSequence = (CharSequence) obj;
                u31Var.o = true;
                y21 y21Var = u31Var.e;
                if (y21Var instanceof z21) {
                    z21 z21Var = (z21) y21Var;
                    z21Var.b.setText(charSequence);
                    gm.P3(z21Var.d, false, false);
                    gm.P3(z21Var.b, true, false);
                }
                u31Var.i(true);
                break;
            case 1:
                boolean[] zArr = (boolean[]) obj2;
                of2 of2Var = (of2) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    of2Var.run();
                    break;
                }
                break;
            case 2:
                x41 x41Var = (x41) obj2;
                TLObject tLObject = (TLObject) obj;
                x41Var.e = false;
                TL_account.connectedBots connectedbots = tLObject instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject : null;
                x41Var.c = connectedbots;
                if (connectedbots != null) {
                    oc7.r1(x41Var.a).d4(x41Var.c.users, false);
                }
                x41Var.b = System.currentTimeMillis();
                x41Var.f = true;
                x41Var.d();
                break;
            case 3:
                b61 b61Var = (b61) obj2;
                zx0 zx0Var = (zx0) obj;
                int i2 = b61Var.J - 1;
                b61Var.J = i2;
                b61Var.c(i2, true);
                if (b61Var.J > 0) {
                    gm.d3(b61Var.K, 1000L);
                    break;
                } else {
                    b61Var.setClickable(true);
                    zx0Var.run();
                    break;
                }
            case 4:
                c71 c71Var = (c71) obj2;
                t61 t61Var = (t61) obj;
                ArrayList arrayList = c71Var.c;
                byte b4 = 0;
                while (true) {
                    if (b4 < arrayList.size()) {
                        if (((b71) arrayList.get(b4)).c == null || ((b71) arrayList.get(b4)).c.a != t61Var.a) {
                            b4++;
                        } else {
                            b2 = b4;
                        }
                    }
                }
                u69 K = c71Var.b.K(b2);
                if (K != null) {
                    View view = K.a;
                    jx5 jx5Var = new jx5(c71Var, c71Var.getParentActivity());
                    jx5Var.h(true);
                    jx5Var.setParentWindow(ik.N(c71Var, jx5Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    jx5Var.setCallback(new z61(c71Var, t61Var, b3));
                    break;
                }
                break;
            case 5:
                ((y71) obj2).p0((he) obj);
                break;
            case 6:
                ax8 ax8Var = new ax8((Context) obj2, jb6.M0(2131748927, null), ((String[]) obj)[0], jb6.M0(2131746242, null), false);
                ax8Var.D0();
                ax8Var.show();
                break;
            case 7:
                ((x91) obj2).b.d0(((TLRPC.Message) b10.f(1, ((fa1) obj).c)).id, 100);
                break;
            case 8:
                ((CameraController) obj2).lambda$initCamera$2((Runnable) obj);
                break;
            case 9:
                CameraController.lambda$stopVideoRecording$16((Camera) obj2, (CameraSession) obj);
                break;
            case 10:
                lb1 lb1Var = (lb1) obj2;
                mx6 mx6Var = (mx6) obj;
                RectF rectF = (RectF) mx6Var.c;
                PointF[] pointFArr = (PointF[]) mx6Var.d;
                RectF rectF2 = lb1Var.K;
                PointF[] pointFArr2 = lb1Var.G;
                RectF rectF3 = lb1Var.L;
                PointF[] pointFArr3 = lb1Var.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = lb1Var.M;
                if (j == 0) {
                    lb1Var.M = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        lb1.i0(rectF, pointFArr2);
                        lb1.i0(rectF, pointFArr3);
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
                            gm.X1(rectF2, rectF3, min, rectF2);
                            for (int i4 = 0; i4 < 4; i4++) {
                                PointF pointF5 = pointFArr2[i4];
                                pointF5.set(gm.R1(pointF5.x, pointFArr3[i4].x, min), gm.R1(pointFArr2[i4].y, pointFArr3[i4].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                lb1.i0(rectF3, pointFArr3);
                            } else {
                                for (int i5 = 0; i5 < 4; i5++) {
                                    PointF pointF6 = pointFArr3[i5];
                                    PointF pointF7 = pointFArr[i5];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            lb1Var.M = elapsedRealtime;
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
                    lb1Var.M = elapsedRealtime;
                }
                lb1Var.fragmentView.invalidate();
                break;
            case 11:
                lb1 lb1Var2 = (lb1) obj2;
                String str = (String) obj;
                kb1 kb1Var = lb1Var2.N;
                if (kb1Var != null) {
                    kb1Var.v(str);
                }
                if (lb1Var2.X != 3) {
                    lb1Var2.finishFragment();
                    break;
                }
                break;
            case 12:
                lb1 lb1Var3 = (lb1) obj2;
                yh7 yh7Var = (yh7) obj;
                lb1Var3.h.setText(yh7Var.p);
                lb1Var3.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(d53.f).start();
                kb1 kb1Var2 = lb1Var3.N;
                if (kb1Var2 != null) {
                    kb1Var2.I0(yh7Var);
                }
                gm.d3(new db1(lb1Var3, (byte) 2), 1200L);
                break;
            case 13:
                ((CameraView) obj2).lambda$createCamera$8((CameraView.CameraGLThread) obj);
                break;
            case 14:
                ((CameraView) obj2).lambda$enableDualInternal$1((Handler) obj);
                break;
            case 15:
                ((tc1) obj2).removeView((hg5) obj);
                break;
            case 16:
                gd1 gd1Var = (gd1) obj2;
                kd1 kd1Var = (kd1) obj;
                gd1Var.b.i();
                if (kd1Var.getParent() != null) {
                    gd1Var.a.S(kd1Var);
                    break;
                }
                break;
            case 17:
                CarResultStub.lambda$notifyResults$1((Map.Entry) obj2, obj);
                break;
            case 18:
                ((uf1) obj2).g0((String) obj);
                break;
            case 19:
                vg1 vg1Var = (vg1) obj2;
                vg1Var.getClass();
                c41.b0(vg1Var).Q(R.raw.ic_ban, 36, gm.S2(jb6.a0(null, null, 2131745790, m9c.k((TLRPC.User) obj, true)))).k(false);
                vg1Var.Z0();
                break;
            case 20:
                vg1 vg1Var2 = (vg1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                vg1Var2.getClass();
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    ts2.u(null, 2131752413, c41.b0(vg1Var2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    ts2.u(null, 2131743566, tLObject2 instanceof TLRPC.TL_boolFalse ? c41.b0(vg1Var2) : c41.b0(vg1Var2), R.raw.error, 36);
                    break;
                }
            case 21:
                mh1 mh1Var = (mh1) obj2;
                mh1Var.getMessagesController().B3(null, (TLRPC.User) obj, null, mh1Var.getClassGuid(), null, false, false);
                break;
            case 22:
                ((mh1) obj2).presentFragment(yv1.ga(((TL_payments.connectedBotStarRef) obj).bot_id));
                break;
            case 23:
                sh1 sh1Var = (sh1) obj2;
                sh1Var.d = (TL_stories.TL_premium_boostsStatus) obj;
                sh1Var.I.animate().cancel();
                sh1Var.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new b91((Object) sh1Var, (byte) 5));
                sh1Var.d(true);
                sh1Var.c(null);
                break;
            case 24:
                vi1 vi1Var = (vi1) obj2;
                vi1Var.getClass();
                vi1Var.presentFragment(xza.e0((TLRPC.Chat) obj, true));
                break;
            case 25:
                List list = (List) obj;
                ti1 ti1Var = ((si1) obj2).b;
                int i7 = ti1Var.a;
                smb smbVar = ti1Var.d;
                ArrayList arrayList2 = ti1Var.c;
                if (list != null && !list.isEmpty()) {
                    ti1Var.n = true;
                    arrayList2.clear();
                    arrayList2.add(0, new hf2((tz3) list.get(0)));
                    if (ti1Var.w != null && ti1Var.f) {
                        arrayList2.add(0, new hf2(tz3.a(i7)));
                    }
                    ylb ylbVar = ti1Var.b;
                    int a = ylbVar != null ? ylbVar.a() : cmb.I.o();
                    for (int i8 = 1; i8 < list.size(); i8++) {
                        tz3 tz3Var = (tz3) list.get(i8);
                        hf2 hf2Var = new hf2(tz3Var);
                        tz3Var.m(i7);
                        hf2Var.c = a;
                        arrayList2.add(hf2Var);
                    }
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        hf2 hf2Var2 = (hf2) arrayList2.get(i9);
                        boolean z = TextUtils.equals(ti1Var.s, hf2Var2.a()) || (TextUtils.isEmpty(ti1Var.s) && hf2Var2.a.a);
                        hf2Var2.d = z;
                        if (z) {
                            i = i9;
                        }
                    }
                    ri1 ri1Var = ti1Var.h;
                    if (ri1Var != null) {
                        ri1Var.f();
                    }
                    smbVar.animate().alpha(1.0f).setDuration(150L).start();
                    boolean z2 = ti1Var.n;
                    tk4 tk4Var = ti1Var.e;
                    if (z2) {
                        gm.T3(tk4Var, false, 1.0f, true, true);
                    } else {
                        gm.T3(tk4Var, true, 1.0f, true, true);
                    }
                    if (i >= 0 && (smbVar.getLayoutManager() instanceof u46)) {
                        ((u46) smbVar.getLayoutManager()).g1(i, (gm.q.x - gm.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 26:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((fj1) obj2).l0 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                break;
            case 27:
                ((fj1) obj2).f0((String) obj);
                break;
            case 28:
                fj1 fj1Var = (fj1) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList3 = fj1Var.h0;
                fj1Var.f0 = false;
                if (tLObject3 != null && fj1Var.getParentActivity() != null) {
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        fj1Var.M.removeView((View) arrayList3.get(i10));
                    }
                    arrayList3.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                    int i11 = 0;
                    while (i11 < tL_messages_chats.chats.size()) {
                        jb jbVar = new jb(fj1Var.getParentActivity(), new zi1(fj1Var, b2), false, 0);
                        jbVar.a(tL_messages_chats.chats.get(i11), i11 == tL_messages_chats.chats.size() - 1);
                        arrayList3.add(jbVar);
                        fj1Var.N.addView(jbVar, qoe.o(-1, 72));
                        i11++;
                    }
                    fj1Var.n0();
                    break;
                }
                break;
            default:
                ik1 ik1Var = (ik1) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ik1Var.q0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    ik1Var.r0 = tL_premium_boostsStatus.level;
                }
                q7c q7cVar = ik1Var.X0;
                if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                    l7cVar.O(true);
                    break;
                }
                break;
        }
    }
}
