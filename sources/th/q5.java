package th;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ q5(r5 r5Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = r5Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r5 r5Var = this.b;
                r5Var.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.c;
                    if (i10 >= peerStories.stories.size()) {
                        break;
                    } else {
                        r5Var.l(org.telegram.messenger.o5.o(peerStories.peer), peerStories.stories.get(i10));
                        i10++;
                    }
                }
            default:
                r5 r5Var2 = this.b;
                r5Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.c;
                r5Var2.g(org.telegram.messenger.o5.o(peerStories2.peer), peerStories2);
                break;
        }
    }
}
