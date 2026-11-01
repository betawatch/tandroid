package vh;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.ff;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.bg0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g2 extends bk0 {
    public final /* synthetic */ k2 c;

    public g2(k2 k2Var) {
        this.c = k2Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 2;
    }

    @Override // org.telegram.ui.Components.bk0
    public final String F(int i10) {
        ff ffVar;
        int i11 = i10 - 2;
        k2 k2Var = this.c;
        if (k2Var.c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (k2Var.d0) {
            if (i11 >= 0 && i11 < k2Var.b0.size()) {
                return dd.e0(((n5) k2Var.b0.get(i11)).d / 1000, true);
            }
            i11 -= k2Var.b0.size();
        }
        ArrayList arrayList = k2Var.f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (ffVar = (ff) k2Var.f0.get(i11)) == null) {
            return null;
        }
        long j10 = ffVar.D;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return dd.e0(j10, true);
    }

    @Override // org.telegram.ui.Components.bk0
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int e = e();
        float width = (uk0Var.getWidth() - uk0Var.getPaddingLeft()) - uk0Var.getPaddingRight();
        k2 k2Var = this.c;
        oi oiVar = k2Var.e;
        float f10 = oiVar.J;
        int i10 = (int) (((int) (width / f10)) * k2Var.O);
        int ceil = (int) Math.ceil(e / f10);
        float W1 = (org.telegram.messenger.i0.W1(f7, 0, Math.max(0, r2 - ((org.telegram.messenger.i0.q.y - uk0Var.getPaddingTop()) - uk0Var.getPaddingBottom()))) / (ceil * i10)) * ceil;
        int round = Math.round(W1);
        iArr[0] = Math.max(0, oiVar.J * round) + 2;
        iArr[1] = uk0Var.getPaddingTop() + ((int) ((W1 - round) * i10));
    }

    @Override // org.telegram.ui.Components.bk0
    public final float H(uk0 uk0Var) {
        int e = e();
        float width = (uk0Var.getWidth() - uk0Var.getPaddingLeft()) - uk0Var.getPaddingRight();
        float f7 = this.c.e.J;
        return (Math.max(0, uk0Var.computeVerticalScrollOffset() - r2.getPadding()) - uk0Var.getPaddingTop()) / ((((int) Math.ceil(e / f7)) * ((int) (((int) (width / f7)) * r2.O))) - (org.telegram.messenger.i0.q.y - uk0Var.getPaddingTop()));
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
            ff ffVar = (ff) k2Var.f0.get(i13);
            h2Var.f(arrayList.indexOf(ffVar), !arrayList.isEmpty() || k2Var.Q, h2Var.S == ffVar);
            h2Var.S = ffVar;
            h2Var.g((ffVar == null || !ffVar.b || ffVar.d()) ? null : org.telegram.messenger.i0.g0(ffVar.E, false, false));
            h2Var.F = null;
            if (ffVar == null) {
                h2Var.O = null;
            } else if (ffVar.b) {
                StringBuilder sb2 = new StringBuilder();
                a30.q(null, 2131753933, sb2, ", ");
                sb2.append(dd.z(ffVar.E));
                h2Var.O = sb2.toString();
            } else {
                h2Var.O = dd.L0(2131753948, null);
            }
            h2Var.b(ffVar);
            h2Var.invalidate();
            if (k2Var.M) {
                h2Var.I.setOnClickListener(new rh.e7(this, ffVar, h2Var, 7));
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
            bg0 bg0Var = new bg0(context, 21);
            bg0Var.setPadding(org.telegram.messenger.i0.L(z10 ? 14.0f : 16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(org.telegram.messenger.i0.o());
            textView.setText(k2Var.getTitle());
            bg0Var.addView(textView, w7.b6.d(-1, -1.0f, at.E1, 0.0f, 0.0f, z10 ? 32.0f : 0.0f, 0.0f));
            k2Var.i0 = bg0Var;
            view = bg0Var;
        } else {
            view = new h2(k2Var.getContext(), k2Var.b, k2Var.O, k2Var.M);
        }
        return new dk0(view);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        k2 k2Var = this.c;
        ArrayList arrayList = k2Var.h0;
        if (c1Var.f == 2) {
            h2 h2Var = (h2) c1Var.a;
            Object obj = h2Var.S;
            if (!(obj instanceof ff)) {
                h2Var.f(-1, false, false);
            } else {
                h2Var.f(arrayList.indexOf((ff) obj), !arrayList.isEmpty() || k2Var.Q, false);
            }
        }
    }
}
