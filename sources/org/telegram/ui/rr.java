package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rr implements TextWatcher {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rr(Object obj, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = -1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.a) {
            case 0:
                int i17 = this.c;
                int i18 = this.b;
                sr srVar = (sr) this.d;
                if (!srVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        srVar.d = true;
                        int i19 = i18;
                        for (int i20 = 0; i20 < Math.min(i17 - i18, length); i20++) {
                            if (i20 == 0) {
                                editable.replace(0, length, obj.substring(i20, i20 + 1));
                            } else {
                                i19++;
                                int i21 = i18 + i20;
                                vr[] vrVarArr = srVar.f;
                                if (i21 < vrVarArr.length) {
                                    vrVarArr[i21].setText(obj.substring(i20, i20 + 1));
                                }
                            }
                        }
                        srVar.d = false;
                        i18 = i19;
                    }
                    int i22 = i18 + 1;
                    if (i22 >= 0) {
                        vr[] vrVarArr2 = srVar.f;
                        if (i22 < vrVarArr2.length) {
                            vr vrVar = vrVarArr2[i22];
                            vrVar.setSelection(vrVar.length());
                            srVar.f[i22].requestFocus();
                        }
                    }
                    if ((i18 == i17 - 1 || (i18 == i17 - 2 && length >= 2)) && srVar.getCode().length() == i17) {
                        srVar.a();
                        break;
                    }
                }
                break;
            case 1:
                eg0 eg0Var = (eg0) this.d;
                bg0 bg0Var = eg0Var.b;
                if (!eg0Var.F) {
                    int selectionStart = bg0Var.getSelectionStart();
                    String obj2 = bg0Var.getText().toString();
                    if (this.b == 3) {
                        obj2 = obj2.substring(0, this.c) + obj2.substring(this.c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj2.length());
                    int i23 = 0;
                    while (i23 < obj2.length()) {
                        int i24 = i23 + 1;
                        String substring = obj2.substring(i23, i24);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i23 = i24;
                    }
                    eg0Var.F = true;
                    String hintText = bg0Var.getHintText();
                    if (hintText != null) {
                        int i25 = 0;
                        while (true) {
                            if (i25 < sb2.length()) {
                                if (i25 < hintText.length()) {
                                    if (hintText.charAt(i25) == ' ') {
                                        sb2.insert(i25, ' ');
                                        i25++;
                                        if (selectionStart == i25 && (i10 = this.b) != 2 && i10 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i25++;
                                } else {
                                    sb2.insert(i25, ' ');
                                    if (selectionStart == i25 + 1 && (i9 = this.b) != 2 && i9 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        bg0Var.setSelection(Math.min(selectionStart, bg0Var.length()));
                    }
                    bg0Var.invalidate();
                    eg0Var.r();
                    eg0Var.F = false;
                    break;
                }
                break;
            case 2:
                nj0 nj0Var = (nj0) this.d;
                if (!nj0Var.B) {
                    int selectionStart2 = nj0Var.M.getSelectionStart();
                    String obj3 = nj0Var.M.getText().toString();
                    if (this.b == 3) {
                        obj3 = obj3.substring(0, this.c) + obj3.substring(this.c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj3.length());
                    int i26 = 0;
                    while (i26 < obj3.length()) {
                        int i27 = i26 + 1;
                        String substring2 = obj3.substring(i26, i27);
                        if ("0123456789".contains(substring2)) {
                            sb3.append(substring2);
                        }
                        i26 = i27;
                    }
                    nj0Var.B = true;
                    String hintText2 = nj0Var.M.getHintText();
                    if (hintText2 != null) {
                        int i28 = 0;
                        while (true) {
                            if (i28 < sb3.length()) {
                                if (i28 < hintText2.length()) {
                                    if (hintText2.charAt(i28) == ' ') {
                                        sb3.insert(i28, ' ');
                                        i28++;
                                        if (selectionStart2 == i28 && (i12 = this.b) != 2 && i12 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i28++;
                                } else {
                                    sb3.insert(i28, ' ');
                                    if (selectionStart2 == i28 + 1 && (i11 = this.b) != 2 && i11 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        kj0 kj0Var = nj0Var.M;
                        kj0Var.setSelection(Math.min(selectionStart2, kj0Var.length()));
                    }
                    nj0Var.M.invalidate();
                    nj0Var.B = false;
                    nj0.q(nj0Var);
                    break;
                }
                break;
            case 3:
                wm0 wm0Var = (wm0) this.d;
                if (!wm0Var.W0) {
                    org.telegram.ui.Components.p30 p30Var = (org.telegram.ui.Components.p30) wm0Var.U[2];
                    int selectionStart3 = p30Var.getSelectionStart();
                    String obj4 = p30Var.getText().toString();
                    if (this.b == 3) {
                        obj4 = obj4.substring(0, this.c) + obj4.substring(this.c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj4.length());
                    int i29 = 0;
                    while (i29 < obj4.length()) {
                        int i30 = i29 + 1;
                        String substring3 = obj4.substring(i29, i30);
                        if ("0123456789".contains(substring3)) {
                            sb4.append(substring3);
                        }
                        i29 = i30;
                    }
                    wm0Var.W0 = true;
                    String hintText3 = p30Var.getHintText();
                    if (hintText3 != null) {
                        int i31 = 0;
                        while (true) {
                            if (i31 < sb4.length()) {
                                if (i31 < hintText3.length()) {
                                    if (hintText3.charAt(i31) == ' ') {
                                        sb4.insert(i31, ' ');
                                        i31++;
                                        if (selectionStart3 == i31 && (i14 = this.b) != 2 && i14 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i31++;
                                } else {
                                    sb4.insert(i31, ' ');
                                    if (selectionStart3 == i31 + 1 && (i13 = this.b) != 2 && i13 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    p30Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        p30Var.setSelection(Math.min(selectionStart3, p30Var.length()));
                    }
                    p30Var.invalidate();
                    wm0Var.W0 = false;
                    break;
                }
                break;
            default:
                co0 co0Var = (co0) this.d;
                if (!co0Var.j0) {
                    org.telegram.ui.Components.p30 p30Var2 = (org.telegram.ui.Components.p30) co0Var.f[9];
                    int selectionStart4 = p30Var2.getSelectionStart();
                    String obj5 = p30Var2.getText().toString();
                    if (this.b == 3) {
                        obj5 = obj5.substring(0, this.c) + obj5.substring(this.c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(obj5.length());
                    int i32 = 0;
                    while (i32 < obj5.length()) {
                        int i33 = i32 + 1;
                        String substring4 = obj5.substring(i32, i33);
                        if ("0123456789".contains(substring4)) {
                            sb5.append(substring4);
                        }
                        i32 = i33;
                    }
                    co0Var.j0 = true;
                    String hintText4 = p30Var2.getHintText();
                    if (hintText4 != null) {
                        int i34 = 0;
                        while (true) {
                            if (i34 < sb5.length()) {
                                if (i34 < hintText4.length()) {
                                    if (hintText4.charAt(i34) == ' ') {
                                        sb5.insert(i34, ' ');
                                        i34++;
                                        if (selectionStart4 == i34 && (i16 = this.b) != 2 && i16 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i34++;
                                } else {
                                    sb5.insert(i34, ' ');
                                    if (selectionStart4 == i34 + 1 && (i15 = this.b) != 2 && i15 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    p30Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        p30Var2.setSelection(Math.min(selectionStart4, p30Var2.length()));
                    }
                    p30Var2.invalidate();
                    co0Var.j0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (i10 != 0 || i11 != 1) {
                    if (i10 != 1 || i11 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i9) == ' ' && i9 > 0) {
                        this.b = 3;
                        this.c = i9 - 1;
                        break;
                    } else {
                        this.b = 2;
                        break;
                    }
                } else {
                    this.b = 1;
                    break;
                }
            case 2:
                if (i10 != 0 || i11 != 1) {
                    if (i10 != 1 || i11 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i9) == ' ' && i9 > 0) {
                        this.b = 3;
                        this.c = i9 - 1;
                        break;
                    } else {
                        this.b = 2;
                        break;
                    }
                } else {
                    this.b = 1;
                    break;
                }
            case 3:
                if (i10 != 0 || i11 != 1) {
                    if (i10 != 1 || i11 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i9) == ' ' && i9 > 0) {
                        this.b = 3;
                        this.c = i9 - 1;
                        break;
                    } else {
                        this.b = 2;
                        break;
                    }
                } else {
                    this.b = 1;
                    break;
                }
            default:
                if (i10 != 0 || i11 != 1) {
                    if (i10 != 1 || i11 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i9) == ' ' && i9 > 0) {
                        this.b = 3;
                        this.c = i9 - 1;
                        break;
                    } else {
                        this.b = 2;
                        break;
                    }
                } else {
                    this.b = 1;
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    public rr(sr srVar, int i9, int i10) {
        this.a = 0;
        this.d = srVar;
        this.b = i9;
        this.c = i10;
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

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
