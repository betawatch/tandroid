package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ zz(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.a = i7;
        this.b = filtersSetupActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.b;
                filtersSetupActivity2.a.e1(new wr(filtersSetupActivity2, 12), 700, true);
                break;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity3, 9, true));
                break;
            default:
                this.b.getMessagesController().c3(true, null);
                break;
        }
    }
}
