package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n2 extends yh.s3 {
    public final /* synthetic */ int s1;
    public final /* synthetic */ Object t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(o2 o2Var, Context context, int i10, long j3, e6 e6Var, int i11) {
        super(context, i10, j3, e6Var, null);
        this.s1 = i11;
        this.t1 = o2Var;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public int getBottomInset() {
        switch (this.s1) {
            case 3:
                return ((yh.s3) this.t1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override // yh.s3, org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.j2
    public ad getBulletinFactory() {
        switch (this.s1) {
            case 0:
                return ad.a0(((o2) this.t1).a.a);
            case 1:
                return ad.a0(((o2) this.t1).a.a);
            case 2:
                return ad.a0(((o2) this.t1).a.a);
            default:
                return super.getBulletinFactory();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(yh.s3 s3Var, Context context, int i10, long j3, e6 e6Var, View view) {
        super(context, i10, j3, e6Var, view);
        this.s1 = 3;
        this.t1 = s3Var;
    }
}
