package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wl0 extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public vl0 E;
    public final bm0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public ai.w5 K;
    public TL_stars.StarGift L;
    public final ArrayList M;
    public final HashMap N;
    public final SpannableStringBuilder O;
    public final String P;
    public final String Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public int V;
    public int W;
    public final am0 a;
    public int a0;
    public final nl0 b;
    public int b0;
    public final u4.s c;
    public int c0;
    public final pl0 d;
    public int d0;
    public final mi.h0 e;
    public int e0;
    public zl0 f;
    public int f0;
    public int g0;
    public int h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public final ArrayList m0;
    public long n;
    public final int n0;
    public int o0;
    public tl0 p0;
    public final /* synthetic */ cm0 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final rl0 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wl0(cm0 cm0Var, Context context, int i3) {
        super(context);
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.q0 = cm0Var;
        Object[] objArr = 0;
        this.e = new mi.h0(14, false);
        this.h = -1;
        this.n = 0L;
        this.r = null;
        this.s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = new ArrayList();
        this.n0 = i3;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = cm0Var.getResourceProvider();
        eh.c cVar = cm0Var.H;
        nl0 nl0Var = new nl0(this, context2, resourceProvider, i3);
        this.b = nl0Var;
        nl0Var.setClipToPadding(false);
        nl0Var.setSections(true);
        ((u4.k) nl0Var.getItemAnimator()).m = false;
        getContext();
        u4.s sVar = new u4.s(3);
        this.c = sVar;
        sVar.O = new ai.g2(this, 15);
        nl0Var.i(new gi.o1(this, 7));
        nl0Var.setLayoutManager(sVar);
        pl0 pl0Var = new pl0(this, context, i3);
        this.d = pl0Var;
        nl0Var.setAdapter(pl0Var);
        nl0Var.setOnItemClickListener(new org.telegram.ui.Components.cl0(this, i3, 1));
        nl0Var.j(new ql0(this, i3));
        addView(nl0Var, b8.mf.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String M0 = org.telegram.messenger.bd.M0(cm0Var.a ? 2131752435 : 2131743765, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = org.telegram.messenger.bd.M0(2131743764, null);
        f(false);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        nl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.x = view;
        eh.d dVar = new eh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = org.telegram.messenger.hs.x3;
        view.setBackground(dVar);
        addView(view, b8.mf.e(-1, 72, 55));
        if (i3 == 0) {
            Context context3 = getContext();
            i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
            this.a = new am0(i10, 0L, context3, e6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            eh.d dVar2 = new eh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, b8.mf.e(-1, 16, 55));
            Context context4 = getContext();
            q4Var = ((org.telegram.ui.ActionBar.d2) cm0Var).parentLayout;
            e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
            rl0 rl0Var = new rl0(context4, q4Var, 3, 0L, e6Var);
            this.w = rl0Var;
            rl0Var.setImportantForAccessibility(4);
            rl0Var.x = cm0Var;
            rl0Var.setClipToOutline(true);
            float L = org.telegram.messenger.g0.L(16.0f);
            cg.p0 p0Var = cg.t0.a;
            rl0Var.setOutlineProvider(new cg.r0(0, L));
            addView(rl0Var, b8.mf.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        bm0 bm0Var = new bm0(context5, e6Var2);
        this.F = bm0Var;
        gh.g c2 = cm0Var.F.c(bm0Var, null, false);
        e6Var3 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        hh.e eVar = new hh.e(e6Var3);
        eVar.e = new gi.i8(17);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c2.p(eVar);
        c2.r(org.telegram.messenger.g0.L(18.0f));
        c2.R.e = true;
        bm0Var.I = c2;
        bm0Var.H = c2;
        bm0Var.G = new ml0(this, objArr == true ? 1 : 0);
        bm0Var.setVisibility(4);
        addView(bm0Var, b8.mf.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, b8.mf.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(wl0 wl0Var) {
        int i3;
        nl0 nl0Var = wl0Var.b;
        boolean z10 = wl0Var.I;
        if (z10) {
            nl0Var.C0();
        }
        wl0Var.e();
        if (!z10 || (i3 = wl0Var.i0) < 0) {
            return;
        }
        wl0Var.c.h1(i3, wl0Var.q0.f);
        nl0Var.post(new ml0(wl0Var, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0127 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        cm0 cm0Var = this.q0;
        boolean z10 = cm0Var.a;
        int i3 = this.n0;
        long j10 = 0;
        if (z10) {
            TLRPC.Chat M0 = cm0Var.getMessagesController().M0(0L);
            if (M0 != null) {
                if (i3 != 1) {
                    if (this.h == (M0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.t3.I(M0))) {
                        long j11 = this.n;
                        TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
                        if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
                            TLRPC.PeerColor peerColor = M0.profile_color;
                            if ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 2) != 0) {
                                j10 = peerColor.background_emoji_id;
                            }
                        }
                        if (j11 != j10 || !cm0.G0(emojiStatus, this.r)) {
                        }
                    }
                    return true;
                }
                if (this.h == org.telegram.messenger.t3.F(M0) && this.n == org.telegram.messenger.t3.G(M0)) {
                    TLRPC.PeerColor peerColor2 = M0.color;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor2 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor2 : null;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                    if (tL_peerColorCollectible != tL_peerColorCollectible2 && ((tL_peerColorCollectible != null || tL_peerColorCollectible2 != null) && (tL_peerColorCollectible == null || tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id))) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User f10 = cm0Var.getUserConfig().f();
        if (f10 != null) {
            if (i3 == 1) {
                ?? r12 = this.h == (f10.color instanceof TLRPC.TL_peerColorCollectible ? -1 : org.telegram.messenger.l10.e(f10));
                ?? r22 = this.n == org.telegram.messenger.l10.f(f10);
                TLRPC.PeerColor peerColor3 = f10.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r02 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 == null && tL_peerColorCollectible4 == null) || !(tL_peerColorCollectible3 == null || tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id);
                if (r12 == false || r22 == false || r02 == false) {
                    return true;
                }
            } else {
                ?? r13 = this.h == (f10.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : org.telegram.messenger.l10.l(f10));
                long j12 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f10.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f10.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j10 = peerColor4.background_emoji_id;
                    }
                }
                ?? r03 = j12 == j10;
                boolean G0 = cm0.G0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r13 == false || r03 == false || !G0) {
                }
            }
        }
        return false;
    }

    public final boolean c() {
        nl0 nl0Var = this.b;
        if (nl0Var != null) {
            for (int i3 = 0; i3 < nl0Var.getChildCount(); i3++) {
                if (nl0Var.getChildAt(i3) instanceof org.telegram.ui.Components.iz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i3 = this.n0;
        cm0 cm0Var = this.q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i3 == 0) {
            TLRPC.User f10 = cm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.l10.l(f10);
            this.n = org.telegram.messenger.l10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.r = tL_emojiStatusCollectible;
                    this.s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.r = tL_emojiStatusCollectible;
            this.s = null;
        } else {
            TLRPC.User f11 = cm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.l10.e(f11);
            this.n = org.telegram.messenger.l10.f(f11);
            this.r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.s = tL_peerColorCollectible;
        }
        if (this.r == null && this.s == null) {
            return;
        }
        this.h = -1;
        this.n = 0L;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.F || this.I) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        cm0 cm0Var = this.q0;
        mi.h0 h0Var = this.e;
        if (tL_starGiftUnique != null) {
            dg.a resellAmount = tL_starGiftUnique.getResellAmount(dg.b.a);
            if (tL_starGiftUnique.resale_ton_only) {
                h0Var.b = ci.wb.s1(ci.wb.V0(org.telegram.messenger.bd.a0(null, null, 2131746156, tL_starGiftUnique.getResellAmount(dg.b.b).d()), true), true);
                h0Var.c = ci.wb.T0(org.telegram.messenger.bd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                h0Var.b = ci.wb.T0(org.telegram.messenger.bd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                h0Var.c = null;
            }
        } else {
            h0Var.b = (cm0Var.getUserConfig().q() || cm0Var.a) ? this.r != null ? this.Q : this.P : this.O;
            h0Var.c = null;
        }
        if (cm0Var.H0() == this) {
            cm0Var.S = this;
            cm0Var.R.i((CharSequence) h0Var.b, z10, true);
            cm0Var.R.g((SpannableStringBuilder) h0Var.c, z10);
        }
    }

    public final void g() {
        gi.d dVar = this.q0.R;
        if (dVar != null) {
            dVar.updateColors();
        }
        rl0 rl0Var = this.w;
        if (rl0Var != null) {
            rl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.b, new s3(this, 15));
        bm0 bm0Var = this.F;
        if (bm0Var != null) {
            l(bm0Var);
        }
    }

    public final void h() {
        int i3;
        int i10 = this.q0.f;
        View view = this.x;
        bm0 bm0Var = this.F;
        if (bm0Var == null || (i3 = this.i0) < 0) {
            this.H = false;
            this.I = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (bm0Var != null) {
                bm0Var.setVisibility(4);
                boolean z10 = this.H;
                if (bm0Var.J != z10) {
                    bm0Var.J = z10;
                    bm0Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        u4.s sVar = this.c;
        this.G = sVar.m(i3);
        nl0 nl0Var = this.b;
        int paddingTop = nl0Var.getPaddingTop() + i10;
        int L0 = sVar.L0();
        View view2 = this.G;
        if (view2 != null) {
            boolean z11 = view2.getTop() <= paddingTop;
            this.I = z11;
            this.H = !z11;
            bm0Var.setVisibility(0);
            bm0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + nl0Var.getTop()) - bm0Var.getTop());
        } else if (L0 == -1 || L0 <= this.i0) {
            this.I = false;
            this.H = false;
            bm0Var.setVisibility(0);
            bm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - bm0Var.getTop());
        } else {
            this.I = true;
            this.H = false;
            bm0Var.setVisibility(0);
            bm0Var.setTranslationY((nl0Var.getTop() + paddingTop) - bm0Var.getTop());
        }
        boolean z12 = this.H;
        if (bm0Var.J != z12) {
            bm0Var.J = z12;
            bm0Var.invalidate();
        }
        view.setTranslationY(this.I ? org.telegram.messenger.g0.L(36.0f) + i10 : 0.0f);
        nl0Var.invalidate();
        invalidate();
    }

    public final void i() {
        org.telegram.messenger.zi messageObject;
        rl0 rl0Var = this.w;
        if (rl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = rl0Var.getCells();
            for (int i3 = 0; i3 < cells.length; i3++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i3];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.u1 = true;
                    zl0 zl0Var = this.f;
                    if (zl0Var != null) {
                        messageObject.c1 = zl0Var.getColorId();
                    }
                    messageObject.d1 = this.n;
                    messageObject.e1 = this.s;
                    cells[i3].setAvatar(messageObject);
                    cells[i3].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        int i3;
        cm0 cm0Var;
        hl0 hl0Var;
        int i10;
        zl0 zl0Var = this.f;
        if (zl0Var != null) {
            zl0Var.a(this.h, z10);
        }
        am0 am0Var = this.a;
        if (am0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                am0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                am0Var.c(org.telegram.messenger.wo.a(this.r), z10);
                am0Var.d(this.r.pattern_document_id, true, z10);
            } else {
                if (org.telegram.messenger.m5.A()) {
                    am0Var.e(0L, false, z10);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).a2(0L);
                    am0Var.e(a22 != null ? org.telegram.messenger.m5.f(a22.emoji_status) : 0L, org.telegram.messenger.m5.A(), z10);
                }
                am0Var.b(this.h, z10);
                am0Var.d(this.n, false, z10);
            }
        }
        int i11 = this.n0;
        if (i11 == 0 && (hl0Var = (cm0Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                hl0Var.c(org.telegram.messenger.wo.a(tL_emojiStatusCollectible2), z10);
            } else {
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                hl0Var.b(i10, this.h, z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.W;
            k();
            pl0 pl0Var = this.d;
            if (i12 >= 0 && this.W < 0) {
                pl0Var.p(i12, 2);
            } else if (i12 < 0 && (i3 = this.W) >= 0) {
                pl0Var.o(i3, 2);
            }
        }
        int i13 = 0;
        while (true) {
            nl0 nl0Var = this.b;
            if (i13 >= nl0Var.getChildCount()) {
                return;
            }
            View childAt = nl0Var.getChildAt(i13);
            if (childAt instanceof ll0) {
                ll0 ll0Var = (ll0) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                ll0Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ll0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == ll0Var.getGiftId()), true);
            } else if (childAt instanceof ai.q2) {
                ai.q2 q2Var = (ai.q2) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                q2Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == q2Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == q2Var.getGiftId()), true);
            }
            i13++;
        }
    }

    public final void k() {
        int i3;
        cm0 cm0Var = this.q0;
        ci.v8 v8Var = cm0Var.b;
        this.W = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.d0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i10 = 3;
        this.l0 = 3;
        this.S = 2;
        int i11 = this.n0;
        if (i11 == 0 && (this.h >= 0 || this.r != null || this.s != null)) {
            this.W = 3;
            this.l0 = 5;
            this.a0 = 4;
        }
        ci.v8 v8Var2 = i11 == 1 ? cm0Var.c : v8Var;
        if ((i11 == 0 || i11 == 1) && v8Var2 != null) {
            ArrayList arrayList2 = v8Var2.l;
            int i12 = this.l0;
            this.l0 = i12 + 1;
            this.i0 = i12;
            if (this.L == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.l0;
                this.c0 = i14;
                this.l0 = arrayList.size() + i14;
                int size = arrayList.size() + this.g0;
                this.g0 = size;
                int i15 = this.l0;
                this.d0 = i15;
                if (v8Var.i || !v8Var.j) {
                    this.e0 = i15;
                    int i16 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i16 > 0) {
                        i10 = i16;
                    }
                    int i17 = i15 + i10;
                    this.l0 = i17;
                    this.g0 = size + i10;
                    this.f0 = i17;
                } else if (arrayList.isEmpty()) {
                    int i18 = this.l0;
                    this.k0 = i18;
                    this.l0 = i18 + 2;
                    this.j0 = i18 + 1;
                }
                if (c()) {
                    v8Var2.a();
                }
            } else if (this.K != null) {
                i3 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                long e10 = org.telegram.messenger.h10.i(i3).e();
                for (int i19 = 0; i19 < this.K.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i19);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.l0;
                this.c0 = i20;
                this.l0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.g0;
                this.g0 = size2;
                int i21 = this.l0;
                this.d0 = i21;
                ai.w5 w5Var = this.K;
                if (w5Var.t || !w5Var.u) {
                    this.e0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.l0 = i23;
                    this.g0 = size2 + i10;
                    this.f0 = i23;
                }
                if (c()) {
                    this.K.g(false);
                }
            }
            int i24 = this.l0;
            this.l0 = i24 + 1;
            this.h0 = i24;
        }
        int i25 = this.l0;
        this.l0 = i25 + 1;
        this.V = i25;
        bm0 bm0Var = this.F;
        if (bm0Var != null) {
            bm0Var.post(new ml0(this, 1));
        }
    }

    public final void l(bm0 bm0Var) {
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        cm0 cm0Var = this.q0;
        int themedColor = cm0Var.getThemedColor(i3);
        cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
        int themedColor2 = cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.z6);
        int themedColor3 = cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        bm0Var.w.setColor(themedColor);
        bm0Var.y = org.telegram.ui.ActionBar.k6.r1(0.06f, themedColor3);
        bm0Var.E = themedColor2;
        bm0Var.F = themedColor3;
        xs xsVar = bm0Var.a;
        for (int i10 = 0; i10 < xsVar.getChildCount(); i10++) {
            View childAt = xsVar.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == bm0Var.d ? bm0Var.F : bm0Var.E);
                childAt.invalidate();
            }
        }
        xsVar.invalidate();
        bm0Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = this.n0;
        View view = this.x;
        nl0 nl0Var = this.b;
        if (i11 == 1) {
            super.onMeasure(i3, i10);
            rl0 rl0Var = this.w;
            this.o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + rl0Var.getMeasuredHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) rl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) nl0Var.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(16.0f);
            nl0Var.setPadding(nl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), nl0Var.getPaddingRight(), nl0Var.getPaddingBottom());
        } else {
            this.o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.m;
            ((ViewGroup.MarginLayoutParams) nl0Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i3, i10);
    }
}
