package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tk0 extends WebView {
    public tk0(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}
