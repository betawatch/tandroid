package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b0 extends ha {
    public static final int[] p2 = {21600, 43200, 86400, 129600, 172800, 259200};
    public int P1;
    public final a Q1;
    public final TL_stars.TL_starGiftUnique R1;
    public final String S1;
    public final long T1;
    public final t30 U1;
    public final ec0 V1;
    public final EditTextBoldCursor W1;
    public final TextView X1;
    public final z Y1;
    public final TextView Z1;
    public final vh.d a2;
    public final org.telegram.ui.Components.f6 b2;
    public final ImageView c2;
    public final ImageView d2;
    public final m2.t e2;
    public sf.a f2;
    public int g2;
    public int h2;
    public boolean i2;
    public final w0 j2;
    public final dq[] k2;
    public final dq[] l2;
    public boolean m2;
    public p51 n2;
    public final a51 o2;

    public b0(final Context context, final int i10, final long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, final org.telegram.ui.ActionBar.p6 p6Var, w0 w0Var) {
        super(context, null, true, false, 2, p6Var);
        float f7;
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var2;
        m2.t tVar = new m2.t(26);
        m4.c[] cVarArr = (m4.c[]) tVar.b;
        this.e2 = tVar;
        this.k2 = new dq[1];
        this.l2 = new dq[1];
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.r1 = 0.2f;
        this.T1 = j10;
        this.R1 = tL_starGiftUnique;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.S1 = i0.a.k(tL_starGiftUnique.num, ',', sb2);
        this.j2 = w0Var;
        this.D = true;
        this.P0 = true;
        boolean j11 = e6.y(i10, true).j();
        if (j10 <= 0 || vp.r1(i10).a2(j10) != null) {
            f7 = 12.0f;
        } else {
            f7 = 12.0f;
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            if (Z1 != null) {
                vp.r1(i10).U2(Z1, 0, false, null);
            }
        }
        org.telegram.messenger.s0 s0Var = vp.r1(i10).y7;
        long j12 = tL_starGiftUnique.offer_min_stars;
        sf.b bVar = sf.b.a;
        sf.a g10 = sf.a.g(j12, bVar);
        sf.a g11 = sf.a.g(Math.max(g10.a() * 2, ((org.telegram.messenger.l0) s0Var.q.a).c), bVar);
        sf.b bVar2 = sf.b.b;
        sf.a i11 = sf.a.i(Math.max(g10.e(bVar2).n(2).b, s0Var.r.a.c), bVar2);
        sf.a i12 = sf.a.i(Math.max(i11.b * 2, s0Var.s.a.c), bVar2);
        sf.b bVar3 = g10.a;
        if (bVar3 != g11.a) {
            z10 = false;
        } else {
            z10 = false;
            cVarArr[bVar3.ordinal()] = new m4.c(g10, g11, false, 28);
        }
        sf.b bVar4 = i11.a;
        if (bVar4 == i12.a) {
            cVarArr[bVar4.ordinal()] = new m4.c(i11, i12, z10, 28);
        }
        a aVar = new a(i10, context, p6Var);
        this.Q1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        aVar.setEnabled(z10);
        aVar.setClickable(z10);
        this.c.addView(aVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.e6.a(aVar);
        aVar.setOnClickListener(new ag.i(this, context, p6Var, 29));
        Q(org.telegram.ui.ActionBar.t6.h5);
        this.P1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(f7), 0, org.telegram.messenger.i0.L(16.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.W1 = editTextBoldCursor;
        if (j11) {
            t30 t30Var = new t30(context, p6Var);
            this.U1 = t30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cd.L0(2131744403, null));
            arrayList.add(cd.L0(2131744402, null));
            t30Var.b(arrayList, new x(this, 0));
            linearLayout.addView(t30Var, w7.b6.k(18.0f, 0.0f, 18.0f, 18.0f, -1, -2));
            p6Var2 = null;
        } else {
            p6Var2 = null;
            this.U1 = null;
        }
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
        linearLayout.addView(f10, w7.b6.l(1.0f, -1, -2));
        ec0 ec0Var = new ec0(context, p6Var2);
        this.V1 = ec0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(28.0f));
        ec0Var.e(editTextBoldCursor);
        ec0Var.b(1.0f, 0.0f, false);
        ec0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bi.g6(this, 4));
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        f10.addView(ec0Var, w7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.c2 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        ec0Var.addView(imageView, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d2 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        ec0Var.addView(imageView2, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.b2 = f6Var;
        int i14 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i14, null);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var.setGravity(5);
        ec0Var.addView(f6Var, w7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.X1 = textView;
        textView.setTextSize(1, 13.0f);
        f10.addView(textView, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        z zVar = new z(context);
        this.Y1 = zVar;
        zVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        zVar.setCursorWidth(1.5f);
        zVar.setTextSize(1, 17.0f);
        zVar.setMaxLines(1);
        zVar.setBackground(null);
        zVar.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(zVar, i13, null);
        zVar.setFocusable(false);
        zVar.setClickable(false);
        zVar.setEnabled(false);
        ec0 ec0Var2 = new ec0(context, null);
        ec0Var2.setText(cd.L0(2131749739, null));
        ec0Var2.e(zVar);
        ec0Var2.addView(zVar, w7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.e6.b(ec0Var2, 0.02f, 1.2f);
        ec0Var2.setOnClickListener(new rv0(25, this, context));
        f10.addView(ec0Var2, w7.b6.k(18.0f, 18.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.a7.t(imageView3, org.telegram.ui.ActionBar.t6.W5, p6Var, PorterDuff.Mode.SRC_IN);
        ec0Var2.addView(imageView3, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.Z1 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.a2 = dVar;
        dVar.setOnClickListener(new View.OnClickListener() { // from class: rh.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                boolean z11;
                int i15;
                boolean z12;
                long j13;
                int i16;
                final b0 b0Var = b0.this;
                if (b0Var.a2.c0) {
                    int i17 = i10;
                    if (vp.r1(i17).u2()) {
                        org.telegram.ui.b.b(i17);
                        return;
                    }
                    e6 x10 = e6.x(i17, b0Var.f2.a);
                    sf.a l4 = x10.e ? sf.a.l(x10.p()) : null;
                    sf.b bVar5 = sf.b.a;
                    sf.b bVar6 = sf.b.b;
                    if (l4 != null) {
                        long j14 = l4.b;
                        sf.a aVar2 = b0Var.f2;
                        if (j14 >= aVar2.b) {
                            String str2 = b0Var.S1;
                            long j15 = b0Var.T1;
                            String d = aVar2.d();
                            if (b0Var.f2.a == bVar6) {
                                str = str2;
                                z11 = true;
                            } else {
                                str = str2;
                                z11 = false;
                            }
                            LinearLayout linearLayout2 = new LinearLayout(b0Var.getContext());
                            linearLayout2.setOrientation(1);
                            TextView textView3 = new TextView(b0Var.getContext());
                            textView3.setText(cd.L0(2131749741, null));
                            int i18 = org.telegram.ui.ActionBar.t6.j5;
                            org.telegram.messenger.m5.m(textView3, i18, b0Var.I0, 1, 20.0f);
                            linearLayout2.addView(textView3, w7.b6.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView4 = new TextView(b0Var.getContext());
                            org.telegram.ui.ActionBar.a7.V(textView4, i18, b0Var.I0);
                            textView4.setTextSize(1, 16.0f);
                            textView4.setText(org.telegram.messenger.i0.W2(b0Var.f2.a == bVar5 ? cd.a0(null, null, 2131749692, d, org.telegram.messenger.o5.t(j15), str) : cd.a0(null, null, 2131749691, d, org.telegram.messenger.o5.t(j15), str)));
                            linearLayout2.addView(textView4, w7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                            wy0 wy0Var = new wy0(b0Var.getContext(), b0Var.I0);
                            final long M1 = vp.r1(b0Var.a).M1(j15);
                            final sf.a g12 = sf.a.g(M1, bVar5);
                            wy0Var.c(cd.L0(2131749713, null), h8.Z0(z11, cd.a0(null, null, 2131749749, d), 0.8f, null), null, null);
                            if (M1 > 0) {
                                i15 = 0;
                                wy0Var.c(cd.L0(2131749714, null), h8.Z0(false, cd.a0(null, null, 2131749749, g12.d()), 0.8f, null), null, null);
                            } else {
                                i15 = 0;
                            }
                            wy0Var.c(cd.L0(2131749715, null), cd.G(b0Var.g2 / 3600, "GiftOfferHours", new Object[i15]), null, null);
                            linearLayout2.addView(wy0Var, w7.b6.t(-1, -2, 48, 23, 16, 23, 4));
                            qz.C(b0Var.a);
                            long E = qz.E();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (M1 == 0) {
                                spannableStringBuilder.append((CharSequence) h8.U0(cd.a0(null, null, 2131749721, d), z11));
                                z12 = z11;
                                j13 = E;
                                i16 = 0;
                            } else if (z11) {
                                spannableStringBuilder.append(cd.V(null, null, 2131749720, h8.U0(cd.a0(null, null, 2131749719, d), true), h8.S0(cd.a0(null, null, 2131749719, g12.d()))));
                                z12 = z11;
                                j13 = E;
                                i16 = 0;
                            } else {
                                z12 = z11;
                                j13 = E;
                                i16 = 0;
                                spannableStringBuilder.append((CharSequence) h8.S0(cd.a0(null, null, 2131749721, sf.a.i(b0Var.f2.b + g12.b, bVar5).d())));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i16, b0Var.getContext(), b0Var.I0);
                            alertDialog$Builder.o(linearLayout2);
                            final boolean z13 = z12;
                            final long j16 = j13;
                            alertDialog$Builder.k(spannableStringBuilder, new org.telegram.ui.ActionBar.u1() { // from class: rh.w
                                @Override // org.telegram.ui.ActionBar.u1
                                public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i19) {
                                    long j17 = M1;
                                    b0 b0Var2 = b0.this;
                                    if (j17 > 0) {
                                        int i20 = b0Var2.a;
                                        sf.b bVar7 = sf.b.a;
                                        e6 x11 = e6.x(i20, bVar7);
                                        sf.a l10 = x11.e ? sf.a.l(x11.p()) : null;
                                        sf.a g13 = z13 ? sf.a.g(j17, bVar7) : sf.a.i(b0Var2.f2.b + g12.b, bVar7);
                                        if (l10 == null || l10.b < g13.b) {
                                            new x7(b0Var2.getContext(), b0Var2.I0, g13.a(), 14, null, null, b0Var2.T1).show();
                                            return;
                                        }
                                    }
                                    gf.e h = x1Var.h(-1, true, true);
                                    h.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = b0Var2.f2.o();
                                    tL_sendStarGiftOffer.peer = vp.r1(b0Var2.a).i1(b0Var2.T1);
                                    tL_sendStarGiftOffer.duration = b0Var2.g2;
                                    tL_sendStarGiftOffer.slug = b0Var2.R1.slug;
                                    tL_sendStarGiftOffer.random_id = j16;
                                    if (j17 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j17;
                                    }
                                    ConnectionsManager.getInstance(b0Var2.a).sendRequestTyped(tL_sendStarGiftOffer, new org.telegram.tgnet.e(b0Var2, h, x1Var, 7));
                                }
                            });
                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.Z0 = true;
                            x1Var.show();
                            return;
                        }
                    }
                    sf.a aVar3 = b0Var.f2;
                    sf.b bVar7 = aVar3.a;
                    Context context2 = context;
                    org.telegram.ui.ActionBar.p6 p6Var3 = p6Var;
                    if (bVar7 == bVar5) {
                        new x7(context2, p6Var3, aVar3.a(), 14, null, null, j10).show();
                    } else if (bVar7 == bVar6) {
                        new wh.f(context2, p6Var3, aVar3, true, null).show();
                    }
                }
            }
        });
        f1(sf.a.i(0L, bVar), false, true, false);
        if (this.g2 != 86400) {
            this.g2 = 86400;
            zVar.setText(cd.G(24, "GiftOfferHours", new Object[0]));
        }
        e1(false);
        editTextBoldCursor.addTextChangedListener(new a0(this));
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i15 = d.leftMargin;
        int i16 = this.t0;
        d.leftMargin = i15 + i16;
        d.rightMargin += i16;
        this.b.addView(dVar, d);
        tk0 tk0Var = this.k1;
        int i17 = this.t0;
        tk0Var.setPadding(i17, 0, i17, org.telegram.messenger.i0.L(64.0f));
        this.k1.setOverScrollMode(2);
        this.o2 = a51.k(linearLayout);
        this.n2.O(false);
    }

    @Override // org.telegram.ui.Components.ha
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.k1, getContext(), this.a, 0, true, new qh.d(this, 4), this.I0);
        this.n2 = p51Var;
        p51Var.r = false;
        return p51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return cd.L0(2131749695, null);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean Y(float f7, float f10) {
        a aVar;
        if (!this.i2 || (aVar = this.Q1) == null || f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.Y(f7, f10);
        }
        return false;
    }

    public final void d1() {
        boolean z10 = this.m2;
        a aVar = this.Q1;
        boolean z11 = (z10 && !this.I && aVar != null && this.b.getY() > ((float) org.telegram.messenger.i0.L(32.0f))) || this.U1 == null;
        if (this.i2 != z11) {
            this.i2 = z11;
            if (aVar != null) {
                aVar.setEnabled(z11);
                aVar.setClickable(z11);
                z20.l(aVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void e1(boolean z10) {
        boolean z11 = this.h2 == 0 && this.f2.b > 0;
        vh.d dVar = this.a2;
        if (dVar.c0 != z11) {
            dVar.setEnabled(z11);
            dVar.setClickable(z11);
            if (z10) {
                z20.l(dVar.animate(), z11 ? 1.0f : 0.6f, 180L);
            } else {
                dVar.setAlpha(z11 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v7 */
    public final void f1(sf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i10;
        boolean z14;
        boolean z15;
        sf.a aVar2 = this.f2;
        int i11 = this.h2;
        this.h2 = 0;
        if (aVar != null) {
            this.f2 = aVar;
        } else {
            this.f2 = sf.a.i(0L, aVar2.a);
            this.h2 |= 1;
        }
        sf.b bVar = this.f2.a;
        m2.t tVar = this.e2;
        m4.c[] cVarArr = (m4.c[]) tVar.b;
        m4.c[] cVarArr2 = (m4.c[]) tVar.b;
        long j10 = ((sf.a) cVarArr[bVar.ordinal()].c).b;
        sf.a aVar3 = this.f2;
        if (j10 < aVar3.b) {
            this.h2 |= 4;
        }
        if (!aVar3.k() && ((sf.a) cVarArr2[this.f2.a.ordinal()].b).b > this.f2.b) {
            this.h2 |= 2;
        }
        boolean z16 = z11 || aVar2.a != this.f2.a;
        boolean z17 = z11 || aVar2.b != this.f2.b;
        boolean z18 = z11 || i11 != this.h2;
        sf.b bVar2 = sf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.W1;
        sf.b bVar3 = sf.b.b;
        if (z16) {
            t30 t30Var = this.U1;
            if (t30Var != null) {
                t30Var.a(this.f2.a == bVar2 ? 0 : 1, z12);
            }
            String t10 = org.telegram.messenger.o5.t(this.T1);
            sf.b bVar4 = this.f2.a;
            TextView textView = this.Z1;
            if (bVar4 == bVar2) {
                org.telegram.messenger.m5.q(null, null, 2131749738, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((sf.a) cVarArr2[this.f2.a.ordinal()].c).a()).length())});
            } else if (bVar4 == bVar3) {
                org.telegram.messenger.m5.q(null, null, 2131749737, new Object[]{t10}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((sf.a) cVarArr2[this.f2.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView = this.d2;
            ImageView imageView2 = this.c2;
            if (z12) {
                z15 = false;
                i10 = 1;
                imageView2.animate().alpha(this.f2.a == bVar2 ? 1.0f : 0.0f).scaleX(this.f2.a == bVar2 ? 1.0f : 0.0f).scaleY(this.f2.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.f2.a == bVar3 ? 1.0f : 0.0f).scaleX(this.f2.a == bVar3 ? 1.0f : 0.0f).scaleY(this.f2.a == bVar3 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                z15 = false;
                i10 = 1;
                imageView2.setAlpha(this.f2.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.f2.a == bVar3 ? 1.0f : 0.0f);
            }
            a aVar4 = this.Q1;
            z13 = z15;
            if (aVar4 != null) {
                sf.b bVar5 = this.f2.a;
                z13 = z15;
                if (aVar4.e != bVar5) {
                    aVar4.e = bVar5;
                    aVar4.a();
                    z13 = z15;
                }
            }
        } else {
            z13 = false;
            i10 = 1;
        }
        if (z16 || z18) {
            this.V1.setText(cd.L0(this.f2.a == bVar2 ? 2131749708 : 2131749700, null));
            sf.b bVar6 = this.f2.a;
            int i12 = this.h2;
            int i13 = i12 & 4;
            String str = this.S1;
            boolean z19 = z13;
            TextView textView2 = this.X1;
            if (i13 != 0) {
                int i14 = bVar6 == bVar2 ? 2131749706 : 2131749698;
                String d = ((sf.a) cVarArr2[bVar6.ordinal()].c).d();
                Object[] objArr = new Object[2];
                objArr[z19 ? 1 : 0] = d;
                objArr[i10] = str;
                org.telegram.messenger.m5.q(null, null, i14, objArr, textView2);
            } else if ((i12 & 2) != 0) {
                int i15 = bVar6 == bVar2 ? 2131749705 : 2131749697;
                String d10 = ((sf.a) cVarArr2[bVar6.ordinal()].b).d();
                Object[] objArr2 = new Object[2];
                objArr2[z19 ? 1 : 0] = d10;
                objArr2[i10] = str;
                org.telegram.messenger.m5.q(null, null, i15, objArr2, textView2);
            } else {
                int i16 = bVar6 == bVar2 ? 2131749707 : 2131749699;
                Object[] objArr3 = new Object[i10];
                objArr3[z19 ? 1 : 0] = str;
                org.telegram.messenger.m5.q(null, null, i16, objArr3, textView2);
            }
            org.telegram.ui.ActionBar.a7.V(textView2, (this.h2 & (-9)) == 0 ? org.telegram.ui.ActionBar.t6.y6 : org.telegram.ui.ActionBar.t6.q7, this.I0);
            z14 = z19;
        } else {
            z14 = z13;
        }
        if (z16 || z17 || z18) {
            sf.a aVar5 = this.f2;
            boolean z20 = aVar5.a == bVar3 ? true : z14;
            Object[] objArr4 = new Object[1];
            objArr4[z14] = z20 ? aVar5.b() : cd.E(aVar5.a(), ',');
            this.a2.i(h8.r1(h8.X0(z20, cd.a0(null, null, 2131749742, objArr4), z20 ? this.l2 : this.k2), z20), z12, true);
            e1(z12);
        }
        if (z16 || z17) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d11 = this.f2.a == bVar3 ? ((org.telegram.messenger.k0) vp.r1(this.a).y7.l.b).a : vp.r1(this.a).d6 * 1.0E-5d;
            org.telegram.messenger.u1 i17 = org.telegram.messenger.u1.i();
            long c10 = (long) (this.f2.c() * d11 * 100.0d);
            i17.getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", 2, c10, z14));
            this.b2.c(sb2, z12, true);
        }
        if (z10 && z17) {
            String b10 = this.f2.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void g0(float f7) {
        super.g0(f7);
        d1();
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 != this.P1 || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0)) == this.G0) {
                return;
            }
            P(w02);
            this.P1 = this.G0;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new ph.x1(this, 10), 50L);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        this.m2 = true;
        d1();
    }
}
