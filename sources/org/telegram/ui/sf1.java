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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class sf1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.rg, wg0 {
    public static final HashSet k1 = new HashSet();
    public nh.y4 A0;
    public boolean B;
    public gf1 B0;
    public te1 C;
    public FrameLayout C0;
    public boolean D;
    public b9 D0;
    public boolean E;
    public ChatObject.Call E0;
    public boolean F;
    public ff1 F0;
    public TLRPC.ChatFull G;
    public boolean G0;
    public boolean H;
    public org.telegram.ui.Components.yk0 H0;
    public org.telegram.ui.Components.i61 I;
    public qy I0;
    public int J;
    public qy J0;
    public df1 K;
    public boolean K0;
    public ve1 L;
    public final AnimationNotificationsLocker L0;
    public rf1 M;
    public nw0 M0;
    public org.telegram.ui.ActionBar.g1 N;
    public long N0;
    public org.telegram.ui.ActionBar.g1 O;
    public jh.e O0;
    public org.telegram.ui.ActionBar.g1 P;
    public float P0;
    public org.telegram.ui.ActionBar.g1 Q;
    public boolean Q0;
    public org.telegram.ui.ActionBar.g1 R;
    public org.telegram.ui.Components.is R0;
    public boolean S;
    public final boolean S0;
    public float T;
    public ImageView T0;
    public TL_stories.TL_premium_boostsStatus U;
    public float U0;
    public long V;
    public ValueAnimator V0;
    public boolean W;
    public boolean W0;
    public final HashSet X;
    public org.telegram.ui.Components.k81 X0;
    public boolean Y;
    public View Y0;
    public NumberTextView Z;
    public int Z0;
    public final long a;
    public org.telegram.ui.ActionBar.w0 a0;
    public int a1;
    public final ArrayList b;
    public org.telegram.ui.ActionBar.w0 b0;
    public int b1;
    public int c;
    public org.telegram.ui.ActionBar.w0 c0;
    public final ng.e c1;
    public ye1 d;
    public org.telegram.ui.ActionBar.w0 d0;
    public final sg.d d1;
    public n0 e;
    public org.telegram.ui.ActionBar.w0 e0;
    public final sg.d e1;
    public org.telegram.ui.Components.yn f;
    public org.telegram.ui.ActionBar.w0 f0;
    public final ng.a f1;
    public org.telegram.ui.ActionBar.g1 g0;
    public ng.k g1;
    public org.telegram.ui.Components.a20 h;
    public org.telegram.ui.ActionBar.g1 h0;
    public final ArrayList h1;
    public org.telegram.ui.ActionBar.g1 i0;
    public final RectF i1;
    public org.telegram.ui.ActionBar.w0 j0;
    public final RectF j1;
    public RadialProgressView k0;
    public h51 l0;
    public org.telegram.ui.ActionBar.w0 m0;
    public if1 n;
    public org.telegram.ui.ActionBar.w0 n0;
    public of1 o0;
    public boolean p0;
    public final boolean q0;
    public final hf1 r;
    public final boolean r0;
    public final TopicsController s;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public tf1 v;
    public String v0;
    public xw w;
    public boolean w0;
    public int x;
    public HashSet x0;
    public int y;
    public boolean y0;
    public boolean z0;

    public sf1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new hf1(this);
        this.x = 0;
        this.B = true;
        this.D = true;
        this.S = true;
        this.T = 0.0f;
        this.X = new HashSet();
        this.y0 = false;
        this.L0 = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.P0 = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.h1 = arrayList;
        RectF rectF = new RectF();
        this.i1 = rectF;
        RectF rectF2 = new RectF();
        this.j1 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j10 = this.arguments.getLong("chat_id", 0L);
        this.a = j10;
        this.q0 = this.arguments.getBoolean("for_select", false);
        this.r0 = this.arguments.getBoolean("forward_to", false);
        this.u0 = this.arguments.getBoolean("bot_share_to", false);
        this.s0 = this.arguments.getBoolean("quote", false);
        this.t0 = this.arguments.getBoolean("reply_to", false);
        this.v0 = this.arguments.getString("voicechat", null);
        this.w0 = this.arguments.getBoolean("videochat", false);
        this.s = getMessagesController().getTopicsController();
        this.S0 = true ^ org.telegram.messenger.y3.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        sg.c cVar = new sg.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.c1 = null;
            this.d1 = null;
            this.e1 = null;
            this.f1 = new ng.a(cVar);
            return;
        }
        this.c1 = new ng.e(false);
        this.d1 = new sg.d(null);
        sg.d dVar = new sg.d(null);
        this.e1 = dVar;
        ng.a aVar = new ng.a(dVar);
        this.f1 = aVar;
        aVar.f = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.p2 E0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j10 = bundle.getLong("chat_id");
        if (j10 != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j10);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new zn(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j10);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j10, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new zn(bundle);
            }
        }
        return new sf1(bundle);
    }

    public static org.telegram.ui.ActionBar.p2 F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(MessagesController.getInstance(launchActivity.L), MessagesStorage.getInstance(launchActivity.L), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.sf1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I0(zn znVar) {
        if (znVar.getParentLayout() == null) {
            return;
        }
        if (znVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) znVar.getParentLayout().getFragmentStack().get(znVar.getParentLayout().getFragmentStack().size() - 2);
            if (p2Var instanceof sf1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -znVar.a());
        ((ActionBarLayout) znVar.getParentLayout()).c(znVar.getParentLayout().getFragmentStack().size() - 1, new sf1(bundle));
        znVar.ga = true;
        znVar.finishFragment();
    }

    public static boolean U(sf1 sf1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(sf1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-sf1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = sf1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(sf1Var.g());
        int i10 = org.telegram.ui.Components.i80.r;
        org.telegram.ui.Components.i80.w(parentActivity, sf1Var, org.telegram.ui.Components.qc.a0(sf1Var), isChannelAndNotMegaGroup);
        sf1Var.O0(true);
        return false;
    }

    public static void V(sf1 sf1Var, View view) {
        long j10 = sf1Var.a;
        if (sf1Var.getParentLayout() == null || ((ActionBarLayout) sf1Var.getParentLayout()).y() || !(view instanceof pf1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((pf1) view).K;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : sf1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (sf1Var.q0) {
            tf1 tf1Var = sf1Var.v;
            if (tf1Var != null) {
                vf1 vf1Var = tf1Var.a;
                Bundle bundle = new Bundle();
                yf1 yf1Var = vf1Var.a;
                bundle.putLong("dialog_id", yf1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                l11 l11Var = new l11(bundle, null);
                l11Var.r = new vl0(25, vf1Var, tL_forumTopic);
                yf1Var.presentFragment(l11Var);
            }
            qy qyVar = sf1Var.I0;
            if (qyVar != null) {
                qyVar.O3(j11, peerDialogId, true, sf1Var);
                return;
            }
            return;
        }
        if (sf1Var.X.size() > 0) {
            sf1Var.N0(view);
            return;
        }
        if (sf1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.p2 p2Var : sf1Var.getParentLayout().getFragmentStack()) {
                if (p2Var instanceof qy) {
                    qy qyVar2 = (qy) p2Var;
                    if (qyVar2.h4()) {
                        MessagesStorage.TopicKey topicKey = qyVar2.m2;
                        if (topicKey.dialogId == j11 && topicKey.topicId == peerDialogId) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            sf1Var.N0 = peerDialogId;
            sf1Var.U0(false, false);
        }
        ag.f.m(sf1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean W(sf1 sf1Var, View view, float f10) {
        if (sf1Var.q0 || sf1Var.getParentLayout() == null || ((ActionBarLayout) sf1Var.getParentLayout()).y()) {
            return false;
        }
        if (!sf1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof pf1)) {
            pf1 pf1Var = (pf1) view;
            if (pf1Var.S(f10)) {
                sf1Var.M0(pf1Var);
                sf1Var.K.I0(true);
                sf1Var.K.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        sf1Var.N0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void X(sf1 sf1Var) {
        ViewGroup viewGroup;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                viewGroup = sf1Var.K;
            } else {
                of1 of1Var = sf1Var.o0;
                viewGroup = of1Var != null ? of1Var.R : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.g6) {
                        ((org.telegram.ui.Cells.g6) childAt).u(0);
                    } else if (childAt instanceof org.telegram.ui.Cells.q2) {
                        ((org.telegram.ui.Cells.q2) childAt).b0(0, true);
                    } else if (childAt instanceof org.telegram.ui.Cells.ua) {
                        ((org.telegram.ui.Cells.ua) childAt).j(0);
                    }
                }
            }
        }
        org.telegram.ui.ActionBar.k kVar = sf1Var.actionBar;
        if (kVar != null) {
            kVar.D(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.G8), true);
            sf1Var.actionBar.E(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.E8), false, true);
            sf1Var.actionBar.E(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.F8), true, true);
            sf1Var.actionBar.F(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.I5), true);
        }
        nw0 nw0Var = sf1Var.M0;
        if (nw0Var != null && Build.VERSION.SDK_INT >= 23) {
            nw0Var.setForeground(new ColorDrawable(i0.a.k(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6), 100)));
        }
        sf1Var.P0();
    }

    public static void b0(sf1 sf1Var, boolean z4) {
        lx lxVar;
        sf1Var.p0 = z4;
        ValueAnimator valueAnimator = sf1Var.V0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            sf1Var.V0.cancel();
        }
        int i10 = 0;
        if (sf1Var.X0 == null) {
            org.telegram.ui.Components.k81 n10 = sf1Var.o0.n(8, false);
            sf1Var.X0 = n10;
            if (sf1Var.J0 != null) {
                n10.setBackgroundColor(sf1Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
            sf1Var.e.addView(sf1Var.X0, k7.b6.c(44.0f, -1));
        }
        sf1Var.V0 = ValueAnimator.ofFloat(sf1Var.T, z4 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(sf1Var.o0, false, 1.0f, true);
        qy qyVar = sf1Var.J0;
        if (qyVar != null && (lxVar = qyVar.C3) != null) {
            lxVar.J = !z4;
        }
        sf1Var.W0 = !z4 && sf1Var.o0.getVisibility() == 0 && sf1Var.o0.getAlpha() == 1.0f;
        sf1Var.V0.addUpdateListener(new o11(sf1Var, 17));
        sf1Var.o0.setVisibility(0);
        if (z4) {
            AndroidUtilities.requestAdjustResize(sf1Var.getParentActivity(), sf1Var.classGuid);
            sf1Var.Q0(false);
        } else {
            sf1Var.n0.setVisibility(0);
        }
        sf1Var.V0.addListener(new bf1(sf1Var, z4, i10));
        sf1Var.V0.setDuration(200L);
        sf1Var.V0.setInterpolator(org.telegram.ui.Components.mr.f);
        sf1Var.V0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.rg
    public final org.telegram.ui.Components.qv0 A() {
        return this.d;
    }

    public final void A0() {
        this.G0 = this.s.isLoading(this.a);
        if (this.A0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((jf1) arrayList.get(0)).c != null && ((jf1) arrayList.get(0)).c.id == 1)) {
                this.A0.e(this.G0, this.fragmentBeginToShow);
            }
        }
        df1 df1Var = this.K;
        if (df1Var != null) {
            df1Var.J0(df1Var.t1());
        }
        Q0(true);
    }

    public final void B0() {
        qy qyVar = this.J0;
        if (qyVar != null) {
            int dp = AndroidUtilities.dp(14.0f);
            org.telegram.ui.Components.is isVar = qyVar.G1;
            float c3 = (isVar != null ? isVar.c(dp) : 0.0f) + 0.0f;
            org.telegram.ui.Components.is isVar2 = this.R0;
            if (isVar2 != null) {
                float dp2 = AndroidUtilities.dp(7.0f);
                org.telegram.ui.Components.is isVar3 = this.J0.G1;
                isVar2.setTranslationY(c3 - ((isVar3 != null ? isVar3.getMetadata().c.a : 0.0f) * dp2));
                org.telegram.ui.Components.is isVar4 = this.R0;
                int dp3 = AndroidUtilities.dp(14.0f);
                int dp4 = AndroidUtilities.dp(7.0f);
                r2 = isVar4.c(AndroidUtilities.lerp(dp3, dp4, this.J0.G1 != null ? r5.getMetadata().c.a : 0.0f)) + c3;
            } else {
                r2 = c3;
            }
        } else {
            org.telegram.ui.Components.is isVar5 = this.R0;
            if (isVar5 != null) {
                r2 = 0.0f + isVar5.c(AndroidUtilities.dp(14.0f));
            }
        }
        this.K.setPadding(0, (int) r2, 0, this.b1 + this.Z0 + (this.S ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void C0() {
        this.X.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.K);
        R0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            d2Var.Q = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            d2Var.Q = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cl0(8));
        d2Var.show();
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
        }
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ boolean F() {
        return false;
    }

    public final void G0(boolean z4, boolean z10) {
        this.h.e(!z4, this.fragmentBeginToShow && z10);
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ long H() {
        return 0L;
    }

    public final void H0(boolean z4) {
        TLRPC.Chat g10;
        TLRPC.ChatPhoto chatPhoto;
        if (z4 && (g10 = g()) != null && ((chatPhoto = g10.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z4 = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.K4(this.G);
        profileActivity.N4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z4) ? 2 : 1);
        presentFragment(profileActivity);
    }

    public final void J0(int i10) {
        if (this.J != i10) {
            this.J = i10;
            this.I.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.j6.Ae : org.telegram.ui.ActionBar.j6.q7);
            this.T0.setVisibility(i10 == 1 ? 0 : 8);
            O0(false);
        }
    }

    public final void K0(boolean z4) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ye1 ye1Var = this.d;
        if (ye1Var != null) {
            if (z4) {
                ye1Var.setLayerType(2, null);
                ye1Var.setClipChildren(false);
                ye1Var.setClipToPadding(false);
            } else {
                ye1Var.setLayerType(0, null);
                ye1Var.setClipChildren(true);
                ye1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void L0(float f10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.P0 = f10;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        df1 df1Var = this.K;
        if (df1Var != null) {
            float c3 = ai.c(1.0f, this.P0, 0.05f, 1.0f);
            df1Var.setPivotX(0.0f);
            df1Var.setPivotY(0.0f);
            df1Var.setScaleX(c3);
            df1Var.setScaleY(c3);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(c3);
            this.actionBar.setScaleY(c3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void M0(org.telegram.ui.Cells.q2 q2Var) {
        final int i10 = 0;
        try {
            q2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = q2Var.K;
        org.telegram.ui.Components.ko koVar = new org.telegram.ui.Components.ko(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new xe1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(koVar.f);
        koVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        koVar.d(j11, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                g1Var.g(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                g1Var.g(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            g1Var.setMinimumWidth(160);
            g1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.re1
                public final /* synthetic */ sf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            sf1 sf1Var = this.b;
                            sf1Var.z0 = true;
                            sf1Var.K0 = true;
                            sf1Var.s.pinTopic(sf1Var.a, tL_forumTopic.id, !r0.pinned, sf1Var);
                            sf1Var.finishPreviewFragment();
                            break;
                        case 1:
                            sf1 sf1Var2 = this.b;
                            sf1Var2.K0 = true;
                            TopicsController topicsController = sf1Var2.s;
                            long j12 = sf1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            sf1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            sf1 sf1Var3 = this.b;
                            sf1Var3.D0(hashSet, new pe1(sf1Var3, 3));
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
        g1Var2.setOnClickListener(new nh.o5(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(g1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var3 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                g1Var3.g(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                g1Var3.g(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            g1Var3.setMinimumWidth(160);
            g1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.re1
                public final /* synthetic */ sf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            sf1 sf1Var = this.b;
                            sf1Var.z0 = true;
                            sf1Var.K0 = true;
                            sf1Var.s.pinTopic(sf1Var.a, tL_forumTopic.id, !r0.pinned, sf1Var);
                            sf1Var.finishPreviewFragment();
                            break;
                        case 1:
                            sf1 sf1Var2 = this.b;
                            sf1Var2.K0 = true;
                            TopicsController topicsController = sf1Var2.s;
                            long j12 = sf1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            sf1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            sf1 sf1Var3 = this.b;
                            sf1Var3.D0(hashSet, new pe1(sf1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.g1 g1Var4 = new org.telegram.ui.ActionBar.g1(getParentActivity(), false, true);
            g1Var4.g(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            g1Var4.setIconColor(getThemedColor(org.telegram.ui.ActionBar.j6.p7));
            g1Var4.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.q7));
            g1Var4.setMinimumWidth(160);
            final int i12 = 2;
            g1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.re1
                public final /* synthetic */ sf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            sf1 sf1Var = this.b;
                            sf1Var.z0 = true;
                            sf1Var.K0 = true;
                            sf1Var.s.pinTopic(sf1Var.a, tL_forumTopic.id, !r0.pinned, sf1Var);
                            sf1Var.finishPreviewFragment();
                            break;
                        case 1:
                            sf1 sf1Var2 = this.b;
                            sf1Var2.K0 = true;
                            TopicsController topicsController = sf1Var2.s;
                            long j12 = sf1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            sf1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            sf1 sf1Var3 = this.b;
                            sf1Var3.D0(hashSet, new pe1(sf1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(g1Var4);
        }
        boolean isMonoForum = getMessagesController().isMonoForum(j11);
        if (this.M0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.M0.setBackground(new BitmapDrawable(createBitmap));
            this.M0.setAlpha(0.0f);
            if (this.M0.getParent() != null) {
                ((ViewGroup) this.M0.getParent()).removeView(this.M0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.M0, k7.b6.c(-1.0f, -1));
        }
        zn znVar = new zn(kf.k0.g(j10, "chat_id"));
        ag.f.a(znVar, MessagesStorage.TopicKey.of(j11, isMonoForum ? DialogObject.getPeerDialogId(q2Var.K.from_id) : q2Var.K.id));
        presentFragmentAsPreviewWithMenu(znVar, r32[0]);
    }

    public final void N0(View view) {
        pf1 pf1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z4;
        if (!(view instanceof pf1) || (tL_forumTopic = (pf1Var = (pf1) view).K) == null) {
            return;
        }
        int i10 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.X;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        pf1Var.V(hashSet.contains(Integer.valueOf(i10)), true);
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
            this.Z = numberTextView;
            numberTextView.setTextSize(18);
            this.Z.setTypeface(AndroidUtilities.bold());
            this.Z.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y8));
            j11.addView(this.Z, k7.b6.m(1.0f, 0, -1, 72, 0, 0));
            this.Z.setOnTouchListener(new se1(0));
            this.a0 = j11.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.b0 = j11.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.c0 = j11.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.d0 = j11.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.w0 h = j11.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.e0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.w0 h9 = j11.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.f0 = h9;
            h9.setVisibility(8);
            org.telegram.ui.ActionBar.w0 h10 = j11.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.j0 = h10;
            this.g0 = h10.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.h0 = this.j0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.i0 = this.j0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.O(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
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
                    i11++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i14++;
                    } else {
                        i13++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, intValue)) {
                i12++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i11 > 0) {
            this.g0.setVisibility(0);
            this.g0.g(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
        } else {
            this.g0.setVisibility(8);
        }
        if (i12 != 0) {
            this.y0 = false;
            this.c0.setIcon(R.drawable.msg_unmute);
            this.c0.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            z4 = true;
        } else {
            z4 = true;
            this.y0 = true;
            this.c0.setIcon(R.drawable.msg_mute);
            this.c0.setContentDescription(LocaleController.getString(R.string.ChatsMute));
        }
        this.a0.setVisibility((i13 == z4 && i14 == 0) ? 0 : 8);
        this.b0.setVisibility((i14 == z4 && i13 == 0) ? 0 : 8);
        this.Z.a(hashSet3.size(), z4);
        Iterator it2 = hashSet3.iterator();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i17++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i19++;
                        } else {
                            i18++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i15++;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
        this.h0.setVisibility((i15 != 0 || i16 <= 0) ? 8 : 0);
        this.h0.setText(LocaleController.getString(i16 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.i0.setVisibility((i16 != 0 || i15 <= 0) ? 8 : 0);
        this.i0.setText(LocaleController.getString(i15 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.d0.setVisibility(i17 == hashSet3.size() ? 0 : 8);
        this.e0.setVisibility((i18 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.f0.setVisibility((i19 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.j0.l();
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
    public final void O0(boolean z4) {
        long j10;
        boolean z10;
        boolean z11;
        boolean z12;
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
        StringBuilder sb = new StringBuilder("dialog_bar_vis3");
        sb.append(j12);
        boolean z13 = notificationsSettings.getInt(sb.toString(), 0) == 2;
        boolean v = org.telegram.messenger.y3.v("dialog_bar_report", j12, notificationsSettings, false);
        boolean v10 = org.telegram.messenger.y3.v("dialog_bar_block", j12, notificationsSettings, false);
        boolean z14 = this.q0;
        if (z14) {
            j10 = 0;
            if (this.t0) {
                this.f.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.s0) {
                this.f.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (this.u0) {
                this.f.setTitle(LocaleController.getString(R.string.BotShareToTopic));
            } else if (this.r0) {
                this.f.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else {
                this.f.setTitle(LocaleController.getString(R.string.SelectTopic));
            }
            this.m0.setVisibility(8);
            org.telegram.ui.Components.yn ynVar = this.f;
            if (ynVar != null && ynVar.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.m0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.f.setTitle(chat.title);
                this.f.j(null, getMessagesController().isDialogMuted(j12, 0L) ? getThemedDrawable("drawableMuteIcon") : null);
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
            if (chatFull2 != null && (chatFull = this.G) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.G = chatFull2;
            if (chatFull2 != null) {
                int i10 = chatFull2.participants_count;
                if (i10 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    string = chat3 == null ? LocaleController.getString(R.string.Loading) : ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    j10 = 0;
                } else {
                    j10 = 0;
                    string = LocaleController.formatPluralString("Members", i10, new Object[0]);
                }
            } else {
                j10 = 0;
                string = LocaleController.getString(R.string.Loading);
            }
            this.f.setSubtitle(string);
        }
        boolean z15 = this.fragmentBeginToShow || z4;
        long j13 = MessagesController.getNotificationsSettings(this.currentAccount).getLong(android.support.v4.media.a.n(j12, "dialog_join_requested_time_"), -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j13 > j10 && System.currentTimeMillis() - j13 < 120000) {
            this.I.a(LocaleController.getString(R.string.ChannelJoinRequestSent), z15);
            this.I.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.k0, false, 0.5f, z15);
            AndroidUtilities.updateViewVisibilityAnimated(this.I, true, 0.5f, z15);
            J0(0);
        } else if (chat != null && !z14 && (ChatObject.isNotInChat(chat) || getMessagesController().isJoiningChannel(chat.id))) {
            if (getMessagesController().isJoiningChannel(chat.id)) {
                z12 = true;
                z11 = true;
            } else {
                if (chat.join_request) {
                    this.I.setText(LocaleController.getString(R.string.ChannelJoinRequest));
                } else {
                    this.I.setText(LocaleController.getString(R.string.ChannelJoin));
                }
                z11 = true;
                this.I.setClickable(true);
                this.I.setEnabled(true);
                z12 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.k0, z12, 0.5f, z15);
            AndroidUtilities.updateViewVisibilityAnimated(this.I, z12 ^ z11, 0.5f, z15);
            J0(0);
        } else {
            if (!z13 || (!v10 && !v)) {
                z10 = false;
                if (this.S != z10) {
                    this.S = z10;
                    this.l0.animate().setListener(null).cancel();
                    if (z15) {
                        this.l0.animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new bf1(this, z10, 1));
                    } else {
                        this.l0.setVisibility(z10 ? 0 : 8);
                        this.l0.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                B0();
                this.n0.setVisibility(!z14 ? 8 : 0);
                this.O.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : 8);
                this.Q.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.G) || ChatObject.hasAdminRights(chat))) ? 8 : 0);
                this.P.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? 8 : 0);
                this.R.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? 8 : 0);
                Q0(true);
                this.E0 = getMessagesController().getGroupCall(j11, true);
                z0(false);
            }
            this.I.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
            this.I.setClickable(true);
            this.I.setEnabled(true);
            AndroidUtilities.updateViewVisibilityAnimated(this.k0, false, 0.5f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.I, true, 0.5f, false);
            J0(1);
        }
        z10 = true;
        if (this.S != z10) {
        }
        B0();
        this.n0.setVisibility(!z14 ? 8 : 0);
        this.O.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : 8);
        this.Q.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.G) || ChatObject.hasAdminRights(chat))) ? 8 : 0);
        this.P.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? 8 : 0);
        this.R.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? 8 : 0);
        Q0(true);
        this.E0 = getMessagesController().getGroupCall(j11, true);
        z0(false);
    }

    public final void P0() {
        RadialProgressView radialProgressView = this.k0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ae));
        this.h.g();
        h51 h51Var = this.l0;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        h51Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.s8));
        }
        this.o0.setBackgroundColor(getThemedColor(i10));
    }

    public final void Q0(boolean z4) {
        if (this.N == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        boolean z10 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j10))) || this.p0 || this.q0 || this.G0) ? false : true;
        this.H = z10;
        this.N.setVisibility(z10 ? 0 : 8);
        G0(!this.H, z4);
    }

    public final void R0() {
        boolean z4 = ChatObject.canManageTopics(g()) && !this.X.isEmpty();
        if (this.Y != z4) {
            this.Y = z4;
            hf1 hf1Var = this.r;
            hf1Var.q(0, hf1Var.h());
        }
    }

    @Override // org.telegram.ui.ActionBar.p2, org.telegram.ui.wg0
    public final /* synthetic */ boolean S(MotionEvent motionEvent, boolean z4) {
        return false;
    }

    public final void S0(float f10) {
        this.T = f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.y8;
        kVar.C(i0.a.d(this.T, themedColor, getThemedColor(i10)), false);
        this.actionBar.C(i0.a.d(this.T, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.B(i0.a.d(this.T, getThemedColor(org.telegram.ui.ActionBar.j6.t8), getThemedColor(org.telegram.ui.ActionBar.j6.z8)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(i0.a.d(this.T, getThemedColor(org.telegram.ui.ActionBar.j6.s8), getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
        }
        float f11 = 1.0f - f10;
        this.f.getTitleTextView().setAlpha(f11);
        this.f.getSubtitleTextView().setAlpha(f11);
        org.telegram.ui.Components.k81 k81Var = this.X0;
        if (k81Var != null) {
            k81Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
            this.X0.setAlpha(f10);
        }
        this.o0.setTranslationY((-AndroidUtilities.dp(16.0f)) * f11);
        this.o0.setAlpha(f10);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.K.setAlpha(f11);
        if (this.W0) {
            float w10 = e2.c.w(1.0f, this.T, 0.02f, 0.98f);
            this.K.setScaleX(w10);
            this.K.setScaleY(w10);
        }
    }

    public final void T0() {
        nh.y4 y4Var = this.A0;
        if (y4Var == null || y4Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.ic_ab_other, 0);
        lqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        if (ChatObject.canUserDoAdminAction(g(), 15)) {
            this.A0.e.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.a, 1L);
        if (findTopic != null) {
            string = findTopic.title;
        }
        this.A0.e.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    public final void U0(boolean z4, boolean z10) {
        te1 te1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z4 && this.K0) {
            z4 = true;
        }
        this.K0 = false;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j10);
        if (topics != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j10) && this.r0) {
                arrayList.add(new jf1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.x0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList.add(new jf1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.S0) {
                arrayList.add(new jf1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z10 && size2 > size) {
                this.H0.b(size + 4);
                z4 = false;
            }
            this.x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                jf1 jf1Var = (jf1) arrayList.get(i11);
                if (jf1Var != null && (tL_forumTopic = jf1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            df1 df1Var = this.K;
            if (df1Var != null) {
                if (df1Var.getItemAnimator() != (z4 ? this.F0 : null)) {
                    this.K.setItemAnimator(z4 ? this.F0 : null);
                }
            }
            hf1 hf1Var = this.r;
            if (hf1Var != null) {
                hf1Var.E(arrayList2, arrayList);
            }
            if ((this.z0 || size == 0) && (te1Var = this.C) != null) {
                te1Var.h1(0, 0);
                this.z0 = false;
            }
        }
        A0();
        T0();
    }

    @Override // org.telegram.ui.Components.rg, org.telegram.ui.Components.r50
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        qy qyVar = this.J0;
        final int i10 = 0;
        this.Z0 = (qyVar == null || !qyVar.T) ? 0 : AndroidUtilities.dp(72.0f);
        qy qyVar2 = this.J0;
        this.a1 = (qyVar2 == null || !qyVar2.T) ? 0 : AndroidUtilities.dp(64.0f);
        ye1 ye1Var = new ye1(this, context);
        this.d = ye1Var;
        this.fragmentView = ye1Var;
        ye1Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        ai.z(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new cf1(this, context));
        final int i12 = 2;
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe1
            public final /* synthetic */ sf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var;
                switch (i12) {
                    case 0:
                        sf1 sf1Var = this.b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.a, 0L));
                        break;
                    case 1:
                        sf1 sf1Var2 = this.b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        break;
                    case 2:
                        sf1 sf1Var3 = this.b;
                        if (!sf1Var3.p0) {
                            sf1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        qy qyVar3 = this.b.J0;
                        if (qyVar3 != null && (w0Var = qyVar3.g0) != null) {
                            w0Var.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        int i13 = 17;
        final int i14 = 4;
        if (this.J0 != null) {
            org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
            this.m0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe1
                public final /* synthetic */ sf1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.w0 w0Var;
                    switch (i14) {
                        case 0:
                            sf1 sf1Var = this.b;
                            sf1Var.presentFragment(ne1.a0(sf1Var.a, 0L));
                            break;
                        case 1:
                            sf1 sf1Var2 = this.b;
                            sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.a, null, sf1Var2.g());
                            sf1Var2.O0(false);
                            break;
                        case 2:
                            sf1 sf1Var3 = this.b;
                            if (!sf1Var3.p0) {
                                sf1Var3.H0(false);
                                break;
                            }
                            break;
                        case 3:
                            this.b.finishPreviewFragment();
                            break;
                        default:
                            qy qyVar3 = this.b.J0;
                            if (qyVar3 != null && (w0Var = qyVar3.g0) != null) {
                                w0Var.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.w0 a10 = n10.a(0, R.drawable.outline_header_search);
            this.m0 = a10;
            a10.F();
            a10.E = new hb(this, i13);
            this.m0.setSearchPaddingStart(56);
            this.m0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.m0.getSearchField();
            searchField.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
            searchField.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Si));
            searchField.setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.Wd));
        }
        org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.ic_ab_other, null);
        this.n0 = c3;
        c3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.n0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.O = this.n0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.w0 w0Var = this.n0;
        this.Q = w0Var.d(14, 0, new org.telegram.ui.Components.gj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, w0Var.j0);
        int i15 = 3;
        this.N = this.n0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.R = this.n0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.P = this.n0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.yn ynVar = new org.telegram.ui.Components.yn(context, this, false, this.resourceProvider);
        this.f = ynVar;
        ynVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        org.telegram.ui.Components.yn ynVar2 = this.f;
        long j10 = -this.a;
        ynVar2.b = j10 < 0;
        ynVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, k7.b6.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.q0) {
            this.f.getAvatarImageView().setOnClickListener(new c8(this, i15));
        }
        this.K = new df1(this, context);
        ug.i iVar = new ug.i(this.d);
        ViewGroup viewGroup = this.d;
        ng.a aVar = this.f1;
        aVar.d = iVar;
        aVar.e = viewGroup;
        df1 df1Var = this.K;
        qy qyVar3 = this.J0;
        if (qyVar3 != null) {
            viewGroup = (ViewGroup) qyVar3.getFragmentView();
        }
        df1 df1Var2 = this.K;
        Objects.requireNonNull(df1Var2);
        this.g1 = new ng.k(df1Var, viewGroup, new z8(df1Var2, i12));
        this.K.C0(new pe1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        ag.e c10 = ag.f.c(getParentActivity(), 0.85f, -1, false);
        c10.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c10, 2), 0, 1, 33);
        xw xwVar = new xw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = xwVar;
        xwVar.b();
        int i16 = this.B ? 2 : 0;
        this.y = i16;
        this.w.X = i16 != 0;
        ff1 ff1Var = new ff1(this);
        this.K.setHideIfEmpty(false);
        ff1Var.m = false;
        ff1Var.C = false;
        df1 df1Var3 = this.K;
        this.F0 = ff1Var;
        df1Var3.setItemAnimator(ff1Var);
        this.K.setOnScrollListener(new ue1(this, i11));
        df1 df1Var4 = this.K;
        df1Var4.V1 = true;
        df1Var4.W1 = 0;
        org.telegram.ui.Components.yk0 yk0Var = new org.telegram.ui.Components.yk0(df1Var4, true);
        this.H0 = yk0Var;
        this.K.setItemsEnterAnimator(yk0Var);
        this.K.setOnItemClickListener(new p21(this, 9));
        this.K.setOnItemLongClickListener(new qe1(this));
        this.K.setOnScrollListener(new ue1(this, i12));
        df1 df1Var5 = this.K;
        te1 te1Var = new te1(this);
        this.C = te1Var;
        df1Var5.setLayoutManager(te1Var);
        new SparseArray();
        new HashMap();
        this.K.setAdapter(this.r);
        this.K.setClipToPadding(false);
        this.K.j(new ue1(this, i10));
        rf1 rf1Var = new rf1(this);
        this.M = rf1Var;
        ve1 ve1Var = new ve1(this, rf1Var);
        this.L = ve1Var;
        ve1Var.d(this.K);
        this.d.addView(this.K, k7.b6.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.K.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(getParentActivity(), this.resourceProvider, false);
        this.h = a20Var;
        this.d.addView(a20Var, org.telegram.ui.Components.a20.b());
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe1
            public final /* synthetic */ sf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i10) {
                    case 0:
                        sf1 sf1Var = this.b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.a, 0L));
                        break;
                    case 1:
                        sf1 sf1Var2 = this.b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        break;
                    case 2:
                        sf1 sf1Var3 = this.b;
                        if (!sf1Var3.p0) {
                            sf1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        qy qyVar32 = this.b.J0;
                        if (qyVar32 != null && (w0Var2 = qyVar32.g0) != null) {
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
        org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context, null);
        u00Var.setViewType(24);
        u00Var.setVisibility(8);
        u00Var.w = true;
        if1 if1Var = new if1(context);
        TextView textView = new TextView(context);
        if1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.lq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        boolean z4 = LocaleController.isRTL;
        if1Var.addView(textView, k7.b6.d(-2, -2.0f, 81, z4 ? 72.0f : 32.0f, 0.0f, z4 ? 32.0f : 72.0f, 32.0f));
        this.n = if1Var;
        textView.setAlpha(0.0f);
        nh.y4 y4Var = new nh.y4(this, context, u00Var);
        this.A0 = y4Var;
        try {
            y4Var.b.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.A0.e(this.G0, this.fragmentBeginToShow);
        this.A0.d.setText(LocaleController.getString(R.string.NoTopics));
        T0();
        this.n.addView(u00Var);
        this.n.addView(this.A0);
        this.d.addView(this.n);
        this.K.setEmptyView(this.n);
        this.l0 = new h51(context, 6);
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context);
        this.I = i61Var;
        this.l0.addView(i61Var);
        this.d.addView(this.l0, k7.b6.e(-1, 51, 80));
        this.I.setOnClickListener(new we1(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.k0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.k0.setVisibility(4);
        this.l0.addView(this.k0, k7.b6.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.T0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.T0.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.T0;
        int i17 = org.telegram.ui.ActionBar.j6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.z5.c(null, org.telegram.ui.ActionBar.z5.b(getThemedColor(i17))));
        this.T0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
        this.T0.setScaleType(ImageView.ScaleType.CENTER);
        this.l0.addView(this.T0, k7.b6.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.T0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe1
            public final /* synthetic */ sf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i11) {
                    case 0:
                        sf1 sf1Var = this.b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.a, 0L));
                        break;
                    case 1:
                        sf1 sf1Var2 = this.b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        break;
                    case 2:
                        sf1 sf1Var3 = this.b;
                        if (!sf1Var3.p0) {
                            sf1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        qy qyVar32 = this.b.J0;
                        if (qyVar32 != null && (w0Var2 = qyVar32.g0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.T0.setVisibility(8);
        O0(false);
        n0 n0Var = new n0(this, context, 25);
        this.e = n0Var;
        if (this.J0 == null) {
            this.d.addView(n0Var, k7.b6.e(-1, -1, 119));
        }
        of1 of1Var = new of1(this, context);
        this.o0 = of1Var;
        of1Var.setVisibility(8);
        this.e.addView(this.o0, k7.b6.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        of1 of1Var2 = this.o0;
        int i18 = org.telegram.ui.ActionBar.j6.d6;
        of1Var2.setBackgroundColor(getThemedColor(i18));
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.is isVar = new org.telegram.ui.Components.is(context);
        this.R0 = isVar;
        isVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        pg.b c11 = aVar.c(this.R0, rg.b.n(this.resourceProvider), false);
        c11.p(AndroidUtilities.dp(24.0f));
        c11.o(AndroidUtilities.dp(7.0f));
        this.R0.setBlurredBackground(c11);
        this.R0.setOnAnimatedHeightChangedListener(new pe1(this, i10));
        this.d.addView(this.R0, k7.b6.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            jh.e eVar = new jh.e(g10, this);
            this.O0 = eVar;
            this.R0.addView(eVar.c(), k7.b6.n(-1, 40));
            this.R0.h(3, this.O0.c());
            this.R0.g(this.O0.c());
            jh.e eVar2 = this.O0;
            eVar2.m = new qe1(this);
            TLRPC.ChatFull chatFull = this.G;
            eVar2.j = chatFull;
            if (chatFull != null) {
                eVar2.e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.C0 = frameLayout;
            this.R0.addView(frameLayout);
            this.R0.h(4, this.C0);
            this.R0.g(this.C0);
            this.R0.i(this.C0, true, false);
            b9 b9Var = new b9(this, context, this);
            this.D0 = b9Var;
            this.C0.addView(b9Var);
            this.R0.setCallFragmentContextView(this.D0);
        }
        FrameLayout.LayoutParams c12 = k7.b6.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c12.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c12);
        }
        y0();
        nw0 nw0Var = new nw0(this, context, 5);
        this.M0 = nw0Var;
        if (Build.VERSION.SDK_INT >= 23) {
            nw0Var.setForeground(new ColorDrawable(i0.a.k(getThemedColor(i18), 100)));
        }
        this.M0.setFocusable(false);
        this.M0.setImportantForAccessibility(2);
        final int i19 = 3;
        this.M0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.oe1
            public final /* synthetic */ sf1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.w0 w0Var2;
                switch (i19) {
                    case 0:
                        sf1 sf1Var = this.b;
                        sf1Var.presentFragment(ne1.a0(sf1Var.a, 0L));
                        break;
                    case 1:
                        sf1 sf1Var2 = this.b;
                        sf1Var2.getMessagesController().hidePeerSettingsBar(-sf1Var2.a, null, sf1Var2.g());
                        sf1Var2.O0(false);
                        break;
                    case 2:
                        sf1 sf1Var3 = this.b;
                        if (!sf1Var3.p0) {
                            sf1Var3.H0(false);
                            break;
                        }
                        break;
                    case 3:
                        this.b.finishPreviewFragment();
                        break;
                    default:
                        qy qyVar32 = this.b.J0;
                        if (qyVar32 != null && (w0Var2 = qyVar32.g0) != null) {
                            w0Var2.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.M0.setFitsSystemWindows(true);
        this.S = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) it.next();
                if (p2Var instanceof qy) {
                    qy qyVar4 = (qy) p2Var;
                    if (qyVar4.h4()) {
                        MessagesStorage.TopicKey topicKey = qyVar4.m2;
                        if (topicKey.dialogId == j10) {
                            this.N0 = topicKey.topicId;
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
            getMessagesController().getBoostsController().getBoostsStats(j10, new xb(this, 5));
        }
        View view = this.fragmentView;
        qe1 qe1Var = new qe1(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, qe1Var);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.Components.rg
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
            if (chatParticipants != null && (chatFull = this.G) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j10) {
                O0(false);
                jh.e eVar = this.O0;
                if (eVar != null) {
                    eVar.j = chatFull2;
                    eVar.e(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            O0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
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
                boolean canScrollVertically = this.K.canScrollVertically(-1);
                U0(true, false);
                if (!canScrollVertically) {
                    this.C.n0(0);
                }
            }
        } else if (i10 == NotificationCenter.dialogsNeedReload) {
            U0(false, false);
        } else if (i10 == NotificationCenter.groupCallUpdated) {
            Long l10 = (Long) objArr[0];
            if (j10 == l10.longValue()) {
                this.E0 = getMessagesController().getGroupCall(l10.longValue(), false);
                b9 b9Var = this.D0;
                if (b9Var != null) {
                    b9Var.a(!this.fragmentBeginToShow);
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
                if (this.N0 != 0) {
                    this.N0 = 0L;
                    U0(false, false);
                    return;
                }
                return;
            }
            if (this.N0 != longValue2) {
                this.N0 = longValue2;
                U0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.rg
    public final TLRPC.Chat g() {
        return getMessagesController().getChat(Long.valueOf(this.a));
    }

    @Override // org.telegram.ui.Components.rg
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.E0;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.Components.rl0 rl0Var;
        jy0 jy0Var = new jy0(9, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, jy0Var, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        of1 of1Var = this.o0;
        if (of1Var != null && (rl0Var = of1Var.R) != null) {
            org.telegram.ui.Cells.t3.a(arrayList, rl0Var);
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.p0 ? org.telegram.ui.ActionBar.j6.d6 : org.telegram.ui.ActionBar.j6.s8);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.w8);
        }
        return i0.a.f(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.Components.rg
    public final org.telegram.ui.Components.yn o() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (this.X.isEmpty()) {
            if (!this.p0) {
                return super.onBackPressed(z4);
            }
            if (z4) {
                this.actionBar.v(this.m0.L(false));
            }
        } else if (z4) {
            C0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyHidden() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.h(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        x61.t(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = k1;
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

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        this.L0.unlock();
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
        qy qyVar = this.J0;
        if (qyVar == null || qyVar.C3 == null) {
            return;
        }
        qyVar.getActionBar().setSearchAvatarImageView(null);
        this.J0.C3.J = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.a);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j10 = this.a;
        topicsController.onTopicFragmentResume(j10);
        this.D = false;
        AndroidUtilities.updateVisibleRows(this.K);
        this.D = true;
        setBulletinDelegate(new c9(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onSlideProgress(boolean z4, float f10) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.Q0) {
            L0(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        lx lxVar;
        nw0 nw0Var;
        super.onTransitionAnimationEnd(z4, z10);
        if (z4 && (nw0Var = this.M0) != null) {
            if (nw0Var.getParent() != null) {
                ((ViewGroup) this.M0.getParent()).removeView(this.M0);
            }
            this.M0.setBackground(null);
        }
        if (z4) {
            z0(false);
        }
        this.L0.unlock();
        if (z4) {
            return;
        }
        if (this.q0 && this.E) {
            removeSelfFromStack();
            qy qyVar = this.I0;
            if (qyVar != null) {
                qyVar.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.F) {
            removeSelfFromStack();
            qy qyVar2 = this.J0;
            if (qyVar2 == null || (lxVar = qyVar2.C3) == null || !lxVar.c()) {
                return;
            }
            this.J0.C3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationProgress(boolean z4, float f10) {
        nw0 nw0Var = this.M0;
        if (nw0Var == null || nw0Var.getVisibility() != 0) {
            return;
        }
        if (z4) {
            this.M0.setAlpha(1.0f - f10);
        } else {
            this.M0.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        this.L0.lock();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void prepareFragmentToSlide(boolean z4, boolean z10) {
        if (!z4 && z10) {
            this.Q0 = true;
            K0(true);
        } else {
            this.Q0 = false;
            K0(false);
            L0(1.0f);
        }
    }

    @Override // org.telegram.ui.wg0
    public final void s() {
        this.K.x0(0);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setPreviewOpenedProgress(float f10) {
        org.telegram.ui.Components.yn ynVar = this.f;
        if (ynVar != null) {
            ynVar.setAlpha(f10);
            this.n0.setAlpha(f10);
            org.telegram.ui.ActionBar.w0 w0Var = this.m0;
            if (w0Var != null) {
                w0Var.setAlpha(f10);
            }
            this.actionBar.getBackButton().setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void setPreviewReplaceProgress(float f10) {
        org.telegram.ui.Components.yn ynVar = this.f;
        if (ynVar != null) {
            ynVar.setAlpha(f10);
            this.f.setTranslationX((1.0f - f10) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void x0() {
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.c1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.R0.c(AndroidUtilities.dp(14.0f)));
        qy qyVar = this.J0;
        View view = qyVar != null ? qyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = qyVar != null ? qyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.b1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.i1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.j1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.J0 != null ? 2 : 1, this.h1);
        eVar.e(this.g1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // org.telegram.ui.wg0
    public final sg.d y() {
        return this.e1;
    }

    public final void y0() {
        te1 te1Var;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        if (topicsController.endIsReached(j10) || (te1Var = this.C) == null) {
            return;
        }
        int N0 = te1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        A0();
    }

    public final void z0(boolean z4) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
        if (this.E0 != null && ((str = this.v0) != null || this.w0)) {
            org.telegram.ui.Components.voip.f2.l(chat, str, false, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.v0 = null;
            this.w0 = false;
        } else {
            if (this.v0 == null || !z4 || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            kf.k0.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(this), R.raw.linkbroken, 36);
            this.v0 = null;
        }
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Components.rg
    public final /* synthetic */ void j(int i10, int i11, boolean z4, int i12, boolean z10, int i13) {
    }
}
