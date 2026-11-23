package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tw b;
    public final /* synthetic */ org.telegram.messenger.so c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ sw(tw twVar, org.telegram.messenger.so soVar, boolean z10) {
        this.b = twVar;
        this.c = soVar;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.presentFragment(this.d ? new FiltersSetupActivity() : new kz(this.c, null));
                break;
            default:
                this.b.b.getMessagesController().U4(this.c, !this.d);
                break;
        }
    }

    public /* synthetic */ sw(tw twVar, boolean z10, org.telegram.messenger.so soVar) {
        this.b = twVar;
        this.d = z10;
        this.c = soVar;
    }
}
