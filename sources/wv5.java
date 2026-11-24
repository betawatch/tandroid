// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wv5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw5 b;

    public /* synthetic */ wv5(rw5 rw5Var, byte b) {
        this.a = b;
        this.b = rw5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        rw5 rw5Var = this.b;
        switch (b) {
            case 0:
                ijb ijbVar = rw5Var.Q0;
                if (ijbVar != null) {
                    rw5Var.Q0 = null;
                    rw5Var.removeView(ijbVar);
                    break;
                }
                break;
            case 1:
                if (rw5Var.u0 != null) {
                    rw5Var.w0.postRunnable(new wv5(rw5Var, (byte) 4), 200L);
                    break;
                }
                break;
            case 2:
                zt7 zt7Var = rw5Var.b1;
                if (zt7Var != null) {
                    zt7Var.invalidate();
                    break;
                }
                break;
            case 3:
                zt7 zt7Var2 = rw5Var.b1;
                if (zt7Var2 != null) {
                    zt7Var2.invalidate();
                    break;
                }
                break;
            case 4:
                rw5Var.k0();
                break;
            default:
                boolean z = k38.e(rw5Var.F1).k;
                int i = 0;
                while (true) {
                    List list = l01.c;
                    if (i >= list.size()) {
                        break;
                    } else {
                        l01 l01Var = (l01) list.get(i);
                        int l = z ? l01Var.l() : l01Var.d();
                        String m = l01Var.m();
                        j45 j45Var = new j45(rw5Var, l01Var, l, (byte) 3);
                        pw5 pw5Var = new pw5(rw5Var, rw5Var.getContext());
                        pw5Var.setIcon(l);
                        pw5Var.setText(m);
                        pw5Var.setSelected(false);
                        pw5Var.setOnClickListener(new b95(j45Var, (byte) 14));
                        pw5Var.setOnLongClickListener(new zs(rw5Var, (byte) 5));
                        rw5Var.I1.a(pw5Var, nme.o(-1, 48));
                        i++;
                    }
                }
        }
    }
}
