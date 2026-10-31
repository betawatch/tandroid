package vh;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.dg0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g2 extends ak0 {
    public final /* synthetic */ k2 c;

    public g2(k2 k2Var) {
        this.c = k2Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        ef efVar;
        int i11 = i10 - 2;
        k2 k2Var = this.c;
        if (k2Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (k2Var.d0) {
            if (i11 >= 0 && i11 < k2Var.b0.size()) {
                return cd.e0(((n5) k2Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= k2Var.b0.size();
        }
        ArrayList arrayList = k2Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (efVar = (ef) k2Var.f0.get(i11)) == null) {
            return null;
        }
        long j10 = efVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return cd.e0(j10, true);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int e = e();
        float width = (tk0Var.getWidth() - tk0Var.getPaddingLeft()) - tk0Var.getPaddingRight();
        k2 k2Var = this.c;
        oi oiVar = k2Var.e;
        float f10 = oiVar.J;
        int i10 = (int) (((int) (width / f10)) * k2Var.O);
        int ceil = (int) Math.ceil(e / f10);
        float W1 = (org.telegram.messenger.i0.W1(f7, 0, Math.max(0, r2 - ((org.telegram.messenger.i0.q.y - tk0Var.getPaddingTop()) - tk0Var.getPaddingBottom()))) / (ceil * i10)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, oiVar.J * round) + 2;
        iArr[1] = tk0Var.getPaddingTop() + ((int) ((W1 - round) * i10));
    }

    @Override // org.telegram.ui.Components.ak0
    public final float H(tk0 tk0Var) {
        int e = e();
        float width = (tk0Var.getWidth() - tk0Var.getPaddingLeft()) - tk0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, tk0Var.computeVerticalScrollOffset() - r2.getPadding()) - tk0Var.getPaddingTop()) / ((((int) Math.ceil(e / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (org.telegram.messenger.i0.q.y - tk0Var.getPaddingTop()));
    }

    @Override // s4.g0
    public final int b() {
        return e() + 3;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0 || i10 == b() - 1) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    @Override // s4.g0
    public final int e() {
        k2 k2Var = this.c;
        ArrayList arrayList = k2Var.f0;
        int size = arrayList == null ? 0 : arrayList.size();
        return k2Var.c0 ? size + 1 : k2Var.d0 ? k2Var.b0.size() + size : size;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        k2 k2Var = this.c;
        ArrayList arrayList = k2Var.h0;
        ArrayList arrayList2 = k2Var.b0;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            ((i2) view).a = i10 == 0 ? k2Var.getPadding() : -1;
            return;
        }
        if (i11 == 2) {
            h2 h2Var = (h2) view;
            char c10 = 1;
            int i12 = 0;
            boolean z10 = i10 == 2;
            boolean z11 = i10 == 4;
            h2Var.U = z10;
            h2Var.V = z11;
            h2Var.M = new f2(this, h2Var, i12);
            h2Var.N = new f2(this, h2Var, c10 == true ? 1 : 0);
            int i13 = i10 - 2;
            if (k2Var.c0) {
                if (i13 == 0) {
                    h2Var.f(-1, false, false);
                    h2Var.e(arrayList2.size(), (n5) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (k2Var.d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    h2Var.f(-1, false, false);
                    h2Var.e(0, (n5) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = k2Var.f0;
            if (arrayList3 == null || i13 < 0 || i13 >= arrayList3.size()) {
                return;
            }
            ef efVar = (ef) k2Var.f0.get(i13);
            h2Var.f(arrayList.indexOf(efVar), !arrayList.isEmpty() || k2Var.Q, h2Var.S == efVar);
            h2Var.S = efVar;
            h2Var.g((efVar == null || !efVar.b || efVar.d()) ? null : org.telegram.messenger.i0.g0(efVar.E, false, false));
            h2Var.F = null;
            if (efVar == null) {
                h2Var.O = null;
            } else if (efVar.b) {
                StringBuilder sb2 = new StringBuilder();
                z20.q(null, 2131753933, sb2, ", ");
                sb2.append(cd.z(efVar.E));
                h2Var.O = sb2.toString();
            } else {
                h2Var.O = cd.L0(2131753948, null);
            }
            h2Var.b(efVar);
            h2Var.invalidate();
            if (k2Var.M) {
                h2Var.I.setOnClickListener(new rh.e7(this, efVar, h2Var, 7));
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        k2 k2Var = this.c;
        if (i10 == 0) {
            view = new i2(k2Var, k2Var.getContext());
        } else if (i10 == 1) {
            Context context = k2Var.getContext();
            boolean z10 = k2Var.L;
            dg0 dg0Var = new dg0(context, 21);
            dg0Var.setPadding(org.telegram.messenger.i0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(k2Var.getTitle());
            dg0Var.addView(textView, w7.b6.d(-1, -1.0f, zs.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            k2Var.i0 = dg0Var;
            view = dg0Var;
        } else {
            view = new h2(k2Var.getContext(), k2Var.b, k2Var.O, k2Var.M);
        }
        return new ck0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        k2 k2Var = this.c;
        ArrayList arrayList = k2Var.h0;
        if (c1Var.f == 2) {
            h2 h2Var = (h2) c1Var.a;
            Object obj = h2Var.S;
            if (!(obj instanceof ef)) {
                h2Var.f(-1, false, false);
            } else {
                h2Var.f(arrayList.indexOf((ef) obj), !arrayList.isEmpty() || k2Var.Q, false);
            }
        }
    }
}
