package zh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class m4 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ m4(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                i5 i5Var = this.b;
                i5Var.n = false;
                if (tL_stories_allStories == null) {
                    i5Var.q();
                    i5Var.T();
                    break;
                } else {
                    i5Var.Y(tL_stories_allStories, false, true, false);
                    i5Var.Q(false);
                    i5Var.Q(true);
                    break;
                }
        }
    }
}
