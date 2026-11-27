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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class tzb extends e implements fn7, kz1, ej6 {
    public static final HashSet s1 = new HashSet();
    public boolean A0;
    public HashSet B0;
    public boolean C0;
    public boolean D0;
    public byte E;
    public h32 E0;
    public boolean F;
    public izb F0;
    public uyb G;
    public FrameLayout G0;
    public boolean H;
    public y81 H0;
    public boolean I;
    public vc2 I0;
    public boolean J;
    public gzb J0;
    public TLRPC.ChatFull K;
    public boolean K0;
    public boolean L;
    public i69 L0;
    public y9c M;
    public uj3 M0;
    public boolean N;
    public uj3 N0;
    public ezb O;
    public boolean O0;
    public wyb P;
    public final pn P0;
    public szb Q;
    public nf9 Q0;
    public b8 R;
    public long R0;
    public b8 S;
    public pz1 S0;
    public b8 T;
    public float T0;
    public b8 U;
    public boolean U0;
    public b8 V;
    public xj3 V0;
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
    public uic b1;
    public int c;
    public boolean c0;
    public boolean c1;
    public zyb d;
    public NumberTextView d0;
    public qzb d1;
    public h8b e;
    public s7 e0;
    public boolean e1;
    public f82 f;
    public s7 f0;
    public int f1;
    public s7 g0;
    public int g1;
    public zp4 h;
    public s7 h0;
    public int h1;
    public s7 i0;
    public final tq3 i1;
    public s7 j0;
    public final rz4 j1;
    public b8 k0;
    public final rz4 k1;
    public b8 l0;
    public final oz4 l1;
    public b8 m0;
    public final ll0 m1;
    public uxb n;
    public s7 n0;
    public lhc n1;
    public RadialProgressView o0;
    public final ArrayList o1;
    public ir8 p0;
    public final RectF p1;
    public s7 q0;
    public final RectF q1;
    public final jzb r;
    public s7 r0;
    public int r1;
    public final qyb s;
    public ozb s0;
    public boolean t0;
    public final boolean u0;
    public final boolean v0;
    public uzb w;
    public final boolean w0;
    public xh3 x;
    public final boolean x0;
    public int y;
    public final boolean y0;
    public String z0;

    public tzb(Bundle bundle) {
        super(bundle);
        this.b = new ArrayList();
        this.r = new jzb(this);
        this.y = 0;
        this.F = true;
        this.H = true;
        this.W = true;
        this.X = 0.0f;
        this.b0 = new HashSet();
        this.C0 = false;
        this.P0 = new pn(new int[]{jn7.t5});
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
        this.W0 = !qu6.v("topics_end_reached_", r1, getUserConfig().j(), false);
        oz4 oz4Var = new oz4();
        this.l1 = oz4Var;
        oz4Var.a(getThemedColor(aob.d6));
        if (Build.VERSION.SDK_INT < 31) {
            this.i1 = null;
            this.j1 = null;
            this.k1 = null;
            this.m1 = new ll0(oz4Var, oz4Var, oz4Var);
            return;
        }
        this.i1 = new tq3(false);
        this.j1 = new rz4(null);
        rz4 rz4Var = new rz4(null);
        this.k1 = rz4Var;
        ll0 ll0Var = new ll0(rz4Var, rz4Var, rz4Var);
        this.m1 = ll0Var;
        ll0Var.k = true;
    }

    public static e F0(uc7 uc7Var, jf7 jf7Var, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog S0 = uc7Var.S0(-j);
            if (S0 != null && S0.view_forum_as_messages) {
                return new zu1(bundle);
            }
            TLRPC.ChatFull N0 = uc7Var.N0(j);
            if (N0 == null) {
                N0 = jf7Var.C0(j, true, new CountDownLatch(1), false, false, 0);
            }
            if (N0 != null && N0.view_forum_as_messages) {
                return new zu1(bundle);
            }
        }
        return new tzb(bundle);
    }

    public static e G0(LaunchActivity launchActivity, Bundle bundle) {
        return F0(uc7.s1(launchActivity.P), jf7.Y(launchActivity.P), bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (((tzb) r0).a == (-r6.a())) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void M0(zu1 zu1Var) {
        if (zu1Var.getParentLayout() == null) {
            return;
        }
        if (zu1Var.getParentLayout().getFragmentStack().size() > 1) {
            e eVar = (e) zu1Var.getParentLayout().getFragmentStack().get(zu1Var.getParentLayout().getFragmentStack().size() - 2);
            if (eVar instanceof tzb) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -zu1Var.a());
        ((ActionBarLayout) zu1Var.getParentLayout()).b(zu1Var.getParentLayout().getFragmentStack().size() - 1, new tzb(bundle));
        zu1Var.Ga = true;
        zu1Var.finishFragment();
    }

    @Override // ej6
    public final rz4 A() {
        return this.k1;
    }

    public final void A0(boolean z) {
        String str;
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        TLRPC.ChatFull N0 = getMessagesController().N0(j);
        if (this.I0 != null && ((str = this.z0) != null || this.A0)) {
            xkc.l(M0, str, false, Boolean.valueOf(!r1.b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.z0 = null;
            this.A0 = false;
        } else {
            if (this.z0 == null || !z || N0 == null || N0.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            bs2.v(null, 2131748667, d31.b0(this), R.raw.linkbroken, 36);
            this.z0 = null;
        }
    }

    public final void B0() {
        qyb qybVar = this.s;
        zh6 zh6Var = qybVar.a;
        LongSparseIntArray longSparseIntArray = qybVar.c;
        long j = this.a;
        this.K0 = longSparseIntArray.get(j, 0) == 1 && (zh6Var.f(j) == null || ((ArrayList) zh6Var.f(j)).isEmpty());
        if (this.E0 != null) {
            ArrayList arrayList = this.b;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((kzb) arrayList.get(0)).c != null && ((kzb) arrayList.get(0)).c.id == 1)) {
                this.E0.e(this.K0, this.fragmentBeginToShow);
            }
        }
        ezb ezbVar = this.O;
        if (ezbVar != null) {
            ezbVar.M0(ezbVar.x1());
        }
        U0(true);
    }

    @Override // kz1
    public final wma C() {
        return this.d;
    }

    public final void C0() {
        uj3 uj3Var = this.N0;
        if (uj3Var != null) {
            int L = hl.L(14.0f);
            xj3 xj3Var = uj3Var.L1;
            float c = (xj3Var != null ? xj3Var.c(L) : 0.0f) + 0.0f;
            xj3 xj3Var2 = this.V0;
            if (xj3Var2 != null) {
                float L2 = hl.L(7.0f);
                xj3 xj3Var3 = this.N0.L1;
                xj3Var2.setTranslationY(c - ((xj3Var3 != null ? xj3Var3.getMetadata().c.a : 0.0f) * L2));
                xj3 xj3Var4 = this.V0;
                int L3 = hl.L(14.0f);
                int L4 = hl.L(7.0f);
                r2 = xj3Var4.c(hl.U1(this.N0.L1 != null ? r5.getMetadata().c.a : 0.0f, L3, L4)) + c;
            } else {
                r2 = c;
            }
        } else {
            xj3 xj3Var5 = this.V0;
            if (xj3Var5 != null) {
                r2 = 0.0f + xj3Var5.c(hl.L(14.0f));
            }
        }
        this.O.setPadding(0, (int) r2, 0, this.h1 + this.f1 + (this.W ? hl.L(51.0f) : 0));
    }

    public final void D0() {
        this.b0.clear();
        this.actionBar.y();
        hl.V3(this.O);
        V0();
    }

    public final void E0(HashSet hashSet, Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String J0 = ob6.J0(hashSet.size(), "DeleteTopics");
        id idVar = alertDialog$Builder.a;
        idVar.S = J0;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            idVar.U = ob6.a0(null, null, 2131751463, this.s.f(this.a, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            idVar.U = ob6.M0(2131751462, null);
        }
        alertDialog$Builder.j(ob6.M0(2131751563, null), new pt((Object) this, (Object) hashSet, (Object) arrayList, (Object) runnable, (byte) 26));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new grb((byte) 3));
        idVar.show();
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, getResourceProvider());
        }
    }

    public final void H0(boolean z, boolean z2) {
        this.h.e(!z, this.fragmentBeginToShow && z2);
    }

    public final void I0(View view) {
        if (getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w() || !(view instanceof qzb)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((qzb) view).O;
        uc7 messagesController = getMessagesController();
        long j = this.a;
        long j2 = -j;
        long n = tL_forumTopic == null ? 0L : messagesController.B2(j2) ? wf3.n(tL_forumTopic.from_id) : tL_forumTopic.id;
        if (this.u0) {
            uzb uzbVar = this.w;
            if (uzbVar != null) {
                wzb wzbVar = uzbVar.a;
                Bundle bundle = new Bundle();
                zzb zzbVar = wzbVar.a;
                bundle.putLong("dialog_id", zzbVar.c);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                zu8 zu8Var = new zu8(bundle, null);
                zu8Var.s = new yw9(wzbVar, tL_forumTopic, (byte) 15);
                zzbVar.presentFragment(zu8Var);
            }
            uj3 uj3Var = this.M0;
            if (uj3Var != null) {
                uj3Var.k3(j2, n, true, this);
                return;
            }
            return;
        }
        if (this.b0.size() > 0) {
            R0(view);
            return;
        }
        if (this.inPreviewMode && hl.O1()) {
            for (e eVar : getParentLayout().getFragmentStack()) {
                if (eVar instanceof uj3) {
                    uj3 uj3Var2 = (uj3) eVar;
                    if (uj3Var2.J3()) {
                        if7 if7Var = uj3Var2.r2;
                        if (if7Var.a == j2 && if7Var.b == n) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.R0 = n;
            Z0(false, false);
        }
        ro4.n(this, j, tL_forumTopic, 0);
    }

    public final /* synthetic */ boolean J0(View view, float f) {
        if (this.u0 || getParentLayout() == null || ((ActionBarLayout) getParentLayout()).w()) {
            return false;
        }
        if (!this.actionBar.z() && !hl.O1() && (view instanceof qzb)) {
            qzb qzbVar = (qzb) view;
            if (qzbVar.a0(f)) {
                Q0(qzbVar);
                this.O.K0(true);
                this.O.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        R0(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // kz1
    public final boolean K() {
        return false;
    }

    public final boolean K0(TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        uc7.s1(this.currentAccount).W3.edit().putLong("dialog_join_requested_time_" + (-this.a), System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean V = xc2.V(e());
        int i = jw5.t1;
        jw5.F0(parentActivity, this, d31.b0(this), V);
        S0(true);
        return false;
    }

    public final void L0(boolean z) {
        TLRPC.Chat e;
        TLRPC.ChatPhoto chatPhoto;
        if (z && (e = e()) != null && ((chatPhoto = e.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.a);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.f.getSharedMediaPreloader());
        profileActivity.r3(this.K);
        profileActivity.y3((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.f.getAvatarImageView().getImageReceiver().C() && z) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override // kz1
    public final long M() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N0(int i) {
        if (this.N != i) {
            this.N = i;
            this.M.setTextColorKey(i == 0 ? aob.sf : aob.q7);
            this.X0.setVisibility(i == 1 ? 0 : 8);
            S0(false);
        }
    }

    public final void O0(boolean z) {
        if (xea.o() == 0) {
            return;
        }
        zyb zybVar = this.d;
        if (zybVar != null) {
            if (z) {
                zybVar.setLayerType(2, null);
                zybVar.setClipChildren(false);
                zybVar.setClipToPadding(false);
            } else {
                zybVar.setLayerType(0, null);
                zybVar.setClipChildren(true);
                zybVar.setClipToPadding(true);
            }
        }
        this.d.requestLayout();
        this.actionBar.requestLayout();
    }

    public final void P0(float f) {
        if (xea.o() != 0) {
            this.T0 = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            ezb ezbVar = this.O;
            if (ezbVar != null) {
                float B = qu6.B(1.0f, this.T0, 0.05f, 1.0f);
                ezbVar.setPivotX(0.0f);
                ezbVar.setPivotY(0.0f);
                ezbVar.setScaleX(B);
                ezbVar.setScaleY(B);
                this.actionBar.setPivotX(0.0f);
                this.actionBar.setPivotY(0.0f);
                this.actionBar.setScaleX(B);
                this.actionBar.setScaleY(B);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout[]] */
    public final void Q0(of3 of3Var) {
        boolean z;
        try {
            of3Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r3 = {new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getResourceProvider(), getParentActivity())};
        final TLRPC.TL_forumTopic tL_forumTopic = of3Var.O;
        oc2 oc2Var = new oc2(getParentActivity(), this.currentAccount, r3[0].getSwipeBack(), false, new yyb(this, tL_forumTopic), getResourceProvider());
        int b = r3[0].b(oc2Var.f);
        oc2Var.o = true;
        long j = this.a;
        long j2 = -j;
        oc2Var.e(j2, tL_forumTopic.id, null);
        if (xc2.y(15, e())) {
            b8 b8Var = new b8(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                b8Var.j(ob6.M0(2131751417, null), R.drawable.msg_unpin, null);
            } else {
                b8Var.j(ob6.M0(2131751418, null), R.drawable.msg_pin, null);
            }
            b8Var.setMinimumWidth(jn7.p2);
            z = false;
            final Object[] objArr = 0 == true ? 1 : 0;
            b8Var.setOnClickListener(new View.OnClickListener(this) { // from class: tyb
                public final /* synthetic */ tzb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = objArr;
                    tzb tzbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b2) {
                        case 0:
                            tzb tzbVar2 = this.b;
                            tzbVar2.D0 = true;
                            tzbVar2.O0 = true;
                            tzbVar2.s.t(tzbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, tzbVar2);
                            tzbVar2.finishPreviewFragment();
                            break;
                        case 1:
                            tzbVar.O0 = true;
                            tzbVar.s.z(tL_forumTopic2.id, tzbVar.a, !tL_forumTopic2.closed);
                            tzbVar.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            tzbVar.E0(hashSet, new po4(tzbVar, (byte) 5));
                            break;
                    }
                }
            });
            r3[0].addView(b8Var);
        } else {
            z = false;
        }
        b8 b8Var2 = new b8(getParentActivity(), z, z);
        if (getMessagesController().p2(j2, tL_forumTopic.id, null)) {
            b8Var2.j(ob6.M0(2131743504, null), R.drawable.msg_mute, null);
        } else {
            b8Var2.j(ob6.M0(2131748068, null), R.drawable.msg_unmute, null);
        }
        b8Var2.setMinimumWidth(jn7.p2);
        b8Var2.setOnClickListener(new jf((e) this, (Object) tL_forumTopic, (Serializable) r3, b, (byte) 7));
        boolean z2 = false;
        r3[0].addView(b8Var2);
        if (xc2.i(this.currentAccount, e(), tL_forumTopic)) {
            b8 b8Var3 = new b8(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                b8Var3.j(ob6.M0(2131745811, null), R.drawable.msg_topic_restart, null);
            } else {
                b8Var3.j(ob6.M0(2131752004, null), R.drawable.msg_topic_close, null);
            }
            b8Var3.setMinimumWidth(jn7.p2);
            final byte b2 = 1;
            b8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: tyb
                public final /* synthetic */ tzb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b2;
                    tzb tzbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b22) {
                        case 0:
                            tzb tzbVar2 = this.b;
                            tzbVar2.D0 = true;
                            tzbVar2.O0 = true;
                            tzbVar2.s.t(tzbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, tzbVar2);
                            tzbVar2.finishPreviewFragment();
                            break;
                        case 1:
                            tzbVar.O0 = true;
                            tzbVar.s.z(tL_forumTopic2.id, tzbVar.a, !tL_forumTopic2.closed);
                            tzbVar.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            tzbVar.E0(hashSet, new po4(tzbVar, (byte) 5));
                            break;
                    }
                }
            });
            z2 = false;
            r3[0].addView(b8Var3);
        }
        if (xc2.e(this.currentAccount, e(), tL_forumTopic)) {
            b8 b8Var4 = new b8(getParentActivity(), z2, true);
            b8Var4.j(ob6.J0(1, "DeleteTopics"), R.drawable.msg_delete, null);
            b8Var4.c(aob.q7, aob.p7);
            b8Var4.setMinimumWidth(jn7.p2);
            final byte b3 = 2;
            b8Var4.setOnClickListener(new View.OnClickListener(this) { // from class: tyb
                public final /* synthetic */ tzb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b3;
                    tzb tzbVar = this.b;
                    TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                    switch (b22) {
                        case 0:
                            tzb tzbVar2 = this.b;
                            tzbVar2.D0 = true;
                            tzbVar2.O0 = true;
                            tzbVar2.s.t(tzbVar2.a, tL_forumTopic2.id, !tL_forumTopic2.pinned, tzbVar2);
                            tzbVar2.finishPreviewFragment();
                            break;
                        case 1:
                            tzbVar.O0 = true;
                            tzbVar.s.z(tL_forumTopic2.id, tzbVar.a, !tL_forumTopic2.closed);
                            tzbVar.finishPreviewFragment();
                            break;
                        default:
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic2.id));
                            tzbVar.E0(hashSet, new po4(tzbVar, (byte) 5));
                            break;
                    }
                }
            });
            r3[0].addView(b8Var4);
        }
        boolean B2 = getMessagesController().B2(j2);
        if (this.Q0 != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            this.parentLayout.getView().draw(canvas);
            Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / jn7.J2));
            this.Q0.setBackground(new BitmapDrawable(createBitmap));
            this.Q0.setAlpha(0.0f);
            if (this.Q0.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.parentLayout.getOverlayContainerView().addView(this.Q0, tre.c(-1.0f, -1));
        }
        zu1 zu1Var = new zu1(qu6.k(j, "chat_id"));
        ro4.a(zu1Var, if7.a(j2, B2 ? wf3.n(of3Var.O.from_id) : r2.id));
        presentFragmentAsPreviewWithMenu(zu1Var, r3[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R0(View view) {
        qzb qzbVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        qyb qybVar;
        int i;
        String str;
        boolean z;
        boolean z2;
        if (!(view instanceof qzb) || (tL_forumTopic = (qzbVar = (qzb) view).O) == null) {
            return;
        }
        int i2 = tL_forumTopic.id;
        Integer valueOf = Integer.valueOf(i2);
        HashSet hashSet = this.b0;
        if (!hashSet.remove(valueOf)) {
            hashSet.add(Integer.valueOf(i2));
        }
        qzbVar.d0(hashSet.contains(Integer.valueOf(i2)), true);
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        boolean isEmpty = hashSet.isEmpty();
        a aVar = this.actionBar;
        if (isEmpty) {
            aVar.y();
            return;
        }
        if (!aVar.e(null)) {
            s6 q = this.actionBar.q(null);
            if (this.inPreviewMode) {
                q.setBackgroundColor(0);
                q.a = false;
            }
            NumberTextView numberTextView = new NumberTextView(q.getContext());
            this.d0 = numberTextView;
            numberTextView.setTextSize(18);
            this.d0.setTypeface(hl.o());
            this.d0.setTextColor(getThemedColor(aob.y8));
            q.addView(this.d0, tre.m(1.0f, 0, -1, 72, 0, 0));
            this.d0.setOnTouchListener(new vqb((byte) 1));
            this.e0 = q.g(4, R.drawable.msg_pin, hl.L(54.0f));
            this.f0 = q.g(5, R.drawable.msg_unpin, hl.L(54.0f));
            this.g0 = q.g(6, R.drawable.msg_mute, hl.L(54.0f));
            this.h0 = q.h(7, R.drawable.msg_delete, hl.L(54.0f), ob6.M0(2131751563, null));
            s7 h = q.h(12, R.drawable.msg_archive_hide, hl.L(54.0f), ob6.M0(2131749079, null));
            this.i0 = h;
            h.setVisibility(8);
            s7 h2 = q.h(13, R.drawable.msg_archive_show, hl.L(54.0f), ob6.M0(2131745081, null));
            this.j0 = h2;
            h2.setVisibility(8);
            s7 h3 = q.h(0, R.drawable.ic_ab_other, hl.L(54.0f), ob6.M0(2131754834, null));
            this.n0 = h3;
            this.k0 = h3.e(8, R.drawable.msg_markread, ob6.M0(2131748435, null));
            this.l0 = this.n0.e(9, R.drawable.msg_topic_close, ob6.M0(2131752004, null));
            this.m0 = this.n0.e(10, R.drawable.msg_topic_restart, ob6.M0(2131745811, null));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.R(null, null);
        jn7.e().k(jn7.u4, new Object[0]);
        Iterator it = hashSet.iterator();
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            qybVar = this.s;
            if (!hasNext) {
                break;
            }
            boolean z4 = z3;
            long intValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic f = qybVar.f(j, intValue);
            if (f != null) {
                if (f.unread_count != 0) {
                    i3++;
                }
                if (xc2.y(15, M0) && !f.hidden) {
                    if (f.pinned) {
                        i5++;
                    } else {
                        z2 = (z4 ? 1 : 0) + 1;
                        Iterator it2 = it;
                        if (!getMessagesController().p2(-j, intValue, null)) {
                            i4++;
                        }
                        z3 = z2;
                        it = it2;
                    }
                }
            }
            z2 = z4 ? 1 : 0;
            Iterator it22 = it;
            if (!getMessagesController().p2(-j, intValue, null)) {
            }
            z3 = z2;
            it = it22;
        }
        boolean z5 = z3;
        b8 b8Var = this.k0;
        if (i3 > 0) {
            b8Var.setVisibility(0);
            str = null;
            this.k0.j(ob6.M0(2131748435, null), R.drawable.msg_markread, null);
            i = 8;
        } else {
            i = 8;
            str = null;
            b8Var.setVisibility(8);
        }
        if (i4 != 0) {
            this.C0 = false;
            this.g0.setIcon(R.drawable.msg_unmute);
            this.g0.setContentDescription(ob6.M0(2131752130, str));
            z = true;
        } else {
            z = true;
            this.C0 = true;
            this.g0.setIcon(R.drawable.msg_mute);
            this.g0.setContentDescription(ob6.M0(2131752140, str));
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
            TLRPC.TL_forumTopic f2 = qybVar.f(j, ((Integer) it3.next()).intValue());
            if (f2 != null) {
                if (xc2.e(this.currentAccount, M0, f2)) {
                    i8++;
                }
                if (xc2.i(this.currentAccount, M0, f2)) {
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
        this.l0.setText(ob6.M0(i7 > 1 ? 2131752003 : 2131752004, null));
        this.m0.setVisibility((i7 != 0 || i6 <= 0) ? 8 : 0);
        this.m0.setText(i6 > 1 ? ob6.M0(2131745810, null) : ob6.M0(2131745811, null));
        this.h0.setVisibility(i8 == hashSet3.size() ? 0 : 8);
        this.i0.setVisibility((i9 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.j0.setVisibility((i10 == 1 && hashSet3.size() == 1) ? 0 : 8);
        this.n0.m();
        V0();
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
    /* JADX WARN: Type inference failed for: r12v1, types: [android.animation.Animator$AnimatorListener, java.lang.String, t16] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(boolean z) {
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
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M02 = messagesController.M0(Long.valueOf(j));
        long j2 = -j;
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
        if (lbc.w(X1)) {
            this.f.setUserAvatar(X1);
        } else if (xc2.p0(M02)) {
            TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(M02.linked_monoforum_id));
            if (M03 != null) {
                this.f.setChatAvatar(M03);
            }
        } else {
            this.f.setChatAvatar(M02);
        }
        SharedPreferences sharedPreferences = uc7.s1(this.currentAccount).W3;
        StringBuilder sb = new StringBuilder("dialog_bar_vis3");
        sb.append(j2);
        boolean z5 = sharedPreferences.getInt(sb.toString(), 0) == 2;
        boolean v = qu6.v("dialog_bar_report", j2, sharedPreferences, false);
        boolean v2 = qu6.v("dialog_bar_block", j2, sharedPreferences, false);
        boolean z6 = this.u0;
        if (z6) {
            r12 = 0;
            if (this.x0) {
                this.f.setTitle(ob6.M0(2131745979, null));
            } else if (this.w0) {
                this.f.setTitle(ob6.M0(2131746156, null));
            } else if (this.y0) {
                this.f.setTitle(ob6.M0(2131752958, null));
            } else {
                f82 f82Var = this.f;
                if (this.v0) {
                    f82Var.setTitle(ob6.M0(2131750535, null));
                } else {
                    f82Var.setTitle(ob6.M0(2131745377, null));
                }
            }
            this.q0.setVisibility(8);
            f82 f82Var2 = this.f;
            if (f82Var2 != null && f82Var2.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).rightMargin = hl.L(this.q0.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.f.n(false);
            this.f.getSubtitleTextView().setVisibility(8);
        } else {
            if (M02 != null) {
                this.f.setTitle(M02.title);
                str = null;
                this.f.j(null, getMessagesController().p2(j2, 0L, null) ? getThemedDrawable("drawableMuteIcon") : null);
            } else {
                str = null;
            }
            TLRPC.ChatFull N0 = getMessagesController().N0(j);
            if (N0 != null && (chatFull2 = this.K) != null && (chatParticipants = chatFull2.participants) != null) {
                N0.participants = chatParticipants;
            }
            this.K = N0;
            if (N0 != null) {
                int i = N0.participants_count;
                if (i <= 0) {
                    TLRPC.Chat M04 = getMessagesController().M0(Long.valueOf(j));
                    M0 = M04 == null ? ob6.M0(2131748533, str) : xc2.t0(M04) ? ob6.M0(2131748392, str).toLowerCase() : ob6.M0(2131748395, str).toLowerCase();
                } else {
                    M0 = ob6.G(i, "Members", new Object[0]);
                }
            } else {
                M0 = ob6.M0(2131748533, str);
            }
            this.f.setSubtitle(M0);
            r12 = str;
        }
        boolean z7 = this.fragmentBeginToShow || z;
        long j3 = uc7.s1(this.currentAccount).W3.getLong(qu6.n(j2, "dialog_join_requested_time_"), -1L);
        if (M02 == null || !xc2.r0(M02) || j3 <= 0 || System.currentTimeMillis() - j3 >= 120000) {
            if (M02 != null && !z6) {
                if (!xc2.r0(M02)) {
                }
                if (getMessagesController().n.contains(Long.valueOf(M02.id))) {
                    z4 = true;
                    z3 = true;
                } else {
                    boolean z8 = M02.join_request;
                    y9c y9cVar = this.M;
                    if (z8) {
                        y9cVar.setText(ob6.M0(2131752367, r12));
                    } else {
                        y9cVar.setText(ob6.M0(2131752369, r12));
                    }
                    z3 = true;
                    this.M.setClickable(true);
                    this.M.setEnabled(true);
                    z4 = false;
                }
                hl.T3(this.o0, z4, 0.5f, z3, z7);
                hl.T3(this.M, z4 ^ z3, 0.5f, z3, z7);
                N0(0);
            }
            if (!z5 || (!v2 && !v)) {
                z2 = false;
                if (this.W != z2) {
                    this.W = z2;
                    this.p0.animate().setListener(r12).cancel();
                    ir8 ir8Var = this.p0;
                    if (z7) {
                        ir8Var.animate().translationY(z2 ? 0.0f : hl.L(53.0f)).setListener(new czb(this, z2, (byte) 1));
                    } else {
                        ir8Var.setVisibility(z2 ? 0 : 8);
                        this.p0.setTranslationY(z2 ? 0.0f : hl.L(53.0f));
                    }
                }
                C0();
                this.r0.setVisibility(!z6 ? 8 : 0);
                this.S.setVisibility(!xc2.w(3, M02) ? 0 : 8);
                this.U.setVisibility((xc2.R(M02) || (!getUserConfig().p() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !xc2.N(M02)))) ? 8 : 0);
                this.T.setVisibility((M02 != null || M02.creator || xc2.r0(M02)) ? 8 : 0);
                this.V.setVisibility((M02 != null || M02.creator || xc2.N(M02)) ? 8 : 0);
                U0(true);
                this.I0 = getMessagesController().g1(j, true, r12);
                A0(false);
            }
            this.M.setText(ob6.M0(2131745930, r12));
            this.M.setClickable(true);
            this.M.setEnabled(true);
            hl.T3(this.o0, false, 0.5f, true, false);
            hl.T3(this.M, true, 0.5f, true, false);
            N0(1);
        } else {
            this.M.a(ob6.M0(2131752365, r12), z7);
            this.M.setEnabled(false);
            hl.T3(this.o0, false, 0.5f, true, z7);
            hl.T3(this.M, true, 0.5f, true, z7);
            N0(0);
        }
        z2 = true;
        if (this.W != z2) {
        }
        C0();
        this.r0.setVisibility(!z6 ? 8 : 0);
        this.S.setVisibility(!xc2.w(3, M02) ? 0 : 8);
        this.U.setVisibility((xc2.R(M02) || (!getUserConfig().p() && (((chatFull = this.K) == null || chatFull.boosts_applied <= 0) && !xc2.N(M02)))) ? 8 : 0);
        this.T.setVisibility((M02 != null || M02.creator || xc2.r0(M02)) ? 8 : 0);
        this.V.setVisibility((M02 != null || M02.creator || xc2.N(M02)) ? 8 : 0);
        U0(true);
        this.I0 = getMessagesController().g1(j, true, r12);
        A0(false);
    }

    public final void T0() {
        RadialProgressView radialProgressView = this.o0;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(aob.sf));
        this.h.updateColors();
        ir8 ir8Var = this.p0;
        int i = aob.d6;
        ir8Var.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(getThemedColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(aob.s8));
        }
        this.s0.setBackgroundColor(getThemedColor(i));
    }

    public final void U0(boolean z) {
        if (this.R == null) {
            return;
        }
        uc7 messagesController = getMessagesController();
        long j = this.a;
        boolean z2 = (xc2.r0(getMessagesController().M0(Long.valueOf(j))) || !xc2.w(15, messagesController.M0(Long.valueOf(j))) || this.t0 || this.u0 || this.K0) ? false : true;
        this.L = z2;
        this.R.setVisibility(z2 ? 0 : 8);
        H0(!this.L, z);
    }

    public final void V0() {
        boolean z = xc2.y(15, e()) && !this.b0.isEmpty();
        if (this.c0 != z) {
            this.c0 = z;
            jzb jzbVar = this.r;
            jzbVar.l(0, jzbVar.b());
        }
    }

    @Override // org.telegram.ui.ActionBar.e, ej6
    public final boolean W(MotionEvent motionEvent, boolean z) {
        return false;
    }

    public final void W0(float f) {
        this.X = f;
        X0();
        this.c1 = true;
        float f2 = 1.0f - f;
        this.f.getTitleTextView().setAlpha(f2);
        this.f.getSubtitleTextView().setAlpha(f2);
        uic uicVar = this.b1;
        if (uicVar != null) {
            uicVar.setTranslationY((-hl.L(16.0f)) * f2);
            this.b1.setAlpha(f);
        }
        this.s0.setTranslationY((-hl.L(16.0f)) * f2);
        this.s0.setAlpha(f);
        if (isInPreviewMode()) {
            this.e.invalidate();
        }
        this.d.invalidate();
        this.O.setAlpha(f2);
        if (this.a1) {
            float A = qd4.A(1.0f, this.X, 0.02f, 0.98f);
            this.O.setScaleX(A);
            this.O.setScaleY(A);
        }
    }

    public final void X0() {
        int themedColor = getThemedColor(aob.v8);
        a aVar = this.actionBar;
        int i = aob.y8;
        aVar.H(vm2.f(this.X, themedColor, getThemedColor(i)), false);
        this.actionBar.H(vm2.f(this.X, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.G(vm2.f(this.X, getThemedColor(aob.t8), getThemedColor(aob.z8)), false);
        if (this.inPreviewMode) {
            return;
        }
        this.actionBar.setBackgroundColor(vm2.f(this.X, getThemedColor(aob.s8), getThemedColor(aob.d6)));
    }

    public final void Y0() {
        h32 h32Var = this.E0;
        if (h32Var == null || h32Var.e == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        wm2 wm2Var = new wm2(R.drawable.ic_ab_other, 0);
        wm2Var.c(hl.L(16.0f));
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        if (xc2.y(15, e())) {
            this.E0.e.setText(hl.G2(hl.S2(ob6.M0(2131747867, null)), spannableStringBuilder, "%s"));
            return;
        }
        String M0 = ob6.M0(2131750435, null);
        TLRPC.TL_forumTopic f = getMessagesController().g4.f(this.a, 1L);
        if (f != null) {
            M0 = f.title;
        }
        this.E0.e.setText(hl.S2(ob6.a0("NoTopicsDescriptionUser", null, 2131747866, M0)));
    }

    public final void Z0(boolean z, boolean z2) {
        uyb uybVar;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.O0) {
            z = true;
        }
        this.O0 = false;
        qyb qybVar = this.s;
        long j = this.a;
        ArrayList l = qybVar.l(j);
        if (l != null) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (lbc.w(uc7.s1(this.currentAccount).X1(Long.valueOf(-j))) && this.v0) {
                arrayList.add(new kzb(3, null));
            }
            for (int i = 0; i < l.size(); i++) {
                HashSet hashSet = this.B0;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(((TLRPC.TL_forumTopic) l.get(i)).id))) {
                    arrayList.add(new kzb(0, (TLRPC.TL_forumTopic) l.get(i)));
                }
            }
            if (!arrayList.isEmpty() && !qybVar.e(j) && this.W0) {
                arrayList.add(new kzb(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.L0.b(size + 4);
                z = false;
            }
            this.y = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                kzb kzbVar = (kzb) arrayList.get(i2);
                if (kzbVar != null && (tL_forumTopic = kzbVar.c) != null && tL_forumTopic.hidden) {
                    this.y++;
                }
            }
            ezb ezbVar = this.O;
            if (ezbVar != null) {
                if (ezbVar.getItemAnimator() != (z ? this.J0 : null)) {
                    this.O.setItemAnimator(z ? this.J0 : null);
                }
            }
            jzb jzbVar = this.r;
            if (jzbVar != null) {
                jzbVar.E(arrayList2, arrayList);
            }
            if ((this.D0 || size == 0) && (uybVar = this.G) != null) {
                uybVar.g1(0, 0);
                this.D0 = false;
            }
        }
        B0();
        Y0();
    }

    @Override // kz1
    public final long a() {
        return -this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override // kz1
    public final long c() {
        return 0L;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        SpannableStringBuilder spannableStringBuilder;
        wk5 wk5Var;
        wk5 wk5Var2;
        uj3 uj3Var = this.N0;
        final byte b = 0;
        this.f1 = (uj3Var == null || !uj3Var.X) ? 0 : hl.L(72.0f);
        uj3 uj3Var2 = this.N0;
        this.g1 = (uj3Var2 == null || !uj3Var2.X) ? 0 : hl.L(64.0f);
        zyb zybVar = new zyb(this, context);
        this.d = zybVar;
        this.fragmentView = zybVar;
        yob.h(aob.d6, getResourceProvider(), zybVar);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        final byte b2 = 1;
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((!hl.O1() || ((wk5Var2 = this.parentLayout) != null && ((ActionBarLayout) wk5Var2).b)) && !this.inPreviewMode);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setActionBarMenuOnItemClick(new dzb(this, context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) { // from class: ryb
            public final /* synthetic */ tzb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s7 s7Var;
                byte b3 = b;
                tzb tzbVar = this.b;
                switch (b3) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        break;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        break;
                    case 3:
                        uj3 uj3Var3 = tzbVar.N0;
                        if (uj3Var3 != null && (s7Var = uj3Var3.k0) != null) {
                            s7Var.performClick();
                            break;
                        }
                        break;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        break;
                }
            }
        });
        s6 u = this.actionBar.u();
        byte b3 = 24;
        final byte b4 = 3;
        if (this.N0 != null) {
            s7 a = u.a(0, R.drawable.outline_header_search);
            this.q0 = a;
            a.setOnClickListener(new View.OnClickListener(this) { // from class: ryb
                public final /* synthetic */ tzb b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    s7 s7Var;
                    byte b32 = b4;
                    tzb tzbVar = this.b;
                    switch (b32) {
                        case 0:
                            if (!tzbVar.t0) {
                                tzbVar.L0(false);
                                break;
                            }
                            break;
                        case 1:
                            tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                            tzbVar.S0(false);
                            break;
                        case 2:
                            tzbVar.finishPreviewFragment();
                            break;
                        case 3:
                            uj3 uj3Var3 = tzbVar.N0;
                            if (uj3Var3 != null && (s7Var = uj3Var3.k0) != null) {
                                s7Var.performClick();
                                break;
                            }
                            break;
                        default:
                            tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                            break;
                    }
                }
            });
        } else {
            s7 a2 = u.a(0, R.drawable.outline_header_search);
            this.q0 = a2;
            a2.N();
            a2.K(new r10(this, b3));
            this.q0.setSearchPaddingStart(56);
            this.q0.setSearchFieldHint(ob6.M0(2131745564, null));
            EditTextBoldCursor searchField = this.q0.getSearchField();
            yob.X(searchField, aob.G6, getResourceProvider());
            yob.D(searchField, aob.Jj, getResourceProvider());
            yob.v(searchField, aob.Ne, getResourceProvider());
        }
        s7 b5 = u.b(0, R.drawable.ic_ab_other, null);
        this.r0 = b5;
        b5.setContentDescription(ob6.M0(2131754834, null));
        this.r0.e(1, R.drawable.msg_discussion, ob6.M0(2131743659, null));
        final byte b6 = 2;
        this.S = this.r0.e(2, R.drawable.msg_addcontact, ob6.M0(2131754394, null));
        s7 s7Var = this.r0;
        this.U = s7Var.d(14, 0, new b29(R.raw.boosts, hl.L(24.0f), hl.L(24.0f)), ob6.M0(2131753578, null), true, false, s7Var.n0);
        this.R = this.r0.e(3, R.drawable.msg_topic_create, ob6.M0(2131751667, null));
        this.V = this.r0.e(15, R.drawable.msg_report, ob6.M0(2131745957, null));
        this.T = this.r0.d(11, R.drawable.msg_leave, null, ob6.M0(2131748744, null), true, false, null);
        f82 f82Var = new f82(context, this, false, this.resourceProvider);
        this.f = f82Var;
        f82Var.getAvatarImageView().setRoundRadius(hl.L(16.0f));
        this.f.setOccupyStatusBar((!hl.O1() || ((wk5Var = this.parentLayout) != null && ((ActionBarLayout) wk5Var).b)) && !this.inPreviewMode);
        f82 f82Var2 = this.f;
        long j = -this.a;
        f82Var2.b = j < 0;
        f82Var2.setClipChildren(false);
        this.actionBar.addView(this.f, 0, tre.d(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        byte b7 = 17;
        if (!this.u0) {
            this.f.getAvatarImageView().setOnClickListener(new h6(this, b7));
        }
        this.O = new ezb(this, context);
        yic yicVar = new yic(this.d);
        ViewGroup viewGroup = this.d;
        ll0 ll0Var = this.m1;
        ll0Var.h = yicVar;
        ll0Var.i = viewGroup;
        ezb ezbVar = this.O;
        uj3 uj3Var3 = this.N0;
        if (uj3Var3 != null) {
            viewGroup = (ViewGroup) uj3Var3.getFragmentView();
        }
        ezb ezbVar2 = this.O;
        Objects.requireNonNull(ezbVar2);
        this.n1 = new lhc(ezbVar, viewGroup, new hc5(ezbVar2, (byte) 2));
        this.O.F0(new po4(this, (byte) 6));
        SpannableString spannableString = new SpannableString("#");
        qo4 d = ro4.d(getParentActivity(), 0.85f, -1, false);
        d.setBounds(0, hl.L(2.0f), hl.L(16.0f), hl.L(18.0f));
        spannableString.setSpan(new ImageSpan(d, 2), 0, 1, 33);
        xh3 xh3Var = new xh3(this, hl.G2(ob6.M0(2131754714, null), spannableString, "#"), hl.G2(ob6.M0(2131754716, null), spannableString, "#"));
        this.x = xh3Var;
        xh3Var.b();
        byte b8 = this.F ? (byte) 2 : (byte) 0;
        this.E = b8;
        this.x.X = b8 != 0;
        gzb gzbVar = new gzb(this);
        this.O.setHideIfEmpty(false);
        gzbVar.m = false;
        gzbVar.C = false;
        ezb ezbVar3 = this.O;
        this.J0 = gzbVar;
        ezbVar3.setItemAnimator(gzbVar);
        this.O.setOnScrollListener(new hzb(this, b));
        ezb ezbVar4 = this.O;
        ezbVar4.X1 = true;
        ezbVar4.Y1 = false;
        i69 i69Var = new i69(ezbVar4, true);
        this.L0 = i69Var;
        this.O.setItemsEnterAnimator(i69Var);
        this.O.setOnItemClickListener(new t39(this, b3));
        this.O.setOnItemLongClickListener(new syb(this));
        this.O.setOnScrollListener(new hzb(this, b2));
        ezb ezbVar5 = this.O;
        uyb uybVar = new uyb(this);
        this.G = uybVar;
        ezbVar5.setLayoutManager(uybVar);
        this.O.setAdapter(this.r);
        this.O.setClipToPadding(false);
        this.O.j(new vyb(this));
        szb szbVar = new szb(this);
        this.Q = szbVar;
        wyb wybVar = new wyb(this, szbVar);
        this.P = wybVar;
        wybVar.h(this.O);
        this.d.addView(this.O, tre.c(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.O.getLayoutParams()).topMargin = -hl.L(100.0f);
        zp4 zp4Var = new zp4(this.resourceProvider, getParentActivity(), false);
        this.h = zp4Var;
        this.d.addView(zp4Var, zp4.b());
        final byte b9 = 4;
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: ryb
            public final /* synthetic */ tzb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s7 s7Var2;
                byte b32 = b9;
                tzb tzbVar = this.b;
                switch (b32) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        break;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        break;
                    case 3:
                        uj3 uj3Var32 = tzbVar.N0;
                        if (uj3Var32 != null && (s7Var2 = uj3Var32.k0) != null) {
                            s7Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        break;
                }
            }
        });
        this.h.c.setImageResource(R.drawable.ic_chatlist_add_2);
        this.h.c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.h.c.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
        this.h.setContentDescription(ob6.M0(2131751667, null));
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(24);
        tk4Var.setVisibility(8);
        tk4Var.x = true;
        uxb uxbVar = new uxb(context, b2);
        TextView textView = new TextView(context);
        uxbVar.d = textView;
        if (ob6.a0) {
            spannableStringBuilder = new SpannableStringBuilder("  ");
            spannableStringBuilder.setSpan(new wm2(R.drawable.attach_arrow_left, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131743912, null));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131743912, null));
            spannableStringBuilder.append((CharSequence) "  ");
            spannableStringBuilder.setSpan(new wm2(R.drawable.arrow_newchat, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        }
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setLayerType(2, null);
        yob.X(textView, aob.y6, getResourceProvider());
        boolean z = ob6.a0;
        uxbVar.addView(textView, tre.d(-2, -2.0f, 81, z ? 72.0f : 32.0f, 0.0f, z ? 32.0f : 72.0f, 32.0f));
        this.n = uxbVar;
        textView.setAlpha(0.0f);
        h32 h32Var = new h32(this, context, tk4Var);
        this.E0 = h32Var;
        try {
            h32Var.b.getImageReceiver().M(2);
        } catch (Exception unused) {
        }
        this.E0.e(this.K0, this.fragmentBeginToShow);
        this.E0.d.setText(ob6.M0(2131747869, null));
        Y0();
        this.n.addView(tk4Var);
        this.n.addView(this.E0);
        this.d.addView(this.n);
        this.O.setEmptyView(this.n);
        this.p0 = new ir8(context, (byte) 18);
        y9c y9cVar = new y9c(context);
        this.M = y9cVar;
        this.p0.addView(y9cVar);
        this.d.addView(this.p0, tre.e(-1, 51, 80));
        this.M.setOnClickListener(new xyb(this));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.o0 = radialProgressView;
        radialProgressView.setSize(hl.L(22.0f));
        this.o0.setVisibility(4);
        this.p0.addView(this.o0, tre.e(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.X0 = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.X0.setContentDescription(ob6.M0(2131752006, null));
        ImageView imageView2 = this.X0;
        int i = aob.Ue;
        imageView2.setBackground(rnb.c(null, rnb.b(getThemedColor(i))));
        yob.s(this.X0, i, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        this.X0.setScaleType(ImageView.ScaleType.CENTER);
        this.p0.addView(this.X0, tre.d(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: ryb
            public final /* synthetic */ tzb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s7 s7Var2;
                byte b32 = b2;
                tzb tzbVar = this.b;
                switch (b32) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        break;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        break;
                    case 3:
                        uj3 uj3Var32 = tzbVar.N0;
                        if (uj3Var32 != null && (s7Var2 = uj3Var32.k0) != null) {
                            s7Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        break;
                }
            }
        });
        this.X0.setVisibility(8);
        S0(false);
        h8b h8bVar = new h8b((byte) 4, context, this);
        this.e = h8bVar;
        if (this.N0 == null) {
            this.d.addView(h8bVar, tre.e(-1, -1, jn7.D1));
        }
        ozb ozbVar = new ozb(this, context);
        this.s0 = ozbVar;
        ozbVar.setVisibility(8);
        this.e.addView(this.s0, tre.d(-1, -1.0f, jn7.D1, 0.0f, 44.0f, 0.0f, 0.0f));
        ozb ozbVar2 = this.s0;
        int i2 = aob.d6;
        yob.h(i2, getResourceProvider(), ozbVar2);
        this.actionBar.setDrawBlurBackground(this.d);
        getMessagesStorage().C0(this.a, true, null, true, false, 0);
        xj3 xj3Var = new xj3(context);
        this.V0 = xj3Var;
        xj3Var.setPadding(hl.L(11.0f), hl.L(21.0f), hl.L(11.0f), hl.L(21.0f));
        jl0 c = ll0Var.c(this.V0, dtd.n(this.resourceProvider), false);
        ik8.r(c, hl.L(24.0f), 7.0f);
        this.V0.setBlurredBackground(c);
        this.V0.setOnAnimatedHeightChangedListener(new po4(this, b2));
        this.d.addView(this.V0, tre.d(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat e = e();
        if (e != null) {
            pz1 pz1Var = new pz1(this, e);
            this.S0 = pz1Var;
            this.V0.addView(pz1Var.b(), tre.o(-1, 40));
            this.V0.i(3, this.S0.b());
            this.V0.h(this.S0.b());
            pz1 pz1Var2 = this.S0;
            pz1Var2.m = new syb(this);
            TLRPC.ChatFull chatFull = this.K;
            pz1Var2.j = chatFull;
            if (chatFull != null) {
                pz1Var2.c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.G0 = frameLayout;
            this.V0.addView(frameLayout);
            this.V0.i(4, this.G0);
            this.V0.h(this.G0);
            this.V0.j(this.G0, true, false);
            y81 y81Var = new y81(this, context, this);
            this.H0 = y81Var;
            this.G0.addView(y81Var);
            this.V0.setCallFragmentContextView(this.H0);
        }
        FrameLayout.LayoutParams c2 = tre.c(-2.0f, -1);
        if (this.inPreviewMode) {
            c2.topMargin = hl.m;
        }
        if (!isInPreviewMode()) {
            this.d.addView(this.actionBar, c2);
        }
        z0();
        nf9 nf9Var = new nf9((byte) 14, context, this);
        this.Q0 = nf9Var;
        nf9Var.setForeground(new ColorDrawable(vm2.o(getThemedColor(i2), 100)));
        this.Q0.setFocusable(false);
        this.Q0.setImportantForAccessibility(2);
        this.Q0.setOnClickListener(new View.OnClickListener(this) { // from class: ryb
            public final /* synthetic */ tzb b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s7 s7Var2;
                byte b32 = b6;
                tzb tzbVar = this.b;
                switch (b32) {
                    case 0:
                        if (!tzbVar.t0) {
                            tzbVar.L0(false);
                            break;
                        }
                        break;
                    case 1:
                        tzbVar.getMessagesController().f2(-tzbVar.a, null, tzbVar.e());
                        tzbVar.S0(false);
                        break;
                    case 2:
                        tzbVar.finishPreviewFragment();
                        break;
                    case 3:
                        uj3 uj3Var32 = tzbVar.N0;
                        if (uj3Var32 != null && (s7Var2 = uj3Var32.k0) != null) {
                            s7Var2.performClick();
                            break;
                        }
                        break;
                    default:
                        tzbVar.presentFragment(wxb.e0(tzbVar.a, 0L));
                        break;
                }
            }
        });
        this.Q0.setFitsSystemWindows(true);
        this.W = true;
        if (this.inPreviewMode && hl.O1()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e eVar = (e) it.next();
                if (eVar instanceof uj3) {
                    uj3 uj3Var4 = (uj3) eVar;
                    if (uj3Var4.J3()) {
                        if7 if7Var = uj3Var4.r2;
                        if (if7Var.a == j) {
                            this.R0 = if7Var.b;
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
        if (xc2.R(e())) {
            getMessagesController().G0().a(j, new sh9(this, (byte) 22));
        }
        View view = this.fragmentView;
        syb sybVar = new syb(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view, sybVar);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = jn7.T;
        long j = this.a;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.K) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j) {
                S0(false);
                pz1 pz1Var = this.S0;
                if (pz1Var != null) {
                    pz1Var.j = chatFull2;
                    pz1Var.c(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                A0(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == jn7.y5) {
            S0(false);
        } else if (i == jn7.r3) {
            if (j == (-((Long) objArr[2]).longValue())) {
                this.Y = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == jn7.t5) {
            if (j == ((Long) objArr[0]).longValue()) {
                Z0(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    z0();
                }
                B0();
            }
        } else if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i4 = uc7.r5;
            if (intValue == 8192) {
                S0(false);
            }
            if ((intValue & 512) > 0) {
                getMessagesController().g4.y(j, false);
                boolean canScrollVertically = this.O.canScrollVertically(-1);
                Z0(true, false);
                if (!canScrollVertically) {
                    this.G.m0(0);
                }
            }
        } else if (i == jn7.r) {
            Z0(false, false);
        } else if (i == jn7.w2) {
            Long l = (Long) objArr[0];
            if (j == l.longValue()) {
                this.I0 = getMessagesController().g1(l.longValue(), false, null);
                y81 y81Var = this.H0;
                if (y81Var != null) {
                    y81Var.a(!this.fragmentBeginToShow);
                }
                A0(false);
            }
        } else if (i == jn7.f0) {
            Z0(false, false);
            S0(true);
        } else if (i != jn7.u5 && i == jn7.s) {
            removeSelfFromStack(true);
        }
        if (i == jn7.h0 && getParentActivity() != null && this.inPreviewMode && hl.O1()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue != (-j) || booleanValue) {
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

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // kz1
    public final TLRPC.Chat e() {
        return getMessagesController().M0(Long.valueOf(this.a));
    }

    @Override // kz1
    public final vc2 getGroupCall() {
        vc2 vc2Var = this.I0;
        if (vc2Var == null || !(vc2Var.b instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return vc2Var;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ozb ozbVar = this.s0;
        if (ozbVar != null && ozbVar.a0 != null) {
            int i = p55.h;
        }
        return arrayList;
    }

    @Override // kz1
    public final TLRPC.User h() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.t0 ? aob.d6 : aob.s8);
        if (this.actionBar.z()) {
            themedColor = getThemedColor(aob.w8);
        }
        return vm2.h(themedColor) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // ej6
    public final rz4 j() {
        return this.j1;
    }

    @Override // kz1
    public final boolean n() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (this.b0.isEmpty()) {
            if (!this.t0) {
                return super.onBackPressed(z);
            }
            if (z) {
                this.actionBar.C(this.q0.T(false));
            }
        } else if (z) {
            D0();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onBecomeFullyHidden() {
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.o(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        uc7 messagesController = getMessagesController();
        long j = this.a;
        messagesController.e3(0, j, true);
        long j2 = -j;
        this.e1 = getMessagesController().B4(j2);
        jn7.f(this.currentAccount).b(this, jn7.y5);
        jn7.f(this.currentAccount).b(this, jn7.r3);
        jn7.f(this.currentAccount).b(this, jn7.T);
        jn7.f(this.currentAccount).b(this, jn7.t5);
        jn7.f(this.currentAccount).b(this, 2);
        jn7.f(this.currentAccount).b(this, jn7.r);
        jn7.f(this.currentAccount).b(this, jn7.w2);
        jn7.f(this.currentAccount).b(this, jn7.f0);
        jn7.f(this.currentAccount).b(this, jn7.u5);
        jn7.f(this.currentAccount).b(this, jn7.s);
        jn7.f(this.currentAccount).b(this, jn7.h0);
        Z0(false, false);
        n1a.s(this.currentAccount);
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
        if (xc2.T(M0)) {
            getMessagesController().j5(M0, this.classGuid, false, null);
        }
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = s1;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Long.valueOf(j));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().j1(j2);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        this.P0.e();
        jn7.f(this.currentAccount).n(this, jn7.y5);
        jn7.f(this.currentAccount).n(this, jn7.r3);
        jn7.f(this.currentAccount).n(this, jn7.T);
        jn7.f(this.currentAccount).n(this, jn7.t5);
        jn7.f(this.currentAccount).n(this, 2);
        jn7.f(this.currentAccount).n(this, jn7.r);
        jn7.f(this.currentAccount).n(this, jn7.w2);
        jn7.f(this.currentAccount).n(this, jn7.f0);
        jn7.f(this.currentAccount).n(this, jn7.u5);
        jn7.f(this.currentAccount).n(this, jn7.s);
        jn7.f(this.currentAccount).n(this, jn7.h0);
        uc7 messagesController = getMessagesController();
        long j = this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        if (xc2.T(M0)) {
            getMessagesController().j5(M0, this.classGuid, true, null);
        }
        super.onFragmentDestroy();
        if (this.e1) {
            this.e1 = false;
            getMessagesController().l4(-j);
        }
        uj3 uj3Var = this.N0;
        if (uj3Var == null || uj3Var.H3 == null) {
            return;
        }
        uj3Var.getActionBar().setSearchAvatarImageView(null);
        this.N0.H3.N = true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        LongSparseIntArray longSparseIntArray = getMessagesController().g4.r;
        long j = this.a;
        int i = longSparseIntArray.get(j, 0) - 1;
        longSparseIntArray.put(j, i >= 0 ? i : 0);
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        qyb qybVar = getMessagesController().g4;
        LongSparseIntArray longSparseIntArray = qybVar.r;
        long j = this.a;
        longSparseIntArray.put(j, longSparseIntArray.get(j, 0) + 1);
        qybVar.y(j, true);
        this.H = false;
        hl.V3(this.O);
        this.H = true;
        setBulletinDelegate(new t10(this, (byte) 22));
        if (!this.inPreviewMode || getMessagesController().v2(-j)) {
            return;
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onSlideProgress(boolean z, float f) {
        if (xea.o() == 0 || !this.U0) {
            return;
        }
        P0(f);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        int b;
        super.onThemeColorsChanged();
        oz4 oz4Var = this.l1;
        if (oz4Var != null) {
            oz4Var.a(getThemedColor(aob.d6));
        }
        if (this.X0 != null && (b = rnb.b(getThemedColor(aob.Ue))) != this.r1) {
            this.r1 = b;
            aob.F1(this.X0.getBackground(), b, true);
        }
        for (int i = 0; i < 2; i++) {
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.I(getThemedColor(aob.G8), true);
            this.actionBar.J(getThemedColor(aob.E8), false, true);
            this.actionBar.J(getThemedColor(aob.F8), true, true);
            this.actionBar.K(getThemedColor(aob.I5), true);
        }
        nf9 nf9Var = this.Q0;
        if (nf9Var != null && (nf9Var.getForeground() instanceof ColorDrawable)) {
            ((ColorDrawable) this.Q0.getForeground()).setColor(vm2.o(getThemedColor(aob.d6), 100));
        }
        T0();
        try {
            a aVar2 = this.actionBar;
            if (aVar2 != null) {
                aVar2.setActionModeColor(getThemedColor(aob.d6));
            }
            xh3 xh3Var = this.x;
            if (xh3Var != null) {
                xh3Var.h();
            }
            if (this.actionBar != null && this.c1) {
                X0();
            }
            NumberTextView numberTextView = this.d0;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(aob.y8));
            }
            s7 s7Var = this.q0;
            if (s7Var == null || s7Var.getSearchField() == null) {
                return;
            }
            this.q0.getSearchField().setCursorColor(getThemedColor(aob.Ne));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        li3 li3Var;
        nf9 nf9Var;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (nf9Var = this.Q0) != null) {
            if (nf9Var.getParent() != null) {
                ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
            }
            this.Q0.setBackground(null);
        }
        if (z) {
            A0(false);
        }
        this.P0.e();
        if (z) {
            return;
        }
        if (this.u0 && this.I) {
            removeSelfFromStack();
            uj3 uj3Var = this.M0;
            if (uj3Var != null) {
                uj3Var.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.J) {
            removeSelfFromStack();
            uj3 uj3Var2 = this.N0;
            if (uj3Var2 == null || (li3Var = uj3Var2.H3) == null || !li3Var.c()) {
                return;
            }
            this.N0.H3.a();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationProgress(boolean z, float f) {
        nf9 nf9Var = this.Q0;
        if (nf9Var == null || nf9Var.getVisibility() != 0) {
            return;
        }
        nf9 nf9Var2 = this.Q0;
        if (z) {
            nf9Var2.setAlpha(1.0f - f);
        } else {
            nf9Var2.setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.P0.d();
    }

    @Override // kz1
    public final f82 p() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.U0 = true;
            O0(true);
        } else {
            this.U0 = false;
            O0(false);
            P0(1.0f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setPreviewOpenedProgress(float f) {
        f82 f82Var = this.f;
        if (f82Var != null) {
            f82Var.setAlpha(f);
            this.r0.setAlpha(f);
            s7 s7Var = this.q0;
            if (s7Var != null) {
                s7Var.setAlpha(f);
            }
            this.actionBar.getBackButton().setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void setPreviewReplaceProgress(float f) {
        f82 f82Var = this.f;
        if (f82Var != null) {
            f82Var.setAlpha(f);
            this.f.setTranslationX((1.0f - f) * hl.L(40.0f));
        }
    }

    @Override // ej6
    public final void v() {
        this.O.A0(0);
    }

    public final void x0(boolean z) {
        li3 li3Var;
        this.t0 = z;
        ValueAnimator valueAnimator = this.Z0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.Z0.cancel();
        }
        byte b = 0;
        if (this.b1 == null) {
            uic l = this.s0.l(8, false);
            this.b1 = l;
            if (this.N0 != null) {
                yob.h(aob.d6, getResourceProvider(), l);
            }
            this.e.addView(this.b1, tre.c(44.0f, -1));
        }
        this.Z0 = ValueAnimator.ofFloat(this.X, z ? 1.0f : 0.0f);
        hl.T3(this.s0, false, 1.0f, true, true);
        uj3 uj3Var = this.N0;
        if (uj3Var != null && (li3Var = uj3Var.H3) != null) {
            li3Var.N = !z;
        }
        this.a1 = !z && this.s0.getVisibility() == 0 && this.s0.getAlpha() == 1.0f;
        this.Z0.addUpdateListener(new ija(this, (byte) 29));
        this.s0.setVisibility(0);
        if (z) {
            hl.V2(getParentActivity(), this.classGuid);
            U0(false);
        } else {
            this.r0.setVisibility(0);
        }
        this.Z0.addListener(new czb(this, z, b));
        this.Z0.setDuration(200L);
        this.Z0.setInterpolator(k43.f);
        this.Z0.start();
        jn7.e().k(jn7.u4, Boolean.TRUE);
    }

    public final void y0() {
        tq3 tq3Var;
        View view;
        a aVar;
        if (Build.VERSION.SDK_INT < 31 || (tq3Var = this.i1) == null) {
            return;
        }
        int L = hl.L(48.0f);
        int L2 = hl.L(48.0f) + ((int) this.V0.c(hl.L(14.0f)));
        uj3 uj3Var = this.N0;
        if (uj3Var != null) {
            view = uj3Var.fragmentView;
            aVar = uj3Var.getActionBar();
        } else {
            view = this.fragmentView;
            aVar = this.actionBar;
        }
        int measuredHeight = (view.getMeasuredHeight() - this.h1) - hl.L(8.0f);
        int L3 = measuredHeight - hl.L(56.0f);
        this.p1.set(0.0f, -L, view.getMeasuredWidth(), aVar.getMeasuredHeight() + L + L2);
        RectF rectF = this.q1;
        rectF.set(0.0f, L3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, i86.e(262144) ? 0.0f : -hl.L(48.0f));
        tq3Var.g(this.N0 != null ? 2 : 1, this.o1);
        tq3Var.e(this.n1, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void z0() {
        uyb uybVar;
        qyb qybVar = this.s;
        long j = this.a;
        if (qybVar.e(j) || (uybVar = this.G) == null) {
            return;
        }
        int M0 = uybVar.M0();
        if (this.b.isEmpty() || M0 >= this.r.b() - 5) {
            qybVar.o(j);
        }
        B0();
    }

    @Override // ej6
    public final void F() {
    }

    @Override // kz1
    public final void r() {
    }

    @Override // kz1
    public final void J(int i, int i2, int i3, int i4, boolean z, boolean z2) {
    }
}
