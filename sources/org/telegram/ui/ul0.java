package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import j$.util.Objects;
import java.util.regex.Pattern;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ul0 implements TextWatcher {
    public final /* synthetic */ int a;
    public final Object b;
    public String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ul0(xm0 xm0Var, EditTextBoldCursor editTextBoldCursor, String str, int i10) {
        this.a = i10;
        this.d = xm0Var;
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
        int i10;
        switch (this.a) {
            case 0:
                xm0.J0((xm0) this.d, (EditTextBoldCursor) this.b, this.c, editable, false);
                break;
            case 1:
                xm0.J0((xm0) this.d, (EditTextBoldCursor) this.b, this.c, editable, false);
                break;
            default:
                yf.w wVar = (yf.w) this.d;
                yf.x xVar = wVar.f;
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
                                i10 = ((int) Long.parseLong(obj, 16)) - 16777216;
                            } else if (length != 8) {
                                i10 = xVar.f;
                            } else {
                                parseLong = Long.parseLong(obj, 16);
                            }
                            if (i10 == xVar.f) {
                                xVar.m(i10, 5);
                                break;
                            }
                        } else {
                            parseLong = Long.parseLong("FF" + obj.charAt(0) + obj.charAt(0) + obj.charAt(1) + obj.charAt(1) + obj.charAt(2) + obj.charAt(2), 16);
                        }
                        i10 = (int) parseLong;
                        if (i10 == xVar.f) {
                        }
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public ul0(yf.w wVar) {
        this.a = 2;
        this.d = wVar;
        this.b = Pattern.compile("^[0-9a-fA-F]*$");
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
