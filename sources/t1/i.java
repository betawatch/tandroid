package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i extends androidx.emoji2.text.i {
    public final WeakReference a;

    public i(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        j.a((EditText) this.a.get(), 1);
    }
}
