// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rvb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wvb b;

    public /* synthetic */ rvb(wvb wvbVar, byte b) {
        this.a = b;
        this.b = wvbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wvb wvbVar = this.b;
        switch (b) {
            case 0:
                new kj8((d) wvbVar, 11, false).show();
                break;
            default:
                wvbVar.e.requestFocus();
                gm.E3(wvbVar.e);
                break;
        }
    }
}
