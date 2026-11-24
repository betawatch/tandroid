// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wx5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ry5 b;

    public /* synthetic */ wx5(ry5 ry5Var, byte b) {
        this.a = b;
        this.b = ry5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ry5 ry5Var = this.b;
        switch (b) {
            case 0:
                jlb jlbVar = ry5Var.Q0;
                if (jlbVar != null) {
                    ry5Var.Q0 = null;
                    ry5Var.removeView(jlbVar);
                    break;
                }
                break;
            case 1:
                if (ry5Var.u0 != null) {
                    ry5Var.w0.postRunnable(new wx5(ry5Var, (byte) 4), 200L);
                    break;
                }
                break;
            case 2:
                aw7 aw7Var = ry5Var.b1;
                if (aw7Var != null) {
                    aw7Var.invalidate();
                    break;
                }
                break;
            case 3:
                aw7 aw7Var2 = ry5Var.b1;
                if (aw7Var2 != null) {
                    aw7Var2.invalidate();
                    break;
                }
                break;
            case 4:
                ry5Var.k0();
                break;
            default:
                boolean z = m58.e(ry5Var.F1).k;
                int i = 0;
                while (true) {
                    List list = t11.c;
                    if (i >= list.size()) {
                        break;
                    } else {
                        t11 t11Var = (t11) list.get(i);
                        int l = z ? t11Var.l() : t11Var.d();
                        String m = t11Var.m();
                        h65 h65Var = new h65(ry5Var, t11Var, l, (byte) 3);
                        py5 py5Var = new py5(ry5Var, ry5Var.getContext());
                        py5Var.setIcon(l);
                        py5Var.setText(m);
                        py5Var.setSelected(false);
                        py5Var.setOnClickListener(new ca5(h65Var, (byte) 17));
                        py5Var.setOnLongClickListener(new au(ry5Var, (byte) 5));
                        ry5Var.I1.a(py5Var, qoe.o(-1, 48));
                        i++;
                    }
                }
        }
    }
}
