// default package

import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uh5 extends ys9 {
    public final Map K;
    public hr3 L;

    public uh5(rx6 rx6Var, pr3 pr3Var, mr3 mr3Var, Map map) {
        super(rx6Var, pr3Var, mr3Var);
        this.K = map;
    }

    @Override // ys9
    public final ko4 q(ko4 ko4Var) {
        hr3 hr3Var;
        hr3 hr3Var2 = this.L;
        if (hr3Var2 == null) {
            hr3Var2 = ko4Var.x;
        }
        if (hr3Var2 != null && (hr3Var = (hr3) this.K.get(hr3Var2.c)) != null) {
            hr3Var2 = hr3Var;
        }
        uf7 uf7Var = ko4Var.m;
        uf7 uf7Var2 = null;
        if (uf7Var != null) {
            sf7[] sf7VarArr = uf7Var.a;
            int length = sf7VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                sf7 sf7Var = sf7VarArr[i2];
                if ((sf7Var instanceof ym8) && "com.apple.streaming.transportStreamTimestamp".equals(((ym8) sf7Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    sf7[] sf7VarArr2 = new sf7[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            sf7VarArr2[i < i2 ? i : i - 1] = sf7VarArr[i];
                        }
                        i++;
                    }
                    uf7Var2 = new uf7(sf7VarArr2);
                }
            }
            if (hr3Var2 == ko4Var.x || uf7Var != ko4Var.m) {
                jo4 a = ko4Var.a();
                a.w = hr3Var2;
                a.l = uf7Var;
                ko4Var = new ko4(a);
            }
            return super.q(ko4Var);
        }
        uf7Var = uf7Var2;
        if (hr3Var2 == ko4Var.x) {
        }
        jo4 a2 = ko4Var.a();
        a2.w = hr3Var2;
        a2.l = uf7Var;
        ko4Var = new ko4(a2);
        return super.q(ko4Var);
    }
}
