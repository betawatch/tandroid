package wg;

import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import ug.t1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements z10 {
    public final /* synthetic */ y a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ w(long j3, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, y yVar) {
        this.a = yVar;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j3;
        this.d = j10;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        y yVar = this.a;
        yVar.dismiss();
        if (this.b == null) {
            org.telegram.messenger.g0.i3(new t1(10, yVar, this.e), 220L);
            return;
        }
        e2 T = LaunchActivity.T();
        if (T != null) {
            an ua2 = an.ua(this.c);
            ua2.whenFullyVisible(new bg.j0(ua2, this.d, 7));
            T.presentFragment(ua2);
        }
    }
}
