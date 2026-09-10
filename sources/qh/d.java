package qh;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d extends ph.e {
    public final MediaController.PhotoEntry b;
    public final SendMessagesHelper.SendingMediaInfo c;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(SendMessagesHelper.SendingMediaInfo sendingMediaInfo) {
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        this.c = sendingMediaInfo;
        MediaController.PhotoEntry photoEntry = sendingMediaInfo.originalPhotoEntry;
        this.b = photoEntry;
        this.a.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setOrientation(0, true);
        String str = photoEntry.coverPath;
        if (str != null) {
            imageLocation = ImageLocation.getForPath(str);
        } else {
            String str2 = photoEntry.thumbPath;
            if (str2 != null) {
                imageLocation = ImageLocation.getForPath(str2);
            } else if (photoEntry.path == null) {
                imageReceiver.clearImage();
                imageLocation = null;
            } else {
                if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                    ImageLocation forPath = ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path);
                    imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                    imageLocation2 = forPath;
                    if (imageLocation2 == null) {
                        imageReceiver.setImage(imageLocation2, null, null, null, null, 0);
                        return;
                    } else {
                        imageReceiver.clearImage();
                        return;
                    }
                }
                imageLocation = ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path);
            }
        }
        imageLocation2 = imageLocation;
        if (imageLocation2 == null) {
        }
    }

    @Override // ph.e
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
