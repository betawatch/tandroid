package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tb0 extends FrameLayout {
    public final HashMap a;
    public final /* synthetic */ xb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb0(xb0 xb0Var, Context context) {
        super(context);
        this.b = xb0Var;
        this.a = new HashMap();
    }

    public final void a() {
        org.telegram.messenger.ha haVar = this.b.G;
        if (haVar == null) {
            return;
        }
        n2.u g10 = haVar.g();
        for (Map.Entry entry : this.a.entrySet()) {
            org.telegram.messenger.ga gaVar = (org.telegram.messenger.ga) entry.getKey();
            View view = (View) entry.getValue();
            Point a02 = g10.a0(gaVar.a());
            view.setTranslationX(a02.x - (view.getMeasuredWidth() / 2));
            view.setTranslationY(org.telegram.messenger.i0.L(22.0f) + (a02.y - view.getMeasuredHeight()));
        }
    }
}
