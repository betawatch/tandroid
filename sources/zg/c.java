package zg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.q3;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class c {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public boolean j;
    public float k;
    public final /* synthetic */ d l;

    public c(d dVar) {
        this.l = dVar;
    }

    public final void a() {
        d dVar;
        float f7 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i10 = 0;
        while (true) {
            dVar = this.l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f10 = 2.14748365E9f;
            for (int i11 = 0; i11 < dVar.c.size(); i11++) {
                float f11 = ((c) dVar.c.get(i11)).c - b11;
                float f12 = ((c) dVar.c.get(i11)).d - c11;
                float f13 = (f12 * f12) + (f11 * f11);
                if (f13 < f10) {
                    f10 = f13;
                }
            }
            if (f10 > f7) {
                b10 = b11;
                c10 = c11;
                f7 = f10;
            }
            i10++;
        }
        float f14 = dVar.f ? 0.8f : 0.5f;
        this.c = b10;
        if (b10 > dVar.b.width() * f14) {
            this.a = dVar.b.width() * f14;
        } else {
            float width = dVar.b.width() * f14;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        this.b = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, dVar.b.height() * 0.45f);
        if (dVar.f) {
            float e = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = e;
            this.g = (((q3.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            this.d = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, dVar.b.height() * 0.1f, this.f / 2.0f);
            this.e = dVar.b.height() + this.f;
            this.i = Math.abs(Utilities.fastRandom.nextInt() % 600) + MediaDataController.MAX_STYLE_RUNS_COUNT;
        } else {
            float e7 = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, dVar.b.width() * 0.1f, dVar.b.width() * 0.05f);
            this.f = e7;
            this.g = (((q3.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + dVar.b.height();
            this.i = 1800L;
        }
        this.i = (long) (this.i / 1.75f);
        this.j = Utilities.fastRandom.nextBoolean();
        this.k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        if (!this.l.f) {
            return (q3.c(Utilities.fastRandom, 100) / 100.0f) * r0.b.width();
        }
        return a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, r0.b.width() * 1.5f, r0.b.width() * (-0.25f));
    }

    public final float c() {
        return (q3.c(Utilities.fastRandom, 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
