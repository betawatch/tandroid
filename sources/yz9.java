// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class yz9 {
    public final byte a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public yz9(TL_stories.StoryView storyView) {
        this.a = (byte) 1;
        this.b = storyView;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yz9(int i) {
        this.a = i;
        this.b = null;
        this.c = null;
    }

    public yz9(TL_stories.StoryReaction storyReaction) {
        this.a = (byte) 1;
        this.b = null;
        this.c = storyReaction;
    }
}
