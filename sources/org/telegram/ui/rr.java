package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rr implements TextWatcher {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rr(Object obj, int i10) {
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
                sr srVar = (sr) this.d;
                if (!srVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        srVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                ur[] urVarArr = srVar.f;
                                if (i22 < urVarArr.length) {
                                    urVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        srVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        ur[] urVarArr2 = srVar.f;
                        if (i23 < urVarArr2.length) {
                            ur urVar = urVarArr2[i23];
                            urVar.setSelection(urVar.length());
                            srVar.f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && srVar.getCode().length() == i18) {
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
                    int i24 = 0;
                    while (i24 < obj2.length()) {
                        int i25 = i24 + 1;
                        String substring = obj2.substring(i24, i25);
                        if ("0123456789".contains(substring)) {
                            sb2.append(substring);
                        }
                        i24 = i25;
                    }
                    eg0Var.F = true;
                    String hintText = bg0Var.getHintText();
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
                        bg0Var.setSelection(Math.min(selectionStart, bg0Var.length()));
                    }
                    bg0Var.invalidate();
                    eg0Var.r();
                    eg0Var.F = false;
                    break;
                }
                break;
            case 2:
                kj0 kj0Var = (kj0) this.d;
                if (!kj0Var.B) {
                    int selectionStart2 = kj0Var.M.getSelectionStart();
                    String obj3 = kj0Var.M.getText().toString();
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
                    kj0Var.B = true;
                    String hintText2 = kj0Var.M.getHintText();
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
                        ij0 ij0Var = kj0Var.M;
                        ij0Var.setSelection(Math.min(selectionStart2, ij0Var.length()));
                    }
                    kj0Var.M.invalidate();
                    kj0Var.B = false;
                    kj0.q(kj0Var);
                    break;
                }
                break;
            case 3:
                vm0 vm0Var = (vm0) this.d;
                if (!vm0Var.W0) {
                    org.telegram.ui.Components.d40 d40Var = (org.telegram.ui.Components.d40) vm0Var.U[2];
                    int selectionStart3 = d40Var.getSelectionStart();
                    String obj4 = d40Var.getText().toString();
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
                    vm0Var.W0 = true;
                    String hintText3 = d40Var.getHintText();
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
                    d40Var.setText(sb4);
                    if (selectionStart3 >= 0) {
                        d40Var.setSelection(Math.min(selectionStart3, d40Var.length()));
                    }
                    d40Var.invalidate();
                    vm0Var.W0 = false;
                    break;
                }
                break;
            default:
                bo0 bo0Var = (bo0) this.d;
                if (!bo0Var.j0) {
                    org.telegram.ui.Components.d40 d40Var2 = (org.telegram.ui.Components.d40) bo0Var.f[9];
                    int selectionStart4 = d40Var2.getSelectionStart();
                    String obj5 = d40Var2.getText().toString();
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
                    bo0Var.j0 = true;
                    String hintText4 = d40Var2.getHintText();
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
                    d40Var2.setText(sb5);
                    if (selectionStart4 >= 0) {
                        d40Var2.setSelection(Math.min(selectionStart4, d40Var2.length()));
                    }
                    d40Var2.invalidate();
                    bo0Var.j0 = false;
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

    public rr(sr srVar, int i10, int i11) {
        this.a = 0;
        this.d = srVar;
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
