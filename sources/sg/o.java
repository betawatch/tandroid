package sg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.m5;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.i21;
import org.telegram.ui.ns0;
import org.telegram.ui.y01;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o extends k2 implements us {
    public final Paint D;
    public u51 E;
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
    public fe.b P;
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
    public org.telegram.ui.Components.voip.i0 c;
    public f d;
    public t8 e;
    public b9 f;
    public l h;
    public x7 n;
    public t8 r;
    public r0 s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public o(long j10, TLRPC.ChatFull chatFull) {
        super(null);
        this.D = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.M = getMessagesController().z4;
        this.N = false;
        this.X = -1;
        this.Z = new h(this, 6);
        this.R = j10;
        this.Q = chatFull;
    }

    public final void a0(View view, boolean z10) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z10));
    }

    public final void b0(o5 o5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(o5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            o5[] o5VarArr = (o5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), o5.class);
            for (o5 o5Var2 : o5VarArr) {
                o5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean c0(boolean z10) {
        final int i10 = 1;
        boolean z11 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V;
        final int i11 = 0;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.W) {
            z11 = false;
        }
        if (this.L != this.a) {
            z11 = true;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L0 = cd.L0(2131743860, "UnsavedChanges");
            x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.L0(2131746422, "ReactionApplyChangesDialog");
            alertDialog$Builder.k(cd.L0(2131754216, "ApplyTheme"), new u1(this) { // from class: sg.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(x1 x1Var2, int i12) {
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
            alertDialog$Builder.h(cd.L0(2131751407, null), new u1(this) { // from class: sg.g
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // org.telegram.ui.ActionBar.u1
                public final void h(x1 x1Var2, int i12) {
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
            alertDialog$Builder.p();
        }
        return z11;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        if (c0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03c9 A[EDGE_INSN: B:54:0x03c9->B:55:0x03c9 BREAK  A[LOOP:1: B:42:0x032e->B:53:0x032e], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        SpannableStringBuilder spannableStringBuilder;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder2;
        int i11;
        ArrayList<TLRPC.Reaction> arrayList;
        char c10;
        SpannableStringBuilder spannableStringBuilder3;
        final int i12 = 1;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(cd.L0(2131746402, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new y01(this, 16));
        u51 u51Var = new u51(this, new qh.d(this, 13), null, null);
        this.E = u51Var;
        u51Var.setSections(true);
        this.E.setSectionsDrawBackground(true);
        ph.k kVar = new ph.k(this, context);
        kVar.setFocusableInTouchMode(true);
        kVar.requestFocus();
        t8 t8Var = new t8(context);
        this.e = t8Var;
        t8Var.setHeight(56);
        t8 t8Var2 = this.e;
        a7.i(t8Var2.e.h ? t6.f6 : t6.e6, t8Var2, null);
        this.e.setTypeface(org.telegram.messenger.i0.o());
        this.e.d(t6.g6, t6.O6, t6.P6, t6.Q6, t6.R6);
        final int i13 = 0;
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: sg.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t8 t8Var3;
                switch (i13) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (t8Var3 = oVar.r) != null && t8Var3.e.h) {
                            oVar.j0();
                        }
                        boolean z11 = oVar.e.e.h;
                        oVar.h0(z11 ? 2 : 1, z11 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.j0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.V;
                            if (tL_premium_boostsStatus != null) {
                                int i14 = tL_premium_boostsStatus.level;
                                int i15 = oVar2.W;
                                if (i14 < i15) {
                                    q0.f(-oVar2.R, i15, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            t8 t8Var4 = oVar2.r;
                            Boolean valueOf = (t8Var4 == null || !oVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(t8Var4.e.h);
                            oVar2.s.setLoading(true);
                            vp messagesController = oVar2.getMessagesController();
                            long j10 = oVar2.R;
                            int i16 = oVar2.X;
                            ArrayList g02 = oVar2.g0(false);
                            int i17 = oVar2.T;
                            oVar2.S = i17;
                            messagesController.D4(j10, i16, g02, i17, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        b9 b9Var = new b9(12, context, this.resourceProvider);
        this.f = b9Var;
        p80 textView = b9Var.getTextView();
        int i14 = t6.B6;
        a7.V(textView, i14, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(cd.L0(2131746424, null));
        p4 p4Var = new p4(context);
        p4Var.setText(cd.L0(2131753759, null));
        a7.i(t6.d6, p4Var, null);
        p4Var.setTextSize(15.0f);
        p4Var.setTopMargin(14);
        a0(p4Var, false);
        p6 resourceProvider = getResourceProvider();
        int i15 = this.M;
        l lVar = new l(this, context, resourceProvider, i15);
        this.h = lVar;
        int i16 = 3;
        lVar.setOnFocused(new h(this, i16));
        a0(this.h, false);
        b9 b9Var2 = new b9(12, context, this.resourceProvider);
        a7.V(b9Var2.getTextView(), i14, null);
        b9Var2.setText(org.telegram.messenger.i0.R2(cd.L0(2131746421, null), t6.Uc, 0, new h(this, 4), getResourceProvider()));
        a0(b9Var2, true);
        p4 p4Var2 = new p4(context, this.resourceProvider);
        p4Var2.setText(cd.L0(2131748682, null));
        a0(p4Var2, false);
        this.n = new x7(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.Q;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            int i17 = getMessagesController().L5;
            this.T = i17;
            this.S = i17;
        } else {
            int i18 = chatFull.reactions_limit;
            this.T = i18;
            this.S = i18;
        }
        x7 x7Var = this.n;
        int i19 = this.T;
        int i20 = getMessagesController().L5;
        w7 w7Var = new w7();
        w7Var.a = 1;
        w7Var.b = i20;
        w7Var.e = new m5(i12);
        x7Var.d(i19, w7Var, new i(this, i16));
        a0(this.n, false);
        b9 b9Var3 = new b9(12, context, this.resourceProvider);
        b9Var3.setTopPadding(12);
        b9Var3.setBottomPadding(16);
        b9Var3.setText(cd.L0(2131748681, null));
        a0(b9Var3, true);
        if (chatFull.paid_media_allowed) {
            t8 t8Var3 = new t8(context);
            this.r = t8Var3;
            t8Var3.f(cd.L0(2131752411, null), false, false);
            a0(this.r, false);
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: sg.j
                public final /* synthetic */ o b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t8 t8Var32;
                    switch (i12) {
                        case 0:
                            o oVar = this.b;
                            if (oVar.e.e.h && (t8Var32 = oVar.r) != null && t8Var32.e.h) {
                                oVar.j0();
                            }
                            boolean z11 = oVar.e.e.h;
                            oVar.h0(z11 ? 2 : 1, z11 ? false : oVar.a, true);
                            break;
                        case 1:
                            this.b.j0();
                            break;
                        default:
                            o oVar2 = this.b;
                            if (!oVar2.s.Q) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.V;
                                if (tL_premium_boostsStatus != null) {
                                    int i142 = tL_premium_boostsStatus.level;
                                    int i152 = oVar2.W;
                                    if (i142 < i152) {
                                        q0.f(-oVar2.R, i152, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                t8 t8Var4 = oVar2.r;
                                Boolean valueOf = (t8Var4 == null || !oVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(t8Var4.e.h);
                                oVar2.s.setLoading(true);
                                vp messagesController = oVar2.getMessagesController();
                                long j10 = oVar2.R;
                                int i162 = oVar2.X;
                                ArrayList g02 = oVar2.g0(false);
                                int i172 = oVar2.T;
                                oVar2.S = i172;
                                messagesController.D4(j10, i162, g02, i172, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                                break;
                            }
                            break;
                    }
                }
            });
            b9 b9Var4 = new b9(12, context, this.resourceProvider);
            a7.V(b9Var4.getTextView(), i14, null);
            b9Var4.setTopPadding(12);
            b9Var4.setBottomPadding(70);
            b9Var4.setText(org.telegram.messenger.i0.c4(cd.L0(2131752410, null), new h(this, 5)));
            a0(b9Var4, true);
        } else {
            b9Var3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        a7.t(this.x, t6.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, b6.e(-1, -1, zs.E1));
        r0 r0Var = new r0(context, getResourceProvider(), true);
        this.s = r0Var;
        r0Var.f();
        r0 r0Var2 = this.s;
        r0Var2.getClass();
        r0Var2.i(new SpannableStringBuilder(cd.L0(2131746403, null)), false, true);
        r0Var2.k0 = new SpannableStringBuilder("l");
        dq dqVar = new dq(R.drawable.mini_switch_lock, 0);
        dqVar.n = 1;
        char c11 = '!';
        r0Var2.k0.setSpan(dqVar, 0, 1, 33);
        final int i21 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: sg.j
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t8 t8Var32;
                switch (i21) {
                    case 0:
                        o oVar = this.b;
                        if (oVar.e.e.h && (t8Var32 = oVar.r) != null && t8Var32.e.h) {
                            oVar.j0();
                        }
                        boolean z11 = oVar.e.e.h;
                        oVar.h0(z11 ? 2 : 1, z11 ? false : oVar.a, true);
                        break;
                    case 1:
                        this.b.j0();
                        break;
                    default:
                        o oVar2 = this.b;
                        if (!oVar2.s.Q) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = oVar2.V;
                            if (tL_premium_boostsStatus != null) {
                                int i142 = tL_premium_boostsStatus.level;
                                int i152 = oVar2.W;
                                if (i142 < i152) {
                                    q0.f(-oVar2.R, i152, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            t8 t8Var4 = oVar2.r;
                            Boolean valueOf = (t8Var4 == null || !oVar2.Q.paid_media_allowed) ? null : Boolean.valueOf(t8Var4.e.h);
                            oVar2.s.setLoading(true);
                            vp messagesController = oVar2.getMessagesController();
                            long j10 = oVar2.R;
                            int i162 = oVar2.X;
                            ArrayList g02 = oVar2.g0(false);
                            int i172 = oVar2.T;
                            oVar2.S = i172;
                            messagesController.D4(j10, i162, g02, i172, valueOf, new i(oVar2, 2), new h(oVar2, 2));
                            break;
                        }
                        break;
                }
            }
        });
        kVar.addView(this.E);
        kVar.addView(this.w, b6.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, b6.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        k0();
        org.telegram.ui.Components.voip.i0 i0Var = new org.telegram.ui.Components.voip.i0(this, context);
        this.c = i0Var;
        i0Var.setVisibility(4);
        kVar.addView(this.c, b6.e(-1, -2, 80));
        this.P = new fe.b(0, new s9.g(this), gr.f, 350L, false);
        l0();
        m0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z11 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList2 = this.K;
        ArrayList arrayList3 = this.I;
        LinkedHashMap linkedHashMap = this.H;
        if (z11) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList2.size();
            int i22 = 0;
            int i23 = 0;
            while (true) {
                if (i23 >= size) {
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList2.get(i23);
                i23++;
                q0.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList3, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i22++;
                if (i22 >= i15) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
            }
            this.h.append(spannableStringBuilder3);
            h0(0, this.a, false);
            z10 = true;
        } else {
            if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
                boolean z12 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z12 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i10 = 2;
                    h0(2, this.a, false);
                } else {
                    if (z12) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        int size2 = arrayList2.size();
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            if (i25 >= size2) {
                                spannableStringBuilder = spannableStringBuilder5;
                                z10 = true;
                                break;
                            }
                            Object obj2 = arrayList2.get(i25);
                            i25++;
                            q0.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList3, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                            spannableStringBuilder = spannableStringBuilder5;
                            z10 = true;
                            i24++;
                            if (i24 >= i15) {
                                break;
                            }
                            spannableStringBuilder5 = spannableStringBuilder;
                        }
                        this.h.append(spannableStringBuilder);
                        i10 = 2;
                        h0(2, this.a, false);
                        this.e.f(cd.L0(2131751154, null), (this.X == i10 || this.a) ? z10 : false, false);
                        this.h.I();
                        if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                            j0();
                        }
                        this.J.putAll(linkedHashMap);
                        this.L = this.a;
                        this.fragmentView = kVar;
                        return kVar;
                    }
                    i10 = 2;
                }
                z10 = true;
                this.e.f(cd.L0(2131751154, null), (this.X == i10 || this.a) ? z10 : false, false);
                this.h.I();
                if (chatFull.paid_media_allowed) {
                    j0();
                }
                this.J.putAll(linkedHashMap);
                this.L = this.a;
                this.fragmentView = kVar;
                return kVar;
            }
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size3 = arrayList4.size();
            int i26 = 0;
            int i27 = 0;
            while (true) {
                if (i27 >= size3) {
                    spannableStringBuilder2 = spannableStringBuilder6;
                    break;
                }
                TLRPC.Reaction reaction = arrayList4.get(i27);
                i27++;
                TLRPC.Reaction reaction2 = reaction;
                if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction == null) {
                        continue;
                    } else {
                        q0.a(tL_availableReaction, linkedHashMap, arrayList3, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
                        spannableStringBuilder2 = spannableStringBuilder6;
                        i26++;
                    }
                } else {
                    spannableStringBuilder2 = spannableStringBuilder6;
                    if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                        m mVar = this.b;
                        i11 = i27;
                        o5 e = q0.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                        linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                        arrayList3.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                        SpannableString spannableString = new SpannableString("e");
                        arrayList = arrayList4;
                        c10 = '!';
                        spannableString.setSpan(e, 0, spannableString.length(), 33);
                        spannableStringBuilder2.append((CharSequence) spannableString);
                        if (mVar != null) {
                            mVar.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                        }
                        i26++;
                        if (i26 < i15) {
                            break;
                        }
                        i27 = i11;
                        c11 = c10;
                        arrayList4 = arrayList;
                        document = null;
                        spannableStringBuilder6 = spannableStringBuilder2;
                    }
                }
                arrayList = arrayList4;
                c10 = c11;
                i11 = i27;
                if (i26 < i15) {
                }
            }
            this.h.append(spannableStringBuilder2);
            h0(1, this.a, false);
            z10 = true;
        }
        i10 = 2;
        this.e.f(cd.L0(2131751154, null), (this.X == i10 || this.a) ? z10 : false, false);
        this.h.I();
        if (chatFull.paid_media_allowed) {
        }
        this.J.putAll(linkedHashMap);
        this.L = this.a;
        this.fragmentView = kVar;
        return kVar;
    }

    public final void d0(boolean z10) {
        if (this.V == null) {
            return;
        }
        if (this.X == 0) {
            this.X = 1;
        }
        int size = g0(true).size();
        this.W = size;
        if (this.V.level >= size) {
            this.s.g(null, true);
            return;
        }
        if (z10) {
            cc.a0(this).Q(R.raw.chats_infotip, 36, org.telegram.messenger.i0.W2(cd.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.W);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.y1 && ((Long) objArr[0]).longValue() == (-this.R)) {
            z4 z4Var = this.parentLayout;
            if (z4Var == null || z4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0() {
        if (this.N) {
            this.N = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            }
            zs.e().k(zs.j1, 512);
            this.c.setLayerType(2, null);
            this.P.a(false, true);
        }
    }

    public final boolean f0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        o5[] o5VarArr = (o5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, o5.class);
        for (o5 o5Var : o5VarArr) {
            this.H.remove(Long.valueOf(o5Var.documentId));
            this.I.remove(Long.valueOf(o5Var.documentId));
            this.b.A(Long.valueOf(o5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        d0(false);
        return true;
    }

    public final ArrayList g0(boolean z10) {
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

    @Override // org.telegram.ui.ActionBar.k2
    public final tk0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final void h0(int i10, boolean z10, boolean z11) {
        if (this.X == i10 && this.a == z10) {
            return;
        }
        this.a = z10;
        boolean z12 = i10 == 1 || i10 == 0 || z10;
        this.e.setChecked(z12);
        int x02 = t6.x0(null, z12 ? t6.f6 : t6.e6, false);
        if (!z11) {
            a7.i(z12 ? t6.f6 : t6.e6, this.e, null);
        } else if (z12) {
            this.e.b(x02, true);
        } else {
            this.e.setBackgroundColorAnimatedReverse(x02);
        }
        this.X = i10;
        if (i10 != 1 && i10 != 0 && !z10) {
            if (!z11) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f3.O(false);
                return;
            } else {
                e0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(gr.f).setListener(new ns0(this, 29)).start();
                this.h.setFocusableInTouchMode(false);
                this.E.f3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.E.f3.O(z11);
        if (z11) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(gr.f).start();
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
                    q0.a((TLRPC.TL_availableReaction) arrayList.get(i12), linkedHashMap, this.I, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i11++;
                    if (i11 >= this.M) {
                        break;
                    } else {
                        i12 = i13;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.I();
                i21 i21Var = this.b.p0;
                if (i21Var != null) {
                    i21Var.f();
                }
                d0(false);
            }
        }
    }

    public final void i0(float f7) {
        float a2 = w7.u.a(f7, 0.0f, 1.0f);
        org.telegram.ui.Components.voip.i0 i0Var = this.c;
        if (i0Var != null && this.w != null) {
            i0Var.setTranslationY((1.0f - a2) * i0Var.getMeasuredHeight());
            this.w.setTranslationY((-a2) * this.c.getMeasuredHeight());
        }
        k0();
        m0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        t8 t8Var = this.r;
        boolean z10 = t8Var.e.h;
        int i10 = this.M;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z10) {
            t8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            o5 o5Var = (o5) linkedHashMap.remove(-1L);
            if (o5Var != null) {
                o5Var.setRemoved(new rh.o(20, this, o5Var));
            }
            b0(o5Var);
            this.b.x(-1L, true);
            d0(false);
            this.h.setMaxLength(i10);
            h0(this.X, this.a, true);
        } else {
            t8Var.setChecked(true);
            try {
                this.h.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = f5.f();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                d0(true);
                b0(nVar);
            } catch (Exception e) {
                f8.g(e, true);
            }
            h0(this.X, true, true);
        }
        this.h.k(true);
    }

    public final void k0() {
        if (this.w == null || this.s == null) {
            return;
        }
        fe.b bVar = this.P;
        int round = Math.round((1.0f - (bVar != null ? bVar.e : 0.0f)) * this.y);
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height = org.telegram.messenger.i0.L(74.0f) + round;
        this.w.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = org.telegram.messenger.i0.L(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    public final void l0() {
        if (this.c != null) {
            this.D.setColor(t6.w0(t6.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void m0() {
        if (this.E == null) {
            return;
        }
        fe.b bVar = this.P;
        int W1 = org.telegram.messenger.i0.W1(bVar != null ? bVar.e : 0.0f, org.telegram.messenger.i0.L(72.0f), org.telegram.messenger.i0.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        u51 u51Var = this.E;
        i0.c cVar = this.mSystemInsets;
        ei.b.e(u51Var, cVar.b, cVar.d, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), W1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (this.N) {
            if (z10) {
                e0();
                return false;
            }
        } else if (!c0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        vp messagesController = getMessagesController();
        long j10 = this.R;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        this.U = L0;
        int i10 = 0;
        if (L0 == null) {
            TLRPC.Chat P = hs.a0(this.currentAccount).P(j10);
            this.U = P;
            if (P != null) {
                getMessagesController().N3(this.U, true);
            }
            return false;
        }
        if (this.Q != null) {
            getMessagesController().G0().a(-j10, new i(this, i10));
            getNotificationCenter().c(this, zs.V4);
            this.K.addAll(getMediaDataController().n);
            zs.e().k(zs.j1, 512);
            getNotificationCenter().c(this, zs.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.r(this.Z);
        if (this.X == 2 && this.T != this.S) {
            getMessagesController().D4(this.R, this.X, g0(false), this.T, null, null, null);
        }
        getNotificationCenter().n(this, zs.V4);
        getNotificationCenter().n(this, zs.y1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.y = i13;
        k0();
        l0();
        m0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        this.Y = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        if (this.Y) {
            this.Y = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.N) {
                this.h.J(false);
                org.telegram.messenger.i0.h3(new h(this, 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            t8 t8Var = this.e;
            if (t8Var == null || !(t8Var.getBackground() instanceof ColorDrawable)) {
                return;
            }
            t8 t8Var2 = this.e;
            t8Var2.setBackgroundColor(t6.x0(null, t8Var2.e.h ? t6.f6 : t6.e6, false));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
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
            m mVar = new m(this, this, getParentActivity(), getResourceProvider(), t6.w0(t6.G6, getResourceProvider()));
            this.b = mVar;
            mVar.setAnimationsEnabled(false);
            this.b.setClipChildren(false);
            a7.i(t6.d6, this.b, null);
            this.c.addView(this.b, b6.e(-1, -2, 80));
            f fVar = new f(getParentActivity(), getResourceProvider());
            this.d = fVar;
            fVar.setOnBackspace(new i(this, 1));
            this.c.addView(this.d, b6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
            ArrayList arrayList = this.I;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.x((Long) obj, false);
            }
        }
        org.telegram.messenger.i0.h3(new r5.a(6), 200L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
