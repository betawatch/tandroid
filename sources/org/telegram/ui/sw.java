package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sw implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ tw b;
    public final /* synthetic */ org.telegram.messenger.ro c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ sw(tw twVar, org.telegram.messenger.ro roVar, boolean z10) {
        this.b = twVar;
        this.c = roVar;
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

    public /* synthetic */ sw(tw twVar, boolean z10, org.telegram.messenger.ro roVar) {
        this.b = twVar;
        this.d = z10;
        this.c = roVar;
    }
}
