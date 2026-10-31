package vh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ v(x xVar, int i10) {
        this.a = i10;
        this.b = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kg.j2 j2Var;
        long j10;
        kg.j2 j2Var2;
        boolean z10;
        long k10;
        float f7;
        kg.j2 j2Var3;
        r rVar = null;
        switch (this.a) {
            case 0:
                x xVar = this.b;
                if (!xVar.e0 && !xVar.n0) {
                    w wVar = xVar.j0;
                    if (wVar != null && (j2Var = wVar.d) != null) {
                        j2Var.setVolume(0.0f);
                    }
                    w wVar2 = xVar.g0;
                    xVar.j0 = wVar2;
                    if (wVar2 != null && wVar2.n != null) {
                        Runnable runnable = xVar.l0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        w wVar3 = xVar.j0;
                        kg.j2 j2Var4 = wVar3.d;
                        if (j2Var4 != null) {
                            j2Var4.setVolume(wVar3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(xVar.getContext());
                        ImageView imageView = new ImageView(xVar.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, w7.b6.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(xVar.getContext());
                        textView.setText(cd.L0(2131744723, null));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, w7.b6.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        z60 F = z60.F(xVar.a, xVar.b, xVar);
                        if (xVar.j0.n.K) {
                            h5 h5Var = new h5(xVar.getContext(), 0);
                            h5Var.b = 0.0f;
                            h5Var.c = 1.5f;
                            h5Var.d(xVar.j0.n.P);
                            h5Var.h = new ph.h1(xVar, 20);
                            h5Var.R = org.telegram.messenger.i0.L(220.0f);
                            F.q(h5Var);
                            F.o();
                        }
                        F.T = zs.x3;
                        F.c(R.drawable.menu_camera_retake, cd.L0(2131744829, null), new v(xVar, 4), false);
                        F.c(R.drawable.msg_delete, cd.L0(2131751599, null), new v(xVar, 5), true);
                        F.o();
                        F.r(frameLayout, w7.b6.o(zs.x3, -2));
                        F.p = new r5.a(13);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int L = org.telegram.messenger.i0.L(12.0f);
                        int L2 = org.telegram.messenger.i0.L(10.0f);
                        F.l = L;
                        F.k = L2;
                        F.p = new v(xVar, 6);
                        F.Z();
                        try {
                            xVar.performHapticFeedback(0, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                this.b.invalidate();
                break;
            case 2:
                x xVar2 = this.b;
                if (xVar2.f0) {
                    xVar2.f0 = false;
                    xVar2.invalidate();
                    break;
                }
                break;
            case 3:
                x xVar3 = this.b;
                long position = xVar3.getPosition();
                w mainPart = xVar3.getMainPart();
                if (mainPart == null) {
                    j10 = 0;
                } else {
                    n5 n5Var = mainPart.n;
                    j10 = n5Var.X + ((long) (n5Var.V * n5Var.h0));
                }
                for (int i10 = 0; i10 < xVar3.h.size(); i10++) {
                    w wVar4 = (w) xVar3.h.get(i10);
                    if (wVar4.n != null && (j2Var2 = wVar4.d) != null) {
                        long duration = j2Var2.getDuration();
                        long k11 = Utilities.k((position + j10) - wVar4.n.X, duration, 0L);
                        if (!xVar3.n0 || xVar3.q0) {
                            float f10 = k11;
                            n5 n5Var2 = wVar4.n;
                            float f11 = duration;
                            if (f10 > n5Var2.V * f11 && f10 < n5Var2.W * f11) {
                                z10 = true;
                                n5 n5Var3 = wVar4.n;
                                float f12 = duration;
                                k10 = Utilities.k(k11, (long) (n5Var3.W * f12), (long) (n5Var3.V * f12));
                                if (wVar4.d.isPlaying() != z10) {
                                    if (z10) {
                                        wVar4.d.play();
                                    } else {
                                        wVar4.d.pause();
                                    }
                                }
                                kg.j2 j2Var5 = wVar4.d;
                                if (!xVar3.v0) {
                                    n5 n5Var4 = wVar4.n;
                                    if (!n5Var4.Y && xVar3.n0) {
                                        f7 = n5Var4.P;
                                        j2Var5.setVolume(f7);
                                        if (Math.abs((wVar4.g >= 0 ? wVar4.g : wVar4.d.getCurrentPosition()) - k10) <= 450 && wVar4.g < 0) {
                                            kg.j2 j2Var6 = wVar4.d;
                                            wVar4.g = k10;
                                            j2Var6.seekTo(k10, xVar3.p0, new sg.v(wVar4, 29));
                                        }
                                    }
                                }
                                f7 = 0.0f;
                                j2Var5.setVolume(f7);
                                if (Math.abs((wVar4.g >= 0 ? wVar4.g : wVar4.d.getCurrentPosition()) - k10) <= 450) {
                                    kg.j2 j2Var62 = wVar4.d;
                                    wVar4.g = k10;
                                    j2Var62.seekTo(k10, xVar3.p0, new sg.v(wVar4, 29));
                                }
                            }
                        }
                        z10 = false;
                        n5 n5Var32 = wVar4.n;
                        float f122 = duration;
                        k10 = Utilities.k(k11, (long) (n5Var32.W * f122), (long) (n5Var32.V * f122));
                        if (wVar4.d.isPlaying() != z10) {
                        }
                        kg.j2 j2Var52 = wVar4.d;
                        if (!xVar3.v0) {
                        }
                        f7 = 0.0f;
                        j2Var52.setVolume(f7);
                        if (Math.abs((wVar4.g >= 0 ? wVar4.g : wVar4.d.getCurrentPosition()) - k10) <= 450) {
                        }
                    }
                }
                z8 z8Var = xVar3.r0;
                if (z8Var != null) {
                    z8Var.setProgress(position);
                }
                k4 k4Var = xVar3.s0;
                if (k4Var != null) {
                    k4Var.w(true);
                    xVar3.s0.y(true);
                }
                if (xVar3.n0 && xVar3.q0) {
                    org.telegram.messenger.i0.h3(xVar3.w0, (long) (1000.0f / org.telegram.messenger.i0.r));
                    break;
                }
                break;
            case 4:
                x xVar4 = this.b;
                w wVar5 = xVar4.j0;
                if (wVar5 != null) {
                    wVar5.a(null);
                    xVar4.q();
                    xVar4.invalidate();
                    Runnable runnable2 = xVar4.m0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                x xVar5 = this.b;
                w wVar6 = xVar5.j0;
                if (wVar6 != null && xVar5.h.indexOf(wVar6) >= 0) {
                    r rVar2 = xVar5.f;
                    int indexOf = rVar2.e.indexOf(wVar6.h);
                    ArrayList arrayList = rVar2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            q qVar = (q) arrayList2.get(i12);
                            if (qVar.c != i11) {
                                sb2.append("/");
                                i11 = qVar.c;
                            }
                            sb2.append(".");
                        }
                        rVar = new r(sb2.toString());
                    }
                    if (rVar.e.size() <= 1) {
                        xVar5.e();
                        xVar5.invalidate();
                    }
                    xVar5.o(rVar);
                    xVar5.f0 = true;
                    xVar5.q();
                    xVar5.invalidate();
                    Runnable runnable3 = xVar5.m0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    o8 o8Var = ((c8) xVar5).y0;
                    o8Var.I0.a(false, true);
                    if (rVar.e.size() > 1) {
                        u uVar = o8Var.G0;
                        o8Var.z0 = rVar;
                        uVar.a(new ob0(rVar, false), true);
                        o8Var.G0.b(true, true);
                    } else {
                        o8Var.G0.b(false, true);
                    }
                    o8Var.l0(true);
                    m2 m2Var = o8Var.M0;
                    if (m2Var != null) {
                        m2Var.setMultipleOnClick(o8Var.A0.j());
                        o8Var.M0.setMaxCount(Math.min(10, r.b() - o8Var.A0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                w wVar7 = this.b.j0;
                if (wVar7 != null && (j2Var3 = wVar7.d) != null) {
                    j2Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
