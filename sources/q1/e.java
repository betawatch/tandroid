package q1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements KeyListener {
    public final KeyListener a;
    public final v9.d b;

    public e(KeyListener keyListener) {
        v9.d dVar = new v9.d(21);
        this.a = keyListener;
        this.b = dVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i9) {
        this.a.clearMetaKeyState(view, editable, i9);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i9, KeyEvent keyEvent) {
        boolean z10;
        this.b.getClass();
        if (i9 != 67 ? i9 != 112 ? false : we.b.l(editable, keyEvent, true) : we.b.l(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.a.onKeyDown(view, editable, i9, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i9, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i9, keyEvent);
    }
}
