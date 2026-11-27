// default package

import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ou0 implements fn7, gn7 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public ou0(jn7 jn7Var, fn7 fn7Var) {
        this.a = (byte) 2;
        this.b = new u8a(jn7Var, this);
        this.c = new WeakReference(fn7Var);
    }

    @Override // gn7
    public final void a() {
        ((u8a) this.b).a();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (i == 310) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    int[] iArr = (int[]) objArr[2];
                    if (intValue == 5000) {
                        jn7.e().n(this, jn7.g5);
                        rv0 rv0Var = (rv0) obj2;
                        if (iArr[0] != 0) {
                            rv0Var.u((pv0) obj, "scan_qr_popup_closed", new JSONObject());
                            break;
                        } else {
                            Activity activity = rv0Var.a0;
                            if (activity != null) {
                                rv0Var.h0 = la1.i0(activity, 3, new ri6(rv0Var, (byte) 11));
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (i == 278) {
                    ((id) obj).dismiss();
                    jn7.e().n(this, i);
                    hl.d3(new ea5(this, (byte) 16), 100L);
                    break;
                }
                break;
            default:
                fn7 fn7Var = (fn7) ((WeakReference) obj2).get();
                if (fn7Var == null) {
                    cc4.d("MEMORY_LEAK observer " + i + " with destroyed WeakReference");
                    a();
                    break;
                } else {
                    fn7Var.didReceivedNotification(i, i2, objArr);
                    break;
                }
        }
    }

    public /* synthetic */ ou0(fn7 fn7Var, Object obj, byte b) {
        this.a = b;
        this.c = fn7Var;
        this.b = obj;
    }
}
