// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class twa implements TextWatcher {
    public boolean a;
    public int b = 2;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ gt7 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ b61 h;
    public final /* synthetic */ TextView n;

    public twa(EditTextBoldCursor editTextBoldCursor, gt7 gt7Var, long j, boolean z, b61 b61Var, TextView textView) {
        this.c = editTextBoldCursor;
        this.d = gt7Var;
        this.e = j;
        this.f = z;
        this.h = b61Var;
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
                if (j > oc7.r1(z8c.t0).l4.r2.f()) {
                    this.a = true;
                    EditTextBoldCursor editTextBoldCursor = this.c;
                    j = oc7.r1(z8c.t0).l4.r2.f();
                    editTextBoldCursor.setText(Long.toString(j));
                    EditTextBoldCursor editTextBoldCursor2 = this.c;
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                    gt7 gt7Var = this.d;
                    int i = -this.b;
                    this.b = i;
                    gm.A3(i, gt7Var, null);
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
        this.n.setText("≈" + cj0.h().e((long) ((j / 1000.0d) * oc7.r1(z8c.t0).l4.s3.i), "USD"));
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
