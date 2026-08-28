package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xa extends org.telegram.ui.Components.io {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(int i9, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.s = i9;
        this.v = o2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ya yaVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (yaVar = ((pb) this.v).F0) != null) {
                    yaVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((qn) this.v).A7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ya yaVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (yaVar = ((pb) this.v).F0) != null) {
                    yaVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((qn) this.v).A7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
