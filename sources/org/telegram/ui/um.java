package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn b;

    public /* synthetic */ um(kn knVar, int i10) {
        this.a = i10;
        this.b = knVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yn ynVar = this.b.a;
                ynVar.b5 = null;
                ynVar.c5 = null;
                break;
            case 1:
                kn knVar = this.b;
                knVar.getClass();
                yn ynVar2 = knVar.a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar2, 8, true).show();
                ynVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                kn knVar2 = this.b;
                knVar2.getClass();
                yn ynVar3 = knVar2.a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar3, 8, true).show();
                ynVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                kn knVar3 = this.b;
                knVar3.getClass();
                yn ynVar4 = knVar3.a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar4, 8, true).show();
                ynVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                yn ynVar5 = this.b.a;
                ynVar5.b5 = null;
                ynVar5.c5 = null;
                break;
            case 6:
                this.b.a.W.H0();
                break;
            case 7:
                this.b.a.W.H0();
                break;
            case 8:
                yn ynVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                ynVar6.presentFragment(themeActivity);
                break;
            default:
                yn ynVar7 = this.b.a;
                ynVar7.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar7, 39, false));
                break;
        }
    }
}
