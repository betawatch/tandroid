package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ yt(DataSettingsActivity dataSettingsActivity, int i10) {
        this.a = i10;
        this.b = dataSettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                this.b.getMediaDataController().E(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i10);
                    break;
                }
                break;
            default:
                y6.j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                org.telegram.messenger.i0.h3(ytVar, 100L);
                y6.m0(new zt(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
