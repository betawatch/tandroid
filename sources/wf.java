// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ wf(Runnable runnable, boolean[] zArr) {
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

    public /* synthetic */ wf(boolean[] zArr, Runnable runnable) {
        this.b = zArr;
        this.c = runnable;
    }
}
