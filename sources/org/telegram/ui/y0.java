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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements org.telegram.ui.Components.jn0, xh.g3, dd1, r0.m, org.telegram.ui.ActionBar.u1, kg.w, org.telegram.ui.Components.xc0, org.telegram.ui.Components.hk0, org.telegram.ui.Components.iu0, org.telegram.ui.Components.xu0, th.j7, org.telegram.ui.Components.uj0, CameraView.CameraViewDelegate, org.telegram.messenger.o20, org.telegram.messenger.pc, org.telegram.ui.Components.si0, org.telegram.messenger.zr, org.telegram.ui.Cells.d0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        l0 l0Var;
        ac.a aVar = (ac.a) this.b;
        aVar.getClass();
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        r4 r4Var = (r4) aVar.d;
        if (r4Var == view && (l0Var = r4Var.b) != null) {
            l0Var.setPadding(I0.a, I0.b, I0.c, I0.d);
        }
        return r0.j1.b;
    }

    @Override // xh.g3
    public void a(boolean z10) {
        l3 l3Var = (l3) this.b;
        u3 u3Var = l3Var.L.K;
        if (u3Var != null) {
            l3Var.h = true;
            u3Var.a(true);
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        x5 x5Var = (x5) this.b;
        ArrayList arrayList = x5Var.c;
        int i11 = 4;
        int i12 = 0;
        if (((w5) arrayList.get(i10)).a != 1) {
            if (((w5) arrayList.get(i10)).a == 2) {
                org.telegram.messenger.w2 w2Var = ((w5) arrayList.get(i10)).c;
                d70 d70Var = new d70(view.getContext(), x5Var);
                d70Var.h(false);
                d70Var.setParentWindow(org.telegram.ui.Components.s4.P(x5Var, d70Var, view, f7, f10));
                d70Var.setCallback(new u5(x5Var, w2Var, i12));
                return;
            }
            if (((w5) arrayList.get(i10)).a == 4) {
                org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(x5Var.getParentActivity(), org.telegram.messenger.cd.L0(2131747929, null), org.telegram.messenger.cd.L0(2131747930, null), org.telegram.messenger.cd.L0(2131751599, null), new rr0(x5Var, 13), null).a;
                x1Var.show();
                x1Var.i();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        int i13 = x5Var.e;
        if (i13 == 1) {
            bundle.putInt("dialogsType", 6);
        } else if (i13 == 2) {
            bundle.putInt("dialogsType", 5);
        } else {
            bundle.putInt("dialogsType", 4);
        }
        bundle.putBoolean("allowGlobalSearch", false);
        ay ayVar = new ay(bundle);
        ayVar.C2 = new ng.d(i11, x5Var, ayVar);
        x5Var.presentFragment(ayVar);
    }

    @Override // org.telegram.ui.Components.jn0
    public void c(float f7) {
        z0 z0Var = (z0) this.b;
        org.telegram.messenger.jj jjVar = z0Var.M;
        if (jjVar == null) {
            return;
        }
        jjVar.b0 = f7;
        MediaController.B().i0(z0Var.M, f7);
    }

    @Override // org.telegram.ui.dd1
    public void e(int i10, ArrayList arrayList) {
        org.telegram.messenger.i0.h3(new h0(3, (m4) this.b, arrayList), 100L);
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ float f(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.uj0
    public void g() {
        ((ei.r) this.b).g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        int i12 = 0;
        switch (this.a) {
            case 4:
                f5 f5Var = (f5) this.b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.b.getPackageName()));
                    f5Var.startActivity(intent);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 9:
                q6 q6Var = (q6) this.b;
                p6 p6Var = new p6(null == true ? 1 : 0, q6Var.getContext(), null == true ? 1 : 0);
                p6Var.O();
                p6Var.b0 = false;
                p6Var.setCancelable(false);
                Context context = q6Var.getContext();
                fg.i iVar = new fg.i(context, 7);
                org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
                ei0Var.setAutoRepeat(true);
                ei0Var.f(R.raw.utyan_cache, org.telegram.messenger.zs.g2, org.telegram.messenger.zs.g2, null);
                iVar.addView(ei0Var, w7.b6.d(org.telegram.messenger.zs.g2, 150.0f, 49, 0.0f, 16.0f, 0.0f, 0.0f));
                ei0Var.d();
                org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true);
                iVar.b = f6Var;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.g;
                f6Var.b(0.35f, 120L, grVar);
                f6Var.setGravity(1);
                int i13 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.ui.ActionBar.a7.Z(f6Var, i13, null);
                f6Var.setTextSize(org.telegram.messenger.i0.L(24.0f));
                f6Var.setTypeface(org.telegram.messenger.i0.o());
                iVar.addView(f6Var, w7.b6.d(-1, 32.0f, 49, 0.0f, 176.0f, 0.0f, 0.0f));
                r6 r6Var = new r6(context);
                Paint paint = new Paint(1);
                r6Var.a = paint;
                Paint paint2 = new Paint(1);
                r6Var.b = paint2;
                r6Var.d = new org.telegram.ui.Components.t5(r6Var, 350L, grVar);
                int i14 = org.telegram.ui.ActionBar.t6.N6;
                paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i14, false));
                paint2.setColor(org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, i14, false)));
                iVar.c = r6Var;
                iVar.addView(r6Var, w7.b6.d(org.telegram.messenger.zs.P3, 5.0f, 49, 0.0f, 226.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(1);
                org.telegram.messenger.m5.m(textView, i13, null, 1, 16.0f);
                textView.setText(org.telegram.messenger.cd.L0(2131752046, null));
                iVar.addView(textView, w7.b6.d(-1, -2.0f, 49, 0.0f, 261.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setGravity(1);
                org.telegram.ui.ActionBar.a7.V(textView2, i13, null);
                sc.e.u(textView2, 1, 14.0f, null, 2131752045);
                iVar.addView(textView2, w7.b6.d(org.telegram.messenger.zs.P3, -2.0f, 49, 0.0f, 289.0f, 0.0f, 0.0f));
                iVar.d(0.0f);
                p6Var.N = iVar;
                boolean[] zArr = {false};
                float[] fArr = {0.0f};
                boolean[] zArr2 = {false};
                ag.q0 q0Var = new ag.q0(q6Var, iVar, fArr, zArr2, 20);
                long[] jArr = {-1};
                org.telegram.messenger.i0.h3(new ag.q0(q6Var, zArr, jArr, p6Var, 21), 150L);
                y6 y6Var = q6Var.d;
                n6 n6Var = new n6(fArr, zArr2, q0Var, null == true ? 1 : 0);
                o6 o6Var = new o6(zArr, iVar, jArr, p6Var, 0);
                sh.b bVar = y6Var.d0;
                if (bVar != null) {
                    bVar.d();
                }
                j6 j6Var = y6Var.M;
                if (j6Var != null) {
                    j6Var.e();
                    y6Var.M.f(false);
                }
                y6Var.getFileLoader().c();
                y6Var.getFileLoader().getClass();
                org.telegram.messenger.b8.J.c(new e6(y6Var, n6Var, o6Var, null == true ? 1 : 0));
                y6Var.d0 = null;
                j6 j6Var2 = y6Var.M;
                if (j6Var2 != null) {
                    j6Var2.setCacheModel(null);
                    break;
                }
                break;
            case 14:
                kd.Y((kd) this.b, x1Var);
                break;
            case 17:
                ((lg) this.b).run();
                break;
            case 19:
                un unVar = ((nj) this.b).b;
                unVar.finishFragment();
                unVar.getNotificationCenter().k(org.telegram.messenger.zs.L1, unVar.d4);
                break;
            case 23:
                un unVar2 = ((am) this.b).a.Q;
                i11 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                org.telegram.messenger.g4.f(i11).a(unVar2.j6, true, true);
                break;
            case 24:
                qp qpVar = (qp) this.b;
                boolean z10 = qpVar.s;
                if (!z10 || qpVar.h.linked_chat_id != 0) {
                    org.telegram.ui.ActionBar.x1[] x1VarArr = {new org.telegram.ui.ActionBar.x1(3, qpVar.getParentActivity(), null)};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z10) {
                        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.vp.h1(qpVar.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = org.telegram.messenger.vp.h1(qpVar.f);
                    }
                    org.telegram.messenger.i0.h3(new ep(qpVar, x1VarArr, qpVar.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ag.k0(21, qpVar, x1VarArr)), i12), 500L);
                    break;
                }
                break;
            default:
                ((sq) this.b).a(1);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.messenger.zr
    public void i(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        org.telegram.ui.ActionBar.z4 z4Var3;
        org.telegram.ui.ActionBar.z4 z4Var4;
        org.telegram.ui.ActionBar.z4 z4Var5;
        switch (this.a) {
            case 20:
                un unVar = ((mj) this.b).b.b;
                unVar.Ga(unVar.r4, true);
                break;
            case 21:
                un unVar2 = ((vl) this.b).j1;
                if (z10) {
                    unVar2.Y7();
                    UndoView undoView = unVar2.M3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        break;
                    }
                }
                break;
            default:
                pr prVar = ((hr) this.b).j1;
                if (z10) {
                    z4Var = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                    if (z4Var != null) {
                        z4Var2 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                        List fragmentStack = z4Var2.getFragmentStack();
                        z4Var3 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(z4Var3.getFragmentStack().size() - 2);
                        if (!(k2Var instanceof oo)) {
                            prVar.finishFragment();
                            break;
                        } else {
                            k2Var.removeSelfFromStack();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", prVar.M);
                            oo ooVar = new oo(bundle);
                            ooVar.p0(prVar.r);
                            z4Var4 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                            z4Var5 = ((org.telegram.ui.ActionBar.k2) prVar).parentLayout;
                            ((ActionBarLayout) z4Var4).c(z4Var5.getFragmentStack().size() - 1, ooVar);
                            prVar.finishFragment();
                            ooVar.c.j(76, 0L, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public RecyclerView j(View view) {
        return ((t7) this.b).c(view);
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 15:
                fe feVar = (fe) obj3;
                org.telegram.ui.Components.a51 a51Var = (org.telegram.ui.Components.a51) obj;
                he heVar = feVar.f;
                Object obj4 = a51Var.G;
                if (!(obj4 instanceof TL_stars.StarsTransaction)) {
                    if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                        le.M(feVar.getContext(), feVar.c, (TL_stats.BroadcastRevenueTransaction) a51Var.G, heVar.e, feVar.b);
                        break;
                    }
                } else {
                    rh.h8.j1(feVar.getContext(), true, heVar.e, feVar.c, (TL_stars.StarsTransaction) a51Var.G, feVar.b);
                    break;
                }
                break;
            default:
                ns nsVar = (ns) obj3;
                View view = (View) obj2;
                int i11 = ((org.telegram.ui.Components.a51) obj).d;
                if (i11 != 1) {
                    if (i11 == 2) {
                        boolean z10 = !nsVar.X;
                        nsVar.X = z10;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                        break;
                    }
                } else {
                    TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
                    if (Z1 != null && nsVar.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nsVar.getParentActivity(), nsVar.r);
                        String L0 = org.telegram.messenger.cd.L0(2131751553, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.Components.f2(25, nsVar, Z1));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.d(-1);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.si0
    public void l(ArrayList arrayList) {
        ki kiVar = (ki) this.b;
        un unVar = kiVar.p;
        if (unVar.getParentActivity() == null || unVar.getParentActivity() == null) {
            return;
        }
        ji jiVar = new ji(kiVar, unVar, unVar.getParentActivity(), unVar.xa, arrayList);
        boolean J9 = unVar.J9();
        jiVar.h0 = J9;
        jiVar.n = J9;
        jiVar.o0 = false;
        unVar.I7(false);
        unVar.showDialog(jiVar);
    }

    @Override // org.telegram.ui.Components.xu0
    public void m(int i10) {
        org.telegram.messenger.tz.q().edit().putInt("cache_limit", ((Integer) ((ArrayList) this.b).get(i10)).intValue()).apply();
    }

    @Override // th.j7
    public void n(Canvas canvas, RectF rectF, float f7) {
        h8 h8Var = ((v7) this.b).a;
        Paint paint = h8Var.x;
        TextPaint textPaint = h8Var.e;
        paint.setAlpha((int) (80.0f * f7));
        float T1 = org.telegram.messenger.i0.T1(0.0f, Math.min(rectF.width(), rectF.height()) / 2.0f, f7);
        canvas.drawRoundRect(rectF, T1, T1, paint);
        float i10 = Utilities.i((f7 - 0.5f) / 0.5f, 1.0f, 0.0f);
        if (i10 > 0.0f) {
            int alpha = textPaint.getAlpha();
            textPaint.setAlpha((int) (alpha * i10));
            canvas.save();
            float min = Math.min(2.0f, Math.min(rectF.height(), rectF.width()) / org.telegram.messenger.i0.L(44.0f));
            canvas.scale(min, min, rectF.centerX(), rectF.centerY());
            canvas.drawText(Integer.toString(h8Var.h0 + 1), rectF.centerX(), rectF.centerY() + org.telegram.messenger.i0.L(5.0f), textPaint);
            canvas.restore();
            textPaint.setAlpha(alpha);
        }
    }

    @Override // org.telegram.ui.Components.xc0
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        BubbleActivity bubbleActivity = (BubbleActivity) this.b;
        BubbleActivity bubbleActivity2 = BubbleActivity.a0;
        org.telegram.messenger.tz.C = false;
        Intent intent = bubbleActivity.U;
        if (intent != null) {
            bubbleActivity.x(intent, bubbleActivity.V, bubbleActivity.X, true, bubbleActivity.W);
            bubbleActivity.U = null;
        }
        bubbleActivity.S.e0();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.o0, zc0Var);
    }

    @Override // org.telegram.messenger.camera.CameraView.CameraViewDelegate
    public void onCameraInit() {
        u9 u9Var = (u9) this.b;
        HandlerThread handlerThread = u9Var.e;
        handlerThread.start();
        u9Var.f = new Handler(handlerThread.getLooper());
        org.telegram.messenger.i0.h3(u9Var.d0, 0L);
        if (u9Var.e0()) {
            o1.j jVar = u9Var.D;
            if (jVar != null) {
                jVar.d();
                u9Var.D = null;
            }
            o1.j jVar2 = new o1.j(new o1.i(0.0f));
            u9Var.D = jVar2;
            int i10 = 0;
            jVar2.b(new l9(u9Var, i10));
            u9Var.D.a(new m9(u9Var, i10));
            u9Var.D.m = new o1.k(500.0f);
            u9Var.D.m.a(0.8f);
            u9Var.D.m.b(250.0f);
            u9Var.D.h();
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public /* synthetic */ void p(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        ((org.telegram.ui.Cells.f0) this.b).setClickable(false);
    }

    public void r(String str) {
        un unVar = ((fm) this.b).Q;
        if (str.startsWith("@")) {
            unVar.getMessagesController().v3(str.substring(1), unVar, 0, null);
            return;
        }
        if (str.startsWith("#") || str.startsWith("$")) {
            ay ayVar = new ay(null);
            ayVar.n2 = str;
            unVar.presentFragment(ayVar);
        } else {
            if (!str.startsWith("/")) {
                unVar.Ma(0, str, null, null, false);
                return;
            }
            unVar.Z.Y0(null, str, false, false);
            if (unVar.Z.getFieldText() == null) {
                unVar.r9(false);
            }
        }
    }

    public /* synthetic */ y0(mj mjVar, boolean z10) {
        this.a = 20;
        this.b = mjVar;
    }

    @Override // org.telegram.ui.Components.jn0
    public /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.ui.Components.xu0
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
