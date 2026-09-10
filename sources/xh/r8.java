package xh;

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
import bi.xa;
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
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.w9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bf;
import org.telegram.ui.eg0;
import org.telegram.ui.eo;
import org.telegram.ui.hn0;
import org.telegram.ui.s91;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class r8 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public long E;
    public long F;
    public final zh.k0 G;
    public final zh.f0 H;
    public final tp I;
    public final eg0 J;
    public final MessageObject K;
    public final ArrayList L;
    public final a M;
    public zh.o1 N;
    public int O;
    public th.e P;
    public final uq[] Q;
    public boolean R;
    public boolean S;
    public eo T;
    public View U;
    public ValueAnimator V;
    public final org.telegram.ui.ActionBar.f6 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final LinearLayout f;
    public final FrameLayout h;
    public final LinearLayout n;
    public final f8 r;
    public final FrameLayout s;
    public final FrameLayout v;
    public final w9 w;
    public final bi.d x;
    public final q8 y;

    public r8(Context context, final int i10, final long j3, eo eoVar, MessageObject messageObject, ArrayList arrayList, boolean z10, final boolean z11, long j10, final org.telegram.ui.ActionBar.f6 f6Var) {
        super(1, context, f6Var, false);
        TLRPC.MessageReactor messageReactor;
        TLRPC.MessageReactor messageReactor2;
        TLRPC.Chat chat;
        boolean z12;
        String formatString;
        Context context2;
        long j11;
        this.Q = new uq[1];
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
        this.container.addView(aVar, w7.a6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.c6.a(aVar);
        aVar.setOnClickListener(new s91(context, 2, f6Var));
        long clientUserId = UserConfig.getInstance(i10).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i11 = 0;
            TLRPC.MessageReactor messageReactor3 = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TLRPC.MessageReactor messageReactor4 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor4.peer_id);
                if (messageReactor4.anonymous && messageReactor4.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor4.my || peerDialogId == clientUserId) {
                    messageReactor3 = messageReactor4;
                }
            }
            messageReactor = messageReactor3;
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
        linearLayout.addView(frameLayout, w7.a6.n(-1, -2));
        this.r = new f8(this, context, f6Var, z11, i10);
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
        f8 f8Var = this.r;
        f8Var.e0 = iArr2;
        if (z10 || z11) {
            if (!z10) {
                f8Var.setAlpha(0.5f);
            }
            this.h.addView(this.r, w7.a6.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z13) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.n = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.h.addView(linearLayout2, w7.a6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.s = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.v = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, f6Var)));
        w9 w9Var = new w9(context);
        this.w = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
        w9Var.getImageReceiver().setCrossfadeWithOldImage(true);
        r();
        frameLayout3.addView(w9Var, w7.a6.e(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.r5, f6Var);
        boolean z14 = z13;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.a6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.a6.e(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.a6.p(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        w7.c6.a(frameLayout2);
        p.g(i10).o();
        hn0 hn0Var = new hn0(context, 3);
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        hn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i18, f6Var));
        hn0Var.setTextSize(1, 20.0f);
        hn0Var.setGravity(17);
        hn0Var.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        hn0Var.setTypeface(AndroidUtilities.bold());
        hn0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(hn0Var, w7.a6.p(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        q(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, f6Var), mode));
        w7.c6.a(imageView2);
        final int i19 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: xh.c8
            public final /* synthetic */ r8 b;

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
                        r8 r8Var = this.b;
                        tp tpVar = r8Var.I;
                        tpVar.a(!tpVar.a.q, true);
                        r8Var.E = tpVar.a.q ? r8Var.F : UserObject.ANONYMOUS;
                        r8Var.r();
                        q8 q8Var = r8Var.y;
                        if (q8Var != null) {
                            q8Var.setMyPrivacy(r8Var.E);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.a6.p(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.h.addView(linearLayout3, w7.a6.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.MessageReactor messageReactor5 = messageReactor;
        TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
        TextView textView = new TextView(context);
        em.n(i18, f6Var, textView, 1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor5 != null) {
            messageReactor2 = messageReactor5;
            formatString = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor2.count);
            chat = chat2;
            z12 = false;
        } else {
            messageReactor2 = messageReactor5;
            chat = chat2;
            z12 = false;
            formatString = LocaleController.formatString(R.string.StarsReactionText, chat2 == null ? "" : chat2.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(formatString), textView.getPaint().getFontMetricsInt(), z12));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.a6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z14) {
            if (!z11) {
                linearLayout3.addView(new g8(context, f6Var), w7.a6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            q8 q8Var = new q8(this, context, z11);
            this.y = q8Var;
            q8Var.setOnSenderClickListener(new Utilities.Callback() { // from class: xh.d8
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    r8 r8Var = r8.this;
                    boolean z15 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == UserConfig.getInstance(i10).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        U.presentFragment(new h8(r8Var, bundle, z15));
                        r8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        U.presentFragment(new i8(r8Var, bundle2, z15));
                    }
                    r8Var.dismiss();
                }
            });
            this.f.addView(q8Var, w7.a6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, f6Var));
            if (!z11 && (z10 || messageReactor2 != null)) {
                this.f.addView(view, w7.a6.s(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.y = null;
        }
        if (z11) {
            int i20 = org.telegram.ui.ActionBar.j6.j5;
            TextView b10 = w7.e6.b(context, 20.0f, i20, true, f6Var);
            b10.setGravity(17);
            b10.setText(LocaleController.getString(z10 ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.f.addView(b10, w7.a6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.e6.b(context, 14.0f, i20, false, f6Var);
            b11.setGravity(17);
            em.p(z10 ? R.string.LiveStoryReactText : z14 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j3)}, b11);
            this.f.addView(b11, w7.a6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            zh.k0 k0Var = new zh.k0();
            this.G = k0Var;
            k0Var.c = this.E;
            k0Var.g = 50L;
            k0Var.e = true;
            zh.f0 f0Var = new zh.f0(i10, context, true);
            this.H = f0Var;
            f0Var.set(k0Var);
            this.f.addView(f0Var, w7.a6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        tp tpVar = new tp(context, 21, f6Var);
        this.I = tpVar;
        tpVar.b(org.telegram.ui.ActionBar.j6.h7, org.telegram.ui.ActionBar.j6.j7, org.telegram.ui.ActionBar.j6.k7);
        tpVar.setDrawUnchecked(true);
        tpVar.a(this.E != UserObject.ANONYMOUS, false);
        q8 q8Var2 = this.y;
        if (q8Var2 != null) {
            q8Var2.setMyPrivacy(this.E);
        }
        tpVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        em.n(i18, f6Var, textView2, 1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(tpVar, w7.a6.t(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, w7.a6.q(-2, -2, 16));
        final int i21 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: xh.c8
            public final /* synthetic */ r8 b;

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
                        r8 r8Var = this.b;
                        tp tpVar2 = r8Var.I;
                        tpVar2.a(!tpVar2.a.q, true);
                        r8Var.E = tpVar2.a.q ? r8Var.F : UserObject.ANONYMOUS;
                        r8Var.r();
                        q8 q8Var3 = r8Var.y;
                        if (q8Var3 != null) {
                            q8Var3.setMyPrivacy(r8Var.E);
                            break;
                        }
                        break;
                }
            }
        });
        w7.c6.b(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), 6, 6));
        if (!z11 && (z10 || messageReactor2 != null)) {
            this.f.addView(linearLayout4, w7.a6.t(-2, -2, 1, 0, z14 ? 10 : 4, 0, 10));
        }
        bi.d dVar = new bi.d(context, f6Var, true);
        this.x = dVar;
        dVar.e();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.f.addView(dVar, w7.a6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        s(0L);
        dVar.g(z7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.Q), true, true);
        if (z10) {
            j11 = 0;
            context2 = context;
            dVar.setOnClickListener(new n6(this, messageObject, eoVar, i10, z11, context, f6Var, j3, chat));
        } else {
            context2 = context;
            j11 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: xh.e8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                r8.m(r8.this, i10, f6Var, j3, z11);
            }
        });
        m90 m90Var = new m90(context2, f6Var);
        m90Var.setTextSize(1, 13.0f);
        m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        if (!z11 || z10) {
            m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new ci.a(context2, 12)));
        } else {
            m90Var.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        m90Var.setGravity(17);
        m90Var.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.k5));
        if (z10 || z11) {
            this.f.addView(m90Var, w7.a6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.f);
        eg0 eg0Var = new eg0(context2, 1, 2, 4);
        this.J = eg0Var;
        rg.a aVar2 = eg0Var.b;
        aVar2.w = org.telegram.ui.ActionBar.j6.fk;
        aVar2.x = org.telegram.ui.ActionBar.j6.gk;
        aVar2.b();
        eg0Var.b.h = 1.0f;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        this.container.addView(eg0Var, w7.a6.c(150.0f, ImageReceiver.DEFAULT_CROSSFADE_DURATION));
        this.r.setValue(50);
        if (arrayList != null) {
            long j14 = j11;
            for (int i22 = 0; i22 < arrayList.size(); i22++) {
                long j15 = ((TLRPC.MessageReactor) arrayList.get(i22)).count;
                if (j15 > j14) {
                    j14 = j15;
                }
            }
            j14 = messageReactor2 != null ? j14 - messageReactor2.count : j14;
            if (j14 > j11) {
                this.r.setStarsTop(j14 + 1);
            }
        }
    }

    public static void m(r8 r8Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, long j3, boolean z10) {
        long j10;
        r8 r8Var2 = r8Var;
        p g10 = p.g(i10);
        g10.o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = g10.l;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i10).getCurrentUser());
        w70 F = w70.F(r8Var2.containerView, f6Var, r8Var2.v);
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
                r8Var2 = r8Var;
                i11 = i12;
            }
            if (j10 == j3) {
                i11 = i12;
            } else {
                long j11 = r8Var2.E;
                F.g(tLObject, j10 == j11 || (j11 == 0 && j10 == UserConfig.getInstance(i10).getClientUserId()), new xa(r8Var2, j10, z10, 6));
                r8Var2 = r8Var;
                i11 = i12;
            }
        }
        F.t = false;
        F.Y = true;
        F.s = 0;
        F.V(5);
        F.Z();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void appendOpenAnimator(boolean z10, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        a aVar = this.M;
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.h3
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

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
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
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new bi.c2(this, 26));
            }
        }
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override // org.telegram.ui.ActionBar.h3
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
        yg.q0 q0Var;
        zh.o1 o1Var;
        View view2;
        yg.q0 q0Var2;
        yg.n0 n0Var;
        yg.n0 n0Var2 = null;
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
                    yg.q0 q0Var3 = ((org.telegram.ui.Cells.t1) view3).N;
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
        eg0 eg0Var = this.J;
        a8 a8Var = new a8(this, 2);
        if (eg0Var.P) {
            a8Var.run();
        } else {
            eg0Var.Q = a8Var;
        }
        if (n0Var2 != null) {
            n0Var2.l = false;
        }
        if (view4 != null) {
            view4.invalidate();
        }
        zh.f0[] f0VarArr = new zh.f0[1];
        if (this.d && (o1Var = this.N) != null) {
            f0VarArr[0] = o1Var.d(this.O);
        }
        yg.n0 n0Var3 = n0Var2;
        final RectF rectF2 = new RectF();
        final bf bfVar = new bf(this, f0VarArr, iArr, rectF2, view4, q0Var, n0Var3, 13);
        bfVar.run();
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xh.b8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                bfVar.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, floatValue, rectF6);
                r8 r8Var = r8.this;
                eg0 eg0Var2 = r8Var.J;
                eg0Var2.setTranslationX(rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
                eg0Var2.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float lerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                eg0Var2.setScaleX(lerp);
                eg0Var2.setScaleY(lerp);
                rg.a aVar = eg0Var2.b;
                aVar.d = 360.0f * floatValue;
                aVar.h = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    r8Var.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = s5Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.V.addListener(new j8(this, n0Var3, view4, f0VarArr, zArr, rectF2, s5Var));
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
            p g10 = p.g(this.c);
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
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.p = 0.42f;
        long j3 = this.E;
        w9 w9Var = this.w;
        if (j3 == UserObject.ANONYMOUS) {
            g9Var.g(21);
            int i10 = org.telegram.ui.ActionBar.j6.c8;
            org.telegram.ui.ActionBar.f6 f6Var = this.b;
            g9Var.i(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
            w9Var.e(null, g9Var);
            return;
        }
        int i11 = this.c;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(this.E));
            g9Var.r(user);
            w9Var.e(user, g9Var);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-this.E));
            g9Var.q(chat);
            w9Var.e(chat, g9Var);
        }
    }

    public final void s(long j3) {
        q8 q8Var;
        long j10;
        long j11;
        long j12 = 0;
        if ((!this.d || this.e || j3 <= 0) && (q8Var = this.y) != null) {
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
                        m8 m8Var = new m8();
                        m8Var.a = z10;
                        m8Var.b = false;
                        m8Var.c = peerDialogId;
                        m8Var.d = j14;
                        arrayList.add(m8Var);
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
                m8 m8Var2 = new m8();
                m8Var2.a = z11;
                m8Var2.b = true;
                m8Var2.c = clientUserId;
                m8Var2.d = j15;
                arrayList.add(m8Var2);
            }
            Collections.sort(arrayList, new sg.p(14));
            q8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }
}
