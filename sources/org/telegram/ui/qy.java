package org.telegram.ui;

import org.telegram.messenger.DownloadController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qy implements DownloadController.FileDownloadProgressListener {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ ry d;

    public qy(ry ryVar, String str) {
        this.d = ryVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return 0;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.b = j10;
        this.a = j11;
        this.d.c();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
