package wg;

import org.telegram.messenger.c20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements c20 {
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

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        z zVar = this.a;
        zVar.dismiss();
        if (this.b == null) {
            org.telegram.messenger.g0.i3(new u9.f(21, zVar, this.e), 220L);
            return;
        }
        f2 T = LaunchActivity.T();
        if (T != null) {
            cn ta2 = cn.ta(this.c);
            ta2.whenFullyVisible(new bg.j0(ta2, this.d, 7));
            T.presentFragment(ta2);
        }
    }
}
