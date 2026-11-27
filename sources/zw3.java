// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class zw3 extends nx0 implements fn7 {
    public static int C1 = 1;
    public qcc A1;
    public final ArrayList B1;
    public String l1;
    public int m1;
    public final vv3 n1;
    public final wv3 o1;
    public final ir1 p1;
    public final yw3 q1;
    public float r1;
    public final boolean s1;
    public final boolean t1;
    public boolean u1;
    public int v1;
    public yt4 w1;
    public float x1;
    public lcc y1;
    public z31 z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw3(vnb vnbVar, Context context, boolean z, boolean z2) {
        super(1, vnbVar, context, true);
        byte b = 1;
        this.l1 = null;
        this.m1 = -1;
        this.n1 = new vv3();
        this.o1 = new wv3();
        this.r1 = -1.0f;
        this.B1 = new ArrayList();
        this.s1 = z;
        this.t1 = z2;
        this.G = true;
        K(aob.v0(aob.h5, vnbVar));
        this.v1 = this.H0;
        this.x = true;
        byte b2 = 0;
        A0(false);
        this.b = new yv3(this, context);
        ir1 ir1Var = new ir1((byte) 2, context, this);
        this.p1 = ir1Var;
        ir1Var.b = z ? 0 : C1;
        ir1Var.setAdapter(new xv3(this, z, context));
        this.b.addView(ir1Var, tre.e(-1, -1, 87));
        new rx5(this.b, false, new uv3(this, b2));
        if (!z) {
            yw3 yw3Var = new yw3(context);
            this.q1 = yw3Var;
            yw3Var.H = new uv3(this, b);
            yw3Var.G = ir1Var.b;
            yw3Var.invalidate();
            this.b.addView(yw3Var, tre.e(-1, -2, 87));
        }
        jn7.f(this.a).b(this, jn7.x0);
        jn7.f(this.a).b(this, jn7.B0);
        boolean z3 = cc4.j;
        if (!z) {
            ls6.d0(this.a).D(5);
            ls6.d0(this.a).y();
            ls6.d0(this.a).X0(true, true, false, 0);
        }
        ls6.d0(this.a).D(0);
        ls6.d0(this.a).X0(false, true, false, 0);
        ls6.d0(this.a).X0(false, true, false, 2);
        ls6.d0(this.a).X0(false, true, false, 7);
    }

    @Override // nx0
    public final boolean D() {
        return this.p1.getTranslationY() >= ((float) ((int) this.r1));
    }

    public boolean E0(Integer num) {
        return true;
    }

    public boolean F0(Integer num) {
        return num.intValue() != 6;
    }

    public boolean G0(Runnable runnable) {
        return true;
    }

    public final void H0() {
        sw3 sw3Var;
        this.d = false;
        this.c.animate().translationY(0.0f).setDuration(250L).setInterpolator(hb.w).start();
        for (View view : this.p1.getViewPages()) {
            if (view instanceof ow3) {
                sw3 sw3Var2 = ((ow3) view).f;
                if (sw3Var2 != null) {
                    hl.t1(sw3Var2.e);
                }
            } else if ((view instanceof hw3) && (sw3Var = ((hw3) view).d) != null) {
                hl.t1(sw3Var.e);
            }
        }
    }

    public final void I0(int i) {
        if (E0(Integer.valueOf(i))) {
            if ((i != 1 || G0(new hl3((Object) this, i, (byte) 3))) && ((Boolean) this.A1.a(Integer.valueOf(i))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void J0() {
        ArrayList arrayList = this.B1;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xw3 xw3Var = (xw3) obj;
            boolean F0 = xw3Var.f.F0(6);
            ArrayList arrayList2 = xw3Var.c;
            int size2 = arrayList2.size();
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList2.size()) {
                    break;
                }
                byte b = ((tw3) arrayList2.get(i3)).a;
                if (b == 6) {
                    i2 = i3;
                }
                if (size2 == arrayList2.size() && (b == 1 || b == 2 || b == 3)) {
                    size2 = i3;
                }
                i3++;
            }
            if (F0 != (i2 >= 0)) {
                if (F0) {
                    arrayList2.add(size2, new uw3(xw3Var, 6, R.drawable.filled_widget_captions, ob6.M0(2131744097, null)));
                } else {
                    arrayList2.remove(i2);
                }
                xw3Var.requestLayout();
                xw3Var.invalidate();
            }
        }
    }

    public final void K0(qcc qccVar) {
        this.A1 = qccVar;
        for (View view : this.p1.getViewPages()) {
            if (view instanceof ow3) {
                nw3 nw3Var = ((ow3) view).c;
                if (nw3Var.I == null) {
                    nw3Var.D(null);
                }
            }
        }
    }

    @Override // nx0
    public final int P() {
        return this.b.getMeasuredHeight() <= 0 ? hl.q.y : (int) (this.b.getMeasuredHeight() - this.p1.getY());
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.x0;
        int i4 = jn7.B0;
        if (i == i3 || i == i4) {
            for (View view : this.p1.getViewPages()) {
                if (view instanceof ow3) {
                    ow3 ow3Var = (ow3) view;
                    if (i == i4 || ((ow3Var.a == 0 && ((Integer) objArr[0]).intValue() == 5) || (ow3Var.a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        nw3 nw3Var = ow3Var.c;
                        if (nw3Var.I == null) {
                            nw3Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        jn7.f(this.a).n(this, jn7.x0);
        jn7.f(this.a).n(this, jn7.B0);
        H0();
        super.dismiss();
        boolean z = cc4.j;
    }

    @Override // nx0
    public final void p0() {
        int v0;
        super.p0();
        try {
            if (this.G0 >= 0 || this.H0 != this.v1 || (v0 = aob.v0(aob.h5, this.J0)) == this.H0) {
                return;
            }
            this.H0 = v0;
            this.v1 = v0;
            y0(v0);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
