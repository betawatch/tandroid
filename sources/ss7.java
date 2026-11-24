// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ss7 extends o39 implements gk7 {
    public final Path f3;
    public vs2 g3;

    public ss7(Context context) {
        super(context, null);
        this.f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new t26());
        setAdapter(new rs7());
        setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        setClipToPadding(false);
    }

    @Override // o39
    public final Integer W0(int i) {
        return 285212671;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.E5) {
            getAdapter().f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        vs2 vs2Var = this.g3;
        if (vs2Var != null) {
            Path path = this.f3;
            vs2Var.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.g3 != null) {
            canvas.restore();
        }
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.E5);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.E5);
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, ug8.E(16.0f, gl.L(48.0f) * Math.min(qs7.a().size(), 6), TLObject.FLAG_30));
    }

    public void setMaskProvider(vs2 vs2Var) {
        this.g3 = vs2Var;
        invalidate();
    }
}
