// default package

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xl {
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
    public final /* synthetic */ yl l;

    public xl(yl ylVar) {
        this.l = ylVar;
    }

    public final void a() {
        long j;
        yl ylVar = this.l;
        boolean z = ylVar.f;
        ArrayList arrayList = ylVar.c;
        Rect rect = ylVar.b;
        float f = 0.0f;
        this.h = 0.0f;
        float b = b();
        float c = c();
        for (int i = 0; i < 20; i++) {
            float b2 = b();
            float c2 = c();
            float f2 = 2.1474836E9f;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                float f3 = ((xl) arrayList.get(i2)).c - b2;
                float f4 = ((xl) arrayList.get(i2)).d - c2;
                float f5 = (f4 * f4) + (f3 * f3);
                if (f5 < f2) {
                    f2 = f5;
                }
            }
            if (f2 > f) {
                b = b2;
                c = c2;
                f = f2;
            }
        }
        float f6 = z ? 0.8f : 0.5f;
        this.c = b;
        if (b > rect.width() * f6) {
            this.a = rect.width() * f6;
        } else {
            float width = rect.width() * f6;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        float height = rect.height() * 0.1f;
        o3d o3dVar = Utilities.c;
        this.b = c00.B(Math.abs(((int) o3dVar.nextLong()) % 100), 100.0f, height, rect.height() * 0.45f);
        if (z) {
            float B = c00.B(Math.abs(((int) o3dVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = B;
            this.g = (((Math.abs(((int) o3dVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * B;
            this.d = c00.B(Math.abs(((int) o3dVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f / 2.0f);
            this.e = rect.height() + this.f;
            j = Math.abs(((int) o3dVar.nextLong()) % 600) + 1000;
            this.i = j;
        } else {
            float B2 = c00.B(Math.abs(((int) o3dVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = B2;
            this.g = (((Math.abs(((int) o3dVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * B2;
            this.d = c;
            this.e = c + rect.height();
            j = 1800;
            this.i = 1800L;
        }
        this.i = (long) (j / 1.75f);
        this.j = o3dVar.nextBoolean();
        this.k = ((((int) o3dVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        yl ylVar = this.l;
        boolean z = ylVar.f;
        Rect rect = ylVar.b;
        if (!z) {
            return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * rect.width();
        }
        return c00.B(Math.abs(((int) Utilities.c.nextLong()) % 100), 100.0f, rect.width() * 1.5f, rect.width() * (-0.25f));
    }

    public final float c() {
        return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}
