package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;

    public /* synthetic */ s80(m80 m80Var, int i10) {
        this.a = i10;
        this.b = m80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        m80 m80Var = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                try {
                    m80Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                try {
                    m80Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.B1;
                try {
                    m80Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
