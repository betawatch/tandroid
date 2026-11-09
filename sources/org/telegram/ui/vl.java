package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm b;

    public /* synthetic */ vl(nm nmVar, int i7) {
        this.a = i7;
        this.b = nmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn cnVar = this.b.a;
                cnVar.t5 = null;
                cnVar.u5 = null;
                break;
            case 1:
                nm nmVar = this.b;
                nmVar.getClass();
                cn cnVar2 = nmVar.a;
                new ug.w0((org.telegram.ui.ActionBar.f2) cnVar2, 8, true).show();
                cnVar2.getMessagesController().E3();
                break;
            case 2:
                nm nmVar2 = this.b;
                nmVar2.getClass();
                cn cnVar3 = nmVar2.a;
                new ug.w0((org.telegram.ui.ActionBar.f2) cnVar3, 8, true).show();
                cnVar3.getMessagesController().E3();
                break;
            case 3:
                nm nmVar3 = this.b;
                nmVar3.getClass();
                cn cnVar4 = nmVar3.a;
                new ug.w0((org.telegram.ui.ActionBar.f2) cnVar4, 8, true).show();
                cnVar4.getMessagesController().E3();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                cn cnVar5 = this.b.a;
                cnVar5.t5 = null;
                cnVar5.u5 = null;
                break;
            case 6:
                this.b.a.Z.H0();
                break;
            case 7:
                this.b.a.Z.H0();
                break;
            case 8:
                cn cnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                cnVar6.presentFragment(themeActivity);
                break;
            default:
                cn cnVar7 = this.b.a;
                cnVar7.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar7, 39, false));
                break;
        }
    }
}
