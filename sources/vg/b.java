package vg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.uq;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final f6 a;
    public a b;
    public uq c;
    public boolean d;

    public b(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
    }

    public final void a(int i10, boolean z4) {
        if (this.c == null) {
            uq uqVar = new uq(getContext(), this.a);
            this.c = uqVar;
            uqVar.setReverse(this.d);
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
            rp rpVar = new rp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = rpVar;
            rpVar.f = 90.0f;
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
