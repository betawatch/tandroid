// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r2b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s2b b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ r2b(s2b s2bVar, TL_stories.PeerStories peerStories, byte b) {
        this.a = b;
        this.b = s2bVar;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_stories.PeerStories peerStories = this.c;
        s2b s2bVar = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < peerStories.stories.size(); i++) {
                    s2bVar.l(cf3.n(peerStories.peer), peerStories.stories.get(i));
                }
                break;
            default:
                s2bVar.g(cf3.n(peerStories.peer), peerStories);
                break;
        }
    }
}
