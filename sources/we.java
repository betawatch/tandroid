// default package

import android.content.DialogInterface;
import android.widget.EditText;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class we implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditText b;

    public /* synthetic */ we(EditText editText, byte b) {
        this.a = b;
        this.b = editText;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        EditText editText = this.b;
        switch (b) {
            case 0:
                hl.t1(editText);
                break;
            default:
                hl.t1(editText);
                break;
        }
    }
}
