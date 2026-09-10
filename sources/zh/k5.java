package zh;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j90;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i10) {
            case 0:
                n5 n5Var = (n5) obj;
                n5Var.c();
                n5Var.a(true);
                break;
            case 1:
                ((m4) obj).accept(null);
                break;
            case 2:
                ((w5) obj).onDetachedFromWindow();
                break;
            case 3:
                e6 e6Var = (e6) obj;
                ArrayList arrayList = e6Var.c;
                if (arrayList != null) {
                    e6Var.a.z1 = arrayList;
                }
                a3 a3Var = e6Var.a;
                long j3 = e6Var.b;
                if (a3Var.B1 != j3 || a3Var.z1 != null) {
                    a3Var.B1 = j3;
                    a3Var.j1();
                    a3Var.i1();
                    a3Var.f1(true);
                    TL_stories.PeerStories peerStories = a3Var.J0.Q0;
                    if (peerStories == null) {
                        i5 i5Var = a3Var.S1;
                        TL_stories.PeerStories y3 = i5Var.y(j3);
                        if (y3 == null) {
                            y3 = i5Var.z(j3);
                            z10 = true;
                        }
                        i5Var.S(y3, z10);
                        break;
                    } else {
                        a3Var.S1.S(peerStories, true);
                        break;
                    }
                }
                break;
            case 4:
                ((j90) obj).d(true);
                break;
            case 5:
                ((r6) obj).requestLayout();
                break;
            case 6:
                y6 y6Var = (y6) obj;
                bi.x4 x4Var = y6Var.c;
                if (x4Var != null) {
                    x4Var.e(true);
                    y6Var.c = null;
                }
                y6Var.b(false);
                break;
            case 7:
                w6 w6Var = (w6) obj;
                if (w6Var.v) {
                    w6Var.E = true;
                    w6Var.F = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    w6Var.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    w6Var.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    w6Var.invalidate();
                    break;
                }
                break;
            case 8:
                u7 u7Var = ((d7) obj).b;
                try {
                    i7 i7Var = u7Var.s;
                    if (i7Var != null) {
                        if (u7Var.b) {
                            AndroidUtilities.removeFromParent(i7Var);
                        } else {
                            u7Var.n.removeView(i7Var);
                        }
                        u7Var.s = null;
                        break;
                    } else {
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 9:
                ((i7) obj).I0.K(true);
                break;
            default:
                ((d8) obj).c();
                break;
        }
    }
}
