// default package

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class py0 extends mz0 {
    public final LinearLayout S1;
    public FrameLayout T1;
    public b61 U1;

    public py0(Context context, ylb ylbVar) {
        super(context, null, false, false, ylbVar);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        return new ny0(this, (byte) 0);
    }

    @Override // mz0
    public final CharSequence J0() {
        return null;
    }

    @Override // my0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.o1.setTitle(charSequence);
    }
}
