package th;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t7 extends lc {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public t7(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new q7(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new s7(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override // org.telegram.messenger.lc
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((p7) arrayList.get(i10)).c(imageReceiver.e);
            ((p7) arrayList.get(i10)).b(true);
        }
    }
}
