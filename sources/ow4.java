// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ow4 extends nx0 {
    public static final int[] G1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public oj A1;
    public int B1;
    public int C1;
    public final jra D1;
    public final wm2[] E1;
    public final wm2[] F1;
    public final ie0 l1;
    public final TL_stars.TL_starGiftUnique m1;
    public final String n1;
    public final long o1;
    public final zh5 p1;
    public final TextView q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final TextView t1;
    public final TextView u1;
    public final c51 v1;
    public final in w1;
    public final ImageView x1;
    public final ImageView y1;
    public final zm9 z1;

    public ow4(final int i, final long j, jra jraVar, final vnb vnbVar, final Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, vnbVar, context, true);
        long j2;
        boolean z;
        byte b;
        TLRPC.User X1;
        zm9 zm9Var = new zm9((byte) 4);
        lh2[] lh2VarArr = (lh2[]) zm9Var.b;
        this.z1 = zm9Var;
        this.E1 = new wm2[1];
        this.F1 = new wm2[1];
        this.a = i;
        this.o1 = j;
        this.m1 = tL_starGiftUnique;
        StringBuilder sb = new StringBuilder();
        sb.append(tL_starGiftUnique.title);
        sb.append(" #");
        this.n1 = qu6.m(tL_starGiftUnique.num, ',', sb);
        this.D1 = jraVar;
        this.E = true;
        this.Q0 = true;
        int i2 = aob.a7;
        t0(i2);
        L(i2);
        this.b0 = i2;
        jxa v = jxa.v(i, true);
        if (v.b) {
            a.t();
            if (f11.a()) {
                j2 = 0;
            } else {
                a.q();
                TL_stars.StarsAmount m = v.m();
                j2 = 0;
                if (m.nanos == 0 && m.amount == 0) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
            j2 = 0;
        }
        if (j > j2 && uc7.s1(i).Y1(j) == null && (X1 = uc7.s1(i).X1(Long.valueOf(j))) != null) {
            uc7.s1(i).f3(X1, 0, false, null);
        }
        hr hrVar = uc7.s1(i).k4;
        long j3 = tL_starGiftUnique.offer_min_stars;
        pj pjVar = pj.a;
        oj h = oj.h(j3, pjVar);
        boolean z2 = z;
        oj h2 = oj.h(Math.max(h.a() << 1, hrVar.p.f()), pjVar);
        pj pjVar2 = pj.b;
        oj j4 = oj.j(Math.max(h.e(pjVar2).o(2).b, hrVar.q.f()), pjVar2);
        oj j5 = oj.j(Math.max(j4.b << 1, hrVar.r.f()), pjVar2);
        pj pjVar3 = h.a;
        if (pjVar3 != h2.a) {
            b = 4;
        } else {
            b = 4;
            lh2VarArr[pjVar3.ordinal()] = new lh2(h, h2, b);
        }
        pj pjVar4 = j4.a;
        if (pjVar4 == j5.a) {
            lh2VarArr[pjVar4.ordinal()] = new lh2(j4, j5, b);
        }
        LinearLayout j6 = uh9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131749631, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(8388627);
        int i3 = aob.G6;
        yob.X(textView, i3, vnbVar);
        j6.addView(textView, tre.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r1 = editTextBoldCursor;
        if (z2) {
            zh5 zh5Var = new zh5(context, vnbVar);
            this.p1 = zh5Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(ob6.M0(2131744030, null));
            arrayList.add(ob6.M0(2131744029, null));
            zh5Var.b(arrayList, new ze1(this, (byte) 2));
            j6.addView(zh5Var, tre.k(16.0f, 0.0f, 16.0f, 14.0f, -1, -2));
        } else {
            this.p1 = null;
        }
        LinearLayout E0 = ot7.E0(context, vnbVar);
        j6.addView(E0, tre.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        this.q1 = textView2;
        bs2.t(textView2, 1, 15.0f);
        yob.X(textView2, aob.L6, vnbVar);
        E0.addView(textView2, tre.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        E0.addView(frameLayout, tre.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        this.x1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        frameLayout.addView(imageView, tre.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.y1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        frameLayout.addView(imageView2, tre.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        editTextBoldCursor.setCursorSize(hl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        int i4 = aob.o6;
        editTextBoldCursor.setCursorColor(aob.v0(i4, vnbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(aob.v0(aob.H6, vnbVar));
        yob.X(editTextBoldCursor, i3, vnbVar);
        frameLayout.addView(editTextBoldCursor, tre.d(-1, -1.0f, jn7.D1, 50.0f, 0.0f, 120.0f, 0.0f));
        in inVar = new in(context, false, false, false);
        this.w1 = inVar;
        int i5 = aob.y6;
        yob.U(inVar, i5, vnbVar);
        inVar.setTextSize(hl.L(17.0f));
        inVar.setGravity(5);
        frameLayout.addView(inVar, tre.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.s1 = textView3;
        textView3.setTextSize(1, 14.0f);
        j6.addView(textView3, tre.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout E02 = ot7.E0(context, vnbVar);
        E02.setOrientation(0);
        E02.setGravity(16);
        j6.addView(E02, tre.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        qd4.u(16.0f, 2131749675, 1, textView4, null);
        yob.X(textView4, i3, vnbVar);
        TextView m2 = ik8.m(E02, textView4, tre.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.t1 = m2;
        m2.setTextSize(1, 16.0f);
        m2.setGravity(16);
        m2.setCompoundDrawablePadding(hl.L(4.0f));
        yob.X(m2, i4, vnbVar);
        E02.addView(m2, tre.t(-2, -1, 16, 0, 0, 14, 0));
        E02.setOnClickListener(new mh3(this, (byte) 24));
        TextView textView5 = new TextView(context);
        this.u1 = textView5;
        textView5.setTextSize(1, 14.0f);
        yob.X(textView5, i5, vnbVar);
        j6.addView(textView5, tre.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        c51 i6 = xnb.i(24, vnbVar, context, true);
        this.v1 = i6;
        i6.setOnClickListener(new View.OnClickListener() { // from class: kw4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7;
                ow4 ow4Var;
                int i8;
                ow4 ow4Var2 = ow4.this;
                if (ow4Var2.v1.e0) {
                    int i9 = i;
                    if (uc7.s1(i9).x2()) {
                        i5.b(i9);
                        return;
                    }
                    jxa u = jxa.u(i9, ow4Var2.A1.a);
                    oj m3 = u.e ? oj.m(u.m()) : null;
                    pj pjVar5 = pj.a;
                    pj pjVar6 = pj.b;
                    if (m3 != null) {
                        long j7 = m3.b;
                        oj ojVar = ow4Var2.A1;
                        if (j7 >= ojVar.b) {
                            String str = ow4Var2.n1;
                            long j8 = ow4Var2.o1;
                            String d = ojVar.d();
                            final boolean z3 = ow4Var2.A1.a == pjVar6;
                            LinearLayout linearLayout = new LinearLayout(ow4Var2.getContext());
                            linearLayout.setOrientation(1);
                            TextView textView6 = new TextView(ow4Var2.getContext());
                            textView6.setText(ob6.M0(2131749677, null));
                            int i10 = aob.j5;
                            qd4.w(textView6, i10, ow4Var2.J0, 1, 20.0f);
                            linearLayout.addView(textView6, tre.t(-1, -2, 48, 24, 4, 24, 14));
                            TextView textView7 = new TextView(ow4Var2.getContext());
                            yob.X(textView7, i10, ow4Var2.J0);
                            textView7.setTextSize(1, 16.0f);
                            textView7.setText(hl.S2(ow4Var2.A1.a == pjVar5 ? ob6.a0(null, null, 2131749628, d, wf3.s(j8), str) : ob6.a0(null, null, 2131749627, d, wf3.s(j8), str)));
                            linearLayout.addView(textView7, tre.t(-1, -2, 48, 24, 4, 24, 4));
                            hjb hjbVar = new hjb(ow4Var2.getContext(), ow4Var2.J0);
                            final long M1 = uc7.s1(ow4Var2.a).M1(j8);
                            final oj h3 = oj.h(M1, pjVar5);
                            hjbVar.f(ob6.M0(2131749649, null), nza.b1(z3, ob6.a0(null, null, 2131749685, d), 0.8f, null), null, null);
                            if (M1 > 0) {
                                i7 = 0;
                                hjbVar.f(ob6.M0(2131749650, null), nza.b1(false, ob6.a0(null, null, 2131749685, h3.d()), 0.8f, null), null, null);
                            } else {
                                i7 = 0;
                            }
                            hjbVar.f(ob6.M0(2131749651, null), ob6.G(ow4Var2.B1 / 3600, "GiftOfferHours", new Object[i7]), null, null);
                            linearLayout.addView(hjbVar, tre.t(-1, -2, 48, 23, 16, 23, 4));
                            r7a.B(ow4Var2.a);
                            final long D = r7a.D();
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            if (M1 == 0) {
                                spannableStringBuilder.append((CharSequence) nza.V0(ob6.a0(null, null, 2131749657, d), z3));
                                ow4Var = ow4Var2;
                                i8 = 0;
                            } else if (z3) {
                                spannableStringBuilder.append(ob6.V(null, null, 2131749656, nza.V0(ob6.a0(null, null, 2131749655, d), true), nza.T0(ob6.a0(null, null, 2131749655, h3.d()))));
                                ow4Var = ow4Var2;
                                i8 = 0;
                            } else {
                                ow4Var = ow4Var2;
                                String d2 = oj.j(ow4Var2.A1.b + h3.b, pjVar5).d();
                                i8 = 0;
                                spannableStringBuilder.append((CharSequence) nza.T0(ob6.a0(null, null, 2131749657, d2)));
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i8, ow4Var.J0, ow4Var.getContext());
                            alertDialog$Builder.n(linearLayout);
                            final ow4 ow4Var3 = ow4Var;
                            alertDialog$Builder.j(spannableStringBuilder, new fd() { // from class: mw4
                                @Override // fd
                                public final void w(id idVar, int i11) {
                                    long j9 = M1;
                                    ow4 ow4Var4 = ow4.this;
                                    if (j9 > 0) {
                                        int i12 = ow4Var4.a;
                                        pj pjVar7 = pj.a;
                                        jxa u2 = jxa.u(i12, pjVar7);
                                        oj m4 = u2.e ? oj.m(u2.m()) : null;
                                        oj h4 = z3 ? oj.h(j9, pjVar7) : oj.j(ow4Var4.A1.b + h3.b, pjVar7);
                                        if (m4 == null || m4.b < h4.b) {
                                            new dza(ow4Var4.getContext(), ow4Var4.J0, h4.a(), 14, null, null, ow4Var4.o1).show();
                                            return;
                                        }
                                    }
                                    l01 g = idVar.g(-1, true, true);
                                    g.d();
                                    TL_payments.TL_sendStarGiftOffer tL_sendStarGiftOffer = new TL_payments.TL_sendStarGiftOffer();
                                    tL_sendStarGiftOffer.price = ow4Var4.A1.q();
                                    tL_sendStarGiftOffer.peer = uc7.s1(ow4Var4.a).j1(ow4Var4.o1);
                                    tL_sendStarGiftOffer.duration = ow4Var4.B1;
                                    tL_sendStarGiftOffer.slug = ow4Var4.m1.slug;
                                    tL_sendStarGiftOffer.random_id = D;
                                    if (j9 > 0) {
                                        tL_sendStarGiftOffer.flags |= 1;
                                        tL_sendStarGiftOffer.allow_paid_stars = j9;
                                    }
                                    ConnectionsManager.getInstance(ow4Var4.a).sendRequestTyped(tL_sendStarGiftOffer, new p((Object) ow4Var4, (Object) g, (Object) idVar, (byte) 11));
                                }
                            });
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            id idVar = alertDialog$Builder.a;
                            idVar.Y0 = true;
                            idVar.show();
                            return;
                        }
                    }
                    oj ojVar2 = ow4Var2.A1;
                    pj pjVar7 = ojVar2.a;
                    Context context2 = context;
                    vnb vnbVar2 = vnbVar;
                    if (pjVar7 == pjVar5) {
                        new dza(context2, vnbVar2, ojVar2.a(), 14, null, null, j).show();
                    } else if (pjVar7 == pjVar6) {
                        new shb(context2, vnbVar2, ojVar2, null).show();
                    }
                }
            }
        });
        j6.addView(i6, tre.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j6;
        ie0 ie0Var = new ie0(i, vnbVar, context);
        this.l1 = ie0Var;
        iye.a(ie0Var);
        ie0Var.setOnClickListener(new lw4(this, context, vnbVar, (byte) 0));
        this.c.addView(ie0Var, tre.d(-2, -2.0f, 49, 0.0f, (hl.m / hl.p) + 8.0f, 0.0f, 0.0f));
        F0(oj.j(0L, pjVar), false, true, false);
        G0(86400, false);
        editTextBoldCursor.addTextChangedListener(new nw4(this));
    }

    public final void E0(boolean z) {
        boolean z2 = this.C1 == 0 && this.A1.b > 0;
        c51 c51Var = this.v1;
        if (c51Var.e0 != z2) {
            c51Var.setEnabled(z2);
            c51Var.setClickable(z2);
            if (z) {
                ik8.s(c51Var.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                c51Var.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void F0(oj ojVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        oj ojVar2 = ojVar;
        pj pjVar = pj.a;
        pj pjVar2 = pj.b;
        oj ojVar3 = this.A1;
        int i = this.C1;
        this.C1 = 0;
        if (ojVar2 != null) {
            this.A1 = ojVar2;
        } else {
            ojVar2 = oj.j(0L, ojVar3.a);
            this.A1 = ojVar2;
            this.C1 |= 1;
        }
        long j = ((oj) ((lh2[]) this.z1.b)[ojVar2.a.ordinal()].c).b;
        oj ojVar4 = this.A1;
        if (j < ojVar4.b) {
            this.C1 |= 4;
        }
        if (!ojVar4.l() && ((oj) ((lh2[]) this.z1.b)[this.A1.a.ordinal()].b).b > this.A1.b) {
            this.C1 |= 2;
        }
        boolean z5 = z2 || ojVar3.a != this.A1.a;
        boolean z6 = z2 || ojVar3.b != this.A1.b;
        boolean z7 = z2 || i != this.C1;
        if (z5) {
            ImageView imageView = this.y1;
            zm9 zm9Var = this.z1;
            TextView textView = this.u1;
            EditTextBoldCursor editTextBoldCursor = this.r1;
            zh5 zh5Var = this.p1;
            boolean z8 = false;
            if (zh5Var != null) {
                zh5Var.a(this.A1.a == pjVar ? 0 : 1, z3);
            }
            String s = wf3.s(this.o1);
            pj pjVar3 = this.A1.a;
            if (pjVar3 == pjVar) {
                uh9.r(null, null, 2131749674, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((oj) ((lh2[]) zm9Var.b)[this.A1.a.ordinal()].c).a()).length())});
            } else if (pjVar3 == pjVar2) {
                uh9.r(null, null, 2131749673, new Object[]{s}, textView);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(((oj) ((lh2[]) zm9Var.b)[this.A1.a.ordinal()].c).a()).length() + 3)});
            }
            ImageView imageView2 = this.x1;
            if (z3) {
                imageView2.animate().alpha(this.A1.a == pjVar ? 1.0f : 0.0f).scaleX(this.A1.a == pjVar ? 1.0f : 0.0f).scaleY(this.A1.a == pjVar ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.A1.a == pjVar2 ? 1.0f : 0.0f).scaleX(this.A1.a == pjVar2 ? 1.0f : 0.0f).scaleY(this.A1.a == pjVar2 ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.A1.a == pjVar ? 1.0f : 0.0f);
                imageView.setAlpha(this.A1.a == pjVar2 ? 1.0f : 0.0f);
            }
            ie0 ie0Var = this.l1;
            z4 = z8;
            if (ie0Var != null) {
                pj pjVar4 = this.A1.a;
                z4 = z8;
                if (ie0Var.e != pjVar4) {
                    ie0Var.e = pjVar4;
                    ie0Var.b();
                    z4 = z8;
                }
            }
        } else {
            z4 = 0;
        }
        if (z5 || z7) {
            this.q1.setText(ob6.M0(this.A1.a == pjVar ? 2131749644 : 2131749636, null));
            zm9 zm9Var2 = this.z1;
            String str = this.n1;
            TextView textView2 = this.s1;
            pj pjVar5 = this.A1.a;
            int i2 = this.C1;
            if ((i2 & 4) != 0) {
                int i3 = pjVar5 == pjVar ? 2131749642 : 2131749634;
                String d = ((oj) ((lh2[]) zm9Var2.b)[pjVar5.ordinal()].c).o(2).d();
                Object[] objArr = new Object[2];
                objArr[z4] = d;
                objArr[1] = str;
                uh9.r(null, null, i3, objArr, textView2);
            } else if ((i2 & 2) != 0) {
                int i4 = pjVar5 == pjVar ? 2131749641 : 2131749633;
                String d2 = ((oj) ((lh2[]) zm9Var2.b)[pjVar5.ordinal()].b).p().d();
                Object[] objArr2 = new Object[2];
                objArr2[z4] = d2;
                objArr2[1] = str;
                uh9.r(null, null, i4, objArr2, textView2);
            } else {
                int i5 = pjVar5 == pjVar ? 2131749643 : 2131749635;
                Object[] objArr3 = new Object[1];
                objArr3[z4] = str;
                uh9.r(null, null, i5, objArr3, textView2);
            }
            boolean z9 = (this.C1 & (-9)) != 0 ? true : z4;
            yob.X(textView2, z9 ? aob.q7 : aob.y6, this.J0);
            yob.X(this.r1, z9 ? aob.q7 : aob.G6, this.J0);
        }
        if (z5 || z6 || z7) {
            oj ojVar5 = this.A1;
            boolean z10 = ojVar5.a == pjVar2 ? true : z4;
            c51 c51Var = this.v1;
            Object[] objArr4 = new Object[1];
            objArr4[z4] = z10 ? ojVar5.b() : ob6.E(ojVar5.a(), ',');
            c51Var.i(nza.t1(nza.Z0(z10, ob6.a0(null, null, 2131749678, objArr4), z10 ? this.F1 : this.E1), z10), z3, true);
            E0(z3);
        }
        if (z5 || z6) {
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            pj pjVar6 = this.A1.a;
            int i6 = this.a;
            double d3 = pjVar6 == pjVar2 ? uc7.s1(i6).k4.k.i : uc7.s1(i6).k4.A3.i * 1.0E-5d;
            di0.h();
            sb.append(di0.f("USD", 2, (long) (this.A1.c() * d3 * 100.0d), z4));
            this.w1.c(sb, z3, true);
        }
        if (z && z6) {
            String b = this.A1.b();
            this.r1.setText(b);
            this.r1.setSelection(b.length());
        }
    }

    public final void G0(int i, boolean z) {
        if (this.B1 != i) {
            this.B1 = i;
            String G = ob6.G(i / 3600, "GiftOfferHours", new Object[0]);
            TextView textView = this.t1;
            textView.setText(G);
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrows_select).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.o6, this.J0), PorterDuff.Mode.SRC_IN));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
        }
        E0(z);
    }

    @Override // nx0, android.app.Dialog
    public final void show() {
        super.show();
        hl.d3(new rj4(this, (byte) 14), 50L);
    }
}
