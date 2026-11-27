// default package

import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s6b {
    public int a;
    public View b;

    public s6b() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j, View view, q6b q6bVar) {
        int i = yac.t0;
        this.a = i;
        this.b = view;
        uc7 s1 = uc7.s1(i);
        s1.O1().g0(j, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = uc7.s1(this.a).j1(j);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new rr2(this, j, view, q6bVar, s1, (byte) 3));
    }
}
