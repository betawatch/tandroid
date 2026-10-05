package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class t1 extends zl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path e3;
    public q0.a f3;

    public t1(Context context) {
        super(context, null);
        this.e3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.c0());
        setAdapter(new s1());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.zl0
    public final Integer W0(int i10) {
        return 285212671;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.customTypefacesLoaded) {
            getAdapter().l();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f3;
        if (aVar != null) {
            Path path = this.e3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f3 != null) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, bi.B(16.0f, AndroidUtilities.dp(48.0f) * Math.min(pg.k0.c().size(), 6), TLObject.FLAG_30));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f3 = aVar;
        invalidate();
    }
}
