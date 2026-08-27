package rg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final c6 a;
    public a b;
    public kq c;
    public boolean d;

    public b(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
    }

    public final void a(int i10, boolean z10) {
        if (this.c == null) {
            kq kqVar = new kq(getContext(), this.a);
            this.c = kqVar;
            kqVar.setReverse(this.d);
            addView(this.c, z5.e(-1, 28, 48));
        }
        this.c.a.c(i10, z10);
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.b.e(z10, z11);
    }

    public final void c(boolean z10, boolean z11) {
        a aVar = this.b;
        if (aVar.d == null) {
            if (!z10) {
                return;
            }
            hp hpVar = new hp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = hpVar;
            hpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, z5.e(46, 46, 17));
        }
        ud.a aVar2 = aVar.a;
        if (!aVar2.f && aVar2.e == 0.0f) {
            aVar.e.c = -1L;
        }
        aVar2.a(z10, z11);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        b(z10, false);
    }
}
