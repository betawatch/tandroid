package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class wa extends org.telegram.ui.Components.lo {
    public final /* synthetic */ int s;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa(int i7, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context);
        this.s = i7;
        this.w = e2Var;
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
                    ((an) this.w).P7(true);
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
                    ((an) this.w).P7(true);
                }
                return dispatchTouchEvent2;
        }
    }
}
