package q1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
