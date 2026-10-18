package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public class te1 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.bh, ng0 {
    public static final HashSet n1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ci.n5 D0;
    public boolean E;
    public he1 E0;
    public vd1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public ge1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.nl0 K0;
    public org.telegram.ui.Components.b71 L;
    public ey L0;
    public int M;
    public ey M0;
    public ee1 N;
    public boolean N0;
    public xd1 O;
    public final AnimationNotificationsLocker O0;
    public se1 P;
    public x10 P0;
    public org.telegram.ui.ActionBar.e1 Q;
    public long Q0;
    public org.telegram.ui.ActionBar.e1 R;
    public xh.d R0;
    public org.telegram.ui.ActionBar.e1 S;
    public float S0;
    public org.telegram.ui.ActionBar.e1 T;
    public boolean T0;
    public org.telegram.ui.ActionBar.e1 U;
    public org.telegram.ui.Components.us U0;
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
    public org.telegram.ui.Components.b91 a1;
    public final ArrayList b;
    public boolean b0;
    public View b1;
    public int c;
    public NumberTextView c0;
    public int c1;
    public ae1 d;
    public org.telegram.ui.ActionBar.u0 d0;
    public int d1;
    public m0 e;
    public org.telegram.ui.ActionBar.u0 e0;
    public int e1;
    public org.telegram.ui.Components.oo f;
    public org.telegram.ui.ActionBar.u0 f0;
    public final bh.f f1;
    public org.telegram.ui.ActionBar.u0 g0;
    public final gh.d g1;
    public org.telegram.ui.Components.h20 h;
    public org.telegram.ui.ActionBar.u0 h0;
    public final gh.d h1;
    public org.telegram.ui.ActionBar.u0 i0;
    public final bh.b i1;
    public org.telegram.ui.ActionBar.e1 j0;
    public bh.l j1;
    public org.telegram.ui.ActionBar.e1 k0;
    public final ArrayList k1;
    public org.telegram.ui.ActionBar.e1 l0;
    public final RectF l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final RectF m1;
    public je1 n;
    public RadialProgressView n0;
    public l41 o0;
    public org.telegram.ui.ActionBar.u0 p0;
    public org.telegram.ui.ActionBar.u0 q0;
    public final ie1 r;
    public pe1 r0;
    public final TopicsController s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public ue1 v;
    public final boolean v0;
    public kw w;
    public final boolean w0;
    public int x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public te1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new ie1(this);
        this.x = 0;
        this.E = true;
        this.G = true;
        this.V = true;
        this.W = 0.0f;
        this.a0 = new HashSet();
        this.B0 = false;
        this.O0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.S0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.k1 = arrayList;
        RectF rectF = new RectF();
        this.l1 = rectF;
        RectF rectF2 = new RectF();
        this.m1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.a = j10;
        this.t0 = this.arguments.getBoolean("for_select", false);
        this.u0 = this.arguments.getBoolean("forward_to", false);
        this.x0 = this.arguments.getBoolean("bot_share_to", false);
        this.v0 = this.arguments.getBoolean("quote", false);
        this.w0 = this.arguments.getBoolean("reply_to", false);
        this.y0 = this.arguments.getString("voicechat", null);
        this.z0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().getTopicsController();
        this.V0 = true ^ org.telegram.messenger.g0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.f1 = null;
            this.g1 = null;
            this.h1 = null;
            this.i1 = new bh.b(cVar);
            return;
        }
        this.f1 = new bh.f(false);
        this.g1 = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.h1 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.i1 = bVar;
        bVar.i = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.n2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new sn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new sn(bundle);
            }
        }
        return new te1(bundle);
    }

    public static org.telegram.ui.ActionBar.n2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.te1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I0(sn snVar) {
        if (snVar.getParentLayout() == null) {
            return;
        }
        if (snVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) snVar.getParentLayout().getFragmentStack().get(snVar.getParentLayout().getFragmentStack().size() - 2);
            if (n2Var instanceof te1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -snVar.a());
        ((ActionBarLayout) snVar.getParentLayout()).c(snVar.getParentLayout().getFragmentStack().size() - 1, new te1(bundle));
        snVar.ja = true;
        snVar.finishFragment();
    }

    public static boolean U(te1 te1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(te1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-te1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = te1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(te1Var.g());
        int i10 = org.telegram.ui.Components.a90.r;
        org.telegram.ui.Components.a90.y(parentActivity, te1Var, org.telegram.ui.Components.xc.a0(te1Var), isChannelAndNotMegaGroup);
        te1Var.O0(true);
        return false;
    }

    public static void V(te1 te1Var, View view) {
        long j10 = te1Var.a;
        if (te1Var.getParentLayout() == null || ((ActionBarLayout) te1Var.getParentLayout()).y() || !(view instanceof qe1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((qe1) view).N;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : te1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (te1Var.t0) {
            ue1 ue1Var = te1Var.v;
            if (ue1Var != null) {
                we1 we1Var = ue1Var.a;
                Bundle bundle = new Bundle();
                ze1 ze1Var = we1Var.a;
                bundle.putLong("dialog_id", ze1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                b11 b11Var = new b11(bundle, null);
                b11Var.r = new gn0(22, we1Var, tL_forumTopic);
                ze1Var.presentFragment(b11Var);
            }
            ey eyVar = te1Var.L0;
            if (eyVar != null) {
                eyVar.M3(j11, peerDialogId, true, te1Var);
                return;
            }
            return;
        }
        if (te1Var.a0.size() > 0) {
            te1Var.N0(view);
            return;
        }
        if (te1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.n2 n2Var : te1Var.getParentLayout().getFragmentStack()) {
                if (n2Var instanceof ey) {
                    ey eyVar2 = (ey) n2Var;
                    if (eyVar2.f4()) {
                        MessagesStorage.TopicKey topicKey = eyVar2.p2;
                        if (topicKey.dialogId == j11 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            te1Var.Q0 = peerDialogId;
            te1Var.U0(false, false);
        }
        og.d.m(te1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean W(te1 te1Var, View view, float f7) {
        if (te1Var.t0 || te1Var.getParentLayout() == null || ((ActionBarLayout) te1Var.getParentLayout()).y()) {
            return false;
        }
        if (!te1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof qe1)) {
            qe1 qe1Var = (qe1) view;
            if (qe1Var.S(f7)) {
                te1Var.M0(qe1Var);
                te1Var.N.I0(true);
                te1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        te1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(te1 te1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = te1Var.N;
            } else {
                pe1 pe1Var = te1Var.r0;
                viewGroup = pe1Var != null ? pe1Var.U : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).v(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = te1Var.actionBar;
        if (kVar != null) {
            kVar.D(te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.G8), true);
            te1Var.actionBar.F(te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.E8), false, true);
            te1Var.actionBar.F(te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.F8), true, true);
            te1Var.actionBar.G(te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.I5), true);
        }
        x10 x10Var = te1Var.P0;
        if (x10Var != null) {
            x10Var.setForeground(new ColorDrawable(i0.a.o(te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6), 100)));
        }
        te1Var.P0();
    }

    public static void b0(te1 te1Var, boolean z10) {
        yw ywVar;
        te1Var.s0 = z10;
        ValueAnimator valueAnimator = te1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            te1Var.Y0.cancel();
        }
        int i10 = 0;
        if (te1Var.a1 == null) {
            org.telegram.ui.Components.b91 n10 = te1Var.r0.n(8, false);
            te1Var.a1 = n10;
            if (te1Var.M0 != null) {
                n10.setBackgroundColor(te1Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            }
            te1Var.e.addView(te1Var.a1, w7.z5.c(44.0f, -1));
        }
        te1Var.Y0 = ValueAnimator.ofFloat(te1Var.W, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(te1Var.r0, false, 1.0f, true);
        ey eyVar = te1Var.M0;
        if (eyVar != null && (ywVar = eyVar.G3) != null) {
            ywVar.M = !z10;
        }
        te1Var.Z0 = !z10 && te1Var.r0.getVisibility() == 0 && te1Var.r0.getAlpha() == 1.0f;
        te1Var.Y0.addUpdateListener(new e11(te1Var, 15));
        te1Var.r0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(te1Var.getParentActivity(), te1Var.classGuid);
            te1Var.Q0(false);
        } else {
            te1Var.q0.setVisibility(0);
        }
        te1Var.Y0.addListener(new ce1(te1Var, z10, i10));
        te1Var.Y0.setDuration(200L);
        te1Var.Y0.setInterpolator(org.telegram.ui.Components.bs.f);
        te1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.bh
    public final org.telegram.ui.Components.jw0 A() {
        return this.d;
    }

    public final void A0() {
        this.J0 = this.s.isLoading(this.a);
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((ke1) arrayList.get(0)).c != null && ((ke1) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        ee1 ee1Var = this.N;
        if (ee1Var != null) {
            ee1Var.K0(ee1Var.v1());
        }
        Q0(true);
    }

    public final void B0() {
        ey eyVar = this.M0;
        if (eyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.us usVar = eyVar.J1;
            float c10 = (usVar != null ? usVar.c(dp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.us usVar2 = this.U0;
            if (usVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.us usVar3 = this.M0.J1;
                usVar2.setTranslationY(c10 - ((usVar3 != null ? usVar3.getMetadata().c.a : 0.0f) * dp2));
                org.telegram.ui.Components.us usVar4 = this.U0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                r2 = usVar4.c(AndroidUtilities.lerp(dp3, dp4, this.M0.J1 != null ? r5.getMetadata().c.a : 0.0f)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.us usVar5 = this.U0;
            if (usVar5 != null) {
                r2 = 0.0f + usVar5.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.N.setPadding(0, (int) r2, 0, this.e1 + this.c1 + (this.V ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void C0() {
        this.a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            b2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            b2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hk0(13));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.q7));
        }
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ boolean G() {
        return false;
    }

    public final void G0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    public final void H0(boolean z10) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.K4(this.J);
        profileActivity.N4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ long I() {
        return 0L;
    }

    public final void J0(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.L.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.h6.Ae : org.telegram.ui.ActionBar.h6.q7);
            this.W0.setVisibility(i10 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ae1 ae1Var = this.d;
        if (ae1Var != null) {
            if (z10) {
                ae1Var.setLayerType(2, null);
                ae1Var.setClipChildren(false);
                ae1Var.setClipToPadding(false);
            } else {
                ae1Var.setLayerType(0, null);
                ae1Var.setClipChildren(true);
                ae1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.S0 = f7;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ee1 ee1Var = this.N;
        if (ee1Var != null) {
            float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
            ee1Var.setPivotX(0.0f);
            ee1Var.setPivotY(0.0f);
            ee1Var.setScaleX(D);
            ee1Var.setScaleY(D);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(D);
            this.actionBar.setScaleY(D);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void M0(org.telegram.ui.Cells.r2 r2Var) {
        final int i10 = 0;
        try {
            r2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.N;
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new zd1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(zoVar.f);
        zoVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        zoVar.d(j11, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.td1
                public final /* synthetic */ te1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            te1 te1Var = this.b;
                            te1Var.C0 = true;
                            te1Var.N0 = true;
                            te1Var.s.pinTopic(te1Var.a, tL_forumTopic.id, !r0.pinned, te1Var);
                            te1Var.finishPreviewFragment();
                            break;
                        case 1:
                            te1 te1Var2 = this.b;
                            te1Var2.N0 = true;
                            TopicsController topicsController = te1Var2.s;
                            long j12 = te1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            te1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            te1 te1Var3 = this.b;
                            te1Var3.D0(hashSet, new rd1(te1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.id)) {
            e1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new ci.c6(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(e1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                e1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                e1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            e1Var3.setMinimumWidth(160);
            e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.td1
                public final /* synthetic */ te1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            te1 te1Var = this.b;
                            te1Var.C0 = true;
                            te1Var.N0 = true;
                            te1Var.s.pinTopic(te1Var.a, tL_forumTopic.id, !r0.pinned, te1Var);
                            te1Var.finishPreviewFragment();
                            break;
                        case 1:
                            te1 te1Var2 = this.b;
                            te1Var2.N0 = true;
                            TopicsController topicsController = te1Var2.s;
                            long j12 = te1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            te1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            te1 te1Var3 = this.b;
                            te1Var3.D0(hashSet, new rd1(te1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.h6.p7));
            e1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.q7));
            e1Var4.setMinimumWidth(160);
            final int i12 = 2;
            e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.td1
                public final /* synthetic */ te1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            te1 te1Var = this.b;
                            te1Var.C0 = true;
                            te1Var.N0 = true;
                            te1Var.s.pinTopic(te1Var.a, tL_forumTopic.id, !r0.pinned, te1Var);
                            te1Var.finishPreviewFragment();
                            break;
                        case 1:
                            te1 te1Var2 = this.b;
                            te1Var2.N0 = true;
                            TopicsController topicsController = te1Var2.s;
                            long j12 = te1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            te1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            te1 te1Var3 = this.b;
                            te1Var3.D0(hashSet, new rd1(te1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
        if (this.P0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.P0.setBackground(new BitmapDrawable(createBitmap));
            this.P0.setAlpha(0.0f);
            if (this.P0.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.P0, w7.z5.c(-1.0f, -1));
        }
        sn snVar = new sn(zf.d0.b(j10, "chat_id"));
        og.d.a(snVar, MessagesStorage.TopicKey.of(j11, isMonoForum ? DialogObject.getPeerDialogId(r2Var.N.from_id) : r2Var.N.id));
        presentFragmentAsPreviewWithMenu(snVar, r32[0]);
    }

    public final void N0(View view) {
        qe1 qe1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        if (!(view instanceof qe1) || (tL_forumTopic = (qe1Var = (qe1) view).N) == null) {
            return;
        }
        int i11 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i11);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i11));
        }
        qe1Var.V(hashSet.contains(Integer.valueOf(i11)), true);
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.r();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.y j11 = this.actionBar.j(null);
            if (this.inPreviewMode) {
                j11.setBackgroundColor(0);
                j11.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(j11.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(AndroidUtilities.bold());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.y8));
            j11.addView(this.c0, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new ud1(0));
            this.d0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.e0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.f0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.g0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.u0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.u0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.i0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.u0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.m0 = h11;
            this.j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            topicsController = this.s;
            if (!hasNext) {
                break;
            }
            HashSet hashSet2 = hashSet;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j10, intValue);
            if (findTopic != null) {
                if (findTopic.unread_count != 0) {
                    i12++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i15++;
                    } else {
                        i14++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, intValue)) {
                i13++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i12 > 0) {
            this.j0.setVisibility(0);
            this.j0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            i10 = 8;
        } else {
            i10 = 8;
            this.j0.setVisibility(8);
        }
        if (i13 != 0) {
            this.B0 = false;
            this.f0.setIcon(R.drawable.msg_unmute);
            this.f0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            z10 = true;
        } else {
            z10 = true;
            this.B0 = true;
            this.f0.setIcon(R.drawable.msg_mute);
            this.f0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
        }
        this.d0.setVisibility((i14 == z10 && i15 == 0) ? 0 : i10);
        this.e0.setVisibility((i15 == z10 && i14 == 0) ? 0 : i10);
        this.c0.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i18++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i20++;
                        } else {
                            i19++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i16++;
                        } else {
                            i17++;
                        }
                    }
                }
            }
        }
        this.k0.setVisibility((i16 != 0 || i17 <= 0) ? i10 : 0);
        this.k0.setText(LocaleController.getString(i17 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.l0.setVisibility((i17 != 0 || i16 <= 0) ? i10 : 0);
        this.l0.setText(LocaleController.getString(i16 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.g0.setVisibility(i18 == hashSet3.size() ? 0 : i10);
        this.h0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.i0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.m0.l();
        R0();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        long j10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        String string;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j11 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j11));
        long j12 = -j11;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j12));
        if (UserObject.isBotForum(user)) {
            this.f.setUserAvatar(user);
        } else if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                this.f.setChatAvatar(chat2);
            }
        } else {
            this.f.setChatAvatar(chat);
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        StringBuilder sb2 = new StringBuilder("dialog_bar_vis3");
        sb2.append(j12);
        boolean z14 = notificationsSettings.getInt(sb2.toString(), 0) == 2;
        boolean v = org.telegram.messenger.g0.v("dialog_bar_report", j12, notificationsSettings, false);
        boolean v10 = org.telegram.messenger.g0.v("dialog_bar_block", j12, notificationsSettings, false);
        boolean z15 = this.t0;
        if (z15) {
            j10 = 0;
            if (this.w0) {
                this.f.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.v0) {
                this.f.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (this.x0) {
                this.f.setTitle(LocaleController.getString(R.string.BotShareToTopic));
            } else if (this.u0) {
                this.f.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else {
                this.f.setTitle(LocaleController.getString(R.string.SelectTopic));
            }
            this.p0.setVisibility(8);
            org.telegram.ui.Components.oo ooVar = this.f;
            if (ooVar != null && ooVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.p0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            i10 = 8;
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.f.setTitle(chat.title);
                this.f.j(null, getMessagesController().isDialogMuted(j12, 0L) ? getThemedDrawable("drawableMuteIcon") : null);
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
            if (chatFull2 != null && (chatFull = this.J) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.J = chatFull2;
            if (chatFull2 != null) {
                int i11 = chatFull2.participants_count;
                if (i11 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    string = chat3 == null ? LocaleController.getString(R.string.Loading) : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    j10 = 0;
                } else {
                    j10 = 0;
                    string = LocaleController.formatPluralString("Members", i11, new Object[0]);
                }
            } else {
                j10 = 0;
                string = LocaleController.getString(R.string.Loading);
            }
            this.f.setSubtitle(string);
            i10 = 8;
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j13 = MessagesController.getNotificationsSettings(this.currentAccount).getLong(a1.g.o(j12, "dialog_join_requested_time_"), -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j13 > j10 && System.currentTimeMillis() - j13 < 120000) {
            this.L.a(LocaleController.getString(R.string.ChannelJoinRequestSent), z16);
            this.L.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, false, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, true, 0.5f, z16);
            J0(0);
        } else if (chat != null && !z15 && (ChatObject.isNotInChat(chat) || getMessagesController().isJoiningChannel(chat.id))) {
            if (getMessagesController().isJoiningChannel(chat.id)) {
                z13 = true;
                z12 = true;
            } else {
                if (chat.join_request) {
                    this.L.setText(LocaleController.getString(R.string.ChannelJoinRequest));
                } else {
                    this.L.setText(LocaleController.getString(R.string.ChannelJoin));
                }
                z12 = true;
                this.L.setClickable(true);
                this.L.setEnabled(true);
                z13 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, z13, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, z13 ^ z12, 0.5f, z16);
            J0(0);
        } else {
            if (!z14 || (!v10 && !v)) {
                z11 = false;
                if (this.V != z11) {
                    this.V = z11;
                    this.o0.animate().setListener(null).cancel();
                    if (z16) {
                        this.o0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new ce1(this, z11, 1));
                    } else {
                        this.o0.setVisibility(z11 ? 0 : i10);
                        this.o0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                B0();
                this.q0.setVisibility(!z15 ? i10 : 0);
                this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : i10);
                this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? i10 : 0);
                this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? i10 : 0);
                this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? i10 : 0);
                Q0(true);
                this.H0 = getMessagesController().getGroupCall(j11, true);
                z0(false);
            }
            this.L.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
            this.L.setClickable(true);
            this.L.setEnabled(true);
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, false, 0.5f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, true, 0.5f, false);
            J0(1);
        }
        z11 = true;
        if (this.V != z11) {
        }
        B0();
        this.q0.setVisibility(!z15 ? i10 : 0);
        this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : i10);
        this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? i10 : 0);
        this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? i10 : 0);
        this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? i10 : 0);
        Q0(true);
        this.H0 = getMessagesController().getGroupCall(j11, true);
        z0(false);
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ae));
        this.h.g();
        l41 l41Var = this.o0;
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        l41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.s8));
        }
        this.r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z10) {
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        boolean z11 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j10))) || this.s0 || this.t0 || this.J0) ? false : true;
        this.K = z11;
        this.Q.setVisibility(z11 ? 0 : 8);
        G0(!this.K, z10);
    }

    public final void R0() {
        boolean z10 = ChatObject.canManageTopics(g()) && !this.a0.isEmpty();
        if (this.b0 != z10) {
            this.b0 = z10;
            ie1 ie1Var = this.r;
            ie1Var.q(0, ie1Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.n2, org.telegram.ui.ng0
    public final /* synthetic */ boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0(float f7) {
        this.W = f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.y8;
        kVar.C(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.h6.t8), getThemedColor(org.telegram.ui.ActionBar.h6.z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.h6.s8), getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
        }
        float f10 = 1.0f - f7;
        this.f.getTitleTextView().setAlpha(f10);
        this.f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.b91 b91Var = this.a1;
        if (b91Var != null) {
            b91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
            this.a1.setAlpha(f7);
        }
        this.r0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
        this.r0.setAlpha(f7);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.N.setAlpha(f10);
        if (this.Z0) {
            float y3 = com.google.android.gms.internal.play_billing.k3.y(1.0f, this.W, 0.02f, 0.98f);
            this.N.setScaleX(y3);
            this.N.setScaleY(y3);
        }
    }

    public final void T0() {
        ci.n5 n5Var = this.D0;
        if (n5Var == null || n5Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.ic_ab_other, 0);
        yqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(yqVar, 0, 1, 0);
        if (ChatObject.canUserDoAdminAction(g(), 15)) {
            this.D0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.a, 1L);
        if (findTopic != null) {
            string = findTopic.title;
        }
        this.D0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    public final void U0(boolean z10, boolean z11) {
        vd1 vd1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.N0) {
            z10 = true;
        }
        this.N0 = false;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.u0) {
                arrayList.add(new ke1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList.add(new ke1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new ke1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ke1 ke1Var = (ke1) arrayList.get(i11);
                if (ke1Var != null && (tL_forumTopic = ke1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            ee1 ee1Var = this.N;
            if (ee1Var != null) {
                if (ee1Var.getItemAnimator() != (z10 ? this.I0 : null)) {
                    this.N.setItemAnimator(z10 ? this.I0 : null);
                }
            }
            ie1 ie1Var = this.r;
            if (ie1Var != null) {
                ie1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (vd1Var = this.F) != null) {
                vd1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        A0();
        T0();
    }

    @Override // org.telegram.ui.Components.bh, org.telegram.ui.Components.y50
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        ey eyVar = this.M0;
        final int i10 = 0;
        this.c1 = (eyVar == null || !eyVar.W) ? 0 : AndroidUtilities.dp(72.0f);
        ey eyVar2 = this.M0;
        this.d1 = (eyVar2 == null || !eyVar2.W) ? 0 : AndroidUtilities.dp(64.0f);
        ae1 ae1Var = new ae1(this, context);
        this.d = ae1Var;
        this.fragmentView = ae1Var;
        ae1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.d.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new de1(this, context));
        final int i12 = 2;
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
            public final /* synthetic */ te1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (i12) {
                    case 0:
                        te1 te1Var = this.b;
                        te1Var.presentFragment(pd1.a0(te1Var.a, 0L));
                        break;
                    case 1:
                        te1 te1Var2 = this.b;
                        te1Var2.getMessagesController().hidePeerSettingsBar(-te1Var2.a, null, te1Var2.g());
                        te1Var2.O0(false);
                        break;
                    case 2:
                        te1 te1Var3 = this.b;
                        if (!te1Var3.s0) {
                            te1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        ey eyVar3 = this.b.M0;
                        if (eyVar3 != null && (u0Var = eyVar3.j0) != null) {
                            u0Var.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        final int i13 = 4;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
                public final /* synthetic */ te1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i13) {
                        case 0:
                            te1 te1Var = this.b;
                            te1Var.presentFragment(pd1.a0(te1Var.a, 0L));
                            break;
                        case 1:
                            te1 te1Var2 = this.b;
                            te1Var2.getMessagesController().hidePeerSettingsBar(-te1Var2.a, null, te1Var2.g());
                            te1Var2.O0(false);
                            break;
                        case 2:
                            te1 te1Var3 = this.b;
                            if (!te1Var3.s0) {
                                te1Var3.H0(false);
                                break;
                            }
                            break;
                        case 3:
                            this.b.finishPreviewFragment();
                            break;
                        default:
                            ey eyVar3 = this.b.M0;
                            if (eyVar3 != null && (u0Var = eyVar3.j0) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.F();
            a10.H = new ig.c2(this, 18);
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.h6.Wd));
        }
        org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.R = this.q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.uj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        int i14 = 3;
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, this, false, this.resourceProvider);
        this.f = ooVar;
        ooVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        org.telegram.ui.Components.oo ooVar2 = this.f;
        long j10 = -this.a;
        ooVar2.b = j10 < 0;
        ooVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, w7.z5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new b8(this, i14));
        }
        this.N = new ee1(this, context);
        ih.j jVar = new ih.j(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.i1;
        bVar.f = jVar;
        bVar.g = viewGroup;
        ee1 ee1Var = this.N;
        ey eyVar3 = this.M0;
        if (eyVar3 != null) {
            viewGroup = (ViewGroup) eyVar3.getFragmentView();
        }
        ee1 ee1Var2 = this.N;
        Objects.requireNonNull(ee1Var2);
        this.j1 = new bh.l(ee1Var, viewGroup, new x8(ee1Var2, i12));
        this.N.C0(new rd1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = kwVar;
        kwVar.b();
        int i15 = this.E ? 2 : 0;
        this.y = i15;
        this.w.X = i15 != 0;
        ge1 ge1Var = new ge1(this);
        this.N.setHideIfEmpty(false);
        ge1Var.m = false;
        ge1Var.C = false;
        ee1 ee1Var3 = this.N;
        this.I0 = ge1Var;
        ee1Var3.setItemAnimator(ge1Var);
        this.N.setOnScrollListener(new wd1(this, i11));
        ee1 ee1Var4 = this.N;
        ee1Var4.W1 = true;
        ee1Var4.X1 = 0;
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(ee1Var4, true);
        this.K0 = nl0Var;
        this.N.setItemsEnterAnimator(nl0Var);
        this.N.setOnItemClickListener(new h11(this, 10));
        this.N.setOnItemLongClickListener(new sd1(this));
        this.N.setOnScrollListener(new wd1(this, i12));
        ee1 ee1Var5 = this.N;
        vd1 vd1Var = new vd1(this);
        this.F = vd1Var;
        ee1Var5.setLayoutManager(vd1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new wd1(this, i10));
        se1 se1Var = new se1(this);
        this.P = se1Var;
        xd1 xd1Var = new xd1(this, se1Var);
        this.O = xd1Var;
        xd1Var.d(this.N);
        this.d.addView(this.N, w7.z5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(getParentActivity(), this.resourceProvider, false);
        this.h = h20Var;
        this.d.addView(h20Var, org.telegram.ui.Components.h20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
            public final /* synthetic */ te1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i10) {
                    case 0:
                        te1 te1Var = this.b;
                        te1Var.presentFragment(pd1.a0(te1Var.a, 0L));
                        break;
                    case 1:
                        te1 te1Var2 = this.b;
                        te1Var2.getMessagesController().hidePeerSettingsBar(-te1Var2.a, null, te1Var2.g());
                        te1Var2.O0(false);
                        break;
                    case 2:
                        te1 te1Var3 = this.b;
                        if (!te1Var3.s0) {
                            te1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.h.setContentDescription(LocaleController.getString(R.string.CreateTopic));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
        b10Var.setViewType(24);
        b10Var.setVisibility(8);
        b10Var.w = true;
        je1 je1Var = new je1(context);
        TextView textView = new TextView(context);
        je1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.yq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.y6));
        boolean z10 = LocaleController.isRTL;
        je1Var.addView(textView, w7.z5.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = je1Var;
        textView.setAlpha(0.0f);
        ci.n5 n5Var = new ci.n5(this, context, b10Var);
        this.D0 = n5Var;
        try {
            n5Var.b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.D0.e(this.J0, this.fragmentBeginToShow);
        this.D0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.n.addView(b10Var);
        this.n.addView(this.D0);
        this.d.addView(this.n);
        this.N.setEmptyView(this.n);
        this.o0 = new l41(context, 6);
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(context);
        this.L = b71Var;
        this.o0.addView(b71Var);
        this.d.addView(this.o0, w7.z5.e(-1, 51, 80));
        this.L.setOnClickListener(new yd1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.n0.setVisibility(4);
        this.o0.addView(this.n0, w7.z5.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.W0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.W0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.W0;
        int i16 = org.telegram.ui.ActionBar.h6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.x5.c(null, org.telegram.ui.ActionBar.x5.b(getThemedColor(i16))));
        this.W0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, w7.z5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
            public final /* synthetic */ te1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i11) {
                    case 0:
                        te1 te1Var = this.b;
                        te1Var.presentFragment(pd1.a0(te1Var.a, 0L));
                        break;
                    case 1:
                        te1 te1Var2 = this.b;
                        te1Var2.getMessagesController().hidePeerSettingsBar(-te1Var2.a, null, te1Var2.g());
                        te1Var2.O0(false);
                        break;
                    case 2:
                        te1 te1Var3 = this.b;
                        if (!te1Var3.s0) {
                            te1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        O0(false);
        m0 m0Var = new m0(this, context, 25);
        this.e = m0Var;
        if (this.M0 == null) {
            this.d.addView(m0Var, w7.z5.e(-1, -1, 119));
        }
        pe1 pe1Var = new pe1(this, context);
        this.r0 = pe1Var;
        pe1Var.setVisibility(8);
        this.e.addView(this.r0, w7.z5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        pe1 pe1Var2 = this.r0;
        int i17 = org.telegram.ui.ActionBar.h6.d6;
        pe1Var2.setBackgroundColor(getThemedColor(i17));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.us usVar = new org.telegram.ui.Components.us(context);
        this.U0 = usVar;
        usVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.c.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new rd1(this, i10));
        this.d.addView(this.U0, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.c(), w7.z5.n(-1, 40));
            this.U0.h(3, this.R0.c());
            this.U0.g(this.R0.c());
            xh.d dVar2 = this.R0;
            dVar2.m = new sd1(this);
            TLRPC.ChatFull chatFull = this.J;
            dVar2.j = chatFull;
            if (chatFull != null) {
                dVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.F0 = frameLayout;
            this.U0.addView(frameLayout);
            this.U0.h(4, this.F0);
            this.U0.g(this.F0);
            this.U0.i(this.F0, true, false);
            a9 a9Var = new a9(this, context, this);
            this.G0 = a9Var;
            this.F0.addView(a9Var);
            this.U0.setCallFragmentContextView(this.G0);
        }
        FrameLayout.LayoutParams c13 = w7.z5.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        y0();
        x10 x10Var = new x10(this, context, 10);
        this.P0 = x10Var;
        x10Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i17), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        final int i18 = 3;
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.qd1
            public final /* synthetic */ te1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i18) {
                    case 0:
                        te1 te1Var = this.b;
                        te1Var.presentFragment(pd1.a0(te1Var.a, 0L));
                        break;
                    case 1:
                        te1 te1Var2 = this.b;
                        te1Var2.getMessagesController().hidePeerSettingsBar(-te1Var2.a, null, te1Var2.g());
                        te1Var2.O0(false);
                        break;
                    case 2:
                        te1 te1Var3 = this.b;
                        if (!te1Var3.s0) {
                            te1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.P0.setFitsSystemWindows(true);
        this.V = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) it.next();
                if (n2Var instanceof ey) {
                    ey eyVar4 = (ey) n2Var;
                    if (eyVar4.f4()) {
                        MessagesStorage.TopicKey topicKey = eyVar4.p2;
                        if (topicKey.dialogId == j10) {
                            this.Q0 = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            U0(false, false);
        }
        O0(false);
        P0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new v3(this, 24));
        }
        View view = this.fragmentView;
        sd1 sd1Var = new sd1(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, sd1Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ long d() {
        return 0L;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.a;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.J) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j10) {
                O0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean canScrollVertically = this.N.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.F.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l4 = (Long) objArr[0];
            if (j10 == l4.longValue()) {
                this.H0 = getMessagesController().getGroupCall(l4.longValue(), false);
                a9 a9Var = this.G0;
                if (a9Var != null) {
                    a9Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i10 != NotificationCenter.chatSwitchedForum && i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i10 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j10) || booleanValue) {
                if (this.Q0 != 0) {
                    this.Q0 = 0L;
                    U0(false, false);
                    return;
                }
                return;
            }
            if (this.Q0 != longValue2) {
                this.Q0 = longValue2;
                U0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.bh
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.bh
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.H0;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.im0 im0Var;
        by0 by0Var = new by0(8, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, by0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        pe1 pe1Var = this.r0;
        if (pe1Var != null && (im0Var = pe1Var.U) != null) {
            org.telegram.ui.Cells.u3.a(arrayList, im0Var);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.h6.d6 : org.telegram.ui.ActionBar.h6.s8);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.bh
    public final org.telegram.ui.Components.oo o() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.w(this.p0.L(false));
            }
        } else if (z10) {
            C0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        messagesController.loadFullChat(j10, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        U0(false, false);
        z51.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = n1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j10));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j10);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        this.O0.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.a));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        ey eyVar = this.M0;
        if (eyVar == null || eyVar.G3 == null) {
            return;
        }
        eyVar.getActionBar().setSearchAvatarImageView(null);
        this.M0.G3.M = true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.a);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.a;
        topicsController.onTopicFragmentResume(j10);
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new b9(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            L0(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        yw ywVar;
        x10 x10Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (x10Var = this.P0) != null) {
            if (x10Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            z0(false);
        }
        this.O0.unlock();
        if (z10) {
            return;
        }
        if (this.t0 && this.H) {
            removeSelfFromStack();
            ey eyVar = this.L0;
            if (eyVar != null) {
                eyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.I) {
            removeSelfFromStack();
            ey eyVar2 = this.M0;
            if (eyVar2 == null || (ywVar = eyVar2.G3) == null || !ywVar.c()) {
                return;
            }
            this.M0.G3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        x10 x10Var = this.P0;
        if (x10Var == null || x10Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.P0.setAlpha(1.0f - f7);
        } else {
            this.P0.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            K0(true);
        } else {
            this.T0 = false;
            K0(false);
            L0(1.0f);
        }
    }

    @Override // org.telegram.ui.ng0
    public final void s() {
        this.N.x0(0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setPreviewOpenedProgress(float f7) {
        org.telegram.ui.Components.oo ooVar = this.f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.q0.setAlpha(f7);
            org.telegram.ui.ActionBar.u0 u0Var = this.p0;
            if (u0Var != null) {
                u0Var.setAlpha(f7);
            }
            this.actionBar.getBackButton().setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.oo ooVar = this.f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.f1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
        ey eyVar = this.M0;
        View view = eyVar != null ? eyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = eyVar != null ? eyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.e1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.l1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.m1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.M0 != null ? 2 : 1, this.k1);
        fVar.e(this.j1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void y0() {
        vd1 vd1Var;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        if (topicsController.endIsReached(j10) || (vd1Var = this.F) == null) {
            return;
        }
        int N0 = vd1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        A0();
    }

    @Override // org.telegram.ui.ng0
    public final gh.d z() {
        return this.h1;
    }

    public final void z0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (this.H0 != null && ((str = this.y0) != null || this.z0)) {
            org.telegram.ui.Components.voip.d2.l(chat, str, false, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.y0 = null;
            this.z0 = false;
        } else {
            if (this.y0 == null || !z10 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
