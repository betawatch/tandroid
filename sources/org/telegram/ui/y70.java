package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LanguageSelectActivity b;

    public /* synthetic */ y70(LanguageSelectActivity languageSelectActivity, int i10) {
        this.a = i10;
        this.b = languageSelectActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LanguageSelectActivity.Y(this.b);
                break;
            case 1:
                LanguageSelectActivity.W(this.b);
                break;
            default:
                this.b.a.l();
                break;
        }
    }
}
