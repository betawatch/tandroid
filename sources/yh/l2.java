package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class l2 extends zh.r3 {
    public final /* synthetic */ int s1;
    public final /* synthetic */ Object t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l2(m2 m2Var, Context context, int i10, long j10, c6 c6Var, int i11) {
        super(context, i10, j10, c6Var, null);
        this.s1 = i11;
        this.t1 = m2Var;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public int getBottomInset() {
        switch (this.s1) {
            case 3:
                return ((zh.r3) this.t1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // zh.r3, org.telegram.ui.ActionBar.e3, org.telegram.ui.ActionBar.i2
    public zc getBulletinFactory() {
        switch (this.s1) {
            case 0:
                return zc.a0(((m2) this.t1).a.a);
            case 1:
                return zc.a0(((m2) this.t1).a.a);
            case 2:
                return zc.a0(((m2) this.t1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(zh.r3 r3Var, Context context, int i10, long j10, c6 c6Var, View view) {
        super(context, i10, j10, c6Var, view);
        this.s1 = 3;
        this.t1 = r3Var;
    }
}
