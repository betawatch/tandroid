package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.oj;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.oe0;
import org.telegram.ui.un;
import org.telegram.ui.zd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e0 extends org.telegram.ui.ActionBar.z2 {
    public int A1;
    public boolean B1;
    public final dq[] C1;
    public final dq[] D1;
    public boolean E1;
    public final a i1;
    public final boolean j1;
    public final int k1;
    public final t30 l1;
    public final ec0 m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final zd p1;
    public final vh.d q1;
    public final org.telegram.ui.Components.f6 r1;
    public final ImageView s1;
    public final ImageView t1;
    public final sf.a u1;
    public final sf.a v1;
    public final sf.a w1;
    public final sf.a x1;
    public sf.a y1;
    public long z1;

    public e0(final Context context, int i10, long j10, oj ojVar, un unVar, final org.telegram.ui.ActionBar.p6 p6Var, int i11, q20 q20Var) {
        super(1, context, p6Var, true);
        boolean z10;
        this.z1 = -1L;
        this.C1 = new dq[1];
        this.D1 = new dq[1];
        this.k1 = i11;
        this.D = true;
        this.P0 = true;
        boolean z11 = org.telegram.messenger.w3.z(i10, 24, j10);
        this.j1 = z11;
        final int i12 = 0;
        boolean z12 = z11 || e6.y(i10, true).j();
        org.telegram.messenger.s0 s0Var = vp.r1(i10).y7;
        long j11 = s0Var.g.a.c;
        sf.b bVar = sf.b.b;
        this.w1 = sf.a.i(j11, bVar);
        this.x1 = sf.a.i(s0Var.h.a.c, bVar);
        long j12 = ((org.telegram.messenger.l0) s0Var.d.a).c;
        sf.b bVar2 = sf.b.a;
        this.u1 = sf.a.g(j12, bVar2);
        this.v1 = sf.a.g(((org.telegram.messenger.l0) s0Var.e.a).c, bVar2);
        if (z11) {
            this.i1 = null;
        } else {
            a aVar = new a(i10, context, p6Var);
            this.i1 = aVar;
            aVar.setScaleX(0.6f);
            aVar.setScaleY(0.6f);
            aVar.setAlpha(0.0f);
            aVar.setEnabled(false);
            aVar.setClickable(false);
            this.c.addView(aVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            w7.e6.a(aVar);
            aVar.setOnClickListener(new View.OnClickListener(this) { // from class: rh.c0
                public final /* synthetic */ e0 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            if (this.b.y1.a == sf.b.a) {
                                new y7(context, p6Var).show();
                                break;
                            }
                            break;
                        default:
                            e0 e0Var = this.b;
                            ((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.S(context, e0Var.z1, new d0(e0Var, 0), p6Var, 0).b).show();
                            break;
                    }
                }
            });
        }
        Q(org.telegram.ui.ActionBar.t6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        linearLayout.addView(f7, w7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i13, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(cd.L0(i11 == 0 ? 2131747092 : 2131747099, null));
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f7.addView(textView, w7.b6.q(-1, -1, 1.0f, zs.E1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i14 = org.telegram.ui.ActionBar.t6.W5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i14, p6Var, mode);
        w7.e6.a(imageView);
        boolean z13 = z12;
        imageView.setOnClickListener(new s(this, 1));
        f7.addView(imageView, w7.b6.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        if (z13) {
            t30 t30Var = new t30(context, p6Var);
            this.l1 = t30Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cd.L0(2131744403, null));
            arrayList.add(cd.L0(2131744402, null));
            t30Var.b(arrayList, new x(this, 1));
            linearLayout.addView(t30Var, w7.b6.k(18.0f, 0.0f, 18.0f, 12.0f, -1, -2));
        } else {
            this.l1 = null;
        }
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 1);
        linearLayout.addView(f10, w7.b6.l(1.0f, -1, -2));
        ec0 ec0Var = new ec0(context, null);
        this.m1 = ec0Var;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i13, null);
        editTextBoldCursor.requestFocus();
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(28.0f));
        ec0Var.e(editTextBoldCursor);
        sf.a aVar2 = ojVar.a;
        ec0Var.b(1.0f, aVar2 != null && !aVar2.k() ? 1.0f : 0.0f, false);
        ec0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bi.g6(this, 5));
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        f10.addView(ec0Var, w7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        this.s1 = imageView2;
        imageView2.setImageResource(R.drawable.star_small_inner);
        ec0Var.addView(imageView2, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.t1 = imageView3;
        imageView3.setImageResource(R.drawable.mini_gram_72);
        ec0Var.addView(imageView3, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.r1 = f6Var;
        int i15 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i15, null);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var.setGravity(5);
        ec0Var.addView(f6Var, w7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.o1 = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i15, null);
        textView2.setTextSize(1, 13.0f);
        f10.addView(textView2, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        zd zdVar = new zd(context, 5);
        this.p1 = zdVar;
        zdVar.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        zdVar.setCursorWidth(1.5f);
        zdVar.setTextSize(1, 17.0f);
        zdVar.setMaxLines(1);
        zdVar.setBackground(null);
        zdVar.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(zdVar, i13, null);
        zdVar.setFocusable(false);
        zdVar.setClickable(false);
        zdVar.setEnabled(false);
        ec0 ec0Var2 = new ec0(context, null);
        ec0Var2.setText(cd.L0(2131747089, null));
        ec0Var2.e(zdVar);
        ec0Var2.addView(zdVar, w7.b6.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        w7.e6.b(ec0Var2, 0.02f, 1.2f);
        final int i16 = 1;
        ec0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: rh.c0
            public final /* synthetic */ e0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        if (this.b.y1.a == sf.b.a) {
                            new y7(context, p6Var).show();
                            break;
                        }
                        break;
                    default:
                        e0 e0Var = this.b;
                        ((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.S(context, e0Var.z1, new d0(e0Var, 0), p6Var, 0).b).show();
                        break;
                }
            }
        });
        f10.addView(ec0Var2, w7.b6.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView4 = new ImageView(context);
        imageView4.setImageResource(R.drawable.arrow_more);
        org.telegram.ui.ActionBar.a7.t(imageView4, i14, p6Var, mode);
        ec0Var2.addView(imageView4, w7.b6.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView3, i15, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.L0(2131747109, null)));
        spannableStringBuilder.append(' ');
        org.telegram.messenger.m5.p(null, null, 2131747108, new Object[]{Long.valueOf(vp.r1(i10).y7.i.a(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        f10.addView(textView3, w7.b6.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.b6.r(-1, -2, 80));
        vh.d dVar = new vh.d(context, p6Var, true);
        this.q1 = dVar;
        dVar.setOnClickListener(new oe0(this, unVar, i10, context, p6Var, j10, q20Var));
        if (i11 == 1) {
            dVar.i(cd.L0(2131747098, null), false, true);
        }
        linearLayout2.addView(dVar, w7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar2 != null) {
            z10 = false;
            M0(sf.a.i(aVar2.b, aVar2.a), !aVar2.k(), true, false);
        } else {
            z10 = false;
            M0(sf.a.i(0L, bVar2), false, true, false);
        }
        long j13 = ojVar.b;
        if (this.z1 != j13) {
            this.z1 = j13;
            zdVar.setText(K0(j13));
        }
        J0(z10);
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new ag.a1(this, 29));
    }

    public static String K0(long j10) {
        if (j10 <= 0) {
            return cd.L0(2131747107, null);
        }
        String x10 = cd.x(j10, true);
        if (x10.isEmpty()) {
            return x10;
        }
        return Character.toUpperCase(x10.charAt(0)) + x10.substring(1);
    }

    public final void I0() {
        boolean z10 = this.E1;
        a aVar = this.i1;
        boolean z11 = (z10 && !this.I && aVar != null && this.b.getY() > ((float) org.telegram.messenger.i0.L(32.0f))) || this.l1 == null;
        if (this.B1 != z11) {
            this.B1 = z11;
            if (aVar != null) {
                aVar.setEnabled(z11);
                aVar.setClickable(z11);
                z20.l(aVar.animate().scaleX(z11 ? 1.0f : 0.6f).scaleY(z11 ? 1.0f : 0.6f), z11 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void J0(boolean z10) {
        boolean z11 = this.A1 == 0 && (this.y1.b >= 0 || this.z1 > 0);
        vh.d dVar = this.q1;
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

    public final sf.a L0() {
        return this.y1.a == sf.b.b ? this.x1 : this.v1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void M0(sf.a aVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i10;
        sf.a aVar2 = this.y1;
        int i11 = this.A1;
        this.A1 = 0;
        if (aVar != null) {
            this.y1 = aVar;
        } else {
            this.y1 = sf.a.i(0L, aVar2.a);
            this.A1 |= 1;
        }
        long j10 = L0().b;
        sf.a aVar3 = this.y1;
        if (j10 < aVar3.b) {
            this.A1 |= 4;
        }
        boolean k10 = aVar3.k();
        sf.a aVar4 = this.u1;
        sf.a aVar5 = this.w1;
        sf.b bVar = sf.b.b;
        if (!k10) {
            sf.a aVar6 = this.y1;
            if ((aVar6.a == bVar ? aVar5 : aVar4).b > aVar6.b) {
                this.A1 |= 2;
            }
        }
        boolean z14 = z11 || aVar2.a != this.y1.a;
        boolean z15 = z11 || aVar2.b != this.y1.b;
        boolean z16 = z11 || i11 != this.A1;
        ec0 ec0Var = this.m1;
        if (z16) {
            ec0Var.a((this.A1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        sf.b bVar2 = sf.b.a;
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (z14) {
            t30 t30Var = this.l1;
            boolean z17 = false;
            if (t30Var != null) {
                t30Var.a(this.y1.a == bVar2 ? 0 : 1, z12);
            }
            sf.b bVar3 = this.y1.a;
            TextView textView = this.o1;
            if (bVar3 == bVar2) {
                textView.setText(cd.L0(2131747095, null));
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length())});
            } else if (bVar3 == bVar) {
                textView.setText(cd.L0(2131747094, null));
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(L0().a()).length() + 3)});
            }
            ImageView imageView = this.t1;
            ImageView imageView2 = this.s1;
            if (z12) {
                i10 = 2;
                imageView2.animate().alpha(this.y1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.y1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.y1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.y1.a == bVar ? 1.0f : 0.0f).scaleX(this.y1.a == bVar ? 1.0f : 0.0f).scaleY(this.y1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                i10 = 2;
                imageView2.setAlpha(this.y1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.y1.a == bVar ? 1.0f : 0.0f);
            }
            a aVar7 = this.i1;
            z13 = z17;
            if (aVar7 != null) {
                sf.b bVar4 = this.y1.a;
                z13 = z17;
                if (aVar7.e != bVar4) {
                    aVar7.e = bVar4;
                    aVar7.a();
                    z13 = z17;
                }
            }
        } else {
            z13 = 0;
            i10 = 2;
        }
        if (z14 || z16) {
            int i12 = this.A1;
            if ((i12 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[z13] = L0().f();
                ec0Var.setText(cd.a0(null, null, 2131744444, objArr));
            } else if ((i12 & 2) != 0) {
                if (this.y1.a == bVar) {
                    aVar4 = aVar5;
                }
                String f7 = aVar4.f();
                Object[] objArr2 = new Object[1];
                objArr2[z13] = f7;
                ec0Var.setText(cd.a0(null, null, 2131744443, objArr2));
            } else {
                ec0Var.setText(cd.L0(this.y1.a == bVar2 ? 2131747091 : 2131747090, null));
            }
        }
        if (z14 || z15 || z16) {
            int i13 = this.k1;
            vh.d dVar = this.q1;
            if (i13 != 0) {
                dVar.i(cd.L0(2131747098, null), z12, true);
            } else if (this.y1.k()) {
                dVar.i(cd.L0(2131747097, null), z12, true);
            } else {
                sf.a aVar8 = this.y1;
                boolean z18 = aVar8.a == bVar ? true : z13;
                Object[] objArr3 = new Object[1];
                objArr3[z13] = z18 ? aVar8.b() : cd.E(aVar8.a(), ',');
                dVar.i(h8.r1(h8.X0(z18, cd.a0(null, null, 2131747096, objArr3), z18 ? this.D1 : this.C1), z18), z12, true);
            }
            J0(z12);
        }
        if (z14 || z15) {
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.y1.a == bVar ? ((org.telegram.messenger.k0) vp.r1(this.a).y7.l.b).a : vp.r1(this.a).d6 * 1.0E-5d;
            org.telegram.messenger.u1 i14 = org.telegram.messenger.u1.i();
            long c10 = (long) (this.y1.c() * d * 100.0d);
            i14.getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", i10, c10, z13));
            this.r1.c(sb2, z12, true);
        }
        if (z10 && z15) {
            String b10 = this.y1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean Y(float f7, float f10) {
        a aVar;
        if (!this.B1 || (aVar = this.i1) == null || f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.Y(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void g0(float f7) {
        super.g0(f7);
        I0();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new ph.x1(this, 11), 50L);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        this.E1 = true;
        I0();
    }
}
