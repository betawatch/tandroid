package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class m1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ n1 g;

    public m1(n1 n1Var) {
        this.g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        n1 n1Var = this.g;
        RectF rectF = n1Var.a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.c;
        this.e = j10 + aVar.nextInt(1000);
        RectF rectF2 = z9 ? n1Var.b : rectF;
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
