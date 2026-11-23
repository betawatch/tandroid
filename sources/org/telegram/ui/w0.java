package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements org.telegram.ui.Components.wm0, ki.r3, ib1, r0.m, org.telegram.ui.ActionBar.q1, ug.s, org.telegram.ui.Components.mc0, org.telegram.ui.Components.rj0, org.telegram.ui.Components.qt0, org.telegram.ui.Components.fu0, fi.a9, org.telegram.ui.Components.gj0, CameraView.CameraViewDelegate, org.telegram.messenger.u10, org.telegram.messenger.mc, org.telegram.ui.Components.di0, org.telegram.messenger.lr, org.telegram.ui.Cells.e0, fx {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean U0(View view) {
        return false;
    }

    @Override // org.telegram.ui.ib1
    public void a(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.h3(new n2.c0(28, (m4) this.b, arrayList), 100L);
    }

    @Override // ki.r3
    public void b(boolean z10) {
        k3 k3Var = (k3) this.b;
        t3 t3Var = k3Var.M.L;
        if (t3Var != null) {
            k3Var.h = true;
            t3Var.a(true);
        }
    }

    @Override // org.telegram.ui.fx
    public void c() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.b;
        int i7 = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.Components.di0
    public void d(ArrayList arrayList) {
        oh ohVar = (oh) this.b;
        bn bnVar = ohVar.p;
        if (bnVar.getParentActivity() == null || bnVar.getParentActivity() == null) {
            return;
        }
        nh nhVar = new nh(ohVar, bnVar, bnVar.getParentActivity(), bnVar.Ba, arrayList);
        boolean V9 = bnVar.V9();
        nhVar.i0 = V9;
        nhVar.n = V9;
        nhVar.p0 = false;
        bnVar.P7(false);
        bnVar.showDialog(nhVar);
    }

    @Override // org.telegram.ui.Components.wm0
    public void e(float f10) {
        x0 x0Var = (x0) this.b;
        org.telegram.messenger.fj fjVar = x0Var.N;
        if (fjVar == null) {
            return;
        }
        fjVar.b0 = f10;
        MediaController.B().i0(x0Var.N, f10);
    }

    @Override // org.telegram.ui.Components.gj0
    public void f() {
        ((ri.q) this.b).g();
    }

    @Override // org.telegram.ui.Components.rj0
    public void g(float f10, float f11, int i7, View view) {
        y5 y5Var = (y5) this.b;
        ArrayList arrayList = y5Var.c;
        int i10 = 0;
        if (((x5) arrayList.get(i7)).a != 1) {
            if (((x5) arrayList.get(i7)).a == 2) {
                org.telegram.messenger.t2 t2Var = ((x5) arrayList.get(i7)).c;
                f60 f60Var = new f60(view.getContext(), y5Var);
                f60Var.h(false);
                f60Var.setParentWindow(org.telegram.ui.Components.b5.N(y5Var, f60Var, view, f10, f11));
                f60Var.setCallback(new v5(y5Var, t2Var, i10));
                return;
            }
            if (((x5) arrayList.get(i7)).a == 4) {
                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.L(y5Var.getParentActivity(), org.telegram.messenger.gd.N0(2131747719, null), org.telegram.messenger.gd.N0(2131747720, null), org.telegram.messenger.gd.N0(2131751586, null), new hq0(y5Var, 13), null).a;
                t1Var.show();
                t1Var.i();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        int i11 = y5Var.e;
        int i12 = 6;
        if (i11 == 1) {
            bundle.putInt("dialogsType", 6);
        } else if (i11 == 2) {
            bundle.putInt("dialogsType", 5);
        } else {
            bundle.putInt("dialogsType", 4);
        }
        bundle.putBoolean("allowGlobalSearch", false);
        bx bxVar = new bx(bundle);
        bxVar.E2 = new oi.f0(i12, y5Var, bxVar);
        y5Var.presentFragment(bxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        int i11 = 0;
        switch (this.a) {
            case 4:
                g5 g5Var = (g5) this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.t0.b.getPackageName()));
                    g5Var.startActivity(intent);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                q6 q6Var = (q6) this.b;
                p6 p6Var = new p6(null == true ? 1 : 0, q6Var.getContext(), null == true ? 1 : 0);
                p6Var.O();
                p6Var.c0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                ai.h0 h0Var = new ai.h0(12, context, (boolean) (null == true ? 1 : 0));
                org.telegram.ui.Components.qh0 qh0Var = new org.telegram.ui.Components.qh0(context);
                qh0Var.setAutoRepeat(true);
                qh0Var.f(R.raw.utyan_cache, org.telegram.messenger.ks.g2, org.telegram.messenger.ks.g2, null);
                h0Var.addView(qh0Var, c8.na.d(org.telegram.messenger.ks.g2, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                qh0Var.d();
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
                h0Var.b = n6Var;
                org.telegram.ui.Components.kr krVar = org.telegram.ui.Components.kr.g;
                n6Var.b(0.35f, 120L, krVar);
                n6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.n6.j5;
                org.telegram.ui.ActionBar.u6.Y(n6Var, i12, null);
                n6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                n6Var.setTypeface(org.telegram.messenger.g0.o());
                h0Var.addView(n6Var, c8.na.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                r6 r6Var = new r6(context);
                Paint paint = new Paint(1);
                r6Var.a = paint;
                Paint paint2 = new Paint(1);
                r6Var.b = paint2;
                r6Var.d = new org.telegram.ui.Components.c6(r6Var, 350L, krVar);
                int i13 = org.telegram.ui.ActionBar.n6.N6;
                paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.n6.r1(0.2f, org.telegram.ui.ActionBar.n6.x0(null, i13, false)));
                h0Var.c = r6Var;
                h0Var.addView(r6Var, c8.na.d(org.telegram.messenger.ks.P3, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.f3.l(textView, i12, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.gd.N0(2131752034, null));
                h0Var.addView(textView, c8.na.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.u6.U(textView2, i12, null);
                i5.c.r(14.0f, 1, 2131752033, textView2, null);
                h0Var.addView(textView2, c8.na.d(org.telegram.messenger.ks.P3, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                h0Var.f(0.0f);
                p6Var.O = h0Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                oi.h hVar = new oi.h(q6Var, h0Var, fArr, zArr2, 6);
                long[] jArr = {-1};
                org.telegram.messenger.g0.h3(new oi.h(q6Var, zArr, jArr, p6Var, 7), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var2 = new n6(fArr, zArr2, hVar, null == true ? 1 : 0);
                o6 o6Var = new o6(zArr, h0Var, jArr, p6Var, 0);
                ei.c cVar = y6Var.e0;
                if (cVar != null) {
                    cVar.d();
                }
                j6 j6Var = y6Var.N;
                if (j6Var != null) {
                    j6Var.e();
                    y6Var.N.f(false);
                }
                y6Var.getFileLoader().c();
                y6Var.getFileLoader().getClass();
                org.telegram.messenger.w7.K.c(new f6(y6Var, n6Var2, o6Var, null == true ? 1 : 0));
                y6Var.e0 = null;
                j6 j6Var2 = y6Var.N;
                if (j6Var2 != null) {
                    j6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 14:
                ad.Z((ad) this.b, t1Var);
                break;
            case 17:
                ((vf) this.b).run();
                break;
            case 19:
                bn bnVar = ((ti) this.b).b;
                bnVar.finishFragment();
                bnVar.getNotificationCenter().k(org.telegram.messenger.ks.L1, bnVar.e4);
                break;
            case 23:
                bn bnVar2 = ((fl) this.b).a.R;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                org.telegram.messenger.f4.f(i10).a(bnVar2.l6, true, true);
                break;
            case 24:
                ((yn) this.b).b.e0();
                break;
            case 25:
                uo uoVar = (uo) this.b;
                boolean z10 = uoVar.s;
                if (!z10 || uoVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.t1[] t1VarArr = {new org.telegram.ui.ActionBar.t1(3, uoVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.mp.k1(uoVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.mp.k1(uoVar.f);
                    }
                    org.telegram.messenger.g0.h3(new ko(uoVar, t1VarArr, uoVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new v7(9, uoVar, t1VarArr)), i11), 500L);
                    break;
                }
                break;
            default:
                ((wp) this.b).a(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = this.a;
        Object obj3 = this.b;
        switch (i7) {
            case 15:
                rd rdVar = (rd) obj3;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) obj;
                td tdVar = rdVar.f;
                Object obj4 = n41Var.H;
                if (!(obj4 instanceof TL_stars.StarsTransaction)) {
                    if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                        xd.M(rdVar.getContext(), rdVar.c, (TL_stats.BroadcastRevenueTransaction) n41Var.H, tdVar.e, rdVar.b);
                        break;
                    }
                } else {
                    di.pb.l1(rdVar.getContext(), true, tdVar.e, rdVar.c, (TL_stars.StarsTransaction) n41Var.H, rdVar.b);
                    break;
                }
                break;
            default:
                qr qrVar = (qr) obj3;
                View view = (View) obj2;
                int i10 = ((org.telegram.ui.Components.n41) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z10 = !qrVar.Y;
                        qrVar.Y = z10;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
                    if (c22 != null && qrVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, qrVar.getParentActivity(), qrVar.r);
                        String N0 = org.telegram.messenger.gd.N0(2131751540, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.S = N0;
                        t1Var.U = org.telegram.messenger.gd.N0(2131754100, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.Components.g2(27, qrVar, c22));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public RecyclerView l(View view) {
        return ((t7) this.b).c(view);
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        k0 k0Var;
        ab.q qVar = (ab.q) this.b;
        qVar.getClass();
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        r4 r4Var = (r4) qVar.d;
        if (r4Var == view && (k0Var = r4Var.b) != null) {
            k0Var.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        return r0.l1.b;
    }

    @Override // fi.a9
    public void m(Canvas canvas, RectF rectF, float f10) {
        j8 j8Var = ((w7) this.b).a;
        Paint paint = j8Var.x;
        TextPaint textPaint = j8Var.e;
        paint.setAlpha((int) (80.0f * f10));
        float T1 = org.telegram.messenger.g0.T1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f10);
        canvas.drawRoundRect(rectF, T1, T1, paint);
        float i7 = Utilities.i((f10 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i7 > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i7));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / org.telegram.messenger.g0.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(j8Var.i0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public void n(int i7) {
        org.telegram.messenger.bz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i7)).intValue()).apply();
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        t9 t9Var = (t9) this.b;
        HandlerThread handlerThread = t9Var.e;
        handlerThread.start();
        t9Var.f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.h3(t9Var.e0, 0L);
        if (t9Var.f0()) {
            r1.g gVar = t9Var.E;
            if (gVar != null) {
                gVar.d();
                t9Var.E = null;
            }
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            t9Var.E = gVar2;
            int i7 = 0;
            gVar2.b(new l9(t9Var, i7));
            t9Var.E.a(new m9(t9Var, i7));
            t9Var.E.m = new r1.h(500.0f);
            t9Var.E.m.a(0.8f);
            t9Var.E.m.b(250.0f);
            t9Var.E.h();
        }
    }

    @Override // org.telegram.ui.Components.mc0
    public void p(org.telegram.ui.Components.oc0 oc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.b0;
        org.telegram.messenger.bz.C = false;
        Intent intent = bubbleActivity.V;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.W, bubbleActivity.Y, true, bubbleActivity.X);
            bubbleActivity.V = null;
        }
        bubbleActivity.T.f0();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.o0, oc0Var);
    }

    @Override // org.telegram.messenger.lr
    public void q(boolean z10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        org.telegram.ui.ActionBar.r4 r4Var3;
        org.telegram.ui.ActionBar.r4 r4Var4;
        org.telegram.ui.ActionBar.r4 r4Var5;
        switch (this.a) {
            case 20:
                bn bnVar = ((si) this.b).b.b;
                bnVar.Ta(bnVar.s4, true);
                break;
            case 21:
                bn bnVar2 = ((zk) this.b).n1;
                if (z10) {
                    bnVar2.h8();
                    UndoView undoView = bnVar2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                rq rqVar = ((jq) this.b).n1;
                if (z10) {
                    r4Var = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                    if (r4Var != null) {
                        r4Var2 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                        List fragmentStack = r4Var2.getFragmentStack();
                        r4Var3 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(r4Var3.getFragmentStack().size() - 2);
                        if (!(g2Var instanceof rn)) {
                            rqVar.finishFragment();
                            break;
                        } else {
                            g2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", rqVar.N);
                            rn rnVar = new rn(bundle);
                            rnVar.q0(rqVar.r);
                            r4Var4 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                            r4Var5 = ((org.telegram.ui.ActionBar.g2) rqVar).parentLayout;
                            ((ActionBarLayout) r4Var4).c(r4Var5.getFragmentStack().size() - 1, rnVar);
                            rqVar.finishFragment();
                            rnVar.c.j(76, 0L, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qt0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // org.telegram.messenger.mc
    public void s(Exception exc) {
        ((org.telegram.ui.Cells.g0) this.b).setClickable(false);
    }

    public void t(String str) {
        bn bnVar = ((kl) this.b).R;
        if (str.startsWith("@")) {
            bnVar.getMessagesController().F3(str.substring(1), bnVar, 0, null);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            bx bxVar = new bx(null);
            bxVar.p2 = str;
            bnVar.presentFragment(bxVar);
        } else {
            if (!str.startsWith("/")) {
                bnVar.Za(0, str, null, null, false);
                return;
            }
            bnVar.a0.D1(null, str, false, false);
            if (bnVar.a0.getFieldText() == null) {
                bnVar.D9(false);
            }
        }
    }

    public /* synthetic */ w0(si siVar, boolean z10) {
        this.a = 20;
        this.b = siVar;
    }

    @Override // org.telegram.ui.Components.wm0
    public /* synthetic */ void h(float f10) {
    }

    @Override // org.telegram.ui.Components.fu0
    public /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void f0(View view, float f10, float f11) {
    }
}
