package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ zs(DataSettingsActivity dataSettingsActivity, int i7) {
        this.a = i7;
        this.b = dataSettingsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        switch (this.a) {
            case 0:
                this.b.getMediaDataController().E(true);
                break;
            case 1:
                DataSettingsActivity dataSettingsActivity = this.b;
                dataSettingsActivity.W = true;
                if (dataSettingsActivity.a != null && (i7 = dataSettingsActivity.s) >= 0) {
                    dataSettingsActivity.s0(i7);
                    break;
                }
                break;
            default:
                y6.j0 = null;
                DataSettingsActivity dataSettingsActivity2 = this.b;
                zs zsVar = new zs(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(zsVar, 100L);
                y6.m0(new bi.b2(dataSettingsActivity2, zsVar, System.currentTimeMillis(), 1));
                break;
        }
    }
}
