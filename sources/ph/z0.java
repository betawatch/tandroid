package ph;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.c81;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class z0 extends c81 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ y1 c;

    public z0(y1 y1Var, boolean z4, Context context) {
        this.c = y1Var;
        this.a = z4;
        this.b = context;
    }

    @Override // org.telegram.ui.Components.c81
    public final void b(View view, int i10, int i11) {
        i1 i1Var = (i1) view;
        if (this.a) {
            i10 = 1;
        }
        i1Var.a(i10);
    }

    @Override // org.telegram.ui.Components.c81
    public final View d(int i10) {
        Context context = this.b;
        y1 y1Var = this.c;
        return i10 == 1 ? new h1(y1Var, context) : new n1(y1Var, context);
    }

    @Override // org.telegram.ui.Components.c81
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // org.telegram.ui.Components.c81
    public final int h(int i10) {
        return (i10 == 0 || i10 == 1) ? 0 : 1;
    }
}
