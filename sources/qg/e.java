package qg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e extends FrameLayout {
    public final sg.f a;

    public e(Context context) {
        super(context);
        sg.f fVar = new sg.f(context);
        this.a = fVar;
        addView(fVar, z5.g());
    }

    public final void a(jg.a aVar, mg.d dVar) {
        sg.f fVar = this.a;
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
