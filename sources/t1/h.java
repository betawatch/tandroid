package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
