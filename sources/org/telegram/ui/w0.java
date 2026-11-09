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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements org.telegram.ui.Components.jm0, hi.a4, kb1, r0.m, org.telegram.ui.ActionBar.r1, ug.s, org.telegram.ui.Components.dc0, org.telegram.ui.Components.dj0, org.telegram.ui.Components.ht0, org.telegram.ui.Components.wt0, di.l9, org.telegram.ui.Components.ri0, CameraView.CameraViewDelegate, org.telegram.messenger.a20, org.telegram.messenger.oc, org.telegram.ui.Components.ph0, org.telegram.messenger.qr, org.telegram.ui.Cells.d0, cx {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        k0 k0Var;
        ab.q qVar = (ab.q) this.b;
        qVar.getClass();
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        r4 r4Var = (r4) qVar.d;
        if (r4Var == view && (k0Var = r4Var.b) != null) {
            k0Var.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.jm0
    public void a(float f10) {
        x0 x0Var = (x0) this.b;
        org.telegram.messenger.ij ijVar = x0Var.M;
        if (ijVar == null) {
            return;
        }
        ijVar.b0 = f10;
        MediaController.B().i0(x0Var.M, f10);
    }

    @Override // org.telegram.ui.cx
    public void b() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.b;
        int i7 = ChatsWidgetConfigActivity.F;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.kb1
    public void c(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(9, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.ri0
    public void e() {
        ((oi.q) this.b).g();
    }

    @Override // org.telegram.ui.Components.dj0
    public void f(float f10, float f11, int i7, View view) {
        x5 x5Var = (x5) this.b;
        ArrayList arrayList = x5Var.c;
        int i10 = 4;
        int i11 = 0;
        if (((w5) arrayList.get(i7)).a != 1) {
            if (((w5) arrayList.get(i7)).a == 2) {
                org.telegram.messenger.s2 s2Var = ((w5) arrayList.get(i7)).c;
                g60 g60Var = new g60(view.getContext(), x5Var);
                g60Var.h(false);
                g60Var.setParentWindow(org.telegram.ui.Components.v4.N(x5Var, g60Var, view, f10, f11));
                g60Var.setCallback(new u5(x5Var, s2Var, i11));
                return;
            }
            if (((w5) arrayList.get(i7)).a == 4) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(x5Var.getParentActivity(), org.telegram.messenger.id.M0(2131747913, null), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131751598, null), new iq0(x5Var, 13), null).a;
                u1Var.show();
                u1Var.i();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        int i12 = x5Var.e;
        if (i12 == 1) {
            bundle.putInt("dialogsType", 6);
        } else if (i12 == 2) {
            bundle.putInt("dialogsType", 5);
        } else {
            bundle.putInt("dialogsType", 4);
        }
        bundle.putBoolean("allowGlobalSearch", false);
        yw ywVar = new yw(bundle);
        ywVar.D2 = new ni.c(i10, x5Var, ywVar);
        x5Var.presentFragment(ywVar);
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                p6Var.N();
                p6Var.b0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                bi.x5 x5Var = new bi.x5(9, context, (boolean) (null == true ? 1 : 0));
                org.telegram.ui.Components.dh0 dh0Var = new org.telegram.ui.Components.dh0(context);
                dh0Var.setAutoRepeat(true);
                dh0Var.f(R.raw.utyan_cache, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, null);
                x5Var.addView(dh0Var, c8.ha.d(org.telegram.messenger.qs.g2, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                dh0Var.d();
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
                x5Var.b = j6Var;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.g;
                j6Var.b(0.35f, 120L, xqVar);
                j6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.l6.j5;
                org.telegram.ui.ActionBar.s6.Y(j6Var, i12, null);
                j6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                j6Var.setTypeface(org.telegram.messenger.g0.o());
                x5Var.addView(j6Var, c8.ha.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                r6 r6Var = new r6(context);
                Paint paint = new Paint(1);
                r6Var.a = paint;
                Paint paint2 = new Paint(1);
                r6Var.b = paint2;
                r6Var.d = new org.telegram.ui.Components.w5(r6Var, 350L, xqVar);
                int i13 = org.telegram.ui.ActionBar.l6.N6;
                paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.l6.r1(0.2f, org.telegram.ui.ActionBar.l6.x0(null, i13, false)));
                x5Var.c = r6Var;
                x5Var.addView(r6Var, c8.ha.d(org.telegram.messenger.qs.P3, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.k5.n(textView, i12, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.id.M0(2131752046, null));
                x5Var.addView(textView, c8.ha.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.s6.U(textView2, i12, null);
                jg.g.v(textView2, 1, 14.0f, null, 2131752045);
                x5Var.addView(textView2, c8.ha.d(org.telegram.messenger.qs.P3, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                x5Var.f(0.0f);
                p6Var.N = x5Var;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                m6 m6Var = new m6(q6Var, x5Var, fArr, zArr2, 0);
                long[] jArr = {-1};
                org.telegram.messenger.g0.i3(new m6((Object) q6Var, zArr, (Object) jArr, (Object) p6Var, 1), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var = new n6(fArr, zArr2, m6Var, null == true ? 1 : 0);
                o6 o6Var = new o6(zArr, x5Var, jArr, p6Var, 0);
                ci.c cVar = y6Var.d0;
                if (cVar != null) {
                    cVar.d();
                }
                i6 i6Var = y6Var.M;
                if (i6Var != null) {
                    i6Var.e();
                    y6Var.M.f(false);
                }
                y6Var.getFileLoader().c();
                y6Var.getFileLoader().getClass();
                org.telegram.messenger.w7.J.c(new e6(y6Var, n6Var, o6Var, null == true ? 1 : 0));
                y6Var.d0 = null;
                i6 i6Var2 = y6Var.M;
                if (i6Var2 != null) {
                    i6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 14:
                bd.Z((bd) this.b, u1Var);
                break;
            case 17:
                ((xf) this.b).run();
                break;
            case 19:
                cn cnVar = ((ui) this.b).b;
                cnVar.finishFragment();
                cnVar.getNotificationCenter().k(org.telegram.messenger.qs.L1, cnVar.d4);
                break;
            case 23:
                cn cnVar2 = ((gl) this.b).a.Q;
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar2).currentAccount;
                org.telegram.messenger.d4.f(i10).a(cnVar2.j6, true, true);
                break;
            case 24:
                ((yn) this.b).b.e0();
                break;
            case 25:
                uo uoVar = (uo) this.b;
                boolean z9 = uoVar.s;
                if (!z9 || uoVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, uoVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z9) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.qp.i1(uoVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.qp.i1(uoVar.f);
                    }
                    org.telegram.messenger.g0.i3(new ko(uoVar, u1VarArr, uoVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ld(7, uoVar, u1VarArr)), i11), 500L);
                    break;
                }
                break;
            default:
                ((vp) this.b).a(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ht0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i7 = this.a;
        Object obj3 = this.b;
        switch (i7) {
            case 15:
                td tdVar = (td) obj3;
                org.telegram.ui.Components.y31 y31Var = (org.telegram.ui.Components.y31) obj;
                vd vdVar = tdVar.f;
                Object obj4 = y31Var.G;
                if (!(obj4 instanceof TL_stars.StarsTransaction)) {
                    if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                        zd.M(tdVar.getContext(), tdVar.c, (TL_stats.BroadcastRevenueTransaction) y31Var.G, vdVar.e, tdVar.b);
                        break;
                    }
                } else {
                    bi.dd.k1(tdVar.getContext(), true, vdVar.e, tdVar.c, (TL_stars.StarsTransaction) y31Var.G, tdVar.b);
                    break;
                }
                break;
            default:
                pr prVar = (pr) obj3;
                View view = (View) obj2;
                int i10 = ((org.telegram.ui.Components.y31) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z9 = !prVar.X;
                        prVar.X = z9;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                        break;
                    }
                } else {
                    TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
                    if (a22 != null && prVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, prVar.getParentActivity(), prVar.r);
                        String M0 = org.telegram.messenger.id.M0(2131751552, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.Components.f2(24, prVar, a22));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ph0
    public void j(ArrayList arrayList) {
        qh qhVar = (qh) this.b;
        cn cnVar = qhVar.p;
        if (cnVar.getParentActivity() == null || cnVar.getParentActivity() == null) {
            return;
        }
        ph phVar = new ph(qhVar, cnVar, cnVar.getParentActivity(), cnVar.za, arrayList);
        boolean U9 = cnVar.U9();
        phVar.h0 = U9;
        phVar.n = U9;
        phVar.o0 = false;
        cnVar.P7(false);
        cnVar.showDialog(phVar);
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.q4 q4Var3;
        org.telegram.ui.ActionBar.q4 q4Var4;
        org.telegram.ui.ActionBar.q4 q4Var5;
        switch (this.a) {
            case 20:
                cn cnVar = ((ti) this.b).b.b;
                cnVar.Sa(cnVar.r4, true);
                break;
            case 21:
                cn cnVar2 = ((al) this.b).j1;
                if (z9) {
                    cnVar2.g8();
                    UndoView undoView = cnVar2.M3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                qq qqVar = ((iq) this.b).j1;
                if (z9) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) qqVar).parentLayout;
                    if (q4Var != null) {
                        q4Var2 = ((org.telegram.ui.ActionBar.f2) qqVar).parentLayout;
                        List fragmentStack = q4Var2.getFragmentStack();
                        q4Var3 = ((org.telegram.ui.ActionBar.f2) qqVar).parentLayout;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var3.getFragmentStack().size() - 2);
                        if (!(f2Var instanceof rn)) {
                            qqVar.finishFragment();
                            break;
                        } else {
                            f2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", qqVar.M);
                            rn rnVar = new rn(bundle);
                            rnVar.q0(qqVar.r);
                            q4Var4 = ((org.telegram.ui.ActionBar.f2) qqVar).parentLayout;
                            q4Var5 = ((org.telegram.ui.ActionBar.f2) qqVar).parentLayout;
                            ((ActionBarLayout) q4Var4).c(q4Var5.getFragmentStack().size() - 1, rnVar);
                            qqVar.finishFragment();
                            rnVar.c.j(76, 0L, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ht0
    public RecyclerView l(View view) {
        return ((t7) this.b).c(view);
    }

    @Override // org.telegram.ui.Components.wt0
    public void m(int i7) {
        org.telegram.messenger.iz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i7)).intValue()).apply();
    }

    @Override // di.l9
    public void o(Canvas canvas, RectF rectF, float f10) {
        h8 h8Var = ((v7) this.b).a;
        Paint paint = h8Var.x;
        TextPaint textPaint = h8Var.e;
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
            canvas.drawText(Integer.toString(h8Var.h0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.g0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        s9 s9Var = (s9) this.b;
        HandlerThread handlerThread = s9Var.e;
        handlerThread.start();
        s9Var.f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.g0.i3(s9Var.d0, 0L);
        if (s9Var.f0()) {
            r1.g gVar = s9Var.D;
            if (gVar != null) {
                gVar.d();
                s9Var.D = null;
            }
            r1.g gVar2 = new r1.g(new r1.f(0.0f));
            s9Var.D = gVar2;
            int i7 = 0;
            gVar2.b(new k9(s9Var, i7));
            s9Var.D.a(new l9(s9Var, i7));
            s9Var.D.m = new r1.h(500.0f);
            s9Var.D.m.a(0.8f);
            s9Var.D.m.b(250.0f);
            s9Var.D.h();
        }
    }

    @Override // org.telegram.ui.Components.dc0
    public void p(org.telegram.ui.Components.fc0 fc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        org.telegram.messenger.iz.C = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.f0();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o0, fc0Var);
    }

    @Override // hi.a4
    public void q(boolean z9) {
        k3 k3Var = (k3) this.b;
        t3 t3Var = k3Var.L.K;
        if (t3Var != null) {
            k3Var.h = true;
            t3Var.a(true);
        }
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        ((org.telegram.ui.Cells.f0) this.b).setClickable(false);
    }

    @Override // org.telegram.ui.Components.ht0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public void t(String str) {
        cn cnVar = ((ll) this.b).Q;
        if (str.startsWith("@")) {
            cnVar.getMessagesController().y3(str.substring(1), cnVar, 0, null);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            yw ywVar = new yw(null);
            ywVar.o2 = str;
            cnVar.presentFragment(ywVar);
        } else {
            if (!str.startsWith("/")) {
                cnVar.Ya(0, str, null, null, false);
                return;
            }
            cnVar.Z.a1(null, str, false, false);
            if (cnVar.Z.getFieldText() == null) {
                cnVar.C9(false);
            }
        }
    }

    public /* synthetic */ w0(ti tiVar, boolean z9) {
        this.a = 20;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.jm0
    public /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.ui.Components.wt0
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.dj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
