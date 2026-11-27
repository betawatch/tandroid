// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class tya implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ lu7 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ c51 h;
    public final /* synthetic */ TextView n;

    public tya(EditTextBoldCursor editTextBoldCursor, lu7 lu7Var, long j, boolean z, c51 c51Var, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = lu7Var;
        this.e = j;
        this.f = z;
        this.h = c51Var;
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
                if (j > uc7.s1(yac.t0).k4.z2.f()) {
                    this.a = true;
                    EditTextBoldCursor editTextBoldCursor = this.c;
                    j = uc7.s1(yac.t0).k4.z2.f();
                    editTextBoldCursor.setText(Long.toString(j));
                    EditTextBoldCursor editTextBoldCursor2 = this.c;
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                    lu7 lu7Var = this.d;
                    int i = -this.b;
                    this.b = i;
                    hl.A3(i, lu7Var, null);
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
        this.n.setText("≈" + di0.h().e((long) ((j / 1000.0d) * uc7.s1(yac.t0).k4.A3.i), "USD"));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
