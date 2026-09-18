package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln b;

    public /* synthetic */ wm(ln lnVar, int i10) {
        this.a = i10;
        this.b = lnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zn znVar = this.b.a;
                znVar.d5 = null;
                znVar.e5 = null;
                break;
            case 1:
                ln lnVar = this.b;
                lnVar.getClass();
                zn znVar2 = lnVar.a;
                new rg.x0((org.telegram.ui.ActionBar.n2) znVar2, 8, true).show();
                znVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                ln lnVar2 = this.b;
                lnVar2.getClass();
                zn znVar3 = lnVar2.a;
                new rg.x0((org.telegram.ui.ActionBar.n2) znVar3, 8, true).show();
                znVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                ln lnVar3 = this.b;
                lnVar3.getClass();
                zn znVar4 = lnVar3.a;
                new rg.x0((org.telegram.ui.ActionBar.n2) znVar4, 8, true).show();
                znVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                zn znVar5 = this.b.a;
                znVar5.d5 = null;
                znVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.H0();
                break;
            case 7:
                this.b.a.Y.H0();
                break;
            case 8:
                zn znVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                znVar6.presentFragment(themeActivity);
                break;
            default:
                zn znVar7 = this.b.a;
                znVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar7, 39, false));
                break;
        }
    }
}
