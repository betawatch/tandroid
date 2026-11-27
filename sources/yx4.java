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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yx4 extends ny0 implements fn7 {
    public final ArrayList A2;
    public boolean B2;
    public int C2;
    public ez4 D2;
    public boolean E2;
    public final int S1;
    public l9c T1;
    public List U1;
    public TLRPC.DisallowedGiftsSettings V1;
    public final long W1;
    public final boolean X1;
    public final String Y1;
    public final b6 Z1;
    public final FrameLayout a2;
    public final LinearLayout b2;
    public final q74 c2;
    public final kx4 d2;
    public final b21 e2;
    public final b21 f2;
    public final ArrayList g2;
    public final axa h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public uya p2;
    public final p66 q2;
    public final TextView r2;
    public final TextView s2;
    public boolean t2;
    public final jla u2;
    public final fm0 v2;
    public final View w2;
    public final View x2;
    public final tt y2;
    public final uic z2;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0444  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yx4(final Context context, final int i, final long j, List list, final pcc pccVar) {
        super(context, null, false, false, null);
        k43 k43Var;
        String str;
        int i2;
        int i3;
        this.g2 = new ArrayList();
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = -1;
        cx4 cx4Var = new cx4(this);
        k43 k43Var2 = k43.h;
        this.v2 = new fm0(0, cx4Var, k43Var2, 320L, false);
        this.A2 = new ArrayList();
        this.C2 = -1;
        this.S1 = i;
        this.W1 = j;
        boolean z = yac.h(i).e() == j;
        this.X1 = z;
        this.U1 = list;
        int i4 = aob.b6;
        t0(i4);
        L(i4);
        this.h2 = jxa.v(i, false).D(yac.h(i).e(), true);
        jxa.v(i, false).U();
        de0 de0Var = new de0(context);
        de0Var.setImportantForAccessibility(2);
        rb0 rb0Var = new rb0((vnb) null);
        if (j > 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            String l = lbc.l(X1);
            this.Y1 = l;
            rb0Var.q(X1);
            de0Var.f(X1, rb0Var);
            TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
            this.V1 = (j == yac.h(i).e() || Y1 == null) ? null : Y1.disallowed_stargifts;
            if (Y1 == null) {
                uc7.s1(i).f3(X1, 0, true, null);
            }
            k43Var = k43Var2;
            str = l;
        } else {
            k43Var = k43Var2;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            str = M0 == null ? "" : M0.title;
            this.Y1 = str;
            rb0Var.p(M0);
            de0Var.f(M0, rb0Var);
        }
        this.u1 = 0.1f;
        FrameLayout frameLayout = new FrameLayout(context);
        this.a2 = frameLayout;
        b6 b6Var = new b6(context, (byte) 16);
        this.Z1 = b6Var;
        b6Var.setClipChildren(false);
        b6Var.setClipToPadding(false);
        uya uyaVar = new uya(context, 70, 0);
        this.p2 = uyaVar;
        b6Var.addView(uyaVar, tre.c(-1.0f, -1));
        de0Var.setRoundRadius(hl.L(42.0f));
        b6Var.addView(de0Var, tre.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        iye.a(de0Var);
        de0Var.setOnClickListener(new my(this, j, (byte) 2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, tre.e(-1, -2, 55));
        TextView textView = new TextView(context);
        this.r2 = textView;
        bs2.t(textView, 1, 20.0f);
        int i5 = aob.j5;
        yob.X(textView, i5, this.J0);
        textView.setGravity(17);
        linearLayout.addView(textView, tre.t(-1, -2, 1, 4, 0, 4, 0));
        textView.setMaxWidth(kg5.a(textView.getText(), textView.getPaint()));
        p66 p66Var = new p66(context, this.J0);
        int i6 = aob.Xc;
        yob.G(p66Var, i6, this.J0);
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, i5, this.J0);
        p66Var.setGravity(17);
        p66Var.setLineSpacing(hl.L(2.33f), 1.0f);
        linearLayout.addView(p66Var, tre.t(-1, -2, 1, 4, 4, 4, 12));
        textView.setText(ob6.M0(2131750033, null));
        p66Var.setText(TextUtils.concat(hl.S2(ob6.a0(null, null, 2131750032, str)), " ", hl.D2(hl.i2(ob6.M0(2131750031, null), new jm3((byte) 9)), true)));
        p66Var.setMaxWidth(kg5.a(p66Var.getText(), p66Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.b2 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView2 = new TextView(context);
        this.s2 = textView2;
        bs2.t(textView2, 1, 20.0f);
        yob.X(textView2, i5, this.J0);
        textView2.setGravity(17);
        linearLayout2.addView(textView2, tre.t(-1, -2, 1, 4, 0, 4, 0));
        b21 b21Var = new b21(context, this.J0, (byte) 4);
        this.e2 = b21Var;
        yob.G(b21Var, i6, this.J0);
        b21Var.setTextSize(1, 14.0f);
        yob.X(b21Var, i5, this.J0);
        b21Var.setGravity(17);
        k43 k43Var3 = k43Var;
        b21 b21Var2 = new b21(context, this.J0, (byte) 5);
        this.f2 = b21Var2;
        yob.G(b21Var2, i6, this.J0);
        b21Var2.setTextSize(1, 14.0f);
        yob.X(b21Var2, i5, this.J0);
        b21Var2.setGravity(17);
        b21Var2.setAlpha(0.0f);
        b21Var2.setScaleX(0.85f);
        b21Var2.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(b21Var, tre.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(b21Var2, tre.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView2.setText(ob6.M0(j < 0 ? 2131749911 : z ? 2131749902 : 2131749912, null));
        byte b = 8;
        int i7 = jn7.I3;
        if (z) {
            linearLayout2.addView(frameLayout2, tre.t(-2, -2, 1, 0, 9, 0, 4));
            p66 p66Var2 = new p66(context, this.J0);
            yob.G(p66Var2, i6, this.J0);
            p66Var2.setTextSize(1, 14.0f);
            yob.X(p66Var2, i5, this.J0);
            p66Var2.setGravity(17);
            linearLayout2.addView(p66Var2, tre.t(-2, -2, 1, 26, 4, 26, 6));
            b21Var.setText(ob6.M0(2131749901, null));
            p66Var2.setText(ob6.M0(2131749900, null));
            this.q2 = p66Var2;
        } else {
            if (j >= 0) {
                linearLayout2.addView(frameLayout2, tre.t(-1, -2, 1, 0, 9, 0, 6));
                axa D = jxa.v(i, false).D(j, true);
                i2 = 9;
                da7 da7Var = new da7((Object) this, (Object) D, j, (Object) pccVar, (Object) context, (byte) 7);
                da7Var.run();
                b21Var.addOnAttachStateChangeListener(new xc(da7Var, b));
                i3 = 3;
                if (D.l.size() < 3) {
                    D.a();
                }
                jn7.f(i).h(b21Var, i7, new rx1((Object) D, (Object) da7Var, (byte) 24));
                q74 q74Var = new q74(i3, false);
                this.c2 = q74Var;
                q74Var.O = new ar1(this, (byte) 7);
                this.n1.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
                this.n1.setClipToPadding(false);
                this.n1.setClipChildren(false);
                this.n1.setLayoutManager(q74Var);
                this.n1.setSelectorType(i2);
                this.n1.setSelectorDrawableColor(0);
                kx4 kx4Var = new kx4();
                this.d2 = kx4Var;
                kx4Var.C = false;
                kx4Var.m = false;
                kx4Var.n(350L);
                kx4Var.o(k43Var3);
                kx4Var.D = (byte) 40;
                this.n1.setItemAnimator(kx4Var);
                this.n1.setOnItemClickListener(new r69() { // from class: ix4
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // r69
                    public final void e(int i8, View view) {
                        TL_stars.SavedStarGift savedStarGift;
                        yx4 yx4Var = yx4.this;
                        ex0 ex0Var = yx4Var.c;
                        byte b2 = 1;
                        b8c G = yx4Var.T1.G(i8 - 1);
                        if (G == null || !G.H(rx4.class)) {
                            return;
                        }
                        Object obj = G.H;
                        boolean z2 = obj instanceof pw4;
                        Context context2 = context;
                        int i9 = i;
                        pcc pccVar2 = pccVar;
                        int i10 = 0;
                        Object[] objArr = 0;
                        if (z2) {
                            new lx4(yx4Var, context2, i9, (pw4) obj, yx4Var.W1, new ex4(yx4Var, pccVar2, objArr == true ? 1 : 0)).show();
                            return;
                        }
                        if (obj instanceof TL_stars.StarGift) {
                            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                            axa axaVar = yx4Var.h2;
                            long j2 = j;
                            if (axaVar != null && yx4Var.l2 == yx4Var.j2) {
                                ArrayList arrayList = axaVar.l;
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
                                if (savedStarGift == null || it7.n(savedStarGift.gift)) {
                                    return;
                                }
                                mx4 mx4Var = new mx4(yx4Var, yx4Var.getContext(), i9, yac.h(i9).e(), yx4Var.J0);
                                mx4Var.o2(savedStarGift, null);
                                mx4Var.d2(j2, new r4c((Object) yx4Var, (Object) mx4Var, j2, (Object) pccVar2, (byte) 5));
                                return;
                            }
                            if (G.r && starGift.availability_resale > 0) {
                                e S = LaunchActivity.S();
                                if (S != null) {
                                    bg0 bg0Var = new bg0();
                                    bg0Var.a = true;
                                    bg0Var.e = true;
                                    nx4 nx4Var = new nx4(j2, starGift.title, starGift.id, yx4Var.J0, ex0Var.getViewTreeObserver(), new fx4());
                                    nx4Var.f = new rx1((Object) yx4Var, (Object) pccVar2, (byte) 23);
                                    S.showAsSheet(nx4Var, bg0Var);
                                    return;
                                }
                                return;
                            }
                            if (starGift.auction) {
                                fz.a1(context2, yx4Var.J0, i9, j2, starGift.id, new ex4(yx4Var, pccVar2, b2));
                                return;
                            }
                            if (!starGift.sold_out) {
                                if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                                    new d31(ex0Var, yx4Var.J0).R(starGift.getDocument(), hl.S2(ob6.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                                    return;
                                }
                                l77 l77Var = new l77((Object) yx4Var, (Object) context2, i9, (Object) starGift, (Object) pccVar2, (byte) 15);
                                if (starGift.locked_until_date > ConnectionsManager.getInstance(i9).getCurrentTime()) {
                                    id idVar = new id(3, null, yx4Var.getContext());
                                    idVar.q(500L);
                                    TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                                    checkcansendgift.gift_id = starGift.id;
                                    ConnectionsManager.getInstance(i9).sendRequest(checkcansendgift, new au0((Object) yx4Var, (Object) idVar, (Object) l77Var, (Object) pccVar2, (byte) 6));
                                    return;
                                }
                                if (!starGift.require_premium || yac.h(i9).p()) {
                                    l77Var.run();
                                    return;
                                }
                                e S2 = LaunchActivity.S();
                                if (S2 != null) {
                                    kl8 kl8Var = new kl8(S2, i9, null, null, starGift, yx4Var.J0);
                                    de0 de0Var2 = new de0(yx4Var.getContext());
                                    ul ulVar = new ul(hl.L(160.0f), 4, de0Var2, false);
                                    de0Var2.setImageDrawable(ulVar);
                                    de0Var2.addOnAttachStateChangeListener(new fp1(ulVar, (byte) 1));
                                    ulVar.i(starGift.getDocument(), false);
                                    kl8Var.w2 = de0Var2;
                                    kl8Var.show();
                                    ulVar.f();
                                    return;
                                }
                                return;
                            }
                            vnb vnbVar = yx4Var.J0;
                            if (context2 != null) {
                                nx0 h = uh9.h(1, vnbVar, context2, false);
                                LinearLayout j3 = uh9.j(context2, 1);
                                j3.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
                                j3.setClipChildren(false);
                                j3.setClipToPadding(false);
                                de0 de0Var3 = new de0(context2);
                                nza.f1(de0Var3.getImageReceiver(), starGift, jn7.p2);
                                j3.addView(de0Var3, tre.t(jn7.p2, jn7.p2, 17, 0, -8, 0, 10));
                                TextView textView3 = new TextView(context2);
                                qd4.w(textView3, aob.j5, vnbVar, 1, 20.0f);
                                uh9.q(textView3, 17, null, 2131749915);
                                TextView m = ik8.m(j3, textView3, tre.t(-1, -2, 17, 20, 0, 20, 4), context2);
                                m.setTextSize(1, 14.0f);
                                m.setTypeface(hl.o());
                                m.setGravity(17);
                                ik8.x(m, aob.q7, vnbVar, null, 2131749916);
                                j3.addView(m, tre.t(-1, -2, 17, 20, 0, 20, 4));
                                hjb hjbVar = new hjb(context2, vnbVar);
                                if (starGift.first_sale_date != 0) {
                                    hjbVar.g(starGift.first_sale_date, ob6.M0(2131749918, null));
                                }
                                if (starGift.last_sale_date != 0) {
                                    hjbVar.g(starGift.last_sale_date, ob6.M0(2131749917, null));
                                }
                                hjbVar.f(ob6.M0(2131749914, null), nza.b1(false, "⭐️ ".concat(ob6.E(starGift.stars, ',')), 0.8f, null), null, null);
                                if (starGift.limited) {
                                    nza.C0(hjbVar, i9, starGift, vnbVar);
                                }
                                j3.addView(hjbVar, tre.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                                c51 c51Var = new c51(vnbVar, context2, true);
                                c51Var.i(ob6.M0(2131747558, null), false, true);
                                j3.addView(c51Var, tre.o(-1, 48));
                                h.O = j3;
                                nx0[] nx0VarArr = {h};
                                nx0VarArr[0].T0 = false;
                                c51Var.setOnClickListener(new g5(nx0VarArr, (byte) 6));
                                nx0VarArr[0].J();
                                e S3 = LaunchActivity.S();
                                if (!hl.O1() && !hl.s1(S3)) {
                                    nx0VarArr[0].X(S3);
                                }
                                nx0VarArr[0].show();
                            }
                        }
                    }
                });
                c1();
                this.T1.O(false);
                X0();
                if (pj0.a(i).c(j)) {
                    b1(true);
                }
                jn7.f(i).b(this, jn7.m5);
                jn7.f(i).b(this, jn7.H3);
                jn7.f(i).b(this, jn7.E0);
                jn7.f(i).b(this, jn7.K3);
                jn7.f(i).b(this, i7);
                this.o1.setTitle(K0());
                jn7.i(this.o1.getTitleTextView());
                hl.B2(this.o1);
                this.v1 = false;
                vy4 vy4Var = this.X0;
                eg0 eg0Var = new eg0(vy4Var, new cx4(this));
                FrameLayout frameLayout3 = (FrameLayout) this.b;
                View view = new View(context);
                this.w2 = view;
                frameLayout3.addView(view, tre.e(-1, 0, 48));
                View view2 = this.w2;
                int i8 = this.u0;
                hl.v3(view2, i8, 0, i8, 0);
                View view3 = this.w2;
                view3.setBackground(eg0Var.a(view3));
                this.x2 = new View(context);
                uic uicVar = new uic(-2, this.J0, context, true);
                this.z2 = uicVar;
                uicVar.r = 12;
                int i9 = aob.z6;
                uicVar.h(i9, aob.G6, i9, aob.i6, aob.d6);
                uic uicVar2 = this.z2;
                ll0 ll0Var = eg0Var.c;
                jl0 c = ll0Var.c(uicVar2, null, false);
                c.p(dtd.l(this.J0));
                c.r(hl.L(20.0f));
                uicVar2.setBlurredBackground(c);
                this.z2.setDelegate(new aj3(this, b));
                tt ttVar = new tt(this, context, new TextPaint(1), (byte) 17);
                this.y2 = ttVar;
                ttVar.addView(this.z2, tre.e(-2, 40, 51));
                this.y2.setVisibility(8);
                frameLayout3.addView(this.y2, tre.e(-1, 40, 48));
                tt ttVar2 = this.y2;
                int i10 = this.u0;
                hl.v3(ttVar2, i10, 0, i10, 0);
                jla jlaVar = new jla(context, this.J0);
                this.u2 = jlaVar;
                jlaVar.setBackButtonImage(R.drawable.ic_ab_back);
                this.u2.setTitle(K0());
                this.u2.setTitlesAlpha(0.0f);
                this.u2.setActionBarMenuOnItemClick(new kg2(this, (byte) 21));
                eg0Var.h(frameLayout3, this.n1, this.u2, this.J0);
                jla jlaVar2 = this.u2;
                int i11 = this.u0;
                hl.v3(jlaVar2, i11, 0, i11, 0);
                this.u2.setBackground(null);
                qc9 qc9Var = new qc9(i, this.J0, context);
                jl0 c2 = ll0Var.c(qc9Var, null, false);
                c2.p(dtd.l(this.J0));
                c2.r(hl.L(23.0f));
                c2.q(hl.L(6.0f));
                qc9Var.setBackground(c2);
                iye.a(qc9Var);
                qc9Var.setOnClickListener(new lw4(this, frameLayout3, qc9Var, (byte) 1));
                qc9Var.setOnWidthChanged(new dx4(this, (byte) 0));
                this.u2.addView(qc9Var, tre.e(-2, 58, 5));
                vy4Var.i(this.b);
                this.T1.O(false);
            }
            linearLayout2.addView(frameLayout2, tre.t(-2, -2, 1, 0, 9, 0, 4));
            jn7.i(b21Var);
            b21Var.setText(pv3.m(hl.S2(ob6.a0(null, null, 2131749910, str)), b21Var.getPaint().getFontMetricsInt(), false, null, 0));
        }
        i3 = 3;
        i2 = 9;
        q74 q74Var2 = new q74(i3, false);
        this.c2 = q74Var2;
        q74Var2.O = new ar1(this, (byte) 7);
        this.n1.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        this.n1.setClipToPadding(false);
        this.n1.setClipChildren(false);
        this.n1.setLayoutManager(q74Var2);
        this.n1.setSelectorType(i2);
        this.n1.setSelectorDrawableColor(0);
        kx4 kx4Var2 = new kx4();
        this.d2 = kx4Var2;
        kx4Var2.C = false;
        kx4Var2.m = false;
        kx4Var2.n(350L);
        kx4Var2.o(k43Var3);
        kx4Var2.D = (byte) 40;
        this.n1.setItemAnimator(kx4Var2);
        this.n1.setOnItemClickListener(new r69() { // from class: ix4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // r69
            public final void e(int i82, View view4) {
                TL_stars.SavedStarGift savedStarGift;
                yx4 yx4Var = yx4.this;
                ex0 ex0Var = yx4Var.c;
                byte b2 = 1;
                b8c G = yx4Var.T1.G(i82 - 1);
                if (G == null || !G.H(rx4.class)) {
                    return;
                }
                Object obj = G.H;
                boolean z2 = obj instanceof pw4;
                Context context2 = context;
                int i92 = i;
                pcc pccVar2 = pccVar;
                int i102 = 0;
                Object[] objArr = 0;
                if (z2) {
                    new lx4(yx4Var, context2, i92, (pw4) obj, yx4Var.W1, new ex4(yx4Var, pccVar2, objArr == true ? 1 : 0)).show();
                    return;
                }
                if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    axa axaVar = yx4Var.h2;
                    long j2 = j;
                    if (axaVar != null && yx4Var.l2 == yx4Var.j2) {
                        ArrayList arrayList = axaVar.l;
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
                        if (savedStarGift == null || it7.n(savedStarGift.gift)) {
                            return;
                        }
                        mx4 mx4Var = new mx4(yx4Var, yx4Var.getContext(), i92, yac.h(i92).e(), yx4Var.J0);
                        mx4Var.o2(savedStarGift, null);
                        mx4Var.d2(j2, new r4c((Object) yx4Var, (Object) mx4Var, j2, (Object) pccVar2, (byte) 5));
                        return;
                    }
                    if (G.r && starGift.availability_resale > 0) {
                        e S = LaunchActivity.S();
                        if (S != null) {
                            bg0 bg0Var = new bg0();
                            bg0Var.a = true;
                            bg0Var.e = true;
                            nx4 nx4Var = new nx4(j2, starGift.title, starGift.id, yx4Var.J0, ex0Var.getViewTreeObserver(), new fx4());
                            nx4Var.f = new rx1((Object) yx4Var, (Object) pccVar2, (byte) 23);
                            S.showAsSheet(nx4Var, bg0Var);
                            return;
                        }
                        return;
                    }
                    if (starGift.auction) {
                        fz.a1(context2, yx4Var.J0, i92, j2, starGift.id, new ex4(yx4Var, pccVar2, b2));
                        return;
                    }
                    if (!starGift.sold_out) {
                        if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                            new d31(ex0Var, yx4Var.J0).R(starGift.getDocument(), hl.S2(ob6.H(',', "Gift2PerUserLimit", starGift.per_user_total))).j();
                            return;
                        }
                        l77 l77Var = new l77((Object) yx4Var, (Object) context2, i92, (Object) starGift, (Object) pccVar2, (byte) 15);
                        if (starGift.locked_until_date > ConnectionsManager.getInstance(i92).getCurrentTime()) {
                            id idVar = new id(3, null, yx4Var.getContext());
                            idVar.q(500L);
                            TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                            checkcansendgift.gift_id = starGift.id;
                            ConnectionsManager.getInstance(i92).sendRequest(checkcansendgift, new au0((Object) yx4Var, (Object) idVar, (Object) l77Var, (Object) pccVar2, (byte) 6));
                            return;
                        }
                        if (!starGift.require_premium || yac.h(i92).p()) {
                            l77Var.run();
                            return;
                        }
                        e S2 = LaunchActivity.S();
                        if (S2 != null) {
                            kl8 kl8Var = new kl8(S2, i92, null, null, starGift, yx4Var.J0);
                            de0 de0Var2 = new de0(yx4Var.getContext());
                            ul ulVar = new ul(hl.L(160.0f), 4, de0Var2, false);
                            de0Var2.setImageDrawable(ulVar);
                            de0Var2.addOnAttachStateChangeListener(new fp1(ulVar, (byte) 1));
                            ulVar.i(starGift.getDocument(), false);
                            kl8Var.w2 = de0Var2;
                            kl8Var.show();
                            ulVar.f();
                            return;
                        }
                        return;
                    }
                    vnb vnbVar = yx4Var.J0;
                    if (context2 != null) {
                        nx0 h = uh9.h(1, vnbVar, context2, false);
                        LinearLayout j3 = uh9.j(context2, 1);
                        j3.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
                        j3.setClipChildren(false);
                        j3.setClipToPadding(false);
                        de0 de0Var3 = new de0(context2);
                        nza.f1(de0Var3.getImageReceiver(), starGift, jn7.p2);
                        j3.addView(de0Var3, tre.t(jn7.p2, jn7.p2, 17, 0, -8, 0, 10));
                        TextView textView3 = new TextView(context2);
                        qd4.w(textView3, aob.j5, vnbVar, 1, 20.0f);
                        uh9.q(textView3, 17, null, 2131749915);
                        TextView m = ik8.m(j3, textView3, tre.t(-1, -2, 17, 20, 0, 20, 4), context2);
                        m.setTextSize(1, 14.0f);
                        m.setTypeface(hl.o());
                        m.setGravity(17);
                        ik8.x(m, aob.q7, vnbVar, null, 2131749916);
                        j3.addView(m, tre.t(-1, -2, 17, 20, 0, 20, 4));
                        hjb hjbVar = new hjb(context2, vnbVar);
                        if (starGift.first_sale_date != 0) {
                            hjbVar.g(starGift.first_sale_date, ob6.M0(2131749918, null));
                        }
                        if (starGift.last_sale_date != 0) {
                            hjbVar.g(starGift.last_sale_date, ob6.M0(2131749917, null));
                        }
                        hjbVar.f(ob6.M0(2131749914, null), nza.b1(false, "⭐️ ".concat(ob6.E(starGift.stars, ',')), 0.8f, null), null, null);
                        if (starGift.limited) {
                            nza.C0(hjbVar, i92, starGift, vnbVar);
                        }
                        j3.addView(hjbVar, tre.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        c51 c51Var = new c51(vnbVar, context2, true);
                        c51Var.i(ob6.M0(2131747558, null), false, true);
                        j3.addView(c51Var, tre.o(-1, 48));
                        h.O = j3;
                        nx0[] nx0VarArr = {h};
                        nx0VarArr[0].T0 = false;
                        c51Var.setOnClickListener(new g5(nx0VarArr, (byte) 6));
                        nx0VarArr[0].J();
                        e S3 = LaunchActivity.S();
                        if (!hl.O1() && !hl.s1(S3)) {
                            nx0VarArr[0].X(S3);
                        }
                        nx0VarArr[0].show();
                    }
                }
            }
        });
        c1();
        this.T1.O(false);
        X0();
        if (pj0.a(i).c(j)) {
        }
        jn7.f(i).b(this, jn7.m5);
        jn7.f(i).b(this, jn7.H3);
        jn7.f(i).b(this, jn7.E0);
        jn7.f(i).b(this, jn7.K3);
        jn7.f(i).b(this, i7);
        this.o1.setTitle(K0());
        jn7.i(this.o1.getTitleTextView());
        hl.B2(this.o1);
        this.v1 = false;
        vy4 vy4Var2 = this.X0;
        eg0 eg0Var2 = new eg0(vy4Var2, new cx4(this));
        FrameLayout frameLayout32 = (FrameLayout) this.b;
        View view4 = new View(context);
        this.w2 = view4;
        frameLayout32.addView(view4, tre.e(-1, 0, 48));
        View view22 = this.w2;
        int i82 = this.u0;
        hl.v3(view22, i82, 0, i82, 0);
        View view32 = this.w2;
        view32.setBackground(eg0Var2.a(view32));
        this.x2 = new View(context);
        uic uicVar3 = new uic(-2, this.J0, context, true);
        this.z2 = uicVar3;
        uicVar3.r = 12;
        int i92 = aob.z6;
        uicVar3.h(i92, aob.G6, i92, aob.i6, aob.d6);
        uic uicVar22 = this.z2;
        ll0 ll0Var2 = eg0Var2.c;
        jl0 c3 = ll0Var2.c(uicVar22, null, false);
        c3.p(dtd.l(this.J0));
        c3.r(hl.L(20.0f));
        uicVar22.setBlurredBackground(c3);
        this.z2.setDelegate(new aj3(this, b));
        tt ttVar3 = new tt(this, context, new TextPaint(1), (byte) 17);
        this.y2 = ttVar3;
        ttVar3.addView(this.z2, tre.e(-2, 40, 51));
        this.y2.setVisibility(8);
        frameLayout32.addView(this.y2, tre.e(-1, 40, 48));
        tt ttVar22 = this.y2;
        int i102 = this.u0;
        hl.v3(ttVar22, i102, 0, i102, 0);
        jla jlaVar3 = new jla(context, this.J0);
        this.u2 = jlaVar3;
        jlaVar3.setBackButtonImage(R.drawable.ic_ab_back);
        this.u2.setTitle(K0());
        this.u2.setTitlesAlpha(0.0f);
        this.u2.setActionBarMenuOnItemClick(new kg2(this, (byte) 21));
        eg0Var2.h(frameLayout32, this.n1, this.u2, this.J0);
        jla jlaVar22 = this.u2;
        int i112 = this.u0;
        hl.v3(jlaVar22, i112, 0, i112, 0);
        this.u2.setBackground(null);
        qc9 qc9Var2 = new qc9(i, this.J0, context);
        jl0 c22 = ll0Var2.c(qc9Var2, null, false);
        c22.p(dtd.l(this.J0));
        c22.r(hl.L(23.0f));
        c22.q(hl.L(6.0f));
        qc9Var2.setBackground(c22);
        iye.a(qc9Var2);
        qc9Var2.setOnClickListener(new lw4(this, frameLayout32, qc9Var2, (byte) 1));
        qc9Var2.setOnWidthChanged(new dx4(this, (byte) 0));
        this.u2.addView(qc9Var2, tre.e(-2, 58, 5));
        vy4Var2.i(this.b);
        this.T1.O(false);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.S1, 0, true, new yt4((Object) this, (byte) 3), this.J0);
        this.T1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return this.X1 ? ob6.M0(2131749885, null) : pv3.m(ob6.a0(null, null, 2131749794, this.Y1), null, false, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    @Override // ny0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N0(Canvas canvas, int i) {
        float f;
        int L;
        boolean z;
        View view;
        jla jlaVar = this.u2;
        if (jlaVar == null) {
            return;
        }
        int i2 = hl.m;
        int currentActionBarHeight = a.getCurrentActionBarHeight();
        float f2 = i2;
        float max = Math.max(0.0f, a1() - f2);
        jlaVar.setTranslationY(max);
        float l = Utilities.l(1.0f - (max / hl.L(24.0f)));
        float f3 = f2 + max + currentActionBarHeight;
        View view2 = this.t2 ? this.r2 : this.s2;
        float f4 = Float.NaN;
        d79 d79Var = this.n1;
        if (view2 != null && view2.isAttachedToWindow()) {
            float height = view2.getHeight();
            while (view2 != null && view2 != d79Var) {
                height += view2.getY();
                view2 = view2.getParent() instanceof View ? (View) view2.getParent() : null;
            }
            if (view2 == d79Var) {
                f = d79Var.getY() + height;
                this.v2.a(Float.isNaN(f) ? f < f3 : a1() == -3.4028235E38f, !this.J);
                L = hl.L(6.0f) + currentActionBarHeight + i2;
                z = this.B2;
                tt ttVar = this.y2;
                if (z) {
                    ttVar.setVisibility(8);
                } else {
                    View view3 = this.x2;
                    View view4 = view3.getParent() instanceof View ? (View) view3.getParent() : null;
                    if (view4 != null && view4.getParent() == d79Var) {
                        d79Var.getClass();
                        this.C2 = RecyclerView.S(view4);
                        f4 = d79Var.getY() + view4.getY() + hl.L(6.0f);
                    }
                    float f5 = eg0.f(i2) + max;
                    if (Float.isNaN(f4)) {
                        View childAt = d79Var.getChildCount() > 0 ? d79Var.getChildAt(0) : null;
                        f4 = (childAt == null || this.C2 < 0 || RecyclerView.S(childAt) <= this.C2) ? this.b.getHeight() : f5;
                    }
                    float max2 = Math.max(f5, f4);
                    ttVar.setTranslationY(max2);
                    ttVar.setVisibility(0);
                    L = Math.max(L, Math.round(((hl.L(46.0f) + f5) - max) - Math.max(0.0f, max2 - f5)));
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
        this.v2.a(Float.isNaN(f) ? f < f3 : a1() == -3.4028235E38f, !this.J);
        L = hl.L(6.0f) + currentActionBarHeight + i2;
        z = this.B2;
        tt ttVar2 = this.y2;
        if (z) {
        }
        view = this.w2;
        view.setTranslationY(max);
        view.setAlpha(l);
        if (view.getLayoutParams().height == L) {
        }
    }

    @Override // ny0
    public final void X0() {
        super.X0();
        jla jlaVar = this.u2;
        if (jlaVar != null) {
            jlaVar.setTitle(K0());
        }
    }

    public final void Z0(ArrayList arrayList, l9c l9cVar) {
        boolean z;
        boolean z2;
        long j;
        axa axaVar;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        uic uicVar;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        axa axaVar2;
        axa axaVar3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        this.B2 = false;
        this.t2 = false;
        byte b = 3;
        if (this.X1 || this.W1 < 0 || ((disallowedGiftsSettings4 = this.V1) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            z = false;
        } else {
            arrayList.add(b8c.k(this.Z1));
            this.t2 = true;
            arrayList.add(b8c.k(this.a2));
            ArrayList arrayList2 = this.g2;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                b8c q = b8c.q(1, 34);
                q.v = 1;
                arrayList.add(q);
                b8c q2 = b8c.q(2, 34);
                q2.v = 1;
                arrayList.add(q2);
                b8c q3 = b8c.q(3, 34);
                q3.v = 1;
                arrayList.add(q3);
            } else {
                ArrayList arrayList3 = this.g2;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    int i2 = rx4.b;
                    b8c K = b8c.K(rx4.class);
                    K.v = 1;
                    K.H = (pw4) obj;
                    arrayList.add(K);
                }
            }
            z = true;
        }
        jxa v = jxa.v(this.S1, false);
        ArrayList arrayList4 = this.m2 ? v.J : v.I;
        if (this.V1 != null) {
            arrayList4 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new yl1(this, b)).collect(Collectors.toCollection(new zl1((byte) 0)));
        }
        byte b2 = 5;
        if (this.W1 < 0) {
            arrayList4 = (ArrayList) Collection.-EL.stream(arrayList4).filter(new eh(b2)).collect(Collectors.toCollection(new zl1((byte) 0)));
        }
        if (this.W1 != yac.h(this.S1).e() && (axaVar3 = this.h2) != null) {
            ArrayList arrayList5 = axaVar3.l;
            int size2 = arrayList5.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList5.get(i3);
                i3++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj2).gift;
                if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && !it7.n(starGift2)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (uc7.s1(this.S1).k4.F2.f || (arrayList4.isEmpty() && ((disallowedGiftsSettings3 = this.V1) == null || disallowedGiftsSettings3.disallow_unique_stargifts || (axaVar2 = this.h2) == null || axaVar2.l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.V1;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList4.isEmpty()) {
                return;
            }
            arrayList.add(b8c.D(hl.L(300.0f)));
            return;
        }
        if (z) {
            arrayList.add(b8c.D(hl.L(16.0f)));
        } else {
            arrayList.add(b8c.k(this.Z1));
        }
        arrayList.add(b8c.k(this.b2));
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
            arrayList6.add(ob6.M0(2131749896, null));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.V1;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z2) {
            this.j2 = arrayList6.size();
            arrayList6.add(ob6.M0(2131749892, null));
        }
        this.k2 = arrayList6.size();
        arrayList6.add(ob6.M0(2131749895, null));
        if (this.n2 && !this.o2) {
            this.o2 = true;
            this.l2 = this.k2;
        }
        arrayList.add(b8c.n(this.x2, 52));
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
                    uicVar = this.z2;
                    if (i5 >= size3) {
                        break;
                    }
                    uicVar.a(i5, (CharSequence) arrayList6.get(i5));
                    i5++;
                }
                uicVar.y.f();
                this.y2.requestLayout();
            }
            int currentTabId = this.z2.getCurrentTabId();
            int i6 = this.l2;
            if (currentTabId != i6) {
                this.z2.g(1.0f, i6);
            }
        }
        boolean z3 = this.l2 == this.k2 && !this.X1 && this.W1 >= 0;
        if (z3 == this.E2) {
            j = 0;
        } else {
            this.E2 = z3;
            j = 0;
            ViewPropertyAnimator duration = this.e2.animate().alpha(!z3 ? 1.0f : 0.0f).scaleX(!z3 ? 1.0f : 0.85f).scaleY(!z3 ? 1.0f : 0.85f).setDuration(380L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            this.f2.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.85f).scaleY(z3 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(k43Var).start();
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
                if ((starGift3 instanceof TL_stars.TL_starGiftUnique) && !it7.n(starGift3)) {
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
                    b8c i11 = rx4.i(i10, starGift4, i10 == this.j2, starGift4.limited && (disallowedGiftsSettings2 = this.V1) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift4;
                    arrayList.add(i11);
                    i8++;
                }
                int i12 = this.l2;
                arrayList.add(rx4.i(i12, starGift, i12 == this.j2, starGift.limited && (disallowedGiftsSettings = this.V1) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i8++;
            }
        }
        int i13 = this.l2;
        int i14 = this.j2;
        if (i13 == i14 && (axaVar = this.h2) != null && !axaVar.j) {
            axaVar.a();
            b8c q4 = b8c.q(4, 34);
            q4.v = 1;
            arrayList.add(q4);
            b8c q5 = b8c.q(5, 34);
            q5.v = 1;
            arrayList.add(q5);
            b8c q6 = b8c.q(6, 34);
            q6.v = 1;
            arrayList.add(q6);
        } else if (i13 != i14 && v.C) {
            b8c q7 = b8c.q(4, 34);
            q7.v = 1;
            arrayList.add(q7);
            b8c q8 = b8c.q(5, 34);
            q8.v = 1;
            arrayList.add(q8);
            b8c q9 = b8c.q(6, 34);
            q9.v = 1;
            arrayList.add(q9);
        }
        arrayList.add(b8c.D(hl.L(i8 >= 9 ? 40.0f : 300.0f)));
    }

    public final float a1() {
        int i = 0;
        float f = Float.MAX_VALUE;
        while (true) {
            d79 d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                return f == Float.MAX_VALUE ? d79Var.getHeight() : f;
            }
            View childAt = d79Var.getChildAt(i);
            int S = RecyclerView.S(childAt);
            if (S == 1) {
                return d79Var.getY() + childAt.getY();
            }
            if (S > 1) {
                f = -3.4028235E38f;
            }
            i++;
        }
    }

    public final void b1(boolean z) {
        this.m2 = z;
        this.T1.O(false);
    }

    public final void c1() {
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
                    pw4 pw4Var = new pw4(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(pw4Var);
                    if (f11.b()) {
                        if (pw4Var.f() > j) {
                            j = pw4Var.f();
                        }
                    } else if (pw4Var.h() != null && di0.h().j()) {
                        we3 we3Var = new we3();
                        we3Var.b = "inapp";
                        we3Var.a = pw4Var.h();
                        arrayList2.add(we3Var.a());
                    }
                }
            }
            if (f11.b()) {
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((pw4) obj).g = j;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                di0.h().o(arrayList2, new cx4(this));
            }
        }
        if (arrayList.isEmpty()) {
            on0.l(this.S1, null, new dx4(this, b));
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i == jn7.m5) {
            c1();
            return;
        }
        if (i == jn7.H3) {
            l9c l9cVar2 = this.T1;
            if (l9cVar2 != null) {
                l9cVar2.O(true);
                return;
            }
            return;
        }
        if (i != jn7.E0) {
            if (i != jn7.K3) {
                if (i == jn7.I3 && objArr[1] == this.h2 && (l9cVar = this.T1) != null) {
                    l9cVar.O(true);
                    return;
                }
                return;
            }
            if (this.J) {
                return;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
            new d31(this.c, this.J0).s(starGift.sticker, ob6.M0(2131749913, null), hl.S2(ob6.H(',', "Gift2SoldOutCount", starGift.availability_total))).j();
            l9c l9cVar3 = this.T1;
            if (l9cVar3 != null) {
                l9cVar3.O(true);
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
            TLRPC.UserFull Y1 = uc7.s1(i3).Y1(j);
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j == yac.h(i3).e() || Y1 == null) ? null : Y1.disallowed_stargifts;
            this.V1 = disallowedGiftsSettings;
            if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    c00.v(ob6.a0(null, null, 2131743397, wf3.s(j)), d31.b0(S), R.raw.error, 36);
                    return;
                }
                return;
            }
            l9c l9cVar4 = this.T1;
            if (l9cVar4 != null) {
                l9cVar4.O(true);
            }
        }
        ArrayList arrayList = this.g2;
        if (arrayList == null || arrayList.isEmpty()) {
            c1();
            l9c l9cVar5 = this.T1;
            if (l9cVar5 != null) {
                l9cVar5.O(true);
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        int i = this.S1;
        jn7.f(i).n(this, jn7.m5);
        jn7.f(i).n(this, jn7.H3);
        jn7.f(i).n(this, jn7.E0);
        jn7.f(i).n(this, jn7.K3);
        jn7.f(i).n(this, jn7.I3);
    }

    @Override // nx0
    public final void p0() {
        try {
            super.p0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        int i = this.S1;
        if (uc7.s1(i).x2()) {
            i5.b(i);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.V1;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        e S = LaunchActivity.S();
        if (S != null) {
            c00.v(ob6.a0(null, null, 2131743397, wf3.s(this.W1)), d31.b0(S), R.raw.error, 36);
        }
    }

    public yx4(LaunchActivity launchActivity, int i, long j) {
        this(launchActivity, i, j, null, null);
    }
}
