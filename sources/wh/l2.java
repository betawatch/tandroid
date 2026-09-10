package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class l2 extends xh.x3 {
    public final /* synthetic */ int r1;
    public final /* synthetic */ Object s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m2 m2Var, Context context, int i10, long j3, f6 f6Var, int i11) {
        super(context, i10, j3, f6Var, null);
        this.r1 = i11;
        this.s1 = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public int getBottomInset() {
        switch (this.r1) {
            case 3:
                return ((xh.x3) this.s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // xh.x3, org.telegram.ui.ActionBar.h3, org.telegram.ui.ActionBar.l2
    public wc getBulletinFactory() {
        switch (this.r1) {
            case 0:
                return wc.a0(((m2) this.s1).a.a);
            case 1:
                return wc.a0(((m2) this.s1).a.a);
            case 2:
                return wc.a0(((m2) this.s1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(xh.x3 x3Var, Context context, int i10, long j3, f6 f6Var, View view) {
        super(context, i10, j3, f6Var, view);
        this.r1 = 3;
        this.s1 = x3Var;
    }
}
