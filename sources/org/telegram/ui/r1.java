package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r1 extends WebView {
    public final /* synthetic */ s1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, Context context) {
        super(context);
        this.a = s1Var;
        setFocusable(false);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s1 s1Var = this.a;
        s1Var.s = true;
        TL_iv.pageBlockEmbed pageblockembed = s1Var.v;
        if (pageblockembed != null) {
            if (pageblockembed.allow_scrolling) {
                requestDisallowInterceptTouchEvent(true);
            } else {
                s1Var.x.f0.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
