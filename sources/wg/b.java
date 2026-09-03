package wg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final g6 a;
    public a b;
    public wq c;
    public boolean d;

    public b(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.c == null) {
            wq wqVar = new wq(getContext(), this.a);
            this.c = wqVar;
            wqVar.setReverse(this.d);
            addView(this.c, c6.e(-1, 28, 48));
        }
        this.c.a.c(i10, z4);
    }

    public final void b(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.b.e(z4, z10);
    }

    public final void c(boolean z4, boolean z10) {
        a aVar = this.b;
        if (aVar.d == null) {
            if (!z4) {
                return;
            }
            tp tpVar = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = tpVar;
            tpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, c6.e(46, 46, 17));
        }
        xd.a aVar2 = aVar.a;
        if (!aVar2.f && aVar2.e == 0.0f) {
            aVar.e.c = -1L;
        }
        aVar2.a(z4, z10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        b(z4, false);
    }
}
