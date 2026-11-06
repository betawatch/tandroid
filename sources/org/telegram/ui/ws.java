package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DataSettingsActivity b;

    public /* synthetic */ ws(DataSettingsActivity dataSettingsActivity, int i7) {
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
                ws wsVar = new ws(dataSettingsActivity2, 1);
                org.telegram.messenger.g0.i3(wsVar, 100L);
                y6.m0(new bi.b2(dataSettingsActivity2, wsVar, System.currentTimeMillis(), 1));
                break;
        }
    }
}
