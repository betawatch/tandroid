package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
