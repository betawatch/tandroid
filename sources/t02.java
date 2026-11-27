// default package

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t02 implements TextWatcher {
    public boolean a;
    public boolean b;
    public final /* synthetic */ e c;
    public final /* synthetic */ n12 d;

    public t02(n12 n12Var, e eVar) {
        this.d = n12Var;
        this.c = eVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        n12 n12Var = this.d;
        in inVar = n12Var.t1;
        r02 r02Var = n12Var.M2;
        int i2 = n12Var.G3;
        in inVar2 = n12Var.u1;
        if (this.b != TextUtils.isEmpty(editable)) {
            f12 f12Var = n12Var.v2;
            if (f12Var != null) {
                f12Var.E(f12Var.getSelectedItemsCount());
            }
            this.b = !this.b;
        }
        boolean z2 = false;
        if (this.a) {
            for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                editable.removeSpan(imageSpan);
            }
            pv3.l(editable, r02Var.getEditText().getPaint().getFontMetricsInt(), false);
            this.a = false;
        }
        int codePointCount = Character.codePointCount(editable, 0, editable.length());
        n12Var.F1 = codePointCount;
        n12Var.o1.a(codePointCount > 0, true);
        int i3 = n12Var.E1;
        if (i3 <= 0 || (i = i3 - n12Var.F1) > 100) {
            inVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new jb1(this, (byte) 12));
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
        if (!n12Var.f4 && !uc7.s1(i2).M3() && !yac.h(i2).p() && n12Var.F1 > uc7.s1(i2).k4.o1.f() && n12Var.F1 < uc7.s1(i2).k4.p1.f()) {
            n12Var.f4 = true;
            n12Var.z1(this.c);
        }
        if (n12Var.W1) {
            if (r02Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(r02Var.getText().toString().trim())) {
                z2 = true;
            }
            n12Var.x1(z2);
        }
        n12Var.J0(true);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 - i2 >= 1) {
            this.a = true;
        }
        n12 n12Var = this.d;
        if (n12Var.B4 == null) {
            n12Var.P0();
        }
        if (n12Var.B4.getAdapter() != null) {
            n12Var.B4.setReversed(true);
            n12Var.B4.getAdapter().U(charSequence, n12Var.M2.getEditText().getSelectionStart(), null, false, false);
            n12Var.F1();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
