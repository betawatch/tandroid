package qi;

import android.graphics.RectF;
import java.util.ArrayList;
import jg.g;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class a {
    public final ArrayList a = new ArrayList();
    public int b;

    public final RectF a(float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i7 = this.b;
        ArrayList arrayList = this.a;
        if (i7 < arrayList.size()) {
            rectF = (RectF) arrayList.get(this.b);
            rectF.set(f10, f11, f12, f13);
        } else {
            rectF = new RectF(f10, f11, f12, f13);
            arrayList.add(rectF);
        }
        this.b++;
        return rectF;
    }

    public final void b(float f10, float f11, float f12) {
        int i7 = 0;
        while (i7 < this.b) {
            RectF rectF = (RectF) this.a.get(i7);
            float f13 = rectF.right;
            if (f13 > 0.0f) {
                float f14 = rectF.bottom;
                if (f14 > f10) {
                    float f15 = rectF.left;
                    if (f15 < f11) {
                        float f16 = rectF.top;
                        if (f16 < f12) {
                            if (f15 < 0.0f) {
                                rectF.left = 0.0f;
                            }
                            if (f16 < f10) {
                                rectF.top = f10;
                            }
                            if (f13 > f11) {
                                rectF.right = f11;
                            }
                            if (f14 > f12) {
                                rectF.bottom = f12;
                            }
                            i7++;
                        }
                    }
                }
            }
            d(i7);
        }
    }

    public final RectF c(int i7) {
        if (i7 >= 0 && i7 < this.b) {
            return (RectF) this.a.get(i7);
        }
        StringBuilder n10 = g.n(i7, "index=", ", size=");
        n10.append(this.b);
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public final void d(int i7) {
        int i10;
        if (i7 < 0 || i7 >= (i10 = this.b)) {
            StringBuilder n10 = g.n(i7, "index=", ", size=");
            n10.append(this.b);
            throw new IndexOutOfBoundsException(n10.toString());
        }
        int i11 = i10 - 1;
        ArrayList arrayList = this.a;
        RectF rectF = (RectF) arrayList.get(i7);
        if (i7 != i11) {
            arrayList.set(i7, (RectF) arrayList.get(i11));
            arrayList.set(i11, rectF);
        }
        this.b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b != aVar.b) {
            return false;
        }
        for (int i7 = 0; i7 < this.b; i7++) {
            if (!((RectF) this.a.get(i7)).equals(aVar.a.get(i7))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.b; i10++) {
            i7 = (i7 * 31) + ((RectF) this.a.get(i10)).hashCode();
        }
        return i7;
    }
}
