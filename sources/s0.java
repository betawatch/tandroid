// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s0 extends ny0 {
    public final FrameLayout S1;
    public final FrameLayout T1;
    public final de0 U1;
    public final zt3 V1;
    public final zt3 W1;
    public final FrameLayout X1;
    public final og2 Y1;
    public final FrameLayout Z1;
    public final FrameLayout a2;
    public final c51 b2;
    public Long c2;
    public r0 d2;
    public TL_aicompose.TL_aiComposeTone e2;
    public h f2;
    public h g2;
    public int h2;
    public l9c i2;
    public int j2;

    public s0(Context context, vnb vnbVar) {
        super(context, null, true, false, 2, vnbVar);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i = aob.G6;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_ATOP);
        final byte b = 1;
        hf0 f0 = aob.f0(aob.p1(0.1f, aob.v0(i, this.J0)), 1, -1);
        uob K = yob.K(0.1f, i);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, K, vnbVar);
        this.o1.addView(imageView, tre.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        iye.b(imageView, 0.1f, 1.5f);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: k0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                s0 s0Var = this.b;
                switch (b3) {
                    case 0:
                        s0Var.dismiss();
                        break;
                    case 1:
                        s0Var.Z0();
                        break;
                    default:
                        s0Var.Y1.a(!r1.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.S1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.T1 = frameLayout2;
        int L = hl.L(100.0f);
        int i2 = aob.d6;
        ShapeDrawable K2 = aob.K(L, aob.v0(i2, vnbVar));
        uob M = yob.M(i2);
        frameLayout2.setBackground(K2);
        yob.j(frameLayout2, K2, M, null, vnbVar);
        iye.a(frameLayout2);
        frameLayout.addView(frameLayout2, tre.e(100, 100, 17));
        de0 de0Var = new de0(context);
        this.U1 = de0Var;
        b1();
        frameLayout2.addView(de0Var, tre.e(64, 64, 17));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: k0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                s0 s0Var = this.b;
                switch (b3) {
                    case 0:
                        s0Var.dismiss();
                        break;
                    case 1:
                        s0Var.Z0();
                        break;
                    default:
                        s0Var.Y1.a(!r1.a.q, true);
                        break;
                }
            }
        });
        zt3 zt3Var = new zt3(context, ob6.M0(2131754962, null), false, false, uc7.s1(this.a).l4.b0.f(), vnbVar);
        this.V1 = zt3Var;
        zt3Var.d.addTextChangedListener(new o0(this, (byte) 0));
        zt3 zt3Var2 = new zt3(context, ob6.M0(2131754969, null), true, false, uc7.s1(this.a).l4.c0.f(), vnbVar);
        this.W1 = zt3Var2;
        final byte b3 = 2;
        zt3Var2.setShowLimitWhenNear(Math.max(100, uc7.s1(this.a).l4.c0.f() / 2));
        zt3Var2.d.addTextChangedListener(new o0(this, (byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(12.0f), hl.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i3 = aob.i6;
        hf0 Y = aob.Y(aob.v0(i3, vnbVar), 24, 24);
        uob M2 = yob.M(i3);
        linearLayout.setBackground(Y);
        yob.j(linearLayout, Y, null, M2, vnbVar);
        og2 og2Var = new og2(24, vnbVar, context);
        this.Y1 = og2Var;
        og2Var.b(aob.h7, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        yob.X(textView, aob.q5, vnbVar);
        bs2.r(14.0f, 1, 2131754979, textView, null);
        linearLayout.addView(textView, tre.t(-2, -2, 16, 9, 0, 0, 0));
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: k0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                s0 s0Var = this.b;
                switch (b32) {
                    case 0:
                        s0Var.dismiss();
                        break;
                    case 1:
                        s0Var.Z0();
                        break;
                    default:
                        s0Var.Y1.a(!r1.a.q, true);
                        break;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.X1 = frameLayout3;
        frameLayout3.addView(linearLayout, tre.d(-2, -2.0f, 17, 2.0f, 2.0f, 2.0f, 2.0f));
        int i4 = aob.a7;
        this.b0 = i4;
        s0(aob.v0(i4, this.J0));
        d79 d79Var = this.n1;
        int i5 = this.u0;
        d79Var.setPadding(i5, 0, i5, hl.L(66.0f));
        this.n1.setClipToPadding(false);
        this.n1.s1();
        this.n1.setOnItemClickListener(new l0(this, vnbVar, b2));
        this.F1 = false;
        this.E1 = hl.L(12.0f);
        this.u1 = 0.35f;
        this.Q0 = true;
        this.I1 = true;
        p0 p0Var = new p0(this);
        p0Var.m = false;
        p0Var.C = false;
        p0Var.o(k43.h);
        p0Var.n(350L);
        this.n1.setItemAnimator(p0Var);
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.Z1 = frameLayout4;
        frameLayout4.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(12.0f));
        frameLayout4.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, aob.v0(i4, this.J0)), aob.v0(i4, this.J0), aob.v0(i4, this.J0)}));
        FrameLayout.LayoutParams e = tre.e(-1, -2, 80);
        int i6 = e.leftMargin;
        int i7 = this.u0;
        e.leftMargin = i6 + i7;
        e.rightMargin += i7;
        this.b.addView(frameLayout4, e);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.a2 = frameLayout5;
        FrameLayout.LayoutParams d = tre.d(-1, -2.0f, 80, 6.0f, 0.0f, 6.0f, 60.0f);
        int i8 = d.leftMargin;
        int i9 = this.u0;
        d.leftMargin = i8 + i9;
        d.rightMargin += i9;
        this.b.addView(frameLayout5, d);
        c51 i10 = xnb.i(24, vnbVar, context, true);
        this.b2 = i10;
        i10.setText(ob6.M0(2131754978, null));
        i10.setOnClickListener(new t(this, vnbVar, b));
        frameLayout4.addView(i10, tre.e(-1, 48, jn7.D1));
        a1();
        this.i2.O(false);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(d79Var, getContext(), this.a, 0, true, new c(this, (byte) 2), this.J0);
        this.i2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return ob6.M0(this.e2 != null ? 2131754993 : 2131754985, null);
    }

    public final void Z0() {
        if (this.d2 != null) {
            return;
        }
        q0 q0Var = new q0(this, getContext(), Integer.valueOf(hl.L(150.0f)), this.J0, r6);
        q0Var.setSelected(this.c2);
        q0Var.setSaveState(1);
        r0 r0Var = new r0(this, q0Var);
        this.d2 = r0Var;
        d1a[] d1aVarArr = {r0Var};
        r0Var.showAsDropDown(this.T1, hl.L(150.0f), -hl.L(390.0f), 80);
        d1aVarArr[0].a();
    }

    public final void a1() {
        this.b2.setEnabled(this.c2 != null && this.V1.getText().length() > 0 && this.W1.getText().length() > 0);
    }

    public final void b1() {
        this.h2 = 0;
        Long l = this.c2;
        de0 de0Var = this.U1;
        if (l == null) {
            de0Var.setImageResource(R.drawable.menu_smile_add);
            de0Var.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.W5, this.J0), PorterDuff.Mode.SRC_IN));
        } else {
            de0Var.setAnimatedEmojiDrawable(new wl(4, this.a, this.c2.longValue()));
            de0Var.setColorFilter(null);
            de0Var.setEmojiColorFilter(new PorterDuffColorFilter(aob.v0(aob.j5, this.J0), PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // nx0
    public final void n0(float f) {
        super.n0(f);
        this.Z1.setTranslationY(f);
    }

    @Override // nx0
    public final void p0() {
        try {
            super.p0();
            int v0 = aob.v0(aob.a7, this.J0);
            if (v0 != this.j2) {
                this.j2 = v0;
                s0(v0);
                this.Z1.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{aob.p1(0.0f, v0), v0, v0}));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        de0 de0Var = this.U1;
        if (de0Var != null) {
            try {
                int v02 = aob.v0(this.c2 == null ? aob.W5 : aob.j5, this.J0);
                if (v02 != this.h2) {
                    this.h2 = v02;
                    if (this.c2 == null) {
                        de0Var.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
                    } else {
                        de0Var.setEmojiColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.SRC_IN));
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
    }
}
