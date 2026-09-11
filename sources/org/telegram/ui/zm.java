package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ on b;

    public /* synthetic */ zm(on onVar, int i10) {
        this.a = i10;
        this.b = onVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co coVar = this.b.a;
                coVar.d5 = null;
                coVar.e5 = null;
                break;
            case 1:
                on onVar = this.b;
                onVar.getClass();
                co coVar2 = onVar.a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar2, 8, true).show();
                coVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                on onVar2 = this.b;
                onVar2.getClass();
                co coVar3 = onVar2.a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar3, 8, true).show();
                coVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                on onVar3 = this.b;
                onVar3.getClass();
                co coVar4 = onVar3.a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar4, 8, true).show();
                coVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                co coVar5 = this.b.a;
                coVar5.d5 = null;
                coVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.H0();
                break;
            case 7:
                this.b.a.Y.H0();
                break;
            case 8:
                co coVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                coVar6.presentFragment(themeActivity);
                break;
            default:
                co coVar7 = this.b.a;
                coVar7.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar7, 39, false));
                break;
        }
    }
}
