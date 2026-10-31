package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yr implements TextWatcher {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yr(Object obj, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = -1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.a) {
            case 0:
                int i18 = this.c;
                int i19 = this.b;
                zr zrVar = (zr) this.d;
                if (!zrVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        zrVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                bs[] bsVarArr = zrVar.f;
                                if (i22 < bsVarArr.length) {
                                    bsVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        zrVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        bs[] bsVarArr2 = zrVar.f;
                        if (i23 < bsVarArr2.length) {
                            bs bsVar = bsVarArr2[i23];
                            bsVar.setSelection(bsVar.length());
                            zrVar.f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && zrVar.getCode().length() == i18) {
                        zrVar.a();
                        break;
                    }
                }
                break;
            case 1:
                gf0 gf0Var = (gf0) this.d;
                ef0 ef0Var = gf0Var.b;
                if (!gf0Var.L) {
                    int selectionStart = ef0Var.getSelectionStart();
                    String obj2 = ef0Var.getText().toString();
                    if (this.b == 3) {
                        obj2 = obj2.substring(0, this.c) + obj2.substring(this.c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj2.length());
                    int i24 = 0;
                    while (i24 < obj2.length()) {
                        int i25 = i24 + 1;
                        String substring = obj2.substring(i24, i25);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i24 = i25;
                    }
                    gf0Var.L = true;
                    String hintText = ef0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb2.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb2.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb2.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart >= 0) {
                        ef0Var.setSelection(Math.min(selectionStart, ef0Var.length()));
                    }
                    ef0Var.invalidate();
                    gf0Var.p();
                    gf0Var.L = false;
                    break;
                }
                break;
            case 2:
                gi0 gi0Var = (gi0) this.d;
                if (!gi0Var.v1) {
                    int selectionStart2 = gi0Var.G1.getSelectionStart();
                    String obj3 = gi0Var.G1.getText().toString();
                    if (this.b == 3) {
                        obj3 = obj3.substring(0, this.c) + obj3.substring(this.c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj3.length());
                    int i27 = 0;
                    while (i27 < obj3.length()) {
                        int i28 = i27 + 1;
                        String substring2 = obj3.substring(i27, i28);
                        if ("0123456789".contains(substring2)) {
                            sb3.append(substring2);
                        }
                        i27 = i28;
                    }
                    gi0Var.v1 = true;
                    String hintText2 = gi0Var.G1.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb3.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb3.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb3.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb3);
                    if (selectionStart2 >= 0) {
                        fi0 fi0Var = gi0Var.G1;
                        fi0Var.setSelection(Math.min(selectionStart2, fi0Var.length()));
                    }
                    gi0Var.G1.invalidate();
                    gi0Var.v1 = false;
                    gi0.I0(gi0Var);
                    break;
                }
                break;
            case 3:
                ll0 ll0Var = (ll0) this.d;
                if (!ll0Var.a1) {
                    org.telegram.ui.Components.n30 n30Var = (org.telegram.ui.Components.n30) ll0Var.Y[2];
                    int selectionStart3 = n30Var.getSelectionStart();
                    String obj4 = n30Var.getText().toString();
                    if (this.b == 3) {
                        obj4 = obj4.substring(0, this.c) + obj4.substring(this.c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj4.length());
                    int i30 = 0;
                    while (i30 < obj4.length()) {
                        int i31 = i30 + 1;
                        String substring3 = obj4.substring(i30, i31);
                        if ("0123456789".contains(substring3)) {
                            sb4.append(substring3);
                        }
                        i30 = i31;
                    }
                    ll0Var.a1 = true;
                    String hintText3 = n30Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb4.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb4.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb4.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    n30Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        n30Var.setSelection(Math.min(selectionStart3, n30Var.length()));
                    }
                    n30Var.invalidate();
                    ll0Var.a1 = false;
                    break;
                }
                break;
            default:
                sm0 sm0Var = (sm0) this.d;
                if (!sm0Var.n0) {
                    org.telegram.ui.Components.n30 n30Var2 = (org.telegram.ui.Components.n30) sm0Var.f[9];
                    int selectionStart4 = n30Var2.getSelectionStart();
                    String obj5 = n30Var2.getText().toString();
                    if (this.b == 3) {
                        obj5 = obj5.substring(0, this.c) + obj5.substring(this.c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb5 = new StringBuilder(obj5.length());
                    int i33 = 0;
                    while (i33 < obj5.length()) {
                        int i34 = i33 + 1;
                        String substring4 = obj5.substring(i33, i34);
                        if ("0123456789".contains(substring4)) {
                            sb5.append(substring4);
                        }
                        i33 = i34;
                    }
                    sm0Var.n0 = true;
                    String hintText4 = n30Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb5.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb5.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb5.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    n30Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        n30Var2.setSelection(Math.min(selectionStart4, n30Var2.length()));
                    }
                    n30Var2.invalidate();
                    sm0Var.n0 = false;
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (i11 != 0 || i12 != 1) {
                    if (i11 != 1 || i12 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.b = 3;
                        this.c = i10 - 1;
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
                if (i11 != 0 || i12 != 1) {
                    if (i11 != 1 || i12 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.b = 3;
                        this.c = i10 - 1;
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
                if (i11 != 0 || i12 != 1) {
                    if (i11 != 1 || i12 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.b = 3;
                        this.c = i10 - 1;
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
                if (i11 != 0 || i12 != 1) {
                    if (i11 != 1 || i12 != 0) {
                        this.b = -1;
                        break;
                    } else if (charSequence.charAt(i10) == ' ' && i10 > 0) {
                        this.b = 3;
                        this.c = i10 - 1;
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
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public yr(zr zrVar, int i10, int i11) {
        this.a = 0;
        this.d = zrVar;
        this.b = i10;
        this.c = i11;
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

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
