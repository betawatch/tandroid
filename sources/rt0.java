// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rt0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ rt0(Object obj, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = obj;
        this.c = editTextBoldCursor;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((lu7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 1:
                ((lu7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 2:
                ((lu7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.w.setEditText((ok2) editTextBoldCursor);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
