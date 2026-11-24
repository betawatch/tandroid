// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ru0 implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ EditTextBoldCursor c;

    public /* synthetic */ ru0(Object obj, EditTextBoldCursor editTextBoldCursor, byte b) {
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
                ((gt7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 1:
                ((gt7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            case 2:
                ((gt7) obj).c(z, !TextUtils.isEmpty(editTextBoldCursor.getText()));
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                passcodeActivity.w.setEditText((gl2) editTextBoldCursor);
                passcodeActivity.w.setDispatchBackWhenEmpty(true);
                break;
        }
    }
}
