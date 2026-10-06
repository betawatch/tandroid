package zg;

import android.content.Context;
import android.graphics.Paint;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.y7;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.n21;
import org.telegram.ui.p81;
import org.telegram.ui.z51;
import rg.j1;
import yh.o7;
import yh.s5;
import yh.u3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class o extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public e71 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public final int M;
    public boolean N;
    public boolean O;
    public le.b P;
    public final TLRPC.ChatFull Q;
    public final long R;
    public int S;
    public int T;
    public TLRPC.Chat U;
    public TL_stories.TL_premium_boostsStatus V;
    public int W;
    public int X;
    public boolean Y;
    public final h Z;
    public boolean a;
    public m b;
    public j1 c;
    public f d;
    public w8 e;
    public e9 f;
    public l h;
    public z7 n;
    public w8 r;
    public p0 s;
    public FrameLayout v;
    public ImageView w;
    public int x;
    public final Paint y;

    public o(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.y = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.M = getMessagesController().boostsChannelLevelMax;
        this.N = false;
        this.X = -1;
        this.Z = new h(this, 6);
        this.R = j3;
        this.Q = chatFull;
    }

    public final void U(View view, boolean z10) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z10));
    }

    public final void W(z5 z5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(z5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            z5[] z5VarArr = (z5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), z5.class);
            for (z5 z5Var2 : z5VarArr) {
                z5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.W) {
            z11 = false;
        }
        boolean z12 = this.L == this.a ? z11 : true;
        if (z10 && z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            final int i10 = 0;
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) { // from class: zg.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(b2 b2Var, int i11) {
                    switch (i10) {
                        case 0:
                            this.b.s.performClick();
                            break;
                        default:
                            this.b.finishFragment();
                            break;
                    }
                }
            });
            final int i11 = 1;
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) { // from class: zg.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.a2
                public final void g(b2 b2Var, int i112) {
                    switch (i11) {
                        case 0:
                            this.b.s.performClick();
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
        if (this.V == null) {
            return;
        }
        if (this.X == 0) {
            this.X = 1;
        }
        int size = c0(true).size();
        this.W = size;
        if (this.V.level >= size) {
            this.s.f(null, true);
            return;
        }
        if (z10) {
            yc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.W);
    }

    public final void Z() {
        if (this.N) {
            this.N = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.c.setLayerType(2, null);
            this.P.a(false, true);
        }
    }

    public final boolean b0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, z5.class);
        for (z5 z5Var : z5VarArr) {
            this.H.remove(Long.valueOf(z5Var.documentId));
            this.I.remove(Long.valueOf(z5Var.documentId));
            this.b.A(Long.valueOf(z5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList c0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.K;
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

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03cc A[EDGE_INSN: B:54:0x03cc->B:55:0x03cc BREAK  A[LOOP:1: B:42:0x0334->B:53:0x0334], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        int i11;
        ArrayList<TLRPC.Reaction> arrayList;
        setHasOwnBackground(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 12));
        TLRPC.Document document = null;
        e71 e71Var = new e71(this, new o7(this, 2), null, null);
        this.E = e71Var;
        e71Var.setSections(true);
        this.E.setSectionsDrawBackground(true);
        u3 u3Var = new u3(this, context);
        u3Var.setFocusableInTouchMode(true);
        u3Var.requestFocus();
        w8 w8Var = new w8(context);
        this.e = w8Var;
        w8Var.setHeight(56);
        w8 w8Var2 = this.e;
        w8Var2.setBackgroundColor(i6.w0(null, w8Var2.e.h ? i6.f6 : i6.e6, false));
        this.e.setTypeface(AndroidUtilities.bold());
        this.e.d(i6.g6, i6.O6, i6.P6, i6.Q6, i6.R6);
        final int i12 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: zg.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8 w8Var3;
                switch (i12) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (w8Var3 = oVar.r) != null && w8Var3.e.h) {
                            oVar.f0();
                        }
                        boolean z10 = oVar.e.e.h;
                        oVar.d0(z10 ? 2 : 1, z10 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.f0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.N) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.V;
                            if (tL_premium_boostsStatus != null) {
                                int i13 = tL_premium_boostsStatus.level;
                                int i14 = oVar2.W;
                                if (i13 < i14) {
                                    o0.f(-oVar2.R, i14, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            w8 w8Var4 = oVar2.r;
                            Boolean valueOf = (w8Var4 == null || !oVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                            oVar2.s.setLoading(true);
                            MessagesController messagesController = oVar2.getMessagesController();
                            long j3 = oVar2.R;
                            int i15 = oVar2.X;
                            ArrayList c02 = oVar2.c0(false);
                            int i16 = oVar2.T;
                            oVar2.S = i16;
                            int i17 = 2;
                            messagesController.setCustomChatReactions(j3, i15, c02, i16, valueOf, new i(oVar2, i17), new h(oVar2, i17));
                            break;
                        }
                        break;
                }
            }
        });
        e9 e9Var = new e9(context, 12, this.resourceProvider);
        this.f = e9Var;
        int i13 = i6.B6;
        e9Var.setTextColor(i6.w0(null, i13, false));
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(LocaleController.getString(R.string.ReactionAddEmojiFromAnyPack));
        m4 m4Var = new m4(context);
        m4Var.setText(LocaleController.getString(R.string.AvailableReactions));
        m4Var.setBackgroundColor(i6.w0(null, i6.d6, false));
        m4Var.setTextSize(15.0f);
        m4Var.setTopMargin(14);
        U(m4Var, false);
        d6 resourceProvider = getResourceProvider();
        int i14 = this.M;
        l lVar = new l(this, context, resourceProvider, i14);
        this.h = lVar;
        lVar.setOnFocused(new h(this, 3));
        U(this.h, false);
        e9 e9Var2 = new e9(context, 12, this.resourceProvider);
        e9Var2.setTextColor(i6.w0(null, i13, false));
        e9Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ReactionCreateOwnPack), i6.gc, 0, new h(this, 4), getResourceProvider()));
        U(e9Var2, true);
        m4 m4Var2 = new m4(context, this.resourceProvider);
        m4Var2.setText(LocaleController.getString(R.string.MaximumReactionsHeader));
        U(m4Var2, false);
        this.n = new z7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.Q;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & 8192) != 0 : (chatFull.flags & 1048576) != 0) {
            int i15 = getMessagesController().reactionsUniqMax;
            this.T = i15;
            this.S = i15;
        } else {
            int i16 = chatFull.reactions_limit;
            this.T = i16;
            this.S = i16;
        }
        z7 z7Var = this.n;
        int i17 = this.T;
        int i18 = getMessagesController().reactionsUniqMax;
        y7 y7Var = new y7();
        y7Var.a = 1;
        y7Var.b = i18;
        int i19 = 3;
        y7Var.e = new org.telegram.ui.m4(i19);
        z7Var.d(i17, y7Var, new i(this, i19));
        U(this.n, false);
        e9 e9Var3 = new e9(context, 12, this.resourceProvider);
        e9Var3.setTopPadding(12);
        e9Var3.setBottomPadding(16);
        e9Var3.setText(LocaleController.getString(R.string.MaximumReactionsInfo));
        U(e9Var3, true);
        if (chatFull.paid_media_allowed) {
            w8 w8Var3 = new w8(context);
            this.r = w8Var3;
            w8Var3.f(LocaleController.getString(R.string.ChannelEnablePaidReactions), false, false);
            U(this.r, false);
            final int i20 = 1;
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: zg.j
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w8 w8Var32;
                    switch (i20) {
                        case 0:
                            o oVar = this.b;
                            if (oVar.e.e.h && (w8Var32 = oVar.r) != null && w8Var32.e.h) {
                                oVar.f0();
                            }
                            boolean z10 = oVar.e.e.h;
                            oVar.d0(z10 ? 2 : 1, z10 ? false : oVar.a, true);
                            break;
                        case 1:
                            this.b.f0();
                            break;
                        default:
                            o oVar2 = this.b;
                            if (!oVar2.s.N) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.V;
                                if (tL_premium_boostsStatus != null) {
                                    int i132 = tL_premium_boostsStatus.level;
                                    int i142 = oVar2.W;
                                    if (i132 < i142) {
                                        o0.f(-oVar2.R, i142, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                w8 w8Var4 = oVar2.r;
                                Boolean valueOf = (w8Var4 == null || !oVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                                oVar2.s.setLoading(true);
                                MessagesController messagesController = oVar2.getMessagesController();
                                long j3 = oVar2.R;
                                int i152 = oVar2.X;
                                ArrayList c02 = oVar2.c0(false);
                                int i162 = oVar2.T;
                                oVar2.S = i162;
                                int i172 = 2;
                                messagesController.setCustomChatReactions(j3, i152, c02, i162, valueOf, new i(oVar2, i172), new h(oVar2, i172));
                                break;
                            }
                            break;
                    }
                }
            });
            e9 e9Var4 = new e9(context, 12, this.resourceProvider);
            e9Var4.setTextColor(i6.w0(null, i13, false));
            e9Var4.setTopPadding(12);
            e9Var4.setBottomPadding(70);
            e9Var4.setText(AndroidUtilities.withLearnMore(LocaleController.getString(R.string.ChannelEnablePaidReactionsInfo), new h(this, 5)));
            U(e9Var4, true);
        } else {
            e9Var3.setBottomPadding(70);
        }
        this.v = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.w.setScaleType(ImageView.ScaleType.FIT_XY);
        this.w.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.a7, this.resourceProvider), PorterDuff.Mode.SRC_ATOP));
        this.v.addView(this.w, w7.z5.e(-1, -1, 119));
        p0 p0Var = new p0(context, getResourceProvider(), true);
        this.s = p0Var;
        p0Var.e();
        p0 p0Var2 = this.s;
        p0Var2.getClass();
        p0Var2.g(new SpannableStringBuilder(LocaleController.getString(R.string.ReactionUpdateReactionsBtn)), false, true);
        p0Var2.h0 = new SpannableStringBuilder("l");
        rq rqVar = new rq(R.drawable.mini_switch_lock, 0);
        rqVar.setTopOffset(1);
        p0Var2.h0.setSpan(rqVar, 0, 1, 33);
        final int i21 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: zg.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8 w8Var32;
                switch (i21) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (w8Var32 = oVar.r) != null && w8Var32.e.h) {
                            oVar.f0();
                        }
                        boolean z10 = oVar.e.e.h;
                        oVar.d0(z10 ? 2 : 1, z10 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.f0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.N) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.V;
                            if (tL_premium_boostsStatus != null) {
                                int i132 = tL_premium_boostsStatus.level;
                                int i142 = oVar2.W;
                                if (i132 < i142) {
                                    o0.f(-oVar2.R, i142, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            w8 w8Var4 = oVar2.r;
                            Boolean valueOf = (w8Var4 == null || !oVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(w8Var4.e.h);
                            oVar2.s.setLoading(true);
                            MessagesController messagesController = oVar2.getMessagesController();
                            long j3 = oVar2.R;
                            int i152 = oVar2.X;
                            ArrayList c02 = oVar2.c0(false);
                            int i162 = oVar2.T;
                            oVar2.S = i162;
                            int i172 = 2;
                            messagesController.setCustomChatReactions(j3, i152, c02, i162, valueOf, new i(oVar2, i172), new h(oVar2, i172));
                            break;
                        }
                        break;
                }
            }
        });
        u3Var.addView(this.E);
        u3Var.addView(this.v, w7.z5.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.v.addView(this.s, w7.z5.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        g0();
        j1 j1Var = new j1(this, context);
        this.c = j1Var;
        j1Var.setVisibility(4);
        u3Var.addView(this.c, w7.z5.e(-1, -2, 80));
        this.P = new le.b(0, new n2.c(this, 28), tr.f, 350L, false);
        h0();
        i0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z10 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.I;
        LinkedHashMap linkedHashMap = this.H;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int size = arrayList2.size();
            int i22 = 0;
            int i23 = 0;
            while (i23 < size) {
                Object obj = arrayList2.get(i23);
                i23++;
                o0.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList3, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                i22++;
                if (i22 >= i14) {
                    break;
                }
            }
            this.h.append(spannableStringBuilder);
            d0(0, this.a, false);
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size2 = arrayList4.size();
            int i24 = 0;
            int i25 = 0;
            while (i25 < size2) {
                TLRPC.Reaction reaction = arrayList4.get(i25);
                i25++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction != null) {
                        o0.a(tL_availableReaction, linkedHashMap, arrayList3, spannableStringBuilder2, this.b, this.h.getFontMetricsInt());
                        i24++;
                    }
                } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                    TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                    m mVar = this.b;
                    i11 = i25;
                    z5 e7 = o0.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                    linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e7);
                    arrayList3.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                    SpannableString spannableString = new SpannableString("e");
                    arrayList = arrayList4;
                    spannableString.setSpan(e7, 0, spannableString.length(), 33);
                    spannableStringBuilder2.append((CharSequence) spannableString);
                    if (mVar != null) {
                        mVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                    }
                    i24++;
                    if (i24 < i14) {
                        break;
                    }
                    arrayList4 = arrayList;
                    i25 = i11;
                    document = null;
                }
                arrayList = arrayList4;
                i11 = i25;
                if (i24 < i14) {
                }
            }
            this.h.append(spannableStringBuilder2);
            d0(1, this.a, false);
        } else {
            boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
            if (z11 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                i10 = 2;
                d0(2, this.a, false);
                this.e.f(LocaleController.getString(R.string.EnableReactions), this.X == i10 || this.a, false);
                this.h.m();
                if (chatFull.paid_media_allowed) {
                    f0();
                }
                this.J.putAll(linkedHashMap);
                this.L = this.a;
                this.fragmentView = u3Var;
                return u3Var;
            }
            if (z11) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                int size3 = arrayList2.size();
                int i26 = 0;
                int i27 = 0;
                while (i27 < size3) {
                    Object obj2 = arrayList2.get(i27);
                    i27++;
                    o0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList3, spannableStringBuilder3, this.b, this.h.getFontMetricsInt());
                    i26++;
                    if (i26 >= i14) {
                        break;
                    }
                }
                this.h.append(spannableStringBuilder3);
                i10 = 2;
                d0(2, this.a, false);
                this.e.f(LocaleController.getString(R.string.EnableReactions), this.X == i10 || this.a, false);
                this.h.m();
                if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    f0();
                }
                this.J.putAll(linkedHashMap);
                this.L = this.a;
                this.fragmentView = u3Var;
                return u3Var;
            }
        }
        i10 = 2;
        this.e.f(LocaleController.getString(R.string.EnableReactions), this.X == i10 || this.a, false);
        this.h.m();
        if (chatFull.paid_media_allowed) {
        }
        this.J.putAll(linkedHashMap);
        this.L = this.a;
        this.fragmentView = u3Var;
        return u3Var;
    }

    public final void d0(int i10, boolean z10, boolean z11) {
        if (this.X == i10 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i10 == 1 || i10 == 0 || z10;
        this.e.setChecked(z12);
        int w02 = i6.w0(null, z12 ? i6.f6 : i6.e6, false);
        if (!z11) {
            this.e.setBackgroundColor(w02);
        } else if (z12) {
            this.e.b(w02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(w02);
        }
        this.X = i10;
        if (i10 != 1 && i10 != 0 && !z10) {
            if (!z11) {
                this.v.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f3.N(false);
                return;
            } else {
                Z();
                this.v.animate().setListener(null).cancel();
                this.v.animate().alpha(0.0f).setDuration(350L).setInterpolator(tr.f).setListener(new pg.d0(this, 13)).start();
                this.h.setFocusableInTouchMode(false);
                this.E.f3.N(true);
                return;
            }
        }
        this.v.setVisibility(0);
        this.E.f3.N(z11);
        if (z11) {
            this.v.animate().setListener(null).cancel();
            this.v.animate().alpha(1.0f).setDuration(350L).setInterpolator(tr.f).start();
            this.E.post(new h(this, 1));
            LinkedHashMap linkedHashMap = this.H;
            if (linkedHashMap.isEmpty()) {
                this.b.K.clear();
                this.h.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.K;
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    o0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.I, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.M) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.m();
                z51 z51Var = this.b.p0;
                if (z51Var != null) {
                    z51Var.l();
                }
                Y(false);
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.R)) {
            c5 c5Var = this.parentLayout;
            if (c5Var == null || c5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(float f7) {
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        j1 j1Var = this.c;
        if (j1Var != null && this.v != null) {
            j1Var.setTranslationY((1.0f - a2) * j1Var.getMeasuredHeight());
            this.v.setTranslationY((-a2) * this.c.getMeasuredHeight());
        }
        g0();
        i0();
    }

    public final void f0() {
        w8 w8Var = this.r;
        boolean z10 = w8Var.e.h;
        int i10 = this.M;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            z5 z5Var = (z5) linkedHashMap.remove(-1L);
            if (z5Var != null) {
                z5Var.setRemoved(new s5(3, this, z5Var));
            }
            W(z5Var);
            this.b.x(-1L, true);
            Y(false);
            this.h.setMaxLength(i10);
            d0(this.X, this.a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.h.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = q5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            d0(this.X, true, true);
        }
        this.h.updateAnimatedEmoji(true);
    }

    public final void g0() {
        if (this.v == null || this.s == null) {
            return;
        }
        le.b bVar = this.P;
        int round = Math.round((1.0f - (bVar != null ? bVar.e : 0.0f)) * this.x);
        ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
        layoutParams.height = AndroidUtilities.dp(74.0f) + round;
        this.v.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = AndroidUtilities.dp(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final zl0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final void h0() {
        if (this.c != null) {
            this.y.setColor(i6.v0(i6.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.x);
            this.c.invalidate();
        }
    }

    public final void i0() {
        if (this.E == null) {
            return;
        }
        le.b bVar = this.P;
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d), bVar != null ? bVar.e : 0.0f);
        e71 e71Var = this.E;
        i0.b bVar2 = this.mSystemInsets;
        li.a.c(e71Var, bVar2.b, bVar2.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), lerp);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (this.N) {
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
        long j3 = this.R;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.U = chat;
        int i10 = 0;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.U = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.U, true);
            }
            return false;
        }
        if (this.Q != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new i(this, i10));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.K.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Z);
        if (this.X == 2 && this.T != this.S) {
            getMessagesController().setCustomChatReactions(this.R, this.X, c0(false), this.T, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.x = i13;
        g0();
        h0();
        i0();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        this.Y = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (this.Y) {
            this.Y = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.N) {
                this.h.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.X != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.O = true;
        }
        if (!z10 || z11) {
            return;
        }
        if (this.b == null) {
            m mVar = new m(this, this, getParentActivity(), getResourceProvider(), i6.v0(i6.G6, getResourceProvider()));
            this.b = mVar;
            mVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            this.b.setBackgroundColor(i6.w0(null, i6.d6, false));
            this.c.addView(this.b, w7.z5.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, w7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.I;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        AndroidUtilities.runOnUIThread(new n21(22), 200L);
    }
}
