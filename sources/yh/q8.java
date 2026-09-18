package yh;

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
import ci.r9;
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
import org.telegram.messenger.wl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.af;
import org.telegram.ui.bo;
import org.telegram.ui.gg0;
import org.telegram.ui.jn0;
import org.telegram.ui.lb1;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class q8 extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final ai.m1 G;
    public final ai.h1 H;
    public final np I;
    public final gg0 J;
    public final MessageObject K;
    public final ArrayList L;
    public final a M;
    public ai.r3 N;
    public int O;
    public a1.c P;
    public final oq[] Q;
    public boolean R;
    public boolean S;
    public bo T;
    public View U;
    public ValueAnimator V;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final e8 r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final u9 w;
    public final ci.d x;
    public final p8 y;

    public q8(Context context, final int i10, final long j3, bo boVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        String formatString;
        Context context2;
        long j11;
        this.Q = new oq[1];
        this.S = false;
        this.b = f6Var;
        this.c = i10;
        this.K = messageObject;
        this.L = arrayList;
        this.d = z11;
        this.e = z10;
        a aVar = new a(context, i10, f6Var);
        this.M = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.container.addView(aVar, w7.x5.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.z5.a(aVar);
        aVar.setOnClickListener(new m91(context, 2, f6Var));
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
            this.E = v5.y(i10, false).A(messageObject);
        }
        long j12 = this.E;
        this.F = j12 != UserObject.ANONYMOUS ? j12 : clientUserId;
        fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        linearLayout.addView(frameLayout, w7.x5.n(-1, -2));
        this.r = new e8(this, context, f6Var, z11, i10);
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
        e8 e8Var = this.r;
        e8Var.e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                e8Var.setAlpha(0.5f);
            }
            this.h.addView(this.r, w7.x5.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z13) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.x5.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, f6Var)));
        u9 u9Var = new u9(context);
        this.w = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        u9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(u9Var, w7.x5.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, f6Var);
        boolean z14 = z13;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.x5.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.x5.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.x5.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.z5.a(frameLayout2);
        o.g(i10).o();
        jn0 jn0Var = new jn0(context, 4);
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        jn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        jn0Var.setTextSize(1, 20.0f);
        jn0Var.setGravity(17);
        jn0Var.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        jn0Var.setTypeface(AndroidUtilities.bold());
        jn0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(jn0Var, w7.x5.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), mode));
        w7.z5.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: yh.b8
            public final /* synthetic */ q8 b;

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
                        q8 q8Var = this.b;
                        np npVar = q8Var.I;
                        npVar.a(!npVar.a.q, true);
                        q8Var.E = npVar.a.q ? q8Var.F : UserObject.ANONYMOUS;
                        q8Var.r();
                        p8 p8Var = q8Var.y;
                        if (p8Var != null) {
                            p8Var.setMyPrivacy(q8Var.E);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.x5.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.x5.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        wl.n(i18, f6Var, textView, 1, 14.0f);
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
                linearLayout3.addView(new f8(context, f6Var), w7.x5.t(-1, 30, 55, 0, 20, 0, 0));
            }
            p8 p8Var = new p8(this, context, z11);
            this.y = p8Var;
            p8Var.setOnSenderClickListener(new Utilities.Callback() { // from class: yh.c8
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    q8 q8Var = q8.this;
                    boolean z15 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new g8(q8Var, bundle, z15));
                        q8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new h8(q8Var, bundle2, z15));
                    }
                    q8Var.dismiss();
                }
            });
            this.f.addView(p8Var, w7.x5.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
            if (!z11 && (z10 || messageReactor != null)) {
                this.f.addView(view, w7.x5.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.j6.j5;
            TextView b10 = w7.b6.b(context, 20.0f, i20, true, f6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, w7.x5.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.b6.b(context, 14.0f, i20, false, f6Var);
            b11.setGravity(17);
            wl.p(z10 ? R.string.LiveStoryReactText : z14 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j3)}, b11);
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
        np npVar = new np(context, 21, f6Var);
        this.I = npVar;
        npVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        npVar.setDrawUnchecked(true);
        npVar.a(this.E != UserObject.ANONYMOUS, false);
        p8 p8Var2 = this.y;
        if (p8Var2 != null) {
            p8Var2.setMyPrivacy(this.E);
        }
        npVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        wl.n(i18, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(npVar, w7.x5.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.x5.q(-2, -2, 16));
        final int i21 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: yh.b8
            public final /* synthetic */ q8 b;

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
                        q8 q8Var = this.b;
                        np npVar2 = q8Var.I;
                        npVar2.a(!npVar2.a.q, true);
                        q8Var.E = npVar2.a.q ? q8Var.F : UserObject.ANONYMOUS;
                        q8Var.r();
                        p8 p8Var3 = q8Var.y;
                        if (p8Var3 != null) {
                            p8Var3.setMyPrivacy(q8Var.E);
                            break;
                        }
                        break;
                }
            }
        });
        w7.z5.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 6, 6));
        if (!z11 && (z10 || messageReactor != null)) {
            this.f.addView(linearLayout4, w7.x5.t(-2, -2, 1, 0, z14 ? 10 : 4, 0, 10));
        }
        ci.d dVar = new ci.d(context, f6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, w7.x5.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(y7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.Q), true, true);
        if (z10) {
            j11 = 0;
            context2 = context;
            dVar.setOnClickListener(new n6(this, messageObject, boVar, i10, z11, context, f6Var, j3, chat));
        } else {
            context2 = context;
            j11 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: yh.d8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q8.m(q8.this, i10, f6Var, j3, z11);
            }
        });
        c90 c90Var = new c90(context2, f6Var);
        c90Var.setTextSize(1, 13.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        if (!z11 || z10) {
            c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new di.a(context2, 12)));
        } else {
            c90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        c90Var.setGravity(17);
        c90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.k5));
        if (z10 || z11) {
            this.f.addView(c90Var, w7.x5.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        gg0 gg0Var = new gg0(context2, 1, 2, 4);
        this.J = gg0Var;
        sg.a aVar2 = gg0Var.b;
        aVar2.w = org.telegram.ui.ActionBar.j6.fk;
        aVar2.x = org.telegram.ui.ActionBar.j6.gk;
        aVar2.b();
        gg0Var.b.h = 1.0f;
        gg0Var.setVisibility(4);
        gg0Var.setPaused(true);
        this.container.addView(gg0Var, w7.x5.c(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
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

    public static void m(q8 q8Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z10) {
        long j10;
        q8 q8Var2 = q8Var;
        o g10 = o.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        n70 F = n70.F(q8Var2.containerView, f6Var, q8Var2.v);
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
                q8Var2 = q8Var;
                i11 = i12;
            }
            if (j10 == j3) {
                i11 = i12;
            } else {
                long j11 = q8Var2.E;
                F.g(tLObject, j10 == j11 || (j11 == 0 && j10 == UserConfig.getInstance(i10).getClientUserId()), new r9(q8Var2, j10, z10, 6));
                q8Var2 = q8Var;
                i11 = i12;
            }
        }
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.V(5);
        F.Z();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        a aVar = this.M;
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        if (this.r.k0) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.adminedChannelsLoaded) {
            q(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        Long myPaidReactionPeer;
        if (!this.R && !this.S) {
            this.S = true;
            MessageObject messageObject = this.K;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.E)) {
                messageObject.setMyPaidReactionDialogId(this.E);
                p5 b10 = p5.b(messageObject);
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
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ai.m8(this, 29));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean isTouchOutside(float f7, float f10) {
        a aVar = this.M;
        if (f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.isTouchOutside(f7, f10);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(final s5 s5Var) {
        View view;
        zg.q0 q0Var;
        ai.r3 r3Var;
        View view2;
        zg.q0 q0Var2;
        zg.n0 n0Var;
        zg.n0 n0Var2 = null;
        MessageObject messageObject = null;
        if (this.K != null && (view2 = this.T.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.U;
            if (view3 instanceof org.telegram.ui.Cells.t1) {
                q0Var2 = ((org.telegram.ui.Cells.t1) view3).N;
                q0Var2.getClass();
                n0Var = q0Var2.l("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.w0) {
                q0Var2 = ((org.telegram.ui.Cells.w0) view3).C0;
                q0Var2.getClass();
                n0Var = q0Var2.l("stars");
            } else {
                q0Var2 = null;
                n0Var = null;
            }
            if (n0Var == null && q0Var2 != null) {
                MessageObject.GroupedMessages X8 = this.T.X8(this.K);
                if (X8 != null && !X8.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = X8.messages;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        MessageObject messageObject2 = arrayList.get(i10);
                        i10++;
                        MessageObject messageObject3 = messageObject2;
                        MessageObject.GroupedMessagePosition position = X8.getPosition(messageObject3);
                        if (position != null) {
                            int i11 = position.flags;
                            if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                messageObject = messageObject3;
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        view3 = this.T.q8(messageObject.getId(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.t1) {
                    zg.q0 q0Var3 = ((org.telegram.ui.Cells.t1) view3).N;
                    q0Var3.getClass();
                    q0Var2 = q0Var3;
                    n0Var2 = q0Var3.l("stars");
                    if (n0Var2 != null) {
                        return;
                    }
                    q0Var = q0Var2;
                    view = view3;
                }
            }
            n0Var2 = n0Var;
            if (n0Var2 != null) {
            }
        } else {
            if (this.N == null) {
                return;
            }
            view = null;
            q0Var = null;
        }
        View view4 = view;
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        this.r.getLocationInWindow(iArr);
        rectF.set(this.r.G.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        gg0 gg0Var = this.J;
        z7 z7Var = new z7(this, 2);
        if (gg0Var.P) {
            z7Var.run();
        } else {
            gg0Var.Q = z7Var;
        }
        if (n0Var2 != null) {
            n0Var2.l = false;
        }
        if (view4 != null) {
            view4.invalidate();
        }
        ai.h1[] h1VarArr = new ai.h1[1];
        if (this.d && (r3Var = this.N) != null) {
            h1VarArr[0] = r3Var.d(this.O);
        }
        zg.n0 n0Var3 = n0Var2;
        final RectF rectF2 = new RectF();
        final af afVar = new af(this, h1VarArr, iArr, rectF2, view4, q0Var, n0Var3, 13);
        afVar.run();
        this.J.setPaused(false);
        this.J.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        this.J.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.J.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.J.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        this.J.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.V = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yh.a8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                afVar.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                q8 q8Var = q8.this;
                gg0 gg0Var2 = q8Var.J;
                gg0Var2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                gg0Var2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                gg0Var2.setScaleX(lerp);
                gg0Var2.setScaleY(lerp);
                sg.a aVar = gg0Var2.b;
                aVar.d = 360.0f * floatValue;
                aVar.h = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    q8Var.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = s5Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.V.addListener(new i8(this, n0Var3, view4, h1VarArr, zArr, rectF2, s5Var));
        this.V.setDuration(800L);
        this.V.setInterpolator(new org.telegram.ui.Cells.l2(4));
        this.V.start();
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

    public final boolean p() {
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

    public final void q(boolean z10) {
        FrameLayout frameLayout = this.s;
        if ((frameLayout.getVisibility() == 0) != p()) {
            frameLayout.setVisibility(p() ? 0 : 8);
            if (z10) {
                if (p()) {
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

    public final void r() {
        f9 f9Var = new f9((org.telegram.ui.ActionBar.f6) null);
        f9Var.p = 0.42f;
        long j3 = this.E;
        u9 u9Var = this.w;
        if (j3 == UserObject.ANONYMOUS) {
            f9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.j6.c8;
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            f9Var.i(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            u9Var.e(null, f9Var);
            return;
        }
        int i11 = this.c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.E));
            f9Var.r(user);
            u9Var.e(user, f9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.E));
            f9Var.q(chat);
            u9Var.e(chat, f9Var);
        }
    }

    public final void s(long j3) {
        p8 p8Var;
        long j10;
        long j11;
        long j12 = 0;
        if ((!this.d || this.e || j3 <= 0) && (p8Var = this.y) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.c).getClientUserId();
            int i10 = 1;
            ArrayList arrayList2 = this.L;
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
                        l8 l8Var = new l8();
                        l8Var.a = z10;
                        l8Var.b = false;
                        l8Var.c = peerDialogId;
                        l8Var.d = j14;
                        arrayList.add(l8Var);
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
                l8 l8Var2 = new l8();
                l8Var2.a = z11;
                l8Var2.b = true;
                l8Var2.c = clientUserId;
                l8Var2.d = j15;
                arrayList.add(l8Var2);
            }
            Collections.sort(arrayList, new lb1(23));
            p8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
