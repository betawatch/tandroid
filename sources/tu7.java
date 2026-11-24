// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tu7 extends r59 implements jm7 {
    public final Path f3;
    public gu2 g3;

    public tu7(Context context) {
        super(context, null);
        this.f3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new u46());
        setAdapter(new su7());
        setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        setClipToPadding(false);
    }

    @Override // r59
    public final Integer W0(int i) {
        return 285212671;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.G5) {
            getAdapter().f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        gu2 gu2Var = this.g3;
        if (gu2Var != null) {
            Path path = this.f3;
            gu2Var.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.g3 != null) {
            canvas.restore();
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.G5);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.G5);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, wi8.E(16.0f, gm.L(48.0f) * Math.min(ru7.a().size(), 6), TLObject.FLAG_30));
    }

    public void setMaskProvider(gu2 gu2Var) {
        this.g3 = gu2Var;
        invalidate();
    }
}
