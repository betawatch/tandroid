// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qy9 extends fy0 implements gk7 {
    public final w64 S1;
    public final u41 T1;
    public final y1b U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public l5c Y1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qy9(d dVar, long j, int i, gq7 gq7Var) {
        super(r2, dVar, new ey0(r3));
        Activity parentActivity = dVar.getParentActivity();
        ey0 ey0Var = new ey0();
        ey0Var.a = false;
        ey0Var.c = false;
        ey0Var.f = 2;
        ey0Var.g = dVar.getResourceProvider();
        this.V1 = new HashMap();
        this.W1 = i;
        y1b z = na7.q1(dVar.getCurrentAccount()).M1().z(1, -1, j, true);
        this.U1 = z;
        z.p(30, false);
        this.E1 = gl.L(12.0f);
        K();
        T0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        zkb.h(bkb.g5, this.J0, frameLayout);
        int i2 = this.u0;
        frameLayout.setPadding(i2, 0, i2, 0);
        this.b.addView(frameLayout, nme.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        zkb.h(bkb.c7, this.J0, view);
        frameLayout.addView(view, nme.a(-1.0f, 1.0f / gl.p, 55));
        u41 u41Var = new u41(this.J0, getContext(), true);
        this.T1 = u41Var;
        u41Var.i(k96.M0(2131744561, null), false, true);
        u41Var.setEnabled(false);
        byte b = 6;
        u41Var.setOnClickListener(new b99(this, gq7Var, b));
        frameLayout.addView(u41Var, nme.d(-1, 48.0f, kk7.D1, 10.0f, (1.0f / gl.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        w64 w64Var = new w64(i, false);
        this.S1 = w64Var;
        w64Var.O = new nq1(this, (byte) 16);
        o39 o39Var = this.n1;
        int i3 = this.u0;
        o39Var.setPadding(i3, 0, i3, 0);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(w64Var);
        this.n1.setOnItemClickListener(new f09(this, b));
        this.n1.setOnItemLongClickListener(new wh9(this, (byte) 11));
        this.n1.setOnScrollListener(new n58(this, (byte) 17));
        this.Y1.O(true);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(o39Var, getContext(), this.a, 0, false, new tf8(this, (byte) 19), this.J0);
        this.Y1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override // fy0
    public final CharSequence J0() {
        return k96.M0(2131744561, null);
    }

    public final void Y0() {
        w64 w64Var = this.S1;
        int K0 = w64Var.K0();
        int abs = K0 == -1 ? 0 : Math.abs(w64Var.M0() - K0) + 1;
        y1b y1bVar = this.U1;
        if (y1bVar != null) {
            int i = K0 + abs;
            int i2 = y1bVar.i();
            int i3 = this.W1;
            if (i > i2 - i3) {
                y1bVar.p(Math.min(100, Math.max(1, i3 / 2) * i3 * i3), false);
            }
        }
    }

    public final boolean Z0(int i, View view) {
        c4c G;
        l5c l5cVar = this.Y1;
        if (l5cVar == null || i == 0 || (G = l5cVar.G(i - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            int e1 = k27Var.e1();
            Integer valueOf = Integer.valueOf(e1);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e1));
                G.e = false;
                ((qfa) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e1), k27Var.l);
                G.e = true;
                ((qfa) view).i(true, true);
            }
            boolean z = !hashMap.isEmpty();
            u41 u41Var = this.T1;
            u41Var.setEnabled(z);
            u41Var.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.z5 && ((y1b) objArr[0]) == this.U1) {
            this.Y1.O(false);
            Y0();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        kk7.f(this.a).b(this, kk7.z5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        kk7.f(this.a).n(this, kk7.z5);
    }
}
