// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t08 extends FrameLayout {
    public static final /* synthetic */ int r0 = 0;
    public s08 E;
    public final z08 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public q99 K;
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
    public final y08 a;
    public int a0;
    public final j08 b;
    public int b0;
    public final r35 c;
    public int c0;
    public final m08 d;
    public int d0;
    public final sk4 e;
    public int e0;
    public w08 f;
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
    public final boolean n0;
    public int o0;
    public q08 p0;
    public final /* synthetic */ a18 q0;
    public TLRPC.TL_emojiStatusCollectible r;
    public TLRPC.TL_peerColorCollectible s;
    public final o08 w;
    public final View x;
    public final View y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t08(a18 a18Var, Context context, final int i) {
        super(context);
        ui5 ui5Var;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        int i2;
        wjb wjbVar4;
        this.q0 = a18Var;
        Object[] objArr = 0;
        this.e = new sk4((byte) 13, false);
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
        this.n0 = i;
        c();
        Context context2 = getContext();
        wjb resourceProvider = a18Var.getResourceProvider();
        kl0 kl0Var = a18Var.H;
        j08 j08Var = new j08(this, context2, resourceProvider, i);
        this.b = j08Var;
        j08Var.setClipToPadding(false);
        j08Var.setSections(true);
        ((gb3) j08Var.getItemAnimator()).m = false;
        getContext();
        r35 r35Var = new r35(3);
        this.c = r35Var;
        r35Var.O = new nq1(this, (byte) 11);
        j08Var.i(new kr(this, (byte) 8));
        j08Var.setLayoutManager(r35Var);
        m08 m08Var = new m08(this, context, i);
        this.d = m08Var;
        j08Var.setAdapter(m08Var);
        j08Var.setOnItemClickListener(new c39() { // from class: h08
            @Override // c39
            public final void d(int i3, View view) {
                y08 y08Var;
                t08 t08Var;
                int i4;
                int i5;
                t08 t08Var2 = t08.this;
                a18 a18Var2 = t08Var2.q0;
                ArrayList arrayList = t08Var2.m0;
                if (view instanceof s08) {
                    s08 s08Var = (s08) view;
                    boolean z = t08Var2.n0;
                    if (t08Var2.p0 == null) {
                        tl tlVar = s08Var.c;
                        kx9[] kx9VarArr = new kx9[1];
                        float L = gl.L(330.0f);
                        Point point = gl.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(gl.L(324.0f), point.x * 0.95f);
                        if (tlVar != null) {
                            tlVar.f();
                            s08Var.c();
                            Rect rect = gl.Q;
                            rect.set(tlVar.getBounds());
                            i5 = z ? (gl.L(12.0f) + (-rect.centerY())) - min : (-(s08Var.getHeight() - rect.centerY())) - gl.L(16.0f);
                            i4 = gl.L(12.0f) + (rect.centerX() - (point.x - min2));
                        } else {
                            i4 = 0;
                            i5 = 0;
                        }
                        int i6 = i5;
                        p08 p08Var = new p08(t08Var2, a18Var2, t08Var2.getContext(), Integer.valueOf(i4), z ? 5 : 7, a18Var2.getResourceProvider(), z ? 24 : 16, s08Var.a(), s08Var, kx9VarArr);
                        p08Var.h1 = true;
                        long j = t08Var2.n;
                        p08Var.setSelected(j == 0 ? null : Long.valueOf(j));
                        p08Var.setSaveState(3);
                        p08Var.y(tlVar, s08Var);
                        q08 q08Var = new q08(t08Var2, p08Var);
                        t08Var2.p0 = q08Var;
                        kx9VarArr[0] = q08Var;
                        q08Var.showAsDropDown(s08Var, 0, i6, (k96.a0 ? 3 : 5) | 48);
                        kx9VarArr[0].a();
                        return;
                    }
                    return;
                }
                int i7 = t08Var2.W;
                boolean z2 = i;
                if (i3 == i7) {
                    t08Var2.h = -1;
                    t08Var2.n = 0L;
                    t08Var2.r = null;
                    t08Var2.s = null;
                    t08Var2.J = null;
                    t08Var2.i();
                    if (!z2) {
                        a18Var2.h.i();
                    }
                    s08 s08Var2 = t08Var2.E;
                    if (s08Var2 != null) {
                        s08Var2.b(true);
                    }
                    t08Var2.j(true);
                    t08Var2.f(true);
                    t08 t08Var3 = a18Var2.n;
                    if (t08Var3 == null || (y08Var = t08Var3.a) == null || (t08Var = a18Var2.h) == null) {
                        return;
                    }
                    y08Var.a(t08Var.h);
                    return;
                }
                int i8 = t08Var2.c0;
                if (i3 < i8 || i3 >= t08Var2.d0) {
                    return;
                }
                int i9 = i3 - i8;
                if (t08Var2.L == null) {
                    if (i9 < 0 || i9 >= arrayList.size()) {
                        return;
                    }
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i9);
                    if (z2) {
                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                        if (!(peerColor instanceof TLRPC.TL_peerColorCollectible)) {
                            return;
                        }
                        t08Var2.n = 0L;
                        t08Var2.h = -1;
                        t08Var2.J = null;
                        t08Var2.r = null;
                        t08Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                    } else {
                        t08Var2.n = 0L;
                        t08Var2.h = -1;
                        t08Var2.J = null;
                        t08Var2.r = na7.n0(tL_starGiftUnique);
                        t08Var2.s = null;
                    }
                    t08Var2.j(true);
                    t08Var2.i();
                    t08Var2.f(true);
                    s08 s08Var3 = t08Var2.E;
                    if (s08Var3 != null) {
                        s08Var3.b(true);
                        return;
                    }
                    return;
                }
                if (t08Var2.K == null || i9 < 0 || i9 >= arrayList.size()) {
                    return;
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i9);
                if (z2) {
                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                    if (!(peerColor2 instanceof TLRPC.TL_peerColorCollectible)) {
                        return;
                    }
                    t08Var2.n = 0L;
                    t08Var2.h = -1;
                    t08Var2.r = null;
                    t08Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                } else {
                    t08Var2.n = 0L;
                    t08Var2.h = -1;
                    t08Var2.r = na7.n0(tL_starGiftUnique2);
                    t08Var2.s = null;
                }
                t08Var2.J = tL_starGiftUnique2;
                t08Var2.j(true);
                t08Var2.i();
                t08Var2.f(true);
                s08 s08Var4 = t08Var2.E;
                if (s08Var4 != null) {
                    s08Var4.b(true);
                }
            }
        });
        j08Var.j(new n08(this, i));
        addView(j08Var, nme.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new cm2(R.drawable.msg_mini_lock2, 0), 0, 1, 33);
        String M0 = k96.M0(a18Var.a ? 2131752423 : 2131743516, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = k96.M0(2131743515, null);
        f(false);
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        j08Var.setItemAnimator(gb3Var);
        View view = new View(getContext());
        this.x = view;
        ql0 ql0Var = new ql0(kl0Var.c(view, null, false));
        ql0Var.b(-gl.L(24.0f), true);
        ql0Var.H = kk7.w3;
        view.setBackground(ql0Var);
        addView(view, nme.e(-1, 72, 55));
        if (i == 0) {
            Context context3 = getContext();
            i2 = ((d) a18Var).currentAccount;
            wjbVar4 = ((d) a18Var).resourceProvider;
            this.a = new y08(i2, 0L, wjbVar4, context3);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.y = view2;
            ql0 ql0Var2 = new ql0(kl0Var.c(view2, null, false));
            ql0Var2.b(-gl.L(16.0f), false);
            view2.setBackground(ql0Var2);
            addView(view2, nme.e(-1, 16, 55));
            Context context4 = getContext();
            ui5Var = ((d) a18Var).parentLayout;
            wjbVar = ((d) a18Var).resourceProvider;
            o08 o08Var = new o08(context4, ui5Var, 3, 0L, wjbVar);
            this.w = o08Var;
            o08Var.setImportantForAccessibility(4);
            o08Var.x = a18Var;
            o08Var.setClipToOutline(true);
            float L = gl.L(16.0f);
            xi xiVar = zdc.a;
            o08Var.setOutlineProvider(new xdc(0, L));
            addView(o08Var, nme.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        wjbVar2 = ((d) a18Var).resourceProvider;
        z08 z08Var = new z08(context5, wjbVar2);
        this.F = z08Var;
        il0 c = a18Var.F.c(z08Var, null, false);
        wjbVar3 = ((d) a18Var).resourceProvider;
        nl0 nl0Var = new nl0(wjbVar3);
        nl0Var.e = new wz((byte) 21);
        nl0Var.f(0, 0);
        nl0Var.e(0, 0);
        nl0Var.d(0, 0);
        c.p(nl0Var);
        c.r(gl.L(18.0f));
        c.S.e = true;
        z08Var.I = c;
        z08Var.H = c;
        z08Var.G = new i08(this, objArr == true ? 1 : 0);
        z08Var.setVisibility(4);
        addView(z08Var, nme.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.a;
        if (view3 != null) {
            addView(view3, nme.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        a18 a18Var = this.q0;
        boolean z = a18Var.a;
        boolean z2 = this.n0;
        long j = 0;
        if (z) {
            TLRPC.Chat K0 = a18Var.getMessagesController().K0(0L);
            if (K0 != null) {
                int i = this.h;
                if (z2) {
                    if (i == hc2.F(K0) && this.n == hc2.G(K0)) {
                        TLRPC.PeerColor peerColor = K0.color;
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = peerColor instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor : null;
                        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.s;
                        if (tL_peerColorCollectible == tL_peerColorCollectible2 || (tL_peerColorCollectible != null ? !(tL_peerColorCollectible2 == null || tL_peerColorCollectible.collectible_id != tL_peerColorCollectible2.collectible_id) : tL_peerColorCollectible2 == null)) {
                        }
                    }
                    return true;
                }
                if (i == (K0.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : hc2.I(K0))) {
                    long j2 = this.n;
                    TLRPC.EmojiStatus emojiStatus = K0.emoji_status;
                    if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible)) {
                        TLRPC.PeerColor peerColor2 = K0.profile_color;
                        if ((peerColor2 instanceof TLRPC.TL_peerColor) && (peerColor2.flags & 2) != 0) {
                            j = peerColor2.background_emoji_id;
                        }
                    }
                    if (j2 != j || !a18.D0(emojiStatus, this.r)) {
                    }
                }
                return true;
            }
            return false;
        }
        TLRPC.User f = a18Var.getUserConfig().f();
        if (f != null) {
            int i2 = this.h;
            if (z2) {
                ?? r1 = i2 == (f.color instanceof TLRPC.TL_peerColorCollectible ? -1 : l7c.f(f));
                ?? r2 = this.n == l7c.g(f);
                TLRPC.PeerColor peerColor3 = f.color;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible3 = peerColor3 instanceof TLRPC.TL_peerColorCollectible ? (TLRPC.TL_peerColorCollectible) peerColor3 : null;
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible4 = this.s;
                ?? r11 = tL_peerColorCollectible3 == tL_peerColorCollectible4 || (tL_peerColorCollectible3 != null ? !(tL_peerColorCollectible4 == null || tL_peerColorCollectible3.collectible_id != tL_peerColorCollectible4.collectible_id) : tL_peerColorCollectible4 == null);
                if (r1 == false || r2 == false || r11 == false) {
                    return true;
                }
            } else {
                ?? r12 = i2 == (f.emoji_status instanceof TLRPC.TL_emojiStatusCollectible ? -1 : l7c.m(f));
                long j3 = this.n;
                TLRPC.EmojiStatus emojiStatus2 = f.emoji_status;
                if (!(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible)) {
                    TLRPC.PeerColor peerColor4 = f.profile_color;
                    if ((peerColor4 instanceof TLRPC.TL_peerColor) && (peerColor4.flags & 2) != 0) {
                        j = peerColor4.background_emoji_id;
                    }
                }
                ?? r02 = j3 == j;
                boolean D0 = a18.D0(emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible ? (TLRPC.TL_emojiStatusCollectible) emojiStatus2 : null, this.r);
                if (r12 == false || r02 == false || !D0) {
                }
            }
        }
        return false;
    }

    public final boolean b() {
        j08 j08Var = this.b;
        if (j08Var != null) {
            for (int i = 0; i < j08Var.getChildCount(); i++) {
                if (j08Var.getChildAt(i) instanceof pi4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c() {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = null;
        boolean z = this.n0;
        a18 a18Var = this.q0;
        if (z) {
            TLRPC.User f = a18Var.getUserConfig().f();
            this.h = l7c.f(f);
            this.n = l7c.g(f);
            this.r = null;
            if (f != null) {
                TLRPC.PeerColor peerColor = f.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                    this.s = tL_peerColorCollectible;
                }
            }
            tL_peerColorCollectible = null;
            this.s = tL_peerColorCollectible;
        } else {
            TLRPC.User f2 = a18Var.getUserConfig().f();
            this.h = l7c.m(f2);
            this.n = l7c.n(f2);
            if (f2 != null) {
                TLRPC.EmojiStatus emojiStatus = f2.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.r = tL_emojiStatusCollectible;
                    this.s = null;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = tL_emojiStatusCollectible;
                    tL_peerColorCollectible = null;
                    tL_emojiStatusCollectible2 = tL_emojiStatusCollectible3;
                }
            }
            tL_emojiStatusCollectible = null;
            this.r = tL_emojiStatusCollectible;
            this.s = null;
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible32 = tL_emojiStatusCollectible;
            tL_peerColorCollectible = null;
            tL_emojiStatusCollectible2 = tL_emojiStatusCollectible32;
        }
        if (tL_emojiStatusCollectible2 == null && tL_peerColorCollectible == null) {
            return;
        }
        this.h = -1;
        this.n = 0L;
    }

    public final void d() {
        k();
        this.d.f();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.F || this.I) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void e() {
        int i;
        boolean z = this.I;
        j08 j08Var = this.b;
        if (z) {
            j08Var.D0();
        }
        d();
        if (!z || (i = this.i0) < 0) {
            return;
        }
        this.c.g1(i, this.q0.f);
        j08Var.post(new i08(this, (byte) 1));
    }

    public final void f(boolean z) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        a18 a18Var = this.q0;
        sk4 sk4Var = this.e;
        if (tL_starGiftUnique != null) {
            nj resellAmount = tL_starGiftUnique.getResellAmount(oj.a);
            if (tL_starGiftUnique.resale_ton_only) {
                sk4Var.b = jva.s1(jva.U0(k96.a0(null, null, 2131745953, tL_starGiftUnique.getResellAmount(oj.b).d()), true), true);
                sk4Var.c = jva.S0(k96.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                sk4Var.b = jva.S0(k96.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                sk4Var.c = null;
            }
        } else {
            sk4Var.b = (a18Var.getUserConfig().p() || a18Var.a) ? this.r != null ? this.Q : this.P : this.O;
            sk4Var.c = null;
        }
        if (a18Var.E0() == this) {
            a18Var.S = this;
            a18Var.R.i((CharSequence) sk4Var.b, z, true);
            a18Var.R.g((SpannableStringBuilder) sk4Var.c, z);
        }
    }

    public final void g() {
        u41 u41Var = this.q0.R;
        if (u41Var != null) {
            u41Var.updateColors();
        }
        o08 o08Var = this.w;
        if (o08Var != null) {
            o08Var.invalidate();
        }
        j(true);
        gl.d0(this.b, new zf7(this, (byte) 9));
        z08 z08Var = this.F;
        if (z08Var != null) {
            l(z08Var);
        }
    }

    public final void h() {
        int i;
        int i2 = this.q0.f;
        View view = this.x;
        z08 z08Var = this.F;
        if (z08Var == null || (i = this.i0) < 0) {
            this.H = false;
            this.I = false;
            if (view != null) {
                view.setTranslationY(0.0f);
            }
            if (z08Var != null) {
                z08Var.setVisibility(4);
                boolean z = this.H;
                if (z08Var.J != z) {
                    z08Var.J = z;
                    z08Var.invalidate();
                    return;
                }
                return;
            }
            return;
        }
        r35 r35Var = this.c;
        this.G = r35Var.m(i);
        j08 j08Var = this.b;
        int paddingTop = j08Var.getPaddingTop() + i2;
        int K0 = r35Var.K0();
        View view2 = this.G;
        if (view2 != null) {
            boolean z2 = view2.getTop() <= paddingTop;
            this.I = z2;
            this.H = !z2;
            z08Var.setVisibility(0);
            z08Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + j08Var.getTop()) - z08Var.getTop());
        } else if (K0 == -1 || K0 <= this.i0) {
            this.I = false;
            this.H = false;
            z08Var.setVisibility(0);
            z08Var.setTranslationY((gl.L(1.0f) + getHeight()) - z08Var.getTop());
        } else {
            this.I = true;
            this.H = false;
            z08Var.setVisibility(0);
            z08Var.setTranslationY((j08Var.getTop() + paddingTop) - z08Var.getTop());
        }
        boolean z3 = this.H;
        if (z08Var.J != z3) {
            z08Var.J = z3;
            z08Var.invalidate();
        }
        view.setTranslationY(this.I ? gl.L(36.0f) + i2 : 0.0f);
        j08Var.invalidate();
        invalidate();
    }

    public final void i() {
        k27 messageObject;
        o08 o08Var = this.w;
        if (o08Var != null) {
            gb2[] cells = o08Var.getCells();
            for (int i = 0; i < cells.length; i++) {
                gb2 gb2Var = cells[i];
                if (gb2Var != null && (messageObject = gb2Var.getMessageObject()) != null) {
                    messageObject.w1 = true;
                    w08 w08Var = this.f;
                    if (w08Var != null) {
                        messageObject.e1 = w08Var.getColorId();
                    }
                    messageObject.f1 = this.n;
                    messageObject.g1 = this.s;
                    cells[i].setAvatar(messageObject);
                    cells[i].invalidate();
                }
            }
        }
    }

    public final void j(boolean z) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        a18 a18Var;
        c08 c08Var;
        int i;
        w08 w08Var = this.f;
        if (w08Var != null) {
            w08Var.a(this.h, z);
        }
        y08 y08Var = this.a;
        if (y08Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.r;
            if (tL_emojiStatusCollectible != null) {
                y08Var.e(tL_emojiStatusCollectible.document_id, true, z);
                y08Var.c(da7.a(this.r), z);
                y08Var.d(this.r.pattern_document_id, true, z);
            } else {
                if (cf3.z()) {
                    y08Var.e(0L, false, z);
                } else {
                    TLRPC.User V1 = na7.q1(y6c.t0).V1(0L);
                    y08Var.e(V1 != null ? cf3.f(V1.emoji_status) : 0L, cf3.z(), z);
                }
                y08Var.b(this.h, z);
                y08Var.d(this.n, false, z);
            }
        }
        boolean z2 = this.n0;
        if (!z2 && (c08Var = (a18Var = this.q0).e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.r;
            if (tL_emojiStatusCollectible2 != null) {
                c08Var.c(da7.a(tL_emojiStatusCollectible2), z);
            } else {
                i = ((d) a18Var).currentAccount;
                c08Var.b(i, this.h, z);
            }
        }
        if (!z2) {
            int i2 = this.W;
            k();
            int i3 = this.W;
            m08 m08Var = this.d;
            if (i2 >= 0) {
                if (i3 < 0) {
                    m08Var.q(i2, 2);
                }
            } else if (i3 >= 0) {
                m08Var.p(i3, 2);
            }
        }
        int i4 = 0;
        while (true) {
            j08 j08Var = this.b;
            if (i4 >= j08Var.getChildCount()) {
                return;
            }
            View childAt = j08Var.getChildAt(i4);
            if (childAt instanceof g08) {
                g08 g08Var = (g08) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.r;
                g08Var.b((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == g08Var.getGiftId()) || ((tL_peerColorCollectible2 = this.s) != null && tL_peerColorCollectible2.collectible_id == g08Var.getGiftId()), true);
            } else if (childAt instanceof nv4) {
                nv4 nv4Var = (nv4) childAt;
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.r;
                nv4Var.f((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == nv4Var.getGiftId()) || ((tL_peerColorCollectible = this.s) != null && tL_peerColorCollectible.collectible_id == nv4Var.getGiftId()), true);
            }
            i4++;
        }
    }

    public final void k() {
        int i;
        int i2;
        a18 a18Var = this.q0;
        xsa xsaVar = a18Var.b;
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
        byte b = 1;
        this.T = 1;
        int i3 = 3;
        this.l0 = 3;
        this.S = 2;
        boolean z = this.n0;
        if (z || (this.h < 0 && this.r == null && this.s == null)) {
            i = 3;
        } else {
            this.W = 3;
            i = 5;
            this.l0 = 5;
            this.a0 = 4;
        }
        xsa xsaVar2 = z ? a18Var.c : xsaVar;
        if ((!z || z) && xsaVar2 != null) {
            ArrayList arrayList2 = xsaVar2.l;
            this.l0 = i + 1;
            this.i0 = i;
            if (this.L == null) {
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i4)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i5 = this.l0;
                this.c0 = i5;
                this.l0 = arrayList.size() + i5;
                int size = arrayList.size() + this.g0;
                this.g0 = size;
                int i6 = this.l0;
                this.d0 = i6;
                if (xsaVar.i || !xsaVar.j) {
                    this.e0 = i6;
                    int i7 = 3 - (size % 3);
                    if (size <= 0) {
                        i3 = 9;
                    } else if (i7 > 0) {
                        i3 = i7;
                    }
                    int i8 = i6 + i3;
                    this.l0 = i8;
                    this.g0 = size + i3;
                    this.f0 = i8;
                } else if (arrayList.isEmpty()) {
                    int i9 = this.l0;
                    this.k0 = i9;
                    this.l0 = i9 + 2;
                    this.j0 = i9 + 1;
                }
                if (b()) {
                    xsaVar2.a();
                }
            } else if (this.K != null) {
                i2 = ((d) a18Var).currentAccount;
                long e = y6c.h(i2).e();
                for (int i10 = 0; i10 < this.K.d.size(); i10++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i10);
                    if (cf3.n(tL_starGiftUnique.owner_id) != e && cf3.n(tL_starGiftUnique.host_id) != e) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i11 = this.l0;
                this.c0 = i11;
                this.l0 = arrayList.size() + i11;
                int size2 = arrayList.size() + this.g0;
                this.g0 = size2;
                int i12 = this.l0;
                this.d0 = i12;
                q99 q99Var = this.K;
                if (q99Var.y || !q99Var.z) {
                    this.e0 = i12;
                    int i13 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i3 = 9;
                    } else if (i13 > 0) {
                        i3 = i13;
                    }
                    int i14 = i12 + i3;
                    this.l0 = i14;
                    this.g0 = size2 + i3;
                    this.f0 = i14;
                }
                if (b()) {
                    this.K.l(false);
                }
            }
            int i15 = this.l0;
            i = i15 + 1;
            this.l0 = i;
            this.h0 = i15;
        }
        this.l0 = i + 1;
        this.V = i;
        z08 z08Var = this.F;
        if (z08Var != null) {
            z08Var.post(new i08(this, b));
        }
    }

    public final void l(z08 z08Var) {
        int i = bkb.c6;
        a18 a18Var = this.q0;
        int themedColor = a18Var.getThemedColor(i);
        a18Var.getThemedColor(bkb.Z6);
        int themedColor2 = a18Var.getThemedColor(bkb.y6);
        int themedColor3 = a18Var.getThemedColor(bkb.F6);
        z08Var.w.setColor(themedColor);
        z08Var.y = bkb.p1(0.06f, themedColor3);
        z08Var.E = themedColor2;
        z08Var.F = themedColor3;
        fu fuVar = z08Var.a;
        for (int i2 = 0; i2 < fuVar.getChildCount(); i2++) {
            View childAt = fuVar.getChildAt(i2);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                ((TextView) childAt).setTextColor(R == z08Var.d ? z08Var.F : z08Var.E);
                childAt.invalidate();
            }
        }
        fuVar.invalidate();
        z08Var.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = this.n0;
        View view = this.x;
        j08 j08Var = this.b;
        if (z) {
            super.onMeasure(i, i2);
            o08 o08Var = this.w;
            this.o0 = a.getCurrentActionBarHeight() + o08Var.getMeasuredHeight() + gl.m;
            ((ViewGroup.MarginLayoutParams) o08Var.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + gl.m;
            ((ViewGroup.MarginLayoutParams) j08Var.getLayoutParams()).topMargin = this.o0 - gl.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - gl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).topMargin = this.o0 - gl.L(16.0f);
            j08Var.setPadding(j08Var.getPaddingLeft(), gl.L(16.0f), j08Var.getPaddingRight(), j08Var.getPaddingBottom());
        } else {
            this.o0 = gl.L(230.0f) + gl.m;
            ((ViewGroup.MarginLayoutParams) j08Var.getLayoutParams()).topMargin = this.o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.o0 - gl.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).height = this.o0;
        }
        super.onMeasure(i, i2);
    }
}
