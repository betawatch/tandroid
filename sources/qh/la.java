package qh;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class la extends Path {
    public final int a = AndroidUtilities.dp(10.0f);
    public final float[] b;
    public ArrayList c;
    public ArrayList d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;

    public la() {
        this.b = new float[]{r1, r1, r1, r1, 0.0f, 0.0f, 0.0f, 0.0f};
        float dp = AndroidUtilities.dp(2.0f);
    }

    public static int c(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) != null) {
                i10 += ((fa) arrayList.get(i11)).e;
            }
        }
        return i10;
    }

    public final void a(float f10, float f11, float f12, float f13, float f14, float f15, ArrayList arrayList) {
        float f16 = f10;
        float f17 = f12;
        if (arrayList == null || arrayList.isEmpty()) {
            rewind();
            return;
        }
        if (Math.abs(this.e - f13) <= 1.0f && Math.abs(this.f - f14) <= 0.01f && Math.abs(this.g - 0.0f) <= 0.1f && Math.abs(this.h - f15) <= 1.0f && Math.abs(this.i - f16) <= 1.0f && Math.abs(this.j - f11) <= 1.0f && Math.abs(this.k - f17) <= 1.0f) {
            ArrayList arrayList2 = this.c;
            if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (((Integer) arrayList2.get(i10)).intValue() == (arrayList.get(i10) == null ? 0 : ((fa) arrayList.get(i10)).b)) {
                    }
                }
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 == null || arrayList3.size() != arrayList.size()) {
                return;
            }
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                if (((Float) arrayList3.get(i11)).floatValue() != (arrayList.get(i11) == null ? 0.0f : ((fa) arrayList.get(i11)).a.d(((fa) arrayList.get(i11)).c, false))) {
                    return;
                }
            }
        }
        ArrayList arrayList4 = this.c;
        if (arrayList4 == null) {
            this.c = new ArrayList();
        } else {
            arrayList4.clear();
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            i12 = yh.d(arrayList.get(i12) == null ? 0 : ((fa) arrayList.get(i12)).b, i12, 1, this.c);
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5 == null) {
            this.d = new ArrayList();
        } else {
            arrayList5.clear();
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.d.add(Float.valueOf(arrayList.get(i13) == null ? 0.0f : ((fa) arrayList.get(i13)).a.d(((fa) arrayList.get(i13)).c, false)));
        }
        this.i = f16;
        this.j = f11;
        this.k = f17;
        this.g = 0.0f;
        this.f = f14;
        this.e = f13;
        this.h = f15;
        ArrayList arrayList6 = this.d;
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            if (arrayList.get(i15) != null) {
                i14 = Math.max(i14, ((fa) arrayList.get(i15)).b);
            }
        }
        int max = Math.max(0, (int) (((f11 - this.a) - f16) / round));
        int min = Math.min(i14 - 1, (int) Math.ceil(((f17 + r13) - f16) / round));
        while (max <= min) {
            float f18 = max;
            float dp = (f18 * round) + f16 + AndroidUtilities.dp(2.0f);
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                short s6 = (arrayList.get(i17) == null || max >= ((fa) arrayList.get(i17)).b) ? (short) 0 : ((fa) arrayList.get(i17)).d[max];
                if (f18 < ((Float) arrayList6.get(i17)).floatValue() && max + 1 > ((Float) arrayList6.get(i17)).floatValue()) {
                    s6 = (short) ((((Float) arrayList6.get(i17)).floatValue() - f18) * s6);
                } else if (f18 > ((Float) arrayList6.get(i17)).floatValue()) {
                    s6 = 0;
                }
                i16 += s6;
            }
            float f19 = f14 <= 0.0f ? 0.0f : (i16 / f14) * f13 * 0.6f;
            if (dp < f11 || dp > f17) {
                f19 *= 0.0f;
                if (f19 <= 0.0f) {
                    max++;
                    f16 = f10;
                    f17 = f12;
                }
            }
            float max2 = Math.max(f19, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f15 - max2, f15 - ((f13 + max2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f15, org.telegram.messenger.y3.a(f13, max2, 2.0f, f15), 0.0f));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f16 = f10;
            f17 = f12;
        }
    }

    public final void b(float f10, float f11, float f12, float f13, long j10, float f14, float f15, float f16, fa faVar) {
        ArrayList arrayList;
        float f17 = f10;
        float f18 = f11;
        float f19 = f12;
        if (faVar == null) {
            rewind();
            return;
        }
        int i10 = faVar.b;
        org.telegram.ui.Components.z5 z5Var = faVar.a;
        float d = z5Var.d(faVar.c, false);
        if (0 == j10 && Math.abs(this.e - f14) <= 1.0f && Math.abs(this.f - f15) <= 0.01f && Math.abs(this.g - f13) <= 0.1f && Math.abs(this.h - f16) <= 1.0f && Math.abs(this.i - f17) <= 1.0f && Math.abs(this.j - f18) <= 1.0f && Math.abs(this.k - f19) <= 1.0f && (arrayList = this.c) != null && arrayList.size() == 1) {
            ArrayList arrayList2 = this.d;
            if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.d.get(0)).floatValue()) - d) <= 0.01f) {
                return;
            }
        }
        ArrayList arrayList3 = this.c;
        if (arrayList3 == null) {
            this.c = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.c.add(Integer.valueOf(i10));
        ArrayList arrayList4 = this.d;
        if (arrayList4 == null) {
            this.d = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.d.add(Float.valueOf(d));
        this.i = f17;
        this.j = f18;
        this.k = f19;
        this.g = f13;
        this.f = f15;
        this.e = f14;
        this.h = f16;
        float d10 = z5Var.d(faVar.c, false);
        rewind();
        float round = Math.round(AndroidUtilities.dpf2(3.3333f));
        int max = Math.max(0, (int) (((f18 - this.a) - f17) / round));
        int min = Math.min(i10 - 1, (int) Math.ceil(((r13 + f19) - f17) / round));
        while (max <= min) {
            float f20 = max;
            float dp = (f20 * round) + f17 + AndroidUtilities.dp(2.0f);
            float f21 = f15 <= 0.0f ? 0.0f : (faVar.d[max] / f15) * f14 * 0.6f;
            if (f20 < d10 && max + 1 > d10) {
                f21 *= d10 - f20;
            } else if (f20 > d10) {
                f21 = 0.0f;
            }
            if (dp < f18 || dp > f19) {
                f21 *= f13;
                if (f21 <= 0.0f) {
                    max++;
                    f17 = f10;
                    f18 = f11;
                    f19 = f12;
                }
            }
            float max2 = Math.max(f21, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f13));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(dp, AndroidUtilities.lerp(f16 - max2, f16 - ((f14 + max2) / 2.0f), f13), AndroidUtilities.dpf2(1.66f) + dp, AndroidUtilities.lerp(f16, org.telegram.messenger.y3.a(f14, max2, 2.0f, f16), f13));
            addRoundRect(rectF, this.b, Path.Direction.CW);
            max++;
            f17 = f10;
            f18 = f11;
            f19 = f12;
        }
    }
}
