package org.telegram.ui;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.security.SecureRandom;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w30 {
    public float c;
    public float d;
    public float e;
    public float f;
    public Shader g;
    public final int i;
    public float a = -1.0f;
    public float b = -1.0f;
    public final Matrix h = new Matrix();

    public w30(int i3) {
        this.i = i3;
    }

    public final void a() {
        int i3 = this.i;
        if (x30.r1(i3)) {
            this.a = a1.g.e(Utilities.b.nextInt(100), 0.2f, 100.0f, 0.85f);
            this.b = 1.0f;
        } else if (i3 == 1) {
            SecureRandom secureRandom = Utilities.b;
            this.a = a1.g.e(secureRandom.nextInt(100), 0.3f, 100.0f, 0.2f);
            this.b = a1.g.e(secureRandom.nextInt(100), 0.3f, 100.0f, 0.7f);
        } else {
            SecureRandom secureRandom2 = Utilities.b;
            this.a = a1.g.A(secureRandom2.nextInt(100), 100.0f, 0.2f, 0.8f);
            this.b = secureRandom2.nextInt(100) / 100.0f;
        }
    }

    public final void b(int i3, int i10, int i11, long j10, float f10) {
        if (this.g == null) {
            return;
        }
        float f11 = this.e;
        if (f11 == 0.0f || this.f >= f11) {
            this.e = Utilities.b.nextInt(org.telegram.messenger.hs.e3) + 1500;
            this.f = 0.0f;
            if (this.a == -1.0f) {
                a();
            }
            this.c = this.a;
            this.d = this.b;
            a();
        }
        float f12 = j10;
        float f13 = 1.0f;
        float f14 = (f12 * 0.02f * f10) + (f12 * 1.0f) + this.f;
        this.f = f14;
        float f15 = this.e;
        if (f14 > f15) {
            this.f = f15;
        }
        float interpolation = org.telegram.ui.Components.xq.g.getInterpolation(this.f / f15);
        float f16 = i11;
        float f17 = this.c;
        float f18 = (((((this.a - f17) * interpolation) + f17) * f16) + i10) - 200.0f;
        float f19 = this.d;
        float f20 = (((((this.b - f19) * interpolation) + f19) * f16) + i3) - 200.0f;
        int i12 = this.i;
        if (!x30.r1(i12)) {
            f13 = i12 == 1 ? 4.0f : 2.5f;
        }
        float L = (org.telegram.messenger.g0.L(122.0f) / 400.0f) * f13;
        Matrix matrix = this.h;
        matrix.reset();
        matrix.postTranslate(f18, f20);
        matrix.postScale(L, L, f18 + 200.0f, f20 + 200.0f);
        this.g.setLocalMatrix(matrix);
    }
}
