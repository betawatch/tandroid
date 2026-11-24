// default package

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y88 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public y88(PhotoViewer photoViewer, String str, long j, int i) {
        this.d = photoViewer;
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.D8 == this) {
            int z = MediaController.z(this.a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.a, iArr, this.b);
            boolean z2 = false;
            this.d.q8 = (iArr[0] == 0 || ((iArr[10] != 0) && iArr[9] == 0)) ? false : true;
            PhotoViewer photoViewer = this.d;
            if (z == -1) {
                z = iArr[3];
            }
            photoViewer.m8 = z;
            photoViewer.n8 = z;
            if (this.d.q8) {
                PhotoViewer photoViewer2 = this.d;
                int i = iArr[1];
                photoViewer2.i8 = i;
                photoViewer2.k8 = i;
                PhotoViewer photoViewer3 = this.d;
                int i2 = iArr[2];
                photoViewer3.j8 = i2;
                photoViewer3.l8 = i2;
                PhotoViewer photoViewer4 = this.d;
                int max = Math.max(photoViewer4.i8, this.d.j8);
                if (max > 1280) {
                    photoViewer4.f8 = 4;
                } else if (max > 854) {
                    photoViewer4.f8 = 3;
                } else if (max > 640) {
                    photoViewer4.f8 = 2;
                } else {
                    photoViewer4.f8 = 1;
                }
                PhotoViewer photoViewer5 = this.d;
                int i3 = this.c;
                if (i3 == -1) {
                    i3 = photoViewer5.D1();
                }
                photoViewer5.e8 = i3;
                PhotoViewer photoViewer6 = this.d;
                if (photoViewer6.m8 != 0 && photoViewer6.d2 != 1) {
                    Size i4 = photoViewer6.i();
                    if (i4.getWidth() == photoViewer6.i8 && i4.getHeight() == photoViewer6.j8) {
                        MediaController.q(i4.getWidth(), i4.getHeight(), photoViewer6.n8, false);
                    } else {
                        MediaController.q(i4.getWidth(), i4.getHeight(), MediaController.P(photoViewer6.j8, photoViewer6.i8, photoViewer6.n8, i4.getHeight(), i4.getWidth()), false);
                    }
                }
                PhotoViewer photoViewer7 = this.d;
                String str = this.a;
                MediaExtractor mediaExtractor = new MediaExtractor();
                try {
                    try {
                        mediaExtractor.setDataSource(str);
                        int r = MediaController.r(mediaExtractor, false);
                        if (r >= 0) {
                            if (mediaExtractor.getTrackFormat(r).getString("mime").equals("video/avc")) {
                                z2 = true;
                            }
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    mediaExtractor.release();
                    photoViewer7.r8 = z2;
                } catch (Throwable th) {
                    mediaExtractor.release();
                    throw th;
                }
            }
            if (this.d.D8 != this) {
                return;
            }
            gl.d3(new pc7(this, this, iArr, (byte) 23));
        }
    }
}
