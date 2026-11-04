package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yk0 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final /* synthetic */ dl0 d;

    public yk0(dl0 dl0Var) {
        this.d = dl0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i3;
        ks ksVar;
        dl0 dl0Var = this.d;
        if (dl0Var.p0) {
            return;
        }
        boolean z10 = true;
        EditTextBoldCursor editTextBoldCursor = dl0Var.f[1];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        if (this.a == 3) {
            obj = obj.substring(0, this.c) + obj.substring(this.c + 1);
            selectionStart--;
        }
        StringBuilder sb2 = new StringBuilder(obj.length());
        int i10 = 0;
        while (i10 < obj.length()) {
            int i11 = i10 + 1;
            String substring = obj.substring(i10, i11);
            if ("0123456789".contains(substring)) {
                sb2.append(substring);
            }
            i10 = i11;
        }
        dl0Var.p0 = true;
        org.telegram.ui.ActionBar.r6.V(dl0Var.f[1], org.telegram.ui.ActionBar.k6.G6, dl0Var.Z0);
        if (sb2.length() > 4) {
            sb2.setLength(4);
        }
        if (sb2.length() < 2) {
            this.b = false;
        }
        if (!this.b) {
            if (sb2.length() == 1) {
                int intValue = Utilities.z(sb2.toString()).intValue();
                if (intValue != 1 && intValue != 0) {
                    sb2.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb2.length() == 2) {
                int intValue2 = Utilities.z(sb2.toString()).intValue();
                if (intValue2 > 12 || intValue2 == 0) {
                    org.telegram.ui.ActionBar.r6.V(dl0Var.f[1], org.telegram.ui.ActionBar.k6.p7, dl0Var.Z0);
                } else {
                    z10 = false;
                }
                selectionStart++;
                if (!z10) {
                }
                if (sb2.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                }
                dl0Var.p0 = false;
            }
            z10 = false;
            if (!z10) {
            }
            if (sb2.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            dl0Var.p0 = false;
        }
        int i12 = sb2.length() > 2 ? 2 : 1;
        String[] strArr = new String[i12];
        strArr[0] = sb2.substring(0, 2);
        if (i12 == 2) {
            strArr[1] = sb2.substring(2);
        }
        if (sb2.length() == 4 && i12 == 2) {
            int intValue3 = Utilities.z(strArr[0]).intValue();
            int intValue4 = Utilities.z(strArr[1]).intValue() + 2000;
            Calendar calendar = Calendar.getInstance();
            i3 = ((org.telegram.ui.ActionBar.d2) dl0Var).currentAccount;
            boolean z11 = org.telegram.messenger.h10.i(i3).d().startsWith("7") || ((ksVar = dl0Var.B0) != null && ksVar.c.equals("7"));
            int i13 = z11 ? 2022 : calendar.get(1);
            int i14 = z11 ? 1 : calendar.get(2) + 1;
            if (intValue4 < i13 || (intValue4 == i13 && intValue3 < i14)) {
                org.telegram.ui.ActionBar.r6.V(dl0Var.f[1], org.telegram.ui.ActionBar.k6.p7, dl0Var.Z0);
                if (!z10) {
                }
                if (sb2.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                }
                dl0Var.p0 = false;
            }
            z10 = false;
            if (!z10) {
            }
            if (sb2.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            dl0Var.p0 = false;
        }
        int intValue5 = Utilities.z(strArr[0]).intValue();
        if (intValue5 > 12 || intValue5 == 0) {
            org.telegram.ui.ActionBar.r6.V(dl0Var.f[1], org.telegram.ui.ActionBar.k6.p7, dl0Var.Z0);
            if (!z10 && sb2.length() == 4) {
                dl0Var.f[dl0Var.j0 ? (char) 2 : (char) 3].requestFocus();
            }
            if (sb2.length() == 2) {
                if (sb2.length() > 2 && sb2.charAt(2) != '/') {
                    sb2.insert(2, '/');
                }
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                    editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                }
                dl0Var.p0 = false;
            }
            sb2.append('/');
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            dl0Var.p0 = false;
        }
        z10 = false;
        if (!z10) {
            dl0Var.f[dl0Var.j0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb2.length() == 2) {
        }
        selectionStart++;
        editTextBoldCursor.setText(sb2);
        if (selectionStart >= 0) {
        }
        dl0Var.p0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            this.b = TextUtils.indexOf((CharSequence) this.d.f[1].getText(), '/') != -1;
            this.a = 1;
            return;
        }
        if (i10 != 1 || i11 != 0) {
            this.a = -1;
            return;
        }
        if (charSequence.charAt(i3) != '/' || i3 <= 0) {
            this.a = 2;
            return;
        }
        this.b = false;
        this.a = 3;
        this.c = i3 - 1;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
