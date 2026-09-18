package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class m2 extends yh.a4 {
    public final /* synthetic */ int r1;
    public final /* synthetic */ Object s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(n2 n2Var, Context context, int i10, long j3, f6 f6Var, int i11) {
        super(context, i10, j3, f6Var, null);
        this.r1 = i11;
        this.s1 = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public int getBottomInset() {
        switch (this.r1) {
            case 3:
                return ((yh.a4) this.s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // yh.a4, org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.k2
    public vc getBulletinFactory() {
        switch (this.r1) {
            case 0:
                return vc.a0(((n2) this.s1).a.a);
            case 1:
                return vc.a0(((n2) this.s1).a.a);
            case 2:
                return vc.a0(((n2) this.s1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(yh.a4 a4Var, Context context, int i10, long j3, f6 f6Var, View view) {
        super(context, i10, j3, f6Var, view);
        this.r1 = 3;
        this.s1 = a4Var;
    }
}
