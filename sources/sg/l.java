package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class l {
    public boolean a;
    public float b;
    public float c;
    public int d;
    public StaticLayout e;
    public Bitmap f;
    public int g;
    public int h;
    public int i;
    public long j;
    public float k;
    public float l;
    public final /* synthetic */ org.telegram.ui.Cells.u0 m;

    public l(org.telegram.ui.Cells.u0 u0Var) {
        this.m = u0Var;
    }

    public final void a(int i10, boolean z10) {
        ArrayList arrayList;
        org.telegram.ui.Cells.u0 u0Var = this.m;
        ArrayList arrayList2 = u0Var.c;
        HashMap hashMap = (HashMap) u0Var.f;
        RectF rectF = (RectF) u0Var.g;
        this.j = Math.abs(Utilities.fastRandom.nextLong() % 2250) + 2250;
        this.k = (Math.abs(Utilities.fastRandom.nextFloat()) * 0.45f) + 0.6f;
        String str = m.a[p6.c(Utilities.fastRandom, 49)];
        if (str.length() > 7) {
            this.k *= 0.6f;
        } else if (str.length() > 5) {
            this.k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, u0Var.a, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        int i11 = 0;
        if (staticLayout.getLineCount() <= 0) {
            this.i = 0;
            this.h = 0;
            this.g = 0;
        } else {
            this.g = (int) this.e.getLineLeft(0);
            this.h = (int) this.e.getLineWidth(0);
            this.i = this.e.getHeight();
        }
        Bitmap bitmap = (Bitmap) hashMap.get(str);
        this.f = bitmap;
        if (bitmap == null) {
            this.f = Bitmap.createBitmap(Math.max(1, this.h - Math.max(0, this.g)), Math.max(1, this.i), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f);
            canvas.translate(-this.g, 0.0f);
            this.e.draw(canvas);
            hashMap.put(str, this.f);
        }
        float f7 = this.h / 4.0f;
        float f10 = rectF.left + f7;
        float f11 = rectF.right - f7;
        if (i10 % 2 == 0) {
            f11 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f10 = rectF.centerX() + (this.h / 2.0f);
        }
        float f12 = f11 - f10;
        float abs = Math.abs(Utilities.fastRandom.nextInt() % f12) + f10;
        float abs2 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
        int i12 = 0;
        float f13 = 0.0f;
        while (i12 < 10) {
            float abs3 = Math.abs(Utilities.fastRandom.nextInt() % f12) + f10;
            float abs4 = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + rectF.top;
            float f14 = 2.14748365E9f;
            while (i11 < arrayList2.size()) {
                l lVar = (l) arrayList2.get(i11);
                if (lVar.a) {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.k / u0Var.b) * lVar.h) * 1.1f) + lVar.b) - abs3), Math.abs(lVar.b - abs3));
                    float f15 = lVar.c - abs4;
                    float f16 = (f15 * f15) + (min * min);
                    if (f16 < f14) {
                        f14 = f16;
                    }
                } else {
                    arrayList = arrayList2;
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f14 > f13) {
                abs = abs3;
                f13 = f14;
                abs2 = abs4;
            }
            i12++;
            arrayList2 = arrayList3;
            i11 = 0;
        }
        this.b = abs;
        this.c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        this.d = (int) (((Utilities.fastRandom.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.l = z10 ? Math.abs((Utilities.fastRandom.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.a = true;
    }
}
