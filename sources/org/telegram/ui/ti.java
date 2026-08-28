package org.telegram.ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ti extends FrameLayout {
    public final /* synthetic */ qn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(qn qnVar, Activity activity) {
        super(activity);
        this.a = qnVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0) {
            this.a.A7(true);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(300.0f));
        if (min == 0) {
            min = AndroidUtilities.dp(300.0f);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_31));
    }
}
