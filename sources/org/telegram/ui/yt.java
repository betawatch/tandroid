package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ yt(DataSettingsActivity dataSettingsActivity, int i9) {
        this.a = i9;
        this.b = dataSettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        switch (this.a) {
            case 0:
                this.b.getMediaDataController().clearAllDrafts(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.b;
                dataSettingsActivity.T = true;
                if (dataSettingsActivity.a != null && (i9 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.m0(i9);
                    break;
                }
                break;
            default:
                y6.i0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ytVar, 100L);
                y6.i0(new zt(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
