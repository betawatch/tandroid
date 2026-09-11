package yh;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class j implements TextWatcher {
    public final /* synthetic */ View[] a;
    public final /* synthetic */ m b;

    public j(m mVar, View[] viewArr) {
        this.b = mVar;
        this.a = viewArr;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        View[] viewArr = this.a;
        try {
            boolean z10 = ((long) Integer.parseInt(editable.toString())) >= this.b.l0.getMinimumBid();
            viewArr[0].animate().alpha(z10 ? 1.0f : 0.6f).setDuration(180L).start();
            viewArr[0].setEnabled(z10);
            viewArr[0].setClickable(z10);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
