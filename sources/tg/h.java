package tg;

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import g.y;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.hd1;
import org.telegram.ui.mf0;
import org.telegram.ui.of0;
import org.telegram.ui.pf0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h {
    public final RenderNode a;
    public final mf0 b;
    public final y c = new y();
    public long d = 0;
    public int e;
    public int f;

    public h(RenderNode renderNode, mf0 mf0Var) {
        this.a = renderNode;
        this.b = mf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        hi.f B;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        y yVar = this.c;
        yVar.a = 0L;
        yVar.b = false;
        pf0 pf0Var = this.b.a;
        int themedColor = pf0Var.getThemedColor(t6.d6);
        RectF rectF = pf0Var.T;
        yVar.a(themedColor);
        yVar.b(tz.f());
        SparseArray sparseArray = pf0Var.a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            k2 k2Var = ((hd1) sparseArray.valueAt(i10)).a;
            View view = k2Var.fragmentView;
            if (view != null && zg.h.c(view, pf0Var.b, rectF) && rectF.right > 0.0f && rectF.left < pf0Var.fragmentView.getMeasuredWidth() && (k2Var instanceof of0) && ((of0) k2Var).B() != null) {
                yVar.c(rectF.left);
                yVar.c(rectF.top);
                yVar.a(k2Var.getClassGuid());
            }
        }
        long j10 = yVar.b ? -1L : yVar.a;
        boolean z10 = (this.a.hasDisplayList() && width == this.e && height == this.f && j10 == this.d && j10 != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j10;
        if (z10) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = pf0Var.fragmentView;
            SparseArray sparseArray2 = pf0Var.a;
            RectF rectF2 = pf0Var.T;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = pf0Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(pf0Var.getThemedColor(t6.d6));
            int size2 = sparseArray2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                k2 k2Var2 = ((hd1) sparseArray2.valueAt(i11)).a;
                View view3 = k2Var2.fragmentView;
                if (view3 != null && zg.h.c(view3, pf0Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < pf0Var.fragmentView.getMeasuredWidth() && (k2Var2 instanceof of0) && (B = ((of0) k2Var2).B()) != null) {
                    beginRecording.save();
                    beginRecording.translate(rectF2.left, rectF2.top);
                    B.e(beginRecording, 0.0f, 0.0f, measuredWidth, measuredHeight);
                    beginRecording.restore();
                }
            }
            this.a.endRecording();
        }
    }
}
