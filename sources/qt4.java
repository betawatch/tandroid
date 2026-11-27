// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qt4 extends l69 {
    public final /* synthetic */ wt4 c;

    public qt4(wt4 wt4Var) {
        this.c = wt4Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 2;
    }

    @Override // l69
    public final String F(int i) {
        no6 no6Var;
        int i2 = i - 2;
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.c0;
        if (wt4Var.d0) {
            if (i2 == 0) {
                return null;
            }
            i2 = i - 3;
        } else if (wt4Var.e0) {
            if (i2 >= 0 && i2 < arrayList.size()) {
                return ob6.e0(((c8b) arrayList.get(i2)).d / 1000, true);
            }
            i2 -= arrayList.size();
        }
        ArrayList arrayList2 = wt4Var.g0;
        if (arrayList2 == null || i2 < 0 || i2 >= arrayList2.size() || (no6Var = (no6) wt4Var.g0.get(i2)) == null) {
            return null;
        }
        long j = no6Var.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j /= 1000;
        }
        return ob6.e0(j, true);
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        int e = e();
        float width = (d79Var.getWidth() - d79Var.getPaddingLeft()) - d79Var.getPaddingRight();
        wt4 wt4Var = this.c;
        ar0 ar0Var = wt4Var.e;
        float f2 = ar0Var.J;
        int i = (int) (((int) (width / f2)) * wt4Var.P);
        int ceil = (int) Math.ceil(e / f2);
        float U1 = (hl.U1(f, 0, Math.max(0, r1 - ((hl.q.y - d79Var.getPaddingTop()) - d79Var.getPaddingBottom()))) / (ceil * i)) * ceil;
        int round = Math.round(U1);
        iArr[0] = Math.max(0, ar0Var.J * round) + 2;
        iArr[1] = d79Var.getPaddingTop() + ((int) ((U1 - round) * i));
    }

    @Override // l69
    public final float H(d79 d79Var) {
        int e = e();
        float width = (d79Var.getWidth() - d79Var.getPaddingLeft()) - d79Var.getPaddingRight();
        float f = this.c.e.J;
        return (Math.max(0, d79Var.computeVerticalScrollOffset() - r4.getPadding()) - d79Var.getPaddingTop()) / ((((int) Math.ceil(e / f)) * ((int) (((int) (width / f)) * r4.P))) - (hl.q.y - d79Var.getPaddingTop()));
    }

    @Override // j79
    public final int b() {
        return e() + 3;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0 || i == b() - 1) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    @Override // j79
    public final int e() {
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.g0;
        int size = arrayList == null ? 0 : arrayList.size();
        return wt4Var.d0 ? size + 1 : wt4Var.e0 ? wt4Var.c0.size() + size : size;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.i0;
        ArrayList arrayList2 = wt4Var.c0;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            ((tt4) view).a = i == 0 ? wt4Var.getPadding() : -1;
            return;
        }
        if (i2 == 2) {
            st4 st4Var = (st4) view;
            char c = 1;
            byte b = 0;
            boolean z = i == 2;
            boolean z2 = i == 4;
            st4Var.V = z;
            st4Var.W = z2;
            st4Var.N = new pt4(this, st4Var, b);
            st4Var.O = new pt4(this, st4Var, c == true ? 1 : 0);
            int i3 = i - 2;
            if (wt4Var.d0) {
                if (i3 == 0) {
                    st4Var.f(-1, false, false);
                    st4Var.e(arrayList2.size(), (c8b) arrayList2.get(0));
                    return;
                }
                i3 = i - 3;
            } else if (wt4Var.e0) {
                if (i3 >= 0 && i3 < arrayList2.size()) {
                    st4Var.f(-1, false, false);
                    st4Var.e(0, (c8b) arrayList2.get(i3));
                    return;
                }
                i3 -= arrayList2.size();
            }
            ArrayList arrayList3 = wt4Var.g0;
            if (arrayList3 == null || i3 < 0 || i3 >= arrayList3.size()) {
                return;
            }
            no6 no6Var = (no6) wt4Var.g0.get(i3);
            st4Var.f(arrayList.indexOf(no6Var), !arrayList.isEmpty() || wt4Var.R, st4Var.T == no6Var);
            st4Var.T = no6Var;
            st4Var.g((no6Var == null || !no6Var.b || no6Var.d()) ? null : hl.g0(no6Var.E, false, false));
            st4Var.G = null;
            if (no6Var == null) {
                st4Var.P = null;
            } else if (no6Var.b) {
                st4Var.P = ob6.M0(2131753926, null) + ", " + ob6.z(no6Var.E);
            } else {
                st4Var.P = ob6.M0(2131753941, null);
            }
            st4Var.b(no6Var);
            st4Var.invalidate();
            if (wt4Var.N) {
                st4Var.J.setOnClickListener(new c0(this, no6Var, st4Var, (byte) 29));
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View st4Var;
        wt4 wt4Var = this.c;
        if (i == 0) {
            st4Var = new tt4(wt4Var, wt4Var.getContext());
        } else if (i == 1) {
            Context context = wt4Var.getContext();
            boolean z = wt4Var.M;
            b6 b6Var = new b6(context, (byte) 15);
            b6Var.setPadding(hl.L(z ? 14.0f : 16.0f), hl.L(16.0f), hl.L(8.0f), hl.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(hl.o());
            textView.setText(wt4Var.getTitle());
            b6Var.addView(textView, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, z ? 32.0f : 0.0f, 0.0f));
            wt4Var.j0 = b6Var;
            st4Var = b6Var;
        } else {
            st4Var = new st4(wt4Var.getContext(), wt4Var.b, wt4Var.P, wt4Var.N);
        }
        return new n69(st4Var);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        wt4 wt4Var = this.c;
        ArrayList arrayList = wt4Var.i0;
        if (f89Var.f == 2) {
            st4 st4Var = (st4) f89Var.a;
            Object obj = st4Var.T;
            if (!(obj instanceof no6)) {
                st4Var.f(-1, false, false);
            } else {
                st4Var.f(arrayList.indexOf((no6) obj), !arrayList.isEmpty() || wt4Var.R, false);
            }
        }
    }
}
