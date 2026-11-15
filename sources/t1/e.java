package t1;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e implements KeyListener {
    public final KeyListener a;
    public final nb.a b;

    public e(KeyListener keyListener) {
        nb.a aVar = new nb.a(25);
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
        boolean z10;
        this.b.getClass();
        if (i7 != 67 ? i7 != 112 ? false : wf.b.s(editable, keyEvent, true) : wf.b.s(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        return z10 || this.a.onKeyDown(view, editable, i7, keyEvent);
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
