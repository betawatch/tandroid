// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v04 implements egc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ e34 b;

    public v04(e34 e34Var, boolean z) {
        this.b = e34Var;
        this.a = z;
    }

    @Override // egc
    public final void a(int i) {
        e34 e34Var = this.b;
        s04 s04Var = e34Var.h;
        boolean z = false;
        if (s04Var != null) {
            int currentItem = s04Var.getCurrentItem();
            int i2 = currentItem == 2 ? 1 : currentItem == 1 ? 2 : 0;
            if (e34Var.B1 != i2) {
                e34Var.B1 = i2;
                oc7.c1().edit().putInt("selected_page", i2).commit();
            }
        }
        e34Var.K(i == 0, true);
        if (i == 2 && (this.a || e34Var.w0)) {
            z = true;
        }
        e34Var.P(z, true);
        if (e34Var.u1.z()) {
            if (i == 0) {
                d04 d04Var = e34Var.W;
                if (d04Var != null) {
                    d04Var.d.requestFocus();
                    return;
                }
                return;
            }
            if (i == 1) {
                i04 i04Var = e34Var.p0;
                if (i04Var != null) {
                    i04Var.d.requestFocus();
                    return;
                }
                return;
            }
            p04 p04Var = e34Var.H0;
            if (p04Var != null) {
                p04Var.d.requestFocus();
            }
        }
    }

    @Override // egc
    public final void b(float f, int i, int i2) {
        e34 e34Var = this.b;
        s24 s24Var = e34Var.H0;
        s24 s24Var2 = e34Var.p0;
        s24 s24Var3 = e34Var.W;
        r04 r04Var = e34Var.D0;
        l04 l04Var = e34Var.E0;
        m14 m14Var = e34Var.q0;
        g04 g04Var = e34Var.i0;
        r14 r14Var = e34Var.Q;
        boolean z = true;
        if (e34Var.y0 != null && e34Var.h0 != null) {
            if (i == 0) {
                r14Var.setVisibility(0);
                g04Var.setVisibility(f == 0.0f ? 8 : 0);
                m14Var.setVisibility(f == 0.0f ? 8 : 0);
                l04Var.setVisibility(8);
                if (r04Var != null) {
                    r04Var.setVisibility(8);
                }
            } else if (i == 1) {
                r14Var.setVisibility(8);
                g04Var.setVisibility(0);
                m14Var.setVisibility(0);
                l04Var.setVisibility(f == 0.0f ? 8 : 0);
                if (r04Var != null) {
                    r04Var.setVisibility(f != 0.0f ? 0 : 8);
                }
            } else if (i == 2) {
                r14Var.setVisibility(8);
                g04Var.setVisibility(8);
                m14Var.setVisibility(8);
                l04Var.setVisibility(0);
                if (r04Var != null) {
                    r04Var.setVisibility(0);
                }
            }
        }
        e34Var.getMeasuredWidth();
        e34Var.getPaddingLeft();
        e34Var.getPaddingRight();
        f24 f24Var = e34Var.u1;
        if (f24Var != null) {
            if (i == 1) {
                f24Var.r(i2 == 0 ? 0 : 2);
            } else if (i == 2) {
                f24Var.r(3);
            } else {
                f24Var.r(0);
            }
        }
        e34Var.L(true);
        int currentItem = e34Var.h.getCurrentItem();
        s24 s24Var4 = currentItem == 0 ? s24Var3 : currentItem == 1 ? s24Var2 : s24Var;
        String obj = s24Var4.d.getText().toString();
        int i3 = 0;
        while (i3 < 3) {
            s24 s24Var5 = i3 == 0 ? s24Var3 : i3 == 1 ? s24Var2 : s24Var;
            if (s24Var5 != null) {
                q24 q24Var = s24Var5.d;
                if (s24Var5 != s24Var4 && q24Var != null && !q24Var.getText().toString().equals(obj)) {
                    q24Var.setText(obj);
                    q24Var.setSelection(obj.length());
                }
            }
            i3++;
        }
        if ((i != 0 || f <= 0.0f) && i != 1) {
            z = false;
        }
        e34Var.Q(z);
        e34Var.Z();
    }

    @Override // egc
    public final void c(int i) {
    }
}
