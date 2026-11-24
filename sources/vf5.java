// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vf5 {
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
    public final /* synthetic */ wf5 m;

    public vf5(wf5 wf5Var) {
        this.m = wf5Var;
    }

    public final void a(int i, boolean z) {
        ArrayList arrayList;
        wf5 wf5Var = this.m;
        ArrayList arrayList2 = wf5Var.g;
        HashMap hashMap = wf5Var.c;
        RectF rectF = wf5Var.d;
        z0d z0dVar = Utilities.c;
        this.j = Math.abs(z0dVar.nextLong() % 2250) + 2250;
        this.k = (Math.abs(z0dVar.nextFloat()) * 0.45f) + 0.6f;
        String str = ybd.a[Math.abs(((int) z0dVar.nextLong()) % 49)];
        if (str.length() > 7) {
            this.k *= 0.6f;
        } else if (str.length() > 5) {
            this.k *= 0.75f;
        }
        StaticLayout staticLayout = new StaticLayout(str, wf5Var.a, gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        float f = this.h / 4.0f;
        float f2 = rectF.left + f;
        float f3 = rectF.right - f;
        if (i % 2 == 0) {
            f3 = rectF.centerX() - (this.h / 2.0f);
        } else {
            f2 = rectF.centerX() + (this.h / 2.0f);
        }
        float f4 = f3 - f2;
        float abs = Math.abs(((int) z0dVar.nextLong()) % f4) + f2;
        float abs2 = Math.abs(((int) z0dVar.nextLong()) % rectF.height()) + rectF.top;
        int i2 = 0;
        float f5 = 0.0f;
        while (i2 < 10) {
            z0d z0dVar2 = Utilities.c;
            float abs3 = Math.abs(((int) z0dVar2.nextLong()) % f4) + f2;
            float abs4 = Math.abs(((int) z0dVar2.nextLong()) % rectF.height()) + rectF.top;
            float f6 = 2.1474836E9f;
            int i3 = 0;
            while (i3 < arrayList2.size()) {
                vf5 vf5Var = (vf5) arrayList2.get(i3);
                if (vf5Var.a) {
                    arrayList = arrayList2;
                    float min = Math.min(Math.abs(((((this.k / wf5Var.b) * vf5Var.h) * 1.1f) + vf5Var.b) - abs3), Math.abs(vf5Var.b - abs3));
                    float f7 = vf5Var.c - abs4;
                    float f8 = (f7 * f7) + (min * min);
                    if (f8 < f6) {
                        f6 = f8;
                    }
                } else {
                    arrayList = arrayList2;
                }
                i3++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            if (f6 > f5) {
                abs2 = abs4;
                f5 = f6;
                abs = abs3;
            }
            i2++;
            arrayList2 = arrayList3;
        }
        this.b = abs;
        this.c = abs2;
        rectF.centerX();
        rectF.centerY();
        z0d z0dVar3 = Utilities.c;
        this.d = (int) (((z0dVar3.nextInt(50) + 50) / 100.0f) * 255.0f);
        this.l = z ? Math.abs((z0dVar3.nextFloat() % 1.0f) * 0.9f) : 0.0f;
        this.a = true;
    }
}
