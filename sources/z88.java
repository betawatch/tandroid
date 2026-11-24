// default package

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z88 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public z88(PhotoViewer photoViewer, String str, long j, int i) {
        this.d = photoViewer;
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.C8 == this) {
            int z = MediaController.z(this.a);
            int[] iArr = new int[11];
            AnimatedFileNative.d(this.a, iArr, this.b);
            boolean z2 = false;
            this.d.p8 = (iArr[0] == 0 || ((iArr[10] != 0) && iArr[9] == 0)) ? false : true;
            PhotoViewer photoViewer = this.d;
            if (z == -1) {
                z = iArr[3];
            }
            photoViewer.l8 = z;
            photoViewer.m8 = z;
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
                    Size i4 = photoViewer6.i();
                    if (i4.getWidth() == photoViewer6.h8 && i4.getHeight() == photoViewer6.i8) {
                        MediaController.q(i4.getWidth(), i4.getHeight(), photoViewer6.m8, false);
                    } else {
                        MediaController.q(i4.getWidth(), i4.getHeight(), MediaController.P(photoViewer6.i8, photoViewer6.h8, photoViewer6.m8, i4.getHeight(), i4.getWidth()), false);
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
                    photoViewer7.q8 = z2;
                } catch (Throwable th) {
                    mediaExtractor.release();
                    throw th;
                }
            }
            if (this.d.C8 != this) {
                return;
            }
            gl.c3(new pc7(this, this, iArr, (byte) 23));
        }
    }
}
