package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class n2 extends yh.y3 {
    public final /* synthetic */ int r1;
    public final /* synthetic */ Object s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(o2 o2Var, Context context, int i10, long j3, d6 d6Var, int i11) {
        super(context, i10, j3, d6Var, null);
        this.r1 = i11;
        this.s1 = o2Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.r1) {
            case 3:
                return ((yh.y3) this.s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // yh.y3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public yc getBulletinFactory() {
        switch (this.r1) {
            case 0:
                return yc.a0(((o2) this.s1).a.a);
            case 1:
                return yc.a0(((o2) this.s1).a.a);
            case 2:
                return yc.a0(((o2) this.s1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(yh.y3 y3Var, Context context, int i10, long j3, d6 d6Var, View view) {
        super(context, i10, j3, d6Var, view);
        this.r1 = 3;
        this.s1 = y3Var;
    }
}
