package wh;

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
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import k7.c6;
import k7.e6;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.ib1;
import org.telegram.ui.jk;
import org.telegram.ui.ti0;
import org.telegram.ui.tt0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.r8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class z1 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public boolean B;
    public int B0;
    public final int[] C;
    public int C0;
    public int[] D;
    public boolean D0;
    public int[] E;
    public sh.s1 E0;
    public float F;
    public int F0;
    public xn G;
    public boolean G0;
    public Runnable H;
    public int H0;
    public Runnable I;
    public boolean I0;
    public boolean J;
    public final Runnable J0;
    public final ArrayList K;
    public l1 K0;
    public r1 L;
    public ti0 L0;
    public r3 M;
    public ValueAnimator M0;
    public View N;
    public float N0;
    public View O;
    public e1 O0;
    public FrameLayout P;
    public int P0;
    public ImageView Q;
    public int Q0;
    public LinearLayout R;
    public int R0;
    public ImageView S;
    public boolean S0;
    public ImageView T;
    public FrameLayout U;
    public FrameLayout V;
    public FrameLayout W;
    public LinearLayout X;
    public qg Y;
    public ImageView Z;
    public final CharSequence a;
    public s1 a0;
    public final TL_iv.RichMessage b;
    public LinearLayout b0;
    public int c;
    public final ArrayList c0;
    public int d;
    public ImageView d0;
    public boolean e;
    public ib1 e0;
    public final String f;
    public LinearLayout f0;
    public t1 g0;
    public CharSequence h;
    public int h0;
    public final ArrayList i0;
    public LinearLayout j0;
    public LinearLayout k0;
    public LinearLayout l0;
    public u1 m0;
    public CharSequence n;
    public u1 n0;
    public u1 o0;
    public u1 p0;
    public u1 q0;
    public MessageObject r;
    public u1 r0;
    public vg.f s;
    public FrameLayout s0;
    public lj0 t0;
    public q70 u0;
    public jk v;
    public rp0 v0;
    public final Rect w;
    public m.r3 w0;
    public qg.b x;
    public mz x0;
    public RectF y;
    public boolean y0;
    public boolean z0;

    public z1(Editable editable) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.C = new int[2];
        this.F = 1.0f;
        this.K = new ArrayList();
        this.c0 = new ArrayList();
        this.h0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.i0 = new ArrayList();
        this.F0 = 0;
        this.H0 = -1;
        this.J0 = new f1(this, 0);
        this.a = editable;
    }

    public static void U(z1 z1Var) {
        f3 f3Var = z1Var.M.k3;
        if (f3Var != null && f3Var.y()) {
            z1Var.n0();
            return;
        }
        Activity parentActivity = z1Var.getParentActivity();
        new w(z1Var.currentAccount, parentActivity, new org.telegram.ui.web.d1(z1Var, 25), z1Var.getResourceProvider()).show();
    }

    public static /* synthetic */ void V(z1 z1Var) {
        if (UserConfig.getInstance(z1Var.currentAccount).isPremium()) {
            return;
        }
        z1Var.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) z1Var, 43, true));
    }

    public static boolean W(z1 z1Var, View view) {
        xn xnVar = z1Var.G;
        if (xnVar != null && z1Var.r == null && !xnVar.c() && z1Var.M.k3() && !z1Var.M.m3()) {
            if (!z1Var.M.M3()) {
                z1Var.B0();
                return false;
            }
            ArrayList<TL_iv.PageBlock> Z2 = z1Var.M.Z2();
            if (!Z2.isEmpty()) {
                ti0 ti0Var = z1Var.L0;
                if (ti0Var != null) {
                    ti0Var.h(false);
                    z1Var.L0 = null;
                }
                ti0 ti0Var2 = new ti0(z1Var.getParentActivity(), z1Var.getResourceProvider());
                z1Var.L0 = ti0Var2;
                ti0Var2.setOnDismissListener(new fg.d0(z1Var, 14));
                long a2 = z1Var.G.a();
                MessageObject messageObject = z1Var.G.k5;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = MessagesController.getInstance(z1Var.currentAccount).getPeer(a2);
                tL_message.from_id = MessagesController.getInstance(z1Var.currentAccount).getPeer(UserConfig.getInstance(z1Var.currentAccount).getClientUserId());
                tL_message.flags2 |= 8192;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = Z2;
                richMessage.photos = z1Var.M.B2();
                tL_message.rich_message.documents = z1Var.M.y2();
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                MessageObject messageObject2 = new MessageObject(z1Var.currentAccount, tL_message, false, false);
                if (messageObject != null && !messageObject.isTopicMainMessage) {
                    messageObject2.replyMessageObject = messageObject;
                }
                messageObject2.sendPreview = true;
                messageObject2.isOutOwnerCached = Boolean.TRUE;
                messageObject2.generateLayout(null);
                messageObject2.notime = true;
                z1Var.L0.q(org.telegram.messenger.y3.m(messageObject2));
                z1Var.v0.setScaleX(1.0f);
                z1Var.v0.setScaleY(1.0f);
                lg r10 = z1Var.L0.r(z1Var.v0, true, new g1(z1Var, 10));
                if (r10 != null) {
                    r10.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), z1Var.getThemedColor(k6.Oh))));
                    ti0 ti0Var3 = z1Var.L0;
                    int dp = AndroidUtilities.dp(44.0f);
                    ti0Var3.j0 = true;
                    ti0Var3.V = dp;
                }
                q70 H = q70.H(z1Var, z1Var.v0);
                boolean isUserSelf = UserObject.isUserSelf(z1Var.G.i());
                if (z1Var.G.D6()) {
                    H.c(R.drawable.msg_calendar2, LocaleController.getString(isUserSelf ? R.string.SetReminder : R.string.ScheduleMessage), new d(z1Var, a2, 1), false);
                    if (!isUserSelf && a2 > 0) {
                        H.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new f1(z1Var, 5), false);
                    }
                }
                if (!isUserSelf) {
                    H.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new f1(z1Var, 6), false);
                }
                H.Y();
                z1Var.L0.p(H);
                z1Var.L0.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void X(z1 z1Var, MessageObject messageObject, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, long j10, MessageObject messageObject2, MessageObject messageObject3, boolean z4, int i10, int i11, SendMessageChatArguments sendMessageChatArguments, long j11) {
        if (messageObject != null) {
            SendMessagesHelper.prepareEditingArticle(AccountInstance.getInstance(z1Var.currentAccount), messageObject, arrayList, arrayList2, arrayList3, arrayList4, false, z1Var.G);
        } else {
            SendMessagesHelper.prepareSendingArticle(AccountInstance.getInstance(z1Var.currentAccount), arrayList, arrayList2, arrayList3, arrayList4, false, j10, messageObject2, messageObject3, z4, i10, i11, sendMessageChatArguments, 0L, j11, 0L);
        }
    }

    public static void Y(final z1 z1Var, Context context, View view) {
        q70 q70Var;
        boolean z4;
        q70 q70Var2 = z1Var.u0;
        if (q70Var2 != null) {
            q70Var2.u();
            z1Var.u0 = null;
        }
        boolean z10 = (MessagesController.getInstance(z1Var.currentAccount).richEditorAllowed() || UserConfig.getInstance(z1Var.currentAccount).isPremium()) ? false : true;
        final a Q2 = z1Var.M.Q2();
        final q70 I = q70.I(z1Var, view);
        I.Q = true;
        q70 J = I.J();
        J.c(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new lh.g3(I, 8), false);
        J.k();
        final int i10 = 0;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading1), R.drawable.iv_h1, null, LocaleController.getString(R.string.ArticleHeading1), new Runnable(z1Var) { // from class: wh.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 2);
        final int i11 = 1;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading2), R.drawable.iv_h2, null, LocaleController.getString(R.string.ArticleHeading2), new Runnable(z1Var) { // from class: wh.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize + 1);
        final int i12 = 2;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading3), R.drawable.iv_h3, null, LocaleController.getString(R.string.ArticleHeading3), new Runnable(z1Var) { // from class: wh.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize);
        final int i13 = 3;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading4), R.drawable.iv_h4, null, LocaleController.getString(R.string.ArticleHeading4), new Runnable(z1Var) { // from class: wh.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 1);
        final int i14 = 4;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading5), R.drawable.iv_h5, null, LocaleController.getString(R.string.ArticleHeading5), new Runnable(z1Var) { // from class: wh.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 2);
        final int i15 = 5;
        J.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockHeading6), R.drawable.iv_h6, null, LocaleController.getString(R.string.ArticleHeading6), new Runnable(z1Var) { // from class: wh.k1
            public final /* synthetic */ z1 b;

            {
                this.b = z1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading1());
                        I.u();
                        break;
                    case 1:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading2());
                        I.u();
                        break;
                    case 2:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading3());
                        I.u();
                        break;
                    case 3:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading4());
                        I.u();
                        break;
                    case 4:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading5());
                        I.u();
                        break;
                    default:
                        this.b.M.V4(Q2, new TL_iv.pageBlockHeading6());
                        I.u();
                        break;
                }
            }
        });
        J.y().a.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
        J.y().a.setTextSize(1, SharedConfig.fontSize - 3);
        if (Q2 == null || !r3.C3(Q2.b)) {
            q70Var = J;
            z4 = false;
        } else {
            q70Var = J;
            z4 = true;
        }
        x1 x1Var = new x1(context, R.drawable.iv_h);
        x1Var.a(z10);
        int i16 = k6.G8;
        x1Var.d = i16;
        I.j(z4, 0, x1Var, LocaleController.getString(R.string.ArticleHeading), new lh.y2(I, q70Var, 11));
        I.y().a.setTypeface(AndroidUtilities.bold());
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockParagraph), R.drawable.iv_text2, null, LocaleController.getString(R.string.ArticleText), new j1(z1Var, Q2, 3));
        I.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockBlockquote), R.drawable.iv_quote, null, LocaleController.getString(R.string.ArticleQuote), new j1(z1Var, Q2, 4));
        boolean z11 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockPullquote);
        x1 x1Var2 = new x1(context, R.drawable.iv_pullquote);
        x1Var2.a(z10);
        x1Var2.d = i16;
        I.j(z11, 0, x1Var2, LocaleController.getString(R.string.ArticlePullquote), new j1(z1Var, Q2, 0));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.j(Q2 != null && (Q2.b instanceof TL_iv.pageBlockPreformatted), R.drawable.iv_code, null, LocaleController.getString(R.string.ArticleCode), new j1(z1Var, Q2, 1));
        boolean z12 = Q2 != null && (Q2.b instanceof TL_iv.pageBlockFooter);
        x1 x1Var3 = new x1(context, R.drawable.iv_footer);
        x1Var3.a(z10);
        x1Var3.d = i16;
        I.j(z12, 0, x1Var3, LocaleController.getString(R.string.ArticleFooter), new j1(z1Var, Q2, 2));
        I.y().setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 9.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 9.0f : 18.0f), 0);
        I.Z();
        z1Var.u0 = I;
    }

    public static void Z(z1 z1Var, boolean z4, boolean z10) {
        if (z1Var.G0 == z4 && z10) {
            return;
        }
        z1Var.G0 = z4;
        float f10 = z4 ? 1.15f : 1.0f;
        if (z10) {
            z1Var.t0.animate().scaleX(f10).scaleY(f10).setDuration(180L).setInterpolator(pr.h).start();
        } else {
            z1Var.t0.animate().cancel();
            z1Var.t0.setScaleX(f10);
            z1Var.t0.setScaleY(f10);
        }
        z1Var.t0.setColorFilter(new PorterDuffColorFilter(z1Var.getThemedColor(z4 ? k6.q7 : k6.G6), PorterDuff.Mode.SRC_IN));
        ij0 animatedDrawable = z1Var.t0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            if (z4) {
                if (animatedDrawable.Y > 34) {
                    animatedDrawable.L(0, false, false);
                }
                animatedDrawable.N(33);
            } else {
                animatedDrawable.N(0);
            }
            animatedDrawable.start();
        }
    }

    public static e1 a0(z1 z1Var) {
        e1 focusedEditTextOrNull = z1Var.M.getFocusedEditTextOrNull();
        if (focusedEditTextOrNull == null) {
            e1 e1Var = z1Var.O0;
            return e1Var != null ? e1Var : z1Var.M.P2();
        }
        z1Var.O0 = focusedEditTextOrNull;
        z1Var.P0 = Math.max(0, focusedEditTextOrNull.getSelectionEnd());
        return focusedEditTextOrNull;
    }

    public static int b0(z1 z1Var, e1 e1Var) {
        return (e1Var != z1Var.O0 || z1Var.M.getFocusedEditTextOrNull() == e1Var) ? Math.max(0, e1Var.getSelectionEnd()) : Math.min(z1Var.P0, e1Var.length());
    }

    public static String g0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.AccDescrIVTextStyle);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.AccDescrIVListStyle);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.AccDescrIVTable);
        }
        if (i10 == 7) {
            return LocaleController.getString(R.string.AccDescrIVFormula);
        }
        if (i10 != 9) {
            return null;
        }
        return LocaleController.getString(R.string.AccDescrIVDetails);
    }

    public static String i0(int i10) {
        if (i10 == 1) {
            return LocaleController.getString(R.string.Bold);
        }
        if (i10 == 2) {
            return LocaleController.getString(R.string.Italic);
        }
        if (i10 == 16) {
            return LocaleController.getString(R.string.Underline);
        }
        if (i10 == 8) {
            return LocaleController.getString(R.string.Strike);
        }
        if (i10 == 256) {
            return LocaleController.getString(R.string.Spoiler);
        }
        if (i10 == 4) {
            return LocaleController.getString(R.string.Mono);
        }
        if (i10 == 65536) {
            return LocaleController.getString(R.string.Highlight);
        }
        if (i10 == 16384) {
            return LocaleController.getString(R.string.Subscript);
        }
        if (i10 == 32768) {
            return LocaleController.getString(R.string.Superscript);
        }
        return null;
    }

    public static void p0(Context context, final Runnable runnable, final Runnable runnable2, g6 g6Var) {
        final int i10 = 0;
        final org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        o10.customView = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.large_article);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setBackground(k6.K(AndroidUtilities.dp(80.0f), k6.v0(k6.Oh, g6Var)));
        linearLayout.addView(imageView, c6.t(80, 80, 1, 0, 18, 0, 0));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.ArticleConversionTitle));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i11 = k6.G6;
        textView.setTextColor(k6.v0(i11, g6Var));
        TextView i12 = yh.i(linearLayout, textView, c6.t(-1, -2, 49, 25, 16, 25, 0), context);
        i12.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ArticleConversionText)));
        i12.setTextSize(1, 14.0f);
        i12.setGravity(17);
        i12.setTextColor(k6.v0(i11, g6Var));
        linearLayout.addView(i12, c6.t(-1, -2, 49, 25, 11, 25, 0));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        p10.setText(LocaleController.getString(R.string.ArticleConversionSubscribe));
        linearLayout.addView(p10, c6.t(-1, 48, 49, 14, 31, 14, 0));
        qh.d p11 = org.telegram.messenger.y3.p(24, context, g6Var, false);
        p11.setText(LocaleController.getString(R.string.ArticleConversionConvert));
        linearLayout.addView(p11, c6.t(-1, 48, 49, 14, 2, 14, 6));
        o10.show();
        p10.setOnClickListener(new View.OnClickListener() { // from class: wh.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o10.dismiss();
                        runnable2.run();
                        break;
                    default:
                        o10.dismiss();
                        runnable2.run();
                        break;
                }
            }
        });
        final int i13 = 1;
        p11.setOnClickListener(new View.OnClickListener() { // from class: wh.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        o10.dismiss();
                        runnable.run();
                        break;
                    default:
                        o10.dismiss();
                        runnable.run();
                        break;
                }
            }
        });
    }

    public final void A0() {
        int i10 = 0;
        boolean z4 = (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) ? false : true;
        ArrayList arrayList = this.K;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u1) obj).setPremiumLocked(z4);
        }
    }

    public final void B0() {
        if (this.v0 == null) {
            return;
        }
        boolean M3 = this.M.M3();
        this.v0.setEnabled(M3);
        this.v0.animate().alpha(M3 ? 1.0f : 0.5f).setDuration(150L).start();
    }

    public final void C0() {
        rp0 rp0Var = this.v0;
        if (rp0Var == null) {
            return;
        }
        rp0Var.setLocked(m0());
    }

    public final u1 c0(int i10, int i11, boolean z4) {
        u1 u1Var = new u1(this.b0.getContext(), i10, getResourceProvider());
        if (z4) {
            u1Var.d();
            this.K.add(u1Var);
        }
        u1Var.setTag(Integer.valueOf(i11));
        u1Var.setContentDescription(g0(i11));
        this.c0.add(u1Var);
        LinearLayout linearLayout = this.b0;
        linearLayout.addView(u1Var, c6.t(38, 38, 16, linearLayout.getChildCount() == 0 ? 0 : 2, 0, 0, 0));
        return u1Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        ArrayList arrayList = this.K;
        arrayList.clear();
        this.L = new r1(this, context);
        setHasOwnBackground(true);
        this.L.setFocusable(true);
        this.L.setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            this.L.setDefaultFocusHighlightEnabled(false);
        }
        this.B0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
        this.C0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
        sh.s1 s1Var = new sh.s1(this, 1);
        this.E0 = s1Var;
        this.L.r.add(s1Var);
        r3 r3Var = new r3(context, this.currentAccount, getResourceProvider(), new org.telegram.ui.Cells.f1(this, 27));
        this.M = r3Var;
        r3Var.setFileRefParentObject(this.r);
        this.L.addView(this.M, c6.e(-1, -1, 119));
        this.L.addView(this.M.getOverlayView(), c6.c(-1.0f, -1));
        TL_iv.RichMessage richMessage = this.b;
        if (richMessage != null) {
            r3 r3Var2 = this.M;
            ArrayList arrayList2 = r3Var2.i3;
            r3Var2.h3 = richMessage;
            r3.W2(arrayList2, richMessage.blocks, r3Var2.j3);
            r3Var2.V3();
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                r3Var2.v4((a) arrayList2.get(i10));
            }
            r3Var2.V2.N(false);
        } else {
            String str = this.f;
            if (str != null) {
                r3 r3Var3 = this.M;
                CharSequence charSequence = this.h;
                CharSequence charSequence2 = this.n;
                HashMap hashMap = r3Var3.j3;
                ArrayList arrayList3 = r3Var3.i3;
                if (!TextUtils.isEmpty(charSequence)) {
                    r3.W2(arrayList3, w4.b(charSequence), hashMap);
                }
                arrayList3.addAll(r3Var3.w4(x3.z(str, hashMap)));
                if (!TextUtils.isEmpty(charSequence2)) {
                    r3.W2(arrayList3, w4.b(charSequence2), hashMap);
                }
                r3Var3.V3();
                r3Var3.V2.N(false);
            } else {
                CharSequence charSequence3 = this.a;
                if (charSequence3 != null) {
                    this.M.setInitialText(charSequence3);
                }
            }
        }
        d2 d2Var = this.M.G3;
        if (d2Var != null) {
            d2Var.j();
        }
        View view = new View(context);
        this.N = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i11 = k6.d6;
        view.setBackground(new GradientDrawable(orientation, new int[]{getThemedColor(i11), k6.l1(0.0f, getThemedColor(i11))}));
        this.L.addView(this.N, c6.e(-1, 68, 55));
        View view2 = new View(context);
        this.O = view2;
        view2.setBackground(new GradientDrawable(orientation, new int[]{k6.l1(0.0f, getThemedColor(i11)), getThemedColor(i11)}));
        this.L.addView(this.O, c6.e(-1, 68, 87));
        FrameLayout frameLayout = new FrameLayout(context);
        this.P = frameLayout;
        frameLayout.setClipChildren(false);
        this.P.setClipToPadding(false);
        this.L.addView(this.P, c6.e(-1, 68, 55));
        ImageView imageView = new ImageView(context);
        this.Q = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView2 = this.Q;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.Q;
        int themedColor = getThemedColor(i11);
        int themedColor2 = getThemedColor(i11);
        int i12 = k6.i6;
        imageView3.setBackground(new y1(k6.Z(themedColor, k6.v(themedColor2, getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        ImageView imageView4 = this.Q;
        int i13 = k6.G6;
        int themedColor3 = getThemedColor(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView4.setColorFilter(new PorterDuffColorFilter(themedColor3, mode));
        e6.a(this.Q);
        this.Q.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        this.Q.setOnClickListener(new g1(this, 1));
        this.P.addView(this.Q, c6.d(44, 44.0f, 51, 8.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.R = linearLayout;
        linearLayout.setOrientation(0);
        this.R.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.P.addView(this.R, c6.d(82, 44.0f, 53, 8.0f, 8.0f, 8.0f, 8.0f));
        ImageView imageView5 = new ImageView(context);
        this.S = imageView5;
        imageView5.setImageResource(R.drawable.iv_undo);
        this.S.setScaleType(scaleType);
        this.S.setBackground(k6.f0(getThemedColor(i12), 1, -1));
        this.S.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        e6.a(this.S);
        this.S.setContentDescription(LocaleController.getString(R.string.Undo));
        this.S.setOnClickListener(new g1(this, 2));
        this.R.addView(this.S, c6.q(41, 41, 16));
        ImageView imageView6 = new ImageView(context);
        this.T = imageView6;
        imageView6.setImageResource(R.drawable.iv_redo);
        this.T.setScaleType(scaleType);
        this.T.setBackground(k6.f0(getThemedColor(i12), 1, -1));
        this.T.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        e6.a(this.T);
        this.T.setContentDescription(LocaleController.getString(R.string.Redo));
        this.T.setOnClickListener(new g1(this, 3));
        this.R.addView(this.T, c6.q(41, 41, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        frameLayout2.setClipChildren(false);
        this.V.setClipToPadding(false);
        this.L.addView(this.V, c6.e(-1, 160, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.W = frameLayout3;
        frameLayout3.setClipChildren(false);
        this.W.setClipToPadding(false);
        this.V.addView(this.W, c6.e(-1, 160, 87));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.X = linearLayout2;
        linearLayout2.setClipToPadding(false);
        this.X.setClipChildren(false);
        this.X.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.W.addView(this.X, c6.e(-1, 60, 87));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.U = frameLayout4;
        this.W.addView(frameLayout4, c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        ImageView imageView7 = new ImageView(context);
        this.Z = imageView7;
        imageView7.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.Z.setScaleType(scaleType);
        this.Z.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.Z.setBackground(new y1(k6.Z(getThemedColor(i11), k6.v(getThemedColor(i11), getThemedColor(i12)), AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f))));
        this.X.addView(this.Z, c6.p(44, 44, 0.0f, 19, 0, 0, 8, 0));
        e6.a(this.Z);
        this.Z.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.Z.setOnClickListener(new g1(this, 4));
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setClipChildren(false);
        FrameLayout frameLayout6 = new FrameLayout(context);
        frameLayout6.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        frameLayout5.addView(frameLayout6, c6.e(-2, 44, 81));
        s1 s1Var2 = new s1(context, 0);
        this.a0 = s1Var2;
        s1Var2.setClipToOutline(true);
        this.a0.setOutlineProvider(new hg.j1(19));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.b0 = linearLayout3;
        linearLayout3.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.b0.setOrientation(0);
        this.a0.addView(this.b0);
        frameLayout6.addView(this.a0, c6.c(-1.0f, -1));
        qg qgVar = new qg(context, 24);
        this.Y = qgVar;
        qgVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        this.Y.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.Y.setBackground(k6.Z(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.Y.j(og.e, false);
        this.b0.addView(this.Y, c6.q(38, 38, 16));
        e6.a(this.Y);
        this.Y.setContentDescription(LocaleController.getString(R.string.AccDescrEmojiButton));
        this.Y.setOnClickListener(new g1(this, 5));
        c0(R.drawable.iv_text, 1, false).setOnClickListener(new r8(7, this, context));
        c0(R.drawable.iv_lists, 2, true).setOnClickListener(new g1(this, 6));
        c0(R.drawable.iv_table, 4, true).setOnClickListener(new g1(this, 7));
        c0(R.drawable.iv_math, 7, true).setOnClickListener(new g1(this, 8));
        ImageView imageView8 = new ImageView(context);
        this.d0 = imageView8;
        imageView8.setImageResource(R.drawable.outline_poll_attach_24);
        this.d0.setScaleType(scaleType);
        this.d0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.d0.setBackground(k6.Z(getThemedColor(i11), getThemedColor(i12), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f)));
        this.b0.addView(this.d0, c6.t(38, 38, 16, 2, 0, 0, 0));
        e6.a(this.d0);
        this.d0.setContentDescription(LocaleController.getString(R.string.AccDescrAttachButton));
        this.d0.setOnClickListener(new g1(this, 9));
        this.X.addView(frameLayout5, c6.l(1.0f, 0, 44));
        ib1 ib1Var = new ib1(this, context, 19);
        this.e0 = ib1Var;
        ib1Var.setOrientation(0);
        this.e0.setClipToPadding(false);
        this.e0.setClipChildren(false);
        this.e0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.e0, c6.e(-2, 60, 81));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.s0 = frameLayout7;
        frameLayout7.setClipChildren(false);
        this.s0.setClipToPadding(false);
        this.s0.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.V.addView(this.s0, c6.e(80, 60, 81));
        lj0 lj0Var = new lj0(context);
        this.t0 = lj0Var;
        lj0Var.f(R.raw.group_pip_delete_icon, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), null);
        ij0 animatedDrawable = this.t0.getAnimatedDrawable();
        if (animatedDrawable != null) {
            animatedDrawable.h = true;
            animatedDrawable.I(0);
            animatedDrawable.N(0);
        }
        this.t0.setScaleType(scaleType);
        this.t0.setColorFilter(new PorterDuffColorFilter(getThemedColor(i13), mode));
        this.t0.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.s0.addView(this.t0, c6.e(-1, -1, 119));
        FrameLayout frameLayout8 = new FrameLayout(context);
        frameLayout8.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.e0.addView(frameLayout8, c6.c(44.0f, -2));
        t1 t1Var = new t1(this, context);
        this.g0 = t1Var;
        t1Var.setHorizontalScrollBarEnabled(false);
        this.g0.setClipToOutline(true);
        this.g0.setOutlineProvider(new hg.j1(20));
        frameLayout8.addView(this.g0, c6.c(-1.0f, -1));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.f0 = linearLayout4;
        linearLayout4.setOrientation(0);
        this.f0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.g0.addView(this.f0, new FrameLayout.LayoutParams(-2, -1));
        d0(context, R.drawable.formatting_bold, 1, false);
        d0(context, R.drawable.formatting_italic, 2, false);
        d0(context, R.drawable.formatting_underline, 16, false);
        d0(context, R.drawable.formatting_strikethrough, 8, false);
        d0(context, R.drawable.formatting_spoiler, 256, false);
        d0(context, R.drawable.iv_code, 4, false);
        d0(context, R.drawable.formatting_marked, 65536, true);
        d0(context, R.drawable.iv_sub, 16384, true);
        d0(context, R.drawable.iv_super, 32768, true);
        u1 u1Var = new u1(context, R.drawable.iv_quote, getResourceProvider());
        this.r0 = u1Var;
        u1Var.setContentDescription(LocaleController.getString(R.string.Quote));
        this.r0.setOnClickListener(new g1(this, 11));
        LinearLayout linearLayout5 = this.f0;
        linearLayout5.addView(this.r0, c6.t(38, 38, 16, linearLayout5.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        u1 u1Var2 = new u1(context, R.drawable.iv_button, getResourceProvider());
        this.o0 = u1Var2;
        u1Var2.setContentDescription(LocaleController.getString(R.string.RichEditorButton));
        this.o0.setOnClickListener(new g1(this, 12));
        LinearLayout linearLayout6 = this.f0;
        linearLayout6.addView(this.o0, c6.t(38, 38, 16, linearLayout6.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
        LinearLayout linearLayout7 = new LinearLayout(context);
        this.k0 = linearLayout7;
        linearLayout7.setOrientation(0);
        this.k0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.k0.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.e0.addView(this.k0, c6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        u1 u1Var3 = new u1(context, R.drawable.media_link_24, getResourceProvider());
        this.n0 = u1Var3;
        u1Var3.setContentDescription(LocaleController.getString(R.string.CreateLink));
        this.n0.setOnClickListener(new g1(this, 13));
        this.k0.addView(this.n0, c6.q(38, 38, 16));
        u1 u1Var4 = new u1(context, R.drawable.msg_calendar2, getResourceProvider());
        this.p0 = u1Var4;
        u1Var4.setContentDescription(LocaleController.getString(R.string.AccDescrIVInsertDate));
        this.p0.setOnClickListener(new g1(this, 14));
        this.k0.addView(this.p0, c6.q(38, 38, 16));
        LinearLayout linearLayout8 = new LinearLayout(context);
        this.l0 = linearLayout8;
        linearLayout8.setOrientation(0);
        this.l0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.l0.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.e0.addView(this.l0, c6.d(-2, 44.0f, 80, 8.0f, 0.0f, 0.0f, 0.0f));
        u1 u1Var5 = new u1(context, R.drawable.iv_math, getResourceProvider());
        this.q0 = u1Var5;
        u1Var5.d();
        arrayList.add(this.q0);
        this.q0.setContentDescription(LocaleController.getString(R.string.AccDescrIVFormula));
        this.q0.setOnClickListener(new g1(this, 15));
        this.l0.addView(this.q0, c6.q(38, 38, 16));
        LinearLayout linearLayout9 = new LinearLayout(context);
        this.j0 = linearLayout9;
        linearLayout9.setOrientation(0);
        this.j0.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        this.j0.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(i11))));
        this.e0.addView(this.j0, 0, c6.d(-2, 44.0f, 80, 0.0f, 0.0f, 8.0f, 0.0f));
        u1 u1Var6 = new u1(context, 0, getResourceProvider());
        this.m0 = u1Var6;
        u1Var6.setImageDrawable(new org.telegram.ui.Components.j0(context));
        this.m0.setContentDescription(LocaleController.getString(R.string.AIEditor));
        this.m0.setOnClickListener(new g1(this, 16));
        this.j0.addView(this.m0, c6.q(38, 38, 16));
        rp0 rp0Var = new rp0((Object) this, context, this.r != null ? R.drawable.input_done : l0() ? R.drawable.input_schedule : R.drawable.send_plane_24, getResourceProvider(), 3);
        this.v0 = rp0Var;
        rp0Var.setBackground(new y1(k6.b0(AndroidUtilities.dp(22.0f), getThemedColor(k6.Yd))));
        e6.a(this.v0);
        this.X.addView(this.v0, c6.p(44, 44, 0.0f, 5, 8, 0, 0, 0));
        this.v0.setContentDescription(LocaleController.getString(R.string.Send));
        this.v0.setOnClickListener(new g1(this, 0));
        this.v0.setOnLongClickListener(new eg.d0(this, 4));
        C0();
        this.L.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        h0();
        x0(0, false);
        z0();
        this.L.getViewTreeObserver().addOnGlobalFocusChangeListener(new i(this, 1));
        A0();
        if (this.e) {
            this.M.C2();
            this.e = false;
        }
        r1 r1Var = this.L;
        this.fragmentView = r1Var;
        return r1Var;
    }

    public final void d0(Context context, int i10, int i11, boolean z4) {
        u1 u1Var = new u1(context, i10, getResourceProvider());
        if (z4) {
            u1Var.d();
            this.K.add(u1Var);
        }
        u1Var.setTag(Integer.valueOf(i11));
        u1Var.setContentDescription(i0(i11));
        u1Var.setOnClickListener(new mh.x0(this, i11, 25));
        this.i0.add(u1Var);
        LinearLayout linearLayout = this.f0;
        linearLayout.addView(u1Var, c6.t(38, 38, 16, linearLayout.getChildCount() > 0 ? 2 : 0, 0, 0, 0));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            C0();
            A0();
        }
    }

    public final void e0(boolean z4) {
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.M0 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N0, z4 ? 1.0f : 0.0f);
        this.M0 = ofFloat;
        ofFloat.addUpdateListener(new h1(this, 0));
        this.M0.setInterpolator(pr.h);
        this.M0.setDuration(250L);
        this.M0.start();
    }

    public final void f0() {
        FrameLayout.LayoutParams layoutParams;
        mz mzVar = this.x0;
        if (mzVar == null || (layoutParams = (FrameLayout.LayoutParams) mzVar.getLayoutParams()) == null) {
            return;
        }
        int round = Math.round((((this.L == null ? j0() : Math.max(j0(), ((r2.getMeasuredHeight() - this.L.getPaddingTop()) - AndroidUtilities.dp(240.0f)) - this.Q0)) - r1) * this.N0) + j0());
        if (layoutParams.height != round) {
            layoutParams.height = round;
            this.x0.setLayoutParams(layoutParams);
        }
    }

    public final void h0() {
        FrameLayout.LayoutParams layoutParams;
        mz mzVar = this.x0;
        if (mzVar != null && (layoutParams = (FrameLayout.LayoutParams) mzVar.getLayoutParams()) != null) {
            int i10 = layoutParams.bottomMargin;
            int i11 = this.Q0;
            if (i10 != i11) {
                layoutParams.bottomMargin = i11;
                this.x0.setLayoutParams(layoutParams);
            }
        }
        f0();
        int max = Math.max(Math.max(this.A0, this.Q0), this.R0);
        this.M.setPadding(0, AndroidUtilities.dp(60.0f), 0, AndroidUtilities.dp(110.0f) + max);
        r3 r3Var = this.M;
        int i12 = this.Q0;
        int i13 = this.R0;
        int i14 = this.A0;
        r3Var.L3 = i12;
        r3Var.M3 = i13;
        r3Var.N3 = i14;
        this.V.setTranslationY(-max);
        this.O.setTranslationY(r0 + this.Q0);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        r3 r3Var = this.M;
        if (r3Var == null || !r3Var.k3.y()) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    public final int j0() {
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x > point.y ? this.C0 : this.B0;
        return i10 <= 0 ? AndroidUtilities.dp(200.0f) : i10;
    }

    public final void k0(boolean z4) {
        if (this.z0) {
            this.z0 = false;
            mz mzVar = this.x0;
            if (mzVar != null) {
                mzVar.t(false);
                this.x0.B();
            }
        }
        ValueAnimator valueAnimator = this.M0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.M0 = null;
        }
        this.N0 = 0.0f;
        this.O0 = null;
        mz mzVar2 = this.x0;
        if (mzVar2 != null) {
            mzVar2.setTranslationY(0.0f);
            this.x0.setVisibility(8);
        }
        if (this.y0 || this.A0 != 0) {
            this.y0 = false;
            this.A0 = 0;
            h0();
        }
        qg qgVar = this.Y;
        if (qgVar != null) {
            qgVar.j(og.e, z4);
        }
    }

    public final boolean l0() {
        xn xnVar;
        return this.r == null && (xnVar = this.G) != null && xnVar.c();
    }

    public final boolean m0() {
        if (MessagesController.getInstance(this.currentAccount).richEditorAllowed() || UserConfig.getInstance(this.currentAccount).isPremium()) {
            return false;
        }
        r3 r3Var = this.M;
        return w4.f(r3Var.i3, r3Var.j3);
    }

    public final void n0() {
        i3 h22 = this.M.h2();
        if (h22 == null) {
            return;
        }
        TL_iv.RichMessage a2 = h22.a();
        if (a2.blocks.isEmpty()) {
            return;
        }
        org.telegram.ui.Components.f0 f0Var = new org.telegram.ui.Components.f0(getParentActivity(), getResourceProvider());
        f0Var.n0(a2);
        f0Var.h0 = new org.telegram.ui.web.d1(h22, 23);
        f0Var.show();
    }

    public final void o0(int i10, int i11) {
        r3 r3Var = this.M;
        r3Var.Z3 = r3Var.Q2();
        mi miVar = new mi(getParentActivity(), this, false, false, true, getResourceProvider());
        miVar.W1 = new o1(this, miVar);
        miVar.g0.setIncludeVideosInGallery(true);
        miVar.g0.f0();
        miVar.J1(1, true);
        miVar.h1(i10);
        miVar.q2 = new n1(this, miVar);
        miVar.V = new n1(this, miVar);
        miVar.U = new p1(this, miVar);
        miVar.r1();
        if (i11 != 0) {
            miVar.A1(i11);
        }
        miVar.setFocusable(true);
        miVar.show();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        if (i11 != -1 || i10 != 21) {
            if (i11 != -1 || (i10 != 1 && i10 != 14)) {
                super.onActivityResultFragment(i10, i11, intent);
                return;
            } else {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                this.M.e2(intent.getData());
                return;
            }
        }
        if (intent == null || intent.getData() == null) {
            return;
        }
        r3 r3Var = this.M;
        Uri data = intent.getData();
        if (data == null) {
            r3Var.getClass();
        } else {
            if (r3Var.getContext() == null) {
                return;
            }
            Utilities.globalQueue.postRunnable(new vf.d0(8, r3Var, data));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        boolean z10 = this.z0;
        if (z10) {
            if (z10) {
                this.z0 = false;
                mz mzVar = this.x0;
                if (mzVar != null) {
                    mzVar.t(false);
                    this.x0.B();
                }
                e0(false);
                return false;
            }
        } else {
            if (this.y0) {
                k0(true);
                return false;
            }
            if (!this.M.F2()) {
                return super.onBackPressed(z4);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        int i10 = 1;
        if (!z4 && !this.S0) {
            q0();
            this.S0 = true;
        }
        if (AndroidUtilities.isTablet() || this.s == null || this.v == null) {
            return super.onCustomTransitionAnimation(z4, runnable);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        vg.f fVar = this.s;
        this.x = fVar.f;
        fVar.e = false;
        fVar.invalidate();
        this.v.setAlpha(0.0f);
        int i11 = 4;
        this.v.w1.setVisibility(4);
        v0();
        float f10 = z4 ? 0.0f : 1.0f;
        this.F = f10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
        this.B = true;
        this.L.invalidate();
        ofFloat.addUpdateListener(new h1(this, i10));
        ofFloat.addListener(new fx0(22, this, runnable));
        if (z4) {
            FrameLayout frameLayout = this.P;
            Property property = View.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
            FrameLayout frameLayout2 = this.P;
            Property property2 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property2, -AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.W, (Property<FrameLayout, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.W, (Property<FrameLayout, Float>) property2, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.M, (Property<r3, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.N, (Property<View, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.O, (Property<View, Float>) property, 0.0f, 1.0f));
        } else {
            FrameLayout frameLayout3 = this.P;
            Property property3 = View.ALPHA;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property3, 0.0f);
            FrameLayout frameLayout4 = this.P;
            Property property4 = View.TRANSLATION_Y;
            animatorSet.playTogether(ofFloat, ofFloat3, ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property4, -AndroidUtilities.dp(16.0f)), ObjectAnimator.ofFloat(this.W, (Property<FrameLayout, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.W, (Property<FrameLayout, Float>) property4, AndroidUtilities.dp(16.0f), 0.0f), ObjectAnimator.ofFloat(this.M, (Property<r3, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.N, (Property<View, Float>) property3, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.O, (Property<View, Float>) property3, 1.0f, 0.0f));
        }
        animatorSet.setDuration(420L);
        animatorSet.setInterpolator(pr.h);
        this.L.post(new tt0(animatorSet, i11));
        return animatorSet;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        sh.s1 s1Var;
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        if (!this.S0) {
            q0();
            this.S0 = true;
        }
        l1 l1Var = this.K0;
        if (l1Var != null) {
            this.K0 = null;
            AndroidUtilities.runOnUIThread(l1Var);
        }
        ti0 ti0Var = this.L0;
        if (ti0Var != null) {
            ti0Var.i();
            this.L0 = null;
        }
        r3 r3Var = this.M;
        if (r3Var != null) {
            r3Var.G2();
        }
        m.r3 r3Var2 = this.w0;
        if (r3Var2 != null) {
            r3Var2.c();
        }
        super.onFragmentDestroy();
        mz mzVar = this.x0;
        if (mzVar != null) {
            mzVar.D();
        }
        r1 r1Var = this.L;
        if (r1Var == null || (s1Var = this.E0) == null) {
            return;
        }
        r1Var.r.remove(s1Var);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.Q0 = i13;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(68.0f) + this.Q0;
        this.O.setLayoutParams(layoutParams);
        h0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final r0.m1 onInsetsInternal(View view, r0.m1 m1Var) {
        q70 q70Var;
        i0.b f10 = m1Var.a.f(3);
        int i10 = m1Var.a.f(8).d;
        this.R0 = i10;
        int i11 = i10 - f10.d;
        boolean z4 = this.D0;
        boolean z10 = i11 > AndroidUtilities.dp(20.0f);
        this.D0 = z10;
        if (z10 && i11 > AndroidUtilities.dp(50.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                this.C0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.C0).commit();
            } else {
                this.B0 = i11;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.B0).commit();
            }
        }
        if (this.D0 && !z4 && this.y0 && !this.z0) {
            k0(false);
        }
        if (!this.D0 && z4 && (q70Var = this.u0) != null) {
            q70Var.u();
            this.u0 = null;
        }
        onInsets(f10.a, f10.b, f10.c, f10.d);
        return r0.m1.b;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        r3 r3Var;
        int i10;
        r3 r3Var2;
        super.onTransitionAnimationStart(z4, z10);
        if (z4 && !z10 && (i10 = this.c) >= 0 && (r3Var2 = this.M) != null) {
            int i11 = this.d;
            this.d = -1;
            this.c = -1;
            if (r3Var2.Y1(i10, i11)) {
                return;
            }
            r3Var2.post(new l2(r3Var2, i10, i11, 0));
            return;
        }
        if (!z4 || z10) {
            return;
        }
        if ((this.b == null && this.f == null) || (r3Var = this.M) == null || r3Var.a3()) {
            return;
        }
        r3Var.post(new b(r3Var, 5));
    }

    public final boolean q0() {
        Runnable runnable;
        if (this.G == null || this.r != null || !this.M.r2()) {
            return false;
        }
        TL_iv.RichMessage j22 = this.J ? null : this.M.j2();
        if (j22 == null && (runnable = this.I) != null) {
            runnable.run();
        }
        jk jkVar = this.G.V;
        if (j22 != null && !this.J) {
            r3 r3Var = this.M;
            if (r3Var.k3() && !w4.f(r3Var.i3, r3Var.j3) && jkVar != null) {
                SpannableStringBuilder k10 = w4.k(this.M.i3);
                xn xnVar = jkVar.L2;
                if (jkVar.B0 == null) {
                    return true;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k10);
                Emoji.replaceEmoji((CharSequence) spannableStringBuilder, jkVar.B0.getPaint().getFontMetricsInt(), false, (int[]) null);
                org.telegram.ui.Components.u5[] u5VarArr = (org.telegram.ui.Components.u5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.u5.class);
                if (u5VarArr != null) {
                    for (org.telegram.ui.Components.u5 u5Var : u5VarArr) {
                        u5Var.applyFontMetrics(jkVar.B0.getPaint().getFontMetricsInt(), org.telegram.ui.Components.l5.g());
                    }
                }
                bj0.a(spannableStringBuilder);
                if (xnVar != null) {
                    CharSequence[] charSequenceArr = {new SpannableStringBuilder(spannableStringBuilder)};
                    MediaDataController.getInstance(jkVar.N).saveDraft(xnVar.a(), xnVar.B7(xnVar.k5), charSequenceArr[0], MediaDataController.getInstance(jkVar.N).getEntities(charSequenceArr, true, false), null, null, null, 0L, false, false, null);
                }
                jkVar.setRichDraftPreview(null);
                if (jkVar.B0.getText() != null) {
                    jkVar.B0.getText().clear();
                }
                jkVar.setFieldText(spannableStringBuilder);
                return true;
            }
        }
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = this.G.a();
        xn xnVar2 = this.G;
        mediaDataController.saveDraft(a2, xnVar2.B7(xnVar2.k5), "", null, null, null, null, 0L, false, false, j22);
        TL_iv.RichMessage richMessage = j22;
        if (jkVar == null) {
            return true;
        }
        jkVar.setRichDraftPreview(richMessage);
        return true;
    }

    public final void r0() {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            r3 r3Var = this.M;
            Objects.requireNonNull(r3Var);
            p0(parentActivity, new b(r3Var, 0), new f1(this, 4), getResourceProvider());
            return;
        }
        if (l0()) {
            org.telegram.ui.Components.z4.M(getParentActivity(), this.G.a(), new oh.h4(this, 26), getResourceProvider());
        } else {
            s0(0, 0, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [wh.l1] */
    public final void s0(final int i10, final int i11, final boolean z4) {
        if (m0()) {
            Activity parentActivity = getParentActivity();
            r3 r3Var = this.M;
            Objects.requireNonNull(r3Var);
            p0(parentActivity, new b(r3Var, 0), new f1(this, 4), getResourceProvider());
            return;
        }
        if (this.G == null || !this.M.k3() || this.M.m3()) {
            return;
        }
        if (!this.M.M3()) {
            B0();
            return;
        }
        if (!MessagesController.getInstance(this.currentAccount).richEditorAllowed()) {
            jk jkVar = this.G.V;
            if (jkVar == null) {
                return;
            }
            this.J = true;
            Runnable runnable = this.H;
            if (runnable != null) {
                runnable.run();
            }
            jkVar.R0(w4.k(this.M.i3), z4, i10, i11);
            finishFragment();
            return;
        }
        this.J = true;
        final ArrayList Z2 = this.M.Z2();
        if (Z2.isEmpty()) {
            return;
        }
        final ArrayList B2 = this.M.B2();
        final ArrayList y22 = this.M.y2();
        final ArrayList a2 = v4.a(this.currentAccount, Z2);
        final long a10 = this.G.a();
        xn xnVar = this.G;
        final MessageObject messageObject = xnVar.k5;
        final MessageObject messageObject2 = xnVar.U3;
        final long N8 = xnVar.N8();
        final SendMessageChatArguments C8 = this.G.C8();
        final MessageObject messageObject3 = this.r;
        ?? r02 = new Runnable() { // from class: wh.l1
            @Override // java.lang.Runnable
            public final void run() {
                z1.X(z1.this, messageObject3, Z2, B2, y22, a2, a10, messageObject, messageObject2, z4, i10, i11, C8, N8);
            }
        };
        Runnable runnable2 = this.H;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (i10 == 0 || messageObject3 != null) {
            r02.run();
            finishFragment();
        } else {
            this.K0 = r02;
            finishFragment();
        }
    }

    public final void t0(boolean z4) {
        ArrayList arrayList = this.i0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u1 u1Var = (u1) obj;
            if (((Integer) u1Var.getTag()).intValue() == 1) {
                u1Var.setEnabled(z4);
            }
        }
    }

    public final void u0(boolean z4, boolean z10) {
        u1 u1Var = this.n0;
        if (u1Var != null) {
            u1Var.setEnabled(z4);
        }
        u1 u1Var2 = this.o0;
        if (u1Var2 != null) {
            u1Var2.setEnabled(z10);
        }
        u1 u1Var3 = this.p0;
        if (u1Var3 != null) {
            u1Var3.setEnabled(z4);
        }
        u1 u1Var4 = this.q0;
        if (u1Var4 != null) {
            u1Var4.setEnabled(z4);
        }
    }

    public final void v0() {
        this.s.getLocationInWindow(this.C);
        if (this.y == null) {
            this.y = new RectF();
        }
        RectF rectF = new RectF(this.x.getBounds());
        this.y = rectF;
        rectF.offset(r1[0], r1[1]);
        if (this.D == null) {
            this.D = new int[2];
        }
        this.v.getLocationInWindow(this.D);
        if (this.E == null) {
            this.E = new int[2];
        }
        this.E[0] = this.M.getPaddingLeft();
        this.E[1] = this.M.getPaddingTop();
        this.E[0] = (int) (r0[0] - (this.v.B0.getX() - AndroidUtilities.dp(16.0f)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0() {
        a Q2;
        int i10;
        int size;
        int i11;
        m9 textSelectionHelper = this.M.getTextSelectionHelper();
        if (textSelectionHelper == null || !textSelectionHelper.y()) {
            Q2 = this.M.Q2();
        } else {
            int i12 = textSelectionHelper.u0;
            Q2 = i12 == textSelectionHelper.x0 ? this.M.y4(i12) : null;
        }
        if (this.M.R2() == null) {
            if (Q2 != null) {
                if (!Q2.a() && !Q2.b() && !Q2.c()) {
                    TL_iv.PageBlock pageBlock = Q2.b;
                    if (!(pageBlock instanceof TL_iv.pageBlockDetails)) {
                        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
                            if (pageBlock instanceof TL_iv.pageBlockDivider) {
                                i10 = 8;
                            } else if ((pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote) || (pageBlock instanceof TL_iv.pageBlockFooter)) {
                                i10 = 1;
                            } else if ((pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                                i10 = 3;
                            } else if ((pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument)) {
                                i10 = 5;
                            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                                i10 = 6;
                            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                                i10 = 7;
                            }
                            ArrayList arrayList = this.c0;
                            size = arrayList.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                u1 u1Var = (u1) obj;
                                int intValue = ((Integer) u1Var.getTag()).intValue();
                                u1Var.setSelected(i10 == intValue);
                                if (i10 == intValue) {
                                    u1Var.setEnabled(true);
                                    if (Q2 == null) {
                                        u1Var.a();
                                    } else if (i10 == 1) {
                                        TL_iv.PageBlock pageBlock2 = Q2.b;
                                        if (pageBlock2 instanceof TL_iv.pageBlockHeading1) {
                                            u1Var.f(R.drawable.iv_h1);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                                            u1Var.f(R.drawable.iv_h2);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                                            u1Var.f(R.drawable.iv_h3);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                                            u1Var.f(R.drawable.iv_h4);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                                            u1Var.f(R.drawable.iv_h5);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                                            u1Var.f(R.drawable.iv_h6);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
                                            u1Var.f(R.drawable.iv_code);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                                            u1Var.f(R.drawable.iv_quote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockPullquote) {
                                            u1Var.f(R.drawable.iv_pullquote);
                                        } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                                            u1Var.f(R.drawable.iv_footer);
                                        } else {
                                            u1Var.a();
                                        }
                                    } else if (i10 == 2) {
                                        if (Q2.a()) {
                                            u1Var.f(R.drawable.iv_todo);
                                        } else if (Q2.c()) {
                                            u1Var.f(R.drawable.iv_ordered_list);
                                        } else {
                                            u1Var.a();
                                        }
                                    } else if (i10 == 8) {
                                        u1Var.f(R.drawable.iv_details);
                                    } else {
                                        u1Var.a();
                                    }
                                } else {
                                    u1Var.setEnabled(i10 != 4);
                                    u1Var.a();
                                }
                            }
                        }
                    }
                }
                i10 = 2;
                ArrayList arrayList2 = this.c0;
                size = arrayList2.size();
                i11 = 0;
                while (i11 < size) {
                }
            }
            i10 = 0;
            ArrayList arrayList22 = this.c0;
            size = arrayList22.size();
            i11 = 0;
            while (i11 < size) {
            }
        }
        i10 = 4;
        ArrayList arrayList222 = this.c0;
        size = arrayList222.size();
        i11 = 0;
        while (i11 < size) {
        }
    }

    public final void x0(int i10, boolean z4) {
        if (this.H0 == i10) {
            return;
        }
        this.H0 = i10;
        if (z4) {
            this.X.setVisibility(0);
            ViewPropertyAnimator duration = this.X.animate().alpha(this.H0 == 0 ? 1.0f : 0.0f).scaleX(this.H0 == 0 ? 1.0f : 0.8f).scaleY(this.H0 == 0 ? 1.0f : 0.8f).translationY(this.H0 == 0 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new f1(this, 1)).start();
            this.e0.setVisibility(0);
            this.e0.animate().alpha(this.H0 == 1 ? 1.0f : 0.0f).scaleX(this.H0 == 1 ? 1.0f : 0.8f).scaleY(this.H0 == 1 ? 1.0f : 0.8f).translationY(this.H0 == 1 ? 0.0f : AndroidUtilities.dp(30.0f)).setDuration(420L).setInterpolator(prVar).withEndAction(new f1(this, 2)).start();
            this.s0.setVisibility(0);
            this.s0.animate().alpha(this.H0 == 2 ? 1.0f : 0.0f).scaleX(this.H0 == 2 ? 1.0f : 0.8f).scaleY(this.H0 == 2 ? 1.0f : 0.8f).setDuration(420L).setInterpolator(prVar).withEndAction(new f1(this, 3)).start();
            return;
        }
        this.X.setVisibility(i10 == 0 ? 0 : 8);
        this.X.setAlpha(i10 == 0 ? 1.0f : 0.0f);
        this.X.setScaleX(i10 == 0 ? 1.0f : 0.8f);
        this.X.setScaleY(i10 == 0 ? 1.0f : 0.8f);
        this.X.setTranslationY(i10 == 0 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.e0.setVisibility(i10 == 1 ? 0 : 8);
        this.e0.setAlpha(i10 == 1 ? 1.0f : 0.0f);
        this.e0.setScaleX(i10 == 1 ? 1.0f : 0.8f);
        this.e0.setScaleY(i10 == 1 ? 1.0f : 0.8f);
        this.e0.setTranslationY(i10 == 1 ? 0.0f : AndroidUtilities.dp(30.0f));
        this.s0.setVisibility(i10 != 2 ? 8 : 0);
        this.s0.setAlpha(i10 == 2 ? 1.0f : 0.0f);
        this.s0.setScaleX(i10 == 2 ? 1.0f : 0.8f);
        this.s0.setScaleY(i10 == 2 ? 1.0f : 0.8f);
    }

    public final void y0() {
        boolean z4;
        boolean z10;
        m9 textSelectionHelper = this.M.getTextSelectionHelper();
        ArrayList arrayList = this.i0;
        if (arrayList.isEmpty() || textSelectionHelper == null || !textSelectionHelper.y()) {
            return;
        }
        u1 u1Var = this.r0;
        boolean z11 = false;
        if (u1Var != null) {
            r3 r3Var = this.M;
            int[] B4 = r3Var.B4();
            u1Var.setSelected(B4 != null && r3Var.H3(B4[0], B4[1]));
        }
        if (this.M.L3()) {
            m9 textSelectionHelper2 = this.M.getTextSelectionHelper();
            int i10 = textSelectionHelper2.u0;
            int i11 = textSelectionHelper2.v0;
            int i12 = textSelectionHelper2.y0;
            int i13 = textSelectionHelper2.w0;
            int i14 = textSelectionHelper2.z0;
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                Object obj = arrayList.get(i15);
                i15++;
                u1 u1Var2 = (u1) obj;
                u1Var2.setSelected(this.M.K3(((Integer) u1Var2.getTag()).intValue(), i10, i11, i13, i12, i14));
            }
            boolean z12 = i11 == i12;
            e1 N4 = z12 ? this.M.N4(i10, i11) : null;
            int max = Math.max(0, Math.min(i13, i14));
            int max2 = N4 == null ? 0 : Math.max(0, Math.min(Math.max(i13, i14), N4.length()));
            u1 u1Var3 = this.n0;
            if (u1Var3 != null) {
                u1Var3.setSelected(N4 != null && max < max2 && x5.h(N4.getText(), max, max2));
            }
            u1 u1Var4 = this.p0;
            if (u1Var4 != null) {
                if (N4 != null && max < max2 && x5.g(N4.getText(), max, max2)) {
                    z11 = true;
                }
                u1Var4.setSelected(z11);
            }
            t0(true);
            u0(z12, this.M.l2());
            return;
        }
        if (this.M.w3()) {
            m9 textSelectionHelper3 = this.M.getTextSelectionHelper();
            e1 s22 = this.M.s2(textSelectionHelper3.u0);
            int i16 = textSelectionHelper3.w0;
            int i17 = textSelectionHelper3.z0;
            int max3 = s22 == null ? 0 : Math.max(0, Math.min(Math.min(i16, i17), s22.length()));
            int max4 = s22 == null ? 0 : Math.max(0, Math.min(Math.max(i16, i17), s22.length()));
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                u1 u1Var5 = (u1) obj2;
                u1Var5.setSelected((s22 == null || max3 >= max4 || (((Integer) u1Var5.getTag()).intValue() & s22.getCurrentStyle(max3, max4)) == 0) ? false : true);
            }
            u1 u1Var6 = this.n0;
            if (u1Var6 != null) {
                u1Var6.setSelected(s22 != null && max3 < max4 && x5.h(s22.getText(), max3, max4));
            }
            u1 u1Var7 = this.p0;
            if (u1Var7 != null) {
                if (s22 != null && max3 < max4 && x5.g(s22.getText(), max3, max4)) {
                    z11 = true;
                }
                u1Var7.setSelected(z11);
            }
            t0(true);
            u0(true, this.M.l2());
            return;
        }
        int i19 = textSelectionHelper.u0;
        int i20 = textSelectionHelper.x0;
        int i21 = textSelectionHelper.w0;
        int i22 = textSelectionHelper.z0;
        boolean z13 = i19 >= 0 && i20 >= 0 && i20 >= i19 && i20 < this.M.m4.size();
        int size3 = arrayList.size();
        int i23 = 0;
        while (i23 < size3) {
            int i24 = i23 + 1;
            u1 u1Var8 = (u1) arrayList.get(i23);
            u1Var8.setSelected(z13 && this.M.J3(((Integer) u1Var8.getTag()).intValue(), i19, i21, i20, i22));
            i23 = i24;
        }
        t0(!this.M.I3());
        u1 u1Var9 = this.n0;
        if (u1Var9 != null) {
            if (z13) {
                Editable H4 = this.M.H4(i19, i21, i20, i22);
                if (H4 == null ? false : x5.h(H4, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z10 = true;
                    u1Var9.setSelected(z10);
                }
            }
            z10 = false;
            u1Var9.setSelected(z10);
        }
        u1 u1Var10 = this.p0;
        if (u1Var10 != null) {
            if (z13) {
                Editable H42 = this.M.H4(i19, i21, i20, i22);
                if (H42 == null ? false : x5.g(H42, Math.max(0, Math.min(i21, i22)), Math.max(i21, i22))) {
                    z4 = true;
                    u1Var10.setSelected(z4);
                }
            }
            z4 = false;
            u1Var10.setSelected(z4);
        }
        if (z13 && i19 == i20) {
            z11 = true;
        }
        u0(z11, this.M.l2());
    }

    public final void z0() {
        boolean r22 = this.M.r2();
        d2 d2Var = this.M.G3;
        boolean z4 = (d2Var == null || d2Var.c.isEmpty()) ? false : true;
        ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setEnabled(r22);
            this.S.setAlpha(r22 ? 1.0f : 0.35f);
        }
        ImageView imageView2 = this.T;
        if (imageView2 != null) {
            imageView2.setEnabled(z4);
            this.T.setAlpha(z4 ? 1.0f : 0.35f);
        }
    }

    public z1(String str) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.C = new int[2];
        this.F = 1.0f;
        this.K = new ArrayList();
        this.c0 = new ArrayList();
        this.h0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.i0 = new ArrayList();
        this.F0 = 0;
        this.H0 = -1;
        this.J0 = new f1(this, 0);
        this.f = str;
    }

    public z1(TL_iv.RichMessage richMessage) {
        super(null);
        this.c = -1;
        this.d = -1;
        this.w = new Rect();
        this.C = new int[2];
        this.F = 1.0f;
        this.K = new ArrayList();
        this.c0 = new ArrayList();
        this.h0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.i0 = new ArrayList();
        this.F0 = 0;
        this.H0 = -1;
        this.J0 = new f1(this, 0);
        this.b = richMessage;
    }
}
