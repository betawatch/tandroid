package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rj0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk0 b;

    public /* synthetic */ rj0(hk0 hk0Var, int i7) {
        this.a = i7;
        this.b = hk0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z10;
        String str;
        int indexOf;
        int i7 = this.a;
        hk0 hk0Var = this.b;
        switch (i7) {
            case 0:
                if (!hk0Var.a1 && hk0Var.U0 != 0 && hk0Var.Z[0].length() == hk0Var.U0) {
                    hk0Var.M.callOnClick();
                    break;
                }
                break;
            default:
                ArrayList arrayList = hk0Var.V0;
                HashMap hashMap = hk0Var.X0;
                if (!hk0Var.a1) {
                    hk0Var.a1 = true;
                    String d = pf.b.d(hk0Var.Z[1].getText().toString(), false);
                    hk0Var.Z[1].setText(d);
                    org.telegram.ui.Components.j30 j30Var = (org.telegram.ui.Components.j30) hk0Var.Z[2];
                    if (d.length() == 0) {
                        j30Var.setHintText((String) null);
                        j30Var.setHint(org.telegram.messenger.hd.N0(2131747178, null));
                        hk0Var.Z[0].setText(org.telegram.messenger.hd.N0(2131752122, null));
                    } else {
                        int i10 = 4;
                        if (d.length() > 4) {
                            while (true) {
                                if (i10 >= 1) {
                                    String substring = d.substring(0, i10);
                                    if (((String) hashMap.get(substring)) != null) {
                                        String str2 = d.substring(i10) + hk0Var.Z[2].getText().toString();
                                        hk0Var.Z[1].setText(substring);
                                        str = str2;
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
                                str = d.substring(1) + hk0Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = hk0Var.Z[1];
                                d = d.substring(0, 1);
                                editTextBoldCursor.setText(d);
                            }
                        } else {
                            z10 = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(d);
                        if (str3 == null || (indexOf = arrayList.indexOf(str3)) == -1) {
                            j30Var.setHintText((String) null);
                            j30Var.setHint(org.telegram.messenger.hd.N0(2131747178, null));
                            hk0Var.Z[0].setText(org.telegram.messenger.hd.N0(2131742593, null));
                        } else {
                            hk0Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str4 = (String) hk0Var.Y0.get(d);
                            if (str4 != null) {
                                j30Var.setHintText(str4.replace('X', (char) 8211));
                                j30Var.setHint((CharSequence) null);
                            }
                        }
                        if (!z10) {
                            EditTextBoldCursor editTextBoldCursor2 = hk0Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            j30Var.requestFocus();
                            j30Var.setText(str);
                            j30Var.setSelection(j30Var.length());
                        }
                    }
                    hk0Var.a1 = false;
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
