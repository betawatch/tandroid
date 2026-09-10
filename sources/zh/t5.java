package zh;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v5 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ t5(v5 v5Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = v5Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v5 v5Var = this.b;
                v5Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                v5Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                v5 v5Var2 = this.b;
                v5Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        v5Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
