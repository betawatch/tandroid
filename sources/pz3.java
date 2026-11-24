// default package

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pz3 extends tx3 {
    public final WeakReference a;

    public pz3(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // tx3
    public final void a() {
        qz3.a((EditText) this.a.get(), 1);
    }
}
