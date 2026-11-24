// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vea extends gb2 {
    public final /* synthetic */ byte Ld = 1;

    public /* synthetic */ vea(Context context, int i) {
        super(context, i);
    }

    @Override // gb2
    public final int getParentWidth() {
        int i;
        int L;
        switch (this.Ld) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i = getMeasuredWidth();
                    L = gl.L(24.0f);
                } else {
                    i = gl.q.x;
                    L = gl.L(24.0f);
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

    public /* synthetic */ vea(Context context, int i, boolean z, mv6 mv6Var, wjb wjbVar) {
        super(context, i, z, mv6Var, wjbVar);
    }
}
