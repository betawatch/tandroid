// default package

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.q;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.webrtc.ScreenCapturerAndroid;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v59 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v59(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02af  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long cameraFlipElapsedMs;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                x59 x59Var = (x59) obj;
                kfc kfcVar = x59Var.n;
                if (kfcVar != null) {
                    boolean c0 = kfcVar.c0();
                    float S = x59Var.n.S() / x59Var.n.U();
                    float f = x59Var.s;
                    if (S < f) {
                        x59Var.n.p0((long) (f * r1.U()), false);
                    } else if (S > x59Var.w || (x59Var.d0 && !c0 && x59Var.x && x59Var.n.S() >= x59Var.n.U() - 50)) {
                        x59Var.setPlaying(false);
                        if (z) {
                            hl.d3(x59Var.y, 16L);
                        }
                        if (x59Var.d0) {
                            x59Var.i(true);
                        }
                    }
                    z = c0;
                    if (z) {
                    }
                    if (x59Var.d0) {
                    }
                }
                x59Var.invalidate();
                break;
            case 1:
                d79 d79Var = (d79) obj;
                d79Var.U1 = null;
                d79Var.T1 = null;
                hf0 hf0Var = d79Var.C1;
                if (hf0Var != null) {
                    Drawable current = hf0Var.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                hf0 hf0Var2 = d79Var.C1;
                if (hf0Var2 != null && hf0Var2.isStateful()) {
                    d79Var.C1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 2:
                ((na9) ((li7) obj).b).E.a.q();
                break;
            case 3:
                ((ed9) obj).d.a(Boolean.TRUE);
                break;
            case 4:
                hl.E3(((ue9) obj).Z1.d);
                break;
            case 5:
                ((cf9) obj).invalidate();
                break;
            case 6:
                xq2 xq2Var = (xq2) obj;
                xq2Var.c = null;
                xq2Var.d = null;
                xq2Var.e = null;
                xq2Var.f = null;
                xq2Var.x(null);
                break;
            case 7:
                ((vg9) obj).invalidateSelf();
                break;
            case 8:
                ((ch9) obj).c();
                break;
            case 9:
                zj9 zj9Var = (zj9) obj;
                hl9 hl9Var = zj9Var.e;
                if (hl9Var == null || !hl9Var.G()) {
                    zj9Var.w.k0();
                    break;
                }
                break;
            case 10:
                View view = ((fk9) obj).W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 11:
                View view2 = ((gk9) obj).h;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 12:
                rb2 rb2Var = ((hl9) obj).F;
                if (rb2Var != null) {
                    rb2Var.i();
                    break;
                }
                break;
            case 13:
                gl9 gl9Var = (gl9) obj;
                gl9Var.K = null;
                if (gl9Var.R != null) {
                    gl9Var.L = true;
                    View view3 = gl9Var.T;
                    if (view3 != null) {
                        try {
                            view3.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    gk9 gk9Var = gl9Var.R;
                    hl9 hl9Var2 = gl9Var.a;
                    wb2 wb2Var = hl9Var2.E;
                    rb2 rb2Var2 = hl9Var2.F;
                    gk9Var.getClass();
                    if (wb2Var != null && rb2Var2 != null) {
                        rb2Var2.l0(wb2Var, gk9Var.b);
                        break;
                    }
                } else if (gl9Var.N != null) {
                    gl9Var.L = true;
                    View view4 = gl9Var.T;
                    if (view4 != null) {
                        try {
                            view4.performHapticFeedback(0);
                        } catch (Exception unused2) {
                        }
                    }
                    gl9Var.l(gl9Var.N, true);
                    m66 m66Var = gl9Var.J;
                    if (m66Var != null) {
                        m66Var.e(true);
                        break;
                    }
                }
                break;
            case 14:
                nm9 nm9Var = (nm9) obj;
                if (nm9Var.f0 && nm9Var.j0() != nm9Var.j0) {
                    nm9Var.p0("on screen, settled after start", true);
                    break;
                }
                break;
            case 15:
                ((li3) obj).invalidate();
                break;
            case 16:
                xb1 xb1Var = (xb1) obj;
                if (xb1Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) xb1Var.getParent()).removeView(xb1Var);
                    break;
                }
                break;
            case 17:
                q qVar = (q) ((kj4) obj).b;
                qVar.s0 = true;
                StringBuilder sb = new StringBuilder("RoundVideo camera flip first frame: elapsedMs=");
                cameraFlipElapsedMs = qVar.getCameraFlipElapsedMs();
                sb.append(cameraFlipElapsedMs);
                cc4.b(sb.toString());
                qVar.n(true);
                qVar.q();
                break;
            case 18:
                ((aq9) obj).a.C(false);
                break;
            case 19:
                dq9 dq9Var = ((cq9) obj).a;
                if (!dq9Var.w && dq9Var.V != null) {
                    cc4.b("[LivePlayer] stream asks to rejoin");
                    dq9Var.X = true;
                    dq9Var.n();
                    break;
                }
                break;
            case 20:
                kq9 kq9Var = ((iq9) obj).a;
                if (!kq9Var.w && kq9Var.O != null) {
                    cc4.b("[LivePlayer] stream asks to rejoin");
                    kq9Var.K();
                    break;
                }
                break;
            case 21:
                y96 y96Var = ((jq9) obj).a.Y;
                if (y96Var != null) {
                    y96Var.run();
                    break;
                }
                break;
            case 22:
                ir9 ir9Var = ((fr9) obj).h;
                me8 me8Var = ir9Var.a;
                if (me8Var != null) {
                    me8Var.e();
                }
                hr9 hr9Var = ir9Var.f;
                if (hr9Var != null) {
                    hr9Var.a();
                    break;
                }
                break;
            case 23:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                saveToGallerySettingsActivity.w.clear();
                saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, saveToGallerySettingsActivity.w);
                saveToGallerySettingsActivity.d0();
                break;
            case 24:
                ((ScreenCapturerAndroid) obj).updateVirtualDisplay();
                break;
            case 25:
                xd5 xd5Var = (xd5) obj;
                xd5Var.dismiss();
                m01.u(xd5Var.getContext(), ob6.M0(2131746345, null));
                break;
            case 26:
                aw9 aw9Var = (aw9) obj;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i = aw9Var.d;
                xb4.G(i).y(arrayList);
                xb4.G(i).P(arrayList2);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    xb4.G(i);
                    if (xb4.M(((r47) arrayList.get(i2)).k, false, true).exists()) {
                        arrayList3.add((r47) arrayList.get(i2));
                    }
                }
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    xb4.G(i);
                    if (!xb4.M(((r47) arrayList2.get(i3)).k, false, true).exists()) {
                        arrayList4.add((r47) arrayList2.get(i3));
                    }
                }
                hl.c3(new jr9((Object) aw9Var, (Object) arrayList3, (Object) arrayList4, (byte) 3));
                break;
            case 27:
                ((dw9) obj).invalidateSelf();
                break;
            case 28:
                ((ow9) obj).f.setVisibility(8);
                break;
            default:
                ((bj3) obj).q();
                break;
        }
    }
}
