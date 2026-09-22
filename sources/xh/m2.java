package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class m2 extends yh.z3 {
    public final /* synthetic */ int r1;
    public final /* synthetic */ Object s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2(n2 n2Var, Context context, int i10, long j3, e6 e6Var, int i11) {
        super(context, i10, j3, e6Var, null);
        this.r1 = i11;
        this.s1 = n2Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.r1) {
            case 3:
                return ((yh.z3) this.s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // yh.z3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
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
    public m2(yh.z3 z3Var, Context context, int i10, long j3, e6 e6Var, View view) {
        super(context, i10, j3, e6Var, view);
        this.r1 = 3;
        this.s1 = z3Var;
    }
}
