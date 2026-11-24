// default package

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wo0 implements qac {
    public final /* synthetic */ ap0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ wo0(ap0 ap0Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j, long j2, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = ap0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j;
        this.d = j2;
        this.e = prepaidGiveaway;
    }

    @Override // qac
    public final void a(Object obj) {
        ap0 ap0Var = this.a;
        ap0Var.dismiss();
        if (this.b == null) {
            gm.d3(new x30(ap0Var, this.e, (byte) 14), 220L);
            return;
        }
        d S = LaunchActivity.S();
        if (S != null) {
            yv1 ga = yv1.ga(this.c);
            ga.whenFullyVisible(new xo0(ga, this.d, (byte) 0));
            S.presentFragment(ga);
        }
    }
}
