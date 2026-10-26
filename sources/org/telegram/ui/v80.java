package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz b;

    public /* synthetic */ v80(sz szVar, int i10) {
        this.a = i10;
        this.b = szVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        sz szVar = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    szVar.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    szVar.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
