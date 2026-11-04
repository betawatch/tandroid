package vg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ q1 g;

    public p1(q1 q1Var) {
        this.g = q1Var;
    }

    public final void a(long j10, boolean z10) {
        q1 q1Var = this.g;
        RectF rectF = q1Var.a;
        long j11 = j10 + q1Var.h;
        f5.a aVar = Utilities.c;
        this.e = j11 + aVar.nextInt(1000);
        RectF rectF2 = z10 ? q1Var.b : rectF;
        float abs = Math.abs(((int) aVar.nextLong()) % rectF2.width()) + rectF2.left;
        float abs2 = Math.abs(((int) aVar.nextLong()) % rectF2.height()) + rectF2.top;
        this.a = abs;
        this.b = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.b - rectF.centerY());
        this.c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f = 0.0f;
    }
}
