// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yy7 implements TextWatcher {
    public final /* synthetic */ byte a;
    public final Object b;
    public String c;
    public final /* synthetic */ Object d;

    public yy7(kn2 kn2Var) {
        this.a = (byte) 3;
        this.d = kn2Var;
        this.b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        int i;
        byte b = this.a;
        boolean z = true;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((xz7) obj2).P0((EditTextBoldCursor) obj, this.c, editable, false);
                break;
            case 1:
                xz7 xz7Var = (xz7) obj2;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                int i2 = 0;
                while (true) {
                    if (i2 < editable.length()) {
                        char charAt = editable.charAt(i2);
                        if ((charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ' ' || charAt == '\'' || charAt == ',' || charAt == '.' || charAt == '&' || charAt == '-' || charAt == '/'))) {
                            i2++;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z && !xz7Var.v0) {
                    editTextBoldCursor.setErrorText(jb6.M0(2131747182, null));
                    break;
                } else {
                    xz7Var.u0[intValue] = z;
                    xz7Var.P0(editTextBoldCursor, this.c, editable, false);
                    break;
                }
                break;
            case 2:
                ((xz7) obj2).P0((EditTextBoldCursor) obj, this.c, editable, false);
                break;
            default:
                kn2 kn2Var = (kn2) obj2;
                ln2 ln2Var = kn2Var.f;
                EditTextBoldCursor editTextBoldCursor2 = kn2Var.d;
                if (!kn2Var.e && this.c != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.c.toString(), editable.toString())) {
                    String obj3 = editable.toString();
                    if (obj3.length() > 8) {
                        editTextBoldCursor2.setText(obj3.substring(2, 8).toUpperCase());
                        editTextBoldCursor2.setSelection(8);
                        break;
                    } else if (((Pattern) obj).matcher(editable).find()) {
                        int length = obj3.length();
                        if (length != 3) {
                            if (length == 6) {
                                i = ((int) Long.parseLong(obj3, 16)) - 16777216;
                            } else if (length != 8) {
                                i = ln2Var.p1;
                            } else {
                                parseLong = Long.parseLong(obj3, 16);
                            }
                            if (i == ln2Var.p1) {
                                ln2Var.D0(i, 5);
                                break;
                            }
                        } else {
                            parseLong = Long.parseLong("FF" + obj3.charAt(0) + obj3.charAt(0) + obj3.charAt(1) + obj3.charAt(1) + obj3.charAt(2) + obj3.charAt(2), 16);
                        }
                        i = (int) parseLong;
                        if (i == ln2Var.p1) {
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                this.c = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public /* synthetic */ yy7(xz7 xz7Var, EditTextBoldCursor editTextBoldCursor, String str, byte b) {
        this.a = b;
        this.d = xz7Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }
}
