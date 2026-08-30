package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xr implements TextWatcher {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xr(Object obj, int i10) {
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
                yr yrVar = (yr) this.d;
                if (!yrVar.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj = editable.toString();
                        yrVar.d = true;
                        int i20 = i19;
                        for (int i21 = 0; i21 < Math.min(i18 - i19, length); i21++) {
                            if (i21 == 0) {
                                editable.replace(0, length, obj.substring(i21, i21 + 1));
                            } else {
                                i20++;
                                int i22 = i19 + i21;
                                bs[] bsVarArr = yrVar.f;
                                if (i22 < bsVarArr.length) {
                                    bsVarArr[i22].setText(obj.substring(i21, i21 + 1));
                                }
                            }
                        }
                        yrVar.d = false;
                        i19 = i20;
                    }
                    int i23 = i19 + 1;
                    if (i23 >= 0) {
                        bs[] bsVarArr2 = yrVar.f;
                        if (i23 < bsVarArr2.length) {
                            bs bsVar = bsVarArr2[i23];
                            bsVar.setSelection(bsVar.length());
                            yrVar.f[i23].requestFocus();
                        }
                    }
                    if ((i19 == i18 - 1 || (i19 == i18 - 2 && length >= 2)) && yrVar.getCode().length() == i18) {
                        yrVar.a();
                        break;
                    }
                }
                break;
            case 1:
                mg0 mg0Var = (mg0) this.d;
                jg0 jg0Var = mg0Var.b;
                if (!mg0Var.G) {
                    int selectionStart = jg0Var.getSelectionStart();
                    String obj2 = jg0Var.getText().toString();
                    if (this.b == 3) {
                        obj2 = obj2.substring(0, this.c) + obj2.substring(this.c + 1);
                        selectionStart--;
                    }
                    StringBuilder sb = new StringBuilder(obj2.length());
                    int i24 = 0;
                    while (i24 < obj2.length()) {
                        int i25 = i24 + 1;
                        String substring = obj2.substring(i24, i25);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i24 = i25;
                    }
                    mg0Var.G = true;
                    String hintText = jg0Var.getHintText();
                    if (hintText != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb.length()) {
                                if (i26 < hintText.length()) {
                                    if (hintText.charAt(i26) == ' ') {
                                        sb.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart == i26 && (i11 = this.b) != 2 && i11 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb.insert(i26, ' ');
                                    if (selectionStart == i26 + 1 && (i10 = this.b) != 2 && i10 != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb);
                    if (selectionStart >= 0) {
                        jg0Var.setSelection(Math.min(selectionStart, jg0Var.length()));
                    }
                    jg0Var.invalidate();
                    mg0Var.r();
                    mg0Var.G = false;
                    break;
                }
                break;
            case 2:
                sj0 sj0Var = (sj0) this.d;
                if (!sj0Var.C) {
                    int selectionStart2 = sj0Var.N.getSelectionStart();
                    String obj3 = sj0Var.N.getText().toString();
                    if (this.b == 3) {
                        obj3 = obj3.substring(0, this.c) + obj3.substring(this.c + 1);
                        selectionStart2--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj3.length());
                    int i27 = 0;
                    while (i27 < obj3.length()) {
                        int i28 = i27 + 1;
                        String substring2 = obj3.substring(i27, i28);
                        if ("0123456789".contains(substring2)) {
                            sb2.append(substring2);
                        }
                        i27 = i28;
                    }
                    sj0Var.C = true;
                    String hintText2 = sj0Var.N.getHintText();
                    if (hintText2 != null) {
                        int i29 = 0;
                        while (true) {
                            if (i29 < sb2.length()) {
                                if (i29 < hintText2.length()) {
                                    if (hintText2.charAt(i29) == ' ') {
                                        sb2.insert(i29, ' ');
                                        i29++;
                                        if (selectionStart2 == i29 && (i13 = this.b) != 2 && i13 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i29++;
                                } else {
                                    sb2.insert(i29, ' ');
                                    if (selectionStart2 == i29 + 1 && (i12 = this.b) != 2 && i12 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart2 >= 0) {
                        qj0 qj0Var = sj0Var.N;
                        qj0Var.setSelection(Math.min(selectionStart2, qj0Var.length()));
                    }
                    sj0Var.N.invalidate();
                    sj0Var.C = false;
                    sj0.q(sj0Var);
                    break;
                }
                break;
            case 3:
                dn0 dn0Var = (dn0) this.d;
                if (!dn0Var.X0) {
                    org.telegram.ui.Components.h40 h40Var = (org.telegram.ui.Components.h40) dn0Var.V[2];
                    int selectionStart3 = h40Var.getSelectionStart();
                    String obj4 = h40Var.getText().toString();
                    if (this.b == 3) {
                        obj4 = obj4.substring(0, this.c) + obj4.substring(this.c + 1);
                        selectionStart3--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj4.length());
                    int i30 = 0;
                    while (i30 < obj4.length()) {
                        int i31 = i30 + 1;
                        String substring3 = obj4.substring(i30, i31);
                        if ("0123456789".contains(substring3)) {
                            sb3.append(substring3);
                        }
                        i30 = i31;
                    }
                    dn0Var.X0 = true;
                    String hintText3 = h40Var.getHintText();
                    if (hintText3 != null) {
                        int i32 = 0;
                        while (true) {
                            if (i32 < sb3.length()) {
                                if (i32 < hintText3.length()) {
                                    if (hintText3.charAt(i32) == ' ') {
                                        sb3.insert(i32, ' ');
                                        i32++;
                                        if (selectionStart3 == i32 && (i15 = this.b) != 2 && i15 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i32++;
                                } else {
                                    sb3.insert(i32, ' ');
                                    if (selectionStart3 == i32 + 1 && (i14 = this.b) != 2 && i14 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    h40Var.setText(sb3);
                    if (selectionStart3 >= 0) {
                        h40Var.setSelection(Math.min(selectionStart3, h40Var.length()));
                    }
                    h40Var.invalidate();
                    dn0Var.X0 = false;
                    break;
                }
                break;
            default:
                jo0 jo0Var = (jo0) this.d;
                if (!jo0Var.k0) {
                    org.telegram.ui.Components.h40 h40Var2 = (org.telegram.ui.Components.h40) jo0Var.f[9];
                    int selectionStart4 = h40Var2.getSelectionStart();
                    String obj5 = h40Var2.getText().toString();
                    if (this.b == 3) {
                        obj5 = obj5.substring(0, this.c) + obj5.substring(this.c + 1);
                        selectionStart4--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj5.length());
                    int i33 = 0;
                    while (i33 < obj5.length()) {
                        int i34 = i33 + 1;
                        String substring4 = obj5.substring(i33, i34);
                        if ("0123456789".contains(substring4)) {
                            sb4.append(substring4);
                        }
                        i33 = i34;
                    }
                    jo0Var.k0 = true;
                    String hintText4 = h40Var2.getHintText();
                    if (hintText4 != null) {
                        int i35 = 0;
                        while (true) {
                            if (i35 < sb4.length()) {
                                if (i35 < hintText4.length()) {
                                    if (hintText4.charAt(i35) == ' ') {
                                        sb4.insert(i35, ' ');
                                        i35++;
                                        if (selectionStart4 == i35 && (i17 = this.b) != 2 && i17 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i35++;
                                } else {
                                    sb4.insert(i35, ' ');
                                    if (selectionStart4 == i35 + 1 && (i16 = this.b) != 2 && i16 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    h40Var2.setText(sb4);
                    if (selectionStart4 >= 0) {
                        h40Var2.setSelection(Math.min(selectionStart4, h40Var2.length()));
                    }
                    h40Var2.invalidate();
                    jo0Var.k0 = false;
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

    public xr(yr yrVar, int i10, int i11) {
        this.a = 0;
        this.d = yrVar;
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
