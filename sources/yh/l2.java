package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l2 extends zh.w3 {
    public final /* synthetic */ int r1;
    public final /* synthetic */ Object s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m2 m2Var, Context context, int i10, long j3, f6 f6Var, int i11) {
        super(context, i10, j3, f6Var, null);
        this.r1 = i11;
        this.s1 = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.r1) {
            case 3:
                return ((zh.w3) this.s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // zh.w3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public yc getBulletinFactory() {
        switch (this.r1) {
            case 0:
                return yc.a0(((m2) this.s1).a.a);
            case 1:
                return yc.a0(((m2) this.s1).a.a);
            case 2:
                return yc.a0(((m2) this.s1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(zh.w3 w3Var, Context context, int i10, long j3, f6 f6Var, View view) {
        super(context, i10, j3, f6Var, view);
        this.r1 = 3;
        this.s1 = w3Var;
    }
}
