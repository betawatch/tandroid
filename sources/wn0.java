// default package

import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn0 implements p8c {
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

    @Override // p8c
    public final void a(Object obj) {
        ao0 ao0Var = this.a;
        ao0Var.dismiss();
        if (this.b == null) {
            gl.d3(new z20(ao0Var, this.e, (byte) 13), 220L);
            return;
        }
        d S = LaunchActivity.S();
        if (S != null) {
            mu1 W9 = mu1.W9(this.c);
            W9.whenFullyVisible(new xn0(W9, this.d, (byte) 0));
            S.presentFragment(W9);
        }
    }
}
