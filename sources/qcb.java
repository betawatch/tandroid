// default package

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class qcb extends nn5 {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public qcb(TL_stories.StoryItem storyItem) {
        for (int i = 0; i < storyItem.media_areas.size(); i++) {
            if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new ncb(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i)));
            } else if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new pcb(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i)));
            }
        }
    }

    @Override // nn5
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((mcb) arrayList.get(i)).c(imageReceiver.e);
                ((mcb) arrayList.get(i)).b(true);
            }
        }
    }
}
