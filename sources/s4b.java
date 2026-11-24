// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class s4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4b b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ s4b(t4b t4bVar, TL_stories.PeerStories peerStories, byte b) {
        this.a = b;
        this.b = t4bVar;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_stories.PeerStories peerStories = this.c;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < peerStories.stories.size(); i++) {
                    t4bVar.l(pg3.n(peerStories.peer), peerStories.stories.get(i));
                }
                break;
            default:
                t4bVar.g(pg3.n(peerStories.peer), peerStories);
                break;
        }
    }
}
