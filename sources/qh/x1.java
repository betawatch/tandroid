package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import kh.i9;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ai1;
import org.telegram.ui.ak;
import org.telegram.ui.kt0;
import org.telegram.ui.li0;
import org.telegram.ui.qn;
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class x1 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean A;
    public int A0;
    public final int[] B;
    public int B0;
    public int[] C;
    public boolean C0;
    public int[] D;
    public mh.a2 D0;
    public float E;
    public int E0;
    public qn F;
    public boolean F0;
    public Runnable G;
    public int G0;
    public Runnable H;
    public boolean H0;
    public boolean I;
    public final Runnable I0;
    public final ArrayList J;
    public k1 J0;
    public q1 K;
    public li0 K0;
    public o3 L;
    public ValueAnimator L0;
    public View M;
    public float M0;
    public View N;
    public d1 N0;
    public FrameLayout O;
    public int O0;
    public ImageView P;
    public int P0;
    public LinearLayout Q;
    public int Q0;
    public ImageView R;
    public boolean R0;
    public ImageView S;
    public FrameLayout T;
    public FrameLayout U;
    public FrameLayout V;
    public LinearLayout W;
    public qg X;
    public ImageView Y;
    public r1 Z;
    public final CharSequence a;
    public LinearLayout a0;
    public final TL_iv.RichMessage b;
    public final ArrayList b0;
    public int c;
    public ImageView c0;
    public int d;
    public ta1 d0;
    public boolean e;
    public LinearLayout e0;
    public final String f;
    public s1 f0;
    public int g0;
    public CharSequence h;
    public final ArrayList h0;
    public LinearLayout i0;
    public LinearLayout j0;
    public LinearLayout k0;
    public t1 l0;
    public t1 m0;
    public CharSequence n;
    public t1 n0;
    public t1 o0;
    public t1 p0;
    public t1 q0;
    public MessageObject r;
    public FrameLayout r0;
    public pg.f s;
    public pi0 s0;
    public x60 t0;
    public wo0 u0;
    public ak v;
    public m.t3 v0;
    public final Rect w;
    public wy w0;
    public kg.d x;
    public boolean x0;
    public RectF y;
    public boolean y0;
    public int z0;

    public x1(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.b0 = new ArrayList();
        this.g0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.a = editable;
    }

    public static void T(x1 x1Var) {
        c3 c3Var = x1Var.L.j3;
        if (c3Var != null && c3Var.y()) {
            x1Var.m0();
            return;
        }
        Activity parentActivity = x1Var.getParentActivity();
        new v(x1Var.currentAccount, parentActivity, new i9(x1Var, 18), x1Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void U(x1 x1Var) {
        if (UserConfig.getInstance(x1Var.currentAccount).isPremium()) {
            return;
        }
        x1Var.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) x1Var, 43, true));
    }

    public static boolean V(x1 x1Var, View view) {
        qn qnVar = x1Var.F;
        if (qnVar != null && x1Var.r == null && !qnVar.c() && x1Var.L.k3() && !x1Var.L.m3()) {
            if (!x1Var.L.M3()) {
                x1Var.A0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Z2 = x1Var.L.Z2();
            if (!Z2.isEmpty()) {
                li0 li0Var = x1Var.K0;
                if (li0Var != null) {
                    li0Var.h(false);
                    x1Var.K0 = null;
                }
                li0 li0Var2 = new li0(x1Var.getParentActivity(), x1Var.getResourceProvider());
                x1Var.K0 = li0Var2;
                li0Var2.setOnDismissListener(new eh.l(x1Var, 12));
                long a2 = x1Var.F.a();
                MessageObject messageObject = x1Var.F.j5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(x1Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(x1Var.currentAccount).getPeer(UserConfig.getInstance(x1Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Z2;
                richMessage.photos = x1Var.L.B2();
                tL_message.rich_message.documents = x1Var.L.y2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(x1Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                x1Var.K0.q(org.telegram.messenger.l0.k(messageObject2));
                x1Var.u0.setScaleX(1.0f);
                x1Var.u0.setScaleY(1.0f);
                lg r10 = x1Var.K0.r(x1Var.u0, true, new f1(x1Var, 10));
                if (r10 != null) {
                    r10.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), x1Var.getThemedColor(f6.Oh))));
                    li0 li0Var3 = x1Var.K0;
                    int dp = AndroidUtilities.dp(44.0f);
                    li0Var3.i0 = true;
                    li0Var3.U = dp;
                }
                x60 H = x60.H(x1Var, x1Var.u0);
                boolean isUserSelf = UserObject.isUserSelf(x1Var.F.i());
                if (x1Var.F.D6()) {
                    H.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.web.b0(x1Var, a2, 2), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new e1(x1Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new e1(x1Var, 6), false);
                }
                H.Y();
                x1Var.K0.p(H);
                x1Var.K0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void W(x1 x1Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, boolean z10, int i9, int i10, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(x1Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, x1Var.F);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(x1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, z10, i9, i10, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void X(final x1 x1Var, Context context, View view) {
        x60 x60Var;
        boolean z10;
        x60 x60Var2 = x1Var.t0;
        if (x60Var2 != null) {
            x60Var2.u();
            x1Var.t0 = null;
        }
        boolean z11 = (MessagesController.getInstance(x1Var.currentAccount).richEditorAllowed() || UserConfig.getInstance(x1Var.currentAccount).isPremium()) ? false : true;
        final a Q2 = x1Var.L.Q2();
        final x60 I = x60.I(x1Var, view);
        I.Q = true;
        x60 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new fh.r3(I, 8), false);
        J.k();
        final int i9 = 0;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(x1Var) { // from class: qh.j1
            public final /* synthetic */ x1 b;

            {
                this.b = x1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 2);
        final int i10 = 1;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(x1Var) { // from class: qh.j1
            public final /* synthetic */ x1 b;

            {
                this.b = x1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 1);
        final int i11 = 2;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(x1Var) { // from class: qh.j1
            public final /* synthetic */ x1 b;

            {
                this.b = x1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize);
        final int i12 = 3;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(x1Var) { // from class: qh.j1
            public final /* synthetic */ x1 b;

            {
                this.b = x1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 1);
        final int i13 = 4;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(x1Var) { // from class: qh.j1
            public final /* synthetic */ x1 b;

            {
                this.b = x1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 2);
        final int i14 = 5;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(x1Var) { // from class: qh.j1
            public final /* synthetic */ x1 b;

            {
                this.b = x1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.L.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 3);
        if (Q2 == null || !o3.C3(Q2.b)) {
            x60Var = J;
            z10 = false;
        } else {
            x60Var = J;
            z10 = true;
        }
        v1 v1Var = new v1(context, R.drawable.iv_h);
        v1Var.a(z11);
        int i15 = f6.G8;
        v1Var.d = i15;
        I.j(z10, 0, v1Var, LocaleController.getString(R.string.ArticleHeading), new fh.k3(I, x60Var, 11));
        I.y().a.setTypeface(AndroidUtilities.bold());
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new i1(x1Var, Q2, 3));
        I.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new i1(x1Var, Q2, 4));
        boolean z12 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockPullquote);
        v1 v1Var2 = new v1(context, R.drawable.iv_pullquote);
        v1Var2.a(z11);
        v1Var2.d = i15;
        I.j(z12, 0, v1Var2, LocaleController.getString(R.string.ArticlePullquote), new i1(x1Var, Q2, 0));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new i1(x1Var, Q2, 1));
        boolean z13 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockFooter);
        v1 v1Var3 = new v1(context, R.drawable.iv_footer);
        v1Var3.a(z11);
        v1Var3.d = i15;
        I.j(z13, 0, v1Var3, LocaleController.getString(R.string.ArticleFooter), new i1(x1Var, Q2, 2));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.Z();
        x1Var.t0 = I;
    }

    public static void Y(x1 x1Var, boolean z10, boolean z11) {
        if (x1Var.F0 == z10 && z11) {
            return;
        }
        x1Var.F0 = z10;
        float f10 = z10 ? 1.15f : 1.0f;
        if (z11) {
            x1Var.s0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(gr.h).start();
        } else {
            x1Var.s0.animate().cancel();
            x1Var.s0.setScaleX(f10);
            x1Var.s0.setScaleY(f10);
        }
        x1Var.s0.setColorFilter(new PorterDuffColorFilter(x1Var.getThemedColor(z10 ? f6.q7 : f6.G6), PorterDuff.Mode.SRC_IN));
        mi0 animatedDrawable = x1Var.s0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z10) {
                if (animatedDrawable.X > 34) {
                    animatedDrawable.L(0, false, false);
                }
                animatedDrawable.N(33);
            } else {
                animatedDrawable.N(0);
            }
            animatedDrawable.start();
        }
    }

    public static d1 Z(x1 x1Var) {
        d1 focusedEditTextOrNull = x1Var.L.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            d1 d1Var = x1Var.N0;
            return d1Var != null ? d1Var : x1Var.L.P2();
        }
        x1Var.N0 = focusedEditTextOrNull;
        x1Var.O0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int a0(x1 x1Var, d1 d1Var) {
        return (d1Var != x1Var.N0 || x1Var.L.getFocusedEditTextOrNull() == d1Var) ? Math.max(0, d1Var.getSelectionEnd()) : Math.min(x1Var.O0, d1Var.length());
    }

    public static String f0(int i9) {
        if (i9 == 1) {
            return LocaleController.getString(R.string.AccDescrIVTextStyle);
        }
        if (i9 == 2) {
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        if (i9 == 4) {
            return LocaleController.getString(R.string.AccDescrIVTable);
        }
        if (i9 == 7) {
            return LocaleController.getString(R.string.AccDescrIVFormula);
        }
        if (i9 != 9) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrIVDetails);
    }

    public static String h0(int i9) {
        if (i9 == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i9 == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i9 == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i9 == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i9 == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i9 == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i9 == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i9 == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i9 == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void o0(Context context, final Runnable runnable, final Runnable runnable2, b6 b6Var) {
        final int i9 = 0;
        final org.telegram.ui.ActionBar.f3 j10 = ll.j(context, b6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(f6.K(AndroidUtilities.dp(80.0f), f6.v0(f6.Oh, b6Var)));
        linearLayout.addView(imageView, e6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i10 = f6.G6;
        textView.setTextColor(f6.v0(i10, b6Var));
        TextView h = j3.r0.h(linearLayout, textView, e6.t(-1, -2, 49, 25, 16, 25, 0), context);
        h.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        h.setTextSize(1, 14.0f);
        h.setGravity(17);
        h.setTextColor(f6.v0(i10, b6Var));
        linearLayout.addView(h, e6.t(-1, -2, 49, 25, 11, 25, 0));
        kh.d i11 = ll.i(24, context, b6Var, true);
        i11.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(i11, e6.t(-1, 48, 49, 14, 31, 14, 0));
        kh.d i12 = ll.i(24, context, b6Var, false);
        i12.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(i12, e6.t(-1, 48, 49, 14, 2, 14, 6));
        j10.show();
        i11.setOnClickListener(new View.OnClickListener() { // from class: qh.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        j10.dismiss();
                        runnable2.run();
                        break;
                    default:
                        j10.dismiss();
                        runnable2.run();
                        break;
                }
            }
        });
        final int i13 = 1;
        i12.setOnClickListener(new View.OnClickListener() { // from class: qh.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        j10.dismiss();
                        runnable.run();
                        break;
                    default:
                        j10.dismiss();
                        runnable.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
        if (this.u0 == null) {
            return;
        }
        boolean M3 = this.L.M3();
        this.u0.setEnabled(M3);
        this.u0.animate().alpha(M3 ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public final void B0() {
        wo0 wo0Var = this.u0;
        if (wo0Var == null) {
            return;
        }
        wo0Var.setLocked(l0());
    }

    public final t1 b0(int i9, int i10, boolean z10) {
        t1 t1Var = new t1(this.a0.getContext(), i9, getResourceProvider());
        if (z10) {
            t1Var.e();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(f0(i10));
        this.b0.add(t1Var);
        LinearLayout linearLayout = this.a0;
        linearLayout.addView(t1Var, e6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return t1Var;
    }

    public final void c0(Context context, int i9, int i10, boolean z10) {
        t1 t1Var = new t1(context, i9, getResourceProvider());
        if (z10) {
            t1Var.e();
            this.J.add(t1Var);
        }
        t1Var.setTag(Integer.valueOf(i10));
        t1Var.setContentDescription(h0(i10));
        t1Var.setOnClickListener(new gh.z0(this, i10, 25));
        this.h0.add(t1Var);
        LinearLayout linearLayout = this.e0;
        linearLayout.addView(t1Var, e6.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.J;
        arrayList.clear();
        this.K = new q1(this, context);
        setHasOwnBackground(true);
        this.K.setFocusable(true);
        this.K.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.K.setDefaultFocusHighlightEnabled(false);
        }
        this.A0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.B0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        mh.a2 a2Var = new mh.a2(this, 1);
        this.D0 = a2Var;
        this.K.r.add(a2Var);
        o3 o3Var = new o3(context, this.currentAccount, getResourceProvider(), new n5.e0(this, 18));
        this.L = o3Var;
        o3Var.setFileRefParentObject(this.r);
        this.K.addView(this.L, e6.e(-1, -1, 119));
        this.K.addView(this.L.getOverlayView(), e6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            o3 o3Var2 = this.L;
            ArrayList arrayList2 = o3Var2.h3;
            o3Var2.g3 = richMessage;
            o3.W2(arrayList2, richMessage.blocks, o3Var2.i3);
            o3Var2.V3();
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                o3Var2.v4((a) arrayList2.get(i9));
            }
            o3Var2.U2.N(false);
        } else {
            String str = this.f;
            if (str != null) {
                o3 o3Var3 = this.L;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = o3Var3.i3;
                ArrayList arrayList3 = o3Var3.h3;
                if (!TextUtils.isEmpty(charSequence)) {
                    o3.W2(arrayList3, t4.b(charSequence), hashMap);
                }
                arrayList3.addAll(o3Var3.w4(u3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    o3.W2(arrayList3, t4.b(charSequence2), hashMap);
                }
                o3Var3.V3();
                o3Var3.U2.N(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.L.setInitialText(charSequence3);
                }
            }
        }
        b2 b2Var = this.L.F3;
        if (b2Var != null) {
            b2Var.j();
        }
        View view = new View(context);
        this.M = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = f6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i10), f6.l1(0.0f, getThemedColor(i10))}));
        this.K.addView(this.M, e6.e(-1, 68, 55));
        View view2 = new View(context);
        this.N = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{f6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10)}));
        this.K.addView(this.N, e6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setClipChildren(false);
        this.O.setClipToPadding(false);
        this.K.addView(this.O, e6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.P = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.P;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.P;
        int themedColor = getThemedColor(i10);
        int themedColor2 = getThemedColor(i10);
        int i11 = f6.i6;
        imageView3.setBackground(new w1(f6.Z(themedColor, f6.v(themedColor2, getThemedColor(i11)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.P;
        int i12 = f6.G6;
        int themedColor3 = getThemedColor(i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        g6.a(this.P);
        this.P.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.P.setOnClickListener(new f1(this, 1));
        this.O.addView(this.P, e6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q = linearLayout;
        linearLayout.setOrientation(0);
        this.Q.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.O.addView(this.Q, e6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.R = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.R.setScaleType(scaleType);
        this.R.setBackground(f6.f0(getThemedColor(i11), 1, -1));
        this.R.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        g6.a(this.R);
        this.R.setContentDescription(LocaleController.getString(R.string.Undo));
        this.R.setOnClickListener(new f1(this, 2));
        this.Q.addView(this.R, e6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.S = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.S.setScaleType(scaleType);
        this.S.setBackground(f6.f0(getThemedColor(i11), 1, -1));
        this.S.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        g6.a(this.S);
        this.S.setContentDescription(LocaleController.getString(R.string.Redo));
        this.S.setOnClickListener(new f1(this, 3));
        this.Q.addView(this.S, e6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.U = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.U.setClipToPadding(false);
        this.K.addView(this.U, e6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.V = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.V.setClipToPadding(false);
        this.U.addView(this.V, e6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.W = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.W.setClipChildren(false);
        this.W.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.W, e6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.T = frameLayout4;
        this.V.addView(frameLayout4, e6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.Y = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.Y.setScaleType(scaleType);
        this.Y.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.Y.setBackground(new w1(f6.Z(getThemedColor(i10), f6.v(getThemedColor(i10), getThemedColor(i11)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.W.addView(this.Y, e6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        g6.a(this.Y);
        this.Y.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.Y.setOnClickListener(new f1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        frameLayout5.addView(frameLayout6, e6.e(-2, 44, 81));
        r1 r1Var = new r1(context, 0);
        this.Z = r1Var;
        r1Var.setClipToOutline(true);
        this.Z.setOutlineProvider(new bg.q1(19));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.a0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.a0.setOrientation(0);
        this.Z.addView(this.a0);
        frameLayout6.addView(this.Z, e6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.X = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.X.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.X.setBackground(f6.Z(getThemedColor(i10), getThemedColor(i11), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.X.j(og.e, false);
        this.a0.addView(this.X, e6.q(38, 38, 16));
        g6.a(this.X);
        this.X.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.X.setOnClickListener(new f1(this, 5));
        b0(R.drawable.iv_text, 1, false).setOnClickListener(new pf.v(3, this, context));
        b0(R.drawable.iv_lists, 2, true).setOnClickListener(new f1(this, 6));
        b0(R.drawable.iv_table, 4, true).setOnClickListener(new f1(this, 7));
        b0(R.drawable.iv_math, 7, true).setOnClickListener(new f1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.c0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.c0.setScaleType(scaleType);
        this.c0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.c0.setBackground(f6.Z(getThemedColor(i10), getThemedColor(i11), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.a0.addView(this.c0, e6.t(38, 38, 16, 2, 0, 0, 0));
        g6.a(this.c0);
        this.c0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.c0.setOnClickListener(new f1(this, 9));
        this.W.addView(frameLayout5, e6.l(1.0f, 0, 44));
        ta1 ta1Var = new ta1(this, context, 18);
        this.d0 = ta1Var;
        ta1Var.setOrientation(0);
        this.d0.setClipToPadding(false);
        this.d0.setClipChildren(false);
        this.d0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.d0, e6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.r0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.r0.setClipToPadding(false);
        this.r0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.U.addView(this.r0, e6.e(80, 60, 81));
        pi0 pi0Var = new pi0(context);
        this.s0 = pi0Var;
        pi0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        mi0 animatedDrawable = this.s0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.s0.setScaleType(scaleType);
        this.s0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
        this.s0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.r0.addView(this.s0, e6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.d0.addView(frameLayout8, e6.c(44.0f, -2));
        s1 s1Var = new s1(this, context);
        this.f0 = s1Var;
        s1Var.setHorizontalScrollBarEnabled(false);
        this.f0.setClipToOutline(true);
        this.f0.setOutlineProvider(new bg.q1(20));
        frameLayout8.addView(this.f0, e6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.e0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.e0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.f0.addView(this.e0, new FrameLayout.LayoutParams(-2, -1));
        c0(context, R.drawable.formatting_bold, 1, false);
        c0(context, R.drawable.formatting_italic, 2, false);
        c0(context, R.drawable.formatting_underline, 16, false);
        c0(context, R.drawable.formatting_strikethrough, 8, false);
        c0(context, R.drawable.formatting_spoiler, 256, false);
        c0(context, R.drawable.iv_code, 4, false);
        c0(context, R.drawable.formatting_marked, 65536, true);
        c0(context, R.drawable.iv_sub, 16384, true);
        c0(context, R.drawable.iv_super, 32768, true);
        t1 t1Var = new t1(context, R.drawable.iv_quote, getResourceProvider());
        this.q0 = t1Var;
        t1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.q0.setOnClickListener(new f1(this, 11));
        LinearLayout linearLayout5 = this.e0;
        linearLayout5.addView(this.q0, e6.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        t1 t1Var2 = new t1(context, R.drawable.iv_button, getResourceProvider());
        this.n0 = t1Var2;
        t1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.n0.setOnClickListener(new f1(this, 12));
        LinearLayout linearLayout6 = this.e0;
        linearLayout6.addView(this.n0, e6.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.j0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.j0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.j0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.d0.addView(this.j0, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var3 = new t1(context, R.drawable.media_link_24, getResourceProvider());
        this.m0 = t1Var3;
        t1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.m0.setOnClickListener(new f1(this, 13));
        this.j0.addView(this.m0, e6.q(38, 38, 16));
        t1 t1Var4 = new t1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.o0 = t1Var4;
        t1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.o0.setOnClickListener(new f1(this, 14));
        this.j0.addView(this.o0, e6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.k0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.k0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.k0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.d0.addView(this.k0, e6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        t1 t1Var5 = new t1(context, R.drawable.iv_math, getResourceProvider());
        this.p0 = t1Var5;
        t1Var5.e();
        arrayList.add(this.p0);
        this.p0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.p0.setOnClickListener(new f1(this, 15));
        this.k0.addView(this.p0, e6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.i0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.i0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.i0.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i10))));
        this.d0.addView(this.i0, 0, e6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        t1 t1Var6 = new t1(context, 0, getResourceProvider());
        this.l0 = t1Var6;
        t1Var6.setImageDrawable(new org.telegram.ui.Components.i0(context));
        this.l0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.l0.setOnClickListener(new f1(this, 16));
        this.i0.addView(this.l0, e6.q(38, 38, 16));
        wo0 wo0Var = new wo0((Object) this, context, this.r != null ? R.drawable.input_done : k0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), 3);
        this.u0 = wo0Var;
        wo0Var.setBackground(new w1(f6.b0(AndroidUtilities.dp(22.0f), getThemedColor(f6.Yd))));
        g6.a(this.u0);
        this.W.addView(this.u0, e6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.u0.setContentDescription(LocaleController.getString(R.string.Send));
        this.u0.setOnClickListener(new f1(this, 0));
        this.u0.setOnLongClickListener(new kh.d5(this, 3));
        B0();
        this.K.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        g0();
        w0(0, false);
        y0();
        this.K.getViewTreeObserver().addOnGlobalFocusChangeListener(new h(this, 1));
        z0();
        if (this.e) {
            this.L.C2();
            this.e = false;
        }
        q1 q1Var = this.K;
        this.fragmentView = q1Var;
        return q1Var;
    }

    public final void d0(boolean z10) {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M0, z10 ? 1.0f : 0.0f);
        this.L0 = ofFloat;
        ofFloat.addUpdateListener(new g1(this, 0));
        this.L0.setInterpolator(gr.h);
        this.L0.setDuration(250L);
        this.L0.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
            B0();
            z0();
        }
    }

    public final void e0() {
        FrameLayout.LayoutParams layoutParams;
        wy wyVar = this.w0;
        if (wyVar == null || (layoutParams = (FrameLayout.LayoutParams) wyVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.K == null ? i0() : Math.max(i0(), ((r2.getMeasuredHeight() - this.K.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.P0)) - r1) * this.M0) + i0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.w0.setLayoutParams(layoutParams);
        }
    }

    public final void g0() {
        FrameLayout.LayoutParams layoutParams;
        wy wyVar = this.w0;
        if (wyVar != null && (layoutParams = (FrameLayout.LayoutParams) wyVar.getLayoutParams()) != null) {
            int i9 = layoutParams.bottomMargin;
            int i10 = this.P0;
            if (i9 != i10) {
                layoutParams.bottomMargin = i10;
                this.w0.setLayoutParams(layoutParams);
            }
        }
        e0();
        int max = Math.max(Math.max(this.z0, this.P0), this.Q0);
        this.L.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        o3 o3Var = this.L;
        int i11 = this.P0;
        int i12 = this.Q0;
        int i13 = this.z0;
        o3Var.K3 = i11;
        o3Var.L3 = i12;
        o3Var.M3 = i13;
        this.U.setTranslationY(-max);
        this.N.setTranslationY(r0 + this.P0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    public final int i0() {
        Point point = AndroidUtilities.displaySize;
        int i9 = point.x > point.y ? this.B0 : this.A0;
        return i9 <= 0 ? AndroidUtilities.dp(200.0f) : i9;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        o3 o3Var = this.L;
        if (o3Var == null || !o3Var.j3.y()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final void j0(boolean z10) {
        if (this.y0) {
            this.y0 = false;
            wy wyVar = this.w0;
            if (wyVar != null) {
                wyVar.t(false);
                this.w0.A();
            }
        }
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.L0 = null;
        }
        this.M0 = 0.0f;
        this.N0 = null;
        wy wyVar2 = this.w0;
        if (wyVar2 != null) {
            wyVar2.setTranslationY(0.0f);
            this.w0.setVisibility(8);
        }
        if (this.x0 || this.z0 != 0) {
            this.x0 = false;
            this.z0 = 0;
            g0();
        }
        qg qgVar = this.X;
        if (qgVar != null) {
            qgVar.j(og.e, z10);
        }
    }

    public final boolean k0() {
        qn qnVar;
        return this.r == null && (qnVar = this.F) != null && qnVar.c();
    }

    public final boolean l0() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        o3 o3Var = this.L;
        return t4.f(o3Var.h3, o3Var.i3);
    }

    public final void m0() {
        f3 h22 = this.L.h2();
        if (h22 == null) {
            return;
        }
        TL_iv.RichMessage a2 = h22.a();
        if (a2.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.e0 e0Var = new org.telegram.ui.Components.e0(getParentActivity(), getResourceProvider());
        e0Var.m0(a2);
        e0Var.g0 = new i9(h22, 16);
        e0Var.show();
    }

    public final void n0(int i9, int i10) {
        o3 o3Var = this.L;
        o3Var.Y3 = o3Var.Q2();
        ki kiVar = new ki(getParentActivity(), this, false, false, true, getResourceProvider());
        kiVar.V1 = new n1(this, kiVar);
        kiVar.f0.setIncludeVideosInGallery(true);
        kiVar.f0.e0();
        kiVar.J1(1, true);
        kiVar.h1(i9);
        kiVar.p2 = new m1(this, kiVar);
        kiVar.U = new m1(this, kiVar);
        kiVar.T = new o1(this, kiVar);
        kiVar.r1();
        if (i10 != 0) {
            kiVar.A1(i10);
        }
        kiVar.setFocusable(true);
        kiVar.show();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        if (i10 != -1 || i9 != 21) {
            if (i10 != -1 || (i9 != 1 && i9 != 14)) {
                super.onActivityResultFragment(i9, i10, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.L.e2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        o3 o3Var = this.L;
        Uri data = intent.getData();
        if (data == null) {
            o3Var.getClass();
        } else {
            if (o3Var.getContext() == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new ai1(21, o3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.y0;
        if (z11) {
            if (z11) {
                this.y0 = false;
                wy wyVar = this.w0;
                if (wyVar != null) {
                    wyVar.t(false);
                    this.w0.A();
                }
                d0(false);
                return false;
            }
        } else {
            if (this.x0) {
                j0(true);
                return false;
            }
            if (!this.L.F2()) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        int i9 = 1;
        if (!z10 && !this.R0) {
            p0();
            this.R0 = true;
        }
        if (AndroidUtilities.isTablet() || this.s == null || this.v == null) {
            return super.onCustomTransitionAnimation(z10, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        pg.f fVar = this.s;
        this.x = fVar.f;
        fVar.e = false;
        fVar.invalidate();
        this.v.setAlpha(0.0f);
        int i10 = 4;
        this.v.v1.setVisibility(4);
        u0();
        float f10 = z10 ? 0.0f : 1.0f;
        this.E = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z10 ? 1.0f : 0.0f);
        this.A = true;
        this.K.invalidate();
        ofFloat.addUpdateListener(new g1(this, i9));
        ofFloat.addListener(new su0(18, this, runnable));
        if (z10) {
            FrameLayout frameLayout = this.O;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.O;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.L, (Property<o3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.M, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.O;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.O;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.V, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.L, (Property<o3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.M, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.N, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(gr.h);
        this.K.post(new kt0(animatorSet, i10));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        mh.a2 a2Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.R0) {
            p0();
            this.R0 = true;
        }
        k1 k1Var = this.J0;
        if (k1Var != null) {
            this.J0 = null;
            AndroidUtilities.runOnUIThread(k1Var);
        }
        li0 li0Var = this.K0;
        if (li0Var != null) {
            li0Var.i();
            this.K0 = null;
        }
        o3 o3Var = this.L;
        if (o3Var != null) {
            o3Var.G2();
        }
        m.t3 t3Var = this.v0;
        if (t3Var != null) {
            t3Var.c();
        }
        super.onFragmentDestroy();
        wy wyVar = this.w0;
        if (wyVar != null) {
            wyVar.D();
        }
        q1 q1Var = this.K;
        if (q1Var == null || (a2Var = this.D0) == null) {
            return;
        }
        q1Var.r.remove(a2Var);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.P0 = i12;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.P0;
        this.N.setLayoutParams(layoutParams);
        g0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        x60 x60Var;
        i0.b f10 = m1Var.a.f(3);
        int i9 = m1Var.a.f(8).d;
        this.Q0 = i9;
        int i10 = i9 - f10.d;
        boolean z10 = this.C0;
        boolean z11 = i10 > AndroidUtilities.dp(20.0f);
        this.C0 = z11;
        if (z11 && i10 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.B0 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.B0).commit();
            } else {
                this.A0 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.A0).commit();
            }
        }
        if (this.C0 && !z10 && this.x0 && !this.y0) {
            j0(false);
        }
        if (!this.C0 && z10 && (x60Var = this.t0) != null) {
            x60Var.u();
            this.t0 = null;
        }
        onInsets(f10.a, f10.b, f10.c, f10.d);
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        o3 o3Var;
        int i9;
        o3 o3Var2;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i9 = this.c) >= 0 && (o3Var2 = this.L) != null) {
            int i10 = this.d;
            this.d = -1;
            this.c = -1;
            if (o3Var2.Y1(i9, i10)) {
                return;
            }
            o3Var2.post(new j2(o3Var2, i9, i10, 0));
            return;
        }
        if (!z10 || z11) {
            return;
        }
        if ((this.b == null && this.f == null) || (o3Var = this.L) == null || o3Var.a3()) {
            return;
        }
        o3Var.post(new b(o3Var, 5));
    }

    public final boolean p0() {
        Runnable runnable;
        if (this.F == null || this.r != null || !this.L.r2()) {
            return false;
        }
        TL_iv.RichMessage j22 = this.I ? null : this.L.j2();
        if (j22 == null && (runnable = this.H) != null) {
            runnable.run();
        }
        ak akVar = this.F.U;
        if (j22 != null && !this.I) {
            o3 o3Var = this.L;
            if (o3Var.k3() && !t4.f(o3Var.h3, o3Var.i3) && akVar != null) {
                SpannableStringBuilder k10 = t4.k(this.L.h3);
                qn qnVar = akVar.K2;
                if (akVar.A0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, akVar.A0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.t5.class);
                if (t5VarArr != null) {
                    for (org.telegram.ui.Components.t5 t5Var : t5VarArr) {
                        t5Var.applyFontMetrics(akVar.A0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.k5.g());
                    }
                }
                fi0.a(spannableStringBuilder);
                if (qnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(akVar.M).saveDraft(qnVar.a(), qnVar.B7(qnVar.j5), charSequenceArr[0], MediaDataController.getInstance(akVar.M).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                akVar.setRichDraftPreview(null);
                if (akVar.A0.getText() != null) {
                    akVar.A0.getText().clear();
                }
                akVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.F.a();
        qn qnVar2 = this.F;
        mediaDataController.saveDraft(a2, qnVar2.B7(qnVar2.j5), "", null, null, null, null, 0L, false, false, j22);
        TL_iv.RichMessage richMessage = j22;
        if (akVar == null) {
            return true;
        }
        akVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void q0() {
        if (l0()) {
            Activity parentActivity = getParentActivity();
            o3 o3Var = this.L;
            Objects.requireNonNull(o3Var);
            o0(parentActivity, new b(o3Var, 0), new e1(this, 4), getResourceProvider());
            return;
        }
        if (k0()) {
            org.telegram.ui.Components.y4.M(getParentActivity(), this.F.a(), new n5.a0(this, 14), getResourceProvider());
        } else {
            r0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [qh.k1] */
    public final void r0(final int i9, final int i10, final boolean z10) {
        if (l0()) {
            Activity parentActivity = getParentActivity();
            o3 o3Var = this.L;
            Objects.requireNonNull(o3Var);
            o0(parentActivity, new b(o3Var, 0), new e1(this, 4), getResourceProvider());
            return;
        }
        if (this.F == null || !this.L.k3() || this.L.m3()) {
            return;
        }
        if (!this.L.M3()) {
            A0();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            ak akVar = this.F.U;
            if (akVar == null) {
                return;
            }
            this.I = true;
            Runnable runnable = this.G;
            if (runnable != null) {
                runnable.run();
            }
            akVar.R0(t4.k(this.L.h3), z10, i9, i10);
            finishFragment();
            return;
        }
        this.I = true;
        final ArrayList Z2 = this.L.Z2();
        if (Z2.isEmpty()) {
            return;
        }
        final ArrayList B2 = this.L.B2();
        final ArrayList y22 = this.L.y2();
        final ArrayList a2 = s4.a(this.currentAccount, Z2);
        final long a3 = this.F.a();
        qn qnVar = this.F;
        final MessageObject messageObject = qnVar.j5;
        final MessageObject messageObject2 = qnVar.T3;
        final long N8 = qnVar.N8();
        final SendMessageChatArguments C8 = this.F.C8();
        final MessageObject messageObject3 = this.r;
        ?? r02 = new Runnable() { // from class: qh.k1
            @Override // java.lang.Runnable
            public final void run() {
                x1.W(x1.this, messageObject3, Z2, B2, y22, a2, a3, messageObject, messageObject2, z10, i9, i10, C8, N8);
            }
        };
        Runnable runnable2 = this.G;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i9 == 0 || messageObject3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.J0 = r02;
            finishFragment();
        }
    }

    public final void s0(boolean z10) {
        ArrayList arrayList = this.h0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            t1 t1Var = (t1) obj;
            if (((Integer) t1Var.getTag()).intValue() == 1) {
                t1Var.setEnabled(z10);
            }
        }
    }

    public final void t0(boolean z10, boolean z11) {
        t1 t1Var = this.m0;
        if (t1Var != null) {
            t1Var.setEnabled(z10);
        }
        t1 t1Var2 = this.n0;
        if (t1Var2 != null) {
            t1Var2.setEnabled(z11);
        }
        t1 t1Var3 = this.o0;
        if (t1Var3 != null) {
            t1Var3.setEnabled(z10);
        }
        t1 t1Var4 = this.p0;
        if (t1Var4 != null) {
            t1Var4.setEnabled(z10);
        }
    }

    public final void u0() {
        this.s.getLocationInWindow(this.B);
        if (this.y == null) {
            this.y = new RectF();
        }
        RectF rectF = new RectF(this.x.getBounds());
        this.y = rectF;
        rectF.offset(r1[0], r1[1]);
        if (this.C == null) {
            this.C = new int[2];
        }
        this.v.getLocationInWindow(this.C);
        if (this.D == null) {
            this.D = new int[2];
        }
        this.D[0] = this.L.getPaddingLeft();
        this.D[1] = this.L.getPaddingTop();
        this.D[0] = (int) (r0[0] - (this.v.A0.getX() - AndroidUtilities.dp(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0() {
        a Q2;
        int i9;
        int size;
        int i10;
        n9 textSelectionHelper = this.L.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            Q2 = this.L.Q2();
        } else {
            int i11 = textSelectionHelper.u0;
            Q2 = i11 == textSelectionHelper.x0 ? this.L.y4(i11) : null;
        }
        if (this.L.R2() == null) {
            if (Q2 != null) {
                if (!Q2.a() && !Q2.b() && !Q2.c()) {
                    TL_iv.PageBlock pageBlock = Q2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i9 = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i9 = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i9 = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i9 = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i9 = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i9 = 7;
                            }
                            ArrayList arrayList = this.b0;
                            size = arrayList.size();
                            i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                t1 t1Var = (t1) obj;
                                int intValue = ((Integer) t1Var.getTag()).intValue();
                                t1Var.setSelected(i9 == intValue);
                                if (i9 == intValue) {
                                    t1Var.setEnabled(true);
                                    if (Q2 == null) {
                                        t1Var.a();
                                    } else if (i9 == 1) {
                                        TL_iv.PageBlock pageBlock2 = Q2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            t1Var.f(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            t1Var.f(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            t1Var.f(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            t1Var.f(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            t1Var.f(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            t1Var.f(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            t1Var.f(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            t1Var.f(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            t1Var.f(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            t1Var.f(R.drawable.iv_footer);
                                        } else {
                                            t1Var.a();
                                        }
                                    } else if (i9 == 2) {
                                        if (Q2.a()) {
                                            t1Var.f(R.drawable.iv_todo);
                                        } else if (Q2.c()) {
                                            t1Var.f(R.drawable.iv_ordered_list);
                                        } else {
                                            t1Var.a();
                                        }
                                    } else if (i9 == 8) {
                                        t1Var.f(R.drawable.iv_details);
                                    } else {
                                        t1Var.a();
                                    }
                                } else {
                                    t1Var.setEnabled(i9 != 4);
                                    t1Var.a();
                                }
                            }
                        }
                    }
                }
                i9 = 2;
                ArrayList arrayList2 = this.b0;
                size = arrayList2.size();
                i10 = 0;
                while (i10 < size) {
                }
            }
            i9 = 0;
            ArrayList arrayList22 = this.b0;
            size = arrayList22.size();
            i10 = 0;
            while (i10 < size) {
            }
        }
        i9 = 4;
        ArrayList arrayList222 = this.b0;
        size = arrayList222.size();
        i10 = 0;
        while (i10 < size) {
        }
    }

    public final void w0(int i9, boolean z10) {
        if (this.G0 == i9) {
            return;
        }
        this.G0 = i9;
        if (z10) {
            this.W.setVisibility(0);
            ViewPropertyAnimator duration = this.W.animate().alpha(this.G0 == 0 ? 1.0f : 0.0f).scaleX(this.G0 == 0 ? 1.0f : 0.8f).scaleY(this.G0 == 0 ? 1.0f : 0.8f).translationY(this.G0 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new e1(this, 1)).start();
            this.d0.setVisibility(0);
            this.d0.animate().alpha(this.G0 == 1 ? 1.0f : 0.0f).scaleX(this.G0 == 1 ? 1.0f : 0.8f).scaleY(this.G0 == 1 ? 1.0f : 0.8f).translationY(this.G0 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(grVar).withEndAction(new e1(this, 2)).start();
            this.r0.setVisibility(0);
            this.r0.animate().alpha(this.G0 == 2 ? 1.0f : 0.0f).scaleX(this.G0 == 2 ? 1.0f : 0.8f).scaleY(this.G0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(grVar).withEndAction(new e1(this, 3)).start();
            return;
        }
        this.W.setVisibility(i9 == 0 ? 0 : 8);
        this.W.setAlpha(i9 == 0 ? 1.0f : 0.0f);
        this.W.setScaleX(i9 == 0 ? 1.0f : 0.8f);
        this.W.setScaleY(i9 == 0 ? 1.0f : 0.8f);
        this.W.setTranslationY(i9 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.d0.setVisibility(i9 == 1 ? 0 : 8);
        this.d0.setAlpha(i9 == 1 ? 1.0f : 0.0f);
        this.d0.setScaleX(i9 == 1 ? 1.0f : 0.8f);
        this.d0.setScaleY(i9 == 1 ? 1.0f : 0.8f);
        this.d0.setTranslationY(i9 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.r0.setVisibility(i9 != 2 ? 8 : 0);
        this.r0.setAlpha(i9 == 2 ? 1.0f : 0.0f);
        this.r0.setScaleX(i9 == 2 ? 1.0f : 0.8f);
        this.r0.setScaleY(i9 == 2 ? 1.0f : 0.8f);
    }

    public final void x0() {
        boolean z10;
        boolean z11;
        n9 textSelectionHelper = this.L.getTextSelectionHelper();
        ArrayList arrayList = this.h0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        t1 t1Var = this.q0;
        boolean z12 = false;
        if (t1Var != null) {
            o3 o3Var = this.L;
            int[] B4 = o3Var.B4();
            t1Var.setSelected(B4 != null && o3Var.H3(B4[0], B4[1]));
        }
        if (this.L.L3()) {
            n9 textSelectionHelper2 = this.L.getTextSelectionHelper();
            int i9 = textSelectionHelper2.u0;
            int i10 = textSelectionHelper2.v0;
            int i11 = textSelectionHelper2.y0;
            int i12 = textSelectionHelper2.w0;
            int i13 = textSelectionHelper2.z0;
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                t1 t1Var2 = (t1) obj;
                t1Var2.setSelected(this.L.K3(((Integer) t1Var2.getTag()).intValue(), i9, i10, i12, i11, i13));
            }
            boolean z13 = i10 == i11;
            d1 N4 = z13 ? this.L.N4(i9, i10) : null;
            int max = Math.max(0, Math.min(i12, i13));
            int max2 = N4 == null ? 0 : Math.max(0, Math.min(Math.max(i12, i13), N4.length()));
            t1 t1Var3 = this.m0;
            if (t1Var3 != null) {
                t1Var3.setSelected(N4 != null && max < max2 && u5.h(N4.getText(), max, max2));
            }
            t1 t1Var4 = this.o0;
            if (t1Var4 != null) {
                if (N4 != null && max < max2 && u5.g(N4.getText(), max, max2)) {
                    z12 = true;
                }
                t1Var4.setSelected(z12);
            }
            s0(true);
            t0(z13, this.L.l2());
            return;
        }
        if (this.L.w3()) {
            n9 textSelectionHelper3 = this.L.getTextSelectionHelper();
            d1 s22 = this.L.s2(textSelectionHelper3.u0);
            int i15 = textSelectionHelper3.w0;
            int i16 = textSelectionHelper3.z0;
            int max3 = s22 == null ? 0 : Math.max(0, Math.min(Math.min(i15, i16), s22.length()));
            int max4 = s22 == null ? 0 : Math.max(0, Math.min(Math.max(i15, i16), s22.length()));
            int size2 = arrayList.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj2 = arrayList.get(i17);
                i17++;
                t1 t1Var5 = (t1) obj2;
                t1Var5.setSelected((s22 == null || max3 >= max4 || (((Integer) t1Var5.getTag()).intValue() & s22.getCurrentStyle(max3, max4)) == 0) ? false : true);
            }
            t1 t1Var6 = this.m0;
            if (t1Var6 != null) {
                t1Var6.setSelected(s22 != null && max3 < max4 && u5.h(s22.getText(), max3, max4));
            }
            t1 t1Var7 = this.o0;
            if (t1Var7 != null) {
                if (s22 != null && max3 < max4 && u5.g(s22.getText(), max3, max4)) {
                    z12 = true;
                }
                t1Var7.setSelected(z12);
            }
            s0(true);
            t0(true, this.L.l2());
            return;
        }
        int i18 = textSelectionHelper.u0;
        int i19 = textSelectionHelper.x0;
        int i20 = textSelectionHelper.w0;
        int i21 = textSelectionHelper.z0;
        boolean z14 = i18 >= 0 && i19 >= 0 && i19 >= i18 && i19 < this.L.l4.size();
        int size3 = arrayList.size();
        int i22 = 0;
        while (i22 < size3) {
            int i23 = i22 + 1;
            t1 t1Var8 = (t1) arrayList.get(i22);
            t1Var8.setSelected(z14 && this.L.J3(((Integer) t1Var8.getTag()).intValue(), i18, i20, i19, i21));
            i22 = i23;
        }
        s0(!this.L.I3());
        t1 t1Var9 = this.m0;
        if (t1Var9 != null) {
            if (z14) {
                Editable H4 = this.L.H4(i18, i20, i19, i21);
                if (H4 == null ? false : u5.h(H4, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z11 = true;
                    t1Var9.setSelected(z11);
                }
            }
            z11 = false;
            t1Var9.setSelected(z11);
        }
        t1 t1Var10 = this.o0;
        if (t1Var10 != null) {
            if (z14) {
                Editable H42 = this.L.H4(i18, i20, i19, i21);
                if (H42 == null ? false : u5.g(H42, Math.max(0, Math.min(i20, i21)), Math.max(i20, i21))) {
                    z10 = true;
                    t1Var10.setSelected(z10);
                }
            }
            z10 = false;
            t1Var10.setSelected(z10);
        }
        if (z14 && i18 == i19) {
            z12 = true;
        }
        t0(z12, this.L.l2());
    }

    public final void y0() {
        boolean r22 = this.L.r2();
        b2 b2Var = this.L.F3;
        boolean z10 = (b2Var == null || b2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setEnabled(r22);
            this.R.setAlpha(r22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.S;
        if (imageView2 != null) {
            imageView2.setEnabled(z10);
            this.S.setAlpha(z10 ? 1.0f : 0.35f);
        }
    }

    public final void z0() {
        int i9 = 0;
        boolean z10 = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        ArrayList arrayList = this.J;
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((t1) obj).setPremiumLocked(z10);
        }
    }

    public x1(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.b0 = new ArrayList();
        this.g0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.f = str;
    }

    public x1(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.B = new int[2];
        this.E = 1.0f;
        this.J = new ArrayList();
        this.b0 = new ArrayList();
        this.g0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.h0 = new ArrayList();
        this.E0 = 0;
        this.G0 = -1;
        this.I0 = new e1(this, 0);
        this.b = richMessage;
    }
}
