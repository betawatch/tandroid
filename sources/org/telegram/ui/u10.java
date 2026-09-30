package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FiltersSetupActivity b;

    public /* synthetic */ u10(FiltersSetupActivity filtersSetupActivity, int i10) {
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
                filtersSetupActivity2.a.e1(new du(filtersSetupActivity2, 9), 700, true);
                break;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) filtersSetupActivity3, 9, true));
                break;
        }
    }
}
