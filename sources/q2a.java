// default package

import android.content.Context;
import android.text.InputFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q2a extends my0 {
    public final gt7 l1;
    public final EditTextBoldCursor m1;
    public final TextView n1;
    public final io o1;
    public final b61 p1;
    public final io q1;
    public final cjb r1;
    public final ImageView s1;
    public final ImageView t1;
    public final nk u1;
    public final nk v1;
    public final nk w1;
    public final nk x1;
    public nk y1;
    public int z1;

    public q2a(Context context, ylb ylbVar, int i, nk nkVar, ts9 ts9Var) {
        super(1, ylbVar, context, true);
        this.a = i;
        this.Q0 = true;
        this.E = true;
        gs gsVar = oc7.r1(i).l4;
        long max = Math.max(gsVar.q.f(), 10000000L);
        ok okVar = ok.b;
        this.w1 = nk.j(max, okVar);
        this.x1 = nk.j(gsVar.r.f(), okVar);
        long f = gsVar.o.f();
        ok okVar2 = ok.a;
        this.u1 = nk.h(f, okVar2);
        this.v1 = nk.h(gsVar.p.f(), okVar2);
        L(cmb.g5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout i2 = hg9.i(context, 0);
        linearLayout.addView(i2, qoe.t(-1, 56, 55, 0, 0, 0, 0));
        io ioVar = new io(context, false, false, false);
        this.o1 = ioVar;
        int i3 = cmb.F6;
        anb.U(ioVar, i3, null);
        ioVar.setTextSize(gm.L(20.0f));
        ioVar.setGravity(8388627);
        ioVar.setTypeface(gm.o());
        i2.addView(ioVar, qoe.q(-1, -1, 1.0f, nm7.D1, 22, 0, 22, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, qoe.l(1.0f, -1, -2));
        gt7 gt7Var = new gt7(context, null);
        this.l1 = gt7Var;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.m1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gm.L(42.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        anb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.requestFocus();
        gt7Var.setLeftPadding(gm.L(28.0f));
        gt7Var.e(editTextBoldCursor);
        gt7Var.b(1.0f, nkVar != null && !nkVar.l() ? 1.0f : 0.0f, false);
        gt7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new tt0(this, (byte) 17));
        gt7Var.addView(editTextBoldCursor, qoe.e(-1, -2, 48));
        linearLayout2.addView(gt7Var, qoe.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView = new ImageView(context);
        this.s1 = imageView;
        imageView.setImageResource(R.drawable.star_small_inner);
        gt7Var.addView(imageView, qoe.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.t1 = imageView2;
        imageView2.setImageResource(R.drawable.mini_gram_72);
        gt7Var.addView(imageView2, qoe.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        io ioVar2 = new io(context, false, false, false);
        this.q1 = ioVar2;
        int i4 = cmb.x6;
        anb.U(ioVar2, i4, null);
        ioVar2.setTextSize(gm.L(13.0f));
        ioVar2.setGravity(5);
        gt7Var.addView(ioVar2, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView = new TextView(context);
        this.n1 = textView;
        anb.X(textView, i4, null);
        textView.setTextSize(1, 13.0f);
        linearLayout2.addView(textView, qoe.t(-1, -2, 55, 33, 4, 33, 0));
        cjb cjbVar = new cjb(context);
        this.r1 = cjbVar;
        cjbVar.c.setLayoutParams(qoe.d(20, 20.0f, (jb6.a0 ? 5 : 3) | 48, 22.0f, 22.0f, 22.0f, 0.0f));
        cjbVar.b(jb6.M0(2131745861, null), jb6.M0(2131745862, null), true, false);
        cjbVar.setOnClickListener(new wk8(this, (byte) 25));
        linearLayout2.addView(cjbVar, qoe.t(-1, -2, 55, 0, 16, 0, 16));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout.addView(linearLayout3, qoe.r(-1, -2, 80));
        b61 i5 = mlb.i(24, ylbVar, context, true);
        this.p1 = i5;
        i5.setOnClickListener(new r39(this, ts9Var, (byte) 8));
        i5.i(jb6.M0(2131745884, null), false, true);
        linearLayout3.addView(i5, qoe.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        if (nkVar != null) {
            E0(nk.j(nkVar.b, nkVar.a), !nkVar.l(), true, false);
        } else {
            E0(nk.j(0L, okVar2), false, true, false);
        }
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new og6(this, (byte) 13));
    }

    public final nk D0() {
        return this.y1.a == ok.b ? this.x1 : this.v1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E0(nk nkVar, boolean z, boolean z2, boolean z3) {
        int i;
        ok okVar = ok.b;
        ok okVar2 = ok.a;
        nk nkVar2 = this.y1;
        int i2 = this.z1;
        this.z1 = 0;
        if (nkVar != null) {
            this.y1 = nkVar;
        } else {
            this.y1 = nk.j(0L, nkVar2.a);
            this.z1 |= 1;
        }
        long j = D0().b;
        nk nkVar3 = this.y1;
        if (j < nkVar3.b) {
            this.z1 |= 4;
        }
        if (!nkVar3.l()) {
            nk nkVar4 = this.y1;
            if ((nkVar4.a == okVar ? this.w1 : this.u1).b > nkVar4.b) {
                this.z1 |= 2;
            }
        }
        boolean z4 = z2 || nkVar2.a != this.y1.a;
        boolean z5 = z2 || nkVar2.b != this.y1.b;
        boolean z6 = z2 || i2 != this.z1;
        if (z6) {
            this.l1.a((this.z1 & (-9)) == 0 ? 0.0f : 1.0f);
        }
        if (z4) {
            ImageView imageView = this.t1;
            io ioVar = this.o1;
            EditTextBoldCursor editTextBoldCursor = this.m1;
            i = 0;
            ok okVar3 = this.y1.a;
            if (okVar3 == okVar2) {
                ioVar.c(jb6.M0(2131745856, null), z3, true);
                editTextBoldCursor.setInputType(2);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length())});
            } else if (okVar3 == okVar) {
                ioVar.c(jb6.M0(2131745855, null), z3, true);
                editTextBoldCursor.setInputType(8194);
                editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(D0().a()).length() + 3)});
            }
            this.r1.c.a(this.y1.a == okVar, z3);
            ImageView imageView2 = this.s1;
            if (z3) {
                imageView2.animate().alpha(this.y1.a == okVar2 ? 1.0f : 0.0f).scaleX(this.y1.a == okVar2 ? 1.0f : 0.0f).scaleY(this.y1.a == okVar2 ? 1.0f : 0.0f).setDuration(180L).start();
                imageView.animate().alpha(this.y1.a == okVar ? 1.0f : 0.0f).scaleX(this.y1.a == okVar ? 1.0f : 0.0f).scaleY(this.y1.a == okVar ? 1.0f : 0.0f).setDuration(180L).start();
            } else {
                imageView2.setAlpha(this.y1.a == okVar2 ? 1.0f : 0.0f);
                imageView.setAlpha(this.y1.a == okVar ? 1.0f : 0.0f);
            }
        } else {
            i = 0;
        }
        if (z4 || z6) {
            gt7 gt7Var = this.l1;
            int i3 = this.z1;
            if ((i3 & 4) != 0) {
                Object[] objArr = new Object[1];
                objArr[i] = D0().g();
                gt7Var.setText(jb6.a0(null, null, 2131745858, objArr));
            } else {
                int i4 = i3 & 2;
                nk nkVar5 = this.y1;
                if (i4 != 0) {
                    nk nkVar6 = nkVar5.a == okVar ? this.w1 : this.u1;
                    Object[] objArr2 = new Object[1];
                    objArr2[i] = nkVar6.g();
                    gt7Var.setText(jb6.a0(null, null, 2131745857, objArr2));
                } else {
                    gt7Var.setText(jb6.M0(nkVar5.a == okVar2 ? 2131745860 : 2131745859, null));
                }
            }
        }
        if (z4 || z5 || z6) {
            b61 b61Var = this.p1;
            boolean z7 = (this.z1 != 0 || this.y1.b <= 0) ? i : 1;
            if (b61Var.e0 != z7) {
                b61Var.setEnabled(z7);
                b61Var.setClickable(z7);
                if (z3) {
                    wi8.s(b61Var.animate(), z7 != 0 ? 1.0f : 0.6f, 180L);
                } else {
                    b61Var.setAlpha(z7 != 0 ? 1.0f : 0.6f);
                }
            }
        }
        if (z4 || z5) {
            gs gsVar = oc7.r1(this.a).l4;
            nk nkVar7 = this.y1;
            ok okVar4 = nkVar7.a;
            if (okVar4 == okVar2) {
                this.n1.setText(gm.S2(jb6.G((int) nk.j((nkVar7.b * gsVar.m.f()) / 1000, nkVar7.a).a(), "ResellGiftInfo", new Object[i])));
            } else if (okVar4 == okVar) {
                this.n1.setText(gm.S2(jb6.a0(null, null, 2131745865, nk.j((nkVar7.b * gsVar.n.f()) / 1000, nkVar7.a).b())));
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ok okVar5 = this.y1.a;
            int i5 = this.a;
            double d = okVar5 == okVar ? oc7.r1(i5).l4.k.i : oc7.r1(i5).l4.s3.i * 1.0E-5d;
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (this.y1.c() * d * 100.0d), false));
            this.q1.c(sb, z3, true);
        }
        if (z && z5) {
            String b = this.y1.b();
            this.m1.setText(b);
            this.m1.setSelection(b.length());
        }
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        gm.d3(new c0a(this, (byte) 3), 50L);
    }
}
