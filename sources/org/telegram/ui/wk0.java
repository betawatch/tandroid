package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class wk0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;

    public /* synthetic */ wk0(hl0 hl0Var, int i7) {
        this.a = i7;
        this.b = hl0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z9;
        String str;
        String str2;
        int i7 = this.a;
        hl0 hl0Var = this.b;
        switch (i7) {
            case 0:
                if (hl0Var.c0 != 0 && editable.length() == hl0Var.c0) {
                    hl0Var.G0(false);
                    break;
                }
                break;
            default:
                HashMap hashMap = hl0Var.c;
                if (!hl0Var.m0) {
                    hl0Var.m0 = true;
                    String d = pf.b.d(hl0Var.f[8].getText().toString(), false);
                    hl0Var.f[8].setText(d);
                    org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) hl0Var.f[9];
                    if (d.length() == 0) {
                        v20Var.setHintText((String) null);
                        v20Var.setHint(org.telegram.messenger.hd.M0(2131747371, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str3 = d.substring(i10) + hl0Var.f[9].getText().toString();
                                        hl0Var.f[8].setText(substring);
                                        str = str3;
                                        d = substring;
                                        z9 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z9 = false;
                                    str = null;
                                }
                            }
                            if (!z9) {
                                str = d.substring(1) + hl0Var.f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = hl0Var.f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z9 = false;
                            str = null;
                        }
                        String str4 = (String) hashMap.get(d);
                        if (str4 == null || hl0Var.a.indexOf(str4) == -1 || (str2 = (String) hl0Var.d.get(d)) == null) {
                            v20Var.setHintText((String) null);
                            v20Var.setHint(org.telegram.messenger.hd.M0(2131747371, null));
                        } else {
                            v20Var.setHintText(str2.replace('X', (char) 8211));
                            v20Var.setHint((CharSequence) null);
                        }
                        if (!z9) {
                            EditTextBoldCursor editTextBoldCursor2 = hl0Var.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            v20Var.requestFocus();
                            v20Var.setText(str);
                            v20Var.setSelection(v20Var.length());
                        }
                    }
                    hl0Var.m0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
