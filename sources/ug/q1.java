package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class q1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ r1 g;

    public q1(r1 r1Var) {
        this.g = r1Var;
    }

    public final void a(long j3, boolean z10) {
        r1 r1Var = this.g;
        RectF rectF = r1Var.a;
        long j10 = j3 + r1Var.h;
        g5.a aVar = Utilities.c;
        this.e = j10 + aVar.nextInt(1000);
        RectF rectF2 = z10 ? r1Var.b : rectF;
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
