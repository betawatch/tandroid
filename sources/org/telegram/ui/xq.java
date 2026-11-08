package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xq implements TextWatcher {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xq(Object obj, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = -1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        int i7;
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
                yq yqVar = (yq) this.d;
                if (!yqVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        yqVar.d = true;
                        int i19 = i18;
                        for (int i20 = 0; i20 < Math.min(i17 - i18, length); i20++) {
                            if (i20 == 0) {
                                editable.replace(0, length, obj.substring(i20, i20 + 1));
                            } else {
                                i19++;
                                int i21 = i18 + i20;
                                br[] brVarArr = yqVar.f;
                                if (i21 < brVarArr.length) {
                                    brVarArr[i21].setText(obj.substring(i20, i20 + 1));
                                }
                            }
                        }
                        yqVar.d = false;
                        i18 = i19;
                    }
                    int i22 = i18 + 1;
                    if (i22 >= 0) {
                        br[] brVarArr2 = yqVar.f;
                        if (i22 < brVarArr2.length) {
                            br brVar = brVarArr2[i22];
                            brVar.setSelection(brVar.length());
                            yqVar.f[i22].requestFocus();
                        }
                    }
                    if ((i18 == i17 - 1 || (i18 == i17 - 2 && length >= 2)) && yqVar.getCode().length() == i17) {
                        yqVar.a();
                        break;
                    }
                }
                break;
            case 1:
                be0 be0Var = (be0) this.d;
                zd0 zd0Var = be0Var.b;
                if (!be0Var.L) {
                    int selectionStart = zd0Var.getSelectionStart();
                    String obj2 = zd0Var.getText().toString();
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
                    be0Var.L = true;
                    String hintText = zd0Var.getHintText();
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
                                    if (selectionStart == i25 + 1 && (i7 = this.b) != 2 && i7 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        zd0Var.setSelection(Math.min(selectionStart, zd0Var.length()));
                    }
                    zd0Var.invalidate();
                    be0Var.q();
                    be0Var.L = false;
                    break;
                }
                break;
            case 2:
                ah0 ah0Var = (ah0) this.d;
                if (!ah0Var.v1) {
                    int selectionStart2 = ah0Var.G1.getSelectionStart();
                    String obj3 = ah0Var.G1.getText().toString();
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
                    ah0Var.v1 = true;
                    String hintText2 = ah0Var.G1.getHintText();
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
                        zg0 zg0Var = ah0Var.G1;
                        zg0Var.setSelection(Math.min(selectionStart2, zg0Var.length()));
                    }
                    ah0Var.G1.invalidate();
                    ah0Var.v1 = false;
                    ah0.I0(ah0Var);
                    break;
                }
                break;
            case 3:
                bk0 bk0Var = (bk0) this.d;
                if (!bk0Var.a1) {
                    org.telegram.ui.Components.v20 v20Var = (org.telegram.ui.Components.v20) bk0Var.Y[2];
                    int selectionStart3 = v20Var.getSelectionStart();
                    String obj4 = v20Var.getText().toString();
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
                    bk0Var.a1 = true;
                    String hintText3 = v20Var.getHintText();
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
                    v20Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        v20Var.setSelection(Math.min(selectionStart3, v20Var.length()));
                    }
                    v20Var.invalidate();
                    bk0Var.a1 = false;
                    break;
                }
                break;
            default:
                hl0 hl0Var = (hl0) this.d;
                if (!hl0Var.n0) {
                    org.telegram.ui.Components.v20 v20Var2 = (org.telegram.ui.Components.v20) hl0Var.f[9];
                    int selectionStart4 = v20Var2.getSelectionStart();
                    String obj5 = v20Var2.getText().toString();
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
                    hl0Var.n0 = true;
                    String hintText4 = v20Var2.getHintText();
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
                    v20Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        v20Var2.setSelection(Math.min(selectionStart4, v20Var2.length()));
                    }
                    v20Var2.invalidate();
                    hl0Var.n0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (i10 != 0 || i11 != 1) {
                    if (i10 != 1 || i11 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.b = 3;
                        this.c = i7 - 1;
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
                    } else if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.b = 3;
                        this.c = i7 - 1;
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
                    } else if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.b = 3;
                        this.c = i7 - 1;
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
                    } else if (charSequence.charAt(i7) == ' ' && i7 > 0) {
                        this.b = 3;
                        this.c = i7 - 1;
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
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    public xq(yq yqVar, int i7, int i10) {
        this.a = 0;
        this.d = yqVar;
        this.b = i7;
        this.c = i10;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
