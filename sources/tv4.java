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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tv4 extends fy0 implements gk7 {
    public final ArrayList A2;
    public boolean B2;
    public int C2;
    public boolean D2;
    public final int S1;
    public l5c T1;
    public List U1;
    public TLRPC.DisallowedGiftsSettings V1;
    public final long W1;
    public final boolean X1;
    public final String Y1;
    public final a6 Z1;
    public final FrameLayout a2;
    public final LinearLayout b2;
    public final w64 c2;
    public final fv4 d2;
    public final s11 e2;
    public final s11 f2;
    public final ArrayList g2;
    public final xsa h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public qua p2;
    public final l46 q2;
    public final TextView r2;
    public final TextView s2;
    public boolean t2;
    public final pha u2;
    public final fm0 v2;
    public final View w2;
    public final View x2;
    public final st y2;
    public final vec z2;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0441  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tv4(final Context context, final int i, final long j, List list, final p8c p8cVar) {
        super(context, null, false, false, null);
        s33 s33Var;
        String str;
        int i2;
        byte b;
        int i3;
        this.g2 = new ArrayList();
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        yu4 yu4Var = new yu4(this);
        s33 s33Var2 = s33.h;
        this.v2 = new fm0(0, yu4Var, s33Var2, 320L, false);
        this.A2 = new ArrayList();
        this.C2 = -1;
        this.S1 = i;
        this.W1 = j;
        boolean z = y6c.h(i).e() == j;
        this.X1 = z;
        this.U1 = list;
        int i4 = bkb.a6;
        t0(i4);
        M(i4);
        this.h2 = gta.v(i, false).D(y6c.h(i).e(), true);
        gta.v(i, false).T();
        be0 be0Var = new be0(context);
        be0Var.setImportantForAccessibility(2);
        pb0 pb0Var = new pb0((wjb) null);
        if (j > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            String l = l7c.l(V1);
            this.Y1 = l;
            pb0Var.q(V1);
            be0Var.f(V1, pb0Var);
            TLRPC.UserFull W1 = na7.q1(i).W1(j);
            this.V1 = (j == y6c.h(i).e() || W1 == null) ? null : W1.disallowed_stargifts;
            if (W1 == null) {
                na7.q1(i).Y2(V1, 0, true, null);
            }
            s33Var = s33Var2;
            str = l;
        } else {
            s33Var = s33Var2;
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            str = K0 == null ? "" : K0.title;
            this.Y1 = str;
            pb0Var.p(K0);
            be0Var.f(K0, pb0Var);
        }
        this.u1 = 0.1f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.a2 = frameLayout;
        a6 a6Var = new a6(context, (byte) 15);
        this.Z1 = a6Var;
        a6Var.setClipChildren(false);
        a6Var.setClipToPadding(false);
        qua quaVar = new qua(context, 70, 0);
        this.p2 = quaVar;
        a6Var.addView(quaVar, nme.c(-1.0f, -1));
        be0Var.setRoundRadius(gl.L(42.0f));
        a6Var.addView(be0Var, nme.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        ote.a(be0Var);
        be0Var.setOnClickListener(new ly(this, j, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, nme.e(-1, -2, 55));
        TextView textView = new TextView(context);
        this.r2 = textView;
        ir2.t(textView, 1, 20.0f);
        int i5 = bkb.i5;
        zkb.X(textView, i5, this.J0);
        textView.setGravity(17);
        linearLayout.addView(textView, nme.t(-1, -2, 1, 4, 0, 4, 0));
        textView.setMaxWidth(je5.a(textView.getText(), textView.getPaint()));
        l46 l46Var = new l46(context, this.J0);
        int i6 = bkb.Wc;
        zkb.G(l46Var, i6, this.J0);
        l46Var.setTextSize(1, 14.0f);
        zkb.X(l46Var, i5, this.J0);
        l46Var.setGravity(17);
        l46Var.setLineSpacing(gl.L(2.33f), 1.0f);
        linearLayout.addView(l46Var, nme.t(-1, -2, 1, 4, 4, 4, 12));
        textView.setText(k96.M0(2131750059, null));
        l46Var.setText(TextUtils.concat(gl.T2(k96.a0(null, null, 2131750058, str)), " ", gl.E2(gl.i2(k96.M0(2131750057, null), new ql3((byte) 7)), true)));
        l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context);
        this.s2 = textView2;
        ir2.t(textView2, 1, 20.0f);
        zkb.X(textView2, i5, this.J0);
        textView2.setGravity(17);
        linearLayout2.addView(textView2, nme.t(-1, -2, 1, 4, 0, 4, 0));
        s11 s11Var = new s11(context, this.J0, (byte) 3);
        this.e2 = s11Var;
        zkb.G(s11Var, i6, this.J0);
        s11Var.setTextSize(1, 14.0f);
        zkb.X(s11Var, i5, this.J0);
        s11Var.setGravity(17);
        boolean z2 = z;
        s11 s11Var2 = new s11(context, this.J0, (byte) 4);
        this.f2 = s11Var2;
        zkb.G(s11Var2, i6, this.J0);
        s11Var2.setTextSize(1, 14.0f);
        zkb.X(s11Var2, i5, this.J0);
        s11Var2.setGravity(17);
        s11Var2.setAlpha(0.0f);
        s11Var2.setScaleX(0.85f);
        s11Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(s11Var, nme.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(s11Var2, nme.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView2.setText(k96.M0(j < 0 ? 2131749949 : z2 ? 2131749940 : 2131749950, null));
        byte b2 = 8;
        int i7 = kk7.H3;
        if (z2) {
            linearLayout2.addView(frameLayout2, nme.t(-2, -2, 1, 0, 9, 0, 4));
            l46 l46Var2 = new l46(context, this.J0);
            zkb.G(l46Var2, i6, this.J0);
            l46Var2.setTextSize(1, 14.0f);
            zkb.X(l46Var2, i5, this.J0);
            l46Var2.setGravity(17);
            linearLayout2.addView(l46Var2, nme.t(-2, -2, 1, 26, 4, 26, 6));
            s11Var.setText(k96.M0(2131749939, null));
            l46Var2.setText(k96.M0(2131749938, null));
            this.q2 = l46Var2;
        } else {
            if (j >= 0) {
                linearLayout2.addView(frameLayout2, nme.t(-1, -2, 1, 0, 9, 0, 6));
                xsa D = gta.v(i, false).D(j, true);
                i2 = i7;
                b = 7;
                o77 o77Var = new o77((Object) this, (Object) D, j, (Object) p8cVar, (Object) context, (byte) 7);
                o77Var.run();
                s11Var.addOnAttachStateChangeListener(new wc(o77Var, b2));
                i3 = 3;
                if (D.l.size() < 3) {
                    D.a();
                }
                kk7.f(i).h(s11Var, i2, new pz1((Object) D, (Object) o77Var, (byte) 23));
                w64 w64Var = new w64(i3, false);
                this.c2 = w64Var;
                w64Var.O = new nq1(this, b);
                this.n1.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                this.n1.setClipToPadding(false);
                this.n1.setClipChildren(false);
                this.n1.setLayoutManager(w64Var);
                this.n1.setSelectorType(9);
                this.n1.setSelectorDrawableColor(0);
                fv4 fv4Var = new fv4();
                this.d2 = fv4Var;
                fv4Var.C = false;
                fv4Var.m = false;
                fv4Var.n(350L);
                fv4Var.o(s33Var);
                fv4Var.D = (byte) 40;
                this.n1.setItemAnimator(fv4Var);
                this.n1.setOnItemClickListener(new c39() { // from class: dv4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // c39
                    public final void d(int i8, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        tv4 tv4Var = tv4.this;
                        ww0 ww0Var = tv4Var.c;
                        byte b3 = 1;
                        c4c G = tv4Var.T1.G(i8 - 1);
                        if (G == null || !G.H(mv4.class)) {
                            return;
                        }
                        Object obj = G.H;
                        boolean z3 = obj instanceof mu4;
                        Context context2 = context;
                        int i9 = i;
                        p8c p8cVar2 = p8cVar;
                        int i10 = 0;
                        Object[] objArr = 0;
                        if (z3) {
                            new gv4(tv4Var, context2, i9, (mu4) obj, tv4Var.W1, new av4(tv4Var, p8cVar2, objArr == true ? 1 : 0)).show();
                            return;
                        }
                        if (obj instanceof TL_stars.StarGift) {
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            xsa xsaVar = tv4Var.h2;
                            long j2 = j;
                            if (xsaVar != null && tv4Var.l2 == tv4Var.j2) {
                                ArrayList arrayList = xsaVar.l;
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
                                if (savedStarGift == null || cq7.m(savedStarGift.gift)) {
                                    return;
                                }
                                hv4 hv4Var = new hv4(tv4Var, tv4Var.getContext(), i9, y6c.h(i9).e(), tv4Var.J0);
                                hv4Var.n2(savedStarGift, null);
                                hv4Var.c2(j2, new s0c((Object) tv4Var, (Object) hv4Var, j2, (Object) p8cVar2, (byte) 5));
                                return;
                            }
                            if (G.r && starGift.availability_resale > 0) {
                                d S = LaunchActivity.S();
                                if (S != null) {
                                    ag0 ag0Var = new ag0();
                                    ag0Var.a = true;
                                    ag0Var.e = true;
                                    iv4 iv4Var = new iv4(j2, starGift.title, starGift.id, tv4Var.J0, ww0Var.getViewTreeObserver(), new bv4());
                                    iv4Var.e = new pz1((Object) tv4Var, (Object) p8cVar2, (byte) 22);
                                    S.showAsSheet(iv4Var, ag0Var);
                                    return;
                                }
                                return;
                            }
                            if (starGift.auction) {
                                ez.Z0(context2, tv4Var.J0, i9, j2, starGift.id, new av4(tv4Var, p8cVar2, b3));
                                return;
                            }
                            if (!starGift.sold_out) {
                                if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                    new u21(ww0Var, tv4Var.J0).R(starGift.getDocument(), gl.T2(k96.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                    return;
                                }
                                i57 i57Var = new i57((Object) tv4Var, (Object) context2, i9, (Object) starGift, (Object) p8cVar2, (byte) 14);
                                if (starGift.locked_until_date > ConnectionsManager.getInstance(i9).getCurrentTime()) {
                                    hd hdVar = new hd(3, null, tv4Var.getContext());
                                    hdVar.q(500L);
                                    TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                    checkcansendgift.gift_id = starGift.id;
                                    ConnectionsManager.getInstance(i9).sendRequest(checkcansendgift, new rt0((Object) tv4Var, (Object) hdVar, (Object) i57Var, (Object) p8cVar2, (byte) 6));
                                    return;
                                }
                                if (!starGift.require_premium || y6c.h(i9).p()) {
                                    i57Var.run();
                                    return;
                                }
                                d S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    xh8 xh8Var = new xh8(S2, i9, null, null, starGift, tv4Var.J0);
                                    be0 be0Var2 = new be0(tv4Var.getContext());
                                    tl tlVar = new tl(gl.L(160.0f), 4, be0Var2, false);
                                    be0Var2.setImageDrawable(tlVar);
                                    be0Var2.addOnAttachStateChangeListener(new ro1(tlVar, (byte) 1));
                                    tlVar.i(starGift.getDocument(), false);
                                    xh8Var.w2 = be0Var2;
                                    xh8Var.show();
                                    tlVar.f();
                                    return;
                                }
                                return;
                            }
                            wjb wjbVar = tv4Var.J0;
                            if (context2 != null) {
                                fx0 h = de9.h(1, wjbVar, context2, false);
                                LinearLayout j3 = de9.j(context2, 1);
                                j3.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
                                j3.setClipChildren(false);
                                j3.setClipToPadding(false);
                                be0 be0Var3 = new be0(context2);
                                jva.e1(be0Var3.getImageReceiver(), starGift, kk7.p2);
                                j3.addView(be0Var3, nme.t(kk7.p2, kk7.p2, 17, 0, -8, 0, 10));
                                TextView textView3 = new TextView(context2);
                                tb4.w(textView3, bkb.i5, wjbVar, 1, 20.0f);
                                de9.q(textView3, 17, null, 2131749953);
                                TextView m = ug8.m(j3, textView3, nme.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                m.setTextSize(1, 14.0f);
                                m.setTypeface(gl.o());
                                m.setGravity(17);
                                ug8.x(m, bkb.p7, wjbVar, null, 2131749954);
                                j3.addView(m, nme.t(-1, -2, 17, 20, 0, 20, 4));
                                mfb mfbVar = new mfb(context2, wjbVar);
                                if (starGift.first_sale_date != 0) {
                                    mfbVar.g(starGift.first_sale_date, k96.M0(2131749956, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    mfbVar.g(starGift.last_sale_date, k96.M0(2131749955, null));
                                }
                                mfbVar.f(k96.M0(2131749952, null), jva.a1(false, "⭐️ ".concat(k96.E(starGift.stars, ',')), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    jva.B0(mfbVar, i9, starGift, wjbVar);
                                }
                                j3.addView(mfbVar, nme.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                u41 u41Var = new u41(wjbVar, context2, true);
                                u41Var.i(k96.M0(2131747638, null), false, true);
                                j3.addView(u41Var, nme.o(-1, 48));
                                h.O = j3;
                                fx0[] fx0VarArr = {h};
                                fx0VarArr[0].T0 = false;
                                u41Var.setOnClickListener(new f5(fx0VarArr, (byte) 6));
                                fx0VarArr[0].K();
                                d S3 = LaunchActivity.S();
                                if (!gl.O1() && !gl.s1(S3)) {
                                    fx0VarArr[0].X(S3);
                                }
                                fx0VarArr[0].show();
                            }
                        }
                    }
                });
                b1();
                this.T1.O(false);
                W0();
                if (oj0.a(i).c(j)) {
                    a1(true);
                }
                kk7.f(i).b(this, kk7.l5);
                kk7.f(i).b(this, kk7.G3);
                kk7.f(i).b(this, kk7.D0);
                kk7.f(i).b(this, kk7.J3);
                kk7.f(i).b(this, i2);
                this.o1.setTitle(J0());
                kk7.i(this.o1.getTitleTextView());
                gl.B2(this.o1);
                this.v1 = false;
                qw4 qw4Var = this.X0;
                dg0 dg0Var = new dg0(qw4Var, new yu4(this));
                FrameLayout frameLayout3 = (FrameLayout) this.b;
                View view = new View(context);
                this.w2 = view;
                frameLayout3.addView(view, nme.e(-1, 0, 48));
                View view2 = this.w2;
                int i8 = this.u0;
                gl.w3(view2, i8, 0, i8, 0);
                View view3 = this.w2;
                view3.setBackground(dg0Var.a(view3));
                this.x2 = new View(context);
                vec vecVar = new vec(-2, this.J0, context, true);
                this.z2 = vecVar;
                vecVar.r = 12;
                int i9 = bkb.y6;
                vecVar.h(i9, bkb.F6, i9, bkb.h6, bkb.c6);
                vec vecVar2 = this.z2;
                kl0 kl0Var = dg0Var.c;
                il0 c = kl0Var.c(vecVar2, null, false);
                c.p(nod.l(this.J0));
                c.r(gl.L(20.0f));
                vecVar2.setBlurredBackground(c);
                this.z2.setDelegate(new s34((Object) this, (byte) 5));
                st stVar = new st(this, context, new TextPaint(1), (byte) 16);
                this.y2 = stVar;
                stVar.addView(this.z2, nme.e(-2, 40, 51));
                this.y2.setVisibility(8);
                frameLayout3.addView(this.y2, nme.e(-1, 40, 48));
                st stVar2 = this.y2;
                int i10 = this.u0;
                gl.w3(stVar2, i10, 0, i10, 0);
                pha phaVar = new pha(context, this.J0);
                this.u2 = phaVar;
                phaVar.setBackButtonImage(R.drawable.ic_ab_back);
                this.u2.setTitle(J0());
                this.u2.setTitlesAlpha(0.0f);
                this.u2.setActionBarMenuOnItemClick(new vm2(this, (byte) 20));
                dg0Var.f(frameLayout3, this.n1, this.u2, this.J0);
                pha phaVar2 = this.u2;
                int i11 = this.u0;
                gl.w3(phaVar2, i11, 0, i11, 0);
                this.u2.setBackground(null);
                f99 f99Var = new f99(i, this.J0, context);
                il0 c2 = kl0Var.c(f99Var, null, false);
                c2.p(nod.l(this.J0));
                c2.r(gl.L(23.0f));
                c2.q(gl.L(6.0f));
                f99Var.setBackground(c2);
                ote.a(f99Var);
                f99Var.setOnClickListener(new yj3(f99Var, (byte) 24));
                f99Var.setOnWidthChanged(new zu4(this, (byte) 0));
                this.u2.addView(f99Var, nme.e(-2, 58, 5));
                qw4Var.i(this.b);
                this.T1.O(false);
            }
            linearLayout2.addView(frameLayout2, nme.t(-2, -2, 1, 0, 9, 0, 4));
            kk7.i(s11Var);
            s11Var.setText(vu3.m(gl.T2(k96.a0(null, null, 2131749948, str)), s11Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i2 = i7;
        i3 = 3;
        b = 7;
        w64 w64Var2 = new w64(i3, false);
        this.c2 = w64Var2;
        w64Var2.O = new nq1(this, b);
        this.n1.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setClipChildren(false);
        this.n1.setLayoutManager(w64Var2);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        fv4 fv4Var2 = new fv4();
        this.d2 = fv4Var2;
        fv4Var2.C = false;
        fv4Var2.m = false;
        fv4Var2.n(350L);
        fv4Var2.o(s33Var);
        fv4Var2.D = (byte) 40;
        this.n1.setItemAnimator(fv4Var2);
        this.n1.setOnItemClickListener(new c39() { // from class: dv4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // c39
            public final void d(int i82, View view4) {
                TL_stars.SavedStarGift savedStarGift;
                tv4 tv4Var = tv4.this;
                ww0 ww0Var = tv4Var.c;
                byte b3 = 1;
                c4c G = tv4Var.T1.G(i82 - 1);
                if (G == null || !G.H(mv4.class)) {
                    return;
                }
                Object obj = G.H;
                boolean z3 = obj instanceof mu4;
                Context context2 = context;
                int i92 = i;
                p8c p8cVar2 = p8cVar;
                int i102 = 0;
                Object[] objArr = 0;
                if (z3) {
                    new gv4(tv4Var, context2, i92, (mu4) obj, tv4Var.W1, new av4(tv4Var, p8cVar2, objArr == true ? 1 : 0)).show();
                    return;
                }
                if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    xsa xsaVar = tv4Var.h2;
                    long j2 = j;
                    if (xsaVar != null && tv4Var.l2 == tv4Var.j2) {
                        ArrayList arrayList = xsaVar.l;
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
                        if (savedStarGift == null || cq7.m(savedStarGift.gift)) {
                            return;
                        }
                        hv4 hv4Var = new hv4(tv4Var, tv4Var.getContext(), i92, y6c.h(i92).e(), tv4Var.J0);
                        hv4Var.n2(savedStarGift, null);
                        hv4Var.c2(j2, new s0c((Object) tv4Var, (Object) hv4Var, j2, (Object) p8cVar2, (byte) 5));
                        return;
                    }
                    if (G.r && starGift.availability_resale > 0) {
                        d S = LaunchActivity.S();
                        if (S != null) {
                            ag0 ag0Var = new ag0();
                            ag0Var.a = true;
                            ag0Var.e = true;
                            iv4 iv4Var = new iv4(j2, starGift.title, starGift.id, tv4Var.J0, ww0Var.getViewTreeObserver(), new bv4());
                            iv4Var.e = new pz1((Object) tv4Var, (Object) p8cVar2, (byte) 22);
                            S.showAsSheet(iv4Var, ag0Var);
                            return;
                        }
                        return;
                    }
                    if (starGift.auction) {
                        ez.Z0(context2, tv4Var.J0, i92, j2, starGift.id, new av4(tv4Var, p8cVar2, b3));
                        return;
                    }
                    if (!starGift.sold_out) {
                        if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                            new u21(ww0Var, tv4Var.J0).R(starGift.getDocument(), gl.T2(k96.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                            return;
                        }
                        i57 i57Var = new i57((Object) tv4Var, (Object) context2, i92, (Object) starGift, (Object) p8cVar2, (byte) 14);
                        if (starGift.locked_until_date > ConnectionsManager.getInstance(i92).getCurrentTime()) {
                            hd hdVar = new hd(3, null, tv4Var.getContext());
                            hdVar.q(500L);
                            TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                            checkcansendgift.gift_id = starGift.id;
                            ConnectionsManager.getInstance(i92).sendRequest(checkcansendgift, new rt0((Object) tv4Var, (Object) hdVar, (Object) i57Var, (Object) p8cVar2, (byte) 6));
                            return;
                        }
                        if (!starGift.require_premium || y6c.h(i92).p()) {
                            i57Var.run();
                            return;
                        }
                        d S2 = LaunchActivity.S();
                        if (S2 != null) {
                            xh8 xh8Var = new xh8(S2, i92, null, null, starGift, tv4Var.J0);
                            be0 be0Var2 = new be0(tv4Var.getContext());
                            tl tlVar = new tl(gl.L(160.0f), 4, be0Var2, false);
                            be0Var2.setImageDrawable(tlVar);
                            be0Var2.addOnAttachStateChangeListener(new ro1(tlVar, (byte) 1));
                            tlVar.i(starGift.getDocument(), false);
                            xh8Var.w2 = be0Var2;
                            xh8Var.show();
                            tlVar.f();
                            return;
                        }
                        return;
                    }
                    wjb wjbVar = tv4Var.J0;
                    if (context2 != null) {
                        fx0 h = de9.h(1, wjbVar, context2, false);
                        LinearLayout j3 = de9.j(context2, 1);
                        j3.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
                        j3.setClipChildren(false);
                        j3.setClipToPadding(false);
                        be0 be0Var3 = new be0(context2);
                        jva.e1(be0Var3.getImageReceiver(), starGift, kk7.p2);
                        j3.addView(be0Var3, nme.t(kk7.p2, kk7.p2, 17, 0, -8, 0, 10));
                        TextView textView3 = new TextView(context2);
                        tb4.w(textView3, bkb.i5, wjbVar, 1, 20.0f);
                        de9.q(textView3, 17, null, 2131749953);
                        TextView m = ug8.m(j3, textView3, nme.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        m.setTextSize(1, 14.0f);
                        m.setTypeface(gl.o());
                        m.setGravity(17);
                        ug8.x(m, bkb.p7, wjbVar, null, 2131749954);
                        j3.addView(m, nme.t(-1, -2, 17, 20, 0, 20, 4));
                        mfb mfbVar = new mfb(context2, wjbVar);
                        if (starGift.first_sale_date != 0) {
                            mfbVar.g(starGift.first_sale_date, k96.M0(2131749956, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            mfbVar.g(starGift.last_sale_date, k96.M0(2131749955, null));
                        }
                        mfbVar.f(k96.M0(2131749952, null), jva.a1(false, "⭐️ ".concat(k96.E(starGift.stars, ',')), 0.8f, null), null, null);
                        if (starGift.limited) {
                            jva.B0(mfbVar, i92, starGift, wjbVar);
                        }
                        j3.addView(mfbVar, nme.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        u41 u41Var = new u41(wjbVar, context2, true);
                        u41Var.i(k96.M0(2131747638, null), false, true);
                        j3.addView(u41Var, nme.o(-1, 48));
                        h.O = j3;
                        fx0[] fx0VarArr = {h};
                        fx0VarArr[0].T0 = false;
                        u41Var.setOnClickListener(new f5(fx0VarArr, (byte) 6));
                        fx0VarArr[0].K();
                        d S3 = LaunchActivity.S();
                        if (!gl.O1() && !gl.s1(S3)) {
                            fx0VarArr[0].X(S3);
                        }
                        fx0VarArr[0].show();
                    }
                }
            }
        });
        b1();
        this.T1.O(false);
        W0();
        if (oj0.a(i).c(j)) {
        }
        kk7.f(i).b(this, kk7.l5);
        kk7.f(i).b(this, kk7.G3);
        kk7.f(i).b(this, kk7.D0);
        kk7.f(i).b(this, kk7.J3);
        kk7.f(i).b(this, i2);
        this.o1.setTitle(J0());
        kk7.i(this.o1.getTitleTextView());
        gl.B2(this.o1);
        this.v1 = false;
        qw4 qw4Var2 = this.X0;
        dg0 dg0Var2 = new dg0(qw4Var2, new yu4(this));
        FrameLayout frameLayout32 = (FrameLayout) this.b;
        View view4 = new View(context);
        this.w2 = view4;
        frameLayout32.addView(view4, nme.e(-1, 0, 48));
        View view22 = this.w2;
        int i82 = this.u0;
        gl.w3(view22, i82, 0, i82, 0);
        View view32 = this.w2;
        view32.setBackground(dg0Var2.a(view32));
        this.x2 = new View(context);
        vec vecVar3 = new vec(-2, this.J0, context, true);
        this.z2 = vecVar3;
        vecVar3.r = 12;
        int i92 = bkb.y6;
        vecVar3.h(i92, bkb.F6, i92, bkb.h6, bkb.c6);
        vec vecVar22 = this.z2;
        kl0 kl0Var2 = dg0Var2.c;
        il0 c3 = kl0Var2.c(vecVar22, null, false);
        c3.p(nod.l(this.J0));
        c3.r(gl.L(20.0f));
        vecVar22.setBlurredBackground(c3);
        this.z2.setDelegate(new s34((Object) this, (byte) 5));
        st stVar3 = new st(this, context, new TextPaint(1), (byte) 16);
        this.y2 = stVar3;
        stVar3.addView(this.z2, nme.e(-2, 40, 51));
        this.y2.setVisibility(8);
        frameLayout32.addView(this.y2, nme.e(-1, 40, 48));
        st stVar22 = this.y2;
        int i102 = this.u0;
        gl.w3(stVar22, i102, 0, i102, 0);
        pha phaVar3 = new pha(context, this.J0);
        this.u2 = phaVar3;
        phaVar3.setBackButtonImage(R.drawable.ic_ab_back);
        this.u2.setTitle(J0());
        this.u2.setTitlesAlpha(0.0f);
        this.u2.setActionBarMenuOnItemClick(new vm2(this, (byte) 20));
        dg0Var2.f(frameLayout32, this.n1, this.u2, this.J0);
        pha phaVar22 = this.u2;
        int i112 = this.u0;
        gl.w3(phaVar22, i112, 0, i112, 0);
        this.u2.setBackground(null);
        f99 f99Var2 = new f99(i, this.J0, context);
        il0 c22 = kl0Var2.c(f99Var2, null, false);
        c22.p(nod.l(this.J0));
        c22.r(gl.L(23.0f));
        c22.q(gl.L(6.0f));
        f99Var2.setBackground(c22);
        ote.a(f99Var2);
        f99Var2.setOnClickListener(new yj3(f99Var2, (byte) 24));
        f99Var2.setOnWidthChanged(new zu4(this, (byte) 0));
        this.u2.addView(f99Var2, nme.e(-2, 58, 5));
        qw4Var2.i(this.b);
        this.T1.O(false);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.S1, 0, true, new ur4((Object) this, (byte) 3), this.J0);
        this.T1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return this.X1 ? k96.M0(2131749923, null) : vu3.m(k96.a0(null, null, 2131749832, this.Y1), null, false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    @Override // fy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(Canvas canvas, int i) {
        float f;
        int L;
        boolean z;
        View view;
        pha phaVar = this.u2;
        if (phaVar == null) {
            return;
        }
        int i2 = gl.m;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        float f2 = i2;
        float max = Math.max(0.0f, Z0() - f2);
        phaVar.setTranslationY(max);
        float l = Utilities.l(1.0f - (max / gl.L(24.0f)));
        float f3 = f2 + max + currentActionBarHeight;
        View view2 = this.t2 ? this.r2 : this.s2;
        float f4 = Float.NaN;
        o39 o39Var = this.n1;
        if (view2 != null && view2.isAttachedToWindow()) {
            float height = view2.getHeight();
            while (view2 != null && view2 != o39Var) {
                height += view2.getY();
                view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
            }
            if (view2 == o39Var) {
                f = o39Var.getY() + height;
                this.v2.a(Float.isNaN(f) ? f < f3 : Z0() == -3.4028235E38f, !this.J);
                L = gl.L(6.0f) + currentActionBarHeight + i2;
                z = this.B2;
                st stVar = this.y2;
                if (z) {
                    stVar.setVisibility(8);
                } else {
                    View view3 = this.x2;
                    View view4 = view3.getParent() instanceof View ? (View) view3.getParent() : null;
                    if (view4 != null && view4.getParent() == o39Var) {
                        o39Var.getClass();
                        this.C2 = RecyclerView.R(view4);
                        f4 = o39Var.getY() + view4.getY() + gl.L(6.0f);
                    }
                    float d = dg0.d(i2) + max;
                    if (Float.isNaN(f4)) {
                        View childAt = o39Var.getChildCount() > 0 ? o39Var.getChildAt(0) : null;
                        f4 = (childAt == null || this.C2 < 0 || RecyclerView.R(childAt) <= this.C2) ? this.b.getHeight() : d;
                    }
                    float max2 = Math.max(d, f4);
                    stVar.setTranslationY(max2);
                    stVar.setVisibility(0);
                    L = Math.max(L, Math.round(((gl.L(46.0f) + d) - max) - Math.max(0.0f, max2 - d)));
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
        L = gl.L(6.0f) + currentActionBarHeight + i2;
        z = this.B2;
        st stVar2 = this.y2;
        if (z) {
        }
        view = this.w2;
        view.setTranslationY(max);
        view.setAlpha(l);
        if (view.getLayoutParams().height == L) {
        }
    }

    @Override // fy0
    public final void W0() {
        super.W0();
        pha phaVar = this.u2;
        if (phaVar != null) {
            phaVar.setTitle(J0());
        }
    }

    public final void Y0(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        boolean z2;
        long j;
        xsa xsaVar;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        vec vecVar;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        xsa xsaVar2;
        xsa xsaVar3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        this.B2 = false;
        this.t2 = false;
        byte b = 3;
        if (this.X1 || this.W1 < 0 || ((disallowedGiftsSettings4 = this.V1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            z = false;
        } else {
            arrayList.add(c4c.k(this.Z1));
            this.t2 = true;
            arrayList.add(c4c.k(this.a2));
            ArrayList arrayList2 = this.g2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                c4c q = c4c.q(1, 34);
                q.v = 1;
                arrayList.add(q);
                c4c q2 = c4c.q(2, 34);
                q2.v = 1;
                arrayList.add(q2);
                c4c q3 = c4c.q(3, 34);
                q3.v = 1;
                arrayList.add(q3);
            } else {
                ArrayList arrayList3 = this.g2;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    int i2 = mv4.b;
                    c4c K = c4c.K(mv4.class);
                    K.v = 1;
                    K.H = (mu4) obj;
                    arrayList.add(K);
                }
            }
            z = true;
        }
        gta v = gta.v(this.S1, false);
        ArrayList arrayList4 = this.m2 ? v.J : v.I;
        if (this.V1 != null) {
            arrayList4 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new km1(this, b)).collect(Collectors.toCollection(new lm1((byte) 0)));
        }
        byte b2 = 5;
        if (this.W1 < 0) {
            arrayList4 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new sd(b2)).collect(Collectors.toCollection(new lm1((byte) 0)));
        }
        if (this.W1 != y6c.h(this.S1).e() && (xsaVar3 = this.h2) != null) {
            ArrayList arrayList5 = xsaVar3.l;
            int size2 = arrayList5.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList5.get(i3);
                i3++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !cq7.m(starGift2)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (na7.q1(this.S1).k4.x2.f || (arrayList4.isEmpty() && ((disallowedGiftsSettings3 = this.V1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || (xsaVar2 = this.h2) == null || xsaVar2.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.V1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList4.isEmpty()) {
                return;
            }
            arrayList.add(c4c.D(gl.L(300.0f)));
            return;
        }
        if (z) {
            arrayList.add(c4c.D(gl.L(16.0f)));
        } else {
            arrayList.add(c4c.k(this.Z1));
        }
        arrayList.add(c4c.k(this.b2));
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
            arrayList6.add(k96.M0(2131749934, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.V1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z2) {
            this.j2 = arrayList6.size();
            arrayList6.add(k96.M0(2131749930, null));
        }
        this.k2 = arrayList6.size();
        arrayList6.add(k96.M0(2131749933, null));
        if (this.n2 && !this.o2) {
            this.o2 = true;
            this.l2 = this.k2;
        }
        arrayList.add(c4c.n(this.x2, 52));
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
                    vecVar = this.z2;
                    if (i5 >= size3) {
                        break;
                    }
                    vecVar.a(i5, (CharSequence) arrayList6.get(i5));
                    i5++;
                }
                vecVar.y.f();
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
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            this.f2.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.85f).scaleY(z3 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(s33Var).start();
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
                if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !cq7.m(starGift3)) {
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
                    c4c i11 = mv4.i(i10, starGift4, i10 == this.j2, starGift4.limited && (disallowedGiftsSettings2 = this.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift4;
                    arrayList.add(i11);
                    i8++;
                }
                int i12 = this.l2;
                arrayList.add(mv4.i(i12, starGift, i12 == this.j2, starGift.limited && (disallowedGiftsSettings = this.V1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i8++;
            }
        }
        int i13 = this.l2;
        int i14 = this.j2;
        if (i13 == i14 && (xsaVar = this.h2) != null && !xsaVar.j) {
            xsaVar.a();
            c4c q4 = c4c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            c4c q5 = c4c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            c4c q6 = c4c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
        } else if (i13 != i14 && v.C) {
            c4c q7 = c4c.q(4, 34);
            q7.v = 1;
            arrayList.add(q7);
            c4c q8 = c4c.q(5, 34);
            q8.v = 1;
            arrayList.add(q8);
            c4c q9 = c4c.q(6, 34);
            q9.v = 1;
            arrayList.add(q9);
        }
        arrayList.add(c4c.D(gl.L(i8 >= 9 ? 40.0f : 300.0f)));
    }

    public final float Z0() {
        int i = 0;
        float f = Float.MAX_VALUE;
        while (true) {
            o39 o39Var = this.n1;
            if (i >= o39Var.getChildCount()) {
                return f == Float.MAX_VALUE ? o39Var.getHeight() : f;
            }
            View childAt = o39Var.getChildAt(i);
            int R = RecyclerView.R(childAt);
            if (R == 1) {
                return o39Var.getY() + childAt.getY();
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
                    mu4 mu4Var = new mu4(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(mu4Var);
                    if (w01.b()) {
                        if (mu4Var.f() > j) {
                            j = mu4Var.f();
                        }
                    } else if (mu4Var.h() != null && ci0.h().j()) {
                        i5 i5Var = new i5();
                        i5Var.b = "inapp";
                        i5Var.a = mu4Var.h();
                        arrayList2.add(i5Var.a());
                    }
                }
            }
            if (w01.b()) {
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((mu4) obj).g = j;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                ci0.h().o(arrayList2, new yu4(this));
            }
        }
        if (arrayList.isEmpty()) {
            on0.l(this.S1, null, new zu4(this, b));
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i == kk7.l5) {
            b1();
            return;
        }
        if (i == kk7.G3) {
            l5c l5cVar2 = this.T1;
            if (l5cVar2 != null) {
                l5cVar2.O(true);
                return;
            }
            return;
        }
        if (i != kk7.D0) {
            if (i != kk7.J3) {
                if (i == kk7.H3 && objArr[1] == this.h2 && (l5cVar = this.T1) != null) {
                    l5cVar.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new u21(this.c, this.J0).s(starGift.sticker, k96.M0(2131749951, null), gl.T2(k96.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            l5c l5cVar3 = this.T1;
            if (l5cVar3 != null) {
                l5cVar3.O(true);
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
            TLRPC.UserFull W1 = na7.q1(i3).W1(j);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j == y6c.h(i3).e() || W1 == null) ? null : W1.disallowed_stargifts;
            this.V1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    b00.u(k96.a0(null, null, 2131743503, cf3.s(j)), u21.b0(S), R.raw.error, 36);
                    return;
                }
                return;
            }
            l5c l5cVar4 = this.T1;
            if (l5cVar4 != null) {
                l5cVar4.O(true);
            }
        }
        ArrayList arrayList = this.g2;
        if (arrayList == null || arrayList.isEmpty()) {
            b1();
            l5c l5cVar5 = this.T1;
            if (l5cVar5 != null) {
                l5cVar5.O(true);
            }
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        int i = this.S1;
        kk7.f(i).n(this, kk7.l5);
        kk7.f(i).n(this, kk7.G3);
        kk7.f(i).n(this, kk7.D0);
        kk7.f(i).n(this, kk7.J3);
        kk7.f(i).n(this, kk7.H3);
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        int i = this.S1;
        if (na7.q1(i).t2()) {
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
            b00.u(k96.a0(null, null, 2131743503, cf3.s(this.W1)), u21.b0(S), R.raw.error, 36);
        }
    }

    public tv4(LaunchActivity launchActivity, int i, long j) {
        this(launchActivity, i, j, null, null);
    }
}
