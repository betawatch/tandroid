package zh;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class k7 extends q {
    public final /* synthetic */ u7 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(u7 u7Var, int i10, Context context, u7 u7Var2, b bVar) {
        super(context);
        this.Q0 = u7Var;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new sg.a1(this, 11);
        this.O0 = -1;
        this.y0 = i10;
        this.H0 = new y2(context);
        this.N0 = u7Var2;
        c6 c6Var = new c6(this, context, u7Var2, bVar);
        this.z0 = c6Var;
        setAdapter(c6Var);
        th.e eVar = new th.e(this, 25);
        boolean z10 = this.m0 == null;
        this.m0 = eVar;
        setChildrenDrawingOrderEnabled(true);
        this.o0 = 1;
        this.n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new d6(this, u7Var2));
        setOverScrollMode(2);
    }
}
