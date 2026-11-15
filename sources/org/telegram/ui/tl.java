package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm b;

    public /* synthetic */ tl(lm lmVar, int i7) {
        this.a = i7;
        this.b = lmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                an anVar = this.b.a;
                anVar.u5 = null;
                anVar.v5 = null;
                break;
            case 1:
                lm lmVar = this.b;
                lmVar.getClass();
                an anVar2 = lmVar.a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar2, 8, true).show();
                anVar2.getMessagesController().E3();
                break;
            case 2:
                lm lmVar2 = this.b;
                lmVar2.getClass();
                an anVar3 = lmVar2.a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar3, 8, true).show();
                anVar3.getMessagesController().E3();
                break;
            case 3:
                lm lmVar3 = this.b;
                lmVar3.getClass();
                an anVar4 = lmVar3.a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar4, 8, true).show();
                anVar4.getMessagesController().E3();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                an anVar5 = this.b.a;
                anVar5.u5 = null;
                anVar5.v5 = null;
                break;
            case 6:
                this.b.a.a0.W0();
                break;
            case 7:
                this.b.a.a0.W0();
                break;
            case 8:
                an anVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                anVar6.presentFragment(themeActivity);
                break;
            default:
                an anVar7 = this.b.a;
                anVar7.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar7, 39, false));
                break;
        }
    }
}
