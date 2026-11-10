package zh;

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
import bi.dd;
import bi.ea;
import c8.ha;
import fi.y5;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.s9;
import org.telegram.messenger.t10;
import org.telegram.messenger.v9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class b4 extends ma implements ls, v9 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public s9 Y1;
    public final ug.j Z1;
    public final String a2;
    public final Runnable b2;
    public final v3 c2;
    public final LinearLayout d2;
    public final long e2;
    public final org.telegram.ui.Cells.t0 f2;
    public final TLRPC.MessageAction g2;
    public final ij h2;
    public final LinearLayout i2;
    public final fi.d j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final w3 o2;
    public m41 p2;
    public int q2;
    public final wp[] r2;
    public boolean s2;
    public final ri.c t2;

    public b4(Context context, int i7, final TL_stars.StarGift starGift, final ug.j jVar, long j3, Runnable runnable, final boolean z9, final boolean z10) {
        super(context, null, true, false, 2, null);
        float f10;
        long j10;
        Integer num;
        Integer num2;
        int w02;
        int i10;
        boolean z11;
        int i11;
        this.m2 = false;
        this.n2 = false;
        this.q2 = -2;
        this.r2 = new wp[1];
        this.s2 = false;
        boolean z12 = j3 == p10.i(i7).e();
        this.S1 = z12;
        this.M0 = 4;
        N();
        this.C1 = org.telegram.messenger.g0.L(4.0f);
        this.D1 = org.telegram.messenger.g0.L(-10.0f);
        if (z12) {
            this.l2 = true;
        }
        this.T1 = i7;
        this.U1 = j3;
        this.X1 = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.Y1 = w9.c(i7).l(starGift.id, this);
        }
        this.Z1 = jVar;
        this.b2 = runnable;
        this.V1 = z9;
        this.W1 = z10;
        if (z9) {
            this.m2 = true;
        } else if (z10) {
            this.m2 = false;
        }
        this.u1 = 0.2f;
        if (j3 >= 0) {
            j10 = 0;
            this.a2 = t10.k(qp.s1(i7).a2(Long.valueOf(j3)));
        } else {
            j10 = 0;
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            this.a2 = M0 == null ? "" : M0.title;
        }
        org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, this.I0, false);
        this.f2 = t0Var;
        t0Var.setDelegate(new u3());
        v3 v3Var = new v3(this, context);
        this.c2 = v3Var;
        Drawable e10 = y5.e(null, i7, j3, m6.I.q());
        v3Var.U(e10);
        ri.c cVar = new ri.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof qa0) {
                qa0 qa0Var = (qa0) e10;
                if (qa0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = qa0Var.a;
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
            w02 = m6.w0(m6.h5, this.I0);
        }
        cVar.a(w02);
        this.t2 = num2 == null ? cVar : null;
        fh.g gVar = new fh.g(cVar, cVar, cVar);
        h6 h6Var = this.I0;
        int i12 = m6.h5;
        gVar.p(new gh.b(i12, h6Var));
        gVar.r(org.telegram.messenger.g0.L(20.0f));
        gVar.q(org.telegram.messenger.g0.L(f10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d2 = linearLayout;
        linearLayout.setOrientation(1);
        if (starGift != null) {
            i10 = 6;
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.g2 = tL_messageActionStarGift;
            z11 = z12;
            i11 = i12;
        } else {
            boolean z13 = z12;
            i10 = 6;
            if (jVar == null || jVar.b == null) {
                z11 = z13;
                i11 = i12;
                if (jVar == null || jVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = jVar.d();
                tL_messageActionGiftPremium.currency = jVar.a();
                long e11 = jVar.e();
                tL_messageActionGiftPremium.amount = e11;
                if (jVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium.currency) - 6) * e11);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.g2 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = jVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = jVar.a();
                long e12 = jVar.e();
                tL_messageActionGiftCode.amount = e12;
                z11 = z13;
                if (jVar.h != null) {
                    i11 = i12;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode.currency) - 6) * e12);
                } else {
                    i11 = i12;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.g2 = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.g2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z14 = this.m2;
            tL_messageActionStarGift2.can_upgrade = z14 || (z11 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z11 && z14) ? starGift.upgrade_stars : j10;
            tL_messageActionStarGift2.convert_stars = z14 ? j10 : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j3;
        tL_messageService.from_id = qp.s1(i7).z1(p10.i(i7).e());
        tL_messageService.peer_id = qp.s1(i7).z1(j3);
        tL_messageService.action = this.g2;
        long N1 = starGift != null ? qp.s1(i7).N1(j3) : j10;
        this.e2 = N1;
        ij ijVar = new ij(i7, tL_messageService, false, false);
        this.h2 = ijVar;
        int i13 = 1;
        t0Var.g0(ijVar, true);
        linearLayout.addView(t0Var, ha.t(-1, -1, qs.E1, 0, N1 > j10 ? 0 : 8, 0, 8));
        v3Var.addView(linearLayout, ha.e(-1, -1, qs.E1));
        w3 w3Var = new w3(this, context, (st0) this.b, id.M0(starGift != null ? 2131750120 : 2131750119, null), qp.s1(i7).D6, this.I0, gVar, i7);
        this.o2 = w3Var;
        org.telegram.ui.Cells.f3 f3Var = w3Var.b;
        f3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.j3());
        f3Var.Q = true;
        w3Var.setShowLimitWhenNear(50);
        this.K1 = f3Var;
        w3Var.setShowLimitOnFocus(true);
        w3Var.setDivider(false);
        org.telegram.ui.Cells.f fVar = new org.telegram.ui.Cells.f(w3Var, 3);
        f3Var.getEditText().setImeOptions(i10);
        f3Var.getEditText().setOnEditorActionListener(new m.s2(fVar, i13));
        int i14 = this.t0;
        w3Var.setPadding(i14, 0, i14, 0);
        x3 x3Var = new x3();
        x3Var.C = false;
        x3Var.m = false;
        x3Var.n(350L);
        x3Var.o(wq.h);
        x3Var.D = 40L;
        this.n1.setItemAnimator(x3Var);
        this.p2.O(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.i2 = linearLayout2;
        linearLayout2.setOrientation(1);
        ColorDrawable colorDrawable = new ColorDrawable(m6.w0(i11, this.I0));
        int i15 = this.t0;
        int i16 = i11;
        linearLayout2.setBackground(new InsetDrawable((Drawable) colorDrawable, i15, 0, i15, 0));
        int i17 = this.t0;
        linearLayout2.setPadding(i17, 0, i17, 0);
        this.b.addView(linearLayout2, ha.e(-1, -2, 87));
        View view = new View(context);
        t6.h(m6.K5, view, this.I0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ha.z(-1.0f), ha.z(1.0f / org.telegram.messenger.g0.p));
        layoutParams.gravity = 55;
        linearLayout2.addView(view, layoutParams);
        float i18 = Utilities.i(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(6.0f);
        int i19 = m6.a7;
        Drawable d02 = m6.d0(L, m6.w0(i19, this.I0));
        p6 M = t6.M(i19);
        h6 h6Var2 = this.I0;
        frameLayout.setBackground(d02);
        t6.j(frameLayout, d02, M, null, h6Var2);
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout2.addView(frameLayout, ha.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.k2 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.k2 = frameLayout2;
            frameLayout2.addView(frameLayout, ha.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            t6.h(i16, frameLayout2, this.I0);
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int i20 = m6.G6;
        t6.U(textView, i20, this.I0);
        if (starGift != null) {
            textView.setText(id.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView i21 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i21.setTextSize(1, 13.0f);
        i21.setGravity(21);
        i21.setTypeface(org.telegram.messenger.g0.o());
        t6.U(i21, i20, this.I0);
        if (starGift != null) {
            i21.setText(id.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(i21, ha.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View y3Var = new y3(context, starGift, i18);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int i22 = m6.Ci;
        Drawable d03 = m6.d0(L2, m6.w0(i22, this.I0));
        p6 M2 = t6.M(i22);
        h6 h6Var3 = this.I0;
        y3Var.setBackground(d03);
        t6.j(y3Var, d03, M2, null, h6Var3);
        frameLayout.addView(y3Var, ha.e(-1, -1, qs.E1));
        z3 z3Var = new z3(context, i18);
        z3Var.setWillNotDraw(false);
        frameLayout.addView(z3Var, ha.e(-1, -1, qs.E1));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(id.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        }
        z3Var.addView(textView2, ha.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(id.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        z3Var.addView(textView3, ha.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        fi.d dVar = new fi.d(context, this.I0, true);
        this.j2 = dVar;
        dVar.f();
        g1(false);
        linearLayout2.addView(dVar, ha.t(-1, 48, qs.E1, 10, 10, 10, 10));
        dVar.setOnClickListener(new m(this, j3, context, runnable, starGift));
        jg.b0 b0Var = this.m1;
        this.J1 = true;
        b0Var.k1(true);
        this.p2.O(false);
        this.m1.h1(this.p2.D.size(), org.telegram.messenger.g0.L(200.0f));
        pj0 pj0Var = this.n1;
        int i23 = this.t0;
        pj0Var.setPadding(i23, 0, i23, org.telegram.messenger.g0.L(68 + ((starGift != null && starGift.limited && this.k2 == null) ? 40 : 0)));
        this.n1.i(new a4(this));
        this.n1.setOnItemClickListener(new bj0() { // from class: zh.t3
            @Override // org.telegram.ui.Components.bj0
            public final void c(int i24, View view2) {
                TL_stars.StarGift starGift2;
                b4 b4Var = b4.this;
                TL_stars.StarGift starGift3 = b4Var.X1;
                boolean z15 = b4Var.S1;
                org.telegram.ui.Cells.t0 t0Var2 = b4Var.f2;
                TLRPC.MessageAction messageAction2 = b4Var.g2;
                ij ijVar2 = b4Var.h2;
                m41 m41Var = b4Var.p2;
                if (!b4Var.J1) {
                    i24--;
                }
                x31 G = m41Var.G(i24);
                if (G == null) {
                    return;
                }
                int i25 = G.d;
                if (i25 == 1) {
                    boolean z16 = !b4Var.l2;
                    b4Var.l2 = z16;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z16;
                    }
                    ijVar2.a6();
                    t0Var2.g0(ijVar2, true);
                    b4Var.p2.O(true);
                    return;
                }
                if (i25 == 2) {
                    if (z9 || z10) {
                        int i26 = -b4Var.q2;
                        b4Var.q2 = i26;
                        org.telegram.messenger.g0.G3(i26, view2, null);
                        return;
                    }
                    boolean z17 = b4Var.m2;
                    b4Var.m2 = !z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z17 || (z15 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z15 || z17) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z17 ? starGift3.convert_stars : 0L;
                    }
                    ijVar2.a6();
                    t0Var2.g0(ijVar2, true);
                    b4Var.p2.O(true);
                    b4Var.g1(true);
                    return;
                }
                if (i25 == 3) {
                    boolean z18 = b4Var.n2;
                    b4Var.n2 = !z18;
                    boolean z19 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    ug.j jVar2 = jVar;
                    if (z19) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z18) {
                            tL_messageActionGiftPremium2.currency = jVar2.a();
                            long e13 = jVar2.e();
                            tL_messageActionGiftPremium2.amount = e13;
                            if (jVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftPremium2.currency) - 6) * e13);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = jVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z18) {
                            tL_messageActionGiftCode2.currency = jVar2.a();
                            long e14 = jVar2.e();
                            tL_messageActionGiftCode2.amount = e14;
                            if (jVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_messageActionGiftCode2.currency) - 6) * e14);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = jVar2.g();
                        }
                    }
                    ijVar2.a6();
                    t0Var2.g0(ijVar2, true);
                    b4Var.p2.O(true);
                    b4Var.g1(true);
                }
            }
        });
        this.o1.setTitle(O0());
    }

    @Override // org.telegram.ui.Components.ma
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.T1, 0, true, new p3(this, 0), this.I0);
        this.p2 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return id.M0(this.S1 ? 2131749938 : 2131749944, null);
    }

    @Override // org.telegram.messenger.v9
    public final void c(s9 s9Var) {
        this.Y1 = s9Var;
    }

    public final TLRPC.TL_textWithEntities d1() {
        if (qp.s1(this.T1).N1(this.U1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.g2;
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.y3) {
            g1(true);
            m41 m41Var = this.p2;
            if (m41Var == null || this.Z1 == null) {
                return;
            }
            m41Var.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        w3 w3Var = this.o2;
        org.telegram.ui.Cells.f3 f3Var = w3Var.b;
        org.telegram.ui.Cells.f3 f3Var2 = w3Var.b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
            return;
        }
        if (f3Var2.w) {
            f3Var2.d();
            return;
        }
        f3Var2.r();
        if (this.Y1 != null) {
            w9.c(this.T1).n(this.Y1.b, this);
        }
        this.s2 = true;
        super.dismiss();
    }

    public gc e1() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return null;
        }
        return gc.a0(T);
    }

    public final void f1(boolean z9) {
        int i7 = this.T1;
        qp s12 = qp.s1(i7);
        long j3 = this.U1;
        TLRPC.UserFull b22 = s12.b2(j3);
        TLObject e22 = qp.s1(i7).e2(j3);
        int i10 = 0;
        if (b22 != null && (e22 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) e22;
            user.premium = true;
            qp.s1(i7).X3(user, true, false);
            qs.f(i7).k(qs.E0, Long.valueOf(user.id), b22);
        }
        org.telegram.ui.ActionBar.f2 f2Var = this.r1;
        if (f2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) f2Var.getParentActivity()).M().getFragmentStack());
            r4 parentLayout = f2Var.getParentLayout();
            int size = arrayList.size();
            cn cnVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj;
                if (f2Var2 instanceof cn) {
                    cnVar = (cn) f2Var2;
                    if (cnVar.a() != j3) {
                        f2Var2.removeSelfFromStack();
                    }
                } else if (f2Var2 instanceof ProfileActivity) {
                    if (z9 && parentLayout.getLastFragment() == f2Var2) {
                        f2Var2.finishFragment();
                    } else {
                        f2Var2.removeSelfFromStack();
                    }
                }
            }
            if (cnVar == null || cnVar.a() != j3) {
                ((ActionBarLayout) parentLayout).T(new cn(a8.p0.j(j3, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void g1(boolean z9) {
        CharSequence charSequence;
        s9 s9Var = this.Y1;
        int i7 = this.T1;
        fi.d dVar = this.j2;
        if (s9Var != null) {
            int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
            if (this.Y1.g(currentTime)) {
                int i10 = this.Y1.d.auction_start_date - currentTime;
                dVar.i(id.M0(2131750340, null), z9, true);
                dVar.g(id.a0(null, null, 2131750335, id.c0(i10)), z9);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Y1.f;
            if (tL_starGiftAuctionState == null) {
                dVar.i(id.M0(2131750345, null), z9, true);
                dVar.g(null, z9);
                return;
            } else {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.i(id.M0(2131750345, null), z9, true);
                dVar.g(id.a0(null, null, 2131750321, id.c0(i11)), z9);
                return;
            }
        }
        TL_stars.StarGift starGift = this.X1;
        wp[] wpVarArr = this.r2;
        if (starGift != null) {
            long j3 = ea.y(i7, false).p().amount;
            long j10 = starGift.stars + (this.m2 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.o2.getText()) ? 0L : this.e2);
            dVar.i(dd.Y0(false, id.H(',', this.S1 ? "Gift2SendSelf" : "Gift2Send", (int) j10), wpVarArr), z9, true);
            if (!ea.y(i7, false).e || j10 <= j3) {
                dVar.g(null, z9);
                return;
            } else {
                dVar.g(id.H(',', "Gift2SendYourBalance", (int) j3), z9);
                return;
            }
        }
        ug.j jVar = this.Z1;
        if (jVar != null) {
            if (this.n2) {
                dVar.i(dd.U0(id.a0(null, null, 2131749994, id.E(jVar.g(), ',')), 1.0f, wpVarArr), z9, true);
                wpVarArr[0].G = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                dVar.i(new SpannableStringBuilder(id.a0(null, null, 2131749995, jVar.c())), z9, true);
            }
            dVar.g(charSequence, z9);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.T1).c(this, qs.y3);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        w3 w3Var = this.o2;
        org.telegram.ui.Cells.f3 f3Var = w3Var.b;
        org.telegram.ui.Cells.f3 f3Var2 = w3Var.b;
        if (f3Var.getEmojiPadding() > 0) {
            f3Var2.k(true);
        } else if (f3Var2.w) {
            f3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.T1).n(this, qs.y3);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        try {
            super.s0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int w02 = m6.w0(m6.h5, this.I0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != w02) {
                        colorDrawable.setColor(w02);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(w02);
                    int i7 = this.t0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i7, 0, i7, 0));
                }
            }
            ri.c cVar = this.t2;
            if (cVar != null) {
                cVar.a(m6.w0(m6.h5, this.I0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void show() {
        w3 w3Var = this.o2;
        if (w3Var != null) {
            w3Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.n1.a0();
    }
}
