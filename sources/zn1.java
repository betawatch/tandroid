// default package

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zn1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ zn1(boolean[] zArr, byte b) {
        this.a = b;
        this.b = zArr;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                zArr[0] = true;
                break;
            case 1:
                String str = LaunchActivity.C1;
                zArr[0] = true;
                break;
            case 2:
                String[] strArr = MediaController.W1;
                zArr[0] = true;
                break;
            case 3:
                String[] strArr2 = MediaController.W1;
                zArr[0] = true;
                break;
            default:
                zArr[0] = true;
                break;
        }
    }
}
