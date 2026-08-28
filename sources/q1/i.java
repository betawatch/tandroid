package q1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.k;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i implements TextWatcher {
    public final EditText a;
    public h b;
    public boolean c = true;

    public i(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i9) {
        int length;
        if (i9 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            k a2 = k.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.e(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        EditText editText = this.a;
        if (editText.isInEditMode() || !this.c || k.j == null || i10 > i11 || !(charSequence instanceof Spannable)) {
            return;
        }
        int b10 = k.a().b();
        if (b10 != 0) {
            if (b10 == 1) {
                k.a().e(i9, i11 + i9, (Spannable) charSequence);
                return;
            } else if (b10 != 3) {
                return;
            }
        }
        k a2 = k.a();
        if (this.b == null) {
            this.b = new h(editText);
        }
        a2.f(this.b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
