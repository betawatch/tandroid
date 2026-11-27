// default package

import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pk6 implements es4 {
    public final /* synthetic */ rk6 a;

    public pk6(rk6 rk6Var) {
        this.a = rk6Var;
    }

    @Override // es4
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        rk6 rk6Var = this.a;
        rk6Var.getClass();
        entry.getClass();
        return new ok6(entry, rk6Var);
    }
}
