package sg;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        d dVar = this.l;
        boolean z10 = dVar.f;
        ArrayList arrayList = dVar.c;
        Rect rect = dVar.b;
        float f7 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i10 = 0; i10 < 20; i10++) {
            float b11 = b();
            float c11 = c();
            float f10 = 2.14748365E9f;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                float f11 = ((c) arrayList.get(i11)).c - b11;
                float f12 = ((c) arrayList.get(i11)).d - c11;
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
        }
        float f14 = z10 ? 0.8f : 0.5f;
        this.c = b10;
        if (b10 > rect.width() * f14) {
            this.a = rect.width() * f14;
        } else {
            float width = rect.width() * f14;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        float height = rect.height() * 0.1f;
        d5.a aVar = Utilities.c;
        this.b = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, height, rect.height() * 0.45f);
        if (z10) {
            float c12 = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = c12;
            this.g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f / 2.0f);
            this.e = rect.height() + this.f;
            this.i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = c13;
            this.g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.e = c10 + rect.height();
            this.i = 1800L;
        }
        this.i = (long) (this.i / 1.75f);
        this.j = aVar.nextBoolean();
        this.k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.l;
        Rect rect = dVar.b;
        if (!dVar.f) {
            return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * rect.width();
        }
        return a1.g.c(Math.abs(((int) Utilities.c.nextLong()) % 100), 100.0f, rect.width() * 1.5f, rect.width() * (-0.25f));
    }

    public final float c() {
        return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
