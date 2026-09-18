package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.y;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class d extends n0 {
    public final y a = new y(2);
    public final /* synthetic */ f6 b;
    public final /* synthetic */ f c;

    public d(f fVar, f6 f6Var) {
        this.c = fVar;
        this.b = f6Var;
    }

    @Override // s4.n0
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.h5, this.b);
        y yVar = this.a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
