package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nn b;

    public /* synthetic */ ym(nn nnVar, int i10) {
        this.a = i10;
        this.b = nnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bo boVar = this.b.a;
                boVar.d5 = null;
                boVar.e5 = null;
                break;
            case 1:
                nn nnVar = this.b;
                nnVar.getClass();
                bo boVar2 = nnVar.a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar2, 8, true).show();
                boVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                nn nnVar2 = this.b;
                nnVar2.getClass();
                bo boVar3 = nnVar2.a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar3, 8, true).show();
                boVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                nn nnVar3 = this.b;
                nnVar3.getClass();
                bo boVar4 = nnVar3.a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar4, 8, true).show();
                boVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                bo boVar5 = this.b.a;
                boVar5.d5 = null;
                boVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.I0();
                break;
            case 7:
                this.b.a.Y.I0();
                break;
            case 8:
                bo boVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                boVar6.presentFragment(themeActivity);
                break;
            default:
                bo boVar7 = this.b.a;
                boVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar7, 39, false));
                break;
        }
    }
}
