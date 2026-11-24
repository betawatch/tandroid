// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.webkit.PermissionRequest;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class su0 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ su0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // vs2
    public final void accept(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                zu0 zu0Var = (zu0) obj4;
                PermissionRequest permissionRequest = (PermissionRequest) obj3;
                String[] strArr = (String[]) obj2;
                Boolean bool = (Boolean) obj;
                if (zu0Var.a != null) {
                    zu0Var.a = null;
                    if (!bool.booleanValue()) {
                        permissionRequest.deny();
                        break;
                    } else {
                        su0 su0Var = new su0(zu0Var, permissionRequest, strArr, b2);
                        boolean z = hv0.R0;
                        zu0Var.e.R.R(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, su0Var);
                        break;
                    }
                }
                break;
            case 1:
                zu0 zu0Var2 = (zu0) obj4;
                PermissionRequest permissionRequest2 = (PermissionRequest) obj3;
                String[] strArr2 = (String[]) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    permissionRequest2.deny();
                    break;
                } else {
                    permissionRequest2.grant(new String[]{strArr2[0], strArr2[1]});
                    zu0Var2.e.R.U = true;
                    break;
                }
            default:
                Path path = (Path) obj3;
                float[] fArr = (float[]) obj2;
                Canvas canvas = (Canvas) obj;
                t98 t98Var = ((ei8) obj4).e;
                View pressedChildView = t98Var.getPressedChildView();
                int b3 = pressedChildView == null ? -1 : t98Var.T(pressedChildView).b();
                path.rewind();
                Rect selectorRect = t98Var.getSelectorRect();
                RectF rectF = gl.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                Arrays.fill(fArr, 0.0f);
                if (b3 == 0) {
                    Arrays.fill(fArr, 0, 4, gl.L(12.0f));
                }
                if (b3 == t98Var.getAdapter().b() - 1) {
                    Arrays.fill(fArr, 4, 8, gl.L(12.0f));
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                break;
        }
    }
}
