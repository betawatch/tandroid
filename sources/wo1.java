// default package

import android.content.DialogInterface;
import org.telegram.messenger.MediaController;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wo1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ wo1(boolean[] zArr, byte b) {
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
