// default package

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yza extends bf0 {
    public final /* synthetic */ ylb H;
    public final /* synthetic */ a0b I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yza(a0b a0bVar, Context context, ylb ylbVar) {
        super(context);
        this.I = a0bVar;
        this.H = ylbVar;
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        a0b a0bVar = this.I;
        v4b v4bVar = a0bVar.r;
        uza uzaVar = a0bVar.w;
        if (uzaVar == null || !(uzaVar.a instanceof TL_stats.TL_postInteractionCountersStory)) {
            super.onDraw(canvas);
            return;
        }
        float L = gm.L(1.0f);
        v4bVar.F.set(L, L, getMeasuredWidth() - r0, getMeasuredHeight() - r0);
        v4bVar.a = false;
        v4bVar.b = false;
        v4bVar.v = true;
        v4bVar.o = false;
        v4bVar.z = 1;
        v4bVar.J = this.H;
        y4b.h(0L, canvas, this.a, v4bVar);
    }
}
