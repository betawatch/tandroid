package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class l1 extends View {
    public final /* synthetic */ p1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(p1 p1Var, Context context) {
        super(context);
        this.a = p1Var;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawColor(this.a.getThemedColor(j6.e7));
    }
}
