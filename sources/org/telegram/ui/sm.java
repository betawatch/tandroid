package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn b;

    public /* synthetic */ sm(hn hnVar, int i10) {
        this.a = i10;
        this.b = hnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b.a;
                wnVar.t5 = null;
                wnVar.u5 = null;
                break;
            case 1:
                hn hnVar = this.b;
                hnVar.getClass();
                wn wnVar2 = hnVar.a;
                new tg.y0((org.telegram.ui.ActionBar.r2) wnVar2, 8, true).show();
                wnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                hn hnVar2 = this.b;
                hnVar2.getClass();
                wn wnVar3 = hnVar2.a;
                new tg.y0((org.telegram.ui.ActionBar.r2) wnVar3, 8, true).show();
                wnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                hn hnVar3 = this.b;
                hnVar3.getClass();
                wn wnVar4 = hnVar3.a;
                new tg.y0((org.telegram.ui.ActionBar.r2) wnVar4, 8, true).show();
                wnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                wn wnVar5 = this.b.a;
                wnVar5.t5 = null;
                wnVar5.u5 = null;
                break;
            case 6:
                this.b.a.Y.E0();
                break;
            case 7:
                this.b.a.Y.E0();
                break;
            case 8:
                wn wnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                wnVar6.presentFragment(themeActivity);
                break;
            default:
                wn wnVar7 = this.b.a;
                wnVar7.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar7, 39, false));
                break;
        }
    }
}
