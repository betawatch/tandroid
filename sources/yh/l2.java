package yh;

import ai.k7;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class l2 extends k7 {
    public final /* synthetic */ int B1;
    public final /* synthetic */ Object C1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m2 m2Var, Context context, int i10, long j10, d6 d6Var, int i11) {
        super(context, i10, j10, d6Var, null);
        this.B1 = i11;
        this.C1 = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.B1) {
            case 3:
                return ((k7) this.C1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // ai.k7, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public xc getBulletinFactory() {
        switch (this.B1) {
            case 0:
                return xc.a0(((m2) this.C1).a.a);
            case 1:
                return xc.a0(((m2) this.C1).a.a);
            case 2:
                return xc.a0(((m2) this.C1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(k7 k7Var, Context context, int i10, long j10, d6 d6Var, View view) {
        super(context, i10, j10, d6Var, view);
        this.B1 = 3;
        this.C1 = k7Var;
    }
}
