package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                znVar.a5 = null;
                znVar.b5 = null;
                break;
            case 1:
                ln lnVar = this.b;
                lnVar.getClass();
                zn znVar2 = lnVar.a;
                new eg.o1((org.telegram.ui.ActionBar.p2) znVar2, 8, true).show();
                znVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                ln lnVar2 = this.b;
                lnVar2.getClass();
                zn znVar3 = lnVar2.a;
                new eg.o1((org.telegram.ui.ActionBar.p2) znVar3, 8, true).show();
                znVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                ln lnVar3 = this.b;
                lnVar3.getClass();
                zn znVar4 = lnVar3.a;
                new eg.o1((org.telegram.ui.ActionBar.p2) znVar4, 8, true).show();
                znVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                zn znVar5 = this.b.a;
                znVar5.a5 = null;
                znVar5.b5 = null;
                break;
            case 6:
                this.b.a.V.H0();
                break;
            case 7:
                this.b.a.V.H0();
                break;
            case 8:
                zn znVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.Q0 = true;
                znVar6.presentFragment(themeActivity);
                break;
            default:
                zn znVar7 = this.b.a;
                znVar7.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar7, 39, false));
                break;
        }
    }
}
