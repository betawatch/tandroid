package zg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.s5;
import org.telegram.ui.j61;
import org.telegram.ui.p81;
import org.telegram.ui.t21;
import org.telegram.ui.yd;
import rg.t0;
import w7.x5;
import yh.t5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class q extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap E;
    public final ArrayList F;
    public final LinkedHashMap G;
    public final ArrayList H;
    public boolean I;
    public final int J;
    public boolean K;
    public final TLRPC.ChatFull L;
    public final long M;
    public int N;
    public int O;
    public TLRPC.Chat P;
    public TL_stories.TL_premium_boostsStatus Q;
    public int R;
    public int S;
    public boolean T;
    public final h U;
    public boolean a;
    public p b;
    public t0 c;
    public f d;
    public w8 e;
    public LinearLayout f;
    public yd h;
    public o n;
    public z7 r;
    public w8 s;
    public q0 v;
    public FrameLayout w;
    public ImageView x;
    public ep0 y;

    public q(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new LinkedHashMap();
        this.F = new ArrayList();
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.J = getMessagesController().boostsChannelLevelMax;
        this.K = false;
        this.S = -1;
        this.U = new h(this, 5);
        this.M = j3;
        this.L = chatFull;
    }

    public final void W(b6 b6Var) {
        Editable text = this.n.getText();
        Layout layout = this.n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(b6Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            b6[] b6VarArr = (b6[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), b6.class);
            for (b6 b6Var2 : b6VarArr) {
                b6Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = !this.E.keySet().equals(this.G.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Q;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.R) {
            z11 = false;
        }
        boolean z12 = this.I == this.a ? z11 : true;
        if (z10 && z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) { // from class: zg.g
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.v.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) { // from class: zg.g
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void f(b2 b2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.v.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z12;
    }

    public final void Y(boolean z10) {
        if (this.Q == null) {
            return;
        }
        if (this.S == 0) {
            this.S = 1;
        }
        int size = b0(true).size();
        this.R = size;
        if (this.Q.level >= size) {
            this.v.f(null, true);
            return;
        }
        if (z10) {
            ad.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.v.setLvlRequiredState(this.R);
    }

    public final void Z() {
        if (this.K) {
            int i10 = 0;
            this.K = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.n.clearFocus();
            } else {
                this.f.setFocusableInTouchMode(true);
                this.f.requestFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.c.animate().setListener(null).cancel();
            this.c.animate().translationY(this.c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(hs.f).setUpdateListener(new j(this, 1)).setListener(new l(this, i10)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n.getText());
        if (!this.n.hasSelection()) {
            return false;
        }
        b6[] b6VarArr = (b6[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, b6.class);
        for (b6 b6Var : b6VarArr) {
            this.E.remove(Long.valueOf(b6Var.documentId));
            this.F.remove(Long.valueOf(b6Var.documentId));
            this.b.A(Long.valueOf(b6Var.documentId));
        }
        this.n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.F;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.H;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l4.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i11);
                    i11++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l4.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z10 ? arrayList2 : arrayList;
    }

    public final void c0(int i10, boolean z10, boolean z11) {
        if (this.S == i10 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i10 == 1 || i10 == 0 || z10;
        this.e.setChecked(z12);
        int x02 = i6.x0(null, z12 ? i6.f6 : i6.e6, false);
        if (!z11) {
            this.e.setBackgroundColor(x02);
        } else if (z12) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.S = i10;
        if (i10 != 1 && i10 != 0 && !z10) {
            if (!z11) {
                this.f.setVisibility(4);
                this.w.setVisibility(4);
                return;
            }
            Z();
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration = this.w.animate().alpha(0.0f).setDuration(350L);
            hs hsVar = hs.f;
            duration.setInterpolator(hsVar).setListener(new l(this, 2)).start();
            this.f.animate().alpha(0.0f).setDuration(350L).setInterpolator(hsVar).setListener(new l(this, 3)).start();
            return;
        }
        this.f.setVisibility(0);
        this.w.setVisibility(0);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.f.animate().alpha(1.0f).setDuration(350L);
            hs hsVar2 = hs.f;
            duration2.setInterpolator(hsVar2).setListener(new l(this, 1)).start();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(hsVar2).start();
            LinkedHashMap linkedHashMap = this.E;
            if (linkedHashMap.isEmpty()) {
                this.b.K.clear();
                this.n.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.H;
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    p0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.F, spannableStringBuilder, this.b, this.n.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.J) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.n.append(spannableStringBuilder);
                this.n.m();
                j61 j61Var = this.b.p0;
                if (j61Var != null) {
                    j61Var.l();
                }
                Y(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0460 A[EDGE_INSN: B:55:0x0460->B:56:0x0460 BREAK  A[LOOP:1: B:43:0x03b1->B:54:0x03b1], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        int i10;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i11;
        ArrayList<TLRPC.Reaction> arrayList2;
        char c10;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 14));
        this.h = new yd(context);
        ep0 ep0Var = new ep0(context, this.h, this.resourceProvider, true);
        this.y = ep0Var;
        ep0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        xh.m mVar = new xh.m(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        w8 w8Var = new w8(context);
        this.e = w8Var;
        w8Var.setHeight(56);
        w8 w8Var2 = this.e;
        w8Var2.setBackgroundColor(i6.x0(null, w8Var2.e.h ? i6.f6 : i6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(i6.g6, i6.O6, i6.P6, i6.Q6, i6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: zg.k
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8 w8Var3;
                switch (i12) {
                    case 0:
                        q qVar = this.b;
                        if (qVar.e.e.h && (w8Var3 = qVar.s) != null && w8Var3.e.h) {
                            qVar.d0();
                        }
                        boolean z11 = qVar.e.e.h;
                        qVar.c0(z11 ? 2 : 1, z11 ? false : qVar.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        q qVar2 = this.b;
                        if (!qVar2.v.N) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qVar2.Q;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = qVar2.R;
                                if (i13 < i14) {
                                    p0.f(-qVar2.M, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            w8 w8Var4 = qVar2.s;
                            Boolean valueOf = (w8Var4 == null || !qVar2.L.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                            qVar2.v.setLoading(true);
                            MessagesController messagesController = qVar2.getMessagesController();
                            long j3 = qVar2.M;
                            int i15 = qVar2.S;
                            ArrayList b02 = qVar2.b0(false);
                            int i16 = qVar2.O;
                            qVar2.N = i16;
                            messagesController.setCustomChatReactions(j3, i15, b02, i16, valueOf, new i(qVar2, 2), new h(qVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        this.h.addView(this.e, x5.n(-1, -2));
        e9 e9Var = new e9(context, 12, this.resourceProvider);
        int i13 = i6.B6;
        e9Var.setTextColor(i6.x0(null, i13, false));
        e9Var.setTopPadding(12);
        e9Var.setBottomPadding(16);
        e9Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(e9Var, x5.n(-1, -2));
        m4 m4Var = new m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        m4Var.setBackgroundColor(i6.x0(null, i6.d6, false));
        m4Var.setTextSize(15.0f);
        m4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, x5.d(-2.0f, -1));
        this.f.addView(m4Var, x5.n(-1, -2));
        e6 resourceProvider = getResourceProvider();
        int i14 = this.J;
        o oVar = new o(this, context, resourceProvider, i14);
        this.n = oVar;
        oVar.setOnFocused(new h(this, 2));
        this.f.addView(this.n, x5.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        e9 e9Var2 = new e9(context, 12, this.resourceProvider);
        e9Var2.setTextColor(i6.x0(null, i13, false));
        e9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), i6.gc, 0, new h(this, 3), getResourceProvider()));
        this.f.addView(e9Var2, x5.n(-1, -2));
        m4 m4Var2 = new m4(context, this.resourceProvider);
        m4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.f.addView(m4Var2, x5.n(-1, -2));
        this.r = new z7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.L;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i15 = getMessagesController().reactionsUniqMax;
            this.O = i15;
            this.N = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.O = i16;
            this.N = i16;
        }
        z7 z7Var = this.r;
        int i17 = this.O;
        int i18 = getMessagesController().reactionsUniqMax;
        y7 y7Var = new y7();
        y7Var.a = 1;
        y7Var.b = i18;
        y7Var.e = new m4.q0(25);
        z7Var.d(i17, y7Var, new i(this, 3));
        this.f.addView(this.r, x5.n(-1, -2));
        e9 e9Var3 = new e9(context, 12, this.resourceProvider);
        e9Var3.setTopPadding(12);
        e9Var3.setBottomPadding(16);
        e9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(e9Var3, x5.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            w8 w8Var3 = new w8(context);
            this.s = w8Var3;
            w8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, x5.n(-1, -2));
            final int i19 = 1;
            this.s.setOnClickListener(new View.OnClickListener(this) { // from class: zg.k
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w8 w8Var32;
                    switch (i19) {
                        case 0:
                            q qVar = this.b;
                            if (qVar.e.e.h && (w8Var32 = qVar.s) != null && w8Var32.e.h) {
                                qVar.d0();
                            }
                            boolean z11 = qVar.e.e.h;
                            qVar.c0(z11 ? 2 : 1, z11 ? false : qVar.a, true);
                            break;
                        case 1:
                            this.b.d0();
                            break;
                        default:
                            q qVar2 = this.b;
                            if (!qVar2.v.N) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qVar2.Q;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = qVar2.R;
                                    if (i132 < i142) {
                                        p0.f(-qVar2.M, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                w8 w8Var4 = qVar2.s;
                                Boolean valueOf = (w8Var4 == null || !qVar2.L.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                                qVar2.v.setLoading(true);
                                MessagesController messagesController = qVar2.getMessagesController();
                                long j3 = qVar2.M;
                                int i152 = qVar2.S;
                                ArrayList b02 = qVar2.b0(false);
                                int i162 = qVar2.O;
                                qVar2.N = i162;
                                messagesController.setCustomChatReactions(j3, i152, b02, i162, valueOf, new i(qVar2, 2), new h(qVar2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
            e9 e9Var4 = new e9(context, 12, this.resourceProvider);
            e9Var4.setTextColor(i6.x0(null, i13, false));
            e9Var4.setTopPadding(12);
            e9Var4.setBottomPadding(70);
            e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new h(this, 4)));
            this.f.addView(e9Var4, x5.n(-1, -2));
        } else {
            e9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i20 = i6.a7;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.w0(i20, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.w.addView(this.x, x5.e(-1, -1, 119));
        q0 q0Var = new q0(context, getResourceProvider(), true);
        this.v = q0Var;
        q0Var.e();
        q0 q0Var2 = this.v;
        q0Var2.getClass();
        q0Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        q0Var2.h0 = new SpannableStringBuilder("l");
        er erVar = new er(R.drawable.mini_switch_lock, 0);
        erVar.setTopOffset(1);
        char c11 = '!';
        q0Var2.h0.setSpan(erVar, 0, 1, 33);
        final int i21 = 2;
        this.v.setOnClickListener(new View.OnClickListener(this) { // from class: zg.k
            public final /* synthetic */ q b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8 w8Var32;
                switch (i21) {
                    case 0:
                        q qVar = this.b;
                        if (qVar.e.e.h && (w8Var32 = qVar.s) != null && w8Var32.e.h) {
                            qVar.d0();
                        }
                        boolean z11 = qVar.e.e.h;
                        qVar.c0(z11 ? 2 : 1, z11 ? false : qVar.a, true);
                        break;
                    case 1:
                        this.b.d0();
                        break;
                    default:
                        q qVar2 = this.b;
                        if (!qVar2.v.N) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = qVar2.Q;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = qVar2.R;
                                if (i132 < i142) {
                                    p0.f(-qVar2.M, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            w8 w8Var4 = qVar2.s;
                            Boolean valueOf = (w8Var4 == null || !qVar2.L.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                            qVar2.v.setLoading(true);
                            MessagesController messagesController = qVar2.getMessagesController();
                            long j3 = qVar2.M;
                            int i152 = qVar2.S;
                            ArrayList b02 = qVar2.b0(false);
                            int i162 = qVar2.O;
                            qVar2.N = i162;
                            messagesController.setCustomChatReactions(j3, i152, b02, i162, valueOf, new i(qVar2, 2), new h(qVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        mVar.addView(this.y);
        mVar.addView(this.w, x5.a(74.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        this.w.addView(this.v, x5.a(48.0f, 13.0f, 13.0f, 13.0f, 13.0f, -1, 80));
        mVar.setBackgroundColor(i6.x0(null, i20, false));
        t0 t0Var = new t0(this, context, 5);
        this.c = t0Var;
        t0Var.setVisibility(4);
        mVar.addView(this.c, x5.e(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.F;
        LinkedHashMap linkedHashMap3 = this.E;
        if (!z11) {
            ArrayList arrayList5 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList6 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size = arrayList6.size();
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    if (i23 >= size) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList6.get(i23);
                    i23++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction == null) {
                            continue;
                        } else {
                            p0.a(tL_availableReaction, linkedHashMap4, arrayList5, spannableStringBuilder4, this.b, this.n.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList5;
                            spannableStringBuilder2 = spannableStringBuilder4;
                            i22++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList5;
                        spannableStringBuilder2 = spannableStringBuilder4;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            p pVar = this.b;
                            i11 = i23;
                            b6 e7 = p0.e(null, Long.valueOf(tL_reactionCustomEmoji.document_id), this.n.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e7);
                            arrayList = arrayList;
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList6;
                            c10 = '!';
                            spannableString.setSpan(e7, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (pVar != null) {
                                pVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i22++;
                            if (i22 < i14) {
                                break;
                            }
                            c11 = c10;
                            spannableStringBuilder4 = spannableStringBuilder2;
                            arrayList5 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList6 = arrayList2;
                            i23 = i11;
                        }
                    }
                    arrayList2 = arrayList6;
                    i11 = i23;
                    c10 = c11;
                    if (i22 < i14) {
                    }
                }
                this.n.append(spannableStringBuilder2);
                c0(1, this.a, false);
                z10 = true;
                i10 = 2;
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList7 = arrayList5;
                boolean z12 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z12 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    c0(2, this.a, false);
                    z10 = true;
                } else if (z12) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    int size2 = arrayList3.size();
                    int i24 = 0;
                    int i25 = 0;
                    while (true) {
                        if (i25 >= size2) {
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            break;
                        }
                        Object obj = arrayList3.get(i25);
                        i25++;
                        ArrayList arrayList8 = arrayList7;
                        p0.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList8, spannableStringBuilder5, this.b, this.n.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder5;
                        z10 = true;
                        i24++;
                        if (i24 >= i14) {
                            break;
                        }
                        spannableStringBuilder5 = spannableStringBuilder;
                        arrayList7 = arrayList8;
                    }
                    this.n.append(spannableStringBuilder);
                    i10 = 2;
                    c0(2, this.a, false);
                }
            }
            this.e.f(LocaleController.getString(R.string.EnableReactions), (this.S == i10 || this.a) ? z10 : false, false);
            this.n.m();
            if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                d0();
            }
            this.G.putAll(linkedHashMap);
            this.I = this.a;
            this.fragmentView = mVar;
            return mVar;
        }
        SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
        int size3 = arrayList3.size();
        int i26 = 0;
        int i27 = 0;
        while (true) {
            if (i27 >= size3) {
                linkedHashMap2 = linkedHashMap3;
                spannableStringBuilder3 = spannableStringBuilder6;
                break;
            }
            Object obj2 = arrayList3.get(i27);
            i27++;
            ArrayList arrayList9 = arrayList4;
            linkedHashMap2 = linkedHashMap3;
            p0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap2, arrayList9, spannableStringBuilder6, this.b, this.n.getFontMetricsInt());
            spannableStringBuilder3 = spannableStringBuilder6;
            i26++;
            if (i26 >= i14) {
                break;
            }
            spannableStringBuilder6 = spannableStringBuilder3;
            linkedHashMap3 = linkedHashMap2;
            arrayList4 = arrayList9;
        }
        this.n.append(spannableStringBuilder3);
        c0(0, this.a, false);
        linkedHashMap = linkedHashMap2;
        i10 = 2;
        z10 = true;
        this.e.f(LocaleController.getString(R.string.EnableReactions), (this.S == i10 || this.a) ? z10 : false, false);
        this.n.m();
        if (chatFull.paid_media_allowed) {
            d0();
        }
        this.G.putAll(linkedHashMap);
        this.I = this.a;
        this.fragmentView = mVar;
        return mVar;
    }

    public final void d0() {
        w8 w8Var = this.s;
        boolean z10 = w8Var.e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            b6 b6Var = (b6) linkedHashMap.remove(-1L);
            if (b6Var != null) {
                b6Var.setRemoved(new t5(2, this, b6Var));
            }
            W(b6Var);
            this.b.x(-1L, true);
            Y(false);
            this.n.setMaxLength(i10);
            c0(this.S, this.a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                m mVar = new m(this);
                mVar.cacheType = s5.g();
                mVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, mVar);
                spannableString.setSpan(mVar, 0, spannableString.length(), 33);
                this.n.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                Y(true);
                W(mVar);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            c0(this.S, true, true);
        }
        this.n.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            d5 d5Var = this.parentLayout;
            if (d5Var == null || d5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.K) {
            if (z10) {
                Z();
                return false;
            }
        } else if (!X(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.M;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.P = chat;
        int i10 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.P = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.P, true);
            }
            return false;
        }
        if (this.L != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new i(this, i10));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.H.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        this.T = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.n.setFocusable(true);
            this.n.setFocusableInTouchMode(true);
            if (this.K) {
                this.n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            p pVar = new p(this, this, getParentActivity(), getResourceProvider(), i6.w0(i6.G6, getResourceProvider()));
            this.b = pVar;
            pVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(i6.x0(null, i6.d6, false));
            this.c.addView(this.b, x5.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, x5.a(-2.0f, 0.0f, 0.0f, 8.0f, 8.0f, -1, 85));
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new t21(24), 200L);
    }
}
