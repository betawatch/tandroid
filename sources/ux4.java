// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ux4 extends mz0 implements jm7 {
    public final ArrayList A2;
    public boolean B2;
    public int C2;
    public boolean D2;
    public final int S1;
    public l7c T1;
    public List U1;
    public TLRPC.DisallowedGiftsSettings V1;
    public final long W1;
    public final boolean X1;
    public final String Y1;
    public final a6 Z1;
    public final FrameLayout a2;
    public final LinearLayout b2;
    public final f84 c2;
    public final gx4 d2;
    public final a31 e2;
    public final a31 f2;
    public final ArrayList g2;
    public final ava h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public uwa p2;
    public final l66 q2;
    public final TextView r2;
    public final TextView s2;
    public boolean t2;
    public final rja u2;
    public final fn0 v2;
    public final View w2;
    public final View x2;
    public final su y2;
    public final vgc z2;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0441  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ux4(final Context context, final int i, final long j, List list, final qac qacVar) {
        super(context, null, false, false, null);
        d53 d53Var;
        String str;
        int i2;
        byte b;
        int i3;
        this.g2 = new ArrayList();
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        zw4 zw4Var = new zw4(this);
        d53 d53Var2 = d53.h;
        this.v2 = new fn0(0, zw4Var, d53Var2, 320L, false);
        this.A2 = new ArrayList();
        this.C2 = -1;
        this.S1 = i;
        this.W1 = j;
        boolean z = z8c.h(i).e() == j;
        this.X1 = z;
        this.U1 = list;
        int i4 = cmb.a6;
        t0(i4);
        L(i4);
        this.h2 = jva.v(i, false).D(z8c.h(i).e(), true);
        jva.v(i, false).T();
        bf0 bf0Var = new bf0(context);
        bf0Var.setImportantForAccessibility(2);
        pc0 pc0Var = new pc0((ylb) null);
        if (j > 0) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            String l = m9c.l(W1);
            this.Y1 = l;
            pc0Var.q(W1);
            bf0Var.f(W1, pc0Var);
            TLRPC.UserFull X1 = oc7.r1(i).X1(j);
            this.V1 = (j == z8c.h(i).e() || X1 == null) ? null : X1.disallowed_stargifts;
            if (X1 == null) {
                oc7.r1(i).b3(W1, 0, true, null);
            }
            d53Var = d53Var2;
            str = l;
        } else {
            d53Var = d53Var2;
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            str = L0 == null ? "" : L0.title;
            this.Y1 = str;
            pc0Var.p(L0);
            bf0Var.f(L0, pc0Var);
        }
        this.u1 = 0.1f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.a2 = frameLayout;
        a6 a6Var = new a6(context, (byte) 15);
        this.Z1 = a6Var;
        a6Var.setClipChildren(false);
        a6Var.setClipToPadding(false);
        uwa uwaVar = new uwa(context, 70, 0);
        this.p2 = uwaVar;
        a6Var.addView(uwaVar, qoe.c(-1.0f, -1));
        bf0Var.setRoundRadius(gm.L(42.0f));
        a6Var.addView(bf0Var, qoe.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        rve.a(bf0Var);
        bf0Var.setOnClickListener(new lz(this, j, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, qoe.e(-1, -2, 55));
        TextView textView = new TextView(context);
        this.r2 = textView;
        ts2.s(textView, 1, 20.0f);
        int i5 = cmb.i5;
        anb.X(textView, i5, this.J0);
        textView.setGravity(17);
        linearLayout.addView(textView, qoe.t(-1, -2, 1, 4, 0, 4, 0));
        textView.setMaxWidth(hg5.a(textView.getText(), textView.getPaint()));
        l66 l66Var = new l66(context, this.J0);
        int i6 = cmb.Wc;
        anb.G(l66Var, i6, this.J0);
        l66Var.setTextSize(1, 14.0f);
        anb.X(l66Var, i5, this.J0);
        l66Var.setGravity(17);
        l66Var.setLineSpacing(gm.L(2.33f), 1.0f);
        linearLayout.addView(l66Var, qoe.t(-1, -2, 1, 4, 4, 4, 12));
        textView.setText(jb6.M0(2131750008, null));
        l66Var.setText(TextUtils.concat(gm.S2(jb6.a0(null, null, 2131750007, str)), " ", gm.D2(gm.i2(jb6.M0(2131750006, null), new bn3((byte) 7)), true)));
        l66Var.setMaxWidth(hg5.a(l66Var.getText(), l66Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context);
        this.s2 = textView2;
        ts2.s(textView2, 1, 20.0f);
        anb.X(textView2, i5, this.J0);
        textView2.setGravity(17);
        linearLayout2.addView(textView2, qoe.t(-1, -2, 1, 4, 0, 4, 0));
        a31 a31Var = new a31(context, this.J0, (byte) 3);
        this.e2 = a31Var;
        anb.G(a31Var, i6, this.J0);
        a31Var.setTextSize(1, 14.0f);
        anb.X(a31Var, i5, this.J0);
        a31Var.setGravity(17);
        boolean z2 = z;
        a31 a31Var2 = new a31(context, this.J0, (byte) 4);
        this.f2 = a31Var2;
        anb.G(a31Var2, i6, this.J0);
        a31Var2.setTextSize(1, 14.0f);
        anb.X(a31Var2, i5, this.J0);
        a31Var2.setGravity(17);
        a31Var2.setAlpha(0.0f);
        a31Var2.setScaleX(0.85f);
        a31Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(a31Var, qoe.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(a31Var2, qoe.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView2.setText(jb6.M0(j < 0 ? 2131749898 : z2 ? 2131749889 : 2131749899, null));
        byte b2 = 8;
        int i7 = nm7.I3;
        if (z2) {
            linearLayout2.addView(frameLayout2, qoe.t(-2, -2, 1, 0, 9, 0, 4));
            l66 l66Var2 = new l66(context, this.J0);
            anb.G(l66Var2, i6, this.J0);
            l66Var2.setTextSize(1, 14.0f);
            anb.X(l66Var2, i5, this.J0);
            l66Var2.setGravity(17);
            linearLayout2.addView(l66Var2, qoe.t(-2, -2, 1, 26, 4, 26, 6));
            a31Var.setText(jb6.M0(2131749888, null));
            l66Var2.setText(jb6.M0(2131749887, null));
            this.q2 = l66Var2;
        } else {
            if (j >= 0) {
                linearLayout2.addView(frameLayout2, qoe.t(-1, -2, 1, 0, 9, 0, 6));
                ava D = jva.v(i, false).D(j, true);
                i2 = i7;
                b = 7;
                r97 r97Var = new r97((Object) this, (Object) D, j, (Object) qacVar, (Object) context, (byte) 7);
                r97Var.run();
                a31Var.addOnAttachStateChangeListener(new wd(r97Var, b2));
                i3 = 3;
                if (D.l.size() < 3) {
                    D.a();
                }
                nm7.f(i).h(a31Var, i2, new qy1((Object) D, (Object) r97Var, (byte) 24));
                f84 f84Var = new f84(i3, false);
                this.c2 = f84Var;
                f84Var.O = new zr1(this, b);
                this.n1.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                this.n1.setClipToPadding(false);
                this.n1.setClipChildren(false);
                this.n1.setLayoutManager(f84Var);
                this.n1.setSelectorType(9);
                this.n1.setSelectorDrawableColor(0);
                gx4 gx4Var = new gx4();
                this.d2 = gx4Var;
                gx4Var.C = false;
                gx4Var.m = false;
                gx4Var.n(350L);
                gx4Var.o(d53Var);
                gx4Var.D = (byte) 40;
                this.n1.setItemAnimator(gx4Var);
                this.n1.setOnItemClickListener(new f59() { // from class: ex4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // f59
                    public final void g(int i8, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        ux4 ux4Var = ux4.this;
                        dy0 dy0Var = ux4Var.c;
                        byte b3 = 1;
                        c6c G = ux4Var.T1.G(i8 - 1);
                        if (G == null || !G.H(nx4.class)) {
                            return;
                        }
                        Object obj = G.H;
                        boolean z3 = obj instanceof nw4;
                        Context context2 = context;
                        int i9 = i;
                        qac qacVar2 = qacVar;
                        int i10 = 0;
                        Object[] objArr = 0;
                        if (z3) {
                            new hx4(ux4Var, context2, i9, (nw4) obj, ux4Var.W1, new bx4(ux4Var, qacVar2, objArr == true ? 1 : 0)).show();
                            return;
                        }
                        if (obj instanceof TL_stars.StarGift) {
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            ava avaVar = ux4Var.h2;
                            long j2 = j;
                            if (avaVar != null && ux4Var.l2 == ux4Var.j2) {
                                ArrayList arrayList = avaVar.l;
                                int size = arrayList.size();
                                while (true) {
                                    if (i10 >= size) {
                                        savedStarGift = null;
                                        break;
                                    }
                                    Object obj2 = arrayList.get(i10);
                                    i10++;
                                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                                    if (savedStarGift2.gift.id == starGift.id) {
                                        savedStarGift = savedStarGift2;
                                        break;
                                    }
                                }
                                if (savedStarGift == null || fs7.m(savedStarGift.gift)) {
                                    return;
                                }
                                ix4 ix4Var = new ix4(ux4Var, ux4Var.getContext(), i9, z8c.h(i9).e(), ux4Var.J0);
                                ix4Var.n2(savedStarGift, null);
                                ix4Var.c2(j2, new s2c((Object) ux4Var, (Object) ix4Var, j2, (Object) qacVar2, (byte) 5));
                                return;
                            }
                            if (G.r && starGift.availability_resale > 0) {
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    bh0 bh0Var = new bh0();
                                    bh0Var.a = true;
                                    bh0Var.e = true;
                                    jx4 jx4Var = new jx4(j2, starGift.title, starGift.id, ux4Var.J0, dy0Var.getViewTreeObserver(), new cx4());
                                    jx4Var.e = new qy1((Object) ux4Var, (Object) qacVar2, (byte) 23);
                                    S.showAsSheet(jx4Var, bh0Var);
                                    return;
                                }
                                return;
                            }
                            if (starGift.auction) {
                                e00.Z0(context2, ux4Var.J0, i9, j2, starGift.id, new bx4(ux4Var, qacVar2, b3));
                                return;
                            }
                            if (!starGift.sold_out) {
                                if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                    new c41(dy0Var, ux4Var.J0).R(starGift.getDocument(), gm.S2(jb6.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                    return;
                                }
                                i77 i77Var = new i77((Object) ux4Var, (Object) context2, i9, (Object) starGift, (Object) qacVar2, (byte) 15);
                                if (starGift.locked_until_date > ConnectionsManager.getInstance(i9).getCurrentTime()) {
                                    he heVar = new he(3, null, ux4Var.getContext());
                                    heVar.q(500L);
                                    TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                    checkcansendgift.gift_id = starGift.id;
                                    ConnectionsManager.getInstance(i9).sendRequest(checkcansendgift, new av0((Object) ux4Var, (Object) heVar, (Object) i77Var, (Object) qacVar2, (byte) 6));
                                    return;
                                }
                                if (!starGift.require_premium || z8c.h(i9).p()) {
                                    i77Var.run();
                                    return;
                                }
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    yj8 yj8Var = new yj8(S2, i9, null, null, starGift, ux4Var.J0);
                                    bf0 bf0Var2 = new bf0(ux4Var.getContext());
                                    tm tmVar = new tm(gm.L(160.0f), 4, bf0Var2, false);
                                    bf0Var2.setImageDrawable(tmVar);
                                    bf0Var2.addOnAttachStateChangeListener(new eq1(tmVar, (byte) 1));
                                    tmVar.i(starGift.getDocument(), false);
                                    yj8Var.w2 = bf0Var2;
                                    yj8Var.show();
                                    tmVar.f();
                                    return;
                                }
                                return;
                            }
                            ylb ylbVar = ux4Var.J0;
                            if (context2 != null) {
                                my0 h = hg9.h(1, ylbVar, context2, false);
                                LinearLayout i11 = hg9.i(context2, 1);
                                i11.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
                                i11.setClipChildren(false);
                                i11.setClipToPadding(false);
                                bf0 bf0Var3 = new bf0(context2);
                                nxa.f1(bf0Var3.getImageReceiver(), starGift, nm7.p2);
                                i11.addView(bf0Var3, qoe.t(nm7.p2, nm7.p2, 17, 0, -8, 0, 10));
                                TextView textView3 = new TextView(context2);
                                td4.x(textView3, cmb.i5, ylbVar, 1, 20.0f);
                                hg9.p(textView3, 17, null, 2131749902);
                                TextView m = wi8.m(i11, textView3, qoe.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                m.setTextSize(1, 14.0f);
                                m.setTypeface(gm.o());
                                m.setGravity(17);
                                wi8.x(m, cmb.p7, ylbVar, null, 2131749903);
                                i11.addView(m, qoe.t(-1, -2, 17, 20, 0, 20, 4));
                                mhb mhbVar = new mhb(context2, ylbVar);
                                if (starGift.first_sale_date != 0) {
                                    mhbVar.g(starGift.first_sale_date, jb6.M0(2131749905, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    mhbVar.g(starGift.last_sale_date, jb6.M0(2131749904, null));
                                }
                                mhbVar.f(jb6.M0(2131749901, null), nxa.b1(false, "⭐️ ".concat(jb6.E(starGift.stars, ',')), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    nxa.C0(mhbVar, i9, starGift, ylbVar);
                                }
                                i11.addView(mhbVar, qoe.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                b61 b61Var = new b61(ylbVar, context2, true);
                                b61Var.i(jb6.M0(2131747564, null), false, true);
                                i11.addView(b61Var, qoe.o(-1, 48));
                                h.O = i11;
                                my0[] my0VarArr = {h};
                                my0VarArr[0].T0 = false;
                                b61Var.setOnClickListener(new f5(my0VarArr, (byte) 6));
                                my0VarArr[0].J();
                                d S3 = LaunchActivity.S();
                                if (!gm.O1() && !gm.s1(S3)) {
                                    my0VarArr[0].X(S3);
                                }
                                my0VarArr[0].show();
                            }
                        }
                    }
                });
                b1();
                this.T1.O(false);
                W0();
                if (ok0.a(i).c(j)) {
                    a1(true);
                }
                nm7.f(i).b(this, nm7.n5);
                nm7.f(i).b(this, nm7.H3);
                nm7.f(i).b(this, nm7.E0);
                nm7.f(i).b(this, nm7.K3);
                nm7.f(i).b(this, i2);
                this.o1.setTitle(J0());
                nm7.i(this.o1.getTitleTextView());
                gm.B2(this.o1);
                this.v1 = false;
                sy4 sy4Var = this.X0;
                eh0 eh0Var = new eh0(sy4Var, new zw4(this));
                FrameLayout frameLayout3 = (FrameLayout) this.b;
                View view = new View(context);
                this.w2 = view;
                frameLayout3.addView(view, qoe.e(-1, 0, 48));
                View view2 = this.w2;
                int i8 = this.u0;
                gm.v3(view2, i8, 0, i8, 0);
                View view3 = this.w2;
                view3.setBackground(eh0Var.a(view3));
                this.x2 = new View(context);
                vgc vgcVar = new vgc(-2, this.J0, context, true);
                this.z2 = vgcVar;
                vgcVar.r = 12;
                int i9 = cmb.y6;
                vgcVar.h(i9, cmb.F6, i9, cmb.h6, cmb.c6);
                vgc vgcVar2 = this.z2;
                km0 km0Var = eh0Var.c;
                im0 c = km0Var.c(vgcVar2, null, false);
                c.p(qqd.l(this.J0));
                c.r(gm.L(20.0f));
                vgcVar2.setBlurredBackground(c);
                this.z2.setDelegate(new fk3(this));
                su suVar = new su(this, context, new TextPaint(1), (byte) 17);
                this.y2 = suVar;
                suVar.addView(this.z2, qoe.e(-2, 40, 51));
                this.y2.setVisibility(8);
                frameLayout3.addView(this.y2, qoe.e(-1, 40, 48));
                su suVar2 = this.y2;
                int i10 = this.u0;
                gm.v3(suVar2, i10, 0, i10, 0);
                rja rjaVar = new rja(context, this.J0);
                this.u2 = rjaVar;
                rjaVar.setBackButtonImage(R.drawable.ic_ab_back);
                this.u2.setTitle(J0());
                this.u2.setTitlesAlpha(0.0f);
                this.u2.setActionBarMenuOnItemClick(new fh2(this, (byte) 21));
                eh0Var.f(frameLayout3, this.n1, this.u2, this.J0);
                rja rjaVar2 = this.u2;
                int i11 = this.u0;
                gm.v3(rjaVar2, i11, 0, i11, 0);
                this.u2.setBackground(null);
                fb9 fb9Var = new fb9(i, this.J0, context);
                im0 c2 = km0Var.c(fb9Var, null, false);
                c2.p(qqd.l(this.J0));
                c2.r(gm.L(23.0f));
                c2.q(gm.L(6.0f));
                fb9Var.setBackground(c2);
                rve.a(fb9Var);
                fb9Var.setOnClickListener(new sf3(fb9Var, (byte) 27));
                fb9Var.setOnWidthChanged(new ax4(this, (byte) 0));
                this.u2.addView(fb9Var, qoe.e(-2, 58, 5));
                sy4Var.i(this.b);
                this.T1.O(false);
            }
            linearLayout2.addView(frameLayout2, qoe.t(-2, -2, 1, 0, 9, 0, 4));
            nm7.i(a31Var);
            a31Var.setText(gw3.m(gm.S2(jb6.a0(null, null, 2131749897, str)), a31Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i2 = i7;
        i3 = 3;
        b = 7;
        f84 f84Var2 = new f84(i3, false);
        this.c2 = f84Var2;
        f84Var2.O = new zr1(this, b);
        this.n1.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setClipChildren(false);
        this.n1.setLayoutManager(f84Var2);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        gx4 gx4Var2 = new gx4();
        this.d2 = gx4Var2;
        gx4Var2.C = false;
        gx4Var2.m = false;
        gx4Var2.n(350L);
        gx4Var2.o(d53Var);
        gx4Var2.D = (byte) 40;
        this.n1.setItemAnimator(gx4Var2);
        this.n1.setOnItemClickListener(new f59() { // from class: ex4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f59
            public final void g(int i82, View view4) {
                TL_stars.SavedStarGift savedStarGift;
                ux4 ux4Var = ux4.this;
                dy0 dy0Var = ux4Var.c;
                byte b3 = 1;
                c6c G = ux4Var.T1.G(i82 - 1);
                if (G == null || !G.H(nx4.class)) {
                    return;
                }
                Object obj = G.H;
                boolean z3 = obj instanceof nw4;
                Context context2 = context;
                int i92 = i;
                qac qacVar2 = qacVar;
                int i102 = 0;
                Object[] objArr = 0;
                if (z3) {
                    new hx4(ux4Var, context2, i92, (nw4) obj, ux4Var.W1, new bx4(ux4Var, qacVar2, objArr == true ? 1 : 0)).show();
                    return;
                }
                if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    ava avaVar = ux4Var.h2;
                    long j2 = j;
                    if (avaVar != null && ux4Var.l2 == ux4Var.j2) {
                        ArrayList arrayList = avaVar.l;
                        int size = arrayList.size();
                        while (true) {
                            if (i102 >= size) {
                                savedStarGift = null;
                                break;
                            }
                            Object obj2 = arrayList.get(i102);
                            i102++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.id == starGift.id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        }
                        if (savedStarGift == null || fs7.m(savedStarGift.gift)) {
                            return;
                        }
                        ix4 ix4Var = new ix4(ux4Var, ux4Var.getContext(), i92, z8c.h(i92).e(), ux4Var.J0);
                        ix4Var.n2(savedStarGift, null);
                        ix4Var.c2(j2, new s2c((Object) ux4Var, (Object) ix4Var, j2, (Object) qacVar2, (byte) 5));
                        return;
                    }
                    if (G.r && starGift.availability_resale > 0) {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            bh0 bh0Var = new bh0();
                            bh0Var.a = true;
                            bh0Var.e = true;
                            jx4 jx4Var = new jx4(j2, starGift.title, starGift.id, ux4Var.J0, dy0Var.getViewTreeObserver(), new cx4());
                            jx4Var.e = new qy1((Object) ux4Var, (Object) qacVar2, (byte) 23);
                            S.showAsSheet(jx4Var, bh0Var);
                            return;
                        }
                        return;
                    }
                    if (starGift.auction) {
                        e00.Z0(context2, ux4Var.J0, i92, j2, starGift.id, new bx4(ux4Var, qacVar2, b3));
                        return;
                    }
                    if (!starGift.sold_out) {
                        if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                            new c41(dy0Var, ux4Var.J0).R(starGift.getDocument(), gm.S2(jb6.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                            return;
                        }
                        i77 i77Var = new i77((Object) ux4Var, (Object) context2, i92, (Object) starGift, (Object) qacVar2, (byte) 15);
                        if (starGift.locked_until_date > ConnectionsManager.getInstance(i92).getCurrentTime()) {
                            he heVar = new he(3, null, ux4Var.getContext());
                            heVar.q(500L);
                            TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                            checkcansendgift.gift_id = starGift.id;
                            ConnectionsManager.getInstance(i92).sendRequest(checkcansendgift, new av0((Object) ux4Var, (Object) heVar, (Object) i77Var, (Object) qacVar2, (byte) 6));
                            return;
                        }
                        if (!starGift.require_premium || z8c.h(i92).p()) {
                            i77Var.run();
                            return;
                        }
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            yj8 yj8Var = new yj8(S2, i92, null, null, starGift, ux4Var.J0);
                            bf0 bf0Var2 = new bf0(ux4Var.getContext());
                            tm tmVar = new tm(gm.L(160.0f), 4, bf0Var2, false);
                            bf0Var2.setImageDrawable(tmVar);
                            bf0Var2.addOnAttachStateChangeListener(new eq1(tmVar, (byte) 1));
                            tmVar.i(starGift.getDocument(), false);
                            yj8Var.w2 = bf0Var2;
                            yj8Var.show();
                            tmVar.f();
                            return;
                        }
                        return;
                    }
                    ylb ylbVar = ux4Var.J0;
                    if (context2 != null) {
                        my0 h = hg9.h(1, ylbVar, context2, false);
                        LinearLayout i112 = hg9.i(context2, 1);
                        i112.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
                        i112.setClipChildren(false);
                        i112.setClipToPadding(false);
                        bf0 bf0Var3 = new bf0(context2);
                        nxa.f1(bf0Var3.getImageReceiver(), starGift, nm7.p2);
                        i112.addView(bf0Var3, qoe.t(nm7.p2, nm7.p2, 17, 0, -8, 0, 10));
                        TextView textView3 = new TextView(context2);
                        td4.x(textView3, cmb.i5, ylbVar, 1, 20.0f);
                        hg9.p(textView3, 17, null, 2131749902);
                        TextView m = wi8.m(i112, textView3, qoe.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        m.setTextSize(1, 14.0f);
                        m.setTypeface(gm.o());
                        m.setGravity(17);
                        wi8.x(m, cmb.p7, ylbVar, null, 2131749903);
                        i112.addView(m, qoe.t(-1, -2, 17, 20, 0, 20, 4));
                        mhb mhbVar = new mhb(context2, ylbVar);
                        if (starGift.first_sale_date != 0) {
                            mhbVar.g(starGift.first_sale_date, jb6.M0(2131749905, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            mhbVar.g(starGift.last_sale_date, jb6.M0(2131749904, null));
                        }
                        mhbVar.f(jb6.M0(2131749901, null), nxa.b1(false, "⭐️ ".concat(jb6.E(starGift.stars, ',')), 0.8f, null), null, null);
                        if (starGift.limited) {
                            nxa.C0(mhbVar, i92, starGift, ylbVar);
                        }
                        i112.addView(mhbVar, qoe.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        b61 b61Var = new b61(ylbVar, context2, true);
                        b61Var.i(jb6.M0(2131747564, null), false, true);
                        i112.addView(b61Var, qoe.o(-1, 48));
                        h.O = i112;
                        my0[] my0VarArr = {h};
                        my0VarArr[0].T0 = false;
                        b61Var.setOnClickListener(new f5(my0VarArr, (byte) 6));
                        my0VarArr[0].J();
                        d S3 = LaunchActivity.S();
                        if (!gm.O1() && !gm.s1(S3)) {
                            my0VarArr[0].X(S3);
                        }
                        my0VarArr[0].show();
                    }
                }
            }
        });
        b1();
        this.T1.O(false);
        W0();
        if (ok0.a(i).c(j)) {
        }
        nm7.f(i).b(this, nm7.n5);
        nm7.f(i).b(this, nm7.H3);
        nm7.f(i).b(this, nm7.E0);
        nm7.f(i).b(this, nm7.K3);
        nm7.f(i).b(this, i2);
        this.o1.setTitle(J0());
        nm7.i(this.o1.getTitleTextView());
        gm.B2(this.o1);
        this.v1 = false;
        sy4 sy4Var2 = this.X0;
        eh0 eh0Var2 = new eh0(sy4Var2, new zw4(this));
        FrameLayout frameLayout32 = (FrameLayout) this.b;
        View view4 = new View(context);
        this.w2 = view4;
        frameLayout32.addView(view4, qoe.e(-1, 0, 48));
        View view22 = this.w2;
        int i82 = this.u0;
        gm.v3(view22, i82, 0, i82, 0);
        View view32 = this.w2;
        view32.setBackground(eh0Var2.a(view32));
        this.x2 = new View(context);
        vgc vgcVar3 = new vgc(-2, this.J0, context, true);
        this.z2 = vgcVar3;
        vgcVar3.r = 12;
        int i92 = cmb.y6;
        vgcVar3.h(i92, cmb.F6, i92, cmb.h6, cmb.c6);
        vgc vgcVar22 = this.z2;
        km0 km0Var2 = eh0Var2.c;
        im0 c3 = km0Var2.c(vgcVar22, null, false);
        c3.p(qqd.l(this.J0));
        c3.r(gm.L(20.0f));
        vgcVar22.setBlurredBackground(c3);
        this.z2.setDelegate(new fk3(this));
        su suVar3 = new su(this, context, new TextPaint(1), (byte) 17);
        this.y2 = suVar3;
        suVar3.addView(this.z2, qoe.e(-2, 40, 51));
        this.y2.setVisibility(8);
        frameLayout32.addView(this.y2, qoe.e(-1, 40, 48));
        su suVar22 = this.y2;
        int i102 = this.u0;
        gm.v3(suVar22, i102, 0, i102, 0);
        rja rjaVar3 = new rja(context, this.J0);
        this.u2 = rjaVar3;
        rjaVar3.setBackButtonImage(R.drawable.ic_ab_back);
        this.u2.setTitle(J0());
        this.u2.setTitlesAlpha(0.0f);
        this.u2.setActionBarMenuOnItemClick(new fh2(this, (byte) 21));
        eh0Var2.f(frameLayout32, this.n1, this.u2, this.J0);
        rja rjaVar22 = this.u2;
        int i112 = this.u0;
        gm.v3(rjaVar22, i112, 0, i112, 0);
        this.u2.setBackground(null);
        fb9 fb9Var2 = new fb9(i, this.J0, context);
        im0 c22 = km0Var2.c(fb9Var2, null, false);
        c22.p(qqd.l(this.J0));
        c22.r(gm.L(23.0f));
        c22.q(gm.L(6.0f));
        fb9Var2.setBackground(c22);
        rve.a(fb9Var2);
        fb9Var2.setOnClickListener(new sf3(fb9Var2, (byte) 27));
        fb9Var2.setOnWidthChanged(new ax4(this, (byte) 0));
        this.u2.addView(fb9Var2, qoe.e(-2, 58, 5));
        sy4Var2.i(this.b);
        this.T1.O(false);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.S1, 0, true, new vt4((Object) this, (byte) 3), this.J0);
        this.T1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return this.X1 ? jb6.M0(2131749872, null) : gw3.m(jb6.a0(null, null, 2131749781, this.Y1), null, false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    @Override // mz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(Canvas canvas, int i) {
        float f;
        int L;
        boolean z;
        View view;
        rja rjaVar = this.u2;
        if (rjaVar == null) {
            return;
        }
        int i2 = gm.m;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        float f2 = i2;
        float max = Math.max(0.0f, Z0() - f2);
        rjaVar.setTranslationY(max);
        float l = Utilities.l(1.0f - (max / gm.L(24.0f)));
        float f3 = f2 + max + currentActionBarHeight;
        View view2 = this.t2 ? this.r2 : this.s2;
        float f4 = Float.NaN;
        r59 r59Var = this.n1;
        if (view2 != null && view2.isAttachedToWindow()) {
            float height = view2.getHeight();
            while (view2 != null && view2 != r59Var) {
                height += view2.getY();
                view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
            }
            if (view2 == r59Var) {
                f = r59Var.getY() + height;
                this.v2.a(Float.isNaN(f) ? f < f3 : Z0() == -3.4028235E38f, !this.J);
                L = gm.L(6.0f) + currentActionBarHeight + i2;
                z = this.B2;
                su suVar = this.y2;
                if (z) {
                    suVar.setVisibility(8);
                } else {
                    View view3 = this.x2;
                    View view4 = view3.getParent() instanceof View ? (View) view3.getParent() : null;
                    if (view4 != null && view4.getParent() == r59Var) {
                        r59Var.getClass();
                        this.C2 = RecyclerView.R(view4);
                        f4 = r59Var.getY() + view4.getY() + gm.L(6.0f);
                    }
                    float d = eh0.d(i2) + max;
                    if (Float.isNaN(f4)) {
                        View childAt = r59Var.getChildCount() > 0 ? r59Var.getChildAt(0) : null;
                        f4 = (childAt == null || this.C2 < 0 || RecyclerView.R(childAt) <= this.C2) ? this.b.getHeight() : d;
                    }
                    float max2 = Math.max(d, f4);
                    suVar.setTranslationY(max2);
                    suVar.setVisibility(0);
                    L = Math.max(L, Math.round(((gm.L(46.0f) + d) - max) - Math.max(0.0f, max2 - d)));
                }
                view = this.w2;
                view.setTranslationY(max);
                view.setAlpha(l);
                if (view.getLayoutParams().height == L) {
                    view.getLayoutParams().height = L;
                    view.requestLayout();
                    return;
                }
                return;
            }
        }
        f = Float.NaN;
        this.v2.a(Float.isNaN(f) ? f < f3 : Z0() == -3.4028235E38f, !this.J);
        L = gm.L(6.0f) + currentActionBarHeight + i2;
        z = this.B2;
        su suVar2 = this.y2;
        if (z) {
        }
        view = this.w2;
        view.setTranslationY(max);
        view.setAlpha(l);
        if (view.getLayoutParams().height == L) {
        }
    }

    @Override // mz0
    public final void W0() {
        super.W0();
        rja rjaVar = this.u2;
        if (rjaVar != null) {
            rjaVar.setTitle(J0());
        }
    }

    public final void Y0(ArrayList arrayList, l7c l7cVar) {
        boolean z;
        boolean z2;
        long j;
        ava avaVar;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        vgc vgcVar;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        ava avaVar2;
        ava avaVar3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        this.B2 = false;
        this.t2 = false;
        byte b = 3;
        if (this.X1 || this.W1 < 0 || ((disallowedGiftsSettings4 = this.V1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            z = false;
        } else {
            arrayList.add(c6c.k(this.Z1));
            this.t2 = true;
            arrayList.add(c6c.k(this.a2));
            ArrayList arrayList2 = this.g2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                c6c q = c6c.q(1, 34);
                q.v = 1;
                arrayList.add(q);
                c6c q2 = c6c.q(2, 34);
                q2.v = 1;
                arrayList.add(q2);
                c6c q3 = c6c.q(3, 34);
                q3.v = 1;
                arrayList.add(q3);
            } else {
                ArrayList arrayList3 = this.g2;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    int i2 = nx4.b;
                    c6c K = c6c.K(nx4.class);
                    K.v = 1;
                    K.H = (nw4) obj;
                    arrayList.add(K);
                }
            }
            z = true;
        }
        jva v = jva.v(this.S1, false);
        ArrayList arrayList4 = this.m2 ? v.J : v.I;
        if (this.V1 != null) {
            arrayList4 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new sn1(this, b)).collect(Collectors.toCollection(new tn1((byte) 0)));
        }
        byte b2 = 5;
        if (this.W1 < 0) {
            arrayList4 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new se(b2)).collect(Collectors.toCollection(new tn1((byte) 0)));
        }
        if (this.W1 != z8c.h(this.S1).e() && (avaVar3 = this.h2) != null) {
            ArrayList arrayList5 = avaVar3.l;
            int size2 = arrayList5.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList5.get(i3);
                i3++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !fs7.m(starGift2)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (oc7.r1(this.S1).l4.x2.f || (arrayList4.isEmpty() && ((disallowedGiftsSettings3 = this.V1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || (avaVar2 = this.h2) == null || avaVar2.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.V1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList4.isEmpty()) {
                return;
            }
            arrayList.add(c6c.D(gm.L(300.0f)));
            return;
        }
        if (z) {
            arrayList.add(c6c.D(gm.L(16.0f)));
        } else {
            arrayList.add(c6c.k(this.Z1));
        }
        arrayList.add(c6c.k(this.b2));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.V1;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList4.get(i4)).stars));
            }
        }
        ArrayList arrayList6 = new ArrayList();
        this.j2 = -1;
        this.i2 = -1;
        if (!arrayList4.isEmpty()) {
            this.i2 = arrayList6.size();
            arrayList6.add(jb6.M0(2131749883, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.V1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z2) {
            this.j2 = arrayList6.size();
            arrayList6.add(jb6.M0(2131749879, null));
        }
        this.k2 = arrayList6.size();
        arrayList6.add(jb6.M0(2131749882, null));
        if (this.n2 && !this.o2) {
            this.o2 = true;
            this.l2 = this.k2;
        }
        arrayList.add(c6c.n(this.x2, 52));
        this.B2 = true;
        ArrayList arrayList7 = this.A2;
        if (this.z2 != null) {
            if (!arrayList7.equals(arrayList6)) {
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                this.z2.c();
                int i5 = 0;
                while (true) {
                    int size3 = arrayList6.size();
                    vgcVar = this.z2;
                    if (i5 >= size3) {
                        break;
                    }
                    vgcVar.a(i5, (CharSequence) arrayList6.get(i5));
                    i5++;
                }
                vgcVar.y.f();
                this.y2.requestLayout();
            }
            int currentTabId = this.z2.getCurrentTabId();
            int i6 = this.l2;
            if (currentTabId != i6) {
                this.z2.g(1.0f, i6);
            }
        }
        boolean z3 = this.l2 == this.k2 && !this.X1 && this.W1 >= 0;
        if (z3 == this.D2) {
            j = 0;
        } else {
            this.D2 = z3;
            j = 0;
            ViewPropertyAnimator duration = this.e2.animate().alpha(!z3 ? 1.0f : 0.0f).scaleX(!z3 ? 1.0f : 0.85f).scaleY(!z3 ? 1.0f : 0.85f).setDuration(380L);
            d53 d53Var = d53.h;
            duration.setInterpolator(d53Var).start();
            this.f2.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.85f).scaleY(z3 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(d53Var).start();
        }
        if (this.h2 != null && this.l2 == this.j2) {
            arrayList4 = new ArrayList();
            ArrayList arrayList8 = this.h2.l;
            int size4 = arrayList8.size();
            int i7 = 0;
            while (i7 < size4) {
                Object obj3 = arrayList8.get(i7);
                i7++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                TL_stars.StarGift starGift3 = savedStarGift.gift;
                if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !fs7.m(starGift3)) {
                    arrayList4.add(savedStarGift.gift);
                }
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList4.size(); i9++) {
            TL_stars.StarGift starGift4 = (TL_stars.StarGift) arrayList4.get(i9);
            int i10 = this.l2;
            if (i10 == this.i2 || i10 == this.j2 || (i10 == this.k2 && (starGift4.availability_resale > j || starGift4.require_premium || starGift4.locked_until_date != 0))) {
                if (starGift4.sold_out || starGift4.availability_resale <= j || i10 == this.k2) {
                    starGift = starGift4;
                } else {
                    c6c i11 = nx4.i(i10, starGift4, i10 == this.j2, starGift4.limited && (disallowedGiftsSettings2 = this.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift4;
                    arrayList.add(i11);
                    i8++;
                }
                int i12 = this.l2;
                arrayList.add(nx4.i(i12, starGift, i12 == this.j2, starGift.limited && (disallowedGiftsSettings = this.V1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i8++;
            }
        }
        int i13 = this.l2;
        int i14 = this.j2;
        if (i13 == i14 && (avaVar = this.h2) != null && !avaVar.j) {
            avaVar.a();
            c6c q4 = c6c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            c6c q5 = c6c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            c6c q6 = c6c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
        } else if (i13 != i14 && v.C) {
            c6c q7 = c6c.q(4, 34);
            q7.v = 1;
            arrayList.add(q7);
            c6c q8 = c6c.q(5, 34);
            q8.v = 1;
            arrayList.add(q8);
            c6c q9 = c6c.q(6, 34);
            q9.v = 1;
            arrayList.add(q9);
        }
        arrayList.add(c6c.D(gm.L(i8 >= 9 ? 40.0f : 300.0f)));
    }

    public final float Z0() {
        int i = 0;
        float f = Float.MAX_VALUE;
        while (true) {
            r59 r59Var = this.n1;
            if (i >= r59Var.getChildCount()) {
                return f == Float.MAX_VALUE ? r59Var.getHeight() : f;
            }
            View childAt = r59Var.getChildAt(i);
            int R = RecyclerView.R(childAt);
            if (R == 1) {
                return r59Var.getY() + childAt.getY();
            }
            if (R > 1) {
                f = -3.4028235E38f;
            }
            i++;
        }
    }

    public final void a1(boolean z) {
        this.m2 = z;
        this.T1.O(false);
    }

    public final void b1() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.g2;
        arrayList.clear();
        byte b = 1;
        if (arrayList.isEmpty() && (list = this.U1) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j = 0;
            for (int size = this.U1.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.U1.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.U1.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    nw4 nw4Var = new nw4(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(nw4Var);
                    if (e21.b()) {
                        if (nw4Var.f() > j) {
                            j = nw4Var.f();
                        }
                    } else if (nw4Var.h() != null && cj0.h().j()) {
                        i5 i5Var = new i5();
                        i5Var.b = "inapp";
                        i5Var.a = nw4Var.h();
                        arrayList2.add(i5Var.a());
                    }
                }
            }
            if (e21.b()) {
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((nw4) obj).g = j;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                cj0.h().o(arrayList2, new zw4(this));
            }
        }
        if (arrayList.isEmpty()) {
            oo0.l(this.S1, null, new ax4(this, b));
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i == nm7.n5) {
            b1();
            return;
        }
        if (i == nm7.H3) {
            l7c l7cVar2 = this.T1;
            if (l7cVar2 != null) {
                l7cVar2.O(true);
                return;
            }
            return;
        }
        if (i != nm7.E0) {
            if (i != nm7.K3) {
                if (i == nm7.I3 && objArr[1] == this.h2 && (l7cVar = this.T1) != null) {
                    l7cVar.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new c41(this.c, this.J0).s(starGift.sticker, jb6.M0(2131749900, null), gm.S2(jb6.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            l7c l7cVar3 = this.T1;
            if (l7cVar3 != null) {
                l7cVar3.O(true);
                return;
            }
            return;
        }
        if (this.J) {
            return;
        }
        long longValue = ((Long) objArr[0]).longValue();
        long j = this.W1;
        if (longValue == j && j > 0) {
            int i3 = this.S1;
            TLRPC.UserFull X1 = oc7.r1(i3).X1(j);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j == z8c.h(i3).e() || X1 == null) ? null : X1.disallowed_stargifts;
            this.V1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    b10.u(jb6.a0(null, null, 2131743429, pg3.s(j)), c41.b0(S), R.raw.error, 36);
                    return;
                }
                return;
            }
            l7c l7cVar4 = this.T1;
            if (l7cVar4 != null) {
                l7cVar4.O(true);
            }
        }
        ArrayList arrayList = this.g2;
        if (arrayList == null || arrayList.isEmpty()) {
            b1();
            l7c l7cVar5 = this.T1;
            if (l7cVar5 != null) {
                l7cVar5.O(true);
            }
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        int i = this.S1;
        nm7.f(i).n(this, nm7.n5);
        nm7.f(i).n(this, nm7.H3);
        nm7.f(i).n(this, nm7.E0);
        nm7.f(i).n(this, nm7.K3);
        nm7.f(i).n(this, nm7.I3);
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        int i = this.S1;
        if (oc7.r1(i).u2()) {
            h5.b(i);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.V1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        d S = LaunchActivity.S();
        if (S != null) {
            b10.u(jb6.a0(null, null, 2131743429, pg3.s(this.W1)), c41.b0(S), R.raw.error, 36);
        }
    }

    public ux4(LaunchActivity launchActivity, int i, long j) {
        this(launchActivity, i, j, null, null);
    }
}
