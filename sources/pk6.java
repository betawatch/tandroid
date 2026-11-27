// default package

import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
