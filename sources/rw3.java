// default package

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class rw3 extends iw3 {
    public final WeakReference a;
    public final WeakReference b;

    public rw3(TextView textView, sw3 sw3Var) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(sw3Var);
    }

    @Override // iw3
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    lw3 a = lw3.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence e = a.e(0, length, text);
                    if (text != e) {
                        int selectionStart = Selection.getSelectionStart(e);
                        int selectionEnd = Selection.getSelectionEnd(e);
                        textView.setText(e);
                        if (e instanceof Spannable) {
                            Spannable spannable = (Spannable) e;
                            if (selectionStart < 0) {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
