package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn b;

    public /* synthetic */ qm(fn fnVar, int i10) {
        this.a = i10;
        this.b = fnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                un unVar = this.b.a;
                unVar.p5 = null;
                unVar.q5 = null;
                break;
            case 1:
                fn fnVar = this.b;
                fnVar.getClass();
                un unVar2 = fnVar.a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar2, 8, true).show();
                unVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                fn fnVar2 = this.b;
                fnVar2.getClass();
                un unVar3 = fnVar2.a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar3, 8, true).show();
                unVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                fn fnVar3 = this.b;
                fnVar3.getClass();
                un unVar4 = fnVar3.a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar4, 8, true).show();
                unVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                un unVar5 = this.b.a;
                unVar5.p5 = null;
                unVar5.q5 = null;
                break;
            case 6:
                this.b.a.Y.F0();
                break;
            case 7:
                this.b.a.Y.F0();
                break;
            case 8:
                un unVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                unVar6.presentFragment(themeActivity);
                break;
            default:
                un unVar7 = this.b.a;
                unVar7.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar7, 39, false));
                break;
        }
    }
}
