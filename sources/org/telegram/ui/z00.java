package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ z00(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.a = i10;
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
                filtersSetupActivity2.a.e1(new st(filtersSetupActivity2, 11), 700, true);
                break;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) filtersSetupActivity3, 9, true));
                break;
            default:
                this.b.getMessagesController().a3(true, null);
                break;
        }
    }
}
