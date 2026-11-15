package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class se implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ se(an anVar, boolean z10, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.presentFragment(new PremiumPreviewFragment(0, this.c ? "upload_speed" : "download_speed"));
                break;
            default:
                this.b.gd(0, this.c);
                break;
        }
    }
}
