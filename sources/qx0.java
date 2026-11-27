// default package

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class qx0 extends ny0 {
    public final LinearLayout S1;
    public FrameLayout T1;
    public c51 U1;

    public qx0(Context context, vnb vnbVar) {
        super(context, null, false, false, vnbVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        return new ox0(this, (byte) 0);
    }

    @Override // ny0
    public final CharSequence K0() {
        return null;
    }

    @Override // nx0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.o1.setTitle(charSequence);
    }
}
