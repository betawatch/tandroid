package org.telegram.ui;

import android.media.MediaExtractor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class up0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public up0(PhotoViewer photoViewer, String str, long j10, int i3) {
        this.d = photoViewer;
        this.a = str;
        this.b = j10;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.y8 != this) {
            return;
        }
        int E = MediaController.E(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z10 = false;
        this.d.l8 = (iArr[0] == 0 || ((iArr[10] != 0) && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (E == -1) {
            E = iArr[3];
        }
        photoViewer.h8 = E;
        photoViewer.i8 = E;
        if (this.d.l8) {
            PhotoViewer photoViewer2 = this.d;
            int i3 = iArr[1];
            photoViewer2.d8 = i3;
            photoViewer2.f8 = i3;
            PhotoViewer photoViewer3 = this.d;
            int i10 = iArr[2];
            photoViewer3.e8 = i10;
            photoViewer3.g8 = i10;
            PhotoViewer photoViewer4 = this.d;
            int max = Math.max(photoViewer4.d8, this.d.e8);
            if (max > 1280) {
                photoViewer4.a8 = 4;
            } else if (max > 854) {
                photoViewer4.a8 = 3;
            } else if (max > 640) {
                photoViewer4.a8 = 2;
            } else {
                photoViewer4.a8 = 1;
            }
            PhotoViewer photoViewer5 = this.d;
            int i11 = this.c;
            if (i11 == -1) {
                i11 = photoViewer5.y2();
            }
            photoViewer5.Z7 = i11;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.h8 != 0 && photoViewer6.d2 != 1) {
                Size q02 = photoViewer6.q0();
                if (q02.getWidth() == photoViewer6.d8 && q02.getHeight() == photoViewer6.e8) {
                    MediaController.v(q02.getWidth(), q02.getHeight(), photoViewer6.i8, false);
                } else {
                    MediaController.v(q02.getWidth(), q02.getHeight(), MediaController.Q(photoViewer6.e8, photoViewer6.d8, photoViewer6.i8, q02.getHeight(), q02.getWidth()), false);
                }
            }
            PhotoViewer photoViewer7 = this.d;
            String str = this.a;
            MediaExtractor mediaExtractor = new MediaExtractor();
            try {
                try {
                    mediaExtractor.setDataSource(str);
                    int w10 = MediaController.w(mediaExtractor, false);
                    if (w10 >= 0) {
                        if (mediaExtractor.getTrackFormat(w10).getString("mime").equals("video/avc")) {
                            z10 = true;
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                photoViewer7.m8 = z10;
            } finally {
                mediaExtractor.release();
            }
        }
        if (this.d.y8 != this) {
            return;
        }
        org.telegram.messenger.g0.h3(new hc0(this, this, iArr, 23));
    }
}
