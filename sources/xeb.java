// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public interface xeb {
    boolean a();

    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    e getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
