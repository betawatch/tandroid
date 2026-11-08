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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements org.telegram.ui.Components.im0, hi.a4, ib1, r0.m, org.telegram.ui.ActionBar.r1, ug.s, org.telegram.ui.Components.cc0, org.telegram.ui.Components.cj0, org.telegram.ui.Components.ft0, org.telegram.ui.Components.ut0, di.k9, org.telegram.ui.Components.qi0, CameraView.CameraViewDelegate, org.telegram.messenger.a20, org.telegram.messenger.oc, org.telegram.ui.Components.oh0, org.telegram.messenger.qr, org.telegram.ui.Cells.d0, ax {
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

    @Override // org.telegram.ui.Components.im0
    public void a(float f10) {
        x0 x0Var = (x0) this.b;
        org.telegram.messenger.ij ijVar = x0Var.M;
        if (ijVar == null) {
            return;
        }
        ijVar.b0 = f10;
        MediaController.B().i0(x0Var.M, f10);
    }

    @Override // org.telegram.ui.ax
    public void b() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.b;
        int i7 = ChatsWidgetConfigActivity.F;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.E);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.ib1
    public void c(int i7, ArrayList arrayList) {
        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.p(9, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.qi0
    public void e() {
        ((oi.q) this.b).g();
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        x5 x5Var = (x5) this.b;
        ArrayList arrayList = x5Var.c;
        int i10 = 4;
        int i11 = 0;
        if (((w5) arrayList.get(i7)).a != 1) {
            if (((w5) arrayList.get(i7)).a == 2) {
                org.telegram.messenger.s2 s2Var = ((w5) arrayList.get(i7)).c;
                e60 e60Var = new e60(view.getContext(), x5Var);
                e60Var.h(false);
                e60Var.setParentWindow(org.telegram.ui.Components.v4.N(x5Var, e60Var, view, f10, f11));
                e60Var.setCallback(new u5(x5Var, s2Var, i11));
                return;
            }
            if (((w5) arrayList.get(i7)).a == 4) {
                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(x5Var.getParentActivity(), org.telegram.messenger.id.M0(2131747914, null), org.telegram.messenger.id.M0(2131747915, null), org.telegram.messenger.id.M0(2131751599, null), new gq0(x5Var, 13), null).a;
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
        ww wwVar = new ww(bundle);
        wwVar.C2 = new ni.c(i10, x5Var, wwVar);
        x5Var.presentFragment(wwVar);
    }

    @Override // org.telegram.ui.Components.cj0
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
                org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(context);
                ch0Var.setAutoRepeat(true);
                ch0Var.f(R.raw.utyan_cache, org.telegram.messenger.qs.g2, org.telegram.messenger.qs.g2, null);
                x5Var.addView(ch0Var, c8.ha.d(org.telegram.messenger.qs.g2, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                ch0Var.d();
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
                x5Var.b = j6Var;
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.g;
                j6Var.b(0.35f, 120L, xqVar);
                j6Var.setGravity(1);
                int i12 = org.telegram.ui.ActionBar.k6.j5;
                org.telegram.ui.ActionBar.r6.Z(j6Var, i12, null);
                j6Var.setTextSize(org.telegram.messenger.g0.L(24.0f));
                j6Var.setTypeface(org.telegram.messenger.g0.o());
                x5Var.addView(j6Var, c8.ha.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                r6 r6Var = new r6(context);
                Paint paint = new Paint(1);
                r6Var.a = paint;
                Paint paint2 = new Paint(1);
                r6Var.b = paint2;
                r6Var.d = new org.telegram.ui.Components.w5(r6Var, 350L, xqVar);
                int i13 = org.telegram.ui.ActionBar.k6.N6;
                paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                paint2.setColor(org.telegram.ui.ActionBar.k6.r1(0.2f, org.telegram.ui.ActionBar.k6.x0(null, i13, false)));
                x5Var.c = r6Var;
                x5Var.addView(r6Var, c8.ha.d(org.telegram.messenger.qs.P3, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.k5.n(textView, i12, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.id.M0(2131752046, null));
                x5Var.addView(textView, c8.ha.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.r6.V(textView2, i12, null);
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
                an anVar = ((si) this.b).b;
                anVar.finishFragment();
                anVar.getNotificationCenter().k(org.telegram.messenger.qs.L1, anVar.d4);
                break;
            case 23:
                an anVar2 = ((el) this.b).a.Q;
                i10 = ((org.telegram.ui.ActionBar.f2) anVar2).currentAccount;
                org.telegram.messenger.d4.f(i10).a(anVar2.j6, true, true);
                break;
            case 24:
                ((wn) this.b).b.e0();
                break;
            case 25:
                so soVar = (so) this.b;
                boolean z9 = soVar.s;
                if (!z9 || soVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.u1[] u1VarArr = {new org.telegram.ui.ActionBar.u1(3, soVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z9) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.qp.i1(soVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.qp.i1(soVar.f);
                    }
                    org.telegram.messenger.g0.i3(new io(soVar, u1VarArr, soVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ld(7, soVar, u1VarArr)), i11), 500L);
                    break;
                }
                break;
            default:
                ((tp) this.b).a(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ft0
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
                org.telegram.ui.Components.x31 x31Var = (org.telegram.ui.Components.x31) obj;
                vd vdVar = tdVar.f;
                Object obj4 = x31Var.G;
                if (!(obj4 instanceof TL_stars.StarsTransaction)) {
                    if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                        zd.M(tdVar.getContext(), tdVar.c, (TL_stats.BroadcastRevenueTransaction) x31Var.G, vdVar.e, tdVar.b);
                        break;
                    }
                } else {
                    bi.dd.k1(tdVar.getContext(), true, vdVar.e, tdVar.c, (TL_stars.StarsTransaction) x31Var.G, tdVar.b);
                    break;
                }
                break;
            default:
                nr nrVar = (nr) obj3;
                View view = (View) obj2;
                int i10 = ((org.telegram.ui.Components.x31) obj).d;
                if (i10 != 1) {
                    if (i10 == 2) {
                        boolean z9 = !nrVar.X;
                        nrVar.X = z9;
                        ((org.telegram.ui.Cells.r8) view).setChecked(z9);
                        break;
                    }
                } else {
                    TLRPC.User a22 = nrVar.getMessagesController().a2(Long.valueOf(nrVar.H));
                    if (a22 != null && nrVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nrVar.getParentActivity(), nrVar.r);
                        String M0 = org.telegram.messenger.id.M0(2131751553, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new org.telegram.ui.Components.f2(24, nrVar, a22));
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.oh0
    public void j(ArrayList arrayList) {
        oh ohVar = (oh) this.b;
        an anVar = ohVar.p;
        if (anVar.getParentActivity() == null || anVar.getParentActivity() == null) {
            return;
        }
        nh nhVar = new nh(ohVar, anVar, anVar.getParentActivity(), anVar.xa, arrayList);
        boolean T9 = anVar.T9();
        nhVar.h0 = T9;
        nhVar.n = T9;
        nhVar.o0 = false;
        anVar.O7(false);
        anVar.showDialog(nhVar);
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
                an anVar = ((ri) this.b).b.b;
                anVar.Qa(anVar.r4, true);
                break;
            case 21:
                an anVar2 = ((yk) this.b).j1;
                if (z9) {
                    anVar2.f8();
                    UndoView undoView = anVar2.M3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                oq oqVar = ((gq) this.b).j1;
                if (z9) {
                    q4Var = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                    if (q4Var != null) {
                        q4Var2 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                        List fragmentStack = q4Var2.getFragmentStack();
                        q4Var3 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) fragmentStack.get(q4Var3.getFragmentStack().size() - 2);
                        if (!(f2Var instanceof pn)) {
                            oqVar.finishFragment();
                            break;
                        } else {
                            f2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", oqVar.M);
                            pn pnVar = new pn(bundle);
                            pnVar.q0(oqVar.r);
                            q4Var4 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                            q4Var5 = ((org.telegram.ui.ActionBar.f2) oqVar).parentLayout;
                            ((ActionBarLayout) q4Var4).c(q4Var5.getFragmentStack().size() - 1, pnVar);
                            oqVar.finishFragment();
                            pnVar.c.j(76, 0L, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ft0
    public RecyclerView l(View view) {
        return ((t7) this.b).c(view);
    }

    @Override // org.telegram.ui.Components.ut0
    public void m(int i7) {
        org.telegram.messenger.iz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i7)).intValue()).apply();
    }

    @Override // di.k9
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

    @Override // org.telegram.ui.Components.cc0
    public void p(org.telegram.ui.Components.ec0 ec0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        org.telegram.messenger.iz.C = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.f0();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o0, ec0Var);
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

    @Override // org.telegram.ui.Components.ft0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public void t(String str) {
        an anVar = ((jl) this.b).Q;
        if (str.startsWith("@")) {
            anVar.getMessagesController().y3(str.substring(1), anVar, 0, null);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ww wwVar = new ww(null);
            wwVar.n2 = str;
            anVar.presentFragment(wwVar);
        } else {
            if (!str.startsWith("/")) {
                anVar.Wa(0, str, null, null, false);
                return;
            }
            anVar.Z.Z0(null, str, false, false);
            if (anVar.Z.getFieldText() == null) {
                anVar.B9(false);
            }
        }
    }

    public /* synthetic */ w0(ri riVar, boolean z9) {
        this.a = 20;
        this.b = riVar;
    }

    @Override // org.telegram.ui.Components.im0
    public /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.ui.Components.ut0
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
