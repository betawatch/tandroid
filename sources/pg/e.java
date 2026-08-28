package pg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final rg.f a;

    public e(Context context) {
        super(context);
        rg.f fVar = new rg.f(context);
        this.a = fVar;
        addView(fVar, e6.g());
    }

    public final void a(ig.a aVar, lg.d dVar) {
        rg.f fVar = this.a;
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
