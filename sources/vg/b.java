package vg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.tq;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final f6 a;
    public a b;
    public tq c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.c == null) {
            tq tqVar = new tq(getContext(), this.a);
            this.c = tqVar;
            tqVar.setReverse(this.d);
            addView(this.c, b6.e(-1, 28, 48));
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
            qp qpVar = new qp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = qpVar;
            qpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, b6.e(46, 46, 17));
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
