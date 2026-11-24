// default package

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s0a extends mz0 implements jm7 {
    public final f84 S1;
    public final b61 T1;
    public final z3b U1;
    public final HashMap V1;
    public final int W1;
    public int X1;
    public l7c Y1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s0a(d dVar, long j, int i, js7 js7Var) {
        super(r2, dVar, new lz0(r3));
        Activity parentActivity = dVar.getParentActivity();
        lz0 lz0Var = new lz0();
        lz0Var.a = false;
        lz0Var.c = false;
        lz0Var.f = 2;
        lz0Var.g = dVar.getResourceProvider();
        this.V1 = new HashMap();
        this.W1 = i;
        z3b z = oc7.r1(dVar.getCurrentAccount()).N1().z(1, -1, j, true);
        this.U1 = z;
        z.p(30, false);
        this.E1 = gm.L(12.0f);
        J();
        T0();
        FrameLayout frameLayout = new FrameLayout(getContext());
        anb.h(cmb.g5, this.J0, frameLayout);
        int i2 = this.u0;
        frameLayout.setPadding(i2, 0, i2, 0);
        this.b.addView(frameLayout, qoe.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        anb.h(cmb.c7, this.J0, view);
        frameLayout.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 55));
        b61 b61Var = new b61(this.J0, getContext(), true);
        this.T1 = b61Var;
        b61Var.i(jb6.M0(2131744487, null), false, true);
        b61Var.setEnabled(false);
        byte b = 7;
        b61Var.setOnClickListener(new r39(this, js7Var, b));
        frameLayout.addView(b61Var, qoe.d(-1, 48.0f, nm7.D1, 10.0f, (1.0f / gm.p) + 10.0f, 10.0f, 10.0f));
        getContext();
        f84 f84Var = new f84(i, false);
        this.S1 = f84Var;
        f84Var.O = new zr1(this, (byte) 16);
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, 0);
        this.n1.setSelectorType(9);
        this.n1.setSelectorDrawableColor(0);
        this.n1.setLayoutManager(f84Var);
        this.n1.setOnItemClickListener(new s19(this, b));
        this.n1.setOnItemLongClickListener(new yf9(this, (byte) 15));
        this.n1.setOnScrollListener(new so7(this, (byte) 18));
        this.Y1.O(true);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.a, 0, false, new vh8(this, (byte) 19), this.J0);
        this.Y1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131744487, null);
    }

    public final void Y0() {
        f84 f84Var = this.S1;
        int K0 = f84Var.K0();
        int abs = K0 == -1 ? 0 : Math.abs(f84Var.M0() - K0) + 1;
        z3b z3bVar = this.U1;
        if (z3bVar != null) {
            int i = K0 + abs;
            int i2 = z3bVar.i();
            int i3 = this.W1;
            if (i > i2 - i3) {
                z3bVar.p(Math.min(100, Math.max(1, i3 / 2) * i3 * i3), false);
            }
        }
    }

    public final boolean Z0(int i, View view) {
        c6c G;
        l7c l7cVar = this.Y1;
        if (l7cVar == null || i == 0 || (G = l7cVar.G(i - 1)) == null) {
            return false;
        }
        Object obj = G.H;
        if (obj instanceof k47) {
            k47 k47Var = (k47) obj;
            int e1 = k47Var.e1();
            Integer valueOf = Integer.valueOf(e1);
            HashMap hashMap = this.V1;
            if (hashMap.containsKey(valueOf)) {
                hashMap.remove(Integer.valueOf(e1));
                G.e = false;
                ((sha) view).i(false, true);
            } else {
                hashMap.put(Integer.valueOf(e1), k47Var.l);
                G.e = true;
                ((sha) view).i(true, true);
            }
            boolean z = !hashMap.isEmpty();
            b61 b61Var = this.T1;
            b61Var.setEnabled(z);
            b61Var.c(hashMap.size(), true);
        }
        return true;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B5 && ((z3b) objArr[0]) == this.U1) {
            this.Y1.O(false);
            Y0();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = this.U1.o();
        nm7.f(this.a).b(this, nm7.B5);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1.z(this.X1);
        nm7.f(this.a).n(this, nm7.B5);
    }
}
