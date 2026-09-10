package z9;

import android.util.JsonReader;
import android.view.WindowManager;
import bb.h;
import bi.u6;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rv0;
import q9.d;
import za.d0;
import za.j0;
import za.l;
import za.n0;
import za.s;
import zh.x0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements b, d, NativeInstance.AudioLevelsCallback, qv0, rv0, c2 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object P1(u6 u6Var) {
        l lVar;
        j0 j0Var;
        d0 d0Var;
        h hVar;
        s sVar;
        n0 n0Var;
        switch (this.a) {
            case 2:
                lVar = FirebaseSessionsRegistrar.getComponents$lambda-0(u6Var);
                return lVar;
            case 3:
                j0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(u6Var);
                return j0Var;
            case 4:
                d0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(u6Var);
                return d0Var;
            case 5:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(u6Var);
                return hVar;
            case 6:
                sVar = FirebaseSessionsRegistrar.getComponents$lambda-4(u6Var);
                return sVar;
            default:
                n0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(u6Var);
                return n0Var;
        }
    }

    @Override // z9.b
    public Object a(JsonReader jsonReader) {
        return c.a(jsonReader);
    }

    @Override // org.telegram.ui.Components.rv0
    public void b(Object obj, float f7) {
        x0 x0Var = (x0) obj;
        switch (this.a) {
            case 10:
                WindowManager.LayoutParams layoutParams = x0Var.c;
                x0Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(x0Var.b, x0Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = x0Var.c;
                x0Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(x0Var.b, x0Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 13:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public float get(Object obj) {
        x0 x0Var = (x0) obj;
        switch (this.a) {
            case 9:
                return x0Var.N;
            default:
                return x0Var.O;
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
