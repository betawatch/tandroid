package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ zt(DataSettingsActivity dataSettingsActivity, int i10) {
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
                    dataSettingsActivity.r0(i10);
                    break;
                }
                break;
            default:
                y6.j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                zt ztVar = new zt(dataSettingsActivity2, 1);
                org.telegram.messenger.i0.h3(ztVar, 100L);
                y6.l0(new au(dataSettingsActivity2, ztVar, System.currentTimeMillis(), 0));
                break;
        }
    }
}
