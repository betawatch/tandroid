package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sk0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ sk0(dl0 dl0Var, int i3) {
        this.a = i3;
        this.b = dl0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        String str2;
        int i3 = this.a;
        dl0 dl0Var = this.b;
        switch (i3) {
            case 0:
                if (dl0Var.d0 != 0 && editable.length() == dl0Var.d0) {
                    dl0Var.G0(false);
                    break;
                }
                break;
            default:
                HashMap hashMap = dl0Var.c;
                if (!dl0Var.n0) {
                    dl0Var.n0 = true;
                    String d = mf.b.d(dl0Var.f[8].getText().toString(), false);
                    dl0Var.f[8].setText(d);
                    org.telegram.ui.Components.r20 r20Var = (org.telegram.ui.Components.r20) dl0Var.f[9];
                    if (d.length() == 0) {
                        r20Var.setHintText((String) null);
                        r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str3 = d.substring(i10) + dl0Var.f[9].getText().toString();
                                        dl0Var.f[8].setText(substring);
                                        str = str3;
                                        d = substring;
                                        z10 = true;
                                    } else {
                                        i10--;
                                    }
                                } else {
                                    z10 = false;
                                    str = null;
                                }
                            }
                            if (!z10) {
                                str = d.substring(1) + dl0Var.f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = dl0Var.f[8];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str4 = (String) hashMap.get(d);
                        if (str4 == null || dl0Var.a.indexOf(str4) == -1 || (str2 = (String) dl0Var.d.get(d)) == null) {
                            r20Var.setHintText((String) null);
                            r20Var.setHint(org.telegram.messenger.bd.M0(2131747380, null));
                        } else {
                            r20Var.setHintText(str2.replace('X', (char) 8211));
                            r20Var.setHint((CharSequence) null);
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = dl0Var.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            r20Var.requestFocus();
                            r20Var.setText(str);
                            r20Var.setSelection(r20Var.length());
                        }
                    }
                    dl0Var.n0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
