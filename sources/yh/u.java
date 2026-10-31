package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ u(a0 a0Var, int i10) {
        this.a = i10;
        this.b = a0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                String obj = editable.toString();
                a0 a0Var = this.b;
                boolean isEmpty = TextUtils.isEmpty(a0Var.I1);
                a0Var.I1 = obj;
                a0Var.w1.h(0L, a0Var.l1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                String obj2 = editable.toString();
                a0 a0Var2 = this.b;
                a0Var2.J1 = obj2;
                a0Var2.x1.f3.O(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    private final /* synthetic */ void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final /* synthetic */ void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
