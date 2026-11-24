// default package

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public enum pw0 {
    e(new long[]{7}, new int[]{65}, new long[]{60}),
    f(new long[]{7}, new int[]{kk7.a2}, new long[]{70}),
    h(new long[]{7}, new int[]{kk7.d4}, new long[]{80}),
    n(new long[]{3}, new int[]{kk7.B3}, new long[]{50}),
    r(new long[]{10}, new int[]{kk7.E2}, new long[]{55}),
    s(new long[]{14, 48, 14, 48, 14, 48, 20}, new int[]{kk7.d3, 0, kk7.d3, 0, kk7.d4, 0, kk7.a2}, new long[]{40, 60, 40, 60, 65, 60, 40}),
    w(new long[]{14, 65, 14}, new int[]{kk7.E2, 0, kk7.d4}, new long[]{50, 60, 65}),
    x(new long[]{14, 64, 14}, new int[]{kk7.B3, 0, kk7.E2}, new long[]{65, 60, 40}),
    y(new long[]{1}, new int[]{65}, new long[]{30}),
    E(new long[]{30, 10, 150, 10}, new int[]{0, 100, 0, 100}, new long[]{40, 60, 40, 60, 65, 60, 40});

    public final long[] a;
    public final int[] b;
    public final long[] c;
    public Object d;

    pw0(long[] jArr, int[] iArr, long[] jArr2) {
        this.a = jArr;
        this.b = iArr;
        this.c = jArr2;
    }

    public final void a() {
        long[] jArr = this.c;
        if (Build.VERSION.SDK_INT < 26) {
            Vibrator vibrator = gl.J;
            if (vibrator == null) {
                vibrator = (Vibrator) a.b.getSystemService("vibrator");
                gl.J = vibrator;
            }
            vibrator.vibrate(jArr, -1);
            return;
        }
        Vibrator vibrator2 = gl.J;
        if (vibrator2 == null) {
            vibrator2 = (Vibrator) a.b.getSystemService("vibrator");
            gl.J = vibrator2;
        }
        Vibrator vibrator3 = vibrator2;
        if (this.d == null) {
            if (vibrator3 == null) {
                vibrator3 = (Vibrator) a.b.getSystemService("vibrator");
                gl.J = vibrator3;
            }
            if (vibrator3.hasAmplitudeControl()) {
                this.d = VibrationEffect.createWaveform(this.a, this.b, -1);
            } else {
                this.d = VibrationEffect.createWaveform(jArr, -1);
            }
        }
        vibrator2.vibrate((VibrationEffect) this.d);
    }
}
