// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ vg(Runnable runnable, boolean[] zArr) {
        this.c = runnable;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Runnable runnable = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (runnable != null && zArr[0]) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ vg(boolean[] zArr, Runnable runnable) {
        this.b = zArr;
        this.c = runnable;
    }
}
