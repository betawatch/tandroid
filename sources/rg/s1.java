package rg;

import android.graphics.RectF;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class s1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ t1 g;

    public s1(t1 t1Var) {
        this.g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        t1 t1Var = this.g;
        RectF rectF = t1Var.a;
        this.e = j3 + t1Var.h + Utilities.fastRandom.nextInt(MediaDataController.MAX_STYLE_RUNS_COUNT);
        RectF rectF2 = z10 ? t1Var.b : rectF;
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
