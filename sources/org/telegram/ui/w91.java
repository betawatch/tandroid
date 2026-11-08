package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class w91 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.kg, ie0 {
    public static final HashSet q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public int D;
    public di.f5 D0;
    public boolean E;
    public m91 E0;
    public a91 F;
    public FrameLayout F0;
    public boolean G;
    public x8 G0;
    public boolean H;
    public org.telegram.messenger.r3 H0;
    public boolean I;
    public l91 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.si0 K0;
    public org.telegram.ui.Components.r41 L;
    public ww L0;
    public int M;
    public ww M0;
    public j91 N;
    public boolean N0;
    public c91 O;
    public final h2.f O0;
    public v91 P;
    public l00 P0;
    public org.telegram.ui.ActionBar.z0 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.z0 R;
    public yh.d R0;
    public org.telegram.ui.ActionBar.z0 S;
    public float S0;
    public org.telegram.ui.ActionBar.z0 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.z0 U;
    public org.telegram.ui.Components.pr U0;
    public boolean V;
    public final boolean V0;
    public float W;
    public ImageView W0;
    public TL_stories.TL_premium_boostsStatus X;
    public float X0;
    public long Y;
    public ValueAnimator Y0;
    public boolean Z;
    public boolean Z0;
    public final long a;
    public final HashSet a0;
    public org.telegram.ui.Components.u61 a1;
    public final ArrayList b;
    public boolean b0;
    public boolean b1;
    public int c;
    public NumberTextView c0;
    public View c1;
    public f91 d;
    public org.telegram.ui.ActionBar.r0 d0;
    public int d1;
    public k0 e;
    public org.telegram.ui.ActionBar.r0 e0;
    public int e1;
    public org.telegram.ui.Components.kn f;
    public org.telegram.ui.ActionBar.r0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.r0 g0;
    public final dh.g g1;
    public org.telegram.ui.Components.q00 h;
    public org.telegram.ui.ActionBar.r0 h0;
    public final ri.f h1;
    public org.telegram.ui.ActionBar.r0 i0;
    public final ri.f i1;
    public org.telegram.ui.ActionBar.z0 j0;
    public final ri.c j1;
    public org.telegram.ui.ActionBar.z0 k0;
    public final dh.c k1;
    public org.telegram.ui.ActionBar.z0 l0;
    public dh.k l1;
    public org.telegram.ui.ActionBar.r0 m0;
    public final ArrayList m1;
    public t81 n;
    public RadialProgressView n0;
    public final RectF n1;
    public sq0 o0;
    public final RectF o1;
    public org.telegram.ui.ActionBar.r0 p0;
    public int p1;
    public org.telegram.ui.ActionBar.r0 q0;
    public final n91 r;
    public s91 r0;
    public final org.telegram.messenger.k00 s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public x91 w;
    public final boolean w0;
    public fv x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public w91(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new n91(this);
        this.y = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.a0 = new HashSet();
        this.B0 = false;
        this.O0 = new h2.f(new int[]{org.telegram.messenger.qs.q5});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.m1 = arrayList;
        RectF rectF = new RectF();
        this.n1 = rectF;
        RectF rectF2 = new RectF();
        this.o1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.a = this.arguments.getLong("chat_id", 0L);
        this.t0 = this.arguments.getBoolean("for_select", false);
        this.u0 = this.arguments.getBoolean("forward_to", false);
        this.x0 = this.arguments.getBoolean("bot_share_to", false);
        this.v0 = this.arguments.getBoolean("quote", false);
        this.w0 = this.arguments.getBoolean("reply_to", false);
        this.y0 = this.arguments.getString("voicechat", null);
        this.z0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().q7;
        this.V0 = !org.telegram.messenger.k5.w("topics_end_reached_", r1, getUserConfig().k(), false);
        ri.c cVar = new ri.c();
        this.j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.g1 = null;
            this.h1 = null;
            this.i1 = null;
            this.k1 = new dh.c(cVar, cVar, cVar);
            return;
        }
        this.g1 = new dh.g(false);
        this.h1 = new ri.f(null);
        ri.f fVar = new ri.f(null);
        this.i1 = fVar;
        dh.c cVar2 = new dh.c(fVar, fVar, fVar);
        this.k1 = cVar2;
        cVar2.k = true;
    }

    public static org.telegram.ui.ActionBar.f2 I0(org.telegram.messenger.qp qpVar, org.telegram.messenger.yr yrVar, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog S0 = qpVar.S0(-j3);
            if (S0 != null && S0.view_forum_as_messages) {
                return new an(bundle);
            }
            TLRPC.ChatFull N0 = qpVar.N0(j3);
            if (N0 == null) {
                N0 = yrVar.F0(j3, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new an(bundle);
            }
        }
        return new w91(bundle);
    }

    public static org.telegram.ui.ActionBar.f2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.qp.s1(launchActivity.O), org.telegram.messenger.yr.a0(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.w91) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M0(an anVar) {
        if (anVar.getParentLayout() == null) {
            return;
        }
        if (anVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) anVar.getParentLayout().getFragmentStack().get(anVar.getParentLayout().getFragmentStack().size() - 2);
            if (f2Var instanceof w91) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -anVar.a());
        ((ActionBarLayout) anVar.getParentLayout()).c(anVar.getParentLayout().getFragmentStack().size() - 1, new w91(bundle));
        anVar.Ca = true;
        anVar.finishFragment();
    }

    public static boolean Z(w91 w91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.qp.s1(w91Var.currentAccount).d7.edit().putLong("dialog_join_requested_time_" + (-w91Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = w91Var.getParentActivity();
        boolean V = org.telegram.messenger.t3.V(w91Var.g());
        int i7 = org.telegram.ui.Components.b70.q1;
        org.telegram.ui.Components.b70.J0(parentActivity, w91Var, org.telegram.ui.Components.hc.a0(w91Var), V);
        w91Var.S0(true);
        return false;
    }

    public static void a0(w91 w91Var, View view) {
        long j3 = w91Var.a;
        if (w91Var.getParentLayout() == null || ((ActionBarLayout) w91Var.getParentLayout()).y() || !(view instanceof t91)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((t91) view).N;
        long j10 = -j3;
        long o4 = tL_forumTopic == null ? 0L : w91Var.getMessagesController().y2(j10) ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (w91Var.t0) {
            x91 x91Var = w91Var.w;
            if (x91Var != null) {
                z91 z91Var = x91Var.a;
                Bundle bundle = new Bundle();
                ca1 ca1Var = z91Var.a;
                bundle.putLong("dialog_id", ca1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                gx0 gx0Var = new gx0(bundle, null);
                gx0Var.s = new lk0(21, z91Var, tL_forumTopic);
                ca1Var.presentFragment(gx0Var);
            }
            ww wwVar = w91Var.L0;
            if (wwVar != null) {
                wwVar.a4(j10, o4, true, w91Var);
                return;
            }
            return;
        }
        if (w91Var.a0.size() > 0) {
            w91Var.R0(view);
            return;
        }
        if (w91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            for (org.telegram.ui.ActionBar.f2 f2Var : w91Var.getParentLayout().getFragmentStack()) {
                if (f2Var instanceof ww) {
                    ww wwVar2 = (ww) f2Var;
                    if (wwVar2.t4()) {
                        org.telegram.messenger.xr xrVar = wwVar2.p2;
                        if (xrVar.a == j10 && xrVar.b == o4) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            w91Var.Q0 = o4;
            w91Var.Z0(false, false);
        }
        qg.d.m(w91Var, j3, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean b0(w91 w91Var, View view, float f10) {
        if (w91Var.t0 || w91Var.getParentLayout() == null || ((ActionBarLayout) w91Var.getParentLayout()).y()) {
            return false;
        }
        if (!w91Var.actionBar.v() && !org.telegram.messenger.g0.Q1() && (view instanceof t91)) {
            t91 t91Var = (t91) view;
            if (t91Var.Z(f10)) {
                w91Var.Q0(t91Var);
                w91Var.N.I0(true);
                w91Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        w91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(w91 w91Var, boolean z9) {
        sv svVar;
        w91Var.s0 = z9;
        ValueAnimator valueAnimator = w91Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            w91Var.Y0.cancel();
        }
        int i7 = 0;
        if (w91Var.a1 == null) {
            org.telegram.ui.Components.u61 n10 = w91Var.r0.n(8, false);
            w91Var.a1 = n10;
            if (w91Var.M0 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n10, w91Var.getResourceProvider());
            }
            w91Var.e.addView(w91Var.a1, c8.ha.c(44.0f, -1));
        }
        w91Var.Y0 = ValueAnimator.ofFloat(w91Var.W, z9 ? 1.0f : 0.0f);
        org.telegram.messenger.g0.Z3(w91Var.r0, false, 1.0f, true, true);
        ww wwVar = w91Var.M0;
        if (wwVar != null && (svVar = wwVar.F3) != null) {
            svVar.M = !z9;
        }
        w91Var.Z0 = !z9 && w91Var.r0.getVisibility() == 0 && w91Var.r0.getAlpha() == 1.0f;
        w91Var.Y0.addUpdateListener(new gz0(w91Var, 13));
        w91Var.r0.setVisibility(0);
        if (z9) {
            org.telegram.messenger.g0.a3(w91Var.getParentActivity(), w91Var.classGuid);
            w91Var.U0(false);
        } else {
            w91Var.q0.setVisibility(0);
        }
        w91Var.Y0.addListener(new h91(w91Var, z9, i7));
        w91Var.Y0.setDuration(200L);
        w91Var.Y0.setInterpolator(org.telegram.ui.Components.xq.f);
        w91Var.Y0.start();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ie0
    public final ri.f B() {
        return this.i1;
    }

    public final void B0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.g1) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.U0.c(org.telegram.messenger.g0.L(14.0f)));
        ww wwVar = this.M0;
        View view = wwVar != null ? wwVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = wwVar != null ? wwVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.f1) - org.telegram.messenger.g0.L(8.0f);
        int L3 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
        this.n1.set(0.0f, -L, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + L + L2);
        RectF rectF = this.o1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, org.telegram.messenger.sc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
        gVar.g(this.M0 != null ? 2 : 1, this.m1);
        gVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void C0() {
        a91 a91Var;
        org.telegram.messenger.k00 k00Var = this.s;
        long j3 = this.a;
        if (k00Var.e(j3) || (a91Var = this.F) == null) {
            return;
        }
        int N0 = a91Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.b() - 5) {
            k00Var.o(j3);
        }
        E0();
    }

    @Override // org.telegram.ui.Components.kg
    public final org.telegram.ui.Components.rt0 D() {
        return this.d;
    }

    public final void D0(boolean z9) {
        String str;
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (this.H0 != null && ((str = this.y0) != null || this.z0)) {
            org.telegram.ui.Components.voip.y1.l(M0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y0 = null;
            this.z0 = false;
        } else {
            if (this.y0 == null || !z9 || N0 == null || N0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.k5.o(null, 2131748914, org.telegram.ui.Components.hc.a0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    public final void E0() {
        org.telegram.messenger.k00 k00Var = this.s;
        a0.h hVar = k00Var.a;
        LongSparseIntArray longSparseIntArray = k00Var.c;
        long j3 = this.a;
        this.J0 = longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty());
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((o91) arrayList.get(0)).c != null && ((o91) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        j91 j91Var = this.N;
        if (j91Var != null) {
            j91Var.K0(j91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        ww wwVar = this.M0;
        if (wwVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.pr prVar = wwVar.J1;
            float c10 = (prVar != null ? prVar.c(L) : 0.0f) + 0.0f;
            org.telegram.ui.Components.pr prVar2 = this.U0;
            if (prVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.pr prVar3 = this.M0.J1;
                prVar2.setTranslationY(c10 - ((prVar3 != null ? prVar3.getMetadata().c.a : 0.0f) * L2));
                org.telegram.ui.Components.pr prVar4 = this.U0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                r2 = prVar4.c(org.telegram.messenger.g0.W1(this.M0.J1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.pr prVar5 = this.U0;
            if (prVar5 != null) {
                r2 = 0.0f + prVar5.c(org.telegram.messenger.g0.L(14.0f));
            }
        }
        this.N.setPadding(0, (int) r2, 0, this.f1 + this.d1 + (this.V ? org.telegram.messenger.g0.L(51.0f) : 0));
    }

    public final void G0() {
        this.a0.clear();
        this.actionBar.u();
        org.telegram.messenger.g0.b4(this.N);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.id.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            u1Var.T = org.telegram.messenger.id.a0(null, null, 2131751499, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            u1Var.T = org.telegram.messenger.id.M0(2131751498, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751599, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), new go0(10));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean J() {
        return false;
    }

    public final void K0(boolean z9, boolean z10) {
        this.h.e(!z9, this.fragmentBeginToShow && z10);
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ long L() {
        return 0L;
    }

    public final void L0(boolean z9) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z9 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z9 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.a5(this.J);
        profileActivity.g5((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().J() && z9) ? 2 : 1);
        presentFragment(profileActivity);
    }

    public final void N0(int i7) {
        if (this.M != i7) {
            this.M = i7;
            this.L.setTextColorKey(i7 == 0 ? org.telegram.ui.ActionBar.k6.pf : org.telegram.ui.ActionBar.k6.q7);
            this.W0.setVisibility(i7 == 1 ? 0 : 8);
            S0(false);
        }
    }

    public final void O0(boolean z9) {
        if (org.telegram.messenger.iz.o() == 0) {
            return;
        }
        f91 f91Var = this.d;
        if (f91Var != null) {
            if (z9) {
                f91Var.setLayerType(2, null);
                f91Var.setClipChildren(false);
                f91Var.setClipToPadding(false);
            } else {
                f91Var.setLayerType(0, null);
                f91Var.setClipChildren(true);
                f91Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.iz.o() == 0) {
            return;
        }
        this.S0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        j91 j91Var = this.N;
        if (j91Var != null) {
            float v = com.google.android.recaptcha.internal.a.v(1.0f, this.S0, 0.05f, 1.0f);
            j91Var.setPivotX(0.0f);
            j91Var.setPivotY(0.0f);
            j91Var.setScaleX(v);
            j91Var.setScaleY(v);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(v);
            this.actionBar.setScaleY(v);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void Q0(org.telegram.ui.Cells.t2 t2Var) {
        boolean z9;
        try {
            t2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.N;
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new e91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ynVar.f);
        ynVar.o = 1;
        long j3 = this.a;
        long j10 = -j3;
        ynVar.e(j10, tL_forumTopic.id, null);
        if (org.telegram.messenger.t3.y(15, g())) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                z0Var.j(org.telegram.messenger.id.M0(2131751453, null), R.drawable.msg_unpin, null);
            } else {
                z0Var.j(org.telegram.messenger.id.M0(2131751454, null), R.drawable.msg_pin, null);
            }
            z0Var.setMinimumWidth(org.telegram.messenger.qs.q2);
            z9 = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr) {
                        case 0:
                            w91 w91Var = this.b;
                            w91Var.C0 = true;
                            w91Var.N0 = true;
                            w91Var.s.t(w91Var.a, tL_forumTopic.id, !r0.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.N0 = true;
                            org.telegram.messenger.k00 k00Var = w91Var2.s;
                            long j11 = w91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            k00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            w91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            w91 w91Var3 = this.b;
                            w91Var3.H0(hashSet, new x81(w91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(z0Var);
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z9, z9);
        if (getMessagesController().r2(j10, tL_forumTopic.id, null)) {
            z0Var2.j(org.telegram.messenger.id.M0(2131743852, null), R.drawable.msg_mute, null);
        } else {
            z0Var2.j(org.telegram.messenger.id.M0(2131748315, null), R.drawable.msg_unmute, null);
        }
        z0Var2.setMinimumWidth(org.telegram.messenger.qs.q2);
        z0Var2.setOnClickListener(new di.t5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z10 = false;
        r32[0].addView(z0Var2);
        if (org.telegram.messenger.t3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                z0Var3.j(org.telegram.messenger.id.M0(2131746087, null), R.drawable.msg_topic_restart, null);
            } else {
                z0Var3.j(org.telegram.messenger.id.M0(2131752039, null), R.drawable.msg_topic_close, null);
            }
            z0Var3.setMinimumWidth(org.telegram.messenger.qs.q2);
            final int i7 = 1;
            z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            w91 w91Var = this.b;
                            w91Var.C0 = true;
                            w91Var.N0 = true;
                            w91Var.s.t(w91Var.a, tL_forumTopic.id, !r0.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.N0 = true;
                            org.telegram.messenger.k00 k00Var = w91Var2.s;
                            long j11 = w91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            k00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            w91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            w91 w91Var3 = this.b;
                            w91Var3.H0(hashSet, new x81(w91Var3, 3));
                            break;
                    }
                }
            });
            z10 = false;
            r32[0].addView(z0Var3);
        }
        if (org.telegram.messenger.t3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z10, true);
            z0Var4.j(org.telegram.messenger.id.K0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            z0Var4.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
            z0Var4.setMinimumWidth(org.telegram.messenger.qs.q2);
            final int i10 = 2;
            z0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            w91 w91Var = this.b;
                            w91Var.C0 = true;
                            w91Var.N0 = true;
                            w91Var.s.t(w91Var.a, tL_forumTopic.id, !r0.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.N0 = true;
                            org.telegram.messenger.k00 k00Var = w91Var2.s;
                            long j11 = w91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            k00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            w91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            w91 w91Var3 = this.b;
                            w91Var3.H0(hashSet, new x81(w91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(z0Var4);
        }
        boolean y22 = getMessagesController().y2(j10);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.qs.K2));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, c8.ha.c(-1.0f, -1));
        }
        an anVar = new an(a8.p0.j(j3, "chat_id"));
        qg.d.a(anVar, org.telegram.messenger.xr.a(j10, y22 ? org.telegram.messenger.m5.o(t2Var.N.from_id) : t2Var.N.id));
        presentFragmentAsPreviewWithMenu(anVar, r32[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(View view) {
        t91 t91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.messenger.k00 k00Var;
        int i7;
        boolean z9;
        boolean z10;
        if (!(view instanceof t91) || (tL_forumTopic = (t91Var = (t91) view).N) == null) {
            return;
        }
        int i10 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        t91Var.c0(hashSet.contains(Integer.valueOf(i10)), true);
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (hashSet.isEmpty()) {
            this.actionBar.u();
            return;
        }
        if (!this.actionBar.e(null)) {
            org.telegram.ui.ActionBar.y n10 = this.actionBar.n(null);
            if (this.inPreviewMode) {
                n10.setBackgroundColor(0);
                n10.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(n10.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(org.telegram.messenger.g0.o());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            n10.addView(this.c0, c8.ha.m(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new bs0(1));
            this.d0 = n10.g(4, R.drawable.msg_pin, org.telegram.messenger.g0.L(54.0f));
            this.e0 = n10.g(5, R.drawable.msg_unpin, org.telegram.messenger.g0.L(54.0f));
            this.f0 = n10.g(6, R.drawable.msg_mute, org.telegram.messenger.g0.L(54.0f));
            this.g0 = n10.h(7, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131751599, null));
            org.telegram.ui.ActionBar.r0 h = n10.h(12, R.drawable.msg_archive_hide, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131749326, null));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.r0 h7 = n10.h(13, R.drawable.msg_archive_show, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131745356, null));
            this.i0 = h7;
            h7.setVisibility(8);
            org.telegram.ui.ActionBar.r0 h10 = n10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.id.M0(2131754839, null));
            this.m0 = h10;
            this.j0 = h10.e(8, R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748682, null));
            this.k0 = this.m0.e(9, R.drawable.msg_topic_close, org.telegram.messenger.id.M0(2131752039, null));
            this.l0 = this.m0.e(10, R.drawable.msg_topic_restart, org.telegram.messenger.id.M0(2131746087, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i11 = 0;
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            k00Var = this.s;
            if (!hasNext) {
                break;
            }
            boolean z12 = z11;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f10 = k00Var.f(j3, intValue);
            if (f10 != null) {
                if (f10.unread_count != 0) {
                    i11++;
                }
                if (org.telegram.messenger.t3.y(15, M0) && !f10.hidden) {
                    if (f10.pinned) {
                        i13++;
                    } else {
                        z10 = (z12 ? 1 : 0) + 1;
                        int i14 = i12;
                        i12 = !getMessagesController().r2(-j3, intValue, null) ? i14 + 1 : i14;
                        z11 = z10;
                    }
                }
            }
            z10 = z12 ? 1 : 0;
            int i142 = i12;
            if (!getMessagesController().r2(-j3, intValue, null)) {
            }
            z11 = z10;
        }
        int i15 = i12;
        boolean z13 = z11;
        if (i11 > 0) {
            this.j0.setVisibility(0);
            this.j0.j(org.telegram.messenger.id.M0(2131748682, null), R.drawable.msg_markread, null);
            i7 = 8;
        } else {
            i7 = 8;
            this.j0.setVisibility(8);
        }
        if (i15 != 0) {
            this.B0 = false;
            this.f0.setIcon(R.drawable.msg_unmute);
            this.f0.setContentDescription(org.telegram.messenger.id.M0(2131752165, null));
            z9 = true;
        } else {
            z9 = true;
            this.B0 = true;
            this.f0.setIcon(R.drawable.msg_mute);
            this.f0.setContentDescription(org.telegram.messenger.id.M0(2131752175, null));
        }
        this.d0.setVisibility((z13 == z9 && i13 == 0) ? 0 : i7);
        this.e0.setVisibility((i13 != z9 || z13) ? i7 : 0);
        this.c0.a(hashSet.size(), z9);
        Iterator it2 = hashSet.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (it2.hasNext()) {
            HashSet hashSet2 = hashSet;
            TLRPC.TL_forumTopic f11 = k00Var.f(j3, ((Integer) it2.next()).intValue());
            if (f11 != null) {
                if (org.telegram.messenger.t3.e(this.currentAccount, M0, f11)) {
                    i18++;
                }
                if (org.telegram.messenger.t3.i(this.currentAccount, M0, f11)) {
                    if (f11.id == 1) {
                        if (f11.hidden) {
                            i20++;
                        } else {
                            i19++;
                        }
                    }
                    if (!f11.hidden) {
                        if (f11.closed) {
                            i16++;
                        } else {
                            i17++;
                        }
                    }
                }
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        this.k0.setVisibility((i16 != 0 || i17 <= 0) ? 8 : 0);
        this.k0.setText(org.telegram.messenger.id.M0(i17 > 1 ? 2131752038 : 2131752039, null));
        this.l0.setVisibility((i17 != 0 || i16 <= 0) ? 8 : 0);
        this.l0.setText(i16 > 1 ? org.telegram.messenger.id.M0(2131746086, null) : org.telegram.messenger.id.M0(2131746087, null));
        this.g0.setVisibility(i18 == hashSet3.size() ? 0 : 8);
        this.h0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.i0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.m0.l();
        V0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x021e, code lost:
    
        if (getMessagesController().n.contains(java.lang.Long.valueOf(r1.id)) != false) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fd  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.animation.Animator$AnimatorListener, java.lang.String, org.telegram.ui.m80] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(boolean z9) {
        ?? r12;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.ChatFull chatFull;
        String str;
        String M0;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j3));
        long j10 = -j3;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        if (org.telegram.messenger.t10.u(a22)) {
            this.f.setUserAvatar(a22);
        } else if (org.telegram.messenger.t3.p0(M02)) {
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(M02.linked_monoforum_id));
            if (M03 != null) {
                this.f.setChatAvatar(M03);
            }
        } else {
            this.f.setChatAvatar(M02);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(this.currentAccount).d7;
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j10);
        boolean z13 = sharedPreferences.getInt(sb2.toString(), 0) == 2;
        boolean w10 = org.telegram.messenger.k5.w("dialog_bar_report", j10, sharedPreferences, false);
        boolean w11 = org.telegram.messenger.k5.w("dialog_bar_block", j10, sharedPreferences, false);
        boolean z14 = this.t0;
        if (z14) {
            r12 = 0;
            if (this.w0) {
                this.f.setTitle(org.telegram.messenger.id.M0(2131746255, null));
            } else if (this.v0) {
                this.f.setTitle(org.telegram.messenger.id.M0(2131746430, null));
            } else if (this.x0) {
                this.f.setTitle(org.telegram.messenger.id.M0(2131752977, null));
            } else if (this.u0) {
                this.f.setTitle(org.telegram.messenger.id.M0(2131750576, null));
            } else {
                this.f.setTitle(org.telegram.messenger.id.M0(2131745652, null));
            }
            this.p0.setVisibility(8);
            org.telegram.ui.Components.kn knVar = this.f;
            if (knVar != null && knVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(this.p0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (M02 != null) {
                this.f.setTitle(M02.title);
                str = null;
                this.f.j(null, getMessagesController().r2(j10, 0L, null) ? getThemedDrawable("drawableMuteIcon") : null);
            } else {
                str = null;
            }
            TLRPC.ChatFull N0 = getMessagesController().N0(j3);
            if (N0 != null && (chatFull2 = this.J) != null && (chatParticipants = chatFull2.participants) != null) {
                N0.participants = chatParticipants;
            }
            this.J = N0;
            if (N0 != null) {
                int i7 = N0.participants_count;
                if (i7 <= 0) {
                    TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(j3));
                    M0 = M04 == null ? org.telegram.messenger.id.M0(2131748780, str) : org.telegram.messenger.t3.t0(M04) ? org.telegram.messenger.id.M0(2131748639, str).toLowerCase() : org.telegram.messenger.id.M0(2131748642, str).toLowerCase();
                } else {
                    M0 = org.telegram.messenger.id.G(i7, "Members", new Object[0]);
                }
            } else {
                M0 = org.telegram.messenger.id.M0(2131748780, str);
            }
            this.f.setSubtitle(M0);
            r12 = str;
        }
        boolean z15 = this.fragmentBeginToShow || z9;
        long j11 = org.telegram.messenger.qp.s1(this.currentAccount).d7.getLong(a8.p0.o(j10, "dialog_join_requested_time_"), -1L);
        if (M02 == null || !org.telegram.messenger.t3.r0(M02) || j11 <= 0 || System.currentTimeMillis() - j11 >= 120000) {
            if (M02 != null && !z14) {
                if (!org.telegram.messenger.t3.r0(M02)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(M02.id))) {
                    z12 = true;
                    z11 = true;
                } else {
                    if (M02.join_request) {
                        this.L.setText(org.telegram.messenger.id.M0(2131752395, r12));
                    } else {
                        this.L.setText(org.telegram.messenger.id.M0(2131752397, r12));
                    }
                    z11 = true;
                    this.L.setClickable(true);
                    this.L.setEnabled(true);
                    z12 = false;
                }
                org.telegram.messenger.g0.Z3(this.n0, z12, 0.5f, z11, z15);
                org.telegram.messenger.g0.Z3(this.L, z12 ^ z11, 0.5f, z11, z15);
                N0(0);
            }
            if (!z13 || (!w11 && !w10)) {
                z10 = false;
                if (this.V != z10) {
                    this.V = z10;
                    this.o0.animate().setListener(r12).cancel();
                    if (z15) {
                        this.o0.animate().translationY(z10 ? 0.0f : org.telegram.messenger.g0.L(53.0f)).setListener(new h91(this, z10, 1));
                    } else {
                        this.o0.setVisibility(z10 ? 0 : 8);
                        this.o0.setTranslationY(z10 ? 0.0f : org.telegram.messenger.g0.L(53.0f));
                    }
                }
                F0();
                this.q0.setVisibility(!z14 ? 8 : 0);
                this.R.setVisibility(!org.telegram.messenger.t3.w(3, M02) ? 0 : 8);
                this.T.setVisibility((org.telegram.messenger.t3.R(M02) || (!getUserConfig().q() && (((chatFull = this.J) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.t3.N(M02)))) ? 8 : 0);
                this.S.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.r0(M02)) ? 8 : 0);
                this.U.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.N(M02)) ? 8 : 0);
                U0(true);
                this.H0 = getMessagesController().g1(j3, true, r12);
                D0(false);
            }
            this.L.setText(org.telegram.messenger.id.M0(2131746206, r12));
            this.L.setClickable(true);
            this.L.setEnabled(true);
            org.telegram.messenger.g0.Z3(this.n0, false, 0.5f, true, false);
            org.telegram.messenger.g0.Z3(this.L, true, 0.5f, true, false);
            N0(1);
        } else {
            this.L.a(org.telegram.messenger.id.M0(2131752393, r12), z15);
            this.L.setEnabled(false);
            org.telegram.messenger.g0.Z3(this.n0, false, 0.5f, true, z15);
            org.telegram.messenger.g0.Z3(this.L, true, 0.5f, true, z15);
            N0(0);
        }
        z10 = true;
        if (this.V != z10) {
        }
        F0();
        this.q0.setVisibility(!z14 ? 8 : 0);
        this.R.setVisibility(!org.telegram.messenger.t3.w(3, M02) ? 0 : 8);
        this.T.setVisibility((org.telegram.messenger.t3.R(M02) || (!getUserConfig().q() && (((chatFull = this.J) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.t3.N(M02)))) ? 8 : 0);
        this.S.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.r0(M02)) ? 8 : 0);
        this.U.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.N(M02)) ? 8 : 0);
        U0(true);
        this.H0 = getMessagesController().g1(j3, true, r12);
        D0(false);
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.pf));
        this.h.updateColors();
        sq0 sq0Var = this.o0;
        int i7 = org.telegram.ui.ActionBar.k6.d6;
        sq0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        }
        this.r0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z9) {
        if (this.Q == null) {
            return;
        }
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.a;
        boolean z10 = (org.telegram.messenger.t3.r0(getMessagesController().M0(Long.valueOf(j3))) || !org.telegram.messenger.t3.w(15, messagesController.M0(Long.valueOf(j3))) || this.s0 || this.t0 || this.J0) ? false : true;
        this.K = z10;
        this.Q.setVisibility(z10 ? 0 : 8);
        K0(!this.K, z9);
    }

    public final void V0() {
        boolean z9 = org.telegram.messenger.t3.y(15, g()) && !this.a0.isEmpty();
        if (this.b0 != z9) {
            this.b0 = z9;
            n91 n91Var = this.r;
            n91Var.k(0, n91Var.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.f2, org.telegram.ui.ie0
    public final /* synthetic */ boolean W(MotionEvent motionEvent, boolean z9) {
        return false;
    }

    public final void W0(float f10) {
        this.W = f10;
        X0();
        this.b1 = true;
        float f11 = 1.0f - f10;
        this.f.getTitleTextView().setAlpha(f11);
        this.f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.u61 u61Var = this.a1;
        if (u61Var != null) {
            u61Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.a1.setAlpha(f10);
        }
        this.r0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.r0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f11);
        if (this.Z0) {
            float z9 = com.google.android.recaptcha.internal.a.z(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(z9);
            this.N.setScaleY(z9);
        }
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.k6.y8;
        kVar.D(i0.a.f(this.W, themedColor, getThemedColor(i7)), false);
        this.actionBar.D(i0.a.f(this.W, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.C(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.t8), getThemedColor(org.telegram.ui.ActionBar.k6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.s8), getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
    }

    public final void Y0() {
        di.f5 f5Var = this.D0;
        if (f5Var == null || f5Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.ic_ab_other, 0);
        wpVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        if (org.telegram.messenger.t3.y(15, g())) {
            this.D0.e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748137, null)), spannableStringBuilder, "%s"));
            return;
        }
        String M0 = org.telegram.messenger.id.M0(2131750475, null);
        TLRPC.TL_forumTopic f10 = getMessagesController().q7.f(this.a, 1L);
        if (f10 != null) {
            M0 = f10.title;
        }
        this.D0.e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("NoTopicsDescriptionUser", null, 2131748136, M0)));
    }

    public final void Z0(boolean z9, boolean z10) {
        a91 a91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z9 && this.N0) {
            z9 = true;
        }
        this.N0 = false;
        org.telegram.messenger.k00 k00Var = this.s;
        long j3 = this.a;
        ArrayList l10 = k00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (org.telegram.messenger.t10.u(org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(-j3))) && this.u0) {
                arrayList.add(new o91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).id))) {
                    arrayList.add(new o91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !k00Var.e(j3) && this.V0) {
                arrayList.add(new o91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z10 && size2 > size) {
                this.K0.b(size + 4);
                z9 = false;
            }
            this.y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o91 o91Var = (o91) arrayList.get(i10);
                if (o91Var != null && (tL_forumTopic = o91Var.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            j91 j91Var = this.N;
            if (j91Var != null) {
                if (j91Var.getItemAnimator() != (z9 ? this.I0 : null)) {
                    this.N.setItemAnimator(z9 ? this.I0 : null);
                }
            }
            n91 n91Var = this.r;
            if (n91Var != null) {
                n91Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (a91Var = this.F) != null) {
                a91Var.h1(0, 0);
                this.C0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override // org.telegram.ui.Components.kg, org.telegram.ui.Components.b40
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        ww wwVar = this.M0;
        final int i7 = 0;
        this.d1 = (wwVar == null || !wwVar.W) ? 0 : org.telegram.messenger.g0.L(72.0f);
        ww wwVar2 = this.M0;
        this.e1 = (wwVar2 == null || !wwVar2.W) ? 0 : org.telegram.messenger.g0.L(64.0f);
        f91 f91Var = new f91(this, context);
        this.d = f91Var;
        this.fragmentView = f91Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, f91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i10 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((q4Var2 = this.parentLayout) != null && ((ActionBarLayout) q4Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setActionBarMenuOnItemClick(new i91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var;
                switch (i7) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.s0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().i2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ww wwVar3 = this.b.M0;
                        if (wwVar3 != null && (r0Var = wwVar3.j0) != null) {
                            r0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(v81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y q10 = this.actionBar.q();
        final int i11 = 3;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.r0 a10 = q10.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.r0 r0Var;
                    switch (i11) {
                        case 0:
                            w91 w91Var = this.b;
                            if (!w91Var.s0) {
                                w91Var.L0(false);
                                break;
                            }
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.getMessagesController().i2(-w91Var2.a, null, w91Var2.g());
                            w91Var2.S0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            ww wwVar3 = this.b.M0;
                            if (wwVar3 != null && (r0Var = wwVar3.j0) != null) {
                                r0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            w91 w91Var3 = this.b;
                            w91Var3.presentFragment(v81.f0(w91Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.r0 a11 = q10.a(0, R.drawable.outline_header_search);
            this.p0 = a11;
            a11.N();
            a11.J(new kg.v1(this, 22));
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            org.telegram.ui.ActionBar.r6.V(searchField, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Gj, getResourceProvider());
            org.telegram.ui.ActionBar.r6.w(searchField, org.telegram.ui.ActionBar.k6.Ke, getResourceProvider());
        }
        org.telegram.ui.ActionBar.r0 c10 = q10.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        this.q0.e(1, R.drawable.msg_discussion, org.telegram.messenger.id.M0(2131744005, null));
        final int i12 = 2;
        this.R = this.q0.e(2, R.drawable.msg_addcontact, org.telegram.messenger.id.M0(2131754401, null));
        org.telegram.ui.ActionBar.r0 r0Var = this.q0;
        this.T = r0Var.d(14, 0, new org.telegram.ui.Components.zg0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.id.M0(2131753585, null), true, false, r0Var.m0);
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, org.telegram.messenger.id.M0(2131751703, null));
        this.U = this.q0.e(15, R.drawable.msg_report, org.telegram.messenger.id.M0(2131746233, null));
        this.S = this.q0.d(11, R.drawable.msg_leave, null, org.telegram.messenger.id.M0(2131748991, null), true, false, null);
        org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(context, this, false, this.resourceProvider);
        this.f = knVar;
        knVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((q4Var = this.parentLayout) != null && ((ActionBarLayout) q4Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.kn knVar2 = this.f;
        long j3 = -this.a;
        knVar2.b = j3 < 0;
        knVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, c8.ha.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        int i13 = 4;
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new z7(this, i13));
        }
        this.N = new j91(this, context);
        jh.k kVar = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.k1;
        cVar.h = kVar;
        cVar.i = viewGroup;
        j91 j91Var = this.N;
        ww wwVar3 = this.M0;
        if (wwVar3 != null) {
            viewGroup = (ViewGroup) wwVar3.getFragmentView();
        }
        j91 j91Var2 = this.N;
        Objects.requireNonNull(j91Var2);
        this.l1 = new dh.k(j91Var, viewGroup, new n40(j91Var2, 2));
        this.N.D0(new x81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.c c11 = qg.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        fv fvVar = new fv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.id.M0(2131754721, null), spannableString, "#"));
        this.x = fvVar;
        fvVar.b();
        int i14 = this.E ? 2 : 0;
        this.D = i14;
        this.x.X = i14 != 0;
        l91 l91Var = new l91(this);
        this.N.setHideIfEmpty(false);
        l91Var.m = false;
        l91Var.C = false;
        j91 j91Var3 = this.N;
        this.I0 = l91Var;
        j91Var3.setItemAnimator(l91Var);
        this.N.setOnScrollListener(new b91(this, i10));
        j91 j91Var4 = this.N;
        j91Var4.W1 = true;
        j91Var4.X1 = 0;
        org.telegram.ui.Components.si0 si0Var = new org.telegram.ui.Components.si0(j91Var4, true);
        this.K0 = si0Var;
        this.N.setItemsEnterAnimator(si0Var);
        this.N.setOnItemClickListener(new vx0(this, 9));
        this.N.setOnItemLongClickListener(new y81(this));
        this.N.setOnScrollListener(new b91(this, i12));
        j91 j91Var5 = this.N;
        a91 a91Var = new a91(this);
        this.F = a91Var;
        j91Var5.setLayoutManager(a91Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new b91(this, i7));
        v91 v91Var = new v91(this);
        this.P = v91Var;
        c91 c91Var = new c91(this, v91Var);
        this.O = c91Var;
        c91Var.h(this.N);
        this.d.addView(this.N, c8.ha.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(getParentActivity(), this.resourceProvider, false);
        this.h = q00Var;
        this.d.addView(q00Var, org.telegram.ui.Components.q00.b());
        final int i15 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (i15) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.s0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().i2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ww wwVar32 = this.b.M0;
                        if (wwVar32 != null && (r0Var2 = wwVar32.j0) != null) {
                            r0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(v81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.id.M0(2131751703, null));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        mzVar.setViewType(24);
        mzVar.setVisibility(8);
        mzVar.x = true;
        t81 t81Var = new t81(context, i10);
        TextView textView = new TextView(context);
        t81Var.d = textView;
        if (org.telegram.messenger.id.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.id.M0(2131744262, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.id.M0(2131744262, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
        boolean z9 = org.telegram.messenger.id.a0;
        t81Var.addView(textView, c8.ha.d(-2, -2.0f, 81, z9 ? 72.0f : 32.0f, 0.0f, z9 ? 32.0f : 72.0f, 32.0f));
        this.n = t81Var;
        textView.setAlpha(0.0f);
        di.f5 f5Var = new di.f5(this, context, mzVar);
        this.D0 = f5Var;
        try {
            f5Var.b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(org.telegram.messenger.id.M0(2131748139, null));
        Y0();
        this.n.addView(mzVar);
        this.n.addView(this.D0);
        this.d.addView(this.n);
        this.N.setEmptyView(this.n);
        this.o0 = new sq0(context, 12);
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context);
        this.L = r41Var;
        this.o0.addView(r41Var);
        this.d.addView(this.o0, c8.ha.e(-1, 51, 80));
        this.L.setOnClickListener(new d91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.n0.setVisibility(4);
        this.o0.addView(this.n0, c8.ha.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
        ImageView imageView2 = this.W0;
        int i16 = org.telegram.ui.ActionBar.k6.Re;
        imageView2.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(getThemedColor(i16))));
        org.telegram.ui.ActionBar.r6.t(this.W0, i16, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, c8.ha.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (i10) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.s0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().i2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ww wwVar32 = this.b.M0;
                        if (wwVar32 != null && (r0Var2 = wwVar32.j0) != null) {
                            r0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(v81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        S0(false);
        k0 k0Var = new k0(27, context, this);
        this.e = k0Var;
        if (this.M0 == null) {
            this.d.addView(k0Var, c8.ha.e(-1, -1, org.telegram.messenger.qs.E1));
        }
        s91 s91Var = new s91(this, context);
        this.r0 = s91Var;
        s91Var.setVisibility(8);
        this.e.addView(this.r0, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 44.0f, 0.0f, 0.0f));
        s91 s91Var2 = this.r0;
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i17, s91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.pr prVar = new org.telegram.ui.Components.pr(context);
        this.U0 = prVar;
        prVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c12 = cVar.c(this.U0, c8.g0.o(this.resourceProvider), false);
        org.telegram.messenger.camera.q.p(c12, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new x81(this, i7));
        this.d.addView(this.U0, c8.ha.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            yh.d dVar = new yh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), c8.ha.o(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            yh.d dVar2 = this.R0;
            dVar2.m = new y81(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.G0 = x8Var;
            this.F0.addView(x8Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = c8.ha.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = org.telegram.messenger.g0.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        C0();
        l00 l00Var = new l00(10, context, this);
        this.P0 = l00Var;
        l00Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i17), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.r0 r0Var2;
                switch (i12) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.s0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().i2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ww wwVar32 = this.b.M0;
                        if (wwVar32 != null && (r0Var2 = wwVar32.j0) != null) {
                            r0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(v81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) it.next();
                if (f2Var instanceof ww) {
                    ww wwVar4 = (ww) f2Var;
                    if (wwVar4.t4()) {
                        org.telegram.messenger.xr xrVar = wwVar4.p2;
                        if (xrVar.a == j3) {
                            this.Q0 = xrVar.b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Z0(false, false);
        }
        S0(false);
        T0();
        if (org.telegram.messenger.t3.R(g())) {
            getMessagesController().G0().a(j3, new r3(this, 26));
        }
        View view = this.fragmentView;
        y81 y81Var = new y81(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, y81Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.qs.T;
        long j3 = this.a;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j3) {
                S0(false);
                yh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i7 == org.telegram.messenger.qs.v5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.qs.p3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.qs.q5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.qs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.qp.C8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().q7.y(j3, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.qs.w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.H0 = getMessagesController().g1(l10.longValue(), false, null);
                x8 x8Var = this.G0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.qs.f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.qs.r5 && i7 == org.telegram.messenger.qs.t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.qs.h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j3) || booleanValue) {
                if (this.Q0 != 0) {
                    this.Q0 = 0L;
                    Z0(false, false);
                    return;
                }
                return;
            }
            if (this.Q0 != longValue2) {
                this.Q0 = longValue2;
                Z0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final TLRPC.Chat g() {
        return getMessagesController().M0(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.kg
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var = this.H0;
        if (r3Var == null || !(r3Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return r3Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s91 s91Var = this.r0;
        if (s91Var != null && s91Var.W != null) {
            int i7 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.k6.d6 : org.telegram.ui.ActionBar.k6.s8);
        if (this.actionBar.v()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ TLRPC.User j() {
        return null;
    }

    @Override // org.telegram.ui.ie0
    public final ri.f k() {
        return this.h1;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z9);
            }
            if (z9) {
                this.actionBar.y(this.p0.T(false));
            }
        } else if (z9) {
            G0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.k();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = this.a;
        messagesController.V2(0, j3, true);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.v5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.p3);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.q5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.s);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.w2);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f0);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.r5);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.t);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.h0);
        Z0(false, false);
        q11.t(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = q1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().j1(-j3);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        this.O0.e();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.v5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.p3);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.q5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.s);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.w2);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f0);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.r5);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.t);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.h0);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.a));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().V4(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        ww wwVar = this.M0;
        if (wwVar == null || wwVar.F3 == null) {
            return;
        }
        wwVar.getActionBar().setSearchAvatarImageView(null);
        this.M0.F3.M = true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().q7.f;
        long j3 = this.a;
        int i7 = longSparseIntArray.get(j3, 0) - 1;
        longSparseIntArray.put(j3, i7 >= 0 ? i7 : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.k00 k00Var = getMessagesController().q7;
        LongSparseIntArray longSparseIntArray = k00Var.f;
        long j3 = this.a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        k00Var.y(j3, true);
        this.G = false;
        org.telegram.messenger.g0.b4(this.N);
        this.G = true;
        setBulletinDelegate(new y8(this, 9));
        if (!this.inPreviewMode || getMessagesController().t2(-j3)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onSlideProgress(boolean z9, float f10) {
        if (org.telegram.messenger.iz.o() != 0 && this.T0) {
            P0(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        ri.c cVar = this.j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.z5.b(getThemedColor(org.telegram.ui.ActionBar.k6.Re))) != this.p1) {
            this.p1 = b10;
            org.telegram.ui.ActionBar.k6.H1(this.W0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.E(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.G(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.H(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
        }
        l00 l00Var = this.P0;
        if (l00Var != null && (l00Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            fv fvVar = this.x;
            if (fvVar != null) {
                fvVar.i();
            }
            if (this.actionBar != null && this.b1) {
                X0();
            }
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            }
            org.telegram.ui.ActionBar.r0 r0Var = this.p0;
            if (r0Var == null || r0Var.getSearchField() == null) {
                return;
            }
            this.p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ke));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        sv svVar;
        l00 l00Var;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && (l00Var = this.P0) != null) {
            if (l00Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z9) {
            D0(false);
        }
        this.O0.e();
        if (z9) {
            return;
        }
        if (this.t0 && this.H) {
            removeSelfFromStack();
            ww wwVar = this.L0;
            if (wwVar != null) {
                wwVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.I) {
            removeSelfFromStack();
            ww wwVar2 = this.M0;
            if (wwVar2 == null || (svVar = wwVar2.F3) == null || !svVar.c()) {
                return;
            }
            this.M0.F3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        l00 l00Var = this.P0;
        if (l00Var == null || l00Var.getVisibility() != 0) {
            return;
        }
        if (z9) {
            this.P0.setAlpha(1.0f - f10);
        } else {
            this.P0.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        super.onTransitionAnimationStart(z9, z10);
        this.O0.d();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void prepareFragmentToSlide(boolean z9, boolean z10) {
        if (!z9 && z10) {
            this.T0 = true;
            O0(true);
        } else {
            this.T0 = false;
            O0(false);
            P0(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.kg
    public final org.telegram.ui.Components.kn r() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.kn knVar = this.f;
        if (knVar != null) {
            knVar.setAlpha(f10);
            this.q0.setAlpha(f10);
            org.telegram.ui.ActionBar.r0 r0Var = this.p0;
            if (r0Var != null) {
                r0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.kn knVar = this.f;
        if (knVar != null) {
            knVar.setAlpha(f10);
            this.f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        this.N.y0(0);
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.kg
    public final /* synthetic */ void l(int i7, int i10, boolean z9, int i11, boolean z10, int i12) {
    }
}
