// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t82 extends e implements fn7 {
    public final Paint E;
    public q9c F;
    public final ArrayList G;
    public final ArrayList H;
    public final LinkedHashMap I;
    public final ArrayList J;
    public final LinkedHashMap K;
    public final ArrayList L;
    public boolean M;
    public int N;
    public final int O;
    public boolean P;
    public boolean Q;
    public fm0 R;
    public final TLRPC.ChatFull S;
    public final long T;
    public int U;
    public int V;
    public TLRPC.Chat W;
    public TL_stories.TL_premium_boostsStatus X;
    public int Y;
    public int Z;
    public boolean a;
    public boolean a0;
    public r82 b;
    public final l82 b0;
    public zc c;
    public jd0 d;
    public wkb e;
    public ilb f;
    public q82 h;
    public bna n;
    public wkb r;
    public mac s;
    public FrameLayout w;
    public ImageView x;
    public int y;

    public t82(long j, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new Paint();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new LinkedHashMap();
        this.J = new ArrayList();
        this.K = new LinkedHashMap();
        this.L = new ArrayList();
        this.O = getMessagesController().k4.a2.f();
        this.P = false;
        this.Z = -1;
        this.b0 = new l82(this, (byte) 6);
        this.T = j;
        this.S = chatFull;
    }

    public final void a0(View view, boolean z) {
        this.G.add(view);
        this.H.add(Boolean.valueOf(z));
    }

    public final void b0(hm hmVar) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(hmVar)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            hm[] hmVarArr = (hm[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), hm.class);
            for (hm hmVar2 : hmVarArr) {
                hmVar2.setAnimateChanges();
            }
        }
    }

    public final boolean c0(boolean z) {
        final byte b = 1;
        boolean z2 = !this.I.keySet().equals(this.K.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        final byte b2 = 0;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.Y) {
            z2 = false;
        }
        if (this.M != this.a) {
            z2 = true;
        }
        if (z && z2) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = ob6.M0(2131743490, "UnsavedChanges");
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131746134, "ReactionApplyChangesDialog");
            alertDialog$Builder.j(ob6.M0(2131754209, "ApplyTheme"), new fd(this) { // from class: k82
                public final /* synthetic */ t82 b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i) {
                    byte b3 = b2;
                    t82 t82Var = this.b;
                    switch (b3) {
                        case 0:
                            t82Var.s.performClick();
                            break;
                        default:
                            t82Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131751371, null), new fd(this) { // from class: k82
                public final /* synthetic */ t82 b;

                {
                    this.b = this;
                }

                @Override // fd
                public final void w(id idVar2, int i) {
                    byte b3 = b;
                    t82 t82Var = this.b;
                    switch (b3) {
                        case 0:
                            t82Var.s.performClick();
                            break;
                        default:
                            t82Var.finishFragment();
                            break;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z2;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        if (c0(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03cf A[EDGE_INSN: B:54:0x03cf->B:55:0x03cf BREAK  A[LOOP:1: B:42:0x033a->B:53:0x033a], SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder;
        boolean z;
        SpannableStringBuilder spannableStringBuilder2;
        int i3;
        ArrayList<TLRPC.Reaction> arrayList;
        SpannableStringBuilder spannableStringBuilder3;
        final byte b = 1;
        setHasOwnBackground(true);
        TLRPC.Document document = null;
        this.simpleActionBar.setTitle(ob6.M0(2131746114, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 24));
        final byte b2 = 0;
        q9c q9cVar = new q9c(this, new n82(this, b2), null, null);
        this.F = q9cVar;
        q9cVar.setSections(true);
        this.F.setSectionsDrawBackground(true);
        tt ttVar = new tt(this, context);
        ttVar.setFocusableInTouchMode(true);
        ttVar.requestFocus();
        wkb wkbVar = new wkb(context);
        this.e = wkbVar;
        wkbVar.setHeight(56);
        wkb wkbVar2 = this.e;
        yob.h(wkbVar2.e.h ? aob.f6 : aob.e6, null, wkbVar2);
        this.e.setTypeface(hl.o());
        this.e.d(aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
        this.e.setOnClickListener(new View.OnClickListener(this) { // from class: o82
            public final /* synthetic */ t82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkb wkbVar3;
                byte b3 = b2;
                boolean z2 = false;
                byte b4 = 2;
                t82 t82Var = this.b;
                switch (b3) {
                    case 0:
                        if (t82Var.e.e.h && (wkbVar3 = t82Var.r) != null && wkbVar3.e.h) {
                            t82Var.j0();
                        }
                        if (!t82Var.e.e.h) {
                            z2 = t82Var.a;
                            b4 = 1;
                        }
                        t82Var.h0(b4, z2, true);
                        break;
                    case 1:
                        t82Var.j0();
                        break;
                    default:
                        if (!t82Var.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t82Var.X;
                            if (tL_premium_boostsStatus != null) {
                                int i4 = tL_premium_boostsStatus.level;
                                int i5 = t82Var.Y;
                                if (i4 < i5) {
                                    z49.f(-t82Var.T, i5, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            wkb wkbVar4 = t82Var.r;
                            Boolean valueOf = (wkbVar4 == null || !t82Var.S.paid_media_allowed) ? null : Boolean.valueOf(wkbVar4.e.h);
                            t82Var.s.setLoading(true);
                            t82Var.N = t82Var.Z;
                            uc7 messagesController = t82Var.getMessagesController();
                            long j = t82Var.T;
                            int i6 = t82Var.Z;
                            ArrayList g0 = t82Var.g0(false);
                            int i7 = t82Var.V;
                            t82Var.U = i7;
                            messagesController.T4(j, i6, g0, i7, valueOf, new m82(t82Var, b4), new l82(t82Var, (byte) 2));
                            break;
                        }
                        break;
                }
            }
        });
        ilb ilbVar = new ilb(12, this.resourceProvider, context);
        this.f = ilbVar;
        p66 textView = ilbVar.getTextView();
        int i4 = aob.B6;
        yob.X(textView, i4, null);
        this.f.setTopPadding(12);
        this.f.setBottomPadding(16);
        this.f.setText(ob6.M0(2131746136, null));
        mf5 mf5Var = new mf5(context);
        mf5Var.setText(ob6.M0(2131753752, null));
        yob.h(aob.d6, null, mf5Var);
        mf5Var.setTextSize(15.0f);
        mf5Var.setTopMargin(14);
        a0(mf5Var, false);
        vnb resourceProvider = getResourceProvider();
        int i5 = this.O;
        q82 q82Var = new q82(this, context, resourceProvider, i5);
        this.h = q82Var;
        byte b3 = 3;
        q82Var.setOnFocused(new l82(this, b3));
        a0(this.h, false);
        ilb ilbVar2 = new ilb(12, this.resourceProvider, context);
        yob.X(ilbVar2.getTextView(), i4, null);
        ilbVar2.setText(hl.N2(ob6.M0(2131746133, null), aob.Xc, 0, new l82(this, (byte) 4), getResourceProvider()));
        a0(ilbVar2, true);
        mf5 mf5Var2 = new mf5(context, this.resourceProvider);
        mf5Var2.setText(ob6.M0(2131748421, null));
        a0(mf5Var2, false);
        this.n = new bna(context, this.resourceProvider);
        TLRPC.ChatFull chatFull = this.S;
        if (!(chatFull instanceof TLRPC.TL_chatFull) ? (chatFull.flags2 & TLObject.FLAG_13) != 0 : (chatFull.flags & TLObject.FLAG_20) != 0) {
            i = getMessagesController().k4.r3.f();
            this.V = i;
            this.U = i;
        } else {
            i = chatFull.reactions_limit;
            this.V = i;
            this.U = i;
        }
        bna bnaVar = this.n;
        int f = getMessagesController().k4.r3.f();
        ana anaVar = new ana();
        anaVar.a = 1;
        anaVar.b = f;
        anaVar.e = new vr9((byte) 24);
        bnaVar.d(i, anaVar, new m82(this, b3));
        a0(this.n, false);
        ilb ilbVar3 = new ilb(12, this.resourceProvider, context);
        ilbVar3.setTopPadding(12);
        ilbVar3.setBottomPadding(16);
        ilbVar3.setText(ob6.M0(2131748420, null));
        a0(ilbVar3, true);
        if (chatFull.paid_media_allowed) {
            wkb wkbVar3 = new wkb(context);
            this.r = wkbVar3;
            wkbVar3.f(ob6.M0(2131752383, null), false, false);
            a0(this.r, false);
            this.r.setOnClickListener(new View.OnClickListener(this) { // from class: o82
                public final /* synthetic */ t82 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wkb wkbVar32;
                    byte b32 = b;
                    boolean z2 = false;
                    byte b4 = 2;
                    t82 t82Var = this.b;
                    switch (b32) {
                        case 0:
                            if (t82Var.e.e.h && (wkbVar32 = t82Var.r) != null && wkbVar32.e.h) {
                                t82Var.j0();
                            }
                            if (!t82Var.e.e.h) {
                                z2 = t82Var.a;
                                b4 = 1;
                            }
                            t82Var.h0(b4, z2, true);
                            break;
                        case 1:
                            t82Var.j0();
                            break;
                        default:
                            if (!t82Var.s.R) {
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t82Var.X;
                                if (tL_premium_boostsStatus != null) {
                                    int i42 = tL_premium_boostsStatus.level;
                                    int i52 = t82Var.Y;
                                    if (i42 < i52) {
                                        z49.f(-t82Var.T, i52, tL_premium_boostsStatus);
                                        break;
                                    }
                                }
                                wkb wkbVar4 = t82Var.r;
                                Boolean valueOf = (wkbVar4 == null || !t82Var.S.paid_media_allowed) ? null : Boolean.valueOf(wkbVar4.e.h);
                                t82Var.s.setLoading(true);
                                t82Var.N = t82Var.Z;
                                uc7 messagesController = t82Var.getMessagesController();
                                long j = t82Var.T;
                                int i6 = t82Var.Z;
                                ArrayList g0 = t82Var.g0(false);
                                int i7 = t82Var.V;
                                t82Var.U = i7;
                                messagesController.T4(j, i6, g0, i7, valueOf, new m82(t82Var, b4), new l82(t82Var, (byte) 2));
                                break;
                            }
                            break;
                    }
                }
            });
            ilb ilbVar4 = new ilb(12, this.resourceProvider, context);
            yob.X(ilbVar4.getTextView(), i4, null);
            ilbVar4.setTopPadding(12);
            ilbVar4.setBottomPadding(70);
            ilbVar4.setText(hl.X3(ob6.M0(2131752382, null), new l82(this, (byte) 5)));
            a0(ilbVar4, true);
        } else {
            ilbVar3.setBottomPadding(70);
        }
        this.w = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageResource(R.drawable.gradient_bottom);
        this.x.setScaleType(ImageView.ScaleType.FIT_XY);
        yob.s(this.x, aob.a7, this.resourceProvider, PorterDuff.Mode.SRC_ATOP);
        this.w.addView(this.x, tre.e(-1, -1, jn7.D1));
        mac macVar = new mac(getResourceProvider(), context, true);
        this.s = macVar;
        macVar.f();
        mac macVar2 = this.s;
        macVar2.getClass();
        macVar2.i(new SpannableStringBuilder(ob6.M0(2131746115, null)), false, true);
        macVar2.m0 = new SpannableStringBuilder("l");
        wm2 wm2Var = new wm2(R.drawable.mini_switch_lock, 0);
        wm2Var.n = 1;
        macVar2.m0.setSpan(wm2Var, 0, 1, 33);
        final byte b4 = 2;
        this.s.setOnClickListener(new View.OnClickListener(this) { // from class: o82
            public final /* synthetic */ t82 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wkb wkbVar32;
                byte b32 = b4;
                boolean z2 = false;
                byte b42 = 2;
                t82 t82Var = this.b;
                switch (b32) {
                    case 0:
                        if (t82Var.e.e.h && (wkbVar32 = t82Var.r) != null && wkbVar32.e.h) {
                            t82Var.j0();
                        }
                        if (!t82Var.e.e.h) {
                            z2 = t82Var.a;
                            b42 = 1;
                        }
                        t82Var.h0(b42, z2, true);
                        break;
                    case 1:
                        t82Var.j0();
                        break;
                    default:
                        if (!t82Var.s.R) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = t82Var.X;
                            if (tL_premium_boostsStatus != null) {
                                int i42 = tL_premium_boostsStatus.level;
                                int i52 = t82Var.Y;
                                if (i42 < i52) {
                                    z49.f(-t82Var.T, i52, tL_premium_boostsStatus);
                                    break;
                                }
                            }
                            wkb wkbVar4 = t82Var.r;
                            Boolean valueOf = (wkbVar4 == null || !t82Var.S.paid_media_allowed) ? null : Boolean.valueOf(wkbVar4.e.h);
                            t82Var.s.setLoading(true);
                            t82Var.N = t82Var.Z;
                            uc7 messagesController = t82Var.getMessagesController();
                            long j = t82Var.T;
                            int i6 = t82Var.Z;
                            ArrayList g0 = t82Var.g0(false);
                            int i7 = t82Var.V;
                            t82Var.U = i7;
                            messagesController.T4(j, i6, g0, i7, valueOf, new m82(t82Var, b42), new l82(t82Var, (byte) 2));
                            break;
                        }
                        break;
                }
            }
        });
        ttVar.addView(this.F);
        ttVar.addView(this.w, tre.d(-1, 74.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        this.w.addView(this.s, tre.d(-1, 48.0f, 80, 13.0f, 13.0f, 13.0f, 13.0f));
        k0();
        zc zcVar = new zc(this, context);
        this.c = zcVar;
        zcVar.setVisibility(4);
        ttVar.addView(this.c, tre.e(-1, -2, 80));
        this.R = new fm0(0, new z8d((Object) this, (byte) 20), k43.f, 350L, false);
        l0();
        m0();
        TLRPC.ChatReactions chatReactions = chatFull.available_reactions;
        boolean z2 = chatReactions instanceof TLRPC.TL_chatReactionsAll;
        ArrayList arrayList2 = this.L;
        ArrayList arrayList3 = this.J;
        LinkedHashMap linkedHashMap = this.I;
        if (z2) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            int size = arrayList2.size();
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    spannableStringBuilder3 = spannableStringBuilder4;
                    break;
                }
                Object obj = arrayList2.get(i7);
                i7++;
                z49.a((TLRPC.TL_availableReaction) obj, linkedHashMap, arrayList3, spannableStringBuilder4, this.b, this.h.getFontMetricsInt());
                spannableStringBuilder3 = spannableStringBuilder4;
                i6++;
                if (i6 >= i5) {
                    break;
                }
                spannableStringBuilder4 = spannableStringBuilder3;
            }
            this.h.append(spannableStringBuilder3);
            h0(0, this.a, false);
            z = true;
        } else {
            if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
                boolean z3 = chatReactions instanceof TLRPC.TL_chatReactionsNone;
                if (z3 && chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                    i2 = 2;
                    h0(2, this.a, false);
                } else {
                    if (z3) {
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        int size2 = arrayList2.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size2) {
                                spannableStringBuilder = spannableStringBuilder5;
                                z = true;
                                break;
                            }
                            Object obj2 = arrayList2.get(i9);
                            i9++;
                            z49.a((TLRPC.TL_availableReaction) obj2, linkedHashMap, arrayList3, spannableStringBuilder5, this.b, this.h.getFontMetricsInt());
                            spannableStringBuilder = spannableStringBuilder5;
                            z = true;
                            i8++;
                            if (i8 >= i5) {
                                break;
                            }
                            spannableStringBuilder5 = spannableStringBuilder;
                        }
                        this.h.append(spannableStringBuilder);
                        i2 = 2;
                        h0(2, this.a, false);
                        this.e.f(ob6.M0(2131751118, null), (this.Z == i2 || this.a) ? z : false, false);
                        this.h.J();
                        if (chatFull.paid_media_allowed && chatFull.paid_reactions_available) {
                            j0();
                        }
                        this.K.putAll(linkedHashMap);
                        this.M = this.a;
                        this.N = this.Z;
                        this.fragmentView = ttVar;
                        return ttVar;
                    }
                    i2 = 2;
                }
                z = true;
                this.e.f(ob6.M0(2131751118, null), (this.Z == i2 || this.a) ? z : false, false);
                this.h.J();
                if (chatFull.paid_media_allowed) {
                    j0();
                }
                this.K.putAll(linkedHashMap);
                this.M = this.a;
                this.N = this.Z;
                this.fragmentView = ttVar;
                return ttVar;
            }
            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
            ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
            int size3 = arrayList4.size();
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= size3) {
                    spannableStringBuilder2 = spannableStringBuilder6;
                    break;
                }
                TLRPC.Reaction reaction = arrayList4.get(i11);
                i11++;
                TLRPC.Reaction reaction2 = reaction;
                if (!(reaction2 instanceof TLRPC.TL_reactionEmoji)) {
                    spannableStringBuilder2 = spannableStringBuilder6;
                    if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = (TLRPC.TL_reactionCustomEmoji) reaction2;
                        r82 r82Var = this.b;
                        i3 = i11;
                        hm e = z49.e(document, Long.valueOf(tL_reactionCustomEmoji.document_id), this.h.getFontMetricsInt());
                        linkedHashMap.put(Long.valueOf(tL_reactionCustomEmoji.document_id), e);
                        arrayList3.add(Long.valueOf(tL_reactionCustomEmoji.document_id));
                        SpannableString spannableString = new SpannableString("e");
                        arrayList = arrayList4;
                        spannableString.setSpan(e, 0, spannableString.length(), 33);
                        spannableStringBuilder2.append((CharSequence) spannableString);
                        if (r82Var != null) {
                            r82Var.x(Long.valueOf(tL_reactionCustomEmoji.document_id), false);
                        }
                        i10++;
                        if (i10 < i5) {
                            break;
                        }
                        i11 = i3;
                        arrayList4 = arrayList;
                        document = null;
                        spannableStringBuilder6 = spannableStringBuilder2;
                    }
                } else {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                    if (tL_availableReaction != null) {
                        z49.a(tL_availableReaction, linkedHashMap, arrayList3, spannableStringBuilder6, this.b, this.h.getFontMetricsInt());
                        spannableStringBuilder2 = spannableStringBuilder6;
                        i10++;
                    } else {
                        continue;
                    }
                }
                arrayList = arrayList4;
                i3 = i11;
                if (i10 < i5) {
                }
            }
            this.h.append(spannableStringBuilder2);
            h0(1, this.a, false);
            z = true;
        }
        i2 = 2;
        this.e.f(ob6.M0(2131751118, null), (this.Z == i2 || this.a) ? z : false, false);
        this.h.J();
        if (chatFull.paid_media_allowed) {
        }
        this.K.putAll(linkedHashMap);
        this.M = this.a;
        this.N = this.Z;
        this.fragmentView = ttVar;
        return ttVar;
    }

    public final void d0(boolean z) {
        if (this.X == null) {
            return;
        }
        if (this.Z == 0) {
            this.Z = 1;
        }
        int size = g0(true).size();
        this.Y = size;
        if (this.X.level >= size) {
            this.s.g(null, true);
            return;
        }
        if (z) {
            d31.b0(this).Q(R.raw.chats_infotip, 36, hl.S2(ob6.G(size, "ReactionReachLvlForReactionShort", Integer.valueOf(size)))).j();
        }
        this.s.setLvlRequiredState(this.Y);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.y1 && ((Long) objArr[0]).longValue() == (-this.T)) {
            wk5 wk5Var = this.parentLayout;
            if (wk5Var == null || wk5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0() {
        if (this.P) {
            this.P = false;
            if (!Build.MODEL.toLowerCase().startsWith("zte") || Build.VERSION.SDK_INT > 28) {
                this.h.clearFocus();
            } else {
                this.F.setFocusableInTouchMode(true);
                this.F.requestFocus();
            }
            jn7.e().k(jn7.j1, 512);
            this.c.setLayerType(2, null);
            this.R.a(false, true);
        }
    }

    public final boolean f0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, hm.class);
        for (hm hmVar : hmVarArr) {
            this.I.remove(Long.valueOf(hmVar.documentId));
            this.J.remove(Long.valueOf(hmVar.documentId));
            this.b.A(Long.valueOf(hmVar.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        d0(false);
        return true;
    }

    public final ArrayList g0(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.J;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            Long l = (Long) obj;
            if (l.longValue() != -1) {
                ArrayList arrayList4 = this.L;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                    if (l.longValue() == tL_availableReaction.activate_animation.id) {
                        TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                        tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                        arrayList.add(tL_reactionEmoji);
                        break;
                    }
                }
            }
        }
        return z ? arrayList2 : arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.F;
    }

    public final void h0(int i, boolean z, boolean z2) {
        if (this.Z == i && this.a == z) {
            return;
        }
        this.a = z;
        byte b = 1;
        boolean z3 = i == 1 || i == 0 || z;
        this.e.setChecked(z3);
        int w0 = aob.w0(null, z3 ? aob.f6 : aob.e6, false);
        wkb wkbVar = this.e;
        if (!z2) {
            yob.h(z3 ? aob.f6 : aob.e6, null, wkbVar);
        } else if (z3) {
            wkbVar.b(w0, true);
        } else {
            wkbVar.setBackgroundColorAnimatedReverse(w0);
        }
        this.Z = i;
        if (i != 1 && i != 0 && !z) {
            if (!z2) {
                this.w.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(false);
                return;
            } else {
                e0();
                this.w.animate().setListener(null).cancel();
                this.w.animate().alpha(0.0f).setDuration(350L).setInterpolator(k43.f).setListener(new jb1((Object) this, (byte) 20)).start();
                this.h.setFocusableInTouchMode(false);
                this.F.g3.O(true);
                return;
            }
        }
        this.w.setVisibility(0);
        this.F.g3.O(z2);
        if (z2) {
            this.w.animate().setListener(null).cancel();
            this.w.animate().alpha(1.0f).setDuration(350L).setInterpolator(k43.f).start();
            this.F.post(new l82(this, b));
            LinkedHashMap linkedHashMap = this.I;
            if (linkedHashMap.isEmpty()) {
                this.b.L.clear();
                this.h.setText("");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    z49.a((TLRPC.TL_availableReaction) arrayList.get(i3), linkedHashMap, this.J, spannableStringBuilder, this.b, this.h.getFontMetricsInt());
                    i2++;
                    if (i2 >= this.O) {
                        break;
                    } else {
                        i3 = i4;
                    }
                }
                this.h.append(spannableStringBuilder);
                this.h.J();
                m0a m0aVar = this.b.q0;
                if (m0aVar != null) {
                    m0aVar.f();
                }
                d0(false);
            }
        }
    }

    public final void i0(float f) {
        float a = ete.a(f, 0.0f, 1.0f);
        zc zcVar = this.c;
        if (zcVar != null && this.w != null) {
            zcVar.setTranslationY((1.0f - a) * zcVar.getMeasuredHeight());
            this.w.setTranslationY((-a) * this.c.getMeasuredHeight());
        }
        k0();
        m0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        wkb wkbVar = this.r;
        boolean z = wkbVar.e.h;
        int i = this.O;
        LinkedHashMap linkedHashMap = this.I;
        ArrayList arrayList = this.J;
        if (z) {
            wkbVar.setChecked(false);
            arrayList.remove((Object) (-1L));
            hm hmVar = (hm) linkedHashMap.remove(-1L);
            if (hmVar != null) {
                hmVar.setRemoved(new dy1(this, hmVar, (byte) 22));
            }
            b0(hmVar);
            this.b.x(-1L, true);
            d0(false);
            this.h.setMaxLength(i);
            h0(this.Z, this.a, true);
        } else {
            wkbVar.setChecked(true);
            try {
                this.h.setMaxLength(i + 1);
                SpannableString spannableString = new SpannableString("b");
                s82 s82Var = new s82(this);
                s82Var.cacheType = wl.f();
                s82Var.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, s82Var);
                spannableString.setSpan(s82Var, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.b.x(-1L, true);
                d0(true);
                b0(s82Var);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            h0(this.Z, true, true);
        }
        this.h.k(true);
    }

    public final void k0() {
        if (this.w == null || this.s == null) {
            return;
        }
        fm0 fm0Var = this.R;
        int round = Math.round((1.0f - (fm0Var != null ? fm0Var.e : 0.0f)) * this.y);
        ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
        layoutParams.height = hl.L(74.0f) + round;
        this.w.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.s.getLayoutParams();
        layoutParams2.bottomMargin = hl.L(13.0f) + round;
        this.s.setLayoutParams(layoutParams2);
    }

    public final void l0() {
        if (this.c != null) {
            this.E.setColor(aob.v0(aob.d6, this.resourceProvider));
            this.c.setPadding(0, 0, 0, this.y);
            this.c.invalidate();
        }
    }

    public final void m0() {
        if (this.F == null) {
            return;
        }
        fm0 fm0Var = this.R;
        int U1 = hl.U1(fm0Var != null ? fm0Var.e : 0.0f, hl.L(72.0f), hl.L(12.0f) + Math.max(0, this.c.getMeasuredHeight() - this.mSystemInsets.d));
        q9c q9cVar = this.F;
        mq5 mq5Var = this.mSystemInsets;
        eg0.g(q9cVar, mq5Var.b, mq5Var.d, a.getCurrentActionBarHeight(), U1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (this.P) {
            if (z) {
                e0();
                return false;
            }
        } else if (!c0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        uc7 messagesController = getMessagesController();
        long j = this.T;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
        this.W = M0;
        byte b = 0;
        if (M0 == null) {
            TLRPC.Chat O = jf7.Y(this.currentAccount).O(j);
            this.W = O;
            if (O != null) {
                getMessagesController().a4(this.W, true);
            }
            return false;
        }
        if (this.S != null) {
            getMessagesController().G0().a(-j, new m82(this, b));
            getNotificationCenter().b(this, jn7.Y4);
            this.L.addAll(getMediaDataController().n);
            jn7.e().k(jn7.j1, 512);
            getNotificationCenter().b(this, jn7.y1);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        hl.r(this.b0);
        if (this.Z == 2 && (this.V != this.U || (this.N != 2 && !this.M && !this.a))) {
            getMessagesController().T4(this.T, this.Z, g0(false), this.V, null, null, null);
        }
        getNotificationCenter().n(this, jn7.Y4);
        getNotificationCenter().n(this, jn7.y1);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.y = i4;
        k0();
        l0();
        m0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        this.a0 = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        if (this.a0) {
            this.a0 = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.P) {
                this.h.K(false);
                hl.d3(new l82(this, (byte) 0), 250L);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            wkb wkbVar = this.e;
            if (wkbVar == null || !(wkbVar.getBackground() instanceof ColorDrawable)) {
                return;
            }
            wkb wkbVar2 = this.e;
            wkbVar2.setBackgroundColor(aob.w0(null, wkbVar2.e.h ? aob.f6 : aob.e6, false));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        byte b = 1;
        if (z && this.Z != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z) {
            this.Q = true;
            if (z2) {
                return;
            }
            if (this.b == null) {
                r82 r82Var = new r82(this, this, getParentActivity(), getResourceProvider(), aob.v0(aob.G6, getResourceProvider()));
                this.b = r82Var;
                r82Var.setAnimationsEnabled(false);
                this.b.setClipChildren(false);
                yob.h(aob.d6, null, this.b);
                this.c.addView(this.b, tre.e(-1, -2, 80));
                jd0 jd0Var = new jd0(getParentActivity(), getResourceProvider());
                this.d = jd0Var;
                jd0Var.setOnBackspace(new m82(this, b));
                this.c.addView(this.d, tre.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.b.x((Long) obj, false);
                }
            }
            hl.d3(new kc((byte) 22), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
