package yh;

import ai.l7;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k2 extends l7 {
    public final /* synthetic */ int B1;
    public final /* synthetic */ Object C1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(l2 l2Var, Context context, int i10, long j10, g6 g6Var, int i11) {
        super(context, i10, j10, g6Var, null);
        this.B1 = i11;
        this.C1 = l2Var;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public int getBottomInset() {
        switch (this.B1) {
            case 3:
                return ((l7) this.C1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // ai.l7, org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.k2
    public xc getBulletinFactory() {
        switch (this.B1) {
            case 0:
                return xc.a0(((l2) this.C1).a.a);
            case 1:
                return xc.a0(((l2) this.C1).a.a);
            case 2:
                return xc.a0(((l2) this.C1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l7 l7Var, Context context, int i10, long j10, g6 g6Var, View view) {
        super(context, i10, j10, g6Var, view);
        this.B1 = 3;
        this.C1 = l7Var;
    }
}
