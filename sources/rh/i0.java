package rh;

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.rv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i0 extends org.telegram.ui.ActionBar.z2 {
    public final ec0 i1;
    public final EditTextBoldCursor j1;
    public final TextView k1;
    public final org.telegram.ui.Components.f6 l1;
    public final vh.d m1;
    public final org.telegram.ui.Components.f6 n1;
    public final org.telegram.ui.Cells.u8 o1;
    public final ImageView p1;
    public final ImageView q1;
    public final sf.a r1;
    public final sf.a s1;
    public final sf.a t1;
    public final sf.a u1;
    public sf.a v1;
    public int w1;

    public i0(Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10, sf.a aVar, e3 e3Var) {
        super(1, context, p6Var, true);
        int i11;
        this.a = i10;
        this.P0 = true;
        this.D = true;
        org.telegram.messenger.s0 s0Var = vp.r1(i10).y7;
        long max = Math.max(s0Var.r.a.c, 10000000L);
        sf.b bVar = sf.b.b;
        this.t1 = sf.a.i(max, bVar);
        this.u1 = sf.a.i(s0Var.s.a.c, bVar);
        long j10 = ((org.telegram.messenger.l0) s0Var.p.a).c;
        sf.b bVar2 = sf.b.a;
        this.r1 = sf.a.g(j10, bVar2);
        this.s1 = sf.a.g(((org.telegram.messenger.l0) s0Var.q.a).c, bVar2);
        Q(org.telegram.ui.ActionBar.t6.h5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        linearLayout.addView(f7, w7.b6.t(-1, 56, 55, 0, 0, 0, 0));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.l1 = f6Var;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i12, null);
        f6Var.setTextSize(org.telegram.messenger.i0.L(20.0f));
        f6Var.setGravity(8388627);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f7.addView(f6Var, w7.b6.q(-1, -1, 1.0f, zs.E1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, w7.b6.l(1.0f, -1, -2));
        ec0 ec0Var = new ec0(context, null);
        this.i1 = ec0Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.j1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i12, null);
        editTextBoldCursor.requestFocus();
        ec0Var.setLeftPadding(org.telegram.messenger.i0.L(28.0f));
        ec0Var.e(editTextBoldCursor);
        ec0Var.b(1.0f, aVar != null && !aVar.k() ? 1.0f : 0.0f, false);
        ec0Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new bi.g6(this, 6));
        ec0Var.addView(editTextBoldCursor, w7.b6.e(-1, -2, 48));
        linearLayout2.addView(ec0Var, w7.b6.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.p1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        ec0Var.addView(imageView, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.q1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        ec0Var.addView(imageView2, w7.b6.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.n1 = f6Var2;
        int i13 = org.telegram.ui.ActionBar.t6.y6;
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, null);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        f6Var2.setGravity(5);
        ec0Var.addView(f6Var2, w7.b6.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.k1 = textView;
        org.telegram.ui.ActionBar.a7.V(textView, i13, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, w7.b6.t(-1, -2, 55, 33, 4, 33, 0));
        org.telegram.ui.Cells.u8 u8Var = new org.telegram.ui.Cells.u8(context);
        this.o1 = u8Var;
        u8Var.c.setLayoutParams(w7.b6.d(20, 20.0f, (cd.X ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        u8Var.b(cd.L0(2131746145, null), cd.L0(2131746146, null), true, false);
        u8Var.setOnClickListener(new s(this, 2));
        linearLayout2.addView(u8Var, w7.b6.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, w7.b6.r(-1, -2, 80));
        vh.d i14 = z20.i(24, context, p6Var, true);
        this.m1 = i14;
        i14.setOnClickListener(new rv0(26, this, e3Var));
        i14.i(cd.L0(2131746168, null), false, true);
        linearLayout3.addView(i14, w7.b6.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (aVar != null) {
            i11 = 0;
            J0(sf.a.i(aVar.b, aVar.a), !aVar.k(), true, false);
        } else {
            i11 = 0;
            J0(sf.a.i(0L, bVar2), false, true, false);
        }
        this.N = linearLayout;
        editTextBoldCursor.addTextChangedListener(new h0(this, i11));
    }

    public final sf.a I0() {
        return this.v1.a == sf.b.b ? this.u1 : this.s1;
    }

    public final void J0(sf.a aVar, boolean z10, boolean z11, boolean z12) {
        long j10;
        sf.a aVar2;
        int i10;
        sf.a aVar3 = this.v1;
        int i11 = this.w1;
        this.w1 = 0;
        if (aVar != null) {
            this.v1 = aVar;
        } else {
            this.v1 = sf.a.i(0L, aVar3.a);
            this.w1 |= 1;
        }
        long j11 = I0().b;
        sf.a aVar4 = this.v1;
        if (j11 < aVar4.b) {
            this.w1 |= 4;
        }
        boolean k10 = aVar4.k();
        sf.a aVar5 = this.r1;
        sf.a aVar6 = this.t1;
        sf.b bVar = sf.b.b;
        if (k10) {
            j10 = 0;
        } else {
            sf.a aVar7 = this.v1;
            j10 = 0;
            if ((aVar7.a == bVar ? aVar6 : aVar5).b > aVar7.b) {
                this.w1 |= 2;
            }
        }
        boolean z13 = z11 || aVar3.a != this.v1.a;
        boolean z14 = z11 || aVar3.b != this.v1.b;
        boolean z15 = z11 || i11 != this.w1;
        ec0 ec0Var = this.i1;
        if (z15) {
            ec0Var.a((this.w1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        sf.b bVar2 = sf.b.a;
        long j12 = j10;
        EditTextBoldCursor editTextBoldCursor = this.j1;
        if (z13) {
            sf.b bVar3 = this.v1.a;
            org.telegram.ui.Components.f6 f6Var = this.l1;
            if (bVar3 == bVar2) {
                f6Var.c(cd.L0(2131746140, null), z12, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length())});
            } else if (bVar3 == bVar) {
                f6Var.c(cd.L0(2131746139, null), z12, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(I0().a()).length() + 3)});
            }
            this.o1.c.a(this.v1.a == bVar, z12);
            ImageView imageView = this.q1;
            ImageView imageView2 = this.p1;
            if (z12) {
                i10 = 2;
                aVar2 = aVar5;
                imageView2.animate().alpha(this.v1.a == bVar2 ? 1.0f : 0.0f).scaleX(this.v1.a == bVar2 ? 1.0f : 0.0f).scaleY(this.v1.a == bVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.v1.a == bVar ? 1.0f : 0.0f).scaleX(this.v1.a == bVar ? 1.0f : 0.0f).scaleY(this.v1.a == bVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                aVar2 = aVar5;
                i10 = 2;
                imageView2.setAlpha(this.v1.a == bVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.v1.a == bVar ? 1.0f : 0.0f);
            }
        } else {
            aVar2 = aVar5;
            i10 = 2;
        }
        if (z13 || z15) {
            int i12 = this.w1;
            if ((i12 & 4) != 0) {
                ec0Var.setText(cd.a0(null, null, 2131746142, I0().f()));
            } else if ((i12 & 2) != 0) {
                ec0Var.setText(cd.a0(null, null, 2131746141, (this.v1.a == bVar ? aVar6 : aVar2).f()));
            } else {
                ec0Var.setText(cd.L0(this.v1.a == bVar2 ? 2131746144 : 2131746143, null));
            }
        }
        if (z13 || z14 || z15) {
            boolean z16 = this.w1 == 0 && this.v1.b > j12;
            vh.d dVar = this.m1;
            if (dVar.c0 != z16) {
                dVar.setEnabled(z16);
                dVar.setClickable(z16);
                if (z12) {
                    z20.l(dVar.animate(), z16 ? 1.0f : 0.6f, 180L);
                } else {
                    dVar.setAlpha(z16 ? 1.0f : 0.6f);
                }
            }
        }
        if (z13 || z14) {
            org.telegram.messenger.s0 s0Var = vp.r1(this.a).y7;
            sf.a aVar8 = this.v1;
            sf.b bVar4 = aVar8.a;
            long j13 = aVar8.b;
            TextView textView = this.k1;
            if (bVar4 == bVar2) {
                textView.setText(org.telegram.messenger.i0.W2(cd.G((int) sf.a.i((j13 * ((org.telegram.messenger.l0) s0Var.n.a).c) / 1000, bVar4).a(), "ResellGiftInfo", new Object[0])));
            } else if (bVar4 == bVar) {
                org.telegram.messenger.m5.q(null, null, 2131746149, new Object[]{sf.a.i((j13 * ((org.telegram.messenger.l0) s0Var.o.a).c) / 1000, bVar4).b()}, textView);
            }
            StringBuilder sb2 = new StringBuilder(10);
            sb2.append('~');
            double d = this.v1.a == bVar ? ((org.telegram.messenger.k0) vp.r1(this.a).y7.l.b).a : vp.r1(this.a).d6 * 1.0E-5d;
            org.telegram.messenger.u1 i13 = org.telegram.messenger.u1.i();
            long c10 = (long) (this.v1.c() * d * 100.0d);
            i13.getClass();
            sb2.append(org.telegram.messenger.u1.g("USD", i10, c10, false));
            this.n1.c(sb2, z12, true);
        }
        if (z10 && z14) {
            String b10 = this.v1.b();
            editTextBoldCursor.setText(b10);
            editTextBoldCursor.setSelection(b10.length());
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        super.show();
        org.telegram.messenger.i0.h3(new ph.x1(this, 12), 50L);
    }
}
