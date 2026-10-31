package th;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q3 {
    public final int a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public q3(int i10) {
        this.a = i10;
        this.b = null;
        this.c = null;
    }

    public q3(TL_stories.StoryView storyView) {
        this.a = 1;
        this.b = storyView;
        this.c = null;
    }

    public q3(TL_stories.StoryReaction storyReaction) {
        this.a = 1;
        this.b = null;
        this.c = storyReaction;
    }
}
