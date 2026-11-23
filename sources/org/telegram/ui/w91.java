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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class w91 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.ah, ke0 {
    public static final HashSet s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public int E;
    public fi.w4 E0;
    public boolean F;
    public m91 F0;
    public z81 G;
    public FrameLayout G0;
    public boolean H;
    public y8 H0;
    public boolean I;
    public org.telegram.messenger.t3 I0;
    public boolean J;
    public k91 J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public org.telegram.ui.Components.hj0 L0;
    public org.telegram.ui.Components.i51 M;
    public bx M0;
    public int N;
    public bx N0;
    public i91 O;
    public boolean O0;
    public b91 P;
    public final h2.f P0;
    public v91 Q;
    public tv Q0;
    public org.telegram.ui.ActionBar.y0 R;
    public long R0;
    public org.telegram.ui.ActionBar.y0 S;
    public zh.d S0;
    public org.telegram.ui.ActionBar.y0 T;
    public float T0;
    public org.telegram.ui.ActionBar.y0 U;
    public boolean U0;
    public org.telegram.ui.ActionBar.y0 V;
    public org.telegram.ui.Components.bs V0;
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
    public org.telegram.ui.Components.j71 b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public e91 d;
    public NumberTextView d0;
    public View d1;
    public k0 e;
    public org.telegram.ui.ActionBar.q0 e0;
    public boolean e1;
    public org.telegram.ui.Components.zn f;
    public org.telegram.ui.ActionBar.q0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.q0 g0;
    public int g1;
    public org.telegram.ui.Components.a10 h;
    public org.telegram.ui.ActionBar.q0 h0;
    public int h1;
    public org.telegram.ui.ActionBar.q0 i0;
    public final dh.g i1;
    public org.telegram.ui.ActionBar.q0 j0;
    public final ui.f j1;
    public org.telegram.ui.ActionBar.y0 k0;
    public final ui.f k1;
    public org.telegram.ui.ActionBar.y0 l0;
    public final ui.c l1;
    public org.telegram.ui.ActionBar.y0 m0;
    public final dh.c m1;
    public s81 n;
    public org.telegram.ui.ActionBar.q0 n0;
    public dh.k n1;
    public RadialProgressView o0;
    public final ArrayList o1;
    public gh0 p0;
    public final RectF p1;
    public org.telegram.ui.ActionBar.q0 q0;
    public final RectF q1;
    public final n91 r;
    public org.telegram.ui.ActionBar.q0 r0;
    public int r1;
    public final org.telegram.messenger.d00 s;
    public s91 s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public x91 w;
    public final boolean w0;
    public iv x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public w91(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new n91(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new h2.f(new int[]{org.telegram.messenger.ks.t5});
        this.T0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.o1 = arrayList;
        RectF rectF = new RectF();
        this.p1 = rectF;
        RectF rectF2 = new RectF();
        this.q1 = rectF2;
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
        this.s = getMessagesController().t7;
        this.W0 = !org.telegram.messenger.f3.w("topics_end_reached_", r1, getUserConfig().k(), false);
        ui.c cVar = new ui.c();
        this.l1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.i1 = null;
            this.j1 = null;
            this.k1 = null;
            this.m1 = new dh.c(cVar, cVar, cVar);
            return;
        }
        this.i1 = new dh.g(false);
        this.j1 = new ui.f(null);
        ui.f fVar = new ui.f(null);
        this.k1 = fVar;
        dh.c cVar2 = new dh.c(fVar, fVar, fVar);
        this.m1 = cVar2;
        cVar2.k = true;
    }

    public static org.telegram.ui.ActionBar.g2 I0(org.telegram.messenger.mp mpVar, org.telegram.messenger.tr trVar, Bundle bundle) {
        long j3 = bundle.getLong("chat_id");
        if (j3 != 0) {
            TLRPC.Dialog U0 = mpVar.U0(-j3);
            if (U0 != null && U0.view_forum_as_messages) {
                return new bn(bundle);
            }
            TLRPC.ChatFull P0 = mpVar.P0(j3);
            if (P0 == null) {
                P0 = trVar.F0(j3, true, new CountDownLatch(1), false, false, 0);
            }
            if (P0 != null && P0.view_forum_as_messages) {
                return new bn(bundle);
            }
        }
        return new w91(bundle);
    }

    public static org.telegram.ui.ActionBar.g2 J0(LaunchActivity launchActivity, Bundle bundle) {
        return I0(org.telegram.messenger.mp.u1(launchActivity.P), org.telegram.messenger.tr.a0(launchActivity.P), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.w91) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M0(bn bnVar) {
        if (bnVar.getParentLayout() == null) {
            return;
        }
        if (bnVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) bnVar.getParentLayout().getFragmentStack().get(bnVar.getParentLayout().getFragmentStack().size() - 2);
            if (g2Var instanceof w91) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -bnVar.a());
        ((ActionBarLayout) bnVar.getParentLayout()).c(bnVar.getParentLayout().getFragmentStack().size() - 1, new w91(bundle));
        bnVar.Ga = true;
        bnVar.finishFragment();
    }

    public static boolean Z(w91 w91Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        org.telegram.messenger.mp.u1(w91Var.currentAccount).g7.edit().putLong("dialog_join_requested_time_" + (-w91Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = w91Var.getParentActivity();
        boolean V = org.telegram.messenger.v3.V(w91Var.g());
        int i7 = org.telegram.ui.Components.o70.u1;
        org.telegram.ui.Components.o70.K0(parentActivity, w91Var, org.telegram.ui.Components.kc.b0(w91Var), V);
        w91Var.S0(true);
        return false;
    }

    public static void a0(w91 w91Var, View view) {
        long j3 = w91Var.a;
        if (w91Var.getParentLayout() == null || ((ActionBarLayout) w91Var.getParentLayout()).y() || !(view instanceof t91)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((t91) view).O;
        long j10 = -j3;
        long o4 = tL_forumTopic == null ? 0L : w91Var.getMessagesController().E2(j10) ? org.telegram.messenger.n5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (w91Var.u0) {
            x91 x91Var = w91Var.w;
            if (x91Var != null) {
                z91 z91Var = x91Var.a;
                Bundle bundle = new Bundle();
                ca1 ca1Var = z91Var.a;
                bundle.putLong("dialog_id", ca1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                hx0 hx0Var = new hx0(bundle, null);
                hx0Var.s = new yi0(24, z91Var, tL_forumTopic);
                ca1Var.presentFragment(hx0Var);
            }
            bx bxVar = w91Var.M0;
            if (bxVar != null) {
                bxVar.a4(j10, o4, true, w91Var);
                return;
            }
            return;
        }
        if (w91Var.b0.size() > 0) {
            w91Var.R0(view);
            return;
        }
        if (w91Var.inPreviewMode && org.telegram.messenger.g0.Q1()) {
            for (org.telegram.ui.ActionBar.g2 g2Var : w91Var.getParentLayout().getFragmentStack()) {
                if (g2Var instanceof bx) {
                    bx bxVar2 = (bx) g2Var;
                    if (bxVar2.x4()) {
                        org.telegram.messenger.sr srVar = bxVar2.r2;
                        if (srVar.a == j10 && srVar.b == o4) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            w91Var.R0 = o4;
            w91Var.Z0(false, false);
        }
        qg.c.n(w91Var, j3, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean b0(w91 w91Var, View view, float f10) {
        if (w91Var.u0 || w91Var.getParentLayout() == null || ((ActionBarLayout) w91Var.getParentLayout()).y()) {
            return false;
        }
        if (!w91Var.actionBar.x() && !org.telegram.messenger.g0.Q1() && (view instanceof t91)) {
            t91 t91Var = (t91) view;
            if (t91Var.b0(f10)) {
                w91Var.Q0(t91Var);
                w91Var.O.I0(true);
                w91Var.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
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

    public static void f0(w91 w91Var, boolean z10) {
        wv wvVar;
        w91Var.t0 = z10;
        ValueAnimator valueAnimator = w91Var.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            w91Var.Z0.cancel();
        }
        int i7 = 0;
        if (w91Var.b1 == null) {
            org.telegram.ui.Components.j71 k10 = w91Var.s0.k(8, false);
            w91Var.b1 = k10;
            if (w91Var.N0 != null) {
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, k10, w91Var.getResourceProvider());
            }
            w91Var.e.addView(w91Var.b1, c8.na.c(44.0f, -1));
        }
        w91Var.Z0 = ValueAnimator.ofFloat(w91Var.X, z10 ? 1.0f : 0.0f);
        org.telegram.messenger.g0.X3(w91Var.s0, false, 1.0f, true, true);
        bx bxVar = w91Var.N0;
        if (bxVar != null && (wvVar = bxVar.H3) != null) {
            wvVar.N = !z10;
        }
        w91Var.a1 = !z10 && w91Var.s0.getVisibility() == 0 && w91Var.s0.getAlpha() == 1.0f;
        w91Var.Z0.addUpdateListener(new hz0(w91Var, 13));
        w91Var.s0.setVisibility(0);
        if (z10) {
            org.telegram.messenger.g0.Z2(w91Var.getParentActivity(), w91Var.classGuid);
            w91Var.U0(false);
        } else {
            w91Var.r0.setVisibility(0);
        }
        w91Var.Z0.addListener(new g91(w91Var, z10, i7));
        w91Var.Z0.setDuration(200L);
        w91Var.Z0.setInterpolator(org.telegram.ui.Components.kr.f);
        w91Var.Z0.start();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, Boolean.TRUE);
    }

    @Override // org.telegram.ui.ke0
    public final ui.f B() {
        return this.k1;
    }

    public final void B0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.i1) == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(48.0f);
        int L2 = org.telegram.messenger.g0.L(48.0f) + ((int) this.V0.d(org.telegram.messenger.g0.L(14.0f)));
        bx bxVar = this.N0;
        View view = bxVar != null ? bxVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = bxVar != null ? bxVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.h1) - org.telegram.messenger.g0.L(8.0f);
        int L3 = measuredHeight - org.telegram.messenger.g0.L(56.0f);
        this.p1.set(0.0f, -L, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + L + L2);
        RectF rectF = this.q1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, org.telegram.messenger.pc.e(262144) ? 0.0f : -org.telegram.messenger.g0.L(48.0f));
        gVar.g(this.N0 != null ? 2 : 1, this.o1);
        gVar.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void C0() {
        z81 z81Var;
        org.telegram.messenger.d00 d00Var = this.s;
        long j3 = this.a;
        if (d00Var.e(j3) || (z81Var = this.G) == null) {
            return;
        }
        int N0 = z81Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.b() - 5) {
            d00Var.o(j3);
        }
        E0();
    }

    @Override // org.telegram.ui.Components.ah
    public final org.telegram.ui.Components.cu0 D() {
        return this.d;
    }

    public final void D0(boolean z10) {
        String str;
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        TLRPC.ChatFull P0 = getMessagesController().P0(j3);
        if (this.I0 != null && ((str = this.z0) != null || this.A0)) {
            org.telegram.ui.Components.voip.c2.l(O0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else {
            if (this.z0 == null || !z10 || P0 == null || P0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.f3.n(null, 2131748720, org.telegram.ui.Components.kc.b0(this), R.raw.linkbroken, 36);
            this.z0 = null;
        }
    }

    public final void E0() {
        org.telegram.messenger.d00 d00Var = this.s;
        a0.h hVar = d00Var.a;
        LongSparseIntArray longSparseIntArray = d00Var.c;
        long j3 = this.a;
        this.K0 = longSparseIntArray.get(j3, 0) == 1 && (hVar.f(j3) == null || ((ArrayList) hVar.f(j3)).isEmpty());
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((o91) arrayList.get(0)).c != null && ((o91) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        i91 i91Var = this.O;
        if (i91Var != null) {
            i91Var.K0(i91Var.w1());
        }
        U0(true);
    }

    public final void F0() {
        bx bxVar = this.N0;
        if (bxVar != null) {
            int L = org.telegram.messenger.g0.L(14.0f);
            org.telegram.ui.Components.bs bsVar = bxVar.L1;
            float d = (bsVar != null ? bsVar.d(L) : 0.0f) + 0.0f;
            org.telegram.ui.Components.bs bsVar2 = this.V0;
            if (bsVar2 != null) {
                float L2 = org.telegram.messenger.g0.L(7.0f);
                org.telegram.ui.Components.bs bsVar3 = this.N0.L1;
                bsVar2.setTranslationY(d - ((bsVar3 != null ? bsVar3.getMetadata().c.a : 0.0f) * L2));
                org.telegram.ui.Components.bs bsVar4 = this.V0;
                int L3 = org.telegram.messenger.g0.L(14.0f);
                int L4 = org.telegram.messenger.g0.L(7.0f);
                r2 = bsVar4.d(org.telegram.messenger.g0.W1(this.N0.L1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + d;
            } else {
                r2 = d;
            }
        } else {
            org.telegram.ui.Components.bs bsVar5 = this.V0;
            if (bsVar5 != null) {
                r2 = 0.0f + bsVar5.d(org.telegram.messenger.g0.L(14.0f));
            }
        }
        this.O.setPadding(0, (int) r2, 0, this.h1 + this.f1 + (this.W ? org.telegram.messenger.g0.L(51.0f) : 0));
    }

    public final void G0() {
        this.b0.clear();
        this.actionBar.w();
        org.telegram.messenger.g0.Z3(this.O);
        V0();
    }

    public final void H0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String K0 = org.telegram.messenger.gd.K0(hashSet.size(), "DeleteTopics");
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = K0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131751486, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            t1Var.U = org.telegram.messenger.gd.N0(2131751485, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new a1.d(this, hashSet, arrayList, runnable, 22));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new l60(17));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ boolean J() {
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
        profileActivity.d5(this.K);
        profileActivity.j5((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().K() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ long M() {
        return 0L;
    }

    public final void N0(int i7) {
        if (this.N != i7) {
            this.N = i7;
            this.M.setTextColorKey(i7 == 0 ? org.telegram.ui.ActionBar.n6.sf : org.telegram.ui.ActionBar.n6.q7);
            this.X0.setVisibility(i7 == 1 ? 0 : 8);
            S0(false);
        }
    }

    public final void O0(boolean z10) {
        if (org.telegram.messenger.bz.o() == 0) {
            return;
        }
        e91 e91Var = this.d;
        if (e91Var != null) {
            if (z10) {
                e91Var.setLayerType(2, null);
                e91Var.setClipChildren(false);
                e91Var.setClipToPadding(false);
            } else {
                e91Var.setLayerType(0, null);
                e91Var.setClipChildren(true);
                e91Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f10) {
        if (org.telegram.messenger.bz.o() == 0) {
            return;
        }
        this.T0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        i91 i91Var = this.O;
        if (i91Var != null) {
            float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.T0, 0.05f, 1.0f);
            i91Var.setPivotX(0.0f);
            i91Var.setPivotY(0.0f);
            i91Var.setScaleX(t6);
            i91Var.setScaleY(t6);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(t6);
            this.actionBar.setScaleY(t6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void Q0(org.telegram.ui.Cells.u2 u2Var) {
        boolean z10;
        try {
            u2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = u2Var.O;
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new d91(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(ooVar.f);
        ooVar.o = 1;
        long j3 = this.a;
        long j10 = -j3;
        ooVar.e(j10, tL_forumTopic.id, null);
        if (org.telegram.messenger.v3.y(15, g())) {
            org.telegram.ui.ActionBar.y0 y0Var = new org.telegram.ui.ActionBar.y0(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                y0Var.j(org.telegram.messenger.gd.N0(2131751440, null), R.drawable.msg_unpin, null);
            } else {
                y0Var.j(org.telegram.messenger.gd.N0(2131751441, null), R.drawable.msg_pin, null);
            }
            y0Var.setMinimumWidth(org.telegram.messenger.ks.q2);
            z10 = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            y0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (objArr) {
                        case 0:
                            w91 w91Var = this.b;
                            w91Var.D0 = true;
                            w91Var.O0 = true;
                            w91Var.s.t(w91Var.a, tL_forumTopic.id, !r0.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.O0 = true;
                            org.telegram.messenger.d00 d00Var = w91Var2.s;
                            long j11 = w91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            d00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            w91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            w91 w91Var3 = this.b;
                            w91Var3.H0(hashSet, new w81(w91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(y0Var);
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.y0 y0Var2 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z10, z10);
        if (getMessagesController().u2(j10, tL_forumTopic.id, null)) {
            y0Var2.j(org.telegram.messenger.gd.N0(2131743602, null), R.drawable.msg_mute, null);
        } else {
            y0Var2.j(org.telegram.messenger.gd.N0(2131748121, null), R.drawable.msg_unmute, null);
        }
        y0Var2.setMinimumWidth(org.telegram.messenger.ks.q2);
        y0Var2.setOnClickListener(new fi.k5(this, tL_forumTopic, (Serializable) r32, b10, 8));
        boolean z11 = false;
        r32[0].addView(y0Var2);
        if (org.telegram.messenger.v3.i(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var3 = new org.telegram.ui.ActionBar.y0(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                y0Var3.j(org.telegram.messenger.gd.N0(2131745888, null), R.drawable.msg_topic_restart, null);
            } else {
                y0Var3.j(org.telegram.messenger.gd.N0(2131752027, null), R.drawable.msg_topic_close, null);
            }
            y0Var3.setMinimumWidth(org.telegram.messenger.ks.q2);
            final int i7 = 1;
            y0Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            w91 w91Var = this.b;
                            w91Var.D0 = true;
                            w91Var.O0 = true;
                            w91Var.s.t(w91Var.a, tL_forumTopic.id, !r0.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.O0 = true;
                            org.telegram.messenger.d00 d00Var = w91Var2.s;
                            long j11 = w91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            d00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            w91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            w91 w91Var3 = this.b;
                            w91Var3.H0(hashSet, new w81(w91Var3, 3));
                            break;
                    }
                }
            });
            z11 = false;
            r32[0].addView(y0Var3);
        }
        if (org.telegram.messenger.v3.e(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.y0 y0Var4 = new org.telegram.ui.ActionBar.y0(getParentActivity(), z11, true);
            y0Var4.j(org.telegram.messenger.gd.K0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            y0Var4.c(org.telegram.ui.ActionBar.n6.q7, org.telegram.ui.ActionBar.n6.p7);
            y0Var4.setMinimumWidth(org.telegram.messenger.ks.q2);
            final int i10 = 2;
            y0Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            w91 w91Var = this.b;
                            w91Var.D0 = true;
                            w91Var.O0 = true;
                            w91Var.s.t(w91Var.a, tL_forumTopic.id, !r0.pinned, w91Var);
                            w91Var.finishPreviewFragment();
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.O0 = true;
                            org.telegram.messenger.d00 d00Var = w91Var2.s;
                            long j11 = w91Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            d00Var.z(tL_forumTopic2.id, j11, true ^ tL_forumTopic2.closed);
                            w91Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            w91 w91Var3 = this.b;
                            w91Var3.H0(hashSet, new w81(w91Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(y0Var4);
        }
        boolean E2 = getMessagesController().E2(j10);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / org.telegram.messenger.ks.K2));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, c8.na.c(-1.0f, -1));
        }
        bn bnVar = new bn(a8.p0.j(j3, "chat_id"));
        qg.c.a(bnVar, org.telegram.messenger.sr.a(j10, E2 ? org.telegram.messenger.n5.o(u2Var.O.from_id) : u2Var.O.id));
        presentFragmentAsPreviewWithMenu(bnVar, r32[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(View view) {
        t91 t91Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.messenger.d00 d00Var;
        int i7;
        boolean z10;
        boolean z11;
        if (!(view instanceof t91) || (tL_forumTopic = (t91Var = (t91) view).O) == null) {
            return;
        }
        int i10 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.b0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        t91Var.e0(hashSet.contains(Integer.valueOf(i10)), true);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
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
            this.d0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.y8));
            p10.addView(this.d0, c8.na.m(1.0f, 0, -1, 72, 0, 0));
            this.d0.setOnTouchListener(new mk0(2));
            this.e0 = p10.g(4, R.drawable.msg_pin, org.telegram.messenger.g0.L(54.0f));
            this.f0 = p10.g(5, R.drawable.msg_unpin, org.telegram.messenger.g0.L(54.0f));
            this.g0 = p10.g(6, R.drawable.msg_mute, org.telegram.messenger.g0.L(54.0f));
            this.h0 = p10.h(7, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131751586, null));
            org.telegram.ui.ActionBar.q0 h = p10.h(12, R.drawable.msg_archive_hide, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131749132, null));
            this.i0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.q0 h7 = p10.h(13, R.drawable.msg_archive_show, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131745157, null));
            this.j0 = h7;
            h7.setVisibility(8);
            org.telegram.ui.ActionBar.q0 h10 = p10.h(0, R.drawable.ic_ab_other, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131754838, null));
            this.n0 = h10;
            this.k0 = h10.e(8, R.drawable.msg_markread, org.telegram.messenger.gd.N0(2131748488, null));
            this.l0 = this.n0.e(9, R.drawable.msg_topic_close, org.telegram.messenger.gd.N0(2131752027, null));
            this.m0 = this.n0.e(10, R.drawable.msg_topic_restart, org.telegram.messenger.gd.N0(2131745888, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.R(null, null);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.u4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        int i13 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            d00Var = this.s;
            if (!hasNext) {
                break;
            }
            boolean z13 = z12;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f10 = d00Var.f(j3, intValue);
            if (f10 != null) {
                if (f10.unread_count != 0) {
                    i11++;
                }
                if (org.telegram.messenger.v3.y(15, O0) && !f10.hidden) {
                    if (f10.pinned) {
                        i13++;
                    } else {
                        z11 = (z13 ? 1 : 0) + 1;
                        int i14 = i12;
                        i12 = !getMessagesController().u2(-j3, intValue, null) ? i14 + 1 : i14;
                        z12 = z11;
                    }
                }
            }
            z11 = z13 ? 1 : 0;
            int i142 = i12;
            if (!getMessagesController().u2(-j3, intValue, null)) {
            }
            z12 = z11;
        }
        int i15 = i12;
        boolean z14 = z12;
        if (i11 > 0) {
            this.k0.setVisibility(0);
            this.k0.j(org.telegram.messenger.gd.N0(2131748488, null), R.drawable.msg_markread, null);
            i7 = 8;
        } else {
            i7 = 8;
            this.k0.setVisibility(8);
        }
        if (i15 != 0) {
            this.C0 = false;
            this.g0.setIcon(R.drawable.msg_unmute);
            this.g0.setContentDescription(org.telegram.messenger.gd.N0(2131752153, null));
            z10 = true;
        } else {
            z10 = true;
            this.C0 = true;
            this.g0.setIcon(R.drawable.msg_mute);
            this.g0.setContentDescription(org.telegram.messenger.gd.N0(2131752163, null));
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
            TLRPC.TL_forumTopic f11 = d00Var.f(j3, ((Integer) it2.next()).intValue());
            if (f11 != null) {
                if (org.telegram.messenger.v3.e(this.currentAccount, O0, f11)) {
                    i18++;
                }
                if (org.telegram.messenger.v3.i(this.currentAccount, O0, f11)) {
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
        this.l0.setText(org.telegram.messenger.gd.N0(i17 > 1 ? 2131752026 : 2131752027, null));
        this.m0.setVisibility((i17 != 0 || i16 <= 0) ? 8 : 0);
        this.m0.setText(i16 > 1 ? org.telegram.messenger.gd.N0(2131745887, null) : org.telegram.messenger.gd.N0(2131745888, null));
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
    /* JADX WARN: Type inference failed for: r12v1, types: [android.animation.Animator$AnimatorListener, java.lang.String, org.telegram.ui.o80] */
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
        String N0;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        long j10 = -j3;
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j10));
        if (org.telegram.messenger.n10.v(c22)) {
            this.f.setUserAvatar(c22);
        } else if (org.telegram.messenger.v3.p0(O0)) {
            TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
            if (O02 != null) {
                this.f.setChatAvatar(O02);
            }
        } else {
            this.f.setChatAvatar(O0);
        }
        SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(this.currentAccount).g7;
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j10);
        boolean z14 = sharedPreferences.getInt(sb2.toString(), 0) == 2;
        boolean w10 = org.telegram.messenger.f3.w("dialog_bar_report", j10, sharedPreferences, false);
        boolean w11 = org.telegram.messenger.f3.w("dialog_bar_block", j10, sharedPreferences, false);
        boolean z15 = this.u0;
        if (z15) {
            r12 = 0;
            if (this.x0) {
                this.f.setTitle(org.telegram.messenger.gd.N0(2131746056, null));
            } else if (this.w0) {
                this.f.setTitle(org.telegram.messenger.gd.N0(2131746233, null));
            } else if (this.y0) {
                this.f.setTitle(org.telegram.messenger.gd.N0(2131752965, null));
            } else if (this.v0) {
                this.f.setTitle(org.telegram.messenger.gd.N0(2131750558, null));
            } else {
                this.f.setTitle(org.telegram.messenger.gd.N0(2131745453, null));
            }
            this.q0.setVisibility(8);
            org.telegram.ui.Components.zn znVar = this.f;
            if (znVar != null && znVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(this.q0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (O0 != null) {
                this.f.setTitle(O0.title);
                str = null;
                this.f.j(null, getMessagesController().u2(j10, 0L, null) ? getThemedDrawable("drawableMuteIcon") : null);
            } else {
                str = null;
            }
            TLRPC.ChatFull P0 = getMessagesController().P0(j3);
            if (P0 != null && (chatFull2 = this.K) != null && (chatParticipants = chatFull2.participants) != null) {
                P0.participants = chatParticipants;
            }
            this.K = P0;
            if (P0 != null) {
                int i7 = P0.participants_count;
                if (i7 <= 0) {
                    TLRPC.Chat O03 = getMessagesController().O0(Long.valueOf(j3));
                    N0 = O03 == null ? org.telegram.messenger.gd.N0(2131748586, str) : org.telegram.messenger.v3.t0(O03) ? org.telegram.messenger.gd.N0(2131748445, str).toLowerCase() : org.telegram.messenger.gd.N0(2131748448, str).toLowerCase();
                } else {
                    N0 = org.telegram.messenger.gd.G(i7, "Members", new Object[0]);
                }
            } else {
                N0 = org.telegram.messenger.gd.N0(2131748586, str);
            }
            this.f.setSubtitle(N0);
            r12 = str;
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j11 = org.telegram.messenger.mp.u1(this.currentAccount).g7.getLong(a8.p0.o(j10, "dialog_join_requested_time_"), -1L);
        if (O0 == null || !org.telegram.messenger.v3.r0(O0) || j11 <= 0 || System.currentTimeMillis() - j11 >= 120000) {
            if (O0 != null && !z15) {
                if (!org.telegram.messenger.v3.r0(O0)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(O0.id))) {
                    z13 = true;
                    z12 = true;
                } else {
                    if (O0.join_request) {
                        this.M.setText(org.telegram.messenger.gd.N0(2131752383, r12));
                    } else {
                        this.M.setText(org.telegram.messenger.gd.N0(2131752385, r12));
                    }
                    z12 = true;
                    this.M.setClickable(true);
                    this.M.setEnabled(true);
                    z13 = false;
                }
                org.telegram.messenger.g0.X3(this.o0, z13, 0.5f, z12, z16);
                org.telegram.messenger.g0.X3(this.M, z13 ^ z12, 0.5f, z12, z16);
                N0(0);
            }
            if (!z14 || (!w11 && !w10)) {
                z11 = false;
                if (this.W != z11) {
                    this.W = z11;
                    this.p0.animate().setListener(r12).cancel();
                    if (z16) {
                        this.p0.animate().translationY(z11 ? 0.0f : org.telegram.messenger.g0.L(53.0f)).setListener(new g91(this, z11, 1));
                    } else {
                        this.p0.setVisibility(z11 ? 0 : 8);
                        this.p0.setTranslationY(z11 ? 0.0f : org.telegram.messenger.g0.L(53.0f));
                    }
                }
                F0();
                this.r0.setVisibility(!z15 ? 8 : 0);
                this.S.setVisibility(!org.telegram.messenger.v3.w(3, O0) ? 0 : 8);
                this.U.setVisibility((org.telegram.messenger.v3.R(O0) || (!getUserConfig().q() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.v3.N(O0)))) ? 8 : 0);
                this.T.setVisibility((O0 != null || O0.creator || org.telegram.messenger.v3.r0(O0)) ? 8 : 0);
                this.V.setVisibility((O0 != null || O0.creator || org.telegram.messenger.v3.N(O0)) ? 8 : 0);
                U0(true);
                this.I0 = getMessagesController().i1(j3, true, r12);
                D0(false);
            }
            this.M.setText(org.telegram.messenger.gd.N0(2131746007, r12));
            this.M.setClickable(true);
            this.M.setEnabled(true);
            org.telegram.messenger.g0.X3(this.o0, false, 0.5f, true, false);
            org.telegram.messenger.g0.X3(this.M, true, 0.5f, true, false);
            N0(1);
        } else {
            this.M.a(org.telegram.messenger.gd.N0(2131752381, r12), z16);
            this.M.setEnabled(false);
            org.telegram.messenger.g0.X3(this.o0, false, 0.5f, true, z16);
            org.telegram.messenger.g0.X3(this.M, true, 0.5f, true, z16);
            N0(0);
        }
        z11 = true;
        if (this.W != z11) {
        }
        F0();
        this.r0.setVisibility(!z15 ? 8 : 0);
        this.S.setVisibility(!org.telegram.messenger.v3.w(3, O0) ? 0 : 8);
        this.U.setVisibility((org.telegram.messenger.v3.R(O0) || (!getUserConfig().q() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !org.telegram.messenger.v3.N(O0)))) ? 8 : 0);
        this.T.setVisibility((O0 != null || O0.creator || org.telegram.messenger.v3.r0(O0)) ? 8 : 0);
        this.V.setVisibility((O0 != null || O0.creator || org.telegram.messenger.v3.N(O0)) ? 8 : 0);
        U0(true);
        this.I0 = getMessagesController().i1(j3, true, r12);
        D0(false);
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.n6.sf));
        this.h.updateColors();
        gh0 gh0Var = this.p0;
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        gh0Var.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setActionModeColor(getThemedColor(i7));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.s8));
        }
        this.s0.setBackgroundColor(getThemedColor(i7));
    }

    public final void U0(boolean z10) {
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.a;
        boolean z11 = (org.telegram.messenger.v3.r0(getMessagesController().O0(Long.valueOf(j3))) || !org.telegram.messenger.v3.w(15, messagesController.O0(Long.valueOf(j3))) || this.t0 || this.u0 || this.K0) ? false : true;
        this.L = z11;
        this.R.setVisibility(z11 ? 0 : 8);
        K0(!this.L, z10);
    }

    public final void V0() {
        boolean z10 = org.telegram.messenger.v3.y(15, g()) && !this.b0.isEmpty();
        if (this.c0 != z10) {
            this.c0 = z10;
            n91 n91Var = this.r;
            n91Var.k(0, n91Var.b());
        }
    }

    public final void W0(float f10) {
        this.X = f10;
        X0();
        this.c1 = true;
        float f11 = 1.0f - f10;
        this.f.getTitleTextView().setAlpha(f11);
        this.f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.j71 j71Var = this.b1;
        if (j71Var != null) {
            j71Var.setTranslationY((-org.telegram.messenger.g0.L(16.0f)) * f11);
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

    @Override // org.telegram.ui.ActionBar.g2, org.telegram.ui.ke0
    public final /* synthetic */ boolean X(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void X0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i7 = org.telegram.ui.ActionBar.n6.y8;
        kVar.F(i0.a.f(this.X, themedColor, getThemedColor(i7)), false);
        this.actionBar.F(i0.a.f(this.X, getThemedColor(i7), getThemedColor(i7)), true);
        this.actionBar.E(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.n6.t8), getThemedColor(org.telegram.ui.ActionBar.n6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.a.f(this.X, getThemedColor(org.telegram.ui.ActionBar.n6.s8), getThemedColor(org.telegram.ui.ActionBar.n6.d6)));
    }

    public final void Y0() {
        fi.w4 w4Var = this.E0;
        if (w4Var == null || w4Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(R.drawable.ic_ab_other, 0);
        kqVar.c(org.telegram.messenger.g0.L(16.0f));
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        if (org.telegram.messenger.v3.y(15, g())) {
            this.E0.e.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747943, null)), spannableStringBuilder, "%s"));
            return;
        }
        String N0 = org.telegram.messenger.gd.N0(2131750457, null);
        TLRPC.TL_forumTopic f10 = getMessagesController().t7.f(this.a, 1L);
        if (f10 != null) {
            N0 = f10.title;
        }
        this.E0.e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("NoTopicsDescriptionUser", null, 2131747942, N0)));
    }

    public final void Z0(boolean z10, boolean z11) {
        z81 z81Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.O0) {
            z10 = true;
        }
        this.O0 = false;
        org.telegram.messenger.d00 d00Var = this.s;
        long j3 = this.a;
        ArrayList l10 = d00Var.l(j3);
        if (l10 != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (org.telegram.messenger.n10.v(org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(-j3))) && this.v0) {
                arrayList.add(new o91(3, null));
            }
            for (int i7 = 0; i7 < l10.size(); i7++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l10.get(i7)).id))) {
                    arrayList.add(new o91(0, (TLRPC.TL_forumTopic) l10.get(i7)));
                }
            }
            if (!arrayList.isEmpty() && !d00Var.e(j3) && this.W0) {
                arrayList.add(new o91(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.L0.b(size + 4);
                z10 = false;
            }
            this.y = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o91 o91Var = (o91) arrayList.get(i10);
                if (o91Var != null && (tL_forumTopic = o91Var.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            i91 i91Var = this.O;
            if (i91Var != null) {
                if (i91Var.getItemAnimator() != (z10 ? this.J0 : null)) {
                    this.O.setItemAnimator(z10 ? this.J0 : null);
                }
            }
            n91 n91Var = this.r;
            if (n91Var != null) {
                n91Var.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (z81Var = this.G) != null) {
                z81Var.h1(0, 0);
                this.D0 = false;
            }
        }
        E0();
        Y0();
    }

    @Override // org.telegram.ui.Components.ah, org.telegram.ui.Components.m40
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        bx bxVar = this.N0;
        final int i7 = 0;
        this.f1 = (bxVar == null || !bxVar.X) ? 0 : org.telegram.messenger.g0.L(72.0f);
        bx bxVar2 = this.N0;
        this.g1 = (bxVar2 == null || !bxVar2.X) ? 0 : org.telegram.messenger.g0.L(64.0f);
        e91 e91Var = new e91(this, context);
        this.d = e91Var;
        this.fragmentView = e91Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, e91Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i10 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((r4Var2 = this.parentLayout) != null && ((ActionBarLayout) r4Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setActionBarMenuOnItemClick(new h91(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var;
                switch (i7) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.t0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().k2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        bx bxVar3 = this.b.N0;
                        if (bxVar3 != null && (q0Var = bxVar3.k0) != null) {
                            q0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(u81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        final int i11 = 3;
        if (this.N0 != null) {
            org.telegram.ui.ActionBar.q0 a10 = s5.a(0, R.drawable.outline_header_search);
            this.q0 = a10;
            a10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v81
                public final /* synthetic */ w91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.q0 q0Var;
                    switch (i11) {
                        case 0:
                            w91 w91Var = this.b;
                            if (!w91Var.t0) {
                                w91Var.L0(false);
                                break;
                            }
                            break;
                        case 1:
                            w91 w91Var2 = this.b;
                            w91Var2.getMessagesController().k2(-w91Var2.a, null, w91Var2.g());
                            w91Var2.S0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            bx bxVar3 = this.b.N0;
                            if (bxVar3 != null && (q0Var = bxVar3.k0) != null) {
                                q0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            w91 w91Var3 = this.b;
                            w91Var3.presentFragment(u81.f0(w91Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.q0 a11 = s5.a(0, R.drawable.outline_header_search);
            this.q0 = a11;
            a11.O();
            a11.K(new bi.x1(this, 23));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            org.telegram.ui.ActionBar.u6.U(searchField, org.telegram.ui.ActionBar.n6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Jj, getResourceProvider());
            org.telegram.ui.ActionBar.u6.v(searchField, org.telegram.ui.ActionBar.n6.Ne, getResourceProvider());
        }
        org.telegram.ui.ActionBar.q0 c10 = s5.c(0, R.drawable.ic_ab_other, null);
        this.r0 = c10;
        c10.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        this.r0.e(1, R.drawable.msg_discussion, org.telegram.messenger.gd.N0(2131743757, null));
        final int i12 = 2;
        this.S = this.r0.e(2, R.drawable.msg_addcontact, org.telegram.messenger.gd.N0(2131754398, null));
        org.telegram.ui.ActionBar.q0 q0Var = this.r0;
        this.U = q0Var.d(14, 0, new org.telegram.ui.Components.nh0(R.raw.boosts, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f)), org.telegram.messenger.gd.N0(2131753582, null), true, false, q0Var.n0);
        this.R = this.r0.e(3, R.drawable.msg_topic_create, org.telegram.messenger.gd.N0(2131751690, null));
        this.V = this.r0.e(15, R.drawable.msg_report, org.telegram.messenger.gd.N0(2131746034, null));
        this.T = this.r0.d(11, R.drawable.msg_leave, null, org.telegram.messenger.gd.N0(2131748797, null), true, false, null);
        org.telegram.ui.Components.zn znVar = new org.telegram.ui.Components.zn(context, this, false, this.resourceProvider);
        this.f = znVar;
        znVar.getAvatarImageView().setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        this.f.setOccupyStatusBar((!org.telegram.messenger.g0.Q1() || ((r4Var = this.parentLayout) != null && ((ActionBarLayout) r4Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.zn znVar2 = this.f;
        long j3 = -this.a;
        znVar2.b = j3 < 0;
        znVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, c8.na.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        int i13 = 4;
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new b8(this, i13));
        }
        this.O = new i91(this, context);
        jh.k kVar = new jh.k(this.d);
        ViewGroup viewGroup = this.d;
        dh.c cVar = this.m1;
        cVar.h = kVar;
        cVar.i = viewGroup;
        i91 i91Var = this.O;
        bx bxVar3 = this.N0;
        if (bxVar3 != null) {
            viewGroup = (ViewGroup) bxVar3.getFragmentView();
        }
        i91 i91Var2 = this.O;
        Objects.requireNonNull(i91Var2);
        this.n1 = new dh.k(i91Var, viewGroup, new p40(i91Var2, 2));
        this.O.D0(new w81(this, 5));
        SpannableString spannableString = new SpannableString("#");
        qg.b d = qg.c.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        iv ivVar = new iv(this, org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131754718, null), spannableString, "#"), org.telegram.messenger.g0.K2(org.telegram.messenger.gd.N0(2131754720, null), spannableString, "#"));
        this.x = ivVar;
        ivVar.b();
        int i14 = this.F ? 2 : 0;
        this.E = i14;
        this.x.X = i14 != 0;
        k91 k91Var = new k91(this);
        this.O.setHideIfEmpty(false);
        k91Var.m = false;
        k91Var.C = false;
        i91 i91Var3 = this.O;
        this.J0 = k91Var;
        i91Var3.setItemAnimator(k91Var);
        this.O.setOnScrollListener(new l91(this, i7));
        i91 i91Var4 = this.O;
        i91Var4.X1 = true;
        i91Var4.Y1 = 0;
        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(i91Var4, true);
        this.L0 = hj0Var;
        this.O.setItemsEnterAnimator(hj0Var);
        this.O.setOnItemClickListener(new xx0(this, 9));
        this.O.setOnItemLongClickListener(new x81(this));
        this.O.setOnScrollListener(new l91(this, i10));
        i91 i91Var5 = this.O;
        z81 z81Var = new z81(this);
        this.G = z81Var;
        i91Var5.setLayoutManager(z81Var);
        new SparseArray();
        new HashMap();
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new a91(this));
        v91 v91Var = new v91(this);
        this.Q = v91Var;
        b91 b91Var = new b91(this, v91Var);
        this.P = b91Var;
        b91Var.h(this.O);
        this.d.addView(this.O, c8.na.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -org.telegram.messenger.g0.L(100.0f);
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(getParentActivity(), this.resourceProvider, false);
        this.h = a10Var;
        this.d.addView(a10Var, org.telegram.ui.Components.a10.b());
        final int i15 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i15) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.t0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().k2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        bx bxVar32 = this.b.N0;
                        if (bxVar32 != null && (q0Var2 = bxVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(u81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
        this.h.setContentDescription(org.telegram.messenger.gd.N0(2131751690, null));
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(context, null);
        vzVar.setViewType(24);
        vzVar.setVisibility(8);
        vzVar.x = true;
        s81 s81Var = new s81(context, i10);
        TextView textView = new TextView(context);
        s81Var.d = textView;
        if (org.telegram.messenger.gd.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(2131744014, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.N0(2131744014, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.kq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.y6, getResourceProvider());
        boolean z10 = org.telegram.messenger.gd.a0;
        s81Var.addView(textView, c8.na.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = s81Var;
        textView.setAlpha(0.0f);
        fi.w4 w4Var = new fi.w4(this, context, vzVar);
        this.E0 = w4Var;
        try {
            w4Var.b.getImageReceiver().X(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(org.telegram.messenger.gd.N0(2131747945, null));
        Y0();
        this.n.addView(vzVar);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new gh0(context, 14);
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context);
        this.M = i51Var;
        this.p0.addView(i51Var);
        this.d.addView(this.p0, c8.na.e(-1, 51, 80));
        this.M.setOnClickListener(new c91(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, c8.na.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.X0.setContentDescription(org.telegram.messenger.gd.N0(2131752029, null));
        ImageView imageView2 = this.X0;
        int i16 = org.telegram.ui.ActionBar.n6.Ue;
        imageView2.setBackground(org.telegram.ui.ActionBar.b6.c(null, org.telegram.ui.ActionBar.b6.b(getThemedColor(i16))));
        org.telegram.ui.ActionBar.u6.s(this.X0, i16, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, c8.na.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i10) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.t0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().k2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        bx bxVar32 = this.b.N0;
                        if (bxVar32 != null && (q0Var2 = bxVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(u81.f0(w91Var3.a, 0L));
                        break;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        int i17 = 27;
        k0 k0Var = new k0(i17, context, this);
        this.e = k0Var;
        if (this.N0 == null) {
            this.d.addView(k0Var, c8.na.e(-1, -1, org.telegram.messenger.ks.E1));
        }
        s91 s91Var = new s91(this, context);
        this.s0 = s91Var;
        s91Var.setVisibility(8);
        this.e.addView(this.s0, c8.na.d(-1, -1.0f, org.telegram.messenger.ks.E1, 0.0f, 44.0f, 0.0f, 0.0f));
        s91 s91Var2 = this.s0;
        int i18 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.u6.h(i18, s91Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().F0(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.bs bsVar = new org.telegram.ui.Components.bs(context);
        this.V0 = bsVar;
        bsVar.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(21.0f));
        fh.g c11 = cVar.c(this.V0, c8.j0.o(this.resourceProvider), false);
        org.telegram.messenger.m10.s(c11, org.telegram.messenger.g0.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c11);
        this.V0.setOnAnimatedHeightChangedListener(new w81(this, i7));
        this.d.addView(this.V0, c8.na.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            zh.d dVar = new zh.d(g10, this);
            this.S0 = dVar;
            this.V0.addView(dVar.b(), c8.na.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            zh.d dVar2 = this.S0;
            dVar2.m = new x81(this);
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
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            y8 y8Var = new y8(this, context, this);
            this.H0 = y8Var;
            this.G0.addView(y8Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c12 = c8.na.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = org.telegram.messenger.g0.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        C0();
        tv tvVar = new tv(11, context, this);
        this.Q0 = tvVar;
        tvVar.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i18), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.v81
            public final /* synthetic */ w91 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.q0 q0Var2;
                switch (i12) {
                    case 0:
                        w91 w91Var = this.b;
                        if (!w91Var.t0) {
                            w91Var.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        w91 w91Var2 = this.b;
                        w91Var2.getMessagesController().k2(-w91Var2.a, null, w91Var2.g());
                        w91Var2.S0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        bx bxVar32 = this.b.N0;
                        if (bxVar32 != null && (q0Var2 = bxVar32.k0) != null) {
                            q0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        w91 w91Var3 = this.b;
                        w91Var3.presentFragment(u81.f0(w91Var3.a, 0L));
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) it.next();
                if (g2Var instanceof bx) {
                    bx bxVar4 = (bx) g2Var;
                    if (bxVar4.x4()) {
                        org.telegram.messenger.sr srVar = bxVar4.r2;
                        if (srVar.a == j3) {
                            this.R0 = srVar.b;
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
        if (org.telegram.messenger.v3.R(g())) {
            getMessagesController().I0().a(j3, new r3(this, i17));
        }
        View view = this.fragmentView;
        x81 x81Var = new x81(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, x81Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = org.telegram.messenger.ks.T;
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
        } else if (i7 == org.telegram.messenger.ks.y5) {
            S0(false);
        } else if (i7 == org.telegram.messenger.ks.r3) {
            if (j3 == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i7 == org.telegram.messenger.ks.t5) {
            if (j3 == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    C0();
                }
                E0();
            }
        } else if (i7 == org.telegram.messenger.ks.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i12 = org.telegram.messenger.mp.I8;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().t7.y(j3, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.n0(0);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.s) {
            Z0(false, false);
        } else if (i7 == org.telegram.messenger.ks.w2) {
            Long l10 = (Long) objArr[0];
            if (j3 == l10.longValue()) {
                this.I0 = getMessagesController().i1(l10.longValue(), false, null);
                y8 y8Var = this.H0;
                if (y8Var != null) {
                    y8Var.a(!this.fragmentBeginToShow);
                }
                D0(false);
            }
        } else if (i7 == org.telegram.messenger.ks.f0) {
            Z0(false, false);
            S0(true);
        } else if (i7 != org.telegram.messenger.ks.u5 && i7 == org.telegram.messenger.ks.t) {
            removeSelfFromStack(true);
        }
        if (i7 == org.telegram.messenger.ks.h0 && getParentActivity() != null && this.inPreviewMode && org.telegram.messenger.g0.Q1()) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.ah
    public final TLRPC.Chat g() {
        return getMessagesController().O0(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.ah
    public final org.telegram.messenger.t3 getGroupCall() {
        org.telegram.messenger.t3 t3Var = this.I0;
        if (t3Var == null || !(t3Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return t3Var;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        s91 s91Var = this.s0;
        if (s91Var != null && s91Var.a0 != null) {
            int i7 = org.telegram.ui.Cells.y3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.t0 ? org.telegram.ui.ActionBar.n6.d6 : org.telegram.ui.ActionBar.n6.s8);
        if (this.actionBar.x()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ TLRPC.User j() {
        return null;
    }

    @Override // org.telegram.ui.ke0
    public final ui.f k() {
        return this.j1;
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.n(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.a;
        messagesController.b3(0, j3, true);
        long j10 = -j3;
        this.e1 = getMessagesController().z4(j10);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.y5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.r3);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.t5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.r);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.s);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.w2);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f0);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.u5);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.t);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.h0);
        Z0(false, false);
        q11.t(this.currentAccount);
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.T(O0)) {
            getMessagesController().h5(O0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j3);
        HashSet hashSet = s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j3));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().l1(j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        this.P0.e();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.y5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.r3);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.t5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.r);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.s);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.w2);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f0);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.u5);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.t);
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.h0);
        org.telegram.messenger.mp messagesController = getMessagesController();
        long j3 = this.a;
        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
        if (org.telegram.messenger.v3.T(O0)) {
            getMessagesController().h5(O0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.e1) {
            this.e1 = false;
            getMessagesController().h4(-j3);
        }
        bx bxVar = this.N0;
        if (bxVar == null || bxVar.H3 == null) {
            return;
        }
        bxVar.getActionBar().setSearchAvatarImageView(null);
        this.N0.H3.N = true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().t7.r;
        long j3 = this.a;
        int i7 = longSparseIntArray.get(j3, 0) - 1;
        longSparseIntArray.put(j3, i7 >= 0 ? i7 : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.d00 d00Var = getMessagesController().t7;
        LongSparseIntArray longSparseIntArray = d00Var.r;
        long j3 = this.a;
        longSparseIntArray.put(j3, longSparseIntArray.get(j3, 0) + 1);
        d00Var.y(j3, true);
        this.H = false;
        org.telegram.messenger.g0.Z3(this.O);
        this.H = true;
        setBulletinDelegate(new z8(this, 9));
        if (!this.inPreviewMode || getMessagesController().y2(-j3)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onSlideProgress(boolean z10, float f10) {
        if (org.telegram.messenger.bz.o() != 0 && this.U0) {
            P0(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        ui.c cVar = this.l1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
        }
        if (this.X0 != null && (b10 = org.telegram.ui.ActionBar.b6.b(getThemedColor(org.telegram.ui.ActionBar.n6.Ue))) != this.r1) {
            this.r1 = b10;
            org.telegram.ui.ActionBar.n6.H1(this.X0.getBackground(), b10, true);
        }
        for (int i7 = 0; i7 < 2; i7++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.H(getThemedColor(org.telegram.ui.ActionBar.n6.G8), true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.E8), false, true);
            this.actionBar.I(getThemedColor(org.telegram.ui.ActionBar.n6.F8), true, true);
            this.actionBar.J(getThemedColor(org.telegram.ui.ActionBar.n6.I5), true);
        }
        tv tvVar = this.Q0;
        if (tvVar != null && (tvVar.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.n6.d6), 100));
        }
        T0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.n6.d6));
            }
            iv ivVar = this.x;
            if (ivVar != null) {
                ivVar.i();
            }
            if (this.actionBar != null && this.c1) {
                X0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.y8));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var == null || q0Var.getSearchField() == null) {
                return;
            }
            this.q0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.n6.Ne));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        wv wvVar;
        tv tvVar;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (tvVar = this.Q0) != null) {
            if (tvVar.getParent() != null) {
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
            bx bxVar = this.M0;
            if (bxVar != null) {
                bxVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.J) {
            removeSelfFromStack();
            bx bxVar2 = this.N0;
            if (bxVar2 == null || (wvVar = bxVar2.H3) == null || !wvVar.c()) {
                return;
            }
            this.N0.H3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        tv tvVar = this.Q0;
        if (tvVar == null || tvVar.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.Q0.setAlpha(1.0f - f10);
        } else {
            this.Q0.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.P0.d();
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.ah
    public final org.telegram.ui.Components.zn r() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.zn znVar = this.f;
        if (znVar != null) {
            znVar.setAlpha(f10);
            this.r0.setAlpha(f10);
            org.telegram.ui.ActionBar.q0 q0Var = this.q0;
            if (q0Var != null) {
                q0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.zn znVar = this.f;
        if (znVar != null) {
            znVar.setAlpha(f10);
            this.f.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(40.0f));
        }
    }

    @Override // org.telegram.ui.ke0
    public final void v() {
        this.O.y0(0);
    }

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.ah
    public final /* synthetic */ void l(int i7, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
