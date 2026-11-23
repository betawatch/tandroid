package wg;

import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements w10 {
    public final /* synthetic */ z a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ x(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, z zVar) {
        this.a = zVar;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        z zVar = this.a;
        zVar.dismiss();
        if (this.b == null) {
            org.telegram.messenger.g0.h3(new v9.b(8, zVar, this.e), 220L);
            return;
        }
        g2 T = LaunchActivity.T();
        if (T != null) {
            bn ua2 = bn.ua(this.c);
            ua2.whenFullyVisible(new bg.k0(ua2, this.d, 7));
            T.presentFragment(ua2);
        }
    }
}
