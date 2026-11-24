// default package

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p7 {
    public final byte a;
    public byte b;
    public int c;
    public p09 d;
    public CharSequence e;
    public boolean f;
    public View g;
    public sp1 h;
    public byte i;
    public View j;
    public qp1 k;
    public byte l = 0;
    public byte m = 0;
    public Integer n;
    public Integer o;

    /* JADX WARN: Multi-variable type inference failed */
    public p7(int i) {
        this.a = i;
    }

    public final void a(int i, int i2) {
        Integer num = this.n;
        if (num == null || this.o == null || num.intValue() != i || this.o.intValue() != i2) {
            this.n = Integer.valueOf(i);
            this.o = Integer.valueOf(i2);
            View view = this.j;
            if (view instanceof a8) {
                ((a8) view).d(i, i2);
            }
        }
    }

    public final void b(int i) {
        if (i != this.c) {
            this.c = i;
            View view = this.j;
            if (view instanceof a8) {
                ((a8) view).setIcon(i);
            }
        }
    }

    public final void c(qp1 qp1Var) {
        this.k = qp1Var;
        View view = this.j;
        if (view != null) {
            view.setOnClickListener(qp1Var);
        }
    }

    public final void d(CharSequence charSequence) {
        this.e = charSequence;
        View view = this.j;
        if (view instanceof a8) {
            ((a8) view).setText(charSequence);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i) {
        this.l = i;
        View view = this.j;
        if (view != null) {
            view.setVisibility(i);
        }
    }
}
