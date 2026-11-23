package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sw b;
    public final /* synthetic */ org.telegram.messenger.ro c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rw(sw swVar, org.telegram.messenger.ro roVar, boolean z10) {
        this.b = swVar;
        this.c = roVar;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.presentFragment(this.d ? new FiltersSetupActivity() : new jz(this.c, null));
                break;
            default:
                this.b.b.getMessagesController().U4(this.c, !this.d);
                break;
        }
    }

    public /* synthetic */ rw(sw swVar, boolean z10, org.telegram.messenger.ro roVar) {
        this.b = swVar;
        this.d = z10;
        this.c = roVar;
    }
}
