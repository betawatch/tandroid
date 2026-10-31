package rh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ec0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n7 implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ ec0 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vh.d h;
    public final /* synthetic */ TextView n;

    public n7(EditTextBoldCursor editTextBoldCursor, ec0 ec0Var, long j10, boolean z10, vh.d dVar, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = ec0Var;
        this.e = j10;
        this.f = z10;
        this.h = dVar;
        this.n = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long j10;
        ec0 ec0Var = this.d;
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (this.a) {
            return;
        }
        try {
            j10 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
            try {
                if (j10 > vp.r1(d20.s0).T5) {
                    this.a = true;
                    j10 = vp.r1(d20.s0).T5;
                    editTextBoldCursor.setText(Long.toString(j10));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i10 = -this.b;
                    this.b = i10;
                    org.telegram.messenger.i0.F3(i10, ec0Var, null);
                }
            } catch (Exception unused) {
                this.a = true;
                long j11 = this.e;
                editTextBoldCursor.setText(j11 <= 0 ? "" : Long.toString(j11));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                this.a = false;
                if (!this.f) {
                }
                ec0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
                TextView textView = this.n;
                if (j10 != 0) {
                }
            }
        } catch (Exception unused2) {
            j10 = 0;
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j10 > 0);
        }
        ec0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView2 = this.n;
        if (j10 != 0) {
            textView2.animate().alpha(0.0f).start();
            textView2.setText("");
        } else {
            textView2.animate().alpha(1.0f).start();
            textView2.setText("≈" + org.telegram.messenger.u1.i().f((long) ((j10 / 1000.0d) * vp.r1(d20.s0).d6), "USD"));
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
