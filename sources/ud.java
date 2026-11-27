// default package

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ud implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ud(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                Drawable[] drawableArr = PhotoViewer.d9;
                runnable.run();
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
