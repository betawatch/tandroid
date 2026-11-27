// default package

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pc8 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public pc8(PhotoViewer photoViewer, String str, long j, int i) {
        this.d = photoViewer;
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.C8 == this) {
            int C = MediaController.C(this.a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.a, iArr, this.b);
            boolean z = false;
            this.d.p8 = (iArr[0] == 0 || ((iArr[10] != 0) && iArr[9] == 0)) ? false : true;
            PhotoViewer photoViewer = this.d;
            if (C == -1) {
                C = iArr[3];
            }
            photoViewer.l8 = C;
            photoViewer.m8 = C;
            if (this.d.p8) {
                PhotoViewer photoViewer2 = this.d;
                int i = iArr[1];
                photoViewer2.h8 = i;
                photoViewer2.j8 = i;
                PhotoViewer photoViewer3 = this.d;
                int i2 = iArr[2];
                photoViewer3.i8 = i2;
                photoViewer3.k8 = i2;
                PhotoViewer photoViewer4 = this.d;
                int max = Math.max(photoViewer4.h8, this.d.i8);
                if (max > 1280) {
                    photoViewer4.e8 = 4;
                } else if (max > 854) {
                    photoViewer4.e8 = 3;
                } else if (max > 640) {
                    photoViewer4.e8 = 2;
                } else {
                    photoViewer4.e8 = 1;
                }
                PhotoViewer photoViewer5 = this.d;
                int i3 = this.c;
                if (i3 == -1) {
                    i3 = photoViewer5.E1();
                }
                photoViewer5.d8 = i3;
                PhotoViewer photoViewer6 = this.d;
                if (photoViewer6.l8 != 0 && photoViewer6.d2 != 1) {
                    Size h = photoViewer6.h();
                    if (h.getWidth() == photoViewer6.h8 && h.getHeight() == photoViewer6.i8) {
                        MediaController.s(h.getWidth(), h.getHeight(), photoViewer6.m8, false);
                    } else {
                        MediaController.s(h.getWidth(), h.getHeight(), MediaController.T(photoViewer6.i8, photoViewer6.h8, photoViewer6.m8, h.getHeight(), h.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer7 = this.d;
                String str = this.a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int t = MediaController.t(mediaExtractor, false);
                        if (t >= 0) {
                            if (mediaExtractor.getTrackFormat(t).getString("mime").equals("video/avc")) {
                                z = true;
                            }
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    mediaExtractor.release();
                    photoViewer7.q8 = z;
                } catch (Throwable th) {
                    mediaExtractor.release();
                    throw th;
                }
            }
            if (this.d.C8 != this) {
                return;
            }
            hl.c3(new sa8(this, this, iArr, (byte) 1));
        }
    }
}
