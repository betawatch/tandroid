package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.Components.AnimatedFileNative;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vt0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ PhotoViewer d;

    public vt0(PhotoViewer photoViewer, String str, long j10, int i10) {
        this.d = photoViewer;
        this.a = str;
        this.b = j10;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.t8 != this) {
            return;
        }
        int videoBitrate = MediaController.getVideoBitrate(this.a);
        int[] iArr = new int[11];
        AnimatedFileNative.d(this.a, iArr, this.b);
        boolean z4 = iArr[10] != 0;
        this.d.g8 = (iArr[0] == 0 || (z4 && iArr[9] == 0)) ? false : true;
        PhotoViewer photoViewer = this.d;
        if (videoBitrate == -1) {
            videoBitrate = iArr[3];
        }
        photoViewer.c8 = videoBitrate;
        photoViewer.d8 = videoBitrate;
        if (this.d.g8) {
            PhotoViewer photoViewer2 = this.d;
            int i10 = iArr[1];
            photoViewer2.Y7 = i10;
            photoViewer2.a8 = i10;
            PhotoViewer photoViewer3 = this.d;
            int i11 = iArr[2];
            photoViewer3.Z7 = i11;
            photoViewer3.b8 = i11;
            PhotoViewer photoViewer4 = this.d;
            int max = Math.max(photoViewer4.Y7, this.d.Z7);
            if (max > 1280) {
                photoViewer4.V7 = 4;
            } else if (max > 854) {
                photoViewer4.V7 = 3;
            } else if (max > 640) {
                photoViewer4.V7 = 2;
            } else {
                photoViewer4.V7 = 1;
            }
            PhotoViewer photoViewer5 = this.d;
            int i12 = this.c;
            if (i12 == -1) {
                i12 = photoViewer5.v2();
            }
            photoViewer5.U7 = i12;
            PhotoViewer photoViewer6 = this.d;
            if (photoViewer6.c8 != 0 && photoViewer6.Z1 != 1) {
                Size p02 = photoViewer6.p0();
                if (p02.getWidth() == photoViewer6.Y7 && p02.getHeight() == photoViewer6.Z7) {
                    MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), photoViewer6.d8, false);
                } else {
                    MediaController.extractRealEncoderBitrate(p02.getWidth(), p02.getHeight(), MediaController.makeVideoBitrate(photoViewer6.Z7, photoViewer6.Y7, photoViewer6.d8, p02.getHeight(), p02.getWidth()), false);
                }
            }
            this.d.h8 = MediaController.isH264Video(this.a);
        }
        if (this.d.t8 != this) {
            return;
        }
        AndroidUtilities.runOnUIThread(new if0(this, this, iArr, 20));
    }
}
