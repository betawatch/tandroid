package zg;

import ai.f3;
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
import m4.u0;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x5;
import org.telegram.ui.h61;
import org.telegram.ui.p91;
import org.telegram.ui.x81;
import org.telegram.ui.zd;
import xh.g1;
import yh.w3;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q extends o2 implements NotificationCenter.NotificationCenterDelegate {
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
    public g1 c;
    public f d;
    public w8 e;
    public LinearLayout f;
    public zd h;
    public o n;
    public z7 r;
    public w8 s;
    public s0 v;
    public FrameLayout w;
    public ImageView x;
    public ao0 y;

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

    public final void W(x5 x5Var) {
        Editable text = this.n.getText();
        Layout layout = this.n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(x5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            x5[] x5VarArr = (x5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), x5.class);
            for (x5 x5Var2 : x5VarArr) {
                x5Var2.setAnimateChanges();
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
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new b2(this) { // from class: zg.g
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(c2 c2Var, int i11) {
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
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new b2(this) { // from class: zg.g
                public final /* synthetic */ q b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void f(c2 c2Var, int i112) {
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
            vc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
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
            this.c.animate().translationY(this.c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(qr.f).setUpdateListener(new i(this, 1)).setListener(new l(this, i10)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.n.getText());
        if (!this.n.hasSelection()) {
            return false;
        }
        x5[] x5VarArr = (x5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, x5.class);
        for (x5 x5Var : x5VarArr) {
            this.E.remove(Long.valueOf(x5Var.documentId));
            this.F.remove(Long.valueOf(x5Var.documentId));
            this.b.A(Long.valueOf(x5Var.documentId));
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
        int w02 = j6.w0(null, z12 ? j6.f6 : j6.e6, false);
        if (!z11) {
            this.e.setBackgroundColor(w02);
        } else if (z12) {
            this.e.b(w02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(w02);
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
            qr qrVar = qr.f;
            duration.setInterpolator(qrVar).setListener(new l(this, 2)).start();
            this.f.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).setListener(new l(this, 3)).start();
            return;
        }
        this.f.setVisibility(0);
        this.w.setVisibility(0);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.f.animate().setListener(null).cancel();
            ViewPropertyAnimator duration2 = this.f.animate().alpha(1.0f).setDuration(350L);
            qr qrVar2 = qr.f;
            duration2.setInterpolator(qrVar2).setListener(new l(this, 1)).start();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar2).start();
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
                    r0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.F, spannableStringBuilder, this.b, this.n.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.J) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.n.append(spannableStringBuilder);
                this.n.m();
                h61 h61Var = this.b.p0;
                if (h61Var != null) {
                    h61Var.l();
                }
                Y(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0462 A[EDGE_INSN: B:55:0x0462->B:56:0x0462 BREAK  A[LOOP:1: B:43:0x03b1->B:54:0x03b1], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        LinkedHashMap linkedHashMap;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        SpannableStringBuilder spannableStringBuilder2;
        ArrayList arrayList;
        int i11;
        ArrayList<TLRPC.Reaction> arrayList2;
        LinkedHashMap linkedHashMap2;
        SpannableStringBuilder spannableStringBuilder3;
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x81(this, 13));
        this.h = new zd(context);
        ao0 ao0Var = new ao0(context, this.h, this.resourceProvider, true);
        this.y = ao0Var;
        ao0Var.setFillViewport(true);
        this.actionBar.setAdaptiveBackground(this.y);
        w3 w3Var = new w3(this, context);
        this.h.setOrientation(1);
        this.y.addView(this.h);
        w8 w8Var = new w8(context);
        this.e = w8Var;
        w8Var.setHeight(56);
        w8 w8Var2 = this.e;
        w8Var2.setBackgroundColor(j6.w0(null, w8Var2.e.h ? j6.f6 : j6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(j6.g6, j6.O6, j6.P6, j6.Q6, j6.R6);
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
                        boolean z10 = qVar.e.e.h;
                        qVar.c0(z10 ? 2 : 1, z10 ? false : qVar.a, true);
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
                                    r0.f(-qVar2.M, i14, tL_premium_boostsStatus);
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
                            messagesController.setCustomChatReactions(j3, i15, b02, i16, valueOf, new j(qVar2, 1), new h(qVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        this.h.addView(this.e, w7.x5.n(-1, -2));
        e9 e9Var = new e9(context, 12, this.resourceProvider);
        int i13 = j6.B6;
        e9Var.setTextColor(j6.w0(null, i13, false));
        e9Var.setTopPadding(12);
        e9Var.setBottomPadding(16);
        e9Var.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        this.h.addView(e9Var, w7.x5.n(-1, -2));
        l4 l4Var = new l4(context);
        l4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        l4Var.setBackgroundColor(j6.w0(null, j6.d6, false));
        l4Var.setTextSize(15.0f);
        l4Var.setTopMargin(14);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        this.h.addView(this.f, w7.x5.c(-2.0f, -1));
        this.f.addView(l4Var, w7.x5.n(-1, -2));
        f6 resourceProvider = getResourceProvider();
        int i14 = this.J;
        o oVar = new o(this, context, resourceProvider, i14);
        this.n = oVar;
        oVar.setOnFocused(new h(this, 2));
        this.f.addView(this.n, w7.x5.n(-1, -2));
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        layoutTransition.enableTransitionType(4);
        this.f.setLayoutTransition(layoutTransition);
        e9 e9Var2 = new e9(context, 12, this.resourceProvider);
        e9Var2.setTextColor(j6.w0(null, i13, false));
        e9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), j6.gc, 0, new h(this, 3), getResourceProvider()));
        this.f.addView(e9Var2, w7.x5.n(-1, -2));
        l4 l4Var2 = new l4(context, this.resourceProvider);
        l4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        this.f.addView(l4Var2, w7.x5.n(-1, -2));
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
        y7Var.e = new u0(17);
        z7Var.d(i17, y7Var, new j(this, 2));
        this.f.addView(this.r, w7.x5.n(-1, -2));
        e9 e9Var3 = new e9(context, 12, this.resourceProvider);
        e9Var3.setTopPadding(12);
        e9Var3.setBottomPadding(16);
        e9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        this.f.addView(e9Var3, w7.x5.n(-1, -2));
        if (chatFull.paid_media_allowed) {
            w8 w8Var3 = new w8(context);
            this.s = w8Var3;
            w8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            this.f.addView(this.s, w7.x5.n(-1, -2));
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
                            boolean z10 = qVar.e.e.h;
                            qVar.c0(z10 ? 2 : 1, z10 ? false : qVar.a, true);
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
                                        r0.f(-qVar2.M, i142, tL_premium_boostsStatus);
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
                                messagesController.setCustomChatReactions(j3, i152, b02, i162, valueOf, new j(qVar2, 1), new h(qVar2, 1));
                                break;
                            }
                            break;
                    }
                }
            });
            e9 e9Var4 = new e9(context, 12, this.resourceProvider);
            e9Var4.setTextColor(j6.w0(null, i13, false));
            e9Var4.setTopPadding(12);
            e9Var4.setBottomPadding(70);
            e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new h(this, 4)));
            this.f.addView(e9Var4, w7.x5.n(-1, -2));
        } else {
            e9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imageView2 = this.x;
        int i20 = j6.a7;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i20, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.w.addView(this.x, w7.x5.e(-1, -1, 119));
        s0 s0Var = new s0(context, getResourceProvider(), true);
        this.v = s0Var;
        s0Var.e();
        s0 s0Var2 = this.v;
        s0Var2.getClass();
        s0Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        s0Var2.h0 = new SpannableStringBuilder("l");
        oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
        oqVar.setTopOffset(1);
        s0Var2.h0.setSpan(oqVar, 0, 1, 33);
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
                        boolean z10 = qVar.e.e.h;
                        qVar.c0(z10 ? 2 : 1, z10 ? false : qVar.a, true);
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
                                    r0.f(-qVar2.M, i142, tL_premium_boostsStatus);
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
                            messagesController.setCustomChatReactions(j3, i152, b02, i162, valueOf, new j(qVar2, 1), new h(qVar2, 1));
                            break;
                        }
                        break;
                }
            }
        });
        w3Var.addView(this.y);
        w3Var.addView(this.w, w7.x5.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.v, w7.x5.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        w3Var.setBackgroundColor(j6.w0(null, i20, false));
        g1 g1Var = new g1(this, context, 3);
        this.c = g1Var;
        g1Var.setVisibility(4);
        w3Var.addView(this.c, w7.x5.e(-1, -2, 80));
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z10 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.F;
        LinkedHashMap linkedHashMap3 = this.E;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList3.size();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i23 >= size) {
                    linkedHashMap2 = linkedHashMap3;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList3.get(i23);
                i23++;
                ArrayList arrayList5 = arrayList4;
                linkedHashMap2 = linkedHashMap3;
                r0.a((TLRPC.TL_availableReaction) obj, linkedHashMap2, arrayList5, spannableStringBuilder4, this.b, this.n.getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i22++;
                if (i22 >= i14) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
                linkedHashMap3 = linkedHashMap2;
                arrayList4 = arrayList5;
            }
            this.n.append(spannableStringBuilder3);
            c0(0, this.a, false);
            linkedHashMap = linkedHashMap2;
        } else {
            ArrayList arrayList6 = arrayList4;
            LinkedHashMap linkedHashMap4 = linkedHashMap3;
            if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                ArrayList<TLRPC.Reaction> arrayList7 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size2 = arrayList7.size();
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    if (i25 >= size2) {
                        linkedHashMap = linkedHashMap4;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        break;
                    }
                    TLRPC.Reaction reaction = arrayList7.get(i25);
                    i25++;
                    TLRPC.Reaction reaction2 = reaction;
                    if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                        TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                        if (tL_availableReaction == null) {
                            continue;
                        } else {
                            r0.a(tL_availableReaction, linkedHashMap4, arrayList6, spannableStringBuilder5, this.b, this.n.getFontMetricsInt());
                            linkedHashMap = linkedHashMap4;
                            arrayList = arrayList6;
                            spannableStringBuilder2 = spannableStringBuilder5;
                            i24++;
                        }
                    } else {
                        linkedHashMap = linkedHashMap4;
                        arrayList = arrayList6;
                        spannableStringBuilder2 = spannableStringBuilder5;
                        if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                            p pVar = this.b;
                            i11 = i25;
                            x5 e = r0.e(null, Long.valueOf(tL_reactionCustomEmoji.document_id), this.n.getFontMetricsInt());
                            linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                            arrayList = arrayList;
                            arrayList.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                            SpannableString spannableString = new SpannableString("e");
                            arrayList2 = arrayList7;
                            spannableString.setSpan(e, 0, spannableString.length(), 33);
                            spannableStringBuilder2.append((CharSequence) spannableString);
                            if (pVar != null) {
                                pVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                            }
                            i24++;
                            if (i24 < i14) {
                                break;
                            }
                            spannableStringBuilder5 = spannableStringBuilder2;
                            arrayList6 = arrayList;
                            linkedHashMap4 = linkedHashMap;
                            arrayList7 = arrayList2;
                            i25 = i11;
                        }
                    }
                    arrayList2 = arrayList7;
                    i11 = i25;
                    if (i24 < i14) {
                    }
                }
                this.n.append(spannableStringBuilder2);
                c0(1, this.a, false);
            } else {
                linkedHashMap = linkedHashMap4;
                ArrayList arrayList8 = arrayList6;
                boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z11 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    c0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.S == i10 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed) {
                        d0();
                    }
                    this.G.putAll(linkedHashMap);
                    this.I = this.a;
                    this.fragmentView = w3Var;
                    return w3Var;
                }
                if (z11) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                    int size3 = arrayList3.size();
                    int i26 = 0;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= size3) {
                            spannableStringBuilder = spannableStringBuilder6;
                            break;
                        }
                        Object obj2 = arrayList3.get(i27);
                        i27++;
                        ArrayList arrayList9 = arrayList8;
                        r0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList9, spannableStringBuilder6, this.b, this.n.getFontMetricsInt());
                        spannableStringBuilder = spannableStringBuilder6;
                        i26++;
                        if (i26 >= i14) {
                            break;
                        }
                        spannableStringBuilder6 = spannableStringBuilder;
                        arrayList8 = arrayList9;
                    }
                    this.n.append(spannableStringBuilder);
                    i10 = 2;
                    c0(2, this.a, false);
                    this.e.f(LocaleController.getString(R.string.EnableReactions), this.S == i10 || this.a, false);
                    this.n.m();
                    if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                        d0();
                    }
                    this.G.putAll(linkedHashMap);
                    this.I = this.a;
                    this.fragmentView = w3Var;
                    return w3Var;
                }
            }
        }
        i10 = 2;
        this.e.f(LocaleController.getString(R.string.EnableReactions), this.S == i10 || this.a, false);
        this.n.m();
        if (chatFull.paid_media_allowed) {
        }
        this.G.putAll(linkedHashMap);
        this.I = this.a;
        this.fragmentView = w3Var;
        return w3Var;
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
            x5 x5Var = (x5) linkedHashMap.remove(-1L);
            if (x5Var != null) {
                x5Var.setRemoved(new uh.i(27, this, x5Var));
            }
            W(x5Var);
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
                mVar.cacheType = o5.g();
                mVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, mVar);
                spannableString.setSpan(mVar, 0, spannableString.length(), 33);
                this.n.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                Y(true);
                W(mVar);
            } catch (Exception e) {
                FileLog.e(e);
            }
            c0(this.S, true, true);
        }
        this.n.updateAnimatedEmoji(true);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            e5 e5Var = this.parentLayout;
            if (e5Var == null || e5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.M;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.P = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.P = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.P, true);
            }
            return false;
        }
        if (this.L != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new f3(this, 11));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.H.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        this.T = true;
        this.n.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.o2
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

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.n.setFocusableInTouchMode(true);
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            p pVar = new p(this, this, getParentActivity(), getResourceProvider(), j6.v0(j6.G6, getResourceProvider()));
            this.b = pVar;
            pVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(j6.w0(null, j6.d6, false));
            this.c.addView(this.b, w7.x5.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new j(this, 0));
            this.c.addView(this.d, w7.x5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new p91(20), 200L);
    }
}
