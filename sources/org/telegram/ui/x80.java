package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kz b;

    public /* synthetic */ x80(kz kzVar, int i10) {
        this.a = i10;
        this.b = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        kz kzVar = this.b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                Pattern pattern2 = LaunchActivity.D1;
                try {
                    kzVar.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern3 = LaunchActivity.D1;
                try {
                    kzVar.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
