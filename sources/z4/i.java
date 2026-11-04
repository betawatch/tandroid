package z4;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i extends j {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public i() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    @Override // z4.j
    public final boolean a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (((j) arrayList.get(i3)).a()) {
                return true;
            }
            i3++;
        }
    }

    @Override // z4.j
    public final boolean b(int[] iArr) {
        int i3 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                return z10;
            }
            z10 |= ((j) arrayList.get(i3)).b(iArr);
            i3++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f10) {
        if (f10 != this.d) {
            this.d = f10;
            c();
        }
    }

    public void setPivotY(float f10) {
        if (f10 != this.e) {
            this.e = f10;
            c();
        }
    }

    public void setRotation(float f10) {
        if (f10 != this.c) {
            this.c = f10;
            c();
        }
    }

    public void setScaleX(float f10) {
        if (f10 != this.f) {
            this.f = f10;
            c();
        }
    }

    public void setScaleY(float f10) {
        if (f10 != this.g) {
            this.g = f10;
            c();
        }
    }

    public void setTranslateX(float f10) {
        if (f10 != this.h) {
            this.h = f10;
            c();
        }
    }

    public void setTranslateY(float f10) {
        if (f10 != this.i) {
            this.i = f10;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i iVar, a0.f fVar) {
        g gVar;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.k = null;
        this.c = iVar.c;
        this.d = iVar.d;
        this.e = iVar.e;
        this.f = iVar.f;
        this.g = iVar.g;
        this.h = iVar.h;
        this.i = iVar.i;
        String str = iVar.k;
        this.k = str;
        if (str != null) {
            fVar.put(str, this);
        }
        matrix.set(iVar.j);
        ArrayList arrayList = iVar.b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Object obj = arrayList.get(i3);
            if (obj instanceof i) {
                this.b.add(new i((i) obj, fVar));
            } else {
                if (obj instanceof h) {
                    h hVar = (h) obj;
                    h hVar2 = new h(hVar);
                    hVar2.e = 0.0f;
                    hVar2.g = 1.0f;
                    hVar2.h = 1.0f;
                    hVar2.i = 0.0f;
                    hVar2.j = 1.0f;
                    hVar2.k = 0.0f;
                    hVar2.l = Paint.Cap.BUTT;
                    hVar2.m = Paint.Join.MITER;
                    hVar2.n = 4.0f;
                    hVar2.d = hVar.d;
                    hVar2.e = hVar.e;
                    hVar2.g = hVar.g;
                    hVar2.f = hVar.f;
                    hVar2.c = hVar.c;
                    hVar2.h = hVar.h;
                    hVar2.i = hVar.i;
                    hVar2.j = hVar.j;
                    hVar2.k = hVar.k;
                    hVar2.l = hVar.l;
                    hVar2.m = hVar.m;
                    hVar2.n = hVar.n;
                    gVar = hVar2;
                } else if (obj instanceof g) {
                    gVar = new g((g) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(gVar);
                Object obj2 = gVar.b;
                if (obj2 != null) {
                    fVar.put(obj2, gVar);
                }
            }
        }
    }
}
