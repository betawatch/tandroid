// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class wy1 extends j67 {
    public final /* synthetic */ ykc E0;
    public final /* synthetic */ ChatActivityEnterView F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar, ykc ykcVar) {
        super(context, ylbVar);
        this.F0 = chatActivityEnterView;
        this.E0 = ykcVar;
    }

    @Override // j67
    public final void m(long j) {
        this.F0.setEffectId(j);
        ykc ykcVar = this.E0;
        if (ykcVar != null) {
            ykcVar.invalidate();
        }
    }
}
