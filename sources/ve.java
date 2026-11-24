// default package

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ve implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ ve(EditText editText, byte b) {
        this.a = b;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        EditText editText = this.b;
        switch (b) {
            case 0:
                gl.t1(editText);
                break;
            default:
                gl.t1(editText);
                break;
        }
    }
}
