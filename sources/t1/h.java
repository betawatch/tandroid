package t1;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
