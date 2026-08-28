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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class we1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.rg, mg0 {
    public static final HashSet j1 = new HashSet();
    public boolean A;
    public je1 A0;
    public xd1 B;
    public FrameLayout B0;
    public boolean C;
    public w8 C0;
    public boolean D;
    public ChatObject.Call D0;
    public boolean E;
    public ie1 E0;
    public TLRPC.ChatFull F;
    public boolean F0;
    public boolean G;
    public org.telegram.ui.Components.dk0 G0;
    public org.telegram.ui.Components.k51 H;
    public dy H0;
    public int I;
    public dy I0;
    public ge1 J;
    public boolean J0;
    public zd1 K;
    public final AnimationNotificationsLocker K0;
    public ve1 L;
    public yi0 L0;
    public org.telegram.ui.ActionBar.g1 M;
    public long M0;
    public org.telegram.ui.ActionBar.g1 N;
    public eh.e N0;
    public org.telegram.ui.ActionBar.g1 O;
    public float O0;
    public org.telegram.ui.ActionBar.g1 P;
    public boolean P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public org.telegram.ui.Components.bs Q0;
    public boolean R;
    public final boolean R0;
    public float S;
    public ImageView S0;
    public TL_stories.TL_premium_boostsStatus T;
    public float T0;
    public long U;
    public ValueAnimator U0;
    public boolean V;
    public boolean V0;
    public final HashSet W;
    public org.telegram.ui.Components.m71 W0;
    public boolean X;
    public View X0;
    public NumberTextView Y;
    public int Y0;
    public org.telegram.ui.ActionBar.w0 Z;
    public int Z0;
    public final long a;
    public org.telegram.ui.ActionBar.w0 a0;
    public int a1;
    public final ArrayList b;
    public org.telegram.ui.ActionBar.w0 b0;
    public final ig.e b1;
    public int c;
    public org.telegram.ui.ActionBar.w0 c0;
    public final ng.d c1;
    public ce1 d;
    public org.telegram.ui.ActionBar.w0 d0;
    public final ng.d d1;
    public m0 e;
    public org.telegram.ui.ActionBar.w0 e0;
    public final ig.a e1;
    public org.telegram.ui.Components.tn f;
    public org.telegram.ui.ActionBar.g1 f0;
    public ig.k f1;
    public org.telegram.ui.ActionBar.g1 g0;
    public final ArrayList g1;
    public org.telegram.ui.Components.j10 h;
    public org.telegram.ui.ActionBar.g1 h0;
    public final RectF h1;
    public org.telegram.ui.ActionBar.w0 i0;
    public final RectF i1;
    public RadialProgressView j0;
    public b81 k0;
    public org.telegram.ui.ActionBar.w0 l0;
    public org.telegram.ui.ActionBar.w0 m0;
    public le1 n;
    public re1 n0;
    public boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final ke1 r;
    public final boolean r0;
    public final TopicsController s;
    public final boolean s0;
    public final boolean t0;
    public String u0;
    public ye1 v;
    public boolean v0;
    public kw w;
    public HashSet w0;
    public int x;
    public boolean x0;
    public int y;
    public boolean y0;
    public ih.b5 z0;

    public we1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new ke1(this);
        this.x = 0;
        this.A = true;
        this.C = true;
        this.R = true;
        this.S = 0.0f;
        this.W = new HashSet();
        this.x0 = false;
        this.K0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.O0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.g1 = arrayList;
        RectF rectF = new RectF();
        this.h1 = rectF;
        RectF rectF2 = new RectF();
        this.i1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.a = j10;
        this.p0 = this.arguments.getBoolean("for_select", false);
        this.q0 = this.arguments.getBoolean("forward_to", false);
        this.t0 = this.arguments.getBoolean("bot_share_to", false);
        this.r0 = this.arguments.getBoolean("quote", false);
        this.s0 = this.arguments.getBoolean("reply_to", false);
        this.u0 = this.arguments.getString("voicechat", null);
        this.v0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().getTopicsController();
        this.R0 = true ^ org.telegram.messenger.l0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.b1 = null;
            this.c1 = null;
            this.d1 = null;
            this.e1 = new ig.a(cVar);
            return;
        }
        this.b1 = new ig.e(false);
        this.c1 = new ng.d(null);
        ng.d dVar = new ng.d(null);
        this.d1 = dVar;
        ig.a aVar = new ig.a(dVar);
        this.e1 = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.o2 D0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new qn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new qn(bundle);
            }
        }
        return new we1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 E0(LaunchActivity launchActivity, Bundle bundle) {
        return D0(MessagesController.getInstance(launchActivity.K), MessagesStorage.getInstance(launchActivity.K), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.we1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H0(qn qnVar) {
        if (qnVar.getParentLayout() == null) {
            return;
        }
        if (qnVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) qnVar.getParentLayout().getFragmentStack().get(qnVar.getParentLayout().getFragmentStack().size() - 2);
            if (o2Var instanceof we1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -qnVar.a());
        ((ActionBarLayout) qnVar.getParentLayout()).c(qnVar.getParentLayout().getFragmentStack().size() - 1, new we1(bundle));
        qnVar.fa = true;
        qnVar.finishFragment();
    }

    public static boolean T(we1 we1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(we1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-we1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = we1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(we1Var.g());
        int i9 = org.telegram.ui.Components.p70.r;
        org.telegram.ui.Components.p70.w(parentActivity, we1Var, org.telegram.ui.Components.oc.a0(we1Var), isChannelAndNotMegaGroup);
        we1Var.O0(true);
        return false;
    }

    public static void U(we1 we1Var, View view) {
        long j10 = we1Var.a;
        if (we1Var.getParentLayout() == null || ((ActionBarLayout) we1Var.getParentLayout()).y() || !(view instanceof se1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((se1) view).J;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : we1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (we1Var.p0) {
            ye1 ye1Var = we1Var.v;
            if (ye1Var != null) {
                af1 af1Var = ye1Var.a;
                Bundle bundle = new Bundle();
                df1 df1Var = af1Var.a;
                bundle.putLong("dialog_id", df1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                s01 s01Var = new s01(bundle, null);
                s01Var.r = new nl0(26, af1Var, tL_forumTopic);
                df1Var.presentFragment(s01Var);
            }
            dy dyVar = we1Var.H0;
            if (dyVar != null) {
                dyVar.O3(j11, peerDialogId, true, we1Var);
                return;
            }
            return;
        }
        if (we1Var.W.size() > 0) {
            we1Var.N0(view);
            return;
        }
        if (we1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.o2 o2Var : we1Var.getParentLayout().getFragmentStack()) {
                if (o2Var instanceof dy) {
                    dy dyVar2 = (dy) o2Var;
                    if (dyVar2.h4()) {
                        MessagesStorage.TopicKey topicKey = dyVar2.l2;
                        if (topicKey.dialogId == j11 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            we1Var.M0 = peerDialogId;
            we1Var.U0(false, false);
        }
        vf.c.m(we1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean V(we1 we1Var, View view, float f10) {
        if (we1Var.p0 || we1Var.getParentLayout() == null || ((ActionBarLayout) we1Var.getParentLayout()).y()) {
            return false;
        }
        if (!we1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof se1)) {
            se1 se1Var = (se1) view;
            if (se1Var.R(f10)) {
                we1Var.M0(se1Var);
                we1Var.J.I0(true);
                we1Var.J.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        we1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void W(we1 we1Var) {
        ViewGroup viewGroup;
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                viewGroup = we1Var.J;
            } else {
                re1 re1Var = we1Var.n0;
                viewGroup = re1Var != null ? re1Var.Q : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        ((org.telegram.ui.Cells.h6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.r2) {
                        ((org.telegram.ui.Cells.r2) childAt).a0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.va) {
                        ((org.telegram.ui.Cells.va) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = we1Var.actionBar;
        if (kVar != null) {
            kVar.D(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.G8), true);
            we1Var.actionBar.E(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.E8), false, true);
            we1Var.actionBar.E(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.F8), true, true);
            we1Var.actionBar.F(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.I5), true);
        }
        yi0 yi0Var = we1Var.L0;
        if (yi0Var != null && Build.VERSION.SDK_INT >= 23) {
            yi0Var.setForeground(new ColorDrawable(i0.a.k(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6), 100)));
        }
        we1Var.P0();
    }

    public static void a0(we1 we1Var, boolean z10) {
        yw ywVar;
        we1Var.o0 = z10;
        ValueAnimator valueAnimator = we1Var.U0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            we1Var.U0.cancel();
        }
        int i9 = 0;
        if (we1Var.W0 == null) {
            org.telegram.ui.Components.m71 n10 = we1Var.n0.n(8, false);
            we1Var.W0 = n10;
            if (we1Var.I0 != null) {
                n10.setBackgroundColor(we1Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            }
            we1Var.e.addView(we1Var.W0, g7.e6.c(44.0f, -1));
        }
        we1Var.U0 = ValueAnimator.ofFloat(we1Var.S, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(we1Var.n0, false, 1.0f, true);
        dy dyVar = we1Var.I0;
        if (dyVar != null && (ywVar = dyVar.B3) != null) {
            ywVar.I = !z10;
        }
        we1Var.V0 = !z10 && we1Var.n0.getVisibility() == 0 && we1Var.n0.getAlpha() == 1.0f;
        we1Var.U0.addUpdateListener(new v01(we1Var, 17));
        we1Var.n0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(we1Var.getParentActivity(), we1Var.classGuid);
            we1Var.Q0(false);
        } else {
            we1Var.m0.setVisibility(0);
        }
        we1Var.U0.addListener(new ee1(we1Var, z10, i9));
        we1Var.U0.setDuration(200L);
        we1Var.U0.setInterpolator(org.telegram.ui.Components.gr.f);
        we1Var.U0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void A0() {
        dy dyVar = this.I0;
        if (dyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.bs bsVar = dyVar.F1;
            float c10 = (bsVar != null ? bsVar.c(dp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.bs bsVar2 = this.Q0;
            if (bsVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.bs bsVar3 = this.I0.F1;
                bsVar2.setTranslationY(c10 - ((bsVar3 != null ? bsVar3.getMetadata().c.a : 0.0f) * dp2));
                org.telegram.ui.Components.bs bsVar4 = this.Q0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                r2 = bsVar4.c(AndroidUtilities.lerp(dp3, dp4, this.I0.F1 != null ? r5.getMetadata().c.a : 0.0f)) + c10;
            } else {
                r2 = c10;
            }
        } else {
            org.telegram.ui.Components.bs bsVar5 = this.Q0;
            if (bsVar5 != null) {
                r2 = 0.0f + bsVar5.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.J.setPadding(0, (int) r2, 0, this.a1 + this.Y0 + (this.R ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void B0() {
        this.W.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.J);
        R0();
    }

    public final void C0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.P = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.P = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(9));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.q7));
        }
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ boolean F() {
        return false;
    }

    public final void F0(boolean z10, boolean z11) {
        this.h.e(!z10, this.fragmentBeginToShow && z11);
    }

    public final void G0(boolean z10) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z10 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.K4(this.F);
        profileActivity.N4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ long H() {
        return 0L;
    }

    public final void I0(int i9) {
        if (this.I != i9) {
            this.I = i9;
            this.H.setTextColorKey(i9 == 0 ? org.telegram.ui.ActionBar.f6.Ae : org.telegram.ui.ActionBar.f6.q7);
            this.S0.setVisibility(i9 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ce1 ce1Var = this.d;
        if (ce1Var != null) {
            if (z10) {
                ce1Var.setLayerType(2, null);
                ce1Var.setClipChildren(false);
                ce1Var.setClipToPadding(false);
            } else {
                ce1Var.setLayerType(0, null);
                ce1Var.setClipChildren(true);
                ce1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.O0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ge1 ge1Var = this.J;
        if (ge1Var != null) {
            float C = j3.r0.C(1.0f, this.O0, 0.05f, 1.0f);
            ge1Var.setPivotX(0.0f);
            ge1Var.setPivotY(0.0f);
            ge1Var.setScaleX(C);
            ge1Var.setScaleY(C);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(C);
            this.actionBar.setScaleY(C);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void M0(org.telegram.ui.Cells.r2 r2Var) {
        final int i9 = 0;
        try {
            r2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i10 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = r2Var.J;
        org.telegram.ui.Components.fo foVar = new org.telegram.ui.Components.fo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new be1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(foVar.f);
        foVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        foVar.d(j11, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vd1
                public final /* synthetic */ we1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            we1 we1Var = this.b;
                            we1Var.y0 = true;
                            we1Var.J0 = true;
                            we1Var.s.pinTopic(we1Var.a, tL_forumTopic.id, !r0.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            break;
                        case 1:
                            we1 we1Var2 = this.b;
                            we1Var2.J0 = true;
                            TopicsController topicsController = we1Var2.s;
                            long j12 = we1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            we1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            we1 we1Var3 = this.b;
                            we1Var3.C0(hashSet, new td1(we1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var);
        }
        org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.id)) {
            g1Var2.g(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            g1Var2.g(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        g1Var2.setMinimumWidth(160);
        g1Var2.setOnClickListener(new ih.p5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vd1
                public final /* synthetic */ we1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            we1 we1Var = this.b;
                            we1Var.y0 = true;
                            we1Var.J0 = true;
                            we1Var.s.pinTopic(we1Var.a, tL_forumTopic.id, !r0.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            break;
                        case 1:
                            we1 we1Var2 = this.b;
                            we1Var2.J0 = true;
                            TopicsController topicsController = we1Var2.s;
                            long j12 = we1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            we1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            we1 we1Var3 = this.b;
                            we1Var3.C0(hashSet, new td1(we1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.f6.p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.q7));
            g1Var4.setMinimumWidth(160);
            final int i11 = 2;
            g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.vd1
                public final /* synthetic */ we1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            we1 we1Var = this.b;
                            we1Var.y0 = true;
                            we1Var.J0 = true;
                            we1Var.s.pinTopic(we1Var.a, tL_forumTopic.id, !r0.pinned, we1Var);
                            we1Var.finishPreviewFragment();
                            break;
                        case 1:
                            we1 we1Var2 = this.b;
                            we1Var2.J0 = true;
                            TopicsController topicsController = we1Var2.s;
                            long j12 = we1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            we1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            we1 we1Var3 = this.b;
                            we1Var3.C0(hashSet, new td1(we1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
        if (this.L0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.L0.setBackground(new BitmapDrawable(createBitmap));
            this.L0.setAlpha(0.0f);
            if (this.L0.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.L0, g7.e6.c(-1.0f, -1));
        }
        qn qnVar = new qn(e2.c.g(j10, "chat_id"));
        vf.c.a(qnVar, MessagesStorage.TopicKey.of(j11, isMonoForum ? DialogObject.getPeerDialogId(r2Var.J.from_id) : r2Var.J.id));
        presentFragmentAsPreviewWithMenu(qnVar, r32[0]);
    }

    public final void N0(View view) {
        se1 se1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z10;
        if (!(view instanceof se1) || (tL_forumTopic = (se1Var = (se1) view).J) == null) {
            return;
        }
        int i9 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i9);
        HashSet hashSet = this.W;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i9));
        }
        se1Var.U(hashSet.contains(Integer.valueOf(i9)), true);
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.r();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.z j11 = this.actionBar.j(null);
            if (this.inPreviewMode) {
                j11.setBackgroundColor(0);
                j11.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(j11.getContext());
            this.Y = numberTextView;
            numberTextView.setTextSize(18);
            this.Y.setTypeface(AndroidUtilities.bold());
            this.Y.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y8));
            j11.addView(this.Y, g7.e6.m(1.0f, 0, -1, 72, 0, 0));
            this.Y.setOnTouchListener(new wd1(0));
            this.Z = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.a0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.b0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.c0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.w0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.d0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.w0 h10 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.e0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.w0 h11 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.i0 = h11;
            this.f0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.g0 = this.i0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.h0 = this.i0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.N(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
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
                    i10++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i13++;
                    } else {
                        i12++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, intValue)) {
                i11++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i10 > 0) {
            this.f0.setVisibility(0);
            this.f0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
        } else {
            this.f0.setVisibility(8);
        }
        if (i11 != 0) {
            this.x0 = false;
            this.b0.setIcon(R.drawable.msg_unmute);
            this.b0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            z10 = true;
        } else {
            z10 = true;
            this.x0 = true;
            this.b0.setIcon(R.drawable.msg_mute);
            this.b0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
        }
        this.Z.setVisibility((i12 == z10 && i13 == 0) ? 0 : 8);
        this.a0.setVisibility((i13 == z10 && i12 == 0) ? 0 : 8);
        this.Y.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i16++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i18++;
                        } else {
                            i17++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i14++;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        this.g0.setVisibility((i14 != 0 || i15 <= 0) ? 8 : 0);
        this.g0.setText(LocaleController.getString(i15 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.h0.setVisibility((i15 != 0 || i14 <= 0) ? 8 : 0);
        this.h0.setText(LocaleController.getString(i14 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.c0.setVisibility(i16 == hashSet3.size() ? 0 : 8);
        this.d0.setVisibility((i17 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.e0.setVisibility((i18 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.i0.l();
        R0();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(boolean z10) {
        long j10;
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
        boolean v = org.telegram.messenger.l0.v("dialog_bar_report", j12, notificationsSettings, false);
        boolean v4 = org.telegram.messenger.l0.v("dialog_bar_block", j12, notificationsSettings, false);
        boolean z15 = this.p0;
        if (z15) {
            j10 = 0;
            if (this.s0) {
                this.f.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.r0) {
                this.f.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (this.t0) {
                this.f.setTitle(LocaleController.getString(R.string.BotShareToTopic));
            } else if (this.q0) {
                this.f.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else {
                this.f.setTitle(LocaleController.getString(R.string.SelectTopic));
            }
            this.l0.setVisibility(8);
            org.telegram.ui.Components.tn tnVar = this.f;
            if (tnVar != null && tnVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.l0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.f.setTitle(chat.title);
                this.f.j(null, getMessagesController().isDialogMuted(j12, 0L) ? getThemedDrawable("drawableMuteIcon") : null);
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
            if (chatFull2 != null && (chatFull = this.F) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.F = chatFull2;
            if (chatFull2 != null) {
                int i9 = chatFull2.participants_count;
                if (i9 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    string = chat3 == null ? LocaleController.getString(R.string.Loading) : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    j10 = 0;
                } else {
                    j10 = 0;
                    string = LocaleController.formatPluralString("Members", i9, new Object[0]);
                }
            } else {
                j10 = 0;
                string = LocaleController.getString(R.string.Loading);
            }
            this.f.setSubtitle(string);
        }
        boolean z16 = this.fragmentBeginToShow || z10;
        long j13 = MessagesController.getNotificationsSettings(this.currentAccount).getLong(aa.d.m(j12, "dialog_join_requested_time_"), -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j13 > j10 && System.currentTimeMillis() - j13 < 120000) {
            this.H.a(LocaleController.getString(R.string.ChannelJoinRequestSent), z16);
            this.H.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.j0, false, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.H, true, 0.5f, z16);
            I0(0);
        } else if (chat != null && !z15 && (ChatObject.isNotInChat(chat) || getMessagesController().isJoiningChannel(chat.id))) {
            if (getMessagesController().isJoiningChannel(chat.id)) {
                z13 = true;
                z12 = true;
            } else {
                if (chat.join_request) {
                    this.H.setText(LocaleController.getString(R.string.ChannelJoinRequest));
                } else {
                    this.H.setText(LocaleController.getString(R.string.ChannelJoin));
                }
                z12 = true;
                this.H.setClickable(true);
                this.H.setEnabled(true);
                z13 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.j0, z13, 0.5f, z16);
            AndroidUtilities.updateViewVisibilityAnimated(this.H, z13 ^ z12, 0.5f, z16);
            I0(0);
        } else {
            if (!z14 || (!v4 && !v)) {
                z11 = false;
                if (this.R != z11) {
                    this.R = z11;
                    this.k0.animate().setListener(null).cancel();
                    if (z16) {
                        this.k0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new ee1(this, z11, 1));
                    } else {
                        this.k0.setVisibility(z11 ? 0 : 8);
                        this.k0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                A0();
                this.m0.setVisibility(!z15 ? 8 : 0);
                this.N.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : 8);
                this.P.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.F) || ChatObject.hasAdminRights(chat))) ? 8 : 0);
                this.O.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? 8 : 0);
                this.Q.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? 8 : 0);
                Q0(true);
                this.D0 = getMessagesController().getGroupCall(j11, true);
                y0(false);
            }
            this.H.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
            this.H.setClickable(true);
            this.H.setEnabled(true);
            AndroidUtilities.updateViewVisibilityAnimated(this.j0, false, 0.5f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.H, true, 0.5f, false);
            I0(1);
        }
        z11 = true;
        if (this.R != z11) {
        }
        A0();
        this.m0.setVisibility(!z15 ? 8 : 0);
        this.N.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : 8);
        this.P.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.F) || ChatObject.hasAdminRights(chat))) ? 8 : 0);
        this.O.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? 8 : 0);
        this.Q.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? 8 : 0);
        Q0(true);
        this.D0 = getMessagesController().getGroupCall(j11, true);
        y0(false);
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.j0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ae));
        this.h.g();
        b81 b81Var = this.k0;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        b81Var.setBackgroundColor(getThemedColor(i9));
        this.actionBar.setActionModeColor(getThemedColor(i9));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.s8));
        }
        this.n0.setBackgroundColor(getThemedColor(i9));
    }

    public final void Q0(boolean z10) {
        if (this.M == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        boolean z11 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j10))) || this.o0 || this.p0 || this.F0) ? false : true;
        this.G = z11;
        this.M.setVisibility(z11 ? 0 : 8);
        F0(!this.G, z10);
    }

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.mg0
    public final /* synthetic */ boolean R(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void R0() {
        boolean z10 = ChatObject.canManageTopics(g()) && !this.W.isEmpty();
        if (this.X != z10) {
            this.X = z10;
            ke1 ke1Var = this.r;
            ke1Var.q(0, ke1Var.h());
        }
    }

    public final void S0(float f10) {
        this.S = f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.y8;
        kVar.C(i0.a.d(this.S, themedColor, getThemedColor(i9)), false);
        this.actionBar.C(i0.a.d(this.S, getThemedColor(i9), getThemedColor(i9)), true);
        this.actionBar.A(i0.a.d(this.S, getThemedColor(org.telegram.ui.ActionBar.f6.t8), getThemedColor(org.telegram.ui.ActionBar.f6.z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.S, getThemedColor(org.telegram.ui.ActionBar.f6.s8), getThemedColor(org.telegram.ui.ActionBar.f6.d6)));
        }
        float f11 = 1.0f - f10;
        this.f.getTitleTextView().setAlpha(f11);
        this.f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.m71 m71Var = this.W0;
        if (m71Var != null) {
            m71Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
            this.W0.setAlpha(f10);
        }
        this.n0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        this.n0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.J.setAlpha(f11);
        if (this.V0) {
            float z10 = e2.c.z(1.0f, this.S, 0.02f, 0.98f);
            this.J.setScaleX(z10);
            this.J.setScaleY(z10);
        }
    }

    public final void T0() {
        ih.b5 b5Var = this.z0;
        if (b5Var == null || b5Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.ic_ab_other, 0);
        eqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        if (ChatObject.canUserDoAdminAction(g(), 15)) {
            this.z0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.a, 1L);
        if (findTopic != null) {
            string = findTopic.title;
        }
        this.z0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    public final void U0(boolean z10, boolean z11) {
        xd1 xd1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z10 && this.J0) {
            z10 = true;
        }
        this.J0 = false;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.q0) {
                arrayList.add(new me1(3, null));
            }
            for (int i9 = 0; i9 < topics.size(); i9++) {
                HashSet hashSet = this.w0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i9).id))) {
                    arrayList.add(new me1(0, topics.get(i9)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.R0) {
                arrayList.add(new me1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.G0.b(size + 4);
                z10 = false;
            }
            this.x = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                me1 me1Var = (me1) arrayList.get(i10);
                if (me1Var != null && (tL_forumTopic = me1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            ge1 ge1Var = this.J;
            if (ge1Var != null) {
                if (ge1Var.getItemAnimator() != (z10 ? this.E0 : null)) {
                    this.J.setItemAnimator(z10 ? this.E0 : null);
                }
            }
            ke1 ke1Var = this.r;
            if (ke1Var != null) {
                ke1Var.E(arrayList2, arrayList);
            }
            if ((this.y0 || size == 0) && (xd1Var = this.B) != null) {
                xd1Var.h1(0, 0);
                this.y0 = false;
            }
        }
        z0();
        T0();
    }

    @Override // org.telegram.ui.Components.rg, org.telegram.ui.Components.x40
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ long b() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        dy dyVar = this.I0;
        final int i9 = 0;
        this.Y0 = (dyVar == null || !dyVar.S) ? 0 : AndroidUtilities.dp(72.0f);
        dy dyVar2 = this.I0;
        this.Z0 = (dyVar2 == null || !dyVar2.S) ? 0 : AndroidUtilities.dp(64.0f);
        ce1 ce1Var = new ce1(this, context);
        this.d = ce1Var;
        this.fragmentView = ce1Var;
        ce1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i10 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        org.telegram.ui.Cells.j2.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new fe1(this, context));
        final int i11 = 2;
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd1
            public final /* synthetic */ we1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i11) {
                    case 0:
                        we1 we1Var = this.b;
                        we1Var.presentFragment(rd1.Z(we1Var.a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.b;
                        if (!we1Var3.o0) {
                            we1Var3.G0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        dy dyVar3 = this.b.I0;
                        if (dyVar3 != null && (w0Var = dyVar3.f0) != null) {
                            w0Var.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i12 = 17;
        final int i13 = 4;
        if (this.I0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.l0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd1
                public final /* synthetic */ we1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i13) {
                        case 0:
                            we1 we1Var = this.b;
                            we1Var.presentFragment(rd1.Z(we1Var.a, 0L));
                            break;
                        case 1:
                            we1 we1Var2 = this.b;
                            we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.a, null, we1Var2.g());
                            we1Var2.O0(false);
                            break;
                        case 2:
                            we1 we1Var3 = this.b;
                            if (!we1Var3.o0) {
                                we1Var3.G0(false);
                                break;
                            }
                            break;
                        case 3:
                            this.b.finishPreviewFragment();
                            break;
                        default:
                            dy dyVar3 = this.b.I0;
                            if (dyVar3 != null && (w0Var = dyVar3.f0) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a3 = n10.a(0, R.drawable.outline_header_search);
            this.l0 = a3;
            a3.F();
            a3.D = new cb(this, i12);
            this.l0.setSearchPaddingStart(56);
            this.l0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.l0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.f6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.ic_ab_other, null);
        this.m0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.m0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.N = this.m0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.m0;
        this.P = w0Var.d(14, 0, new org.telegram.ui.Components.mi0(R.raw.boosts, AndroidUtilities.dp(24.0f), "" + R.raw.boosts, AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.i0);
        int i14 = 3;
        this.M = this.m0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.Q = this.m0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.O = this.m0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(context, this, false, this.resourceProvider);
        this.f = tnVar;
        tnVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        org.telegram.ui.Components.tn tnVar2 = this.f;
        long j10 = -this.a;
        tnVar2.b = j10 < 0;
        tnVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, g7.e6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.p0) {
            this.f.getAvatarImageView().setOnClickListener(new x7(this, i14));
        }
        this.J = new ge1(this, context);
        pg.i iVar = new pg.i(this.d);
        ViewGroup viewGroup = this.d;
        ig.a aVar = this.e1;
        aVar.d = iVar;
        aVar.e = viewGroup;
        ge1 ge1Var = this.J;
        dy dyVar3 = this.I0;
        if (dyVar3 != null) {
            viewGroup = (ViewGroup) dyVar3.getFragmentView();
        }
        ge1 ge1Var2 = this.J;
        Objects.requireNonNull(ge1Var2);
        this.f1 = new ig.k(ge1Var, viewGroup, new u8(ge1Var2, i11));
        this.J.C0(new td1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        vf.b c11 = vf.c.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = kwVar;
        kwVar.b();
        int i15 = this.A ? 2 : 0;
        this.y = i15;
        this.w.X = i15 != 0;
        ie1 ie1Var = new ie1(this);
        this.J.setHideIfEmpty(false);
        ie1Var.m = false;
        ie1Var.C = false;
        ge1 ge1Var3 = this.J;
        this.E0 = ie1Var;
        ge1Var3.setItemAnimator(ie1Var);
        this.J.setOnScrollListener(new yd1(this, i10));
        ge1 ge1Var4 = this.J;
        ge1Var4.U1 = true;
        ge1Var4.V1 = 0;
        org.telegram.ui.Components.dk0 dk0Var = new org.telegram.ui.Components.dk0(ge1Var4, true);
        this.G0 = dk0Var;
        this.J.setItemsEnterAnimator(dk0Var);
        this.J.setOnItemClickListener(new c21(this, 8));
        this.J.setOnItemLongClickListener(new ud1(this));
        this.J.setOnScrollListener(new yd1(this, i11));
        ge1 ge1Var5 = this.J;
        xd1 xd1Var = new xd1(this);
        this.B = xd1Var;
        ge1Var5.setLayoutManager(xd1Var);
        new SparseArray();
        new HashMap();
        this.J.setAdapter(this.r);
        this.J.setClipToPadding(false);
        this.J.j(new yd1(this, i9));
        ve1 ve1Var = new ve1(this);
        this.L = ve1Var;
        zd1 zd1Var = new zd1(this, ve1Var);
        this.K = zd1Var;
        zd1Var.d(this.J);
        this.d.addView(this.J, g7.e6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(getParentActivity(), this.resourceProvider, false);
        this.h = j10Var;
        this.d.addView(j10Var, org.telegram.ui.Components.j10.b());
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd1
            public final /* synthetic */ we1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i9) {
                    case 0:
                        we1 we1Var = this.b;
                        we1Var.presentFragment(rd1.Z(we1Var.a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.b;
                        if (!we1Var3.o0) {
                            we1Var3.G0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        dy dyVar32 = this.b.I0;
                        if (dyVar32 != null && (w0Var2 = dyVar32.f0) != null) {
                            w0Var2.performClick();
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
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(24);
        e00Var.setVisibility(8);
        e00Var.w = true;
        le1 le1Var = new le1(context);
        TextView textView = new TextView(context);
        le1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        boolean z10 = LocaleController.isRTL;
        le1Var.addView(textView, g7.e6.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = le1Var;
        textView.setAlpha(0.0f);
        ih.b5 b5Var = new ih.b5(this, context, e00Var);
        this.z0 = b5Var;
        try {
            b5Var.b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.z0.e(this.F0, this.fragmentBeginToShow);
        this.z0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.n.addView(e00Var);
        this.n.addView(this.z0);
        this.d.addView(this.n);
        this.J.setEmptyView(this.n);
        this.k0 = new b81(context, 5);
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context);
        this.H = k51Var;
        this.k0.addView(k51Var);
        this.d.addView(this.k0, g7.e6.e(-1, 51, 80));
        this.H.setOnClickListener(new ae1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.j0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.j0.setVisibility(4);
        this.k0.addView(this.j0, g7.e6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.S0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.S0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.S0;
        int i16 = org.telegram.ui.ActionBar.f6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.v5.c(null, org.telegram.ui.ActionBar.v5.b(getThemedColor(i16))));
        this.S0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
        this.S0.setScaleType(ImageView.ScaleType.CENTER);
        this.k0.addView(this.S0, g7.e6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.S0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd1
            public final /* synthetic */ we1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i10) {
                    case 0:
                        we1 we1Var = this.b;
                        we1Var.presentFragment(rd1.Z(we1Var.a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.b;
                        if (!we1Var3.o0) {
                            we1Var3.G0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        dy dyVar32 = this.b.I0;
                        if (dyVar32 != null && (w0Var2 = dyVar32.f0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.S0.setVisibility(8);
        O0(false);
        m0 m0Var = new m0(this, context, 25);
        this.e = m0Var;
        if (this.I0 == null) {
            this.d.addView(m0Var, g7.e6.e(-1, -1, 119));
        }
        re1 re1Var = new re1(this, context);
        this.n0 = re1Var;
        re1Var.setVisibility(8);
        this.e.addView(this.n0, g7.e6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        re1 re1Var2 = this.n0;
        int i17 = org.telegram.ui.ActionBar.f6.d6;
        re1Var2.setBackgroundColor(getThemedColor(i17));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.bs bsVar = new org.telegram.ui.Components.bs(context);
        this.Q0 = bsVar;
        bsVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        kg.d c12 = aVar.c(this.Q0, mg.c.m(this.resourceProvider), false);
        c12.p(AndroidUtilities.dp(24.0f));
        c12.o(AndroidUtilities.dp(7.0f));
        this.Q0.setBlurredBackground(c12);
        this.Q0.setOnAnimatedHeightChangedListener(new td1(this, i9));
        this.d.addView(this.Q0, g7.e6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            eh.e eVar = new eh.e(g10, this);
            this.N0 = eVar;
            this.Q0.addView(eVar.c(), g7.e6.n(-1, 40));
            this.Q0.h(3, this.N0.c());
            this.Q0.g(this.N0.c());
            eh.e eVar2 = this.N0;
            eVar2.m = new ud1(this);
            TLRPC.ChatFull chatFull = this.F;
            eVar2.j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.B0 = frameLayout;
            this.Q0.addView(frameLayout);
            this.Q0.h(4, this.B0);
            this.Q0.g(this.B0);
            this.Q0.i(this.B0, true, false);
            w8 w8Var = new w8(this, context, this);
            this.C0 = w8Var;
            this.B0.addView(w8Var);
            this.Q0.setCallFragmentContextView(this.C0);
        }
        FrameLayout.LayoutParams c13 = g7.e6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c13.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c13);
        }
        x0();
        yi0 yi0Var = new yi0(this, context, 9);
        this.L0 = yi0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            yi0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i17), 100)));
        }
        this.L0.setFocusable(false);
        this.L0.setImportantForAccessibility(2);
        final int i18 = 3;
        this.L0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sd1
            public final /* synthetic */ we1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i18) {
                    case 0:
                        we1 we1Var = this.b;
                        we1Var.presentFragment(rd1.Z(we1Var.a, 0L));
                        break;
                    case 1:
                        we1 we1Var2 = this.b;
                        we1Var2.getMessagesController().hidePeerSettingsBar(-we1Var2.a, null, we1Var2.g());
                        we1Var2.O0(false);
                        break;
                    case 2:
                        we1 we1Var3 = this.b;
                        if (!we1Var3.o0) {
                            we1Var3.G0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        dy dyVar32 = this.b.I0;
                        if (dyVar32 != null && (w0Var2 = dyVar32.f0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.L0.setFitsSystemWindows(true);
        this.R = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) it.next();
                if (o2Var instanceof dy) {
                    dy dyVar4 = (dy) o2Var;
                    if (dyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = dyVar4.l2;
                        if (topicKey.dialogId == j10) {
                            this.M0 = topicKey.topicId;
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new sb(this, 5));
        }
        View view = this.fragmentView;
        ud1 ud1Var = new ud1(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, ud1Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i11 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.a;
        if (i9 == i11) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.F) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j10) {
                O0(false);
                eh.e eVar = this.N0;
                if (eVar != null) {
                    eVar.j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                y0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i9 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i9 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.T = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i9 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    x0();
                }
                z0();
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                O0(false);
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j10, false);
                boolean canScrollVertically = this.J.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.B.n0(0);
                }
            }
        } else if (i9 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i9 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.D0 = getMessagesController().getGroupCall(l10.longValue(), false);
                w8 w8Var = this.C0;
                if (w8Var != null) {
                    w8Var.a(!this.fragmentBeginToShow);
                }
                y0(false);
            }
        } else if (i9 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            O0(true);
        } else if (i9 != NotificationCenter.chatSwitchedForum && i9 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i9 == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j10) || booleanValue) {
                if (this.M0 != 0) {
                    this.M0 = 0L;
                    U0(false, false);
                    return;
                }
                return;
            }
            if (this.M0 != longValue2) {
                this.M0 = longValue2;
                U0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.rg
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.rg
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.D0;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.wk0 wk0Var;
        sx0 sx0Var = new sx0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, sx0Var, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        re1 re1Var = this.n0;
        if (re1Var != null && (wk0Var = re1Var.Q) != null) {
            org.telegram.ui.Cells.v3.a(arrayList, wk0Var);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.o0 ? org.telegram.ui.ActionBar.f6.d6 : org.telegram.ui.ActionBar.f6.s8);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.w8);
        }
        return i0.a.f(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.rg
    public final org.telegram.ui.Components.tn o() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.W.isEmpty()) {
            if (!this.o0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.v(this.l0.L(false));
            }
        } else if (z10) {
            B0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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
        b61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = j1;
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        this.K0.unlock();
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
        dy dyVar = this.I0;
        if (dyVar == null || dyVar.B3 == null) {
            return;
        }
        dyVar.getActionBar().setSearchAvatarImageView(null);
        this.I0.B3.I = true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.a);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.a;
        topicsController.onTopicFragmentResume(j10);
        this.C = false;
        AndroidUtilities.updateVisibleRows(this.J);
        this.C = true;
        setBulletinDelegate(new x8(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onSlideProgress(boolean z10, float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.P0) {
            L0(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        yw ywVar;
        yi0 yi0Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (yi0Var = this.L0) != null) {
            if (yi0Var.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            this.L0.setBackground(null);
        }
        if (z10) {
            y0(false);
        }
        this.K0.unlock();
        if (z10) {
            return;
        }
        if (this.p0 && this.D) {
            removeSelfFromStack();
            dy dyVar = this.H0;
            if (dyVar != null) {
                dyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.E) {
            removeSelfFromStack();
            dy dyVar2 = this.I0;
            if (dyVar2 == null || (ywVar = dyVar2.B3) == null || !ywVar.c()) {
                return;
            }
            this.I0.B3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        yi0 yi0Var = this.L0;
        if (yi0Var == null || yi0Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.L0.setAlpha(1.0f - f10);
        } else {
            this.L0.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.K0.lock();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.P0 = true;
            K0(true);
        } else {
            this.P0 = false;
            K0(false);
            L0(1.0f);
        }
    }

    @Override // org.telegram.ui.mg0
    public final void s() {
        this.J.x0(0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.tn tnVar = this.f;
        if (tnVar != null) {
            tnVar.setAlpha(f10);
            this.m0.setAlpha(f10);
            org.telegram.ui.ActionBar.w0 w0Var = this.l0;
            if (w0Var != null) {
                w0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.tn tnVar = this.f;
        if (tnVar != null) {
            tnVar.setAlpha(f10);
            this.f.setTranslationX((1.0f - f10) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void w0() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.b1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.Q0.c(AndroidUtilities.dp(14.0f)));
        dy dyVar = this.I0;
        View view = dyVar != null ? dyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = dyVar != null ? dyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.a1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.h1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.i1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.I0 != null ? 2 : 1, this.g1);
        eVar.e(this.f1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void x0() {
        xd1 xd1Var;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        if (topicsController.endIsReached(j10) || (xd1Var = this.B) == null) {
            return;
        }
        int N0 = xd1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        z0();
    }

    @Override // org.telegram.ui.mg0
    public final ng.d y() {
        return this.d1;
    }

    public final void y0(boolean z10) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (this.D0 != null && ((str = this.u0) != null || this.v0)) {
            org.telegram.ui.Components.voip.e2.m(chat, str, false, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.u0 = null;
            this.v0 = false;
        } else {
            if (this.u0 == null || !z10 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            org.telegram.messenger.l0.p(R.string.LinkHashExpired, org.telegram.ui.Components.oc.a0(this), R.raw.linkbroken, 36);
            this.u0 = null;
        }
    }

    @Override // org.telegram.ui.Components.rg
    public final org.telegram.ui.Components.xu0 z() {
        return this.d;
    }

    public final void z0() {
        this.F0 = this.s.isLoading(this.a);
        if (this.z0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((me1) arrayList.get(0)).c != null && ((me1) arrayList.get(0)).c.id == 1)) {
                this.z0.e(this.F0, this.fragmentBeginToShow);
            }
        }
        ge1 ge1Var = this.J;
        if (ge1Var != null) {
            ge1Var.J0(ge1Var.u1());
        }
        Q0(true);
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ void j(int i9, int i10, boolean z10, int i11, boolean z11, int i12) {
    }
}
