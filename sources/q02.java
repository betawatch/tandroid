// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q02 implements TextWatcher {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ q02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.d = callback;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        byte b = this.a;
        boolean z2 = false;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                n12 n12Var = (n12) callback;
                in inVar = n12Var.u1;
                p02 p02Var = n12Var.B2;
                in inVar2 = n12Var.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    f12 f12Var = n12Var.v2;
                    if (f12Var != null) {
                        f12Var.E(f12Var.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    pv3.l(editable, p02Var.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                n12Var.F1 = codePointCount;
                n12Var.o1.a(codePointCount > 0, true);
                int i2 = n12Var.E1;
                if (i2 <= 0 || (i = i2 - n12Var.F1) > 100) {
                    inVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new jb1((Object) this, (byte) 11));
                    inVar.setAlpha(0.0f);
                    z = true;
                } else {
                    if (i < -9999) {
                        i = -9999;
                    }
                    long j = i;
                    inVar2.c(ob6.E(j, ','), inVar2.getVisibility() == 0, true);
                    if (inVar2.getVisibility() != 0) {
                        inVar2.setVisibility(0);
                        inVar2.setAlpha(0.0f);
                        inVar2.setScaleX(0.5f);
                        inVar2.setScaleY(0.5f);
                    }
                    inVar2.animate().setListener(null).cancel();
                    inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i < 0) {
                        yob.U(inVar2, aob.p7, n12Var.J0);
                        z = false;
                    } else {
                        yob.U(inVar2, aob.y6, n12Var.J0);
                        z = true;
                    }
                    inVar.c(ob6.E(j, ','), false, true);
                    inVar.setAlpha(1.0f);
                }
                if (n12Var.R2 != z) {
                    n12Var.R2 = z;
                    n12Var.F2.invalidate();
                }
                if (!n12Var.W1) {
                    if (p02Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(p02Var.getText().toString().trim())) {
                        z2 = true;
                    }
                    n12Var.x1(z2);
                }
                n12Var.J0(true);
                return;
            default:
                duc ducVar = (duc) callback;
                if (!this.b) {
                    ducVar.f(editable);
                    return;
                }
                this.b = false;
                this.c = true;
                try {
                    editable.append('.');
                    this.c = false;
                    ducVar.c.setSelection(editable.length());
                    return;
                } catch (Throwable th) {
                    this.c = false;
                    throw th;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                duc ducVar = (duc) this.d;
                ytc ytcVar = ducVar.c;
                if (charSequence.length() > 0 && i2 == charSequence.length() && i3 == 0 && ytcVar.getLayout() != null) {
                    ducVar.O = ytcVar.getLayout().getLineLeft(0) - ytcVar.getScrollX();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                n12 n12Var = (n12) callback;
                if (i3 - i2 >= 1) {
                    this.b = true;
                }
                if (n12Var.B4 == null) {
                    n12Var.P0();
                }
                if (n12Var.B4.getAdapter() != null) {
                    n12Var.B4.setReversed(false);
                    n12Var.B4.getAdapter().U(charSequence, n12Var.B2.getEditText().getSelectionStart(), null, false, false);
                    n12Var.F1();
                    break;
                }
                break;
            default:
                this.b = i3 > 0 && TextUtils.equals(charSequence, "0");
                duc ducVar = (duc) callback;
                if (!ducVar.S && !this.c) {
                    if (i2 != 0 || i3 != 0) {
                        yrc yrcVar = ducVar.d;
                        boolean z = i3 > 0 && i3 >= i2;
                        if (yrcVar.y && yrcVar.r && yrcVar.E == -1) {
                            e29 e29Var = yrcVar.h;
                            if (e29Var == null) {
                                yrcVar.e0 = xnb.f(yrcVar.e0, z ? -160.0f : 160.0f, 360.0f, -360.0f);
                                break;
                            } else if (!e29Var.b()) {
                                yrcVar.h.setProgress(0.0f);
                                yrcVar.h.d();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }
}
