// default package

import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.util.SparseArray;
import android.view.View;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t69 {
    public final RenderNode a;
    public final e31 b;
    public final tab c = new tab();
    public long d = 0;
    public int e;
    public int f;

    public t69(RenderNode renderNode, e31 e31Var) {
        this.a = renderNode;
        this.b = e31Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        RecordingCanvas recordingCanvas;
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        tab tabVar = this.c;
        tabVar.a = 0L;
        int i = 0;
        tabVar.b = false;
        e31 e31Var = this.b;
        boolean z = e31Var.b;
        ah6 ah6Var = (ah6) e31Var.c;
        int themedColor = ah6Var.getThemedColor(bkb.c6);
        RectF rectF = ah6Var.V;
        tabVar.a(themedColor);
        tabVar.b(gba.f());
        SparseArray sparseArray = ah6Var.a;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = ((hec) sparseArray.valueAt(i2)).a;
            View view = dVar.fragmentView;
            if (view != null && zec.c(view, ah6Var.b, rectF) && rectF.right > 0.0f && rectF.left < ah6Var.fragmentView.getMeasuredWidth()) {
                zg6 zg6Var = (zg6) dVar;
                if ((z ? zg6Var.j() : zg6Var.A()) != null) {
                    tabVar.c(rectF.left);
                    tabVar.c(rectF.top);
                    tabVar.a(dVar.getClassGuid());
                }
            }
        }
        long j = tabVar.b ? -1L : tabVar.a;
        boolean z2 = (this.a.hasDisplayList() && width == this.e && height == this.f && j == this.d && j != -1) ? false : true;
        this.e = width;
        this.f = height;
        this.d = j;
        if (z2) {
            RecordingCanvas beginRecording = this.a.beginRecording();
            View view2 = ah6Var.fragmentView;
            SparseArray sparseArray2 = ah6Var.a;
            RectF rectF2 = ah6Var.V;
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = ah6Var.fragmentView.getMeasuredHeight();
            beginRecording.drawColor(ah6Var.getThemedColor(bkb.c6));
            int size2 = sparseArray2.size();
            while (i < size2) {
                d dVar2 = ((hec) sparseArray2.valueAt(i)).a;
                View view3 = dVar2.fragmentView;
                if (view3 != null && zec.c(view3, ah6Var.b, rectF2) && rectF2.right > 0.0f && rectF2.left < ah6Var.fragmentView.getMeasuredWidth()) {
                    zg6 zg6Var2 = (zg6) dVar2;
                    lx4 j2 = z ? zg6Var2.j() : zg6Var2.A();
                    if (j2 != null) {
                        beginRecording.save();
                        beginRecording.translate(rectF2.left, rectF2.top);
                        recordingCanvas = beginRecording;
                        j2.e(0.0f, 0.0f, measuredWidth, measuredHeight, recordingCanvas);
                        recordingCanvas.restore();
                        i++;
                        beginRecording = recordingCanvas;
                    }
                }
                recordingCanvas = beginRecording;
                i++;
                beginRecording = recordingCanvas;
            }
            this.a.endRecording();
        }
    }
}
