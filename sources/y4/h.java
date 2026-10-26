package y4;

import a8.ng;
import android.content.res.ColorStateList;
import android.graphics.Paint;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h extends k {
    public ng d;
    public float e;
    public ng f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public Paint.Cap l;
    public Paint.Join m;
    public float n;

    @Override // y4.j
    public final boolean a() {
        return this.f.o() || this.d.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // y4.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z10;
        ng ngVar;
        ng ngVar2 = this.f;
        boolean z11 = true;
        if (ngVar2.o()) {
            ColorStateList colorStateList = (ColorStateList) ngVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != ngVar2.b) {
                ngVar2.b = colorForState;
                z10 = true;
                ngVar = this.d;
                if (ngVar.o()) {
                    ColorStateList colorStateList2 = (ColorStateList) ngVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != ngVar.b) {
                        ngVar.b = colorForState2;
                        return z10 | z11;
                    }
                }
                z11 = false;
                return z10 | z11;
            }
        }
        z10 = false;
        ngVar = this.d;
        if (ngVar.o()) {
        }
        z11 = false;
        return z10 | z11;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f.b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.j;
    }

    public float getTrimPathOffset() {
        return this.k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f.b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.i = f7;
    }
}
