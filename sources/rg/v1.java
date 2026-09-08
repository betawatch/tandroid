package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ll0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class v1 extends ll0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path X2;
    public q0.a Y2;

    public v1(Context context) {
        super(context, null);
        this.X2 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.c0());
        setAdapter(new u1());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override // org.telegram.ui.Components.ll0
    public final Integer V0(int i10) {
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
        q0.a aVar = this.Y2;
        if (aVar != null) {
            Path path = this.X2;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.Y2 != null) {
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, wl.C(16.0f, AndroidUtilities.dp(48.0f) * Math.min(qg.j0.c().size(), 6), TLObject.FLAG_30));
    }

    public void setMaskProvider(q0.a aVar) {
        this.Y2 = aVar;
        invalidate();
    }
}
