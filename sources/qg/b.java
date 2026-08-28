package qg;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.mq;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b extends FrameLayout {
    public final b6 a;
    public a b;
    public mq c;
    public boolean d;

    public b(Context context, b6 b6Var) {
        super(context);
        this.a = b6Var;
    }

    public final void a(int i9, boolean z10) {
        if (this.c == null) {
            mq mqVar = new mq(getContext(), this.a);
            this.c = mqVar;
            mqVar.setReverse(this.d);
            addView(this.c, e6.e(-1, 28, 48));
        }
        this.c.a.c(i9, z10);
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
            jp jpVar = new jp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(1.7f), -9079435);
            aVar.e = jpVar;
            jpVar.f = 90.0f;
            ImageView imageView = new ImageView(aVar.getContext());
            aVar.d = imageView;
            imageView.setBackground(aVar.e);
            aVar.d.setVisibility(8);
            aVar.addView(aVar.d, e6.e(46, 46, 17));
        }
        td.a aVar2 = aVar.a;
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
