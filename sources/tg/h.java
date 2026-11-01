package tg;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import b2.u;
import g.y;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.fd1;
import org.telegram.ui.nf0;
import org.telegram.ui.of0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h {
    public final RenderNode a;
    public final u b;
    public final y c = new y();
    public long d = 0;
    public int e;
    public int f;

    public h(RenderNode renderNode, u uVar) {
        this.a = renderNode;
        this.b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        y yVar = this.c;
        yVar.a = 0L;
        yVar.b = false;
        u uVar = this.b;
        boolean z10 = uVar.b;
        of0 of0Var = (of0) uVar.c;
        int themedColor = of0Var.getThemedColor(t6.d6);
        RectF rectF = of0Var.U;
        yVar.a(themedColor);
        yVar.b(uz.f());
        SparseArray sparseArray = of0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            k2 k2Var = ((fd1) sparseArray.valueAt(i10)).a;
            View view = k2Var.fragmentView;
            if (view != null && zg.h.c(view, of0Var.b, rectF) && rectF.right > 0.0f && rectF.left < of0Var.fragmentView.getMeasuredWidth() && (k2Var instanceof nf0)) {
                nf0 nf0Var = (nf0) k2Var;
                if ((z10 ? nf0Var.k() : nf0Var.C()) != null) {
                    yVar.c(rectF.left);
                    yVar.c(rectF.top);
                    yVar.a(k2Var.getClassGuid());
                }
            }
        }
        long j10 = yVar.b ? -1L : yVar.a;
        boolean z11 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z11) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = of0Var.fragmentView;
            SparseArray sparseArray2 = of0Var.a;
            RectF rectF2 = of0Var.U;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = of0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(of0Var.getThemedColor(t6.d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                k2 k2Var2 = ((fd1) sparseArray2.valueAt(i11)).a;
                View view3 = k2Var2.fragmentView;
                if (view3 != null && zg.h.c(view3, of0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < of0Var.fragmentView.getMeasuredWidth() && (k2Var2 instanceof nf0)) {
                    nf0 nf0Var2 = (nf0) k2Var2;
                    hi.f k10 = z10 ? nf0Var2.k() : nf0Var2.C();
                    if (k10 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        k10.e(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        beginRecording.restore();
                    }
                }
            }
            this.a.endRecording();
        }
    }
}
