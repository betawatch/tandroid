package zh;

import android.content.Context;
import android.view.View;
import bi.h7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l2 extends h7 {
    public final /* synthetic */ int B1;
    public final /* synthetic */ Object C1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m2 m2Var, Context context, int i10, long j10, u6 u6Var, int i11) {
        super(context, i10, j10, u6Var, null);
        this.B1 = i11;
        this.C1 = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public int getBottomInset() {
        switch (this.B1) {
            case 3:
                return ((h7) this.C1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // bi.h7, org.telegram.ui.ActionBar.k3, org.telegram.ui.ActionBar.n2
    public wc getBulletinFactory() {
        switch (this.B1) {
            case 0:
                return wc.b0(((m2) this.C1).a.a);
            case 1:
                return wc.b0(((m2) this.C1).a.a);
            case 2:
                return wc.b0(((m2) this.C1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(h7 h7Var, Context context, int i10, long j10, u6 u6Var, View view) {
        super(context, i10, j10, u6Var, view);
        this.B1 = 3;
        this.C1 = h7Var;
    }
}
