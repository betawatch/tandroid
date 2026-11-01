package th;

import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v5 {
    public int a;
    public View b;

    public v5() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, t5 t5Var) {
        int i10 = e20.s0;
        this.a = i10;
        this.b = view;
        wp r12 = wp.r1(i10);
        r12.O1().h0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = wp.r1(this.a).i1(j10);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new org.telegram.messenger.voip.c(this, j10, view, t5Var, r12));
    }
}
