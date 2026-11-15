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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class u91 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.qg, ie0 {
    public static final HashSet r1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public fi.x4 E0;
    public boolean F;
    public k91 F0;
    public x81 G;
    public FrameLayout G0;
    public boolean H;
    public x8 H0;
    public boolean I;
    public org.telegram.messenger.r3 I0;
    public boolean J;
    public i91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.xi0 L0;
    public org.telegram.ui.Components.v41 M;
    public yw M0;
    public int N;
    public yw N0;
    public g91 O;
    public boolean O0;
    public z81 P;
    public final h2.f P0;
    public t91 Q;
    public rv Q0;
    public org.telegram.ui.ActionBar.z0 R;
    public long R0;
    public org.telegram.ui.ActionBar.z0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.z0 T;
    public float T0;
    public org.telegram.ui.ActionBar.z0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.z0 V;
    public org.telegram.ui.Components.vr V0;
    public boolean W;
    public final boolean W0;
    public float X;
    public ImageView X0;
    public TL_stories.TL_premium_boostsStatus Y;
    public float Y0;
    public long Z;
    public ValueAnimator Z0;
    public final long a;
    public boolean a0;
    public boolean a1;
    public final ArrayList b;
    public final HashSet b0;
    public org.telegram.ui.Components.v61 b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public c91 d;
    public NumberTextView d0;
    public View d1;
    public k0 e;
    public org.telegram.ui.ActionBar.q0 e0;
    public int e1;
    public org.telegram.ui.Components.sn f;
    public org.telegram.ui.ActionBar.q0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.q0 g0;
    public int g1;
    public org.telegram.ui.Components.t00 h;
    public org.telegram.ui.ActionBar.q0 h0;
    public final dh.g h1;
    public org.telegram.ui.ActionBar.q0 i0;
    public final ui.f i1;
    public org.telegram.ui.ActionBar.q0 j0;
    public final ui.f j1;
    public org.telegram.ui.ActionBar.z0 k0;
    public final ui.c k1;
    public org.telegram.ui.ActionBar.z0 l0;
    public final dh.c l1;
    public org.telegram.ui.ActionBar.z0 m0;
    public dh.k m1;
    public q81 n;
    public org.telegram.ui.ActionBar.q0 n0;
    public final ArrayList n1;
    public RadialProgressView o0;
    public final RectF o1;
    public eh0 p0;
    public final RectF p1;
    public org.telegram.ui.ActionBar.q0 q0;
    public int q1;
    public final l91 r;
    public org.telegram.ui.ActionBar.q0 r0;
    public final org.telegram.messenger.h00 s;
    public q91 s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public v91 w;
    public final boolean w0;
    public gv x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public u91(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new l91(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new h2.f(new int[]{org.telegram.messenger.ns.q5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.n1 = arrayList;
        RectF rectF = new RectF();
        this.o1 = rectF;
        RectF rectF2 = new RectF();
        this.p1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.a = this.arguments.getLong("chat_id", 0L);
        this.u0 = this.arguments.getBoolean("for_select", false);
        this.v0 = this.arguments.getBoolean("forward_to", false);
        this.y0 = this.arguments.getBoolean("bot_share_to", false);
        this.w0 = this.arguments.getBoolean("quote", false);
        this.x0 = this.arguments.getBoolean("reply_to", false);
        this.z0 = this.arguments.getString("voicechat", null);
        this.A0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().r7;
        this.W0 = !org.telegram.messenger.k5.w("topics_end_reached_", r1, getUserConfig().k(), false);
        ui.c cVar = new ui.c();
        this.k1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.h1 = null;
            this.i1 = null;
            this.j1 = null;
            this.l1 = new dh.c(cVar, cVar, cVar);
            return;
        }
        this.h1 = new dh.g(false);
        this.i1 = new ui.f(null);
        ui.f fVar = new ui.f(null);
        this.j1 = fVar;
        dh.c cVar2 = new dh.c(fVar, fVar, fVar);
        this.l1 = cVar2;
        cVar2.k = true;
    }

    public static org.telegram.ui.ActionBar.e2 I0(org.telegram.messenger.np npVar, org.telegram.messenger.vr vrVar, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog S0 = npVar.S0(-j3);
            if (S0 != null && S0.view_forum_as_messages) {
                return new an(bundle);
            }
            TLRPC.ChatFull N0 = npVar.N0(j3);
            if (N0 == null) {
                N0 = vrVar.F0(j3, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new an(bundle);
            }
        }
        return new u91(bundle);
    }

    public static org.telegram.ui.ActionBar.e2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.np.s1(launchActivity.P), org.telegram.messenger.vr.a0(launchActivity.P), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.u91) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M0(an anVar) {
        if (anVar.getParentLayout() == null) {
            return;
        }
        if (anVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) anVar.getParentLayout().getFragmentStack().get(anVar.getParentLayout().getFragmentStack().size() - 2);
            if (e2Var instanceof u91) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -anVar.a());
        ((ActionBarLayout) anVar.getParentLayout()).c(anVar.getParentLayout().getFragmentStack().size() - 1, new u91(bundle));
        anVar.Fa = true;
        anVar.finishFragment();
    }

    public static boolean Z(u91 u91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.np.s1(u91Var.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + (-u91Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = u91Var.getParentActivity();
        boolean V = org.telegram.messenger.t3.V(u91Var.g());
        int i7 = org.telegram.ui.Components.e70.u1;
        org.telegram.ui.Components.e70.J0(parentActivity, u91Var, org.telegram.ui.Components.cc.a0(u91Var), V);
        u91Var.S0(true);
        return false;
    }

    public static void a0(u91 u91Var, View view) {
        long j3 = u91Var.a;
        if (u91Var.getParentLayout() == null || ((ActionBarLayout) u91Var.getParentLayout()).y() || !(view instanceof r91)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((r91) view).O;
        long j10 = -j3;
        long o4 = tL_forumTopic == null ? 0L : u91Var.getMessagesController().y2(j10) ? org.telegram.messenger.m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (u91Var.u0) {
            v91 v91Var = u91Var.w;
            if (v91Var != null) {
                x91 x91Var = v91Var.a;
                Bundle bundle = new Bundle();
                aa1 aa1Var = x91Var.a;
                bundle.putLong("dialog_id", aa1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                fx0 fx0Var = new fx0(bundle, null);
                fx0Var.s = new xi0(25, x91Var, tL_forumTopic);
                aa1Var.presentFragment(fx0Var);
            }
            yw ywVar = u91Var.M0;
            if (ywVar != null) {
                ywVar.a4(j10, o4, true, u91Var);
                return;
            }
            return;
        }
        if (u91Var.b0.size() > 0) {
            u91Var.R0(view);
            return;
        }
        if (u91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            for (org.telegram.ui.ActionBar.e2 e2Var : u91Var.getParentLayout().getFragmentStack()) {
                if (e2Var instanceof yw) {
                    yw ywVar2 = (yw) e2Var;
                    if (ywVar2.t4()) {
                        org.telegram.messenger.ur urVar = ywVar2.r2;
                        if (urVar.a == j10 && urVar.b == o4) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            u91Var.R0 = o4;
            u91Var.Z0(false, false);
        }
        qg.c.m(u91Var, j3, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean b0(u91 u91Var, View view, float f10) {
        if (u91Var.u0 || u91Var.getParentLayout() == null || ((ActionBarLayout) u91Var.getParentLayout()).y()) {
            return false;
        }
        if (!u91Var.actionBar.x() && !org.telegram.messenger.g0.Q1() && (view instanceof r91)) {
            r91 r91Var = (r91) view;
            if (r91Var.b0(f10)) {
                u91Var.Q0(r91Var);
                u91Var.O.I0(true);
                u91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        u91Var.R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void f0(u91 u91Var, boolean z10) {
        uv uvVar;
        u91Var.t0 = z10;
        ValueAnimator valueAnimator = u91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            u91Var.Z0.cancel();
        }
        int i7 = 0;
        if (u91Var.b1 == null) {
            org.telegram.ui.Components.v61 i10 = u91Var.s0.i(8, false);
            u91Var.b1 = i10;
            if (u91Var.N0 != null) {
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, i10, u91Var.getResourceProvider());
            }
            u91Var.e.addView(u91Var.b1, c8.ja.c(44.0f, -1));
        }
        u91Var.Z0 = ValueAnimator.ofFloat(u91Var.X, z10 ? 1.0f : 0.0f);
        org.telegram.messenger.g0.Y3(u91Var.s0, false, 1.0f, true, true);
        yw ywVar = u91Var.N0;
        if (ywVar != null && (uvVar = ywVar.H3) != null) {
            uvVar.N = !z10;
        }
        u91Var.a1 = !z10 && u91Var.s0.getVisibility() == 0 && u91Var.s0.getAlpha() == 1.0f;
        u91Var.Z0.addUpdateListener(new ez0(u91Var, 13));
        u91Var.s0.setVisibility(0);
        if (z10) {
            org.telegram.messenger.g0.a3(u91Var.getParentActivity(), u91Var.classGuid);
            u91Var.U0(false);
        } else {
            u91Var.r0.setVisibility(0);
        }
        u91Var.Z0.addListener(new e91(u91Var, z10, i7));
        u91Var.Z0.setDuration(200L);
        u91Var.Z0.setInterpolator(org.telegram.ui.Components.er.f);
        u91Var.Z0.start();
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ie0
    public final ui.f B() {
        return this.j1;
    }

    public final void B0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.h1) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.c(org.telegram.messenger.g0.L(14.0f)));
        yw ywVar = this.N0;
        View view = ywVar != null ? ywVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = ywVar != null ? ywVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.g1) - org.telegram.messenger.g0.L(8.0f);
        int L3 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
        this.o1.set(0.0f, -L, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + L + L2);
        RectF rectF = this.p1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, org.telegram.messenger.qc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
        gVar.g(this.N0 != null ? 2 : 1, this.n1);
        gVar.e(this.m1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void C0() {
        x81 x81Var;
        org.telegram.messenger.h00 h00Var = this.s;
        long j3 = this.a;
        if (h00Var.e(j3) || (x81Var = this.G) == null) {
            return;
        }
        int N0 = x81Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.b() - 5) {
            h00Var.o(j3);
        }
        E0();
    }

    @Override // org.telegram.ui.Components.qg
    public final org.telegram.ui.Components.st0 D() {
        return this.d;
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (this.I0 != null && ((str = this.z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.c2.l(M0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else {
            if (this.z0 == null || !z10 || N0 == null || N0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.k5.n(null, 2131748913, org.telegram.ui.Components.cc.a0(this), R.raw.linkbroken, 36);
            this.z0 = null;
        }
    }

    public final void E0() {
        org.telegram.messenger.h00 h00Var = this.s;
        a0.h hVar = h00Var.a;
        LongSparseIntArray longSparseIntArray = h00Var.c;
        long j3 = this.a;
        this.K0 = longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty());
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((m91) arrayList.get(0)).c != null && ((m91) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        g91 g91Var = this.O;
        if (g91Var != null) {
            g91Var.K0(g91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        yw ywVar = this.N0;
        if (ywVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.vr vrVar = ywVar.L1;
            float c10 = (vrVar != null ? vrVar.c(L) : 0.0f) + 0.0f;
            org.telegram.ui.Components.vr vrVar2 = this.V0;
            if (vrVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.vr vrVar3 = this.N0.L1;
                vrVar2.setTranslationY(c10 - ((vrVar3 != null ? vrVar3.getMetadata().c.a : 0.0f) * L2));
                org.telegram.ui.Components.vr vrVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                r2 = vrVar4.c(org.telegram.messenger.g0.W1(this.N0.L1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.vr vrVar5 = this.V0;
            if (vrVar5 != null) {
                r2 = 0.0f + vrVar5.c(org.telegram.messenger.g0.L(14.0f));
            }
        }
        this.O.setPadding(0, (int) r2, 0, this.g1 + this.e1 + (this.W ? org.telegram.messenger.g0.L(51.0f) : 0));
    }

    public final void G0() {
        this.b0.clear();
        this.actionBar.w();
        org.telegram.messenger.g0.a4(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.hd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131751498, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            t1Var.U = org.telegram.messenger.hd.M0(2131751497, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(16));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean K() {
        return false;
    }

    public final void K0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    public final void L0(boolean z10) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.c5(this.K);
        profileActivity.i5((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().J() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ long M() {
        return 0L;
    }

    public final void N0(int i7) {
        if (this.N != i7) {
            this.N = i7;
            this.M.setTextColorKey(i7 == 0 ? org.telegram.ui.ActionBar.j6.sf : org.telegram.ui.ActionBar.j6.q7);
            this.X0.setVisibility(i7 == 1 ? 0 : 8);
            S0(false);
        }
    }

    public final void O0(boolean z10) {
        if (org.telegram.messenger.gz.o() == 0) {
            return;
        }
        c91 c91Var = this.d;
        if (c91Var != null) {
            if (z10) {
                c91Var.setLayerType(2, null);
                c91Var.setClipChildren(false);
                c91Var.setClipToPadding(false);
            } else {
                c91Var.setLayerType(0, null);
                c91Var.setClipChildren(true);
                c91Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.gz.o() == 0) {
            return;
        }
        this.T0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        g91 g91Var = this.O;
        if (g91Var != null) {
            float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.T0, 0.05f, 1.0f);
            g91Var.setPivotX(0.0f);
            g91Var.setPivotY(0.0f);
            g91Var.setScaleX(t6);
            g91Var.setScaleY(t6);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(t6);
            this.actionBar.setScaleY(t6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void Q0(org.telegram.ui.Cells.t2 t2Var) {
        boolean z10;
        try {
            t2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = t2Var.O;
        org.telegram.ui.Components.io ioVar = new org.telegram.ui.Components.io(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new b91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ioVar.f);
        ioVar.o = 1;
        long j3 = this.a;
        long j10 = -j3;
        ioVar.e(j10, tL_forumTopic.id, null);
        if (org.telegram.messenger.t3.y(15, g())) {
            org.telegram.ui.ActionBar.z0 z0Var = new org.telegram.ui.ActionBar.z0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                z0Var.j(org.telegram.messenger.hd.M0(2131751452, null), R.drawable.msg_unpin, null);
            } else {
                z0Var.j(org.telegram.messenger.hd.M0(2131751453, null), R.drawable.msg_pin, null);
            }
            z0Var.setMinimumWidth(org.telegram.messenger.ns.q2);
            z10 = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            z0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
                public final /* synthetic */ u91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr) {
                        case 0:
                            u91 u91Var = this.b;
                            u91Var.D0 = true;
                            u91Var.O0 = true;
                            u91Var.s.t(u91Var.a, tL_forumTopic.id, !r0.pinned, u91Var);
                            u91Var.finishPreviewFragment();
                            break;
                        case 1:
                            u91 u91Var2 = this.b;
                            u91Var2.O0 = true;
                            org.telegram.messenger.h00 h00Var = u91Var2.s;
                            long j11 = u91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            h00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            u91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            u91 u91Var3 = this.b;
                            u91Var3.H0(hashSet, new u81(u91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(z0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.z0 z0Var2 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z10, z10);
        if (getMessagesController().r2(j10, tL_forumTopic.id, null)) {
            z0Var2.j(org.telegram.messenger.hd.M0(2131743849, null), R.drawable.msg_mute, null);
        } else {
            z0Var2.j(org.telegram.messenger.hd.M0(2131748314, null), R.drawable.msg_unmute, null);
        }
        z0Var2.setMinimumWidth(org.telegram.messenger.ns.q2);
        z0Var2.setOnClickListener(new fi.l5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        boolean z11 = false;
        r32[0].addView(z0Var2);
        if (org.telegram.messenger.t3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var3 = new org.telegram.ui.ActionBar.z0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                z0Var3.j(org.telegram.messenger.hd.M0(2131746084, null), R.drawable.msg_topic_restart, null);
            } else {
                z0Var3.j(org.telegram.messenger.hd.M0(2131752039, null), R.drawable.msg_topic_close, null);
            }
            z0Var3.setMinimumWidth(org.telegram.messenger.ns.q2);
            final int i7 = 1;
            z0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
                public final /* synthetic */ u91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            u91 u91Var = this.b;
                            u91Var.D0 = true;
                            u91Var.O0 = true;
                            u91Var.s.t(u91Var.a, tL_forumTopic.id, !r0.pinned, u91Var);
                            u91Var.finishPreviewFragment();
                            break;
                        case 1:
                            u91 u91Var2 = this.b;
                            u91Var2.O0 = true;
                            org.telegram.messenger.h00 h00Var = u91Var2.s;
                            long j11 = u91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            h00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            u91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            u91 u91Var3 = this.b;
                            u91Var3.H0(hashSet, new u81(u91Var3, 3));
                            break;
                    }
                }
            });
            z11 = false;
            r32[0].addView(z0Var3);
        }
        if (org.telegram.messenger.t3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.z0 z0Var4 = new org.telegram.ui.ActionBar.z0(getParentActivity(), z11, true);
            z0Var4.j(org.telegram.messenger.hd.K0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            z0Var4.c(org.telegram.ui.ActionBar.j6.q7, org.telegram.ui.ActionBar.j6.p7);
            z0Var4.setMinimumWidth(org.telegram.messenger.ns.q2);
            final int i10 = 2;
            z0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.w81
                public final /* synthetic */ u91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            u91 u91Var = this.b;
                            u91Var.D0 = true;
                            u91Var.O0 = true;
                            u91Var.s.t(u91Var.a, tL_forumTopic.id, !r0.pinned, u91Var);
                            u91Var.finishPreviewFragment();
                            break;
                        case 1:
                            u91 u91Var2 = this.b;
                            u91Var2.O0 = true;
                            org.telegram.messenger.h00 h00Var = u91Var2.s;
                            long j11 = u91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            h00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            u91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            u91 u91Var3 = this.b;
                            u91Var3.H0(hashSet, new u81(u91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(z0Var4);
        }
        boolean y22 = getMessagesController().y2(j10);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ns.K2));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, c8.ja.c(-1.0f, -1));
        }
        an anVar = new an(a8.p0.j(j3, "chat_id"));
        qg.c.a(anVar, org.telegram.messenger.ur.a(j10, y22 ? org.telegram.messenger.m5.o(t2Var.O.from_id) : t2Var.O.id));
        presentFragmentAsPreviewWithMenu(anVar, r32[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(View view) {
        r91 r91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.messenger.h00 h00Var;
        int i7;
        boolean z10;
        boolean z11;
        if (!(view instanceof r91) || (tL_forumTopic = (r91Var = (r91) view).O) == null) {
            return;
        }
        int i10 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.b0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        r91Var.e0(hashSet.contains(Integer.valueOf(i10)), true);
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (hashSet.isEmpty()) {
            this.actionBar.w();
            return;
        }
        if (!this.actionBar.c(null)) {
            org.telegram.ui.ActionBar.y p10 = this.actionBar.p(null);
            if (this.inPreviewMode) {
                p10.setBackgroundColor(0);
                p10.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(p10.getContext());
            this.d0 = numberTextView;
            numberTextView.setTextSize(18);
            this.d0.setTypeface(org.telegram.messenger.g0.o());
            this.d0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
            p10.addView(this.d0, c8.ja.m(1.0f, 0, -1, 72, 0, 0));
            this.d0.setOnTouchListener(new lk0(2));
            this.e0 = p10.g(4, R.drawable.msg_pin, org.telegram.messenger.g0.L(54.0f));
            this.f0 = p10.g(5, R.drawable.msg_unpin, org.telegram.messenger.g0.L(54.0f));
            this.g0 = p10.g(6, R.drawable.msg_mute, org.telegram.messenger.g0.L(54.0f));
            this.h0 = p10.h(7, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131751598, null));
            org.telegram.ui.ActionBar.q0 h = p10.h(12, R.drawable.msg_archive_hide, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131749325, null));
            this.i0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.q0 h7 = p10.h(13, R.drawable.msg_archive_show, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131745353, null));
            this.j0 = h7;
            h7.setVisibility(8);
            org.telegram.ui.ActionBar.q0 h10 = p10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.hd.M0(2131754839, null));
            this.n0 = h10;
            this.k0 = h10.e(8, R.drawable.msg_markread, org.telegram.messenger.hd.M0(2131748681, null));
            this.l0 = this.n0.e(9, R.drawable.msg_topic_close, org.telegram.messenger.hd.M0(2131752039, null));
            this.m0 = this.n0.e(10, R.drawable.msg_topic_restart, org.telegram.messenger.hd.M0(2131746084, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.R(null, null);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.r4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            h00Var = this.s;
            if (!hasNext) {
                break;
            }
            boolean z13 = z12;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f10 = h00Var.f(j3, intValue);
            if (f10 != null) {
                if (f10.unread_count != 0) {
                    i11++;
                }
                if (org.telegram.messenger.t3.y(15, M0) && !f10.hidden) {
                    if (f10.pinned) {
                        i13++;
                    } else {
                        z11 = (z13 ? 1 : 0) + 1;
                        int i14 = i12;
                        i12 = !getMessagesController().r2(-j3, intValue, null) ? i14 + 1 : i14;
                        z12 = z11;
                    }
                }
            }
            z11 = z13 ? 1 : 0;
            int i142 = i12;
            if (!getMessagesController().r2(-j3, intValue, null)) {
            }
            z12 = z11;
        }
        int i15 = i12;
        boolean z14 = z12;
        if (i11 > 0) {
            this.k0.setVisibility(0);
            this.k0.j(org.telegram.messenger.hd.M0(2131748681, null), R.drawable.msg_markread, null);
            i7 = 8;
        } else {
            i7 = 8;
            this.k0.setVisibility(8);
        }
        if (i15 != 0) {
            this.C0 = false;
            this.g0.setIcon(R.drawable.msg_unmute);
            this.g0.setContentDescription(org.telegram.messenger.hd.M0(2131752165, null));
            z10 = true;
        } else {
            z10 = true;
            this.C0 = true;
            this.g0.setIcon(R.drawable.msg_mute);
            this.g0.setContentDescription(org.telegram.messenger.hd.M0(2131752175, null));
        }
        this.e0.setVisibility((z14 == z10 && i13 == 0) ? 0 : i7);
        this.f0.setVisibility((i13 != z10 || z14) ? i7 : 0);
        this.d0.a(hashSet.size(), z10);
        Iterator it2 = hashSet.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (it2.hasNext()) {
            HashSet hashSet2 = hashSet;
            TLRPC.TL_forumTopic f11 = h00Var.f(j3, ((Integer) it2.next()).intValue());
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
        this.l0.setVisibility((i16 != 0 || i17 <= 0) ? 8 : 0);
        this.l0.setText(org.telegram.messenger.hd.M0(i17 > 1 ? 2131752038 : 2131752039, null));
        this.m0.setVisibility((i17 != 0 || i16 <= 0) ? 8 : 0);
        this.m0.setText(i16 > 1 ? org.telegram.messenger.hd.M0(2131746083, null) : org.telegram.messenger.hd.M0(2131746084, null));
        this.h0.setVisibility(i18 == hashSet3.size() ? 0 : 8);
        this.i0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.j0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.n0.m();
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
    public final void S0(boolean z10) {
        ?? r12;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.ChatFull chatFull;
        String str;
        String M0;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j3));
        long j10 = -j3;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        if (org.telegram.messenger.q10.u(a22)) {
            this.f.setUserAvatar(a22);
        } else if (org.telegram.messenger.t3.p0(M02)) {
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(M02.linked_monoforum_id));
            if (M03 != null) {
                this.f.setChatAvatar(M03);
            }
        } else {
            this.f.setChatAvatar(M02);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(this.currentAccount).e7;
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j10);
        boolean z14 = sharedPreferences.getInt(sb2.toString(), 0) == 2;
        boolean w10 = org.telegram.messenger.k5.w("dialog_bar_report", j10, sharedPreferences, false);
        boolean w11 = org.telegram.messenger.k5.w("dialog_bar_block", j10, sharedPreferences, false);
        boolean z15 = this.u0;
        if (z15) {
            r12 = 0;
            if (this.x0) {
                this.f.setTitle(org.telegram.messenger.hd.M0(2131746252, null));
            } else if (this.w0) {
                this.f.setTitle(org.telegram.messenger.hd.M0(2131746429, null));
            } else if (this.y0) {
                this.f.setTitle(org.telegram.messenger.hd.M0(2131752977, null));
            } else if (this.v0) {
                this.f.setTitle(org.telegram.messenger.hd.M0(2131750575, null));
            } else {
                this.f.setTitle(org.telegram.messenger.hd.M0(2131745649, null));
            }
            this.q0.setVisibility(8);
            org.telegram.ui.Components.sn snVar = this.f;
            if (snVar != null && snVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(this.q0.getVisibility() == 0 ? 86.0f : 40.0f);
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
            if (N0 != null && (chatFull2 = this.K) != null && (chatParticipants = chatFull2.participants) != null) {
                N0.participants = chatParticipants;
            }
            this.K = N0;
            if (N0 != null) {
                int i7 = N0.participants_count;
                if (i7 <= 0) {
                    TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(j3));
                    M0 = M04 == null ? org.telegram.messenger.hd.M0(2131748779, str) : org.telegram.messenger.t3.t0(M04) ? org.telegram.messenger.hd.M0(2131748638, str).toLowerCase() : org.telegram.messenger.hd.M0(2131748641, str).toLowerCase();
                } else {
                    M0 = org.telegram.messenger.hd.G(i7, "Members", new Object[0]);
                }
            } else {
                M0 = org.telegram.messenger.hd.M0(2131748779, str);
            }
            this.f.setSubtitle(M0);
            r12 = str;
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j11 = org.telegram.messenger.np.s1(this.currentAccount).e7.getLong(a8.p0.o(j10, "dialog_join_requested_time_"), -1L);
        if (M02 == null || !org.telegram.messenger.t3.r0(M02) || j11 <= 0 || System.currentTimeMillis() - j11 >= 120000) {
            if (M02 != null && !z15) {
                if (!org.telegram.messenger.t3.r0(M02)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(M02.id))) {
                    z13 = true;
                    z12 = true;
                } else {
                    if (M02.join_request) {
                        this.M.setText(org.telegram.messenger.hd.M0(2131752395, r12));
                    } else {
                        this.M.setText(org.telegram.messenger.hd.M0(2131752397, r12));
                    }
                    z12 = true;
                    this.M.setClickable(true);
                    this.M.setEnabled(true);
                    z13 = false;
                }
                org.telegram.messenger.g0.Y3(this.o0, z13, 0.5f, z12, z16);
                org.telegram.messenger.g0.Y3(this.M, z13 ^ z12, 0.5f, z12, z16);
                N0(0);
            }
            if (!z14 || (!w11 && !w10)) {
                z11 = false;
                if (this.W != z11) {
                    this.W = z11;
                    this.p0.animate().setListener(r12).cancel();
                    if (z16) {
                        this.p0.animate().translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(53.0f)).setListener(new e91(this, z11, 1));
                    } else {
                        this.p0.setVisibility(z11 ? 0 : 8);
                        this.p0.setTranslationY(z11 ? 0.0f : org.telegram.messenger.g0.L(53.0f));
                    }
                }
                F0();
                this.r0.setVisibility(!z15 ? 8 : 0);
                this.S.setVisibility(!org.telegram.messenger.t3.w(3, M02) ? 0 : 8);
                this.U.setVisibility((org.telegram.messenger.t3.R(M02) || (!getUserConfig().q() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.t3.N(M02)))) ? 8 : 0);
                this.T.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.r0(M02)) ? 8 : 0);
                this.V.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.N(M02)) ? 8 : 0);
                U0(true);
                this.I0 = getMessagesController().g1(j3, true, r12);
                D0(false);
            }
            this.M.setText(org.telegram.messenger.hd.M0(2131746203, r12));
            this.M.setClickable(true);
            this.M.setEnabled(true);
            org.telegram.messenger.g0.Y3(this.o0, false, 0.5f, true, false);
            org.telegram.messenger.g0.Y3(this.M, true, 0.5f, true, false);
            N0(1);
        } else {
            this.M.a(org.telegram.messenger.hd.M0(2131752393, r12), z16);
            this.M.setEnabled(false);
            org.telegram.messenger.g0.Y3(this.o0, false, 0.5f, true, z16);
            org.telegram.messenger.g0.Y3(this.M, true, 0.5f, true, z16);
            N0(0);
        }
        z11 = true;
        if (this.W != z11) {
        }
        F0();
        this.r0.setVisibility(!z15 ? 8 : 0);
        this.S.setVisibility(!org.telegram.messenger.t3.w(3, M02) ? 0 : 8);
        this.U.setVisibility((org.telegram.messenger.t3.R(M02) || (!getUserConfig().q() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.t3.N(M02)))) ? 8 : 0);
        this.T.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.r0(M02)) ? 8 : 0);
        this.V.setVisibility((M02 != null || M02.creator || org.telegram.messenger.t3.N(M02)) ? 8 : 0);
        U0(true);
        this.I0 = getMessagesController().g1(j3, true, r12);
        D0(false);
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.sf));
        this.h.updateColors();
        eh0 eh0Var = this.p0;
        int i7 = org.telegram.ui.ActionBar.j6.d6;
        eh0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        }
        this.s0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z10) {
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.a;
        boolean z11 = (org.telegram.messenger.t3.r0(getMessagesController().M0(Long.valueOf(j3))) || !org.telegram.messenger.t3.w(15, messagesController.M0(Long.valueOf(j3))) || this.t0 || this.u0 || this.K0) ? false : true;
        this.L = z11;
        this.R.setVisibility(z11 ? 0 : 8);
        K0(!this.L, z10);
    }

    public final void V0() {
        boolean z10 = org.telegram.messenger.t3.y(15, g()) && !this.b0.isEmpty();
        if (this.c0 != z10) {
            this.c0 = z10;
            l91 l91Var = this.r;
            l91Var.k(0, l91Var.b());
        }
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.c1 = true;
        float f11 = 1.0f - f10;
        this.f.getTitleTextView().setAlpha(f11);
        this.f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.v61 v61Var = this.b1;
        if (v61Var != null) {
            v61Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
            this.b1.setAlpha(f10);
        }
        this.s0.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
        this.s0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f11);
        if (this.a1) {
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(z10);
            this.O.setScaleY(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2, org.telegram.ui.ie0
    public final /* synthetic */ boolean X(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.j6.y8;
        kVar.H(i0.a.f(this.X, themedColor, getThemedColor(i7)), false);
        this.actionBar.H(i0.a.f(this.X, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.F(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.j6.t8), getThemedColor(org.telegram.ui.ActionBar.j6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.j6.s8), getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
    }

    public final void Y0() {
        fi.x4 x4Var = this.E0;
        if (x4Var == null || x4Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.ic_ab_other, 0);
        eqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        if (org.telegram.messenger.t3.y(15, g())) {
            this.E0.e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748136, null)), spannableStringBuilder, "%s"));
            return;
        }
        String M0 = org.telegram.messenger.hd.M0(2131750474, null);
        TLRPC.TL_forumTopic f10 = getMessagesController().r7.f(this.a, 1L);
        if (f10 != null) {
            M0 = f10.title;
        }
        this.E0.e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("NoTopicsDescriptionUser", null, 2131748135, M0)));
    }

    public final void Z0(boolean z10, boolean z11) {
        x81 x81Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.h00 h00Var = this.s;
        long j3 = this.a;
        ArrayList l10 = h00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (org.telegram.messenger.q10.u(org.telegram.messenger.np.s1(this.currentAccount).a2(Long.valueOf(-j3))) && this.v0) {
                arrayList.add(new m91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).id))) {
                    arrayList.add(new m91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !h00Var.e(j3) && this.W0) {
                arrayList.add(new m91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                m91 m91Var = (m91) arrayList.get(i10);
                if (m91Var != null && (tL_forumTopic = m91Var.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            g91 g91Var = this.O;
            if (g91Var != null) {
                if (g91Var.getItemAnimator() != (z10 ? this.J0 : null)) {
                    this.O.setItemAnimator(z10 ? this.J0 : null);
                }
            }
            l91 l91Var = this.r;
            if (l91Var != null) {
                l91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (x81Var = this.G) != null) {
                x81Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override // org.telegram.ui.Components.qg, org.telegram.ui.Components.e40
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.s8));
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        yw ywVar = this.N0;
        final int i7 = 0;
        this.e1 = (ywVar == null || !ywVar.X) ? 0 : org.telegram.messenger.g0.L(72.0f);
        yw ywVar2 = this.N0;
        this.f1 = (ywVar2 == null || !ywVar2.X) ? 0 : org.telegram.messenger.g0.L(64.0f);
        c91 c91Var = new c91(this, context);
        this.d = c91Var;
        this.fragmentView = c91Var;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, c91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i10 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((o4Var2 = this.parentLayout) != null && ((ActionBarLayout) o4Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new f91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t81
            public final /* synthetic */ u91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i7) {
                    case 0:
                        u91 u91Var = this.b;
                        if (!u91Var.t0) {
                            u91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        u91 u91Var2 = this.b;
                        u91Var2.getMessagesController().i2(-u91Var2.a, null, u91Var2.g());
                        u91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        yw ywVar3 = this.b.N0;
                        if (ywVar3 != null && (q0Var = ywVar3.k0) != null) {
                            q0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        u91 u91Var3 = this.b;
                        u91Var3.presentFragment(s81.f0(u91Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        final int i11 = 3;
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
            this.q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t81
                public final /* synthetic */ u91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (i11) {
                        case 0:
                            u91 u91Var = this.b;
                            if (!u91Var.t0) {
                                u91Var.L0(false);
                                break;
                            }
                            break;
                        case 1:
                            u91 u91Var2 = this.b;
                            u91Var2.getMessagesController().i2(-u91Var2.a, null, u91Var2.g());
                            u91Var2.S0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            yw ywVar3 = this.b.N0;
                            if (ywVar3 != null && (q0Var = ywVar3.k0) != null) {
                                q0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            u91 u91Var3 = this.b;
                            u91Var3.presentFragment(s81.f0(u91Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.q0 a11 = s5.a(0, R.drawable.outline_header_search);
            this.q0 = a11;
            a11.O();
            a11.K(new kg.x1(this, 22));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            org.telegram.ui.ActionBar.q6.U(searchField, org.telegram.ui.ActionBar.j6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Jj, getResourceProvider());
            org.telegram.ui.ActionBar.q6.v(searchField, org.telegram.ui.ActionBar.j6.Ne, getResourceProvider());
        }
        org.telegram.ui.ActionBar.q0 c10 = s5.c(0, R.drawable.ic_ab_other, null);
        this.r0 = c10;
        c10.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        this.r0.e(1, R.drawable.msg_discussion, org.telegram.messenger.hd.M0(2131744002, null));
        final int i12 = 2;
        this.S = this.r0.e(2, R.drawable.msg_addcontact, org.telegram.messenger.hd.M0(2131754401, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.r0;
        this.U = q0Var.d(14, 0, new org.telegram.ui.Components.ch0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.hd.M0(2131753585, null), true, false, q0Var.n0);
        this.R = this.r0.e(3, R.drawable.msg_topic_create, org.telegram.messenger.hd.M0(2131751702, null));
        this.V = this.r0.e(15, R.drawable.msg_report, org.telegram.messenger.hd.M0(2131746230, null));
        this.T = this.r0.d(11, R.drawable.msg_leave, null, org.telegram.messenger.hd.M0(2131748990, null), true, false, null);
        org.telegram.ui.Components.sn snVar = new org.telegram.ui.Components.sn(context, this, false, this.resourceProvider);
        this.f = snVar;
        snVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((o4Var = this.parentLayout) != null && ((ActionBarLayout) o4Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.sn snVar2 = this.f;
        long j3 = -this.a;
        snVar2.b = j3 < 0;
        snVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, c8.ja.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        int i13 = 4;
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new a8(this, i13));
        }
        this.O = new g91(this, context);
        jh.k kVar = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.l1;
        cVar.h = kVar;
        cVar.i = viewGroup;
        g91 g91Var = this.O;
        yw ywVar3 = this.N0;
        if (ywVar3 != null) {
            viewGroup = (ViewGroup) ywVar3.getFragmentView();
        }
        g91 g91Var2 = this.O;
        Objects.requireNonNull(g91Var2);
        this.m1 = new dh.k(g91Var, viewGroup, new n40(g91Var2, 2));
        this.O.D0(new u81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.b c11 = qg.c.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        gv gvVar = new gv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131754719, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.hd.M0(2131754721, null), spannableString, "#"));
        this.x = gvVar;
        gvVar.b();
        int i14 = this.F ? 2 : 0;
        this.E = i14;
        this.x.X = i14 != 0;
        i91 i91Var = new i91(this);
        this.O.setHideIfEmpty(false);
        i91Var.m = false;
        i91Var.C = false;
        g91 g91Var3 = this.O;
        this.J0 = i91Var;
        g91Var3.setItemAnimator(i91Var);
        this.O.setOnScrollListener(new j91(this, i7));
        g91 g91Var4 = this.O;
        g91Var4.X1 = true;
        g91Var4.Y1 = 0;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(g91Var4, true);
        this.L0 = xi0Var;
        this.O.setItemsEnterAnimator(xi0Var);
        this.O.setOnItemClickListener(new ux0(this, 9));
        this.O.setOnItemLongClickListener(new v81(this));
        this.O.setOnScrollListener(new j91(this, i10));
        g91 g91Var5 = this.O;
        x81 x81Var = new x81(this);
        this.G = x81Var;
        g91Var5.setLayoutManager(x81Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new y81(this));
        t91 t91Var = new t91(this);
        this.Q = t91Var;
        z81 z81Var = new z81(this, t91Var);
        this.P = z81Var;
        z81Var.h(this.O);
        this.d.addView(this.O, c8.ja.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getParentActivity(), this.resourceProvider, false);
        this.h = t00Var;
        this.d.addView(t00Var, org.telegram.ui.Components.t00.b());
        final int i15 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t81
            public final /* synthetic */ u91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i15) {
                    case 0:
                        u91 u91Var = this.b;
                        if (!u91Var.t0) {
                            u91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        u91 u91Var2 = this.b;
                        u91Var2.getMessagesController().i2(-u91Var2.a, null, u91Var2.g());
                        u91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        yw ywVar32 = this.b.N0;
                        if (ywVar32 != null && (q0Var2 = ywVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        u91 u91Var3 = this.b;
                        u91Var3.presentFragment(s81.f0(u91Var3.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.hd.M0(2131751702, null));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        pzVar.setViewType(24);
        pzVar.setVisibility(8);
        pzVar.x = true;
        q81 q81Var = new q81(context, i10);
        TextView textView = new TextView(context);
        q81Var.d = textView;
        if (org.telegram.messenger.hd.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131744259, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.hd.M0(2131744259, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.y6, getResourceProvider());
        boolean z10 = org.telegram.messenger.hd.a0;
        q81Var.addView(textView, c8.ja.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = q81Var;
        textView.setAlpha(0.0f);
        fi.x4 x4Var = new fi.x4(this, context, pzVar);
        this.E0 = x4Var;
        try {
            x4Var.b.getImageReceiver().W(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.hd.M0(2131748138, null));
        Y0();
        this.n.addView(pzVar);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new eh0(context, 14);
        org.telegram.ui.Components.v41 v41Var = new org.telegram.ui.Components.v41(context);
        this.M = v41Var;
        this.p0.addView(v41Var);
        this.d.addView(this.p0, c8.ja.e(-1, 51, 80));
        this.M.setOnClickListener(new a91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, c8.ja.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.X0.setContentDescription(org.telegram.messenger.hd.M0(2131752041, null));
        ImageView imageView2 = this.X0;
        int i16 = org.telegram.ui.ActionBar.j6.Ue;
        imageView2.setBackground(org.telegram.ui.ActionBar.y5.c(null, org.telegram.ui.ActionBar.y5.b(getThemedColor(i16))));
        org.telegram.ui.ActionBar.q6.s(this.X0, i16, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, c8.ja.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t81
            public final /* synthetic */ u91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i10) {
                    case 0:
                        u91 u91Var = this.b;
                        if (!u91Var.t0) {
                            u91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        u91 u91Var2 = this.b;
                        u91Var2.getMessagesController().i2(-u91Var2.a, null, u91Var2.g());
                        u91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        yw ywVar32 = this.b.N0;
                        if (ywVar32 != null && (q0Var2 = ywVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        u91 u91Var3 = this.b;
                        u91Var3.presentFragment(s81.f0(u91Var3.a, 0L));
                        break;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        k0 k0Var = new k0(27, context, this);
        this.e = k0Var;
        if (this.N0 == null) {
            this.d.addView(k0Var, c8.ja.e(-1, -1, org.telegram.messenger.ns.E1));
        }
        q91 q91Var = new q91(this, context);
        this.s0 = q91Var;
        q91Var.setVisibility(8);
        this.e.addView(this.s0, c8.ja.d(-1, -1.0f, org.telegram.messenger.ns.E1, 0.0f, 44.0f, 0.0f, 0.0f));
        q91 q91Var2 = this.s0;
        int i17 = org.telegram.ui.ActionBar.j6.d6;
        org.telegram.ui.ActionBar.q6.h(i17, q91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.vr vrVar = new org.telegram.ui.Components.vr(context);
        this.V0 = vrVar;
        vrVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c12 = cVar.c(this.V0, c8.g0.n(this.resourceProvider), false);
        org.telegram.messenger.i20.r(c12, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c12);
        this.V0.setOnAnimatedHeightChangedListener(new u81(this, i7));
        this.d.addView(this.V0, c8.ja.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            zh.d dVar = new zh.d(g10, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), c8.ja.o(-1, 40));
            this.V0.h(3, this.S0.b());
            this.V0.g(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.m = new v81(this);
            TLRPC.ChatFull chatFull = this.K;
            dVar2.j = chatFull;
            if (chatFull != null) {
                dVar2.d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.h(4, this.G0);
            this.V0.g(this.G0);
            this.V0.i(this.G0, true, false);
            x8 x8Var = new x8(this, context, this);
            this.H0 = x8Var;
            this.G0.addView(x8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c13 = c8.ja.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = org.telegram.messenger.g0.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        C0();
        rv rvVar = new rv(11, context, this);
        this.Q0 = rvVar;
        rvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i17), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.t81
            public final /* synthetic */ u91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i12) {
                    case 0:
                        u91 u91Var = this.b;
                        if (!u91Var.t0) {
                            u91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        u91 u91Var2 = this.b;
                        u91Var2.getMessagesController().i2(-u91Var2.a, null, u91Var2.g());
                        u91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        yw ywVar32 = this.b.N0;
                        if (ywVar32 != null && (q0Var2 = ywVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        u91 u91Var3 = this.b;
                        u91Var3.presentFragment(s81.f0(u91Var3.a, 0L));
                        break;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) it.next();
                if (e2Var instanceof yw) {
                    yw ywVar4 = (yw) e2Var;
                    if (ywVar4.t4()) {
                        org.telegram.messenger.ur urVar = ywVar4.r2;
                        if (urVar.a == j3) {
                            this.R0 = urVar.b;
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
        v81 v81Var = new v81(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, v81Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.ns.T;
        long j3 = this.a;
        if (i7 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j3) {
                S0(false);
                zh.d dVar = this.S0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                D0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i7 == org.telegram.messenger.ns.v5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.ns.p3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.ns.q5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.ns.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.np.D8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().r7.y(j3, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.ns.s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.ns.w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.I0 = getMessagesController().g1(l10.longValue(), false, null);
                x8 x8Var = this.H0;
                if (x8Var != null) {
                    x8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.ns.f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.ns.r5 && i7 == org.telegram.messenger.ns.t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.ns.h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j3) || booleanValue) {
                if (this.R0 != 0) {
                    this.R0 = 0L;
                    Z0(false, false);
                    return;
                }
                return;
            }
            if (this.R0 != longValue2) {
                this.R0 = longValue2;
                Z0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final TLRPC.Chat g() {
        return getMessagesController().M0(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.qg
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var = this.I0;
        if (r3Var == null || !(r3Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return r3Var;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        q91 q91Var = this.s0;
        if (q91Var != null && q91Var.a0 != null) {
            int i7 = org.telegram.ui.Cells.x3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.t0 ? org.telegram.ui.ActionBar.j6.d6 : org.telegram.ui.ActionBar.j6.s8);
        if (this.actionBar.x()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ TLRPC.User j() {
        return null;
    }

    @Override // org.telegram.ui.ie0
    public final ui.f k() {
        return this.i1;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onBackPressed(boolean z10) {
        if (this.b0.isEmpty()) {
            if (!this.t0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.A(this.q0.U(false));
            }
        } else if (z10) {
            G0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.n(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.np messagesController = getMessagesController();
        long j3 = this.a;
        messagesController.V2(0, j3, true);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.v5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.p3);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.q5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.r);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.s);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.w2);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f0);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.r5);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.t);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.h0);
        Z0(false, false);
        n11.t(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().W4(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = r1;
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

    @Override // org.telegram.ui.ActionBar.e2
    public final void onFragmentDestroy() {
        this.P0.e();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.v5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.p3);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.q5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.r);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.s);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.w2);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f0);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.r5);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.t);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.h0);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.a));
        if (org.telegram.messenger.t3.T(M0)) {
            getMessagesController().W4(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        yw ywVar = this.N0;
        if (ywVar == null || ywVar.H3 == null) {
            return;
        }
        ywVar.getActionBar().setSearchAvatarImageView(null);
        this.N0.H3.N = true;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().r7.f;
        long j3 = this.a;
        int i7 = longSparseIntArray.get(j3, 0) - 1;
        longSparseIntArray.put(j3, i7 >= 0 ? i7 : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.h00 h00Var = getMessagesController().r7;
        LongSparseIntArray longSparseIntArray = h00Var.f;
        long j3 = this.a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        h00Var.y(j3, true);
        this.H = false;
        org.telegram.messenger.g0.a4(this.O);
        this.H = true;
        setBulletinDelegate(new y8(this, 9));
        if (!this.inPreviewMode || getMessagesController().t2(-j3)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.gz.o() != 0 && this.U0) {
            P0(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        ui.c cVar = this.k1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.y5.b(getThemedColor(org.telegram.ui.ActionBar.j6.Ue))) != this.q1) {
            this.q1 = b10;
            org.telegram.ui.ActionBar.j6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.I(getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            this.actionBar.K(getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        rv rvVar = this.Q0;
        if (rvVar != null && (rvVar.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            gv gvVar = this.x;
            if (gvVar != null) {
                gvVar.i();
            }
            if (this.actionBar != null && this.c1) {
                X0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ne));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        uv uvVar;
        rv rvVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (rvVar = this.Q0) != null) {
            if (rvVar.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z10) {
            D0(false);
        }
        this.P0.e();
        if (z10) {
            return;
        }
        if (this.u0 && this.I) {
            removeSelfFromStack();
            yw ywVar = this.M0;
            if (ywVar != null) {
                ywVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.J) {
            removeSelfFromStack();
            yw ywVar2 = this.N0;
            if (ywVar2 == null || (uvVar = ywVar2.H3) == null || !uvVar.c()) {
                return;
            }
            this.N0.H3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        rv rvVar = this.Q0;
        if (rvVar == null || rvVar.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.Q0.setAlpha(1.0f - f10);
        } else {
            this.Q0.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.P0.d();
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.U0 = true;
            O0(true);
        } else {
            this.U0 = false;
            O0(false);
            P0(1.0f);
        }
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.qg
    public final org.telegram.ui.Components.sn r() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.sn snVar = this.f;
        if (snVar != null) {
            snVar.setAlpha(f10);
            this.r0.setAlpha(f10);
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var != null) {
                q0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e2
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.sn snVar = this.f;
        if (snVar != null) {
            snVar.setAlpha(f10);
            this.f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override // org.telegram.ui.ie0
    public final void v() {
        this.O.y0(0);
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.qg
    public final /* synthetic */ void l(int i7, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
