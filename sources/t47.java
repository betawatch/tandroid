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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t47 extends fx0 {
    public boolean A1;
    public final ge0 l1;
    public final boolean m1;
    public final boolean n1;
    public final er7 o1;
    public final EditTextBoldCursor p1;
    public final ps0 q1;
    public final u41 r1;
    public final hn s1;
    public final nj t1;
    public final nj u1;
    public nj v1;
    public long w1;
    public int x1;
    public boolean y1;
    public final cm2[] z1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x040f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t47(Context context, int i, long j, u47 u47Var, mu1 mu1Var, wjb wjbVar, int i2, p8c p8cVar) {
        super(1, wjbVar, context, true);
        oj ojVar;
        long j2;
        this.w1 = -1L;
        this.z1 = new cm2[1];
        this.n1 = i2;
        this.E = true;
        this.Q0 = true;
        boolean z = hc2.z(i, 24, j);
        this.m1 = z;
        long f = na7.q1(i).k4.e.f();
        oj ojVar2 = oj.a;
        this.t1 = nj.h(f, ojVar2);
        nj h = nj.h(r8.f.f(), ojVar2);
        this.u1 = h;
        if (z) {
            this.l1 = null;
        } else {
            ge0 ge0Var = new ge0(i, wjbVar, context);
            this.l1 = ge0Var;
            ge0Var.setScaleX(0.6f);
            ge0Var.setScaleY(0.6f);
            ge0Var.setAlpha(0.0f);
            ge0Var.setEnabled(false);
            ge0Var.setClickable(false);
            this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            ote.a(ge0Var);
            ge0Var.setOnClickListener(new ky(context, wjbVar, (byte) 1));
        }
        M(bkb.g5);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout j3 = de9.j(context, 0);
        linearLayout.addView(j3, nme.t(-1, 56, 55, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i3 = bkb.F6;
        zkb.X(textView, i3, null);
        textView.setTextSize(1, 20.0f);
        textView.setGravity(8388627);
        textView.setText(k96.M0(i2 == 0 ? 2131746885 : 2131746891, null));
        textView.setTypeface(gl.o());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        j3.addView(textView, nme.q(-1, -1, 1.0f, kk7.D1, 22, 0, 22, 0));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i4 = bkb.V5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        zkb.s(imageView, i4, wjbVar, mode);
        ote.a(imageView);
        imageView.setOnClickListener(new b95(this, (byte) 28));
        j3.addView(imageView, nme.q(48, 48, 0.0f, 21, 0, 0, 6, 0));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.p1 = editTextBoldCursor;
        LinearLayout j4 = de9.j(context, 1);
        linearLayout.addView(j4, nme.l(1.0f, -1, -2));
        er7 er7Var = new er7(context, null);
        this.o1 = er7Var;
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gl.L(42.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        zkb.X(editTextBoldCursor, i3, null);
        editTextBoldCursor.requestFocus();
        er7Var.setLeftPadding(gl.L(28.0f));
        er7Var.e(editTextBoldCursor);
        nj njVar = u47Var.a;
        er7Var.b(1.0f, njVar != null && !njVar.l() ? 1.0f : 0.0f, false);
        er7Var.setForceUseCenter2(true);
        editTextBoldCursor.setOnFocusChangeListener(new ls0(this, (byte) 14));
        er7Var.addView(editTextBoldCursor, nme.e(-1, -2, 48));
        j4.addView(er7Var, nme.k(18.0f, 0.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.star_small_inner);
        er7Var.addView(imageView2, nme.d(22, 22.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        hn hnVar = new hn(context, false, false, false);
        this.s1 = hnVar;
        int i5 = bkb.x6;
        zkb.U(hnVar, i5, null);
        hnVar.setTextSize(gl.L(13.0f));
        hnVar.setGravity(5);
        er7Var.addView(hnVar, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        zkb.X(textView2, i5, null);
        textView2.setTextSize(1, 13.0f);
        j4.addView(textView2, nme.t(-1, -2, 55, 33, 4, 33, 0));
        ps0 ps0Var = new ps0(context, (byte) 4);
        this.q1 = ps0Var;
        ps0Var.setCursorSize(gl.L(20.0f));
        ps0Var.setCursorWidth(1.5f);
        ps0Var.setTextSize(1, 17.0f);
        ps0Var.setMaxLines(1);
        ps0Var.setBackground(null);
        ps0Var.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        zkb.X(ps0Var, i3, null);
        ps0Var.setFocusable(false);
        ps0Var.setClickable(false);
        ps0Var.setEnabled(false);
        er7 er7Var2 = new er7(context, null);
        er7Var2.setText(k96.M0(2131746883, null));
        er7Var2.e(ps0Var);
        er7Var2.addView(ps0Var, nme.d(-1, -2.0f, 48, 0.0f, 0.0f, 48.0f, 0.0f));
        ote.b(er7Var2, 0.02f, 1.2f);
        er7Var2.setOnClickListener(new hu4(this, context, wjbVar, (byte) 8));
        j4.addView(er7Var2, nme.k(18.0f, 24.0f, 18.0f, 0.0f, -1, 58));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.arrow_more);
        zkb.s(imageView3, i4, wjbVar, mode);
        er7Var2.addView(imageView3, nme.d(24, 24.0f, 21, 0.0f, 0.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        zkb.X(textView3, i5, null);
        textView3.setTextSize(1, 13.0f);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) gl.T2(k96.M0(2131746901, null)));
        spannableStringBuilder.append(' ');
        ls6.s(null, null, 2131746900, new Object[]{Long.valueOf(na7.q1(i).k4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
        textView3.setText(spannableStringBuilder);
        j4.addView(textView3, nme.t(-1, -2, 55, 33, 4, 33, 24));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, nme.r(-1, -2, 80));
        u41 i6 = yjb.i(24, wjbVar, context, true);
        this.r1 = i6;
        i6.setOnClickListener(new uf1(this, mu1Var, i, context, wjbVar, j, p8cVar));
        if (i2 == 1) {
            i6.i(k96.M0(2131746890, null), false, true);
        }
        linearLayout2.addView(i6, nme.k(18.0f, 0.0f, 18.0f, 8.0f, -1, 48));
        textView2.setText(k96.M0(2131746887, null));
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(h.a()).length())});
        if (njVar != null) {
            ojVar = ojVar2;
            if (njVar.a == ojVar) {
                G0(nj.j(njVar.b, ojVar), !njVar.l(), true, false);
                j2 = u47Var.b;
                if (this.w1 != j2) {
                    this.w1 = j2;
                    ps0Var.setText(F0(j2));
                }
                E0(false);
                this.O = linearLayout;
                editTextBoldCursor.addTextChangedListener(new jf6(this, (byte) 1));
            }
        } else {
            ojVar = ojVar2;
        }
        G0(nj.j(0L, ojVar), false, true, false);
        j2 = u47Var.b;
        if (this.w1 != j2) {
        }
        E0(false);
        this.O = linearLayout;
        editTextBoldCursor.addTextChangedListener(new jf6(this, (byte) 1));
    }

    public static String F0(long j) {
        if (j <= 0) {
            return k96.M0(2131746899, null);
        }
        String x = k96.x(j, true);
        if (x.isEmpty()) {
            return x;
        }
        return Character.toUpperCase(x.charAt(0)) + x.substring(1);
    }

    public final void D0() {
        boolean z = this.A1;
        ge0 ge0Var = this.l1;
        boolean z2 = z && !this.J && ge0Var != null && this.b.getY() > ((float) gl.L(32.0f));
        if (this.y1 != z2) {
            this.y1 = z2;
            if (ge0Var != null) {
                ge0Var.setEnabled(z2);
                ge0Var.setClickable(z2);
                ug8.s(ge0Var.animate().scaleX(z2 ? 1.0f : 0.6f).scaleY(z2 ? 1.0f : 0.6f), z2 ? 1.0f : 0.0f, 180L);
            }
        }
    }

    public final void E0(boolean z) {
        boolean z2 = this.x1 == 0 && (this.v1.b >= 0 || this.w1 > 0);
        u41 u41Var = this.r1;
        if (u41Var.e0 != z2) {
            u41Var.setEnabled(z2);
            u41Var.setClickable(z2);
            if (z) {
                ug8.s(u41Var.animate(), z2 ? 1.0f : 0.6f, 180L);
            } else {
                u41Var.setAlpha(z2 ? 1.0f : 0.6f);
            }
        }
    }

    public final void G0(nj njVar, boolean z, boolean z2, boolean z3) {
        int i;
        nj njVar2 = this.v1;
        int i2 = this.x1;
        this.x1 = 0;
        if (njVar != null) {
            this.v1 = njVar;
            i = 0;
        } else {
            njVar = nj.j(0L, oj.a);
            this.v1 = njVar;
            i = this.x1 | 1;
            this.x1 = i;
        }
        if (this.u1.b < njVar.b) {
            this.x1 = i | 4;
        }
        if (!njVar.l() && this.t1.b > this.v1.b) {
            this.x1 |= 2;
        }
        boolean z4 = z2 || njVar2.b != this.v1.b;
        boolean z5 = z2 || i2 != this.x1;
        if (z5) {
            this.o1.a(this.x1 == 0 ? 0.0f : 1.0f);
            er7 er7Var = this.o1;
            int i3 = this.x1;
            if ((i3 & 4) != 0) {
                er7Var.setText(k96.a0(null, null, 2131744177, this.u1.g()));
            } else if ((i3 & 2) != 0) {
                er7Var.setText(k96.a0(null, null, 2131744176, this.t1.g()));
            } else {
                er7Var.setText(k96.M0(2131746884, null));
            }
        }
        if (z4 || z5) {
            u41 u41Var = this.r1;
            if (this.n1) {
                u41Var.i(k96.M0(2131746890, null), z3, true);
            } else if (this.v1.l()) {
                u41Var.i(k96.M0(2131746889, null), z3, true);
            } else {
                u41Var.i(jva.Y0(false, k96.a0(null, null, 2131746888, k96.E(this.v1.a(), ',')), this.z1), z3, true);
            }
            E0(z3);
        }
        if (z4) {
            double d = na7.q1(this.a).k4.s3.i * 1.0E-5d;
            StringBuilder sb = new StringBuilder(10);
            sb.append('~');
            ci0.h();
            sb.append(ci0.f("USD", 2, (long) (this.v1.c() * d * 100.0d), false));
            this.s1.c(sb, z3, true);
        }
        if (z && z4) {
            String b = this.v1.b();
            this.p1.setText(b);
            this.p1.setSelection(b.length());
        }
    }

    @Override // fx0
    public final boolean U(float f, float f2) {
        ge0 ge0Var;
        if (!this.y1 || (ge0Var = this.l1) == null || f < ge0Var.getX() || f > ge0Var.getX() + ge0Var.getWidth() || f2 < ge0Var.getY() || f2 > ge0Var.getY() + ge0Var.getHeight()) {
            return super.U(f, f2);
        }
        return false;
    }

    @Override // fx0
    public final void d0(float f) {
        super.d0(f);
        D0();
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        gl.e3(new vl6(this, (byte) 14), 50L);
    }

    @Override // fx0
    public final void x() {
        this.A1 = true;
        D0();
    }
}
