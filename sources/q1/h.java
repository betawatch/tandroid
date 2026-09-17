package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class h extends androidx.emoji2.text.i {
    public final WeakReference a;

    public h(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.i
    public final void a() {
        i.a((EditText) this.a.get(), 1);
    }
}
