// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class yke {
    public static void a(ugb ugbVar, ugb ugbVar2, int i) {
        if (ugbVar == null || ugbVar2 == null || ugbVar == ugbVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(ugbVar.g);
        tg6 tg6Var = (tg6) ugbVar.f;
        tg6 tg6Var2 = (tg6) ugbVar2.f;
        while (tg6Var != tg6Var2) {
            sb.append(((ugb) tg6Var).g);
            tg6 tg6Var3 = (tg6) tg6Var.f;
            tg6Var.g();
            tg6Var = tg6Var3;
        }
        ugbVar.g = sb.toString();
    }

    public static void b(tg6 tg6Var, tg6 tg6Var2) {
        ugb ugbVar = null;
        ugb ugbVar2 = null;
        int i = 0;
        while (tg6Var != null) {
            if (tg6Var instanceof ugb) {
                ugbVar2 = (ugb) tg6Var;
                if (ugbVar == null) {
                    ugbVar = ugbVar2;
                }
                i = ugbVar2.g.length() + i;
            } else {
                a(ugbVar, ugbVar2, i);
                ugbVar = null;
                ugbVar2 = null;
                i = 0;
            }
            if (tg6Var == tg6Var2) {
                break;
            } else {
                tg6Var = (tg6) tg6Var.f;
            }
        }
        a(ugbVar, ugbVar2, i);
    }
}
