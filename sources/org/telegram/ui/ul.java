package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm b;

    public /* synthetic */ ul(mm mmVar, int i7) {
        this.a = i7;
        this.b = mmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bn bnVar = this.b.a;
                bnVar.v5 = null;
                bnVar.w5 = null;
                break;
            case 1:
                mm mmVar = this.b;
                mmVar.getClass();
                bn bnVar2 = mmVar.a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar2, 8, true).show();
                bnVar2.getMessagesController().L3();
                break;
            case 2:
                mm mmVar2 = this.b;
                mmVar2.getClass();
                bn bnVar3 = mmVar2.a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar3, 8, true).show();
                bnVar3.getMessagesController().L3();
                break;
            case 3:
                mm mmVar3 = this.b;
                mmVar3.getClass();
                bn bnVar4 = mmVar3.a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar4, 8, true).show();
                bnVar4.getMessagesController().L3();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                bn bnVar5 = this.b.a;
                bnVar5.v5 = null;
                bnVar5.w5 = null;
                break;
            case 6:
                this.b.a.a0.i1();
                break;
            case 7:
                this.b.a.a0.i1();
                break;
            case 8:
                bn bnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                bnVar6.presentFragment(themeActivity);
                break;
            default:
                bn bnVar7 = this.b.a;
                bnVar7.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar7, 39, false));
                break;
        }
    }
}
