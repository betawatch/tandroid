package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tn0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public final hi.c D;
    public final tg.b E;
    public final hi.c F;
    public final tg.b G;
    public org.telegram.ui.ActionBar.k2 H;
    public hk I;
    public ImageView J;
    public ImageView K;
    public FrameLayout L;
    public org.telegram.ui.Components.bz M;
    public org.telegram.ui.ActionBar.u5 N;
    public FrameLayout O;
    public FrameLayout P;
    public vh.d Q;
    public nn0 R;
    public boolean S;
    public org.telegram.ui.Components.bi0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public ic X;
    public float Y;
    public ValueAnimator Z;
    public final boolean a;
    public boolean a0;
    public final rh.v5 b;
    public i0.c b0;
    public final rh.v5 c;
    public final je.b c0;
    public l0 d;
    public final je.b d0;
    public ym0 e;
    public final int f;
    public nn0 h;
    public nn0 n;
    public boolean r;
    public org.telegram.ui.ActionBar.p6 s;
    public final SparseIntArray w;
    public final org.telegram.ui.ActionBar.c5 x;
    public final org.telegram.ui.ActionBar.c5 y;

    public tn0() {
        super(null);
        this.f = org.telegram.messenger.i0.L(6.0f);
        this.w = new SparseIntArray();
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        this.S = q6;
        this.a0 = q6;
        this.b0 = i0.c.e;
        je.b bVar = new je.b();
        this.c0 = bVar;
        je.b bVar2 = new je.b();
        this.d0 = bVar2;
        hi.c cVar = new hi.c();
        this.D = cVar;
        tg.b bVar3 = new tg.b(cVar);
        this.E = bVar3;
        hi.c cVar2 = new hi.c();
        this.F = cVar2;
        tg.b bVar4 = new tg.b(cVar2);
        this.G = bVar4;
        bVar3.e = bVar;
        bVar3.d = bVar2;
        bVar4.e = bVar;
        bVar4.d = bVar2;
        this.a = false;
        rh.e6.y(this.currentAccount, false).U();
        rh.v5 v5Var = new rh.v5(this.currentAccount, 0L, false);
        this.b = v5Var;
        v5Var.g(8, false);
        v5Var.b();
        rh.v5 v5Var2 = new rh.v5(this.currentAccount, 0L, false);
        this.c = v5Var2;
        v5Var2.g(8, false);
        v5Var2.f = true;
        v5Var2.b();
        this.resourceProvider = new bk(this, 1);
        this.x = new org.telegram.ui.ActionBar.c5(0, false, false, this.resourceProvider);
        this.y = new org.telegram.ui.ActionBar.c5(0, false, true, this.resourceProvider);
    }

    public static int A0(int i10) {
        return org.telegram.ui.ActionBar.t6.b(0.5f, (org.telegram.messenger.i0.B(i10) > 0.2f ? 1 : (org.telegram.messenger.i0.B(i10) == 0.2f ? 0 : -1)) < 0 ? 0.28f : -0.28f, i10);
    }

    public static boolean F0(TLRPC.EmojiStatus emojiStatus, TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible) {
        if (tL_emojiStatusCollectible == emojiStatus) {
            return true;
        }
        boolean z10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible;
        return (tL_emojiStatusCollectible != null) == z10 && tL_emojiStatusCollectible != null && z10 && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_emojiStatusCollectible.collectible_id;
    }

    public static void Y(tn0 tn0Var, boolean[] zArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm0 tm0Var, rh.d3 d3Var, gf.e eVar) {
        zArr[0] = true;
        eVar.d();
        rh.e6.x(tn0Var.currentAccount, d3Var.a).h(d3Var.b, tL_starGiftUnique, j10, null, true, new ih.s(14, eVar, tm0Var));
    }

    public static void Z(tn0 tn0Var, sf.b bVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, tm0 tm0Var, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        rh.d3 d3Var = new rh.d3(bVar, tL_payments_paymentFormStarGift);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        boolean[] zArr = new boolean[1];
        rh.g3 g3Var = new rh.g3(tn0Var.getParentActivity(), tn0Var.resourceProvider, tL_starGiftUnique, d3Var, tn0Var.currentAccount, j10, i0.a.k(tL_starGiftUnique.num, ',', sb2), false, new vm0(tn0Var, zArr, tL_starGiftUnique, j10, tm0Var, 0));
        g3Var.h.setOnDismissListener(new mg.g(8, zArr, tm0Var));
        g3Var.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (r3 != (r8 instanceof org.telegram.tgnet.TLRPC.TL_peerColorCollectible ? r8.collectible_id : 0)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (r3 != (r8 instanceof org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible ? ((org.telegram.tgnet.TLRPC.TL_emojiStatusCollectible) r8).collectible_id : 0)) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty] */
    /* JADX WARN: Type inference failed for: r3v15, types: [org.telegram.tgnet.TLRPC$EmojiStatus] */
    /* JADX WARN: Type inference failed for: r3v16, types: [org.telegram.tgnet.TLRPC$TL_inputEmojiStatusCollectible] */
    /* JADX WARN: Type inference failed for: r4v38, types: [org.telegram.messenger.vp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0() {
        if (this.W) {
            return;
        }
        boolean z10 = this.a;
        if (z10 || getUserConfig().q()) {
            if (z10) {
                finishFragment();
            } else {
                TLRPC.User f7 = getUserConfig().f();
                if (f7.color == null) {
                    TLRPC.TL_peerColor tL_peerColor = new TLRPC.TL_peerColor();
                    f7.color = tL_peerColor;
                    tL_peerColor.flags |= 1;
                    tL_peerColor.color = (int) (f7.id % 7);
                }
                TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
                if (this.h.h == org.telegram.messenger.h20.e(f7) && this.h.n == org.telegram.messenger.h20.f(f7)) {
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    long j10 = tL_peerColorCollectible == null ? 0L : tL_peerColorCollectible.collectible_id;
                    TLRPC.PeerColor peerColor = f7.color;
                }
                this.U = true;
                TL_account.updateColor updatecolor = new TL_account.updateColor();
                f7.flags2 |= 256;
                f7.color.flags |= 1;
                if (this.h.s != null) {
                    updatecolor.flags |= 4;
                    TLRPC.TL_inputPeerColorCollectible tL_inputPeerColorCollectible = new TLRPC.TL_inputPeerColorCollectible();
                    updatecolor.color = tL_inputPeerColorCollectible;
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible2 = this.h.s;
                    tL_inputPeerColorCollectible.collectible_id = tL_peerColorCollectible2.collectible_id;
                    f7.color = tL_peerColorCollectible2;
                } else {
                    updatecolor.flags |= 4;
                    TLRPC.TL_peerColor tL_peerColor2 = new TLRPC.TL_peerColor();
                    updatecolor.color = tL_peerColor2;
                    tL_peerColor2.flags |= 1;
                    nn0 nn0Var = this.h;
                    int i10 = nn0Var.h;
                    tL_peerColor2.color = i10;
                    TLRPC.PeerColor peerColor2 = f7.color;
                    int i11 = peerColor2.flags;
                    int i12 = i11 | 1;
                    peerColor2.flags = i12;
                    peerColor2.color = i10;
                    long j11 = nn0Var.n;
                    if (j11 != 0) {
                        updatecolor.flags |= 1;
                        peerColor2.flags = i11 | 3;
                        tL_peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                        tL_peerColor2.background_emoji_id = j11;
                    } else {
                        peerColor2.flags = i12 & (-3);
                        peerColor2.background_emoji_id = 0L;
                    }
                }
                getConnectionsManager().sendRequest(updatecolor, null);
                if (this.n.h == org.telegram.messenger.h20.l(f7)) {
                    nn0 nn0Var2 = this.n;
                    long j12 = nn0Var2.n;
                    TLRPC.PeerColor peerColor3 = f7.profile_color;
                    if (j12 == ((!(peerColor3 instanceof TLRPC.TL_peerColor) || (peerColor3.flags & 2) == 0) ? 0L : peerColor3.background_emoji_id)) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = nn0Var2.r;
                        long j13 = tL_emojiStatusCollectible == null ? 0L : tL_emojiStatusCollectible.collectible_id;
                        TLRPC.EmojiStatus emojiStatus = f7.emoji_status;
                    }
                }
                this.V = true;
                if (f7.profile_color == null) {
                    f7.profile_color = new TLRPC.TL_peerColor();
                }
                TL_account.updateColor updatecolor2 = new TL_account.updateColor();
                updatecolor2.for_profile = true;
                f7.flags2 |= 512;
                if (this.n.h < 0) {
                    f7.profile_color.flags &= -2;
                } else {
                    if (updatecolor2.color == null) {
                        updatecolor2.flags |= 4;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor4 = updatecolor2.color;
                    peerColor4.flags |= 1;
                    int i13 = this.n.h;
                    peerColor4.color = i13;
                    TLRPC.PeerColor peerColor5 = f7.profile_color;
                    peerColor5.flags |= 1;
                    peerColor5.color = i13;
                }
                if (this.n.n != 0) {
                    int i14 = updatecolor2.flags;
                    updatecolor2.flags = i14 | 1;
                    f7.profile_color.flags |= 2;
                    if (updatecolor2.color == null) {
                        updatecolor2.flags = i14 | 5;
                        updatecolor2.color = new TLRPC.TL_peerColor();
                    }
                    TLRPC.PeerColor peerColor6 = updatecolor2.color;
                    peerColor6.flags |= 2;
                    TLRPC.PeerColor peerColor7 = f7.profile_color;
                    long j14 = this.n.n;
                    peerColor7.background_emoji_id = j14;
                    peerColor6.background_emoji_id = j14;
                } else {
                    TLRPC.PeerColor peerColor8 = f7.profile_color;
                    peerColor8.flags &= -3;
                    peerColor8.background_emoji_id = 0L;
                }
                getConnectionsManager().sendRequest(updatecolor2, null);
                if (!F0(f7.emoji_status, this.n.r) && (this.n.r != null || org.telegram.messenger.o5.B(f7.emoji_status))) {
                    ?? tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.n.r;
                    if (tL_emojiStatusCollectible2 != null) {
                        long j15 = tL_emojiStatusCollectible2.collectible_id;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= this.n.l0.size()) {
                                break;
                            }
                            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) this.n.l0.get(i15);
                            if (tL_starGiftUnique2.id == j15) {
                                tL_starGiftUnique = tL_starGiftUnique2;
                                break;
                            }
                            i15++;
                        }
                    }
                    if (tL_starGiftUnique != null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_emojiStatusEmpty.collectible_id = tL_starGiftUnique.id;
                    }
                    getMessagesController().d5(0L, tL_emojiStatusEmpty, tL_starGiftUnique);
                }
                getMessagesController().U3(f7, false, false);
                getUserConfig().v(true);
                finishFragment();
                H0();
            }
            this.W = true;
            org.telegram.messenger.zs notificationCenter = getNotificationCenter();
            int i16 = org.telegram.messenger.vp.D8;
            notificationCenter.k(org.telegram.messenger.zs.r, Integer.valueOf(TLObject.FLAG_19));
        }
    }

    public final void C0() {
        if (this.r) {
            return;
        }
        if (this.a) {
            finishFragment();
        } else if (!getUserConfig().q()) {
            showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 23, true));
            return;
        }
        nn0 G0 = G0();
        if (G0.I == null) {
            nn0 nn0Var = this.h;
            if (G0 == nn0Var) {
                nn0Var = this.n;
            }
            if (nn0Var.I != null) {
                nn0Var.d();
            }
            B0();
            finishFragment();
            H0();
            return;
        }
        nn0 nn0Var2 = this.h;
        if (G0 == nn0Var2) {
            nn0Var2 = this.n;
        }
        nn0Var2.d();
        this.r = true;
        this.Q.setLoading(true);
        TL_stars.TL_starGiftUnique tL_starGiftUnique = G0.I;
        tm0 tm0Var = new tm0(this, 1);
        long e = org.telegram.messenger.d20.i(this.currentAccount).e();
        sf.b bVar = tL_starGiftUnique.resale_ton_only ? sf.b.b : sf.b.a;
        rh.e6.x(this.currentAccount, bVar).H(tL_starGiftUnique, e, null, true, new um0(this, bVar, tL_starGiftUnique, e, tm0Var));
    }

    public final void D0() {
        this.D.a(getThemedColor(org.telegram.ui.ActionBar.t6.d6));
        this.O.invalidate();
        this.P.invalidate();
        this.h.x.invalidate();
        this.h.y.invalidate();
        this.n.x.invalidate();
        this.h.b.invalidate();
        this.n.b.invalidate();
        ((vg.f) this.O.getBackground()).updateColors();
        E0();
        Iterator it = this.d0.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
    }

    public final void E0() {
        int f7 = ((double) org.telegram.messenger.i0.B(getThemedColor(org.telegram.ui.ActionBar.t6.d6))) > 0.72d ? i0.b.f(0.085f, getThemedColor(org.telegram.ui.ActionBar.t6.a7), this.e.getColor()) : getThemedColor(org.telegram.ui.ActionBar.t6.a7);
        this.d.setBackgroundColor(f7);
        hi.c cVar = this.F;
        if (cVar.b != f7) {
            cVar.a(f7);
            Iterator it = this.d0.iterator();
            while (it.hasNext()) {
                ((vg.f) it.next()).updateColors();
            }
            Iterator it2 = this.c0.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).invalidate();
            }
        }
    }

    public final nn0 G0() {
        hk hkVar = this.I;
        return (hkVar == null || hkVar.getPositionAnimated() < 0.5f) ? this.n : this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if ((r18.I.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.h) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e4, code lost:
    
        if ((r18.I.getCurrentPosition() == 0 ? r18.n : r18.h) == r18.n) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H0() {
        ArrayList<Integer> arrayList;
        on0 on0Var;
        if (this.H != null) {
            boolean z10 = this.U;
            boolean z11 = this.a;
            if (z10) {
                if (this.V) {
                }
                nn0 nn0Var = this.h;
                if (nn0Var.h >= 0) {
                    org.telegram.ui.Components.cc.a0(this.H).M(on0.a(this.currentAccount, this.h.h), org.telegram.messenger.cd.L0(z11 ? 2131752436 : 2131743782, null)).j();
                } else {
                    if (nn0Var.s == null) {
                        return;
                    }
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(this.H);
                    TLRPC.TL_peerColorCollectible tL_peerColorCollectible = this.h.s;
                    int i10 = on0.j;
                    if (!org.telegram.ui.ActionBar.t6.I.q() || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                        arrayList = tL_peerColorCollectible.colors;
                    }
                    if (arrayList == null || arrayList.isEmpty()) {
                        on0Var = null;
                    } else {
                        int intValue = arrayList.get(0).intValue() | (-16777216);
                        on0Var = new on0(intValue, arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue, arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue, tL_peerColorCollectible.gift_emoji_id);
                    }
                    a02.M(on0Var, org.telegram.messenger.cd.L0(z11 ? 2131752436 : 2131743782, null)).j();
                }
                this.H = null;
            }
            if (this.V) {
                if (this.U) {
                }
                nn0 nn0Var2 = this.n;
                if (nn0Var2.h >= 0) {
                    org.telegram.ui.Components.cc.a0(this.H).M(on0.c(this.currentAccount, this.n.h), org.telegram.messenger.cd.L0(z11 ? 2131752326 : 2131743765, null)).j();
                } else if (nn0Var2.n != 0) {
                    org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(this.H);
                    TLRPC.Document e = org.telegram.ui.Components.f5.e(this.currentAccount, this.n.n);
                    String L0 = org.telegram.messenger.cd.L0(z11 ? 2131752325 : 2131743764, null);
                    a03.getClass();
                    org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a03.W(), a03.c);
                    boolean C4 = org.telegram.messenger.jj.C4(e);
                    org.telegram.ui.Components.ei0 ei0Var = ebVar.a;
                    if (C4) {
                        org.telegram.ui.ActionBar.a7.t(ei0Var, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
                    }
                    ebVar.e(e, new String[0]);
                    ei0Var.i();
                    ebVar.b.setText(L0);
                    ebVar.b.setTextSize(1, 14.0f);
                    ebVar.b.setSingleLine(false);
                    ebVar.b.setMaxLines(3);
                    a03.b(ebVar, 2750).j();
                } else {
                    org.telegram.messenger.m5.n(null, z11 ? 2131752323 : 2131743762, org.telegram.ui.Components.cc.a0(this.H), R.raw.contact_check, 36);
                }
            }
            this.H = null;
        }
    }

    public final void I0() {
        org.telegram.ui.ActionBar.u5 u5Var = this.N;
        if (u5Var != null) {
            u5Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.A8));
        }
        this.h.g();
        this.n.g();
        ym0 ym0Var = this.e;
        if (ym0Var != null) {
            ym0Var.a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, ym0Var.b);
            ym0Var.a();
            ym0Var.invalidate();
        }
        J0();
        D0();
        setNavigationBarColor(getNavigationBarColor());
    }

    public final void J0() {
        if (this.e == null) {
            return;
        }
        E0();
        int tabsViewBackgroundColor = this.e.getTabsViewBackgroundColor();
        if (this.M != null) {
            hk hkVar = this.I;
            float a2 = w7.u.a(((hkVar == null ? 0.0f : hkVar.getPositionAnimated()) - 0.333333f) / 0.333333f, 0.0f, 1.0f);
            org.telegram.ui.Components.bz bzVar = this.M;
            int f7 = i0.b.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.t6.d6));
            int f10 = i0.b.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.t6.a7));
            int f11 = i0.b.f(a2, -1, getThemedColor(org.telegram.ui.ActionBar.t6.z6));
            int f12 = i0.b.f(a2, tabsViewBackgroundColor, getThemedColor(org.telegram.ui.ActionBar.t6.G6));
            bzVar.a.setColor(f7);
            bzVar.b.setColor(f10);
            bzVar.d = f11;
            bzVar.e = f12;
            bzVar.invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        final int i10 = 1;
        setHasOwnBackground(true);
        final int i11 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setVisibility(8);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        l0 l0Var = new l0(this, context, 17);
        this.d = l0Var;
        this.fragmentView = l0Var;
        this.h = new nn0(this, context, 1);
        this.n = new nn0(this, context, 0);
        ym0 ym0Var = new ym0(this, context, this.resourceProvider);
        this.e = ym0Var;
        ym0Var.E = true;
        this.n.j(false);
        final int i12 = 2;
        this.n.addView(this.e, 2, w7.b6.e(-1, -2, 55));
        hk hkVar = new hk(this, context, i10);
        this.I = hkVar;
        hkVar.setAdapter(new ig.n(this, i12));
        l0Var.addView(this.I, w7.b6.e(-1, -1, org.telegram.messenger.zs.E1));
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        this.Q = dVar;
        dVar.setStateListAnimator(null);
        this.Q.f();
        this.Q.d.r(true, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wm0
            public final /* synthetic */ tn0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i12;
                tn0 tn0Var = this.b;
                int i14 = 1;
                switch (i13) {
                    case 0:
                        if (tn0Var.onBackPressed(true)) {
                            tn0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        tn0 tn0Var2 = this.b;
                        FrameLayout frameLayout2 = (FrameLayout) tn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tn0Var2.K.setAlpha(0.0f);
                        frameLayout2.draw(canvas);
                        tn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(tn0Var2, tn0Var2.getParentActivity(), canvas, (tn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        tn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(tn0Var2, i14));
                        tn0Var2.Z.addListener(new org.telegram.ui.Components.voip.h2(tn0Var2, 19));
                        tn0Var2.Z.setDuration(400L);
                        tn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        tn0Var2.Z.start();
                        frameLayout2.addView(tn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new mg0(tn0Var2, 13));
                        break;
                    default:
                        tn0Var.C0();
                        break;
                }
            }
        });
        this.O.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        this.O.addView(this.Q, w7.b6.c(-1.0f, -1));
        View view = this.O;
        vg.f c10 = this.E.c(view, null, false);
        c10.o(w7.b9.j(this.resourceProvider));
        c10.q(org.telegram.messenger.i0.L(28.0f));
        c10.p(org.telegram.messenger.i0.L(5.0f));
        view.setBackground(c10);
        w7.e6.b(this.O, 0.02f, 1.5f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        frameLayout2.addView(this.O, w7.b6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        tg.c cVar = new tg.c(this.G.c(this.P, null, false));
        cVar.b(org.telegram.messenger.i0.L(40.0f), true);
        cVar.G = org.telegram.messenger.zs.x3;
        this.P.setBackground(cVar);
        nn0 G0 = G0();
        vh.d dVar2 = this.Q;
        if (dVar2 != null && G0 != null && G0 != this.R) {
            this.R = G0;
            m5.e eVar = G0.e;
            dVar2.i((CharSequence) eVar.b, false, true);
            this.Q.g((SpannableStringBuilder) eVar.c, false);
        }
        l0Var.addView(this.P, w7.b6.e(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.L = frameLayout3;
        l0Var.addView(frameLayout3, w7.b6.e(-1, -2, 55));
        boolean z10 = this.a;
        if (z10) {
            org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
            this.N = u5Var;
            u5Var.l(org.telegram.messenger.cd.L0(2131752427, null), false);
            this.N.setEllipsizeByGradient(true);
            this.N.setTextSize(20);
            org.telegram.ui.ActionBar.a7.Y(this.N, org.telegram.ui.ActionBar.t6.A8, getResourceProvider());
            this.N.setTypeface(org.telegram.messenger.i0.o());
            this.L.addView(this.N, w7.b6.d(-2, -2.0f, 19, 72.0f, 0.0f, 72.0f, 0.0f));
        } else {
            org.telegram.ui.Components.bz bzVar = new org.telegram.ui.Components.bz(context);
            this.M = bzVar;
            bzVar.setTabs(org.telegram.messenger.cd.L0(z10 ? 2131752428 : 2131743772, null), org.telegram.messenger.cd.L0(z10 ? 2131752429 : 2131743773, null));
            this.M.r = new tm0(this, i11);
            J0();
            this.L.addView(this.M, w7.b6.e(-1, 40, 17));
        }
        ym0 ym0Var2 = this.e;
        if (ym0Var2 != null) {
            ym0Var2.setProgressToGradient(1.0f);
            if (getParentActivity() != null) {
                org.telegram.messenger.i0.o3(getParentActivity(), isLightStatusBar());
            }
        }
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.J;
        int i13 = org.telegram.ui.ActionBar.t6.u8;
        org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i13), getResourceProvider());
        this.J.setImageResource(R.drawable.ic_ab_back);
        ImageView imageView3 = this.J;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wm0
            public final /* synthetic */ tn0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i11;
                tn0 tn0Var = this.b;
                int i14 = 1;
                switch (i132) {
                    case 0:
                        if (tn0Var.onBackPressed(true)) {
                            tn0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        tn0 tn0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) tn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tn0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(tn0Var2, tn0Var2.getParentActivity(), canvas, (tn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        tn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(tn0Var2, i14));
                        tn0Var2.Z.addListener(new org.telegram.ui.Components.voip.h2(tn0Var2, 19));
                        tn0Var2.Z.setDuration(400L);
                        tn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        tn0Var2.Z.start();
                        frameLayout22.addView(tn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new mg0(tn0Var2, 13));
                        break;
                    default:
                        tn0Var.C0();
                        break;
                }
            }
        });
        w7.e6.a(this.J);
        this.L.addView(this.J, w7.b6.e(54, 54, 19));
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.sun_outline, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.T = bi0Var;
        bi0Var.h = true;
        if (this.S) {
            bi0Var.M(35);
            this.T.P(36);
        } else {
            bi0Var.P(0);
            this.T.M(0);
        }
        this.T.Z = true;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.J9, false);
        this.T.Q(x02, "Sunny");
        this.T.Q(x02, "Path 6");
        this.T.Q(x02, "Path");
        this.T.Q(x02, "Path 5");
        this.T.o();
        ImageView imageView4 = new ImageView(context);
        this.K = imageView4;
        imageView4.setScaleType(scaleType);
        org.telegram.ui.ActionBar.a7.R(this.K, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i13), getResourceProvider());
        this.K.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wm0
            public final /* synthetic */ tn0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = i10;
                tn0 tn0Var = this.b;
                int i14 = 1;
                switch (i132) {
                    case 0:
                        if (tn0Var.onBackPressed(true)) {
                            tn0Var.finishFragment();
                            break;
                        }
                        break;
                    case 1:
                        tn0 tn0Var2 = this.b;
                        FrameLayout frameLayout22 = (FrameLayout) tn0Var2.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout22.getWidth(), frameLayout22.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        tn0Var2.K.setAlpha(0.0f);
                        frameLayout22.draw(canvas);
                        tn0Var2.K.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        tn0Var2.K.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(tn0Var2, tn0Var2.getParentActivity(), canvas, (tn0Var2.K.getMeasuredWidth() / 2.0f) + f7, (tn0Var2.K.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 1);
                        tn0Var2.X = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        tn0Var2.Y = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        tn0Var2.Z = ofFloat;
                        ofFloat.addUpdateListener(new jc(tn0Var2, i14));
                        tn0Var2.Z.addListener(new org.telegram.ui.Components.voip.h2(tn0Var2, 19));
                        tn0Var2.Z.setDuration(400L);
                        tn0Var2.Z.setInterpolator(org.telegram.ui.Components.vs.e);
                        tn0Var2.Z.start();
                        frameLayout22.addView(tn0Var2.X, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new mg0(tn0Var2, 13));
                        break;
                    default:
                        tn0Var.C0();
                        break;
                }
            }
        });
        this.L.addView(this.K, w7.b6.e(54, 54, 21));
        this.K.setImageDrawable(this.T);
        ym0 ym0Var3 = this.e;
        ym0Var3.getClass();
        ym0Var3.a = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, ym0Var3.b);
        ym0Var3.a();
        ym0Var3.invalidate();
        D0();
        E0();
        View view2 = this.fragmentView;
        xm0 xm0Var = new xm0(this, i11);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(view2, xm0Var);
        return this.d;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == org.telegram.messenger.zs.f5) {
            this.h.f(true);
            this.n.f(true);
        } else if (i10 == org.telegram.messenger.zs.G3) {
            this.h.e();
            this.n.e();
        } else if (i10 == org.telegram.messenger.zs.F3) {
            this.h.e();
            this.n.e();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.c;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        return w7.f6.a(new g6(15, this), org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.G6, org.telegram.ui.ActionBar.t6.z6, org.telegram.ui.ActionBar.t6.i6, org.telegram.ui.ActionBar.t6.a7, org.telegram.ui.ActionBar.t6.B6, org.telegram.ui.ActionBar.t6.p7, org.telegram.ui.ActionBar.t6.f6, org.telegram.ui.ActionBar.t6.g6, org.telegram.ui.ActionBar.t6.O6, org.telegram.ui.ActionBar.t6.P6, org.telegram.ui.ActionBar.t6.Q6, org.telegram.ui.ActionBar.t6.R6);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        ym0 ym0Var = this.e;
        return ym0Var == null ? super.isLightStatusBar() : i0.b.h(ym0Var.getColor()) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.a || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        boolean z11 = this.a;
        if (z11 || !((this.h.b() || this.n.b()) && getUserConfig().q())) {
            return super.onBackPressed(z10);
        }
        if (z10 && getVisibleDialog() == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
            String L0 = org.telegram.messenger.cd.L0(z11 ? 2131752426 : 2131743771, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(z11 ? 2131752425 : 2131743770, null);
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751370, null), new xm0(this, 1));
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new xm0(this, 2));
            showDialog(x1Var);
            org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-2), org.telegram.ui.ActionBar.t6.q7, getResourceProvider());
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.zs.G3);
        getNotificationCenter().c(this, org.telegram.messenger.zs.F3);
        setBulletinDelegate(new mg.u(8));
        getMediaDataController().W0();
        if (org.telegram.messenger.vp.r1(this.currentAccount).r4 == null) {
            boolean z10 = org.telegram.messenger.v2.a;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.zs.G3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.F3);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            if (this.h == null || this.n == null) {
                return;
            }
            I0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.s = p6Var;
    }
}
