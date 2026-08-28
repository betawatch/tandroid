package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xn0 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final /* synthetic */ co0 d;

    public xn0(co0 co0Var) {
        this.d = co0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i9;
        lt ltVar;
        co0 co0Var = this.d;
        if (co0Var.k0) {
            return;
        }
        boolean z10 = true;
        EditTextBoldCursor editTextBoldCursor = co0Var.f[1];
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
        co0Var.k0 = true;
        co0Var.f[1].setTextColor(co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
        if (sb2.length() > 4) {
            sb2.setLength(4);
        }
        if (sb2.length() < 2) {
            this.b = false;
        }
        if (!this.b) {
            if (sb2.length() == 1) {
                int intValue = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                if (intValue != 1 && intValue != 0) {
                    sb2.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb2.length() == 2) {
                int intValue2 = Utilities.parseInt((CharSequence) sb2.toString()).intValue();
                if (intValue2 > 12 || intValue2 == 0) {
                    co0Var.f[1].setTextColor(co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
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
                co0Var.k0 = false;
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
            co0Var.k0 = false;
        }
        int i12 = sb2.length() > 2 ? 2 : 1;
        String[] strArr = new String[i12];
        strArr[0] = sb2.substring(0, 2);
        if (i12 == 2) {
            strArr[1] = sb2.substring(2);
        }
        if (sb2.length() == 4 && i12 == 2) {
            int intValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
            int intValue4 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
            Calendar calendar = Calendar.getInstance();
            i9 = ((org.telegram.ui.ActionBar.o2) co0Var).currentAccount;
            boolean z11 = UserConfig.getInstance(i9).getClientPhone().startsWith("7") || ((ltVar = co0Var.w0) != null && ltVar.c.equals("7"));
            int i13 = z11 ? 2022 : calendar.get(1);
            int i14 = z11 ? 1 : calendar.get(2) + 1;
            if (intValue4 < i13 || (intValue4 == i13 && intValue3 < i14)) {
                co0Var.f[1].setTextColor(co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
                if (!z10) {
                }
                if (sb2.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                }
                co0Var.k0 = false;
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
            co0Var.k0 = false;
        }
        int intValue5 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
        if (intValue5 > 12 || intValue5 == 0) {
            co0Var.f[1].setTextColor(co0Var.getThemedColor(org.telegram.ui.ActionBar.f6.p7));
            if (!z10 && sb2.length() == 4) {
                co0Var.f[co0Var.e0 ? (char) 2 : (char) 3].requestFocus();
            }
            if (sb2.length() == 2) {
                if (sb2.length() > 2 && sb2.charAt(2) != '/') {
                    sb2.insert(2, '/');
                }
                editTextBoldCursor.setText(sb2);
                if (selectionStart >= 0) {
                    editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                }
                co0Var.k0 = false;
            }
            sb2.append('/');
            selectionStart++;
            editTextBoldCursor.setText(sb2);
            if (selectionStart >= 0) {
            }
            co0Var.k0 = false;
        }
        z10 = false;
        if (!z10) {
            co0Var.f[co0Var.e0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb2.length() == 2) {
        }
        selectionStart++;
        editTextBoldCursor.setText(sb2);
        if (selectionStart >= 0) {
        }
        co0Var.k0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        if (i10 == 0 && i11 == 1) {
            this.b = TextUtils.indexOf((CharSequence) this.d.f[1].getText(), '/') != -1;
            this.a = 1;
            return;
        }
        if (i10 != 1 || i11 != 0) {
            this.a = -1;
            return;
        }
        if (charSequence.charAt(i9) != '/' || i9 <= 0) {
            this.a = 2;
            return;
        }
        this.b = false;
        this.a = 3;
        this.c = i9 - 1;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
