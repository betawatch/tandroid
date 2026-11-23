package t1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.l;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class d extends androidx.emoji2.text.i {
    public final WeakReference a;
    public final WeakReference b;

    public d(TextView textView, e eVar) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(eVar);
    }

    @Override // androidx.emoji2.text.i
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
                    l a10 = l.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a10.getClass();
                        length = text.length();
                    }
                    CharSequence e10 = a10.e(0, length, text);
                    if (text == e10) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(e10);
                    int selectionEnd = Selection.getSelectionEnd(e10);
                    textView.setText(e10);
                    if (e10 instanceof Spannable) {
                        Spannable spannable = (Spannable) e10;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
