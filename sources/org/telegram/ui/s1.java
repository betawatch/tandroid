package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s1 extends WebView {
    public final /* synthetic */ t1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var, Context context) {
        super(context);
        this.a = t1Var;
        setFocusable(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t1 t1Var = this.a;
        t1Var.s = true;
        TL_iv.pageBlockEmbed pageblockembed = t1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                t1Var.x.f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
