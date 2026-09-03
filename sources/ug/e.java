package ug;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final wg.f a;

    public e(Context context) {
        super(context);
        wg.f fVar = new wg.f(context);
        this.a = fVar;
        addView(fVar, b6.g());
    }

    public final void a(ng.a aVar, qg.d dVar) {
        wg.f fVar = this.a;
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
