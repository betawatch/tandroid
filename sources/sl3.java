// default package

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vl3 c;

    public /* synthetic */ sl3(boolean z, vl3 vl3Var, byte b) {
        this.a = b;
        this.b = z;
        this.c = vl3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        CountDownLatch e;
        int i2 = 0;
        boolean z = false;
        switch (this.a) {
            case 0:
                final boolean z2 = this.b;
                vl3 vl3Var = this.c;
                DictationAsr.r().mkdirs();
                if (zm3.d() && (e = zm3.e()) != null) {
                    try {
                        e.await(20000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                    }
                }
                final ArrayList a = zm3.a();
                Future submit = DictationAsr.f.submit(new Callable() { // from class: tl3
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ArrayList arrayList = a;
                        boolean z3 = z2;
                        vl3[] vl3VarArr = DictationAsr.a;
                        return Integer.valueOf(DictationAsr.u("silero_vad.onnx", zm3.f(arrayList, "silero-vad"), null, z3));
                    }
                });
                int u = DictationAsr.u(vl3Var.b(), zm3.f(a, vl3Var.c), vl3Var, z2);
                try {
                    i = ((Integer) submit.get()).intValue();
                } catch (Exception unused2) {
                    i = -1;
                }
                int[] iArr = {i, u};
                int i3 = 0;
                boolean z3 = false;
                boolean z4 = true;
                while (i3 < 2) {
                    int i4 = iArr[i3];
                    boolean z5 = z4;
                    if (i4 < 0) {
                        z5 = false;
                    }
                    if (i4 > 0) {
                        z3 = true;
                    }
                    i3++;
                    z4 = z5;
                    z3 = z3;
                }
                vl3Var.j = false;
                if (z4) {
                    na7.c1().edit().putLong("tinyasr_checked_" + vl3Var.a, System.currentTimeMillis()).apply();
                }
                if (DictationAsr.y(vl3Var) && (z3 || vl3Var.f == 0)) {
                    vl3Var.i = true;
                    DictationAsr.d.execute(new rl3(vl3Var, (byte) 1));
                } else if (!DictationAsr.y(vl3Var)) {
                    gl.d3(new sl3(z ? 1 : 0, vl3Var, r4));
                }
                DictationAsr.n();
                break;
            default:
                boolean z6 = this.b;
                vl3 vl3Var2 = this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (z6 == (vl3Var2.f == 0 ? (byte) 0 : (byte) 1)) {
                    ArrayList arrayList = new ArrayList(vl3Var2.l);
                    vl3Var2.l.clear();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((wl3) obj).a(z6);
                    }
                    break;
                }
                break;
        }
    }
}
