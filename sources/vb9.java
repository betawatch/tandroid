// default package

import android.os.Process;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vb9 extends Thread {
    public final byte a;

    public vb9(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = (byte) 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
