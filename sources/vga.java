// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vga extends rc2 {
    public final /* synthetic */ byte Ld = 1;

    public /* synthetic */ vga(Context context, int i) {
        super(context, i);
    }

    @Override // rc2
    public final int getParentWidth() {
        int i;
        int L;
        switch (this.Ld) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i = getMeasuredWidth();
                    L = gm.L(24.0f);
                } else {
                    i = gm.q.x;
                    L = gm.L(24.0f);
                }
                return i - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        byte b = this.Ld;
        return false;
    }

    public /* synthetic */ vga(Context context, int i, boolean z, mx6 mx6Var, ylb ylbVar) {
        super(context, i, z, mx6Var, ylbVar);
    }
}
