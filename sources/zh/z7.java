package zh;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class z7 extends ImageReceiver.Decorator {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public z7(TL_stories.StoryItem storyItem) {
        for (int i10 = 0; i10 < storyItem.media_areas.size(); i10++) {
            if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new w7(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)));
            } else if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new y7(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i10)));
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v7) arrayList.get(i10)).c(imageReceiver.getParentView());
            ((v7) arrayList.get(i10)).b(true);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v7) arrayList.get(i10)).b(false);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.Decorator
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.d = imageWidth;
        float f7 = (16.0f * imageWidth) / 9.0f;
        this.e = f7;
        this.b = centerX - (imageWidth / 2.0f);
        this.c = centerY - (f7 / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((v7) arrayList.get(i10)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
