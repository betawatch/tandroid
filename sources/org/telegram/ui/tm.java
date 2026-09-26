package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;

    public /* synthetic */ tm(in inVar, int i10) {
        this.a = i10;
        this.b = inVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wn wnVar = this.b.a;
                wnVar.d5 = null;
                wnVar.e5 = null;
                break;
            case 1:
                in inVar = this.b;
                inVar.getClass();
                wn wnVar2 = inVar.a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar2, 8, true).show();
                wnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                in inVar2 = this.b;
                inVar2.getClass();
                wn wnVar3 = inVar2.a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar3, 8, true).show();
                wnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                in inVar3 = this.b;
                inVar3.getClass();
                wn wnVar4 = inVar3.a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar4, 8, true).show();
                wnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                wn wnVar5 = this.b.a;
                wnVar5.d5 = null;
                wnVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.H0();
                break;
            case 7:
                this.b.a.Y.H0();
                break;
            case 8:
                wn wnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                wnVar6.presentFragment(themeActivity);
                break;
            default:
                wn wnVar7 = this.b.a;
                wnVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar7, 39, false));
                break;
        }
    }
}
