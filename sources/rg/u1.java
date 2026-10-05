package rg;

import android.graphics.RectF;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class u1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ v1 g;

    public u1(v1 v1Var) {
        this.g = v1Var;
    }

    public final void a(long j3, boolean z10) {
        v1 v1Var = this.g;
        RectF rectF = v1Var.a;
        this.e = j3 + v1Var.h + Utilities.fastRandom.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT);
        RectF rectF2 = z10 ? v1Var.b : rectF;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f = 0.0f;
    }
}
