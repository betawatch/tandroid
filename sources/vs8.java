// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vs8 extends FrameLayout implements jm7 {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final jh2 G;
    public final FrameLayout H;
    public int I;
    public bu5 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public sy4 O;
    public boolean P;
    public int Q;
    public final ur8 R;
    public final fn0 S;
    public int T;
    public int U;
    public final d a;
    public final int b;
    public final long c;
    public final ava d;
    public final yua e;
    public final ylb f;
    public final ur0 h;
    public final vgc n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final b61 x;
    public byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vs8(d dVar, Context context, int i, long j, ylb ylbVar, km0 km0Var) {
        super(context);
        String str;
        int i2;
        String str2;
        long j2 = j;
        this.I = -1;
        lea leaVar = (lea) this;
        this.R = new ur8(leaVar, (byte) 0);
        this.S = new fn0(0, new yr8(leaVar), d53.h, 380L, true);
        this.U = gm.q.y;
        this.a = dVar;
        this.b = i;
        if (pg3.B(j2)) {
            TLRPC.EncryptedChat Z0 = oc7.r1(i).Z0(Integer.valueOf((int) (4294967295L & j2)));
            if (Z0 != null) {
                j2 = Z0.user_id;
                this.c = j2;
            } else {
                this.c = j2;
            }
        } else {
            this.c = j2;
        }
        long j3 = j2;
        jva.v(i, false).M(j3);
        byte b = 1;
        ava D = jva.v(i, false).D(j3, true);
        this.d = D;
        yua C = jva.v(i, false).C(j3, true);
        this.e = C;
        C.g = D;
        D.o = true;
        if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).v1) {
            D.g = 4;
            D.e = true;
            D.k(true);
        } else if (!D.e || D.g != 783) {
            D.g = 783;
            D.e = true;
            D.k(true);
        }
        D.a();
        this.f = ylbVar;
        ur0 ur0Var = new ur0(leaVar, context, dVar, b);
        this.h = ur0Var;
        ur0Var.setAllowDisallowInterceptTouch(true);
        ur0Var.setAdapter(new cs8(leaVar, i, ylbVar));
        addView(ur0Var, qoe.e(-1, -1, nm7.D1));
        vgc l = ur0Var.l(10, true);
        this.n = l;
        l.h(cmb.wi, cmb.F6, cmb.ui, cmb.xi, cmb.r8);
        l.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        l.setClipToPadding(false);
        l.r = 12;
        l.setPreTabClick(new yr8(leaVar));
        l.setOnTabLongClick(new gh(leaVar, i, dVar, context, ylbVar));
        addView(l, qoe.e(-1, 42, 48));
        a6 a6Var = new a6(context);
        im0 c = km0Var.c(a6Var, new bm0(cmb.c6, ylbVar), false);
        c.q(gm.L(8.0f));
        c.r(gm.L(22.0f));
        a6Var.setBackground(c);
        rve.b(a6Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = qoe.e(-1, 60, 87);
        e.bottomMargin += gm.n;
        addView(frameLayout, e);
        frameLayout.addView(a6Var, qoe.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(12.0f), gm.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i3 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i3, ylbVar), 24, 24);
        wmb M = anb.M(i3);
        linearLayout.setBackground(Y);
        anb.j(linearLayout, Y, null, M, ylbVar);
        jh2 jh2Var = new jh2(24, ylbVar, context);
        this.G = jh2Var;
        jh2Var.b(cmb.g7, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        anb.X(textView, cmb.i5, ylbVar);
        ts2.q(14.0f, 1, 2131750190, textView, null);
        linearLayout.addView(textView, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        a6Var.addView(linearLayout, qoe.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        rve.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new wh((Object) leaVar, (Object) dVar, i, (byte) 13));
        Boolean bool = D.h;
        if (bool != null) {
            jh2Var.a(bool.booleanValue(), false);
        }
        TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j3));
        boolean z = j3 < 0 || !(W1 == null || m9c.D(W1) || m9c.v(W1));
        if (!z) {
            str = null;
            i2 = 2131746401;
        } else {
            if (j3 >= 0) {
                str2 = jb6.a0(null, null, 2131746399, pg3.s(j3));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ".concat(str2));
                spannableStringBuilder.setSpan(new pn2(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ".concat(jb6.M0(2131746408, null)));
                spannableStringBuilder2.setSpan(new pn2(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                b61 b61Var = new b61(ylbVar, context, true);
                this.x = b61Var;
                b61Var.setUseWrapContent(true);
                b61Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                b61Var.setRoundRadius(gm.L(19.0f));
                b61Var.i(spannableStringBuilder, false, true);
                b61Var.setStateListAnimator(null);
                a6Var.addView(b61Var, qoe.e(-2, -1, 17));
                a6Var.setOnClickListener(new as8(leaVar, z, i, (byte) 0));
                b61Var.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = (byte) 60;
                addView(frameLayout2, qoe.e(-1, nm7.d3, 87));
                m();
                o();
            }
            i2 = 2131746400;
            str = null;
        }
        str2 = jb6.M0(i2, str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("G ".concat(str2));
        spannableStringBuilder3.setSpan(new pn2(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ".concat(jb6.M0(2131746408, null)));
        spannableStringBuilder22.setSpan(new pn2(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        b61 b61Var2 = new b61(ylbVar, context, true);
        this.x = b61Var2;
        b61Var2.setUseWrapContent(true);
        b61Var2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        b61Var2.setRoundRadius(gm.L(19.0f));
        b61Var2.i(spannableStringBuilder3, false, true);
        b61Var2.setStateListAnimator(null);
        a6Var.addView(b61Var2, qoe.e(-2, -1, 17));
        a6Var.setOnClickListener(new as8(leaVar, z, i, (byte) 0));
        b61Var2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = (byte) 60;
        addView(frameLayout2, qoe.e(-1, nm7.d3, 87));
        m();
        o();
    }

    public static void j(a8 a8Var, final ava avaVar, final Runnable runnable, final int i) {
        a8Var.setOnClickListener(new View.OnClickListener() { // from class: vr8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ava avaVar2 = ava.this;
                avaVar2.getClass();
                short s = i;
                int i2 = (s & 15) != 0 ? 15 : (s & 768) != 0 ? 768 : 0;
                int flag = TLObject.setFlag(avaVar2.g & i2, s, !TLObject.hasFlag(r2, s));
                if (flag == 0) {
                    flag = i2 & (~s);
                }
                int i3 = avaVar2.g;
                int i4 = ((~i2) & i3) | flag;
                if (i3 != i4) {
                    avaVar2.g = i4;
                    avaVar2.k(true);
                }
                runnable.run();
            }
        });
        a8Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: wr8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ava.this.g(i, true);
                runnable.run();
                return true;
            }
        });
    }

    public final void a() {
        ava avaVar;
        rs8 currentPage = getCurrentPage();
        if (currentPage == null || (avaVar = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i = avaVar.d;
        new p0a(this.a, this.c, i, new h71((Object) this, i, (Object) currentPage, (byte) 3)).show();
    }

    public final boolean b() {
        yua yuaVar = this.e;
        return yuaVar.h() && yuaVar.d().size() < oc7.r1(this.b).l4.x.f();
    }

    public final boolean c() {
        long j = this.c;
        int i = this.b;
        return j >= 0 ? j == 0 || j == z8c.h(i).e() : sd2.w(5, oc7.r1(i).L0(Long.valueOf(-j)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.I3;
        LinearLayout linearLayout = this.E;
        b61 b61Var = this.x;
        long j = this.c;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == j) {
                b61Var.setVisibility(d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.y = (byte) 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == nm7.J3) {
            if (((Long) objArr[0]).longValue() == j) {
                f(true);
                o();
                return;
            }
            return;
        }
        if (i == 2) {
            b61Var.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = (byte) 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.e.d();
            int i = 0;
            while (true) {
                if (i >= d.size()) {
                    i = -1;
                    tL_starGiftCollection = null;
                    break;
                } else {
                    if (((TL_stars.TL_starGiftCollection) d.get(i)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i < 0 || tL_starGiftCollection == null) {
                return;
            }
            this.Q = 0;
            this.n.e(tL_starGiftCollection.collection_id, i + 1);
        }
    }

    public final void f(boolean z) {
        ur0 ur0Var = this.h;
        if (ur0Var == null || this.n == null) {
            return;
        }
        ur0Var.m(z);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        rs8 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - kt6.y(this.y, Math.max(gm.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < gm.L(240.0f)) {
            translationY += Math.min(gm.L(240.0f) - this.U, gm.L(this.y));
        }
        return (int) (gm.L(this.y) - translationY);
    }

    public ava getCurrentList() {
        rs8 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public r59 getCurrentListView() {
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public rs8 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (rs8) currentView;
    }

    public int getGiftsCount() {
        int i;
        ava avaVar;
        int i2;
        rs8 currentPage = getCurrentPage();
        ava avaVar2 = this.d;
        if (currentPage == null || (avaVar = currentPage.e) == avaVar2) {
            if (avaVar2 != null && (i = avaVar2.n) > 0) {
                return i;
            }
        } else if (avaVar != null && (i2 = avaVar.n) > 0) {
            return i2;
        }
        long j = this.c;
        int i3 = this.b;
        if (j >= 0) {
            TLRPC.UserFull X1 = oc7.r1(i3).X1(j);
            if (X1 != null) {
                return X1.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull M0 = oc7.r1(i3).M0(-j);
        if (M0 != null) {
            return M0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j = 0;
        ava avaVar = this.d;
        if (avaVar != null && !avaVar.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < avaVar.l.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) avaVar.l.get(i2)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public float getTabsHeight() {
        ur0 ur0Var = this.h;
        float f = 0.0f;
        if (ur0Var.getViewPages() != null) {
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    f = (((rs8) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f;
                }
            }
        }
        return f;
    }

    public float getTabsVisibility() {
        vgc vgcVar = this.n;
        if (vgcVar != null) {
            return vgcVar.getAlpha();
        }
        return 0.0f;
    }

    public final void h(qac qacVar, String str) {
        wt5 wt5Var;
        Context context = getContext();
        Activity W = gm.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        byte b = 1;
        he[] heVarArr = new he[1];
        byte b2 = 0;
        ylb ylbVar = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        he heVar = alertDialog$Builder.a;
        if (str != null) {
            heVar.S = jb6.M0(2131750148, null);
        } else {
            heVar.S = jb6.M0(2131750028, null);
            heVar.U = jb6.M0(2131750029, null);
        }
        fs8 fs8Var = new fs8(this, context, ylbVar);
        fs8Var.s0 = true;
        fs8Var.setOnEditorActionListener(new hw0(fs8Var, qacVar, heVarArr, currentFocus, (byte) 1));
        hs6.d0(this.b).O(gm.F0(), true);
        fs8Var.setTextSize(1, 18.0f);
        anb.X(fs8Var, cmb.i5, ylbVar);
        anb.l(fs8Var, 34, cmb.Ni, ylbVar);
        fs8Var.setHintText(jb6.M0(2131750030, null));
        fs8Var.setFocusable(true);
        fs8Var.setInputType(147457);
        anb.F(fs8Var, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        byte b3 = 6;
        fs8Var.setImeOptions(6);
        fs8Var.setBackgroundDrawable(null);
        fs8Var.setPadding(0, gm.L(6.0f), 0, gm.L(6.0f));
        fs8Var.addTextChangedListener(new ef6(fs8Var, b));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        fs8Var.setText(str);
        linearLayout.addView(fs8Var, qoe.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        heVar.a = gm.L(292.0f);
        alertDialog$Builder.j(jb6.M0(str != null ? 2131751272 : 2131751690, null), new xr8(fs8Var, qacVar, b2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new i98((byte) 7));
        heVarArr[0] = heVar;
        bu5 bu5Var = this.J;
        if (bu5Var != null && (wt5Var = bu5Var.m) != null) {
            wt5Var.setSoftInputMode(48);
        }
        gm.U2(W, this.a.getClassGuid());
        heVarArr[0].setOnDismissListener(new ah(this, fs8Var, W, b3));
        heVarArr[0].setOnShowListener(new jh(fs8Var, (byte) 5));
        heVarArr[0].show();
        he heVar2 = heVarArr[0];
        heVar2.k0 = false;
        heVar2.c(-1);
        fs8Var.setSelection(fs8Var.getText().length());
    }

    public final void i() {
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            yua yuaVar = this.e;
            if (i2 < yuaVar.d().size()) {
                ava e = (i2 < 0 || i2 >= yuaVar.d().size()) ? null : yuaVar.e(((TL_stars.TL_starGiftCollection) yuaVar.d().get(i2)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        y21 y21Var;
        ur0 ur0Var = this.h;
        if (ur0Var != null) {
            if (ur0Var.getCurrentPosition() == ur0Var.getNextPosition()) {
                nextPositionAlpha = k(ur0Var.getCurrentPosition()) ? 1.0f : 0.0f;
            } else {
                nextPositionAlpha = (ur0Var.getNextPositionAlpha() * (k(ur0Var.getNextPosition()) ? 1.0f : 0.0f)) + (ur0Var.getCurrentPositionAlpha() * (k(ur0Var.getCurrentPosition()) ? 1.0f : 0.0f));
            }
            FrameLayout frameLayout = this.r;
            float y = kt6.y(this.y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((gm.L(68.0f) + 2) * nextPositionAlpha) + y;
            boolean z = this.U > gm.L(184.0f);
            fn0 fn0Var = this.S;
            fn0Var.a(z, true);
            float f = fn0Var.e;
            float R1 = gm.R1(gm.L(60.0f) + y, (gm.L(16.0f) * nextPositionAlpha) + y, f);
            float f2 = (1.0f - nextPositionAlpha) * f;
            this.H.setTranslationY(gm.R1(gm.L(60.0f) + L, L, f) - gm.L(200.0f));
            frameLayout.setTranslationY(R1 - this.T);
            frameLayout.setAlpha(f2);
            frameLayout.setVisibility(f2 <= 0.0f ? 4 : 0);
            this.x.i((!this.e.h() || ur0Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
            u31 u31Var = u31.x;
            if (u31Var == null || (y21Var = u31Var.e) == null) {
                return;
            }
            y21Var.updatePosition();
        }
    }

    public final void m() {
        b61 b61Var = this.x;
        b61Var.updateColors();
        int i = cmb.Ei;
        ylb ylbVar = this.f;
        int c1 = ((lea) this).W.c1(cmb.v0(i, ylbVar));
        if (!(b61Var.getBackground() instanceof ShapeDrawable)) {
            b61Var.setBackground(cmb.b0(gm.L(19.0f), c1));
        } else if (((ShapeDrawable) b61Var.getBackground()).getPaint().getColor() != c1) {
            cmb.A1(c1, b61Var.getBackground());
            b61Var.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    rs8 rs8Var = (rs8) view;
                    ylb ylbVar2 = rs8Var.c;
                    if (rs8Var.r != null) {
                        rs8Var.w.setTextColor(cmb.v0(cmb.F6, ylbVar2));
                        rs8Var.x.setTextColor(cmb.v0(cmb.Ei, ylbVar2));
                    } else {
                        rs8Var.F.setTextColor(cmb.v0(cmb.F6, ylbVar2));
                        rs8Var.G.setTextColor(cmb.v0(cmb.x6, ylbVar2));
                        rs8Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(cmb.v0(cmb.i5, ylbVar));
    }

    public final void n() {
        byte b = 0;
        for (View view : this.h.getViewPages()) {
            if (view instanceof rs8) {
                rs8 rs8Var = (rs8) view;
                va vaVar = rs8Var.f;
                int paddingTop = vaVar.getPaddingTop();
                rs8Var.g();
                int paddingTop2 = paddingTop - vaVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    gm.J(vaVar, new bs8(rs8Var, paddingTop2, b));
                }
            }
        }
    }

    public final void o() {
        boolean z = !this.e.d().isEmpty() || b();
        ur0 ur0Var = this.h;
        if (ur0Var.getViewPages() != null) {
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    ((rs8) view).setHasTabs(z);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.b;
        nm7.f(i).b(this, nm7.I3);
        nm7.f(i).b(this, nm7.J3);
        nm7.f(i).b(this, 2);
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        ava avaVar = this.d;
        if (avaVar != null) {
            avaVar.o = true;
            avaVar.a();
        }
        yua yuaVar = this.e;
        if (yuaVar != null) {
            yuaVar.j = true;
            yuaVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        rs8 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i = this.b;
        nm7.f(i).n(this, nm7.I3);
        nm7.f(i).n(this, nm7.J3);
        nm7.f(i).n(this, 2);
        ava avaVar = this.d;
        if (avaVar != null) {
            avaVar.o = false;
        }
        yua yuaVar = this.e;
        if (yuaVar != null) {
            yuaVar.j = false;
        }
    }

    public final void p() {
        float f;
        vgc vgcVar = this.n;
        if (vgcVar == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - gm.L(42.0f));
        float l = Utilities.l(gm.x1(min - this.L, -gm.L(42.0f), 0.0f));
        float R1 = gm.R1(0.9f, 1.0f, l);
        vgcVar.setTranslationY(min);
        vgcVar.setScaleX(R1);
        vgcVar.setScaleY(R1);
        ur0 ur0Var = this.h;
        if (ur0Var.getViewPages() != null) {
            f = 0.0f;
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    f += ((rs8) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        vgcVar.setAlpha(pqe.a(f, 0.0f, 1.0f) * l);
    }

    public abstract void q(boolean z);

    public void setButtonOffset(int i) {
        if (this.T != i) {
            this.T = i;
            l();
        }
    }

    public void setGlassEngine(sy4 sy4Var) {
        this.O = sy4Var;
        ur0 ur0Var = this.h;
        sy4Var.c(ur0Var);
        for (View view : ur0Var.getViewPages()) {
            if (view instanceof rs8) {
                sy4Var.b(((rs8) view).f);
            }
        }
    }

    public void setPaddingTop(int i) {
        if (this.L != i) {
            this.L = i;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z) {
        rs8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.P != z) {
            this.P = z;
            q(g());
            this.n.setReordering(z);
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.n3(false);
                    gm.c3(new v56(profileActivity, (byte) 29));
                }
            }
            if (z) {
                return;
            }
            ur8 ur8Var = this.R;
            gm.r(ur8Var);
            gm.c3(ur8Var);
        }
    }

    public void setVisibleHeight(int i) {
        this.U = i;
        l();
        ur0 ur0Var = this.h;
        if (ur0Var != null) {
            for (View view : ur0Var.getViewPages()) {
                if (view instanceof rs8) {
                    ((rs8) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
