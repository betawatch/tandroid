package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k {
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
    public final /* synthetic */ org.telegram.ui.Cells.r0 m;

    public k(org.telegram.ui.Cells.r0 r0Var) {
        this.m = r0Var;
    }

    public final void a(int i7, boolean z9) {
        ArrayList arrayList;
        org.telegram.ui.Cells.r0 r0Var = this.m;
        ArrayList arrayList2 = r0Var.c;
        HashMap hashMap = (HashMap) r0Var.f;
        RectF rectF = (RectF) r0Var.g;
        g5.a aVar = Utilities.c;
        this.j = Math.abs(aVar.nextLong() % 2250) + 2250;
        this.k = (Math.abs(aVar.nextFloat()) * 0.45f) + 0.6f;
        String str = l.a[Math.abs(((int) aVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.k *= 0.6f;
        } else if (str.length() > 5) {
            this.k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, r0Var.a, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
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
        float f10 = this.h / 4.0f;
        float f11 = rectF.left + f10;
        float f12 = rectF.right - f10;
        if (i7 % 2 == 0) {
            f12 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f11 = rectF.centerX() + (this.h / 2.0f);
        }
        float f13 = f12 - f11;
        float abs = Math.abs(((int) aVar.nextLong()) % f13) + f11;
        float abs2 = Math.abs(((int) aVar.nextLong()) % rectF.height()) + rectF.top;
        int i10 = 0;
        float f14 = 0.0f;
        while (i10 < 10) {
            g5.a aVar2 = Utilities.c;
            float abs3 = Math.abs(((int) aVar2.nextLong()) % f13) + f11;
            float abs4 = Math.abs(((int) aVar2.nextLong()) % rectF.height()) + rectF.top;
            float f15 = 2.14748365E9f;
            int i11 = 0;
            while (i11 < arrayList2.size()) {
                k kVar = (k) arrayList2.get(i11);
                if (kVar.a) {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.k / r0Var.b) * kVar.h) * 1.1f) + kVar.b) - abs3), Math.abs(kVar.b - abs3));
                    float f16 = kVar.c - abs4;
                    float f17 = (f16 * f16) + (min * min);
                    if (f17 < f15) {
                        f15 = f17;
                    }
                } else {
                    arrayList = arrayList2;
                }
                i11++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f15 > f14) {
                abs2 = abs4;
                f14 = f15;
                abs = abs3;
            }
            i10++;
            arrayList2 = arrayList3;
        }
        this.b = abs;
        this.c = abs2;
        double atan2 = Math.atan2(abs - rectF.centerX(), this.c - rectF.centerY());
        Math.sin(atan2);
        Math.cos(atan2);
        g5.a aVar3 = Utilities.c;
        this.d = (int) (((aVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.l = z9 ? Math.abs((aVar3.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.a = true;
    }
}
