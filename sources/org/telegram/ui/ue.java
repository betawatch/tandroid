package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ue(an anVar, boolean z9, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            default:
                this.b.cd(0, this.c);
                break;
        }
    }
}
