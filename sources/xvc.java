// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class xvc extends View {
    public int a;
    public final /* synthetic */ WallpapersListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvc(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.b = wallpapersListActivity;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.b;
        wallpapersListActivity.s.setColor(this.a);
        canvas.drawCircle(hl.L(25.0f), hl.L(31.0f), hl.L(18.0f), wallpapersListActivity.s);
        if (this.a == aob.w0(null, aob.d6, false)) {
            canvas.drawCircle(hl.L(25.0f), hl.L(31.0f), hl.L(18.0f), wallpapersListActivity.w);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(50.0f), hl.L(62.0f));
    }
}
