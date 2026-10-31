package ph;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.t9;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w9;
import org.telegram.messenger.x9;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
import rh.e6;
import rh.h8;
import vh.k4;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class g4 extends ha implements us, w9 {
    public final boolean P1;
    public final int Q1;
    public final long R1;
    public final boolean S1;
    public final boolean T1;
    public final TL_stars.StarGift U1;
    public t9 V1;
    public final kg.m W1;
    public final String X1;
    public final Runnable Y1;
    public final a4 Z1;
    public final LinearLayout a2;
    public final long b2;
    public final org.telegram.ui.Cells.s0 c2;
    public final TLRPC.MessageAction d2;
    public final jj e2;
    public final LinearLayout f2;
    public final vh.d g2;
    public final FrameLayout h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public final b4 l2;
    public p51 m2;
    public int n2;
    public final dq[] o2;
    public boolean p2;
    public final hi.c q2;

    public g4(Context context, int i10, final TL_stars.StarGift starGift, final kg.m mVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, 2, null);
        float f7;
        long j11;
        Integer num;
        Integer num2;
        int w02;
        int i11;
        boolean z12;
        int i12;
        this.j2 = false;
        this.k2 = false;
        this.n2 = -2;
        this.o2 = new dq[1];
        this.p2 = false;
        boolean z13 = j10 == d20.i(i10).e();
        this.P1 = z13;
        this.M0 = 4;
        O();
        this.z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-10.0f);
        if (z13) {
            this.i2 = true;
        }
        this.Q1 = i10;
        this.R1 = j10;
        this.U1 = starGift;
        if (starGift == null || !starGift.auction) {
            f7 = 4.0f;
        } else {
            f7 = 4.0f;
            this.V1 = x9.c(i10).l(starGift.id, this);
        }
        this.W1 = mVar;
        this.Y1 = runnable;
        this.S1 = z10;
        this.T1 = z11;
        if (z10) {
            this.j2 = true;
        } else if (z11) {
            this.j2 = false;
        }
        this.r1 = 0.2f;
        if (j10 >= 0) {
            j11 = 0;
            this.X1 = h20.k(vp.r1(i10).Z1(Long.valueOf(j10)));
        } else {
            j11 = 0;
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            this.X1 = L0 == null ? "" : L0.title;
        }
        org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, this.I0, false);
        this.c2 = s0Var;
        s0Var.setDelegate(new z3());
        a4 a4Var = new a4(this, context);
        this.Z1 = a4Var;
        Drawable e = k4.e(null, i10, j10, t6.I.q());
        a4Var.U(e);
        hi.c cVar = new hi.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof jb0) {
                jb0 jb0Var = (jb0) e;
                if (jb0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = jb0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        if (num != null) {
            w02 = num.intValue();
            num2 = num;
        } else {
            num2 = num;
            w02 = t6.w0(t6.h5, this.I0);
        }
        cVar.a(w02);
        this.q2 = num2 == null ? cVar : null;
        vg.f fVar = new vg.f(cVar);
        p6 p6Var = this.I0;
        int i13 = t6.h5;
        fVar.o(new wg.b(i13, p6Var));
        fVar.q(org.telegram.messenger.i0.L(20.0f));
        fVar.p(org.telegram.messenger.i0.L(f7));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i11 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.d2 = tL_messageActionStarGift;
            z12 = z13;
            i12 = i13;
        } else {
            boolean z14 = z13;
            i11 = 6;
            if (mVar == null || mVar.b == null) {
                z12 = z14;
                i12 = i13;
                if (mVar == null || mVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = mVar.d();
                tL_messageActionGiftPremium.currency = mVar.a();
                long e7 = mVar.e();
                tL_messageActionGiftPremium.amount = e7;
                if (mVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftPremium.currency) - 6) * e7);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.d2 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = mVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = mVar.a();
                long e10 = mVar.e();
                tL_messageActionGiftCode.amount = e10;
                z12 = z14;
                if (mVar.h != null) {
                    i12 = i13;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftCode.currency) - 6) * e10);
                } else {
                    i12 = i13;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.d2 = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z15 = this.j2;
            tL_messageActionStarGift2.can_upgrade = z15 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z15) ? starGift.upgrade_stars : j11;
            tL_messageActionStarGift2.convert_stars = z15 ? j11 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = vp.r1(i10).y1(d20.i(i10).e());
        tL_messageService.peer_id = vp.r1(i10).y1(j10);
        tL_messageService.action = this.d2;
        long M1 = starGift != null ? vp.r1(i10).M1(j10) : j11;
        this.b2 = M1;
        jj jjVar = new jj(i10, tL_messageService, false, false);
        this.e2 = jjVar;
        int i14 = 1;
        s0Var.f0(jjVar, true);
        linearLayout.addView(s0Var, b6.t(-1, -1, zs.E1, 0, M1 > j11 ? 0 : 8, 0, 8));
        a4Var.addView(linearLayout, b6.e(-1, -1, zs.E1));
        b4 b4Var = new b4(this, context, (uu0) this.b, cd.L0(starGift != null ? 2131750129 : 2131750128, null), vp.r1(i10).E6, this.I0, fVar, i10);
        this.l2 = b4Var;
        org.telegram.ui.Cells.h3 h3Var = b4Var.b;
        h3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.l3());
        h3Var.Q = true;
        b4Var.setShowLimitWhenNear(50);
        this.H1 = h3Var;
        b4Var.setShowLimitOnFocus(true);
        b4Var.setDivider(false);
        org.telegram.ui.Cells.f fVar2 = new org.telegram.ui.Cells.f(b4Var, 3);
        h3Var.getEditText().setImeOptions(i11);
        h3Var.getEditText().setOnEditorActionListener(new m.s2(fVar2, i14));
        int i15 = this.t0;
        b4Var.setPadding(i15, 0, i15, 0);
        c4 c4Var = new c4();
        c4Var.C = false;
        c4Var.m = false;
        c4Var.n(350L);
        c4Var.o(gr.h);
        c4Var.D = 40L;
        this.k1.setItemAnimator(c4Var);
        this.m2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f2 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(t6.w0(i12, this.I0));
        int i16 = this.t0;
        int i17 = i12;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i16, 0, i16, 0));
        int i18 = this.t0;
        linearLayout2.setPadding(i18, 0, i18, 0);
        this.b.addView(linearLayout2, b6.e(-1, -2, 87));
        View view = new View(context);
        a7.i(t6.K5, view, this.I0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b6.z(-1.0f), b6.z(1.0f / org.telegram.messenger.i0.p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i19 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.i0.L(6.0f);
        int i20 = t6.a7;
        Drawable d02 = t6.d0(L, t6.w0(i20, this.I0));
        w6 N = a7.N(i20);
        p6 p6Var2 = this.I0;
        frameLayout.setBackground(d02);
        a7.k(frameLayout, d02, N, null, p6Var2);
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, b6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.h2 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.h2 = frameLayout2;
            frameLayout2.addView(frameLayout, b6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            a7.i(i17, frameLayout2, this.I0);
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i21 = t6.G6;
        a7.V(textView, i21, this.I0);
        if (starGift != null) {
            textView.setText(cd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l4.setTextSize(1, 13.0f);
        l4.setGravity(21);
        l4.setTypeface(org.telegram.messenger.i0.o());
        a7.V(l4, i21, this.I0);
        if (starGift != null) {
            l4.setText(cd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(l4, b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View d4Var = new d4(context, starGift, i19);
        int L2 = org.telegram.messenger.i0.L(6.0f);
        int i22 = t6.Ci;
        Drawable d03 = t6.d0(L2, t6.w0(i22, this.I0));
        w6 N2 = a7.N(i22);
        p6 p6Var3 = this.I0;
        d4Var.setBackground(d03);
        a7.k(d4Var, d03, N2, null, p6Var3);
        frameLayout.addView(d4Var, b6.e(-1, -1, zs.E1));
        e4 e4Var = new e4(context, i19);
        e4Var.setWillNotDraw(false);
        frameLayout.addView(e4Var, b6.e(-1, -1, zs.E1));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(cd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        e4Var.addView(textView2, b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(cd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        e4Var.addView(textView3, b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        vh.d dVar = new vh.d(context, this.I0, true);
        this.g2 = dVar;
        dVar.f();
        g1(false);
        linearLayout2.addView(dVar, b6.t(-1, 48, zs.E1, 10, 10, 10, 10));
        dVar.setOnClickListener(new n(this, j10, context, runnable, starGift));
        dh.f fVar3 = this.j1;
        this.G1 = true;
        fVar3.k1(true);
        this.m2.O(false);
        this.j1.h1(this.m2.D.size(), org.telegram.messenger.i0.L(200.0f));
        tk0 tk0Var = this.k1;
        int i23 = this.t0;
        tk0Var.setPadding(i23, 0, i23, org.telegram.messenger.i0.L(68 + ((starGift != null && starGift.limited && this.h2 == null) ? 40 : 0)));
        this.k1.i(new f4(this));
        this.k1.setOnItemClickListener(new gk0() { // from class: ph.y3
            @Override // org.telegram.ui.Components.gk0
            public final void f(int i24, View view2) {
                TL_stars.StarGift starGift2;
                g4 g4Var = g4.this;
                TL_stars.StarGift starGift3 = g4Var.U1;
                boolean z16 = g4Var.P1;
                org.telegram.ui.Cells.s0 s0Var2 = g4Var.c2;
                TLRPC.MessageAction messageAction2 = g4Var.d2;
                jj jjVar2 = g4Var.e2;
                p51 p51Var = g4Var.m2;
                if (!g4Var.G1) {
                    i24--;
                }
                a51 G = p51Var.G(i24);
                if (G == null) {
                    return;
                }
                int i25 = G.d;
                if (i25 == 1) {
                    boolean z17 = !g4Var.i2;
                    g4Var.i2 = z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z17;
                    }
                    jjVar2.Y5();
                    s0Var2.f0(jjVar2, true);
                    g4Var.m2.O(true);
                    return;
                }
                if (i25 == 2) {
                    if (z10 || z11) {
                        int i26 = -g4Var.n2;
                        g4Var.n2 = i26;
                        org.telegram.messenger.i0.F3(i26, view2, null);
                        return;
                    }
                    boolean z18 = g4Var.j2;
                    g4Var.j2 = !z18;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z18 || (z16 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z16 || z18) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z18 ? starGift3.convert_stars : 0L;
                    }
                    jjVar2.Y5();
                    s0Var2.f0(jjVar2, true);
                    g4Var.m2.O(true);
                    g4Var.g1(true);
                    return;
                }
                if (i25 == 3) {
                    boolean z19 = g4Var.k2;
                    g4Var.k2 = !z19;
                    boolean z20 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    kg.m mVar2 = mVar;
                    if (z20) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z19) {
                            tL_messageActionGiftPremium2.currency = mVar2.a();
                            long e11 = mVar2.e();
                            tL_messageActionGiftPremium2.amount = e11;
                            if (mVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftPremium2.currency) - 6) * e11);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = mVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z19) {
                            tL_messageActionGiftCode2.currency = mVar2.a();
                            long e12 = mVar2.e();
                            tL_messageActionGiftCode2.amount = e12;
                            if (mVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_messageActionGiftCode2.currency) - 6) * e12);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = mVar2.g();
                        }
                    }
                    jjVar2.Y5();
                    s0Var2.f0(jjVar2, true);
                    g4Var.m2.O(true);
                    g4Var.g1(true);
                }
            }
        });
        this.l1.setTitle(O0());
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.Q1, 0, true, new u3(this, 0), this.I0);
        this.m2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(this.P1 ? 2131749947 : 2131749953, null);
    }

    @Override // org.telegram.messenger.w9
    public final void c(t9 t9Var) {
        this.V1 = t9Var;
    }

    public final TLRPC.TL_textWithEntities d1() {
        if (vp.r1(this.Q1).M1(this.R1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.y3) {
            g1(true);
            p51 p51Var = this.m2;
            if (p51Var == null || this.W1 == null) {
                return;
            }
            p51Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        b4 b4Var = this.l2;
        org.telegram.ui.Cells.h3 h3Var = b4Var.b;
        org.telegram.ui.Cells.h3 h3Var2 = b4Var.b;
        if (h3Var.getEmojiPadding() > 0) {
            h3Var2.k(true);
            return;
        }
        if (h3Var2.w) {
            h3Var2.d();
            return;
        }
        h3Var2.r();
        if (this.V1 != null) {
            x9.c(this.Q1).n(this.V1.b, this);
        }
        this.p2 = true;
        super.dismiss();
    }

    public cc e1() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return cc.a0(T);
    }

    public final void f1(boolean z10) {
        int i10 = this.Q1;
        vp r12 = vp.r1(i10);
        long j10 = this.R1;
        TLRPC.UserFull a2 = r12.a2(j10);
        TLObject d22 = vp.r1(i10).d2(j10);
        int i11 = 0;
        if (a2 != null && (d22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) d22;
            user.premium = true;
            vp.r1(i10).U3(user, true, false);
            zs.f(i10).k(zs.E0, Long.valueOf(user.id), a2);
        }
        org.telegram.ui.ActionBar.k2 k2Var = this.o1;
        if (k2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) k2Var.getParentActivity()).M().getFragmentStack());
            z4 parentLayout = k2Var.getParentLayout();
            int size = arrayList.size();
            un unVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj;
                if (k2Var2 instanceof un) {
                    unVar = (un) k2Var2;
                    if (unVar.a() != j10) {
                        k2Var2.removeSelfFromStack();
                    }
                } else if (k2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == k2Var2) {
                        k2Var2.finishFragment();
                    } else {
                        k2Var2.removeSelfFromStack();
                    }
                }
            }
            if (unVar == null || unVar.a() != j10) {
                ((ActionBarLayout) parentLayout).S(new un(org.telegram.ui.Cells.f1.k(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void g1(boolean z10) {
        CharSequence charSequence;
        t9 t9Var = this.V1;
        int i10 = this.Q1;
        vh.d dVar = this.g2;
        if (t9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.V1.g(currentTime)) {
                int i11 = this.V1.d.auction_start_date - currentTime;
                dVar.i(cd.L0(2131750349, null), z10, true);
                dVar.g(cd.a0(null, null, 2131750344, cd.c0(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.V1.f;
            if (tL_starGiftAuctionState == null) {
                dVar.i(cd.L0(2131750354, null), z10, true);
                dVar.g(null, z10);
                return;
            } else {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(cd.L0(2131750354, null), z10, true);
                dVar.g(cd.a0(null, null, 2131750330, cd.c0(i12)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.U1;
        dq[] dqVarArr = this.o2;
        if (starGift != null) {
            long j10 = e6.y(i10, false).p().amount;
            long j11 = starGift.stars + (this.j2 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.l2.getText()) ? 0L : this.b2);
            dVar.i(h8.X0(false, cd.H(',', this.P1 ? "Gift2SendSelf" : "Gift2Send", (int) j11), dqVarArr), z10, true);
            if (!e6.y(i10, false).e || j11 <= j10) {
                dVar.g(null, z10);
                return;
            } else {
                dVar.g(cd.H(',', "Gift2SendYourBalance", (int) j10), z10);
                return;
            }
        }
        kg.m mVar = this.W1;
        if (mVar != null) {
            if (this.k2) {
                dVar.i(h8.T0(cd.a0(null, null, 2131750003, cd.E(mVar.g(), ',')), 1.0f, dqVarArr), z10, true);
                dqVarArr[0].G = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(cd.a0(null, null, 2131750004, mVar.c())), z10, true);
            }
            dVar.g(charSequence, z10);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.Q1).c(this, zs.y3);
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        b4 b4Var = this.l2;
        org.telegram.ui.Cells.h3 h3Var = b4Var.b;
        org.telegram.ui.Cells.h3 h3Var2 = b4Var.b;
        if (h3Var.getEmojiPadding() > 0) {
            h3Var2.k(true);
        } else if (h3Var2.w) {
            h3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.Q1).n(this, zs.y3);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.f2;
            if (linearLayout != null) {
                int w02 = t6.w0(t6.h5, this.I0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i10 = this.t0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i10, 0, i10, 0));
                }
            }
            hi.c cVar = this.q2;
            if (cVar != null) {
                cVar.a(t6.w0(t6.h5, this.I0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        b4 b4Var = this.l2;
        if (b4Var != null) {
            b4Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        this.k1.a0();
    }
}
