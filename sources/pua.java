// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pua implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ er7 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ u41 h;
    public final /* synthetic */ TextView n;

    public pua(EditTextBoldCursor editTextBoldCursor, er7 er7Var, long j, boolean z, u41 u41Var, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = er7Var;
        this.e = j;
        this.f = z;
        this.h = u41Var;
        this.n = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00be  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long j;
        if (this.a) {
            return;
        }
        try {
            j = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
            try {
                if (j > na7.q1(y6c.t0).k4.r2.f()) {
                    this.a = true;
                    EditTextBoldCursor editTextBoldCursor = this.c;
                    j = na7.q1(y6c.t0).k4.r2.f();
                    editTextBoldCursor.setText(Long.toString(j));
                    EditTextBoldCursor editTextBoldCursor2 = this.c;
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                    er7 er7Var = this.d;
                    int i = -this.b;
                    this.b = i;
                    gl.A3(i, er7Var, null);
                }
            } catch (Exception unused) {
                this.a = true;
                EditTextBoldCursor editTextBoldCursor3 = this.c;
                long j2 = this.e;
                editTextBoldCursor3.setText(j2 <= 0 ? "" : Long.toString(j2));
                EditTextBoldCursor editTextBoldCursor4 = this.c;
                editTextBoldCursor4.setSelection(editTextBoldCursor4.getText().length());
                this.a = false;
                if (!this.f) {
                }
                this.d.c(this.c.isFocused(), !TextUtils.isEmpty(this.c.getText()));
                TextView textView = this.n;
                if (j != 0) {
                }
            }
        } catch (Exception unused2) {
            j = 0;
        }
        this.a = false;
        if (!this.f) {
            this.h.setEnabled(j > 0);
        }
        this.d.c(this.c.isFocused(), !TextUtils.isEmpty(this.c.getText()));
        TextView textView2 = this.n;
        if (j != 0) {
            textView2.animate().alpha(0.0f).start();
            this.n.setText("");
            return;
        }
        textView2.animate().alpha(1.0f).start();
        this.n.setText("≈" + ci0.h().e((long) ((j / 1000.0d) * na7.q1(y6c.t0).k4.s3.i), "USD"));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
