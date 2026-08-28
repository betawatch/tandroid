package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u1 extends WebView {
    public final /* synthetic */ v1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, Context context) {
        super(context);
        this.a = v1Var;
        setFocusable(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v1 v1Var = this.a;
        v1Var.s = true;
        TL_iv.pageBlockEmbed pageblockembed = v1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                v1Var.x.b0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
