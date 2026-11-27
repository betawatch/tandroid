// default package

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn0 implements pcc {
    public final /* synthetic */ ao0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ wn0(ao0 ao0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, long j2, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = ao0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j;
        this.d = j2;
        this.e = prepaidGiveaway;
    }

    @Override // pcc
    public final void a(Object obj) {
        ao0 ao0Var = this.a;
        ao0Var.dismiss();
        if (this.b == null) {
            hl.d3(new a30(ao0Var, this.e, (byte) 13), 220L);
            return;
        }
        e S = LaunchActivity.S();
        if (S != null) {
            zu1 ha = zu1.ha(this.c);
            ha.whenFullyVisible(new xn0(ha, this.d, (byte) 0));
            S.presentFragment(ha);
        }
    }
}
