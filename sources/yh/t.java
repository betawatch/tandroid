package yh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class t implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ t(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                String obj = editable.toString();
                z zVar = this.b;
                boolean isEmpty = TextUtils.isEmpty(zVar.I1);
                zVar.I1 = obj;
                zVar.w1.h(0L, zVar.l1, 0L, 0L, null, false, obj, isEmpty);
                break;
            default:
                String obj2 = editable.toString();
                z zVar2 = this.b;
                zVar2.J1 = obj2;
                zVar2.x1.f3.O(true);
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
