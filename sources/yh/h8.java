package yh;

import ai.o8;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.o9;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gn0;
import org.telegram.ui.mb1;
import org.telegram.ui.o91;
import org.telegram.ui.ze;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h8 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final ai.m1 G;
    public final ai.h1 H;
    public final View I;
    public final dq J;
    public final eg0 K;
    public final MessageObject L;
    public final ArrayList M;
    public final a N;
    public ai.s3 O;
    public int P;
    public a1.c Q;
    public final er[] R;
    public boolean S;
    public boolean T;
    public zn U;
    public View V;
    public ValueAnimator W;
    public final org.telegram.ui.ActionBar.e6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final v7 r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final y9 w;
    public final ci.d x;
    public final g8 y;

    public h8(Context context, final int i10, final long j3, zn znVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.e6 e6Var) {
        super(1, context, e6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        String formatString;
        Context context2;
        long j11;
        this.R = new er[1];
        this.T = false;
        this.b = e6Var;
        this.c = i10;
        this.L = messageObject;
        this.M = arrayList;
        this.d = z11;
        this.e = z10;
        a aVar = new a(context, i10, e6Var);
        this.N = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, w7.x5.a(-2.0f, 0.0f, 48.0f, 0.0f, 0.0f, -2, 49));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new o91(context, 2, e6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor3.my || peerDialogId == clientUserId) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z11) {
            if (arrayList != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i12)).my) {
                        break;
                    }
                    i12++;
                }
            }
            this.E = j10;
        } else {
            this.E = m5.y(i10, false).A(messageObject);
        }
        long j12 = this.E;
        this.F = j12 != UserObject.ANONYMOUS ? j12 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.x5.n(-1, -2));
        this.r = new v7(this, context, e6Var, z11, i10);
        int i13 = 9;
        int[] iArr = {1, 50, 100, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2000, 5000, 7500, 10000};
        long j13 = MessagesController.getInstance(i10).starsPaidReactionAmountMax;
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                break;
            }
            int i15 = iArr[i14];
            int i16 = i14;
            if (i15 > j13) {
                arrayList2.add(Integer.valueOf((int) j13));
                break;
            }
            arrayList2.add(Integer.valueOf(i15));
            if (iArr[i16] == j13) {
                break;
            }
            i14 = i16 + 1;
            i13 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            iArr2[i17] = ((Integer) arrayList2.get(i17)).intValue();
        }
        v7 v7Var = this.r;
        v7Var.e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                v7Var.setAlpha(0.5f);
            }
            this.h.addView(this.r, w7.x5.a(-2.0f, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z13) ? 0.0f : -40.0f, -1, 55));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 55));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i5, e6Var)));
        y9 y9Var = new y9(context);
        this.w = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        y9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        t();
        frameLayout3.addView(y9Var, w7.x5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.r5, e6Var);
        boolean z14 = z13;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.x5.a(18.0f, 0.0f, 0.0f, 4.0f, 0.0f, 18, 21));
        frameLayout2.addView(frameLayout3, w7.x5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.x5.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.z5.a(frameLayout2);
        o.g(i10).o();
        gn0 gn0Var = new gn0(context, 4);
        int i18 = org.telegram.ui.ActionBar.i6.G6;
        gn0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i18, e6Var));
        gn0Var.setTextSize(1, 20.0f);
        gn0Var.setGravity(17);
        gn0Var.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        gn0Var.setTypeface(AndroidUtilities.bold());
        gn0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(gn0Var, w7.x5.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        s(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W5, e6Var), mode));
        w7.z5.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: yh.s7
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        h8 h8Var = this.b;
                        dq dqVar = h8Var.J;
                        dqVar.a(!dqVar.a.q, true);
                        h8Var.E = dqVar.a.q ? h8Var.F : UserObject.ANONYMOUS;
                        h8Var.t();
                        g8 g8Var = h8Var.y;
                        if (g8Var != null) {
                            g8Var.setMyPrivacy(h8Var.E);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.x5.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.x5.a(-2.0f, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f, -1, 55));
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        bi.o(i18, e6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor.count);
            z12 = false;
        } else {
            z12 = false;
            formatString = LocaleController.formatString(R.string.StarsReactionText, chat == null ? "" : chat.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z12));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.x5.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z14) {
            if (!z11) {
                linearLayout3.addView(new w7(context, e6Var), w7.x5.t(-1, 30, 55, 0, 20, 0, 0));
            }
            g8 g8Var = new g8(this, context, z11);
            this.y = g8Var;
            g8Var.setOnSenderClickListener(new Utilities.Callback() { // from class: yh.t7
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    h8 h8Var = h8.this;
                    boolean z15 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new x7(h8Var, bundle, z15));
                        h8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new y7(h8Var, bundle2, z15));
                    }
                    h8Var.dismiss();
                }
            });
            this.f.addView(g8Var, w7.x5.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            this.I = view;
            view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d7, e6Var));
            if (!z11 && (z10 || messageReactor != null)) {
                this.f.addView(view, w7.x5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
            this.I = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.i6.j5;
            TextView b10 = w7.b6.b(context, 20.0f, i20, true, e6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, w7.x5.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.b6.b(context, 14.0f, i20, false, e6Var);
            b11.setGravity(17);
            bi.r(z10 ? R.string.LiveStoryReactText : z14 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j3)}, b11);
            this.f.addView(b11, w7.x5.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            ai.m1 m1Var = new ai.m1();
            this.G = m1Var;
            m1Var.c = this.E;
            m1Var.g = 50L;
            m1Var.e = true;
            ai.h1 h1Var = new ai.h1(i10, context, true);
            this.H = h1Var;
            h1Var.set(m1Var);
            this.f.addView(h1Var, w7.x5.t(-2, -2, 17, 32, 0, 32, 20));
        }
        dq dqVar = new dq(context, 21, e6Var);
        this.J = dqVar;
        dqVar.b(org.telegram.ui.ActionBar.i6.h7, org.telegram.ui.ActionBar.i6.j7, org.telegram.ui.ActionBar.i6.k7);
        dqVar.setDrawUnchecked(true);
        dqVar.a(this.E != UserObject.ANONYMOUS, false);
        g8 g8Var2 = this.y;
        if (g8Var2 != null) {
            g8Var2.setMyPrivacy(this.E);
        }
        dqVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        bi.o(i18, e6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(dqVar, w7.x5.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.x5.q(-2, -2, 16));
        final int i21 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: yh.s7
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i21) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        h8 h8Var = this.b;
                        dq dqVar2 = h8Var.J;
                        dqVar2.a(!dqVar2.a.q, true);
                        h8Var.E = dqVar2.a.q ? h8Var.F : UserObject.ANONYMOUS;
                        h8Var.t();
                        g8 g8Var3 = h8Var.y;
                        if (g8Var3 != null) {
                            g8Var3.setMyPrivacy(h8Var.E);
                            break;
                        }
                        break;
                }
            }
        });
        w7.z5.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.i6.Z(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 6, 6));
        if (!z11 && (z10 || messageReactor != null)) {
            this.f.addView(linearLayout4, w7.x5.t(-2, -2, 1, 0, z14 ? 10 : 4, 0, 10));
        }
        ci.d dVar = new ci.d(context, e6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, w7.x5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        u(0L);
        dVar.g(p7.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.R), true, true);
        if (z10) {
            j11 = 0;
            context2 = context;
            dVar.setOnClickListener(new f6(this, messageObject, znVar, i10, z11, context, e6Var, j3, chat));
        } else {
            context2 = context;
            j11 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: yh.u7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h8.o(h8.this, i10, e6Var, j3, z11);
            }
        });
        ea0 ea0Var = new ea0(context2, e6Var);
        ea0Var.setTextSize(1, 13.0f);
        ea0Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.z6, e6Var));
        if (!z11 || z10) {
            ea0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new di.a(context2, 12)));
        } else {
            ea0Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        ea0Var.setGravity(17);
        ea0Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.k5));
        if (z10 || z11) {
            this.f.addView(ea0Var, w7.x5.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        eg0 eg0Var = new eg0(context2, 1, 2, 4);
        this.K = eg0Var;
        sg.g gVar = eg0Var.b;
        gVar.z = org.telegram.ui.ActionBar.i6.fk;
        gVar.A = org.telegram.ui.ActionBar.i6.gk;
        gVar.b();
        eg0Var.b.k = 1.0f;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        this.container.addView(eg0Var, w7.x5.d(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        this.r.setValue(50);
        if (arrayList != null) {
            long j14 = j11;
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i22)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor != null ? j14 - messageReactor.count : j14;
            if (j14 > j11) {
                this.r.setStarsTop(j14 + 1);
            }
        }
    }

    public static void o(h8 h8Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, long j3, boolean z10) {
        long j10;
        h8 h8Var2 = h8Var;
        o g10 = o.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        p80 F = p80.F(h8Var2.containerView, e6Var, h8Var2.v);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        j10 = -chat.id;
                    } else {
                        i11 = i12;
                    }
                }
                h8Var2 = h8Var;
                i11 = i12;
            }
            if (j10 == j3) {
                i11 = i12;
            } else {
                long j11 = h8Var2.E;
                F.g(tLObject, j10 == j11 || (j11 == 0 && j10 == UserConfig.getInstance(i10).getClientUserId()), new o9(h8Var2, j10, z10, 6));
                h8Var2 = h8Var;
                i11 = i12;
            }
        }
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.V(5);
        F.Z();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        a aVar = this.N;
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.r.k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            s(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.S && !this.T) {
            this.T = true;
            MessageObject messageObject = this.L;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.E)) {
                messageObject.setMyPaidReactionDialogId(this.E);
                g5 b10 = g5.b(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.c;
                MessagesController messagesController = MessagesController.getInstance(i10);
                long j3 = b10.a;
                int i11 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = messagesController.getInputPeer(j3);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j10 = this.E;
                if (j10 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j10 == UserObject.ANONYMOUS) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i10).getInputPeer(this.E);
                }
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(b10.a), Integer.valueOf(i11), Long.valueOf(this.E));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new o8(this, 29));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar = this.N;
        if (f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.c).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.c).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final void q(final j5 j5Var) {
        zg.l0 l0Var;
        View view;
        zg.o0 o0Var;
        ai.s3 s3Var;
        View view2;
        zg.o0 o0Var2;
        zg.l0 l0Var2;
        MessageObject messageObject;
        v7 v7Var = this.r;
        eg0 eg0Var = this.K;
        MessageObject messageObject2 = this.L;
        if (messageObject2 != null && (view2 = this.U.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.V;
            if (view3 instanceof org.telegram.ui.Cells.u1) {
                o0Var2 = ((org.telegram.ui.Cells.u1) view3).N;
                o0Var2.getClass();
                l0Var2 = o0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.w0) {
                o0Var2 = ((org.telegram.ui.Cells.w0) view3).E0;
                o0Var2.getClass();
                l0Var2 = o0Var2.l("stars");
            } else {
                o0Var2 = null;
                l0Var2 = null;
            }
            if (l0Var2 == null && o0Var2 != null) {
                MessageObject.GroupedMessages c92 = this.U.c9(messageObject2);
                if (c92 != null && !c92.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = c92.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            messageObject = null;
                            break;
                        }
                        MessageObject messageObject3 = arrayList.get(i10);
                        i10++;
                        messageObject = messageObject3;
                        MessageObject.GroupedMessagePosition position = c92.getPosition(messageObject);
                        if (position != null) {
                            int i11 = position.flags;
                            if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        view3 = this.U.t8(messageObject.getId(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.u1) {
                    o0Var2 = ((org.telegram.ui.Cells.u1) view3).N;
                    o0Var2.getClass();
                    l0Var2 = o0Var2.l("stars");
                }
            }
            if (l0Var2 == null) {
                return;
            }
            o0Var = o0Var2;
            l0Var = l0Var2;
            view = view3;
        } else {
            if (this.O == null) {
                return;
            }
            l0Var = null;
            view = null;
            o0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        v7Var.getLocationInWindow(iArr);
        rectF.set(v7Var.G.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        q7 q7Var = new q7(this, 2);
        eg0Var.U = q7Var;
        if (eg0Var.T) {
            eg0Var.U = null;
            q7Var.run();
        }
        if (l0Var != null) {
            l0Var.l = false;
        }
        if (view != null) {
            view.invalidate();
        }
        zg.l0 l0Var3 = l0Var;
        ai.h1[] h1VarArr = new ai.h1[1];
        if (this.d && (s3Var = this.O) != null) {
            h1VarArr[0] = s3Var.d(this.P);
        }
        final RectF rectF2 = new RectF();
        final ze zeVar = new ze(this, h1VarArr, iArr, rectF2, view, o0Var, l0Var3, 16);
        View view4 = view;
        zeVar.run();
        eg0Var.setPaused(false);
        eg0Var.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        eg0Var.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        eg0Var.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        eg0Var.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        eg0Var.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.W;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.W = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yh.r7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                zeVar.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                h8 h8Var = h8.this;
                eg0 eg0Var2 = h8Var.K;
                eg0Var2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                eg0Var2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                eg0Var2.setScaleX(lerp);
                eg0Var2.setScaleY(lerp);
                sg.g gVar = eg0Var2.b;
                gVar.d = 360.0f * floatValue;
                gVar.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    h8Var.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = j5Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.W.addListener(new z7(this, l0Var3, view4, h1VarArr, zArr, rectF2, j5Var));
        this.W.setDuration(800L);
        this.W.setInterpolator(new org.telegram.ui.Cells.m2(4));
        this.W.start();
    }

    public final boolean r() {
        if (!this.d) {
            o g10 = o.g(this.c);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void s(boolean z10) {
        FrameLayout frameLayout = this.s;
        if ((frameLayout.getVisibility() == 0) != r()) {
            frameLayout.setVisibility(r() ? 0 : 8);
            if (z10) {
                if (r()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.n, changeBounds);
            }
        }
    }

    public final void t() {
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        j9Var.p = 0.42f;
        long j3 = this.E;
        y9 y9Var = this.w;
        if (j3 == UserObject.ANONYMOUS) {
            j9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.i6.c8;
            org.telegram.ui.ActionBar.e6 e6Var = this.b;
            j9Var.i(org.telegram.ui.ActionBar.i6.w0(i10, e6Var), org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
            y9Var.e(null, j9Var);
            return;
        }
        int i11 = this.c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.E));
            j9Var.r(user);
            y9Var.e(user, j9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.E));
            j9Var.q(chat);
            y9Var.e(chat, j9Var);
        }
    }

    public final void u(long j3) {
        g8 g8Var;
        long j10;
        long j11;
        long j12 = 0;
        if ((!this.d || this.e || j3 <= 0) && (g8Var = this.y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.M;
            if (arrayList2 != null) {
                j11 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j13 = j12;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        peerDialogId = messageReactor.my ? clientUserId : (-i11) - i10;
                    }
                    if (messageReactor.my || peerDialogId == clientUserId) {
                        j11 = messageReactor.count;
                    } else {
                        long j14 = messageReactor.count;
                        c8 c8Var = new c8();
                        c8Var.a = z10;
                        c8Var.b = false;
                        c8Var.c = peerDialogId;
                        c8Var.d = j14;
                        arrayList.add(c8Var);
                    }
                    i11++;
                    j12 = j13;
                    i10 = 1;
                }
                j10 = j12;
            } else {
                j10 = 0;
                j11 = 0;
            }
            long j15 = j11 + j3;
            if (j15 > j10) {
                boolean z11 = this.E == UserObject.ANONYMOUS;
                c8 c8Var2 = new c8();
                c8Var2.a = z11;
                c8Var2.b = true;
                c8Var2.c = clientUserId;
                c8Var2.d = j15;
                arrayList.add(c8Var2);
            }
            Collections.sort(arrayList, new mb1(25));
            g8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
