// default package

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
