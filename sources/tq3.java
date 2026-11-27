// default package

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tq3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final byte d;
    public boolean e;
    public final RenderNode[] f;
    public long g;
    public final RectF h = new RectF();
    public final qeb i = new qeb();
    public final ArrayList j = new ArrayList();
    public int k;
    public int l;
    public Rect m;

    public tq3(boolean z) {
        boolean e = i86.e(262144);
        this.a = e;
        this.c = true;
        this.d = (e || z) ? (byte) 1 : (byte) 8;
        this.b = z;
        this.f = new RenderNode[e ? 2 : 1];
        int i = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f;
            if (i >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i] = vk1.k();
            i++;
        }
    }

    public static float a(float f, float f2) {
        float f3 = (f > 0.0f ? (f * 0.57735f) + 0.5f : 0.0f) / f2;
        return Math.max(1.0f, f3 > 0.5f ? (f3 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void b(Canvas canvas, int i) {
        if (!canvas.isHardwareAccelerated()) {
            grb.g();
            return;
        }
        boolean z = this.a;
        if (!z && this.c) {
            canvas.drawRenderNode(this.f[0]);
            return;
        }
        if (i == -2) {
            canvas.drawRenderNode(this.f[!z ? 1 : 0]);
        } else if (i == -4) {
            canvas.drawRenderNode(this.f[0]);
        } else if (i == -3) {
            canvas.drawRenderNode(this.f[1]);
        }
    }

    public final void c(Canvas canvas, int i) {
        int i2;
        boolean z = this.a;
        if (!z && this.c) {
            i2 = 0;
        } else if (i == -2) {
            i2 = !z ? 1 : 0;
        } else if (i == -4) {
            i2 = 3;
        } else if (i != -3) {
            return;
        } else {
            i2 = 1;
        }
        for (int i3 = 0; i3 < this.k; i3++) {
            sq3 sq3Var = (sq3) this.j.get(i3);
            Rect rect = sq3Var.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = sq3Var.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i2, i3);
                if (!d.hasDisplayList()) {
                    this.e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i, int i2) {
        rq3 rq3Var;
        sq3 sq3Var = (sq3) this.j.get(i2);
        if (!this.a || (rq3Var = sq3Var.c) == null) {
            return sq3Var.b.c[Math.min(i, r2.length - 1)];
        }
        if (i == 3) {
            return rq3Var.c[0];
        }
        if (i != 0) {
            return sq3Var.b.c[0];
        }
        return rq3Var.c[r2.length - 1];
    }

    public final void e(yi5 yi5Var, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.k;
            ArrayList arrayList = this.j;
            if (i3 < i5) {
                sq3 sq3Var = (sq3) arrayList.get(i3);
                Rect rect = sq3Var.d;
                RectF rectF = this.h;
                rectF.set(rect);
                qeb qebVar = this.i;
                qebVar.a = 0L;
                qebVar.b = false;
                yi5Var.a(qebVar, rectF);
                boolean z = qebVar.b;
                long j = z ? -1L : qebVar.a;
                if (z || sq3Var.e != j || !sq3Var.a.hasDisplayList()) {
                    sq3Var.e = j;
                    if (this.m != null) {
                        grb.g();
                        return;
                    }
                    sq3 sq3Var2 = (sq3) arrayList.get(i3);
                    Rect rect2 = sq3Var2.d;
                    this.m = rect2;
                    this.l = i3;
                    int width = rect2.width();
                    byte b = this.d;
                    int i6 = width / b;
                    int height = rect2.height() / b;
                    sq3Var2.a.setPosition(0, 0, i6, height);
                    RecordingCanvas beginRecording = sq3Var2.a.beginRecording(i6, height);
                    float f = 1.0f / b;
                    beginRecording.scale(f, f);
                    beginRecording.save();
                    beginRecording.translate(-rect.left, -rect.top);
                    yi5Var.g(beginRecording, rectF);
                    beginRecording.restore();
                    if (this.m == null) {
                        grb.g();
                        return;
                    }
                    sq3 sq3Var3 = (sq3) arrayList.get(this.l);
                    sq3Var3.a.endRecording();
                    rq3 rq3Var = sq3Var3.b;
                    rq3 rq3Var2 = sq3Var3.c;
                    RenderNode renderNode = sq3Var3.a;
                    if (rq3Var2 != null) {
                        rq3Var2.a(renderNode);
                        rq3Var.a(rq3Var2.c[0]);
                    } else {
                        rq3Var.a(renderNode);
                    }
                    this.m = null;
                    i4++;
                }
                i3++;
            } else {
                if (i4 <= 0) {
                    return;
                }
                long r = ls6.r(ls6.r(0L, i), i2);
                int i7 = 0;
                boolean z2 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f;
                    if (i7 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode2 = renderNodeArr[i7];
                    r = ls6.r(r, renderNode2.getUniqueId());
                    for (int i8 = 0; i8 < this.k; i8++) {
                        sq3 sq3Var4 = (sq3) arrayList.get(i8);
                        RenderNode d = d(i7, i8);
                        Rect rect3 = sq3Var4.d;
                        r = ls6.r(ls6.r(ls6.r(ls6.r(ls6.r(r, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode2.hasDisplayList()) {
                        z2 = true;
                    }
                    i7++;
                }
                if (r == this.g && !z2) {
                    return;
                }
                this.g = r;
                int i9 = 0;
                while (true) {
                    RenderNode[] renderNodeArr2 = this.f;
                    if (i9 >= renderNodeArr2.length) {
                        return;
                    }
                    RenderNode renderNode3 = renderNodeArr2[i9];
                    renderNode3.setPosition(0, 0, i, i2);
                    RecordingCanvas beginRecording2 = renderNode3.beginRecording(i, i2);
                    for (int i10 = 0; i10 < this.k; i10++) {
                        sq3 sq3Var5 = (sq3) arrayList.get(i10);
                        beginRecording2.save();
                        Rect rect4 = sq3Var5.d;
                        beginRecording2.translate(rect4.left, rect4.top);
                        beginRecording2.drawRenderNode(d(i9, i10));
                        beginRecording2.restore();
                    }
                    renderNode3.endRecording();
                    i9++;
                }
            }
        }
    }

    public final void f(float f, float f2) {
        for (int i = 0; i < this.k; i++) {
            sq3 sq3Var = (sq3) this.j.get(i);
            sq3Var.b.b(f, f2);
            rq3 rq3Var = sq3Var.c;
            if (rq3Var != null) {
                rq3Var.b(f, f2);
            }
        }
    }

    public final void g(int i, ArrayList arrayList) {
        ArrayList arrayList2;
        this.k = i;
        while (true) {
            int i2 = this.k;
            arrayList2 = this.j;
            if (i2 <= arrayList2.size()) {
                break;
            } else {
                arrayList2.add(new sq3(this));
            }
        }
        for (int i3 = 0; i3 < this.k; i3++) {
            ((sq3) arrayList2.get(i3)).a((RectF) arrayList.get(i3));
        }
    }

    public final void h(fz4 fz4Var) {
        ArrayList arrayList;
        this.k = fz4Var.b;
        while (true) {
            int i = this.k;
            arrayList = this.j;
            if (i <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new sq3(this));
            }
        }
        for (int i2 = 0; i2 < this.k; i2++) {
            ((sq3) arrayList.get(i2)).a(fz4Var.c(i2));
        }
    }
}
