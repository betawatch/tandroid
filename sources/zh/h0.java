package zh;

import android.app.Activity;
import android.os.Build;
import android.view.animation.AnimationUtils;
import java.io.File;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e eVar;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                File file = (File) this.c;
                Activity parentActivity = n0Var.getParentActivity();
                if (parentActivity != null) {
                    MediaController.saveFile(file.getAbsolutePath(), parentActivity, 0, file.getName(), "image/png", new f0(n0Var, 1), false);
                    break;
                }
                break;
            case 1:
                c1 c1Var = (c1) this.b;
                e eVar2 = (e) this.c;
                f fVar = c1Var.s0;
                if (fVar.q == 2 && fVar.o < 1.0f) {
                    fVar.m = eVar2;
                    c1Var.invalidate();
                    break;
                } else {
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c1Var.p2 = c1.j(c1Var.n2, 0.03f, 0.005f);
                    c1Var.n2 = currentAnimationTimeMillis;
                    e eVar3 = fVar.m;
                    if (eVar3 == null) {
                        fVar.m = eVar2;
                        fVar.n = null;
                        fVar.o = 1.0f;
                        break;
                    } else {
                        int i10 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                        if (fVar.o < 1.0f && (eVar = fVar.n) != null) {
                            eVar3 = eVar;
                        }
                        fVar.n = eVar3;
                        fVar.m = eVar2;
                        fVar.o = 0.0f;
                        fVar.q = i10;
                        fVar.p = System.currentTimeMillis();
                        boolean[] zArr = fVar.s;
                        if (zArr != null) {
                            int length = zArr.length;
                            int i11 = fVar.n.e;
                            if (length >= i11 * i11) {
                                Arrays.fill(zArr, false);
                                fVar.G = i10 == 1;
                                break;
                            }
                        }
                        int i12 = fVar.n.e;
                        fVar.s = new boolean[i12 * i12];
                        fVar.G = i10 == 1;
                    }
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new h0(3, (Utilities.Callback) this.c, f.c((String) this.b, AndroidUtilities.dp(240.0f), ic.c.c, 0.75f, null)));
                break;
            default:
                ((Utilities.Callback) this.b).run((e) this.c);
                break;
        }
    }
}
