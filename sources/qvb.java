// default package

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class qvb extends d implements gk7, sy1, zg6 {
    public static final HashSet s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public byte E;
    public q22 E0;
    public boolean F;
    public gvb F0;
    public tub G;
    public FrameLayout G0;
    public boolean H;
    public p81 H0;
    public boolean I;
    public fc2 I0;
    public boolean J;
    public evb J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public t29 L0;
    public y5c M;
    public cj3 M0;
    public boolean N;
    public cj3 N0;
    public cvb O;
    public boolean O0;
    public vub P;
    public final on P0;
    public pvb Q;
    public si9 Q0;
    public a8 R;
    public long R0;
    public a8 S;
    public xy1 S0;
    public a8 T;
    public float T0;
    public a8 U;
    public boolean U0;
    public a8 V;
    public fj3 V0;
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
    public vec b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public yub d;
    public NumberTextView d0;
    public nvb d1;
    public zab e;
    public r7 e0;
    public boolean e1;
    public o72 f;
    public r7 f0;
    public int f1;
    public r7 g0;
    public int g1;
    public un4 h;
    public r7 h0;
    public int h1;
    public r7 i0;
    public final cq3 i1;
    public r7 j0;
    public final lx4 j1;
    public a8 k0;
    public final lx4 k1;
    public a8 l0;
    public final ix4 l1;
    public a8 m0;
    public final kl0 m1;
    public ttb n;
    public r7 n0;
    public mdc n1;
    public RadialProgressView o0;
    public final ArrayList o1;
    public ar8 p0;
    public final RectF p1;
    public r7 q0;
    public final RectF q1;
    public final hvb r;
    public r7 r0;
    public int r1;
    public final pub s;
    public mvb s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public rvb w;
    public final boolean w0;
    public dh3 x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public qvb(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        this.r = new hvb(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new on(new int[]{kk7.s5});
        this.T0 = 1.0f;
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
        this.s = getMessagesController().g4;
        this.W0 = !ls6.v("topics_end_reached_", r1, getUserConfig().j(), false);
        ix4 ix4Var = new ix4();
        this.l1 = ix4Var;
        ix4Var.a(getThemedColor(bkb.c6));
        if (Build.VERSION.SDK_INT < 31) {
            this.i1 = null;
            this.j1 = null;
            this.k1 = null;
            this.m1 = new kl0(ix4Var, ix4Var, ix4Var);
            return;
        }
        this.i1 = new cq3(false);
        this.j1 = new lx4(null);
        lx4 lx4Var = new lx4(null);
        this.k1 = lx4Var;
        kl0 kl0Var = new kl0(lx4Var, lx4Var, lx4Var);
        this.m1 = kl0Var;
        kl0Var.k = true;
    }

    public static d E0(na7 na7Var, ad7 ad7Var, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog Q0 = na7Var.Q0(-j);
            if (Q0 != null && Q0.view_forum_as_messages) {
                return new mu1(bundle);
            }
            TLRPC.ChatFull L0 = na7Var.L0(j);
            if (L0 == null) {
                L0 = ad7Var.C0(j, true, new CountDownLatch(1), false, false, 0);
            }
            if (L0 != null && L0.view_forum_as_messages) {
                return new mu1(bundle);
            }
        }
        return new qvb(bundle);
    }

    public static d F0(LaunchActivity launchActivity, Bundle bundle) {
        return E0(na7.q1(launchActivity.P), ad7.Y(launchActivity.P), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (((qvb) r0).a == (-r6.a())) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L0(mu1 mu1Var) {
        if (mu1Var.getParentLayout() == null) {
            return;
        }
        if (mu1Var.getParentLayout().getFragmentStack().size() > 1) {
            d dVar = (d) mu1Var.getParentLayout().getFragmentStack().get(mu1Var.getParentLayout().getFragmentStack().size() - 2);
            if (dVar instanceof qvb) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -mu1Var.a());
        ((ActionBarLayout) mu1Var.getParentLayout()).b(mu1Var.getParentLayout().getFragmentStack().size() - 1, new qvb(bundle));
        mu1Var.Ga = true;
        mu1Var.finishFragment();
    }

    @Override // zg6
    public final lx4 A() {
        return this.k1;
    }

    public final void A0() {
        pub pubVar = this.s;
        vf6 vf6Var = pubVar.a;
        LongSparseIntArray longSparseIntArray = pubVar.c;
        long j = this.a;
        this.K0 = longSparseIntArray.get(j, 0) == 1 && (vf6Var.f(j) == null || ((ArrayList) vf6Var.f(j)).isEmpty());
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((ivb) arrayList.get(0)).c != null && ((ivb) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        cvb cvbVar = this.O;
        if (cvbVar != null) {
            cvbVar.L0(cvbVar.w1());
        }
        T0(true);
    }

    public final void B0() {
        cj3 cj3Var = this.N0;
        if (cj3Var != null) {
            int L = gl.L(14.0f);
            fj3 fj3Var = cj3Var.L1;
            float c = (fj3Var != null ? fj3Var.c(L) : 0.0f) + 0.0f;
            fj3 fj3Var2 = this.V0;
            if (fj3Var2 != null) {
                float L2 = gl.L(7.0f);
                fj3 fj3Var3 = this.N0.L1;
                fj3Var2.setTranslationY(c - ((fj3Var3 != null ? fj3Var3.getMetadata().c.a : 0.0f) * L2));
                fj3 fj3Var4 = this.V0;
                int L3 = gl.L(14.0f);
                int L4 = gl.L(7.0f);
                r2 = fj3Var4.c(gl.U1(this.N0.L1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + c;
            } else {
                r2 = c;
            }
        } else {
            fj3 fj3Var5 = this.V0;
            if (fj3Var5 != null) {
                r2 = 0.0f + fj3Var5.c(gl.L(14.0f));
            }
        }
        this.O.setPadding(0, (int) r2, 0, this.h1 + this.f1 + (this.W ? gl.L(51.0f) : 0));
    }

    @Override // sy1
    public final cja C() {
        return this.d;
    }

    public final void C0() {
        this.b0.clear();
        this.actionBar.x();
        gl.W3(this.O);
        U0();
    }

    public final void D0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = k96.J0(hashSet.size(), "DeleteTopics");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            hdVar.U = k96.a0(null, null, 2131751486, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            hdVar.U = k96.M0(2131751485, null);
        }
        alertDialog$Builder.j(k96.M0(2131751586, null), new lt((Object) this, (Object) hashSet, (Object) arrayList, (Object) runnable, (byte) 24));
        alertDialog$Builder.g(k96.M0(2131752577, null), new sdb((byte) 26));
        hdVar.show();
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, getResourceProvider());
        }
    }

    public final void G0(boolean z, boolean z2) {
        this.h.e(!z, this.fragmentBeginToShow && z2);
    }

    public final void H0(View view) {
        if (getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w() || !(view instanceof nvb)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((nvb) view).O;
        na7 messagesController = getMessagesController();
        long j = this.a;
        long j2 = -j;
        long n = tL_forumTopic == null ? 0L : messagesController.x2(j2) ? cf3.n(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (this.u0) {
            rvb rvbVar = this.w;
            if (rvbVar != null) {
                tvb tvbVar = rvbVar.a;
                Bundle bundle = new Bundle();
                wvb wvbVar = tvbVar.a;
                bundle.putLong("dialog_id", wvbVar.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                pr8 pr8Var = new pr8(bundle, null);
                pr8Var.s = new kq8(tvbVar, tL_forumTopic, (byte) 29);
                wvbVar.presentFragment(pr8Var);
            }
            cj3 cj3Var = this.M0;
            if (cj3Var != null) {
                cj3Var.i3(j2, n, true, this);
                return;
            }
            return;
        }
        if (this.b0.size() > 0) {
            Q0(view);
            return;
        }
        if (this.inPreviewMode && gl.O1()) {
            for (d dVar : getParentLayout().getFragmentStack()) {
                if (dVar instanceof cj3) {
                    cj3 cj3Var2 = (cj3) dVar;
                    if (cj3Var2.H3()) {
                        zc7 zc7Var = cj3Var2.r2;
                        if (zc7Var.a == j2 && zc7Var.b == n) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.R0 = n;
            Y0(false, false);
        }
        mm4.n(this, j, tL_forumTopic, 0);
    }

    public final /* synthetic */ boolean I0(View view, float f) {
        if (this.u0 || getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w()) {
            return false;
        }
        if (!this.actionBar.y() && !gl.O1() && (view instanceof nvb)) {
            nvb nvbVar = (nvb) view;
            if (nvbVar.b0(f)) {
                P0(nvbVar);
                this.O.J0(true);
                this.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        Q0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public final boolean J0(TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        na7.q1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + (-this.a), System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean V = hc2.V(f());
        int i = fu5.t1;
        fu5.E0(parentActivity, this, u21.b0(this), V);
        R0(true);
        return false;
    }

    @Override // sy1
    public final boolean K() {
        return false;
    }

    public final void K0(boolean z) {
        TLRPC.Chat f;
        TLRPC.ChatPhoto chatPhoto;
        if (z && (f = f()) != null && ((chatPhoto = f.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.q3(this.K);
        profileActivity.x3((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().C() && z) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // sy1
    public final long M() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M0(int i) {
        if (this.N != i) {
            this.N = i;
            this.M.setTextColorKey(i == 0 ? bkb.rf : bkb.p7);
            this.X0.setVisibility(i == 1 ? 0 : 8);
            R0(false);
        }
    }

    public final void N0(boolean z) {
        if (gba.o() == 0) {
            return;
        }
        yub yubVar = this.d;
        if (yubVar != null) {
            if (z) {
                yubVar.setLayerType(2, null);
                yubVar.setClipChildren(false);
                yubVar.setClipToPadding(false);
            } else {
                yubVar.setLayerType(0, null);
                yubVar.setClipChildren(true);
                yubVar.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void O0(float f) {
        if (gba.o() != 0) {
            this.T0 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            cvb cvbVar = this.O;
            if (cvbVar != null) {
                float B = ls6.B(1.0f, this.T0, 0.05f, 1.0f);
                cvbVar.setPivotX(0.0f);
                cvbVar.setPivotY(0.0f);
                cvbVar.setScaleX(B);
                cvbVar.setScaleY(B);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(B);
                this.actionBar.setScaleY(B);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void P0(ue3 ue3Var) {
        boolean z;
        try {
            ue3Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r3 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getResourceProvider(), getParentActivity())};
        final TLRPC.TL_forumTopic tL_forumTopic = ue3Var.O;
        yb2 yb2Var = new yb2(getParentActivity(), this.currentAccount, r3[0].getSwipeBack(), false, new xub(this, tL_forumTopic), getResourceProvider());
        int b = r3[0].b(yb2Var.f);
        yb2Var.o = true;
        long j = this.a;
        long j2 = -j;
        yb2Var.e(j2, tL_forumTopic.id, null);
        if (hc2.y(15, f())) {
            a8 a8Var = new a8(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                a8Var.j(k96.M0(2131751440, null), R.drawable.msg_unpin, null);
            } else {
                a8Var.j(k96.M0(2131751441, null), R.drawable.msg_pin, null);
            }
            a8Var.setMinimumWidth(kk7.p2);
            z = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: sub
                public final /* synthetic */ qvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = objArr;
                    qvb qvbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            qvb qvbVar2 = this.b;
                            qvbVar2.D0 = true;
                            qvbVar2.O0 = true;
                            qvbVar2.s.t(qvbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, qvbVar2);
                            qvbVar2.finishPreviewFragment();
                            break;
                        case 1:
                            qvbVar.O0 = true;
                            qvbVar.s.z(tL_forumTopic2.id, qvbVar.a, !tL_forumTopic2.closed);
                            qvbVar.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            qvbVar.D0(hashSet, new km4(qvbVar, (byte) 4));
                            break;
                    }
                }
            });
            r3[0].addView(a8Var);
        } else {
            z = false;
        }
        a8 a8Var2 = new a8(getParentActivity(), z, z);
        if (getMessagesController().n2(j2, tL_forumTopic.id, null)) {
            a8Var2.j(k96.M0(2131743610, null), R.drawable.msg_mute, null);
        } else {
            a8Var2.j(k96.M0(2131748122, null), R.drawable.msg_unmute, null);
        }
        a8Var2.setMinimumWidth(kk7.p2);
        a8Var2.setOnClickListener(new og((d) this, (Object) tL_forumTopic, (Serializable) r3, b, (byte) 7));
        boolean z2 = false;
        r3[0].addView(a8Var2);
        if (hc2.i(this.currentAccount, f(), tL_forumTopic)) {
            a8 a8Var3 = new a8(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                a8Var3.j(k96.M0(2131745891, null), R.drawable.msg_topic_restart, null);
            } else {
                a8Var3.j(k96.M0(2131752027, null), R.drawable.msg_topic_close, null);
            }
            a8Var3.setMinimumWidth(kk7.p2);
            final byte b2 = 1;
            a8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: sub
                public final /* synthetic */ qvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b2;
                    qvb qvbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b22) {
                        case 0:
                            qvb qvbVar2 = this.b;
                            qvbVar2.D0 = true;
                            qvbVar2.O0 = true;
                            qvbVar2.s.t(qvbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, qvbVar2);
                            qvbVar2.finishPreviewFragment();
                            break;
                        case 1:
                            qvbVar.O0 = true;
                            qvbVar.s.z(tL_forumTopic2.id, qvbVar.a, !tL_forumTopic2.closed);
                            qvbVar.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            qvbVar.D0(hashSet, new km4(qvbVar, (byte) 4));
                            break;
                    }
                }
            });
            z2 = false;
            r3[0].addView(a8Var3);
        }
        if (hc2.e(this.currentAccount, f(), tL_forumTopic)) {
            a8 a8Var4 = new a8(getParentActivity(), z2, true);
            a8Var4.j(k96.J0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            a8Var4.c(bkb.p7, bkb.o7);
            a8Var4.setMinimumWidth(kk7.p2);
            final byte b3 = 2;
            a8Var4.setOnClickListener(new View.OnClickListener(this) { // from class: sub
                public final /* synthetic */ qvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b3;
                    qvb qvbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b22) {
                        case 0:
                            qvb qvbVar2 = this.b;
                            qvbVar2.D0 = true;
                            qvbVar2.O0 = true;
                            qvbVar2.s.t(qvbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, qvbVar2);
                            qvbVar2.finishPreviewFragment();
                            break;
                        case 1:
                            qvbVar.O0 = true;
                            qvbVar.s.z(tL_forumTopic2.id, qvbVar.a, !tL_forumTopic2.closed);
                            qvbVar.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            qvbVar.D0(hashSet, new km4(qvbVar, (byte) 4));
                            break;
                    }
                }
            });
            r3[0].addView(a8Var4);
        }
        boolean x2 = getMessagesController().x2(j2);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / kk7.J2));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, nme.c(-1.0f, -1));
        }
        mu1 mu1Var = new mu1(ls6.k(j, "chat_id"));
        mm4.a(mu1Var, zc7.a(j2, x2 ? cf3.n(ue3Var.O.from_id) : r2.id));
        presentFragmentAsPreviewWithMenu(mu1Var, r3[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q0(View view) {
        nvb nvbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        pub pubVar;
        int i;
        String str;
        boolean z;
        boolean z2;
        if (!(view instanceof nvb) || (tL_forumTopic = (nvbVar = (nvb) view).O) == null) {
            return;
        }
        int i2 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i2);
        HashSet hashSet = this.b0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i2));
        }
        nvbVar.e0(hashSet.contains(Integer.valueOf(i2)), true);
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        boolean isEmpty = hashSet.isEmpty();
        a aVar = this.actionBar;
        if (isEmpty) {
            aVar.x();
            return;
        }
        if (!aVar.d(null)) {
            r6 q = this.actionBar.q(null);
            if (this.inPreviewMode) {
                q.setBackgroundColor(0);
                q.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(q.getContext());
            this.d0 = numberTextView;
            numberTextView.setTextSize(18);
            this.d0.setTypeface(gl.o());
            this.d0.setTextColor(getThemedColor(bkb.x8));
            q.addView(this.d0, nme.m(1.0f, 0, -1, 72, 0, 0));
            this.d0.setOnTouchListener(new wmb((byte) 1));
            this.e0 = q.g(4, R.drawable.msg_pin, gl.L(54.0f));
            this.f0 = q.g(5, R.drawable.msg_unpin, gl.L(54.0f));
            this.g0 = q.g(6, R.drawable.msg_mute, gl.L(54.0f));
            this.h0 = q.h(7, R.drawable.msg_delete, gl.L(54.0f), k96.M0(2131751586, null));
            r7 h = q.h(12, R.drawable.msg_archive_hide, gl.L(54.0f), k96.M0(2131749133, null));
            this.i0 = h;
            h.setVisibility(8);
            r7 h2 = q.h(13, R.drawable.msg_archive_show, gl.L(54.0f), k96.M0(2131745161, null));
            this.j0 = h2;
            h2.setVisibility(8);
            r7 h3 = q.h(0, R.drawable.ic_ab_other, gl.L(54.0f), k96.M0(2131754838, null));
            this.n0 = h3;
            this.k0 = h3.e(8, R.drawable.msg_markread, k96.M0(2131748489, null));
            this.l0 = this.n0.e(9, R.drawable.msg_topic_close, k96.M0(2131752027, null));
            this.m0 = this.n0.e(10, R.drawable.msg_topic_restart, k96.M0(2131745891, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.R(null, null);
        kk7.e().k(kk7.t4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            pubVar = this.s;
            if (!hasNext) {
                break;
            }
            boolean z4 = z3;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f = pubVar.f(j, intValue);
            if (f != null) {
                if (f.unread_count != 0) {
                    i3++;
                }
                if (hc2.y(15, K0) && !f.hidden) {
                    if (f.pinned) {
                        i5++;
                    } else {
                        z2 = (z4 ? 1 : 0) + 1;
                        Iterator it2 = it;
                        if (!getMessagesController().n2(-j, intValue, null)) {
                            i4++;
                        }
                        z3 = z2;
                        it = it2;
                    }
                }
            }
            z2 = z4 ? 1 : 0;
            Iterator it22 = it;
            if (!getMessagesController().n2(-j, intValue, null)) {
            }
            z3 = z2;
            it = it22;
        }
        boolean z5 = z3;
        a8 a8Var = this.k0;
        if (i3 > 0) {
            a8Var.setVisibility(0);
            str = null;
            this.k0.j(k96.M0(2131748489, null), R.drawable.msg_markread, null);
            i = 8;
        } else {
            i = 8;
            str = null;
            a8Var.setVisibility(8);
        }
        if (i4 != 0) {
            this.C0 = false;
            this.g0.setIcon(R.drawable.msg_unmute);
            this.g0.setContentDescription(k96.M0(2131752153, str));
            z = true;
        } else {
            z = true;
            this.C0 = true;
            this.g0.setIcon(R.drawable.msg_mute);
            this.g0.setContentDescription(k96.M0(2131752163, str));
        }
        this.e0.setVisibility((z5 == z && i5 == 0) ? 0 : i);
        this.f0.setVisibility((i5 != z || z5) ? i : 0);
        this.d0.a(hashSet.size(), z);
        Iterator it3 = hashSet.iterator();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (it3.hasNext()) {
            HashSet hashSet2 = hashSet;
            TLRPC.TL_forumTopic f2 = pubVar.f(j, ((Integer) it3.next()).intValue());
            if (f2 != null) {
                if (hc2.e(this.currentAccount, K0, f2)) {
                    i8++;
                }
                if (hc2.i(this.currentAccount, K0, f2)) {
                    if (f2.id == 1) {
                        if (f2.hidden) {
                            i10++;
                        } else {
                            i9++;
                        }
                    }
                    if (!f2.hidden) {
                        if (f2.closed) {
                            i6++;
                        } else {
                            i7++;
                        }
                    }
                }
            }
            hashSet = hashSet2;
        }
        HashSet hashSet3 = hashSet;
        this.l0.setVisibility((i6 != 0 || i7 <= 0) ? 8 : 0);
        this.l0.setText(k96.M0(i7 > 1 ? 2131752026 : 2131752027, null));
        this.m0.setVisibility((i7 != 0 || i6 <= 0) ? 8 : 0);
        this.m0.setText(i6 > 1 ? k96.M0(2131745890, null) : k96.M0(2131745891, null));
        this.h0.setVisibility(i8 == hashSet3.size() ? 0 : 8);
        this.i0.setVisibility((i9 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.j0.setVisibility((i10 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.n0.m();
        U0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0211, code lost:
    
        if (getMessagesController().n.contains(java.lang.Long.valueOf(r1.id)) != false) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ec  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.animation.Animator$AnimatorListener, java.lang.String, qz5] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(boolean z) {
        ?? r12;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.ChatFull chatFull;
        String str;
        String M0;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.f == null) {
            return;
        }
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        long j2 = -j;
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j2));
        if (l7c.v(V1)) {
            this.f.setUserAvatar(V1);
        } else if (hc2.p0(K0)) {
            TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(K0.linked_monoforum_id));
            if (K02 != null) {
                this.f.setChatAvatar(K02);
            }
        } else {
            this.f.setChatAvatar(K0);
        }
        SharedPreferences sharedPreferences = na7.q1(this.currentAccount).W3;
        StringBuilder sb = new StringBuilder("dialog_bar_vis3");
        sb.append(j2);
        boolean z5 = sharedPreferences.getInt(sb.toString(), 0) == 2;
        boolean v = ls6.v("dialog_bar_report", j2, sharedPreferences, false);
        boolean v2 = ls6.v("dialog_bar_block", j2, sharedPreferences, false);
        boolean z6 = this.u0;
        if (z6) {
            r12 = 0;
            if (this.x0) {
                this.f.setTitle(k96.M0(2131746059, null));
            } else if (this.w0) {
                this.f.setTitle(k96.M0(2131746236, null));
            } else if (this.y0) {
                this.f.setTitle(k96.M0(2131752965, null));
            } else {
                o72 o72Var = this.f;
                if (this.v0) {
                    o72Var.setTitle(k96.M0(2131750558, null));
                } else {
                    o72Var.setTitle(k96.M0(2131745457, null));
                }
            }
            this.q0.setVisibility(8);
            o72 o72Var2 = this.f;
            if (o72Var2 != null && o72Var2.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = gl.L(this.q0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (K0 != null) {
                this.f.setTitle(K0.title);
                str = null;
                this.f.j(null, getMessagesController().n2(j2, 0L, null) ? getThemedDrawable("drawableMuteIcon") : null);
            } else {
                str = null;
            }
            TLRPC.ChatFull L0 = getMessagesController().L0(j);
            if (L0 != null && (chatFull2 = this.K) != null && (chatParticipants = chatFull2.participants) != null) {
                L0.participants = chatParticipants;
            }
            this.K = L0;
            if (L0 != null) {
                int i = L0.participants_count;
                if (i <= 0) {
                    TLRPC.Chat K03 = getMessagesController().K0(Long.valueOf(j));
                    M0 = K03 == null ? k96.M0(2131748587, str) : hc2.t0(K03) ? k96.M0(2131748446, str).toLowerCase() : k96.M0(2131748449, str).toLowerCase();
                } else {
                    M0 = k96.G(i, "Members", new Object[0]);
                }
            } else {
                M0 = k96.M0(2131748587, str);
            }
            this.f.setSubtitle(M0);
            r12 = str;
        }
        boolean z7 = this.fragmentBeginToShow || z;
        long j3 = na7.q1(this.currentAccount).W3.getLong(ls6.n(j2, "dialog_join_requested_time_"), -1L);
        if (K0 == null || !hc2.r0(K0) || j3 <= 0 || System.currentTimeMillis() - j3 >= 120000) {
            if (K0 != null && !z6) {
                if (!hc2.r0(K0)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(K0.id))) {
                    z4 = true;
                    z3 = true;
                } else {
                    boolean z8 = K0.join_request;
                    y5c y5cVar = this.M;
                    if (z8) {
                        y5cVar.setText(k96.M0(2131752383, r12));
                    } else {
                        y5cVar.setText(k96.M0(2131752385, r12));
                    }
                    z3 = true;
                    this.M.setClickable(true);
                    this.M.setEnabled(true);
                    z4 = false;
                }
                gl.U3(this.o0, z4, 0.5f, z3, z7);
                gl.U3(this.M, z4 ^ z3, 0.5f, z3, z7);
                M0(0);
            }
            if (!z5 || (!v2 && !v)) {
                z2 = false;
                if (this.W != z2) {
                    this.W = z2;
                    this.p0.animate().setListener(r12).cancel();
                    ar8 ar8Var = this.p0;
                    if (z7) {
                        ar8Var.animate().translationY(z2 ? 0.0f : gl.L(53.0f)).setListener(new avb(this, z2, (byte) 1));
                    } else {
                        ar8Var.setVisibility(z2 ? 0 : 8);
                        this.p0.setTranslationY(z2 ? 0.0f : gl.L(53.0f));
                    }
                }
                B0();
                this.r0.setVisibility(!z6 ? 8 : 0);
                this.S.setVisibility(!hc2.w(3, K0) ? 0 : 8);
                this.U.setVisibility((hc2.R(K0) || (!getUserConfig().p() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !hc2.N(K0)))) ? 8 : 0);
                this.T.setVisibility((K0 != null || K0.creator || hc2.r0(K0)) ? 8 : 0);
                this.V.setVisibility((K0 != null || K0.creator || hc2.N(K0)) ? 8 : 0);
                T0(true);
                this.I0 = getMessagesController().e1(j, true, r12);
                z0(false);
            }
            this.M.setText(k96.M0(2131746010, r12));
            this.M.setClickable(true);
            this.M.setEnabled(true);
            gl.U3(this.o0, false, 0.5f, true, false);
            gl.U3(this.M, true, 0.5f, true, false);
            M0(1);
        } else {
            this.M.a(k96.M0(2131752381, r12), z7);
            this.M.setEnabled(false);
            gl.U3(this.o0, false, 0.5f, true, z7);
            gl.U3(this.M, true, 0.5f, true, z7);
            M0(0);
        }
        z2 = true;
        if (this.W != z2) {
        }
        B0();
        this.r0.setVisibility(!z6 ? 8 : 0);
        this.S.setVisibility(!hc2.w(3, K0) ? 0 : 8);
        this.U.setVisibility((hc2.R(K0) || (!getUserConfig().p() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !hc2.N(K0)))) ? 8 : 0);
        this.T.setVisibility((K0 != null || K0.creator || hc2.r0(K0)) ? 8 : 0);
        this.V.setVisibility((K0 != null || K0.creator || hc2.N(K0)) ? 8 : 0);
        T0(true);
        this.I0 = getMessagesController().e1(j, true, r12);
        z0(false);
    }

    public final void S0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(bkb.rf));
        this.h.updateColors();
        ar8 ar8Var = this.p0;
        int i = bkb.c6;
        ar8Var.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(getThemedColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(bkb.r8));
        }
        this.s0.setBackgroundColor(getThemedColor(i));
    }

    public final void T0(boolean z) {
        if (this.R == null) {
            return;
        }
        na7 messagesController = getMessagesController();
        long j = this.a;
        boolean z2 = (hc2.r0(getMessagesController().K0(Long.valueOf(j))) || !hc2.w(15, messagesController.K0(Long.valueOf(j))) || this.t0 || this.u0 || this.K0) ? false : true;
        this.L = z2;
        this.R.setVisibility(z2 ? 0 : 8);
        G0(!this.L, z);
    }

    public final void U0() {
        boolean z = hc2.y(15, f()) && !this.b0.isEmpty();
        if (this.c0 != z) {
            this.c0 = z;
            hvb hvbVar = this.r;
            hvbVar.l(0, hvbVar.b());
        }
    }

    public final void V0(float f) {
        this.X = f;
        W0();
        this.c1 = true;
        float f2 = 1.0f - f;
        this.f.getTitleTextView().setAlpha(f2);
        this.f.getSubtitleTextView().setAlpha(f2);
        vec vecVar = this.b1;
        if (vecVar != null) {
            vecVar.setTranslationY((-gl.L(16.0f)) * f2);
            this.b1.setAlpha(f);
        }
        this.s0.setTranslationY((-gl.L(16.0f)) * f2);
        this.s0.setAlpha(f);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f2);
        if (this.a1) {
            float A = tb4.A(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(A);
            this.O.setScaleY(A);
        }
    }

    @Override // org.telegram.ui.ActionBar.d, zg6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        return false;
    }

    public final void W0() {
        int themedColor = getThemedColor(bkb.u8);
        a aVar = this.actionBar;
        int i = bkb.x8;
        aVar.H(bm2.f(this.X, themedColor, getThemedColor(i)), false);
        this.actionBar.H(bm2.f(this.X, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(bm2.f(this.X, getThemedColor(bkb.s8), getThemedColor(bkb.y8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(bm2.f(this.X, getThemedColor(bkb.r8), getThemedColor(bkb.c6)));
    }

    public final void X0() {
        q22 q22Var = this.E0;
        if (q22Var == null || q22Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        cm2 cm2Var = new cm2(R.drawable.ic_ab_other, 0);
        cm2Var.c(gl.L(16.0f));
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        if (hc2.y(15, f())) {
            this.E0.e.setText(gl.H2(gl.T2(k96.M0(2131747944, null)), spannableStringBuilder, "%s"));
            return;
        }
        String M0 = k96.M0(2131750458, null);
        TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.a, 1L);
        if (f != null) {
            M0 = f.title;
        }
        this.E0.e.setText(gl.T2(k96.a0("NoTopicsDescriptionUser", null, 2131747943, M0)));
    }

    public final void Y0(boolean z, boolean z2) {
        tub tubVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.O0) {
            z = true;
        }
        this.O0 = false;
        pub pubVar = this.s;
        long j = this.a;
        ArrayList l = pubVar.l(j);
        if (l != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (l7c.v(na7.q1(this.currentAccount).V1(Long.valueOf(-j))) && this.v0) {
                arrayList.add(new ivb(3, null));
            }
            for (int i = 0; i < l.size(); i++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList.add(new ivb(0, (TLRPC.TL_forumTopic) l.get(i)));
                }
            }
            if (!arrayList.isEmpty() && !pubVar.e(j) && this.W0) {
                arrayList.add(new ivb(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.L0.b(size + 4);
                z = false;
            }
            this.y = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ivb ivbVar = (ivb) arrayList.get(i2);
                if (ivbVar != null && (tL_forumTopic = ivbVar.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            cvb cvbVar = this.O;
            if (cvbVar != null) {
                if (cvbVar.getItemAnimator() != (z ? this.J0 : null)) {
                    this.O.setItemAnimator(z ? this.J0 : null);
                }
            }
            hvb hvbVar = this.r;
            if (hvbVar != null) {
                hvbVar.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (tubVar = this.G) != null) {
                tubVar.g1(0, 0);
                this.D0 = false;
            }
        }
        A0();
        X0();
    }

    @Override // sy1
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        ui5 ui5Var;
        ui5 ui5Var2;
        cj3 cj3Var = this.N0;
        final byte b = 0;
        this.f1 = (cj3Var == null || !cj3Var.X) ? 0 : gl.L(72.0f);
        cj3 cj3Var2 = this.N0;
        this.g1 = (cj3Var2 == null || !cj3Var2.X) ? 0 : gl.L(64.0f);
        yub yubVar = new yub(this, context);
        this.d = yubVar;
        this.fragmentView = yubVar;
        zkb.h(bkb.c6, getResourceProvider(), yubVar);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final byte b2 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!gl.O1() || ((ui5Var2 = this.parentLayout) != null && ((ActionBarLayout) ui5Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setActionBarMenuOnItemClick(new bvb(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: qub
            public final /* synthetic */ qvb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7 r7Var;
                byte b3 = b;
                qvb qvbVar = this.b;
                switch (b3) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        break;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        break;
                    case 3:
                        cj3 cj3Var3 = qvbVar.N0;
                        if (cj3Var3 != null && (r7Var = cj3Var3.k0) != null) {
                            r7Var.performClick();
                            break;
                        }
                        break;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        break;
                }
            }
        });
        r6 t = this.actionBar.t();
        final byte b3 = 3;
        if (this.N0 != null) {
            r7 a = t.a(0, R.drawable.outline_header_search);
            this.q0 = a;
            a.setOnClickListener(new View.OnClickListener(this) { // from class: qub
                public final /* synthetic */ qvb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r7 r7Var;
                    byte b32 = b3;
                    qvb qvbVar = this.b;
                    switch (b32) {
                        case 0:
                            if (!qvbVar.t0) {
                                qvbVar.K0(false);
                                break;
                            }
                            break;
                        case 1:
                            qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                            qvbVar.R0(false);
                            break;
                        case 2:
                            qvbVar.finishPreviewFragment();
                            break;
                        case 3:
                            cj3 cj3Var3 = qvbVar.N0;
                            if (cj3Var3 != null && (r7Var = cj3Var3.k0) != null) {
                                r7Var.performClick();
                                break;
                            }
                            break;
                        default:
                            qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                            break;
                    }
                }
            });
        } else {
            r7 a2 = t.a(0, R.drawable.outline_header_search);
            this.q0 = a2;
            a2.N();
            a2.K(new q10(this, (byte) 23));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(k96.M0(2131745644, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            zkb.X(searchField, bkb.F6, getResourceProvider());
            zkb.D(searchField, bkb.Ij, getResourceProvider());
            zkb.v(searchField, bkb.Me, getResourceProvider());
        }
        r7 b4 = t.b(0, R.drawable.ic_ab_other, null);
        this.r0 = b4;
        b4.setContentDescription(k96.M0(2131754838, null));
        this.r0.e(1, R.drawable.msg_discussion, k96.M0(2131743765, null));
        final byte b5 = 2;
        this.S = this.r0.e(2, R.drawable.msg_addcontact, k96.M0(2131754398, null));
        r7 r7Var = this.r0;
        this.U = r7Var.d(14, 0, new oy8(R.raw.boosts, gl.L(24.0f), gl.L(24.0f)), k96.M0(2131753582, null), true, false, r7Var.n0);
        this.R = this.r0.e(3, R.drawable.msg_topic_create, k96.M0(2131751690, null));
        this.V = this.r0.e(15, R.drawable.msg_report, k96.M0(2131746037, null));
        this.T = this.r0.d(11, R.drawable.msg_leave, null, k96.M0(2131748798, null), true, false, null);
        o72 o72Var = new o72(context, this, false, this.resourceProvider);
        this.f = o72Var;
        o72Var.getAvatarImageView().setRoundRadius(gl.L(16.0f));
        this.f.setOccupyStatusBar((!gl.O1() || ((ui5Var = this.parentLayout) != null && ((ActionBarLayout) ui5Var).b)) && !this.inPreviewMode);
        o72 o72Var2 = this.f;
        long j = -this.a;
        o72Var2.b = j < 0;
        o72Var2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, nme.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        byte b6 = 17;
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new g6(this, b6));
        }
        this.O = new cvb(this, context);
        zec zecVar = new zec(this.d);
        ViewGroup viewGroup = this.d;
        kl0 kl0Var = this.m1;
        kl0Var.h = zecVar;
        kl0Var.i = viewGroup;
        cvb cvbVar = this.O;
        cj3 cj3Var3 = this.N0;
        if (cj3Var3 != null) {
            viewGroup = (ViewGroup) cj3Var3.getFragmentView();
        }
        cvb cvbVar2 = this.O;
        Objects.requireNonNull(cvbVar2);
        this.n1 = new mdc(cvbVar, viewGroup, new ga5(cvbVar2, (byte) 2));
        this.O.E0(new km4(this, (byte) 6));
        SpannableString spannableString = new SpannableString("#");
        lm4 d = mm4.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, gl.L(2.0f), gl.L(16.0f), gl.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        dh3 dh3Var = new dh3(this, gl.H2(k96.M0(2131754718, null), spannableString, "#"), gl.H2(k96.M0(2131754720, null), spannableString, "#"));
        this.x = dh3Var;
        dh3Var.b();
        byte b7 = this.F ? (byte) 2 : (byte) 0;
        this.E = b7;
        this.x.X = b7 != 0;
        evb evbVar = new evb(this);
        this.O.setHideIfEmpty(false);
        evbVar.m = false;
        evbVar.C = false;
        cvb cvbVar3 = this.O;
        this.J0 = evbVar;
        cvbVar3.setItemAnimator(evbVar);
        this.O.setOnScrollListener(new fvb(this, b));
        cvb cvbVar4 = this.O;
        cvbVar4.X1 = true;
        cvbVar4.Y1 = false;
        t29 t29Var = new t29(cvbVar4, true);
        this.L0 = t29Var;
        this.O.setItemsEnterAnimator(t29Var);
        this.O.setOnItemClickListener(new f09(this, (byte) 24));
        this.O.setOnItemLongClickListener(new rub(this));
        this.O.setOnScrollListener(new fvb(this, b2));
        cvb cvbVar5 = this.O;
        tub tubVar = new tub(this);
        this.G = tubVar;
        cvbVar5.setLayoutManager(tubVar);
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new uub(this));
        pvb pvbVar = new pvb(this);
        this.Q = pvbVar;
        vub vubVar = new vub(this, pvbVar);
        this.P = vubVar;
        vubVar.h(this.O);
        this.d.addView(this.O, nme.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -gl.L(100.0f);
        un4 un4Var = new un4(this.resourceProvider, getParentActivity(), false);
        this.h = un4Var;
        this.d.addView(un4Var, un4.b());
        final byte b8 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: qub
            public final /* synthetic */ qvb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7 r7Var2;
                byte b32 = b8;
                qvb qvbVar = this.b;
                switch (b32) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        break;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        break;
                    case 3:
                        cj3 cj3Var32 = qvbVar.N0;
                        if (cj3Var32 != null && (r7Var2 = cj3Var32.k0) != null) {
                            r7Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
        this.h.setContentDescription(k96.M0(2131751690, null));
        pi4 pi4Var = new pi4(context, null);
        pi4Var.setViewType(24);
        pi4Var.setVisibility(8);
        pi4Var.x = true;
        ttb ttbVar = new ttb(context, b2);
        TextView textView = new TextView(context);
        ttbVar.d = textView;
        if (k96.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new cm2(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) k96.M0(2131744018, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131744018, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new cm2(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        zkb.X(textView, bkb.x6, getResourceProvider());
        boolean z = k96.a0;
        ttbVar.addView(textView, nme.d(-2, -2.0f, 81, z ? 72.0f : 32.0f, 0.0f, z ? 32.0f : 72.0f, 32.0f));
        this.n = ttbVar;
        textView.setAlpha(0.0f);
        q22 q22Var = new q22(this, context, pi4Var);
        this.E0 = q22Var;
        try {
            q22Var.b.getImageReceiver().M(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(k96.M0(2131747946, null));
        X0();
        this.n.addView(pi4Var);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new ar8(context, (byte) 17);
        y5c y5cVar = new y5c(context);
        this.M = y5cVar;
        this.p0.addView(y5cVar);
        this.d.addView(this.p0, nme.e(-1, 51, 80));
        this.M.setOnClickListener(new wub(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(gl.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, nme.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.X0.setContentDescription(k96.M0(2131752029, null));
        ImageView imageView2 = this.X0;
        int i = bkb.Te;
        imageView2.setBackground(sjb.c(null, sjb.b(getThemedColor(i))));
        zkb.s(this.X0, i, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, nme.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: qub
            public final /* synthetic */ qvb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7 r7Var2;
                byte b32 = b2;
                qvb qvbVar = this.b;
                switch (b32) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        break;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        break;
                    case 3:
                        cj3 cj3Var32 = qvbVar.N0;
                        if (cj3Var32 != null && (r7Var2 = cj3Var32.k0) != null) {
                            r7Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        break;
                }
            }
        });
        this.X0.setVisibility(8);
        R0(false);
        zab zabVar = new zab(b5, context, this);
        this.e = zabVar;
        if (this.N0 == null) {
            this.d.addView(zabVar, nme.e(-1, -1, kk7.D1));
        }
        mvb mvbVar = new mvb(this, context);
        this.s0 = mvbVar;
        mvbVar.setVisibility(8);
        this.e.addView(this.s0, nme.d(-1, -1.0f, kk7.D1, 0.0f, 44.0f, 0.0f, 0.0f));
        mvb mvbVar2 = this.s0;
        int i2 = bkb.c6;
        zkb.h(i2, getResourceProvider(), mvbVar2);
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().C0(this.a, true, null, true, false, 0);
        fj3 fj3Var = new fj3(context);
        this.V0 = fj3Var;
        fj3Var.setPadding(gl.L(11.0f), gl.L(21.0f), gl.L(11.0f), gl.L(21.0f));
        il0 c = kl0Var.c(this.V0, nod.n(this.resourceProvider), false);
        ug8.r(c, gl.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c);
        this.V0.setOnAnimatedHeightChangedListener(new km4(this, b2));
        this.d.addView(this.V0, nme.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat f = f();
        if (f != null) {
            xy1 xy1Var = new xy1(this, f);
            this.S0 = xy1Var;
            this.V0.addView(xy1Var.b(), nme.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            xy1 xy1Var2 = this.S0;
            xy1Var2.m = new rub(this);
            TLRPC.ChatFull chatFull = this.K;
            xy1Var2.j = chatFull;
            if (chatFull != null) {
                xy1Var2.c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            p81 p81Var = new p81(this, context, this);
            this.H0 = p81Var;
            this.G0.addView(p81Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c2 = nme.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c2.topMargin = gl.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c2);
        }
        y0();
        si9 si9Var = new si9((byte) 13, context, this);
        this.Q0 = si9Var;
        si9Var.setForeground(new ColorDrawable(bm2.o(getThemedColor(i2), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: qub
            public final /* synthetic */ qvb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r7 r7Var2;
                byte b32 = b5;
                qvb qvbVar = this.b;
                switch (b32) {
                    case 0:
                        if (!qvbVar.t0) {
                            qvbVar.K0(false);
                            break;
                        }
                        break;
                    case 1:
                        qvbVar.getMessagesController().d2(-qvbVar.a, null, qvbVar.f());
                        qvbVar.R0(false);
                        break;
                    case 2:
                        qvbVar.finishPreviewFragment();
                        break;
                    case 3:
                        cj3 cj3Var32 = qvbVar.N0;
                        if (cj3Var32 != null && (r7Var2 = cj3Var32.k0) != null) {
                            r7Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        qvbVar.presentFragment(vtb.e0(qvbVar.a, 0L));
                        break;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && gl.O1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d dVar = (d) it.next();
                if (dVar instanceof cj3) {
                    cj3 cj3Var4 = (cj3) dVar;
                    if (cj3Var4.H3()) {
                        zc7 zc7Var = cj3Var4.r2;
                        if (zc7Var.a == j) {
                            this.R0 = zc7Var.b;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            Y0(false, false);
        }
        R0(false);
        S0();
        if (hc2.R(f())) {
            getMessagesController().E0().a(j, new ae9(this, (byte) 22));
        }
        View view = this.fragmentView;
        rub rubVar = new rub(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(view, rubVar);
        return this.fragmentView;
    }

    @Override // sy1
    public final long d() {
        return 0L;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = kk7.S;
        long j = this.a;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j) {
                R0(false);
                xy1 xy1Var = this.S0;
                if (xy1Var != null) {
                    xy1Var.j = chatFull2;
                    xy1Var.c(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                z0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == kk7.x5) {
            R0(false);
        } else if (i == kk7.q3) {
            if (j == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == kk7.s5) {
            if (j == ((Long) objArr[0]).longValue()) {
                Y0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    y0();
                }
                A0();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = na7.q5;
            if (intValue == 8192) {
                R0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().g4.y(j, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Y0(true, false);
                if (!canScrollVertically) {
                    this.G.m0(0);
                }
            }
        } else if (i == kk7.r) {
            Y0(false, false);
        } else if (i == kk7.v2) {
            Long l = (Long) objArr[0];
            if (j == l.longValue()) {
                this.I0 = getMessagesController().e1(l.longValue(), false, null);
                p81 p81Var = this.H0;
                if (p81Var != null) {
                    p81Var.a(!this.fragmentBeginToShow);
                }
                z0(false);
            }
        } else if (i == kk7.e0) {
            Y0(false, false);
            R0(true);
        } else if (i != kk7.t5 && i == kk7.s) {
            removeSelfFromStack(true);
        }
        if (i == kk7.g0 && getParentActivity() != null && this.inPreviewMode && gl.O1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j) || booleanValue) {
                if (this.R0 != 0) {
                    this.R0 = 0L;
                    Y0(false, false);
                    return;
                }
                return;
            }
            if (this.R0 != longValue2) {
                this.R0 = longValue2;
                Y0(false, false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // sy1
    public final TLRPC.Chat f() {
        return getMessagesController().K0(Long.valueOf(this.a));
    }

    @Override // sy1
    public final fc2 getGroupCall() {
        fc2 fc2Var = this.I0;
        if (fc2Var == null || !(fc2Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return fc2Var;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        mvb mvbVar = this.s0;
        if (mvbVar != null && mvbVar.a0 != null) {
            int i = l35.h;
        }
        return arrayList;
    }

    @Override // sy1
    public final TLRPC.User h() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.t0 ? bkb.c6 : bkb.r8);
        if (this.actionBar.y()) {
            themedColor = getThemedColor(bkb.v8);
        }
        return bm2.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // zg6
    public final lx4 j() {
        return this.j1;
    }

    @Override // sy1
    public final boolean n() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (this.b0.isEmpty()) {
            if (!this.t0) {
                return super.onBackPressed(z);
            }
            if (z) {
                this.actionBar.B(this.q0.T(false));
            }
        } else if (z) {
            C0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyHidden() {
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.n(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        na7 messagesController = getMessagesController();
        long j = this.a;
        messagesController.X2(0, j, true);
        long j2 = -j;
        this.e1 = getMessagesController().s4(j2);
        kk7.f(this.currentAccount).b(this, kk7.x5);
        kk7.f(this.currentAccount).b(this, kk7.q3);
        kk7.f(this.currentAccount).b(this, kk7.S);
        kk7.f(this.currentAccount).b(this, kk7.s5);
        kk7.f(this.currentAccount).b(this, 2);
        kk7.f(this.currentAccount).b(this, kk7.r);
        kk7.f(this.currentAccount).b(this, kk7.v2);
        kk7.f(this.currentAccount).b(this, kk7.e0);
        kk7.f(this.currentAccount).b(this, kk7.t5);
        kk7.f(this.currentAccount).b(this, kk7.s);
        kk7.f(this.currentAccount).b(this, kk7.g0);
        Y0(false, false);
        tx9.s(this.currentAccount);
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j));
        if (hc2.T(K0)) {
            getMessagesController().a5(K0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().h1(j2);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        this.P0.e();
        kk7.f(this.currentAccount).n(this, kk7.x5);
        kk7.f(this.currentAccount).n(this, kk7.q3);
        kk7.f(this.currentAccount).n(this, kk7.S);
        kk7.f(this.currentAccount).n(this, kk7.s5);
        kk7.f(this.currentAccount).n(this, 2);
        kk7.f(this.currentAccount).n(this, kk7.r);
        kk7.f(this.currentAccount).n(this, kk7.v2);
        kk7.f(this.currentAccount).n(this, kk7.e0);
        kk7.f(this.currentAccount).n(this, kk7.t5);
        kk7.f(this.currentAccount).n(this, kk7.s);
        kk7.f(this.currentAccount).n(this, kk7.g0);
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        if (hc2.T(K0)) {
            getMessagesController().a5(K0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.e1) {
            this.e1 = false;
            getMessagesController().c4(-j);
        }
        cj3 cj3Var = this.N0;
        if (cj3Var == null || cj3Var.H3 == null) {
            return;
        }
        cj3Var.getActionBar().setSearchAvatarImageView(null);
        this.N0.H3.N = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().g4.r;
        long j = this.a;
        int i = longSparseIntArray.get(j, 0) - 1;
        longSparseIntArray.put(j, i >= 0 ? i : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        pub pubVar = getMessagesController().g4;
        LongSparseIntArray longSparseIntArray = pubVar.r;
        long j = this.a;
        longSparseIntArray.put(j, longSparseIntArray.get(j, 0) + 1);
        pubVar.y(j, true);
        this.H = false;
        gl.W3(this.O);
        this.H = true;
        setBulletinDelegate(new s10(this, (byte) 21));
        if (!this.inPreviewMode || getMessagesController().r2(-j)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onSlideProgress(boolean z, float f) {
        if (gba.o() == 0 || !this.U0) {
            return;
        }
        O0(f);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        int b;
        super.onThemeColorsChanged();
        ix4 ix4Var = this.l1;
        if (ix4Var != null) {
            ix4Var.a(getThemedColor(bkb.c6));
        }
        if (this.X0 != null && (b = sjb.b(getThemedColor(bkb.Te))) != this.r1) {
            this.r1 = b;
            bkb.F1(this.X0.getBackground(), b, true);
        }
        for (int i = 0; i < 2; i++) {
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(bkb.F8), true);
            this.actionBar.J(getThemedColor(bkb.D8), false, true);
            this.actionBar.J(getThemedColor(bkb.E8), true, true);
            this.actionBar.K(getThemedColor(bkb.H5), true);
        }
        si9 si9Var = this.Q0;
        if (si9Var != null && (si9Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(bm2.o(getThemedColor(bkb.c6), 100));
        }
        S0();
        try {
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setActionModeColor(getThemedColor(bkb.c6));
            }
            dh3 dh3Var = this.x;
            if (dh3Var != null) {
                dh3Var.h();
            }
            if (this.actionBar != null && this.c1) {
                W0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(bkb.x8));
            }
            r7 r7Var = this.q0;
            if (r7Var == null || r7Var.getSearchField() == null) {
                return;
            }
            this.q0.getSearchField().setCursorColor(getThemedColor(bkb.Me));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        rh3 rh3Var;
        si9 si9Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (si9Var = this.Q0) != null) {
            if (si9Var.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z) {
            z0(false);
        }
        this.P0.e();
        if (z) {
            return;
        }
        if (this.u0 && this.I) {
            removeSelfFromStack();
            cj3 cj3Var = this.M0;
            if (cj3Var != null) {
                cj3Var.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.J) {
            removeSelfFromStack();
            cj3 cj3Var2 = this.N0;
            if (cj3Var2 == null || (rh3Var = cj3Var2.H3) == null || !rh3Var.c()) {
                return;
            }
            this.N0.H3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        si9 si9Var = this.Q0;
        if (si9Var == null || si9Var.getVisibility() != 0) {
            return;
        }
        si9 si9Var2 = this.Q0;
        if (z) {
            si9Var2.setAlpha(1.0f - f);
        } else {
            si9Var2.setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.P0.d();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.U0 = true;
            N0(true);
        } else {
            this.U0 = false;
            N0(false);
            O0(1.0f);
        }
    }

    @Override // sy1
    public final o72 q() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setPreviewOpenedProgress(float f) {
        o72 o72Var = this.f;
        if (o72Var != null) {
            o72Var.setAlpha(f);
            this.r0.setAlpha(f);
            r7 r7Var = this.q0;
            if (r7Var != null) {
                r7Var.setAlpha(f);
            }
            this.actionBar.getBackButton().setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void setPreviewReplaceProgress(float f) {
        o72 o72Var = this.f;
        if (o72Var != null) {
            o72Var.setAlpha(f);
            this.f.setTranslationX((1.0f - f) * gl.L(40.0f));
        }
    }

    @Override // zg6
    public final void v() {
        this.O.z0(0);
    }

    public final void w0(boolean z) {
        rh3 rh3Var;
        this.t0 = z;
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z0.cancel();
        }
        byte b = 0;
        if (this.b1 == null) {
            vec l = this.s0.l(8, false);
            this.b1 = l;
            if (this.N0 != null) {
                zkb.h(bkb.c6, getResourceProvider(), l);
            }
            this.e.addView(this.b1, nme.c(44.0f, -1));
        }
        this.Z0 = ValueAnimator.ofFloat(this.X, z ? 1.0f : 0.0f);
        gl.U3(this.s0, false, 1.0f, true, true);
        cj3 cj3Var = this.N0;
        if (cj3Var != null && (rh3Var = cj3Var.H3) != null) {
            rh3Var.N = !z;
        }
        this.a1 = !z && this.s0.getVisibility() == 0 && this.s0.getAlpha() == 1.0f;
        this.Z0.addUpdateListener(new gja(this, (byte) 27));
        this.s0.setVisibility(0);
        if (z) {
            gl.W2(getParentActivity(), this.classGuid);
            T0(false);
        } else {
            this.r0.setVisibility(0);
        }
        this.Z0.addListener(new avb(this, z, b));
        this.Z0.setDuration(200L);
        this.Z0.setInterpolator(s33.f);
        this.Z0.start();
        kk7.e().k(kk7.t4, Boolean.TRUE);
    }

    public final void x0() {
        cq3 cq3Var;
        View view;
        a aVar;
        if (Build.VERSION.SDK_INT < 31 || (cq3Var = this.i1) == null) {
            return;
        }
        int L = gl.L(48.0f);
        int L2 = gl.L(48.0f) + ((int) this.V0.c(gl.L(14.0f)));
        cj3 cj3Var = this.N0;
        if (cj3Var != null) {
            view = cj3Var.fragmentView;
            aVar = cj3Var.getActionBar();
        } else {
            view = this.fragmentView;
            aVar = this.actionBar;
        }
        int measuredHeight = (view.getMeasuredHeight() - this.h1) - gl.L(8.0f);
        int L3 = measuredHeight - gl.L(56.0f);
        this.p1.set(0.0f, -L, view.getMeasuredWidth(), aVar.getMeasuredHeight() + L + L2);
        RectF rectF = this.q1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, e66.e(262144) ? 0.0f : -gl.L(48.0f));
        cq3Var.g(this.N0 != null ? 2 : 1, this.o1);
        cq3Var.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void y0() {
        tub tubVar;
        pub pubVar = this.s;
        long j = this.a;
        if (pubVar.e(j) || (tubVar = this.G) == null) {
            return;
        }
        int M0 = tubVar.M0();
        if (this.b.isEmpty() || M0 >= this.r.b() - 5) {
            pubVar.o(j);
        }
        A0();
    }

    public final void z0(boolean z) {
        String str;
        na7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        TLRPC.ChatFull L0 = getMessagesController().L0(j);
        if (this.I0 != null && ((str = this.z0) != null || this.A0)) {
            rgc.l(K0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else {
            if (this.z0 == null || !z || L0 == null || L0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            ir2.v(null, 2131748721, u21.b0(this), R.raw.linkbroken, 36);
            this.z0 = null;
        }
    }

    @Override // sy1
    public final void s() {
    }

    @Override // sy1
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
    }
}
