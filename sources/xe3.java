// default package

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.ImageView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xe3 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xe3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ze3 ze3Var = (ze3) obj;
                Dialog dialog = ze3Var.w0;
                if (dialog != null) {
                    ze3Var.onDismiss(dialog);
                    break;
                }
                break;
            default:
                ImageView imageView = ((PhotoViewer) obj).E3;
                if (imageView != null) {
                    imageView.animate().alpha(0.0f).withEndAction(new oq7(this, (byte) 26)).setDuration(150L).start();
                    break;
                }
                break;
        }
    }
}
