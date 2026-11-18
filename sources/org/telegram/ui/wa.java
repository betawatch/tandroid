package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class wa extends org.telegram.ui.Components.so {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(int i7, Context context, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context);
        this.s = i7;
        this.w = h2Var;
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
