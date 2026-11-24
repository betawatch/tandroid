// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class voa implements TextWatcher {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ gt7 d;
    public final /* synthetic */ int[] e;
    public final /* synthetic */ TextView f;

    public voa(int i, EditTextBoldCursor editTextBoldCursor, gt7 gt7Var, int[] iArr, TextView textView) {
        this.b = i;
        this.c = editTextBoldCursor;
        this.d = gt7Var;
        this.e = iArr;
        this.f = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0107  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        double d;
        if (this.a) {
            return;
        }
        try {
            d = TextUtils.isEmpty(editable) ? 0.0d : Double.parseDouble(editable.toString());
            try {
                if (d > oc7.r1(this.b).l4.N2.f() / 1.0E9d) {
                    this.a = true;
                    d = oc7.r1(this.b).l4.N2.f() / 1.0E9d;
                    this.c.setText(Double.toString(d));
                    EditTextBoldCursor editTextBoldCursor = this.c;
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    gt7 gt7Var = this.d;
                    int[] iArr = this.e;
                    int i = -iArr[0];
                    iArr[0] = i;
                    gm.A3(i, gt7Var, null);
                } else if (d > 0.0d && d < oc7.r1(this.b).l4.M2.f() / 1.0E9d) {
                    this.a = true;
                    d = oc7.r1(this.b).l4.M2.f() / 1.0E9d;
                    this.c.setText(Double.toString(d));
                    EditTextBoldCursor editTextBoldCursor2 = this.c;
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                    gt7 gt7Var2 = this.d;
                    int[] iArr2 = this.e;
                    int i2 = -iArr2[0];
                    iArr2[0] = i2;
                    gm.A3(i2, gt7Var2, null);
                }
            } catch (Exception unused) {
                this.a = true;
                this.c.setText(d <= 0.0d ? "" : Double.toString(d));
                EditTextBoldCursor editTextBoldCursor3 = this.c;
                editTextBoldCursor3.setSelection(editTextBoldCursor3.getText().length());
                this.a = false;
                this.d.c(this.c.isFocused(), !TextUtils.isEmpty(this.c.getText()));
                TextView textView = this.f;
                if (d != 0.0d) {
                }
            }
        } catch (Exception unused2) {
            d = 0.0d;
        }
        this.a = false;
        this.d.c(this.c.isFocused(), !TextUtils.isEmpty(this.c.getText()));
        TextView textView2 = this.f;
        if (d != 0.0d) {
            textView2.animate().alpha(0.0f).start();
            this.f.setText("");
            return;
        }
        textView2.animate().alpha(1.0f).start();
        TextView textView3 = this.f;
        StringBuilder sb = new StringBuilder("≈");
        cj0.h();
        sb.append(cj0.f("USD", 2, (long) (d * oc7.r1(this.b).l4.k.i * 100.0d), false));
        textView3.setText(sb.toString());
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
