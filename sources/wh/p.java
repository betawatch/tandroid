package wh;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p implements TextWatcher {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ hg.k0 b;

    public p(String[] strArr, hg.k0 k0Var) {
        this.a = strArr;
        this.b = k0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a[0] = editable.toString();
        this.b.run();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
