package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                this.b.getMediaDataController().clearAllDrafts(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.a != null && (i10 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.o0(i10);
                    break;
                }
                break;
            default:
                c7.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                yt ytVar = new yt(dataSettingsActivity2, 1);
                AndroidUtilities.runOnUIThread(ytVar, 100L);
                c7.i0(new bi.c2(dataSettingsActivity2, ytVar, System.currentTimeMillis(), 1));
                break;
        }
    }
}
