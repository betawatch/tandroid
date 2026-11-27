// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v28 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final /* synthetic */ p d;

    public v28(p pVar) {
        this.d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        int i;
        int i2;
        int i3;
        gy2 gy2Var;
        p pVar = this.d;
        if (pVar.p0) {
            return;
        }
        boolean z = true;
        EditTextBoldCursor editTextBoldCursor = pVar.f[1];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        if (this.a == 3) {
            obj = obj.substring(0, this.c).concat(obj.substring(this.c + 1));
            selectionStart--;
        }
        StringBuilder sb = new StringBuilder(obj.length());
        int i4 = 0;
        while (i4 < obj.length()) {
            int i5 = i4 + 1;
            String substring = obj.substring(i4, i5);
            if ("0123456789".contains(substring)) {
                sb.append(substring);
            }
            i4 = i5;
        }
        pVar.p0 = true;
        yob.X(pVar.f[1], aob.G6, pVar.Z0);
        if (sb.length() > 4) {
            sb.setLength(4);
        }
        if (sb.length() < 2) {
            this.b = false;
        }
        if (!this.b) {
            if (sb.length() == 1) {
                int intValue = Utilities.z(sb.toString()).intValue();
                if (intValue != 1 && intValue != 0) {
                    sb.insert(0, "0");
                    selectionStart++;
                }
            } else if (sb.length() == 2) {
                int intValue2 = Utilities.z(sb.toString()).intValue();
                if (intValue2 > 12 || intValue2 == 0) {
                    yob.X(pVar.f[1], aob.p7, pVar.Z0);
                } else {
                    z = false;
                }
                selectionStart++;
                if (!z) {
                }
                if (sb.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb);
                if (selectionStart >= 0) {
                }
                pVar.p0 = false;
            }
            z = false;
            if (!z) {
            }
            if (sb.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb);
            if (selectionStart >= 0) {
            }
            pVar.p0 = false;
        }
        int i6 = sb.length() > 2 ? 2 : 1;
        String[] strArr = new String[i6];
        strArr[0] = sb.substring(0, 2);
        if (i6 == 2) {
            strArr[1] = sb.substring(2);
        }
        if (sb.length() == 4 && i6 == 2) {
            int intValue3 = Utilities.z(strArr[0]).intValue();
            int intValue4 = Utilities.z(strArr[1]).intValue() + 2000;
            Calendar calendar = Calendar.getInstance();
            i = ((e) pVar).currentAccount;
            if (yac.h(i).d().startsWith("7") || ((gy2Var = pVar.B0) != null && gy2Var.c.equals("7"))) {
                i2 = 2022;
                i3 = 1;
            } else {
                i2 = calendar.get(1);
                i3 = calendar.get(2) + 1;
            }
            if (intValue4 < i2 || (intValue4 == i2 && intValue3 < i3)) {
                yob.X(pVar.f[1], aob.p7, pVar.Z0);
                if (!z) {
                }
                if (sb.length() == 2) {
                }
                selectionStart++;
                editTextBoldCursor.setText(sb);
                if (selectionStart >= 0) {
                }
                pVar.p0 = false;
            }
            z = false;
            if (!z) {
            }
            if (sb.length() == 2) {
            }
            selectionStart++;
            editTextBoldCursor.setText(sb);
            if (selectionStart >= 0) {
            }
            pVar.p0 = false;
        }
        int intValue5 = Utilities.z(strArr[0]).intValue();
        if (intValue5 > 12 || intValue5 == 0) {
            yob.X(pVar.f[1], aob.p7, pVar.Z0);
            if (!z && sb.length() == 4) {
                pVar.f[pVar.j0 ? (char) 2 : (char) 3].requestFocus();
            }
            if (sb.length() == 2) {
                if (sb.length() > 2 && sb.charAt(2) != '/') {
                    sb.insert(2, '/');
                }
                editTextBoldCursor.setText(sb);
                if (selectionStart >= 0) {
                    editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
                }
                pVar.p0 = false;
            }
            sb.append('/');
            selectionStart++;
            editTextBoldCursor.setText(sb);
            if (selectionStart >= 0) {
            }
            pVar.p0 = false;
        }
        z = false;
        if (!z) {
            pVar.f[pVar.j0 ? (char) 2 : (char) 3].requestFocus();
        }
        if (sb.length() == 2) {
        }
        selectionStart++;
        editTextBoldCursor.setText(sb);
        if (selectionStart >= 0) {
        }
        pVar.p0 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            this.b = TextUtils.indexOf((CharSequence) this.d.f[1].getText(), '/') != -1;
            this.a = 1;
            return;
        }
        if (i2 != 1 || i3 != 0) {
            this.a = -1;
            return;
        }
        if (charSequence.charAt(i) != '/' || i <= 0) {
            this.a = 2;
            return;
        }
        this.b = false;
        this.a = 3;
        this.c = i - 1;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
