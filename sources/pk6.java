// default package

import java.util.Map;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
