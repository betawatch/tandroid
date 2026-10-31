package org.telegram.utils.twidget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class p0 extends Layout {
    public final o0 a;

    public p0(o0 o0Var) {
        super(o0Var.a, q0.b, Math.max(1, o0Var.d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f);
        this.a = o0Var;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas) {
    }

    @Override // android.text.Layout
    public final int getBottomPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisCount(int i10) {
        return 0;
    }

    @Override // android.text.Layout
    public final int getEllipsisStart(int i10) {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean getLineContainsTab(int i10) {
        return false;
    }

    @Override // android.text.Layout
    public final int getLineCount() {
        return this.a.g.length;
    }

    @Override // android.text.Layout
    public final int getLineDescent(int i10) {
        return 0;
    }

    @Override // android.text.Layout
    public final Layout.Directions getLineDirections(int i10) {
        return null;
    }

    @Override // android.text.Layout
    public final int getLineForOffset(int i10) {
        int i11 = 0;
        while (true) {
            o0 o0Var = this.a;
            if (i11 >= o0Var.g.length) {
                return r2.length - 1;
            }
            int i12 = i11 + 1;
            if (i10 < o0Var.e[i12]) {
                return i11;
            }
            i11 = i12;
        }
    }

    @Override // android.text.Layout
    public final float getLineLeft(int i10) {
        return this.a.g[Math.max(0, Math.min(i10, r0.length - 1))][0];
    }

    @Override // android.text.Layout
    public final float getLineMax(int i10) {
        return getLineRight(i10);
    }

    @Override // android.text.Layout
    public final float getLineRight(int i10) {
        return this.a.g[Math.max(0, Math.min(i10, r0.length - 1))][r3.length - 1];
    }

    @Override // android.text.Layout
    public final int getLineStart(int i10) {
        o0 o0Var = this.a;
        return o0Var.e[Math.max(0, Math.min(i10, o0Var.g.length))];
    }

    @Override // android.text.Layout
    public final int getLineTop(int i10) {
        o0 o0Var = this.a;
        return o0Var.f[Math.max(0, Math.min(i10, o0Var.g.length))];
    }

    @Override // android.text.Layout
    public final float getLineWidth(int i10) {
        return getLineRight(i10) - getLineLeft(i10);
    }

    @Override // android.text.Layout
    public final int getOffsetForHorizontal(int i10, float f7) {
        o0 o0Var = this.a;
        int max = Math.max(0, Math.min(i10, o0Var.g.length - 1));
        float[] fArr = o0Var.g[max];
        int[] iArr = o0Var.e;
        int i11 = iArr[max + 1] - iArr[max];
        int i12 = 0;
        for (int i13 = 0; i13 <= i11 && i13 < fArr.length; i13++) {
            if (i13 < i11) {
                int i14 = i13 + 1;
                if (f7 >= (fArr[i13] + fArr[i14]) / 2.0f) {
                    i12 = i14;
                }
            }
        }
        if (i12 == i11 && i11 > 0 && max < o0Var.g.length - 1 && Character.isWhitespace(o0Var.a.charAt((o0Var.e[max] + i11) - 1))) {
            i12--;
        }
        return o0Var.e[max] + i12;
    }

    @Override // android.text.Layout
    public final int getParagraphDirection(int i10) {
        return 1;
    }

    @Override // android.text.Layout
    public final float getPrimaryHorizontal(int i10) {
        int lineForOffset = getLineForOffset(i10);
        o0 o0Var = this.a;
        return o0Var.g[lineForOffset][Math.max(0, Math.min(i10 - o0Var.e[lineForOffset], r2.length - 1))];
    }

    @Override // android.text.Layout
    public final float getSecondaryHorizontal(int i10) {
        return getPrimaryHorizontal(i10);
    }

    @Override // android.text.Layout
    public final void getSelectionPath(int i10, int i11, Path path) {
        Path path2;
        path.reset();
        if (i10 == i11) {
            return;
        }
        if (i11 < i10) {
            i11 = i10;
            i10 = i11;
        }
        int lineForOffset = getLineForOffset(i10);
        int lineForOffset2 = getLineForOffset(i11);
        int i12 = lineForOffset;
        while (i12 <= lineForOffset2) {
            float primaryHorizontal = i12 == lineForOffset ? getPrimaryHorizontal(i10) : getLineLeft(i12);
            float primaryHorizontal2 = i12 == lineForOffset2 ? getPrimaryHorizontal(i11) : getLineRight(i12);
            if (primaryHorizontal2 > primaryHorizontal) {
                path2 = path;
                path2.addRect(primaryHorizontal, getLineTop(i12), primaryHorizontal2, getLineTop(i12 + 1), Path.Direction.CW);
            } else {
                path2 = path;
            }
            i12++;
            path = path2;
        }
    }

    @Override // android.text.Layout
    public final int getTopPadding() {
        return 0;
    }

    @Override // android.text.Layout
    public final boolean isRtlCharAt(int i10) {
        return false;
    }

    @Override // android.text.Layout
    public final void draw(Canvas canvas, Path path, Paint paint, int i10) {
    }
}
