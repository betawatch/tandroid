package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tl0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;
    public String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tl0(wm0 wm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i9) {
        this.a = i9;
        this.d = wm0Var;
        this.b = editTextBoldCursor;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterTextChanged(Editable editable) {
        long parseLong;
        int i9;
        switch (this.a) {
            case 0:
                wm0.I0((wm0) this.d, (EditTextBoldCursor) this.b, this.c, editable, false);
                break;
            case 1:
                wm0.I0((wm0) this.d, (EditTextBoldCursor) this.b, this.c, editable, false);
                break;
            default:
                xf.w wVar = (xf.w) this.d;
                xf.x xVar = wVar.f;
                EditTextBoldCursor editTextBoldCursor = wVar.d;
                if (!wVar.e && this.c != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(this.c.toString(), editable.toString())) {
                    String obj = editable.toString();
                    if (obj.length() > 8) {
                        editTextBoldCursor.setText(obj.substring(2, 8).toUpperCase());
                        editTextBoldCursor.setSelection(8);
                        break;
                    } else if (((Pattern) this.b).matcher(editable).find()) {
                        int length = obj.length();
                        if (length != 3) {
                            if (length == 6) {
                                i9 = ((int) Long.parseLong(obj, 16)) - 16777216;
                            } else if (length != 8) {
                                i9 = xVar.f;
                            } else {
                                parseLong = Long.parseLong(obj, 16);
                            }
                            if (i9 == xVar.f) {
                                xVar.m(i9, 5);
                                break;
                            }
                        } else {
                            parseLong = Long.parseLong("FF" + obj.charAt(0) + obj.charAt(0) + obj.charAt(1) + obj.charAt(1) + obj.charAt(2) + obj.charAt(2), 16);
                        }
                        i9 = (int) parseLong;
                        if (i9 == xVar.f) {
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                this.c = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    public tl0(xf.w wVar) {
        this.a = 2;
        this.d = wVar;
        this.b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
