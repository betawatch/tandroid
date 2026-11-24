// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q32 implements TextWatcher {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ TextView c;

    public q32(p32 p32Var, TextView textView) {
        this.c = textView;
        this.b = TextUtils.isEmpty(p32Var.getText());
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        TextView textView = this.c;
        switch (b) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    this.b = isEmpty;
                    textView.setText(k96.M0(isEmpty ? 2131746128 : 2131754483, null));
                    break;
                }
                break;
            default:
                boolean isEmpty2 = TextUtils.isEmpty(editable);
                if (isEmpty2 != this.b) {
                    this.b = isEmpty2;
                    textView.setText(k96.M0(isEmpty2 ? 2131746128 : 2131754483, null));
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public q32(p32 p32Var, TextView textView, byte b) {
        this.c = textView;
        this.b = TextUtils.isEmpty(p32Var.getText());
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
