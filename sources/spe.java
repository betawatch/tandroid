// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class spe {
    public static void a(qkb qkbVar, qkb qkbVar2, int i) {
        if (qkbVar == null || qkbVar2 == null || qkbVar == qkbVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(qkbVar.g);
        yi6 yi6Var = (yi6) qkbVar.f;
        yi6 yi6Var2 = (yi6) qkbVar2.f;
        while (yi6Var != yi6Var2) {
            sb.append(((qkb) yi6Var).g);
            yi6 yi6Var3 = (yi6) yi6Var.f;
            yi6Var.g();
            yi6Var = yi6Var3;
        }
        qkbVar.g = sb.toString();
    }

    public static void b(yi6 yi6Var, yi6 yi6Var2) {
        qkb qkbVar = null;
        qkb qkbVar2 = null;
        int i = 0;
        while (yi6Var != null) {
            if (yi6Var instanceof qkb) {
                qkbVar2 = (qkb) yi6Var;
                if (qkbVar == null) {
                    qkbVar = qkbVar2;
                }
                i = qkbVar2.g.length() + i;
            } else {
                a(qkbVar, qkbVar2, i);
                qkbVar = null;
                qkbVar2 = null;
                i = 0;
            }
            if (yi6Var == yi6Var2) {
                break;
            } else {
                yi6Var = (yi6) yi6Var.f;
            }
        }
        a(qkbVar, qkbVar2, i);
    }
}
