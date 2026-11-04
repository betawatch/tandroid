package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ us(DataSettingsActivity dataSettingsActivity, int i3) {
        this.a = i3;
        this.b = dataSettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        switch (this.a) {
            case 0:
                this.b.getMediaDataController().E(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.b;
                dataSettingsActivity.X = true;
                if (dataSettingsActivity.a != null && (i3 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i3);
                    break;
                }
                break;
            default:
                z6.k0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                us usVar = new us(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(usVar, 100L);
                z6.m0(new ci.u1(dataSettingsActivity2, usVar, System.currentTimeMillis(), 1));
                break;
        }
    }
}
