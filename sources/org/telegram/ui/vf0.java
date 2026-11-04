package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class vf0 extends Dialog implements org.telegram.messenger.cs {
    public float E;
    public final jf0 F;
    public final qf0 G;
    public final jf0 H;
    public long I;
    public org.telegram.ui.Components.e5 J;
    public final rf0 K;
    public final gi.w L;
    public final org.telegram.ui.Components.p90 M;
    public final ArrayList N;
    public int O;
    public final a0.h P;
    public org.telegram.ui.Cells.q1 Q;
    public int R;
    public org.telegram.ui.Components.ve S;
    public final Paint T;
    public org.telegram.ui.Components.e U;
    public org.telegram.ui.Components.jd V;
    public org.telegram.ui.Components.bg W;
    public lf0 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final kf0 a0;
    public final org.telegram.ui.ActionBar.e6 b;
    public boolean b0;
    public final int c;
    public float c0;
    public i0.b d;
    public FrameLayout d0;
    public Bitmap e;
    public mf0 e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public boolean h0;
    public final yh.e i0;
    public final si.b j0;
    public final eh.c k0;
    public RectF l0;
    public boolean m0;
    public Matrix n;
    public boolean n0;
    public final int[] o0;
    public boolean p0;
    public boolean q0;
    public boolean r;
    public org.telegram.ui.Cells.q1 r0;
    public boolean s;
    public float s0;
    public float t0;
    public final Rect u0;
    public ValueAnimator v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public org.telegram.ui.Cells.q1 x0;
    public boolean y;
    public org.telegram.ui.Components.ly0 y0;
    public Paint z0;

    public vf0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, R.style.TransparentDialog);
        int i3 = org.telegram.messenger.h10.t0;
        this.c = i3;
        this.d = i0.b.e;
        this.N = new ArrayList();
        this.P = new a0.h();
        final int i10 = 1;
        this.T = new Paint(1);
        this.o0 = new int[2];
        final int i11 = 0;
        this.q0 = false;
        this.u0 = new Rect();
        this.a = context;
        this.b = e6Var;
        org.telegram.messenger.g0.S(getWindow());
        jf0 jf0Var = new jf0(this, context, i10);
        this.F = jf0Var;
        this.i0 = yh.e.d(1, jf0Var, jf0Var);
        jf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hf0
            public final /* synthetic */ vf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        jf0Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: org.telegram.ui.if0
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(View view, View view2) {
                vf0 vf0Var = vf0.this;
                if (vf0Var.p0 || !(view2 instanceof EditText)) {
                    return;
                }
                org.telegram.messenger.g0.v1(vf0Var.S);
                org.telegram.messenger.g0.i3(new ff0(vf0Var, (EditText) view2, 0), 200L);
            }
        });
        si.b bVar = new si.b();
        this.j0 = bVar;
        eh.c cVar = new eh.c(bVar, bVar, bVar);
        this.k0 = cVar;
        cVar.h = new kh.k(jf0Var);
        cVar.i = jf0Var;
        qf0 qf0Var = new qf0(this, context, e6Var);
        this.G = qf0Var;
        qf0Var.setClipToPadding(false);
        jf0Var.addView(qf0Var, b8.mf.e(-1, -1, org.telegram.messenger.hs.E1));
        f fVar = new f(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(jf0Var, fVar);
        rf0 rf0Var = new rf0(this, context, e6Var);
        this.K = rf0Var;
        rf0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hf0
            public final /* synthetic */ vf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.onBackPressed();
                        break;
                    default:
                        this.b.onBackPressed();
                        break;
                }
            }
        });
        rf0Var.setOnItemClickListener(new h(this, 17));
        rf0Var.setOnScrollListener(new h3(this, 19));
        rf0Var.setItemAnimator(new tf0(null, rf0Var, e6Var));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(this, i10);
        this.M = p90Var;
        p90Var.O = new ai.g2(this, 14);
        rf0Var.setLayoutManager(p90Var);
        rf0Var.i(new ei.l(13));
        gi.w wVar = new gi.w(this, context, e6Var, i10);
        this.L = wVar;
        rf0Var.setAdapter(wVar);
        rf0Var.setVerticalScrollBarEnabled(false);
        rf0Var.setOverScrollMode(2);
        qf0Var.addView(rf0Var, b8.mf.c(-2.0f, -1));
        jf0 jf0Var2 = new jf0(this, context, i11);
        this.H = jf0Var2;
        jf0Var.addView(jf0Var2, b8.mf.c(-1.0f, -1));
        this.a0 = new kf0(this, jf0Var2, i3);
    }

    public final void c(org.telegram.ui.ActionBar.d2 d2Var) {
        dh.v vVar;
        if (this.e0 != null || d2Var == null) {
            return;
        }
        int i3 = this.c;
        org.telegram.messenger.hp.s1(i3).E0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.d0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(0, 0, 0, org.telegram.messenger.g0.L(24.0f));
        mf0 mf0Var = new mf0(5, this.c, getContext(), null, this.b);
        this.e0 = mf0Var;
        mf0Var.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(22.0f));
        this.e0.setDelegate(new of0(this, d2Var));
        this.e0.setTop(false);
        this.e0.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setVisibility(0);
        this.e0.setHint(org.telegram.messenger.bd.M0(2131754443, null));
        this.e0.setBubbleOffset(org.telegram.messenger.g0.L(-25.0f));
        this.e0.setMiniBubblesOffset(org.telegram.messenger.g0.L(2.0f));
        this.G.addView(this.d0, b8.mf.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.addView(this.e0, b8.mf.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.e0.setScaleY(0.4f);
        this.e0.setScaleX(0.4f);
        this.e0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = org.telegram.messenger.hp.s1(i3).h8;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.u3);
        } else {
            s();
        }
        mf0 mf0Var2 = this.e0;
        if (mf0Var2 != null && !mf0Var2.h1) {
            mf0Var2.h1 = true;
            mf0Var2.i1 = true;
            dh.a0 a0Var = mf0Var2.y0;
            if (a0Var != null && (vVar = a0Var.m) != null && !vVar.M1) {
                vVar.M1 = true;
                vVar.N1 = true;
                e01 e01Var = vVar.i0;
                if (e01Var != null) {
                    e01Var.invalidate();
                }
                uz0 uz0Var = vVar.j0;
                if (uz0Var != null) {
                    uz0Var.invalidate();
                }
            }
        }
        new gi.p3(this.F, false, new s3(this, 12));
    }

    public final void d(Runnable runnable, boolean z10) {
        mf0 mf0Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.v0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = z10 && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z11) {
            org.telegram.ui.ActionBar.f1.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        if (!z10 && (mf0Var = this.e0) != null && this.f0) {
            mf0Var.e();
            if (this.e0.getReactionsWindow() != null && this.e0.getReactionsWindow().a != null) {
                this.e0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.e0.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.s = !z10;
        this.K.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.v0 = ofFloat;
        ofFloat.addUpdateListener(new dh.u(10, this, z11));
        this.v0.addListener(new org.telegram.ui.ActionBar.f(this, z10, z11, runnable));
        this.v0.setInterpolator(org.telegram.ui.Components.xq.h);
        this.v0.setDuration(350L);
        this.v0.start();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i3 != org.telegram.messenger.hs.u3 || (messages_availableeffects = org.telegram.messenger.hp.s1(this.c).h8) == null || messages_availableeffects.effects.isEmpty()) {
            return;
        }
        s();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        lf0 lf0Var = this.X;
        if (lf0Var != null) {
            lf0Var.invalidate();
        }
        org.telegram.ui.Components.bg bgVar = this.W;
        if (bgVar != null) {
            bgVar.invalidate();
        }
        d(new ef0(this, 2), false);
        this.F.invalidate();
        org.telegram.messenger.hs.f(this.c).n(this, org.telegram.messenger.hs.u3);
    }

    public final void e(org.telegram.messenger.zi ziVar) {
        org.telegram.messenger.ui k10 = k(ziVar);
        if (k10 == null) {
            f(ziVar);
            return;
        }
        k10.a();
        ArrayList arrayList = k10.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            f((org.telegram.messenger.zi) obj);
        }
    }

    public final void f(org.telegram.messenger.zi ziVar) {
        org.telegram.ui.Cells.q1 q1Var;
        rf0 rf0Var = this.K;
        if (rf0Var == null) {
            return;
        }
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= rf0Var.getChildCount()) {
                q1Var = null;
                break;
            }
            View childAt = rf0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                q1Var = (org.telegram.ui.Cells.q1) childAt;
                if (q1Var.getMessageObject() == ziVar) {
                    break;
                }
            }
            i10++;
        }
        org.telegram.ui.Cells.q1 q1Var2 = q1Var;
        int i11 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i3 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i3) == ziVar) {
                i11 = (arrayList.size() - 1) - i3;
            }
            i3++;
        }
        if (q1Var2 == null) {
            rf0Var.getAdapter().g(i11);
            return;
        }
        ziVar.K1 = true;
        q1Var2.u3(ziVar, q1Var2.getCurrentMessagesGroup(), q1Var2.G2(), q1Var2.H2(), q1Var2.z2(), false);
        rf0Var.getAdapter().g(i11);
    }

    public final void g(boolean z10) {
        this.r = z10;
        dismiss();
    }

    public final void h() {
        if (this.q0) {
            return;
        }
        this.q0 = true;
        yh.e.f(false);
        yh.e eVar = this.i0;
        if (eVar != null) {
            eVar.b(this.F);
        }
        super.dismiss();
        org.telegram.messenger.hs.f(this.c).n(this, org.telegram.messenger.hs.u3);
    }

    public final void i(Canvas canvas, float f10, float f11, float f12, float f13) {
        if (this.y0 == null || this.z0 == null) {
            return;
        }
        float f14 = (f10 + f12) / 2.0f;
        float f15 = (f11 + f13) / 2.0f;
        float L = org.telegram.messenger.g0.L(28.0f) + this.y0.c;
        float L2 = org.telegram.messenger.g0.L(32.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        float f16 = L / 2.0f;
        float f17 = f14 - f16;
        float f18 = L2 / 2.0f;
        rectF.set(f17, f15 - f18, f14 + f16, f15 + f18);
        canvas.save();
        canvas.drawRoundRect(rectF, f18, f18, this.z0);
        this.y0.c(f17 + org.telegram.messenger.g0.L(14.0f), f15, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.q0;
    }

    public final long j() {
        org.telegram.messenger.zi messageObject;
        if (this.n0 || this.e0 == null) {
            return 0L;
        }
        if (this.l0 != null) {
            this.n0 = true;
            return this.I;
        }
        org.telegram.ui.Cells.q1 q1Var = this.Q;
        if (q1Var == null || (messageObject = q1Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.k;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.n0 = true;
        return message.effect;
    }

    public final org.telegram.messenger.ui k(org.telegram.messenger.zi ziVar) {
        if (ziVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) this.P.f(ziVar.d1());
        if (uiVar == null || (uiVar.d.size() > 1 && uiVar.d(ziVar) != null)) {
            return uiVar;
        }
        return null;
    }

    public final void m(boolean z10) {
        org.telegram.ui.Components.p90 p90Var;
        rf0 rf0Var = this.K;
        if (rf0Var == null || rf0Var.getAdapter() == null || (p90Var = this.M) == null) {
            return;
        }
        int b10 = rf0Var.getAdapter().b();
        p90Var.i1(z10 ? b10 > 10 ? b10 % 10 : 0 : b10 - 1, org.telegram.messenger.g0.L(12.0f), z10);
        this.w0 = z10;
    }

    public final void n(long j10) {
        TLRPC.TL_availableEffect Z0;
        this.I = j10;
        boolean i3 = this.P.i();
        ArrayList arrayList = this.N;
        int size = (i3 || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        org.telegram.messenger.zi ziVar = (size < 0 || size >= arrayList.size()) ? null : (org.telegram.messenger.zi) arrayList.get(size);
        if (ziVar != null) {
            TLRPC.Message message = ziVar.k;
            message.flags2 |= 4;
            message.effect = j10;
        }
        if (this.e0 == null || (Z0 = org.telegram.messenger.hp.s1(this.c).Z0(j10)) == null) {
            return;
        }
        this.e0.setSelectedReactionAnimated(dh.n0.e(Z0));
    }

    public final void o(org.telegram.ui.Components.f60 f60Var) {
        int i3 = org.telegram.ui.ActionBar.k6.E8;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        f60Var.T(org.telegram.ui.ActionBar.k6.r1(0.06f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var)));
        f60Var.Q(this.k0, b8.cd.k(e6Var), false);
        ViewGroup viewGroup = f60Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, b8.mf.c(-2.0f, -2));
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.b0) {
            org.telegram.messenger.g0.v1(getCurrentFocus());
            this.b0 = false;
            return;
        }
        mf0 mf0Var = this.e0;
        if (mf0Var == null || mf0Var.getReactionsWindow() == null) {
            this.n0 = true;
            super.onBackPressed();
        } else {
            if (this.e0.getReactionsWindow().C) {
                return;
            }
            this.e0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        jf0 jf0Var = this.F;
        setContentView(jf0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = org.telegram.messenger.hs.E1;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i3 | (-1945959040);
        window.setAttributes(attributes);
        jf0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(jf0Var, !org.telegram.ui.ActionBar.k6.I.q());
    }

    public final void p(ArrayList arrayList) {
        a0.h hVar;
        int i3;
        int i10;
        org.telegram.ui.Cells.q1 q1Var;
        ArrayList arrayList2;
        org.telegram.messenger.ui uiVar;
        int i11 = 0;
        while (true) {
            int size = arrayList.size();
            hVar = this.P;
            if (i11 >= size) {
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
            if (ziVar.A2()) {
                org.telegram.messenger.ui uiVar2 = (org.telegram.messenger.ui) hVar.f(ziVar.e1());
                if (uiVar2 == null) {
                    uiVar2 = new org.telegram.messenger.ui();
                    uiVar2.n = false;
                    long d12 = ziVar.d1();
                    uiVar2.a = d12;
                    hVar.k(uiVar2, d12);
                }
                ArrayList arrayList3 = uiVar2.d;
                if (uiVar2.d(ziVar) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList3.size()) {
                            arrayList3.add(ziVar);
                            break;
                        } else if (((org.telegram.messenger.zi) arrayList3.get(i12)).f1() == ziVar.f1()) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            } else if (ziVar.e1() != 0) {
                ziVar.k.grouped_id = 0L;
                ziVar.e = 0L;
            }
            i11++;
        }
        for (int i13 = 0; i13 < hVar.m(); i13++) {
            ((org.telegram.messenger.ui) hVar.n(i13)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i14 = 0;
        while (i14 < arrayList4.size()) {
            int i15 = this.O;
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList4.get(i14);
            if (getContext() == null) {
                i3 = i14;
                i10 = 0;
            } else {
                if (this.x0 == null) {
                    this.x0 = new org.telegram.ui.Cells.q1(getContext(), this.c, true, null, this.b);
                }
                org.telegram.ui.Cells.q1 q1Var2 = this.x0;
                q1Var2.e6 = false;
                q1Var2.g6 = false;
                q1Var2.h6 = false;
                q1Var2.i6 = false;
                q1Var2.j6 = false;
                org.telegram.messenger.ui uiVar3 = (org.telegram.messenger.ui) hVar.f(ziVar2.d1());
                ei.c3 c3Var = q1Var2.U0;
                c3Var.p0 = true;
                ImageReceiver imageReceiver = q1Var2.z7;
                imageReceiver.p0 = true;
                ImageReceiver imageReceiver2 = q1Var2.S7;
                imageReceiver2.p0 = true;
                ImageReceiver imageReceiver3 = q1Var2.E7;
                imageReceiver3.p0 = true;
                if (uiVar3 != null) {
                    ArrayList arrayList5 = uiVar3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != uiVar3.f.size()) {
                            uiVar3.a();
                        }
                        q1Var2.Sc = 0;
                        int i16 = 0;
                        i10 = 0;
                        while (i16 < arrayList5.size()) {
                            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList5.get(i16);
                            org.telegram.messenger.ri d = uiVar3.d(ziVar3);
                            if (d == null || (d.l & 4) == 0) {
                                org.telegram.messenger.ui uiVar4 = uiVar3;
                                q1Var = q1Var2;
                                arrayList2 = arrayList5;
                                uiVar = uiVar4;
                            } else {
                                org.telegram.ui.Cells.q1 q1Var3 = q1Var2;
                                arrayList2 = arrayList5;
                                uiVar = uiVar3;
                                q1Var3.t3(ziVar3, uiVar, false, false, false, false);
                                q1Var = q1Var3;
                                i10 += q1Var.a7;
                            }
                            i16++;
                            org.telegram.messenger.ui uiVar5 = uiVar;
                            arrayList5 = arrayList2;
                            q1Var2 = q1Var;
                            uiVar3 = uiVar5;
                        }
                        i3 = i14;
                    }
                }
                i3 = i14;
                q1Var2.t3(ziVar2, uiVar3, false, false, false, false);
                c3Var.p0 = false;
                imageReceiver.p0 = false;
                imageReceiver2.p0 = false;
                imageReceiver3.p0 = false;
                q1Var2.N3();
                i10 = q1Var2.a7;
            }
            this.O = Math.max(i15, i10);
            i14 = i3 + 1;
        }
        rf0 rf0Var = this.K;
        rf0Var.getAdapter().f();
        int b10 = rf0Var.getAdapter().b();
        this.M.i1(b10 > 10 ? b10 % 10 : 0, org.telegram.messenger.g0.L(12.0f), true);
    }

    public final org.telegram.ui.Components.bg q(org.telegram.ui.Components.bg bgVar, boolean z10, View.OnClickListener onClickListener) {
        this.W = bgVar;
        int[] iArr = this.o0;
        bgVar.getLocationOnScreen(iArr);
        lf0 lf0Var = new lf0(this, getContext(), bgVar.b, this.b, bgVar, z10);
        this.X = lf0Var;
        lf0Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        org.telegram.ui.Components.bg bgVar2 = this.W;
        lf0 lf0Var2 = this.X;
        lf0Var2.F = bgVar2.F;
        lf0Var2.i0 = bgVar2.i0;
        lf0Var2.d0.t(bgVar2.d0.i, false, true);
        lf0Var2.e0 = bgVar2.e0;
        lf0Var2.setEmoji(bgVar2.f.f[0]);
        lf0Var2.i(bgVar2.s, bgVar2.r, true);
        lf0Var2.Q.e(true, bgVar2.Q.c);
        lf0Var2.y.e(true, bgVar2.y.c);
        int i3 = bgVar2.J;
        int i10 = bgVar2.K;
        lf0Var2.J = i3;
        lf0Var2.K = i10;
        float f10 = bgVar2.N;
        float f11 = bgVar2.O;
        lf0Var2.N = f10;
        lf0Var2.O = f11;
        this.X.Q.e(true, bgVar.Q.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(bgVar.getWidth(), bgVar.getHeight()));
        org.telegram.ui.Components.bg bgVar3 = this.W;
        bgVar.getHeight();
        this.Y = bgVar3.m();
        int i11 = iArr[0];
        int width = this.W.getWidth();
        org.telegram.ui.Components.bg bgVar4 = this.W;
        bgVar.getHeight();
        iArr[0] = org.telegram.messenger.camera.q.D(6.0f, width - bgVar4.m(), i11);
        return this.X;
    }

    public final void r(long j10) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.y0 = j10 > 0 ? new org.telegram.ui.Components.ly0(ci.wb.a1(false, org.telegram.messenger.bd.H(',', "UnlockPaidContent", (int) j10), 0.7f, null), 14.0f, org.telegram.messenger.g0.o()) : null;
        if (this.z0 == null) {
            Paint paint = new Paint(1);
            this.z0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.K.invalidate();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i3 >= arrayList.size()) {
                this.L.f();
                return;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            if (ziVar != null && (message = ziVar.k) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j10 > 0;
            }
            i3++;
        }
    }

    public final void s() {
        if (this.f0) {
            return;
        }
        this.g0 = false;
        this.f0 = true;
        this.e0.p(null, null, true);
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
        this.e0.r(false);
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            yh.e.f(true);
            super.show();
            final float alpha = this.W.getAlpha();
            org.telegram.ui.Components.bg bgVar = this.W;
            if (bgVar != null) {
                bgVar.setAlpha(0.0f);
            }
            org.telegram.ui.Components.nk0.d(new org.telegram.messenger.n10() { // from class: org.telegram.ui.gf0
                @Override // org.telegram.messenger.n10
                public final void a(Object obj, Object obj2) {
                    vf0 vf0Var = vf0.this;
                    si.b bVar = vf0Var.j0;
                    Bitmap bitmap = (Bitmap) obj;
                    Bitmap bitmap2 = (Bitmap) obj2;
                    org.telegram.ui.Components.bg bgVar2 = vf0Var.W;
                    if (bgVar2 != null) {
                        bgVar2.setAlpha(alpha);
                    }
                    vf0Var.e = bitmap;
                    Paint paint = new Paint(1);
                    vf0Var.h = paint;
                    Bitmap bitmap3 = vf0Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    vf0Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    vf0Var.n = new Matrix();
                    bVar.a(bitmap2);
                    jh.d.c(bVar, vf0Var.F);
                    ViewGroup viewGroup = vf0Var.Z;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            jf0 jf0Var = this.H;
            if (jf0Var != null) {
                jf0Var.bringToFront();
            }
            d(null, true);
        }
    }

    public void l(long j10) {
    }
}
