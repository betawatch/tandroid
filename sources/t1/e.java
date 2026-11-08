package t1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e implements KeyListener {
    public final KeyListener a;
    public final qb.a b;

    public e(KeyListener keyListener) {
        qb.a aVar = new qb.a(24);
        this.a = keyListener;
        this.b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i7) {
        this.a.clearMetaKeyState(view, editable, i7);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
        boolean z9;
        this.b.getClass();
        if (i7 != 67 ? i7 != 112 ? false : wf.b.E(editable, keyEvent, true) : wf.b.E(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z9 = true;
        } else {
            z9 = false;
        }
        return z9 || this.a.onKeyDown(view, editable, i7, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i7, keyEvent);
    }
}
