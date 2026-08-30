package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                xnVar.a5 = null;
                xnVar.b5 = null;
                break;
            case 1:
                jn jnVar = this.b;
                jnVar.getClass();
                xn xnVar2 = jnVar.a;
                new eg.o1((org.telegram.ui.ActionBar.p2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                break;
            case 2:
                jn jnVar2 = this.b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.a;
                new eg.o1((org.telegram.ui.ActionBar.p2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                break;
            case 3:
                jn jnVar3 = this.b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.a;
                new eg.o1((org.telegram.ui.ActionBar.p2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                break;
            case 4:
                this.b.a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                break;
            case 5:
                xn xnVar5 = this.b.a;
                xnVar5.a5 = null;
                xnVar5.b5 = null;
                break;
            case 6:
                this.b.a.V.H0();
                break;
            case 7:
                this.b.a.V.H0();
                break;
            case 8:
                xn xnVar6 = this.b.a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.Q0 = true;
                xnVar6.presentFragment(themeActivity);
                break;
            default:
                xn xnVar7 = this.b.a;
                xnVar7.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar7, 39, false));
                break;
        }
    }
}
