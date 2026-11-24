// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u67 extends my0 {
    public boolean A1;
    public final gf0 l1;
    public final boolean m1;
    public final boolean n1;
    public final gt7 o1;
    public final EditTextBoldCursor p1;
    public final vc q1;
    public final b61 r1;
    public final io s1;
    public final nk t1;
    public final nk u1;
    public nk v1;
    public long w1;
    public int x1;
    public boolean y1;
    public final pn2[] z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u67(Context context, int i, long j, v67 v67Var, yv1 yv1Var, ylb ylbVar, int i2, qac qacVar) {
        super(1, ylbVar, context, true);
        ok okVar;
        long j2;
        this.w1 = -1L;
        this.z1 = new pn2[1];
        this.n1 = i2;
        this.E = true;
        this.Q0 = true;
        boolean z = sd2.z(i, 24, j);
        this.m1 = z;
        long f = oc7.r1(i).l4.e.f();
        ok okVar2 = ok.a;
        this.t1 = nk.h(f, okVar2);
        nk h = nk.h(r8.f.f(), okVar2);
        this.u1 = h;
        if (z) {
            this.l1 = null;
        } else {
            gf0 gf0Var = new gf0(i, ylbVar, context);
            this.l1 = gf0Var;
            gf0Var.setScaleX(0.6f);
            gf0Var.setScaleY(0.6f);
            gf0Var.setAlpha(0.0f);
            gf0Var.setEnabled(false);
            gf0Var.setClickable(false);
            this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            rve.a(gf0Var);
            gf0Var.setOnClickListener(new kz(context, ylbVar, (byte) 1));
        }
        L(cmb.g5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout i3 = hg9.i(context, 0);
        linearLayout.addView(i3, qoe.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i4 = cmb.F6;
        anb.X(textView, i4, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(jb6.M0(i2 == 0 ? 2131746811 : 2131746817, null));
        textView.setTypeface(gm.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        i3.addView(textView, qoe.q(-1, -1, 1.0f, nm7.D1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i5 = cmb.V5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView, i5, ylbVar, mode);
        rve.a(imageView);
        imageView.setOnClickListener(new m67(this, (byte) 1));
        i3.addView(imageView, qoe.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.p1 = editTextBoldCursor;
        LinearLayout i6 = hg9.i(context, 1);
        linearLayout.addView(i6, qoe.l(1.0f, -1, -2));
        gt7 gt7Var = new gt7(context, null);
        this.o1 = gt7Var;
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gm.L(42.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        anb.X(editTextBoldCursor, i4, null);
        editTextBoldCursor.requestFocus();
        gt7Var.setLeftPadding(gm.L(28.0f));
        gt7Var.e(editTextBoldCursor);
        nk nkVar = v67Var.a;
        gt7Var.b(1.0f, nkVar != null && !nkVar.l() ? 1.0f : 0.0f, false);
        gt7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new tt0(this, (byte) 14));
        gt7Var.addView(editTextBoldCursor, qoe.e(-1, -2, 48));
        i6.addView(gt7Var, qoe.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.star_small_inner);
        gt7Var.addView(imageView2, qoe.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        io ioVar = new io(context, false, false, false);
        this.s1 = ioVar;
        int i7 = cmb.x6;
        anb.U(ioVar, i7, null);
        ioVar.setTextSize(gm.L(13.0f));
        ioVar.setGravity(5);
        gt7Var.addView(ioVar, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        anb.X(textView2, i7, null);
        textView2.setTextSize(1, 13.0f);
        i6.addView(textView2, qoe.t(-1, -2, 55, 33, 4, 33, 0));
        vc vcVar = new vc(context, (byte) 5);
        this.q1 = vcVar;
        vcVar.setCursorSize(gm.L(20.0f));
        vcVar.setCursorWidth(1.5f);
        vcVar.setTextSize(1, 17.0f);
        vcVar.setMaxLines(1);
        vcVar.setBackground(null);
        vcVar.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        anb.X(vcVar, i4, null);
        vcVar.setFocusable(false);
        vcVar.setClickable(false);
        vcVar.setEnabled(false);
        gt7 gt7Var2 = new gt7(context, null);
        gt7Var2.setText(jb6.M0(2131746809, null));
        gt7Var2.e(vcVar);
        gt7Var2.addView(vcVar, qoe.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        rve.b(gt7Var2, 0.02f, 1.2f);
        gt7Var2.setOnClickListener(new jw4(this, context, ylbVar, (byte) 8));
        i6.addView(gt7Var2, qoe.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        anb.s(imageView3, i5, ylbVar, mode);
        gt7Var2.addView(imageView3, qoe.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        anb.X(textView3, i7, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) gm.S2(jb6.M0(2131746827, null)));
        spannableStringBuilder.append(' ');
        kt6.t(null, null, 2131746826, new Object[]{Long.valueOf(oc7.r1(i).l4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        i6.addView(textView3, qoe.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, qoe.r(-1, -2, 80));
        b61 i8 = mlb.i(24, ylbVar, context, true);
        this.r1 = i8;
        i8.setOnClickListener(new ch1(this, yv1Var, i, context, ylbVar, j, qacVar));
        if (i2 == 1) {
            i8.i(jb6.M0(2131746816, null), false, true);
        }
        linearLayout2.addView(i8, qoe.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        textView2.setText(jb6.M0(2131746813, null));
        byte b = 2;
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(h.a()).length())});
        if (nkVar != null) {
            okVar = okVar2;
            if (nkVar.a == okVar) {
                G0(nk.j(nkVar.b, okVar), !nkVar.l(), true, false);
                j2 = v67Var.b;
                if (this.w1 != j2) {
                    this.w1 = j2;
                    vcVar.setText(F0(j2));
                }
                E0(false);
                this.O = linearLayout;
                editTextBoldCursor.addTextChangedListener(new og6(this, b));
            }
        } else {
            okVar = okVar2;
        }
        G0(nk.j(0L, okVar), false, true, false);
        j2 = v67Var.b;
        if (this.w1 != j2) {
        }
        E0(false);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new og6(this, b));
    }

    public static String F0(long j) {
        if (j <= 0) {
            return jb6.M0(2131746825, null);
        }
        String x = jb6.x(j, true);
        if (x.isEmpty()) {
            return x;
        }
        return Character.toUpperCase(x.charAt(0)) + x.substring(1);
    }

    public final void D0() {
        boolean z = this.A1;
        gf0 gf0Var = this.l1;
        boolean z2 = z && !this.J && gf0Var != null && this.b.getY() > ((float) gm.L(32.0f));
        if (this.y1 != z2) {
            this.y1 = z2;
            if (gf0Var != null) {
                gf0Var.setEnabled(z2);
                gf0Var.setClickable(z2);
                wi8.s(gf0Var.animate().scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f), z2 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void E0(boolean z) {
        boolean z2 = this.x1 == 0 && (this.v1.b >= 0 || this.w1 > 0);
        b61 b61Var = this.r1;
        if (b61Var.e0 != z2) {
            b61Var.setEnabled(z2);
            b61Var.setClickable(z2);
            if (z) {
                wi8.s(b61Var.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                b61Var.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    public final void G0(nk nkVar, boolean z, boolean z2, boolean z3) {
        int i;
        nk nkVar2 = this.v1;
        int i2 = this.x1;
        this.x1 = 0;
        if (nkVar != null) {
            this.v1 = nkVar;
            i = 0;
        } else {
            nkVar = nk.j(0L, ok.a);
            this.v1 = nkVar;
            i = this.x1 | 1;
            this.x1 = i;
        }
        if (this.u1.b < nkVar.b) {
            this.x1 = i | 4;
        }
        if (!nkVar.l() && this.t1.b > this.v1.b) {
            this.x1 |= 2;
        }
        boolean z4 = z2 || nkVar2.b != this.v1.b;
        boolean z5 = z2 || i2 != this.x1;
        if (z5) {
            this.o1.a(this.x1 == 0 ? 0.0f : 1.0f);
            gt7 gt7Var = this.o1;
            int i3 = this.x1;
            if ((i3 & 4) != 0) {
                gt7Var.setText(jb6.a0(null, null, 2131744103, this.u1.g()));
            } else if ((i3 & 2) != 0) {
                gt7Var.setText(jb6.a0(null, null, 2131744102, this.t1.g()));
            } else {
                gt7Var.setText(jb6.M0(2131746810, null));
            }
        }
        if (z4 || z5) {
            b61 b61Var = this.r1;
            if (this.n1) {
                b61Var.i(jb6.M0(2131746816, null), z3, true);
            } else if (this.v1.l()) {
                b61Var.i(jb6.M0(2131746815, null), z3, true);
            } else {
                b61Var.i(nxa.Z0(false, jb6.a0(null, null, 2131746814, jb6.E(this.v1.a(), ',')), this.z1), z3, true);
            }
            E0(z3);
        }
        if (z4) {
            double d = oc7.r1(this.a).l4.s3.i * 1.0E-5d;
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            cj0.h();
            sb.append(cj0.f("USD", 2, (long) (this.v1.c() * d * 100.0d), false));
            this.s1.c(sb, z3, true);
        }
        if (z && z4) {
            String b = this.v1.b();
            this.p1.setText(b);
            this.p1.setSelection(b.length());
        }
    }

    @Override // my0
    public final boolean T(float f, float f2) {
        gf0 gf0Var;
        if (!this.y1 || (gf0Var = this.l1) == null || f < gf0Var.getX() || f > gf0Var.getX() + gf0Var.getWidth() || f2 < gf0Var.getY() || f2 > gf0Var.getY() + gf0Var.getHeight()) {
            return super.T(f, f2);
        }
        return false;
    }

    @Override // my0
    public final void d0(float f) {
        super.d0(f);
        D0();
    }

    @Override // my0, android.app.Dialog
    public final void show() {
        super.show();
        gm.d3(new pg6(this, (byte) 21), 50L);
    }

    @Override // my0
    public final void w() {
        this.A1 = true;
        D0();
    }
}
