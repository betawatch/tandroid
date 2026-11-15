package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n1 {
    public float a;
    public float b;
    public float c;
    public float d;
    public long e;
    public float f;
    public final /* synthetic */ o1 g;

    public n1(o1 o1Var) {
        this.g = o1Var;
    }

    public final void a(long j3, boolean z10) {
        o1 o1Var = this.g;
        RectF rectF = o1Var.a;
        long j10 = j3 + o1Var.h;
        g5.a aVar = Utilities.c;
        this.e = j10 + aVar.nextInt(1000);
        RectF rectF2 = z10 ? o1Var.b : rectF;
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
