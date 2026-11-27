// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        vf7 vf7Var = ko4Var.m;
        vf7 vf7Var2 = null;
        if (vf7Var != null) {
            tf7[] tf7VarArr = vf7Var.a;
            int length = tf7VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                tf7 tf7Var = tf7VarArr[i2];
                if ((tf7Var instanceof ym8) && "com.apple.streaming.transportStreamTimestamp".equals(((ym8) tf7Var).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    tf7[] tf7VarArr2 = new tf7[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            tf7VarArr2[i < i2 ? i : i - 1] = tf7VarArr[i];
                        }
                        i++;
                    }
                    vf7Var2 = new vf7(tf7VarArr2);
                }
            }
            if (hr3Var2 == ko4Var.x || vf7Var != ko4Var.m) {
                jo4 a = ko4Var.a();
                a.w = hr3Var2;
                a.l = vf7Var;
                ko4Var = new ko4(a);
            }
            return super.q(ko4Var);
        }
        vf7Var = vf7Var2;
        if (hr3Var2 == ko4Var.x) {
        }
        jo4 a2 = ko4Var.a();
        a2.w = hr3Var2;
        a2.l = vf7Var;
        ko4Var = new ko4(a2);
        return super.q(ko4Var);
    }
}
