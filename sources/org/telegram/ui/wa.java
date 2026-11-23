package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class wa extends org.telegram.ui.Components.uo {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context);
        this.s = i7;
        this.w = g2Var;
        setOrientation(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        xa xaVar;
        switch (this.s) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (xaVar = ((lb) this.w).G0) != null) {
                    xaVar.dismiss();
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
                    ((bn) this.w).P7(true);
                }
                break;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        xa xaVar;
        switch (this.s) {
            case 0:
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent && (xaVar = ((lb) this.w).G0) != null) {
                    xaVar.dismiss();
                }
                return dispatchTouchEvent;
            default:
                boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0 && !dispatchTouchEvent2) {
                    ((bn) this.w).P7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
