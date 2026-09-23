package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jn b;

    public /* synthetic */ um(jn jnVar, int i10) {
        this.a = i10;
        this.b = jnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xn xnVar = this.b.a;
                xnVar.d5 = null;
                xnVar.e5 = null;
                break;
            case 1:
                jn jnVar = this.b;
                jnVar.getClass();
                xn xnVar2 = jnVar.a;
                new rg.x0((org.telegram.ui.ActionBar.n2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                jn jnVar2 = this.b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.a;
                new rg.x0((org.telegram.ui.ActionBar.n2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                jn jnVar3 = this.b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.a;
                new rg.x0((org.telegram.ui.ActionBar.n2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                xn xnVar5 = this.b.a;
                xnVar5.d5 = null;
                xnVar5.e5 = null;
                break;
            case 6:
                this.b.a.Y.I0();
                break;
            case 7:
                this.b.a.Y.I0();
                break;
            case 8:
                xn xnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                xnVar6.presentFragment(themeActivity);
                break;
            default:
                xn xnVar7 = this.b.a;
                xnVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar7, 39, false));
                break;
        }
    }
}
