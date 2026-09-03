package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final xg.f a;

    public e(Context context) {
        super(context);
        xg.f fVar = new xg.f(context);
        this.a = fVar;
        addView(fVar, c6.g());
    }

    public final void a(og.a aVar, rg.d dVar) {
        xg.f fVar = this.a;
        fVar.b(aVar, dVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        bringChildToFront(this.a);
    }
}
