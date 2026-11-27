// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t78 implements j98 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ w78 d;

    public /* synthetic */ t78(w78 w78Var, HashMap hashMap, ArrayList arrayList, byte b) {
        this.a = b;
        this.d = w78Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // j98
    public final void C(int i, boolean z, boolean z2) {
        byte b = this.a;
        ArrayList arrayList = this.c;
        HashMap hashMap = this.b;
        w78 w78Var = this.d;
        switch (b) {
            case 0:
                w78Var.removeSelfFromStack();
                if (!z) {
                    w78Var.Z(hashMap, arrayList, z2, i);
                    break;
                }
                break;
            default:
                w78Var.removeSelfFromStack();
                if (!z) {
                    w78Var.Z(hashMap, arrayList, z2, i);
                    break;
                }
                break;
        }
    }

    @Override // j98
    public final boolean f() {
        byte b = this.a;
        return true;
    }

    @Override // j98
    public final void h() {
        byte b = this.a;
    }

    @Override // j98
    public final void l(Editable editable) {
        byte b = this.a;
        w78 w78Var = this.d;
        switch (b) {
            case 0:
                iu3 iu3Var = w78Var.N;
                w78Var.a = editable;
                iu3Var.setText(editable);
                break;
            default:
                iu3 iu3Var2 = w78Var.N;
                w78Var.a = editable;
                iu3Var2.setText(editable);
                break;
        }
    }

    @Override // j98
    public final void y() {
        byte b = this.a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
