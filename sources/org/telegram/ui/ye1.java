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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class ye1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.bh, qg0 {
    public static final HashSet q1 = new HashSet();
    public HashSet A0;
    public boolean B0;
    public boolean C0;
    public ci.n5 D0;
    public boolean E;
    public le1 E0;
    public zd1 F;
    public FrameLayout F0;
    public boolean G;
    public a9 G0;
    public boolean H;
    public ChatObject.Call H0;
    public boolean I;
    public ke1 I0;
    public TLRPC.ChatFull J;
    public boolean J0;
    public boolean K;
    public org.telegram.ui.Components.rl0 K0;
    public org.telegram.ui.Components.k71 L;
    public ey L0;
    public int M;
    public ey M0;
    public ie1 N;
    public boolean N0;
    public be1 O;
    public final AnimationNotificationsLocker O0;
    public xe1 P;
    public e50 P0;
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
    public org.telegram.ui.Components.k91 a1;
    public final ArrayList b;
    public boolean b0;
    public boolean b1;
    public int c;
    public NumberTextView c0;
    public View c1;
    public ee1 d;
    public org.telegram.ui.ActionBar.u0 d0;
    public int d1;
    public l0 e;
    public org.telegram.ui.ActionBar.u0 e0;
    public int e1;
    public org.telegram.ui.Components.oo f;
    public org.telegram.ui.ActionBar.u0 f0;
    public int f1;
    public org.telegram.ui.ActionBar.u0 g0;
    public final bh.f g1;
    public org.telegram.ui.Components.h20 h;
    public org.telegram.ui.ActionBar.u0 h0;
    public final gh.d h1;
    public org.telegram.ui.ActionBar.u0 i0;
    public final gh.d i1;
    public org.telegram.ui.ActionBar.e1 j0;
    public final gh.c j1;
    public org.telegram.ui.ActionBar.e1 k0;
    public final bh.b k1;
    public org.telegram.ui.ActionBar.e1 l0;
    public bh.l l1;
    public org.telegram.ui.ActionBar.u0 m0;
    public final ArrayList m1;
    public ne1 n;
    public RadialProgressView n0;
    public final RectF n1;
    public n41 o0;
    public final RectF o1;
    public org.telegram.ui.ActionBar.u0 p0;
    public int p1;
    public org.telegram.ui.ActionBar.u0 q0;
    public final me1 r;
    public te1 r0;
    public final TopicsController s;
    public boolean s0;
    public final boolean t0;
    public final boolean u0;
    public ze1 v;
    public final boolean v0;
    public kw w;
    public final boolean w0;
    public int x;
    public final boolean x0;
    public int y;
    public String y0;
    public boolean z0;

    public ye1(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        new ArrayList();
        this.r = new me1(this);
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
        this.m1 = arrayList;
        RectF rectF = new RectF();
        this.n1 = rectF;
        RectF rectF2 = new RectF();
        this.o1 = rectF2;
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
        this.V0 = true ^ org.telegram.messenger.v0.v("topics_end_reached_", j10, getUserConfig().getPreferences(), false);
        gh.c cVar = new gh.c();
        this.j1 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.g1 = null;
            this.h1 = null;
            this.i1 = null;
            this.k1 = new bh.b(cVar);
            return;
        }
        this.g1 = new bh.f(false);
        this.h1 = new gh.d(null);
        gh.d dVar = new gh.d(null);
        this.i1 = dVar;
        bh.b bVar = new bh.b(dVar);
        this.k1 = bVar;
        bVar.i = LiteMode.isEnabled(262144);
    }

    public static org.telegram.ui.ActionBar.o2 D0(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
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
        return new ye1(bundle);
    }

    public static org.telegram.ui.ActionBar.o2 E0(LaunchActivity launchActivity, Bundle bundle) {
        return D0(MessagesController.getInstance(launchActivity.O), MessagesStorage.getInstance(launchActivity.O), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (((org.telegram.ui.ye1) r0).a == (-r6.a())) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H0(sn snVar) {
        if (snVar.getParentLayout() == null) {
            return;
        }
        if (snVar.getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) snVar.getParentLayout().getFragmentStack().get(snVar.getParentLayout().getFragmentStack().size() - 2);
            if (o2Var instanceof ye1) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -snVar.a());
        ((ActionBarLayout) snVar.getParentLayout()).c(snVar.getParentLayout().getFragmentStack().size() - 1, new ye1(bundle));
        snVar.va = true;
        snVar.finishFragment();
    }

    public static boolean U(ye1 ye1Var, TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(ye1Var.currentAccount).edit().putLong("dialog_join_requested_time_" + (-ye1Var.a), System.currentTimeMillis()).commit();
        Activity parentActivity = ye1Var.getParentActivity();
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(ye1Var.g());
        int i10 = org.telegram.ui.Components.b90.s;
        org.telegram.ui.Components.b90.x(parentActivity, ye1Var, org.telegram.ui.Components.xc.a0(ye1Var), isChannelAndNotMegaGroup);
        ye1Var.N0(true);
        return false;
    }

    public static void V(ye1 ye1Var, View view) {
        long j10 = ye1Var.a;
        if (ye1Var.getParentLayout() == null || ((ActionBarLayout) ye1Var.getParentLayout()).x() || !(view instanceof ue1)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((ue1) view).N;
        long j11 = -j10;
        long peerDialogId = tL_forumTopic == null ? 0L : ye1Var.getMessagesController().isMonoForum(j11) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (ye1Var.t0) {
            ze1 ze1Var = ye1Var.v;
            if (ze1Var != null) {
                bf1 bf1Var = ze1Var.a;
                Bundle bundle = new Bundle();
                ef1 ef1Var = bf1Var.a;
                bundle.putLong("dialog_id", ef1Var.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                d11 d11Var = new d11(bundle, null);
                d11Var.r = new ql0(24, bf1Var, tL_forumTopic);
                ef1Var.presentFragment(d11Var);
            }
            ey eyVar = ye1Var.L0;
            if (eyVar != null) {
                eyVar.M3(j11, peerDialogId, true, ye1Var);
                return;
            }
            return;
        }
        if (ye1Var.a0.size() > 0) {
            ye1Var.M0(view);
            return;
        }
        if (ye1Var.inPreviewMode && AndroidUtilities.isTablet()) {
            for (org.telegram.ui.ActionBar.o2 o2Var : ye1Var.getParentLayout().getFragmentStack()) {
                if (o2Var instanceof ey) {
                    ey eyVar2 = (ey) o2Var;
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
            ye1Var.Q0 = peerDialogId;
            ye1Var.U0(false, false);
        }
        og.d.m(ye1Var, j10, tL_forumTopic, 0);
    }

    public static /* synthetic */ boolean W(ye1 ye1Var, View view, float f7) {
        if (ye1Var.t0 || ye1Var.getParentLayout() == null || ((ActionBarLayout) ye1Var.getParentLayout()).x()) {
            return false;
        }
        if (!ye1Var.actionBar.s() && !AndroidUtilities.isTablet() && (view instanceof ue1)) {
            ue1 ue1Var = (ue1) view;
            if (ue1Var.R(f7)) {
                ye1Var.L0(ue1Var);
                ye1Var.N.I0(true);
                ye1Var.N.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        ye1Var.M0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public static void a0(ye1 ye1Var, boolean z10) {
        yw ywVar;
        ye1Var.s0 = z10;
        ValueAnimator valueAnimator = ye1Var.Y0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ye1Var.Y0.cancel();
        }
        int i10 = 0;
        if (ye1Var.a1 == null) {
            org.telegram.ui.Components.k91 n10 = ye1Var.r0.n(8, false);
            ye1Var.a1 = n10;
            if (ye1Var.M0 != null) {
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n10, ye1Var.getResourceProvider());
            }
            ye1Var.e.addView(ye1Var.a1, w7.z5.c(44.0f, -1));
        }
        ye1Var.Y0 = ValueAnimator.ofFloat(ye1Var.W, z10 ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(ye1Var.r0, false, 1.0f, true);
        ey eyVar = ye1Var.M0;
        if (eyVar != null && (ywVar = eyVar.G3) != null) {
            ywVar.M = !z10;
        }
        ye1Var.Z0 = !z10 && ye1Var.r0.getVisibility() == 0 && ye1Var.r0.getAlpha() == 1.0f;
        ye1Var.Y0.addUpdateListener(new g11(ye1Var, 15));
        ye1Var.r0.setVisibility(0);
        if (z10) {
            AndroidUtilities.requestAdjustResize(ye1Var.getParentActivity(), ye1Var.classGuid);
            ye1Var.P0(false);
        } else {
            ye1Var.q0.setVisibility(0);
        }
        ye1Var.Y0.addListener(new ge1(ye1Var, z10, i10));
        ye1Var.Y0.setDuration(200L);
        ye1Var.Y0.setInterpolator(org.telegram.ui.Components.bs.f);
        ye1Var.Y0.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    @Override // org.telegram.ui.Components.bh
    public final org.telegram.ui.Components.ow0 A() {
        return this.d;
    }

    public final void A0() {
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
        this.N.setPadding(0, (int) r2, 0, this.f1 + this.d1 + (this.V ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void B0() {
        this.a0.clear();
        this.actionBar.r();
        AndroidUtilities.updateVisibleRows(this.N);
        Q0();
    }

    public final void C0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            c2Var.T = LocaleController.formatString(R.string.DeleteSelectedTopic, this.s.findTopic(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            c2Var.T = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new a1.d(this, hashSet, arrayList, runnable, 21));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(23));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.Components.bh
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
        profileActivity.M4(this.J);
        profileActivity.Q4((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().hasImageLoaded() && z10) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ long I() {
        return 0L;
    }

    public final void I0(int i10) {
        if (this.M != i10) {
            this.M = i10;
            this.L.setTextColorKey(i10 == 0 ? org.telegram.ui.ActionBar.k6.Ae : org.telegram.ui.ActionBar.k6.q7);
            this.W0.setVisibility(i10 == 1 ? 0 : 8);
            N0(false);
        }
    }

    public final void J0(boolean z10) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        ee1 ee1Var = this.d;
        if (ee1Var != null) {
            if (z10) {
                ee1Var.setLayerType(2, null);
                ee1Var.setClipChildren(false);
                ee1Var.setClipToPadding(false);
            } else {
                ee1Var.setLayerType(0, null);
                ee1Var.setClipChildren(true);
                ee1Var.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void K0(float f7) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.S0 = f7;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        ie1 ie1Var = this.N;
        if (ie1Var != null) {
            float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, this.S0, 0.05f, 1.0f);
            ie1Var.setPivotX(0.0f);
            ie1Var.setPivotY(0.0f);
            ie1Var.setScaleX(D);
            ie1Var.setScaleY(D);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(D);
            this.actionBar.setScaleY(D);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void L0(org.telegram.ui.Cells.q2 q2Var) {
        final int i10 = 0;
        try {
            q2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final int i11 = 1;
        ?? r32 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = q2Var.N;
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(getParentActivity(), this.currentAccount, r32[0].getSwipeBack(), false, new de1(this, tL_forumTopic), getResourceProvider());
        int b10 = r32[0].b(zoVar.f);
        zoVar.o = 1;
        long j10 = this.a;
        long j11 = -j10;
        zoVar.e(j11, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(g())) {
            org.telegram.ui.ActionBar.e1 e1Var = new org.telegram.ui.ActionBar.e1(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                e1Var.j(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                e1Var.j(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            e1Var.setMinimumWidth(160);
            e1Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xd1
                public final /* synthetic */ ye1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            ye1 ye1Var = this.b;
                            ye1Var.C0 = true;
                            ye1Var.N0 = true;
                            ye1Var.s.pinTopic(ye1Var.a, tL_forumTopic.id, !r0.pinned, ye1Var);
                            ye1Var.finishPreviewFragment();
                            break;
                        case 1:
                            ye1 ye1Var2 = this.b;
                            ye1Var2.N0 = true;
                            TopicsController topicsController = ye1Var2.s;
                            long j12 = ye1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            ye1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            ye1 ye1Var3 = this.b;
                            ye1Var3.C0(hashSet, new vd1(ye1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var);
        }
        org.telegram.ui.ActionBar.e1 e1Var2 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(j11, tL_forumTopic.id)) {
            e1Var2.j(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            e1Var2.j(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        e1Var2.setMinimumWidth(160);
        e1Var2.setOnClickListener(new ci.c6(this, tL_forumTopic, (Serializable) r32, b10, 6));
        r32[0].addView(e1Var2);
        if (ChatObject.canManageTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var3 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                e1Var3.j(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                e1Var3.j(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            e1Var3.setMinimumWidth(160);
            e1Var3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xd1
                public final /* synthetic */ ye1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ye1 ye1Var = this.b;
                            ye1Var.C0 = true;
                            ye1Var.N0 = true;
                            ye1Var.s.pinTopic(ye1Var.a, tL_forumTopic.id, !r0.pinned, ye1Var);
                            ye1Var.finishPreviewFragment();
                            break;
                        case 1:
                            ye1 ye1Var2 = this.b;
                            ye1Var2.N0 = true;
                            TopicsController topicsController = ye1Var2.s;
                            long j12 = ye1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            ye1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            ye1 ye1Var3 = this.b;
                            ye1Var3.C0(hashSet, new vd1(ye1Var3, 3));
                            break;
                    }
                }
            });
            r32[0].addView(e1Var3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, g(), tL_forumTopic)) {
            org.telegram.ui.ActionBar.e1 e1Var4 = new org.telegram.ui.ActionBar.e1(getParentActivity(), false, true);
            e1Var4.j(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            e1Var4.c(org.telegram.ui.ActionBar.k6.q7, org.telegram.ui.ActionBar.k6.p7);
            e1Var4.setMinimumWidth(160);
            final int i12 = 2;
            e1Var4.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xd1
                public final /* synthetic */ ye1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ye1 ye1Var = this.b;
                            ye1Var.C0 = true;
                            ye1Var.N0 = true;
                            ye1Var.s.pinTopic(ye1Var.a, tL_forumTopic.id, !r0.pinned, ye1Var);
                            ye1Var.finishPreviewFragment();
                            break;
                        case 1:
                            ye1 ye1Var2 = this.b;
                            ye1Var2.N0 = true;
                            TopicsController topicsController = ye1Var2.s;
                            long j12 = ye1Var2.a;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsController.toggleCloseTopic(j12, tL_forumTopic2.id, true ^ tL_forumTopic2.closed);
                            ye1Var2.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            ye1 ye1Var3 = this.b;
                            ye1Var3.C0(hashSet, new vd1(ye1Var3, 3));
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
        sn snVar = new sn(si.o0.e(j10, "chat_id"));
        og.d.a(snVar, MessagesStorage.TopicKey.of(j11, isMonoForum ? DialogObject.getPeerDialogId(q2Var.N.from_id) : q2Var.N.id));
        presentFragmentAsPreviewWithMenu(snVar, r32[0]);
    }

    public final void M0(View view) {
        ue1 ue1Var;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        int i10;
        boolean z10;
        if (!(view instanceof ue1) || (tL_forumTopic = (ue1Var = (ue1) view).N) == null) {
            return;
        }
        int i11 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i11);
        HashSet hashSet = this.a0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i11));
        }
        ue1Var.U(hashSet.contains(Integer.valueOf(i11)), true);
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (hashSet.isEmpty()) {
            this.actionBar.r();
            return;
        }
        if (!this.actionBar.a(null)) {
            org.telegram.ui.ActionBar.y i12 = this.actionBar.i(null);
            if (this.inPreviewMode) {
                i12.setBackgroundColor(0);
                i12.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(i12.getContext());
            this.c0 = numberTextView;
            numberTextView.setTextSize(18);
            this.c0.setTypeface(AndroidUtilities.bold());
            this.c0.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            i12.addView(this.c0, w7.z5.m(1.0f, 0, -1, 72, 0, 0));
            this.c0.setOnTouchListener(new yd1(0));
            this.d0 = i12.g(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.e0 = i12.g(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.f0 = i12.g(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.g0 = i12.h(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            org.telegram.ui.ActionBar.u0 h = i12.h(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.h0 = h;
            h.setVisibility(8);
            org.telegram.ui.ActionBar.u0 h10 = i12.h(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.i0 = h10;
            h10.setVisibility(8);
            org.telegram.ui.ActionBar.u0 h11 = i12.h(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.m0 = h11;
            this.j0 = h11.e(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.k0 = this.m0.e(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.l0 = this.m0.e(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.N(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
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
                    i13++;
                }
                if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                    if (findTopic.pinned) {
                        i16++;
                    } else {
                        i15++;
                    }
                }
            }
            if (getMessagesController().isDialogMuted(-j10, intValue)) {
                i14++;
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        if (i13 > 0) {
            this.j0.setVisibility(0);
            this.j0.j(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
            i10 = 8;
        } else {
            i10 = 8;
            this.j0.setVisibility(8);
        }
        if (i14 != 0) {
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
        this.d0.setVisibility((i15 == z10 && i16 == 0) ? 0 : i10);
        this.e0.setVisibility((i16 == z10 && i15 == 0) ? 0 : i10);
        this.c0.a(hashSet3.size(), z10);
        Iterator it2 = hashSet3.iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic findTopic2 = topicsController.findTopic(j10, ((Integer) it2.next()).intValue());
            if (findTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                    i19++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                    if (findTopic2.id == 1) {
                        if (findTopic2.hidden) {
                            i21++;
                        } else {
                            i20++;
                        }
                    }
                    if (!findTopic2.hidden) {
                        if (findTopic2.closed) {
                            i17++;
                        } else {
                            i18++;
                        }
                    }
                }
            }
        }
        this.k0.setVisibility((i17 != 0 || i18 <= 0) ? i10 : 0);
        this.k0.setText(LocaleController.getString(i18 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.l0.setVisibility((i18 != 0 || i17 <= 0) ? i10 : 0);
        this.l0.setText(LocaleController.getString(i17 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.g0.setVisibility(i19 == hashSet3.size() ? 0 : i10);
        this.h0.setVisibility((i20 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.i0.setVisibility((i21 == 1 && hashSet3.size() == 1) ? 0 : i10);
        this.m0.l();
        Q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(boolean z10) {
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
        boolean v = org.telegram.messenger.v0.v("dialog_bar_report", j12, notificationsSettings, false);
        boolean v10 = org.telegram.messenger.v0.v("dialog_bar_block", j12, notificationsSettings, false);
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
            I0(0);
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
            I0(0);
        } else {
            if (!z14 || (!v10 && !v)) {
                z11 = false;
                if (this.V != z11) {
                    this.V = z11;
                    this.o0.animate().setListener(null).cancel();
                    if (z16) {
                        this.o0.animate().translationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new ge1(this, z11, 1));
                    } else {
                        this.o0.setVisibility(z11 ? 0 : i10);
                        this.o0.setTranslationY(z11 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                A0();
                this.q0.setVisibility(!z15 ? i10 : 0);
                this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : i10);
                this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? i10 : 0);
                this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? i10 : 0);
                this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? i10 : 0);
                P0(true);
                this.H0 = getMessagesController().getGroupCall(j11, true);
                y0(false);
            }
            this.L.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
            this.L.setClickable(true);
            this.L.setEnabled(true);
            AndroidUtilities.updateViewVisibilityAnimated(this.n0, false, 0.5f, false);
            AndroidUtilities.updateViewVisibilityAnimated(this.L, true, 0.5f, false);
            I0(1);
        }
        z11 = true;
        if (this.V != z11) {
        }
        A0();
        this.q0.setVisibility(!z15 ? i10 : 0);
        this.R.setVisibility(!ChatObject.canAddUsers(chat) ? 0 : i10);
        this.T.setVisibility((ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.J) || ChatObject.hasAdminRights(chat))) ? i10 : 0);
        this.S.setVisibility((chat != null || chat.creator || ChatObject.isNotInChat(chat)) ? i10 : 0);
        this.U.setVisibility((chat != null || chat.creator || ChatObject.hasAdminRights(chat)) ? i10 : 0);
        P0(true);
        this.H0 = getMessagesController().getGroupCall(j11, true);
        y0(false);
    }

    public final void O0() {
        RadialProgressView radialProgressView = this.n0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ae));
        this.h.updateColors();
        n41 n41Var = this.o0;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        n41Var.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setActionModeColor(getThemedColor(i10));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        }
        this.r0.setBackgroundColor(getThemedColor(i10));
    }

    public final void P0(boolean z10) {
        if (this.Q == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.a;
        boolean z11 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j10))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j10))) || this.s0 || this.t0 || this.J0) ? false : true;
        this.K = z11;
        this.Q.setVisibility(z11 ? 0 : 8);
        F0(!this.K, z10);
    }

    public final void Q0() {
        boolean z10 = ChatObject.canManageTopics(g()) && !this.a0.isEmpty();
        if (this.b0 != z10) {
            this.b0 = z10;
            me1 me1Var = this.r;
            me1Var.q(0, me1Var.h());
        }
    }

    public final void R0(float f7) {
        this.W = f7;
        S0();
        this.b1 = true;
        float f10 = 1.0f - f7;
        this.f.getTitleTextView().setAlpha(f10);
        this.f.getSubtitleTextView().setAlpha(f10);
        org.telegram.ui.Components.k91 k91Var = this.a1;
        if (k91Var != null) {
            k91Var.setTranslationY((-AndroidUtilities.dp(16.0f)) * f10);
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

    @Override // org.telegram.ui.ActionBar.o2, org.telegram.ui.qg0
    public final /* synthetic */ boolean S(MotionEvent motionEvent, boolean z10) {
        return false;
    }

    public final void S0() {
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.v8);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.y8;
        kVar.B(i0.a.f(this.W, themedColor, getThemedColor(i10)), false);
        this.actionBar.B(i0.a.f(this.W, getThemedColor(i10), getThemedColor(i10)), true);
        this.actionBar.A(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.t8), getThemedColor(org.telegram.ui.ActionBar.k6.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(i0.a.f(this.W, getThemedColor(org.telegram.ui.ActionBar.k6.s8), getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
    }

    public final void T0() {
        ci.n5 n5Var = this.D0;
        if (n5Var == null || n5Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        org.telegram.ui.Components.xq xqVar = new org.telegram.ui.Components.xq(R.drawable.ic_ab_other, 0);
        xqVar.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(xqVar, 0, 1, 0);
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
        zd1 zd1Var;
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
                arrayList.add(new oe1(3, null));
            }
            for (int i10 = 0; i10 < topics.size(); i10++) {
                HashSet hashSet = this.A0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i10).id))) {
                    arrayList.add(new oe1(0, topics.get(i10)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j10) && this.V0) {
                arrayList.add(new oe1(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z11 && size2 > size) {
                this.K0.b(size + 4);
                z10 = false;
            }
            this.x = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                oe1 oe1Var = (oe1) arrayList.get(i11);
                if (oe1Var != null && (tL_forumTopic = oe1Var.c) != null && tL_forumTopic.hidden) {
                    this.x++;
                }
            }
            ie1 ie1Var = this.N;
            if (ie1Var != null) {
                if (ie1Var.getItemAnimator() != (z10 ? this.I0 : null)) {
                    this.N.setItemAnimator(z10 ? this.I0 : null);
                }
            }
            me1 me1Var = this.r;
            if (me1Var != null) {
                me1Var.E(arrayList2, arrayList);
            }
            if ((this.C0 || size == 0) && (zd1Var = this.F) != null) {
                zd1Var.h1(0, 0);
                this.C0 = false;
            }
        }
        z0();
        T0();
    }

    @Override // org.telegram.ui.Components.bh, org.telegram.ui.Components.y50
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        org.telegram.ui.ActionBar.h5 h5Var;
        org.telegram.ui.ActionBar.h5 h5Var2;
        ey eyVar = this.M0;
        final int i10 = 0;
        this.d1 = (eyVar == null || !eyVar.W) ? 0 : AndroidUtilities.dp(72.0f);
        ey eyVar2 = this.M0;
        this.e1 = (eyVar2 == null || !eyVar2.W) ? 0 : AndroidUtilities.dp(64.0f);
        ee1 ee1Var = new ee1(this, context);
        this.d = ee1Var;
        this.fragmentView = ee1Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ee1Var, getResourceProvider());
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final int i11 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!AndroidUtilities.isTablet() || ((h5Var2 = this.parentLayout) != null && ((ActionBarLayout) h5Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        i2.o1.y(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new he1(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud1
            public final /* synthetic */ ye1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var;
                switch (i10) {
                    case 0:
                        ye1 ye1Var = this.b;
                        if (!ye1Var.s0) {
                            ye1Var.G0(false);
                            break;
                        }
                        break;
                    case 1:
                        ye1 ye1Var2 = this.b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar3 = this.b.M0;
                        if (eyVar3 != null && (u0Var = eyVar3.j0) != null) {
                            u0Var.performClick();
                            break;
                        }
                        break;
                    default:
                        ye1 ye1Var3 = this.b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.a, 0L));
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        final int i12 = 3;
        if (this.M0 != null) {
            org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
            this.p0 = a2;
            a2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud1
                public final /* synthetic */ ye1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    org.telegram.ui.ActionBar.u0 u0Var;
                    switch (i12) {
                        case 0:
                            ye1 ye1Var = this.b;
                            if (!ye1Var.s0) {
                                ye1Var.G0(false);
                                break;
                            }
                            break;
                        case 1:
                            ye1 ye1Var2 = this.b;
                            ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.a, null, ye1Var2.g());
                            ye1Var2.N0(false);
                            break;
                        case 2:
                            this.b.finishPreviewFragment();
                            break;
                        case 3:
                            ey eyVar3 = this.b.M0;
                            if (eyVar3 != null && (u0Var = eyVar3.j0) != null) {
                                u0Var.performClick();
                                break;
                            }
                            break;
                        default:
                            ye1 ye1Var3 = this.b;
                            ye1Var3.presentFragment(td1.a0(ye1Var3.a, 0L));
                            break;
                    }
                }
            });
        } else {
            org.telegram.ui.ActionBar.u0 a10 = m10.a(0, R.drawable.outline_header_search);
            this.p0 = a10;
            a10.F();
            a10.H = new ig.b2(this, 18);
            this.p0.setSearchPaddingStart(56);
            this.p0.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.p0.getSearchField();
            org.telegram.ui.ActionBar.r6.W(searchField, org.telegram.ui.ActionBar.k6.G6, getResourceProvider());
            org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Si, getResourceProvider());
            org.telegram.ui.ActionBar.r6.x(searchField, org.telegram.ui.ActionBar.k6.Wd, getResourceProvider());
        }
        org.telegram.ui.ActionBar.u0 c10 = m10.c(0, R.drawable.ic_ab_other, null);
        this.q0 = c10;
        c10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.q0.e(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        final int i13 = 2;
        this.R = this.q0.e(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        org.telegram.ui.ActionBar.u0 u0Var = this.q0;
        this.T = u0Var.d(14, 0, new org.telegram.ui.Components.yj0(R.raw.boosts, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, u0Var.m0);
        this.Q = this.q0.e(3, R.drawable.msg_topic_create, LocaleController.getString(R.string.CreateTopic));
        this.U = this.q0.e(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.S = this.q0.f(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), null);
        org.telegram.ui.Components.oo ooVar = new org.telegram.ui.Components.oo(context, this, false, this.resourceProvider);
        this.f = ooVar;
        ooVar.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.f.setOccupyStatusBar((!AndroidUtilities.isTablet() || ((h5Var = this.parentLayout) != null && ((ActionBarLayout) h5Var).b)) && !this.inPreviewMode);
        org.telegram.ui.Components.oo ooVar2 = this.f;
        long j10 = -this.a;
        ooVar2.b = j10 < 0;
        ooVar2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, w7.z5.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.t0) {
            this.f.getAvatarImageView().setOnClickListener(new b8(this, i12));
        }
        this.N = new ie1(this, context);
        ih.k kVar = new ih.k(this.d);
        ViewGroup viewGroup = this.d;
        bh.b bVar = this.k1;
        bVar.f = kVar;
        bVar.g = viewGroup;
        ie1 ie1Var = this.N;
        ey eyVar3 = this.M0;
        if (eyVar3 != null) {
            viewGroup = (ViewGroup) eyVar3.getFragmentView();
        }
        ie1 ie1Var2 = this.N;
        Objects.requireNonNull(ie1Var2);
        this.l1 = new bh.l(ie1Var, viewGroup, new dy0(ie1Var2, i11));
        this.N.C0(new vd1(this, 5));
        SpannableString spannableString = new SpannableString("#");
        og.c c11 = og.d.c(getParentActivity(), 0.85f, -1, false);
        c11.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(c11, 2), 0, 1, 33);
        kw kwVar = new kw(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.w = kwVar;
        kwVar.b();
        int i14 = this.E ? 2 : 0;
        this.y = i14;
        this.w.X = i14 != 0;
        ke1 ke1Var = new ke1(this);
        this.N.setHideIfEmpty(false);
        ke1Var.m = false;
        ke1Var.C = false;
        ie1 ie1Var3 = this.N;
        this.I0 = ke1Var;
        ie1Var3.setItemAnimator(ke1Var);
        this.N.setOnScrollListener(new ae1(this, i11));
        ie1 ie1Var4 = this.N;
        ie1Var4.W1 = true;
        ie1Var4.X1 = 0;
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(ie1Var4, true);
        this.K0 = rl0Var;
        this.N.setItemsEnterAnimator(rl0Var);
        this.N.setOnItemClickListener(new j11(this, 10));
        this.N.setOnItemLongClickListener(new wd1(this));
        this.N.setOnScrollListener(new ae1(this, i13));
        ie1 ie1Var5 = this.N;
        zd1 zd1Var = new zd1(this);
        this.F = zd1Var;
        ie1Var5.setLayoutManager(zd1Var);
        new SparseArray();
        new HashMap();
        this.N.setAdapter(this.r);
        this.N.setClipToPadding(false);
        this.N.j(new ae1(this, i10));
        xe1 xe1Var = new xe1(this);
        this.P = xe1Var;
        be1 be1Var = new be1(this, xe1Var);
        this.O = be1Var;
        be1Var.d(this.N);
        this.d.addView(this.N, w7.z5.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.N.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(getParentActivity(), this.resourceProvider, false);
        this.h = h20Var;
        this.d.addView(h20Var, org.telegram.ui.Components.h20.b());
        final int i15 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud1
            public final /* synthetic */ ye1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i15) {
                    case 0:
                        ye1 ye1Var = this.b;
                        if (!ye1Var.s0) {
                            ye1Var.G0(false);
                            break;
                        }
                        break;
                    case 1:
                        ye1 ye1Var2 = this.b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        ye1 ye1Var3 = this.b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.a, 0L));
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
        ne1 ne1Var = new ne1(context);
        TextView textView = new TextView(context);
        ne1Var.a = textView;
        if (LocaleController.isRTL) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xq(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
        boolean z10 = LocaleController.isRTL;
        ne1Var.addView(textView, w7.z5.d(-2, -2.0f, 81, z10 ? 72.0f : 32.0f, 0.0f, z10 ? 32.0f : 72.0f, 32.0f));
        this.n = ne1Var;
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
        this.o0 = new n41(context, 6);
        org.telegram.ui.Components.k71 k71Var = new org.telegram.ui.Components.k71(context);
        this.L = k71Var;
        this.o0.addView(k71Var);
        this.d.addView(this.o0, w7.z5.e(-1, 51, 80));
        this.L.setOnClickListener(new ce1(this));
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
        int i16 = org.telegram.ui.ActionBar.k6.de;
        imageView2.setBackground(org.telegram.ui.ActionBar.a6.c(null, org.telegram.ui.ActionBar.a6.b(getThemedColor(i16))));
        org.telegram.ui.ActionBar.r6.t(this.W0, i16, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.W0.setScaleType(ImageView.ScaleType.CENTER);
        this.o0.addView(this.W0, w7.z5.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.W0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud1
            public final /* synthetic */ ye1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i11) {
                    case 0:
                        ye1 ye1Var = this.b;
                        if (!ye1Var.s0) {
                            ye1Var.G0(false);
                            break;
                        }
                        break;
                    case 1:
                        ye1 ye1Var2 = this.b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        ye1 ye1Var3 = this.b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.a, 0L));
                        break;
                }
            }
        });
        this.W0.setVisibility(8);
        N0(false);
        l0 l0Var = new l0(this, context, 25);
        this.e = l0Var;
        if (this.M0 == null) {
            this.d.addView(l0Var, w7.z5.e(-1, -1, 119));
        }
        te1 te1Var = new te1(this, context);
        this.r0 = te1Var;
        te1Var.setVisibility(8);
        this.e.addView(this.r0, w7.z5.d(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        te1 te1Var2 = this.r0;
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i17, te1Var2, getResourceProvider());
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().loadChatInfo(this.a, true, null, true, false, 0);
        org.telegram.ui.Components.us usVar = new org.telegram.ui.Components.us(context);
        this.U0 = usVar;
        usVar.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dh.d c12 = bVar.c(this.U0, fh.c.n(this.resourceProvider), false);
        c12.q(AndroidUtilities.dp(24.0f));
        c12.p(AndroidUtilities.dp(7.0f));
        this.U0.setBlurredBackground(c12);
        this.U0.setOnAnimatedHeightChangedListener(new vd1(this, i10));
        this.d.addView(this.U0, w7.z5.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat g10 = g();
        if (g10 != null) {
            xh.d dVar = new xh.d(g10, this);
            this.R0 = dVar;
            this.U0.addView(dVar.b(), w7.z5.n(-1, 40));
            this.U0.h(3, this.R0.b());
            this.U0.g(this.R0.b());
            xh.d dVar2 = this.R0;
            dVar2.m = new wd1(this);
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
        x0();
        e50 e50Var = new e50(this, context, 9);
        this.P0 = e50Var;
        e50Var.setForeground(new ColorDrawable(i0.a.o(getThemedColor(i17), 100)));
        this.P0.setFocusable(false);
        this.P0.setImportantForAccessibility(2);
        this.P0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ud1
            public final /* synthetic */ ye1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                org.telegram.ui.ActionBar.u0 u0Var2;
                switch (i13) {
                    case 0:
                        ye1 ye1Var = this.b;
                        if (!ye1Var.s0) {
                            ye1Var.G0(false);
                            break;
                        }
                        break;
                    case 1:
                        ye1 ye1Var2 = this.b;
                        ye1Var2.getMessagesController().hidePeerSettingsBar(-ye1Var2.a, null, ye1Var2.g());
                        ye1Var2.N0(false);
                        break;
                    case 2:
                        this.b.finishPreviewFragment();
                        break;
                    case 3:
                        ey eyVar32 = this.b.M0;
                        if (eyVar32 != null && (u0Var2 = eyVar32.j0) != null) {
                            u0Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        ye1 ye1Var3 = this.b;
                        ye1Var3.presentFragment(td1.a0(ye1Var3.a, 0L));
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
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) it.next();
                if (o2Var instanceof ey) {
                    ey eyVar4 = (ey) o2Var;
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
        N0(false);
        O0();
        if (ChatObject.isBoostSupported(g())) {
            getMessagesController().getBoostsController().getBoostsStats(j10, new u3(this, 24));
        }
        View view = this.fragmentView;
        wd1 wd1Var = new wd1(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, wd1Var);
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
                N0(false);
                xh.d dVar = this.R0;
                if (dVar != null) {
                    dVar.j = chatFull2;
                    dVar.d(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                y0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            N0(false);
        } else if (i10 == NotificationCenter.chatWasBoostedByUser) {
            if (j10 == (-((Long) objArr[2]).longValue())) {
                this.X = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i10 == NotificationCenter.topicsDidLoaded) {
            if (j10 == ((Long) objArr[0]).longValue()) {
                U0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    x0();
                }
                z0();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                N0(false);
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
                y0(false);
            }
        } else if (i10 == NotificationCenter.notificationsSettingsUpdated) {
            U0(false, false);
            N0(true);
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

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        te1 te1Var = this.r0;
        if (te1Var != null && te1Var.U != null) {
            int i10 = org.telegram.ui.Cells.u3.h;
        }
        return arrayList;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ TLRPC.User i() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.s0 ? org.telegram.ui.ActionBar.k6.d6 : org.telegram.ui.ActionBar.k6.s8);
        if (this.actionBar.s()) {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.w8);
        }
        return i0.a.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (this.a0.isEmpty()) {
            if (!this.s0) {
                return super.onBackPressed(z10);
            }
            if (z10) {
                this.actionBar.v(this.p0.L(false));
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
            kVar.g(true);
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
        HashSet hashSet = q1;
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
        this.G = false;
        AndroidUtilities.updateVisibleRows(this.N);
        this.G = true;
        setBulletinDelegate(new b9(this, 9));
        if (!this.inPreviewMode || getMessagesController().isForum(-j10)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onSlideProgress(boolean z10, float f7) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.T0) {
            K0(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        int b10;
        super.onThemeColorsChanged();
        gh.c cVar = this.j1;
        if (cVar != null) {
            cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        }
        if (this.W0 != null && (b10 = org.telegram.ui.ActionBar.a6.b(getThemedColor(org.telegram.ui.ActionBar.k6.de))) != this.p1) {
            this.p1 = b10;
            org.telegram.ui.ActionBar.k6.E1(this.W0.getBackground(), b10, true);
        }
        for (int i10 = 0; i10 < 2; i10++) {
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.C(getThemedColor(org.telegram.ui.ActionBar.k6.G8), true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.E8), false, true);
            this.actionBar.D(getThemedColor(org.telegram.ui.ActionBar.k6.F8), true, true);
            this.actionBar.E(getThemedColor(org.telegram.ui.ActionBar.k6.I5), true);
        }
        e50 e50Var = this.P0;
        if (e50Var != null && (e50Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.P0.getForeground()).setColor(i0.a.o(getThemedColor(org.telegram.ui.ActionBar.k6.d6), 100));
        }
        O0();
        try {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (kVar2 != null) {
                kVar2.setActionModeColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
            }
            kw kwVar = this.w;
            if (kwVar != null) {
                kwVar.i();
            }
            if (this.actionBar != null && this.b1) {
                S0();
            }
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.y8));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.p0;
            if (u0Var == null || u0Var.getSearchField() == null) {
                return;
            }
            this.p0.getSearchField().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.Wd));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        yw ywVar;
        e50 e50Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && (e50Var = this.P0) != null) {
            if (e50Var.getParent() != null) {
                ((ViewGroup) this.P0.getParent()).removeView(this.P0);
            }
            this.P0.setBackground(null);
        }
        if (z10) {
            y0(false);
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        e50 e50Var = this.P0;
        if (e50Var == null || e50Var.getVisibility() != 0) {
            return;
        }
        if (z10) {
            this.P0.setAlpha(1.0f - f7);
        } else {
            this.P0.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.O0.lock();
    }

    @Override // org.telegram.ui.Components.bh
    public final org.telegram.ui.Components.oo p() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        if (!z10 && z11) {
            this.T0 = true;
            J0(true);
        } else {
            this.T0 = false;
            J0(false);
            K0(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void setPreviewReplaceProgress(float f7) {
        org.telegram.ui.Components.oo ooVar = this.f;
        if (ooVar != null) {
            ooVar.setAlpha(f7);
            this.f.setTranslationX((1.0f - f7) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override // org.telegram.ui.qg0
    public final void t() {
        this.N.x0(0);
    }

    public final void w0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.g1) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + ((int) this.U0.c(AndroidUtilities.dp(14.0f)));
        ey eyVar = this.M0;
        View view = eyVar != null ? eyVar.fragmentView : this.fragmentView;
        org.telegram.ui.ActionBar.k actionBar = eyVar != null ? eyVar.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.f1) - AndroidUtilities.dp(8.0f);
        int dp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.n1.set(0.0f, -dp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + dp + dp2);
        RectF rectF = this.o1;
        rectF.set(0.0f, dp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.M0 != null ? 2 : 1, this.m1);
        fVar.e(this.l1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void x0() {
        zd1 zd1Var;
        TopicsController topicsController = this.s;
        long j10 = this.a;
        if (topicsController.endIsReached(j10) || (zd1Var = this.F) == null) {
            return;
        }
        int N0 = zd1Var.N0();
        if (this.b.isEmpty() || N0 >= this.r.h() - 5) {
            topicsController.loadTopics(j10);
        }
        z0();
    }

    public final void y0(boolean z10) {
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
            org.telegram.messenger.v0.p(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.y0 = null;
        }
    }

    @Override // org.telegram.ui.qg0
    public final gh.d z() {
        return this.i1;
    }

    public final void z0() {
        this.J0 = this.s.isLoading(this.a);
        if (this.D0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((oe1) arrayList.get(0)).c != null && ((oe1) arrayList.get(0)).c.id == 1)) {
                this.D0.e(this.J0, this.fragmentBeginToShow);
            }
        }
        ie1 ie1Var = this.N;
        if (ie1Var != null) {
            ie1Var.K0(ie1Var.z1());
        }
        P0(true);
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.bh
    public final /* synthetic */ void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
    }
}
