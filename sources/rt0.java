// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
